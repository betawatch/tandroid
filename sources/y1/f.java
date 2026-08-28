package y1;

import a5.m;
import android.media.VolumeProvider;
import androidx.emoji2.text.o;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends VolumeProvider {
    public final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, int i9, int i10, int i11) {
        super(i9, i10, i11);
        this.a = oVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i9) {
        o oVar = this.a;
        ((c2.e) ((m) oVar.f).d).a.post(new c2.c(oVar, i9, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i9) {
        o oVar = this.a;
        ((c2.e) ((m) oVar.f).d).a.post(new c2.c(oVar, i9, 0));
    }
}
