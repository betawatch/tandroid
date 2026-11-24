// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ym0 implements s84 {
    public final /* synthetic */ byte a;
    public final ska b;

    public ym0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ska(35152, 2, "image/png");
                break;
            default:
                this.b = new ska(16973, 2, "image/bmp");
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
        ska skaVar = this.b;
        switch (b) {
        }
        return skaVar.b(t84Var, u21Var);
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        byte b = this.a;
        ska skaVar = this.b;
        switch (b) {
        }
        return skaVar.c(t84Var);
    }

    @Override // s84
    public final void d(long j, long j2) {
        byte b = this.a;
        ska skaVar = this.b;
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
        ska skaVar = this.b;
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
