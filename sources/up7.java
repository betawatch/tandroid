// default package

import android.text.TextUtils;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class up7 implements qac {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ b61 b;
    public final /* synthetic */ b61 c;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth d;
    public final /* synthetic */ my0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ TLRPC.UrlAuthResult h;
    public final /* synthetic */ String[] i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ qw0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ ylb m;

    public /* synthetic */ up7(int[] iArr, b61 b61Var, b61 b61Var2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, my0 my0Var, boolean z, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z2, qw0 qw0Var, String str2, ylb ylbVar) {
        this.a = iArr;
        this.b = b61Var;
        this.c = b61Var2;
        this.d = tL_messages_requestUrlAuth;
        this.e = my0Var;
        this.f = z;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z2;
        this.k = qw0Var;
        this.l = str2;
        this.m = ylbVar;
    }

    @Override // qac
    public final void a(Object obj) {
        int[] iArr = this.a;
        b61 b61Var = this.b;
        b61 b61Var2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final my0 my0Var = this.e;
        final boolean z = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z2 = this.j;
        final qw0 qw0Var = this.k;
        final String str2 = this.l;
        final ylb ylbVar = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] == num.intValue() || b61Var.R || b61Var2.R) {
            return;
        }
        final he heVar = new he(3, null, a.b);
        heVar.q(200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new kc((byte) 0), new jac() { // from class: rp7
            @Override // jac
            public final void a(Object obj2, Object obj3) {
                TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                he.this.dismiss();
                my0 my0Var2 = my0Var;
                if (urlAuthResult2 != null) {
                    my0Var2.dismiss();
                    xp7.b(z, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z2, qw0Var);
                } else if (tL_error != null) {
                    if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        wi8.u(my0Var2.F, my0Var2.J0, tL_error, false);
                        return;
                    }
                    my0Var2.dismiss();
                    c41 a = xp7.a();
                    String M0 = jb6.M0(2131753093, null);
                    String str3 = str2;
                    a.I(R.raw.error, M0, TextUtils.isEmpty(str3) ? jb6.M0(2131753094, null) : gm.L2(cmb.v0(cmb.wj, ylbVar), jb6.a0(null, null, 2131753095, str3))).j();
                }
            }
        });
    }
}
