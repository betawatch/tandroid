package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rd(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.z41 z41Var;
        org.telegram.ui.Components.d01 d01Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat chat;
        int i9 = this.a;
        MessageObject messageObject = null;
        int i10 = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i9) {
            case 0:
                fe feVar = (fe) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                feVar.w0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    feVar.x0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.i51 i51Var = feVar.W0;
                if (i51Var != null && (z41Var = i51Var.U2) != null) {
                    z41Var.N(true);
                    break;
                }
                break;
            case 1:
                ((fe) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 2:
                qn qnVar = (qn) obj2;
                org.telegram.ui.Components.d01[] d01VarArr = (org.telegram.ui.Components.d01[]) obj;
                if (!qnVar.gb && (d01Var = d01VarArr[0]) != null) {
                    d01VarArr[0] = null;
                    if (qnVar.r0 == d01Var) {
                        qnVar.r0 = null;
                    }
                    AndroidUtilities.removeFromParent(d01Var);
                    break;
                }
                break;
            case 3:
                ((gh.i2) obj2).run((TLRPC.User) obj);
                break;
            case 4:
                qn qnVar2 = (qn) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                t1Var.getLocationInWindow(new int[2]);
                qnVar2.v1.setTranslationY(t1Var.getTimeY() + ((r0[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                qnVar2.v1.n(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r0[0]) + t1Var.nb) + t1Var.lb) - (t1Var.ob / 2.0f));
                qnVar2.v1.v();
                break;
            case 5:
                qn.M0((qn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 6:
                qn qnVar3 = (qn) obj2;
                int[] iArr = (int[]) obj;
                qnVar3.getClass();
                if (iArr[0] != 0) {
                    qnVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 7:
                ((qn) obj2).h8((wg) obj);
                break;
            case 8:
                qn qnVar4 = (qn) obj2;
                ve.e.p(qnVar4.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), qnVar4.b8 == 0, false);
                break;
            case 9:
                ((qn) obj2).ka((TLRPC.Chat) obj);
                break;
            case 10:
                qn.c0((qn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 11:
                qn qnVar5 = (qn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.y4.w0(qnVar5, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.y4.w0(qnVar5, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.y4.w0(qnVar5, tL_error.text);
                    break;
                }
            case 12:
                a0.h hVar = (a0.h) obj2;
                l6 l6Var = (l6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new rd(13, l6Var, messageObject.messageOwner.media.webpage));
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new kt0(l6Var, 28));
                break;
            case 13:
                ((l6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 14:
                qn qnVar6 = (qn) obj2;
                View view = (View) obj;
                if (qnVar6.getParentActivity() != null) {
                    qnVar6.G0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    qnVar6.G0.r(16.0f);
                    qnVar6.G0.q(true);
                    qnVar6.G0.t(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    qnVar6.G0.m(0.0f, 96.0f);
                    qnVar6.G0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - qnVar6.va) - qnVar6.T0.getHeight()));
                    qnVar6.T0.addView(qnVar6.G0, g7.e6.e(-1, 100, 87));
                    kh.x3 x3Var = qnVar6.G0;
                    x3Var.h0 = new gf(qnVar6, 7);
                    x3Var.v();
                    org.telegram.ui.Components.t30.v.b();
                    break;
                }
                break;
            case 15:
                ((qn) obj2).T0.removeView((org.telegram.ui.Components.uj0) obj);
                break;
            case 16:
                MessageObject messageObject2 = (MessageObject) obj;
                qn qnVar7 = ((ki) obj2).s;
                MessageObject messageObject3 = (MessageObject) qnVar7.k6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) qnVar7.k6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                qnVar7.qc(messageObject2, true);
                hg.n0.f();
                break;
            case 17:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                qn qnVar8 = ((tl) ((vm) obj2).f).a.M;
                int i12 = qn.Dc;
                qnVar8.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                break;
            case 18:
                kh.x3 x3Var2 = (kh.x3) obj;
                qn qnVar9 = ((cn) obj2).a;
                qnVar9.T0.removeView(x3Var2);
                if (x3Var2 == qnVar9.w1) {
                    qnVar9.w1 = null;
                    break;
                }
                break;
            case 19:
                Long l10 = (Long) obj;
                qn qnVar10 = ((wm) obj2).Y0.a;
                String str = (l10.longValue() >= 0 || (chat = qnVar10.getMessagesController().getChat(Long.valueOf(-l10.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.oc.a0(qnVar10).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 20:
                ho hoVar = (ho) obj2;
                hoVar.getClass();
                hoVar.presentFragment(s91.c0((TLRPC.Chat) obj, true));
                break;
            case 21:
                vo voVar = (vo) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = voVar.getMessagesController().getInputChannel(voVar.V);
                voVar.d0 = voVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new y9(voVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 22:
                vo voVar2 = (vo) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                voVar2.Y = z10;
                if (!z10 && voVar2.getUserConfig().isPremium() && !voVar2.Z && voVar2.x != null) {
                    voVar2.Z = true;
                    voVar2.a0();
                    voVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new io(voVar2, i10));
                    break;
                }
                break;
            case 23:
                hp.T((hp) obj2, (org.telegram.ui.ActionBar.c2[]) obj);
                break;
            case 24:
                hp hpVar = (hp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    hpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    hpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                hpVar.w = false;
                hpVar.x = true;
                hpVar.a0();
                break;
            case 25:
                ((dp) obj2).x.d.L = false;
                ((org.telegram.ui.Components.r70) obj).run();
                break;
            case 26:
                ((dp) obj2).x.d.K = false;
                ((org.telegram.ui.Components.s70) obj).run();
                break;
            case 27:
                hp hpVar2 = ((dp) obj2).x.d;
                hpVar2.K = false;
                hpVar2.L = false;
                ((Runnable) obj).run();
                break;
            case 28:
                dp dpVar = (dp) obj2;
                dpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                dpVar.h = true;
                dpVar.c.setChecked(true);
                break;
            default:
                jr jrVar = (jr) obj2;
                jrVar.getClass();
                jrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).id, 0, true);
                break;
        }
    }
}
