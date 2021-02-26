package es.anaya.spring.data.s03.mapstruct.dto;

public class HouseDTO {

    private Long id;
    private String name;
    private String address;
    private String city;
    private Float price;
	private OwnerDTO ownerDTO;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public OwnerDTO getOwner() {
		return ownerDTO;
	}
	public void setOwner(OwnerDTO ownerDTO) {
		this.ownerDTO = ownerDTO;
	}
	@Override
	public String toString() {
		return "HouseDTO [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", price=" + price
				+ ", ownerDTO=" + ownerDTO + "]";
	}
}
