package yh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ y1(a4 a4Var, int i10) {
        this.a = i10;
        this.b = a4Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.j0.setLoading(false);
                break;
            default:
                this.b.j0.setLoading(false);
                break;
        }
    }
}
