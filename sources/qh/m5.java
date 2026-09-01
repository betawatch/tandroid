package qh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class m5 {
    public final w a;
    public boolean b;
    public l5 c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public final org.telegram.ui.Components.z5 f;
    public final org.telegram.ui.Components.z5[] g;
    public final org.telegram.ui.Components.z5[] h;
    public final Paint i;
    public final Path j;

    public m5(w wVar) {
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
        pr prVar = pr.g;
        this.d = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 320L, prVar);
        this.e = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar);
        this.f = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar);
        this.g = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar)};
        this.h = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, prVar)};
    }

    public final void a(l5 l5Var) {
        if (l5Var != null) {
            this.c = l5Var;
        }
        if (l5Var != null) {
            float f10 = l5Var.d;
            float f11 = l5Var.c;
            PointF[] pointFArr = l5Var.b;
            if (!this.b) {
                this.e.d(f11, true);
                this.f.d(f10, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.g[i10].d(pointFArr[i10].x - f11, true);
                    this.h[i10].d(pointFArr[i10].y - f10, true);
                }
            }
        }
        this.b = l5Var != null;
        this.a.run();
    }
}
