package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p00 b;

    public /* synthetic */ rz(p00 p00Var, int i10) {
        this.a = i10;
        this.b = p00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p00.V(this.b);
                break;
            default:
                p00.W(this.b);
                break;
        }
    }
}
