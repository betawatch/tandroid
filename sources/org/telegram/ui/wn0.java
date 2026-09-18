package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, bu {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;

    public /* synthetic */ wn0(yo0 yo0Var, int i10) {
        this.a = i10;
        this.b = yo0Var;
    }

    @Override // org.telegram.ui.bu
    public void a1(xt xtVar) {
        switch (this.a) {
            case 2:
                yo0 yo0Var = this.b;
                yo0Var.A0 = xtVar;
                yo0Var.f[4].setText(xtVar.a);
                break;
            default:
                yo0 yo0Var2 = this.b;
                yo0Var2.A0 = xtVar;
                yo0Var2.f[4].setText(xtVar.a);
                yo0Var2.B0 = xtVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                yo0 yo0Var = this.b;
                yo0Var.I0(yo0Var.R0[0]);
                break;
            case 2:
            default:
                yo0 yo0Var2 = this.b;
                yo0Var2.D0(true);
                yo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        yo0 yo0Var = this.b;
        yo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = yo0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
