package yh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ z1(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
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
