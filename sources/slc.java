// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class slc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ long d;

    public /* synthetic */ slc(VoIPService voIPService, TLRPC.Updates updates, long j, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = updates;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLRPC.Updates updates = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startConferenceGroupCall$49(updates, j);
                break;
            default:
                voIPService.lambda$startConferenceGroupCall$41(updates, j);
                break;
        }
    }
}
