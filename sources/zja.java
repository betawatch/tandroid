// default package

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zja extends u26 {
    public final /* synthetic */ dmc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zja(dmc dmcVar, Context context) {
        super(context);
        this.r = dmcVar;
    }

    @Override // u26, o49
    public final void g(View view, n49 n49Var) {
        va vaVar = this.r.a;
        if (vaVar != null) {
            d49 layoutManager = vaVar.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, d49.y(view) - layoutManager.E()};
            int i = iArr[0];
            int i2 = iArr[1];
            int m = m(Math.max(Math.abs(i), Math.abs(i2)));
            if (m > 0) {
                n49Var.b(i, i2, m, this.j);
            }
        }
    }

    @Override // u26
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
