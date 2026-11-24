// default package

import org.telegram.messenger.voip.ConferenceCall;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class xq2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ConferenceCall b;

    public /* synthetic */ xq2(ConferenceCall conferenceCall, byte b) {
        this.a = b;
        this.b = conferenceCall;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ConferenceCall conferenceCall = this.b;
        switch (b) {
            case 0:
                conferenceCall.lambda$checkParticipants$1();
                break;
            case 1:
                conferenceCall.lambda$checkEmojiHash$0();
                break;
            default:
                conferenceCall.poll();
                break;
        }
    }
}
