package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                bi.i6 i6Var = this.b.a;
                if (i6Var != null) {
                    i6Var.g3.O(true);
                    break;
                }
                break;
            default:
                bi.i6 i6Var2 = this.b.a;
                if (i6Var2 != null) {
                    i6Var2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
