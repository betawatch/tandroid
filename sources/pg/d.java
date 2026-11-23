package pg;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import c8.na;
import j6.k;
import jb.m;
import org.telegram.messenger.bz;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.z3;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ d(i iVar, int i7) {
        this.a = i7;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        i iVar = this.b;
        switch (i7) {
            case 0:
                g2 Q = LaunchActivity.Q();
                h5 h5Var = new h5(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof cu0) {
                    h5Var.m1 = (cu0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout f10 = f3.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (h5.n1 * 5.0f));
                int i10 = n6.n5;
                u6.U(textView, i10, null);
                m10.q(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                int i11 = 5;
                textView.setGravity((gd.a0 ? 3 : 5) | 48);
                f10.addView(textView, na.d(-2, -1.0f, (gd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                an0 an0Var = new an0(parentActivity);
                an0Var.setDelegate(new m(h5Var, textView, false, 13));
                an0Var.setReportChanges(true);
                f10.addView(an0Var, na.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + h5.p1);
                u6.U(textView2, i10, null);
                m10.q(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setGravity((gd.a0 ? 3 : 5) | 48);
                f10.addView(textView2, na.d(-2, -1.0f, (gd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                an0 an0Var2 = new an0(parentActivity);
                an0Var2.setDelegate(new k(13, h5Var, textView2));
                an0Var2.setReportChanges(true);
                f10.addView(an0Var2, na.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                u6.U(textView3, i10, null);
                m10.q(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setGravity((gd.a0 ? 3 : 5) | 48);
                f10.addView(textView3, na.d(-2, -1.0f, (gd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                an0 an0Var3 = new an0(parentActivity);
                an0Var3.setDelegate(new org.telegram.ui.f(h5Var, i11));
                an0Var3.setReportChanges(true);
                f10.addView(an0Var3, na.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f10.addOnLayoutChangeListener(new z3(an0Var, an0Var3, an0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f10);
                h5Var.O = scrollView;
                h5Var.show();
                iVar.c(false);
                break;
            case 1:
                iVar.getClass();
                bz.K();
                Toast.makeText(iVar.getContext(), gd.N0(bz.J0 ? 2131751606 : 2131751607, null), 0).show();
                break;
            case 2:
                ProfileActivity.Y4((Activity) iVar.getContext(), false);
                break;
            default:
                iVar.n = true;
                try {
                    iVar.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
