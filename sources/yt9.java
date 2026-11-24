// default package

import android.app.Activity;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yt9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu9 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ hd d;

    public /* synthetic */ yt9(bu9 bu9Var, Activity activity, hd hdVar, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = activity;
        this.d = hdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hd hdVar = this.d;
        Activity activity = this.c;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                bu9Var.n = false;
                if (!activity.isFinishing()) {
                    try {
                        hdVar.dismiss();
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                break;
            default:
                if (!activity.isFinishing()) {
                    bu9Var.n = false;
                    try {
                        hdVar.dismiss();
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = k96.M0(R.string.AppName, null);
                    hd hdVar2 = alertDialog$Builder.a;
                    hdVar2.S = M0;
                    hdVar2.U = k96.M0(2131751738, null);
                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                    alertDialog$Builder.o().setCanceledOnTouchOutside(true);
                    break;
                }
                break;
        }
    }
}
