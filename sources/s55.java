// default package

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class s55 extends Paint {
    public final /* synthetic */ h75 a;

    public s55(h75 h75Var) {
        this.a = h75Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        super.setAlpha(i);
        ViewGroup viewGroup = this.a.b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
