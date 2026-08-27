package ug;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import f2.o1;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f extends e {
    public final /* synthetic */ i h;

    public f(i iVar) {
        this.h = iVar;
        this.e = -1;
    }

    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
        d dVar = new d(viewGroup.getContext());
        dVar.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        c cVar = new c(dVar);
        i iVar = this.h;
        View view = iVar.U0;
        RenderNode renderNode = iVar.S0;
        float f10 = iVar.T0;
        d dVar2 = cVar.v;
        dVar2.C = view;
        dVar2.A = renderNode;
        dVar2.B = f10;
        dVar2.setDelegate(iVar.W0);
        return cVar;
    }
}
