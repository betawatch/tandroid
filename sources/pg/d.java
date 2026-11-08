package pg;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import c8.ha;
import j2.n;
import m4.d0;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y3;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i7) {
        this.a = i7;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        j jVar = this.b;
        switch (i7) {
            case 0:
                f2 Q = LaunchActivity.Q();
                h5 h5Var = new h5(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof rt0) {
                    h5Var.i1 = (rt0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout e10 = k5.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (h5.j1 * 5.0f));
                int i10 = k6.n5;
                r6.V(textView, i10, null);
                q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                int i11 = 5;
                textView.setGravity((id.a0 ? 3 : 5) | 48);
                e10.addView(textView, ha.d(-2, -1.0f, (id.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                mm0 mm0Var = new mm0(parentActivity);
                mm0Var.setDelegate(new d0(h5Var, textView, false));
                mm0Var.setReportChanges(true);
                e10.addView(mm0Var, ha.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + h5.l1);
                r6.V(textView2, i10, null);
                q.n(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setGravity((id.a0 ? 3 : 5) | 48);
                e10.addView(textView2, ha.d(-2, -1.0f, (id.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                mm0 mm0Var2 = new mm0(parentActivity);
                mm0Var2.setDelegate(new n(14, h5Var, textView2));
                mm0Var2.setReportChanges(true);
                e10.addView(mm0Var2, ha.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                r6.V(textView3, i10, null);
                q.n(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setGravity((id.a0 ? 3 : 5) | 48);
                e10.addView(textView3, ha.d(-2, -1.0f, (id.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                mm0 mm0Var3 = new mm0(parentActivity);
                mm0Var3.setDelegate(new org.telegram.ui.f(h5Var, i11));
                mm0Var3.setReportChanges(true);
                e10.addView(mm0Var3, ha.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e10.addOnLayoutChangeListener(new y3(mm0Var, mm0Var3, mm0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e10);
                h5Var.N = scrollView;
                h5Var.show();
                jVar.c(false);
                break;
            case 1:
                jVar.getClass();
                iz.K();
                Toast.makeText(jVar.getContext(), id.M0(iz.J0 ? 2131751619 : 2131751620, null), 0).show();
                break;
            case 2:
                ProfileActivity.V4((Activity) jVar.getContext(), false);
                break;
            default:
                jVar.n = true;
                try {
                    jVar.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
