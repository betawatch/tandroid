package wh;

import org.telegram.ui.Components.gu0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements fe.e, gu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ a(g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Components.gu0
    public int c() {
        return this.b.a0;
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        switch (this.a) {
            case 0:
                this.b.G0();
                break;
            case 1:
                this.b.G0();
                break;
            default:
                this.b.W.setAlpha(f7);
                break;
        }
    }

    private final /* synthetic */ void a(float f7, int i10) {
    }

    private final /* synthetic */ void b(float f7, int i10) {
    }

    private final /* synthetic */ void d(float f7, int i10) {
    }
}
