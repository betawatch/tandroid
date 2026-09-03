package ph;

import android.view.View;
import oh.d6;
import org.telegram.ui.Components.nr0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                nr0 nr0Var = lVar.T;
                d6 d6Var = lVar.a;
                nr0Var.a(d6Var == null ? "" : d6Var.E);
                break;
            default:
                l lVar2 = this.b;
                lVar2.T.b(lVar2.a.E);
                break;
        }
    }
}
