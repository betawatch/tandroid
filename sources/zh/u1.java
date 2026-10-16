package zh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
