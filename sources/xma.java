// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class xma extends wma {
    public Activity g0;
    public final Rect h0;
    public int i0;
    public boolean j0;

    public xma(Context context, Activity activity) {
        super(context, null);
        this.h0 = new Rect();
        setActivity(activity);
    }

    @Override // wma
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.h0;
        getWindowVisibleDisplayFrame(rect);
        if (this.j0) {
            return ((rootView.getHeight() - (rect.top != 0 ? hl.m : 0)) - hl.o1(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.g0.getWindow().getDecorView().getHeight() - hl.o1(rootView)) - rootView.getBottom();
        if (height <= Math.max(hl.L(10.0f), hl.m)) {
            return 0;
        }
        return height;
    }

    @Override // wma
    public void R() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.i0 = Q();
        Point point = hl.q;
        post(new q38((byte) 16, (Object) this, point.x > point.y));
    }

    @Override // wma
    public int getKeyboardHeight() {
        return this.i0;
    }

    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        R();
    }

    public void setActivity(Activity activity) {
        this.g0 = activity;
    }

    public void setWithoutWindow(boolean z) {
        this.j0 = z;
    }
}
