// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class py4 implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ ny9 c;
    public final /* synthetic */ vy4 d;

    public py4(vy4 vy4Var, ny9 ny9Var) {
        this.d = vy4Var;
        this.c = ny9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ny9 ny9Var = this.c;
        int scrollX = ny9Var.getScrollX();
        int scrollY = ny9Var.getScrollY();
        vy4 vy4Var = this.d;
        vy4Var.k = (scrollX - this.a) + vy4Var.k;
        vy4Var.l = (scrollY - this.b) + vy4Var.l;
        this.a = scrollX;
        this.b = scrollY;
        vy4Var.g++;
    }
}
