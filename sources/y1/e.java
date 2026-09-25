package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
import la.h;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
