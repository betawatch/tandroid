// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sxa extends dxa {
    public fo1 E;
    public final int w;
    public final int x;
    public int y;

    public sxa(Context context, int i, int i2, mf0 mf0Var, int i3) {
        super(context, i2, mf0Var, null);
        this.w = i;
        this.x = i3;
    }

    @Override // dxa
    public final void b(gxa gxaVar) {
        int i;
        if (gxaVar == null || (i = this.y) < 0) {
            return;
        }
        gxaVar.a(this.w, this.x, i, this.E);
    }
}
