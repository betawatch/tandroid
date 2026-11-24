// default package

import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he b;

    public /* synthetic */ td(he heVar, byte b) {
        this.a = b;
        this.b = heVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        he heVar = this.b;
        switch (b) {
            case 0:
                heVar.dismiss();
                break;
            case 1:
                if (!heVar.isShowing()) {
                    try {
                        heVar.show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                try {
                    heVar.dismiss();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 3:
                heVar.dismiss();
                break;
            case 4:
                heVar.dismiss();
                break;
            case 5:
                String[] strArr = MediaController.W1;
                try {
                    heVar.dismiss();
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            default:
                heVar.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    u31 Q = c41.b0(S).Q(R.raw.error, 36, jb6.M0(2131748309, null));
                    Q.u = true;
                    Q.j();
                    break;
                }
                break;
        }
    }
}
