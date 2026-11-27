// default package

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class r38 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s38 b;

    public /* synthetic */ r38(s38 s38Var, byte b) {
        this.a = b;
        this.b = s38Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r4.b.contains(java.lang.Long.valueOf(r9.id)) == false) goto L28;
     */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i;
        f48 f48Var;
        a48 a48Var;
        byte b = this.a;
        s38 s38Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                a48 a48Var2 = s38Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) a48Var2.N.get(num);
                a48Var2.L = starGift;
                h48 h48Var = a48Var2.q0;
                ed9 ed9Var = a48Var2.K;
                if (starGift != null) {
                    if (ed9Var != null) {
                        break;
                    }
                    i = ((e) h48Var).currentAccount;
                    ed9 ed9Var2 = new ed9(i, a48Var2.L.id, new r38(s38Var, (byte) 2));
                    ed9Var2.x = true;
                    a48Var2.K = ed9Var2;
                    ed9Var2.o(false);
                } else if (ed9Var != null) {
                    ed9Var.i();
                    a48Var2.K = null;
                }
                a48Var2.e();
                (h48Var.J.getCurrentPosition() == 1 ? h48Var.n : h48Var.h).d();
                break;
            case 1:
                a48 a48Var3 = s38Var.e;
                a48Var3.h = ((Integer) obj).intValue();
                a48Var3.r = null;
                a48Var3.s = null;
                a48Var3.J = null;
                a48Var3.j(true);
                a48Var3.i();
                a48Var3.f(true);
                z38 z38Var = a48Var3.E;
                if (z38Var != null) {
                    z38Var.invalidate();
                }
                h48 h48Var2 = a48Var3.q0;
                a48 a48Var4 = h48Var2.n;
                if (a48Var4 != null && (f48Var = a48Var4.a) != null && (a48Var = h48Var2.h) != null) {
                    f48Var.a(a48Var.h);
                    break;
                }
                break;
            default:
                s38Var.e.d();
                break;
        }
    }
}
