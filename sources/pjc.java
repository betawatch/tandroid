// default package

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class pjc implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, NativeInstance.BroadcastStateCallback, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final /* synthetic */ VoIPService a;

    public /* synthetic */ pjc(VoIPService voIPService) {
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
