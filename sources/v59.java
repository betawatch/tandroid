// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class v59 extends wgc {
    public final fja W;
    public boolean a0;
    public View b0;
    public View c0;

    public v59(Context context, ylb ylbVar, fja fjaVar) {
        super(context, ylbVar);
        this.W = fjaVar;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // wgc
    public final void A(int i) {
        fja fjaVar = this.W;
        fjaVar.g("PAGER_TAB_END");
        fjaVar.s();
    }

    @Override // wgc
    public final boolean B(MotionEvent motionEvent) {
        boolean z = this.I;
        boolean B = super.B(motionEvent);
        if (z && !this.I && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.b0 = view;
                this.c0 = view2;
                fja fjaVar = this.W;
                fjaVar.g("PAGER_DRAG_ABORTED");
                fjaVar.s();
            }
        }
        return B;
    }

    @Override // wgc
    public final void F(View view, float f) {
        if (view.getTranslationX() == f) {
            return;
        }
        super.F(view, f);
        invalidate();
    }

    public final void L(View view) {
        this.b0 = null;
        this.c0 = null;
        fja fjaVar = this.W;
        fjaVar.f("PAGE_BOUND", view, 0, 0, true);
        if (fjaVar.P == null) {
            return;
        }
        if (fjaVar.e0) {
            fjaVar.i("page_bound");
        }
        RecyclerView h = fjaVar.P.h(view);
        fjaVar.b(h);
        fjaVar.P.q(h);
        fjaVar.s();
    }

    public final void M(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        fja fjaVar = this.W;
        boolean o = fjaVar.o(x, y);
        this.a0 = o;
        fjaVar.g(o ? "PAGER_DOWN_COMMON" : "PAGER_DOWN_PAGE");
    }

    @Override // wgc
    public final boolean c(MotionEvent motionEvent) {
        return !this.a0 && this.W.c();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int save = canvas.save();
        float x = view.getX();
        fja fjaVar = this.W;
        canvas.clipRect(x, -fjaVar.getTopBleed(), view.getX() + view.getWidth(), fjaVar.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // wgc
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override // wgc, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        M(motionEvent);
        return !this.a0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // wgc, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fja fjaVar = this.W;
        if (motionEvent == null) {
            fjaVar.g("PAGER_CANCEL_NULL");
            this.a0 = false;
            return B(null);
        }
        M(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            fjaVar.g(motionEvent.getActionMasked() == 1 ? "PAGER_UP" : "PAGER_CANCEL");
        }
        return !this.a0 && B(motionEvent);
    }

    @Override // wgc
    public final void t() {
        fja fjaVar = this.W;
        fjaVar.g("PAGER_SCROLL_END");
        fjaVar.s();
    }

    @Override // wgc
    public final void v() {
        this.b0 = null;
        this.c0 = null;
    }

    @Override // wgc
    public final void w(boolean z) {
        this.W.s();
    }
}
