package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements yh.k2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ i4 a;

    @Override // yh.k2
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        i4.S(this.a, tL_starGiftUnique, j3, z10);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.a.getClass();
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        i4.X(this.a, (h61) obj);
    }
}
