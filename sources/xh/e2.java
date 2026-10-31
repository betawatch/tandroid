package xh;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e2 extends org.telegram.ui.web.z0 {
    public final /* synthetic */ int T0;
    public final /* synthetic */ Object U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(Object obj, Context context, p6 p6Var, int i10, int i11) {
        super(i10, context, p6Var, true);
        this.T0 = i11;
        this.U0 = obj;
    }

    @Override // org.telegram.ui.web.z0
    public void D(boolean z10, String str) {
        switch (this.T0) {
            case 0:
                m2 m2Var = (m2) this.U0;
                Paint paint = m2Var.Q;
                if (z10) {
                    m2Var.m();
                    m2Var.Y0.a(m2Var.q() ? m2Var.w0.e : h20.p(vp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I))), str);
                    m2Var.Y0.b(org.telegram.messenger.i0.B(paint.getColor()) <= 0.721f, false);
                    m2Var.Y0.setBackgroundColor(paint.getColor());
                    m2Var.X0 = str;
                }
                org.telegram.ui.b3 b3Var = m2Var.Y0;
                m2Var.W0 = z10;
                org.telegram.messenger.i0.Y3(b3Var, z10, 1.0f, true, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.z0
    public final void J(org.telegram.ui.web.v0 v0Var) {
        switch (this.T0) {
            case 0:
                m2 m2Var = (m2) this.U0;
                m2Var.x.setWebView(v0Var);
                s0 s0Var = m2Var.C0;
                if (s0Var != null) {
                    s0Var.k = v0Var;
                }
                m2Var.n0.setWebView(v0Var);
                m2Var.K();
                break;
            default:
                ((i3) this.U0).J.setWebView(v0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.z0
    public void K(org.telegram.ui.web.v0 v0Var) {
        switch (this.T0) {
            case 0:
                m2 m2Var = (m2) this.U0;
                s0 s0Var = m2Var.C0;
                if (s0Var != null && s0Var.k == v0Var) {
                    s0Var.k = null;
                    s0Var.b();
                }
                m2Var.n0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.T0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    i3 i3Var = (i3) this.U0;
                    if (!i3Var.P) {
                        i3Var.P = true;
                        i3Var.n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
