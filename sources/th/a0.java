package th;

import android.view.View;
import org.telegram.ui.Components.d81;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a0 extends d81 {
    public final /* synthetic */ i0 a;

    public a0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
        ((f0) view).getClass();
    }

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        i0 i0Var = this.a;
        return i10 == 2 ? i0Var.x : i10 == 0 ? i0Var.v : i0Var.w;
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        return this.a.K ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.d81
    public final int h(int i10) {
        if (this.a.K || i10 == 2) {
            return 2;
        }
        return i10 == 0 ? 0 : 1;
    }
}
