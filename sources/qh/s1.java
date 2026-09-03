package qh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class s1 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final rc g;
    public final org.telegram.ui.Components.z5 h;

    public s1(v1 v1Var) {
        this.g = new rc(v1Var);
        this.h = new org.telegram.ui.Components.z5(v1Var, 350L, pr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z4) {
    }
}
