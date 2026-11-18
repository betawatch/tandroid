package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                bi.c6 c6Var = this.b.a;
                if (c6Var != null) {
                    c6Var.g3.O(true);
                    break;
                }
                break;
            default:
                bi.c6 c6Var2 = this.b.a;
                if (c6Var2 != null) {
                    c6Var2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
