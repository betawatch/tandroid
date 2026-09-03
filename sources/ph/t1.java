package ph;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class t1 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final rc g;
    public final org.telegram.ui.Components.z5 h;

    public t1(w1 w1Var) {
        this.g = new rc(w1Var);
        this.h = new org.telegram.ui.Components.z5(w1Var, 350L, mr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z4) {
    }
}
