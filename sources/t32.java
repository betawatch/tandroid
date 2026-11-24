// default package

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class t32 implements m7, xh5, zh5, ed, mg0 {
    public final /* synthetic */ c42 a;

    public /* synthetic */ t32(c42 c42Var) {
        this.a = c42Var;
    }

    @Override // xh5
    public final boolean a(MotionEvent motionEvent, wy4 wy4Var) {
        MotionEvent motionEvent2;
        c42 c42Var = this.a;
        if (c42Var.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-c42Var.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = wy4Var.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override // mg0
    public final void b() {
        c42 c42Var = this.a;
        c42Var.f0 = false;
        c42Var.i0();
    }

    @Override // zh5
    public final void c(int i) {
        View childAt;
        c42 c42Var = this.a;
        fu fuVar = c42Var.M;
        if (i != 1 || c42Var.I || fuVar.getChildCount() <= 0 || (childAt = fuVar.getChildAt(0)) == null) {
            return;
        }
        View F = fuVar.F(childAt);
        s49 T = F == null ? null : fuVar.T(F);
        if (T == null || T.b() != 0) {
            return;
        }
        int L = c42Var.p0 == 0 ? 0 : gl.L(66.0f);
        int top = childAt.getTop();
        if (top < (-L)) {
            fw5 d = c42Var.E.d();
            c42Var.G = ((ize) a.j()).newCameraUpdateLatLngZoom((yh5) d.b, d.c);
            fuVar.x0(0, top + L, null);
        }
    }

    @Override // m7
    public final void h(int i) {
        ty4 ty4Var = this.a.E;
        if (ty4Var != null) {
            if (i == 2) {
                ty4Var.j(0);
            } else if (i == 3) {
                ty4Var.j(1);
            } else if (i == 4) {
                ty4Var.j(2);
            }
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        this.a.b0();
    }
}
