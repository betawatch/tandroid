package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tm(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        MessageObject threadMessage;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 25;
        int i13 = 0;
        int i14 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                MessageObject messageObject = (MessageObject) obj2;
                Long l10 = (Long) obj;
                tn tnVar = ((fn) obj3).a;
                if (tnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageObject.getDiceEmoji(), tnVar.P5, tnVar.j5, tnVar.T3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = tnVar.C8();
                    of2.dice_stake = l10.longValue();
                    tnVar.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                tn tnVar2 = ((fn) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    while (i13 < tnVar2.t0.getChildCount()) {
                        View childAt = tnVar2.t0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var2.getMessageObject() != null && s1Var2.getMessageObject().isSensitive()) {
                                s1Var2.h4();
                            }
                        }
                        i13++;
                    }
                    break;
                } else {
                    if (s1Var.getMessageObject() != null) {
                        s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    s1Var.h4();
                    break;
                }
                break;
            case 2:
                fn fnVar = (fn) obj3;
                tm tmVar = (tm) obj2;
                tn tnVar3 = fnVar.a;
                if (((Boolean) obj).booleanValue()) {
                    tnVar3.getMessagesController().setContentSettings(true);
                    org.telegram.ui.Components.tc.a0(tnVar3).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new pm(fnVar, 8)), true)).k(true);
                    tmVar.run(Boolean.TRUE);
                    break;
                } else {
                    org.telegram.ui.Components.tc.a0(tnVar3).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 3:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((fn) obj3).a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 4:
                wn wnVar = (wn) obj3;
                wnVar.f.t(((of.a) obj).b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = wnVar.b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 5:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.hf) obj3).a;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject2 = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((String) obj2, j10, messageObject2, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                tn tnVar4 = chatActivityEnterView.K2;
                of3.sendMessageChatArguments = tnVar4 != null ? tnVar4.C8() : null;
                of3.effect_id = chatActivityEnterView.N4;
                of3.payStars = l11.longValue();
                of3.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of3.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(of3);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.i0.c();
                org.telegram.ui.Components.re reVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                reVar.setEffect(0L);
                break;
            case 6:
                org.telegram.ui.Components.ni niVar = (org.telegram.ui.Components.ni) obj3;
                ((tn) obj2).c5 = (MessageSuggestionParams) obj;
                boolean G1 = niVar.G1(0, true, 0, niVar.s1(), niVar.J0);
                org.telegram.ui.Components.ff ffVar = niVar.d0;
                if (ffVar != null) {
                    ffVar.h(!G1);
                    niVar.d0 = null;
                    break;
                }
                break;
            case 7:
                ((ph.n3) obj3).getWebViewContainer().C((String) obj2, (String) obj, false);
                break;
            case 8:
                org.telegram.ui.Components.bl blVar = ((org.telegram.ui.Components.yk) obj3).b;
                blVar.t0.d(((org.telegram.ui.Components.al) obj2).c, blVar.u0, true, 0, ((Long) obj).longValue());
                blVar.b.dismiss(true);
                break;
            case 9:
                org.telegram.ui.Components.gv gvVar = (org.telegram.ui.Components.gv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fv(gvVar, i14));
                    break;
                }
                break;
            case 10:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.gt gtVar = (org.telegram.ui.Components.gt) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                gtVar.run();
                break;
            case 11:
                org.telegram.ui.Components.dy dyVar = (org.telegram.ui.Components.dy) obj3;
                org.telegram.ui.Components.ey eyVar = dyVar.a;
                org.telegram.ui.Components.fz fzVar = eyVar.B;
                MediaDataController.getInstance(fzVar.Y0).getEmojiSuggestions(fzVar.S0, eyVar.v, false, new androidx.car.app.utils.a(i12, dyVar, (Runnable) obj, (String) obj2), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(fzVar.Y0).isPremium(), false, true, 25);
                break;
            case 12:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ey eyVar2 = ((org.telegram.ui.Components.dy) obj3).a;
                if (ConnectionsManager.getInstance(eyVar2.B.Y0).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    org.telegram.ui.Components.ey.E(eyVar2, runnable, arrayList2, false);
                    break;
                }
            case 13:
                org.telegram.ui.Components.yy yyVar = (org.telegram.ui.Components.yy) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj4 = arrayList3.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(yyVar.w.M.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        yyVar.n.add(new org.telegram.ui.Components.wx(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 14:
                org.telegram.ui.Components.y00 y00Var = (org.telegram.ui.Components.y00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (y00Var.W != null || (y00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.mc M = org.telegram.ui.Components.tc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, y00Var.b0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", y00Var.d0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    org.telegram.ui.Components.mc M2 = org.telegram.ui.Components.tc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, y00Var.b0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M2.j = 5000;
                    M2.j();
                    break;
                }
            case 15:
                View view2 = (View) obj3;
                org.telegram.ui.Components.d dVar = (org.telegram.ui.Components.d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                    view2.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((r2[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((r2[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view2.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view2.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.g6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? -0.2f : -0.07f);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                break;
            case 16:
                MessagesController messagesController = (MessagesController) obj3;
                org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) obj2;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.tc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.md(i11, U)), true)).k(true);
                    }
                    zq0Var.run(Boolean.TRUE);
                    break;
                } else if (U != null) {
                    org.telegram.ui.Components.tc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.qu0.j((org.telegram.ui.Components.qu0) obj3, (TL_stories.StoryItem) obj2, (lh.l6) obj);
                break;
            case 18:
                ht htVar = (ht) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                Long l12 = (Long) obj;
                htVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                o2Var2.presentFragment(new ProfileActivity(bundle, null));
                htVar.p();
                break;
            case 19:
                dt dtVar = (dt) obj3;
                Boolean bool = (Boolean) obj;
                dtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    dtVar.a.p();
                    break;
                }
                break;
            case 20:
                fy fyVar = (fy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    fyVar.showDialog(new nj0(activity, !org.telegram.ui.Components.yd0.c(), new tv(activity, 0)));
                    break;
                }
                break;
            case 21:
                wo0 wo0Var = (wo0) obj2;
                Integer num = (Integer) obj;
                p00 p00Var = ((m00) obj3).e;
                if (p00Var.getUserConfig().isPremium()) {
                    int intValue = num.intValue();
                    p00Var.A = intValue;
                    wo0Var.a(intValue, true);
                    d00 d00Var = p00Var.E;
                    if (d00Var != null) {
                        d00Var.d(!p00Var.getUserConfig().isPremium() ? -1 : p00Var.A, true);
                    }
                    p00Var.i0(true);
                    break;
                } else {
                    p00Var.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) p00Var, 35, true));
                    break;
                }
            case 22:
                a50 a50Var = (a50) obj3;
                cg.h0 h0Var = (cg.h0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (h0Var != null) {
                    a50Var.getClass();
                    h0Var.setVisibility(0);
                }
                a50Var.c = bitmap2;
                Paint paint = new Paint(1);
                a50Var.d = paint;
                Bitmap bitmap3 = a50Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                a50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                a50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 23:
                mb0 mb0Var = (mb0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                mb0Var.a();
                if (user != null) {
                    long j11 = userArr[0].id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    mb0Var.n(new lb0(bundle2, user, userArr, j11), false);
                    break;
                }
                break;
            case 24:
                zi0 zi0Var = (zi0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = zi0Var.b0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && zi0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = zi0Var.n0;
                if (bool2 == null || !bool2.booleanValue()) {
                    zi0Var.U(true, true);
                    break;
                } else {
                    tm tmVar2 = new tm(i12, zi0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str == null || str.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new cg.m2(tmVar2, 9));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i13 = connectionsManager.sendRequest(tL_contacts_search, new bg.h3(i11, messagesController2, tmVar2));
                    }
                    zi0Var.i0 = i13;
                    break;
                }
                break;
            case 25:
                zi0 zi0Var2 = (zi0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && zi0Var2.R(user3)) {
                            zi0Var2.b0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                zi0Var2.U(true, true);
                break;
            case 26:
                kj0 kj0Var = (kj0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    kj0Var.N.setImageDrawable(null);
                    kj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new lf0(4, kj0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = kj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(kj0Var.getThemedColor(org.telegram.ui.ActionBar.g6.v6), PorterDuff.Mode.SRC_IN));
                    kj0Var.N.setImageDrawable(mutate);
                    if (user4.contact) {
                        kj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new lf0(5, kj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        kj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                kj0Var.w(false);
                break;
            case 27:
                ArrayList arrayList6 = (ArrayList) obj3;
                org.telegram.ui.Components.t9[] t9VarArr = (org.telegram.ui.Components.t9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                        String str3 = (String) arrayList6.get(i15);
                        int i16 = 0;
                        while (true) {
                            if (i16 < tL_messages_stickerSet.packs.size()) {
                                if (tL_messages_stickerSet.packs.get(i16).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i16).emoticon, str3)) {
                                    i16++;
                                } else {
                                    long longValue = tL_messages_stickerSet.packs.get(i16).documents.get(0).longValue();
                                    for (int i17 = 0; i17 < tL_messages_stickerSet.documents.size(); i17++) {
                                        if (tL_messages_stickerSet.documents.get(i17).id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i17);
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            t9VarArr[i15].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 28:
                ((String[]) obj3)[0] = (String) obj;
                ((nk0) obj2).run();
                break;
            default:
                yo0 yo0Var = (yo0) obj3;
                yo0Var.n = false;
                ((to0) obj2).f.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    yo0Var.v0();
                    yo0Var.finishFragment();
                    yo0Var.y0();
                    break;
                }
                break;
        }
    }
}
