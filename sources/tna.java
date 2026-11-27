// default package

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
