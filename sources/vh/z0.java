package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.p71;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z0 extends p71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ u1 c;

    public z0(u1 u1Var, boolean z10, Context context) {
        this.c = u1Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.p71
    public final void b(View view, int i10, int i11) {
        h1 h1Var = (h1) view;
        if (this.a) {
            i10 = 1;
        }
        h1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.p71
    public final View d(int i10) {
        Context context = this.b;
        u1 u1Var = this.c;
        return i10 == 1 ? new g1(u1Var, context) : new l1(u1Var, context);
    }

    @Override // org.telegram.ui.Components.p71
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.p71
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
