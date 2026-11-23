package zi;

import y7.h7;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ c(h7 h7Var, int i7) {
        this.a = i7;
        this.b = h7Var;
    }

    public void a(Exception exc) {
        switch (this.a) {
            case 0:
                h7 h7Var = this.b;
                ((u0) h7Var.a).i.post(new j0(h7Var, exc, 1));
                break;
            default:
                h7 h7Var2 = this.b;
                ((u0) h7Var2.a).i.post(new j0(h7Var2, exc, 0));
                break;
        }
    }
}
