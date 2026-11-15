package ri;

import org.telegram.ui.Components.lm0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class k implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ lm0 c;
    public final /* synthetic */ q d;

    public k(q qVar, lm0 lm0Var) {
        this.d = qVar;
        this.c = lm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lm0 lm0Var = this.c;
        int scrollX = lm0Var.getScrollX();
        int scrollY = lm0Var.getScrollY();
        int i7 = scrollX - this.a;
        q qVar = this.d;
        qVar.k += i7;
        qVar.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qVar.g++;
    }
}
