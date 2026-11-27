// default package

import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class tlc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ HashSet c;
    public final /* synthetic */ String d;

    public /* synthetic */ tlc(VoIPService voIPService, HashSet hashSet, String str, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = hashSet;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        HashSet hashSet = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startConferenceGroupCall$53(hashSet, str);
                break;
            default:
                voIPService.lambda$startConferenceGroupCall$45(hashSet, str);
                break;
        }
    }
}
