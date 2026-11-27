// default package

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class tna extends y46 {
    public final /* synthetic */ qqc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tna(qqc qqcVar, Context context) {
        super(context);
        this.r = qqcVar;
    }

    @Override // y46, b89
    public final void g(View view, a89 a89Var) {
        wa waVar = this.r.a;
        if (waVar != null) {
            q79 layoutManager = waVar.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, q79.y(view) - layoutManager.E()};
            int i = iArr[0];
            int i2 = iArr[1];
            int m = m(Math.max(Math.abs(i), Math.abs(i2)));
            if (m > 0) {
                a89Var.b(i, i2, m, this.j);
            }
        }
    }

    @Override // y46
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
