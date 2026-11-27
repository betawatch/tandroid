// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
