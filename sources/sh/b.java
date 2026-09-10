package sh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l20;
import qg.q0;
import r0.l1;
import r0.n;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l20, n {
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

    @Override // org.telegram.ui.Components.l20
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.a;
        if (fVar.l0 != min) {
            fVar.l0 = min;
            fVar.X.a(min);
            fVar.h0.postOnAnimation(new q0(fVar, 16));
        }
    }
}
