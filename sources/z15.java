// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z15 implements p8c {
    public final /* synthetic */ s25 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ u41 c;
    public final /* synthetic */ u41 d;
    public final /* synthetic */ w25 e;
    public final /* synthetic */ ki7 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ wjb h;

    public /* synthetic */ z15(s25 s25Var, boolean[] zArr, u41 u41Var, u41 u41Var2, w25 w25Var, ki7 ki7Var, boolean[] zArr2, wjb wjbVar) {
        this.a = s25Var;
        this.b = zArr;
        this.c = u41Var;
        this.d = u41Var2;
        this.e = w25Var;
        this.f = ki7Var;
        this.g = zArr2;
        this.h = wjbVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        s25 s25Var = this.a;
        if (s25Var.m || s25Var.n) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue || zArr[0]) {
            u41 u41Var = this.c;
            u41Var.setEnabled(false);
            u41 u41Var2 = this.d;
            u41Var2.setEnabled(false);
            (bool.booleanValue() ? u41Var2 : u41Var).setLoading(true);
            this.e.e(s25Var, bool.booleanValue(), new d25(u41Var, u41Var2, this.f, this.g, this.h, s25Var, zArr));
        }
    }
}
