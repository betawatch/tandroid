package rh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ b2(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.c2.setLoading(false);
                break;
            default:
                this.b.c2.setLoading(false);
                break;
        }
    }
}
