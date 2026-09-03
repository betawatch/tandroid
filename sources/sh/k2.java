package sh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import mh.t7;
import n7.qa;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lo0;
import org.telegram.ui.py;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class k2 implements org.telegram.ui.web.f0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g6 c;
    public final /* synthetic */ p2 d;

    public k2(p2 p2Var, Context context, g6 g6Var) {
        this.d = p2Var;
        this.b = context;
        this.c = g6Var;
    }

    @Override // org.telegram.ui.web.f0
    public final void a() {
        p2 p2Var = this.d;
        TLRPC.User user = MessagesController.getInstance(p2Var.D).getUser(Long.valueOf(p2Var.E));
        qa qaVar = new qa(11);
        qaVar.b = new i2(this, 0);
        ic V = new qc(p2Var.m0, p2Var.B).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, qaVar);
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
        if (p2Var.A0 != null) {
            org.telegram.ui.ActionBar.o3 P = LaunchActivity.D1.P();
            if (P != null) {
                P.e(p2Var.A0);
            }
            p2Var.A0 = null;
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void d(TLRPC.Document document) {
        p2 p2Var = this.d;
        new qc(p2Var.m0, p2Var.B).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final void e(String str) {
        p2 p2Var = this.d;
        if (p2Var.G != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = MessagesController.getInstance(p2Var.D).getInputUser(p2Var.E);
        tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
        tL_messages_sendWebViewData.button_text = p2Var.J;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(p2Var.D).sendRequest(tL_messages_sendWebViewData, new j2(this, 0));
    }

    @Override // org.telegram.ui.web.f0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        p2 p2Var = this.d;
        new qc(p2Var.m0, p2Var.B).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(size == 1 ? LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(p2Var.D).getPeerName(((Long) arrayList.get(0)).longValue())) : LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final String g(boolean z4, boolean z10) {
        p2 p2Var = this.d;
        boolean z11 = p2Var.a0;
        if (z11 != z4) {
            p2Var.x(z4, true, z10);
            return null;
        }
        if (z11) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.f0
    public final boolean h() {
        p2 p2Var = this.d;
        return MediaDataController.getInstance(p2Var.D).botInAttachMenu(p2Var.E) || MessagesController.getInstance(p2Var.D).whitelistedBots.contains(Long.valueOf(p2Var.E));
    }

    @Override // org.telegram.ui.web.f0
    public final void i(boolean z4) {
        p2 p2Var = this.d;
        ImageView backButton = p2Var.T.getBackButton();
        p2Var.t0 = z4;
        AndroidUtilities.updateImageViewImageAnimated(backButton, z4 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        BotFullscreenButtons botFullscreenButtons = p2Var.j0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z4, true);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.f0
    public final void k(boolean z4) {
        this.d.o0 = z4;
    }

    @Override // org.telegram.ui.web.f0
    public final void l(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12, String str2) {
        p2 p2Var = this.d;
        l2 l2Var = p2Var.i0;
        t tVar = new t();
        tVar.a = z4;
        tVar.b = z10;
        tVar.c = z11;
        tVar.d = z12;
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
        if (p2Var.a0) {
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
        org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) p2Var.h0).O().getLastFragment();
        lo0 lo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(o2Var);
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(p2Var.getContext(), 3, null);
            d2Var.q(150L);
            t7.y(p2Var.D, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new mh.g3(d2Var, 1), new org.telegram.ui.web.a2(12, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(p2Var.D).putUsers(paymentForm.users, false);
            lo0Var = new lo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            lo0Var = new lo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (lo0Var != null) {
            g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(o2Var);
            dd0 dd0Var = new dd0(this.b);
            dd0Var.show();
            lo0Var.W0 = new qh.l1(this, dd0Var, str);
            lo0Var.V0 = this.c;
            dd0Var.c(lo0Var);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void p(boolean z4) {
        this.d.o(z4);
    }

    @Override // org.telegram.ui.web.f0
    public final void q(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12) {
        p2 p2Var = this.d;
        l2 l2Var = p2Var.i0;
        t tVar = new t();
        tVar.a = z4;
        tVar.b = z10;
        tVar.c = z11;
        tVar.d = z12;
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
            spannableStringBuilder.setSpan(new u5(tVar.f, 1.4f, sVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
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
        if (p2Var.a0) {
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
    public final void t(boolean z4) {
        this.d.Y = z4;
    }

    @Override // org.telegram.ui.web.f0
    public final void u(int i10, int i11, boolean z4) {
        p2 p2Var = this.d;
        p2Var.r0 = i10;
        p2Var.t(i11, z4, true);
    }

    @Override // org.telegram.ui.web.f0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        p2 p2Var = this.d;
        if (isEmpty) {
            Activity activity = p2Var.h0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof xn) {
                    ((xn) lastFragment).V.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        py pyVar = new py(bundle);
        AndroidUtilities.hideKeyboard(p2Var.e);
        dd0 dd0Var = new dd0(this.b);
        pyVar.z2 = new a1.d(this, user, str, dd0Var, 21);
        dd0Var.show();
        dd0Var.c(pyVar);
    }

    @Override // org.telegram.ui.web.f0
    public final void w(boolean z4) {
        p2 p2Var = this.d;
        g6 g6Var = p2Var.B;
        FrameLayout frameLayout = p2Var.m0;
        TLRPC.User user = MessagesController.getInstance(p2Var.D).getUser(Long.valueOf(p2Var.E));
        int i10 = 1;
        if (z4) {
            qa qaVar = new qa(11);
            LocaleController.getString(R.string.UndoNoCaps);
            qaVar.b = new i2(this, i10);
            ic V = new qc(frameLayout, g6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, qaVar);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new i2(this, 2)), true));
        ic P = new qc(frameLayout, g6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final void x(boolean z4) {
        g2 g2Var = this.d.v;
        if (g2Var != null) {
            g2Var.setAllowSwipes(z4);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void y() {
        this.d.k(false);
    }

    @Override // org.telegram.ui.web.f0
    public final u0 z() {
        p2 p2Var = this.d;
        if (p2Var.y0 == null) {
            u0 u0Var = new u0(this.b);
            p2Var.y0 = u0Var;
            u0Var.k = p2Var.x.getWebView();
        }
        return p2Var.y0;
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void o(int i10, boolean z4) {
    }
}
