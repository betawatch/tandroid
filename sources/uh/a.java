package uh;

import android.view.View;
import org.telegram.ui.Components.uq0;
import th.q4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ a(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                uq0 uq0Var = iVar.W;
                q4 q4Var = iVar.a;
                uq0Var.a(q4Var == null ? "" : q4Var.E);
                break;
            default:
                i iVar2 = this.b;
                iVar2.W.b(iVar2.a.E);
                break;
        }
    }
}
