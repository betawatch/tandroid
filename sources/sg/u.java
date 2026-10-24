package sg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
