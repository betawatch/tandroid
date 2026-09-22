package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq0 b;

    public /* synthetic */ yo0(cq0 cq0Var, int i10) {
        this.a = i10;
        this.b = cq0Var;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        cq0 cq0Var = this.b;
        cq0Var.b0 = defaultWindowInsets;
        np0 np0Var = cq0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = np0Var.getPaddingTop();
        i0.b bVar = cq0Var.b0;
        np0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        np0 np0Var2 = cq0Var.n.b;
        int i11 = cq0Var.b0.a;
        int paddingTop2 = np0Var2.getPaddingTop();
        i0.b bVar2 = cq0Var.b0;
        np0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = cq0Var.P;
        i0.b bVar3 = cq0Var.b0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.l1.b;
    }

    @Override // yf.a0
    public void a(int i10) {
        cq0 cq0Var = this.b;
        fh.d dVar = cq0Var.g0;
        ArrayList arrayList = cq0Var.k0;
        ah.i iVar = cq0Var.f0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || iVar == null) {
            return;
        }
        ArrayList arrayList2 = cq0Var.j0;
        int a2 = yf.e0.a(arrayList2, (i11 < 29 || dVar == null) ? 0 : dVar.c(0, AndroidUtilities.dp(8.0f), arrayList2), arrayList);
        int measuredWidth = cq0Var.d.getMeasuredWidth();
        for (int i12 = 0; i12 < a2; i12++) {
            RectF rectF = (RectF) arrayList.get(i12);
            float f7 = measuredWidth;
            rectF.left = w7.q.a(rectF.left, 0.0f, f7);
            rectF.top = Math.max(0.0f, rectF.top);
            rectF.right = w7.q.a(rectF.right, 0.0f, f7);
            rectF.bottom = Math.min(cq0Var.d.getHeight(), rectF.bottom);
        }
        iVar.g(a2, arrayList);
        if (iVar.e(cq0Var.i0, cq0Var.d.getWidth(), cq0Var.d.getHeight())) {
            if (dVar != null) {
                dVar.e();
            }
            Iterator it = cq0Var.d0.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
