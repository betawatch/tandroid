// default package

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class w04 extends xu9 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final /* synthetic */ o24 E0;
    public final int v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w04(o24 o24Var, Context context, vnb vnbVar) {
        super(vnbVar, context, o24Var.j2);
        this.E0 = o24Var;
        this.y0 = true;
        this.v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // xu9, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0) {
            o24 o24Var = this.E0;
            if (o24Var.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((cdc) o24Var.P0).c();
                if (this.w0) {
                    o24Var.h.i();
                    this.w0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // xu9, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o24 o24Var = this.E0;
        zz3 zz3Var = o24Var.g2;
        d04 d04Var = o24Var.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.y0) {
            this.y0 = false;
            this.x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            o24Var.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && o24Var.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.z0);
            float f = this.v0;
            if (abs >= f && canScrollHorizontally((int) (this.z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                hl.r(zz3Var);
                o24Var.Y1 = true;
                o24Var.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((cdc) o24Var.P0).c();
                if (this.w0) {
                    d04Var.i();
                    this.w0 = false;
                }
            }
        }
        if (o24Var.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            hl.d3(zz3Var, 1500L);
        }
        if (!this.B0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.w0 || this.x0 - motionEvent.getX() >= 0.0f) {
                    if (this.w0 && this.x0 - motionEvent.getX() > 0.0f && d04Var.f0) {
                        d04Var.i();
                        this.w0 = false;
                    }
                } else if (!d04Var.N) {
                    d04Var.f0 = true;
                    d04Var.setScrollState(1);
                    d04Var.S = 0.0f;
                    d04Var.U = 0.0f;
                    VelocityTracker velocityTracker = d04Var.a0;
                    if (velocityTracker == null) {
                        d04Var.a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    d04Var.a0.addMovement(obtain);
                    obtain.recycle();
                    this.w0 = true;
                    getTranslationX();
                }
            }
            if (this.w0) {
                motionEvent.getX();
            }
            this.x0 = motionEvent.getX();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.y0 = true;
                this.C0 = false;
                this.B0 = false;
                if (this.w0) {
                    d04Var.i();
                    this.w0 = false;
                }
            }
            return this.w0 || super.onTouchEvent(motionEvent);
        }
        VelocityTracker velocityTracker2 = this.D0;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.D0 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.D0.computeCurrentVelocity(1000);
            float yVelocity = this.D0.getYVelocity();
            this.D0.recycle();
            this.D0 = null;
            int action = motionEvent.getAction();
            v04 v04Var = o24Var.P0;
            if (action == 1) {
                cdc cdcVar = (cdc) v04Var;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) cdcVar.c;
                if (cdcVar.a()) {
                    chatActivityEnterView.t4 = false;
                    if ((!cdcVar.a || yVelocity < hl.L(200.0f)) && (cdcVar.a || yVelocity > hl.L(-200.0f))) {
                        boolean z = cdcVar.a;
                        float f2 = chatActivityEnterView.r4;
                        if (!z ? f2 < 0.4f : f2 > 0.6f) {
                            chatActivityEnterView.a2(z, true, true, true);
                        }
                    }
                    chatActivityEnterView.a2(!cdcVar.a, true, true, true);
                }
            } else {
                cdc cdcVar2 = (cdc) v04Var;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) cdcVar2.c;
                if (chatActivityEnterView2.m4) {
                    chatActivityEnterView2.t4 = false;
                    chatActivityEnterView2.a2(cdcVar2.a, true, false, true);
                }
            }
            this.y0 = true;
            this.C0 = false;
            this.B0 = false;
        } else {
            v04 v04Var2 = o24Var.P0;
            int round = Math.round(motionEvent.getRawY() - this.A0);
            cdc cdcVar3 = (cdc) v04Var2;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) cdcVar3.c;
            if (cdcVar3.a()) {
                Point point = hl.q;
                int max = Math.max(Math.min(round + cdcVar3.b, 0), -(chatActivityEnterView3.s4 - (point.x > point.y ? chatActivityEnterView3.n3 : chatActivityEnterView3.m3)));
                if (chatActivityEnterView3.I7 == null) {
                    float f3 = max;
                    chatActivityEnterView3.V0.setTranslationY(f3);
                    chatActivityEnterView3.setTranslationY(f3);
                }
                chatActivityEnterView3.r4 = max / (-(chatActivityEnterView3.s4 - r4));
                chatActivityEnterView3.b2.invalidate();
            }
        }
        cancelLongPress();
        return true;
    }
}
