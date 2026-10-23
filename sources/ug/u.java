package ug;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ u(y yVar, int i10) {
        this.a = i10;
        this.b = yVar;
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
