// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t5 extends r6 {
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(a aVar, Context context, a aVar2) {
        super(context, aVar2);
        this.h = aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        a aVar = this.h;
        Paint paint = aVar.N0;
        if (aVar.M0 && this.a && aVar.x != 0) {
            aVar.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(aVar.x);
            canvas2 = canvas;
            aVar.L0.H(canvas2, 0.0f, aVar.O0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ela elaVar = this.h.L0;
        if (elaVar != null) {
            elaVar.P.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ela elaVar = this.h.L0;
        if (elaVar != null) {
            elaVar.P.remove(this);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        a aVar = this.h;
        aVar.invalidate();
        Runnable runnable = aVar.e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        a aVar = this.h;
        aVar.x = i;
        if (aVar.M0) {
            return;
        }
        super.setBackgroundColor(i);
    }
}
