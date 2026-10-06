package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, yt {
    public final /* synthetic */ int a;
    public final /* synthetic */ so0 b;

    public /* synthetic */ qn0(so0 so0Var, int i10) {
        this.a = i10;
        this.b = so0Var;
    }

    @Override // org.telegram.ui.yt
    public void b1(ut utVar) {
        switch (this.a) {
            case 2:
                so0 so0Var = this.b;
                so0Var.A0 = utVar;
                so0Var.f[4].setText(utVar.a);
                break;
            default:
                so0 so0Var2 = this.b;
                so0Var2.A0 = utVar;
                so0Var2.f[4].setText(utVar.a);
                so0Var2.B0 = utVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                so0 so0Var = this.b;
                so0Var.I0(so0Var.R0[0]);
                break;
            case 2:
            default:
                so0 so0Var2 = this.b;
                so0Var2.D0(true);
                so0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        so0 so0Var = this.b;
        so0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = so0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
