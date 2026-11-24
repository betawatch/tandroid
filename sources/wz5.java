// default package

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wz5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ LaunchActivity a;

    public wz5(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.d1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.d1);
    }
}
