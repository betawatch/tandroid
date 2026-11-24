// default package

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class p12 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ p12(ViewGroup viewGroup, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.b = i;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                s43 s43Var = (s43) this.c;
                p43 p43Var = s43Var.r;
                if (s43Var.n) {
                    s43Var.removeCallbacks(p43Var);
                }
                s43Var.n = true;
                s43Var.postDelayed(p43Var, 200L);
                s43Var.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        cv0 cv0Var;
        byte b = this.a;
        ViewGroup viewGroup = this.c;
        switch (b) {
            case 0:
                r12 r12Var = (r12) viewGroup;
                if (r12Var.d || !r12Var.N) {
                    return false;
                }
                if (r12Var.K && !r12Var.M) {
                    return false;
                }
                if (r12Var.O && !r12Var.b(false)) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float x2 = motionEvent2.getX();
                float y2 = motionEvent2.getY();
                Typeface typeface = gl.a;
                float f3 = x2 - x;
                float f4 = y2 - y;
                float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f2 >= gl.L(650.0f) && ((sqrt > gl.L(200.0f) || eventTime > 250.0f) && ((cv0Var = r12Var.y) == null || cv0Var.getScrollY() == 0))) {
                    r12Var.x = true;
                    float f5 = r12Var.r;
                    if (f5 < r12Var.I && !r12Var.K) {
                        r12Var.d(0.0f);
                    } else if (r12Var.K && r12Var.M && (r12Var.R == (-r12Var.f) + r12Var.e || (f5 <= (-r7) && f2 < gl.L(1200.0f)))) {
                        r12Var.d((-r12Var.f) + r12Var.e);
                    } else {
                        q12 q12Var = r12Var.G;
                        if (q12Var != null) {
                            q12Var.d(false);
                        }
                    }
                } else {
                    if (f2 > -700.0f) {
                        return false;
                    }
                    float f6 = r12Var.r;
                    float f7 = (-r12Var.f) + r12Var.e;
                    if (f6 <= f7) {
                        return false;
                    }
                    r12Var.x = true;
                    r12Var.d(f7);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
            case 2:
                rf8 rf8Var = (rf8) viewGroup;
                if (!rf8Var.f && !rf8Var.h && f >= 600.0f) {
                    rf8Var.e = false;
                    rf8Var.h = false;
                    rf8Var.a(0.0f, f / 6000.0f);
                }
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0195, code lost:
    
        if (r6.canScrollHorizontally(r19 >= 0.0f ? 1 : -1) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ac, code lost:
    
        r0.d = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01aa, code lost:
    
        if ((java.lang.Math.abs(r19) * 1.5f) >= java.lang.Math.abs(r1)) goto L101;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        cv0 cv0Var;
        MotionEvent motionEvent3;
        byte b = this.a;
        int i = this.b;
        ViewGroup viewGroup = this.c;
        int i2 = 0;
        switch (b) {
            case 0:
                r12 r12Var = (r12) viewGroup;
                if (r12Var.T) {
                    f3 = f2;
                } else {
                    float f4 = r12Var.S + f2;
                    r12Var.S = f4;
                    float abs = Math.abs(f4);
                    float f5 = r12Var.U;
                    if (abs > f5) {
                        r12Var.T = true;
                        float f6 = r12Var.S;
                        f3 = f6 > 0.0f ? f6 - f5 : f6 + f5;
                    } else {
                        f3 = 0.0f;
                    }
                }
                if (!r12Var.c && !r12Var.d && r12Var.N && (!r12Var.O || r12Var.r != (-r12Var.f) + r12Var.e || r12Var.b(false))) {
                    if (((Boolean) r12Var.J.m(null)).booleanValue() && r12Var.r == (-r12Var.f) + r12Var.e) {
                        r12Var.d = true;
                    } else {
                        float f7 = i;
                        if (Math.abs(f3) >= f7 && Math.abs(f3) * 1.5f >= Math.abs(f) && (r12Var.r != (-r12Var.f) + r12Var.e || (cv0Var = r12Var.y) == null || (f3 < 0.0f && cv0Var.getScrollY() == 0))) {
                            r12Var.c = true;
                            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            while (i2 < r12Var.getChildCount()) {
                                r12Var.getChildAt(i2).dispatchTouchEvent(obtain);
                                i2++;
                            }
                            obtain.recycle();
                            return true;
                        }
                        cv0 cv0Var2 = r12Var.y;
                        if (cv0Var2 != null) {
                            break;
                        }
                        if (Math.abs(f) >= f7) {
                            break;
                        }
                    }
                }
                if (r12Var.c) {
                    if (f3 < 0.0f) {
                        float f8 = r12Var.r;
                        if (f8 > (-r12Var.f) + r12Var.e) {
                            r12Var.r = f8 - f3;
                        } else {
                            if (r12Var.y != null) {
                                float scrollY = r5.getScrollY() + f3;
                                r12Var.y.setScrollY((int) moe.a(scrollY, 0.0f, Math.max(r1.getContentHeight(), r12Var.y.getHeight()) - r12Var.e));
                                if (scrollY < 0.0f) {
                                    r12Var.r -= scrollY;
                                }
                            } else {
                                r12Var.r = f8 - f3;
                            }
                        }
                    } else if (f3 > 0.0f) {
                        float f9 = r12Var.r - f3;
                        r12Var.r = f9;
                        if (r12Var.y != null && f9 < (-r12Var.f) + r12Var.e) {
                            float scrollY2 = r1.getScrollY() - ((r12Var.r + r12Var.f) - r12Var.e);
                            r12Var.y.setScrollY((int) moe.a(scrollY2, 0.0f, Math.max(r3.getContentHeight(), r12Var.y.getHeight()) - r12Var.e));
                        }
                    }
                    float a = moe.a(r12Var.r, (-r12Var.f) + r12Var.e, (r12Var.getHeight() - r12Var.f) + r12Var.e);
                    r12Var.r = a;
                    if (r12Var.K && !r12Var.M) {
                        r12Var.r = Math.min(a, (-r12Var.f) + r12Var.e);
                    }
                    r12Var.c();
                }
                return true;
            case 1:
                s43 s43Var = (s43) viewGroup;
                if (s43Var.n || s43Var.f) {
                    float f10 = i;
                    if (Math.abs(f) >= f10 || Math.abs(f2) >= f10) {
                        s43Var.n = false;
                        s43Var.f = false;
                        s43Var.removeCallbacks(s43Var.r);
                        s43Var.removeCallbacks(s43Var.h);
                    }
                }
                return false;
            default:
                rf8 rf8Var = (rf8) viewGroup;
                if (rf8Var.e || rf8Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (rf8Var.E || rf8Var.b != 1.0f || f > (-i) || Math.abs(f) < Math.abs(1.5f * f2)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!rf8Var.d(rf8Var.getChildAt(rf8Var.b > 0.5f ? 1 : 0), motionEvent3)) {
                            rf8Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            while (i2 < rf8Var.getChildCount()) {
                                rf8Var.getChildAt(i2).dispatchTouchEvent(obtain2);
                                i2++;
                            }
                            obtain2.recycle();
                        }
                    }
                    rf8Var.h = true;
                }
                if (rf8Var.e) {
                    rf8Var.c = -1.0f;
                    rf8Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / rf8Var.getWidth()));
                    rf8Var.c(true);
                }
                return rf8Var.e;
        }
    }
}
