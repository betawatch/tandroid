// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class py6 implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ py6(xy6 xy6Var, boolean z, oy6 oy6Var, String str, boolean z2) {
        this.d = xy6Var;
        this.b = z;
        this.e = oy6Var;
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
                xy6 xy6Var = (xy6) obj3;
                xy6Var.getClass();
                gl.d3(new zo6(xy6Var, this.b, (oy6) obj2, (String) obj, tL_error, tLObject, this.c));
                break;
            default:
                vqa vqaVar = (vqa) obj3;
                vqaVar.getClass();
                gl.d3(new zo6(vqaVar, tLObject, this.b, (TLRPC.Document) obj2, this.c, tL_error, (TL_stars.saveStarGift) obj));
                break;
        }
    }

    public /* synthetic */ py6(vqa vqaVar, boolean z, TLRPC.Document document, boolean z2, TL_stars.saveStarGift savestargift) {
        this.d = vqaVar;
        this.b = z;
        this.e = document;
        this.c = z2;
        this.f = savestargift;
    }
}
