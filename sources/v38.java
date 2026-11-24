// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class v38 extends a {
    public final /* synthetic */ b48 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v38(b48 b48Var, Activity activity) {
        super(activity, null);
        this.G1 = b48Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        this.G1.b.invalidate();
    }
}
