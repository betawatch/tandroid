package yh;

import org.telegram.ui.Components.xv0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class j6 implements le.d, xv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;

    public /* synthetic */ j6(z7 z7Var, int i10) {
        this.a = i10;
        this.b = z7Var;
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
        int i11 = this.a;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        switch (this.a) {
            case 0:
                this.b.u1();
                break;
            case 1:
                this.b.u1();
                break;
            default:
                this.b.U.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public int b() {
        return this.b.Y;
    }

    private final /* synthetic */ void a(float f7, int i10) {
    }

    private final /* synthetic */ void c(float f7, int i10) {
    }

    private final /* synthetic */ void d(float f7, int i10) {
    }
}
