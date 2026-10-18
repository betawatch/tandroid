package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj0 b;

    public /* synthetic */ xi0(dj0 dj0Var, int i10) {
        this.a = i10;
        this.b = dj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.V(true, false);
                break;
            default:
                this.b.V(true, false);
                break;
        }
    }
}
