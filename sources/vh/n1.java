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
public final /* synthetic */ class n1 implements uk, ti {
    public final /* synthetic */ y1 a;
    public final /* synthetic */ li b;

    public /* synthetic */ n1(y1 y1Var, li liVar) {
        this.a = y1Var;
        this.b = liVar;
    }

    @Override // org.telegram.ui.Components.uk
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        y1 y1Var = this.a;
        y1Var.getClass();
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
        y1Var.M.Q1(pageblockmap);
        liVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ti
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.M.a2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
