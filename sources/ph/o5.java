package ph;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class o5 {
    public final w a;
    public boolean b;
    public n5 c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public final org.telegram.ui.Components.z5 f;
    public final org.telegram.ui.Components.z5[] g;
    public final org.telegram.ui.Components.z5[] h;
    public final Paint i;
    public final Path j;

    public o5(w wVar) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.08045274E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.j = new Path();
        this.a = wVar;
        nr nrVar = nr.g;
        this.d = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 320L, nrVar);
        this.e = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar);
        this.f = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar);
        this.g = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar)};
        this.h = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, nrVar)};
    }

    public final void a(n5 n5Var) {
        if (n5Var != null) {
            this.c = n5Var;
        }
        if (n5Var != null) {
            float f10 = n5Var.d;
            float f11 = n5Var.c;
            PointF[] pointFArr = n5Var.b;
            if (!this.b) {
                this.e.d(f11, true);
                this.f.d(f10, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.g[i10].d(pointFArr[i10].x - f11, true);
                    this.h[i10].d(pointFArr[i10].y - f10, true);
                }
            }
        }
        this.b = n5Var != null;
        this.a.run();
    }
}
