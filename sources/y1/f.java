package y1;

import a5.n;
import ag.h1;
import android.media.VolumeProvider;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends VolumeProvider {
    public final /* synthetic */ h1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h1 h1Var, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.a = h1Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i10) {
        h1 h1Var = this.a;
        ((c2.e) ((n) h1Var.f).d).a.post(new c2.c(h1Var, i10, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i10) {
        h1 h1Var = this.a;
        ((c2.e) ((n) h1Var.f).d).a.post(new c2.c(h1Var, i10, 0));
    }
}
