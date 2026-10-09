package yh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ v1(s3 s3Var, int i10) {
        this.a = i10;
        this.b = s3Var;
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
