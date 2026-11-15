package wi;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.um0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class d extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, Activity activity, int i7) {
        super(activity);
        this.a = i7;
        this.b = hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                h hVar = this.b;
                um0 um0Var = hVar.G;
                if (um0Var != null && um0Var.a()) {
                    hVar.G.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    hVar.G.draw(canvas);
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
                h hVar = this.b;
                float[] fArr = hVar.M;
                b bVar = hVar.N;
                l lVar = hVar.b;
                if (hVar.K) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        hVar.L = true;
                        fArr[0] = motionEvent.getX();
                        fArr[1] = motionEvent.getY();
                        g0.i3(bVar, 500L);
                    } else {
                        hVar.L = false;
                        lVar.G();
                        g0.r(bVar);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    hVar.L = false;
                    lVar.G();
                    g0.r(bVar);
                } else if (actionMasked == 2 && lVar.q()) {
                    lVar.M(motionEvent.getX());
                }
                if (hVar.t != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(-hVar.t.getX(), -hVar.t.getY());
                    boolean dispatchTouchEvent = hVar.t.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        hVar.t = null;
                        break;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = hVar.p.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !hVar.p.isInProgress() && hVar.q.B0(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    hVar.r = false;
                    hVar.s = false;
                    r1.g gVar = hVar.D;
                    if (!gVar.f) {
                        gVar.b = hVar.B;
                        gVar.c = true;
                        gVar.m.i = h.n(r2, hVar.x);
                        hVar.D.h();
                    }
                    r1.g gVar2 = hVar.E;
                    if (!gVar2.f) {
                        gVar2.b = hVar.C;
                        gVar2.c = true;
                        gVar2.m.i = h.e(r2, hVar.y);
                        hVar.E.h();
                    }
                }
                if (!onTouchEvent && !z10) {
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
                h hVar = this.b;
                m51 m51Var = hVar.F;
                if (m51Var.j) {
                    m51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    m51Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                hVar.b.o0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }
}
