package pg;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import c8.ja;
import ji.j;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.w3;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                e2 Q = LaunchActivity.Q();
                h5 h5Var = new h5(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof st0) {
                    h5Var.m1 = (st0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout e10 = k5.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (h5.n1 * 5.0f));
                int i10 = j6.n5;
                q6.U(textView, i10, null);
                i20.p(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                int i11 = 5;
                textView.setGravity((hd.a0 ? 3 : 5) | 48);
                e10.addView(textView, ja.d(-2, -1.0f, (hd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                qm0 qm0Var = new qm0(parentActivity);
                qm0Var.setDelegate(new k8.a(12, h5Var, textView));
                qm0Var.setReportChanges(true);
                e10.addView(qm0Var, ja.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + h5.p1);
                q6.U(textView2, i10, null);
                i20.p(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setGravity((hd.a0 ? 3 : 5) | 48);
                e10.addView(textView2, ja.d(-2, -1.0f, (hd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                qm0 qm0Var2 = new qm0(parentActivity);
                qm0Var2.setDelegate(new j(h5Var, textView2, false, 12));
                qm0Var2.setReportChanges(true);
                e10.addView(qm0Var2, ja.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                q6.U(textView3, i10, null);
                i20.p(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setGravity((hd.a0 ? 3 : 5) | 48);
                e10.addView(textView3, ja.d(-2, -1.0f, (hd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                qm0 qm0Var3 = new qm0(parentActivity);
                qm0Var3.setDelegate(new org.telegram.ui.f(h5Var, i11));
                qm0Var3.setReportChanges(true);
                e10.addView(qm0Var3, ja.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e10.addOnLayoutChangeListener(new w3(qm0Var, qm0Var3, qm0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e10);
                h5Var.O = scrollView;
                h5Var.show();
                iVar.c(false);
                break;
            case 1:
                iVar.getClass();
                gz.K();
                Toast.makeText(iVar.getContext(), hd.M0(gz.J0 ? 2131751618 : 2131751619, null), 0).show();
                break;
            case 2:
                ProfileActivity.X4((Activity) iVar.getContext(), false);
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
