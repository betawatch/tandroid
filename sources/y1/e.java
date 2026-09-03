package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        ((c2.e) ((af.d) pVar.f).d).a.post(new c2.c(pVar, i10, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i10) {
        p pVar = this.a;
        ((c2.e) ((af.d) pVar.f).d).a.post(new c2.c(pVar, i10, 0));
    }
}
