// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yq5 extends mhb {
    public final /* synthetic */ zq5 E;
    public final ez3 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq5(zq5 zq5Var, Context context) {
        super(context);
        this.E = zq5Var;
        this.x = new ez3(this, (byte) 16);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ez3 ez3Var = this.x;
        gl.r(ez3Var);
        if (this.y) {
            gl.e3(ez3Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gl.r(this.x);
    }
}
