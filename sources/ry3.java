// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ry3 extends de0 {
    public final /* synthetic */ uy3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry3(uy3 uy3Var, Context context) {
        super(context);
        this.H = uy3Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ri5.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (ri5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
