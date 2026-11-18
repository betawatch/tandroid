package p4;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ e0(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                h2.l0.W(m0Var.h.l, new e0(m0Var, 1));
                break;
            default:
                this.b.o0();
                break;
        }
    }
}
