// default package

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sk8 extends Scroller {
    public final /* synthetic */ tk8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk8(tk8 tk8Var, Context context) {
        super(context);
        this.a = tk8Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, i5 * (this.a.y0 ? 3 : 1));
    }
}
