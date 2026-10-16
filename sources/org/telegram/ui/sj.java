package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class sj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ fo b;

    public sj(fo foVar, Context context) {
        this.b = foVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v17 */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i13;
        int i14;
        ?? r92;
        int i15;
        int i16;
        int i17;
        int i18;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.b;
        SparseArray[] sparseArrayArr = foVar.Y5;
        SparseArray[] sparseArrayArr2 = foVar.X5;
        SparseArray[] sparseArrayArr3 = foVar.W5;
        long j10 = 0;
        final int i19 = 0;
        if (i10 == -1) {
            if (foVar.wc.f) {
                foVar.xa();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
            if (kVar.t()) {
                foVar.C7(false);
                return;
            }
            if (foVar.R3 == 5 && (foVar.u6.isEmpty() || foVar.d4 == 0)) {
                foVar.Ub();
            } else if (foVar.R3 == 6 && foVar.Y.v()) {
                foVar.Ab(new Runnable(this) { // from class: org.telegram.ui.pj
                    public final /* synthetic */ sj b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                this.b.b.finishFragment();
                                break;
                            default:
                                sj sjVar = this.b;
                                sjVar.getClass();
                                fo foVar2 = sjVar.b;
                                Intent intent = new Intent(foVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", foVar2.P3.link);
                                foVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!foVar.a7(true, true)) {
                foVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (foVar.getUserConfig().getClientUserId() == foVar.T5) {
                    foVar.getMessagesController().setSavedViewAs(true);
                    foVar.a1.e(false, true);
                    return;
                } else {
                    foVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-foVar.T5, false);
                    kg1.I0(foVar);
                    return;
                }
            }
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j11 = 0;
                int i20 = 1;
                while (i20 >= 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i21 = i19; i21 < sparseArrayArr2[i20].size(); i21++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i20].keyAt(i21)));
                    }
                    if (foVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = i19; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) fo.I8(messageObject2, arrayList.size() != 1 && ((user3 = foVar.f) == null || !user3.self), j11));
                        j11 = messageObject2.getFromChatId();
                    }
                    i20--;
                    i19 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    foVar.T7();
                    foVar.y3.j(58, 0L, null);
                }
                foVar.C7(false);
                return;
            }
            int i23 = 12;
            if (i10 != 12) {
                if (i10 == 11) {
                    foVar.ga(true);
                    return;
                }
                if (i10 == 69) {
                    fo.C1(foVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j12 = foVar.T5;
                        if (ChatObject.isMonoForum(foVar.e)) {
                            i18 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i18, foVar.e)) {
                                j12 = foVar.d4;
                                j10 = foVar.T5;
                            }
                        }
                        i17 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        zh.n5.y(i17, false).i0(j12, j10, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j13 = foVar.T5;
                        if (ChatObject.isMonoForum(foVar.e)) {
                            i16 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i16, foVar.e)) {
                                j13 = foVar.d4;
                                j10 = foVar.T5;
                            }
                        }
                        long j14 = j13;
                        long j15 = j10;
                        i15 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        zh.n5.y(i15, false).C(j14, j15, new ih(this, j14, j15, 1));
                        return;
                    }
                    if (i10 == 28) {
                        if (foVar.bb == null) {
                            fo.I1(foVar);
                            return;
                        } else {
                            foVar.p9();
                            return;
                        }
                    }
                    if (i10 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i24 = 1; i24 >= 0; i24--) {
                            for (int i25 = 0; i25 < sparseArrayArr3[i24].size(); i25++) {
                                arrayList2.add((MessageObject) sparseArrayArr3[i24].valueAt(i25));
                            }
                            sparseArrayArr3[i24].clear();
                            sparseArrayArr2[i24].clear();
                            sparseArrayArr[i24].clear();
                        }
                        boolean z10 = foVar.f6 > 0;
                        foVar.h9();
                        foVar.Cc(0, true);
                        foVar.ad(false);
                        MediaController.saveFilesFromMessages(foVar.getParentActivity(), foVar.getAccountInstance(), arrayList2, new qj(0, this, z10));
                        return;
                    }
                    if (i10 == 13) {
                        if (foVar.getParentActivity() == null) {
                            return;
                        }
                        foVar.showDialog(org.telegram.ui.Components.g5.U(foVar.getParentActivity(), foVar.h, foVar.ea).a);
                        return;
                    }
                    int i26 = 14;
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (foVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(foVar.e)) {
                            if (foVar.d4 == 0 || (user2 = foVar.getMessagesController().getUser(Long.valueOf(foVar.d4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.g5.q(foVar, -1, user2, foVar.e, true, new m4.y0(i26, this, user2), foVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = foVar.Z7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26) {
                            if (i10 == 15) {
                                i11 = (foVar.h != null || (((user = foVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(foVar.f)) && ((chatFull = foVar.Z7) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                            }
                            org.telegram.ui.Components.g5.r(foVar, i10 == i11, foVar.e, foVar.f, foVar.h == null ? 0 : 1, true, false, z11, new i2.r(this, i10, z11));
                            return;
                        }
                        boolean z12 = z11;
                        org.telegram.ui.Components.g5.q(foVar, -1, foVar.f, foVar.e, z12, new rj(this, z12), foVar.getResourceProvider());
                        return;
                    }
                    int i27 = 17;
                    if (i10 == 17) {
                        if (foVar.f == null || foVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = foVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            foVar.vb(null, ((Integer) foVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", foVar.f.id);
                        bundle.putBoolean("addContact", true);
                        foVar.presentFragment(new ws(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        foVar.fc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            foVar.getMediaDataController().installShortcut(foVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(foVar.e)) {
                            foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(foVar.T5));
                            return;
                        }
                        z5 z5Var = new z5(foVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = foVar.D1;
                        z5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new q5(z5Var, 0));
                        }
                        foVar.presentFragment(z5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i28 = i41.v;
                        int currentAccount = foVar.getCurrentAccount();
                        Activity parentActivity = foVar.getParentActivity();
                        long a2 = foVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        i41.L(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i29 = 0; i29 < 2; i29++) {
                            for (int i30 = 0; i30 < sparseArrayArr[i29].size(); i30++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i29].valueAt(i30);
                                foVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !foVar.Z5);
                            }
                        }
                        foVar.C7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i31 = 1; i31 >= 0; i31--) {
                            if (messageObject == null && sparseArrayArr3[i31].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i32 = 0; i32 < sparseArrayArr3[i31].size(); i32++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i31].keyAt(i32)));
                                }
                                messageObject = (MessageObject) foVar.o6[i31].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i31].clear();
                            sparseArrayArr2[i31].clear();
                            sparseArrayArr[i31].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            foVar.bc(messageObject, false);
                        } else {
                            foVar.d5 = messageObject;
                            foVar.Fa(109);
                            r92 = 0;
                        }
                        foVar.h9();
                        foVar.Cc(r92, true);
                        foVar.ad(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i13 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        ig.a2 c10 = ig.b2.f(i13).c(foVar.M8());
                        Activity parentActivity2 = foVar.getParentActivity();
                        i14 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        ig.y1.d0(parentActivity2, i14, foVar.Q3, c10, foVar.getResourceProvider(), new uc(9, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.a, foVar.getResourceProvider(), true, true);
                        e1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        e1Var.setOnClickListener(new a(this, i23));
                        org.telegram.ui.ActionBar.u0 u0Var = foVar.h0;
                        org.telegram.ui.ActionBar.x xVar = foVar.e0;
                        xVar.a();
                        u0Var.M(e1Var, xVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        foVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", foVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        foVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", foVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        foVar.qa(foVar.J9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        foVar.getMessagesController().getTranslateController().setHideTranslateDialog(foVar.a(), false, true);
                        if (foVar.getMessagesController().getTranslateController().toggleTranslatingDialog(foVar.a(), true)) {
                            return;
                        }
                        foVar.Uc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (foVar.f == null || foVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = foVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = foVar.a8;
                        org.telegram.ui.Components.voip.d2.m(user4, z13, userFull != null && userFull.video_calls_available, foVar.getParentActivity(), foVar.getMessagesController().getUserFull(foVar.f.id), foVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        sk skVar = foVar.Y;
                        if (skVar == null || skVar.getEditField() == null) {
                            return;
                        }
                        foVar.Y.getEditField().setSelectionOverride(foVar.A4, foVar.B4);
                        foVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        sk skVar2 = foVar.Y;
                        if (skVar2 == null || skVar2.getEditField() == null) {
                            return;
                        }
                        foVar.Y.getEditField().setSelectionOverride(foVar.A4, foVar.B4);
                        foVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        sk skVar3 = foVar.Y;
                        if (skVar3 == null || skVar3.getEditField() == null) {
                            return;
                        }
                        foVar.Y.getEditField().setSelectionOverride(foVar.A4, foVar.B4);
                        foVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        sk skVar4 = foVar.Y;
                        if (skVar4 == null || skVar4.getEditField() == null) {
                            return;
                        }
                        foVar.Y.getEditField().setSelectionOverride(foVar.A4, foVar.B4);
                        foVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        sk skVar5 = foVar.Y;
                        if (skVar5 == null || skVar5.getEditField() == null) {
                            return;
                        }
                        foVar.Y.getEditField().setSelectionOverride(foVar.A4, foVar.B4);
                        foVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        sk skVar6 = foVar.Y;
                        if (skVar6 == null || skVar6.getEditField() == null) {
                            return;
                        }
                        foVar.Y.getEditField().setSelectionOverride(foVar.A4, foVar.B4);
                        foVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        sk skVar7 = foVar.Y;
                        if (skVar7 == null || skVar7.getEditField() == null) {
                            return;
                        }
                        foVar.Y.getEditField().setSelectionOverride(foVar.A4, foVar.B4);
                        foVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        sk skVar8 = foVar.Y;
                        if (skVar8 == null || skVar8.getEditField() == null) {
                            return;
                        }
                        foVar.Y.getEditField().setSelectionOverride(foVar.A4, foVar.B4);
                        foVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        sk skVar9 = foVar.Y;
                        if (skVar9 == null || skVar9.getEditField() == null) {
                            return;
                        }
                        foVar.Y.getEditField().setSelectionOverride(foVar.A4, foVar.B4);
                        foVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        sk skVar10 = foVar.Y;
                        if (skVar10 == null || skVar10.getEditField() == null) {
                            return;
                        }
                        foVar.Y.getEditField().setSelectionOverride(foVar.A4, foVar.B4);
                        foVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        foVar.Bb();
                        return;
                    }
                    if (i10 == 60) {
                        if (foVar.c4 == null) {
                            return;
                        }
                        TopicsController topicsController = foVar.getMessagesController().getTopicsController();
                        long j16 = foVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = foVar.c4;
                        int i33 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i33, true);
                        foVar.Vc();
                        foVar.lc(false);
                        foVar.Uc(true);
                        return;
                    }
                    if (i10 == 61) {
                        kg1.I0(foVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(foVar.P3.link);
                        org.telegram.ui.Components.zc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.pj
                            public final /* synthetic */ sj b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.b.b.finishFragment();
                                        break;
                                    default:
                                        sj sjVar = this.b;
                                        sjVar.getClass();
                                        fo foVar2 = sjVar.b;
                                        Intent intent = new Intent(foVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", foVar2.P3.link);
                                        foVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (foVar.Y.v()) {
                            foVar.Ab(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = foVar.getParentActivity();
                        i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = foVar.P3;
                        c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                        ig.v.b0(parentActivity3, i12, tL_businessChatLink, c6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, foVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, i27));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        foVar.showDialog(a2Var);
                        TextView textView2 = (TextView) a2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        gf1 a02 = gf1.a0(-foVar.T5, 0L);
                        a02.y = foVar;
                        foVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        foVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = k4.b1;
                            org.telegram.ui.Components.zc.a0(foVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = foVar.e;
                if (chat != null) {
                    foVar.presentFragment(fo.W9(-chat.linked_monoforum_id));
                }
            } else if (foVar.getParentActivity() != null) {
                foVar.I7(null, null, false);
            }
        }
    }
}
