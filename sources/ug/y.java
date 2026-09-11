package ug;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ y(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                wg.r rVar = this.b.g0.r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    break;
                }
                break;
            default:
                wg.r rVar2 = this.b.g0.r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    break;
                }
                break;
        }
    }
}
