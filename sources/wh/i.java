package wh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.a) {
            case 0:
                ((q) this.b).Z();
                break;
            case 1:
                ((z1) this.b).w0();
                break;
            case 2:
                r3 r3Var = (r3) this.b;
                r3Var.X2 = (view2 == null || r3Var.F(view2) == null) ? false : true;
                if (view2 instanceof e1) {
                    r3Var.I3 = (e1) view2;
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
