// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q19 extends bf0 {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ r19 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q19(r19 r19Var, Context context, int i) {
        super(context);
        this.I = r19Var;
        this.H = i;
    }

    @Override // bf0, android.view.View
    public final void onDraw(Canvas canvas) {
        r19 r19Var = this.I;
        u82 u82Var = r19Var.F;
        p57 p57Var = r19.I;
        if (!this.H) {
            super.onDraw(canvas);
        } else {
            u82Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            y4b.h(r19Var.E, canvas, getImageReceiver(), u82Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
