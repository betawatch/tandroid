// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class r67 implements fu9 {
    public final ju4 a;
    public final t9c b;
    public final w74 c;

    public r67(t9c t9cVar, w74 w74Var, ju4 ju4Var) {
        this.b = t9cVar;
        w74Var.getClass();
        this.c = w74Var;
        this.a = ju4Var;
    }

    @Override // fu9
    public final ju4 a() {
        ju4 ju4Var = this.a;
        return ik8.A(ju4Var) ? ju4Var.i() : ((hu4) ju4Var.c(5)).b();
    }

    @Override // fu9
    public final void b(Object obj, Object obj2) {
        iu9.k(this.b, obj, obj2);
    }

    @Override // fu9
    public final void c(Object obj) {
        this.b.getClass();
        s9c s9cVar = ((ju4) obj).unknownFields;
        if (s9cVar.e) {
            s9cVar.e = false;
        }
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override // fu9
    public final boolean d(Object obj) {
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override // fu9
    public final boolean e(ju4 ju4Var, ju4 ju4Var2) {
        this.b.getClass();
        return ju4Var.unknownFields.equals(ju4Var2.unknownFields);
    }

    @Override // fu9
    public final int f(ju4 ju4Var) {
        this.b.getClass();
        return ju4Var.unknownFields.hashCode();
    }

    @Override // fu9
    public final void g(Object obj, z8d z8dVar) {
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override // fu9
    public final int h(ju4 ju4Var) {
        this.b.getClass();
        s9c s9cVar = ju4Var.unknownFields;
        int i = s9cVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < s9cVar.a; i3++) {
            int i4 = s9cVar.b[i3] >>> 3;
            n51 n51Var = (n51) s9cVar.c[i3];
            int h = xk2.h(i4) + xk2.g(2) + (xk2.g(1) << 1);
            int g = xk2.g(3);
            int size = n51Var.size();
            i2 += xk2.h(size) + size + g + h;
        }
        s9cVar.d = i2;
        return i2;
    }

    @Override // fu9
    public final void i(Object obj, cf0 cf0Var, v74 v74Var) {
        this.b.getClass();
        t9c.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
