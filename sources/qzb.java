// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qzb extends w39 {
    public Context c;
    public View d;
    public int e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.e++;
        this.d = view;
        g(1);
    }

    @Override // w39
    public final int b() {
        return 2;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return this.e;
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        return i == 0 ? new y29(new pzb(this.c, (byte) 0)) : new y29(this.d);
    }
}
