// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
