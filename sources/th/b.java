package th;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d20;
import r0.l1;
import r0.n;
import rg.q1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements d20, n {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        f fVar = this.a;
        fVar.processLegacyContainerInsets(g10);
        fVar.Y.a(l1Var.a.f(8).d > 0, true);
        return l1.b;
    }

    @Override // org.telegram.ui.Components.d20
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.a;
        if (fVar.l0 != min) {
            fVar.l0 = min;
            fVar.X.a(min);
            fVar.h0.postOnAnimation(new q1(fVar, 10));
        }
    }
}
