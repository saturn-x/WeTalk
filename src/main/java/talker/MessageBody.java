package talker;


import java.util.Date;

public class MessageBody {
    private String sender;
    private String receiver;
    private String content;
    private Date date;
    /** 广播转发的目标地址（告知 STOMP 代理转发到哪个地方） */
    private String destination;
}
