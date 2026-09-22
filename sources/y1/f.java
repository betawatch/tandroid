package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
import lf.i;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        ((p4.e) ((i) oVar.f).d).a.post(new p4.c(oVar, i10, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i10) {
        o oVar = this.a;
        ((p4.e) ((i) oVar.f).d).a.post(new p4.c(oVar, i10, 0));
    }
}
