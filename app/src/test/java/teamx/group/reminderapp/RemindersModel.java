package teamx.group.reminderapp;

import java.util.Date;
import java.util.UUID;

public class RemindersModel {
    private String reminder_name;
    private Date reminder_date_time;
    private UUID reminder_UUID;
    private VoiceProfile reminder_voice_profile; //VoiceProfileModel used, pulled from VoiceProfilePresenter

    public RemindersModel(String reminder_name,Date reminder_date_time,VoiceProfile reminder_voice_profile){
        //this is the onCreate(constructor) of the class
        this.reminder_name=reminder_name;
        this.reminder_date_time=reminder_date_time;
        this.reminder_UUID=UUID.randomUUID();
        this.reminder_voice_profile=reminder_voice_profile;
    }

    public void set_reminder_name(String string){
        this.reminder_name=string;
    }

    public void set_reminder_date_time(Date date){
        this.reminder_date_time=date;
    }

    public void set_reminder_voice_profile(VoiceProfile voice_profile){
        this.reminder_voice_profile=voice_profile;
    }

    public void get_reminder_name(){return this.reminder_name} //since the value of the model is a private model, it requires a logic to just access or change set by the model itself

    public void get_reminder_date_time(){return this.reminder_date_time}

    public void get_reminder_UUID(){return this.reminder_UUID}

    public void get_reminder_voice_profile(){return this.reminder_voice_profile}
}
