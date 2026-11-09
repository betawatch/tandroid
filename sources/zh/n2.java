package zh;

import bi.l5;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements l5, a20 {
    public final /* synthetic */ m3 a;

    public /* synthetic */ n2(m3 m3Var) {
        this.a = m3Var;
    }

    @Override // bi.l5
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z9) {
        m3.b0(this.a, tL_starGiftUnique, j3, z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        m3.e0(this.a, (y31) obj);
    }
}
