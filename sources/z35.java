// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class z35 implements qac {
    public final /* synthetic */ s45 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ b61 c;
    public final /* synthetic */ b61 d;
    public final /* synthetic */ w45 e;
    public final /* synthetic */ mk7 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ ylb h;

    public /* synthetic */ z35(s45 s45Var, boolean[] zArr, b61 b61Var, b61 b61Var2, w45 w45Var, mk7 mk7Var, boolean[] zArr2, ylb ylbVar) {
        this.a = s45Var;
        this.b = zArr;
        this.c = b61Var;
        this.d = b61Var2;
        this.e = w45Var;
        this.f = mk7Var;
        this.g = zArr2;
        this.h = ylbVar;
    }

    @Override // qac
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        s45 s45Var = this.a;
        if (s45Var.m || s45Var.n) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue || zArr[0]) {
            b61 b61Var = this.c;
            b61Var.setEnabled(false);
            b61 b61Var2 = this.d;
            b61Var2.setEnabled(false);
            (bool.booleanValue() ? b61Var2 : b61Var).setLoading(true);
            this.e.e(s45Var, bool.booleanValue(), new d45(b61Var, b61Var2, this.f, this.g, this.h, s45Var, zArr));
        }
    }
}
