// default package

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ye3 extends iie {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ bn4 b;

    public ye3(ze3 ze3Var, ye3 ye3Var) {
        this.b = ze3Var;
    }

    @Override // iie
    public final View b(int i) {
        byte b = this.a;
        bn4 bn4Var = this.b;
        switch (b) {
            case 0:
                Dialog dialog = ((ze3) bn4Var).w0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + bn4Var + " does not have a view");
        }
    }

    @Override // iie
    public final boolean c() {
        switch (this.a) {
            case 0:
                return ((ze3) this.b).A0;
            default:
                return false;
        }
    }

    public ye3(bn4 bn4Var) {
        this.b = bn4Var;
    }
}
