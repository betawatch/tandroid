// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qk5 extends ActionBarLayout {
    public final /* synthetic */ m0 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk5(Activity activity, m0 m0Var) {
        super(activity, false);
        this.z1 = m0Var;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, wk5
    public final nx0 getBottomSheet() {
        return ((nx0[]) this.z1.b)[0];
    }
}
