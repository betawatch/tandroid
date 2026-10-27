package vi;

import li.e3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ c(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    public void a(Exception exc) {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                ((u0) e3Var.b).i.post(new j0(e3Var, exc, 1));
                break;
            default:
                e3 e3Var2 = this.b;
                ((u0) e3Var2.b).i.post(new j0(e3Var2, exc, 0));
                break;
        }
    }
}
