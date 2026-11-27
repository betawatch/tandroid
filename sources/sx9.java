// default package

import android.app.Activity;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class sx9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx9 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ id d;

    public /* synthetic */ sx9(wx9 wx9Var, Activity activity, id idVar, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = activity;
        this.d = idVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        id idVar = this.d;
        Activity activity = this.c;
        wx9 wx9Var = this.b;
        switch (b) {
            case 0:
                wx9Var.n = false;
                if (!activity.isFinishing()) {
                    try {
                        idVar.dismiss();
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                break;
            default:
                if (!activity.isFinishing()) {
                    wx9Var.n = false;
                    try {
                        idVar.dismiss();
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = ob6.M0(R.string.AppName, null);
                    id idVar2 = alertDialog$Builder.a;
                    idVar2.S = M0;
                    idVar2.U = ob6.M0(2131751715, null);
                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                    alertDialog$Builder.o().setCanceledOnTouchOutside(true);
                    break;
                }
                break;
        }
    }
}
