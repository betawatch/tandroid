package zh;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ l2(m3 m3Var, int i7) {
        this.a = i7;
        this.b = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c3 c3Var = this.b.d;
                if (!c3Var.j.isEmpty()) {
                    c3Var.j.clear();
                    c3Var.h();
                    break;
                }
                break;
            case 1:
                c3 c3Var2 = this.b.d;
                if (!c3Var2.k.isEmpty()) {
                    c3Var2.k.clear();
                    c3Var2.h();
                    break;
                }
                break;
            case 2:
                this.b.d.i(b3.a);
                break;
            case 3:
                this.b.d.i(b3.b);
                break;
            case 4:
                this.b.d.i(b3.c);
                break;
            default:
                c3 c3Var3 = this.b.d;
                if (!c3Var3.l.isEmpty()) {
                    c3Var3.l.clear();
                    c3Var3.h();
                    break;
                }
                break;
        }
    }
}
