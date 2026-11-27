// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t12 extends FragmentContextView {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ x12 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t12(x12 x12Var, Context context, e eVar, FrameLayout frameLayout, vnb vnbVar, FrameLayout frameLayout2) {
        super(context, eVar, frameLayout, false, vnbVar);
        this.Y0 = x12Var;
        this.X0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        this.Y0.y.j(this.X0, i == 0, true);
    }
}
