package qh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ r8(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ba baVar = this.b;
                baVar.U0.x(3, false);
                baVar.n0 = null;
                break;
            default:
                p9 p9Var = this.b.U0;
                if (p9Var != null) {
                    p9Var.x(4, false);
                    break;
                }
                break;
        }
    }
}
