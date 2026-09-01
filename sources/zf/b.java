package zf;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.jg0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b {
    public final ScaleGestureDetector a;
    public n b;
    public float c;
    public float d;
    public final float f;
    public VelocityTracker g;
    public boolean h;
    public long k;
    public boolean l;
    public final float e = AndroidUtilities.dp(1.0f);
    public int i = -1;
    public int j = 0;

    public b(Context context) {
        this.f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.a = new ScaleGestureDetector(context, new jg0(this, 2));
    }

    public final void a(MotionEvent motionEvent) {
        float x10;
        float y10;
        float x11;
        float y11;
        float x12;
        float y12;
        m mVar;
        this.a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.i = motionEvent.getPointerId(0);
            this.k = SystemClock.elapsedRealtime();
        } else if (action == 1 || action == 3) {
            if (!this.h && SystemClock.elapsedRealtime() - this.k < 800 && (mVar = this.b.J) != null) {
                mVar.S();
            }
            this.i = -1;
        } else if (action == 6) {
            int action2 = (65280 & motionEvent.getAction()) >> 8;
            if (motionEvent.getPointerId(action2) == this.i) {
                int i10 = action2 == 0 ? 1 : 0;
                this.i = motionEvent.getPointerId(i10);
                this.c = motionEvent.getX(i10);
                this.d = motionEvent.getY(i10);
            }
        }
        int i11 = this.i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 == 1) {
                if (this.h) {
                    if (this.g != null) {
                        try {
                            x12 = motionEvent.getX(this.j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.c = x12;
                        try {
                            y12 = motionEvent.getY(this.j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.g.addMovement(motionEvent);
                        this.g.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (Math.max(Math.abs(this.g.getXVelocity()), Math.abs(this.g.getYVelocity())) >= this.f) {
                            this.b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker = this.g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.g = null;
                }
                this.l = false;
                return;
            }
            if (action3 != 2) {
                if (action3 != 3) {
                    return;
                }
                VelocityTracker velocityTracker2 = this.g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.g = null;
                }
                this.l = false;
                this.h = false;
                return;
            }
        }
        if (!this.l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.c = x11;
            try {
                y11 = motionEvent.getY(this.j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x10 - this.c;
        float f11 = y10 - this.d;
        if (!this.h) {
            this.h = ((float) Math.sqrt((double) ((f11 * f11) + (f10 * f10)))) >= this.e;
        }
        if (this.h) {
            n nVar = this.b;
            if (!nVar.C) {
                l.f(nVar.I, f10, f11);
                nVar.r(false);
            }
            this.c = x10;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
