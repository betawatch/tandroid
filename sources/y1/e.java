package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
import lf.h;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class e extends VolumeProvider {
    public final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
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
