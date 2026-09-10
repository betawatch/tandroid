package zh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gn0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l3 extends gn0 {
    public yg.q h;
    public final /* synthetic */ z3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(z3 z3Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = z3Var;
    }

    @Override // org.telegram.ui.Components.gn0
    public final void a(String str) {
        yg.q qVar = this.h;
        if (qVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qVar);
        }
        this.h = new yg.q(12, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            z3 z3Var = this.n;
            if (z3Var.Q) {
                return;
            }
            z3Var.Q = true;
            z3Var.w.E();
            z3Var.x.h1(0, -z3Var.r.getPaddingTop());
        }
    }
}
