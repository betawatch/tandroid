// default package

import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ulc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ HashSet c;
    public final /* synthetic */ String d;

    public /* synthetic */ ulc(VoIPService voIPService, HashSet hashSet, String str, byte b) {
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
