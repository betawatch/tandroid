package pi;

import org.telegram.ui.Components.km0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class k implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ km0 c;
    public final /* synthetic */ q d;

    public k(q qVar, km0 km0Var) {
        this.d = qVar;
        this.c = km0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        km0 km0Var = this.c;
        int scrollX = km0Var.getScrollX();
        int scrollY = km0Var.getScrollY();
        int i3 = scrollX - this.a;
        q qVar = this.d;
        qVar.k += i3;
        qVar.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qVar.g++;
    }
}
