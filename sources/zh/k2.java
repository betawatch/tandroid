package zh;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ k2(m3 m3Var, int i7) {
        this.a = i7;
        this.b = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b.d;
                if (!d3Var.l.isEmpty()) {
                    d3Var.l.clear();
                    d3Var.h();
                    break;
                }
                break;
            case 1:
                d3 d3Var2 = this.b.d;
                if (!d3Var2.k.isEmpty()) {
                    d3Var2.k.clear();
                    d3Var2.h();
                    break;
                }
                break;
            case 2:
                d3 d3Var3 = this.b.d;
                if (!d3Var3.j.isEmpty()) {
                    d3Var3.j.clear();
                    d3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.d.i(c3.a);
                break;
            case 4:
                this.b.d.i(c3.b);
                break;
            default:
                this.b.d.i(c3.c);
                break;
        }
    }
}
