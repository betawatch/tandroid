package rg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
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
                AndroidUtilities.addToClipboard(j0Var.p1());
                j0Var.dismiss();
                break;
            case 1:
                z zVar = this.b.E0;
                if (!zVar.h) {
                    zVar.r.performClick();
                    break;
                } else {
                    zVar.e.performClick();
                    break;
                }
            case 2:
                z zVar2 = this.b.E0;
                if (!zVar2.h) {
                    zVar2.r.performClick();
                    break;
                } else {
                    zVar2.e.performClick();
                    break;
                }
            default:
                j0.S(this.b);
                break;
        }
    }
}
