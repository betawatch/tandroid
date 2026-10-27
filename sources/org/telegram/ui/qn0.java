package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, pt {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro0 b;

    public /* synthetic */ qn0(ro0 ro0Var, int i10) {
        this.a = i10;
        this.b = ro0Var;
    }

    @Override // org.telegram.ui.pt
    public void Y0(lt ltVar) {
        switch (this.a) {
            case 2:
                ro0 ro0Var = this.b;
                ro0Var.A0 = ltVar;
                ro0Var.f[4].setText(ltVar.a);
                break;
            default:
                ro0 ro0Var2 = this.b;
                ro0Var2.A0 = ltVar;
                ro0Var2.f[4].setText(ltVar.a);
                ro0Var2.B0 = ltVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                ro0 ro0Var = this.b;
                ro0Var.J0(ro0Var.R0[0]);
                break;
            case 2:
            default:
                ro0 ro0Var2 = this.b;
                ro0Var2.E0(true);
                ro0Var2.A0();
                break;
            case 3:
                this.b.B0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ro0 ro0Var = this.b;
        ro0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = ro0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
