package z4;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import r0.i0;
import r0.k1;
import r0.n;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class b implements n {
    public Object a;
    public Object b;

    public b(String str, PointF[] pointFArr) {
        this.a = str;
        this.b = pointFArr;
    }

    @Override // r0.n
    public k1 B0(View view, k1 k1Var) {
        h hVar = (h) this.b;
        k1 g10 = i0.g(view, k1Var);
        if (g10.a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.a;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = hVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            k1 b10 = i0.b(hVar.getChildAt(i10), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }
}
