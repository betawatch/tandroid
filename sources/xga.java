// default package

import android.content.Context;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
