// default package

import android.text.TextUtils;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rn7 implements p8c {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ u41 b;
    public final /* synthetic */ u41 c;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth d;
    public final /* synthetic */ fx0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ TLRPC.UrlAuthResult h;
    public final /* synthetic */ String[] i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ hv0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ wjb m;

    public /* synthetic */ rn7(int[] iArr, u41 u41Var, u41 u41Var2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, fx0 fx0Var, boolean z, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z2, hv0 hv0Var, String str2, wjb wjbVar) {
        this.a = iArr;
        this.b = u41Var;
        this.c = u41Var2;
        this.d = tL_messages_requestUrlAuth;
        this.e = fx0Var;
        this.f = z;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z2;
        this.k = hv0Var;
        this.l = str2;
        this.m = wjbVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        int[] iArr = this.a;
        u41 u41Var = this.b;
        u41 u41Var2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final fx0 fx0Var = this.e;
        final boolean z = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z2 = this.j;
        final hv0 hv0Var = this.k;
        final String str2 = this.l;
        final wjb wjbVar = this.m;
        final Integer num = (Integer) obj;
        byte b = 0;
        if (iArr[0] == num.intValue() || u41Var.R || u41Var2.R) {
            return;
        }
        final hd hdVar = new hd(3, null, a.b);
        hdVar.q(200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new hc(b), new i8c() { // from class: nn7
            @Override // i8c
            public final void a(Object obj2, Object obj3) {
                TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                hd.this.dismiss();
                fx0 fx0Var2 = fx0Var;
                if (urlAuthResult2 != null) {
                    fx0Var2.dismiss();
                    un7.b(z, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z2, hv0Var);
                } else if (tL_error != null) {
                    if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        ug8.u(fx0Var2.F, fx0Var2.J0, tL_error, false);
                        return;
                    }
                    fx0Var2.dismiss();
                    u21 a = un7.a();
                    String M0 = k96.M0(2131753125, null);
                    String str3 = str2;
                    a.I(R.raw.error, M0, TextUtils.isEmpty(str3) ? k96.M0(2131753126, null) : gl.L2(bkb.v0(bkb.wj, wjbVar), k96.a0(null, null, 2131753127, str3))).j();
                }
            }
        });
    }
}
