package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.l61;
import org.telegram.ui.bp0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements bp0, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.bp0
    public void a(int i10) {
        switch (this.a) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        callback2.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    callback2.run(Boolean.TRUE, null);
                    break;
                }
                break;
            case 1:
                rh.s sVar = (rh.s) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        sVar.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    sVar.run(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                d90 d90Var = (d90) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        d90Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    d90Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m7 m7Var = (m7) this.b;
        l61 l61Var = (l61) obj;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        m7Var.getClass();
        if (l61Var.G instanceof TL_stars.StarsTransaction) {
            p7.i1(m7Var.getContext(), false, 0L, m7Var.c, (TL_stars.StarsTransaction) l61Var.G, m7Var.b);
        }
    }
}
