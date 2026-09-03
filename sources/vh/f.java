package vh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uk;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements uk, ti {
    public final /* synthetic */ q a;
    public final /* synthetic */ li b;

    public /* synthetic */ f(q qVar, li liVar) {
        this.a = qVar;
        this.b = liVar;
    }

    @Override // org.telegram.ui.Components.uk
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        q qVar = this.a;
        qVar.getClass();
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
        qVar.r.Q1(pageblockmap);
        qVar.V(true);
        liVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ti
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.r.a2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
