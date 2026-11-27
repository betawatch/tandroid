// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tja extends yfb implements ks4 {
    public boolean a;
    public /* synthetic */ nm4 b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ yja d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tja(yja yjaVar, zw2 zw2Var) {
        super(3, zw2Var);
        this.d = yjaVar;
    }

    @Override // ks4
    public final Object a(Object obj, Object obj2, Object obj3) {
        tja tjaVar = new tja(this.d, (zw2) obj3);
        tjaVar.b = (nm4) obj;
        tjaVar.c = (Throwable) obj2;
        return tjaVar.invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            ixe.b(obj);
            nm4 nm4Var = this.b;
            Throwable th = this.c;
            s9a a = this.d.b.a(null);
            o9a o9aVar = new o9a(a, null, null);
            StringBuilder sb = new StringBuilder("Init session datastore failed with exception message: ");
            sb.append(th.getMessage());
            sb.append(". Emit fallback session ");
            bs2.x(sb, a.a, "FirebaseSessions");
            this.b = null;
            this.a = true;
            Object c = nm4Var.c(o9aVar, this);
            vx2 vx2Var = vx2.a;
            if (c == vx2Var) {
                return vx2Var;
            }
        } else {
            if (!z) {
                grb.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ixe.b(obj);
        }
        return g9c.a;
    }
}
