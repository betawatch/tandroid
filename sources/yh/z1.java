package yh;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ z1(a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = a4Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                a4.N0(this.b, this.c, c2Var);
                break;
            default:
                nf.f.u(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug);
                break;
        }
    }
}
