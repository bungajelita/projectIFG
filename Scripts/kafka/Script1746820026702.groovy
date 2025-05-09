import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.StringDeserializer

Properties props = new Properties()
props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, 'localhost:9092')
props.put(ConsumerConfig.GROUP_ID_CONFIG, 'my-group')
props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName())
props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName())

KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props)
consumer.subscribe(Arrays.asList('my-topic'))

while (true) {
	def records = consumer.poll(100)
	records.each { record ->
		println record.value()
	}
}
