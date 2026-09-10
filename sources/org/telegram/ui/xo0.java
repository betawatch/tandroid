package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo0 implements xf.b0, r0.n, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq0 b;

    public /* synthetic */ xo0(bq0 bq0Var, int i10) {
        this.a = i10;
        this.b = bq0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        bq0 bq0Var = this.b;
        bq0Var.b0 = defaultWindowInsets;
        lp0 lp0Var = bq0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = lp0Var.getPaddingTop();
        i0.c cVar = bq0Var.b0;
        lp0Var.setPadding(i10, paddingTop, cVar.c, AndroidUtilities.dp(72.0f) + cVar.d);
        lp0 lp0Var2 = bq0Var.n.b;
        int i11 = bq0Var.b0.a;
        int paddingTop2 = lp0Var2.getPaddingTop();
        i0.c cVar2 = bq0Var.b0;
        lp0Var2.setPadding(i11, paddingTop2, cVar2.c, AndroidUtilities.dp(72.0f) + cVar2.d);
        FrameLayout frameLayout = bq0Var.P;
        i0.c cVar3 = bq0Var.b0;
        frameLayout.setPadding(cVar3.a, 0, cVar3.c, cVar3.d);
        return r0.l1.b;
    }

    @Override // xf.b0
    public void b(int i10) {
        bq0 bq0Var = this.b;
        eh.d dVar = bq0Var.g0;
        ArrayList arrayList = bq0Var.k0;
        zg.e eVar = bq0Var.f0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || eVar == null) {
            return;
        }
        ArrayList arrayList2 = bq0Var.j0;
        int a2 = xf.f0.a((i11 < 29 || dVar == null) ? 0 : dVar.d(0, AndroidUtilities.dp(8.0f), arrayList2), arrayList2, arrayList);
        int measuredWidth = bq0Var.d.getMeasuredWidth();
        for (int i12 = 0; i12 < a2; i12++) {
            RectF rectF = (RectF) arrayList.get(i12);
            float f7 = measuredWidth;
            rectF.left = w7.q.a(rectF.left, 0.0f, f7);
            rectF.top = Math.max(0.0f, rectF.top);
            rectF.right = w7.q.a(rectF.right, 0.0f, f7);
            rectF.bottom = Math.min(bq0Var.d.getHeight(), rectF.bottom);
        }
        eVar.g(a2, arrayList);
        if (eVar.e(bq0Var.i0, bq0Var.d.getWidth(), bq0Var.d.getHeight())) {
            if (dVar != null) {
                dVar.e();
            }
            Iterator it = bq0Var.d0.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
