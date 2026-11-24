// default package

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ru implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ru(k11 k11Var, he[] heVarArr, int i, Uri uri, Context context, boolean z) {
        this.d = k11Var;
        this.e = heVarArr;
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
                gm.c3(new gu((o) obj4, tLObject, this.b, (TLRPC.WebPage) obj3, (k47) obj2, this.c, (String) obj));
                break;
            default:
                gm.c3(new gu((k11) obj4, (he[]) obj3, tLObject, this.b, (Uri) obj2, (Context) obj, this.c));
                break;
        }
    }

    public /* synthetic */ ru(o oVar, int i, TLRPC.WebPage webPage, k47 k47Var, boolean z, String str) {
        this.d = oVar;
        this.b = i;
        this.e = webPage;
        this.f = k47Var;
        this.c = z;
        this.g = str;
    }
}
