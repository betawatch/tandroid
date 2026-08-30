package vh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.a) {
            case 0:
                ((p) this.b).Z();
                break;
            case 1:
                ((y1) this.b).w0();
                break;
            case 2:
                r3 r3Var = (r3) this.b;
                r3Var.X2 = (view2 == null || r3Var.F(view2) == null) ? false : true;
                if (view2 instanceof d1) {
                    r3Var.I3 = (d1) view2;
                    break;
                }
                break;
            default:
                i5 i5Var = (i5) this.b;
                i5Var.x();
                k5 k5Var = i5Var.v;
                if (k5Var != null) {
                    k5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
