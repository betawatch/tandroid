// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vv3 extends WebView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ KeyEvent.Callback c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vv3(KeyEvent.Callback callback, Context context, Context context2, byte b) {
        super(context);
        this.a = b;
        this.c = callback;
        this.b = context2;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.draw(canvas);
                ViewParent parent = getParent();
                ya8 ya8Var = (ya8) this.c;
                if (parent != ya8Var && ya8Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    ya8Var.j(canvas, getWidth(), getHeight());
                    break;
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                gm.u((Activity) this.b, true);
                super.onAttachedToWindow();
                break;
            default:
                gm.u(this.b, true);
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                gm.u((Activity) this.b, false);
                super.onDetachedFromWindow();
                break;
            default:
                gm.u(this.b, false);
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    int action = motionEvent.getAction();
                    zv3 zv3Var = (zv3) this.c;
                    if (action == 1) {
                        zv3Var.E0 = false;
                    } else {
                        zv3Var.E0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
