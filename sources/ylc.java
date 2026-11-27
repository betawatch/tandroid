// default package

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ylc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AudioManager b;

    public /* synthetic */ ylc(AudioManager audioManager, byte b) {
        this.a = b;
        this.b = audioManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        AudioManager audioManager = this.b;
        switch (b) {
            case 0:
                VoIPService.lambda$onDestroy$95(audioManager);
                break;
            default:
                VoipAudioManager.lambda$stopBluetooth$2(audioManager);
                break;
        }
    }
}
