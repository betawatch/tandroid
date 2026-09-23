package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ up0 b;

    public /* synthetic */ ro0(up0 up0Var, int i10) {
        this.a = i10;
        this.b = up0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        up0 up0Var = this.b;
        up0Var.b0 = defaultWindowInsets;
        fp0 fp0Var = up0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = fp0Var.getPaddingTop();
        i0.b bVar = up0Var.b0;
        fp0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        fp0 fp0Var2 = up0Var.n.b;
        int i11 = up0Var.b0.a;
        int paddingTop2 = fp0Var2.getPaddingTop();
        i0.b bVar2 = up0Var.b0;
        fp0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = up0Var.P;
        i0.b bVar3 = up0Var.b0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.l1.b;
    }

    @Override // yf.a0
    public void a(int i10) {
        up0 up0Var = this.b;
        fh.d dVar = up0Var.g0;
        ArrayList arrayList = up0Var.k0;
        ah.h hVar = up0Var.f0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || hVar == null) {
            return;
        }
        ArrayList arrayList2 = up0Var.j0;
        int a2 = yf.e0.a(arrayList2, (i11 < 29 || dVar == null) ? 0 : dVar.c(0, AndroidUtilities.dp(8.0f), arrayList2), arrayList);
        int measuredWidth = up0Var.d.getMeasuredWidth();
        for (int i12 = 0; i12 < a2; i12++) {
            RectF rectF = (RectF) arrayList.get(i12);
            float f7 = measuredWidth;
            rectF.left = w7.p.a(rectF.left, 0.0f, f7);
            rectF.top = Math.max(0.0f, rectF.top);
            rectF.right = w7.p.a(rectF.right, 0.0f, f7);
            rectF.bottom = Math.min(up0Var.d.getHeight(), rectF.bottom);
        }
        hVar.g(a2, arrayList);
        if (hVar.e(up0Var.i0, up0Var.d.getWidth(), up0Var.d.getHeight())) {
            if (dVar != null) {
                dVar.e();
            }
            Iterator it = up0Var.d0.iterator();
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
