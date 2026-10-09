package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, yt {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo0 b;

    public /* synthetic */ tn0(vo0 vo0Var, int i10) {
        this.a = i10;
        this.b = vo0Var;
    }

    @Override // org.telegram.ui.yt
    public void U0(ut utVar) {
        switch (this.a) {
            case 2:
                vo0 vo0Var = this.b;
                vo0Var.A0 = utVar;
                vo0Var.f[4].setText(utVar.a);
                break;
            default:
                vo0 vo0Var2 = this.b;
                vo0Var2.A0 = utVar;
                vo0Var2.f[4].setText(utVar.a);
                vo0Var2.B0 = utVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                vo0 vo0Var = this.b;
                vo0Var.I0(vo0Var.R0[0]);
                break;
            case 2:
            default:
                vo0 vo0Var2 = this.b;
                vo0Var2.D0(true);
                vo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        vo0 vo0Var = this.b;
        vo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = vo0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
