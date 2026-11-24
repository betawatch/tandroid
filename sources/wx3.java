// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wx3 extends be0 {
    public final /* synthetic */ zx3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx3(zx3 zx3Var, Context context) {
        super(context);
        this.H = zx3Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (pg5.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (pg5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
