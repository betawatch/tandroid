// default package

import android.content.Context;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class y81 extends FragmentContextView {
    public final /* synthetic */ byte X0 = 0;
    public final /* synthetic */ e Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(tzb tzbVar, Context context, tzb tzbVar2) {
        super(context, tzbVar2, null, false, null);
        this.Y0 = tzbVar;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        byte b = this.X0;
        e eVar = this.Y0;
        switch (b) {
            case 0:
                i91 i91Var = (i91) eVar;
                i91Var.I.j(i91Var.J, i == 0, true);
                break;
            default:
                tzb tzbVar = (tzb) eVar;
                tzbVar.V0.j(tzbVar.G0, i == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(i91 i91Var, Context context, i91 i91Var2, w81 w81Var, vnb vnbVar) {
        super(context, i91Var2, w81Var, false, vnbVar);
        this.Y0 = i91Var;
    }
}
