// default package

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class pm4 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public om4 e;
    public om4 f;
    public boolean h;
    public int n;
    public final int[] r = new int[2];

    public pm4(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        om4 om4Var = this.f;
        View view = this.d;
        if (om4Var != null) {
            view.removeCallbacks(om4Var);
        }
        om4 om4Var2 = this.e;
        if (om4Var2 != null) {
            view.removeCallbacks(om4Var2);
        }
    }

    public abstract vga b();

    public abstract boolean c();

    public boolean d() {
        vga b = b();
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
        er3 e;
        boolean z2 = this.h;
        View view2 = this.d;
        if (z2) {
            vga b = b();
            if (b != null && b.a() && (e = b.e()) != null && e.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.r;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                e.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b2 = e.b(this.n, obtainNoHistory);
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
                    om4 om4Var = this.e;
                    if (om4Var == null) {
                        om4Var = new om4(this, (byte) 0);
                        this.e = om4Var;
                    }
                    view2.postDelayed(om4Var, this.b);
                    om4 om4Var2 = this.f;
                    if (om4Var2 == null) {
                        om4Var2 = new om4(this, (byte) 1);
                        this.f = om4Var2;
                    }
                    view2.postDelayed(om4Var2, this.c);
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
        om4 om4Var = this.e;
        if (om4Var != null) {
            this.d.removeCallbacks(om4Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
