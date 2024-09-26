package in.wipro.ajeet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	private Integer id;
	private String name;
	private String addrs;
	private String type;

}
