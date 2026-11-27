// default package

import org.telegram.messenger.voip.ConferenceCall;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class qr2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ConferenceCall b;

    public /* synthetic */ qr2(ConferenceCall conferenceCall, byte b) {
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
