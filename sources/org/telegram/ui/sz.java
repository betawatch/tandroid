package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q00 b;

    public /* synthetic */ sz(q00 q00Var, int i10) {
        this.a = i10;
        this.b = q00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q00.V(this.b);
                break;
            default:
                q00.W(this.b);
                break;
        }
    }
}
