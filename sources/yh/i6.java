package yh;

import org.telegram.ui.Components.wv0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class i6 implements le.d, wv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x7 b;

    public /* synthetic */ i6(x7 x7Var, int i10) {
        this.a = i10;
        this.b = x7Var;
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

    @Override // org.telegram.ui.Components.wv0
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
