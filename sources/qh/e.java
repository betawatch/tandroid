package qh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.sk;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements sk, si {
    public final /* synthetic */ p a;
    public final /* synthetic */ ki b;

    public /* synthetic */ e(p pVar, ki kiVar) {
        this.a = pVar;
        this.b = kiVar;
    }

    @Override // org.telegram.ui.Components.sk
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        p pVar = this.a;
        pVar.getClass();
        ki kiVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            kiVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        pVar.r.R1(pageblockmap);
        pVar.U(true);
        kiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.si
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.r.b2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
