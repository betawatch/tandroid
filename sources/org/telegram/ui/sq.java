package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                bi.f6 f6Var = this.b.a;
                if (f6Var != null) {
                    f6Var.g3.O(true);
                    break;
                }
                break;
            default:
                bi.f6 f6Var2 = this.b.a;
                if (f6Var2 != null) {
                    f6Var2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
