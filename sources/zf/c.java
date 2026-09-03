package zf;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import k7.b6;
import kf.k0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m5;
import org.telegram.ui.n5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ c(h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p2 R = LaunchActivity.R();
                n5 n5Var = new n5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof qv0) {
                    n5Var.b = (qv0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout h = k0.h(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (n5.c * 5.0f));
                int i10 = j6.n5;
                org.telegram.ui.b.q(textView, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                h.addView(textView, b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                jo0 jo0Var = new jo0(parentActivity);
                jo0Var.setDelegate(new m5(n5Var, textView, 0));
                jo0Var.setReportChanges(true);
                h.addView(jo0Var, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + n5.e);
                org.telegram.ui.b.q(textView2, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                h.addView(textView2, b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                jo0 jo0Var2 = new jo0(parentActivity);
                jo0Var2.setDelegate(new m5(n5Var, textView2, 1));
                jo0Var2.setReportChanges(true);
                h.addView(jo0Var2, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                org.telegram.ui.b.q(textView3, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                h.addView(textView3, b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                jo0 jo0Var3 = new jo0(parentActivity);
                jo0Var3.setDelegate(new org.telegram.ui.h(n5Var, 5));
                jo0Var3.setReportChanges(true);
                h.addView(jo0Var3, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                h.addOnLayoutChangeListener(new l4(jo0Var, jo0Var3, jo0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(h);
                n5Var.setCustomView(scrollView);
                n5Var.show();
                this.b.c(false);
                break;
            case 1:
                h hVar = this.b;
                hVar.getClass();
                SharedConfig.toggleDebugWebView();
                Toast.makeText(hVar.getContext(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                break;
            case 2:
                ProfileActivity.H4((Activity) this.b.getContext(), false);
                break;
            default:
                h hVar2 = this.b;
                hVar2.n = true;
                try {
                    hVar2.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
