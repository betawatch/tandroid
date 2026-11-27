// default package

import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id b;

    public /* synthetic */ uc(id idVar, byte b) {
        this.a = b;
        this.b = idVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        id idVar = this.b;
        switch (b) {
            case 0:
                idVar.dismiss();
                break;
            case 1:
                if (!idVar.isShowing()) {
                    try {
                        idVar.show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                try {
                    idVar.dismiss();
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 3:
                idVar.dismiss();
                break;
            case 4:
                idVar.dismiss();
                break;
            case 5:
                String[] strArr = MediaController.W1;
                try {
                    idVar.dismiss();
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            default:
                idVar.dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    v21 Q = d31.b0(S).Q(R.raw.error, 36, ob6.M0(2131748306, null));
                    Q.u = true;
                    Q.j();
                    break;
                }
                break;
        }
    }
}
