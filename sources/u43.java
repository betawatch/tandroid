// default package

import android.database.DataSetObserver;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u43 extends DataSetObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u43(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gfb gfbVar = (gfb) obj;
                gfbVar.a = true;
                gfbVar.notifyDataSetChanged();
                break;
            case 1:
                s76 s76Var = (s76) obj;
                if (s76Var.P.isShowing()) {
                    s76Var.g();
                    break;
                }
                break;
            case 2:
                yr8 yr8Var = (yr8) obj;
                ProfileActivity profileActivity = yr8Var.n;
                int realCount = profileActivity.o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = (byte) 1;
                }
                yr8Var.a(false);
                yr8Var.b(1.0f);
                if (profileActivity.r0 != null) {
                    if (!profileActivity.T0.y()) {
                        yr8Var.c();
                        break;
                    } else {
                        hl.d3(new uk8(yr8Var, (byte) 10), 500L);
                        break;
                    }
                }
                break;
            default:
                ((fic) obj).f();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gfb gfbVar = (gfb) obj;
                gfbVar.a = false;
                gfbVar.notifyDataSetInvalidated();
                break;
            case 1:
                ((s76) obj).dismiss();
                break;
            case 2:
            default:
                super.onInvalidated();
                break;
            case 3:
                ((fic) obj).f();
                break;
        }
    }
}
