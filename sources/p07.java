// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class p07 implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p07(x07 x07Var, boolean z, o07 o07Var, String str, boolean z2) {
        this.d = x07Var;
        this.b = z;
        this.e = o07Var;
        this.f = str;
        this.c = z2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                x07 x07Var = (x07) obj3;
                x07Var.getClass();
                gm.c3(new zq6(x07Var, this.b, (o07) obj2, (String) obj, tL_error, tLObject, this.c));
                break;
            default:
                wsa wsaVar = (wsa) obj3;
                wsaVar.getClass();
                gm.c3(new zq6(wsaVar, tLObject, this.b, (TLRPC.Document) obj2, this.c, tL_error, (TL_stars.saveStarGift) obj));
                break;
        }
    }

    public /* synthetic */ p07(wsa wsaVar, boolean z, TLRPC.Document document, boolean z2, TL_stars.saveStarGift savestargift) {
        this.d = wsaVar;
        this.b = z;
        this.e = document;
        this.c = z2;
        this.f = savestargift;
    }
}
