// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rs9 extends zde {
    public final /* synthetic */ vs9 a;

    public rs9(vs9 vs9Var) {
        this.a = vs9Var;
    }

    @Override // zde
    public final boolean a(int i, int i2) {
        vs9 vs9Var = this.a;
        return ((ss9) vs9Var.n.get(i)).equals(vs9Var.r.get(i2));
    }

    @Override // zde
    public final boolean b(int i, int i2) {
        vs9 vs9Var = this.a;
        return ((ss9) vs9Var.n.get(i)).a.h == ((ss9) vs9Var.r.get(i2)).a.h;
    }

    @Override // zde
    public final int c() {
        return this.a.r.size();
    }

    @Override // zde
    public final int d() {
        return this.a.n.size();
    }
}
