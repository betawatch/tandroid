package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c70 b;

    public /* synthetic */ s60(c70 c70Var, int i10) {
        this.a = i10;
        this.b = c70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                c70 c70Var = this.b;
                c70Var.i0();
                c70Var.e0();
                break;
            case 2:
                c70 c70Var2 = this.b;
                c70Var2.getClass();
                c70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                c70 c70Var3 = this.b;
                c70Var3.n.postOnAnimation(new s60(c70Var3, 1));
                break;
        }
    }
}
