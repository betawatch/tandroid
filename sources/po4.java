// default package

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class po4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qo4 b;

    public /* synthetic */ po4(qo4 qo4Var, byte b) {
        this.a = b;
        this.b = qo4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qo4 qo4Var = this.b;
        switch (b) {
            case 0:
                ViewParent parent = qo4Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                qo4Var.a();
                View view = qo4Var.d;
                if (view.isEnabled() && !view.isLongClickable() && qo4Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    qo4Var.h = true;
                    break;
                }
                break;
        }
    }
}
