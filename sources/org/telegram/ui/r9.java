package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                lo0 lo0Var = (lo0) this.b;
                if (hVar == lo0Var.c) {
                    lo0Var.c = null;
                    break;
                }
                break;
            default:
                ((bu0) this.b).E();
                break;
        }
    }
}
