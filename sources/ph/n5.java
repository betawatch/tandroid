package ph;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class n5 {
    public final w a;
    public boolean b;
    public m5 c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public final org.telegram.ui.Components.z5 f;
    public final org.telegram.ui.Components.z5[] g;
    public final org.telegram.ui.Components.z5[] h;
    public final Paint i;
    public final Path j;

    public n5(w wVar) {
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
        mr mrVar = mr.g;
        this.d = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 320L, mrVar);
        this.e = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar);
        this.f = new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar);
        this.g = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar)};
        this.h = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar), new org.telegram.ui.Components.z5(0.0f, wVar, 0L, 160L, mrVar)};
    }

    public final void a(m5 m5Var) {
        if (m5Var != null) {
            this.c = m5Var;
        }
        if (m5Var != null) {
            float f10 = m5Var.d;
            float f11 = m5Var.c;
            PointF[] pointFArr = m5Var.b;
            if (!this.b) {
                this.e.d(f11, true);
                this.f.d(f10, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.g[i10].d(pointFArr[i10].x - f11, true);
                    this.h[i10].d(pointFArr[i10].y - f10, true);
                }
            }
        }
        this.b = m5Var != null;
        this.a.run();
    }
}
