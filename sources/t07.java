// default package

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t07 extends e17 {
    public final /* synthetic */ byte E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t07(qu0 qu0Var, qu0 qu0Var2, FrameLayout frameLayout, long j) {
        super(qu0Var2, frameLayout, j, true);
        this.F = qu0Var;
    }

    @Override // e17
    public final void f(String str, boolean z, boolean z2) {
        a aVar;
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                if (!z2) {
                    super.f(str, z, z2);
                    break;
                } else {
                    aVar = ((e) ((qu0) obj)).actionBar;
                    aVar.setSearchFieldText("");
                    break;
                }
            default:
                nz1 nz1Var = (nz1) obj;
                z2b z2bVar = nz1Var.Q1;
                if (!this.e.isEmpty()) {
                    if (!z2) {
                        super.f(str, z, z2);
                        break;
                    } else {
                        nz1Var.v1.L.setText("");
                        break;
                    }
                } else if (z2bVar.getVisibility() != 4) {
                    z2bVar.setVisibility(4);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t07(nz1 nz1Var, e eVar, ex0 ex0Var, long j) {
        super(eVar, ex0Var, j, false);
        this.F = nz1Var;
    }
}
