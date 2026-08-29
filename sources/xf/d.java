package xf;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import i7.f6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i5;
import org.telegram.ui.j5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o2 R = LaunchActivity.R();
                j5 j5Var = new j5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof hv0) {
                    j5Var.b = (hv0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f9 = x3.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (j5.c * 5.0f));
                int i10 = g6.n5;
                org.telegram.ui.b.r(textView, g6.w0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f9.addView(textView, f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ao0 ao0Var = new ao0(parentActivity);
                ao0Var.setDelegate(new i5(j5Var, textView, 0));
                ao0Var.setReportChanges(true);
                f9.addView(ao0Var, f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + j5.e);
                org.telegram.ui.b.r(textView2, g6.w0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f9.addView(textView2, f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ao0 ao0Var2 = new ao0(parentActivity);
                ao0Var2.setDelegate(new i5(j5Var, textView2, 1));
                ao0Var2.setReportChanges(true);
                f9.addView(ao0Var2, f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                org.telegram.ui.b.r(textView3, g6.w0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f9.addView(textView3, f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ao0 ao0Var3 = new ao0(parentActivity);
                ao0Var3.setDelegate(new org.telegram.ui.h(j5Var, 5));
                ao0Var3.setReportChanges(true);
                f9.addView(ao0Var3, f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f9.addOnLayoutChangeListener(new i4(ao0Var, ao0Var3, ao0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f9);
                j5Var.setCustomView(scrollView);
                j5Var.show();
                this.b.c(false);
                break;
            case 1:
                j jVar = this.b;
                jVar.getClass();
                SharedConfig.toggleDebugWebView();
                Toast.makeText(jVar.getContext(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                break;
            case 2:
                ProfileActivity.H4((Activity) this.b.getContext(), false);
                break;
            default:
                j jVar2 = this.b;
                jVar2.n = true;
                try {
                    jVar2.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
