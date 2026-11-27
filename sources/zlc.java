// default package

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class zlc implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, Instance.OnStateUpdatedListener {
    public final /* synthetic */ VoIPService a;
    public final /* synthetic */ int b;

    public /* synthetic */ zlc(VoIPService voIPService, int i) {
        this.a = voIPService;
        this.b = i;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i, boolean z) {
        this.a.lambda$createGroupInstance$75(this.b, i, z);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.VideoSourcesCallback
    public final void run(long j, int[] iArr) {
        this.a.lambda$createGroupInstance$74(this.b, j, iArr);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.a.lambda$createGroupInstance$72(this.b, iArr, fArr, zArr);
    }
}
