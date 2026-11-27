// default package

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sw0 implements uu0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ vnb c;
    public final /* synthetic */ xw0 d;

    public sw0(xw0 xw0Var, Context context, vnb vnbVar) {
        this.d = xw0Var;
        this.b = context;
        this.c = vnbVar;
    }

    @Override // uu0
    public final wr0 A() {
        xw0 xw0Var = this.d;
        if (xw0Var.D0 == null) {
            wr0 wr0Var = new wr0(this.b);
            xw0Var.D0 = wr0Var;
            wr0Var.k = xw0Var.E.getWebView();
        }
        return xw0Var.D0;
    }

    @Override // uu0
    public final void a() {
        xw0 xw0Var = this.d;
        TLRPC.User X1 = uc7.s1(xw0Var.I).X1(Long.valueOf(xw0Var.J));
        qx6 qx6Var = new qx6((byte) 10, false);
        qx6Var.b = new qw0(this, (byte) 0);
        v21 V = new d31(xw0Var.r0, xw0Var.G).V(Arrays.asList(X1), hl.S2(ob6.a0(null, null, 2131753080, lbc.r(X1))), null, qx6Var);
        V.j = 5000;
        V.k(true);
    }

    @Override // uu0
    public final void b() {
        this.d.m(true);
    }

    @Override // uu0
    public final void c() {
        xw0 xw0Var = this.d;
        if (xw0Var.F0 != null) {
            yx0 O = LaunchActivity.H1.O();
            if (O != null) {
                O.e(xw0Var.F0);
            }
            xw0Var.F0 = null;
        }
    }

    @Override // uu0
    public final void d(TLRPC.Document document) {
        xw0 xw0Var = this.d;
        new d31(xw0Var.r0, xw0Var.G).q(document, ob6.M0(2131753068, null)).k(true);
    }

    @Override // uu0
    public final void e(String str) {
        xw0 xw0Var = this.d;
        if (xw0Var.o() || xw0Var.L != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = uc7.s1(xw0Var.I).o1(xw0Var.J);
        tL_messages_sendWebViewData.random_id = Utilities.b.nextLong();
        tL_messages_sendWebViewData.button_text = xw0Var.O;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(xw0Var.I).sendRequest(tL_messages_sendWebViewData, new rw0(this, (byte) 0));
    }

    @Override // uu0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        xw0 xw0Var = this.d;
        new d31(xw0Var.r0, xw0Var.G).Q(R.raw.forward, 36, hl.S2(size == 1 ? ob6.a0(null, null, 2131752954, uc7.s1(xw0Var.I).A1(((Long) arrayList.get(0)).longValue(), false)) : ob6.G(arrayList.size(), "BotSharedToMany", new Object[0]))).k(true);
    }

    @Override // uu0
    public final String g(boolean z, boolean z2) {
        xw0 xw0Var = this.d;
        boolean z3 = xw0Var.f0;
        if (z3 != z) {
            xw0Var.C(z, true, z2);
            return null;
        }
        if (z3) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // uu0
    public final boolean h() {
        xw0 xw0Var = this.d;
        if (xw0Var.o()) {
            return false;
        }
        return ls6.d0(xw0Var.I).l(xw0Var.J) || uc7.s1(xw0Var.I).T3.contains(Long.valueOf(xw0Var.J));
    }

    @Override // uu0
    public final void i(boolean z) {
        xw0 xw0Var = this.d;
        ImageView backButton = xw0Var.Y.getBackButton();
        xw0Var.y0 = z;
        hl.L3(backButton, z ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        yp0 yp0Var = xw0Var.o0;
        if (yp0Var != null) {
            yp0Var.L = z;
            yp0Var.invalidate();
        }
    }

    @Override // uu0
    public final void j() {
        z();
    }

    @Override // uu0
    public final void k(boolean z) {
        this.d.t0 = z;
    }

    @Override // uu0
    public final void l(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
        xw0 xw0Var = this.d;
        tw0 tw0Var = xw0Var.n0;
        yo0 yo0Var = new yo0();
        yo0Var.a = z;
        yo0Var.b = z2;
        yo0Var.c = z3;
        yo0Var.d = z4;
        yo0Var.e = str;
        yo0Var.f = j;
        yo0Var.g = i;
        yo0Var.h = i2;
        yo0Var.i = str2;
        int totalHeight = tw0Var.getTotalHeight();
        tw0Var.e.d = yo0Var;
        zo0.b(tw0Var.f[1].l, yo0Var, true);
        tw0Var.invalidate();
        if (totalHeight != tw0Var.getTotalHeight() && tw0Var.r != null) {
            int totalHeight2 = tw0Var.getTotalHeight();
            Runnable runnable = tw0Var.r;
            if (totalHeight < totalHeight2) {
                hl.d3(runnable, 200L);
            } else {
                runnable.run();
            }
        }
        if (xw0Var.f0) {
            xw0Var.I();
            xw0Var.L();
        }
    }

    @Override // uu0
    public final void m(int i) {
        this.d.A(i, true);
    }

    @Override // uu0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        xw0 xw0Var = this.d;
        ow0 ow0Var = xw0Var.x;
        ww0 ww0Var = xw0Var.f;
        e lastFragment = ((LaunchActivity) xw0Var.m0).N().getLastFragment();
        byte b = 7;
        p pVar = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            hl.t1(ww0Var);
            id idVar = new id(3, null, xw0Var.getContext());
            idVar.q(150L);
            jxa.v(xw0Var.I, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new uc(idVar, (byte) 3), new y0(this, str, (byte) 7));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            uc7.s1(xw0Var.I).j4(paymentForm.users, false);
            pVar = new p(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            pVar = new p((TLRPC.PaymentReceipt) tLObject);
        }
        if (pVar != null) {
            ow0Var.d(ow0Var.getTopActionBarOffsetY() + (-ow0Var.getOffsetY()));
            hl.t1(ww0Var);
            mu7 mu7Var = new mu7(this.b);
            mu7Var.show();
            pVar.a1 = new ie(this, mu7Var, str, b);
            pVar.Z0 = this.c;
            mu7Var.c(pVar);
        }
    }

    @Override // uu0
    public final void p(boolean z) {
        this.d.t(z);
    }

    @Override // uu0
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
        xw0 xw0Var = this.d;
        tw0 tw0Var = xw0Var.n0;
        yo0 yo0Var = new yo0();
        yo0Var.a = z;
        yo0Var.b = z2;
        yo0Var.c = z3;
        yo0Var.d = z4;
        yo0Var.e = str;
        yo0Var.f = j;
        yo0Var.g = i;
        yo0Var.h = i2;
        yo0Var.i = null;
        int totalHeight = tw0Var.getTotalHeight();
        tw0Var.e.c = yo0Var;
        xo0[] xo0VarArr = tw0Var.f;
        xo0VarArr[0].l.a();
        if (yo0Var.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) yo0Var.e);
            spannableStringBuilder.setSpan(new hm(yo0Var.f, 1.4f, xo0VarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            xo0VarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            xo0VarArr[0].l.t(yo0Var.e, true, true);
        }
        tw0Var.invalidate();
        if (totalHeight != tw0Var.getTotalHeight() && tw0Var.r != null) {
            int totalHeight2 = tw0Var.getTotalHeight();
            Runnable runnable = tw0Var.r;
            if (totalHeight < totalHeight2) {
                hl.d3(runnable, 200L);
            } else {
                runnable.run();
            }
        }
        if (xw0Var.f0) {
            xw0Var.I();
            xw0Var.L();
        }
    }

    @Override // uu0
    public final void r(int i) {
        this.d.D(i, true);
    }

    @Override // uu0
    public final void s() {
        ow0 ow0Var = this.d.x;
        if (ow0Var.c) {
            return;
        }
        ow0Var.d(ow0Var.getTopActionBarOffsetY() + (-ow0Var.getOffsetY()));
    }

    @Override // uu0
    public final void t(boolean z) {
        this.d.d0 = z;
    }

    @Override // uu0
    public final void u(int i, int i2, boolean z) {
        xw0 xw0Var = this.d;
        xw0Var.w0 = i;
        xw0Var.y(i2, z, true);
    }

    @Override // uu0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        xw0 xw0Var = this.d;
        if (isEmpty) {
            Activity activity = xw0Var.m0;
            if (activity instanceof LaunchActivity) {
                e lastFragment = ((LaunchActivity) activity).N().getLastFragment();
                if (lastFragment instanceof zu1) {
                    ((zu1) lastFragment).a0.setFieldText("@" + lbc.p(user) + " " + str);
                    xw0Var.m(false);
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        uj3 uj3Var = new uj3(bundle);
        hl.t1(xw0Var.f);
        mu7 mu7Var = new mu7(this.b);
        uj3Var.E2 = new pt((Object) this, (Object) user, (Object) mu7Var, str, (byte) 2);
        mu7Var.show();
        mu7Var.c(uj3Var);
    }

    @Override // uu0
    public final void w(boolean z) {
        xw0 xw0Var = this.d;
        vnb vnbVar = xw0Var.G;
        FrameLayout frameLayout = xw0Var.r0;
        TLRPC.User X1 = uc7.s1(xw0Var.I).X1(Long.valueOf(xw0Var.J));
        byte b = 1;
        if (z) {
            qx6 qx6Var = new qx6((byte) 10, false);
            ob6.M0(2131743540, null);
            qx6Var.b = new qw0(this, b);
            v21 V = new d31(frameLayout, vnbVar).V(Arrays.asList(X1), hl.S2(ob6.a0(null, null, 2131753038, lbc.r(X1))), null, qx6Var);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        qu6.s(null, null, 2131753040, new Object[]{lbc.r(X1)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) hl.D2(hl.i2(ob6.M0(2131753039, null), new qw0(this, (byte) 2)), true));
        v21 P = new d31(frameLayout, vnbVar).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // uu0
    public final void x(int i) {
        r(i);
    }

    @Override // uu0
    public final void y(boolean z) {
        ow0 ow0Var = this.d.x;
        if (ow0Var != null) {
            ow0Var.setAllowSwipes(z);
        }
    }

    @Override // uu0
    public final void z() {
        this.d.m(false);
    }

    @Override // uu0
    public final void o(int i, boolean z) {
    }
}
