// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class xs7 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ vnb d;
    public final /* synthetic */ ms7 e;
    public final /* synthetic */ Boolean f;

    public /* synthetic */ xs7(Context context, int i, vnb vnbVar, ms7 ms7Var, Boolean bool, byte b) {
        this.a = b;
        this.b = context;
        this.c = i;
        this.d = vnbVar;
        this.e = ms7Var;
        this.f = bool;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        ms7 ms7Var = this.e;
        switch (b) {
            case 0:
                d31 j = ms7Var.j();
                it7.t(this.b, this.c, this.d, j, (String) obj, this.f);
                break;
            case 1:
                d31 j2 = ms7Var.j();
                it7.t(this.b, this.c, this.d, j2, (String) obj, this.f);
                break;
            case 2:
                d31 j3 = ms7Var.j();
                it7.t(this.b, this.c, this.d, j3, (String) obj, this.f);
                break;
            default:
                d31 j4 = ms7Var.j();
                it7.t(this.b, this.c, this.d, j4, (String) obj, this.f);
                break;
        }
    }
}
