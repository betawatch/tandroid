// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x9a extends i49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ taa b;

    public /* synthetic */ x9a(taa taaVar, byte b) {
        this.a = b;
        this.b = taaVar;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        q11 q11Var;
        byte b = this.a;
        taa taaVar = this.b;
        switch (b) {
            case 0:
                if (i2 != 0) {
                    taaVar.U0();
                    taaVar.l2 = taaVar.k2;
                }
                m21 m21Var = m21.w;
                if (m21Var != null && (q11Var = m21Var.e) != null && (q11Var.getParent() instanceof View) && ((View) m21.w.e.getParent()).getParent() == taaVar.w1) {
                    m21.e();
                    break;
                }
                break;
            case 1:
                if (i2 != 0) {
                    taaVar.U0();
                    taaVar.l2 = taaVar.k2;
                    break;
                }
                break;
            default:
                if (i2 != 0) {
                    taaVar.U0();
                    taaVar.l2 = taaVar.k2;
                    break;
                }
                break;
        }
    }
}
