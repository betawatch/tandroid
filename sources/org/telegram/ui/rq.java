package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                bi.v3 v3Var = this.b.a;
                if (v3Var != null) {
                    v3Var.g3.O(true);
                    break;
                }
                break;
            default:
                bi.v3 v3Var2 = this.b.a;
                if (v3Var2 != null) {
                    v3Var2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
