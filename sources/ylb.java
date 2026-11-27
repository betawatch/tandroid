// default package

import android.view.Menu;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ylb implements ez5, dz5 {
    public final /* synthetic */ ut3 a;
    public final /* synthetic */ Menu b;

    public /* synthetic */ ylb(ut3 ut3Var, Menu menu) {
        this.a = ut3Var;
        this.b = menu;
    }

    @Override // ez5
    public final void a(String str) {
        ut3 ut3Var = this.a;
        ut3Var.b = str;
        ut3Var.b(this.b);
    }

    @Override // dz5
    public final void l(Exception exc) {
        cc4.d("mlkit: failed to detect language in selection");
        cc4.g(exc, true);
        ut3 ut3Var = this.a;
        ut3Var.b = null;
        ut3Var.b(this.b);
    }
}
