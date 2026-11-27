// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class pl4 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xl4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl4(xl4 xl4Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = xl4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                xl4 xl4Var = this.b;
                cz9 cz9Var = xl4Var.J;
                if (cz9Var != null && cz9Var.a()) {
                    xl4Var.J.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    xl4Var.J.draw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r3 == false) goto L39;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        switch (this.a) {
            case 1:
                xl4 xl4Var = this.b;
                float[] fArr = xl4Var.S;
                nl4 nl4Var = xl4Var.T;
                boolean z2 = xl4Var.d;
                je8 je8Var = xl4Var.b;
                if (xl4Var.N || xl4Var.O || xl4Var.P) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (!z2 && (actionMasked == 0 || actionMasked == 5)) {
                    if (motionEvent.getPointerCount() == 1) {
                        xl4Var.R = true;
                        fArr[0] = motionEvent.getX();
                        fArr[1] = motionEvent.getY();
                        hl.d3(nl4Var, 500L);
                    } else {
                        xl4Var.R = false;
                        je8Var.T();
                        hl.r(nl4Var);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    xl4Var.R = false;
                    je8Var.T();
                    hl.r(nl4Var);
                } else if (actionMasked == 2 && je8Var.H()) {
                    je8Var.V(motionEvent.getX());
                }
                if (xl4Var.w != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(-xl4Var.w.getX(), -xl4Var.w.getY());
                    boolean dispatchTouchEvent = xl4Var.w.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        xl4Var.w = null;
                        break;
                    }
                }
                if (z2) {
                    z = false;
                } else {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                    z = xl4Var.s.onTouchEvent(obtain2);
                    obtain2.recycle();
                }
                boolean z3 = !xl4Var.s.isInProgress() && xl4Var.t.E(motionEvent);
                if (!xl4Var.O) {
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        xl4Var.u = false;
                        xl4Var.v = false;
                        if (z2) {
                            if (xl4Var.h() > xl4Var.A / 4.0f) {
                                xl4Var.o();
                            } else if (xl4Var.j.getAlpha() != 1.0f) {
                                xl4Var.j.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                        vpa vpaVar = xl4Var.G;
                        if (!vpaVar.f) {
                            vpaVar.b = xl4Var.E;
                            vpaVar.c = true;
                            vpaVar.m.i = xl4.p(r1, xl4Var.A);
                            xl4Var.G.h();
                        }
                        vpa vpaVar2 = xl4Var.H;
                        if (!vpaVar2.f) {
                            vpaVar2.b = xl4Var.F;
                            vpaVar2.c = true;
                            vpaVar2.m.i = xl4.e(r1, xl4Var.B);
                            xl4Var.H.h();
                        }
                    }
                    if (!z && !z3) {
                        return false;
                    }
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                xl4 xl4Var = this.b;
                rec recVar = xl4Var.I;
                if (recVar.j) {
                    recVar.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    recVar.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                xl4Var.b.v0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }
}
