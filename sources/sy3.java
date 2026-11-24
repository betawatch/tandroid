// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class sy3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sy3(Object obj, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((t14) obj).P(false, z2, z);
                break;
            case 1:
                ((NativeInstance) obj).lambda$onNetworkStateUpdated$0(z2, z);
                break;
            case 2:
                ((VideoPlayerHolderBase) obj).lambda$setAudioEnabled$8(z2, z);
                break;
            case 3:
                ((VoIPService) obj).lambda$createGroupInstance$75(z2, z);
                break;
            case 4:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((i8c) obj, z2, z);
                break;
            default:
                ((aec) ((ekc) obj).c).d(z2, z);
                break;
        }
    }
}
