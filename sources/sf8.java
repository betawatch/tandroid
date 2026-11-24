// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sf8 implements ed, n8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uf8 b;

    public /* synthetic */ sf8(uf8 uf8Var, byte b) {
        this.a = b;
        this.b = uf8Var;
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((c4c) obj).d == 1) {
            ahb ahbVar = (ahb) view;
            boolean z = !ahbVar.e.h;
            uf8 uf8Var = this.b;
            uf8Var.n = z;
            ahbVar.setChecked(z);
            uf8Var.d.g3.O(true);
            uf8Var.Y(true);
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        uf8 uf8Var = this.b;
        switch (b) {
            case 0:
                uf8Var.c0();
                break;
            default:
                uf8Var.finishFragment();
                break;
        }
    }
}
