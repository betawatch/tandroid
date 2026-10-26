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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wb extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public static int Q0 = 10;
    public static final int[] R0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public boolean A0;
    public final ib B0;
    public mb C0;
    public final ArrayList D0;
    public sb E;
    public final a0.h E0;
    public TextView F;
    public gb F0;
    public lh.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.po I;
    public za I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.s1 J0;
    public ImageView K;
    public int K0;
    public bi.md L;
    public final vb L0;
    public org.telegram.ui.Cells.v0 M;
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
    public lh.f W;
    public tb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final hh.e a;
    public FrameLayout a0;
    public final ch.b b;
    public ImageView b0;
    public final ch.b c;
    public org.telegram.ui.ActionBar.b6 c0;
    public final ch.f d;
    public k0 d0;
    public final int e;
    public m4 e0;
    public final TLRPC.Chat f;
    public TextureView f0;
    public int g0;
    public final ArrayList h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public final a0.h k0;
    public final a0.h l0;
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
    public a0.h w0;
    public ig.a0 x;
    public final AnimationNotificationsLocker x0;
    public org.telegram.ui.Components.pl0 y;
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
        this.k0 = new a0.h();
        this.l0 = new a0.h();
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
        this.E0 = new a0.h();
        this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.H0 = -1;
        this.L0 = new vb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        oi.q qVar = this.glassEngine;
        qVar.a = new ab(this);
        qVar.d = new qi.b(AndroidUtilities.dp(48.0f));
        hh.e eVar = new hh.e();
        this.a = eVar;
        ch.b bVar = new ch.b(eVar);
        this.b = bVar;
        bVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.d = null;
            this.e = 0;
            ch.b bVar2 = new ch.b(eVar);
            this.c = bVar2;
            bVar2.h = this.glassEngine;
        } else {
            ch.f fVar = new ch.f();
            this.d = fVar;
            this.glassEngine.a(fVar);
            hh.d dVar = new hh.d(eVar);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f = eVar;
            if (LiteMode.isEnabled(262144)) {
                hh.d dVar2 = new hh.d(eVar);
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f = eVar;
                ch.b bVar3 = new ch.b(dVar2);
                this.c = bVar3;
                bVar3.h = this.glassEngine;
                int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
                bVar3.b = dp;
                bVar3.c = dp;
                bVar3.i = LiteMode.isEnabled(262144);
                this.e = 0;
            } else {
                ch.b bVar4 = new ch.b(dVar);
                this.c = bVar4;
                bVar4.h = this.glassEngine;
                int dp2 = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
                bVar4.b = dp2;
                bVar4.c = dp2;
                this.e = AndroidUtilities.dp(48.0f);
            }
        }
        this.f = chat;
    }

    public static void B0(wb wbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = wbVar.getMessagesController();
        TLRPC.Chat chat = wbVar.f;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.id);
        org.telegram.ui.Components.n70 n70Var = new org.telegram.ui.Components.n70(wbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, wbVar, chatFull.id, false, ChatObject.isChannel(chat));
        n70Var.j0 = new jb(wbVar);
        n70Var.show();
    }

    public static void L0(wb wbVar) {
        if (wbVar.v == null || wbVar.n0.isEmpty()) {
            return;
        }
        wbVar.x.h1(wbVar.o0.size() - 1, (-100000) - wbVar.v.getPaddingTop());
    }

    public static v01 T0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.zq zqVar : (org.telegram.ui.Components.zq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.zq.class)) {
            if (zqVar != null) {
                Drawable drawable = zqVar.drawable;
                if (drawable instanceof v01) {
                    return (v01) drawable;
                }
            }
        }
        return null;
    }

    public static void V(wb wbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = wbVar.k0;
        int i10 = 0;
        wbVar.C0.N = false;
        wbVar.X0(false);
        MessagesController.getInstance(wbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(wbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = wbVar.n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                wbVar.O = Math.min(wbVar.O, tL_channelAdminLogEvent.id);
                MessageObject messageObject2 = new MessageObject(wbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f, wbVar.T, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.id);
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
        wbVar.S0();
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

    public static void W(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || wbVar.getParentActivity() == null) {
            return;
        }
        int i10 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, wbVar.getParentActivity(), wbVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        Rect rect = new Rect();
        wbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, wbVar.getResourceProvider());
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            if (arrayList4.get(i11) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(wbVar.getParentActivity(), wbVar.getResourceProvider()), org.telegram.ui.Components.gb1.r(-1, 8));
            } else {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, wbVar.getParentActivity(), wbVar.getResourceProvider(), i11 == 0, i11 == size + (-1));
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.j((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                    g1Var.d(wbVar.getThemedColor(org.telegram.ui.ActionBar.y6.q7), wbVar.getThemedColor(org.telegram.ui.ActionBar.y6.p7));
                }
                Integer num = (Integer) arrayList4.get(i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                g1Var.setOnClickListener(new di.c6(wbVar, i11, arrayList4, num, 1));
            }
            i11++;
            arrayList4 = arrayList;
        }
        fb fbVar = new fb(0, wbVar.X.getContext(), wbVar);
        fbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.Components.gb1.y(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
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
        int Q = wbVar.X.Q();
        if (Q > AndroidUtilities.dp(20.0f)) {
            height += Q;
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

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0361, code lost:
    
        if (r0.exists() != false) goto L127;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X(wb wbVar, int i10, ArrayList arrayList, Integer num) {
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
            org.telegram.messenger.vh.m(R.string.MessageCopied, org.telegram.ui.Components.wc.b0(wbVar));
        } else if (intValue == 4) {
            String str = messageObject.messageOwner.attachPath;
            if (str != null && str.length() > 0 && !org.telegram.ui.Components.b10.t(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                str = wbVar.getFileLoader().getPathToMessage(wbVar.Y.messageOwner).toString();
            }
            int i11 = wbVar.Y.type;
            if (i11 == 3 || i11 == 1) {
                if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && wbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
                    ig.a0 a0Var = wbVar.x;
                    if (a0Var != null) {
                        if (a0Var.N0() < wbVar.x.B() - 1) {
                            int L0 = wbVar.x.L0();
                            wbVar.g0 = L0;
                            org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) wbVar.v.K(L0);
                            if (vl0Var != null) {
                                wbVar.h0 = vl0Var.a.getTop();
                            } else {
                                wbVar.g0 = -1;
                            }
                        } else {
                            wbVar.g0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.x6 u10 = org.telegram.ui.ActionBar.y6.u(file, wbVar.Y.getDocumentName(), null, true);
                    if (u10 != null) {
                        wbVar.presentFragment(new tc1(u10));
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
            if (str3 != null && str3.length() > 0 && !org.telegram.ui.Components.b10.t(str3)) {
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
                    wbVar.showDialog(new org.telegram.ui.Components.cz0(wbVar.getParentActivity(), wbVar, wbVar.Y.getInputStickerSet(), null, null, null));
                    break;
                case 10:
                    if ((Build.VERSION.SDK_INT > 28 && !BuildVars.NO_SCOPED_STORAGE) || wbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        String documentFileName = FileLoader.getDocumentFileName(wbVar.Y.getDocument());
                        if (TextUtils.isEmpty(documentFileName)) {
                            documentFileName = wbVar.Y.getFileName();
                        }
                        String str4 = wbVar.Y.messageOwner.attachPath;
                        if (str4 != null && str4.length() > 0 && !org.telegram.ui.Components.b10.t(str4)) {
                            str4 = null;
                        }
                        if (str4 == null || str4.length() == 0) {
                            str4 = wbVar.getFileLoader().getPathToMessage(wbVar.Y.messageOwner).toString();
                        }
                        MediaController.saveFile(str4, wbVar.getParentActivity(), wbVar.Y.isMusic() ? 3 : 2, documentFileName, wbVar.Y.getDocument() != null ? wbVar.Y.getDocument().mime_type : "");
                        break;
                    } else {
                        wbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        wbVar.Y = null;
                        wbVar.Z = null;
                        return;
                    }
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
                            wbVar.presentFragment(new js(bundle));
                            break;
                        case 16:
                            AndroidUtilities.addToClipboard(messageObject.messageOwner.media.phone_number);
                            org.telegram.messenger.vh.m(R.string.PhoneCopied, org.telegram.ui.Components.wc.b0(wbVar));
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
                                        wbVar.getMessagesController().setParticipantBannedRole(chat2.id, user3, null, wbVar.Z.banned_rights, true, wbVar.getFragmentForAlert(1), new org.telegram.messenger.voip.m0(23, wbVar, user3));
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
                                    if ((wbVar.Y.messageOwner.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.wc.a(wbVar) && (user = wbVar.getMessagesController().getUser(Long.valueOf(wbVar.Y.messageOwner.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.wc.D(wbVar, user, chat2.title).j();
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else {
            String str5 = messageObject.messageOwner.attachPath;
            if (str5 != null && str5.length() > 0 && !org.telegram.ui.Components.b10.t(str5)) {
                str5 = null;
            }
            if (str5 == null || str5.length() == 0) {
                str5 = wbVar.getFileLoader().getPathToMessage(wbVar.Y.messageOwner).toString();
            }
            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && wbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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

    public static void Y(wb wbVar, int i10) {
        ch.f fVar = wbVar.d;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (a8.pf.a(i10, 4)) {
            qi.a e = wbVar.glassEngine.e();
            e.b(wbVar.v.getY(), wbVar.X.getWidth(), wbVar.v.getY() + wbVar.v.getHeight());
            fVar.h(e);
        }
        tb tbVar = wbVar.X;
        Objects.requireNonNull(tbVar);
        fVar.e(new xa(tbVar, 0), wbVar.X.getWidth(), wbVar.X.getHeight());
    }

    public static void Z(wb wbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = wbVar.k0;
        wbVar.s0 = false;
        wbVar.C0.N = false;
        wbVar.X0(false);
        MessagesController.getInstance(wbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(wbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                wbVar.O = Math.min(wbVar.O, tL_channelAdminLogEvent2.id);
                MessageObject messageObject = new MessageObject(wbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, wbVar.f, wbVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.id))) {
                    wbVar.n0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.id);
                    z10 = true;
                }
            }
        }
        if (wbVar.E == null || !z10) {
            return;
        }
        wbVar.S0();
        wbVar.E.l();
    }

    public static void a0(wb wbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
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
                long j10 = wbVar.getMessagesController().telegramAntispamUserId;
                if (wbVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
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

    public static void a1(MessageObject messageObject, int i10) {
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

    public static CharSequence b1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!c3.h0.t(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.x.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.x.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r6.putLong("ban_chat_id", r0.id);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q0(wb wbVar, Bundle bundle, long j10) {
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
            if (MessageObject.getPeerId(channelParticipant.peer) != j10) {
                i10++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public static void w0(wb wbVar, MessageObject messageObject) {
        if (wbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            e2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            e2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        wbVar.showDialog(e2Var);
    }

    public final MessageObject O0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        MessageObject messageObject;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.o0;
            if (i11 >= arrayList2.size()) {
                messageObject = null;
                break;
            }
            messageObject = (MessageObject) arrayList2.get(i11);
            if (messageObject != null && messageObject.contentType == 1 && messageObject.actionDeleteGroupEventId == j10) {
                break;
            }
            i11++;
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
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        messageObject.contentType = 1;
        if (!z11 || arrayList.size() <= 1) {
            messageObject.actionDeleteGroupEventId = -1L;
        } else {
            messageObject.actionDeleteGroupEventId = j10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z11 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new k2.g(2)).distinct().map(new Function() { // from class: org.telegram.ui.bb
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
        }).filter(new cb(i10)).limit(4L).toArray())), "un1", user));
        if (z11 && arrayList.size() > 1) {
            v01 T0 = T0(messageObject.messageText);
            if (T0 == null) {
                T0 = new v01(LocaleController.getString(z10 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.r6 r6Var = T0.a;
                r6Var.x(bold);
                r6Var.w(AndroidUtilities.dp(10.0f));
                if (T0.c != -1) {
                    T0.c = -1;
                    T0.invalidateSelf();
                }
                T0.a(503316480);
            } else {
                T0.a.t(LocaleController.getString(z10 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow), false, true);
            }
            T0.setBounds(0, 0, T0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(0, T0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? (MessageObject) ic.a.g(1, arrayList) : null;
        if (messageObject2 != null) {
            long j12 = messageObject2.eventId;
            a0.h hVar = this.E0;
            if (!hVar.d(j12)) {
                long j13 = messageObject2.eventId;
                int i12 = Q0;
                Q0 = i12 + 1;
                hVar.k(Integer.valueOf(i12), j13);
            }
            messageObject.stableId = ((Integer) hVar.f(messageObject2.eventId)).intValue();
        }
        return messageObject;
    }

    public final void P0(boolean z10) {
        ig.a0 a0Var = this.x;
        if (a0Var == null || this.i0) {
            return;
        }
        int L0 = a0Var.L0();
        if ((L0 == -1 ? 0 : Math.abs(this.x.N0() - L0) + 1) > 0) {
            this.E.getClass();
            if (L0 > (z10 ? 4 : 1) || this.r0 || this.q0) {
                return;
            }
            V0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x01e2, code lost:
    
        if ((r12.currentEvent.action instanceof org.telegram.tgnet.TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0147, code lost:
    
        if (org.telegram.messenger.MediaDataController.getInstance(r22.currentAccount).isStickerPackInstalled(r0.id) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0149, code lost:
    
        r8 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x015d, code lost:
    
        if (org.telegram.messenger.MediaDataController.getInstance(r22.currentAccount).isStickerPackInstalled(r0.short_name) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01d6, code lost:
    
        if (r10.user_id != getMessagesController().telegramAntispamUserId) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01e6, code lost:
    
        if ((r23 instanceof org.telegram.ui.Cells.v0) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e8, code lost:
    
        r0 = new android.text.SpannableString(">");
        r2 = getParentActivity().getResources().getDrawable(org.telegram.messenger.R.drawable.attach_arrow_right).mutate();
        r2.setColorFilter(new android.graphics.PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.y6.Gi), android.graphics.PorterDuff.Mode.MULTIPLY));
        r2.setBounds(0, 0, org.telegram.messenger.AndroidUtilities.dp(10.0f), org.telegram.messenger.AndroidUtilities.dp(10.0f));
        r0.setSpan(new android.text.style.ImageSpan(r2, 2), 0, r0.length(), 33);
        r2 = new android.text.SpannableStringBuilder();
        r2.append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.EventLogFilterGroupInfo)).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) r0).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAdministrators));
        r2.setSpan(new fi.hb(r22, 3), 0, r2.length(), 33);
        r0 = org.telegram.ui.Components.wc.b0(r22).M(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamUser), org.telegram.messenger.AndroidUtilities.replaceCharSequence("%s", org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamInfo2), r2), org.telegram.messenger.R.raw.msg_antispam);
        r0.j = 5000;
        r0.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0285, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0286, code lost:
    
        r0.add(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ReportFalsePositive));
        org.telegram.ui.d3.n(org.telegram.messenger.R.drawable.msg_notspam, 34, r9, r6);
        r3 = null;
        r0.add(null);
        r9.add(null);
        r6.add(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05c8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q0(View view, float f7, float f10) {
        Integer num;
        String str;
        boolean z10;
        Integer num2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        boolean z11;
        ArrayList arrayList;
        ua uaVar;
        ArrayList arrayList2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction;
        TLRPC.Message message;
        TLRPC.User user;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        char c10 = '\n';
        MessageObject messageObject = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject() : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject() : null;
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
                                org.telegram.ui.Components.n70 n70Var = new org.telegram.ui.Components.n70(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().getChatFull(chat3.id), null, this, chat3.id, false, ChatObject.isChannelAndNotMegaGroup(chat3));
                                n70Var.k0 = false;
                                n70Var.show();
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
                        d3.n(R.drawable.msg_copy, 3, arrayList5, arrayList4);
                    }
                    if (c10 == z10) {
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
                                    showDialog(new org.telegram.ui.Components.cz0(getParentActivity(), this, inputStickerSet3, null, null, null));
                                    return true;
                                }
                                arrayList = arrayList3;
                                chat2 = chat;
                                z11 = false;
                                arrayList2 = arrayList;
                                uaVar = new ua(this, arrayList4, arrayList2, arrayList5, view, f7, f10);
                                if (ChatObject.canBlockUsers(chat2) && (tL_channelAdminLogEvent = messageObject.currentEvent) != null) {
                                    channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                                    if ((!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = messageObject.messageOwner) != null && message.from_id != null && (user = getMessagesController().getUser(Long.valueOf(this.Y.messageOwner.from_id.user_id))) != null && !UserObject.isUserSelf(user)) {
                                        MessagesController messagesController = getMessagesController();
                                        Utilities.Callback<TLRPC.ChannelParticipant> b3Var = new bi.b3(this, arrayList2, arrayList5, arrayList4, uaVar, 1);
                                        uaVar = uaVar;
                                        messagesController.getChannelParticipant(chat2, user, b3Var);
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    return true;
                                }
                                uaVar.run();
                                return true;
                            }
                        }
                        if (tL_channelAdminLogEvent4 == null || !(tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                            chat2 = chat;
                            z11 = false;
                            if (tL_channelAdminLogEvent4 != null && (tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && ChatObject.canUserDoAdminAction(chat2, 13)) {
                                org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(getParentActivity(), chat2);
                                oqVar.w = new eb(this);
                                showDialog(oqVar);
                            }
                        } else {
                            chat2 = chat;
                            z11 = false;
                            f70 f70Var = new f70(chat2.id, 0);
                            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat2.id);
                            if (chatFull != null) {
                                f70Var.f0(chatFull);
                                presentFragment(f70Var);
                            }
                        }
                    } else {
                        chat2 = chat;
                        z11 = false;
                        if (c10 == 3) {
                            TLRPC.MessageMedia messageMedia = this.Y.messageOwner.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.isNewGifDocument(messageMedia.webpage.document)) {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGIFs));
                                d3.r(R.drawable.msg_gif, arrayList5, arrayList4, 11);
                            }
                        } else if (c10 != 4) {
                            Integer num3 = num;
                            if (c10 == 5) {
                                arrayList3.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                                d3.r(R.drawable.msg_language, arrayList5, arrayList4, 5);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                d3.r(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                d3.r(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c10 == '\n') {
                                arrayList3.add(LocaleController.getString(R.string.ApplyThemeFile));
                                d3.r(R.drawable.msg_theme, arrayList5, arrayList4, 5);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                d3.r(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                d3.r(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c10 == 6) {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                                d3.n(R.drawable.msg_gallery, 7, arrayList5, arrayList4);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                d3.r(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                d3.r(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c10 == 7) {
                                if (this.Y.isMask()) {
                                    arrayList3.add(LocaleController.getString(R.string.AddToMasks));
                                } else {
                                    arrayList3.add(LocaleController.getString(R.string.AddToStickers));
                                }
                                d3.n(R.drawable.msg_sticker, 9, arrayList5, arrayList4);
                            } else if (c10 == '\b') {
                                long j10 = this.Y.messageOwner.media.user_id;
                                TLRPC.User user3 = j10 != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)) : user2;
                                if (user3 != null && user3.id != UserConfig.getInstance(this.currentAccount).getClientUserId() && ContactsController.getInstance(this.currentAccount).contactsDict.get(Long.valueOf(user3.id)) == null) {
                                    arrayList3.add(LocaleController.getString(R.string.AddContactTitle));
                                    d3.n(R.drawable.msg_addcontact, 15, arrayList5, arrayList4);
                                }
                                if (!TextUtils.isEmpty(this.Y.messageOwner.media.phone_number)) {
                                    arrayList3.add(LocaleController.getString(R.string.Copy));
                                    d3.n(R.drawable.msg_copy, 16, arrayList5, arrayList4);
                                    arrayList3.add(LocaleController.getString(R.string.Call));
                                    d3.n(R.drawable.msg_calls, 17, arrayList5, arrayList4);
                                }
                            }
                        } else if (this.Y.isVideo()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                            d3.r(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            d3.r(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else if (this.Y.isMusic()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToMusic));
                            d3.r(R.drawable.msg_download, arrayList5, arrayList4, num);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            d3.r(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else {
                            Integer num4 = num;
                            if (this.Y.getDocument() != null) {
                                if (MessageObject.isNewGifDocument(this.Y.getDocument())) {
                                    arrayList3.add(LocaleController.getString(R.string.SaveToGIFs));
                                    d3.r(R.drawable.msg_gif, arrayList5, arrayList4, 11);
                                }
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                d3.r(R.drawable.msg_download, arrayList5, arrayList4, num4);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                d3.r(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                                d3.r(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            }
                        }
                    }
                    arrayList = arrayList3;
                    arrayList2 = arrayList;
                    uaVar = new ua(this, arrayList4, arrayList2, arrayList5, view, f7, f10);
                    if (ChatObject.canBlockUsers(chat2)) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                        }
                        MessagesController messagesController2 = getMessagesController();
                        Utilities.Callback<TLRPC.ChannelParticipant> b3Var2 = new bi.b3(this, arrayList2, arrayList5, arrayList4, uaVar, 1);
                        uaVar = uaVar;
                        messagesController2.getChannelParticipant(chat2, user, b3Var2);
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

    public final TextureView R0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.d0 == null) {
            k0 k0Var = new k0(this, getParentActivity(), 4);
            this.d0 = k0Var;
            k0Var.setOutlineProvider(new ag.v0(10));
            this.d0.setClipToOutline(true);
            this.d0.setWillNotDraw(false);
            this.d0.setVisibility(4);
            m4 m4Var = new m4(getParentActivity());
            this.e0 = m4Var;
            m4Var.setBackgroundColor(0);
            if (z10) {
                this.d0.addView(this.e0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f0 = textureView;
            textureView.setOpaque(false);
            this.e0.addView(this.f0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        }
        if (this.d0.getParent() == null) {
            tb tbVar = this.X;
            k0 k0Var2 = this.d0;
            int i10 = AndroidUtilities.roundMessageSize;
            tbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.d0.setVisibility(4);
        this.e0.setDrawingReady(false);
        return this.f0;
    }

    public final void S0() {
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
            long j10 = (messageObject == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (messageObject.stableId <= 0) {
                int i11 = Q0;
                Q0 = i11 + 1;
                messageObject.stableId = i11;
            }
            int i12 = i10 + 1;
            MessageObject messageObject2 = i12 < arrayList4.size() ? (MessageObject) arrayList4.get(i12) : null;
            long j11 = (messageObject2 == null || (tL_channelAdminLogEvent = messageObject2.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j10 != 0) {
                arrayList3.add(messageObject);
            } else {
                arrayList2.add(messageObject);
            }
            if (j10 == j11 || arrayList3.isEmpty()) {
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
                    MessageObject messageObject3 = (MessageObject) ic.a.g(1, arrayList3);
                    boolean z11 = TextUtils.isEmpty(this.v0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(messageObject3.eventId);
                    HashSet hashSet = this.p0;
                    if (hashSet.contains(valueOf) || !z11) {
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            a1((MessageObject) arrayList3.get(i13), 0);
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        a1(messageObject3, arrayList3.size() - 1);
                        arrayList2.add(messageObject3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = messageObject3.messageOwner.reply_markup;
                    if (z10 != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        messageObject3.forceUpdate = true;
                        this.E.m((z10 ? arrayList3.size() - 1 : 0) + size);
                        this.E.m(size + (z10 ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j12 = messageObject.eventId;
                    MessageObject O0 = O0(j12, messageObject.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11);
                    arrayList = arrayList3;
                    arrayList2.add(O0);
                }
                if (!arrayList6.isEmpty()) {
                    MessageObject messageObject4 = (MessageObject) ic.a.g(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(O0(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i10 = i12;
            arrayList3 = arrayList;
        }
    }

    public final void U0(boolean z10) {
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
            this.R.addListener(new kg.e(this, 22));
            this.R.setStartDelay(500L);
            this.R.start();
        }
    }

    public final void V0(boolean z10) {
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
            S0();
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
        c1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ya(this, 3));
        if (!z10 || (sbVar = this.E) == null) {
            return;
        }
        sbVar.l();
    }

    public final void W0() {
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

    public final void X0(boolean z10) {
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
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                int top = childAt.getTop();
                if (z10) {
                    if (top >= i10) {
                    }
                    i10 = childAt.getTop();
                    view = childAt;
                    i11 = R;
                } else {
                    if (top <= i10) {
                    }
                    i10 = childAt.getTop();
                    view = childAt;
                    i11 = R;
                }
            }
        }
        if (view != null) {
            this.M0 = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject().eventId : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject().eventId : 0L;
            this.N0 = i11;
            this.O0 = (this.v.getMeasuredHeight() - view.getBottom()) - this.v.getPaddingBottom();
        }
    }

    public final int Y0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        int findQuoteStart;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (TextUtils.isEmpty(null)) {
            org.telegram.ui.Cells.s1 s1Var2 = this.J0;
            if (s1Var2 != null) {
                s1Var2.ye = 0;
                s1Var2.ze = null;
            }
        } else {
            if (TextUtils.isEmpty(messageObject.caption) || (s1Var = this.J0) == null || (textLayoutBlocks = s1Var.c4) == null) {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.s1 s1Var3 = this.J0;
                if (s1Var3 == null || !s1Var3.t1) {
                    charSequence = charSequence2;
                    i10 = 0;
                } else {
                    i10 = s1Var3.m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                i10 = (int) s1Var.q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            }
            org.telegram.ui.Cells.s1 s1Var4 = this.J0;
            if (s1Var4 != null) {
                s1Var4.ye = 0;
                s1Var4.ze = null;
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
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e A[LOOP:1: B:31:0x0098->B:42:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(MessageObject messageObject) {
        int i10;
        int i11;
        int indexOf;
        boolean z10;
        float f7;
        int g12;
        MessageObject messageObject2;
        ArrayList arrayList = this.o0;
        boolean z11 = true;
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
                            e1();
                            int childCount = this.v.getChildCount();
                            int i13 = 0;
                            boolean z12 = false;
                            int i14 = 0;
                            while (true) {
                                if (i13 >= childCount) {
                                    z10 = z11;
                                    f7 = 2.0f;
                                    break;
                                }
                                View childAt = this.v.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.s1) {
                                    MessageObject messageObject4 = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                                    z10 = z11;
                                    if (messageObject4 != null) {
                                        f7 = 2.0f;
                                        if (messageObject4.getRealId() == messageObject.getRealId()) {
                                            childAt.sendAccessibilityEvent(8);
                                            i14 = Y0(messageObject4);
                                            z12 = z10;
                                        }
                                    } else {
                                        f7 = 2.0f;
                                    }
                                    if (z12) {
                                        i13++;
                                        z11 = z10;
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
                                    z10 = z11;
                                    f7 = 2.0f;
                                    if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject2 = ((org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null && messageObject2.getRealId() == messageObject.getRealId()) {
                                        childAt.sendAccessibilityEvent(8);
                                        z12 = z10;
                                    }
                                    if (z12) {
                                    }
                                }
                            }
                            if (z12) {
                                return;
                            }
                            boolean z13 = !TextUtils.isEmpty(null);
                            if (getParentActivity() == null) {
                                g12 = 0;
                            } else {
                                if (this.J0 == null) {
                                    this.J0 = new org.telegram.ui.Cells.s1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.s1 s1Var = this.J0;
                                TLRPC.Chat chat = this.f;
                                s1Var.N7 = chat != null ? z10 : false;
                                s1Var.S7 = (ChatObject.isChannel(chat) && chat.megagroup) ? z10 : false;
                                g12 = this.J0.g1(messageObject, null, z13);
                            }
                            int max = Math.max(-AndroidUtilities.dp(f7), (this.v.getMeasuredHeight() - g12) / 2) - Y0(messageObject);
                            vb vbVar = this.L0;
                            vbVar.c = messageObject;
                            vbVar.g = max;
                            org.telegram.ui.Components.pl0 pl0Var = this.y;
                            pl0Var.b = i10;
                            vbVar.d = indexOf2;
                            vbVar.f = max;
                            vbVar.e = false;
                            pl0Var.c(indexOf2, max, false, false);
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.De));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Za));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ya));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Xa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Wa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Va));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ua));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    public final void c1() {
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
                this.L.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.L.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.s1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.y6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 1));
        org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(context, null, false, null);
        this.I = poVar;
        fl flVar = poVar.h;
        if (flVar != null) {
            flVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        fl flVar2 = poVar.r;
        if (flVar2 != null) {
            flVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        poVar.k0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, org.telegram.ui.Components.gb1.h(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 1);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.po poVar2 = this.I;
        TLRPC.Chat chat = this.f;
        poVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        kb kbVar = new kb(this, context);
        this.fragmentView = kbVar;
        this.X = kbVar;
        kbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.U(org.telegram.ui.ActionBar.y6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        fh.e p10 = gh.c.p(this.resourceProvider);
        ch.b bVar = this.c;
        kVar.I(bVar, p10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, org.telegram.ui.Components.gb1.i(-1, -2, 17));
        this.H.setOnTouchListener(new ei.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.l6(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.y6.f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, org.telegram.ui.Components.gb1.x(54, 54, 17, 16, 20, 16, -4));
        bi.md mdVar = new bi.md(context, 10);
        this.L = mdVar;
        mdVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        bi.md mdVar2 = this.L;
        int i11 = org.telegram.ui.ActionBar.y6.ic;
        org.telegram.ui.ActionBar.f7.V(mdVar2, i11, null);
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, org.telegram.ui.Components.gb1.x(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, org.telegram.ui.Components.gb1.h(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        lb lbVar = new lb(this, context);
        this.v = lbVar;
        lbVar.setOnItemClickListener(new f(this, 8));
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
        ig.a0 a0Var = new ig.a0(this);
        this.x = a0Var;
        a0Var.k1(1);
        this.x.m1(true);
        this.v.setLayoutManager(this.x);
        org.telegram.ui.Components.pl0 pl0Var = new org.telegram.ui.Components.pl0(this.v, this.x);
        this.y = pl0Var;
        pl0Var.h = new ab(this);
        pl0Var.i = this.L0;
        this.X.addView(this.v, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.v.setOnScrollListener(new i3(this));
        this.glassEngine.b(this.v);
        int i14 = this.g0;
        if (i14 != -1) {
            this.x.h1(i14, this.h0);
            this.g0 = -1;
        }
        lh.f fVar = new lh.f(context);
        this.W = fVar;
        fVar.setup(this.b);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.n, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new org.telegram.ui.ActionBar.l6(this.r, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.f2));
        this.n.addView(this.r, org.telegram.ui.Components.gb1.i(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.s.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.n.addView(this.s, org.telegram.ui.Components.gb1.i(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.M = v0Var;
        v0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourceProvider;
        lh.e eVar = new lh.e(context, bVar, gh.c.b(u6Var), u6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        lh.e eVar2 = this.G;
        eh.d c10 = eVar2.n.c(eVar2, null, false);
        c10.v(eVar2.r);
        org.telegram.messenger.vh.s(c10, AndroidUtilities.dp(22.0f), 6.0f);
        eVar2.v = c10;
        this.X.addView(this.G, org.telegram.ui.Components.gb1.h(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
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
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        wbVar2.showDialog(e2Var);
                        break;
                    default:
                        wb wbVar3 = this.b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.g5.o(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.V(this.F, org.telegram.ui.ActionBar.y6.Ae, null);
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, org.telegram.ui.Components.gb1.i(-2, -2, 17));
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
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        wbVar2.showDialog(e2Var);
                        break;
                    default:
                        wb wbVar3 = this.b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.g5.o(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).a);
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
        this.X.addView(this.a0, org.telegram.ui.Components.gb1.i(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.b0.setImageResource(R.drawable.msg_calendar);
        org.telegram.ui.ActionBar.f7.t(this.b0, org.telegram.ui.ActionBar.y6.xe, null, PorterDuff.Mode.MULTIPLY);
        this.a0.addView(this.b0, org.telegram.ui.Components.gb1.i(48, 48, 53));
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
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        wbVar2.showDialog(e2Var);
                        break;
                    default:
                        wb wbVar3 = this.b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.g5.o(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.c0 = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.ye, null);
        this.c0.setTextSize(15);
        this.c0.setTypeface(AndroidUtilities.bold());
        this.a0.addView(this.c0, org.telegram.ui.Components.gb1.h(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.r0 && this.n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, true, 0.3f, true);
            this.v.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, false, 0.3f, true);
            this.v.setEmptyView(this.H);
        }
        lb lbVar5 = this.v;
        lbVar5.W1 = true;
        lbVar5.X1 = 1;
        UndoView undoView = new UndoView(context);
        this.w = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.w, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        lb lbVar = this.v;
        if (lbVar == null) {
            return;
        }
        int childCount = lbVar.getChildCount();
        int measuredHeight = this.v.getMeasuredHeight();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        int i11 = Integer.MAX_VALUE;
        boolean z11 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.v.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                t1Var.f = y3;
                t1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                int top = s1Var.getTop();
                s1Var.getBottom();
                int i13 = top >= 0 ? 0 : -top;
                int measuredHeight2 = s1Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i13 + measuredHeight;
                }
                s1Var.d4(i13, measuredHeight2 - i13, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.v.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject = s1Var.getMessageObject();
                if (this.d0 != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = s1Var.getPhotoImage();
                    this.d0.setTranslationX(photoImage.getImageX());
                    this.d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.Y((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (v0Var.J()) {
                    v0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.v.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.s1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        view = childAt;
                    }
                    i10 = bottom;
                    view3 = childAt;
                }
                mb mbVar = this.C0;
                if ((mbVar == null || (!mbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().isDateObject) {
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
        k0 k0Var = this.d0;
        if (k0Var != null) {
            if (z11) {
                MediaController.getInstance().setCurrentVideoVisible(true);
            } else {
                k0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.V) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            }
        }
        if (view != null) {
            this.M.W((view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject() : ((org.telegram.ui.Cells.v0) view).getMessageObject()).messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view3 instanceof org.telegram.ui.Cells.s1) && !(view3 instanceof org.telegram.ui.Cells.v0)) {
            z10 = true;
        }
        this.Q = z10;
        if (view2 == null) {
            U0(true);
            this.M.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.v.getPaddingTop() || this.Q) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            U0(true ^ this.Q);
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.s1 s1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.s1 s1Var3;
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
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null) {
                            if (messageObject.isVoice() || messageObject.isMusic()) {
                                s1Var.o4(false, true, false);
                            } else if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                s1Var.e1(null, true);
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
                this.X.U(org.telegram.ui.ActionBar.y6.s0());
                this.r.invalidate();
                bi.md mdVar = this.L;
                if (mdVar != null) {
                    mdVar.invalidate();
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
                    if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject2 = (s1Var2 = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null) {
                            messageObject2.audioProgress = playingMessageObject.audioProgress;
                            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                            s1Var2.s4();
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
            MediaController.getInstance().setTextureView(R0(true), this.e0, this.d0, true);
            int childCount3 = this.v.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount3) {
                    z10 = false;
                    break;
                }
                View childAt3 = this.v.getChildAt(i14);
                if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt3;
                    MessageObject messageObject4 = s1Var4.getMessageObject();
                    if (this.d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                        ImageReceiver photoImage = s1Var4.getPhotoImage();
                        this.d0.setTranslationX(photoImage.getImageX());
                        this.d0.setTranslationY(photoImage.getImageY() + s1Var4.getTop() + this.fragmentView.getPaddingTop());
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
                if ((childAt4 instanceof org.telegram.ui.Cells.s1) && (messageObject3 = (s1Var3 = (org.telegram.ui.Cells.s1) childAt4).getMessageObject()) != null) {
                    if (messageObject3.isVoice() || messageObject3.isMusic()) {
                        s1Var3.o4(false, true, false);
                    } else if (messageObject3.isRoundVideo()) {
                        s1Var3.e1(null, false);
                        if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                            messageObject3.resetPlayingProgress();
                            s1Var3.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e1() {
        lb lbVar = this.v;
        if (lbVar == null) {
            return;
        }
        int childCount = lbVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.v.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                MessageObject messageObject = s1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.q()) {
                        s1Var.setDrawSelectionBackground(false);
                        s1Var.L3(false, true);
                        s1Var.N3(false, false, true);
                    }
                    s1Var.setHighlighted(this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0);
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
                        s1Var.U3(null);
                    } else {
                        s1Var.U3(this.v0);
                    }
                    s1Var.setSpoilersSuppressed(this.v.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.setMessageObject(v0Var.getMessageObject());
                v0Var.setSpoilersSuppressed(this.v.getScrollState() != 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.I.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.bb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ed));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ib));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.fd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.jb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.wb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.yb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.xb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.pe));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 131072, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fe));
        View view = this.r;
        int i10 = org.telegram.ui.ActionBar.y6.lc;
        arrayList.add(new org.telegram.ui.ActionBar.h7(view, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.L, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.w;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        V0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ya(this, 4)), this.classGuid);
        setBulletinDelegate(new fi.k8(6));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        tb tbVar = this.X;
        if (tbVar != null) {
            org.telegram.ui.Components.x91 x91Var = tbVar.v;
            if (x91Var != null) {
                x91Var.c(false);
            }
            tbVar.F = true;
        }
        UndoView undoView = this.w;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.i0 = true;
        this.j0 = true;
        c2.b bVar = c2.b.e;
        if (bVar == null || !bVar.a) {
            return;
        }
        c2.b m10 = c2.b.m();
        if (m10.a) {
            v4 v4Var = (v4) m10.d;
            int i10 = f5.F;
            v4Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        tb tbVar = this.X;
        if (tbVar != null) {
            org.telegram.ui.Components.x91 x91Var = tbVar.v;
            if (x91Var != null) {
                x91Var.c(true);
            }
            tbVar.F = false;
        }
        this.i0 = false;
        P0(false);
        if (this.j0) {
            this.j0 = false;
            sb sbVar = this.E;
            if (sbVar != null) {
                sbVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ic, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.x0.unlock();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.x0.lock();
        }
    }
}
