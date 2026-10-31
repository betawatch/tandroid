package ph;

import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements rh.o2, o20 {
    public final /* synthetic */ r3 a;

    @Override // rh.o2
    public void c(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        r3.Y(this.a, tL_starGiftUnique, j10, z10);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r3.c0(this.a, (a51) obj);
    }
}
