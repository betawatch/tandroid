package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements yh.l2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ h4 a;

    @Override // yh.l2
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        h4.U(this.a, tL_starGiftUnique, j3, z10);
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
        h4.Y(this.a, (i51) obj);
    }
}
