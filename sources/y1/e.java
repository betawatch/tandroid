package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import m.h3;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class e extends VolumeProvider {
    public final /* synthetic */ p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p pVar, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.a = pVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i10) {
        p pVar = this.a;
        ((p4.e) ((h3) pVar.f).d).a.post(new p4.c(pVar, i10, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i10) {
        p pVar = this.a;
        ((p4.e) ((h3) pVar.f).d).a.post(new p4.c(pVar, i10, 0));
    }
}
