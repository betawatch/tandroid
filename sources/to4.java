// default package

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class to4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uo4 b;

    public /* synthetic */ to4(uo4 uo4Var, byte b) {
        this.a = b;
        this.b = uo4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        uo4 uo4Var = this.b;
        switch (b) {
            case 0:
                ViewParent parent = uo4Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                uo4Var.a();
                View view = uo4Var.d;
                if (view.isEnabled() && !view.isLongClickable() && uo4Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    uo4Var.h = true;
                    break;
                }
                break;
        }
    }
}
