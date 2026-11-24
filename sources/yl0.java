// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class yl0 implements j74 {
    public final /* synthetic */ byte a;
    public final qia b;

    public yl0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new qia(35152, 2, "image/png");
                break;
            default:
                this.b = new qia(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // j74
    public final j74 a() {
        byte b = this.a;
        return this;
    }

    @Override // j74
    public final int b(k74 k74Var, m11 m11Var) {
        byte b = this.a;
        qia qiaVar = this.b;
        switch (b) {
        }
        return qiaVar.b(k74Var, m11Var);
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        byte b = this.a;
        qia qiaVar = this.b;
        switch (b) {
        }
        return qiaVar.c(k74Var);
    }

    @Override // j74
    public final void d(long j, long j2) {
        byte b = this.a;
        qia qiaVar = this.b;
        switch (b) {
            case 0:
                qiaVar.d(j, j2);
                break;
            default:
                qiaVar.d(j, j2);
                break;
        }
    }

    @Override // j74
    public final List e() {
        byte b = this.a;
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        byte b = this.a;
        qia qiaVar = this.b;
        switch (b) {
            case 0:
                qiaVar.f(l74Var);
                break;
            default:
                qiaVar.f(l74Var);
                break;
        }
    }

    @Override // j74
    public final void release() {
        byte b = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
