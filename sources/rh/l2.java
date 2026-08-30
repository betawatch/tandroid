package rh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import lh.t7;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jo0;
import org.telegram.ui.oy;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class l2 implements org.telegram.ui.web.e0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f6 c;
    public final /* synthetic */ q2 d;

    public l2(q2 q2Var, Context context, f6 f6Var) {
        this.d = q2Var;
        this.b = context;
        this.c = f6Var;
    }

    @Override // org.telegram.ui.web.e0
    public final void a() {
        q2 q2Var = this.d;
        TLRPC.User user = MessagesController.getInstance(q2Var.D).getUser(Long.valueOf(q2Var.E));
        qa qaVar = new qa(11);
        qaVar.b = new j2(this, 0);
        ic V = new qc(q2Var.m0, q2Var.B).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, qaVar);
        V.j = 5000;
        V.k(true);
    }

    @Override // org.telegram.ui.web.e0
    public final void b() {
        this.d.k(true);
    }

    @Override // org.telegram.ui.web.e0
    public final void c() {
        q2 q2Var = this.d;
        if (q2Var.A0 != null) {
            org.telegram.ui.ActionBar.n3 P = LaunchActivity.D1.P();
            if (P != null) {
                P.e(q2Var.A0);
            }
            q2Var.A0 = null;
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void d(TLRPC.Document document) {
        q2 q2Var = this.d;
        new qc(q2Var.m0, q2Var.B).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override // org.telegram.ui.web.e0
    public final void e(String str) {
        q2 q2Var = this.d;
        if (q2Var.G != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = MessagesController.getInstance(q2Var.D).getInputUser(q2Var.E);
        tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
        tL_messages_sendWebViewData.button_text = q2Var.J;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(q2Var.D).sendRequest(tL_messages_sendWebViewData, new k2(this, 0));
    }

    @Override // org.telegram.ui.web.e0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        q2 q2Var = this.d;
        new qc(q2Var.m0, q2Var.B).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(size == 1 ? LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(q2Var.D).getPeerName(((Long) arrayList.get(0)).longValue())) : LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.e0
    public final String g(boolean z4, boolean z10) {
        q2 q2Var = this.d;
        boolean z11 = q2Var.a0;
        if (z11 != z4) {
            q2Var.x(z4, true, z10);
            return null;
        }
        if (z11) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.e0
    public final boolean h() {
        q2 q2Var = this.d;
        return MediaDataController.getInstance(q2Var.D).botInAttachMenu(q2Var.E) || MessagesController.getInstance(q2Var.D).whitelistedBots.contains(Long.valueOf(q2Var.E));
    }

    @Override // org.telegram.ui.web.e0
    public final void i(boolean z4) {
        q2 q2Var = this.d;
        ImageView backButton = q2Var.T.getBackButton();
        q2Var.t0 = z4;
        AndroidUtilities.updateImageViewImageAnimated(backButton, z4 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        BotFullscreenButtons botFullscreenButtons = q2Var.j0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z4, true);
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.e0
    public final void k(boolean z4) {
        this.d.o0 = z4;
    }

    @Override // org.telegram.ui.web.e0
    public final void l(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12, String str2) {
        q2 q2Var = this.d;
        m2 m2Var = q2Var.i0;
        u uVar = new u();
        uVar.a = z4;
        uVar.b = z10;
        uVar.c = z11;
        uVar.d = z12;
        uVar.e = str;
        uVar.f = j10;
        uVar.g = i10;
        uVar.h = i11;
        uVar.i = str2;
        int totalHeight = m2Var.getTotalHeight();
        m2Var.e.d = uVar;
        v.b(m2Var.f[1].l, uVar, true);
        m2Var.invalidate();
        if (totalHeight != m2Var.getTotalHeight() && m2Var.r != null) {
            if (totalHeight < m2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(m2Var.r, 200L);
            } else {
                m2Var.r.run();
            }
        }
        if (q2Var.a0) {
            q2Var.D();
            q2Var.G();
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void m(int i10) {
        this.d.v(i10, true);
    }

    @Override // org.telegram.ui.web.e0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        q2 q2Var = this.d;
        h2 h2Var = q2Var.v;
        p2 p2Var = q2Var.e;
        org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) q2Var.h0).O().getLastFragment();
        jo0 jo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(p2Var);
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(q2Var.getContext(), 3, null);
            d2Var.q(150L);
            t7.y(q2Var.D, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new lh.g3(d2Var, 1), new org.telegram.ui.web.u1(13, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(q2Var.D).putUsers(paymentForm.users, false);
            jo0Var = new jo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            jo0Var = new jo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (jo0Var != null) {
            h2Var.e(h2Var.getTopActionBarOffsetY() + (-h2Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(p2Var);
            bd0 bd0Var = new bd0(this.b);
            bd0Var.show();
            jo0Var.W0 = new ph.m1(this, bd0Var, str);
            jo0Var.V0 = this.c;
            bd0Var.c(jo0Var);
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void p(boolean z4) {
        this.d.o(z4);
    }

    @Override // org.telegram.ui.web.e0
    public final void q(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12) {
        q2 q2Var = this.d;
        m2 m2Var = q2Var.i0;
        u uVar = new u();
        uVar.a = z4;
        uVar.b = z10;
        uVar.c = z11;
        uVar.d = z12;
        uVar.e = str;
        uVar.f = j10;
        uVar.g = i10;
        uVar.h = i11;
        uVar.i = null;
        int totalHeight = m2Var.getTotalHeight();
        m2Var.e.c = uVar;
        t[] tVarArr = m2Var.f;
        tVarArr[0].l.b();
        if (uVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) uVar.e);
            spannableStringBuilder.setSpan(new u5(uVar.f, 1.4f, tVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            tVarArr[0].l.q(spannableStringBuilder, true, true);
        } else {
            tVarArr[0].l.q(uVar.e, true, true);
        }
        m2Var.invalidate();
        if (totalHeight != m2Var.getTotalHeight() && m2Var.r != null) {
            if (totalHeight < m2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(m2Var.r, 200L);
            } else {
                m2Var.r.run();
            }
        }
        if (q2Var.a0) {
            q2Var.D();
            q2Var.G();
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void r(int i10) {
        this.d.y(i10, true);
    }

    @Override // org.telegram.ui.web.e0
    public final void s() {
        h2 h2Var = this.d.v;
        if (h2Var.c) {
            return;
        }
        h2Var.e(h2Var.getTopActionBarOffsetY() + (-h2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.web.e0
    public final void t(boolean z4) {
        this.d.Y = z4;
    }

    @Override // org.telegram.ui.web.e0
    public final void u(int i10, int i11, boolean z4) {
        q2 q2Var = this.d;
        q2Var.r0 = i10;
        q2Var.t(i11, z4, true);
    }

    @Override // org.telegram.ui.web.e0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        q2 q2Var = this.d;
        if (isEmpty) {
            Activity activity = q2Var.h0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof xn) {
                    ((xn) lastFragment).V.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    q2Var.k(false);
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
        oy oyVar = new oy(bundle);
        AndroidUtilities.hideKeyboard(q2Var.e);
        bd0 bd0Var = new bd0(this.b);
        oyVar.z2 = new a1.d(this, user, str, bd0Var, 21);
        bd0Var.show();
        bd0Var.c(oyVar);
    }

    @Override // org.telegram.ui.web.e0
    public final void w(boolean z4) {
        q2 q2Var = this.d;
        f6 f6Var = q2Var.B;
        FrameLayout frameLayout = q2Var.m0;
        TLRPC.User user = MessagesController.getInstance(q2Var.D).getUser(Long.valueOf(q2Var.E));
        int i10 = 1;
        if (z4) {
            qa qaVar = new qa(11);
            LocaleController.getString(R.string.UndoNoCaps);
            qaVar.b = new j2(this, i10);
            ic V = new qc(frameLayout, f6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, qaVar);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new j2(this, 2)), true));
        ic P = new qc(frameLayout, f6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.e0
    public final void x(boolean z4) {
        h2 h2Var = this.d.v;
        if (h2Var != null) {
            h2Var.setAllowSwipes(z4);
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void y() {
        this.d.k(false);
    }

    @Override // org.telegram.ui.web.e0
    public final v0 z() {
        q2 q2Var = this.d;
        if (q2Var.y0 == null) {
            v0 v0Var = new v0(this.b);
            q2Var.y0 = v0Var;
            v0Var.k = q2Var.x.getWebView();
        }
        return q2Var.y0;
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void o(int i10, boolean z4) {
    }
}
