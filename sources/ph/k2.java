package ph;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import jh.s7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.fy;
import org.telegram.ui.tn;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class k2 implements org.telegram.ui.web.f0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ c6 c;
    public final /* synthetic */ p2 d;

    public k2(p2 p2Var, Context context, c6 c6Var) {
        this.d = p2Var;
        this.b = context;
        this.c = c6Var;
    }

    @Override // org.telegram.ui.web.f0
    public final void a() {
        p2 p2Var = this.d;
        TLRPC.User user = MessagesController.getInstance(p2Var.C).getUser(Long.valueOf(p2Var.D));
        oc.i iVar = new oc.i(4);
        iVar.b = new i2(this, 0);
        mc V = new tc(p2Var.l0, p2Var.A).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, iVar);
        V.j = 5000;
        V.k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final void b() {
        this.d.k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final void c() {
        p2 p2Var = this.d;
        if (p2Var.z0 != null) {
            org.telegram.ui.ActionBar.m3 P = LaunchActivity.C1.P();
            if (P != null) {
                P.e(p2Var.z0);
            }
            p2Var.z0 = null;
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void d(TLRPC.Document document) {
        p2 p2Var = this.d;
        new tc(p2Var.l0, p2Var.A).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final void e(String str) {
        p2 p2Var = this.d;
        if (p2Var.F != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = MessagesController.getInstance(p2Var.C).getInputUser(p2Var.D);
        tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
        tL_messages_sendWebViewData.button_text = p2Var.I;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(p2Var.C).sendRequest(tL_messages_sendWebViewData, new j2(this, 0));
    }

    @Override // org.telegram.ui.web.f0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        p2 p2Var = this.d;
        new tc(p2Var.l0, p2Var.A).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(size == 1 ? LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(p2Var.C).getPeerName(((Long) arrayList.get(0)).longValue())) : LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final String g(boolean z10, boolean z11) {
        p2 p2Var = this.d;
        boolean z12 = p2Var.Z;
        if (z12 != z10) {
            p2Var.x(z10, true, z11);
            return null;
        }
        if (z12) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.f0
    public final boolean h() {
        p2 p2Var = this.d;
        return MediaDataController.getInstance(p2Var.C).botInAttachMenu(p2Var.D) || MessagesController.getInstance(p2Var.C).whitelistedBots.contains(Long.valueOf(p2Var.D));
    }

    @Override // org.telegram.ui.web.f0
    public final void i(boolean z10) {
        p2 p2Var = this.d;
        ImageView backButton = p2Var.S.getBackButton();
        p2Var.s0 = z10;
        AndroidUtilities.updateImageViewImageAnimated(backButton, z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        BotFullscreenButtons botFullscreenButtons = p2Var.i0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z10, true);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.f0
    public final void k(boolean z10) {
        this.d.n0 = z10;
    }

    @Override // org.telegram.ui.web.f0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
        p2 p2Var = this.d;
        l2 l2Var = p2Var.h0;
        t tVar = new t();
        tVar.a = z10;
        tVar.b = z11;
        tVar.c = z12;
        tVar.d = z13;
        tVar.e = str;
        tVar.f = j10;
        tVar.g = i10;
        tVar.h = i11;
        tVar.i = str2;
        int totalHeight = l2Var.getTotalHeight();
        l2Var.e.d = tVar;
        u.b(l2Var.f[1].l, tVar, true);
        l2Var.invalidate();
        if (totalHeight != l2Var.getTotalHeight() && l2Var.r != null) {
            if (totalHeight < l2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(l2Var.r, 200L);
            } else {
                l2Var.r.run();
            }
        }
        if (p2Var.Z) {
            p2Var.D();
            p2Var.G();
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void m(int i10) {
        this.d.v(i10, true);
    }

    @Override // org.telegram.ui.web.f0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        p2 p2Var = this.d;
        g2 g2Var = p2Var.v;
        o2 o2Var = p2Var.e;
        org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) p2Var.g0).O().getLastFragment();
        bo0 bo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(o2Var);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(p2Var.getContext(), 3, null);
            c2Var.q(150L);
            s7.y(p2Var.C, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new jh.h3(c2Var, 1), new yu0(13, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(p2Var.C).putUsers(paymentForm.users, false);
            bo0Var = new bo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            bo0Var = new bo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (bo0Var != null) {
            g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(o2Var);
            vc0 vc0Var = new vc0(this.b);
            vc0Var.show();
            bo0Var.V0 = new org.telegram.ui.Components.voip.w1(this, vc0Var, str, 3);
            bo0Var.U0 = this.c;
            vc0Var.c(bo0Var);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void p(boolean z10) {
        this.d.o(z10);
    }

    @Override // org.telegram.ui.web.f0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        p2 p2Var = this.d;
        l2 l2Var = p2Var.h0;
        t tVar = new t();
        tVar.a = z10;
        tVar.b = z11;
        tVar.c = z12;
        tVar.d = z13;
        tVar.e = str;
        tVar.f = j10;
        tVar.g = i10;
        tVar.h = i11;
        tVar.i = null;
        int totalHeight = l2Var.getTotalHeight();
        l2Var.e.c = tVar;
        s[] sVarArr = l2Var.f;
        sVarArr[0].l.b();
        if (tVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) tVar.e);
            spannableStringBuilder.setSpan(new y5(tVar.f, 1.4f, sVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            sVarArr[0].l.q(spannableStringBuilder, true, true);
        } else {
            sVarArr[0].l.q(tVar.e, true, true);
        }
        l2Var.invalidate();
        if (totalHeight != l2Var.getTotalHeight() && l2Var.r != null) {
            if (totalHeight < l2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(l2Var.r, 200L);
            } else {
                l2Var.r.run();
            }
        }
        if (p2Var.Z) {
            p2Var.D();
            p2Var.G();
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void r(int i10) {
        this.d.y(i10, true);
    }

    @Override // org.telegram.ui.web.f0
    public final void s() {
        g2 g2Var = this.d.v;
        if (g2Var.c) {
            return;
        }
        g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.web.f0
    public final void t(boolean z10) {
        this.d.X = z10;
    }

    @Override // org.telegram.ui.web.f0
    public final void u(int i10, int i11, boolean z10) {
        p2 p2Var = this.d;
        p2Var.q0 = i10;
        p2Var.t(i11, z10, true);
    }

    @Override // org.telegram.ui.web.f0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        p2 p2Var = this.d;
        if (isEmpty) {
            Activity activity = p2Var.g0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof tn) {
                    ((tn) lastFragment).U.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    p2Var.k(false);
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
        fy fyVar = new fy(bundle);
        AndroidUtilities.hideKeyboard(p2Var.e);
        vc0 vc0Var = new vc0(this.b);
        fyVar.y2 = new a1.d(this, user, str, vc0Var, 21);
        vc0Var.show();
        vc0Var.c(fyVar);
    }

    @Override // org.telegram.ui.web.f0
    public final void w(boolean z10) {
        p2 p2Var = this.d;
        c6 c6Var = p2Var.A;
        FrameLayout frameLayout = p2Var.l0;
        TLRPC.User user = MessagesController.getInstance(p2Var.C).getUser(Long.valueOf(p2Var.D));
        int i10 = 1;
        if (z10) {
            oc.i iVar = new oc.i(4);
            LocaleController.getString(R.string.UndoNoCaps);
            iVar.b = new i2(this, i10);
            mc V = new tc(frameLayout, c6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, iVar);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new i2(this, 2)), true));
        mc P = new tc(frameLayout, c6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final void x(boolean z10) {
        g2 g2Var = this.d.v;
        if (g2Var != null) {
            g2Var.setAllowSwipes(z10);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void y() {
        this.d.k(false);
    }

    @Override // org.telegram.ui.web.f0
    public final u0 z() {
        p2 p2Var = this.d;
        if (p2Var.x0 == null) {
            u0 u0Var = new u0(this.b);
            p2Var.x0 = u0Var;
            u0Var.k = p2Var.x.getWebView();
        }
        return p2Var.x0;
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }
}
