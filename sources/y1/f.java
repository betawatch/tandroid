package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
import la.h;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        ((p4.e) ((h) oVar.f).d).a.post(new p4.c(oVar, i10, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i10) {
        o oVar = this.a;
        ((p4.e) ((h) oVar.f).d).a.post(new p4.c(oVar, i10, 0));
    }
}
