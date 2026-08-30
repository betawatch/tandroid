package ph;

import android.content.DialogInterface;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ u8(da daVar, int i10) {
        this.a = i10;
        this.b = daVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                da daVar = this.b;
                daVar.U0.x(3, false);
                daVar.n0 = null;
                break;
            default:
                s9 s9Var = this.b.U0;
                if (s9Var != null) {
                    s9Var.x(4, false);
                    break;
                }
                break;
        }
    }
}
