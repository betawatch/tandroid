package wf;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.yf0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        this.a = new ScaleGestureDetector(context, new yf0(this, 2));
    }

    public final void a(MotionEvent motionEvent) {
        float x4;
        float y8;
        float x10;
        float y10;
        float x11;
        float y11;
        m mVar;
        this.a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.i = motionEvent.getPointerId(0);
            this.k = SystemClock.elapsedRealtime();
        } else if (action == 1 || action == 3) {
            if (!this.h && SystemClock.elapsedRealtime() - this.k < 800 && (mVar = this.b.I) != null) {
                mVar.R();
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
                            x11 = motionEvent.getX(this.j);
                        } catch (Exception unused) {
                            x11 = motionEvent.getX();
                        }
                        this.c = x11;
                        try {
                            y11 = motionEvent.getY(this.j);
                        } catch (Exception unused2) {
                            y11 = motionEvent.getY();
                        }
                        this.d = y11;
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
                x10 = motionEvent.getX(this.j);
            } catch (Exception unused3) {
                x10 = motionEvent.getX();
            }
            this.c = x10;
            try {
                y10 = motionEvent.getY(this.j);
            } catch (Exception unused4) {
                y10 = motionEvent.getY();
            }
            this.d = y10;
            this.h = false;
            this.l = true;
            return;
        }
        try {
            x4 = motionEvent.getX(this.j);
        } catch (Exception unused5) {
            x4 = motionEvent.getX();
        }
        try {
            y8 = motionEvent.getY(this.j);
        } catch (Exception unused6) {
            y8 = motionEvent.getY();
        }
        float f9 = x4 - this.c;
        float f10 = y8 - this.d;
        if (!this.h) {
            this.h = ((float) Math.sqrt((double) ((f10 * f10) + (f9 * f9)))) >= this.e;
        }
        if (this.h) {
            n nVar = this.b;
            if (!nVar.B) {
                l.f(nVar.H, f9, f10);
                nVar.r(false);
            }
            this.c = x4;
            this.d = y8;
            VelocityTracker velocityTracker3 = this.g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
