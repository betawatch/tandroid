// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uy2 extends View {
    public final ty2 a;

    public uy2(Context context, ylb ylbVar) {
        super(context);
        setVisibility(8);
        ty2 ty2Var = new ty2(this, true, ylbVar);
        this.a = ty2Var;
        ty2Var.F = true;
    }

    public float getEnterProgress() {
        int i;
        ty2 ty2Var = this.a;
        float f = ty2Var.l;
        return (f == 1.0f || !((i = ty2Var.c) == 0 || i == 1)) ? ty2Var.h == 0 ? 0.0f : 1.0f : i == 0 ? f : 1.0f - f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.a.a(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i) {
        this.a.z = i;
    }

    public void setReverse(boolean z) {
        this.a.C = z;
    }
}
