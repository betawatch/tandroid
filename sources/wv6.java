// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class wv6 implements kw6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lw6 b;
    public final /* synthetic */ long c;

    public /* synthetic */ wv6(lw6 lw6Var, long j, byte b) {
        this.a = b;
        this.b = lw6Var;
        this.c = j;
    }

    @Override // kw6
    public final void a(su6 su6Var) {
        byte b = this.a;
        long j = this.c;
        lw6 lw6Var = this.b;
        switch (b) {
            case 0:
                tv6 tv6Var = lw6Var.j;
                tv6Var.t();
                tv6Var.t.W((int) j);
                break;
            default:
                tv6 tv6Var2 = lw6Var.j;
                tv6Var2.t();
                tv6Var2.t.f(j);
                break;
        }
    }
}
