package ph;

import android.view.View;
import oh.d6;
import org.telegram.ui.Components.or0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ c(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                or0 or0Var = lVar.T;
                d6 d6Var = lVar.a;
                or0Var.a(d6Var == null ? "" : d6Var.E);
                break;
            default:
                l lVar2 = this.b;
                lVar2.T.b(lVar2.a.E);
                break;
        }
    }
}
