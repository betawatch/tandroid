package ug;

import android.content.DialogInterface;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ x(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                wg.r rVar = this.b.g0.r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    break;
                }
                break;
            default:
                wg.r rVar2 = this.b.g0.r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    break;
                }
                break;
        }
    }
}
