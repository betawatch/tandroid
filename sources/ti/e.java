package ti;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class e extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, Activity activity, int i7) {
        super(activity);
        this.a = i7;
        this.b = iVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                i iVar = this.b;
                qm0 qm0Var = iVar.G;
                if (qm0Var != null && qm0Var.a()) {
                    iVar.G.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    iVar.G.draw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r3 != false) goto L54;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                i iVar = this.b;
                float[] fArr = iVar.M;
                b bVar = iVar.N;
                m mVar = iVar.b;
                if (iVar.K) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        iVar.L = true;
                        fArr[0] = motionEvent.getX();
                        fArr[1] = motionEvent.getY();
                        g0.i3(bVar, 500L);
                    } else {
                        iVar.L = false;
                        mVar.F();
                        g0.r(bVar);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    iVar.L = false;
                    mVar.F();
                    g0.r(bVar);
                } else if (actionMasked == 2 && mVar.u()) {
                    mVar.J(motionEvent.getX());
                }
                if (iVar.t != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(-iVar.t.getX(), -iVar.t.getY());
                    boolean dispatchTouchEvent = iVar.t.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        iVar.t = null;
                        break;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = iVar.p.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z9 = !iVar.p.isInProgress() && iVar.q.n0(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    iVar.r = false;
                    iVar.s = false;
                    r1.g gVar = iVar.D;
                    if (!gVar.f) {
                        gVar.b = iVar.B;
                        gVar.c = true;
                        gVar.m.i = i.n(r2, iVar.x);
                        iVar.D.h();
                    }
                    r1.g gVar2 = iVar.E;
                    if (!gVar2.f) {
                        gVar2.b = iVar.C;
                        gVar2.c = true;
                        gVar2.m.i = i.e(r2, iVar.y);
                        iVar.E.h();
                    }
                }
                if (!onTouchEvent && !z9) {
                    return false;
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                j51 j51Var = iVar.F;
                if (j51Var.j) {
                    j51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    j51Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                iVar.b.c0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }
}
