package th;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                ((x1) this.b).w0();
                break;
            case 2:
                p3 p3Var = (p3) this.b;
                p3Var.W2 = (view2 == null || p3Var.F(view2) == null) ? false : true;
                if (view2 instanceof d1) {
                    p3Var.H3 = (d1) view2;
                    break;
                }
                break;
            default:
                g5 g5Var = (g5) this.b;
                g5Var.x();
                i5 i5Var = g5Var.v;
                if (i5Var != null) {
                    i5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
