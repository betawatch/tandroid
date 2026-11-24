// default package

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tp8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ up8 b;

    public /* synthetic */ tp8(up8 up8Var, byte b) {
        this.a = b;
        this.b = up8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        up8 up8Var = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = up8Var.t0;
                gp8 gp8Var = profileActivity.Y5;
                if (gp8Var != null) {
                    gp8Var.dismiss();
                    profileActivity.Y5 = null;
                    break;
                }
                break;
            default:
                try {
                    r59 currentListView = up8Var.n0.O.getCurrentListView();
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
