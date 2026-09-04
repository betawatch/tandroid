package z2;

import android.view.View;
import android.widget.FrameLayout;
import fi.f;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import ji.c2;
import ji.g6;
import ji.h1;
import ji.i3;
import ji.j4;
import ji.s3;
import ji.t3;
import ji.u3;
import k4.d;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vi;
import t7.u;
import y2.h;
import y2.j;
import y2.m;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b implements h, t3 {
    public final Object a;

    public /* synthetic */ b(Object obj) {
        this.a = obj;
    }

    @Override // ji.t3
    public boolean a(float f7) {
        boolean z10;
        c2 c2Var = (c2) this.a;
        FrameLayout frameLayout = c2Var.v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= r3[1]) {
                z10 = true;
                c2.Z(c2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        c2.Z(c2Var, z10, true);
        return z10;
    }

    @Override // ji.t3
    public void b(s3 s3Var, View view) {
        c2 c2Var = (c2) this.a;
        n70 H = n70.H(c2Var, view);
        H.Q = true;
        c2Var.x0 = j4.c(H, c2Var, c2Var.getParentActivity(), c2Var.getResourceProvider(), s3Var, false);
    }

    @Override // ji.t3
    public void d(u3 u3Var, View view) {
        c2 c2Var = (c2) this.a;
        n70 H = n70.H(c2Var, view);
        H.Q = true;
        c2Var.getParentActivity();
        c2Var.getResourceProvider();
        c2Var.x0 = j4.b(H, c2Var, u3Var, false);
    }

    @Override // ji.t3
    public void e(int i10) {
        ((c2) this.a).o0(74, i10);
    }

    @Override // ji.t3
    public void f() {
        c2 c2Var = (c2) this.a;
        i3 i3Var = c2Var.P.n3;
        c2Var.x0((i3Var != null && i3Var.y() && c2Var.P.B4()) ? 1 : 0, true);
        c2Var.y0();
        c2Var.w0();
    }

    @Override // y2.h
    public d g(j jVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.a).a.x(iOException);
        return m.e;
    }

    @Override // y2.h
    public void i(j jVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.a;
        synchronized (c.b) {
            z10 = c.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.x(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // ji.t3
    public void l() {
        c2 c2Var = (c2) this.a;
        c2Var.I0 = c2Var.K0;
        c2.Z(c2Var, false, false);
        c2Var.x0(2, true);
    }

    @Override // ji.t3
    public void onContentChanged() {
        c2 c2Var = (c2) this.a;
        if (c2Var.y0 != null) {
            boolean l32 = c2Var.P.l3();
            c2Var.L0 = l32;
            c2Var.y0.h(l32);
            c2Var.y0.invalidate();
        }
        c2Var.C0();
        Runnable runnable = c2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // ji.t3
    public void p(ji.a aVar) {
        c2 c2Var = (c2) this.a;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(c2Var)) {
            vi viVar = new vi(c2Var.getParentActivity(), c2Var, false, false, false, c2Var.getResourceProvider());
            viVar.Z1 = new u(11);
            viVar.P = true;
            viVar.x1.setVisibility(8);
            viVar.t2 = new androidx.car.app.utils.a(c2Var, aVar, viVar, 11);
            viVar.r1();
            viVar.show();
        }
    }

    @Override // ji.t3
    public void r() {
        c2 c2Var = (c2) this.a;
        c2.Z(c2Var, false, true);
        int i10 = c2Var.I0;
        c2Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override // ji.t3
    public n70 t(View view) {
        return n70.H((c2) this.a, view);
    }

    @Override // ji.t3
    public void u() {
        c2 c2Var = (c2) this.a;
        c2Var.z0();
        c2Var.C0();
    }

    @Override // ji.t3
    public void x(g6 g6Var, String str) {
        c2 c2Var = (c2) this.a;
        if (c2Var.z0 == null) {
            c2Var.z0 = new p3(new f(this, 24), c2Var.getResourceProvider());
        }
        c2Var.z0.d(g6Var, str);
    }

    @Override // ji.t3
    public void n() {
    }

    @Override // ji.t3
    public void o(int i10) {
    }

    @Override // ji.t3
    public void v(h1 h1Var, boolean z10) {
    }

    @Override // y2.h
    public /* synthetic */ void h(j jVar, long j3, long j10, int i10) {
    }

    @Override // y2.h
    public void w(j jVar, long j3, long j10, boolean z10) {
    }
}
