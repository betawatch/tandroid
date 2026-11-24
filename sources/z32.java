// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z32 extends i49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c42 b;

    public /* synthetic */ z32(c42 c42Var, byte b) {
        this.a = b;
        this.b = c42Var;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        y29 y29Var;
        byte b = this.a;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
                fu fuVar = c42Var.M;
                boolean z = i != 0;
                c42Var.I = z;
                if (!z && c42Var.G != null) {
                    c42Var.G = null;
                }
                if (i == 0) {
                    int L = gl.L(13.0f);
                    x02 x02Var = c42Var.b;
                    int i2 = x02Var.t0;
                    if (((x02Var.Y3[0] - i2) - L) + i2 < a.getCurrentActionBarHeight() && (y29Var = (y29) fuVar.K(0)) != null) {
                        View view = y29Var.a;
                        if (view.getTop() > 0) {
                            fuVar.x0(0, view.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i == 1 && c42Var.d0 && c42Var.e0) {
                    gl.t1(c42Var.b.getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 0:
                c42 c42Var = this.b;
                c42Var.h0();
                if (c42Var.G != null) {
                    c42Var.H += i2;
                }
                c42Var.b.H1(c42Var, i2);
                break;
        }
    }
}
