package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ql0 implements OnCompleteListener, org.telegram.ui.ActionBar.u1, pt {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm0 b;

    public /* synthetic */ ql0(qm0 qm0Var, int i10) {
        this.a = i10;
        this.b = qm0Var;
    }

    @Override // org.telegram.ui.pt
    public void c(mt mtVar) {
        switch (this.a) {
            case 2:
                qm0 qm0Var = this.b;
                qm0Var.A0 = mtVar;
                qm0Var.f[4].setText(mtVar.a);
                break;
            default:
                qm0 qm0Var2 = this.b;
                qm0Var2.A0 = mtVar;
                qm0Var2.f[4].setText(mtVar.a);
                qm0Var2.B0 = mtVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                qm0 qm0Var = this.b;
                qm0Var.O0(qm0Var.R0[0]);
                break;
            case 2:
            default:
                qm0 qm0Var2 = this.b;
                qm0Var2.J0(true);
                qm0Var2.F0();
                break;
            case 3:
                this.b.G0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        if (!task.isSuccessful()) {
            org.telegram.messenger.f8.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = this.b.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
