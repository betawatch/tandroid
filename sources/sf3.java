// default package

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sf3 extends ane {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ gp4 b;

    public sf3(tf3 tf3Var, sf3 sf3Var) {
        this.b = tf3Var;
    }

    @Override // ane
    public final View b(int i) {
        byte b = this.a;
        gp4 gp4Var = this.b;
        switch (b) {
            case 0:
                Dialog dialog = ((tf3) gp4Var).w0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + gp4Var + " does not have a view");
        }
    }

    @Override // ane
    public final boolean c() {
        switch (this.a) {
            case 0:
                return ((tf3) this.b).A0;
            default:
                return false;
        }
    }

    public sf3(gp4 gp4Var) {
        this.b = gp4Var;
    }
}
