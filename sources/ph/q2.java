package ph;

import java.io.Serializable;
import org.telegram.messenger.p20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements rh.o2, p20 {
    public final /* synthetic */ r3 a;

    @Override // rh.o2
    public void c(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        r3.Z(this.a, tL_starGiftUnique, j10, z10);
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r3.d0(this.a, (b51) obj);
    }
}
