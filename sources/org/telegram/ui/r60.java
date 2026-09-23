package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class r60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;

    public /* synthetic */ r60(b70 b70Var, int i10) {
        this.a = i10;
        this.b = b70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                b70 b70Var = this.b;
                b70Var.i0();
                b70Var.e0();
                break;
            case 2:
                b70 b70Var2 = this.b;
                b70Var2.getClass();
                b70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                b70 b70Var3 = this.b;
                b70Var3.n.postOnAnimation(new r60(b70Var3, 1));
                break;
        }
    }
}
