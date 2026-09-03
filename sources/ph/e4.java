package ph;

import android.content.DialogInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ e4(c5 c5Var, int i10) {
        this.a = i10;
        this.b = c5Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.z0(false);
                break;
            default:
                this.b.z0(false);
                break;
        }
    }
}
