// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
