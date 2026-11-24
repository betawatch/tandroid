// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xb0 implements ee, an2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mc0 b;

    public /* synthetic */ xb0(mc0 mc0Var, byte b) {
        this.a = b;
        this.b = mc0Var;
    }

    @Override // an2
    public final void c(int i, int i2, boolean z) {
        mc0 mc0Var = this.b;
        if (i2 == 0) {
            hc0 hc0Var = mc0Var.Z;
            int i3 = hc0Var.c;
            if (i3 != i && (i3 == 0 || i == 0)) {
                hc0 a = hc0Var.a();
                mc0Var.Z = a;
                mc0Var.a.b(a, true);
                mc0Var.s0();
            }
            mc0Var.Z.c = i;
        } else if (i2 == 1) {
            hc0 hc0Var2 = mc0Var.Z;
            int i4 = hc0Var2.d;
            if (i4 != i && (i4 == 0 || i == 0)) {
                hc0 a2 = hc0Var2.a();
                mc0Var.Z = a2;
                mc0Var.a.b(a2, true);
                mc0Var.s0();
            }
            mc0Var.Z.d = i;
        } else if (i2 == 2) {
            hc0 hc0Var3 = mc0Var.Z;
            int i5 = hc0Var3.e;
            if (i5 != i && (i5 == 0 || i == 0)) {
                hc0 a3 = hc0Var3.a();
                mc0Var.Z = a3;
                mc0Var.a.b(a3, true);
                mc0Var.s0();
            }
            mc0Var.Z.e = i;
        } else if (i2 == 3) {
            hc0 hc0Var4 = mc0Var.Z;
            int i6 = hc0Var4.f;
            if (i6 != i && (i6 == 0 || i == 0)) {
                hc0 a4 = hc0Var4.a();
                mc0Var.Z = a4;
                mc0Var.a.b(a4, true);
                mc0Var.s0();
            }
            mc0Var.Z.f = i;
        }
        nm7.e().k(nm7.v4, new Object[0]);
        mc0Var.a.invalidate();
    }

    @Override // an2
    public final int d(int i) {
        return 0;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        mc0 mc0Var = this.b;
        switch (b) {
            case 0:
                mc0Var.finishFragment();
                break;
            default:
                mc0Var.finishFragment();
                break;
        }
    }

    @Override // an2
    public final void a(boolean z) {
    }

    @Override // an2
    public final void b() {
    }
}
