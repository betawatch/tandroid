package rh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.ok;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ok, oi {
    public final /* synthetic */ p a;
    public final /* synthetic */ gi b;

    public /* synthetic */ e(p pVar, gi giVar) {
        this.a = pVar;
        this.b = giVar;
    }

    @Override // org.telegram.ui.Components.ok
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        p pVar = this.a;
        pVar.getClass();
        gi giVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            giVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        pVar.r.R1(pageblockmap);
        pVar.V(true);
        giVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.oi
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.r.b2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
