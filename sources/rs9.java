// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
