package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                y9 y9Var = (y9) this.b;
                o1.j jVar = y9Var.y;
                if (jVar != null) {
                    jVar.c();
                    y9Var.y = null;
                    break;
                }
                break;
            case 1:
                no0 no0Var = (no0) this.b;
                if (hVar == no0Var.c) {
                    no0Var.c = null;
                    break;
                }
                break;
            default:
                ((du0) this.b).E();
                break;
        }
    }
}
