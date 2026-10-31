package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl0 implements OnCompleteListener, org.telegram.ui.ActionBar.u1, qt {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm0 b;

    public /* synthetic */ sl0(sm0 sm0Var, int i10) {
        this.a = i10;
        this.b = sm0Var;
    }

    @Override // org.telegram.ui.qt
    public void c(nt ntVar) {
        switch (this.a) {
            case 2:
                sm0 sm0Var = this.b;
                sm0Var.A0 = ntVar;
                sm0Var.f[4].setText(ntVar.a);
                break;
            default:
                sm0 sm0Var2 = this.b;
                sm0Var2.A0 = ntVar;
                sm0Var2.f[4].setText(ntVar.a);
                sm0Var2.B0 = ntVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                sm0 sm0Var = this.b;
                sm0Var.N0(sm0Var.R0[0]);
                break;
            case 2:
            default:
                sm0 sm0Var2 = this.b;
                sm0Var2.I0(true);
                sm0Var2.E0();
                break;
            case 3:
                this.b.F0(true);
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
