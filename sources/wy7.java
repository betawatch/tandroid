// default package

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wy7 implements OnCompleteListener, ed, px2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ wy7(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (!task.isSuccessful()) {
            fa4.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = this.b.P;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 1:
                pVar.N0(pVar.S0[0]);
                break;
            case 2:
            default:
                pVar.I0(true);
                pVar.D0();
                break;
            case 3:
                pVar.F0(true);
                break;
        }
    }

    @Override // px2
    public final void z(mx2 mx2Var) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 2:
                pVar.B0 = mx2Var;
                pVar.f[4].setText(mx2Var.a);
                break;
            default:
                pVar.B0 = mx2Var;
                pVar.f[4].setText(mx2Var.a);
                pVar.C0 = mx2Var.d;
                break;
        }
    }
}
