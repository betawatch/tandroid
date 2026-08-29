package wg;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e extends d {
    public final /* synthetic */ h h;

    public e(h hVar) {
        this.h = hVar;
        this.e = -1;
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.U0;
        RenderNode renderNode = hVar.S0;
        float f9 = hVar.T0;
        c cVar2 = bVar.v;
        cVar2.C = view;
        cVar2.A = renderNode;
        cVar2.B = f9;
        cVar2.setDelegate(hVar.W0);
        return bVar;
    }
}
