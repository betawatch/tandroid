// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class td0 implements s84 {
    public final /* synthetic */ byte a;
    public final yw7 b;
    public final ska c;

    public td0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new yw7(4);
                this.c = new ska(-1, -1, "image/webp");
                break;
            default:
                this.b = new yw7(4);
                this.c = new ska(-1, -1, "image/avif");
                break;
        }
    }

    @Override // s84
    public final s84 a() {
        byte b = this.a;
        return this;
    }

    @Override // s84
    public final int b(t84 t84Var, u21 u21Var) {
        byte b = this.a;
        ska skaVar = this.c;
        switch (b) {
        }
        return skaVar.b(t84Var, u21Var);
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        byte b = this.a;
        yw7 yw7Var = this.b;
        switch (b) {
            case 0:
                vb3 vb3Var = (vb3) t84Var;
                vb3Var.a(4, false);
                yw7Var.K(4);
                vb3Var.d(yw7Var.a, 0, 4, false);
                if (yw7Var.C() == 1718909296) {
                    yw7Var.K(4);
                    vb3Var.d(yw7Var.a, 0, 4, false);
                    if (yw7Var.C() == 1635150182) {
                    }
                }
                break;
            default:
                yw7Var.K(4);
                vb3 vb3Var2 = (vb3) t84Var;
                vb3Var2.d(yw7Var.a, 0, 4, false);
                if (yw7Var.C() == 1380533830) {
                    vb3Var2.a(4, false);
                    yw7Var.K(4);
                    vb3Var2.d(yw7Var.a, 0, 4, false);
                    if (yw7Var.C() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // s84
    public final void d(long j, long j2) {
        byte b = this.a;
        ska skaVar = this.c;
        switch (b) {
            case 0:
                skaVar.d(j, j2);
                break;
            default:
                skaVar.d(j, j2);
                break;
        }
    }

    @Override // s84
    public final List e() {
        byte b = this.a;
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        byte b = this.a;
        ska skaVar = this.c;
        switch (b) {
            case 0:
                skaVar.f(u84Var);
                break;
            default:
                skaVar.f(u84Var);
                break;
        }
    }

    @Override // s84
    public final void release() {
        byte b = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
