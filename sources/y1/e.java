package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        ((p4.e) ((k6.c) pVar.f).d).a.post(new p4.c(pVar, i10, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i10) {
        p pVar = this.a;
        ((p4.e) ((k6.c) pVar.f).d).a.post(new p4.c(pVar, i10, 0));
    }
}
