package yh;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ a2(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                y3.N0(this.b, this.c, b2Var);
                break;
            default:
                nf.f.u(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug);
                break;
        }
    }
}
