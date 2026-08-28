package uf;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import g7.e6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;
import org.telegram.ui.i5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ c(h hVar, int i9) {
        this.a = i9;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o2 R = LaunchActivity.R();
                i5 i5Var = new i5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof xu0) {
                    i5Var.b = (xu0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f10 = l0.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (i5.c * 5.0f));
                int i9 = f6.n5;
                ll.s(textView, f6.w0(null, i9, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f10.addView(textView, e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pn0 pn0Var = new pn0(parentActivity);
                pn0Var.setDelegate(new h5(i5Var, textView, 0));
                pn0Var.setReportChanges(true);
                f10.addView(pn0Var, e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + i5.e);
                ll.s(textView2, f6.w0(null, i9, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f10.addView(textView2, e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pn0 pn0Var2 = new pn0(parentActivity);
                pn0Var2.setDelegate(new h5(i5Var, textView2, 1));
                pn0Var2.setReportChanges(true);
                f10.addView(pn0Var2, e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                ll.s(textView3, f6.w0(null, i9, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f10.addView(textView3, e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pn0 pn0Var3 = new pn0(parentActivity);
                pn0Var3.setDelegate(new org.telegram.ui.g(i5Var, 5));
                pn0Var3.setReportChanges(true);
                f10.addView(pn0Var3, e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f10.addOnLayoutChangeListener(new i4(pn0Var, pn0Var3, pn0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f10);
                i5Var.setCustomView(scrollView);
                i5Var.show();
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
