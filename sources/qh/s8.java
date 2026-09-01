package qh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ s8(ca caVar, int i10) {
        this.a = i10;
        this.b = caVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ca caVar = this.b;
                caVar.U0.x(3, false);
                caVar.n0 = null;
                break;
            default:
                q9 q9Var = this.b.U0;
                if (q9Var != null) {
                    q9Var.x(4, false);
                    break;
                }
                break;
        }
    }
}
