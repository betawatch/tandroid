// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class za0 implements fd, hm2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ob0 b;

    public /* synthetic */ za0(ob0 ob0Var, byte b) {
        this.a = b;
        this.b = ob0Var;
    }

    @Override // hm2
    public final void c(int i, int i2, boolean z) {
        ob0 ob0Var = this.b;
        if (i2 == 0) {
            jb0 jb0Var = ob0Var.Z;
            int i3 = jb0Var.c;
            if (i3 != i && (i3 == 0 || i == 0)) {
                jb0 a = jb0Var.a();
                ob0Var.Z = a;
                ob0Var.a.b(a, true);
                ob0Var.r0();
            }
            ob0Var.Z.c = i;
        } else if (i2 == 1) {
            jb0 jb0Var2 = ob0Var.Z;
            int i4 = jb0Var2.d;
            if (i4 != i && (i4 == 0 || i == 0)) {
                jb0 a2 = jb0Var2.a();
                ob0Var.Z = a2;
                ob0Var.a.b(a2, true);
                ob0Var.r0();
            }
            ob0Var.Z.d = i;
        } else if (i2 == 2) {
            jb0 jb0Var3 = ob0Var.Z;
            int i5 = jb0Var3.e;
            if (i5 != i && (i5 == 0 || i == 0)) {
                jb0 a3 = jb0Var3.a();
                ob0Var.Z = a3;
                ob0Var.a.b(a3, true);
                ob0Var.r0();
            }
            ob0Var.Z.e = i;
        } else if (i2 == 3) {
            jb0 jb0Var4 = ob0Var.Z;
            int i6 = jb0Var4.f;
            if (i6 != i && (i6 == 0 || i == 0)) {
                jb0 a4 = jb0Var4.a();
                ob0Var.Z = a4;
                ob0Var.a.b(a4, true);
                ob0Var.r0();
            }
            ob0Var.Z.f = i;
        }
        jn7.e().k(jn7.u4, new Object[0]);
        ob0Var.a.invalidate();
    }

    @Override // hm2
    public final int d(int i) {
        return 0;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        ob0 ob0Var = this.b;
        switch (b) {
            case 0:
                ob0Var.finishFragment();
                break;
            default:
                ob0Var.finishFragment();
                break;
        }
    }

    @Override // hm2
    public final void b() {
    }

    @Override // hm2
    public final void a(boolean z) {
    }
}
