// default package

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe9 implements m52, p22 {
    public final /* synthetic */ jf9 a;
    public final /* synthetic */ i22 b;

    public /* synthetic */ xe9(jf9 jf9Var, i22 i22Var) {
        this.a = jf9Var;
        this.b = i22Var;
    }

    @Override // m52
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        i22 i22Var = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            i22Var.a(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        this.a.Q.N1(pageblockmap);
        i22Var.a(true);
    }

    @Override // p22
    public final void f(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.Q.W1((k47) arrayList.get(0));
        }
        this.b.a(true);
    }
}
