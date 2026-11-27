// default package

import org.telegram.messenger.voip.ConferenceCall;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
