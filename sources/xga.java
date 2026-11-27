// default package

import android.content.Context;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xga extends FragmentContextView {
    public final /* synthetic */ eja X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xga(eja ejaVar, Context context, e eVar, eja ejaVar2, vnb vnbVar) {
        super(context, eVar, ejaVar2, false, vnbVar);
        this.X0 = ejaVar;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        eja ejaVar = this.X0;
        ejaVar.S0.j(ejaVar.T0, i == 0, true);
    }
}
