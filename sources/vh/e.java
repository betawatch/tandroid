package vh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uk;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements uk, ti {
    public final /* synthetic */ p a;
    public final /* synthetic */ li b;

    public /* synthetic */ e(p pVar, li liVar) {
        this.a = pVar;
        this.b = liVar;
    }

    @Override // org.telegram.ui.Components.uk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        p pVar = this.a;
        pVar.getClass();
        li liVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            liVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        pVar.r.R1(pageblockmap);
        pVar.V(true);
        liVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ti
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.r.b2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
