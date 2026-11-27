// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class w6b extends FrameLayout {
    public o68 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ acb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6b(acb acbVar, Context context) {
        super(context);
        this.e = acbVar;
    }

    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            invalidate();
            this.a.setIsVisible(z);
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
