package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$-CC;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class wb extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static int Q0 = 10;
    public static final int[] R0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public boolean A0;
    public final ib B0;
    public mb C0;
    public final ArrayList D0;
    public sb E;
    public final a0.i E0;
    public TextView F;
    public gb F0;
    public jh.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.eo I;
    public za I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.t1 J0;
    public ImageView K;
    public int K0;
    public ai.p4 L;
    public final vb L0;
    public org.telegram.ui.Cells.w0 M;
    public long M0;
    public org.telegram.ui.ActionBar.w0 N;
    public int N0;
    public long O;
    public int O0;
    public boolean P;
    public final RectF P0;
    public boolean Q;
    public AnimatorSet R;
    public boolean S;
    public final int[] T;
    public boolean U;
    public boolean V;
    public jh.f W;
    public tb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final fh.e a;
    public FrameLayout a0;
    public final ah.c b;
    public ImageView b0;
    public final ah.c c;
    public org.telegram.ui.ActionBar.k5 c0;
    public final ah.i d;
    public j0 d0;
    public final int e;
    public k4 e0;
    public final TLRPC.Chat f;
    public TextureView f0;
    public int g0;
    public final ArrayList h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public final a0.i k0;
    public final a0.i l0;
    public final HashMap m0;
    public FrameLayout n;
    public final ArrayList n0;
    public final ArrayList o0;
    public final HashSet p0;
    public boolean q0;
    public View r;
    public boolean r0;
    public RadialProgressView s;
    public boolean s0;
    public ArrayList t0;
    public TLRPC.TL_channelAdminLogEventsFilter u0;
    public lb v;
    public String v0;
    public UndoView w;
    public a0.i w0;
    public gg.b0 x;
    public final AnimationNotificationsLocker x0;
    public org.telegram.ui.Components.pk0 y;
    public final HashMap y0;
    public HashMap z0;

    public wb(TLRPC.Chat chat) {
        super(null);
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = true;
        this.j0 = false;
        this.k0 = new a0.i();
        this.l0 = new a0.i();
        this.m0 = new HashMap();
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.p0 = new HashSet();
        this.u0 = null;
        this.v0 = "";
        this.x0 = new AnimationNotificationsLocker(R0);
        this.y0 = new HashMap();
        this.B0 = new ib(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.i();
        this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.H0 = -1;
        this.L0 = new vb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        ki.i iVar = this.glassEngine;
        iVar.a = new ab(this);
        iVar.d = new li.b(AndroidUtilities.dp(48.0f));
        fh.e eVar = new fh.e();
        this.a = eVar;
        ah.c cVar = new ah.c(eVar);
        this.b = cVar;
        cVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.d = null;
            this.e = 0;
            ah.c cVar2 = new ah.c(eVar);
            this.c = cVar2;
            cVar2.h = this.glassEngine;
        } else {
            ah.i iVar2 = new ah.i(false);
            this.d = iVar2;
            this.glassEngine.i.add(iVar2);
            fh.d dVar = new fh.d(eVar);
            dVar.d = iVar2;
            dVar.e = -3;
            dVar.f = eVar;
            if (LiteMode.isEnabled(262144)) {
                fh.d dVar2 = new fh.d(eVar);
                dVar2.d = iVar2;
                dVar2.e = -2;
                dVar2.f = eVar;
                ah.c cVar3 = new ah.c(dVar2);
                this.c = cVar3;
                cVar3.h = this.glassEngine;
                int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
                cVar3.b = dp;
                cVar3.c = dp;
                cVar3.i = LiteMode.isEnabled(262144);
                this.e = 0;
            } else {
                ah.c cVar4 = new ah.c(dVar);
                this.c = cVar4;
                cVar4.h = this.glassEngine;
                int dp2 = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
                cVar4.b = dp2;
                cVar4.c = dp2;
                this.e = AndroidUtilities.dp(48.0f);
            }
        }
        this.f = chat;
    }

    public static void A0(wb wbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = wbVar.getMessagesController();
        TLRPC.Chat chat = wbVar.f;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.id);
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(wbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, wbVar, chatFull.id, false, ChatObject.isChannel(chat));
        r60Var.j0 = new jb(wbVar);
        r60Var.show();
    }

    public static void K0(wb wbVar) {
        if (wbVar.v == null || wbVar.n0.isEmpty()) {
            return;
        }
        wbVar.x.h1(wbVar.o0.size() - 1, (-100000) - wbVar.v.getPaddingTop());
    }

    public static m11 S0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.oq oqVar : (org.telegram.ui.Components.oq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.oq.class)) {
            if (oqVar != null) {
                Drawable drawable = oqVar.drawable;
                if (drawable instanceof m11) {
                    return (m11) drawable;
                }
            }
        }
        return null;
    }

    public static void U(wb wbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.i iVar = wbVar.k0;
        int i10 = 0;
        wbVar.C0.N = false;
        wbVar.W0(false);
        MessagesController.getInstance(wbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(wbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = wbVar.n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (iVar.h(tL_channelAdminLogEvent.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                wbVar.O = Math.min(wbVar.O, tL_channelAdminLogEvent.id);
                MessageObject messageObject2 = new MessageObject(wbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f, wbVar.T, false);
                if (messageObject2.contentType >= 0) {
                    iVar.k(messageObject2, tL_channelAdminLogEvent.id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                wbVar.l0.k(messageObject3, messageObject3.getRealId());
            }
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            messageObject = null;
                            break;
                        }
                        if (size != i12) {
                            messageObject = (MessageObject) arrayList.get(i12);
                            if (messageObject.contentType != 1 && messageObject.getRealId() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i12++;
                    }
                    if (messageObject != null) {
                        messageObject3.replyMessageObject = messageObject;
                    }
                }
                arrayList2.add(messageObject3);
            }
        }
        if (!arrayList2.isEmpty()) {
            MediaDataController.getInstance(wbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -wbVar.f.id, 0, 0L, new za(wbVar, 1), wbVar.getClassGuid(), null);
        }
        wbVar.R0();
        wbVar.r0 = false;
        if (!z10) {
            wbVar.q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(wbVar.n, false, 0.3f, true);
        wbVar.v.setEmptyView(wbVar.H);
        sb sbVar = wbVar.E;
        if (sbVar != null) {
            sbVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = wbVar.N;
        if (w0Var != null) {
            if (wbVar.o0.isEmpty() && TextUtils.isEmpty(wbVar.v0)) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
        }
    }

    public static void V(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || wbVar.getParentActivity() == null) {
            return;
        }
        int i10 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, wbVar.getParentActivity(), wbVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        Rect rect = new Rect();
        wbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(wbVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            if (arrayList4.get(i11) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(wbVar.getParentActivity(), wbVar.getResourceProvider()), w7.x5.n(-1, 8));
            } else {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, wbVar.getParentActivity(), wbVar.getResourceProvider(), i11 == 0, i11 == size + (-1));
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                    g1Var.c(wbVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7), wbVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                }
                Integer num = (Integer) arrayList4.get(i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                g1Var.setOnClickListener(new ai.s7(wbVar, i11, arrayList4, num, 1));
            }
            i11++;
            arrayList4 = arrayList;
        }
        fb fbVar = new fb(0, wbVar.X.getContext(), wbVar);
        fbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        fbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        gb gbVar = new gb(wbVar, fbVar);
        wbVar.F0 = gbVar;
        gbVar.e = true;
        gbVar.c = 220;
        gbVar.setOutsideTouchable(true);
        wbVar.F0.setClippingEnabled(true);
        wbVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
        wbVar.F0.setFocusable(true);
        fbVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        wbVar.F0.setInputMethodMode(2);
        wbVar.F0.setSoftInputMode(48);
        wbVar.F0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f7)) - fbVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
        if (left < AndroidUtilities.dp(6.0f)) {
            left = AndroidUtilities.dp(6.0f);
        } else if (left > (wbVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - fbVar.getMeasuredWidth()) {
            left = (wbVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - fbVar.getMeasuredWidth();
        }
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            wbVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = wbVar.X.getHeight();
        int dp = AndroidUtilities.dp(48.0f) + fbVar.getMeasuredHeight();
        int R = wbVar.X.R();
        if (R > AndroidUtilities.dp(20.0f)) {
            height += R;
        }
        if (dp < height) {
            int y3 = (int) (wbVar.v.getY() + view.getTop() + f10);
            i10 = (dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f) ? (AndroidUtilities.dp(240.0f) - dp) + y3 : y3;
            if (i10 < wbVar.v.getY() + AndroidUtilities.dp(24.0f)) {
                i10 = (int) (wbVar.v.getY() + AndroidUtilities.dp(24.0f));
            } else {
                int i12 = height - dp;
                if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                    i10 = i12 - AndroidUtilities.dp(8.0f);
                }
            }
        } else if (!wbVar.inBubbleMode) {
            i10 = AndroidUtilities.statusBarHeight;
        }
        fbVar.setMaxHeight(height - i10);
        wbVar.F0.showAtLocation(wbVar.v, 51, left, i10);
        wbVar.F0.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x036a, code lost:
    
        if (r0.exists() != false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(wb wbVar, int i10, ArrayList arrayList, Integer num) {
        TLRPC.Chat chat;
        File file;
        TLRPC.User user;
        if (wbVar.Y == null || i10 >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        TLRPC.Chat chat2 = wbVar.f;
        gb gbVar = wbVar.F0;
        if (gbVar != null) {
            gbVar.dismiss();
        }
        MessageObject messageObject = wbVar.Y;
        if (messageObject == null) {
            return;
        }
        if (intValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long fromChatId = messageObject.getFromChatId();
            if (0 != fromChatId) {
                if (fromChatId > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(wbVar.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user2 != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user2.first_name, user2.last_name)).append((CharSequence) ":\n");
                    }
                } else if (fromChatId < 0 && (chat = MessagesController.getInstance(wbVar.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(messageObject.messageText)) {
                spannableStringBuilder.append((CharSequence) messageObject.messageOwner.message);
            } else {
                spannableStringBuilder.append(messageObject.messageText);
            }
            AndroidUtilities.addToClipboard(spannableStringBuilder);
            org.telegram.messenger.wl.o(R.string.MessageCopied, org.telegram.ui.Components.vc.a0(wbVar));
        } else if (intValue == 4) {
            String str = messageObject.messageOwner.attachPath;
            if (str != null && str.length() > 0 && !w.f.o(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                str = wbVar.getFileLoader().getPathToMessage(wbVar.Y.messageOwner).toString();
            }
            int i11 = wbVar.Y.type;
            if (i11 == 3 || i11 == 1) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23 && ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && wbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                    wbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    wbVar.Y = null;
                    wbVar.Z = null;
                    return;
                }
                MediaController.saveFile(str, wbVar.getParentActivity(), wbVar.Y.type == 3 ? 1 : 0, null, null);
            }
        } else if (intValue == 5) {
            String str2 = messageObject.messageOwner.attachPath;
            if (str2 != null && str2.length() != 0) {
                file = new File(wbVar.Y.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage = wbVar.getFileLoader().getPathToMessage(wbVar.Y.messageOwner);
                if (pathToMessage.exists()) {
                    file = pathToMessage;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    gg.b0 b0Var = wbVar.x;
                    if (b0Var != null) {
                        if (b0Var.N0() < wbVar.x.B() - 1) {
                            int L0 = wbVar.x.L0();
                            wbVar.g0 = L0;
                            org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) wbVar.v.L(L0);
                            if (wk0Var != null) {
                                wbVar.h0 = wk0Var.a.getTop();
                            } else {
                                wbVar.g0 = -1;
                            }
                        } else {
                            wbVar.g0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, wbVar.Y.getDocumentName(), null, true);
                    if (u10 != null) {
                        wbVar.presentFragment(new xd1(u10));
                    } else {
                        wbVar.g0 = -1;
                        if (wbVar.getParentActivity() == null) {
                            wbVar.Y = null;
                            wbVar.Z = null;
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.getParentActivity());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.IncorrectTheme);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            wbVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                } else if (LocaleController.getInstance().applyLanguageFile(file, wbVar.currentAccount)) {
                    wbVar.presentFragment(new LanguageSelectActivity());
                } else if (wbVar.getParentActivity() == null) {
                    wbVar.Y = null;
                    wbVar.Z = null;
                    return;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wbVar.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.IncorrectLocalization);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    wbVar.showDialog(alertDialog$Builder2.a);
                }
            }
        } else if (intValue == 6) {
            String str3 = messageObject.messageOwner.attachPath;
            if (str3 != null && str3.length() > 0 && !w.f.o(str3)) {
                str3 = null;
            }
            if (str3 == null || str3.length() == 0) {
                str3 = wbVar.getFileLoader().getPathToMessage(wbVar.Y.messageOwner).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(wbVar.Y.getDocument().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(wbVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", new File(str3)));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
            }
            try {
                wbVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            } catch (Exception unused2) {
            }
        } else if (intValue != 7) {
            switch (intValue) {
                case 9:
                    wbVar.showDialog(new org.telegram.ui.Components.wx0(wbVar.getParentActivity(), wbVar, wbVar.Y.getInputStickerSet(), null, null, null));
                    break;
                case 10:
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 23 && ((i13 <= 28 || BuildVars.NO_SCOPED_STORAGE) && wbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                        wbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        wbVar.Y = null;
                        wbVar.Z = null;
                        return;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(wbVar.Y.getDocument());
                    if (TextUtils.isEmpty(documentFileName)) {
                        documentFileName = wbVar.Y.getFileName();
                    }
                    String str4 = wbVar.Y.messageOwner.attachPath;
                    if (str4 != null && str4.length() > 0 && !w.f.o(str4)) {
                        str4 = null;
                    }
                    if (str4 == null || str4.length() == 0) {
                        str4 = wbVar.getFileLoader().getPathToMessage(wbVar.Y.messageOwner).toString();
                    }
                    MediaController.saveFile(str4, wbVar.getParentActivity(), wbVar.Y.isMusic() ? 3 : 2, documentFileName, wbVar.Y.getDocument() != null ? wbVar.Y.getDocument().mime_type : "");
                    break;
                case 11:
                    MessagesController.getInstance(wbVar.currentAccount).saveGif(wbVar.Y, messageObject.getDocument());
                    break;
                default:
                    switch (intValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", wbVar.Y.messageOwner.media.user_id);
                            bundle.putString("phone", wbVar.Y.messageOwner.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            wbVar.presentFragment(new us(bundle));
                            break;
                        case 16:
                            AndroidUtilities.addToClipboard(messageObject.messageOwner.media.phone_number);
                            org.telegram.messenger.wl.o(R.string.PhoneCopied, org.telegram.ui.Components.vc.a0(wbVar));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + wbVar.Y.messageOwner.media.phone_number));
                                intent2.addFlags(TLObject.FLAG_28);
                                wbVar.getParentActivity().startActivityForResult(intent2, 500);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                break;
                            }
                        default:
                            switch (intValue) {
                                case 33:
                                    if (wbVar.Z != null) {
                                        TLRPC.User user3 = wbVar.getMessagesController().getUser(Long.valueOf(DialogObject.getPeerDialogId(wbVar.Z.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = wbVar.Z;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = wbVar.Z.banned_rights;
                                        tL_chatBannedRights.send_plain = true;
                                        tL_chatBannedRights.send_messages = true;
                                        tL_chatBannedRights.send_media = true;
                                        tL_chatBannedRights.send_stickers = true;
                                        tL_chatBannedRights.send_gifs = true;
                                        tL_chatBannedRights.send_games = true;
                                        tL_chatBannedRights.send_inline = true;
                                        tL_chatBannedRights.send_polls = true;
                                        tL_chatBannedRights.send_photos = true;
                                        tL_chatBannedRights.send_videos = true;
                                        tL_chatBannedRights.send_roundvideos = true;
                                        tL_chatBannedRights.send_audios = true;
                                        tL_chatBannedRights.send_voices = true;
                                        tL_chatBannedRights.send_docs = true;
                                        tL_chatBannedRights.send_reactions = true;
                                        wbVar.getMessagesController().setParticipantBannedRole(chat2.id, user3, null, wbVar.Z.banned_rights, true, wbVar.getFragmentForAlert(1), new l4(10, wbVar, user3));
                                        break;
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = wbVar.getMessagesController().getInputChannel(chat2.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = wbVar.Y.getRealId();
                                    wbVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new ya(wbVar, 2));
                                    break;
                                case 35:
                                    wbVar.getMessagesController().deleteParticipantFromChat(chat2.id, wbVar.getMessagesController().getInputPeer(wbVar.Y.messageOwner.from_id), false, false, (Runnable) new za(wbVar, 2));
                                    if ((wbVar.Y.messageOwner.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.vc.a(wbVar) && (user = wbVar.getMessagesController().getUser(Long.valueOf(wbVar.Y.messageOwner.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.vc.D(wbVar, user, chat2.title).j();
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else {
            String str5 = messageObject.messageOwner.attachPath;
            if (str5 != null && str5.length() > 0 && !w.f.o(str5)) {
                str5 = null;
            }
            if (str5 == null || str5.length() == 0) {
                str5 = wbVar.getFileLoader().getPathToMessage(wbVar.Y.messageOwner).toString();
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 23 && ((i14 <= 28 || BuildVars.NO_SCOPED_STORAGE) && wbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                wbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                wbVar.Y = null;
                wbVar.Z = null;
                return;
            }
            MediaController.saveFile(str5, wbVar.getParentActivity(), 0, null, null);
        }
        wbVar.Y = null;
        wbVar.Z = null;
    }

    public static void X(wb wbVar, int i10) {
        ah.i iVar = wbVar.d;
        if (Build.VERSION.SDK_INT < 31 || iVar == null) {
            return;
        }
        if (w7.c0.a(i10, 4)) {
            li.a b10 = wbVar.glassEngine.b();
            b10.b(wbVar.v.getY(), wbVar.X.getWidth(), wbVar.v.getY() + wbVar.v.getHeight());
            iVar.h(b10);
        }
        tb tbVar = wbVar.X;
        Objects.requireNonNull(tbVar);
        iVar.e(new xa(tbVar, 0), wbVar.X.getWidth(), wbVar.X.getHeight());
    }

    public static void Y(wb wbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.i iVar = wbVar.k0;
        wbVar.s0 = false;
        wbVar.C0.N = false;
        wbVar.W0(false);
        MessagesController.getInstance(wbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(wbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (iVar.h(tL_channelAdminLogEvent2.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                wbVar.O = Math.min(wbVar.O, tL_channelAdminLogEvent2.id);
                MessageObject messageObject = new MessageObject(wbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, wbVar.f, wbVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !iVar.d(tL_channelAdminLogEvent2.id))) {
                    wbVar.n0.add(0, messageObject);
                    iVar.k(messageObject, tL_channelAdminLogEvent2.id);
                    z10 = true;
                }
            }
        }
        if (wbVar.E == null || !z10) {
            return;
        }
        wbVar.R0();
        wbVar.E.l();
    }

    public static void Z(wb wbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = wbVar.f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            wbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            wbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            wbVar.t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = wbVar.getMessagesController().getChatFull(chat.id)) != null && chatFull.antispam) {
                hb hbVar = new hb();
                hbVar.user_id = wbVar.getMessagesController().telegramAntispamUserId;
                hbVar.peer = wbVar.getMessagesController().getPeer(hbVar.user_id);
                long j3 = wbVar.getMessagesController().telegramAntispamUserId;
                if (wbVar.getMessagesController().getUser(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(wbVar.currentAccount).sendRequest(tL_users_getUsers, new ya(wbVar, 1));
                }
                wbVar.t0.add(0, hbVar);
            }
            Dialog dialog = wbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).S(wbVar.t0);
            }
        }
    }

    public static void Z0(MessageObject messageObject, int i10) {
        if (messageObject == null) {
            return;
        }
        if (i10 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = messageObject.messageOwner.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            messageObject.messageOwner.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = LocaleController.formatPluralString("EventLogExpandMore", i10, new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        messageObject.measureInlineBotButtons();
    }

    public static CharSequence a1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!com.google.android.gms.internal.vision.e2.u(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            ah.f.l();
            spannableStringBuilder.setSpan(ah.f.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r7.putLong("ban_chat_id", r0.id);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void p0(wb wbVar, Bundle bundle, long j3) {
        TLRPC.Chat chat = wbVar.f;
        if (!chat.megagroup || wbVar.t0 == null || !ChatObject.canBlockUsers(chat)) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= wbVar.t0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) wbVar.t0.get(i10);
            if (MessageObject.getPeerId(channelParticipant.peer) != j3) {
                i10++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public static void v0(wb wbVar, MessageObject messageObject) {
        if (wbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            c2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            c2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        wbVar.showDialog(c2Var);
    }

    public final MessageObject N0(long j3, long j10, ArrayList arrayList, boolean z10, boolean z11) {
        int i10;
        MessageObject messageObject;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.o0;
            i10 = 1;
            if (i12 >= arrayList2.size()) {
                messageObject = null;
                break;
            }
            messageObject = (MessageObject) arrayList2.get(i12);
            if (messageObject != null && messageObject.contentType == 1 && messageObject.actionDeleteGroupEventId == j3) {
                break;
            }
            i12++;
        }
        if (messageObject == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e) {
                FileLog.e(e);
            }
            messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        messageObject.contentType = 1;
        if (!z11 || arrayList.size() <= 1) {
            messageObject.actionDeleteGroupEventId = -1L;
        } else {
            messageObject.actionDeleteGroupEventId = j3;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z11 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new n8(i10)).distinct().map(new Function() { // from class: org.telegram.ui.bb
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l4 = (Long) obj;
                wb wbVar = wb.this;
                wbVar.getClass();
                if (l4.longValue() >= 0) {
                    return UserObject.getForcedFirstName(wbVar.getMessagesController().getUser(l4));
                }
                TLRPC.Chat chat = wbVar.getMessagesController().getChat(Long.valueOf(-l4.longValue()));
                if (chat == null) {
                    return null;
                }
                return chat.title;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new cb(i11)).limit(4L).toArray())), "un1", user));
        if (z11 && arrayList.size() > 1) {
            m11 S0 = S0(messageObject.messageText);
            if (S0 == null) {
                S0 = new m11(LocaleController.getString(z10 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.m6 m6Var = S0.a;
                m6Var.u(bold);
                m6Var.t(AndroidUtilities.dp(10.0f));
                if (S0.c != -1) {
                    S0.c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                S0.a.q(LocaleController.getString(z10 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? (MessageObject) hg.k0.h(1, arrayList) : null;
        if (messageObject2 != null) {
            long j11 = messageObject2.eventId;
            a0.i iVar = this.E0;
            if (!iVar.d(j11)) {
                long j12 = messageObject2.eventId;
                int i13 = Q0;
                Q0 = i13 + 1;
                iVar.k(Integer.valueOf(i13), j12);
            }
            messageObject.stableId = ((Integer) iVar.f(messageObject2.eventId)).intValue();
        }
        return messageObject;
    }

    public final void O0(boolean z10) {
        gg.b0 b0Var = this.x;
        if (b0Var == null || this.i0) {
            return;
        }
        int L0 = b0Var.L0();
        if ((L0 == -1 ? 0 : Math.abs(this.x.N0() - L0) + 1) > 0) {
            this.E.getClass();
            if (L0 > (z10 ? 4 : 1) || this.r0 || this.q0) {
                return;
            }
            U0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x01e1, code lost:
    
        if ((r12.currentEvent.action instanceof org.telegram.tgnet.TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0146, code lost:
    
        if (org.telegram.messenger.MediaDataController.getInstance(r22.currentAccount).isStickerPackInstalled(r0.id) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0148, code lost:
    
        r8 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x015c, code lost:
    
        if (org.telegram.messenger.MediaDataController.getInstance(r22.currentAccount).isStickerPackInstalled(r0.short_name) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01d5, code lost:
    
        if (r10.user_id != getMessagesController().telegramAntispamUserId) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01e5, code lost:
    
        if ((r23 instanceof org.telegram.ui.Cells.w0) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e7, code lost:
    
        r0 = new android.text.SpannableString(">");
        r2 = getParentActivity().getResources().getDrawable(org.telegram.messenger.R.drawable.attach_arrow_right).mutate();
        r2.setColorFilter(new android.graphics.PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Gi), android.graphics.PorterDuff.Mode.MULTIPLY));
        r2.setBounds(0, 0, org.telegram.messenger.AndroidUtilities.dp(10.0f), org.telegram.messenger.AndroidUtilities.dp(10.0f));
        r0.setSpan(new android.text.style.ImageSpan(r2, 2), 0, r0.length(), 33);
        r2 = new android.text.SpannableStringBuilder();
        r2.append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.EventLogFilterGroupInfo)).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) r0).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAdministrators));
        r2.setSpan(new ci.dc(r22, 3), 0, r2.length(), 33);
        r0 = org.telegram.ui.Components.vc.a0(r22).M(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamUser), org.telegram.messenger.AndroidUtilities.replaceCharSequence("%s", org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamInfo2), r2), org.telegram.messenger.R.raw.msg_antispam);
        r0.j = 5000;
        r0.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0284, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0285, code lost:
    
        r0.add(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ReportFalsePositive));
        org.telegram.ui.Cells.p6.n(org.telegram.messenger.R.drawable.msg_notspam, 34, r9, r6);
        r3 = null;
        r0.add(null);
        r9.add(null);
        r6.add(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05c6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P0(View view, float f7, float f10) {
        Integer num;
        String str;
        boolean z10;
        Integer num2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        boolean z11;
        ArrayList arrayList;
        ta taVar;
        ArrayList arrayList2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction;
        TLRPC.Message message;
        TLRPC.User user;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        char c10 = '\n';
        MessageObject messageObject = view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject() : view instanceof org.telegram.ui.Cells.w0 ? ((org.telegram.ui.Cells.w0) view).getMessageObject() : null;
        if (messageObject != null) {
            int i10 = messageObject.type;
            if (i10 == 6) {
                num = 10;
            } else {
                if (i10 == 10 || i10 == 11 || i10 == 16) {
                    num = 10;
                    if (messageObject.getId() != 0) {
                        c10 = 1;
                    }
                } else {
                    if (!messageObject.isVoice()) {
                        if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                            TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                                num = 10;
                            } else {
                                num = 10;
                                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
                                }
                                c10 = 2;
                            }
                        } else if ((!messageObject.isRoundVideo() || (messageObject.isRoundVideo() && BuildVars.DEBUG_VERSION)) && ((messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
                            String str2 = messageObject.messageOwner.attachPath;
                            boolean z12 = (str2 == null || str2.length() == 0 || !new File(messageObject.messageOwner.attachPath).exists()) ? false : true;
                            if (!z12 && getFileLoader().getPathToMessage(messageObject.messageOwner).exists()) {
                                z12 = true;
                            }
                            if (z12) {
                                if (messageObject.getDocument() != null && (str = messageObject.getDocument().mime_type) != null) {
                                    if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                                        num = 10;
                                    } else if (str.endsWith("/xml")) {
                                        num = 10;
                                        c10 = 5;
                                    } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                                        num = 10;
                                        c10 = 6;
                                    }
                                }
                                num = 10;
                                c10 = 4;
                            }
                        } else if (messageObject.type == 12) {
                            num = 10;
                            c10 = '\b';
                        } else if (messageObject.isMediaEmpty()) {
                            num = 10;
                            c10 = 3;
                        }
                    }
                    num = 10;
                    c10 = 2;
                }
                this.Y = messageObject;
                if (getParentActivity() != null) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    TLRPC.Chat chat3 = this.f;
                    if (chat3 == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null) {
                        z10 = true;
                    } else {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction2 = tL_channelAdminLogEvent2.action;
                        z10 = true;
                        if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                            TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction2;
                            if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                                org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().getChatFull(chat3.id), null, this, chat3.id, false, ChatObject.isChannelAndNotMegaGroup(chat3));
                                r60Var.k0 = false;
                                r60Var.show();
                                return true;
                            }
                        }
                    }
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3 = messageObject.currentEvent;
                    if (tL_channelAdminLogEvent3 == null) {
                        num2 = 4;
                        chat = chat3;
                    } else if (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                        num2 = 4;
                        chat = chat3;
                    } else {
                        num2 = 4;
                        chat = chat3;
                    }
                    TLRPC.User user2 = null;
                    MessageObject messageObject2 = this.Y;
                    if (messageObject2.type == 0 || messageObject2.caption != null) {
                        arrayList3.add(LocaleController.getString(R.string.Copy));
                        org.telegram.ui.Cells.p6.n(R.drawable.msg_copy, 3, arrayList5, arrayList4);
                    }
                    if (c10 == 1) {
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = this.Y.currentEvent;
                        if (tL_channelAdminLogEvent4 != null) {
                            TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                            if (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                TLRPC.TL_channelAdminLogEventActionChangeStickerSet tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction3;
                                TLRPC.InputStickerSet inputStickerSet2 = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                                if (inputStickerSet2 == null || (inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                    inputStickerSet2 = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                }
                                TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet2;
                                if (inputStickerSet3 != null) {
                                    showDialog(new org.telegram.ui.Components.wx0(getParentActivity(), this, inputStickerSet3, null, null, null));
                                    return true;
                                }
                                arrayList = arrayList3;
                                chat2 = chat;
                                z11 = false;
                                arrayList2 = arrayList;
                                taVar = new ta(this, arrayList4, arrayList2, arrayList5, view, f7, f10);
                                if (ChatObject.canBlockUsers(chat2) && (tL_channelAdminLogEvent = messageObject.currentEvent) != null) {
                                    channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                                    if ((!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = messageObject.messageOwner) != null && message.from_id != null && (user = getMessagesController().getUser(Long.valueOf(this.Y.messageOwner.from_id.user_id))) != null && !UserObject.isUserSelf(user)) {
                                        MessagesController messagesController = getMessagesController();
                                        Utilities.Callback<TLRPC.ChannelParticipant> uaVar = new ua(this, arrayList2, arrayList5, arrayList4, taVar, 0);
                                        taVar = taVar;
                                        messagesController.getChannelParticipant(chat2, user, uaVar);
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    return true;
                                }
                                taVar.run();
                                return true;
                            }
                        }
                        if (tL_channelAdminLogEvent4 == null || !(tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                            chat2 = chat;
                            z11 = false;
                            if (tL_channelAdminLogEvent4 != null && (tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && ChatObject.canUserDoAdminAction(chat2, 13)) {
                                org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(getParentActivity(), chat2);
                                cqVar.v = new eb(this);
                                showDialog(cqVar);
                            }
                        } else {
                            chat2 = chat;
                            z11 = false;
                            v70 v70Var = new v70(chat2.id, 0);
                            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat2.id);
                            if (chatFull != null) {
                                v70Var.e0(chatFull);
                                presentFragment(v70Var);
                            }
                        }
                    } else {
                        chat2 = chat;
                        z11 = false;
                        if (c10 == 3) {
                            TLRPC.MessageMedia messageMedia = this.Y.messageOwner.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.isNewGifDocument(messageMedia.webpage.document)) {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGIFs));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_gif, arrayList5, arrayList4, 11);
                            }
                        } else if (c10 != 4) {
                            Integer num3 = num;
                            if (c10 == 5) {
                                arrayList3.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_language, arrayList5, arrayList4, 5);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c10 == '\n') {
                                arrayList3.add(LocaleController.getString(R.string.ApplyThemeFile));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_theme, arrayList5, arrayList4, 5);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c10 == 6) {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                                org.telegram.ui.Cells.p6.n(R.drawable.msg_gallery, 7, arrayList5, arrayList4);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c10 == 7) {
                                if (this.Y.isMask()) {
                                    arrayList3.add(LocaleController.getString(R.string.AddToMasks));
                                } else {
                                    arrayList3.add(LocaleController.getString(R.string.AddToStickers));
                                }
                                org.telegram.ui.Cells.p6.n(R.drawable.msg_sticker, 9, arrayList5, arrayList4);
                            } else if (c10 == '\b') {
                                long j3 = this.Y.messageOwner.media.user_id;
                                TLRPC.User user3 = j3 != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)) : user2;
                                if (user3 != null && user3.id != UserConfig.getInstance(this.currentAccount).getClientUserId() && ContactsController.getInstance(this.currentAccount).contactsDict.get(Long.valueOf(user3.id)) == null) {
                                    arrayList3.add(LocaleController.getString(R.string.AddContactTitle));
                                    org.telegram.ui.Cells.p6.n(R.drawable.msg_addcontact, 15, arrayList5, arrayList4);
                                }
                                if (!TextUtils.isEmpty(this.Y.messageOwner.media.phone_number)) {
                                    arrayList3.add(LocaleController.getString(R.string.Copy));
                                    org.telegram.ui.Cells.p6.n(R.drawable.msg_copy, 16, arrayList5, arrayList4);
                                    arrayList3.add(LocaleController.getString(R.string.Call));
                                    org.telegram.ui.Cells.p6.n(R.drawable.msg_calls, 17, arrayList5, arrayList4);
                                }
                            }
                        } else if (this.Y.isVideo()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else if (this.Y.isMusic()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToMusic));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_download, arrayList5, arrayList4, num);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else {
                            Integer num4 = num;
                            if (this.Y.getDocument() != null) {
                                if (MessageObject.isNewGifDocument(this.Y.getDocument())) {
                                    arrayList3.add(LocaleController.getString(R.string.SaveToGIFs));
                                    org.telegram.ui.Cells.p6.o(R.drawable.msg_gif, arrayList5, arrayList4, 11);
                                }
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_download, arrayList5, arrayList4, num4);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            }
                        }
                    }
                    arrayList = arrayList3;
                    arrayList2 = arrayList;
                    taVar = new ta(this, arrayList4, arrayList2, arrayList5, view, f7, f10);
                    if (ChatObject.canBlockUsers(chat2)) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                        }
                        MessagesController messagesController2 = getMessagesController();
                        Utilities.Callback<TLRPC.ChannelParticipant> uaVar2 = new ua(this, arrayList2, arrayList5, arrayList4, taVar, 0);
                        taVar = taVar;
                        messagesController2.getChannelParticipant(chat2, user, uaVar2);
                        z11 = true;
                    }
                    if (!z11) {
                    }
                }
            }
            c10 = 65535;
            this.Y = messageObject;
            if (getParentActivity() != null) {
            }
        }
        return false;
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.d0 == null) {
            j0 j0Var = new j0(this, getParentActivity(), 4);
            this.d0 = j0Var;
            j0Var.setOutlineProvider(new ai.k2(8));
            this.d0.setClipToOutline(true);
            this.d0.setWillNotDraw(false);
            this.d0.setVisibility(4);
            k4 k4Var = new k4(getParentActivity());
            this.e0 = k4Var;
            k4Var.setBackgroundColor(0);
            if (z10) {
                this.d0.addView(this.e0, w7.x5.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f0 = textureView;
            textureView.setOpaque(false);
            this.e0.addView(this.f0, w7.x5.c(-1.0f, -1));
        }
        if (this.d0.getParent() == null) {
            tb tbVar = this.X;
            j0 j0Var2 = this.d0;
            int i10 = AndroidUtilities.roundMessageSize;
            tbVar.addView(j0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.d0.setVisibility(4);
        this.e0.setDrawingReady(false);
        return this.f0;
    }

    public final void R0() {
        ArrayList arrayList;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.D0.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = this.n0;
            if (i10 >= arrayList4.size()) {
                ArrayList arrayList5 = this.o0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList4.get(i10);
            long j3 = (messageObject == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (messageObject.stableId <= 0) {
                int i11 = Q0;
                Q0 = i11 + 1;
                messageObject.stableId = i11;
            }
            int i12 = i10 + 1;
            MessageObject messageObject2 = i12 < arrayList4.size() ? (MessageObject) arrayList4.get(i12) : null;
            long j10 = (messageObject2 == null || (tL_channelAdminLogEvent = messageObject2.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j3 != 0) {
                arrayList3.add(messageObject);
            } else {
                arrayList2.add(messageObject);
            }
            if (j3 == j10 || arrayList3.isEmpty()) {
                arrayList = arrayList3;
            } else {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                boolean z10 = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList2.size();
                ArrayList arrayList6 = new ArrayList();
                for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((MessageObject) arrayList3.get(size2)).contentType == 1; size2--) {
                    arrayList6.add((MessageObject) arrayList3.remove(size2));
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    MessageObject messageObject3 = (MessageObject) hg.k0.h(1, arrayList3);
                    boolean z11 = TextUtils.isEmpty(this.v0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(messageObject3.eventId);
                    HashSet hashSet = this.p0;
                    if (hashSet.contains(valueOf) || !z11) {
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            Z0((MessageObject) arrayList3.get(i13), 0);
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        Z0(messageObject3, arrayList3.size() - 1);
                        arrayList2.add(messageObject3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = messageObject3.messageOwner.reply_markup;
                    if (z10 != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        messageObject3.forceUpdate = true;
                        this.E.m((z10 ? arrayList3.size() - 1 : 0) + size);
                        this.E.m(size + (z10 ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j11 = messageObject.eventId;
                    MessageObject N0 = N0(j11, messageObject.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j11)), z11);
                    arrayList = arrayList3;
                    arrayList2.add(N0);
                }
                if (!arrayList6.isEmpty()) {
                    MessageObject messageObject4 = (MessageObject) hg.k0.h(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(N0(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i10 = i12;
            arrayList3 = arrayList;
        }
    }

    public final void T0(boolean z10) {
        if (this.M.getTag() == null || this.P) {
            return;
        }
        if (!this.S || this.Q) {
            this.M.setTag(null);
            if (!z10) {
                AnimatorSet animatorSet = this.R;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.R = null;
                }
                this.M.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.R = animatorSet2;
            animatorSet2.setDuration(150L);
            this.R.playTogether(ObjectAnimator.ofFloat(this.M, "alpha", 0.0f));
            this.R.addListener(new t4(this, 15));
            this.R.setStartDelay(500L);
            this.R.start();
        }
    }

    public final void U0(boolean z10) {
        sb sbVar;
        if (this.r0) {
            return;
        }
        ArrayList arrayList = this.n0;
        if (z10) {
            this.O = Long.MAX_VALUE;
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                this.H.setVisibility(4);
                this.v.setEmptyView(null);
            }
            this.k0.b();
            arrayList.clear();
            this.m0.clear();
            R0();
        }
        this.r0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f);
        tL_channels_getAdminLog.q = this.v0;
        tL_channels_getAdminLog.limit = 50;
        if (z10 || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.O;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.w0.n(i10)));
            }
        }
        b1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ya(this, 3));
        if (!z10 || (sbVar = this.E) == null) {
            return;
        }
        sbVar.l();
    }

    public final void V0() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f);
        tL_channels_getAdminLog.q = this.v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ya(this, 0));
    }

    public final void W0(boolean z10) {
        lb lbVar = this.v;
        if (lbVar == null || this.x == null || lbVar.getChildCount() <= 0) {
            return;
        }
        int i10 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < this.v.getChildCount(); i12++) {
            View childAt = this.v.getChildAt(i12);
            this.v.getClass();
            int S = RecyclerView.S(childAt);
            if (S >= 0) {
                int top = childAt.getTop();
                if (z10) {
                    if (top >= i10) {
                    }
                    i10 = childAt.getTop();
                    view = childAt;
                    i11 = S;
                } else {
                    if (top <= i10) {
                    }
                    i10 = childAt.getTop();
                    view = childAt;
                    i11 = S;
                }
            }
        }
        if (view != null) {
            this.M0 = view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject().eventId : view instanceof org.telegram.ui.Cells.w0 ? ((org.telegram.ui.Cells.w0) view).getMessageObject().eventId : 0L;
            this.N0 = i11;
            this.O0 = (this.v.getMeasuredHeight() - view.getBottom()) - this.v.getPaddingBottom();
        }
    }

    public final int X0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        int findQuoteStart;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (TextUtils.isEmpty(null)) {
            org.telegram.ui.Cells.t1 t1Var2 = this.J0;
            if (t1Var2 != null) {
                t1Var2.xe = 0;
                t1Var2.ye = null;
            }
        } else {
            if (TextUtils.isEmpty(messageObject.caption) || (t1Var = this.J0) == null || (textLayoutBlocks = t1Var.c4) == null) {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var3 = this.J0;
                if (t1Var3 == null || !t1Var3.t1) {
                    charSequence = charSequence2;
                    i10 = 0;
                } else {
                    i10 = t1Var3.m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                i10 = (int) t1Var.q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            }
            org.telegram.ui.Cells.t1 t1Var4 = this.J0;
            if (t1Var4 != null) {
                t1Var4.xe = 0;
                t1Var4.ye = null;
            }
            if (arrayList != null && charSequence != null && (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.H0)) >= 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                    String charSequence3 = textLayoutBlock.textLayout.getText().toString();
                    int i12 = textLayoutBlock.charactersOffset;
                    if (findQuoteStart > i12) {
                        float textYOffset = findQuoteStart - i12 > charSequence3.length() + (-1) ? i10 + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height)) : r5.getLineTop(r5.getLineForOffset(findQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + i10 + textLayoutBlock.padTop;
                        if (textYOffset > AndroidUtilities.displaySize.y * (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)) {
                            return (int) (textYOffset - (AndroidUtilities.displaySize.y * (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)));
                        }
                    } else {
                        i11++;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d A[LOOP:1: B:31:0x0098->B:42:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(MessageObject messageObject) {
        int i10;
        int i11;
        int indexOf;
        float f7;
        int g12;
        MessageObject messageObject2;
        ArrayList arrayList = this.o0;
        if (arrayList.size() > 0) {
            int N0 = this.x.N0();
            for (int L0 = this.x.L0(); L0 <= N0; L0++) {
                sb sbVar = this.E;
                int i12 = sbVar.f;
                if (L0 >= i12 && L0 < sbVar.h) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(L0 - i12);
                    if (messageObject3.contentType != 1 && messageObject3.getRealId() != 0 && !messageObject3.isSponsored()) {
                        i11 = L0 - this.E.f;
                        i10 = (messageObject3.getRealId() < messageObject.getRealId() ? 1 : 0) ^ 1;
                        this.y.b = i10;
                        indexOf = arrayList.indexOf(messageObject);
                        if (indexOf == -1) {
                            if (i11 > 0) {
                                i10 = i11 > indexOf ? 0 : 1;
                                this.y.b = i10;
                            }
                            za zaVar = this.I0;
                            if (zaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(zaVar);
                                this.I0 = null;
                            }
                            this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.G0 = messageObject.getRealId();
                            int indexOf2 = arrayList.indexOf(messageObject) + this.E.f;
                            d1();
                            int childCount = this.v.getChildCount();
                            int i13 = 0;
                            boolean z10 = false;
                            int i14 = 0;
                            while (true) {
                                if (i13 >= childCount) {
                                    f7 = 2.0f;
                                    break;
                                }
                                View childAt = this.v.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.t1) {
                                    MessageObject messageObject4 = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                                    if (messageObject4 != null) {
                                        f7 = 2.0f;
                                        if (messageObject4.getRealId() == messageObject.getRealId()) {
                                            childAt.sendAccessibilityEvent(8);
                                            i14 = X0(messageObject4);
                                            z10 = true;
                                        }
                                    } else {
                                        f7 = 2.0f;
                                    }
                                    if (z10) {
                                        i13++;
                                    } else {
                                        int top = childAt.getTop() - (Math.max(-AndroidUtilities.dp(f7), (this.v.getMeasuredHeight() - childAt.getHeight()) / 2) - i14);
                                        int computeVerticalScrollRange = (this.v.computeVerticalScrollRange() - this.v.computeVerticalScrollOffset()) - this.v.computeVerticalScrollExtent();
                                        if (computeVerticalScrollRange < 0) {
                                            computeVerticalScrollRange = 0;
                                        }
                                        if (top > computeVerticalScrollRange) {
                                            top = computeVerticalScrollRange;
                                        }
                                        if (top != 0) {
                                            this.v.w0(0, top, null);
                                            this.v.setOverScrollMode(2);
                                        }
                                    }
                                } else {
                                    f7 = 2.0f;
                                    if ((childAt instanceof org.telegram.ui.Cells.w0) && (messageObject2 = ((org.telegram.ui.Cells.w0) childAt).getMessageObject()) != null && messageObject2.getRealId() == messageObject.getRealId()) {
                                        childAt.sendAccessibilityEvent(8);
                                        z10 = true;
                                    }
                                    if (z10) {
                                    }
                                }
                            }
                            if (z10) {
                                return;
                            }
                            boolean z11 = !TextUtils.isEmpty(null);
                            if (getParentActivity() == null) {
                                g12 = 0;
                            } else {
                                if (this.J0 == null) {
                                    this.J0 = new org.telegram.ui.Cells.t1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.t1 t1Var = this.J0;
                                TLRPC.Chat chat = this.f;
                                t1Var.N7 = chat != null;
                                t1Var.S7 = ChatObject.isChannel(chat) && chat.megagroup;
                                g12 = this.J0.g1(messageObject, null, z11);
                            }
                            int max = Math.max(-AndroidUtilities.dp(f7), (this.v.getMeasuredHeight() - g12) / 2) - X0(messageObject);
                            vb vbVar = this.L0;
                            vbVar.a = messageObject;
                            vbVar.e = max;
                            org.telegram.ui.Components.pk0 pk0Var = this.y;
                            pk0Var.b = i10;
                            vbVar.b = indexOf2;
                            vbVar.d = max;
                            vbVar.c = false;
                            pk0Var.d(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        this.y.b = i10;
        indexOf = arrayList.indexOf(messageObject);
        if (indexOf == -1) {
        }
    }

    public final void b1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.w0 != null || this.u0 != null) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        } else {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f.megagroup) {
                this.L.setText(a1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.L.setText(a1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        }
    }

    public final void c1() {
        lb lbVar = this.v;
        if (lbVar == null) {
            return;
        }
        int childCount = lbVar.getChildCount();
        int measuredHeight = this.v.getMeasuredHeight();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z11 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.v.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                u1Var.f = y3;
                u1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                int top = t1Var.getTop();
                t1Var.getBottom();
                int i13 = top >= 0 ? 0 : -top;
                int measuredHeight2 = t1Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i13 + measuredHeight;
                }
                t1Var.b4(i13, measuredHeight2 - i13, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.v.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject = t1Var.getMessageObject();
                if (this.d0 != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = t1Var.getPhotoImage();
                    this.d0.setTranslationX(photoImage.getImageX());
                    this.d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                w0Var.W((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (w0Var.J()) {
                    w0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.v.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.t1) || (childAt instanceof org.telegram.ui.Cells.w0)) {
                        view = childAt;
                    }
                    i10 = bottom;
                    view3 = childAt;
                }
                mb mbVar = this.C0;
                if ((mbVar == null || (!mbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.w0) && ((org.telegram.ui.Cells.w0) childAt).getMessageObject().isDateObject) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i11) {
                        i11 = bottom;
                        view2 = childAt;
                    }
                }
            }
        }
        j0 j0Var = this.d0;
        if (j0Var != null) {
            if (z11) {
                MediaController.getInstance().setCurrentVideoVisible(true);
            } else {
                j0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.V) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            }
        }
        if (view != null) {
            this.M.T((view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject() : ((org.telegram.ui.Cells.w0) view).getMessageObject()).messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view3 instanceof org.telegram.ui.Cells.t1) && !(view3 instanceof org.telegram.ui.Cells.w0)) {
            z10 = true;
        }
        this.Q = z10;
        if (view2 == null) {
            T0(true);
            this.M.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.v.getPaddingTop() || this.Q) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            T0(true ^ this.Q);
        } else {
            if (view2.getAlpha() != 0.0f) {
                view2.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = this.R;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.R = null;
            }
            if (this.M.getTag() == null) {
                this.M.setTag(1);
            }
            if (this.M.getAlpha() != 1.0f) {
                this.M.setAlpha(1.0f);
            }
            this.P = true;
        }
        int bottom2 = view2.getBottom() - this.v.getPaddingTop();
        if (bottom2 <= this.M.getMeasuredHeight() || bottom2 >= this.M.getMeasuredHeight() * 2) {
            this.M.setTranslationY(0.0f);
        } else {
            this.M.setTranslationY(((-r1.getMeasuredHeight()) * 2) + bottom2);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.t1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.j6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        hg.k0.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 28));
        org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(context, null, false, null);
        this.I = eoVar;
        ll llVar = eoVar.h;
        if (llVar != null) {
            llVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        ll llVar2 = eoVar.r;
        if (llVar2 != null) {
            llVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        eoVar.k0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, w7.x5.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 1);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.eo eoVar2 = this.I;
        TLRPC.Chat chat = this.f;
        eoVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        kb kbVar = new kb(this, context);
        this.fragmentView = kbVar;
        this.X = kbVar;
        kbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.j6.r0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        dh.e p5 = eh.b.p(this.resourceProvider);
        ah.c cVar = this.c;
        kVar.M(cVar, p5, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, w7.x5.e(-1, -2, 17));
        this.H.setOnTouchListener(new bi.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.w5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, w7.x5.t(54, 54, 17, 16, 20, 16, -4));
        ai.p4 p4Var = new ai.p4(context, 9);
        this.L = p4Var;
        p4Var.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        ai.p4 p4Var2 = this.L;
        int i11 = org.telegram.ui.ActionBar.j6.ic;
        p4Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, w7.x5.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, w7.x5.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        lb lbVar = new lb(this, context);
        this.v = lbVar;
        lbVar.setOnItemClickListener(new g(this, 9));
        this.v.setTag(1);
        this.v.setVerticalScrollBarEnabled(true);
        lb lbVar2 = this.v;
        sb sbVar = new sb(this, context);
        this.E = sbVar;
        lbVar2.setAdapter(sbVar);
        this.v.setClipToPadding(false);
        lb lbVar3 = this.v;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.e;
        lbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        lb lbVar4 = this.v;
        mb mbVar = new mb(this, this.v, this.resourceProvider);
        this.C0 = mbVar;
        lbVar4.setItemAnimator(mbVar);
        this.C0.Q = true;
        this.v.setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(this);
        this.x = b0Var;
        b0Var.j1(1);
        this.x.l1(true);
        this.v.setLayoutManager(this.x);
        org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0(this.v, this.x);
        this.y = pk0Var;
        pk0Var.h = new ab(this);
        pk0Var.i = this.L0;
        this.X.addView(this.v, w7.x5.c(-1.0f, -1));
        this.v.setOnScrollListener(new h3(this));
        this.glassEngine.a(this.v);
        int i14 = this.g0;
        if (i14 != -1) {
            this.x.h1(i14, this.h0);
            this.g0 = -1;
        }
        jh.f fVar = new jh.f(context);
        this.W = fVar;
        fVar.setup(this.b);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.n, w7.x5.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new org.telegram.ui.ActionBar.w5(this.r, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.f2));
        this.n.addView(this.r, w7.x5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.s.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.n.addView(this.s, w7.x5.e(32, 32, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        this.M = w0Var;
        w0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, w7.x5.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        jh.e eVar = new jh.e(cVar, context, eh.b.b(f6Var), f6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        jh.e eVar2 = this.G;
        ch.d c10 = eVar2.n.c(eVar2, null, false);
        c10.o(eVar2.r);
        c10.q(AndroidUtilities.dp(22.0f));
        c10.p(AndroidUtilities.dp(6.0f));
        eVar2.s = c10;
        this.X.addView(this.G, w7.x5.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        final int i15 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.db
            public final /* synthetic */ wb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        wb wbVar = this.b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(wbVar, wbVar.u0, wbVar.w0, wbVar.f.megagroup);
                            g0Var.S(wbVar.t0);
                            g0Var.g0 = new ab(wbVar);
                            wbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        wb wbVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f.megagroup) {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        wbVar2.showDialog(c2Var);
                        break;
                    default:
                        wb wbVar3 = this.b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.c5.p(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ae, false));
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, w7.x5.e(-2, -2, 17));
        this.G.f.add(this.F);
        this.G.d(false);
        final int i16 = 1;
        this.G.b[4] = new View.OnClickListener(this) { // from class: org.telegram.ui.db
            public final /* synthetic */ wb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        wb wbVar = this.b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(wbVar, wbVar.u0, wbVar.w0, wbVar.f.megagroup);
                            g0Var.S(wbVar.t0);
                            g0Var.g0 = new ab(wbVar);
                            wbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        wb wbVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f.megagroup) {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        wbVar2.showDialog(c2Var);
                        break;
                    default:
                        wb wbVar3 = this.b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.c5.p(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.a0.setVisibility(4);
        this.a0.setFocusable(true);
        this.a0.setFocusableInTouchMode(true);
        this.a0.setClickable(true);
        this.a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.a0, w7.x5.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.b0.setImageResource(R.drawable.msg_calendar);
        this.b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xe, false), PorterDuff.Mode.MULTIPLY));
        this.a0.addView(this.b0, w7.x5.e(48, 48, 53));
        final int i17 = 2;
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.db
            public final /* synthetic */ wb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        wb wbVar = this.b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(wbVar, wbVar.u0, wbVar.w0, wbVar.f.megagroup);
                            g0Var.S(wbVar.t0);
                            g0Var.g0 = new ab(wbVar);
                            wbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        wb wbVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f.megagroup) {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        wbVar2.showDialog(c2Var);
                        break;
                    default:
                        wb wbVar3 = this.b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.c5.p(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c0 = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ye, false));
        this.c0.setTextSize(15);
        this.c0.setTypeface(AndroidUtilities.bold());
        this.a0.addView(this.c0, w7.x5.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.r0 && this.n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, true, 0.3f, true);
            this.v.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, false, 0.3f, true);
            this.v.setEmptyView(this.H);
        }
        lb lbVar5 = this.v;
        lbVar5.Y1 = true;
        lbVar5.Z1 = 1;
        UndoView undoView = new UndoView(context);
        this.w = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.w, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        b1();
        return this.fragmentView;
    }

    public final void d1() {
        lb lbVar = this.v;
        if (lbVar == null) {
            return;
        }
        int childCount = lbVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.v.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.s()) {
                        t1Var.setDrawSelectionBackground(false);
                        t1Var.J3(false, true);
                        t1Var.L3(false, false, true);
                    }
                    t1Var.setHighlighted(this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0);
                    if (this.G0 != Integer.MAX_VALUE) {
                        za zaVar = this.I0;
                        if (zaVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(zaVar);
                        }
                        za zaVar2 = new za(this, 0);
                        this.I0 = zaVar2;
                        AndroidUtilities.runOnUIThread(zaVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.v0)) {
                        t1Var.S3(null);
                    } else {
                        t1Var.S3(this.v0);
                    }
                    t1Var.setSpoilersSuppressed(this.v.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                w0Var.setMessageObject(w0Var.getMessageObject());
                w0Var.setSpoilersSuppressed(this.v.getScrollState() != 0);
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.t1 t1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.t1 t1Var3;
        MessageObject messageObject3;
        boolean z10;
        if (i10 == NotificationCenter.emojiLoaded) {
            lb lbVar = this.v;
            if (lbVar != null) {
                lbVar.g1();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagePlayingDidStart) {
            if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                lb lbVar2 = this.v;
                if (lbVar2 != null) {
                    int childCount = lbVar2.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.v.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null) {
                            if (messageObject.isVoice() || messageObject.isMusic()) {
                                t1Var.m4(false, true, false);
                            } else if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                t1Var.e1(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i10 != NotificationCenter.messagePlayingProgressDidChanged) {
                if (i10 != NotificationCenter.didSetNewWallpapper || this.fragmentView == null) {
                    return;
                }
                this.X.V(org.telegram.ui.ActionBar.j6.r0());
                this.r.invalidate();
                ai.p4 p4Var = this.L;
                if (p4Var != null) {
                    p4Var.invalidate();
                }
                this.v.g1();
                return;
            }
            Integer num = (Integer) objArr[0];
            lb lbVar3 = this.v;
            if (lbVar3 != null) {
                int childCount2 = lbVar3.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.v.getChildAt(i13);
                    if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = (t1Var2 = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null) {
                            messageObject2.audioProgress = playingMessageObject.audioProgress;
                            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                            t1Var2.q4();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((MessageObject) objArr[0]).isRoundVideo()) {
            MediaController.getInstance().setTextureView(Q0(true), this.e0, this.d0, true);
            int childCount3 = this.v.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount3) {
                    z10 = false;
                    break;
                }
                View childAt3 = this.v.getChildAt(i14);
                if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt3;
                    MessageObject messageObject4 = t1Var4.getMessageObject();
                    if (this.d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                        ImageReceiver photoImage = t1Var4.getPhotoImage();
                        this.d0.setTranslationX(photoImage.getImageX());
                        this.d0.setTranslationY(photoImage.getImageY() + t1Var4.getTop() + this.fragmentView.getPaddingTop());
                        this.fragmentView.invalidate();
                        this.d0.invalidate();
                        z10 = true;
                        break;
                    }
                }
                i14++;
            }
            if (this.d0 != null) {
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (z10) {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                } else {
                    this.d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject2 != null && playingMessageObject2.isRoundVideo() && (this.V || PipRoundVideoView.F != null)) {
                        MediaController.getInstance().setCurrentVideoVisible(false);
                    }
                }
            }
        }
        lb lbVar4 = this.v;
        if (lbVar4 != null) {
            int childCount4 = lbVar4.getChildCount();
            for (int i15 = 0; i15 < childCount4; i15++) {
                View childAt4 = this.v.getChildAt(i15);
                if ((childAt4 instanceof org.telegram.ui.Cells.t1) && (messageObject3 = (t1Var3 = (org.telegram.ui.Cells.t1) childAt4).getMessageObject()) != null) {
                    if (messageObject3.isVoice() || messageObject3.isMusic()) {
                        t1Var3.m4(false, true, false);
                    } else if (messageObject3.isRoundVideo()) {
                        t1Var3.e1(null, false);
                        if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                            messageObject3.resetPlayingProgress();
                            t1Var3.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.v8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.t8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.j6.c2, org.telegram.ui.ActionBar.j6.d2}, org.telegram.ui.ActionBar.j6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.i8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.j8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.k8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.l8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.m8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.n8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.o8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m3, org.telegram.ui.ActionBar.j6.q3}, null, org.telegram.ui.ActionBar.j6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.n3, org.telegram.ui.ActionBar.j6.r3}, null, org.telegram.ui.ActionBar.j6.dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.j6.m3.k();
        int i13 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.j6.o3.k();
        int i14 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.p3, org.telegram.ui.ActionBar.j6.t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.s2;
        int i15 = org.telegram.ui.ActionBar.j6.ic;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.w0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 2, new Class[]{org.telegram.ui.Cells.w0.class}, org.telegram.ui.ActionBar.j6.s2, null, null, org.telegram.ui.ActionBar.j6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.w4, org.telegram.ui.ActionBar.j6.q4, org.telegram.ui.ActionBar.j6.x4, org.telegram.ui.ActionBar.j6.v4, org.telegram.ui.ActionBar.j6.u4, org.telegram.ui.ActionBar.j6.C4}, null, org.telegram.ui.ActionBar.j6.kc));
        int i16 = org.telegram.ui.ActionBar.j6.lc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.j6.mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.hc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O3, org.telegram.ui.ActionBar.j6.S3, org.telegram.ui.ActionBar.j6.W3}, null, org.telegram.ui.ActionBar.j6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P3, org.telegram.ui.ActionBar.j6.T3, org.telegram.ui.ActionBar.j6.X3}, null, org.telegram.ui.ActionBar.j6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.M3, org.telegram.ui.ActionBar.j6.Q3, org.telegram.ui.ActionBar.j6.U3}, null, org.telegram.ui.ActionBar.j6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.N3, org.telegram.ui.ActionBar.j6.R3, org.telegram.ui.ActionBar.j6.V3}, null, org.telegram.ui.ActionBar.j6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.a4, org.telegram.ui.ActionBar.j6.b4, org.telegram.ui.ActionBar.j6.Z3}, null, org.telegram.ui.ActionBar.j6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.e4}, null, org.telegram.ui.ActionBar.j6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f4}, null, org.telegram.ui.ActionBar.j6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.c4}, null, org.telegram.ui.ActionBar.j6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.d4}, null, org.telegram.ui.ActionBar.j6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.g4}, null, org.telegram.ui.ActionBar.j6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.j6.i4};
        int i17 = org.telegram.ui.ActionBar.j6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.j6.h4, org.telegram.ui.ActionBar.j6.B4, org.telegram.ui.ActionBar.j6.D4};
        int i18 = org.telegram.ui.ActionBar.j6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.J4, null, org.telegram.ui.ActionBar.j6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.H4, null, org.telegram.ui.ActionBar.j6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O4}, null, org.telegram.ui.ActionBar.j6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P4}, null, org.telegram.ui.ActionBar.j6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Q4}, null, org.telegram.ui.ActionBar.j6.qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.b2, null, null, org.telegram.ui.ActionBar.j6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.j4}, null, org.telegram.ui.ActionBar.j6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.J2, null, null, org.telegram.ui.ActionBar.j6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.K2, null, null, org.telegram.ui.ActionBar.j6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.T1, null, null, org.telegram.ui.ActionBar.j6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.Q2, null, null, org.telegram.ui.ActionBar.j6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Rc));
        int i19 = org.telegram.ui.ActionBar.j6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.ab;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.pd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.tb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ub));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.td));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.vb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ud));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.wb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.yb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.xd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.zb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.xb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.yd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.zd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ie));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.je));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.j6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.j6.re));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.j6.se));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.j6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.j6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.j6.qe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.j6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.j6.De));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.r, TLObject.FLAG_29, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, TLObject.FLAG_29, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i21 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.w;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        U0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ya(this, 4)), this.classGuid);
        setBulletinDelegate(new ci.d9(6));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        this.x0.unlock();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        tb tbVar = this.X;
        if (tbVar != null) {
            org.telegram.ui.Components.m81 m81Var = tbVar.v;
            if (m81Var != null) {
                m81Var.c(false);
            }
            tbVar.F = true;
        }
        UndoView undoView = this.w;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.i0 = true;
        this.j0 = true;
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
        if (mVar == null || !mVar.a) {
            return;
        }
        com.google.firebase.messaging.m k10 = com.google.firebase.messaging.m.k();
        if (k10.a) {
            r4 r4Var = (r4) k10.d;
            int i10 = c5.F;
            r4Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        tb tbVar = this.X;
        if (tbVar != null) {
            org.telegram.ui.Components.m81 m81Var = tbVar.v;
            if (m81Var != null) {
                m81Var.c(true);
            }
            tbVar.F = false;
        }
        this.i0 = false;
        O0(false);
        if (this.j0) {
            this.j0 = false;
            sb sbVar = this.E;
            if (sbVar != null) {
                sbVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.x0.unlock();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.x0.lock();
        }
    }
}
