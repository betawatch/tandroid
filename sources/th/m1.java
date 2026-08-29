package th;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wk;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements wk, vi {
    public final /* synthetic */ x1 a;
    public final /* synthetic */ ni b;

    public /* synthetic */ m1(x1 x1Var, ni niVar) {
        this.a = x1Var;
        this.b = niVar;
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        x1 x1Var = this.a;
        x1Var.getClass();
        ni niVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            niVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        x1Var.L.R1(pageblockmap);
        niVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.vi
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.L.b2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
