package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq0 b;

    public /* synthetic */ xo0(aq0 aq0Var, int i10) {
        this.a = i10;
        this.b = aq0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        aq0 aq0Var = this.b;
        aq0Var.b0 = defaultWindowInsets;
        lp0 lp0Var = aq0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = lp0Var.getPaddingTop();
        i0.b bVar = aq0Var.b0;
        lp0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        lp0 lp0Var2 = aq0Var.n.b;
        int i11 = aq0Var.b0.a;
        int paddingTop2 = lp0Var2.getPaddingTop();
        i0.b bVar2 = aq0Var.b0;
        lp0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = aq0Var.P;
        i0.b bVar3 = aq0Var.b0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.l1.b;
    }

    @Override // yf.a0
    public void a(int i10) {
        aq0 aq0Var = this.b;
        fh.d dVar = aq0Var.g0;
        ArrayList arrayList = aq0Var.k0;
        ah.h hVar = aq0Var.f0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || hVar == null) {
            return;
        }
        ArrayList arrayList2 = aq0Var.j0;
        int a2 = yf.e0.a(arrayList2, (i11 < 29 || dVar == null) ? 0 : dVar.c(0, AndroidUtilities.dp(8.0f), arrayList2), arrayList);
        int measuredWidth = aq0Var.d.getMeasuredWidth();
        for (int i12 = 0; i12 < a2; i12++) {
            RectF rectF = (RectF) arrayList.get(i12);
            float f7 = measuredWidth;
            rectF.left = w7.p.a(rectF.left, 0.0f, f7);
            rectF.top = Math.max(0.0f, rectF.top);
            rectF.right = w7.p.a(rectF.right, 0.0f, f7);
            rectF.bottom = Math.min(aq0Var.d.getHeight(), rectF.bottom);
        }
        hVar.g(a2, arrayList);
        if (hVar.e(aq0Var.i0, aq0Var.d.getWidth(), aq0Var.d.getHeight())) {
            if (dVar != null) {
                dVar.e();
            }
            Iterator it = aq0Var.d0.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                this.b.finishFragment();
                break;
            default:
                this.b.y0();
                break;
        }
    }
}
