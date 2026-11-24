// default package

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rkb extends o39 {
    public final /* synthetic */ byte f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rkb(Context context) {
        super(context);
        this.f3 = (byte) 12;
    }

    @Override // o39
    public final Integer W0(int i) {
        switch (this.f3) {
            case 1:
                return 0;
            case 2:
                return 0;
            case 5:
                return 0;
            case 8:
                return 0;
            case 13:
                return 0;
            default:
                return super.W0(i);
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
            case 6:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    boolean z = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z);
                }
                break;
            case 11:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent2 = getParent().getParent();
                    boolean z2 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z2 = false;
                    }
                    parent2.requestDisallowInterceptTouchEvent(z2);
                }
                break;
            case 14:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.f3) {
            case 4:
                int size = View.MeasureSpec.getSize(i2);
                int b = (getAdapter().b() * gl.L(50.0f)) + gl.L(4.0f);
                if (b <= size) {
                    size = b;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            case 9:
                int size2 = View.MeasureSpec.getSize(i2);
                int b2 = (getAdapter().b() * gl.L(50.0f)) + gl.L(4.0f);
                if (b2 <= size2) {
                    size2 = b2;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 12:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        switch (this.f3) {
            case 3:
                rect.bottom = gl.L(60.0f) + rect.bottom;
                break;
            case 10:
                rect.bottom = gl.L(60.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        switch (this.f3) {
            case 7:
                return false;
            default:
                return super.requestFocus(i, rect);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void s0(View view, View view2) {
        switch (this.f3) {
            case 3:
                if (view instanceof le8) {
                    super.s0(view, view2);
                    break;
                }
                break;
            case 10:
                if (view instanceof le8) {
                    super.s0(view, view2);
                    break;
                }
                break;
            default:
                super.s0(view, view2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rkb(Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.f3 = b;
    }
}
