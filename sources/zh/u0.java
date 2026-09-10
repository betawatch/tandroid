package zh;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lg0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        x0 x0Var = x0.Z;
        WindowManager.LayoutParams layoutParams = x0Var.c;
        int n10 = (int) (x0Var.n() * x0Var.M);
        layoutParams.width = n10;
        x0Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = x0Var.c;
        int m10 = (int) (x0Var.m() * x0Var.M);
        layoutParams2.height = m10;
        x0Var.K = m10;
        AndroidUtilities.updateViewLayout(x0Var.b, x0Var.d, x0Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        x0 x0Var = x0.Z;
        x0Var.M = w7.q.a(scaleGestureDetector.getScaleFactor() * x0Var.M, 0.6f, x0Var.a);
        x0Var.J = (int) (x0Var.n() * x0Var.M);
        x0Var.K = (int) (x0Var.m() * x0Var.M);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(this, 18));
        o1.k kVar = x0Var.P;
        kVar.b = x0Var.N;
        kVar.c = true;
        kVar.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - x0Var.J) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.k kVar2 = x0Var.P;
        if (!kVar2.f) {
            kVar2.f();
        }
        o1.k kVar3 = x0Var.Q;
        kVar3.b = x0Var.O;
        kVar3.c = true;
        kVar3.u.i = w7.q.a(scaleGestureDetector.getFocusY() - (x0Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - x0Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = x0Var.Q;
        if (!kVar4.f) {
            kVar4.f();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        x0 x0Var = x0.Z;
        if (x0Var.E) {
            x0Var.E = false;
        }
        x0Var.F = true;
        x0Var.c.width = (int) (x0Var.n() * x0Var.a);
        x0Var.c.height = (int) (x0Var.m() * x0Var.a);
        AndroidUtilities.updateViewLayout(x0Var.b, x0Var.d, x0Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        x0 x0Var = x0.Z;
        if (!x0Var.P.f && !x0Var.Q.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        lg0 lg0Var = new lg0(this, arrayList, 2);
        o1.k kVar = x0Var.P;
        if (kVar.f) {
            kVar.a(lg0Var);
        } else {
            arrayList.add(kVar);
        }
        o1.k kVar2 = x0Var.Q;
        if (kVar2.f) {
            kVar2.a(lg0Var);
        } else {
            arrayList.add(kVar2);
        }
    }
}
