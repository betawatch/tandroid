package ri;

import org.telegram.ui.Components.lm0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
