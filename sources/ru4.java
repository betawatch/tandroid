// default package

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ru4 {
    public static final int x;
    public static final int y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final d1 f;
    public final qu4 g;
    public pu4 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public MotionEvent n;
    public MotionEvent o;
    public MotionEvent p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public VelocityTracker w;

    static {
        ViewConfiguration.getLongPressTimeout();
        x = ViewConfiguration.getTapTimeout();
        y = ViewConfiguration.getDoubleTapTimeout();
    }

    public ru4(Context context, qu4 qu4Var) {
        int scaledTouchSlop;
        int i;
        int i2;
        this.f = new d1(this, (byte) 4);
        this.g = qu4Var;
        if (qu4Var instanceof pu4) {
            this.h = (pu4) qu4Var;
        }
        this.v = true;
        if (context == null) {
            i = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.e = ViewConfiguration.getMaximumFlingVelocity();
            i2 = 100;
            scaledTouchSlop = i;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.e = viewConfiguration.getScaledMaximumFlingVelocity();
            i = scaledTouchSlop2;
            i2 = scaledDoubleTapSlop;
        }
        this.a = i * i;
        this.b = scaledTouchSlop * scaledTouchSlop;
        this.c = i2 * i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0411, code lost:
    
        if (java.lang.Math.sqrt(java.lang.Math.pow(((r2.y + hl.m) / 2.0f) - r4.getY(), 2.0d) + java.lang.Math.pow((r2.x / 2.0f) - r4.getX(), 2.0d)) < hl.L(40.0f)) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x046d, code lost:
    
        if (r2 > r5) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x047a, code lost:
    
        if (r4 > r5) goto L229;
     */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        long j;
        long j2;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent4;
        boolean z4;
        nc8 nc8Var;
        r47 r47Var;
        nc8 nc8Var2;
        pu4 pu4Var;
        boolean z5;
        boolean onScroll;
        int i;
        int i2;
        boolean z6;
        int action = motionEvent.getAction();
        MotionEvent motionEvent5 = this.o;
        if (motionEvent5 != null) {
            motionEvent5.recycle();
        }
        this.o = MotionEvent.obtain(motionEvent);
        VelocityTracker velocityTracker = this.w;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.w = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int i3 = action & jn7.d4;
        boolean z7 = i3 == 6;
        int actionIndex = z7 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                f += motionEvent.getX(i4);
                f2 += motionEvent.getY(i4);
            }
        }
        float f3 = z7 ? pointerCount - 1 : pointerCount;
        float f4 = f / f3;
        float f5 = f2 / f3;
        qu4 qu4Var = this.g;
        d1 d1Var = this.f;
        if (i3 != 0) {
            int i5 = this.e;
            if (i3 == 1) {
                boolean z8 = false;
                this.i = false;
                qu4Var.H();
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (!this.q) {
                    if (this.k) {
                        d1Var.removeMessages(3);
                        this.k = false;
                    } else if (this.l) {
                        boolean onSingleTapUp = qu4Var.onSingleTapUp(motionEvent);
                        if (this.j && (pu4Var = this.h) != null) {
                            ((PhotoViewer) pu4Var).f1(motionEvent);
                        }
                        z8 = onSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker2 = this.w;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker2.computeCurrentVelocity(1000, i5);
                        float yVelocity = velocityTracker2.getYVelocity(pointerId);
                        float xVelocity = velocityTracker2.getXVelocity(pointerId);
                        float abs = Math.abs(yVelocity);
                        int i6 = this.d;
                        if (abs > i6 || Math.abs(xVelocity) > i6) {
                            z8 = qu4Var.onFling(this.n, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    z8 = false;
                }
                MotionEvent motionEvent6 = this.p;
                if (motionEvent6 != null) {
                    motionEvent6.recycle();
                }
                this.p = obtain;
                VelocityTracker velocityTracker3 = this.w;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.w = null;
                }
                this.q = false;
                this.j = false;
                d1Var.removeMessages(1);
                d1Var.removeMessages(2);
                return z8;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    d1Var.removeMessages(1);
                    d1Var.removeMessages(2);
                    d1Var.removeMessages(3);
                    this.w.recycle();
                    this.w = null;
                    this.q = false;
                    this.i = false;
                    this.l = false;
                    this.m = false;
                    this.j = false;
                    this.k = false;
                    return false;
                }
                if (i3 == 5) {
                    this.r = f4;
                    this.t = f4;
                    this.s = f5;
                    this.u = f5;
                    d1Var.removeMessages(1);
                    d1Var.removeMessages(2);
                    d1Var.removeMessages(3);
                    this.q = false;
                    this.l = false;
                    this.m = false;
                    this.j = false;
                    this.k = false;
                    return false;
                }
                if (i3 == 6) {
                    this.r = f4;
                    this.t = f4;
                    this.s = f5;
                    this.u = f5;
                    this.w.computeCurrentVelocity(1000, i5);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.w.getXVelocity(pointerId2);
                    float yVelocity2 = this.w.getYVelocity(pointerId2);
                    for (int i7 = 0; i7 < pointerCount; i7++) {
                        if (i7 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i7);
                            if ((this.w.getYVelocity(pointerId3) * yVelocity2) + (this.w.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                                this.w.clear();
                                return false;
                            }
                        }
                    }
                }
            } else if (!this.k) {
                int i8 = Build.VERSION.SDK_INT;
                int classification = i8 >= 29 ? motionEvent.getClassification() : 0;
                boolean hasMessages = d1Var.hasMessages(2);
                float f6 = this.r - f4;
                float f7 = this.s - f5;
                if (this.q) {
                    i = 29;
                    onScroll = false;
                    z5 = hasMessages;
                } else {
                    if (this.l) {
                        int i9 = (int) (f4 - this.t);
                        int i10 = (int) (f5 - this.u);
                        int i11 = (i10 * i10) + (i9 * i9);
                        boolean z9 = i8 >= 29 && classification == 1;
                        int i12 = this.a;
                        if (hasMessages && z9) {
                            if (i11 > i12) {
                                d1Var.removeMessages(2);
                                i2 = i11;
                                z5 = hasMessages;
                                d1Var.sendMessageDelayed(d1Var.obtainMessage(2, 0, 0), (long) (ViewConfiguration.getLongPressTimeout() * 2.0f));
                            } else {
                                i2 = i11;
                                z5 = hasMessages;
                            }
                            i12 = (int) (i12 * 4.0f);
                        } else {
                            i2 = i11;
                            z5 = hasMessages;
                        }
                        int i13 = i2;
                        if (i13 > i12) {
                            onScroll = qu4Var.onScroll(this.n, motionEvent, f6, f7);
                            this.r = f4;
                            this.s = f5;
                            z6 = false;
                            this.l = false;
                            d1Var.removeMessages(3);
                            d1Var.removeMessages(1);
                            d1Var.removeMessages(2);
                        } else {
                            z6 = false;
                            onScroll = false;
                        }
                        if (i13 > this.b) {
                            this.m = z6;
                        }
                    } else {
                        z5 = hasMessages;
                        if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                            onScroll = qu4Var.onScroll(this.n, motionEvent, f6, f7);
                            this.r = f4;
                            this.s = f5;
                        } else {
                            i = 29;
                            onScroll = false;
                        }
                    }
                    i = 29;
                }
                if (i8 >= i && classification == 2 && z5) {
                    d1Var.removeMessages(2);
                    d1Var.sendMessage(d1Var.obtainMessage(2, 0, 0));
                }
                return onScroll;
            }
            return false;
        }
        this.j = false;
        pu4 pu4Var2 = this.h;
        if (pu4Var2 != null) {
            PhotoViewer photoViewer = (PhotoViewer) pu4Var2;
            if (photoViewer.O0.getVisibility() != 0) {
                boolean[] zArr = photoViewer.x1;
                if (!zArr[0] && !zArr[1]) {
                    float x2 = motionEvent.getX();
                    if ((x2 < Math.min(135, photoViewer.f0.getMeasuredWidth() / 8) || x2 > photoViewer.f0.getMeasuredWidth() - r4) && (r47Var = photoViewer.S4) != null && ((!r47.K4(r47Var.k) && ((nc8Var2 = photoViewer.g0) == null || !nc8Var2.y)) || SystemClock.elapsedRealtime() - photoViewer.v1 < 500 || !photoViewer.i(motionEvent))) {
                        this.j = true;
                    }
                }
            }
            boolean hasMessages2 = d1Var.hasMessages(3);
            if (hasMessages2) {
                d1Var.removeMessages(3);
            }
            MotionEvent motionEvent7 = this.n;
            int i14 = y;
            if (motionEvent7 != null && (motionEvent3 = this.p) != null && hasMessages2 && this.m) {
                long eventTime = motionEvent.getEventTime() - motionEvent3.getEventTime();
                if (eventTime <= i14 && eventTime >= 40) {
                    int x3 = ((int) motionEvent7.getX()) - ((int) motionEvent.getX());
                    int y2 = ((int) motionEvent7.getY()) - ((int) motionEvent.getY());
                    if ((y2 * y2) + (x3 * x3) < this.c) {
                        this.q = true;
                        pu4 pu4Var3 = this.h;
                        MotionEvent motionEvent8 = this.n;
                        PhotoViewer photoViewer2 = (PhotoViewer) pu4Var3;
                        if ((photoViewer2.G2 != null || ((nc8Var = photoViewer2.g0) != null && nc8Var.y)) && photoViewer2.l3) {
                            long l0 = photoViewer2.l0();
                            j = 0;
                            long z0 = photoViewer2.z0();
                            float x4 = motionEvent8.getX();
                            int h0 = photoViewer2.h0(photoViewer2.t4) / 3;
                            float f8 = h0 << 1;
                            if (photoViewer2.i(motionEvent8)) {
                                long j3 = x4 >= f8 ? l0 + 10000 : x4 < ((float) h0) ? l0 - 10000 : l0;
                                if (l0 != j3) {
                                    if (j3 > z0) {
                                        j2 = z0;
                                    } else {
                                        if (j3 < 0) {
                                            z2 = j3 >= -9000;
                                            j2 = 0;
                                            if (z2) {
                                                photoViewer2.A1.c(true);
                                                photoViewer2.A1.b(x4 < ((float) h0));
                                                rec recVar = photoViewer2.A1;
                                                long j4 = recVar.o + 10000;
                                                recVar.o = j4;
                                                recVar.p = ob6.G((int) (j4 / 1000), "Seconds", new Object[0]);
                                                photoViewer2.C1(j2);
                                                photoViewer2.f0.invalidate();
                                                photoViewer2.q3.h(true, j2 / z0);
                                                photoViewer2.r3.invalidate();
                                            }
                                            z3 = true;
                                            this.h.getClass();
                                            z = z3;
                                            this.r = f4;
                                            this.t = f4;
                                            this.s = f5;
                                            this.u = f5;
                                            motionEvent2 = this.n;
                                            if (motionEvent2 != null) {
                                                motionEvent2.recycle();
                                            }
                                            this.n = MotionEvent.obtain(motionEvent);
                                            this.l = true;
                                            this.m = true;
                                            this.i = true;
                                            this.k = false;
                                            if (this.v) {
                                                d1Var.removeMessages(2);
                                                d1Var.sendMessageDelayed(d1Var.obtainMessage(2, 0, 0), ViewConfiguration.getLongPressTimeout());
                                            }
                                            d1Var.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                                            return z | qu4Var.onDown(motionEvent);
                                        }
                                        j2 = j3;
                                    }
                                    z2 = true;
                                    if (z2) {
                                    }
                                    z3 = true;
                                    this.h.getClass();
                                    z = z3;
                                    this.r = f4;
                                    this.t = f4;
                                    this.s = f5;
                                    this.u = f5;
                                    motionEvent2 = this.n;
                                    if (motionEvent2 != null) {
                                    }
                                    this.n = MotionEvent.obtain(motionEvent);
                                    this.l = true;
                                    this.m = true;
                                    this.i = true;
                                    this.k = false;
                                    if (this.v) {
                                    }
                                    d1Var.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                                    return z | qu4Var.onDown(motionEvent);
                                }
                            }
                        } else {
                            j = 0;
                        }
                        if (photoViewer2.H6 && ((photoViewer2.Z5 != 1.0f || (photoViewer2.X5 == 0.0f && photoViewer2.W5 == 0.0f)) && photoViewer2.m6 == j && photoViewer2.m4 == 0)) {
                            lb8 lb8Var = photoViewer2.X0[0];
                            if (lb8Var == null || !lb8Var.p || lb8Var.h == -1) {
                                motionEvent4 = motionEvent8;
                            } else {
                                Point point = hl.q;
                                motionEvent4 = motionEvent8;
                            }
                            if (photoViewer2.Z5 == 1.0f) {
                                float x5 = uh9.x(3.0f, photoViewer2.Z5, (motionEvent4.getX() - (photoViewer2.h0(photoViewer2.t4) / 2)) - photoViewer2.W5, motionEvent4.getX() - (photoViewer2.h0(photoViewer2.t4) / 2));
                                float x6 = uh9.x(3.0f, photoViewer2.Z5, (motionEvent4.getY() - (photoViewer2.f0() / 2)) - photoViewer2.X5, motionEvent4.getY() - (photoViewer2.f0() / 2));
                                photoViewer2.I2(3.0f);
                                float f9 = photoViewer2.D6;
                                if (x5 >= f9) {
                                    f9 = photoViewer2.E6;
                                }
                                x5 = f9;
                                float f10 = photoViewer2.F6;
                                if (x6 >= f10) {
                                    f10 = photoViewer2.G6;
                                }
                                x6 = f10;
                                z4 = true;
                                photoViewer2.b(3.0f, x5, x6, true);
                            } else {
                                z4 = true;
                                photoViewer2.b(1.0f, 0.0f, 0.0f, true);
                            }
                            photoViewer2.N6 = z4;
                            photoViewer2.E0();
                            z3 = true;
                            this.h.getClass();
                            z = z3;
                            this.r = f4;
                            this.t = f4;
                            this.s = f5;
                            this.u = f5;
                            motionEvent2 = this.n;
                            if (motionEvent2 != null) {
                            }
                            this.n = MotionEvent.obtain(motionEvent);
                            this.l = true;
                            this.m = true;
                            this.i = true;
                            this.k = false;
                            if (this.v) {
                            }
                            d1Var.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                            return z | qu4Var.onDown(motionEvent);
                        }
                        z3 = false;
                        this.h.getClass();
                        z = z3;
                        this.r = f4;
                        this.t = f4;
                        this.s = f5;
                        this.u = f5;
                        motionEvent2 = this.n;
                        if (motionEvent2 != null) {
                        }
                        this.n = MotionEvent.obtain(motionEvent);
                        this.l = true;
                        this.m = true;
                        this.i = true;
                        this.k = false;
                        if (this.v) {
                        }
                        d1Var.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                        return z | qu4Var.onDown(motionEvent);
                    }
                }
            }
            d1Var.sendEmptyMessageDelayed(3, i14);
        }
        z = false;
        this.r = f4;
        this.t = f4;
        this.s = f5;
        this.u = f5;
        motionEvent2 = this.n;
        if (motionEvent2 != null) {
        }
        this.n = MotionEvent.obtain(motionEvent);
        this.l = true;
        this.m = true;
        this.i = true;
        this.k = false;
        if (this.v) {
        }
        d1Var.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
        return z | qu4Var.onDown(motionEvent);
    }

    public ru4(Context context, PhotoViewer photoViewer) {
        this(context, (qu4) photoViewer);
    }
}
