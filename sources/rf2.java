// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rf2 implements ed, n8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uf2 b;

    public /* synthetic */ rf2(uf2 uf2Var, byte b) {
        this.a = b;
        this.b = uf2Var;
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.b.d0((c4c) obj, (View) obj2);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        uf2 uf2Var = this.b;
        switch (b) {
            case 0:
                uf2Var.e0();
                break;
            case 1:
                uf2Var.finishFragment();
                break;
            default:
                uf2Var.e0();
                break;
        }
    }
}
