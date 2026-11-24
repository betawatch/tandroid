// default package

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class phc implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, NativeInstance.BroadcastStateCallback, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final /* synthetic */ VoIPService a;

    public /* synthetic */ phc(VoIPService voIPService) {
        this.a = voIPService;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.BroadcastStateCallback
    public final void onBroadcastStateChanged(boolean z, boolean z2) {
        this.a.lambda$createGroupInstance$76(z, z2);
    }

    @Override // org.telegram.messenger.voip.Instance.OnRemoteMediaStateUpdatedListener
    public final void onMediaStateUpdated(int i, int i2) {
        this.a.lambda$initiateActualEncryptedCall$83(i, i2);
    }

    @Override // org.telegram.messenger.voip.Instance.OnSignalBarsUpdatedListener
    public final void onSignalBarsUpdated(int i) {
        this.a.onSignalBarCountChanged(i);
    }

    @Override // org.telegram.messenger.voip.Instance.OnSignalingDataListener
    public final void onSignalingData(byte[] bArr) {
        this.a.onSignalingData(bArr);
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i, boolean z) {
        this.a.onConnectionStateChanged(i, z);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.a.lambda$initiateActualEncryptedCall$81(iArr, fArr, zArr);
    }
}
