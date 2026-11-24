// default package

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc9 implements b42, e12 {
    public final /* synthetic */ hd9 a;
    public final /* synthetic */ x02 b;

    public /* synthetic */ wc9(hd9 hd9Var, x02 x02Var) {
        this.a = hd9Var;
        this.b = x02Var;
    }

    @Override // b42
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        x02 x02Var = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            x02Var.a(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        this.a.Q.N1(pageblockmap);
        x02Var.a(true);
    }

    @Override // e12
    public final void g(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.Q.W1((k27) arrayList.get(0));
        }
        this.b.a(true);
    }
}
