package th;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.ui.Components.ff0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        w0 w0Var = w0.Z;
        WindowManager.LayoutParams layoutParams = w0Var.c;
        int h = (int) (w0Var.h() * w0Var.M);
        layoutParams.width = h;
        w0Var.J = h;
        WindowManager.LayoutParams layoutParams2 = w0Var.c;
        int f7 = (int) (w0Var.f() * w0Var.M);
        layoutParams2.height = f7;
        w0Var.K = f7;
        org.telegram.messenger.i0.S3(w0Var.b, w0Var.d, w0Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        w0 w0Var = w0.Z;
        w0Var.M = w7.u.a(scaleGestureDetector.getScaleFactor() * w0Var.M, 0.6f, w0Var.a);
        w0Var.J = (int) (w0Var.h() * w0Var.M);
        w0Var.K = (int) (w0Var.f() * w0Var.M);
        org.telegram.messenger.i0.g3(new r5.a(this, 10));
        o1.j jVar = w0Var.P;
        jVar.b = w0Var.N;
        jVar.c = true;
        jVar.m.i = scaleGestureDetector.getFocusX() >= ((float) org.telegram.messenger.i0.q.x) / 2.0f ? (r5 - w0Var.J) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
        o1.j jVar2 = w0Var.P;
        if (!jVar2.f) {
            jVar2.h();
        }
        o1.j jVar3 = w0Var.Q;
        jVar3.b = w0Var.O;
        jVar3.c = true;
        jVar3.m.i = w7.u.a(scaleGestureDetector.getFocusY() - (w0Var.K / 2.0f), org.telegram.messenger.i0.L(16.0f), (r4.y - w0Var.K) - org.telegram.messenger.i0.L(16.0f));
        o1.j jVar4 = w0Var.Q;
        if (!jVar4.f) {
            jVar4.h();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        w0 w0Var = w0.Z;
        if (w0Var.E) {
            w0Var.E = false;
        }
        w0Var.F = true;
        w0Var.c.width = (int) (w0Var.h() * w0Var.a);
        w0Var.c.height = (int) (w0Var.f() * w0Var.a);
        org.telegram.messenger.i0.S3(w0Var.b, w0Var.d, w0Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        w0 w0Var = w0.Z;
        if (!w0Var.P.f && !w0Var.Q.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ff0 ff0Var = new ff0(this, arrayList, 2);
        o1.j jVar = w0Var.P;
        if (jVar.f) {
            jVar.a(ff0Var);
        } else {
            arrayList.add(jVar);
        }
        o1.j jVar2 = w0Var.Q;
        if (jVar2.f) {
            jVar2.a(ff0Var);
        } else {
            arrayList.add(jVar2);
        }
    }
}
