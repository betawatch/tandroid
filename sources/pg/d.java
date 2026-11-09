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
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.y3;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                if (Q.getFragmentView() instanceof tt0) {
                    h5Var.i1 = (tt0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout e10 = k5.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (h5.j1 * 5.0f));
                int i10 = l6.n5;
                s6.U(textView, i10, null);
                q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                int i11 = 5;
                textView.setGravity((id.a0 ? 3 : 5) | 48);
                e10.addView(textView, ha.d(-2, -1.0f, (id.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                nm0 nm0Var = new nm0(parentActivity);
                nm0Var.setDelegate(new d0(h5Var, textView, false));
                nm0Var.setReportChanges(true);
                e10.addView(nm0Var, ha.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + h5.l1);
                s6.U(textView2, i10, null);
                q.n(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setGravity((id.a0 ? 3 : 5) | 48);
                e10.addView(textView2, ha.d(-2, -1.0f, (id.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                nm0 nm0Var2 = new nm0(parentActivity);
                nm0Var2.setDelegate(new n(14, h5Var, textView2));
                nm0Var2.setReportChanges(true);
                e10.addView(nm0Var2, ha.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                s6.U(textView3, i10, null);
                q.n(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setGravity((id.a0 ? 3 : 5) | 48);
                e10.addView(textView3, ha.d(-2, -1.0f, (id.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                nm0 nm0Var3 = new nm0(parentActivity);
                nm0Var3.setDelegate(new org.telegram.ui.f(h5Var, i11));
                nm0Var3.setReportChanges(true);
                e10.addView(nm0Var3, ha.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e10.addOnLayoutChangeListener(new y3(nm0Var, nm0Var3, nm0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e10);
                h5Var.N = scrollView;
                h5Var.show();
                jVar.c(false);
                break;
            case 1:
                jVar.getClass();
                iz.K();
                Toast.makeText(jVar.getContext(), id.M0(iz.J0 ? 2131751618 : 2131751619, null), 0).show();
                break;
            case 2:
                ProfileActivity.Y4((Activity) jVar.getContext(), false);
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
