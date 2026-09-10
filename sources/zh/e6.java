package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e6 extends FrameLayout {
    public a3 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ k7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(k7 k7Var, Context context) {
        super(context);
        this.e = k7Var;
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
