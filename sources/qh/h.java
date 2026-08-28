package qh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.a) {
            case 0:
                ((p) this.b).Y();
                break;
            case 1:
                ((x1) this.b).v0();
                break;
            case 2:
                o3 o3Var = (o3) this.b;
                o3Var.W2 = (view2 == null || o3Var.F(view2) == null) ? false : true;
                if (view2 instanceof d1) {
                    o3Var.H3 = (d1) view2;
                    break;
                }
                break;
            default:
                f5 f5Var = (f5) this.b;
                f5Var.x();
                h5 h5Var = f5Var.v;
                if (h5Var != null) {
                    h5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
