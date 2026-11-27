// default package

import android.text.TextUtils;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rq7 implements pcc {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ c51 b;
    public final /* synthetic */ c51 c;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth d;
    public final /* synthetic */ nx0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ TLRPC.UrlAuthResult h;
    public final /* synthetic */ String[] i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ rv0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ vnb m;

    public /* synthetic */ rq7(int[] iArr, c51 c51Var, c51 c51Var2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, nx0 nx0Var, boolean z, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z2, rv0 rv0Var, String str2, vnb vnbVar) {
        this.a = iArr;
        this.b = c51Var;
        this.c = c51Var2;
        this.d = tL_messages_requestUrlAuth;
        this.e = nx0Var;
        this.f = z;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z2;
        this.k = rv0Var;
        this.l = str2;
        this.m = vnbVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        int[] iArr = this.a;
        c51 c51Var = this.b;
        c51 c51Var2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final nx0 nx0Var = this.e;
        final boolean z = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z2 = this.j;
        final rv0 rv0Var = this.k;
        final String str2 = this.l;
        final vnb vnbVar = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] == num.intValue() || c51Var.R || c51Var2.R) {
            return;
        }
        final id idVar = new id(3, null, a.b);
        idVar.q(200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new ic((byte) 0), new icc() { // from class: nq7
            @Override // icc
            public final void a(Object obj2, Object obj3) {
                TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                id.this.dismiss();
                nx0 nx0Var2 = nx0Var;
                if (urlAuthResult2 != null) {
                    nx0Var2.dismiss();
                    uq7.b(z, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z2, rv0Var);
                } else if (tL_error != null) {
                    if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        ik8.u(nx0Var2.F, nx0Var2.J0, tL_error, false);
                        return;
                    }
                    nx0Var2.dismiss();
                    d31 a = uq7.a();
                    String M0 = ob6.M0(2131753121, null);
                    String str3 = str2;
                    a.I(R.raw.error, M0, TextUtils.isEmpty(str3) ? ob6.M0(2131753122, null) : hl.L2(aob.v0(aob.xj, vnbVar), ob6.a0(null, null, 2131753123, str3))).j();
                }
            }
        });
    }
}
