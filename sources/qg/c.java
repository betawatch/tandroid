package qg;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import b8.mf;
import m2.t;
import mi.h0;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.w3;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.j5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ c(h hVar, int i3) {
        this.a = i3;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        h hVar = this.b;
        switch (i3) {
            case 0:
                d2 Q = LaunchActivity.Q();
                j5 j5Var = new j5(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof qt0) {
                    j5Var.j1 = (qt0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout e10 = k5.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (j5.k1 * 5.0f));
                int i10 = k6.n5;
                r6.V(textView, i10, null);
                q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                int i11 = 5;
                textView.setGravity((bd.a0 ? 3 : 5) | 48);
                e10.addView(textView, mf.d(-2, -1.0f, (bd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pm0 pm0Var = new pm0(parentActivity);
                pm0Var.setDelegate(new t(9, j5Var, textView));
                pm0Var.setReportChanges(true);
                e10.addView(pm0Var, mf.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + j5.m1);
                r6.V(textView2, i10, null);
                q.n(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setGravity((bd.a0 ? 3 : 5) | 48);
                e10.addView(textView2, mf.d(-2, -1.0f, (bd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pm0 pm0Var2 = new pm0(parentActivity);
                pm0Var2.setDelegate(new h0(8, j5Var, textView2));
                pm0Var2.setReportChanges(true);
                e10.addView(pm0Var2, mf.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                r6.V(textView3, i10, null);
                q.n(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setGravity((bd.a0 ? 3 : 5) | 48);
                e10.addView(textView3, mf.d(-2, -1.0f, (bd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pm0 pm0Var3 = new pm0(parentActivity);
                pm0Var3.setDelegate(new org.telegram.ui.f(j5Var, i11));
                pm0Var3.setReportChanges(true);
                e10.addView(pm0Var3, mf.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e10.addOnLayoutChangeListener(new w3(pm0Var, pm0Var3, pm0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e10);
                j5Var.O = scrollView;
                j5Var.show();
                hVar.c(false);
                break;
            case 1:
                hVar.getClass();
                az.K();
                Toast.makeText(hVar.getContext(), bd.M0(az.J0 ? 2131751619 : 2131751620, null), 0).show();
                break;
            case 2:
                ProfileActivity.V4((Activity) hVar.getContext(), false);
                break;
            default:
                hVar.n = true;
                try {
                    hVar.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
