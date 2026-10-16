package uh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p20;
import r0.l1;
import r0.n;
import ri.h0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p20, n {
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

    @Override // org.telegram.ui.Components.p20
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.a;
        if (fVar.l0 != min) {
            fVar.l0 = min;
            fVar.X.a(min);
            fVar.h0.postOnAnimation(new h0(fVar, 19));
        }
    }
}
