package qh;

import android.view.View;
import org.telegram.ui.Components.q71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class a0 extends q71 {
    public final /* synthetic */ i0 a;

    public a0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        ((f0) view).getClass();
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        i0 i0Var = this.a;
        return i10 == 2 ? i0Var.x : i10 == 0 ? i0Var.v : i0Var.w;
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return this.a.J ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        if (this.a.J || i10 == 2) {
            return 2;
        }
        return i10 == 0 ? 0 : 1;
    }
}
