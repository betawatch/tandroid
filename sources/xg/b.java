package xg;

import org.telegram.messenger.d20;
import org.telegram.messenger.sc;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements wg.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;

    public /* synthetic */ b(int i10, p6 p6Var) {
        this.a = i10;
        this.b = p6Var;
    }

    @Override // wg.c
    public final int g(p6 p6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (b9.c(d20.s0, this.b)) {
                    return t6.r1(sc.e(262144) ? 0.85f : 0.76f, t6.w0(t6.Ge, p6Var));
                }
                return i0.b.o(t6.w0(t6.Ge, p6Var), zs.e4);
            case 1:
                if (b9.c(d20.s0, this.b)) {
                    return t6.r1(sc.e(262144) ? 0.85f : 0.76f, t6.w0(t6.Qe, p6Var));
                }
                return i0.b.o(t6.w0(z10 ? t6.s8 : t6.Qe, p6Var), zs.e4);
            default:
                if (b9.c(d20.s0, this.b)) {
                    return t6.r1(sc.e(262144) ? 0.85f : 0.76f, t6.w0(t6.Qe, p6Var));
                }
                return i0.b.o(t6.w0(z10 ? t6.s8 : t6.Qe, p6Var), zs.e4);
        }
    }
}
