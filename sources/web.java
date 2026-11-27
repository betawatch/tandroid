// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class web extends d79 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ zeb h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public web(zeb zebVar, Context context) {
        super(context, null);
        this.h3 = zebVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void n0(int i) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        h8b h8bVar = this.h3.d;
        if (h8bVar != null) {
            h8bVar.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        pw2 previewDelegate;
        rw2 e = rw2.e();
        zeb zebVar = this.h3;
        web webVar = zebVar.e;
        previewDelegate = zebVar.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || e.g(motionEvent, webVar, previewDelegate, this.o2);
    }
}
