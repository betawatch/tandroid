package vh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ((y1) this.b).w0();
                break;
            case 2:
                s3 s3Var = (s3) this.b;
                s3Var.X2 = (view2 == null || s3Var.F(view2) == null) ? false : true;
                if (view2 instanceof e1) {
                    s3Var.I3 = (e1) view2;
                    break;
                }
                break;
            default:
                j5 j5Var = (j5) this.b;
                j5Var.x();
                l5 l5Var = j5Var.v;
                if (l5Var != null) {
                    l5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
