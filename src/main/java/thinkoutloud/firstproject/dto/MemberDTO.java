package thinkoutloud.firstproject.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString //These are all Lombok
public class MemberDTO {

    private String name;
    private String email;
    private String organization;

}