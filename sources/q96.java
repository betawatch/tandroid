// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class q96 extends r96 implements f36 {
    public final i36 e;
    public final /* synthetic */ qj7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q96(qj7 qj7Var, i36 i36Var, cr7 cr7Var) {
        super(qj7Var, cr7Var);
        this.f = qj7Var;
        this.e = i36Var;
    }

    @Override // f36
    public final void b(i36 i36Var, y26 y26Var) {
        i36 i36Var2 = this.e;
        z26 z26Var = i36Var2.m().b;
        if (z26Var == z26.a) {
            this.f.h(this.a);
            return;
        }
        z26 z26Var2 = null;
        while (z26Var2 != z26Var) {
            a(e());
            z26Var2 = z26Var;
            z26Var = i36Var2.m().b;
        }
    }

    @Override // r96
    public final void c() {
        this.e.m().b(this);
    }

    @Override // r96
    public final boolean d(i36 i36Var) {
        return this.e == i36Var;
    }

    @Override // r96
    public final boolean e() {
        return this.e.m().b.compareTo(z26.d) >= 0;
    }
}
