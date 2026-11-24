// default package

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ox0 extends qw0 {
    public final /* synthetic */ byte U0;
    public final /* synthetic */ Object V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox0(Object obj, Context context, ylb ylbVar, int i, byte b) {
        super(i, ylbVar, context, true);
        this.U0 = b;
        this.V0 = obj;
    }

    @Override // qw0
    public final void B(boolean z, String str) {
        switch (this.U0) {
            case 0:
                wx0 wx0Var = (wx0) this.V0;
                Paint paint = wx0Var.R;
                if (z) {
                    wx0Var.j();
                    wx0Var.Z0.a(wx0Var.o() ? wx0Var.x0.e : m9c.r(oc7.r1(wx0Var.I).W1(Long.valueOf(wx0Var.J))), str);
                    wx0Var.Z0.b(gm.B(paint.getColor()) <= 0.721f, false);
                    wx0Var.Z0.setBackgroundColor(paint.getColor());
                    wx0Var.Y0 = str;
                }
                cx cxVar = wx0Var.Z0;
                wx0Var.X0 = z;
                gm.T3(cxVar, z, 1.0f, true, false);
                invalidate();
                break;
        }
    }

    @Override // qw0
    public final void H(mw0 mw0Var) {
        byte b = this.U0;
        Object obj = this.V0;
        switch (b) {
            case 0:
                wx0 wx0Var = (wx0) obj;
                wx0Var.x.setWebView(mw0Var);
                ws0 ws0Var = wx0Var.D0;
                if (ws0Var != null) {
                    ws0Var.k = mw0Var;
                }
                wx0Var.o0.setWebView(mw0Var);
                wx0Var.K();
                break;
            default:
                ((e32) obj).K.setWebView(mw0Var);
                break;
        }
    }

    @Override // qw0
    public final void I(mw0 mw0Var) {
        switch (this.U0) {
            case 0:
                wx0 wx0Var = (wx0) this.V0;
                ws0 ws0Var = wx0Var.D0;
                if (ws0Var != null && ws0Var.k == mw0Var) {
                    ws0Var.k = null;
                    ws0Var.b();
                }
                wx0Var.o0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.U0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    e32 e32Var = (e32) this.V0;
                    if (!e32Var.Q) {
                        e32Var.Q = true;
                        e32Var.n.O();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
