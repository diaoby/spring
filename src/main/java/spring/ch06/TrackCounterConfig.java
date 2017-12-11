package spring.ch06;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
	@Bean
	public CompactDisc segtPeppers() {
		BlankDisc cd = new BlankDisc();
		cd.setTitle("周杰伦");
		cd.setArtist("叶惠美");
		List<String> tracks = new ArrayList<String>();
		tracks.add("nima");
		tracks.add("shi");
		tracks.add("yige");
		tracks.add("sb");
		cd.setTracks(tracks);
		return cd;
	}
	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
}
