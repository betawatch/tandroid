// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class up implements OnBackInvokedCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ up(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((bq) obj).r();
                break;
            case 1:
                ((pr4) obj).invoke();
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
                ((v9b) obj).K();
                break;
            case 4:
                oab oabVar = (oab) obj;
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null) {
                    oabVar.p();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 5:
                ((Runnable) obj).run();
                break;
            default:
                ((thc) obj).run();
                break;
        }
    }
}
