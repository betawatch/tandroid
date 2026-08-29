package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends VolumeProvider {
    public final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.a = oVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i10) {
        o oVar = this.a;
        ((c2.e) ((androidx.biometric.e) oVar.f).d).a.post(new c2.c(oVar, i10, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i10) {
        o oVar = this.a;
        ((c2.e) ((androidx.biometric.e) oVar.f).d).a.post(new c2.c(oVar, i10, 0));
    }
}
