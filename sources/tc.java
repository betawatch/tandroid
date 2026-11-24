// default package

import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd b;

    public /* synthetic */ tc(hd hdVar, byte b) {
        this.a = b;
        this.b = hdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hd hdVar = this.b;
        switch (b) {
            case 0:
                hdVar.dismiss();
                break;
            case 1:
                if (!hdVar.isShowing()) {
                    try {
                        hdVar.show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                try {
                    hdVar.dismiss();
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                hdVar.dismiss();
                break;
            case 4:
                hdVar.dismiss();
                break;
            case 5:
                String[] strArr = MediaController.W1;
                try {
                    hdVar.dismiss();
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            default:
                hdVar.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    m21 Q = u21.b0(S).Q(R.raw.error, 36, k96.M0(2131748360, null));
                    Q.t = true;
                    Q.j();
                    break;
                }
                break;
        }
    }
}
