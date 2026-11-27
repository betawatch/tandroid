// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class ta6 extends nhc {
    public static final qf5 d = new qf5(21);
    public final koa b = new koa();
    public boolean c = false;

    @Override // nhc
    public final void b() {
        koa koaVar = this.b;
        int i = koaVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            sa6 sa6Var = (sa6) koaVar.b[i2];
            m8d m8dVar = sa6Var.l;
            m8dVar.b();
            m8dVar.c = true;
            n31 n31Var = sa6Var.n;
            if (n31Var != null) {
                sa6Var.h(n31Var);
            }
            sa6 sa6Var2 = m8dVar.a;
            if (sa6Var2 == null) {
                grb.i("No listener register");
                return;
            }
            if (sa6Var2 != sa6Var) {
                lq5.j("Attempting to unregister the wrong listener");
                return;
            }
            m8dVar.a = null;
            m8dVar.d = true;
            m8dVar.b = false;
            m8dVar.c = false;
            m8dVar.e = false;
        }
        int i3 = koaVar.c;
        Object[] objArr = koaVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        koaVar.c = 0;
    }
}
