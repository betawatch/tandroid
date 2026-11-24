// default package

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sn8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tn8 b;

    public /* synthetic */ sn8(tn8 tn8Var, byte b) {
        this.a = b;
        this.b = tn8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tn8 tn8Var = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = tn8Var.t0;
                fn8 fn8Var = profileActivity.T5;
                if (fn8Var != null) {
                    fn8Var.dismiss();
                    profileActivity.T5 = null;
                    break;
                }
                break;
            default:
                try {
                    o39 currentListView = tn8Var.n0.O.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
