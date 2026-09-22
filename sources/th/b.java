package th;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c20;
import r0.l1;
import r0.n;
import rg.q1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements c20, n {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // r0.n
    public l1 P0(View view, l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        f fVar = this.a;
        fVar.processLegacyContainerInsets(g10);
        fVar.Y.a(l1Var.a.f(8).d > 0, true);
        return l1.b;
    }

    @Override // org.telegram.ui.Components.c20
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
