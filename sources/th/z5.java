package th;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    public z2 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(q qVar, Context context) {
        super(context);
        this.e = qVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.a.setIsVisible(z10);
            this.e.A();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            super.dispatchDraw(canvas);
        }
    }
}
