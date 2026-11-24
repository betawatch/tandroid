// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t1c extends o39 {
    public final /* synthetic */ a2c f3;
    public final /* synthetic */ d2c g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1c(d2c d2cVar, Context context, a2c a2cVar) {
        super(context, null);
        this.g3 = d2cVar;
        this.f3 = a2cVar;
    }

    @Override // o39
    public final boolean F0(float f) {
        return f >= ((float) (gl.L(58.0f) + this.g3.F));
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.f3.d(this, motionEvent);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.I) {
            return;
        }
        super.requestLayout();
    }
}
