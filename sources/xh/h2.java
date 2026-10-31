package xh;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.m5;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.sm0;
import org.telegram.ui.un;
import rh.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h2 implements org.telegram.ui.web.d0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ p6 c;
    public final /* synthetic */ m2 d;

    public h2(m2 m2Var, Context context, p6 p6Var) {
        this.d = m2Var;
        this.b = context;
        this.c = p6Var;
    }

    @Override // org.telegram.ui.web.d0
    public final s0 A() {
        m2 m2Var = this.d;
        if (m2Var.C0 == null) {
            s0 s0Var = new s0(this.b);
            m2Var.C0 = s0Var;
            s0Var.k = m2Var.D.getWebView();
        }
        return m2Var.C0;
    }

    @Override // org.telegram.ui.web.d0
    public final void a() {
        m2 m2Var = this.d;
        TLRPC.User Z1 = vp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I));
        m4.c cVar = new m4.c((char) 0, 15);
        cVar.b = new f2(this, 0);
        wb V = new cc(m2Var.q0, m2Var.F).V(Arrays.asList(Z1), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753087, h20.p(Z1))), null, cVar);
        V.j = 5000;
        V.k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final void b() {
        this.d.o(true);
    }

    @Override // org.telegram.ui.web.d0
    public final void c() {
        m2 m2Var = this.d;
        if (m2Var.E0 != null) {
            org.telegram.ui.ActionBar.i3 O = LaunchActivity.I1.O();
            if (O != null) {
                O.e(m2Var.E0);
            }
            m2Var.E0 = null;
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void d(TLRPC.Document document) {
        m2 m2Var = this.d;
        new cc(m2Var.q0, m2Var.F).q(document, cd.L0(2131753075, null)).k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final void e(String str) {
        m2 m2Var = this.d;
        if (m2Var.q() || m2Var.K != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = vp.r1(m2Var.H).n1(m2Var.I);
        tL_messages_sendWebViewData.random_id = Utilities.b.nextLong();
        tL_messages_sendWebViewData.button_text = m2Var.N;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(m2Var.H).sendRequest(tL_messages_sendWebViewData, new g2(this, 0));
    }

    @Override // org.telegram.ui.web.d0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        m2 m2Var = this.d;
        new cc(m2Var.q0, m2Var.F).Q(R.raw.forward, 36, org.telegram.messenger.i0.W2(size == 1 ? cd.a0(null, null, 2131752973, vp.r1(m2Var.H).A1(((Long) arrayList.get(0)).longValue(), false)) : cd.G(arrayList.size(), "BotSharedToMany", new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final String g(boolean z10, boolean z11) {
        m2 m2Var = this.d;
        boolean z12 = m2Var.e0;
        if (z12 != z10) {
            m2Var.C(z10, true, z11);
            return null;
        }
        if (z12) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.d0
    public final boolean h() {
        m2 m2Var = this.d;
        if (m2Var.q()) {
            return false;
        }
        return ui.b0(m2Var.H).j(m2Var.I) || vp.r1(m2Var.H).X6.contains(Long.valueOf(m2Var.I));
    }

    @Override // org.telegram.ui.web.d0
    public final void i(boolean z10) {
        m2 m2Var = this.d;
        ImageView backButton = m2Var.X.getBackButton();
        m2Var.x0 = z10;
        org.telegram.messenger.i0.Q3(backButton, z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        org.telegram.messenger.l2 l2Var = m2Var.n0;
        if (l2Var != null) {
            l2Var.K = z10;
            l2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void j() {
        z();
    }

    @Override // org.telegram.ui.web.d0
    public final void k(boolean z10) {
        this.d.s0 = z10;
    }

    @Override // org.telegram.ui.web.d0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
        m2 m2Var = this.d;
        i2 i2Var = m2Var.m0;
        q qVar = new q();
        qVar.a = z10;
        qVar.b = z11;
        qVar.c = z12;
        qVar.d = z13;
        qVar.e = str;
        qVar.f = j10;
        qVar.g = i10;
        qVar.h = i11;
        qVar.i = str2;
        int totalHeight = i2Var.getTotalHeight();
        i2Var.e.d = qVar;
        r.b(i2Var.f[1].l, qVar, true);
        i2Var.invalidate();
        if (totalHeight != i2Var.getTotalHeight() && i2Var.r != null) {
            if (totalHeight < i2Var.getTotalHeight()) {
                org.telegram.messenger.i0.h3(i2Var.r, 200L);
            } else {
                i2Var.r.run();
            }
        }
        if (m2Var.e0) {
            m2Var.I();
            m2Var.L();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void m(int i10) {
        this.d.A(i10, true);
    }

    @Override // org.telegram.ui.web.d0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        m2 m2Var = this.d;
        d2 d2Var = m2Var.x;
        l2 l2Var = m2Var.f;
        org.telegram.ui.ActionBar.k2 lastFragment = ((LaunchActivity) m2Var.l0).M().getLastFragment();
        sm0 sm0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            org.telegram.messenger.i0.v1(l2Var);
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, m2Var.getContext(), null);
            x1Var.r(150L);
            e6.y(m2Var.H, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new org.telegram.ui.ActionBar.n1(x1Var, 3), new rh.e3(14, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            vp.r1(m2Var.H).V3(paymentForm.users, false);
            sm0Var = new sm0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            sm0Var = new sm0((TLRPC.PaymentReceipt) tLObject);
        }
        if (sm0Var != null) {
            d2Var.e(d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY()));
            org.telegram.messenger.i0.v1(l2Var);
            fc0 fc0Var = new fc0(this.b);
            fc0Var.show();
            sm0Var.Z0 = new q5.a(this, fc0Var, str, 13);
            sm0Var.Y0 = this.c;
            fc0Var.c(sm0Var);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void p(boolean z10) {
        this.d.t(z10);
    }

    @Override // org.telegram.ui.web.d0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        m2 m2Var = this.d;
        i2 i2Var = m2Var.m0;
        q qVar = new q();
        qVar.a = z10;
        qVar.b = z11;
        qVar.c = z12;
        qVar.d = z13;
        qVar.e = str;
        qVar.f = j10;
        qVar.g = i10;
        qVar.h = i11;
        qVar.i = null;
        int totalHeight = i2Var.getTotalHeight();
        i2Var.e.c = qVar;
        p[] pVarArr = i2Var.f;
        pVarArr[0].l.a();
        if (qVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) qVar.e);
            spannableStringBuilder.setSpan(new o5(qVar.f, 1.4f, pVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            pVarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            pVarArr[0].l.t(qVar.e, true, true);
        }
        i2Var.invalidate();
        if (totalHeight != i2Var.getTotalHeight() && i2Var.r != null) {
            if (totalHeight < i2Var.getTotalHeight()) {
                org.telegram.messenger.i0.h3(i2Var.r, 200L);
            } else {
                i2Var.r.run();
            }
        }
        if (m2Var.e0) {
            m2Var.I();
            m2Var.L();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void r(int i10) {
        this.d.D(i10, true);
    }

    @Override // org.telegram.ui.web.d0
    public final void s() {
        d2 d2Var = this.d.x;
        if (d2Var.c) {
            return;
        }
        d2Var.e(d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.web.d0
    public final void t(boolean z10) {
        this.d.c0 = z10;
    }

    @Override // org.telegram.ui.web.d0
    public final void u(int i10, int i11, boolean z10) {
        m2 m2Var = this.d;
        m2Var.v0 = i10;
        m2Var.y(i11, z10, true);
    }

    @Override // org.telegram.ui.web.d0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        m2 m2Var = this.d;
        if (isEmpty) {
            Activity activity = m2Var.l0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.k2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                if (lastFragment instanceof un) {
                    ((un) lastFragment).Z.setFieldText("@" + h20.n(user) + " " + str);
                    m2Var.o(false);
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
        ay ayVar = new ay(bundle);
        org.telegram.messenger.i0.v1(m2Var.f);
        fc0 fc0Var = new fc0(this.b);
        ayVar.C2 = new a1.d(this, user, str, fc0Var, 22);
        fc0Var.show();
        fc0Var.c(ayVar);
    }

    @Override // org.telegram.ui.web.d0
    public final void w(boolean z10) {
        m2 m2Var = this.d;
        p6 p6Var = m2Var.F;
        FrameLayout frameLayout = m2Var.q0;
        TLRPC.User Z1 = vp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I));
        int i10 = 1;
        if (z10) {
            m4.c cVar = new m4.c((char) 0, 15);
            cd.L0(2131743910, null);
            cVar.b = new f2(this, i10);
            wb V = new cc(frameLayout, p6Var).V(Arrays.asList(Z1), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753054, h20.p(Z1))), null, cVar);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        m5.p(null, null, 2131753056, new Object[]{h20.p(Z1)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.k2(cd.L0(2131753055, null), new f2(this, 2)), true));
        wb P = new cc(frameLayout, p6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final void x(int i10) {
        r(i10);
    }

    @Override // org.telegram.ui.web.d0
    public final void y(boolean z10) {
        d2 d2Var = this.d.x;
        if (d2Var != null) {
            d2Var.setAllowSwipes(z10);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void z() {
        this.d.o(false);
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }
}
