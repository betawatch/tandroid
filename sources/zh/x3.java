package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.m61;
import org.telegram.ui.zo0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements zo0, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.zo0
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
                rh.r rVar = (rh.r) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        rVar.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    rVar.run(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                c90 c90Var = (c90) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        c90Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    c90Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m7 m7Var = (m7) this.b;
        m61 m61Var = (m61) obj;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        m7Var.getClass();
        if (m61Var.G instanceof TL_stars.StarsTransaction) {
            p7.i1(m7Var.getContext(), false, 0L, m7Var.c, (TL_stars.StarsTransaction) m61Var.G, m7Var.b);
        }
    }
}
