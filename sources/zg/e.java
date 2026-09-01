package zg;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import f2.m1;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e extends d {
    public final /* synthetic */ h h;

    public e(h hVar) {
        this.h = hVar;
        this.e = -1;
    }

    @Override // f2.p0
    public final m1 x(ViewGroup viewGroup, int i10) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.V0;
        RenderNode renderNode = hVar.T0;
        float f10 = hVar.U0;
        c cVar2 = bVar.v;
        cVar2.D = view;
        cVar2.B = renderNode;
        cVar2.C = f10;
        cVar2.setDelegate(hVar.X0);
        return bVar;
    }
}
