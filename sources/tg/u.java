package tg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ u(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                AndroidUtilities.addToClipboard(j0Var.t1());
                j0Var.dismiss();
                break;
            case 1:
                z zVar = this.b.E0;
                if (!zVar.r) {
                    zVar.v.performClick();
                    break;
                } else {
                    zVar.h.performClick();
                    break;
                }
            case 2:
                z zVar2 = this.b.E0;
                if (!zVar2.r) {
                    zVar2.v.performClick();
                    break;
                } else {
                    zVar2.h.performClick();
                    break;
                }
            default:
                j0.S(this.b);
                break;
        }
    }
}
