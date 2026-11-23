package ri;

import org.telegram.ui.Components.wm0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class k implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ wm0 c;
    public final /* synthetic */ q d;

    public k(q qVar, wm0 wm0Var) {
        this.d = qVar;
        this.c = wm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wm0 wm0Var = this.c;
        int scrollX = wm0Var.getScrollX();
        int scrollY = wm0Var.getScrollY();
        int i7 = scrollX - this.a;
        q qVar = this.d;
        qVar.k += i7;
        qVar.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qVar.g++;
    }
}
