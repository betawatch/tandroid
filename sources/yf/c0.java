package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class c0 extends View implements ViewTreeObserver.OnPreDrawListener {
    public final b0 a;
    public final boolean b;
    public int c;
    public ViewTreeObserver d;

    public c0(Context context, b0 b0Var) {
        super(context);
        this.c = 0;
        this.a = b0Var;
        this.b = true;
    }

    public final void a() {
        ViewGroup viewGroup;
        int indexOfChild;
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup) || (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(this)) < 0 || indexOfChild == viewGroup.getChildCount() - 1) {
            return;
        }
        viewGroup.bringChildToFront(this);
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
