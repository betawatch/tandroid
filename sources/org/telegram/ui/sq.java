package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tq b;

    public /* synthetic */ sq(tq tqVar, int i7) {
        this.a = i7;
        this.b = tqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bi.g6 g6Var = this.b.a;
                if (g6Var != null) {
                    g6Var.g3.O(true);
                    break;
                }
                break;
            default:
                bi.g6 g6Var2 = this.b.a;
                if (g6Var2 != null) {
                    g6Var2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
