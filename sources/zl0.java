// default package

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zl0 implements e84 {
    public final /* synthetic */ byte a;
    public final lma b;

    public zl0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new lma(35152, 2, "image/png");
                break;
            default:
                this.b = new lma(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // e84
    public final e84 a() {
        byte b = this.a;
        return this;
    }

    @Override // e84
    public final int b(f84 f84Var, v11 v11Var) {
        byte b = this.a;
        lma lmaVar = this.b;
        switch (b) {
        }
        return lmaVar.b(f84Var, v11Var);
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        byte b = this.a;
        lma lmaVar = this.b;
        switch (b) {
        }
        return lmaVar.c(f84Var);
    }

    @Override // e84
    public final void d(long j, long j2) {
        byte b = this.a;
        lma lmaVar = this.b;
        switch (b) {
            case 0:
                lmaVar.d(j, j2);
                break;
            default:
                lmaVar.d(j, j2);
                break;
        }
    }

    @Override // e84
    public final List e() {
        byte b = this.a;
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        byte b = this.a;
        lma lmaVar = this.b;
        switch (b) {
            case 0:
                lmaVar.f(g84Var);
                break;
            default:
                lmaVar.f(g84Var);
                break;
        }
    }

    @Override // e84
    public final void release() {
        byte b = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
