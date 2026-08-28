package zf;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ u(j0 j0Var, int i9) {
        this.a = i9;
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
                y yVar = this.b.A0;
                if (!yVar.h) {
                    yVar.r.performClick();
                    break;
                } else {
                    yVar.e.performClick();
                    break;
                }
            case 2:
                y yVar2 = this.b.A0;
                if (!yVar2.h) {
                    yVar2.r.performClick();
                    break;
                } else {
                    yVar2.e.performClick();
                    break;
                }
            default:
                j0.R(this.b);
                break;
        }
    }
}
