// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t3c extends r59 {
    public final /* synthetic */ a4c f3;
    public final /* synthetic */ d4c g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3c(d4c d4cVar, Context context, a4c a4cVar) {
        super(context, null);
        this.g3 = d4cVar;
        this.f3 = a4cVar;
    }

    @Override // r59
    public final boolean F0(float f) {
        return f >= ((float) (gm.L(58.0f) + this.g3.F));
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.f3.d(this, motionEvent);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.I) {
            return;
        }
        super.requestLayout();
    }
}
