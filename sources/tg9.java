// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class tg9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ch9 e;

    public tg9(ch9 ch9Var, int i, int i2, int i3, int i4) {
        this.e = ch9Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final TL_iv.RichMessage a() {
        ch9 ch9Var = this.e;
        ArrayList arrayList = ch9Var.t3;
        int i = this.a;
        ll0 ll0Var = (ll0) arrayList.get(i);
        ArrayList arrayList2 = ch9Var.t3;
        int i2 = this.b;
        ll0 ll0Var2 = (ll0) arrayList2.get(i2);
        TL_iv.PageBlock pageBlock = ll0Var.b;
        TL_iv.PageBlock pageBlock2 = ll0Var2.b;
        int i3 = this.d;
        TL_iv.PageBlock K4 = ch9Var.K4(ll0Var, this.c, i == i2 ? i3 : -1);
        TL_iv.PageBlock K42 = i == i2 ? null : ch9Var.K4(ll0Var2, 0, i3);
        if (K4 != null) {
            ll0Var.b = K4;
        }
        if (K42 != null) {
            ll0Var2.b = K42;
        }
        try {
            ArrayList<TL_iv.PageBlock> U2 = ch9Var.U2(i, i2 + 1, 0, false);
            ArrayList<TLRPC.Photo> w2 = ch9Var.w2(i, i2);
            ArrayList<TLRPC.Document> v2 = ch9Var.v2(i, i2);
            ll0Var.b = pageBlock;
            ll0Var2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = U2;
            richMessage.photos = w2;
            richMessage.documents = v2;
            return richMessage;
        } catch (Throwable th) {
            ll0Var.b = pageBlock;
            ll0Var2.b = pageBlock2;
            throw th;
        }
    }
}
