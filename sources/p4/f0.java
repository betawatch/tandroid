package p4;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ f0(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                h2.l0.W(n0Var.h.l, new f0(n0Var, 1));
                break;
            default:
                this.b.o0();
                break;
        }
    }
}
