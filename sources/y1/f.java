package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import m.g3;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class f extends VolumeProvider {
    public final /* synthetic */ p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.a = pVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i10) {
        p pVar = this.a;
        ((p4.e) ((g3) pVar.f).d).a.post(new p4.c(pVar, i10, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i10) {
        p pVar = this.a;
        ((p4.e) ((g3) pVar.f).d).a.post(new p4.c(pVar, i10, 0));
    }
}
