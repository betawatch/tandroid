// default package

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y08 implements OnCompleteListener, ee, zy2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ y08(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override // zy2
    public final void g(wy2 wy2Var) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 2:
                pVar.B0 = wy2Var;
                pVar.f[4].setText(wy2Var.a);
                break;
            default:
                pVar.B0 = wy2Var;
                pVar.f[4].setText(wy2Var.a);
                pVar.C0 = wy2Var.d;
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (!task.isSuccessful()) {
            fc4.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = this.b.P;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 1:
                pVar.O0(pVar.S0[0]);
                break;
            case 2:
            default:
                pVar.J0(true);
                pVar.E0();
                break;
            case 3:
                pVar.G0(true);
                break;
        }
    }
}
