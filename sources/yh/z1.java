package yh;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ z1(z3 z3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = z3Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                z3.N0(this.b, this.c, b2Var);
                break;
            default:
                nf.f.u(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug);
                break;
        }
    }
}
