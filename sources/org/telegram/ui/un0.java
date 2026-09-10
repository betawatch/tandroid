package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class un0 implements OnCompleteListener, org.telegram.ui.ActionBar.c2, au {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo0 b;

    public /* synthetic */ un0(wo0 wo0Var, int i10) {
        this.a = i10;
        this.b = wo0Var;
    }

    @Override // org.telegram.ui.au
    public void a1(wt wtVar) {
        switch (this.a) {
            case 2:
                wo0 wo0Var = this.b;
                wo0Var.A0 = wtVar;
                wo0Var.f[4].setText(wtVar.a);
                break;
            default:
                wo0 wo0Var2 = this.b;
                wo0Var2.A0 = wtVar;
                wo0Var2.f[4].setText(wtVar.a);
                wo0Var2.B0 = wtVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                wo0 wo0Var = this.b;
                wo0Var.I0(wo0Var.R0[0]);
                break;
            case 2:
            default:
                wo0 wo0Var2 = this.b;
                wo0Var2.D0(true);
                wo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        wo0 wo0Var = this.b;
        wo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = wo0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
