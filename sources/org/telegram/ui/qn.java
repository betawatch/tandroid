package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.util.Property;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qn implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ fo a;

    public qn(fo foVar) {
        this.a = foVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        fo foVar = this.a;
        if (foVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        b5Var = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
            if (((ActionBarLayout) b5Var2).y()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        boolean z11 = tLObject instanceof TLRPC.Chat;
        if (z11) {
            bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
        } else if (!(tLObject instanceof TLRPC.User)) {
            return;
        } else {
            bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
        }
        if (!z10 || !z11) {
            foVar.presentFragment(new fo(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, foVar.getParentActivity(), foVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(foVar.getParentActivity(), false, false);
        e1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        e1Var.setMinimumWidth(160);
        e1Var.setOnClickListener(new a(this, 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(foVar.getParentActivity(), false, false);
        e1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        e1Var2.setMinimumWidth(160);
        e1Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, u1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
        fo foVar2 = new fo(bundle);
        foVar2.J9 = true;
        foVar.presentFragmentAsPreviewWithMenu(foVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        foVar.g7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final boolean A1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        b5 b5Var;
        wk wkVar;
        vk vkVar;
        if (!k()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        fo foVar = this.a;
        int i14 = (isEmpty || foVar.e == null || ((wkVar = foVar.O0) != null && wkVar.getVisibility() == 0) || ((vkVar = foVar.R) != null && vkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = foVar.e;
        int i15 = (chat2 == null || !(foVar.d4 == 0 || foVar.h4) || (ChatObject.isChannel(chat2) && !foVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = foVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || foVar.K9()) ? 1 : 0;
        h5[] h5VarArr = new h5[i16 + 1 + i14 + i15];
        h5VarArr[0] = h5.d;
        if (i16 != 0) {
            h5VarArr[1] = chat.broadcast ? h5.e : h5.f;
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (i14 != 0) {
            h5VarArr[i10] = h5.n;
            i10++;
        }
        if (i15 != 0) {
            h5VarArr[i10] = h5.r;
        }
        TLRPC.ChatFull chatFull = foVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            b5Var = b5.a(chat, chatFull, h5VarArr);
            i13 = i15;
            i12 = i16;
            z10 = true;
            z11 = i14;
        } else {
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            int i17 = i15;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            int i18 = i16;
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z10 = true;
            i12 = i18;
            z11 = i14;
            i13 = i17;
            b5Var = new b5(forUserOrChat, forUserOrChat2, null, str, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, h5VarArr, new a5(i11, chat, NotificationCenter.chatInfoDidLoad));
        }
        if (c2.b.g(b5Var)) {
            c2.b.m().y((ViewGroup) foVar.fragmentView, foVar.ea, b5Var, new f7(this, chat, u1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(foVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new en(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new t1(this, u1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new en(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new en(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        boolean z13 = z10;
        H.W = z13;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return z13;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null || messageObject.type != 27) {
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        u1Var.t2();
        u1Var.requestLayout();
        this.a.A0.R(messageObject, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        MessageObject messageObject = u1Var.getMessageObject();
        int i10 = messageObject.type;
        fo foVar = this.a;
        if (i10 != 16) {
            foVar.L7(u1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = foVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = foVar.a8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.d2.m(user, isVideoCall, i11, foVar.getParentActivity(), foVar.getMessagesController().getUserFull(foVar.f.id), foVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(foVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(foVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = foVar.getMessagesController().conferenceCallSizeLimit;
        a2Var.setOnCancelListener(new ga(this, foVar.getConnectionsManager().sendRequest(getgroupcall, new di.fd(this, a2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
        a2Var.q(600L);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        fo foVar = this.a;
        if (foVar.E9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (foVar.getParentActivity() != null) {
            if (foVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        foVar.ea(null, tL_inlineButtonTypeUrl.url, true, u1Var, u1Var.getMessageObject());
                        try {
                            u1Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) foVar.getParentActivity(), (org.telegram.ui.ActionBar.c6) foVar.ea, false);
                e3Var.fixNavigationBar();
                e3Var.title = str;
                e3Var.bigTitle = false;
                e3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                mg.j jVar = new mg.j(3, foVar, str);
                e3Var.items = charSequenceArr;
                e3Var.onClickListener = jVar;
                foVar.showDialog(e3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C(org.telegram.ui.Cells.u1 u1Var) {
        fo foVar = this.a;
        if (!foVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(foVar.getParentActivity(), 3, null);
            a2Var.q(200L);
            foVar.getMessagesController().getContentSettings(new z(this, a2Var, u1Var, 6));
        } else {
            if (u1Var.getMessageObject() != null) {
                u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            u1Var.h4();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean C1() {
        fo foVar = this.a;
        return foVar.X0.getKeyboardHeight() + foVar.oa >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.u1 u1Var) {
        h(u1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        int i12 = buttonCustom.id;
        fo foVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    foVar.L7(u1Var, true, false, u1Var.getLastTouchX(), u1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        foVar.R1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, foVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, foVar.e, 5);
                }
                bi.h4 h4Var = new bi.h4(this, message, canManageMonoForum, messageObject, 10);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                foVar.j7(h4Var, ag.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        uc ucVar = new uc(13, this, message);
        Pattern pattern = org.telegram.ui.Components.g5.a;
        Activity parentActivity = foVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.a2 a2Var = d2Var.a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        editText.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        editText.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.H6, false));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.g6.T(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.v4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        d2Var.n(frameLayout);
        d2Var.k(LocaleController.getString(R.string.Decline), new m4.y0(26, ucVar, editText));
        d2Var.h(LocaleController.getString(R.string.Cancel), null);
        a2Var.N = new org.telegram.ui.Components.q1(editText, i13);
        frameLayout.addView(editText, w7.z5.a(-2.0f, 23.0f, 0.0f, 23.0f, 21.0f, -1, 0));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qg(editText, 3), 100L);
        foVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E1(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        fo foVar = this.a;
        foVar.d5 = messageObject;
        foVar.i9();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        if (u1Var == null || (messageObject = u1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        fo foVar = this.a;
        if (foVar.wb == id2 && foVar.xb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = foVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        pf.c cVar = foVar.Ab;
        if (cVar != null) {
            cVar.a(true);
            foVar.Ab = null;
        }
        int[] iArr = new int[1];
        ej ejVar = new ej(foVar, id2, u1Var, 2);
        ejVar.b = new jd(8, foVar, iArr);
        foVar.Ab = ejVar;
        ejVar.d();
        iArr[0] = foVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new kf(foVar, ejVar, iArr, u1Var, messageObject, 2));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G(org.telegram.ui.Cells.u1 u1Var) {
        fo foVar = this.a;
        foVar.xa.k(u1Var, foVar, true);
        foVar.x0.I0(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        fo foVar = this.a;
        foVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        foVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        h(u1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = textLayoutBlock.textLayout.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new li.h(false, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
        AndroidUtilities.addToClipboard(spannableString);
        org.telegram.messenger.sk.p(R.string.CodeCopied, org.telegram.ui.Components.zc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void J1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !pf.d.g(str, false, false)) ? z10 : true;
        fo foVar = this.a;
        pf.c cVar = foVar.Ab;
        if (cVar != null) {
            cVar.a(true);
        }
        foVar.Ab = u1Var.getMessageObject() == null ? null : new mn(this, u1Var);
        if (z11 || pf.d.e(parse, false, null)) {
            pf.d.q(foVar.getParentActivity(), parse, true, true, false, foVar.Ab, null, false, true, false);
        } else {
            org.telegram.ui.Components.g5.q0(foVar, str, true, true, true, !z11, foVar.Ab, webPage, foVar.ea);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean K0(long j10) {
        fo foVar = this.a;
        TLRPC.Chat chat = foVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return foVar.getMessagesController().isOwner(foVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle K1(org.telegram.ui.Cells.u1 u1Var) {
        fo foVar;
        int i10;
        if (u1Var.getMessageObject() == null || (i10 = (foVar = this.a).wb) == 0 || i10 != u1Var.getMessageObject().getId() || foVar.xb != 1) {
            return null;
        }
        return foVar.yb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L0(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        a3.i0 i0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        fo foVar = this.a;
        vh.i iVar = foVar.X9;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        vh.h hVar = (vh.h) hashMap.get(vh.i.b(u1Var));
        org.telegram.ui.Components.sc scVar = null;
        MessageObject messageObject = hVar != null ? hVar.E : null;
        vh.h hVar2 = (vh.h) foVar.X9.a.get(vh.i.b(u1Var));
        long j10 = (hVar2 == null || (i11 = hVar2.R) == -1) ? 0L : hVar2.w[i11].d;
        if (messageObject != null && j10 != 0) {
            Activity parentActivity = foVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            if (!org.telegram.ui.Components.g5.g(parentActivity, i10, j10, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) foVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.g0.k(messageObject);
                }
                boolean z10 = j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                long j11 = j10;
                a3.i0 i0Var2 = new a3.i0(this, arrayList, j11, 14);
                if (z10) {
                    i0Var2.run();
                    i0Var = null;
                } else {
                    i0Var = i0Var2;
                }
                scVar = org.telegram.ui.Components.zc.v(foVar.getParentActivity(), foVar, null, 1, j11, 1, foVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), foVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), 5000, false, i0Var);
                scVar.k = true;
                scVar.k(scVar.e instanceof org.telegram.ui.Components.dc);
            }
        }
        vh.h hVar3 = (vh.h) hashMap.get(vh.i.b(u1Var));
        if (hVar3 != null) {
            if (scVar == null) {
                hVar3.R = -1;
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.wb wbVar = scVar.e;
            if (!(wbVar instanceof org.telegram.ui.Components.ac)) {
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) wbVar;
            hVar3.W = acVar;
            acVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new lm(2, hVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            fo foVar = this.a;
            org.telegram.ui.Components.hv.J(foVar, messageObject, foVar.Ga, str2, str3, str4, str, i10, i11, -1, foVar.C9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
        boolean z10 = u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        fo foVar = this.a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) u1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (foVar.T5 != j10) {
                foVar.presentFragment(fo.W9(j10));
            } else {
                foVar.a1.e(false, false);
            }
        }
        if (u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            foVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) u1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean M1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        p51 p51Var;
        int i11 = 1;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            r51 r51Var = this.a.Z9;
            if (r51Var == null || r51Var.b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.zc.a0(this.a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.Z9 = new r51(this.a.getParentActivity());
                r51 r51Var2 = this.a.Z9;
                bf jb2 = !messageObject.isOutOwner() ? this.a.jb(messageObject, true) : null;
                a3.i0 P4 = !messageObject.isOutOwner() ? fo.P4(this.a, messageObject) : null;
                Context context = r51Var2.a;
                ah.v vVar = r51Var2.c;
                r51Var2.X = jb2;
                r51Var2.Y = P4;
                p51 p51Var2 = r51Var2.N;
                if (p51Var2 != null) {
                    vVar.removeView(p51Var2);
                    r51Var2.N = null;
                }
                r51Var2.O = u1Var;
                MessageObject messageObject2 = u1Var.getMessageObject();
                r51Var2.M = messageObject2;
                r51Var2.S = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.u1 u1Var2 = r51Var2.O;
                r51Var2.L = u1Var2 != null ? u1Var2.getResourcesProvider() : null;
                if (r51Var2.O != null) {
                    r51Var2.T = 0.0f;
                    r51Var2.U = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        r51Var2.T = view.getY() + r51Var2.T;
                        r51Var2.U = view.getY() + r51Var2.U;
                    }
                    int width = r51Var2.O.getWidth();
                    int height = r51Var2.O.getHeight();
                    if (r51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i12 = height;
                    r51Var2.K = i12 - r51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i12) * 0.92f) / AndroidUtilities.density);
                    viewGroup = vVar;
                    p51 p51Var3 = new p51(r51Var2, r51Var2.getContext(), UserConfig.selectedAccount, r51Var2.O.getResourcesProvider(), width, i12);
                    r51Var2.N = p51Var3;
                    r51Var2.O.j1(p51Var3);
                    r51Var2.N.i1(r51Var2.O);
                    r51Var2.N.setDelegate(new pb.a(18));
                    p51 p51Var4 = r51Var2.N;
                    MessageObject messageObject3 = r51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = r51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = r51Var2.O;
                    p51Var4.X3(messageObject3, currentMessagesGroup, u1Var3.F, u1Var3.E, false, false);
                    if (!r51Var2.S) {
                        org.telegram.ui.Components.n8 n8Var = new org.telegram.ui.Components.n8();
                        r51Var2.V = n8Var;
                        p51 p51Var5 = r51Var2.N;
                        n8Var.i = p51Var5;
                        p51Var5.ee = n8Var;
                        if (p51Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.jp0 seekBarWaveform = r51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = r51Var2.s;
                            org.telegram.ui.Cells.u1 u1Var4 = seekBarWaveform.n;
                            if (u1Var4 != null) {
                                u1Var4.invalidate();
                            }
                        }
                    }
                    r51Var2.H = false;
                    viewGroup.addView(r51Var2.N, new FrameLayout.LayoutParams(r51Var2.O.getWidth(), i12, 17));
                } else {
                    viewGroup = vVar;
                    i10 = 360;
                }
                TextureView textureView = r51Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    r51Var2.P = null;
                }
                if (r51Var2.S) {
                    r51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    r51Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, w7.z5.d(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.i81 i81Var = r51Var2.w;
                if (i81Var != null) {
                    i81Var.B();
                    r51Var2.w.H();
                    r51Var2.w = null;
                }
                org.telegram.ui.Cells.u1 u1Var5 = r51Var2.O;
                if (u1Var5 != null && u1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(r51Var2.O.getMessageObject().currentAccount).getPathToAttach(r51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(r51Var2.O.getMessageObject().currentAccount).getPathToMessage(r51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && r51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(r51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.i81 i81Var2 = new org.telegram.ui.Components.i81();
                        r51Var2.w = i81Var2;
                        i81Var2.J = new q51(r51Var2);
                        if (r51Var2.V != null) {
                            i81Var2.K = new q51(r51Var2);
                        }
                        if (r51Var2.S) {
                            i81Var2.V(r51Var2.P);
                        }
                        r51Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        r51Var2.w.C();
                        org.telegram.ui.Components.wt wtVar = r51Var2.E;
                        if (wtVar != null) {
                            wtVar.s = r51Var2.w;
                            wtVar.a();
                        }
                    }
                    fo foVar = this.a;
                    foVar.showDialog(foVar.Z9);
                    return false;
                }
                di.d4 d4Var = r51Var2.x;
                if (d4Var != null) {
                    viewGroup.removeView(d4Var);
                    r51Var2.x = null;
                }
                MessageObject messageObject4 = r51Var2.M;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = r51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(r51Var2.M.currentAccount).getClientUserId()) {
                    di.d4 d4Var2 = new di.d4(context, 3);
                    r51Var2.x = d4Var2;
                    d4Var2.p(true);
                    if (z10) {
                        long dialogId = r51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(r51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(r51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        r51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.formatString(r51Var2.S ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        r51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.getString(r51Var2.S ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    r51Var2.x.q(12.0f);
                    r51Var2.x.setPadding(AndroidUtilities.dp((z10 || r51Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (r51Var2.S) {
                        r51Var2.x.m(0.5f, 0.0f);
                        r51Var2.x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        r51Var2.x.m(0.0f, AndroidUtilities.dp(34.0f));
                        r51Var2.x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    r51Var2.x.t(14.0f);
                    di.d4 d4Var3 = r51Var2.x;
                    d4Var3.h = di.d4.a(d4Var3.getText(), r51Var2.x.getTextPaint());
                    if (r51Var2.S) {
                        viewGroup.addView(r51Var2.x, w7.z5.a(150.0f, 0.0f, (-75.0f) - (((r51Var2.O.getHeight() + r51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f, (int) ((r51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 17));
                    } else {
                        viewGroup.addView(r51Var2.x, w7.z5.a(150.0f, ((((r51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + r51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((r51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f, (int) ((r51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 17));
                    }
                    r51Var2.x.u();
                }
                TextView textView = r51Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    r51Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                r51Var2.y = textView2;
                textView2.setTextColor(-1);
                r51Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    r51Var2.y.setBackground(org.telegram.ui.ActionBar.g6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    r51Var2.y.setBackground(org.telegram.ui.ActionBar.g6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                r51Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.b6.a(r51Var2.y);
                r51Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                r51Var2.y.setOnClickListener(new n51(r51Var2, i11));
                viewGroup.addView(r51Var2.y, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 18.0f, -2, 81));
                if (!z10 && (p51Var = r51Var2.N) != null && p51Var.getMessageObject() != null && r51Var2.N.getMessageObject().messageOwner != null) {
                    r51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    r51Var2.N.invalidate();
                }
                fo foVar2 = this.a;
                foVar2.showDialog(foVar2.Z9);
                return false;
            }
        } else {
            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? this.a.U7(messageObject, false) : null, false);
                return playMessage;
            }
            if (messageObject.isMusic()) {
                MediaController mediaController = MediaController.getInstance();
                ArrayList L = this.a.A0.L();
                fo foVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, foVar3.L6, true ^ foVar3.A0.N, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.jb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        int i11;
        int i12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        String b10;
        int i13;
        TLRPC.User user;
        int i14;
        TLRPC.WebPage webPage;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        MessageObject messageObject = u1Var.getMessageObject();
        File file = null;
        TLRPC.User user2 = null;
        fo foVar = this.a;
        if (i10 == 19) {
            pf.c cVar = foVar.Ab;
            if (cVar != null) {
                cVar.a(true);
            }
            final jn jnVar = u1Var.getMessageObject() != null ? new jn(this, u1Var, 2) : null;
            foVar.Ab = jnVar;
            final Activity parentActivity = foVar.getParentActivity();
            final org.telegram.ui.ActionBar.c6 resourceProvider = foVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            jnVar.d();
            jnVar.b = new ug.e(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b11 = ug.j.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            final boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
            final long j10 = messageObject.messageOwner.date * 1000;
            ug.s.d(messageObject, new Utilities.Callback(atomicBoolean, jnVar, z10, b11, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: ug.f
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ pf.c b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ c6 g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (this.a.get()) {
                        return;
                    }
                    this.b.b();
                    boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                    boolean z12 = this.c;
                    String str = this.d;
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                    Context context = this.f;
                    c6 c6Var = this.g;
                    if (z11) {
                        j.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, c6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        j.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, c6Var);
                    }
                }
            }, new ug.g(atomicBoolean, jnVar, 0));
            return;
        }
        if (i10 == 21) {
            f();
            return;
        }
        if (i10 == 84) {
            foVar.ya(u1Var);
            return;
        }
        if (i10 == 80) {
            org.telegram.ui.Cells.t8 t8Var = org.telegram.ui.Components.qh0.O;
            if (foVar.getParentActivity() == null) {
                return;
            }
            foVar.showDialog(new org.telegram.ui.Components.qh0(foVar.getContext(), foVar.getCurrentAccount(), messageObject, foVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                foVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                user = MessagesController.getInstance(i14).getUser(Long.valueOf(j11));
            } else {
                user = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                foVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File sharingDirectory = AndroidUtilities.getSharingDirectory();
                    sharingDirectory.mkdirs();
                    file = new File(sharingDirectory, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                foVar.showDialog(new org.telegram.ui.Components.pf0(foVar, null, user, null, file, jf.b.d(str, false), str3, str4, foVar.ea));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 30) {
            foVar.presentFragment(new fo(t8.b.e(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? jf.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.sk.g(new StringBuilder("+"), user2.phone, jf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                foVar.presentFragment(new ws(bundle2));
                return;
            }
            return;
        }
        int i16 = 4;
        if (i10 == 23 || i10 == 24) {
            boolean z11 = i10 == 24;
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            pf.c cVar2 = foVar.Ab;
            if (cVar2 != null) {
                cVar2.a(true);
            }
            foVar.Ab = u1Var.getMessageObject() != null ? new jn(this, u1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    foVar.Ab.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    foVar.Ab.b = new ah.g(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new di.s3(i16, this, z11)), 27);
                    return;
                }
            }
            pf.d.q(foVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, foVar.Ab, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            foVar.O9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                pf.c cVar3 = foVar.Ab;
                if (cVar3 != null) {
                    cVar3.a(true);
                }
                foVar.Ab = u1Var.getMessageObject() != null ? new jn(this, u1Var, i16) : null;
                pf.d.q(foVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, foVar.Ab, null, false, foVar.getMessagesController().sponsoredLinksInappAllow, false);
                return;
            }
            return;
        }
        TLRPC.WebPage storyMentionWebpage = messageObject.getStoryMentionWebpage();
        if (storyMentionWebpage == null && (message = messageObject.messageOwner) != null && (messageMedia2 = message.media) != null) {
            storyMentionWebpage = messageMedia2.webpage;
        }
        if (storyMentionWebpage == null) {
            return;
        }
        if (storyMentionWebpage.attributes != null) {
            for (int i17 = 0; i17 < storyMentionWebpage.attributes.size(); i17++) {
                if ((storyMentionWebpage.attributes.get(i17) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) storyMentionWebpage.attributes.get(i17)).storyItem) != null) {
                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                    tL_webPageAttributeStory.storyItem.messageId = messageObject.getId();
                    tL_webPageAttributeStory.storyItem.messageType = 1;
                    foVar.getOrCreateStoryViewer().F(foVar.getParentActivity(), tL_webPageAttributeStory.storyItem, bi.g9.a(foVar.x0));
                    return;
                }
            }
        }
        if (foVar.ja(storyMentionWebpage.url, u1Var, null, messageObject.getId(), 2)) {
            return;
        }
        pf.c cVar4 = foVar.Ab;
        if (cVar4 != null) {
            cVar4.a(true);
        }
        foVar.Ab = u1Var.getMessageObject() != null ? new jn(this, u1Var, i15) : null;
        pf.d.q(foVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, foVar.Ab, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
        TLRPC.Message message;
        if (u1Var == null) {
            tVar.run();
            return;
        }
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            tVar.run();
        } else {
            org.telegram.ui.ActionBar.m2 m2Var = this.a;
            m2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, m2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = u1Var.getMessageObject().isForwarded();
        fo foVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (u1Var.getMessageObject().canCompleteTodo()) {
            if (foVar.getUserConfig().isPremium()) {
                foVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(foVar.e, foVar.Z7, true), u1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new bn(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.zc a03 = org.telegram.ui.Components.zc.a0(foVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void O1() {
        org.telegram.ui.ActionBar.c6 c6Var;
        fo foVar = this.a;
        if (foVar.X0 == null || foVar.getParentActivity() == null) {
            return;
        }
        Context context = foVar.X0.getContext();
        c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
        n41.U(context, foVar, false, c6Var, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean P() {
        fo foVar = this.a;
        return foVar.W5[1].size() + foVar.W5[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        fo foVar = this.a;
        foVar.getSendMessagesHelper().sendCallback(true, u1Var.getMessageObject(), keyboardInlineButton, foVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        ej ejVar;
        int i10;
        MessageObject messageObject = u1Var.getMessageObject();
        org.telegram.ui.Wallet.i iVar = null;
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                ArrayList arrayList = new ArrayList();
                int i11 = -1;
                for (int i12 = 0; i12 < tL_messageMediaPaidMedia.extended_media.size(); i12++) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i12);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                        if (tL_messageExtendedMedia == messageExtendedMedia) {
                            i11 = arrayList.size();
                        }
                        TLRPC.TL_message F7 = fo.F7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            F7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            F7.attachPath = message.attachPath;
                        }
                        F7.media = tL_messageExtendedMedia.media;
                        F7.noforwards = true;
                        arrayList.add(new MessageObject(messageObject.currentAccount, F7, false, true));
                    }
                }
                if (i11 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer t12 = PhotoViewer.t1();
                fo foVar = this.a;
                t12.K2(null, foVar, foVar.ea);
                PhotoViewer.t1().b2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Ha);
                return;
            }
            return;
        }
        fo foVar2 = this.a;
        pf.c cVar = foVar2.Ab;
        if (cVar != null) {
            cVar.a(true);
            foVar2.Ab = null;
        }
        if (u1Var.getMessageObject() == null) {
            foVar2.Ab = null;
            ejVar = null;
        } else {
            ejVar = new ej(foVar2, u1Var.getMessageObject().getId(), u1Var, 1);
            foVar2.Ab = ejVar;
        }
        i10 = ((org.telegram.ui.ActionBar.m2) this.a).currentAccount;
        zh.n5 y3 = zh.n5.y(i10, false);
        Objects.requireNonNull(ejVar);
        gj gjVar = new gj(ejVar, 8);
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.c6 I = zh.n5.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = fi.k3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            iVar = new org.telegram.ui.Wallet.i(y3, ConnectionsManager.getInstance(y3.a).sendRequest(tL_payments_getPaymentForm, new bi.f3(y3, messageObject, tL_inputInvoiceMessage, gjVar, 19)), 12);
        }
        if (iVar != null) {
            ejVar.b = iVar;
            ejVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (u1Var == null) {
            return false;
        }
        fo foVar = this.a;
        if (foVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = u1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(foVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Q1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        fo foVar = this.a;
        if (!isEmpty) {
            pf.d.r(foVar.getParentActivity(), "https://" + foVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        sg.m1 m1Var = new sg.m1(foVar, i10, user, null, null, foVar.ea);
        u1Var.getLocationOnScreen(new int[2]);
        m1Var.v0 = u1Var.getNameStatusX();
        m1Var.w0 = u1Var.getNameStatusY();
        m1Var.z0 = u1Var.getScaleX();
        m1Var.x0 = u1Var.getLeft();
        m1Var.y0 = u1Var.getTop();
        m1Var.A0 = u1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            m1Var.u0 = Integer.valueOf(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            m1Var.u0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.q5 q5Var = u1Var.fc;
        if (q5Var != null && (q5Var.f[0] instanceof org.telegram.ui.Components.s5)) {
            m1Var.z0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(foVar.getParentActivity());
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.m6, 0.2f);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if ("video/webm".equals(document.mime_type)) {
                    forDocument = ImageLocation.getForDocument(document);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    str2 = "160_160_g";
                } else {
                    if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    forDocument = ImageLocation.getForDocument(document);
                    str2 = "160_160";
                }
                ImageLocation imageLocation = forDocument;
                String str3 = str2;
                z9Var.setLayerNum(7);
                z9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                z9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (MessageObject.isTextColorEmoji(document)) {
                    Integer num = m1Var.u0;
                    z9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : foVar.getThemedColor(org.telegram.ui.ActionBar.g6.v6), PorterDuff.Mode.SRC_IN));
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                } else {
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                }
                m1Var.B0 = z9Var;
                m1Var.E0 = true;
            }
        }
        foVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean R() {
        fo foVar = this.a;
        return UserObject.isReplyUser(foVar.f) || UserObject.isUserSelf(foVar.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09a1 A[LOOP:3: B:254:0x099f->B:255:0x09a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x093f  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        rw0 rw0Var;
        TLRPC.PollAnswer pollAnswer2;
        rw0 rw0Var2;
        mw0 mw0Var;
        bh.b bVar;
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        boolean z10;
        boolean z11;
        rw0 rw0Var3;
        MessageObject messageObject2;
        org.telegram.ui.Components.l80 l80Var;
        fo foVar;
        boolean z12;
        jf jfVar;
        MessageObject messageObject3;
        int size;
        int i10;
        ViewGroup viewGroup;
        rw0 rw0Var4;
        boolean z13;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z14;
        byte[] bArr;
        mw0 mw0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z15;
        rw0 rw0Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        boolean z16;
        rh.q qVar;
        boolean z17;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        fo foVar2 = this.a;
        if (foVar2.getParentActivity() != null && foVar2.getParentActivity() != null) {
            di.d4 d4Var = foVar2.x1;
            if (d4Var != null && d4Var.V) {
                d4Var.e(true);
            }
            cm cmVar = foVar2.B1;
            if (cmVar != null && cmVar.V) {
                cmVar.e(true);
            }
            MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                foVar2.d5 = primaryMessageObject;
                foVar2.e5 = null;
                rw0 rw0Var6 = new rw0(foVar2.getParentActivity(), foVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                rw0Var6.L = u1Var;
                rw0Var6.P = bArr3;
                MessageObject messageObject4 = u1Var.getMessageObject();
                rw0Var6.H = messageObject4;
                rw0Var6.I = messageObject4 != null && messageObject4.isOutOwner();
                org.telegram.ui.Cells.u1 u1Var2 = rw0Var6.L;
                mw0 mw0Var3 = rw0Var6.d;
                if (u1Var2 != null) {
                    rw0Var6.M = foVar2.s9 - AndroidUtilities.dp(4.0f);
                    rw0Var6.N = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        rw0Var6.M = view.getY() + rw0Var6.M;
                        rw0Var6.N = view.getY() + rw0Var6.N;
                    }
                    int width = rw0Var6.L.getWidth();
                    int height = rw0Var6.L.getHeight();
                    rw0Var6.L.getHeight();
                    pw0 pw0Var = new pw0(rw0Var6, rw0Var6.getContext(), UserConfig.selectedAccount, rw0Var6.L.getResourcesProvider(), bArr3, width, height);
                    rw0Var = rw0Var6;
                    rw0Var.J = pw0Var;
                    rw0Var.L.h1(pw0Var);
                    rw0Var.J.i1(rw0Var.L);
                    rw0Var.J.setDelegate(new t7.u(17));
                    pw0 pw0Var2 = rw0Var.J;
                    MessageObject messageObject5 = rw0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup = rw0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = rw0Var.L;
                    pw0Var2.X3(messageObject5, currentMessagesGroup, u1Var3.F, u1Var3.E, u1Var3.G, false);
                    pw0 pw0Var3 = rw0Var.J;
                    pw0Var3.M7 = bArr3;
                    mw0Var3.addView(pw0Var3, new FrameLayout.LayoutParams(rw0Var.L.getWidth(), height, 51));
                    qw0 qw0Var = new qw0(rw0Var.getContext(), UserConfig.selectedAccount, rw0Var.L.getResourcesProvider(), width, height, 0);
                    rw0Var.K = qw0Var;
                    rw0Var.L.j1(qw0Var);
                    rw0Var.L.h1(rw0Var.K);
                    rw0Var.K.i1(rw0Var.L);
                    rw0Var.K.setDelegate(new sb.a(17));
                    qw0 qw0Var2 = rw0Var.K;
                    MessageObject messageObject6 = rw0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup2 = rw0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var4 = rw0Var.L;
                    qw0Var2.X3(messageObject6, currentMessagesGroup2, u1Var4.F, u1Var4.E, u1Var4.G, false);
                    mw0Var3.addView(rw0Var.K, new FrameLayout.LayoutParams(rw0Var.L.getWidth(), height, 51));
                } else {
                    rw0Var = rw0Var6;
                }
                di.h1 h1Var = rw0Var.f;
                h1Var.bringToFront();
                mw0 mw0Var4 = rw0Var.e;
                mw0Var4.bringToFront();
                rw0Var.n.bringToFront();
                h1Var.w(false);
                Context context = rw0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.c6 c6Var = rw0Var.b;
                org.telegram.ui.Components.l80 G = org.telegram.ui.Components.l80.G(mw0Var3, c6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(rw0Var.H);
                rw0Var.V = MessageObject.isVoted(tL_messageMediaPoll4);
                int i11 = 0;
                while (true) {
                    if (i11 >= tL_messageMediaPoll4.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll4.poll.answers.get(i11).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll4.poll.answers.get(i11);
                        break;
                    }
                    i11++;
                }
                bh.b bVar2 = rw0Var.G;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll4.poll;
                    boolean z18 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z19 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll4.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        z14 = z19;
                        bArr = bArr3;
                        mw0Var2 = mw0Var3;
                        pollAnswerVoters = null;
                        z15 = false;
                    } else {
                        int size2 = arrayList2.size();
                        z14 = z19;
                        int i12 = 0;
                        z15 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i12 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i12);
                            int i13 = i12 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            mw0 mw0Var5 = mw0Var3;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z15 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList4 = tL_messageMediaPoll4.poll.answers;
                                int size3 = arrayList4.size();
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll5 = tL_messageMediaPoll4;
                                int i14 = 0;
                                while (i14 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList4.get(i14);
                                    int i15 = i14 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList5 = arrayList4;
                                    int i16 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList3.add(pollAnswer5);
                                    }
                                    arrayList4 = arrayList5;
                                    i14 = i15;
                                    size3 = i16;
                                }
                                mw0Var3 = mw0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                mw0Var3 = mw0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        mw0Var2 = mw0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        rw0Var5 = rw0Var;
                        arrayList = arrayList3;
                        messageObject = primaryMessageObject;
                        mw0Var = mw0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        rh.q qVar2 = new rh.q(context, foVar2.getCurrentAccount(), c6Var);
                        org.telegram.ui.Components.l80 J = G.J();
                        J.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        eh.a k10 = fh.b.k(c6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            qVar = qVar2;
                            z17 = false;
                            dh.d c10 = bVar2.c(view3, null, false);
                            c10.o(k10);
                            view3.setBackground(c10);
                        } else {
                            qVar = qVar2;
                            z17 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new su0(G, 26), z17);
                        J.k();
                        long dialogId = rw0Var.H.getDialogId();
                        int id2 = rw0Var.H.getId();
                        int i17 = pollAnswerVoters.voters;
                        mt mtVar = new mt(11, rw0Var, foVar2);
                        rw0Var5 = rw0Var;
                        messageObject = primaryMessageObject;
                        arrayList = arrayList3;
                        mw0Var = mw0Var2;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        rh.q qVar3 = qVar;
                        View a2 = qVar3.a(foVar2, dialogId, id2, bArr5, i17, mtVar);
                        foVar2 = foVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        qVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        qVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        qVar3.a.d(pollAnswerVoters.recent_voters, false);
                        qVar3.setLayoutParams(w7.z5.n(-1, 48));
                        qVar3.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I5, false), 12, 0));
                        qVar3.setOnClickListener(new xv(G, J));
                        G.q(qVar3);
                        G.k();
                    }
                    if (!z18) {
                        rw0Var2 = rw0Var5;
                        pollAnswer3 = pollAnswer2;
                    } else if (z15) {
                        int i18 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        rw0Var2 = rw0Var5;
                        fo foVar3 = foVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable iw0Var = new iw0(rw0Var2, z14, foVar3, arrayList, pollAnswer6);
                        foVar2 = foVar3;
                        pollAnswer3 = pollAnswer6;
                        G.c(i18, string, iw0Var, false);
                    } else {
                        rw0Var2 = rw0Var5;
                        pollAnswer3 = pollAnswer2;
                        boolean z20 = z14;
                        if (rh.i.a(rw0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new iw0(rw0Var2, z20, pollAnswer3, foVar2, arrayList), false);
                        }
                    }
                    if (foVar2.H6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new tf0(rw0Var2, foVar2, pollAnswer3, 21), false);
                    }
                    if (rw0Var2.H.getDialogId() >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        z16 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(rw0Var2.H.currentAccount);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(rw0Var2.H.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-rw0Var2.H.getDialogId());
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(rw0Var2.H.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z16 = false;
                        G.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new rr0(11, rw0Var2, sb2.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new rr0(12, rw0Var2, pollAnswer3), z16);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(rw0Var2.H.currentAccount).getClientUserId();
                        bVar = bVar2;
                        long currentTime = ConnectionsManager.getInstance(rw0Var2.H.currentAccount).getCurrentTime();
                        fo foVar4 = foVar2;
                        long j10 = MessagesController.getInstance(rw0Var2.H.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!rw0Var2.H.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j10))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new rr0(13, rw0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(rw0Var2.H.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        foVar2 = foVar4;
                        a3.i0 i0Var = new a3.i0(rw0Var2, peerDialogId, foVar2, 28);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i19 = org.telegram.ui.ActionBar.g6.i6;
                        org.telegram.ui.ActionBar.c6 c6Var2 = G.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(i19, c6Var2), 0, 12));
                        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context2);
                        z9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
                        k9Var.p(userOrChat);
                        z9Var.e(userOrChat, k9Var);
                        frameLayout.addView(z9Var, w7.z5.a(34.0f, 13.0f, 11.0f, 0.0f, 11.0f, 34, 51));
                        TextView textView = new TextView(context2);
                        org.telegram.messenger.sk.o(org.telegram.ui.ActionBar.g6.j5, c6Var2, textView, 1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, w7.z5.a(-2.0f, 59.0f, 8.0f, 16.0f, 0.0f, -2, 55));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.rt(7, G, i0Var));
                        G.r(frameLayout, w7.z5.n(-1, -2));
                    } else {
                        bVar = bVar2;
                    }
                } else {
                    rw0Var2 = rw0Var;
                    mw0Var = mw0Var3;
                    bVar = bVar2;
                    messageObject = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                G.Q(bVar, fh.b.k(c6Var), false);
                G.Y();
                ViewGroup viewGroup2 = G.A;
                rw0Var2.R = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                rw0Var2.R.setPivotY(0.0f);
                mw0Var4.addView(rw0Var2.R, w7.z5.e(-2, -2, 51));
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                foVar2.q8(messageObject, arrayList6, arrayList7, arrayList8);
                jf jfVar2 = new jf(foVar2, 9);
                MessageObject messageObject7 = rw0Var2.H;
                List<TLRPC.TL_availableReaction> enabledReactionsList = foVar2.getMediaDataController().getEnabledReactionsList();
                boolean z21 = (foVar2.x() || foVar2.c() || foVar2.f != null || !messageObject7.hasReactions() || (ChatObject.isChannel(foVar2.e) && !foVar2.e.megagroup) || ChatObject.isMonoForum(foVar2.e) || enabledReactionsList.isEmpty() || !messageObject7.messageOwner.reactions.can_see_list || messageObject7.isSecretMedia()) ? false : true;
                boolean z22 = !messageObject7.isForwardedChannelPost() ? messageObject7.isSecretMedia() || foVar2.R3 == 5 || foVar2.x() || foVar2.c() || !messageObject7.isReactionsAvailable() || ((((chatFull = foVar2.Z7) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(foVar2.e)) && foVar2.f == null && !ChatObject.isMonoForum(foVar2.e))) || enabledReactionsList.isEmpty()) : (chatFull3 = foVar2.getMessagesController().getChatFull(-messageObject7.getFromChatId())) != null && (foVar2.x() || foVar2.R3 == 5 || foVar2.c() || !messageObject7.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty()));
                boolean z23 = (z21 || foVar2.c() || foVar2.e == null || !messageObject7.isOutOwner() || !messageObject7.isSent() || messageObject7.isEditing() || messageObject7.isSending() || messageObject7.isSendError() || messageObject7.isContentUnread() || messageObject7.isUnread() || ConnectionsManager.getInstance(foVar2.getCurrentAccount()).getCurrentTime() - messageObject7.messageOwner.date >= foVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(foVar2.e) && ChatObject.isChannel(foVar2.e)) || (chatFull2 = foVar2.Z7) == null || chatFull2.participants_count > foVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || foVar2.R3 == 3 || !messageObject7.canSetReaction() || ChatObject.isMonoForum(foVar2.e)) ? false : true;
                if (foVar2.e != null && !messageObject7.isOut() && ChatObject.isMonoForum(foVar2.e) && ChatObject.canManageMonoForum(foVar2.getCurrentAccount(), foVar2.e)) {
                    int i20 = ((-foVar2.e.linked_monoforum_id) > messageObject7.getFromChatId() ? 1 : ((-foVar2.e.linked_monoforum_id) == messageObject7.getFromChatId() ? 0 : -1));
                }
                if (!z21 && foVar2.e == null && foVar2.h == null && (user = foVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(foVar2.f) && !UserObject.isAnonymous(foVar2.f)) {
                    TLRPC.User user2 = foVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = foVar2.a8) == null || !userFull.read_dates_private) && !foVar2.c() && messageObject7.isOutOwner() && messageObject7.isSent() && !messageObject7.isEditing() && !messageObject7.isSending() && !messageObject7.isSendError() && !messageObject7.isContentUnread() && !messageObject7.isUnread() && foVar2.getConnectionsManager().getCurrentTime() - messageObject7.messageOwner.date < foVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z10 = true;
                        TLRPC.User user3 = foVar2.f;
                        boolean z24 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(foVar2.f))) || foVar2.c() || !messageObject7.isEdited() || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        z11 = z23;
                        org.telegram.ui.Components.l80 G2 = org.telegram.ui.Components.l80.G(mw0Var, foVar2.getResourceProvider(), null, !z21 || z23);
                        if (z11) {
                            rw0Var3 = rw0Var2;
                            messageObject2 = messageObject7;
                            l80Var = G2;
                            foVar = foVar2;
                            z12 = z22;
                            jfVar = jfVar2;
                            if (z10) {
                                l80Var.r(new org.telegram.ui.Components.ad0(rw0Var3.getContext(), 0, messageObject2, new gw0(rw0Var3, 1), rw0Var3.b), w7.z5.n(-1, 36));
                                l80Var.k();
                            } else if (z24) {
                                messageObject3 = messageObject2;
                                l80Var.r(new org.telegram.ui.Components.ad0(rw0Var3.getContext(), 1, messageObject2, new gw0(rw0Var3, 2), rw0Var3.b), w7.z5.n(-1, 36));
                                l80Var.k();
                                size = arrayList6.size();
                                i10 = 0;
                                while (i10 < size) {
                                    l80Var.c(((Integer) arrayList6.get(i10)).intValue(), (CharSequence) arrayList7.get(i10), new c90(rw0Var3, jfVar, ((Integer) arrayList8.get(i10)).intValue(), 6), false);
                                    i10++;
                                    arrayList6 = arrayList6;
                                }
                                l80Var.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                                l80Var.Q(bVar, fh.b.k(c6Var), false);
                                l80Var.Y();
                                ViewGroup viewGroup3 = l80Var.A;
                                rw0Var3.T = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                rw0Var3.T.setPivotY(0.0f);
                                mw0Var4.addView(rw0Var3.T, w7.z5.e(-2, -2, 51));
                                viewGroup = rw0Var3.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    int i21 = 5;
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new lq0(rw0Var3, i21));
                                    rw0Var3.T.setOnTouchListener(new e0(rw0Var3, i21));
                                }
                                if (z12) {
                                    rw0Var4 = rw0Var3;
                                    fo foVar5 = foVar;
                                    org.telegram.ui.Components.gl0 gl0Var = new org.telegram.ui.Components.gl0((foVar.getUserConfig().getClientUserId() > foVar.a() ? 1 : (foVar.getUserConfig().getClientUserId() == foVar.a() ? 0 : -1)) == 0 ? 3 : 0, foVar.getCurrentAccount(), rw0Var3.getContext(), foVar5, rw0Var3.b);
                                    gl0Var.a = true;
                                    float f7 = 22;
                                    gl0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                    gl0Var.setDelegate(new lw0(rw0Var4, foVar5, messageObject3, gl0Var));
                                    rw0Var4.Q = gl0Var;
                                    mw0Var4.addView(gl0Var, w7.z5.e(-2, (int) ((gl0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    z13 = true;
                                    gl0Var.p(messageObject3, foVar5.Z7, true);
                                    rw0Var4.Q.setTransitionProgress(1.0f);
                                } else {
                                    rw0Var4 = rw0Var3;
                                    z13 = true;
                                }
                                rw0Var4.e();
                                rw0Var4.e0 = new bn(this, 0);
                                rw0Var4.show();
                                return z13;
                            }
                        } else {
                            ki0 ki0Var = new ki0(rw0Var2.getContext(), foVar2.getCurrentAccount(), messageObject7, foVar2.e);
                            FrameLayout frameLayout2 = new FrameLayout(rw0Var2.getContext());
                            frameLayout2.addView(ki0Var, w7.z5.d(36.0f, -1));
                            org.telegram.ui.Components.l80 J2 = G2.J();
                            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, rw0Var2.getContext(), rw0Var2.b, true, false);
                            e1Var.setItemHeight(44);
                            rw0 rw0Var7 = rw0Var2;
                            e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            messageObject2 = messageObject7;
                            e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(rw0Var7.getContext());
                            LinearLayout linearLayout = new LinearLayout(rw0Var7.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, c6Var));
                            linearLayout.setOrientation(1);
                            fo foVar6 = foVar2;
                            org.telegram.ui.Components.mm0 a10 = ki0Var.a();
                            frameLayout3.addView(e1Var);
                            linearLayout.addView(frameLayout3);
                            z12 = z22;
                            linearLayout.addView(new org.telegram.ui.ActionBar.j1(rw0Var7.getContext(), c6Var), w7.z5.n(-1, 8));
                            frameLayout3.setOnClickListener(new jw0(G2));
                            jfVar = jfVar2;
                            kw0 kw0Var = new kw0(rw0Var7, ki0Var, foVar6, a10, linearLayout, G2, J2);
                            foVar = foVar6;
                            rw0Var3 = rw0Var7;
                            l80Var = G2;
                            ki0Var.setOnClickListener(kw0Var);
                            linearLayout.addView(a10, w7.z5.n(-1, -2));
                            J2.q(linearLayout);
                            l80Var.q(frameLayout2);
                            l80Var.k();
                        }
                        messageObject3 = messageObject2;
                        size = arrayList6.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        l80Var.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        l80Var.Q(bVar, fh.b.k(c6Var), false);
                        l80Var.Y();
                        ViewGroup viewGroup32 = l80Var.A;
                        rw0Var3.T = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        rw0Var3.T.setPivotY(0.0f);
                        mw0Var4.addView(rw0Var3.T, w7.z5.e(-2, -2, 51));
                        viewGroup = rw0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        rw0Var4.e();
                        rw0Var4.e0 = new bn(this, 0);
                        rw0Var4.show();
                        return z13;
                    }
                }
                z10 = false;
                TLRPC.User user32 = foVar2.f;
                if (user32 == null) {
                }
                z11 = z23;
                org.telegram.ui.Components.l80 G22 = org.telegram.ui.Components.l80.G(mw0Var, foVar2.getResourceProvider(), null, !z21 || z23);
                if (z11) {
                }
                messageObject3 = messageObject2;
                size = arrayList6.size();
                i10 = 0;
                while (i10 < size) {
                }
                l80Var.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                l80Var.Q(bVar, fh.b.k(c6Var), false);
                l80Var.Y();
                ViewGroup viewGroup322 = l80Var.A;
                rw0Var3.T = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                rw0Var3.T.setPivotY(0.0f);
                mw0Var4.addView(rw0Var3.T, w7.z5.e(-2, -2, 51));
                viewGroup = rw0Var3.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                rw0Var4.e();
                rw0Var4.e0 = new bn(this, 0);
                rw0Var4.show();
                return z13;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        fo foVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (kVar.t() || foVar.F9()) {
            fo.c2(foVar, u1Var, true, f7, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = u1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            l(u1Var, chat, i10, z10);
        } else {
            foVar.sa(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.X7(characterStyle, z10, u1Var.getMessageObject(), u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final vv0 S1() {
        return this.a.wa;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
        h(u1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean T0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? u1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            fo foVar = this.a;
            boolean z11 = !foVar.jc && messageObject.getId() == foVar.ic;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - foVar.kc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean T1(long j10) {
        fo foVar = this.a;
        TLRPC.Chat chat = foVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return foVar.getMessagesController().isAdmin(foVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U0(org.telegram.ui.Cells.u1 u1Var) {
        fo foVar = this.a;
        foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(foVar.T5), u1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x00fe, code lost:
    
        if (org.telegram.messenger.DialogObject.getPeerDialogId(r5) != r8.T5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        Integer num;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        TLRPC.Message message;
        String str2;
        long j10;
        boolean z11;
        TLRPC.Chat chat;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        org.telegram.ui.ActionBar.m2 m2Var;
        TLRPC.Chat chat2;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.k kVar;
        boolean c10 = c();
        fo foVar = this.a;
        if (!c10 && !z10) {
            kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
            if ((kVar.t() || foVar.F9()) && !foVar.c9.z(u1Var.getMessageObject())) {
                fo.c2(foVar, u1Var, !u1Var.i3(f7), f7, f10);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(foVar.f)) {
            r(u1Var);
            return;
        }
        MessageObject messageObject2 = u1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.g0.q(R.string.StoryNotFound, org.telegram.ui.Components.zc.a0(foVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            bi.s9.b(storyItem, foVar.f);
            foVar.getOrCreateStoryViewer().F(foVar.getParentActivity(), storyItem, bi.g9.a(foVar.x0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j11 = foVar.T5;
                message = messageObject2.messageOwner;
                if (message == null) {
                }
                str2 = str;
                j10 = j11;
                z11 = false;
                if (j10 < 0) {
                }
                if (j10 != Long.MAX_VALUE) {
                }
                message2 = messageObject2.messageOwner;
                if (message2 != null) {
                }
                TLRPC.Message message5 = messageObject2.messageOwner;
                org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j112 = foVar.T5;
                message = messageObject2.messageOwner;
                if (message == null && (messageReplyHeader6 = message.reply_to) != null) {
                    TLRPC.Peer peer = messageReplyHeader6.reply_to_peer_id;
                    if (peer == null) {
                        str2 = str;
                        TLRPC.MessageFwdHeader messageFwdHeader = messageReplyHeader6.reply_from;
                        if (messageFwdHeader != null) {
                            TLRPC.Peer peer2 = messageFwdHeader.from_id;
                            if (peer2 != null) {
                                if (!(peer2 instanceof TLRPC.TL_peerUser)) {
                                    j112 = DialogObject.getPeerDialogId(peer2);
                                }
                                j10 = Long.MAX_VALUE;
                            } else {
                                TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                                if (peer3 != null) {
                                    j112 = DialogObject.getPeerDialogId(peer3);
                                }
                                j10 = Long.MAX_VALUE;
                            }
                        }
                    } else {
                        if (!(peer instanceof TLRPC.TL_peerUser)) {
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            z11 = true;
                            j10 = peerDialogId;
                            str2 = str;
                            chat = j10 < 0 ? foVar.getMessagesController().getChat(Long.valueOf(-j10)) : null;
                            if (j10 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j10 == foVar.T5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j10 == foVar.T5 && (!ChatObject.isForum(foVar.e) || !z12)) || j10 == Long.MAX_VALUE) && (foVar.R3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == foVar.d()))) {
                                        int i11 = foVar.R3;
                                        if (i11 == 2 || i11 == 1) {
                                            foVar.V8.R0(i10);
                                            foVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            foVar.R7 = bArr;
                                        } else if (num != null) {
                                            foVar.Q7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                foVar.N7 = true;
                                                foVar.P7 = messageReplyHeader5.quote_text;
                                                foVar.S7 = r9;
                                                foVar.M7 = true;
                                            }
                                        }
                                        fi.l3 l3Var = new fi.l3(this, i10, messageObject2, num, bArr, 18);
                                        if (!foVar.A0.N) {
                                            l3Var.run();
                                            return;
                                        }
                                        foVar.r3 = false;
                                        foVar.pb(false, true, false);
                                        foVar.Jc(foVar.getMediaDataController().getMask(), foVar.getMediaDataController().getSearchPosition(), foVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(l3Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.G1 != null) {
                                        pf.c cVar = foVar.Ab;
                                        if (cVar != null) {
                                            cVar.a(false);
                                            m2Var = null;
                                            foVar.Ab = null;
                                        } else {
                                            m2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        final k0 k0Var = new k0(this, messageObject2, u1Var);
                                        foVar.Ab = k0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.d0;
                                        if (j10 < 0 && (chat2 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j10))) != null && ChatObject.isForum(chat2)) {
                                            k0Var.d();
                                            final int i12 = 0;
                                            launchActivity.k0(j10, Integer.valueOf(i10), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.q90
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i13 = i12;
                                                    k0 k0Var2 = k0Var;
                                                    switch (i13) {
                                                        case 0:
                                                            Pattern pattern = LaunchActivity.B1;
                                                            k0Var2.c(false);
                                                            break;
                                                        default:
                                                            Pattern pattern2 = LaunchActivity.B1;
                                                            k0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, id2, r9);
                                            return;
                                        }
                                        String str4 = str2;
                                        int i13 = r9;
                                        k0Var.d();
                                        Bundle bundle = new Bundle();
                                        if (j10 >= 0) {
                                            bundle.putLong("user_id", j10);
                                        } else {
                                            long j12 = -j10;
                                            TLRPC.Chat chat3 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(j12));
                                            if (chat3 != null && chat3.forum) {
                                                final int i14 = 1;
                                                launchActivity.k0(j10, Integer.valueOf(i10), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.q90
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i132 = i14;
                                                        k0 k0Var2 = k0Var;
                                                        switch (i132) {
                                                            case 0:
                                                                Pattern pattern = LaunchActivity.B1;
                                                                k0Var2.c(false);
                                                                break;
                                                            default:
                                                                Pattern pattern2 = LaunchActivity.B1;
                                                                k0Var2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, id2, i13);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j12);
                                        }
                                        bundle.putInt("message_id", i10);
                                        org.telegram.ui.ActionBar.m2 m2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.m2) i2.d.h(1, arrayList) : m2Var;
                                        if (m2Var2 == null || MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, m2Var2)) {
                                            AndroidUtilities.runOnUIThread(new p90(launchActivity, bundle, bArr2, i10, num2, str4, i13, j10, k0Var, m2Var2));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            message2 = messageObject2.messageOwner;
                            if (message2 != null || (messageReplyHeader4 = message2.reply_to) == null || TextUtils.isEmpty(messageReplyHeader4.quote_text) || !messageObject2.replyTextEllipsized || messageObject2.replyTextRevealed || messageObject2.shouldDrawWithoutBackground()) {
                                TLRPC.Message message52 = messageObject2.messageOwner;
                                org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                foVar.uc(messageObject2, true);
                                return;
                            }
                        }
                        str2 = str;
                    }
                    z11 = false;
                    if (j10 < 0) {
                    }
                    if (j10 != Long.MAX_VALUE) {
                    }
                    message2 = messageObject2.messageOwner;
                    if (message2 != null) {
                    }
                    TLRPC.Message message522 = messageObject2.messageOwner;
                    org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                }
                str2 = str;
                j10 = j112;
                z11 = false;
                if (j10 < 0) {
                }
                if (j10 != Long.MAX_VALUE) {
                }
                message2 = messageObject2.messageOwner;
                if (message2 != null) {
                }
                TLRPC.Message message5222 = messageObject2.messageOwner;
                org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1122 = foVar.T5;
        message = messageObject2.messageOwner;
        if (message == null) {
        }
        str2 = str;
        j10 = j1122;
        z11 = false;
        if (j10 < 0) {
        }
        if (j10 != Long.MAX_VALUE) {
        }
        message2 = messageObject2.messageOwner;
        if (message2 != null) {
        }
        TLRPC.Message message52222 = messageObject2.messageOwner;
        org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final int V() {
        return this.a.R3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x03f6, code lost:
    
        if (r9.paid_reactions_available != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x03fc, code lost:
    
        if (r8.isEmpty() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x042c, code lost:
    
        if (r9.paid_reactions_available != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0448, code lost:
    
        if (r8.isEmpty() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0436, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5.e) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0442, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r5.e) != false) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x071a A[LOOP:2: B:204:0x0718->B:205:0x071a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c5  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        oe1 oe1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        oe1 oe1Var2;
        MessageObject messageObject;
        oe1 oe1Var3;
        int i10;
        MessageObject messageObject2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        jf jfVar;
        MessageObject messageObject3;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        re1 re1Var;
        ArrayList arrayList3;
        fo foVar;
        MessageObject messageObject4;
        int size;
        int i11;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final fo foVar2 = this.a;
        if (foVar2.getParentActivity() != null && foVar2.getParentActivity() != null) {
            di.d4 d4Var = foVar2.x1;
            if (d4Var != null && d4Var.V) {
                d4Var.e(true);
            }
            cm cmVar = foVar2.B1;
            if (cmVar != null && cmVar.V) {
                cmVar.e(true);
            }
            MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaToDo)) {
                foVar2.d5 = primaryMessageObject;
                foVar2.e5 = null;
                final re1 re1Var2 = new re1(foVar2.getParentActivity(), foVar2.getResourceProvider());
                final int i12 = todoItem.id;
                re1Var2.K = u1Var;
                re1Var2.O = i12;
                MessageObject messageObject5 = u1Var.getMessageObject();
                re1Var2.G = messageObject5;
                re1Var2.H = messageObject5 != null && messageObject5.isOutOwner();
                org.telegram.ui.Cells.u1 u1Var2 = re1Var2.K;
                oe1 oe1Var4 = re1Var2.c;
                if (u1Var2 != null) {
                    re1Var2.L = foVar2.s9 - AndroidUtilities.dp(4.0f);
                    re1Var2.M = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        re1Var2.L = view.getY() + re1Var2.L;
                        re1Var2.M = view.getY() + re1Var2.M;
                    }
                    int width = re1Var2.K.getWidth();
                    int height = re1Var2.K.getHeight();
                    re1Var2.K.getHeight();
                    oe1Var = oe1Var4;
                    pe1 pe1Var = new pe1(re1Var2, re1Var2.getContext(), UserConfig.selectedAccount, re1Var2.K.getResourcesProvider(), i12, width, height);
                    re1Var2.I = pe1Var;
                    re1Var2.K.h1(pe1Var);
                    re1Var2.I.i1(re1Var2.K);
                    re1Var2.I.setDelegate(new qe1(re1Var2));
                    pe1 pe1Var2 = re1Var2.I;
                    MessageObject messageObject6 = re1Var2.G;
                    MessageObject.GroupedMessages currentMessagesGroup = re1Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = re1Var2.K;
                    pe1Var2.X3(messageObject6, currentMessagesGroup, u1Var3.F, u1Var3.E, u1Var3.G, false);
                    oe1Var.addView(re1Var2.I, new FrameLayout.LayoutParams(re1Var2.K.getWidth(), height, 51));
                    qw0 qw0Var = new qw0(re1Var2.getContext(), UserConfig.selectedAccount, re1Var2.K.getResourcesProvider(), width, height, 1);
                    re1Var2.J = qw0Var;
                    re1Var2.K.j1(qw0Var);
                    re1Var2.K.h1(re1Var2.J);
                    re1Var2.J.i1(re1Var2.K);
                    re1Var2.J.setDelegate(new t7.u(18));
                    qw0 qw0Var2 = re1Var2.J;
                    MessageObject messageObject7 = re1Var2.G;
                    MessageObject.GroupedMessages currentMessagesGroup2 = re1Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var4 = re1Var2.K;
                    qw0Var2.X3(messageObject7, currentMessagesGroup2, u1Var4.F, u1Var4.E, u1Var4.G, false);
                    oe1Var.addView(re1Var2.J, new FrameLayout.LayoutParams(re1Var2.K.getWidth(), height, 51));
                } else {
                    oe1Var = oe1Var4;
                }
                di.h1 h1Var = re1Var2.e;
                h1Var.bringToFront();
                oe1 oe1Var5 = re1Var2.d;
                oe1Var5.bringToFront();
                re1Var2.h.bringToFront();
                h1Var.w(false);
                org.telegram.ui.ActionBar.c6 c6Var = re1Var2.a;
                org.telegram.ui.Components.l80 F = org.telegram.ui.Components.l80.F(oe1Var, c6Var, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(re1Var2.G);
                final int i13 = 0;
                while (true) {
                    if (i13 >= tL_messageMediaToDo.todo.list.size()) {
                        todoItem2 = null;
                        i13 = -1;
                        break;
                    }
                    if (tL_messageMediaToDo.todo.list.get(i13).id == i12) {
                        todoItem2 = tL_messageMediaToDo.todo.list.get(i13);
                        break;
                    }
                    i13++;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= tL_messageMediaToDo.completions.size()) {
                        todoCompletion = null;
                        break;
                    }
                    if (tL_messageMediaToDo.completions.get(i14).id == i12) {
                        todoCompletion = tL_messageMediaToDo.completions.get(i14);
                        break;
                    }
                    i14++;
                }
                if (!re1Var2.G.canCompleteTodo()) {
                    oe1Var2 = oe1Var5;
                } else if (todoCompletion != null) {
                    oe1Var2 = oe1Var5;
                    F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
                    F.k();
                    final int i15 = 1;
                    F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.je1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    fo foVar3 = foVar2;
                                    fw0 fw0Var = new fw0(foVar3);
                                    re1 re1Var3 = re1Var2;
                                    fw0Var.p0(MessageObject.getMedia(re1Var3.G), false, i12);
                                    fw0Var.e0 = new bs0(18, re1Var3, foVar3);
                                    foVar3.presentFragment(fw0Var);
                                    re1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = foVar2.c();
                                    re1 re1Var4 = re1Var2;
                                    if (c10) {
                                        Toast.makeText(re1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        pe1 pe1Var3 = re1Var4.I;
                                        pe1Var3.k4(pe1Var3.O2(i12), false);
                                    }
                                    re1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = foVar2.c();
                                    re1 re1Var5 = re1Var2;
                                    if (c11) {
                                        Toast.makeText(re1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        pe1 pe1Var4 = re1Var5.I;
                                        pe1Var4.k4(pe1Var4.O2(i12), false);
                                    }
                                    re1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    oe1Var2 = oe1Var5;
                    final int i16 = 2;
                    F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.je1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    fo foVar3 = foVar2;
                                    fw0 fw0Var = new fw0(foVar3);
                                    re1 re1Var3 = re1Var2;
                                    fw0Var.p0(MessageObject.getMedia(re1Var3.G), false, i12);
                                    fw0Var.e0 = new bs0(18, re1Var3, foVar3);
                                    foVar3.presentFragment(fw0Var);
                                    re1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = foVar2.c();
                                    re1 re1Var4 = re1Var2;
                                    if (c10) {
                                        Toast.makeText(re1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        pe1 pe1Var3 = re1Var4.I;
                                        pe1Var3.k4(pe1Var3.O2(i12), false);
                                    }
                                    re1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = foVar2.c();
                                    re1 re1Var5 = re1Var2;
                                    if (c11) {
                                        Toast.makeText(re1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        pe1 pe1Var4 = re1Var5.I;
                                        pe1Var4.k4(pe1Var4.O2(i12), false);
                                    }
                                    re1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                }
                if (todoItem2 != null) {
                    F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new ee1(re1Var2, foVar2, todoItem2, 2), false);
                    if (re1Var2.G.getDialogId() < 0) {
                        MessagesController messagesController = MessagesController.getInstance(re1Var2.G.currentAccount);
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(re1Var2.G.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            StringBuilder sb3 = new StringBuilder("c/");
                            messageObject = primaryMessageObject;
                            oe1Var3 = oe1Var2;
                            sb3.append(-re1Var2.G.getDialogId());
                            publicUsername = sb3.toString();
                        } else {
                            messageObject = primaryMessageObject;
                            oe1Var3 = oe1Var2;
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(re1Var2.G.getId());
                        sb2.append("?task=");
                        sb2.append(todoItem2.id);
                        F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new i11(24, re1Var2, sb2.toString()), false);
                    } else {
                        messageObject = primaryMessageObject;
                        oe1Var3 = oe1Var2;
                    }
                    F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new i11(25, re1Var2, todoItem2), false);
                } else {
                    messageObject = primaryMessageObject;
                    oe1Var3 = oe1Var2;
                }
                if (re1Var2.G.canEditMessage(foVar2.e)) {
                    final int i17 = 0;
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.je1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    fo foVar3 = foVar2;
                                    fw0 fw0Var = new fw0(foVar3);
                                    re1 re1Var3 = re1Var2;
                                    fw0Var.p0(MessageObject.getMedia(re1Var3.G), false, i13);
                                    fw0Var.e0 = new bs0(18, re1Var3, foVar3);
                                    foVar3.presentFragment(fw0Var);
                                    re1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = foVar2.c();
                                    re1 re1Var4 = re1Var2;
                                    if (c10) {
                                        Toast.makeText(re1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        pe1 pe1Var3 = re1Var4.I;
                                        pe1Var3.k4(pe1Var3.O2(i13), false);
                                    }
                                    re1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = foVar2.c();
                                    re1 re1Var5 = re1Var2;
                                    if (c11) {
                                        Toast.makeText(re1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        pe1 pe1Var4 = re1Var5.I;
                                        pe1Var4.k4(pe1Var4.O2(i13), false);
                                    }
                                    re1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        i10 = 51;
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new org.telegram.ui.Components.n21(re1Var2, tL_messageMediaToDo, i12, foVar2, 12), false);
                        F.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        eh.e k10 = fh.b.k(c6Var);
                        bh.b bVar = re1Var2.F;
                        F.Q(bVar, k10, false);
                        F.Y();
                        ViewGroup viewGroup2 = F.A;
                        re1Var2.Q = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        re1Var2.Q.setPivotY(0.0f);
                        oe1Var3.addView(re1Var2.Q, w7.z5.e(-2, -2, i10));
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        foVar2.q8(messageObject, arrayList4, arrayList5, arrayList6);
                        jf jfVar2 = new jf(foVar2, 10);
                        messageObject2 = re1Var2.G;
                        List<TLRPC.TL_availableReaction> enabledReactionsList = foVar2.getMediaDataController().getEnabledReactionsList();
                        boolean z15 = foVar2.x() && !foVar2.c() && foVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(foVar2.e) && !foVar2.e.megagroup) || ChatObject.isMonoForum(foVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                        if (messageObject2.isForwardedChannelPost()) {
                            z10 = z15;
                            if (!messageObject2.isSecretMedia()) {
                                if (foVar2.R3 != 5) {
                                    if (!foVar2.x()) {
                                        if (!foVar2.c()) {
                                            if (messageObject2.isReactionsAvailable()) {
                                                TLRPC.ChatFull chatFull2 = foVar2.Z7;
                                                if (chatFull2 != null) {
                                                    if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    }
                                                }
                                                if (chatFull2 == null) {
                                                }
                                                if (foVar2.f == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z11 = false;
                        } else {
                            z10 = z15;
                            TLRPC.ChatFull chatFull3 = foVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                            if (chatFull3 != null) {
                                if (!foVar2.x()) {
                                    if (foVar2.R3 != 5) {
                                        if (!foVar2.c()) {
                                            if (messageObject2.isReactionsAvailable()) {
                                                if (chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                }
                                            }
                                        }
                                    }
                                }
                                z11 = false;
                            }
                            z11 = true;
                        }
                        boolean z16 = z11;
                        z12 = (!z10 || foVar2.c() || foVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(foVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= foVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(foVar2.e) && ChatObject.isChannel(foVar2.e)) || (chatFull = foVar2.Z7) == null || chatFull.participants_count > foVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || foVar2.R3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(foVar2.e)) ? false : true;
                        if (foVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(foVar2.e) && ChatObject.canManageMonoForum(foVar2.getCurrentAccount(), foVar2.e)) {
                            int i18 = ((-foVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-foVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                        }
                        if (!z10 && foVar2.e == null && foVar2.h == null && (user = foVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(foVar2.f) && !UserObject.isAnonymous(foVar2.f)) {
                            user2 = foVar2.f;
                            if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = foVar2.a8) == null || !userFull.read_dates_private) && !foVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && foVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < foVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z13 = true;
                                TLRPC.User user3 = foVar2.f;
                                boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(foVar2.f))) || foVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.l80 G = org.telegram.ui.Components.l80.G(re1Var2.c, foVar2.getResourceProvider(), null, !z10 || z12);
                                if (z12) {
                                    jfVar = jfVar2;
                                    messageObject3 = messageObject2;
                                    z14 = z16;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList5;
                                    re1Var = re1Var2;
                                    arrayList3 = arrayList6;
                                    foVar = foVar2;
                                    if (z13) {
                                        G.r(new org.telegram.ui.Components.ad0(re1Var.getContext(), 0, messageObject3, new ie1(re1Var, 0), re1Var.a), w7.z5.n(-1, 36));
                                        G.k();
                                    } else if (z17) {
                                        messageObject4 = messageObject3;
                                        G.r(new org.telegram.ui.Components.ad0(re1Var.getContext(), 1, messageObject3, new ie1(re1Var, 2), re1Var.a), w7.z5.n(-1, 36));
                                        G.k();
                                        i11 = 0;
                                        for (size = arrayList.size(); i11 < size; size = size) {
                                            G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new c90(re1Var, jfVar, ((Integer) arrayList3.get(i11)).intValue(), 11), false);
                                            i11++;
                                            arrayList3 = arrayList3;
                                        }
                                        G.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                                        G.Q(bVar, fh.b.k(c6Var), false);
                                        G.Y();
                                        ViewGroup viewGroup3 = G.A;
                                        re1Var.S = viewGroup3;
                                        viewGroup3.setPivotX(0.0f);
                                        re1Var.S.setPivotY(0.0f);
                                        ViewGroup viewGroup4 = re1Var.S;
                                        FrameLayout.LayoutParams e = w7.z5.e(-2, -2, 51);
                                        oe1 oe1Var6 = re1Var.d;
                                        oe1Var6.addView(viewGroup4, e);
                                        viewGroup = re1Var.S;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new lq0(re1Var, 21));
                                            re1Var.S.setOnTouchListener(new e0(re1Var, 7));
                                        }
                                        if (z14) {
                                            fo foVar3 = foVar;
                                            org.telegram.ui.Components.gl0 gl0Var = new org.telegram.ui.Components.gl0((foVar.getUserConfig().getClientUserId() > foVar.a() ? 1 : (foVar.getUserConfig().getClientUserId() == foVar.a() ? 0 : -1)) == 0 ? 3 : 0, foVar3.getCurrentAccount(), re1Var.getContext(), foVar3, re1Var.a);
                                            gl0Var.a = true;
                                            float f7 = 22;
                                            gl0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                            gl0Var.setDelegate(new ne1(re1Var, foVar3, messageObject4, gl0Var));
                                            re1Var.P = gl0Var;
                                            oe1Var6.addView(gl0Var, w7.z5.e(-2, (int) ((gl0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                            gl0Var.p(messageObject4, foVar3.Z7, true);
                                            re1Var.P.setTransitionProgress(1.0f);
                                        }
                                        re1Var.e();
                                        re1Var.c0 = new bn(this, 5);
                                        re1Var.show();
                                        return true;
                                    }
                                } else {
                                    ki0 ki0Var = new ki0(re1Var2.getContext(), foVar2.getCurrentAccount(), messageObject2, foVar2.e);
                                    FrameLayout frameLayout = new FrameLayout(re1Var2.getContext());
                                    frameLayout.addView(ki0Var, w7.z5.d(36.0f, -1));
                                    org.telegram.ui.Components.l80 J = G.J();
                                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, re1Var2.getContext(), re1Var2.a, true, false);
                                    e1Var.setItemHeight(44);
                                    e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                    e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                                    FrameLayout frameLayout2 = new FrameLayout(re1Var2.getContext());
                                    LinearLayout linearLayout = new LinearLayout(re1Var2.getContext());
                                    linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, c6Var));
                                    linearLayout.setOrientation(1);
                                    foVar = foVar2;
                                    org.telegram.ui.Components.mm0 a2 = ki0Var.a();
                                    frameLayout2.addView(e1Var);
                                    linearLayout.addView(frameLayout2);
                                    z14 = z16;
                                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(re1Var2.getContext(), c6Var), w7.z5.n(-1, 8));
                                    frameLayout2.setOnClickListener(new le1(G));
                                    messageObject3 = messageObject2;
                                    jfVar = jfVar2;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList5;
                                    me1 me1Var = new me1(re1Var2, ki0Var, foVar, a2, linearLayout, G, J);
                                    G = G;
                                    re1Var = re1Var2;
                                    ki0Var.setOnClickListener(me1Var);
                                    linearLayout.addView(a2, w7.z5.n(-1, -2));
                                    J.q(linearLayout);
                                    G.q(frameLayout);
                                    G.k();
                                    arrayList3 = arrayList6;
                                }
                                messageObject4 = messageObject3;
                                i11 = 0;
                                while (i11 < size) {
                                }
                                G.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                                G.Q(bVar, fh.b.k(c6Var), false);
                                G.Y();
                                ViewGroup viewGroup32 = G.A;
                                re1Var.S = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                re1Var.S.setPivotY(0.0f);
                                ViewGroup viewGroup42 = re1Var.S;
                                FrameLayout.LayoutParams e7 = w7.z5.e(-2, -2, 51);
                                oe1 oe1Var62 = re1Var.d;
                                oe1Var62.addView(viewGroup42, e7);
                                viewGroup = re1Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z14) {
                                }
                                re1Var.e();
                                re1Var.c0 = new bn(this, 5);
                                re1Var.show();
                                return true;
                            }
                        }
                        z13 = false;
                        TLRPC.User user32 = foVar2.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.Components.l80 G2 = org.telegram.ui.Components.l80.G(re1Var2.c, foVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        messageObject4 = messageObject3;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        G2.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        G2.Q(bVar, fh.b.k(c6Var), false);
                        G2.Y();
                        ViewGroup viewGroup322 = G2.A;
                        re1Var.S = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        re1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup422 = re1Var.S;
                        FrameLayout.LayoutParams e72 = w7.z5.e(-2, -2, 51);
                        oe1 oe1Var622 = re1Var.d;
                        oe1Var622.addView(viewGroup422, e72);
                        viewGroup = re1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        re1Var.e();
                        re1Var.c0 = new bn(this, 5);
                        re1Var.show();
                        return true;
                    }
                }
                i10 = 51;
                F.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                eh.e k102 = fh.b.k(c6Var);
                bh.b bVar2 = re1Var2.F;
                F.Q(bVar2, k102, false);
                F.Y();
                ViewGroup viewGroup22 = F.A;
                re1Var2.Q = viewGroup22;
                viewGroup22.setPivotX(0.0f);
                re1Var2.Q.setPivotY(0.0f);
                oe1Var3.addView(re1Var2.Q, w7.z5.e(-2, -2, i10));
                ArrayList arrayList42 = new ArrayList();
                ArrayList arrayList52 = new ArrayList();
                ArrayList arrayList62 = new ArrayList();
                foVar2.q8(messageObject, arrayList42, arrayList52, arrayList62);
                jf jfVar22 = new jf(foVar2, 10);
                messageObject2 = re1Var2.G;
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = foVar2.getMediaDataController().getEnabledReactionsList();
                if (foVar2.x()) {
                }
                if (messageObject2.isForwardedChannelPost()) {
                }
                boolean z162 = z11;
                if (!z10) {
                }
                if (foVar2.e != null) {
                    int i182 = ((-foVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-foVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z10) {
                    user2 = foVar2.f;
                    if (!user2.bot) {
                        z13 = true;
                        TLRPC.User user322 = foVar2.f;
                        if (user322 == null) {
                        }
                        org.telegram.ui.Components.l80 G22 = org.telegram.ui.Components.l80.G(re1Var2.c, foVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        messageObject4 = messageObject3;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        G22.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        G22.Q(bVar2, fh.b.k(c6Var), false);
                        G22.Y();
                        ViewGroup viewGroup3222 = G22.A;
                        re1Var.S = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        re1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup4222 = re1Var.S;
                        FrameLayout.LayoutParams e722 = w7.z5.e(-2, -2, 51);
                        oe1 oe1Var6222 = re1Var.d;
                        oe1Var6222.addView(viewGroup4222, e722);
                        viewGroup = re1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        re1Var.e();
                        re1Var.c0 = new bn(this, 5);
                        re1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user3222 = foVar2.f;
                if (user3222 == null) {
                }
                org.telegram.ui.Components.l80 G222 = org.telegram.ui.Components.l80.G(re1Var2.c, foVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G222.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                G222.Q(bVar2, fh.b.k(c6Var), false);
                G222.Y();
                ViewGroup viewGroup32222 = G222.A;
                re1Var.S = viewGroup32222;
                viewGroup32222.setPivotX(0.0f);
                re1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup42222 = re1Var.S;
                FrameLayout.LayoutParams e7222 = w7.z5.e(-2, -2, 51);
                oe1 oe1Var62222 = re1Var.d;
                oe1Var62222.addView(viewGroup42222, e7222);
                viewGroup = re1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                re1Var.e();
                re1Var.c0 = new bn(this, 5);
                re1Var.show();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void W0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String string = LocaleController.getString("PsaMessageInfo_" + messageObject.messageOwner.fwd_from.psa_type);
        if (TextUtils.isEmpty(string)) {
            string = LocaleController.getString(R.string.PsaMessageInfoDefault);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        MessageObject.addLinks(false, spannableStringBuilder);
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        fo foVar = this.a;
        if (currentMessagesGroup != null) {
            int size = currentMessagesGroup.posArray.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                    MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                    if (messageObject2 != messageObject) {
                        int childCount = foVar.x0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = foVar.x0.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.u1) {
                                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                                if (messageObject2.equals(u1Var2.getMessageObject())) {
                                    u1Var = u1Var2;
                                }
                            }
                        }
                        messageObject = messageObject2;
                    }
                } else {
                    i10++;
                }
            }
        }
        foVar.Nb(messageObject, spannableStringBuilder, 1);
        u1Var.g4(1, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void X1(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        fo foVar = this.a;
        if (!AndroidUtilities.isContextSafe(foVar.getParentActivity()) || (chat = foVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        d(u1Var, foVar.getMessagesController().getParticipant(foVar.e.id, currentUser.id));
    }

    @Override // org.telegram.ui.Cells.l1
    public final ih.a Y() {
        return this.a.Qb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var == null ? null : u1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        fo foVar = this.a;
        return (foVar.R3 == 1 || foVar.D9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Z1(org.telegram.ui.Cells.u1 u1Var, long j10) {
        Bundle e = t8.b.e(j10, "user_id");
        org.telegram.ui.ActionBar.m2 m2Var = this.a;
        if (m2Var.getMessagesController().checkCanOpenChat(e, m2Var, u1Var.getMessageObject())) {
            m2Var.presentFragment(new fo(e));
        }
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        fo foVar = this.a;
        sk skVar = foVar.Y;
        if (skVar != null) {
            CharSequence fieldText = skVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String publicUsername = ChatObject.getPublicUsername(chat);
            if (publicUsername != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) publicUsername).append((CharSequence) " ");
                foVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new bn(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        fo foVar = this.a;
        return foVar.wb != 0 && u1Var.getMessageObject() != null && foVar.wb == u1Var.getMessageObject().getId() && foVar.xb == i10;
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        fo foVar = this.a;
        sk skVar = foVar.Y;
        if (skVar != null) {
            CharSequence fieldText = skVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) publicUsername).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(t8.b.u(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.t61("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            foVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new bn(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        fo foVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (kVar2.t() || foVar.F9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
        return !z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.l1
    public final boolean c0(org.telegram.ui.Cells.u1 u1Var, final TLRPC.User user) {
        int i10;
        b5 b10;
        int i11;
        wk wkVar;
        vk vkVar;
        if (!k()) {
            return false;
        }
        fo foVar = this.a;
        ?? r22 = (foVar.e == null || ((wkVar = foVar.O0) != null && wkVar.getVisibility() == 0) || ((vkVar = foVar.R) != null && vkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = foVar.e;
        ?? r42 = (chat == null || !(foVar.d4 == 0 || foVar.h4) || (ChatObject.isChannel(chat) && !foVar.e.megagroup)) ? 0 : 1;
        h5[] h5VarArr = new h5[r22 + 2 + r42];
        h5VarArr[0] = h5.d;
        h5VarArr[1] = h5.h;
        char c10 = 2;
        if (r22 != 0) {
            h5VarArr[2] = h5.n;
            c10 = 3;
        }
        if (r42 != 0) {
            h5VarArr[c10] = h5.r;
        }
        TLRPC.UserFull userFull = foVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = b5.c(user, userFull, h5VarArr);
            if (!c2.b.g(b10)) {
                i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
                b10 = b5.b(user, i11, h5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            b10 = b5.b(user, i10, h5VarArr);
        }
        if (c2.b.g(b10)) {
            c2.b.m().y((ViewGroup) foVar.fragmentView, foVar.ea, b10, new f7(this, u1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(foVar, u1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.dn
            public final /* synthetic */ qn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.v(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.ra(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new t1(this, u1Var, user, 25), false);
        final int i13 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.dn
            public final /* synthetic */ qn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.v(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.ra(user);
                        break;
                }
            }
        }, r22);
        final int i14 = 2;
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.dn
            public final /* synthetic */ qn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.v(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.ra(user);
                        break;
                }
            }
        }, r42);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    public final void d(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        fo foVar = this.a;
        foVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(foVar.getParentActivity()) || (chat = foVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        boolean z13 = true;
        boolean z14 = false;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                z10 = channelParticipant.promoted_by == foVar.getUserConfig().getClientUserId();
            } else {
                z10 = false;
                z13 = false;
            }
            str = channelParticipant.rank;
        } else {
            if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    z11 = channelParticipant2.promoted_by == foVar.getUserConfig().getClientUserId();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = foVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                long j10 = -foVar.e.id;
                c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                org.telegram.ui.Components.a11.b(parentActivity, i10, j10, currentUser, str2, z15, z16, z12, c6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(foVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    foVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(foVar.e);
                    tL_channels_getParticipant.participant = foVar.getMessagesController().getInputPeer(currentUser.id);
                    foVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new bi.f0(7, this, u1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == foVar.getUserConfig().getClientUserId();
            } else {
                z10 = false;
                z13 = false;
            }
            str = ((TLRPC.ChatParticipant) tLObject).rank;
        }
        z12 = z10;
        str2 = str;
        boolean z152 = z13;
        boolean z162 = z14;
        Activity parentActivity2 = foVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        long j102 = -foVar.e.id;
        c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
        org.telegram.ui.Components.a11.b(parentActivity2, i10, j102, currentUser, str2, z152, z162, z12, c6Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void d0(int i10) {
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        fo foVar = this.a;
        try {
            if (i10 == 0) {
                foVar.k7();
                ol olVar = foVar.z3;
                if (olVar == null) {
                    return;
                }
                olVar.l(0L, 84, null, new bn(this, i15));
                foVar.z3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(foVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (foVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.f41.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.f41.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.zc.a0(foVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                foVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(foVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", foVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new bn(this, i14)) : foVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new bn(this, i13)));
                a02.getClass();
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), a02.c);
                acVar.c(i16, 36, 36, new String[0]);
                if (append != null) {
                    String charSequence = append.toString();
                    int i17 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i17 >= 6) {
                            append.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i17++;
                    }
                }
                acVar.b.setText(append);
                acVar.b.setSingleLine(false);
                acVar.b.setMaxLines(6);
                a02.b(acVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e0() {
        return this.a.R3 == 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e1(MessageObject messageObject) {
        rm rmVar;
        long dialogId = messageObject.getDialogId();
        fo foVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((rmVar = foVar.A0) != null && rmVar.N)) && foVar.R3 != 7;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (u1Var == null || pageBlock == null) {
            return false;
        }
        fo foVar = this.a;
        if (foVar.getParentActivity() == null || (messageObject = u1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer t12 = PhotoViewer.t1();
        t12.K2(null, foVar, null);
        return t12.f2(null, null, null, null, null, null, null, indexOf, new an(foVar, arrayList), null, 0L, 0L, 0L, true, new zm(richMessage, arrayList, messageObject), null);
    }

    public final void f() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        fo foVar = this.a;
        if (isHuaweiStoreApp) {
            pf.d.r(foVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(foVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        this.a.L7(u1Var, true, false, f7, f10, false, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f2(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.vc(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final String g(org.telegram.ui.Cells.u1 u1Var) {
        fo foVar;
        int i10;
        if (u1Var.getMessageObject() == null || (i10 = (foVar = this.a).wb) == 0 || i10 != u1Var.getMessageObject().getId() || foVar.xb != 3) {
            return null;
        }
        return foVar.zb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g1() {
        fo foVar = this.a;
        foVar.T7();
        UndoView undoView = foVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, foVar.T5, null);
    }

    public final void h(org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        dk dkVar;
        if (u1Var == null || (primaryMessageObject = u1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        fo foVar = this.a;
        ak akVar = foVar.x0;
        if (akVar != null && (dkVar = foVar.z0) != null && dkVar.y < 0) {
            for (int childCount = akVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = foVar.x0.getChildAt(childCount);
                foVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.u1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = foVar.Q8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = foVar.Q8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                dk dkVar2 = foVar.z0;
                foVar.x0.getClass();
                dkVar2.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) foVar.s9), false);
            } else {
                foVar.z0.h1(i10, i11);
            }
        }
        foVar.N0 = z11;
        foVar.vc(primaryMessageObject, false);
        foVar.N0 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar;
        fo foVar = this.a;
        if (!foVar.wc.f || (cVar = foVar.Cc) == null || cVar.n != u1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return foVar.Cc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a2 = rh.i.a(messageObject);
        boolean a10 = w7.l6.a(a2, 7);
        fo foVar = this.a;
        if (a10) {
            org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.e_hand_2, 36, rh.i.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            foVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            u1Var.S0(true);
            return;
        }
        if (foVar.getParentActivity() == null) {
            return;
        }
        if (foVar.n2 == null) {
            org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(5, foVar.getParentActivity(), foVar.ea, false);
            foVar.n2 = v40Var;
            v40Var.setAlpha(0.0f);
            foVar.n2.setVisibility(4);
            int indexOfChild = foVar.X0.indexOfChild(foVar.S);
            if (indexOfChild == -1) {
                return;
            } else {
                foVar.X0.addView(foVar.n2, indexOfChild + 1, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
            }
        }
        if (!arrayList.isEmpty() || i10 >= 0) {
            i13 = i12;
            i14 = i11;
        } else {
            ArrayList<org.telegram.ui.Cells.s1> pollButtons = u1Var.getPollButtons();
            int size = pollButtons.size();
            int i16 = 0;
            float f7 = 0.0f;
            while (true) {
                if (i16 >= size) {
                    i13 = i12;
                    i15 = i11;
                    break;
                }
                org.telegram.ui.Cells.s1 s1Var = pollButtons.get(i16);
                float y3 = ((u1Var.getY() + s1Var.b) - AndroidUtilities.dp(4.0f)) - foVar.s9;
                foVar.q2 = AndroidUtilities.dp(13.3f) + s1Var.a;
                int D = org.telegram.messenger.sk.D(6.0f, s1Var.b, i12);
                foVar.r2 = D;
                if (y3 > 0.0f) {
                    i15 = foVar.q2;
                    i13 = D;
                    f7 = 0.0f;
                    break;
                }
                i16++;
                f7 = y3;
            }
            if (f7 != 0.0f) {
                foVar.x0.v0(0, (int) f7, null);
                foVar.p2 = u1Var;
                return;
            }
            i14 = i15;
        }
        foVar.n2.e(u1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        fo foVar = this.a;
        if (foVar.getParentActivity() == null) {
            return;
        }
        if (foVar.X9 == null) {
            vh.i iVar = new vh.i(foVar.getParentActivity());
            foVar.X9 = iVar;
            foVar.X0.addView(iVar, w7.z5.e(-1, -1, 48));
        }
        vh.i iVar2 = foVar.X9;
        HashMap hashMap = iVar2.a;
        ArrayList arrayList = iVar2.c;
        arrayList.clear();
        int i10 = iVar2.d;
        UserConfig userConfig = UserConfig.getInstance(i10);
        long j10 = userConfig.clientUserId;
        arrayList.add(Long.valueOf(j10));
        if (userConfig.suggestContacts) {
            ArrayList<TLRPC.TL_topPeer> arrayList2 = MediaDataController.getInstance(i10).hints;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.TL_topPeer tL_topPeer = arrayList2.get(i11);
                i11++;
                TLRPC.TL_topPeer tL_topPeer2 = tL_topPeer;
                long j11 = tL_topPeer2.peer.user_id;
                if (j11 != 0) {
                    int i12 = size;
                    if (MessagesController.getInstance(i10).getUser(Long.valueOf(tL_topPeer2.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j11));
                    }
                    size = i12;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i10).getAllDialogs();
        for (int i13 = 0; i13 < allDialogs.size(); i13++) {
            TLRPC.Dialog dialog = allDialogs.get(i13);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j12 = dialog.id;
                if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                    if (DialogObject.isUserDialog(dialog.id)) {
                        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.id));
                        if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.id));
                        if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList3);
        String b10 = vh.i.b(u1Var);
        if (b10 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            Long l4 = (Long) obj;
            if (hashSet.add(l4) && DialogObject.isUserDialog(l4.longValue())) {
                arrayList4.add(l4);
            }
        }
        vh.h hVar = new vh.h(iVar2, u1Var, arrayList4, new s9.b(17, iVar2, b10));
        hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
        hVar.setCallback(iVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        fo foVar = this.a;
        if (foVar.E9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (foVar.getParentActivity() != null) {
            if (foVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                sk skVar = foVar.Y;
                MessageObject messageObject = u1Var.getMessageObject();
                MessageObject messageObject2 = u1Var.getMessageObject();
                dj djVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                pf.c cVar = foVar.Ab;
                if (cVar != null) {
                    cVar.a(true);
                    foVar.Ab = null;
                }
                if (str == null || u1Var.getMessageObject() == null) {
                    foVar.Ab = null;
                } else {
                    dj djVar2 = new dj(foVar, u1Var.getMessageObject().getId(), str, u1Var, 1);
                    foVar.Ab = djVar2;
                    djVar = djVar2;
                }
                skVar.a0(keyboardButtonProto, messageObject, messageObject2, djVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j() {
        f();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j2() {
        this.a.w9();
    }

    public final boolean k() {
        fo foVar = this.a;
        if (UserObject.isUserSelf(foVar.f)) {
            return true;
        }
        TLRPC.Chat chat = foVar.e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || foVar.e.megagroup;
        }
        return false;
    }

    public final void l(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, boolean z10) {
        fo foVar = this.a;
        TLRPC.Chat chat2 = foVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            uj ujVar = foVar.a1;
            if (ujVar != null && i10 == 0) {
                ujVar.e(false, false);
                return;
            } else {
                if (u1Var.getMessageObject() != null) {
                    foVar.j(i10, u1Var.getMessageObject().getId(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || foVar.K9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            ej ejVar = null;
            if (z10) {
                pf.c cVar = foVar.Ab;
                if (cVar != null) {
                    cVar.a(true);
                    foVar.Ab = null;
                }
                if (u1Var.getMessageObject() == null) {
                    foVar.Ab = null;
                } else {
                    ej ejVar2 = new ej(foVar, u1Var.getMessageObject().getId(), u1Var, 0);
                    foVar.Ab = ejVar2;
                    ejVar = ejVar2;
                }
            }
            if (foVar.getMessagesController().checkCanOpenChat(bundle, foVar, u1Var.getMessageObject(), ejVar)) {
                fo foVar2 = new fo(bundle);
                if (ejVar == null || i10 == 0) {
                    foVar.presentFragment(foVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new fi.l3(this, ejVar, chat, i10, foVar2, 17), 5000L);
                    ejVar.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l0() {
        boolean z10;
        fo foVar = this.a;
        if (foVar.F9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        if (u1Var == null || document == null) {
            return;
        }
        fo foVar = this.a;
        if (foVar.getParentLayout() == null || !Z(u1Var)) {
            return;
        }
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(foVar, u1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new t1(this, u1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Z7(u1Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11;
        TLRPC.Document document;
        int i12;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i13;
        TLRPC.Document document3;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            J1(u1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        fo foVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(foVar)) {
                nn nnVar = new nn(3);
                c6Var2 = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                nnVar.setResourceProvider(c6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = foVar.getMessagesController().getPeer(foVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                nnVar.O0 = false;
                nnVar.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                foVar.presentFragment(nnVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            xt.q().w(foVar.getParentActivity());
            xt.q().v(new on(this, tL_messageMediaPoll, pollAnswer, u1Var));
            xt q6 = xt.q();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = u1Var.getMessageObject();
            c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
            q6.t(document4, null, "", null, null, i18, false, messageObject2, c6Var, 200);
            return;
        }
        if (MessageObject.isMusicDocument(messageMedia.document)) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (MediaController.getInstance().isPlayingMessage(messageObject) && playingMessageObject != null) {
                if (playingMessageObject.isPlayingExplanationObject == (i10 == -3)) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        MediaController.getInstance().playMessage(playingMessageObject);
                        return;
                    } else {
                        MediaController.getInstance().lambda$startAudioAgain$7(playingMessageObject);
                        return;
                    }
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.TL_message F7 = fo.F7(message);
            F7.media = messageMedia;
            F7.attachPath = rh.f.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            MessageObject messageObject3 = new MessageObject(i17, F7, false, true);
            messageObject3.isPlayingExplanationObject = i10 == -3;
            arrayList.add(messageObject3);
            if (MediaController.getInstance().isPlayingMessage(messageObject)) {
                MediaController.getInstance().cleanupPlayer(false, true);
            }
            MediaController.getInstance().setPlaylist(arrayList, messageObject3, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !MessageObject.isVideoDocument(document5)) {
            i15 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            rh.a aVar = new rh.a(i15, messageObject, document6, rh.f.c(messageObject.messageOwner, i10));
            if (aVar.g) {
                FileLoader.getInstance(i15).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject4 = u1Var.y7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                rh.g gVar = u1Var.c6;
                if (gVar != null) {
                    gVar.e();
                }
                rh.g gVar2 = u1Var.b6;
                if (gVar2 != null) {
                    gVar2.e();
                    return;
                }
                return;
            }
            if (!aVar.f) {
                FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                aVar.a();
                MessageObject messageObject5 = u1Var.y7;
                if (messageObject5 == null || !messageObject5.isPoll()) {
                    return;
                }
                rh.g gVar3 = u1Var.c6;
                if (gVar3 != null) {
                    gVar3.e();
                }
                rh.g gVar4 = u1Var.b6;
                if (gVar4 != null) {
                    gVar4.e();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message F72 = fo.F7(message2);
            F72.media = messageMedia;
            F72.attachPath = rh.f.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            pn pnVar = new pn(i16, F72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().K2(null, foVar, foVar.ea);
                PhotoViewer t12 = PhotoViewer.t1();
                int i19 = pnVar.type;
                t12.d2(pnVar, foVar, i19 != 0 ? foVar.T5 : 0L, i19 != 0 ? foVar.L6 : 0L, i19 != 0 ? foVar.d() : 0L, foVar.Ga);
                return;
            }
            try {
                AndroidUtilities.openForView(pnVar, foVar.getParentActivity(), foVar.ea, false);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                foVar.C6(pnVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message F73 = fo.F7(message3);
            F73.media = messageMedia3;
            F73.attachPath = rh.f.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            arrayList3.add(new gn(i14, F73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message F74 = fo.F7(message3);
            F74.media = messageMedia2;
            F74.attachPath = rh.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            F74.message = pollResults2.solution;
            F74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            arrayList3.add(new hn(i13, F74, false, true));
            arrayList2.add(-3);
        }
        ag.d.b(tL_messageMediaPoll.poll, foVar.getUserConfig().getClientUserId());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        for (int i20 = 0; i20 < arrayList4.size(); i20++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i20);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                if (pollAnswer2.unshuffled_index == i10) {
                    i11 = arrayList3.size();
                }
                TLRPC.TL_message F75 = fo.F7(message3);
                F75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                F75.message = tL_textWithEntities2.text;
                F75.entities = tL_textWithEntities2.entities;
                F75.attachPath = rh.f.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                arrayList3.add(new in(i12, F75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().K2(null, foVar, foVar.ea);
        PhotoViewer.t1().b2(arrayList3, i11, foVar.a(), 0L, 0L, foVar.Ha);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n(org.telegram.ui.Cells.u1 u1Var) {
        if (u1Var.getMessageObject().isImportedForward()) {
            g1();
            return;
        }
        fo foVar = this.a;
        if (foVar.l3 || foVar.x0 == null || foVar.getParentActivity() == null || foVar.fragmentView == null) {
            return;
        }
        if (foVar.u2 == null) {
            xm xmVar = foVar.X0;
            int indexOfChild = xmVar.indexOfChild(foVar.S);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(1, foVar.getParentActivity(), foVar.ea, false);
            foVar.u2 = v40Var;
            xmVar.addView(v40Var, indexOfChild + 1, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
            foVar.u2.setAlpha(0.0f);
            foVar.u2.setVisibility(4);
        }
        foVar.u2.e(u1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n0(String str) {
        fo foVar = this.a;
        wk wkVar = foVar.O0;
        if (wkVar == null || wkVar.getVisibility() != 0) {
            vk vkVar = foVar.R;
            if ((vkVar == null || vkVar.getVisibility() != 0) && foVar.Y != null && str != null && str.length() > 0) {
                foVar.Y.setFieldText("@" + str + " ");
                foVar.Y.F0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o() {
        this.a.X0.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean o0(org.telegram.ui.Components.b6 b6Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        fo foVar = this.a;
        if (foVar.getMessagesController().premiumFeaturesBlocked() || b6Var == null || b6Var.standard) {
            return false;
        }
        long documentId = b6Var.getDocumentId();
        TLRPC.Document document = b6Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            document = org.telegram.ui.Components.s5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.ew ewVar = new org.telegram.ui.Components.ew(foVar, foVar.getParentActivity(), foVar.ea, arrayList);
        org.telegram.ui.Components.uv uvVar = ewVar.f;
        uvVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(uvVar);
        uvVar.v = imageReceiver;
        if (uvVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        uvVar.w = true;
        uvVar.x.d(1.0f, true);
        uvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.m6, 0.2f, true), 0L, null, null, 0);
        uvVar.v.setLayerNum(7);
        uvVar.v.setAllowStartLottieAnimation(true);
        uvVar.v.setAllowStartAnimation(true);
        uvVar.v.setAutoRepeat(1);
        uvVar.v.setAllowDecodeSingleFrame(true);
        uvVar.v.setParentView(uvVar);
        ewVar.setCalcMandatoryInsets(foVar.C9());
        foVar.showDialog(ewVar);
        return true;
    }

    public final void p(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.m2 m2Var = this.a;
            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var, u1Var.getMessageObject())) {
                m2Var.presentFragment(new fo(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean p2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        fo foVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
        if (!z10 || !foVar.J9) {
            return !c();
        }
        b5Var = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
            ((ActionBarLayout) b5Var2).r();
        }
        return true;
    }

    public final void q(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        fo foVar = this.a;
        foVar.L7(u1Var, false, false, f7, f10, true, false, false);
        foVar.x0.getClass();
        fo.d2(foVar, RecyclerView.R(u1Var));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        vh.h hVar;
        vh.i iVar = this.a.X9;
        if (iVar == null || (hVar = (vh.h) iVar.a.get(vh.i.b(u1Var))) == null) {
            return;
        }
        vh.d[] dVarArr = hVar.w;
        RectF rectF = hVar.r;
        if (hVar.M) {
            float f11 = (f7 - rectF.left) + hVar.U;
            float f12 = (f10 - rectF.top) + hVar.V;
            int i10 = vh.g.a;
            int b10 = (((float) (-AndroidUtilities.dp((float) 37))) >= f12 || f12 >= rectF.height()) ? -1 : w7.r.b((int) Math.floor((f11 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(vh.g.a + 11)), 0, dVarArr.length - 1);
            if (hVar.R == b10) {
                return;
            }
            hVar.a.performHapticFeedback(3, 1);
            hVar.R = b10;
            int i11 = 0;
            while (i11 < dVarArr.length) {
                vh.d dVar = dVarArr[i11];
                boolean z10 = b10 == i11;
                if (dVar.p != z10) {
                    ValueAnimator valueAnimator = dVar.n;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    dVar.p = z10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(dVar.o, z10 ? 1.0f : 0.0f);
                    dVar.n = ofFloat;
                    ofFloat.setDuration(180L);
                    dVar.n.addUpdateListener(dVar);
                    dVar.n.setInterpolator(vh.f.a);
                    dVar.n.start();
                }
                vh.d dVar2 = dVarArr[i11];
                boolean z11 = b10 == i11 || b10 == -1;
                if (dVar2.m != z11) {
                    ValueAnimator valueAnimator2 = dVar2.k;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    dVar2.m = z11;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dVar2.l, z11 ? 1.0f : 0.0f);
                    dVar2.k = ofFloat2;
                    ofFloat2.setDuration(180L);
                    dVar2.k.addUpdateListener(dVar2);
                    dVar2.k.setInterpolator(vh.f.a);
                    dVar2.k.start();
                }
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0118, code lost:
    
        if (r1.noforwards == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0124, code lost:
    
        if (org.telegram.messenger.ChatObject.isPublic(r1) != false) goto L90;
     */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i11;
        TLRPC.Message message2;
        int i12;
        TLRPC.Peer peer;
        MessageObject.GroupedMessages groupedMessages;
        int i13;
        fo foVar = this.a;
        if (foVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.y31 y31Var = foVar.R1;
        boolean z10 = true;
        if (y31Var != null && foVar.d4 == 0 && (u1Var.T7 || u1Var.U7)) {
            y31Var.m(u1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (foVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            b.b(i13);
            return;
        }
        sk skVar = foVar.Y;
        if (skVar != null) {
            skVar.N();
        }
        MessageObject messageObject = u1Var.getMessageObject();
        int i14 = foVar.R3;
        if (i14 == 2) {
            foVar.V8.R0(messageObject.getId());
            foVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && foVar.O3 == 2) || !((!UserObject.isReplyUser(foVar.f) && !UserObject.isUserSelf(foVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(foVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                foVar.fa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (foVar.R3 == 7 && foVar.O3 == 2) {
                foVar.ka(messageObject);
                return;
            } else {
                foVar.la(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) foVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.g0.k(messageObject);
        }
        if (foVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i12 = messageObject.type) != 17 && i12 != 12)) {
            long dialogId = messageObject.getDialogId();
            TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat == null || !chat.noforwards) {
                if (dialogId >= 0 || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.messageOwner.fwd_from;
                    if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        if (peerDialogId < 0) {
                            if (chat2 != null) {
                            }
                            if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            }
                        }
                    }
                }
                boolean z11 = z10;
                foVar.showDialog(new kn(this, foVar.getParentActivity(), foVar, arrayList, ChatObject.isChannel(foVar.e), z11, foVar.ea, z11, messageObject));
                Activity parentActivity = foVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                foVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        boolean z112 = z10;
        foVar.showDialog(new kn(this, foVar.getParentActivity(), foVar, arrayList, ChatObject.isChannel(foVar.e), z112, foVar.ea, z112, messageObject));
        Activity parentActivity2 = foVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        foVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r2() {
        fo foVar = this.a;
        if (!foVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", foVar.getMessagesController().recommendedChannelsLimitPremium), new bn(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", foVar.T5);
        bundle.putInt("start_from", 10);
        foVar.presentFragment(new org.telegram.ui.Components.cb0(bundle, foVar.a1.getSharedMediaPreloader()));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s() {
        this.a.cc();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        fo foVar = this.a;
        di.d4 d4Var = foVar.A1;
        if (d4Var != null) {
            d4Var.e(true);
        }
        if (foVar.getParentActivity() == null || (messageObject = u1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e) {
            FileLog.e(e);
            str = factCheck.country;
        }
        di.d4 d4Var2 = new di.d4(foVar.getParentActivity(), 3);
        d4Var2.p(true);
        d4Var2.K = Layout.Alignment.ALIGN_NORMAL;
        d4Var2.d = -1L;
        d4Var2.T = true;
        d4Var2.e = true;
        d4Var2.q(12.0f);
        foVar.A1 = d4Var2;
        d4Var2.l0 = new jd(20, this, d4Var2);
        d4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        foVar.X0.addView(foVar.A1, w7.z5.a(520.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 55));
        foVar.X0.post(new i2.z(this, u1Var, i11, i10, 4));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int i11;
        dk dkVar;
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        fo foVar = this.a;
        ak akVar = foVar.x0;
        if (akVar != null && (dkVar = foVar.z0) != null && dkVar.y < 0) {
            for (int childCount = akVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = foVar.x0.getChildAt(childCount);
                foVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.u1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = foVar.Q8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = foVar.Q8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        foVar.vc(primaryMessageObject, false);
        di.d4 d4Var = foVar.A1;
        if (d4Var != null) {
            d4Var.e(true);
        }
        if (i10 < 0 || u1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        foVar.z0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.p9 t2() {
        return this.a.c9;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        long j10;
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? u1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        TLRPC.MessageReplies messageReplies = messageObject.messageOwner.replies;
        if (messageReplies != null) {
            i10 = messageReplies.read_max_id;
            j10 = messageReplies.channel_id;
        } else {
            i10 = -1;
            j10 = 0;
        }
        int i11 = i10;
        long j11 = j10;
        fo foVar = this.a;
        foVar.fa(foVar.e.id, messageObject, messageObject.getId(), j11, i11, 0, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        boolean z10 = true;
        if (kVar.t() || foVar.F9()) {
            fo.c2(foVar, u1Var, true, f7, f10);
            return;
        }
        if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isSponsored()) {
            N0(10, u1Var);
            return;
        }
        if (!ChatObject.isForum(foVar.e) && !foVar.K9()) {
            z10 = false;
        }
        v(user, z10);
    }

    public final void v(TLRPC.User user, boolean z10) {
        int i10;
        if (user == null || user.id == UserObject.VERIFY) {
            return;
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        int i11 = 0;
        if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("expandPhoto", z10);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        fo foVar = this.a;
        TLRPC.User user2 = foVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.N4(i11);
        Activity parentActivity = foVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        foVar.presentFragment(profileActivity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x0b1b, code lost:
    
        if (r0.exists() != false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0bd7, code lost:
    
        if (r3.startsWith("text/x-web-markdown") == false) goto L321;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0c14 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
        int i10;
        MessageObject messageObject;
        boolean z11;
        boolean z12;
        File file;
        TLRPC.Chat chat;
        jv0 E;
        int i11;
        jv0 jv0Var;
        float f11;
        float f12;
        char c10;
        char c11;
        MessageObject messageObject2;
        MessageObject messageObject3;
        BitmapDrawable bitmapDrawable;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i12;
        MessageObject messageObject4 = u1Var.getMessageObject();
        int i13 = messageObject4.type;
        fo foVar = this.a;
        if (i13 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject4.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject4.getId();
            storyItem.messageType = 2;
            bi.s9.b(storyItem, foVar.f);
            foVar.getOrCreateStoryViewer().F(foVar.getParentActivity(), messageObject4.messageOwner.media.storyItem, bi.g9.a(foVar.x0));
            return;
        }
        int i14 = 1;
        if (messageObject4.isVideo()) {
            i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            if (DownloadController.getInstance(i12).canDownloadMedia(messageObject4.messageOwner) == 1) {
                messageObject4.putInDownloadsStore = true;
            }
        } else {
            messageObject4.putInDownloadsStore = true;
        }
        if (messageObject4.isSendError()) {
            foVar.L7(u1Var, false, false, f7, f10, true, false, false);
            return;
        }
        if (messageObject4.isSending()) {
            return;
        }
        int i15 = 0;
        if (z10 && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject4.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str);
            if (foVar.ja(str, u1Var, null, messageObject4.getId(), 2)) {
                return;
            }
            pf.c cVar = foVar.Ab;
            if (cVar != null) {
                cVar.a(true);
            }
            foVar.Ab = u1Var.getMessageObject() != null ? new jn(this, u1Var, i15) : null;
            pf.d.q(foVar.getParentActivity(), Uri.parse(str), true, false, false, foVar.Ab, null, false, true, false);
            return;
        }
        int i16 = 5;
        if (messageObject4.isDice()) {
            cn cnVar = new cn(this, messageObject4, i15);
            if (messageObject4.isStakeableDice()) {
                foVar.getMessagesController().loadStakeDiceInfo(new z(this, messageObject4, cnVar, i16));
                return;
            } else {
                cnVar.run();
                return;
            }
        }
        if ((messageObject4.isAnimatedEmoji() && (!messageObject4.isAnimatedAnimatedEmoji() || (foVar.xa.e.containsKey(kz.p(MessageObject.findAnimatedEmojiEmoticon(messageObject4.getDocument()))) && foVar.f != null))) || messageObject4.isPremiumSticker()) {
            foVar.Ra(u1Var);
            foVar.xa.k(u1Var, foVar, true);
            foVar.x0.I0(false);
            return;
        }
        int i17 = 6;
        if (messageObject4.needDrawBluredPreview()) {
            bf jb2 = foVar.jb(messageObject4, false);
            a3.i0 P4 = fo.P4(foVar, messageObject4);
            u1Var.invalidate();
            final SecretMediaViewer f13 = SecretMediaViewer.f();
            final Activity parentActivity = foVar.getParentActivity();
            int i18 = UserConfig.selectedAccount;
            f13.a = i18;
            ImageReceiver imageReceiver = f13.h;
            imageReceiver.setCurrentAccount(i18);
            if (f13.b != parentActivity) {
                f13.b = parentActivity;
                f13.g1 = new org.telegram.ui.Components.pn0(parentActivity, null);
                l0 l0Var = new l0(f13, parentActivity, 21);
                f13.d = l0Var;
                l0Var.setBackgroundDrawable(f13.l0);
                f13.d.setFocusable(true);
                f13.d.setFocusableInTouchMode(true);
                f13.d.setClipChildren(false);
                f13.d.setClipToPadding(false);
                f13.e = new ah.v(f13, parentActivity);
                View view = new View(parentActivity);
                f13.f = view;
                view.setBackgroundColor(2130706432);
                f13.e.addView(f13.f, w7.z5.e(-1, -2, 80));
                f13.e.setFocusable(false);
                f13.d.addView(f13.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f13.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f13.e.setLayoutParams(layoutParams);
                f13.e.setFitsSystemWindows(true);
                f13.e.setOnApplyWindowInsetsListener(new e51(f13, 0));
                f13.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f13.e.getContext(), f13);
                f13.L0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f13);
                org.telegram.ui.Components.b8 b8Var = new org.telegram.ui.Components.b8(f13, parentActivity, i17);
                f13.F = b8Var;
                b8Var.setTitleColor(-1);
                f13.F.setSubtitleColor(-1);
                f13.F.setBackgroundColor(2130706432);
                f13.F.setOccupyStatusBar(true);
                f13.F.C(1090519039, false);
                f13.F.D(-1, false);
                f13.F.setBackButtonImage(R.drawable.ic_ab_back);
                f13.F.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                f13.e.addView(f13.F, w7.z5.d(-2.0f, -1));
                f13.F.setActionBarMenuOnItemClick(new w41(f13, i14));
                di.d4 d4Var = new di.d4(parentActivity, 1);
                f13.r = d4Var;
                d4Var.l(1.0f, -26.0f);
                f13.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                f13.e.addView(f13.r, w7.z5.a(80.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 53));
                k51 k51Var = new k51(f13, parentActivity);
                f13.n = k51Var;
                f13.e.addView(k51Var, w7.z5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 119, 53));
                ow0 ow0Var = new ow0(f13, i14);
                f13.U = new l51(f13, parentActivity);
                View view2 = new View(parentActivity);
                f13.T = view2;
                view2.setBackgroundColor(2130706432);
                f13.U.addView(f13.T, w7.z5.e(-1, -1, 119));
                org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(f13.e.getContext());
                f13.S = h5Var;
                h5Var.setTextColor(-1);
                f13.S.setGravity(53);
                f13.S.setTextSize(14);
                f13.S.setImportantForAccessibility(2);
                f13.U.addView(f13.S, w7.z5.a(-2.0f, 0.0f, 15.0f, 12.0f, 0.0f, -2, 53));
                x50 x50Var = new x50(f13, parentActivity, 8);
                f13.R = x50Var;
                org.telegram.ui.Components.k81 k81Var = new org.telegram.ui.Components.k81(x50Var);
                f13.Q = k81Var;
                k81Var.z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.k81 k81Var2 = f13.Q;
                k81Var2.k = 872415231;
                k81Var2.l = 872415231;
                k81Var2.m = -1;
                k81Var2.n = -1;
                k81Var2.A = 1509949439;
                k81Var2.j = ow0Var;
                f13.U.addView(f13.R);
                f13.e.addView(f13.U, w7.z5.e(-1, 48, 80));
                ct0 ct0Var = new ct0(null, new bi.b());
                f13.Y = ct0Var;
                ct0Var.j0 = true;
                ct0Var.h0 = false;
                xu0 xu0Var = new xu0(f13.e.getContext());
                f13.Z = xu0Var;
                xu0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.f51
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new wu0(parentActivity, secretMediaViewer.a0, secretMediaViewer.Y, new f5(secretMediaViewer, 22), new sg0(secretMediaViewer, 2));
                    }
                });
                f13.Z.setVisibility(4);
                if (!f13.w1) {
                    f13.w1 = true;
                    f13.Z.setLayerType(2, null);
                    f13.Z.getCurrentView().setLayerType(2, null);
                    f13.Z.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                f13.V = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(64.0f), 1711276032));
                org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(28);
                f13.W = gh0Var;
                gh0Var.setCallback(f13.V);
                f13.V.setImageDrawable(f13.W);
                f13.V.setScaleType(ImageView.ScaleType.CENTER);
                f13.V.setScaleX(0.6f);
                f13.V.setScaleY(0.6f);
                f13.V.setAlpha(0.0f);
                f13.V.setPivotX(AndroidUtilities.dp(32.0f));
                f13.V.setPivotY(AndroidUtilities.dp(32.0f));
                f13.e.addView(f13.V, w7.z5.e(64, 64, 17));
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                f13.c = layoutParams2;
                layoutParams2.height = -1;
                layoutParams2.format = -3;
                layoutParams2.width = -1;
                layoutParams2.gravity = 48;
                layoutParams2.type = 99;
                layoutParams2.flags = -2147409656;
                AndroidUtilities.logFlagSecure();
                imageReceiver.setParentView(f13.e);
                imageReceiver.setForceCrossfade(true);
                org.telegram.ui.Cells.aa n10 = f13.Y.n(f13.d.getContext());
                if (n10 != null) {
                    AndroidUtilities.removeFromParent(n10);
                    f13.e.addView(n10);
                }
                f13.Y.S(f13.e);
                f13.Y.i0 = true;
            }
            SecretMediaViewer f14 = SecretMediaViewer.f();
            xl xlVar = foVar.Ga;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f14.l0;
            ImageReceiver imageReceiver2 = f14.h;
            if (f14.b != null && messageObject4.needDrawBluredPreview()) {
                if (xlVar == null || (E = xlVar.E(messageObject4, null, 0, true, false)) == null) {
                    return;
                }
                f14.q1 = messageObject4.messageOwner.ttl == Integer.MAX_VALUE;
                f14.p1 = P4;
                f14.N = xlVar;
                f14.K = System.currentTimeMillis();
                f14.L = 0L;
                f14.k0 = true;
                f14.j0 = true;
                f14.p0 = false;
                n4 n4Var = f14.w;
                if (n4Var != null) {
                    n4Var.setVisibility(4);
                }
                f14.i();
                f14.N0 = 0.0f;
                f14.O0 = 1.0f;
                f14.P0 = 0.0f;
                f14.Q0 = 0.0f;
                f14.R0 = 0.0f;
                f14.S0 = 0.0f;
                f14.T0 = 0.0f;
                f14.U0 = 0.0f;
                f14.Z0 = false;
                f14.a1 = false;
                f14.b1 = false;
                f14.c1 = false;
                f14.d1 = true;
                f14.n(f14.y0);
                photoBackgroundDrawable.setAlpha(0);
                f14.e.setAlpha(1.0f);
                f14.e.setVisibility(0);
                f14.n.setAlpha(1.0f);
                f14.J = false;
                f14.H = false;
                f14.I = false;
                f14.M = true;
                imageReceiver2.setManualAlphaAnimator(false);
                f14.O = 0;
                f14.P = 0;
                RectF rectF = new RectF(E.a.getDrawRegion());
                rectF.left = Math.max(rectF.left, E.a.getImageX());
                rectF.top = Math.max(rectF.top, E.a.getImageY());
                rectF.right = Math.min(rectF.right, E.a.getImageX2());
                rectF.bottom = Math.min(rectF.bottom, E.a.getImageY2());
                float width = rectF.width();
                float height = rectF.height();
                Point point = AndroidUtilities.displaySize;
                f14.y0 = Math.max(width / point.x, height / (point.y + AndroidUtilities.statusBarHeight));
                int[] iArr = E.h;
                if (iArr != null) {
                    f14.H0 = new int[iArr.length];
                    int i19 = 0;
                    while (true) {
                        int[] iArr2 = E.h;
                        i11 = i14;
                        if (i19 >= iArr2.length) {
                            break;
                        }
                        f14.H0[i19] = iArr2[i19];
                        i19++;
                        i14 = i11;
                    }
                } else {
                    i11 = 1;
                    f14.H0 = null;
                }
                float f15 = E.b;
                float f16 = rectF.left;
                f14.w0 = ((width / 2.0f) + (f15 + f16)) - (r9 / 2);
                f14.x0 = ((height / 2.0f) + (E.c + rectF.top)) - (r7 / 2);
                f14.v0 = Math.abs(f16 - E.a.getImageX());
                int abs = (int) Math.abs(rectF.top - E.a.getImageY());
                E.d.getLocationInWindow(new int[2]);
                float f17 = (r2[i11] - (E.c + rectF.top)) + E.j;
                f14.r0 = f17;
                float f18 = abs;
                f14.r0 = Math.max(0.0f, Math.max(f17, f18));
                float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r2[i11])) + E.i;
                f14.s0 = height2;
                f14.s0 = Math.max(0.0f, Math.max(height2, f18));
                f14.t0 = 0.0f;
                f14.t0 = Math.max(0.0f, Math.max(0.0f, f18));
                f14.u0 = 0.0f;
                f14.u0 = Math.max(0.0f, Math.max(0.0f, f18));
                f14.J0 = System.currentTimeMillis();
                f14.z0 = 0.0f;
                f14.A0 = 0.0f;
                f14.D0 = 0.0f;
                f14.F0 = 0.0f;
                f14.G0 = 0.0f;
                f14.C0 = 0.0f;
                f14.E0 = 0.0f;
                f14.B0 = 1.0f;
                boolean z13 = i11;
                f14.I0 = z13;
                f14.e1 = z13;
                mb0 mb0Var = f14.l1;
                if (mb0Var != null) {
                    mb0Var.destroy();
                    f14.l1 = null;
                }
                LaunchActivity launchActivity = LaunchActivity.G1;
                f14.l1 = launchActivity != null ? new mb0(launchActivity, z13) : null;
                NotificationCenter.getInstance(f14.a).addObserver(f14, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(f14.a).addObserver(f14, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(f14.a).addObserver(f14, NotificationCenter.didCreatedNewDeleteTask);
                f14.v = MessageObject.getPeerId(messageObject4.messageOwner.peer_id);
                f14.h0 = messageObject4;
                TLRPC.Document document = messageObject4.getDocument();
                ImageReceiver.BitmapHolder bitmapHolder = f14.i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    f14.i0 = null;
                }
                f14.i0 = E.a.getThumbBitmapSafe();
                f14.U.setVisibility(8);
                if (document != null) {
                    int i20 = 0;
                    while (true) {
                        if (i20 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i20);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                            f14.O = tL_documentAttributeVideo.w;
                            f14.P = tL_documentAttributeVideo.h;
                            break;
                        }
                        i20++;
                    }
                    if (MessageObject.isGifDocument(document)) {
                        f14.F.setTitle(LocaleController.getString(R.string.DisappearingGif));
                        String str2 = messageObject4.messageOwner.attachPath;
                        ImageLocation forDocument = (str2 == null || !messageObject4.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str2);
                        if (f14.i0 != null) {
                            f11 = 1.0f;
                            bitmapDrawable = new BitmapDrawable(f14.i0.bitmap);
                        } else {
                            f11 = 1.0f;
                            bitmapDrawable = null;
                        }
                        f12 = 0.0f;
                        jv0Var = E;
                        c10 = 4;
                        c11 = 6;
                        messageObject3 = messageObject4;
                        imageReceiver2.setImage(forDocument, (String) null, bitmapDrawable, -1L, (String) null, messageObject3, 1);
                    } else {
                        jv0Var = E;
                        f11 = 1.0f;
                        f12 = 0.0f;
                        c10 = 4;
                        c11 = 6;
                        f14.b0 = 1;
                        f14.F.setTitle(LocaleController.getString(R.string.DisappearingVideo));
                        File file2 = new File(messageObject4.messageOwner.attachPath);
                        if (file2.exists()) {
                            f14.h(file2);
                        } else {
                            File pathToMessage = FileLoader.getInstance(f14.a).getPathToMessage(messageObject4.messageOwner);
                            File file3 = new File(pathToMessage.getAbsolutePath() + ".enc");
                            if (file3.exists()) {
                                pathToMessage = file3;
                            }
                            f14.h(pathToMessage);
                        }
                        f14.J = true;
                        f14.U.setVisibility(0);
                        messageObject3 = messageObject4;
                        imageReceiver2.setImage((ImageLocation) null, (String) null, f14.i0 != null ? new BitmapDrawable(f14.i0.bitmap) : null, -1L, (String) null, messageObject3, 2);
                    }
                    messageObject2 = messageObject3;
                } else {
                    jv0Var = E;
                    f11 = 1.0f;
                    f12 = 0.0f;
                    c10 = 4;
                    c11 = 6;
                    f14.F.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject4.photoThumbs, AndroidUtilities.getPhotoSize());
                    imageReceiver2.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject4.photoThumbsObject), (String) null, f14.i0 != null ? new BitmapDrawable(f14.i0.bitmap) : null, -1L, (String) null, messageObject4, 2);
                    messageObject2 = messageObject4;
                    if (closestPhotoSizeWithSize != null) {
                        f14.O = closestPhotoSizeWithSize.w;
                        f14.P = closestPhotoSizeWithSize.h;
                    }
                }
                f14.j(messageObject2, "", false);
                f14.j(messageObject2, messageObject2.caption, true);
                f14.m(true, false);
                f14.k(false, false);
                f14.W.a(true, true);
                if (f14.q1) {
                    k51 k51Var2 = f14.n;
                    k51Var2.e = true;
                    TextPaint textPaint = k51Var2.r;
                    textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                    textPaint.setColor(-1);
                    StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    k51Var2.s = staticLayout;
                    k51Var2.v = staticLayout.getLineCount() > 0 ? k51Var2.s.getLineWidth(0) : f12;
                    k51Var2.w = k51Var2.s.getHeight();
                    k51Var2.invalidate();
                    f14.n.setOnClickListener(new v41(f14, 2));
                } else {
                    f14.n.setOnClickListener(null);
                }
                try {
                    if (f14.d.getParent() != null) {
                        ((WindowManager) f14.b.getSystemService("window")).removeView(f14.d);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                ((WindowManager) f14.b.getSystemService("window")).addView(f14.d, f14.c);
                f14.n.invalidate();
                f14.s = true;
                Window window = f14.b.getWindow();
                f14.o1 = AndroidUtilities.getLightNavigationBar(window);
                AndroidUtilities.setLightNavigationBar(f14.b, false);
                AndroidUtilities.setLightNavigationBar((View) f14.d, false);
                Activity activity = f14.b;
                if (activity instanceof LaunchActivity) {
                    f14.n1 = Build.VERSION.SDK_INT >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
                    ((LaunchActivity) f14.b).y(-16777216);
                } else {
                    f14.n1 = window.getNavigationBarColor();
                    AndroidUtilities.setNavigationBarColor(f14.b, -16777216);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                f14.K0 = animatorSet;
                org.telegram.ui.Components.b8 b8Var2 = f14.F;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b8Var2, (Property<org.telegram.ui.Components.b8, Float>) property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f14.a0, (Property<hu0, Float>) property, 0.0f, 1.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f14.r, (Property<di.d4, Float>) property, 0.0f, 1.0f);
                ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.v6.d, 0, 255);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f14, f14.v1, 0.0f, 1.0f);
                l51 l51Var = f14.U;
                char c12 = c10;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l51Var, l51Var.n, f11);
                l51 l51Var2 = f14.U;
                if (f14.J) {
                    f12 = f11;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(l51Var2, (Property<l51, Float>) property, f12);
                Animator[] animatorArr = new Animator[7];
                animatorArr[0] = ofFloat;
                animatorArr[1] = ofFloat2;
                animatorArr[2] = ofFloat3;
                animatorArr[3] = ofInt;
                animatorArr[c12] = ofFloat4;
                animatorArr[5] = ofFloat5;
                animatorArr[c11] = ofFloat6;
                animatorSet.playTogether(animatorArr);
                f14.m0 = 3;
                f14.o0 = new tf0(f14, jb2, messageObject2, 26);
                f14.K0.setDuration(250L);
                f14.K0.addListener(new i51(f14, 0));
                f14.n0 = System.currentTimeMillis();
                if (SharedConfig.getDevicePerformanceClass() == 0) {
                    f14.e.setLayerType(2, null);
                }
                f14.K0.setInterpolator(new DecelerateInterpolator());
                photoBackgroundDrawable.b = 0;
                photoBackgroundDrawable.a = new i11(11, f14, jv0Var);
                f14.K0.start();
            }
        } else {
            if (MessageObject.isAnimatedEmoji(messageObject4.getDocument()) && MessageObject.getInputStickerSet(messageObject4.getDocument()) != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(MessageObject.getInputStickerSet(messageObject4.getDocument()));
                org.telegram.ui.Components.ew ewVar = new org.telegram.ui.Components.ew(foVar, foVar.getParentActivity(), foVar.ea, arrayList);
                ewVar.setCalcMandatoryInsets(foVar.C9());
                foVar.showDialog(ewVar);
                return;
            }
            if (messageObject4.getInputStickerSet() != null) {
                org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0(foVar.getParentActivity(), foVar, messageObject4.getInputStickerSet(), null, (foVar.O0.getVisibility() == 0 || !((chat = foVar.e) == null || ChatObject.canSendStickers(chat))) ? null : foVar.Y, foVar.ea);
                uy0Var.setCalcMandatoryInsets(foVar.C9());
                foVar.showDialog(uy0Var);
                return;
            }
            if (messageObject4.isVideo() || (i10 = messageObject4.type) == 1 || ((i10 == 0 && !messageObject4.isWebpageDocument()) || messageObject4.isGif())) {
                if (messageObject4.isSponsored()) {
                    if (messageObject4.isGif() || messageObject4.isPhoto()) {
                        int i21 = 1;
                        foVar.O9(messageObject4, true, false);
                        if (messageObject4.sponsoredUrl != null) {
                            pf.c cVar2 = foVar.Ab;
                            if (cVar2 != null) {
                                cVar2.a(true);
                            }
                            foVar.Ab = u1Var.getMessageObject() == null ? null : new jn(this, u1Var, i21);
                            pf.d.q(foVar.getParentActivity(), Uri.parse(messageObject4.sponsoredUrl), true, false, false, foVar.Ab, null, false, foVar.getMessagesController().sponsoredLinksInappAllow, false);
                            return;
                        }
                    } else if (messageObject4.isVideo()) {
                        foVar.O9(messageObject4, true, false);
                    }
                }
                if (messageObject4.getDuration() > 0.0d && messageObject4.getVideoStartsTimestamp() > 0 && !messageObject4.openedInViewer) {
                    messageObject4.forceSeekTo = (float) (messageObject4.getVideoStartsTimestamp() / messageObject4.getDuration());
                }
                foVar.ma(u1Var, messageObject4);
                return;
            }
            int i22 = messageObject4.type;
            if (i22 == 3) {
                foVar.jb(messageObject4, true);
                try {
                    String str3 = messageObject4.messageOwner.attachPath;
                    File file4 = (str3 == null || str3.length() == 0) ? null : new File(messageObject4.messageOwner.attachPath);
                    if (file4 == null || !file4.exists()) {
                        file4 = foVar.getFileLoader().getPathToMessage(messageObject4.messageOwner);
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.setFlags(1);
                        intent.setDataAndType(FileProvider.d(foVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                    } else {
                        intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                    }
                    foVar.getParentActivity().startActivityForResult(intent, 500);
                } catch (Exception e7) {
                    FileLog.e(e7);
                    foVar.C6(messageObject4);
                }
            } else if (i22 == 4) {
                if (AndroidUtilities.isMapsInstalled(foVar)) {
                    if (!messageObject4.isLiveLocation()) {
                        ld0 ld0Var = new ld0(foVar.h == null ? 3 : 0);
                        ld0Var.F0 = foVar;
                        ld0Var.t0(messageObject4);
                        foVar.presentFragment(ld0Var);
                        return;
                    }
                    TLRPC.Chat chat2 = foVar.e;
                    ld0 ld0Var2 = new ld0((chat2 == null || ChatObject.canSendMessages(chat2) || foVar.e.megagroup) ? 2 : 6);
                    ld0Var2.F0 = foVar;
                    ld0Var2.t0(messageObject4);
                    foVar.presentFragment(ld0Var2);
                }
            } else if (i22 == 9 || i22 == 0) {
                if (messageObject4.getDocumentName().toLowerCase().endsWith("attheme")) {
                    String str4 = messageObject4.messageOwner.attachPath;
                    if (str4 != null && str4.length() != 0) {
                        file = new File(messageObject4.messageOwner.attachPath);
                    }
                    file = null;
                    if (file == null) {
                        File pathToMessage2 = foVar.getFileLoader().getPathToMessage(messageObject4.messageOwner);
                        if (pathToMessage2.exists()) {
                            file = pathToMessage2;
                        }
                    }
                    org.telegram.ui.ActionBar.f6 u10 = org.telegram.ui.ActionBar.g6.u(file, messageObject4.getDocumentName(), null, true);
                    if (u10 != null) {
                        foVar.presentFragment(new ce1(u10));
                        return;
                    }
                    foVar.x4 = -1;
                }
                if (messageObject4.canPreviewDocument()) {
                    PhotoViewer.t1().K2(null, foVar, foVar.ea);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i23 = messageObject4.type;
                    t12.d2(messageObject4, foVar, i23 != 0 ? foVar.T5 : 0L, i23 != 0 ? foVar.L6 : 0L, i23 != 0 ? foVar.d() : 0L, foVar.Ga);
                    messageObject = messageObject4;
                    z11 = true;
                } else {
                    messageObject = messageObject4;
                    z11 = false;
                }
                Pattern pattern = org.telegram.ui.Components.ra0.a;
                String extension = messageObject.getExtension();
                if (!"md".equalsIgnoreCase(extension) && !"mkd".equalsIgnoreCase(extension) && !"mdwn".equalsIgnoreCase(extension) && !"mkdn".equalsIgnoreCase(extension) && !"mdown".equalsIgnoreCase(extension) && !"markdown".equalsIgnoreCase(extension)) {
                    String mimeType = messageObject.getMimeType();
                    if (mimeType != null) {
                        String lowerCase = mimeType.toLowerCase();
                        if (!lowerCase.startsWith("text/markdown")) {
                            if (!lowerCase.startsWith("text/x-markdown")) {
                            }
                        }
                    }
                    z12 = z11;
                    if (!z12) {
                        try {
                            AndroidUtilities.openForView(messageObject, foVar.getParentActivity(), foVar.ea, false);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            foVar.C6(messageObject);
                        }
                    }
                }
                if (foVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(foVar.getParentActivity(), 3, foVar.ea);
                    a2Var.setCanceledOnTouchOutside(false);
                    boolean[] zArr = {false};
                    a2Var.setOnCancelListener(new jh(0, zArr));
                    a2Var.q(150L);
                    new Thread(new p6(foVar, messageObject, a2Var, zArr)).start();
                }
                z12 = true;
                if (!z12) {
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean w1() {
        fo foVar = this.a;
        return foVar.X0.getMeasuredWidth() > foVar.X0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final String x(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        fo foVar = this.a;
        if (UserObject.isBotForum(foVar.f)) {
            return null;
        }
        TLRPC.Chat chat = foVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = foVar.getMessagesController().getAdminRank(foVar.e.id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = foVar.c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j10 || peer.channel_id == j10 || peer.chat_id == j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean x0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void x1(org.telegram.ui.Cells.u1 u1Var) {
        fo.U4(this.a, u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y0(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar = this.a.Cc;
        if (cVar == null || cVar.n != u1Var) {
            return;
        }
        cVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        h(u1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z0() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.f6 animation;
        fo foVar = this.a;
        if (foVar.l3 || SharedConfig.noSoundHintShowed || foVar.x0 == null || foVar.getParentActivity() == null || foVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.v40 v40Var = foVar.t2;
        if (v40Var == null || v40Var.getTag() == null) {
            if (foVar.t2 == null) {
                xm xmVar = foVar.X0;
                int indexOfChild = xmVar.indexOfChild(foVar.S);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.v40 v40Var2 = new org.telegram.ui.Components.v40(0, foVar.getParentActivity(), foVar.ea, false);
                foVar.t2 = v40Var2;
                v40Var2.setShowingDuration(10000L);
                xmVar.addView(foVar.t2, indexOfChild + 1, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                foVar.t2.setAlpha(0.0f);
                foVar.t2.setVisibility(4);
            }
            int childCount = foVar.x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = foVar.x0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = u1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && foVar.t2.e(u1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }
}
