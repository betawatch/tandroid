// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class pl4 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tl4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl4(tl4 tl4Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = tl4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                tl4 tl4Var = this.b;
                lx9 lx9Var = tl4Var.G;
                if (lx9Var != null && lx9Var.a()) {
                    tl4Var.G.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    tl4Var.G.draw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r2 == false) goto L34;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                tl4 tl4Var = this.b;
                float[] fArr = tl4Var.M;
                nl4 nl4Var = tl4Var.N;
                vc8 vc8Var = tl4Var.b;
                if (tl4Var.K) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        tl4Var.L = true;
                        fArr[0] = motionEvent.getX();
                        fArr[1] = motionEvent.getY();
                        gm.d3(nl4Var, 500L);
                    } else {
                        tl4Var.L = false;
                        vc8Var.R();
                        gm.r(nl4Var);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    tl4Var.L = false;
                    vc8Var.R();
                    gm.r(nl4Var);
                } else if (actionMasked == 2 && vc8Var.G()) {
                    vc8Var.T(motionEvent.getX());
                }
                if (tl4Var.t != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(-tl4Var.t.getX(), -tl4Var.t.getY());
                    boolean dispatchTouchEvent = tl4Var.t.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        tl4Var.t = null;
                        break;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = tl4Var.p.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z = !tl4Var.p.isInProgress() && tl4Var.q.I(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    tl4Var.r = false;
                    tl4Var.s = false;
                    zna znaVar = tl4Var.D;
                    if (!znaVar.f) {
                        znaVar.b = tl4Var.B;
                        znaVar.c = true;
                        znaVar.m.i = tl4.n(r1, tl4Var.x);
                        tl4Var.D.h();
                    }
                    zna znaVar2 = tl4Var.E;
                    if (!znaVar2.f) {
                        znaVar2.b = tl4Var.C;
                        znaVar2.c = true;
                        znaVar2.m.i = tl4.e(r1, tl4Var.y);
                        tl4Var.E.h();
                    }
                }
                if (!onTouchEvent && !z) {
                    return false;
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
                tl4 tl4Var = this.b;
                ucc uccVar = tl4Var.F;
                if (uccVar.j) {
                    uccVar.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    uccVar.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                tl4Var.b.u0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }
}
