package pixel.academy.second;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Value("${teacher.name}")
    private String teacherName;

    @Value("${teacher.subject}")
    private String teacherSubject;

    @Value("${teacher.experience}")
    private String teacherExperience;

    @Value("${teacher.department}")
    private String teacherDepartment;

    @GetMapping("/teacher")
    public String getTeacherInfo() {
        return "Teacher Name: "        + teacherName +
                ", Subject: "          + teacherSubject +
                ", Experience: "       + teacherExperience +
                " years, Department: " + teacherDepartment;
    }
}
