// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q47 extends wgc {
    public final /* synthetic */ l57 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q47(l57 l57Var, Context context, h57 h57Var) {
        super(context, h57Var);
        this.W = l57Var;
    }

    @Override // wgc, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i = 0;
        while (true) {
            View[] viewArr = this.W.f.e;
            if (i >= viewArr.length) {
                z = false;
                break;
            }
            View view = viewArr[i];
            if (view != null) {
                f57 f57Var = (f57) view;
                if (f57Var.a == 0) {
                    z = f57Var.e.i;
                    break;
                }
            }
            i++;
        }
        if (z) {
            return false;
        }
        return B(motionEvent);
    }

    @Override // wgc
    public final void t() {
        View view = this.e[0];
        if (view instanceof f57) {
            ((f57) view).e.U();
        }
    }

    @Override // wgc
    public final void w(boolean z) {
        l57 l57Var = this.W;
        l57Var.e.setSelectedTab(l57Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof f57) {
            ((f57) view).e.F();
        }
        View view2 = viewArr[1];
        if (view2 instanceof f57) {
            ((f57) view2).e.F();
        }
    }
}
