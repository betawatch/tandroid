// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p81 extends FragmentContextView {
    public final /* synthetic */ byte X0 = 1;
    public final /* synthetic */ d Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p81(qvb qvbVar, Context context, qvb qvbVar2) {
        super(context, qvbVar2, null, false, null);
        this.Y0 = qvbVar;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        byte b = this.X0;
        d dVar = this.Y0;
        switch (b) {
            case 0:
                z81 z81Var = (z81) dVar;
                z81Var.I.j(z81Var.J, i == 0, true);
                break;
            default:
                qvb qvbVar = (qvb) dVar;
                qvbVar.V0.j(qvbVar.G0, i == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p81(z81 z81Var, Context context, z81 z81Var2, n81 n81Var, wjb wjbVar) {
        super(context, z81Var2, n81Var, false, wjbVar);
        this.Y0 = z81Var;
    }
}
