package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class u00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v00 b;

    public /* synthetic */ u00(v00 v00Var, int i10) {
        this.a = i10;
        this.b = v00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                v00 v00Var = this.b;
                v00Var.b(v00Var.y);
                break;
        }
    }
}
