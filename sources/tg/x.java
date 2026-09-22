package tg;

import android.content.DialogInterface;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ x(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                vg.r rVar = this.b.g0.r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    break;
                }
                break;
            default:
                vg.r rVar2 = this.b.g0.r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    break;
                }
                break;
        }
    }
}
