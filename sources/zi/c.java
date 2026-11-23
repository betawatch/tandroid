package zi;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ c(k0 k0Var, int i7) {
        this.a = i7;
        this.b = k0Var;
    }

    public void a(Exception exc) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                ((u0) k0Var.a).i.post(new j0(k0Var, exc, 1));
                break;
            default:
                k0 k0Var2 = this.b;
                ((u0) k0Var2.a).i.post(new j0(k0Var2, exc, 0));
                break;
        }
    }
}
