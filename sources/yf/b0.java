package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class b0 extends View implements ViewTreeObserver.OnPreDrawListener {
    public final a0 a;
    public final boolean b;
    public int c;
    public ViewTreeObserver d;

    public b0(Context context, a0 a0Var) {
        super(context);
        this.c = 0;
        this.a = a0Var;
        this.b = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            this.d = viewTreeObserver;
            viewTreeObserver.addOnPreDrawListener(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.d.removeOnPreDrawListener(this);
        }
        this.d = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b) {
            return;
        }
        this.a.a(this.c);
        this.c = 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(1, TLObject.FLAG_30));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10;
        if (!this.b || (i10 = this.c) == 0) {
            return true;
        }
        this.a.a(i10);
        this.c = 0;
        return true;
    }
}
