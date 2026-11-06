package zh;

import bi.l5;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements l5, a20 {
    public final /* synthetic */ m3 a;

    public /* synthetic */ m2(m3 m3Var) {
        this.a = m3Var;
    }

    @Override // bi.l5
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z9) {
        m3.Z(this.a, tL_starGiftUnique, j3, z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        m3.d0(this.a, (x31) obj);
    }
}
