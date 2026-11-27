// default package

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
