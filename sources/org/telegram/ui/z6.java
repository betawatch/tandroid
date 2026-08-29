package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements org.telegram.ui.Components.cl0, org.telegram.ui.Components.nj0, org.telegram.ui.Components.b5, LanguageDetector.StringCallback, v4, org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, org.telegram.ui.Components.al0, MessagesController.NewMessageCallback, yx, pf1, org.telegram.ui.Components.voip.k3, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z6(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 2:
                tn tnVar = (tn) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l10 = (Long) this.d;
                tnVar.getClass();
                tnVar.cb(botInlineResult, z10, i10, l10.longValue());
                break;
            case 3:
            default:
                tn tnVar2 = (tn) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                tnVar2.getClass();
                if (z10) {
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(kf.a.l(suggestedPost != null ? suggestedPost.price : null), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        tnVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        break;
                    }
                }
                break;
            case 4:
                tn.a0((tn) this.b, (MessageObject.GroupedMessages) this.c, (MessageObject) this.d, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean J(fy fyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nj0
    public void a(org.telegram.ui.Components.pj0 pj0Var, int i10) {
        int i11;
        View view = (View) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(pj0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.x3.C(52.0f, i11, i10), true);
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        r50.n((r50) this.b, (Activity) this.c, (ChatObject.Call) this.d, view, i10);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.v4
    public void c(d5 d5Var) {
        switch (this.a) {
            case 6:
                fn fnVar = (fn) this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = d5Var.ordinal();
                if (ordinal == 0) {
                    fnVar.v(user, false);
                    break;
                } else if (ordinal == 3) {
                    fnVar.q(s1Var, user);
                    break;
                } else if (ordinal == 4) {
                    fnVar.d(user);
                    break;
                } else if (ordinal == 5) {
                    fnVar.a.ma(user);
                    break;
                }
                break;
            default:
                fn fnVar2 = (fn) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.d;
                int ordinal2 = d5Var.ordinal();
                if (ordinal2 == 0) {
                    fnVar2.r(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        fnVar2.b(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        fnVar2.a.ka(chat);
                        break;
                    }
                } else {
                    fnVar2.m(s1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.k3
    public void d(org.telegram.ui.Components.voip.l3 l3Var) {
        oh1 oh1Var = (oh1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.m3 m3Var = (org.telegram.ui.Components.voip.m3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(oh1Var.O0);
            oh1Var.N0 = false;
            if (oh1Var.s0.isTouchExplorationEnabled()) {
                l3Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack) : LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront));
            }
            m3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        String str;
        int i11;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 8:
                vo voVar = (vo) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                yo yoVar = voVar.a.W2;
                if (tL_username.editable) {
                    if (yoVar.o0 == null) {
                        yoVar.o0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = yoVar.T;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    yoVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new nh.q1(voVar, tL_channels_toggleUsername, tL_username, z10, 3));
                    yoVar.L.add(tL_username.username);
                    ((ia) view).setLoading(true);
                }
                yoVar.V();
                break;
            case 9:
                kp kpVar = (kp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                kpVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    kpVar.getMessagesController().toggleChannelInvitesHistory(chat2.id, false);
                }
                kpVar.Y(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                ya1 ya1Var = (ya1) obj3;
                if (org.telegram.ui.ActionBar.g6.j0(((ab1) obj2).d, (org.telegram.ui.ActionBar.e6) obj, true)) {
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, org.telegram.ui.ActionBar.g6.I, Boolean.valueOf(ya1Var.e.f == 1), null, -1);
                    break;
                }
                break;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                EditText editText = (EditText) obj;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.n0(user, false, str);
                break;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                SharedConfig.storageCacheDir = (String) obj2;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.n0(dataSettingsActivity.n);
                ImageLoader.getInstance().checkMediaPaths(new zt(dataSettingsActivity, i13));
                ((AlertDialog$Builder) obj).a.H0.run();
                break;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).a.H0.run();
                nz nzVar = ((lz) obj3).A.c;
                nzVar.d.title = editTextBoldCursor.getText().toString();
                nzVar.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = nzVar.d;
                if (nzVar.B != 0) {
                    nzVar.getConnectionsManager().cancelRequest(nzVar.B, true);
                    nzVar.B = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = nzVar.c.id;
                tL_chatlists_editExportedInvite.slug = nzVar.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                nzVar.B = nzVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new cz(nzVar, i14));
                Utilities.Callback callback = nzVar.y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((u40) obj3).b.W0.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).a.H0.run();
                break;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                break;
            case 21:
                k71 k71Var = (k71) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.o2) k71Var.a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new u80(23, k71Var, tL_authorization));
                ((y61) obj3).d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.pf1
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((n61) this.b).T((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // org.telegram.messenger.MessagesController.NewMessageCallback
    public boolean onMessageReceived(TLRPC.Message message) {
        bo0 bo0Var = (bo0) this.b;
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) != bo0Var.h0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new n20(bo0Var, b5Var, activity, message, 19));
        return true;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a5.j jVar = (a5.j) this.b;
        nh.d dVar = (nh.d) this.c;
        int[] iArr = (int[]) this.d;
        FileLog.d("wear-auth: /answer delivered to " + ((String) jVar.c));
        int i10 = 0;
        dVar.setLoading(false);
        int i11 = iArr[0];
        ArrayList arrayList = (ArrayList) jVar.e;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.c6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.f3 f3Var = ei1.c;
        if (f3Var != null) {
            f3Var.dismiss();
            ei1.c = null;
        }
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, resourceProvider, false, false);
        FrameLayout frameLayout = new FrameLayout(context);
        q6.customView = frameLayout;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        frameLayout.addView(g10, i7.f6.e(-1, -1, 119));
        TextView b10 = i7.j6.b(context, 20.0f, org.telegram.ui.ActionBar.g6.j5, true, resourceProvider);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
        g10.addView(b10, i7.f6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i10 < arrayList.size()) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i10));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(emojiBigDrawable);
            NotificationCenter.listenEmojiLoading(imageView);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, resourceProvider))));
            linearLayout.addView(imageView, i7.f6.k(i10 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i10++;
        }
        g10.addView(linearLayout, i7.f6.t(-2, -2, 49, 32, 12, 32, 12));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, resourceProvider, true);
        o10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
        g10.addView(o10, i7.f6.t(-1, 48, 7, 12, 12, 12, 8));
        int i12 = org.telegram.ui.ActionBar.g6.a7;
        q6.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
        q6.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
        ei1.c = q6;
        q6.show();
        o10.setOnClickListener(new bg.p2(o10, i11, q6, 20));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        dq.a0((dq) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.yx
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        long j10;
        int i12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                tn tnVar = (tn) obj;
                PhotoViewer photoViewer = ((or0) obj3).b;
                if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == UserConfig.getInstance(photoViewer.P).getClientUserId() || charSequence != null) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long j11 = ((MessagesStorage.TopicKey) arrayList.get(i14)).dialogId;
                        if (charSequence != null) {
                            j10 = j11;
                            SendMessagesHelper.getInstance(photoViewer.P).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j11;
                        }
                        SendMessagesHelper.getInstance(photoViewer.P).sendMessage(arrayList2, j10, false, false, true, 0, 0L);
                    }
                    fyVar.finishFragment();
                    if (tnVar != null) {
                        tnVar.Q7();
                        UndoView undoView = tnVar.u3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, Integer.valueOf(arrayList2.size()), 53);
                                break;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                                break;
                            }
                        }
                    }
                } else {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j12 = topicKey.dialogId;
                    Bundle i15 = a4.w.i("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j12)) {
                        i15.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
                    } else if (DialogObject.isUserDialog(j12)) {
                        i15.putLong("user_id", j12);
                    } else {
                        i15.putLong("chat_id", -j12);
                    }
                    tn tnVar2 = new tn(i15);
                    if (topicKey.topicId != 0) {
                        yf.d.a(tnVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.y).q0(tnVar2, true, false)) {
                        tnVar2.Ab(arrayList2);
                        break;
                    } else {
                        fyVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                dz0 dz0Var = (dz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                fy fyVar2 = (fy) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = dz0Var.b;
                i12 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.N = string;
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new b9.d(dz0Var, j13, fyVar, user));
                    profileActivity.showDialog(c2Var);
                    break;
                } else {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new d9.a(dz0Var, j13, fyVar2, 10));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean b(float f9, float f10, int i10, final View view) {
        final c7 c7Var = (c7) this.b;
        org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) this.c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        q7 q7Var = c7Var.d;
        d7 d7Var = (d7) jl0Var.getAdapter();
        final k7 k7Var = (k7) d7Var.e.get(i10);
        if (!(view instanceof i7) && !(view instanceof org.telegram.ui.Cells.p7)) {
            g7 g7Var = q7Var.v;
            if (g7Var != null) {
                g7Var.O0(k7Var.c, k7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(q7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new lh.b0(c7Var, k7Var, d7Var, jl0Var, view, 4));
        } else if (((i7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.f7) {
            final int i11 = 0;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            c7 c7Var2 = c7Var;
                            q7.b(c7Var2.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = c7Var2.a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            c7 c7Var3 = c7Var;
                            q7.b(c7Var3.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = c7Var3.a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            final int i12 = 1;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            c7 c7Var2 = c7Var;
                            q7.b(c7Var2.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = c7Var2.a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            c7 c7Var3 = c7Var;
                            q7.b(c7Var3.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = c7Var3.a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        kh.a aVar = k7Var.d;
        if (aVar.b != 0 && aVar.g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new c0(c7Var, k7Var, o2Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!q7Var.f.j.contains(k7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new nh.r7(14, c7Var, k7Var));
        c7Var.a = org.telegram.ui.Components.c5.Q(o2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f9, (int) f10);
        q7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        tn tnVar = (tn) this.b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str == null || ((str.equals(language) && !str.equals(TranslateController.UNKNOWN_LANGUAGE)) || b31.Y().contains(str))) {
            h0Var.setClickable(false);
        } else {
            h0Var.setOnClickListener(new lh.b0(tnVar, str, language, charSequence, h0Var, 6));
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void r(float f9) {
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
