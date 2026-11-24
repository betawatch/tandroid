// default package

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class sjc implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, Instance.OnStateUpdatedListener {
    public final /* synthetic */ VoIPService a;
    public final /* synthetic */ int b;

    public /* synthetic */ sjc(VoIPService voIPService, int i) {
        this.a = voIPService;
        this.b = i;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i, boolean z) {
        this.a.lambda$createGroupInstance$74(this.b, i, z);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.VideoSourcesCallback
    public final void run(long j, int[] iArr) {
        this.a.lambda$createGroupInstance$73(this.b, j, iArr);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.a.lambda$createGroupInstance$71(this.b, iArr, fArr, zArr);
    }
}
