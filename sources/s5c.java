// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s5c extends d79 {
    public final /* synthetic */ z5c f3;
    public final /* synthetic */ d6c g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5c(d6c d6cVar, Context context, z5c z5cVar) {
        super(context, null);
        this.g3 = d6cVar;
        this.f3 = z5cVar;
    }

    @Override // d79
    public final boolean G0(float f) {
        return f >= ((float) (hl.L(58.0f) + this.g3.F));
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.f3.d(this, motionEvent);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.I) {
            return;
        }
        super.requestLayout();
    }
}
