package ph;

import android.content.DialogInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ t8(da daVar, int i10) {
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
