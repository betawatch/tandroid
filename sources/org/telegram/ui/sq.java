package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                bi.d6 d6Var = this.b.a;
                if (d6Var != null) {
                    d6Var.g3.O(true);
                    break;
                }
                break;
            default:
                bi.d6 d6Var2 = this.b.a;
                if (d6Var2 != null) {
                    d6Var2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
