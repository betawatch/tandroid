package zf;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import k7.b6;
import kh.a2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k5;
import org.telegram.ui.l5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ c(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p2 R = LaunchActivity.R();
                l5 l5Var = new l5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof qv0) {
                    l5Var.b = (qv0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout h = a2.h(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (l5.c * 5.0f));
                int i10 = j6.n5;
                org.telegram.ui.b.q(textView, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                h.addView(textView, b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ko0 ko0Var = new ko0(parentActivity);
                ko0Var.setDelegate(new k5(l5Var, textView, 0));
                ko0Var.setReportChanges(true);
                h.addView(ko0Var, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + l5.e);
                org.telegram.ui.b.q(textView2, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                h.addView(textView2, b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ko0 ko0Var2 = new ko0(parentActivity);
                ko0Var2.setDelegate(new k5(l5Var, textView2, 1));
                ko0Var2.setReportChanges(true);
                h.addView(ko0Var2, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                org.telegram.ui.b.q(textView3, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                h.addView(textView3, b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ko0 ko0Var3 = new ko0(parentActivity);
                ko0Var3.setDelegate(new org.telegram.ui.h(l5Var, 5));
                ko0Var3.setReportChanges(true);
                h.addView(ko0Var3, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                h.addOnLayoutChangeListener(new l4(ko0Var, ko0Var3, ko0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(h);
                l5Var.setCustomView(scrollView);
                l5Var.show();
                this.b.c(false);
                break;
            case 1:
                i iVar = this.b;
                iVar.getClass();
                SharedConfig.toggleDebugWebView();
                Toast.makeText(iVar.getContext(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                break;
            case 2:
                ProfileActivity.H4((Activity) this.b.getContext(), false);
                break;
            default:
                i iVar2 = this.b;
                iVar2.n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
