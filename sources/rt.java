// default package

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rt implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rt(c01 c01Var, hd[] hdVarArr, int i, Uri uri, Context context, boolean z) {
        this.d = c01Var;
        this.e = hdVarArr;
        this.b = i;
        this.f = uri;
        this.g = context;
        this.c = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                gl.c3(new ft((o) obj4, tLObject, this.b, (TLRPC.WebPage) obj3, (k27) obj2, this.c, (String) obj));
                break;
            default:
                gl.c3(new ft((c01) obj4, (hd[]) obj3, tLObject, this.b, (Uri) obj2, (Context) obj, this.c));
                break;
        }
    }

    public /* synthetic */ rt(o oVar, int i, TLRPC.WebPage webPage, k27 k27Var, boolean z, String str) {
        this.d = oVar;
        this.b = i;
        this.e = webPage;
        this.f = k27Var;
        this.c = z;
        this.g = str;
    }
}
