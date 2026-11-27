// default package

import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class pr2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ConferenceCall b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ pr2(ConferenceCall conferenceCall, long j, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = conferenceCall;
        this.c = j;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.e;
        TLObject tLObject = this.d;
        long j = this.c;
        ConferenceCall conferenceCall = this.b;
        switch (b) {
            case 0:
                conferenceCall.lambda$pull_outbound$5(j, tLObject, tL_error);
                break;
            case 1:
                conferenceCall.lambda$kick$12(j, tLObject, tL_error);
                break;
            default:
                conferenceCall.lambda$updateParticipants$10(j, tLObject, tL_error);
                break;
        }
    }
}
