// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class vo implements OnBackInvokedCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((cp) obj).r();
                break;
            case 1:
                ((sr4) obj).invoke();
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                Activity activity = photoViewer.E;
                if (!(activity instanceof LaunchActivity)) {
                    if (photoViewer.V0()) {
                        photoViewer.A(true, false);
                        break;
                    }
                } else {
                    ((LaunchActivity) activity).onBackPressed();
                    break;
                }
                break;
            case 3:
                ((rbb) obj).K();
                break;
            case 4:
                lcb lcbVar = (lcb) obj;
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null) {
                    lcbVar.p();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 5:
                ((Runnable) obj).run();
                break;
            default:
                ((xjc) obj).run();
                break;
        }
    }
}
