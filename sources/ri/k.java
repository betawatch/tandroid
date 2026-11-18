package ri;

import org.telegram.ui.Components.tm0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
