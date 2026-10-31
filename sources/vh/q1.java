package vh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class q1 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final dc g;
    public final org.telegram.ui.Components.t5 h;

    public q1(org.telegram.ui.ActionBar.f5 f5Var) {
        this.g = new dc(f5Var);
        this.h = new org.telegram.ui.Components.t5(f5Var, 350L, gr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
