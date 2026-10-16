package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yn0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, eu {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ yn0(ap0 ap0Var, int i10) {
        this.a = i10;
        this.b = ap0Var;
    }

    @Override // org.telegram.ui.eu
    public void Z0(au auVar) {
        switch (this.a) {
            case 2:
                ap0 ap0Var = this.b;
                ap0Var.A0 = auVar;
                ap0Var.f[4].setText(auVar.a);
                break;
            default:
                ap0 ap0Var2 = this.b;
                ap0Var2.A0 = auVar;
                ap0Var2.f[4].setText(auVar.a);
                ap0Var2.B0 = auVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                ap0 ap0Var = this.b;
                ap0Var.I0(ap0Var.R0[0]);
                break;
            case 2:
            default:
                ap0 ap0Var2 = this.b;
                ap0Var2.D0(true);
                ap0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ap0 ap0Var = this.b;
        ap0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = ap0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
