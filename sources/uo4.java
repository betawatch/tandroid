// default package

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class uo4 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public to4 e;
    public to4 f;
    public boolean h;
    public int n;
    public final int[] r = new int[2];

    public uo4(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        to4 to4Var = this.f;
        View view = this.d;
        if (to4Var != null) {
            view.removeCallbacks(to4Var);
        }
        to4 to4Var2 = this.e;
        if (to4Var2 != null) {
            view.removeCallbacks(to4Var2);
        }
    }

    public abstract oka b();

    public abstract boolean c();

    public boolean d() {
        oka b = b();
        if (b == null || !b.a()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r14 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r4 != 3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        vr3 d;
        boolean z2 = this.h;
        View view2 = this.d;
        if (z2) {
            oka b = b();
            if (b != null && b.a() && (d = b.d()) != null && d.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.r;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                d.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b2 = d.b(this.n, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b2) {
                }
            }
            if (d()) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.n);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.a;
                                float f2 = -f;
                                if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z = true;
                                        if (z) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.n = motionEvent.getPointerId(0);
                    to4 to4Var = this.e;
                    if (to4Var == null) {
                        to4Var = new to4(this, (byte) 0);
                        this.e = to4Var;
                    }
                    view2.postDelayed(to4Var, this.b);
                    to4 to4Var2 = this.f;
                    if (to4Var2 == null) {
                        to4Var2 = new to4(this, (byte) 1);
                        this.f = to4Var2;
                    }
                    view2.postDelayed(to4Var2, this.c);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.h = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.n = -1;
        to4 to4Var = this.e;
        if (to4Var != null) {
            this.d.removeCallbacks(to4Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
