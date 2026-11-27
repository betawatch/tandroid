// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class w6b extends FrameLayout {
    public o68 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ bcb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6b(bcb bcbVar, Context context) {
        super(context);
        this.e = bcbVar;
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
