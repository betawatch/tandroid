package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n20;
import r0.k1;
import r0.n;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements n20, n {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // r0.n
    public k1 P0(View view, k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        f fVar = this.a;
        fVar.processLegacyContainerInsets(g7);
        fVar.Y.a(k1Var.a.f(8).d > 0, true);
        return k1.b;
    }

    @Override // org.telegram.ui.Components.n20
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.a;
        if (fVar.l0 != min) {
            fVar.l0 = min;
            fVar.X.a(min);
            fVar.h0.postOnAnimation(new ti.g(fVar, 12));
        }
    }
}
