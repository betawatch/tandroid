// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tu9 extends age {
    public final /* synthetic */ xu9 a;

    public tu9(xu9 xu9Var) {
        this.a = xu9Var;
    }

    @Override // age
    public final boolean a(int i, int i2) {
        xu9 xu9Var = this.a;
        return ((uu9) xu9Var.n.get(i)).equals(xu9Var.r.get(i2));
    }

    @Override // age
    public final boolean b(int i, int i2) {
        xu9 xu9Var = this.a;
        return ((uu9) xu9Var.n.get(i)).a.h == ((uu9) xu9Var.r.get(i2)).a.h;
    }

    @Override // age
    public final int c() {
        return this.a.r.size();
    }

    @Override // age
    public final int d() {
        return this.a.n.size();
    }
}
