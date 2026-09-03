package wh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wk;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements wk, ui {
    public final /* synthetic */ z1 a;
    public final /* synthetic */ mi b;

    public /* synthetic */ n1(z1 z1Var, mi miVar) {
        this.a = z1Var;
        this.b = miVar;
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        z1 z1Var = this.a;
        z1Var.getClass();
        mi miVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            miVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        z1Var.M.Q1(pageblockmap);
        miVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ui
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.M.a2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
