// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class w07 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w07(e17 e17Var, boolean z, v07 v07Var, String str, boolean z2) {
        this.d = e17Var;
        this.b = z;
        this.e = v07Var;
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
                e17 e17Var = (e17) obj3;
                e17Var.getClass();
                hl.c3(new fr6(e17Var, this.b, (v07) obj2, (String) obj, tL_error, tLObject, this.c));
                break;
            default:
                wua wuaVar = (wua) obj3;
                wuaVar.getClass();
                hl.c3(new fr6(wuaVar, tLObject, this.b, (TLRPC.Document) obj2, this.c, tL_error, (TL_stars.saveStarGift) obj));
                break;
        }
    }

    public /* synthetic */ w07(wua wuaVar, boolean z, TLRPC.Document document, boolean z2, TL_stars.saveStarGift savestargift) {
        this.d = wuaVar;
        this.b = z;
        this.e = document;
        this.c = z2;
        this.f = savestargift;
    }
}
