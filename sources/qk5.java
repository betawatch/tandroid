// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
