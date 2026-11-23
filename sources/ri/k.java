package ri;

import org.telegram.ui.Components.vm0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class k implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ vm0 c;
    public final /* synthetic */ q d;

    public k(q qVar, vm0 vm0Var) {
        this.d = qVar;
        this.c = vm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vm0 vm0Var = this.c;
        int scrollX = vm0Var.getScrollX();
        int scrollY = vm0Var.getScrollY();
        int i7 = scrollX - this.a;
        q qVar = this.d;
        qVar.k += i7;
        qVar.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qVar.g++;
    }
}
