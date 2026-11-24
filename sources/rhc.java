// default package

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class rhc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AudioManager b;

    public /* synthetic */ rhc(AudioManager audioManager, byte b) {
        this.a = b;
        this.b = audioManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        AudioManager audioManager = this.b;
        switch (b) {
            case 0:
                VoIPService.lambda$onDestroy$94(audioManager);
                break;
            default:
                VoipAudioManager.lambda$stopBluetooth$2(audioManager);
                break;
        }
    }
}
