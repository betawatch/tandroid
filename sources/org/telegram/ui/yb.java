package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yb(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x03db, code lost:
    
        if (r11.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L161;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.w51 w51Var;
        org.telegram.ui.Components.a11 a11Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat chat;
        int i10 = this.a;
        int i11 = -1;
        MessageObject messageObject = null;
        int i12 = 2;
        boolean z4 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                bc bcVar = (bc) obj2;
                bcVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                bcVar.F.animate().cancel();
                bcVar.F.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new s5(bcVar, 15));
                bcVar.d(true);
                bcVar.c(null);
                break;
            case 1:
                bd bdVar = (bd) obj2;
                bdVar.getClass();
                bdVar.presentFragment(ga1.d0((TLRPC.Chat) obj, true));
                break;
            case 2:
                List list = (List) obj;
                zc zcVar = ((yc) obj2).b;
                int i13 = zcVar.a;
                jb1 jb1Var = zcVar.d;
                ArrayList arrayList = zcVar.c;
                if (list != null && !list.isEmpty()) {
                    zcVar.n = true;
                    arrayList.clear();
                    arrayList.add(0, new org.telegram.ui.Components.jp((org.telegram.ui.ActionBar.e4) list.get(0)));
                    if (zcVar.v != null && zcVar.f) {
                        arrayList.add(0, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.e4.a(i13)));
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = zcVar.b;
                    int a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
                    for (int i14 = 1; i14 < list.size(); i14++) {
                        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) list.get(i14);
                        org.telegram.ui.Components.jp jpVar = new org.telegram.ui.Components.jp(e4Var);
                        e4Var.n(i13);
                        jpVar.c = a2;
                        arrayList.add(jpVar);
                    }
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        org.telegram.ui.Components.jp jpVar2 = (org.telegram.ui.Components.jp) arrayList.get(i15);
                        boolean z10 = TextUtils.equals(zcVar.s, jpVar2.a()) || (TextUtils.isEmpty(zcVar.s) && jpVar2.a.a);
                        jpVar2.d = z10;
                        if (z10) {
                            i11 = i15;
                        }
                    }
                    xc xcVar = zcVar.h;
                    if (xcVar != null) {
                        xcVar.l();
                    }
                    jb1Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.t00 t00Var = zcVar.e;
                    if (zcVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(t00Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(t00Var, true, 1.0f, true, true);
                    }
                    if (i11 >= 0 && (jb1Var.getLayoutManager() instanceof f2.i0)) {
                        ((f2.i0) jb1Var.getLayoutManager()).h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 3:
                nd ndVar = (nd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    ndVar.getClass();
                    break;
                }
                z4 = true;
                ndVar.g0 = z4;
                break;
            case 4:
                nd.W((nd) obj2, (String) obj);
                break;
            case 5:
                nd ndVar2 = (nd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = ndVar2.c0;
                ndVar2.a0 = false;
                if (tLObject != null && ndVar2.getParentActivity() != null) {
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        ndVar2.H.removeView((View) arrayList2.get(i16));
                    }
                    arrayList2.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    int i17 = 0;
                    while (i17 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ndVar2.getParentActivity(), new fd(ndVar2, z4 ? 1 : 0), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i17), i17 == tL_messages_chats.chats.size() - 1);
                        arrayList2.add(nVar);
                        ndVar2.I.addView(nVar, k7.b6.n(-1, 72));
                        i17++;
                    }
                    ndVar2.h0();
                    break;
                }
                break;
            case 6:
                ke keVar = (ke) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                keVar.x0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    keVar.y0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.g61 g61Var = keVar.X0;
                if (g61Var != null && (w51Var = g61Var.V2) != null) {
                    w51Var.N(true);
                    break;
                }
                break;
            case 7:
                ((ke) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 8:
                xn xnVar = (xn) obj2;
                org.telegram.ui.Components.a11[] a11VarArr = (org.telegram.ui.Components.a11[]) obj;
                if (!xnVar.hb && (a11Var = a11VarArr[0]) != null) {
                    a11VarArr[0] = null;
                    if (xnVar.s0 == a11Var) {
                        xnVar.s0 = null;
                    }
                    AndroidUtilities.removeFromParent(a11Var);
                    break;
                }
                break;
            case 9:
                ((lh.g2) obj2).run((TLRPC.User) obj);
                break;
            case 10:
                xn xnVar2 = (xn) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                t1Var.getLocationInWindow(new int[2]);
                xnVar2.w1.setTranslationY(t1Var.getTimeY() + ((r0[1] - r2.getTop()) - AndroidUtilities.dp(120.0f)));
                xnVar2.w1.n(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r0[0]) + t1Var.ob) + t1Var.mb) - (t1Var.pb / 2.0f));
                xnVar2.w1.v();
                break;
            case 11:
                xn.M0((xn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 12:
                xn xnVar3 = (xn) obj2;
                int[] iArr = (int[]) obj;
                xnVar3.getClass();
                if (iArr[0] != 0) {
                    xnVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 13:
                ((xn) obj2).h8((ah) obj);
                break;
            case 14:
                xn xnVar4 = (xn) obj2;
                af.g.p(xnVar4.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), xnVar4.c8 == 0, false);
                break;
            case 15:
                ((xn) obj2).ka((TLRPC.Chat) obj);
                break;
            case 16:
                xn.d0((xn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 17:
                xn xnVar5 = (xn) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tL_error2.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.z4.w0(xnVar5, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error2.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.z4.w0(xnVar5, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.z4.w0(xnVar5, tL_error2.text);
                    break;
                }
            case 18:
                a0.h hVar = (a0.h) obj2;
                p6 p6Var = (p6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i18 = 0; i18 < messageObject.messageOwner.media.webpage.attributes.size(); i18++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i18);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new yb(19, p6Var, messageObject.messageOwner.media.webpage));
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new rt0(p6Var, 28));
                break;
            case 19:
                ((p6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 20:
                xn xnVar6 = (xn) obj2;
                View view = (View) obj;
                if (xnVar6.getParentActivity() != null) {
                    xnVar6.H0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    xnVar6.H0.r(16.0f);
                    xnVar6.H0.q(true);
                    xnVar6.H0.t(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    xnVar6.H0.m(0.0f, 96.0f);
                    xnVar6.H0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - xnVar6.wa) - xnVar6.U0.getHeight()));
                    xnVar6.U0.addView(xnVar6.H0, k7.b6.e(-1, 100, 87));
                    ph.f3 f3Var = xnVar6.H0;
                    f3Var.i0 = new lf(xnVar6, 7);
                    f3Var.v();
                    org.telegram.ui.Components.l40.v.b();
                    break;
                }
                break;
            case 21:
                ((xn) obj2).U0.removeView((org.telegram.ui.Components.pk0) obj);
                break;
            case 22:
                MessageObject messageObject2 = (MessageObject) obj;
                xn xnVar7 = ((si) obj2).s;
                MessageObject messageObject3 = (MessageObject) xnVar7.l6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) xnVar7.l6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                xnVar7.qc(messageObject2, true);
                mg.m0.f();
                break;
            case 23:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                xn xnVar8 = ((bm) ((cn) obj2).f).a.N;
                int i19 = xn.Ec;
                xnVar8.Ma();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                break;
            case 24:
                ph.f3 f3Var2 = (ph.f3) obj;
                xn xnVar9 = ((jn) obj2).a;
                xnVar9.U0.removeView(f3Var2);
                if (f3Var2 == xnVar9.x1) {
                    xnVar9.x1 = null;
                    break;
                }
                break;
            case 25:
                Long l10 = (Long) obj;
                xn xnVar10 = ((dn) obj2).Z0.a;
                String str = (l10.longValue() >= 0 || (chat = xnVar10.getMessagesController().getChat(Long.valueOf(-l10.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.qc.a0(xnVar10).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 26:
                po poVar = (po) obj2;
                poVar.getClass();
                poVar.presentFragment(ga1.d0((TLRPC.Chat) obj, true));
                break;
            case 27:
                dp dpVar = (dp) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = dpVar.getMessagesController().getInputChannel(dpVar.W);
                dpVar.e0 = dpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ba(dpVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 28:
                dp dpVar2 = (dp) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                boolean z11 = tL_error3 == null || !tL_error3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                dpVar2.Z = z11;
                if (!z11 && dpVar2.getUserConfig().isPremium() && !dpVar2.a0 && dpVar2.x != null) {
                    dpVar2.a0 = true;
                    dpVar2.b0();
                    dpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new qo(dpVar2, i12));
                    break;
                }
                break;
            default:
                qp.U((qp) obj2, (org.telegram.ui.ActionBar.d2[]) obj);
                break;
        }
    }
}
