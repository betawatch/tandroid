package zh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ u1(r3 r3Var, int i10) {
        this.a = i10;
        this.b = r3Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.k0.setLoading(false);
                break;
            default:
                this.b.k0.setLoading(false);
                break;
        }
    }
}
