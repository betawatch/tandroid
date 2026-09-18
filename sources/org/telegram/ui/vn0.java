package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, zt {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo0 b;

    public /* synthetic */ vn0(xo0 xo0Var, int i10) {
        this.a = i10;
        this.b = xo0Var;
    }

    @Override // org.telegram.ui.zt
    public void a1(vt vtVar) {
        switch (this.a) {
            case 2:
                xo0 xo0Var = this.b;
                xo0Var.A0 = vtVar;
                xo0Var.f[4].setText(vtVar.a);
                break;
            default:
                xo0 xo0Var2 = this.b;
                xo0Var2.A0 = vtVar;
                xo0Var2.f[4].setText(vtVar.a);
                xo0Var2.B0 = vtVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                xo0 xo0Var = this.b;
                xo0Var.I0(xo0Var.R0[0]);
                break;
            case 2:
            default:
                xo0 xo0Var2 = this.b;
                xo0Var2.D0(true);
                xo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        xo0 xo0Var = this.b;
        xo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = xo0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
