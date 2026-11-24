// default package

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ph8 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PopupNotificationActivity b;

    public /* synthetic */ ph8(PopupNotificationActivity popupNotificationActivity, byte b) {
        this.a = b;
        this.b = popupNotificationActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        PopupNotificationActivity popupNotificationActivity = this.b;
        switch (b) {
            case 0:
                FrameLayout frameLayout = popupNotificationActivity.f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int D = wi8.D(48.0f, a.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), D, popupNotificationActivity.f.getPaddingRight(), D);
                break;
            default:
                popupNotificationActivity.n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity.c() && !popupNotificationActivity.Y) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity.n.getLayoutParams();
                    marginLayoutParams.topMargin = a.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = gm.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity.n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity.a(0);
                    break;
                }
                break;
        }
        return true;
    }
}
