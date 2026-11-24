// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class uo implements OnBackInvokedCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((bp) obj).r();
                break;
            case 1:
                ((op4) obj).invoke();
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.f9;
                Activity activity = photoViewer.E;
                if (!(activity instanceof LaunchActivity)) {
                    if (photoViewer.U0()) {
                        photoViewer.B(true, false);
                        break;
                    }
                } else {
                    ((LaunchActivity) activity).onBackPressed();
                    break;
                }
                break;
            case 3:
                ((t7b) obj).K();
                break;
            case 4:
                m8b m8bVar = (m8b) obj;
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null) {
                    m8bVar.q();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 5:
                ((Runnable) obj).run();
                break;
            default:
                ((sfc) obj).run();
                break;
        }
    }
}
