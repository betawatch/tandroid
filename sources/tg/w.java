package tg;

import android.content.DialogInterface;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ w(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                vg.r rVar = this.b.g0.r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    break;
                }
                break;
            default:
                vg.r rVar2 = this.b.g0.r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    break;
                }
                break;
        }
    }
}
