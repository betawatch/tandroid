package ri;

import org.telegram.ui.Components.tm0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class k implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ tm0 c;
    public final /* synthetic */ q d;

    public k(q qVar, tm0 tm0Var) {
        this.d = qVar;
        this.c = tm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tm0 tm0Var = this.c;
        int scrollX = tm0Var.getScrollX();
        int scrollY = tm0Var.getScrollY();
        int i7 = scrollX - this.a;
        q qVar = this.d;
        qVar.k += i7;
        qVar.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qVar.g++;
    }
}
