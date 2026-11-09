package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sq b;

    public /* synthetic */ rq(sq sqVar, int i7) {
        this.a = i7;
        this.b = sqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fi.w3 w3Var = this.b.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    break;
                }
                break;
            default:
                fi.w3 w3Var2 = this.b.a;
                if (w3Var2 != null) {
                    w3Var2.f3.O(true);
                    break;
                }
                break;
        }
    }
}
