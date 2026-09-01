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
import java.util.Iterator;
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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sb extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static int U0 = 10;
    public static final int[] V0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public HashMap A0;
    public hb B;
    public boolean B0;
    public UndoView C;
    public final db C0;
    public k D;
    public ib D0;
    public c2.y E;
    public final ArrayList E0;
    public ob F;
    public final a0.h F0;
    public TextView G;
    public bb G0;
    public xg.e H;
    public int H0;
    public FrameLayout I;
    public int I0;
    public org.telegram.ui.Components.bo J;
    public va J0;
    public LinearLayout K;
    public org.telegram.ui.Cells.t1 K0;
    public ImageView L;
    public int L0;
    public hg.q M;
    public final rb M0;
    public org.telegram.ui.Cells.v0 N;
    public long N0;
    public org.telegram.ui.ActionBar.w0 O;
    public int O0;
    public long P;
    public int P0;
    public boolean Q;
    public lf.e0 Q0;
    public boolean R;
    public final ArrayList R0;
    public AnimatorSet S;
    public final ArrayList S0;
    public boolean T;
    public final RectF T0;
    public final int[] U;
    public boolean V;
    public boolean W;
    public xg.f X;
    public pb Y;
    public MessageObject Z;
    public final tg.e a;
    public TLRPC.ChannelParticipant a0;
    public final og.a b;
    public FrameLayout b0;
    public final tg.d c;
    public ImageView c0;
    public final tg.d d;
    public org.telegram.ui.ActionBar.l5 d0;
    public final og.a e;
    public l0 e0;
    public final og.a f;
    public o4 f0;
    public TextureView g0;
    public final be.b h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final a0.h l0;
    public final a0.h m0;
    public final og.e n;
    public final HashMap n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final HashSet q0;
    public final int r;
    public boolean r0;
    public final TLRPC.Chat s;
    public boolean s0;
    public boolean t0;
    public ArrayList u0;
    public final ArrayList v;
    public TLRPC.TL_channelAdminLogEventsFilter v0;
    public FrameLayout w;
    public String w0;
    public View x;
    public a0.h x0;
    public RadialProgressView y;
    public final AnimationNotificationsLocker y0;
    public final HashMap z0;

    public sb(TLRPC.Chat chat) {
        super(null);
        be.b bVar = new be.b(true);
        this.h = bVar;
        this.v = new ArrayList();
        this.U = new int[]{2};
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = false;
        this.l0 = new a0.h();
        this.m0 = new a0.h();
        this.n0 = new HashMap();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new HashSet();
        this.v0 = null;
        this.w0 = "";
        this.y0 = new AnimationNotificationsLocker(V0);
        this.z0 = new HashMap();
        this.C0 = new db(this);
        this.E0 = new ArrayList();
        this.F0 = new a0.h();
        this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.I0 = -1;
        this.M0 = new rb(this);
        this.O0 = -1;
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new RectF();
        tg.e eVar = new tg.e();
        this.a = eVar;
        og.a aVar = new og.a(eVar);
        this.b = aVar;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.n = null;
            this.r = 0;
            this.c = null;
            this.d = null;
            this.e = new og.a(eVar);
            this.f = new og.a(eVar);
        } else {
            og.e eVar2 = new og.e(false);
            this.n = eVar2;
            tg.d dVar = new tg.d(eVar);
            this.d = dVar;
            dVar.v = new va(this, 3);
            dVar.d = eVar2;
            dVar.e = -3;
            dVar.f = eVar;
            og.a aVar2 = new og.a(dVar);
            this.f = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                tg.d dVar2 = new tg.d(eVar);
                this.c = dVar2;
                dVar2.v = new va(this, 3);
                dVar2.d = eVar2;
                dVar2.e = -2;
                dVar2.f = eVar;
                og.a aVar3 = new og.a(dVar2);
                this.e = aVar3;
                aVar3.f = LiteMode.isEnabled(262144);
                this.r = 0;
            } else {
                this.c = null;
                this.e = aVar2;
                this.r = AndroidUtilities.dp(48.0f);
            }
        }
        aVar.c = bVar;
        this.e.c = bVar;
        this.f.c = bVar;
        this.s = chat;
    }

    public static void A0(sb sbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = sbVar.getMessagesController();
        TLRPC.Chat chat = sbVar.s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.id);
        org.telegram.ui.Components.u60 u60Var = new org.telegram.ui.Components.u60(sbVar.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, sbVar, chatFull.id, false, ChatObject.isChannel(chat));
        u60Var.g0 = new eb(sbVar);
        u60Var.show();
    }

    public static void K0(sb sbVar) {
        if (sbVar.B == null || sbVar.o0.isEmpty()) {
            return;
        }
        sbVar.D.h1(sbVar.p0.size() - 1, (-100000) - sbVar.B.getPaddingTop());
    }

    public static t01 S0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.oq oqVar : (org.telegram.ui.Components.oq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.oq.class)) {
            if (oqVar != null) {
                Drawable drawable = oqVar.drawable;
                if (drawable instanceof t01) {
                    return (t01) drawable;
                }
            }
        }
        return null;
    }

    public static void U(sb sbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = sbVar.l0;
        int i10 = 0;
        sbVar.D0.N = false;
        sbVar.X0(false);
        MessagesController.getInstance(sbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(sbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = sbVar.o0;
        boolean z4 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                sbVar.P = Math.min(sbVar.P, tL_channelAdminLogEvent.id);
                MessageObject messageObject2 = new MessageObject(sbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) sbVar.n0, sbVar.s, sbVar.U, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.id);
                }
                z4 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                sbVar.m0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(sbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -sbVar.s.id, 0, 0L, new va(sbVar, 1), sbVar.getClassGuid(), null);
        }
        sbVar.R0();
        sbVar.s0 = false;
        if (!z4) {
            sbVar.r0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(sbVar.w, false, 0.3f, true);
        sbVar.B.setEmptyView(sbVar.I);
        ob obVar = sbVar.F;
        if (obVar != null) {
            obVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = sbVar.O;
        if (w0Var != null) {
            if (sbVar.p0.isEmpty() && TextUtils.isEmpty(sbVar.w0)) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
        }
    }

    public static void V(sb sbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || sbVar.getParentActivity() == null) {
            return;
        }
        int i10 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, sbVar.getParentActivity(), sbVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        Rect rect = new Rect();
        sbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(sbVar.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            if (arrayList4.get(i11) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.m1(sbVar.getParentActivity(), sbVar.getResourceProvider()), k7.c6.n(-1, 8));
            } else {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, sbVar.getParentActivity(), sbVar.getResourceProvider(), i11 == 0, i11 == size + (-1));
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                    g1Var.c(sbVar.getThemedColor(org.telegram.ui.ActionBar.k6.q7), sbVar.getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                }
                Integer num = (Integer) arrayList4.get(i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                g1Var.setOnClickListener(new oh.o5(sbVar, i11, arrayList4, num, 1));
            }
            i11++;
            arrayList4 = arrayList;
        }
        ab abVar = new ab(0, sbVar.Y.getContext(), sbVar);
        abVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.c6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        abVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        bb bbVar = new bb(sbVar, abVar);
        sbVar.G0 = bbVar;
        bbVar.e = true;
        bbVar.c = 220;
        bbVar.setOutsideTouchable(true);
        sbVar.G0.setClippingEnabled(true);
        sbVar.G0.setAnimationStyle(R.style.PopupContextAnimation);
        sbVar.G0.setFocusable(true);
        abVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        sbVar.G0.setInputMethodMode(2);
        sbVar.G0.setSoftInputMode(48);
        sbVar.G0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f10)) - abVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
        if (left < AndroidUtilities.dp(6.0f)) {
            left = AndroidUtilities.dp(6.0f);
        } else if (left > (sbVar.B.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - abVar.getMeasuredWidth()) {
            left = (sbVar.B.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - abVar.getMeasuredWidth();
        }
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            sbVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = sbVar.Y.getHeight();
        int dp = AndroidUtilities.dp(48.0f) + abVar.getMeasuredHeight();
        int R = sbVar.Y.R();
        if (R > AndroidUtilities.dp(20.0f)) {
            height += R;
        }
        if (dp < height) {
            int y10 = (int) (sbVar.B.getY() + view.getTop() + f11);
            i10 = (dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f) ? (AndroidUtilities.dp(240.0f) - dp) + y10 : y10;
            if (i10 < sbVar.B.getY() + AndroidUtilities.dp(24.0f)) {
                i10 = (int) (sbVar.B.getY() + AndroidUtilities.dp(24.0f));
            } else {
                int i12 = height - dp;
                if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                    i10 = i12 - AndroidUtilities.dp(8.0f);
                }
            }
        } else if (!sbVar.inBubbleMode) {
            i10 = AndroidUtilities.statusBarHeight;
        }
        abVar.setMaxHeight(height - i10);
        sbVar.G0.showAtLocation(sbVar.B, 51, left, i10);
        sbVar.G0.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x036a, code lost:
    
        if (r0.exists() != false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(sb sbVar, int i10, ArrayList arrayList, Integer num) {
        TLRPC.Chat chat;
        File file;
        TLRPC.User user;
        if (sbVar.Z == null || i10 >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        TLRPC.Chat chat2 = sbVar.s;
        bb bbVar = sbVar.G0;
        if (bbVar != null) {
            bbVar.dismiss();
        }
        MessageObject messageObject = sbVar.Z;
        if (messageObject == null) {
            return;
        }
        if (intValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long fromChatId = messageObject.getFromChatId();
            if (0 != fromChatId) {
                if (fromChatId > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(sbVar.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user2 != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user2.first_name, user2.last_name)).append((CharSequence) ":\n");
                    }
                } else if (fromChatId < 0 && (chat = MessagesController.getInstance(sbVar.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(messageObject.messageText)) {
                spannableStringBuilder.append((CharSequence) messageObject.messageOwner.message);
            } else {
                spannableStringBuilder.append(messageObject.messageText);
            }
            AndroidUtilities.addToClipboard(spannableStringBuilder);
            b.m(R.string.MessageCopied, org.telegram.ui.Components.qc.a0(sbVar));
        } else if (intValue == 4) {
            String str = messageObject.messageOwner.attachPath;
            if (str != null && str.length() > 0 && !e2.c.t(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                str = sbVar.getFileLoader().getPathToMessage(sbVar.Z.messageOwner).toString();
            }
            int i11 = sbVar.Z.type;
            if (i11 == 3 || i11 == 1) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23 && ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && sbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                    sbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    sbVar.Z = null;
                    sbVar.a0 = null;
                    return;
                }
                MediaController.saveFile(str, sbVar.getParentActivity(), sbVar.Z.type == 3 ? 1 : 0, null, null);
            }
        } else if (intValue == 5) {
            String str2 = messageObject.messageOwner.attachPath;
            if (str2 != null && str2.length() != 0) {
                file = new File(sbVar.Z.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage = sbVar.getFileLoader().getPathToMessage(sbVar.Z.messageOwner);
                if (pathToMessage.exists()) {
                    file = pathToMessage;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    k kVar = sbVar.D;
                    if (kVar != null) {
                        if (kVar.N0() < sbVar.D.B() - 1) {
                            int L0 = sbVar.D.L0();
                            sbVar.h0 = L0;
                            org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) sbVar.B.K(L0);
                            if (fl0Var != null) {
                                sbVar.i0 = fl0Var.a.getTop();
                            } else {
                                sbVar.h0 = -1;
                            }
                        } else {
                            sbVar.h0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.j6 u10 = org.telegram.ui.ActionBar.k6.u(file, sbVar.Z.getDocumentName(), null, true);
                    if (u10 != null) {
                        sbVar.presentFragment(new ed1(u10));
                    } else {
                        sbVar.h0 = -1;
                        if (sbVar.getParentActivity() == null) {
                            sbVar.Z = null;
                            sbVar.a0 = null;
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.IncorrectTheme);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            sbVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                } else if (LocaleController.getInstance().applyLanguageFile(file, sbVar.currentAccount)) {
                    sbVar.presentFragment(new LanguageSelectActivity());
                } else if (sbVar.getParentActivity() == null) {
                    sbVar.Z = null;
                    sbVar.a0 = null;
                    return;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sbVar.getParentActivity());
                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.IncorrectLocalization);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    sbVar.showDialog(alertDialog$Builder2.a);
                }
            }
        } else if (intValue == 6) {
            String str3 = messageObject.messageOwner.attachPath;
            if (str3 != null && str3.length() > 0 && !e2.c.t(str3)) {
                str3 = null;
            }
            if (str3 == null || str3.length() == 0) {
                str3 = sbVar.getFileLoader().getPathToMessage(sbVar.Z.messageOwner).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(sbVar.Z.getDocument().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(sbVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", new File(str3)));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
            }
            try {
                sbVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            } catch (Exception unused2) {
            }
        } else if (intValue != 7) {
            switch (intValue) {
                case 9:
                    sbVar.showDialog(new org.telegram.ui.Components.yx0(sbVar.getParentActivity(), sbVar, sbVar.Z.getInputStickerSet(), null, null, null));
                    break;
                case 10:
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 23 && ((i13 <= 28 || BuildVars.NO_SCOPED_STORAGE) && sbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                        sbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        sbVar.Z = null;
                        sbVar.a0 = null;
                        return;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(sbVar.Z.getDocument());
                    if (TextUtils.isEmpty(documentFileName)) {
                        documentFileName = sbVar.Z.getFileName();
                    }
                    String str4 = sbVar.Z.messageOwner.attachPath;
                    if (str4 != null && str4.length() > 0 && !e2.c.t(str4)) {
                        str4 = null;
                    }
                    if (str4 == null || str4.length() == 0) {
                        str4 = sbVar.getFileLoader().getPathToMessage(sbVar.Z.messageOwner).toString();
                    }
                    MediaController.saveFile(str4, sbVar.getParentActivity(), sbVar.Z.isMusic() ? 3 : 2, documentFileName, sbVar.Z.getDocument() != null ? sbVar.Z.getDocument().mime_type : "");
                    break;
                case 11:
                    MessagesController.getInstance(sbVar.currentAccount).saveGif(sbVar.Z, messageObject.getDocument());
                    break;
                default:
                    switch (intValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", sbVar.Z.messageOwner.media.user_id);
                            bundle.putString("phone", sbVar.Z.messageOwner.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            sbVar.presentFragment(new os(bundle));
                            break;
                        case 16:
                            AndroidUtilities.addToClipboard(messageObject.messageOwner.media.phone_number);
                            b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(sbVar));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + sbVar.Z.messageOwner.media.phone_number));
                                intent2.addFlags(TLObject.FLAG_28);
                                sbVar.getParentActivity().startActivityForResult(intent2, 500);
                                break;
                            } catch (Exception e6) {
                                FileLog.e(e6);
                                break;
                            }
                        default:
                            switch (intValue) {
                                case 33:
                                    if (sbVar.a0 != null) {
                                        TLRPC.User user3 = sbVar.getMessagesController().getUser(Long.valueOf(DialogObject.getPeerDialogId(sbVar.a0.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = sbVar.a0;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = sbVar.a0.banned_rights;
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
                                        sbVar.getMessagesController().setParticipantBannedRole(chat2.id, user3, null, sbVar.a0.banned_rights, true, sbVar.getFragmentForAlert(1), new org.telegram.messenger.voip.h(27, sbVar, user3));
                                        break;
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = sbVar.getMessagesController().getInputChannel(chat2.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = sbVar.Z.getRealId();
                                    sbVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new qa(sbVar, 3));
                                    break;
                                case 35:
                                    sbVar.getMessagesController().deleteParticipantFromChat(chat2.id, sbVar.getMessagesController().getInputPeer(sbVar.Z.messageOwner.from_id), false, false, (Runnable) new va(sbVar, 2));
                                    if ((sbVar.Z.messageOwner.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.qc.a(sbVar) && (user = sbVar.getMessagesController().getUser(Long.valueOf(sbVar.Z.messageOwner.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.qc.D(sbVar, user, chat2.title).j();
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else {
            String str5 = messageObject.messageOwner.attachPath;
            if (str5 != null && str5.length() > 0 && !e2.c.t(str5)) {
                str5 = null;
            }
            if (str5 == null || str5.length() == 0) {
                str5 = sbVar.getFileLoader().getPathToMessage(sbVar.Z.messageOwner).toString();
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 23 && ((i14 <= 28 || BuildVars.NO_SCOPED_STORAGE) && sbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                sbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                sbVar.Z = null;
                sbVar.a0 = null;
                return;
            }
            MediaController.saveFile(str5, sbVar.getParentActivity(), 0, null, null);
        }
        sbVar.Z = null;
        sbVar.a0 = null;
    }

    public static void X(sb sbVar, int i10) {
        int i11;
        RectF rectF;
        tg.d dVar = sbVar.c;
        tg.d dVar2 = sbVar.d;
        ArrayList arrayList = sbVar.S0;
        og.e eVar = sbVar.n;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 31 || eVar == null) {
            return;
        }
        if (k7.x8.a(i10, 2)) {
            ArrayList arrayList2 = sbVar.R0;
            if (i12 >= 29) {
                if (dVar2 != null) {
                    if (arrayList2.isEmpty()) {
                        rectF = new RectF();
                        arrayList2.add(rectF);
                    } else {
                        rectF = (RectF) arrayList2.get(0);
                    }
                    rectF.set(0.0f, 0.0f, sbVar.Y.getMeasuredWidth(), sbVar.B.getY() + sbVar.B.getPaddingTop());
                    rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                    i11 = dVar2.d(arrayList2, 1, AndroidUtilities.dp(48.0f)) + 1;
                } else {
                    i11 = 0;
                }
                if (dVar != null) {
                    i11 += dVar.d(arrayList2, i11, AndroidUtilities.dp(8.0f));
                }
            } else {
                i11 = 0;
            }
            int a2 = lf.l0.a(arrayList2, i11, arrayList);
            int measuredWidth = sbVar.Y.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF2 = (RectF) arrayList.get(i13);
                float f10 = measuredWidth;
                rectF2.left = k7.o.a(rectF2.left, 0.0f, f10);
                rectF2.top = Math.max(sbVar.B.getY(), rectF2.top);
                rectF2.right = k7.o.a(rectF2.right, 0.0f, f10);
                rectF2.bottom = Math.min(sbVar.B.getY() + sbVar.B.getMeasuredHeight(), rectF2.bottom);
            }
            eVar.g(a2, arrayList);
        }
        pb pbVar = sbVar.Y;
        Objects.requireNonNull(pbVar);
        if (eVar.e(new ua(pbVar, 0), sbVar.Y.getWidth(), sbVar.Y.getHeight())) {
            if (dVar != null) {
                dVar.e();
            }
            if (dVar2 != null) {
                dVar2.e();
            }
            org.telegram.ui.ActionBar.k kVar = sbVar.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
            sbVar.Y.invalidate();
            Iterator it = sbVar.h.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public static void Y(sb sbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = sbVar.l0;
        sbVar.t0 = false;
        sbVar.D0.N = false;
        sbVar.X0(false);
        MessagesController.getInstance(sbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(sbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z4 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                sbVar.P = Math.min(sbVar.P, tL_channelAdminLogEvent2.id);
                MessageObject messageObject = new MessageObject(sbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, sbVar.s, sbVar.U, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.id))) {
                    sbVar.o0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.id);
                    z4 = true;
                }
            }
        }
        if (sbVar.F == null || !z4) {
            return;
        }
        sbVar.R0();
        sbVar.F.l();
    }

    public static void Z(sb sbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = sbVar.s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            sbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            sbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            sbVar.u0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = sbVar.getMessagesController().getChatFull(chat.id)) != null && chatFull.antispam) {
                cb cbVar = new cb();
                cbVar.user_id = sbVar.getMessagesController().telegramAntispamUserId;
                cbVar.peer = sbVar.getMessagesController().getPeer(cbVar.user_id);
                long j10 = sbVar.getMessagesController().telegramAntispamUserId;
                if (sbVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(sbVar.currentAccount).sendRequest(tL_users_getUsers, new qa(sbVar, 2));
                }
                sbVar.u0.add(0, cbVar);
            }
            Dialog dialog = sbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.h0) {
                ((org.telegram.ui.Components.h0) dialog).S(sbVar.u0);
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
            if (!e2.c.s(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.y.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.y.f(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
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
    public static void p0(sb sbVar, Bundle bundle, long j10) {
        TLRPC.Chat chat = sbVar.s;
        if (!chat.megagroup || sbVar.u0 == null || !ChatObject.canBlockUsers(chat)) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= sbVar.u0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) sbVar.u0.get(i10);
            if (MessageObject.getPeerId(channelParticipant.peer) != j10) {
                i10++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public static void v0(sb sbVar, MessageObject messageObject) {
        if (sbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            d2Var.Q = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            d2Var.Q = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        sbVar.showDialog(d2Var);
    }

    public final MessageObject N0(long j10, long j11, ArrayList arrayList, boolean z4, boolean z10) {
        int i10;
        MessageObject messageObject;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.p0;
            i10 = 1;
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
            tL_message.dialog_id = -this.s.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        messageObject.contentType = 1;
        if (!z10 || arrayList.size() <= 1) {
            messageObject.actionDeleteGroupEventId = -1L;
        } else {
            messageObject.actionDeleteGroupEventId = j10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z10 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new n8(i10)).distinct().map(new Function() { // from class: org.telegram.ui.xa
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                sb sbVar = sb.this;
                sbVar.getClass();
                if (l10.longValue() >= 0) {
                    return UserObject.getForcedFirstName(sbVar.getMessagesController().getUser(l10));
                }
                TLRPC.Chat chat = sbVar.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                if (chat == null) {
                    return null;
                }
                return chat.title;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new lh.c1(i10)).limit(4L).toArray())), "un1", user));
        if (z10 && arrayList.size() > 1) {
            t01 S0 = S0(messageObject.messageText);
            if (S0 == null) {
                S0 = new t01(LocaleController.getString(z4 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.j6 j6Var = S0.a;
                j6Var.u(bold);
                j6Var.t(AndroidUtilities.dp(10.0f));
                if (S0.c != -1) {
                    S0.c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                S0.a.q(LocaleController.getString(z4 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? (MessageObject) l.d.i(1, arrayList) : null;
        if (messageObject2 != null) {
            long j12 = messageObject2.eventId;
            a0.h hVar = this.F0;
            if (!hVar.d(j12)) {
                long j13 = messageObject2.eventId;
                int i12 = U0;
                U0 = i12 + 1;
                hVar.k(Integer.valueOf(i12), j13);
            }
            messageObject.stableId = ((Integer) hVar.f(messageObject2.eventId)).intValue();
        }
        return messageObject;
    }

    public final void O0(boolean z4) {
        k kVar = this.D;
        if (kVar == null || this.j0) {
            return;
        }
        int L0 = kVar.L0();
        if ((L0 == -1 ? 0 : Math.abs(this.D.N0() - L0) + 1) > 0) {
            this.F.getClass();
            if (L0 > (z4 ? 4 : 1) || this.s0 || this.r0) {
                return;
            }
            V0(false);
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
    
        if ((r23 instanceof org.telegram.ui.Cells.v0) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e7, code lost:
    
        r0 = new android.text.SpannableString(">");
        r2 = getParentActivity().getResources().getDrawable(org.telegram.messenger.R.drawable.attach_arrow_right).mutate();
        r2.setColorFilter(new android.graphics.PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.Gi), android.graphics.PorterDuff.Mode.MULTIPLY));
        r2.setBounds(0, 0, org.telegram.messenger.AndroidUtilities.dp(10.0f), org.telegram.messenger.AndroidUtilities.dp(10.0f));
        r0.setSpan(new android.text.style.ImageSpan(r2, 2), 0, r0.length(), 33);
        r2 = new android.text.SpannableStringBuilder();
        r2.append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.EventLogFilterGroupInfo)).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) r0).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAdministrators));
        r2.setSpan(new fg.l0(r22, 3), 0, r2.length(), 33);
        r0 = org.telegram.ui.Components.qc.a0(r22).M(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamUser), org.telegram.messenger.AndroidUtilities.replaceCharSequence("%s", org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamInfo2), r2), org.telegram.messenger.R.raw.msg_antispam);
        r0.j = 5000;
        r0.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0284, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0285, code lost:
    
        r0.add(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ReportFalsePositive));
        org.telegram.ui.b.h(org.telegram.messenger.R.drawable.msg_notspam, 34, r9, r6);
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
    public final boolean P0(View view, float f10, float f11) {
        Integer num;
        String str;
        boolean z4;
        Integer num2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        boolean z10;
        ArrayList arrayList;
        ra raVar;
        ArrayList arrayList2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction;
        TLRPC.Message message;
        TLRPC.User user;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        char c3 = '\n';
        MessageObject messageObject = view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject() : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject() : null;
        if (messageObject != null) {
            int i10 = messageObject.type;
            if (i10 == 6) {
                num = 10;
            } else {
                if (i10 == 10 || i10 == 11 || i10 == 16) {
                    num = 10;
                    if (messageObject.getId() != 0) {
                        c3 = 1;
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
                                c3 = 2;
                            }
                        } else if ((!messageObject.isRoundVideo() || (messageObject.isRoundVideo() && BuildVars.DEBUG_VERSION)) && ((messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
                            String str2 = messageObject.messageOwner.attachPath;
                            boolean z11 = (str2 == null || str2.length() == 0 || !new File(messageObject.messageOwner.attachPath).exists()) ? false : true;
                            if (!z11 && getFileLoader().getPathToMessage(messageObject.messageOwner).exists()) {
                                z11 = true;
                            }
                            if (z11) {
                                if (messageObject.getDocument() != null && (str = messageObject.getDocument().mime_type) != null) {
                                    if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                                        num = 10;
                                    } else if (str.endsWith("/xml")) {
                                        num = 10;
                                        c3 = 5;
                                    } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                                        num = 10;
                                        c3 = 6;
                                    }
                                }
                                num = 10;
                                c3 = 4;
                            }
                        } else if (messageObject.type == 12) {
                            num = 10;
                            c3 = '\b';
                        } else if (messageObject.isMediaEmpty()) {
                            num = 10;
                            c3 = 3;
                        }
                    }
                    num = 10;
                    c3 = 2;
                }
                this.Z = messageObject;
                if (getParentActivity() != null) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    TLRPC.Chat chat3 = this.s;
                    if (chat3 == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null) {
                        z4 = true;
                    } else {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction2 = tL_channelAdminLogEvent2.action;
                        z4 = true;
                        if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                            TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction2;
                            if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                                org.telegram.ui.Components.u60 u60Var = new org.telegram.ui.Components.u60(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().getChatFull(chat3.id), null, this, chat3.id, false, ChatObject.isChannelAndNotMegaGroup(chat3));
                                u60Var.h0 = false;
                                u60Var.show();
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
                    MessageObject messageObject2 = this.Z;
                    if (messageObject2.type == 0 || messageObject2.caption != null) {
                        arrayList3.add(LocaleController.getString(R.string.Copy));
                        b.h(R.drawable.msg_copy, 3, arrayList5, arrayList4);
                    }
                    if (c3 == 1) {
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = this.Z.currentEvent;
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
                                    showDialog(new org.telegram.ui.Components.yx0(getParentActivity(), this, inputStickerSet3, null, null, null));
                                    return true;
                                }
                                arrayList = arrayList3;
                                chat2 = chat;
                                z10 = false;
                                arrayList2 = arrayList;
                                raVar = new ra(this, arrayList4, arrayList2, arrayList5, view, f10, f11);
                                if (ChatObject.canBlockUsers(chat2) && (tL_channelAdminLogEvent = messageObject.currentEvent) != null) {
                                    channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                                    if ((!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = messageObject.messageOwner) != null && message.from_id != null && (user = getMessagesController().getUser(Long.valueOf(this.Z.messageOwner.from_id.user_id))) != null && !UserObject.isUserSelf(user)) {
                                        MessagesController messagesController = getMessagesController();
                                        Utilities.Callback<TLRPC.ChannelParticipant> f2Var = new mh.f2(this, arrayList2, arrayList5, arrayList4, raVar, 1);
                                        raVar = raVar;
                                        messagesController.getChannelParticipant(chat2, user, f2Var);
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    return true;
                                }
                                raVar.run();
                                return true;
                            }
                        }
                        if (tL_channelAdminLogEvent4 == null || !(tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                            chat2 = chat;
                            z10 = false;
                            if (tL_channelAdminLogEvent4 != null && (tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && ChatObject.canUserDoAdminAction(chat2, 13)) {
                                org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(getParentActivity(), chat2);
                                cqVar.v = new za(this);
                                showDialog(cqVar);
                            }
                        } else {
                            chat2 = chat;
                            z10 = false;
                            n70 n70Var = new n70(chat2.id, 0);
                            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat2.id);
                            if (chatFull != null) {
                                n70Var.e0(chatFull);
                                presentFragment(n70Var);
                            }
                        }
                    } else {
                        chat2 = chat;
                        z10 = false;
                        if (c3 == 3) {
                            TLRPC.MessageMedia messageMedia = this.Z.messageOwner.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.isNewGifDocument(messageMedia.webpage.document)) {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGIFs));
                                b.j(R.drawable.msg_gif, arrayList5, arrayList4, 11);
                            }
                        } else if (c3 != 4) {
                            Integer num3 = num;
                            if (c3 == 5) {
                                arrayList3.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                                b.j(R.drawable.msg_language, arrayList5, arrayList4, 5);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                b.j(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                b.j(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c3 == '\n') {
                                arrayList3.add(LocaleController.getString(R.string.ApplyThemeFile));
                                b.j(R.drawable.msg_theme, arrayList5, arrayList4, 5);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                b.j(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                b.j(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c3 == 6) {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                                b.h(R.drawable.msg_gallery, 7, arrayList5, arrayList4);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                b.j(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                b.j(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c3 == 7) {
                                if (this.Z.isMask()) {
                                    arrayList3.add(LocaleController.getString(R.string.AddToMasks));
                                } else {
                                    arrayList3.add(LocaleController.getString(R.string.AddToStickers));
                                }
                                b.h(R.drawable.msg_sticker, 9, arrayList5, arrayList4);
                            } else if (c3 == '\b') {
                                long j10 = this.Z.messageOwner.media.user_id;
                                TLRPC.User user3 = j10 != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)) : user2;
                                if (user3 != null && user3.id != UserConfig.getInstance(this.currentAccount).getClientUserId() && ContactsController.getInstance(this.currentAccount).contactsDict.get(Long.valueOf(user3.id)) == null) {
                                    arrayList3.add(LocaleController.getString(R.string.AddContactTitle));
                                    b.h(R.drawable.msg_addcontact, 15, arrayList5, arrayList4);
                                }
                                if (!TextUtils.isEmpty(this.Z.messageOwner.media.phone_number)) {
                                    arrayList3.add(LocaleController.getString(R.string.Copy));
                                    b.h(R.drawable.msg_copy, 16, arrayList5, arrayList4);
                                    arrayList3.add(LocaleController.getString(R.string.Call));
                                    b.h(R.drawable.msg_calls, 17, arrayList5, arrayList4);
                                }
                            }
                        } else if (this.Z.isVideo()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                            b.j(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            b.j(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else if (this.Z.isMusic()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToMusic));
                            b.j(R.drawable.msg_download, arrayList5, arrayList4, num);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            b.j(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else {
                            Integer num4 = num;
                            if (this.Z.getDocument() != null) {
                                if (MessageObject.isNewGifDocument(this.Z.getDocument())) {
                                    arrayList3.add(LocaleController.getString(R.string.SaveToGIFs));
                                    b.j(R.drawable.msg_gif, arrayList5, arrayList4, 11);
                                }
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                b.j(R.drawable.msg_download, arrayList5, arrayList4, num4);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                b.j(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                                b.j(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            }
                        }
                    }
                    arrayList = arrayList3;
                    arrayList2 = arrayList;
                    raVar = new ra(this, arrayList4, arrayList2, arrayList5, view, f10, f11);
                    if (ChatObject.canBlockUsers(chat2)) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                        }
                        MessagesController messagesController2 = getMessagesController();
                        Utilities.Callback<TLRPC.ChannelParticipant> f2Var2 = new mh.f2(this, arrayList2, arrayList5, arrayList4, raVar, 1);
                        raVar = raVar;
                        messagesController2.getChannelParticipant(chat2, user, f2Var2);
                        z10 = true;
                    }
                    if (!z10) {
                    }
                }
            }
            c3 = 65535;
            this.Z = messageObject;
            if (getParentActivity() != null) {
            }
        }
        return false;
    }

    public final TextureView Q0(boolean z4) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.e0 == null) {
            l0 l0Var = new l0(this, getParentActivity(), 4);
            this.e0 = l0Var;
            l0Var.setOutlineProvider(new hg.j1(6));
            this.e0.setClipToOutline(true);
            this.e0.setWillNotDraw(false);
            this.e0.setVisibility(4);
            o4 o4Var = new o4(getParentActivity());
            this.f0 = o4Var;
            o4Var.setBackgroundColor(0);
            if (z4) {
                this.e0.addView(this.f0, k7.c6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.g0 = textureView;
            textureView.setOpaque(false);
            this.f0.addView(this.g0, k7.c6.c(-1.0f, -1));
        }
        if (this.e0.getParent() == null) {
            pb pbVar = this.Y;
            l0 l0Var2 = this.e0;
            int i10 = AndroidUtilities.roundMessageSize;
            pbVar.addView(l0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.e0.setVisibility(4);
        this.f0.setDrawingReady(false);
        return this.g0;
    }

    public final void R0() {
        ArrayList arrayList;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.E0.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = this.o0;
            if (i10 >= arrayList4.size()) {
                ArrayList arrayList5 = this.p0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList4.get(i10);
            long j10 = (messageObject == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (messageObject.stableId <= 0) {
                int i11 = U0;
                U0 = i11 + 1;
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
                boolean z4 = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList2.size();
                ArrayList arrayList6 = new ArrayList();
                for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((MessageObject) arrayList3.get(size2)).contentType == 1; size2--) {
                    arrayList6.add((MessageObject) arrayList3.remove(size2));
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    MessageObject messageObject3 = (MessageObject) l.d.i(1, arrayList3);
                    boolean z10 = TextUtils.isEmpty(this.w0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(messageObject3.eventId);
                    HashSet hashSet = this.q0;
                    if (hashSet.contains(valueOf) || !z10) {
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            a1((MessageObject) arrayList3.get(i13), 0);
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        a1(messageObject3, arrayList3.size() - 1);
                        arrayList2.add(messageObject3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = messageObject3.messageOwner.reply_markup;
                    if (z4 != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        messageObject3.forceUpdate = true;
                        this.F.m((z4 ? arrayList3.size() - 1 : 0) + size);
                        this.F.m(size + (z4 ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j12 = messageObject.eventId;
                    MessageObject N0 = N0(j12, messageObject.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z10);
                    arrayList = arrayList3;
                    arrayList2.add(N0);
                }
                if (!arrayList6.isEmpty()) {
                    MessageObject messageObject4 = (MessageObject) l.d.i(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(N0(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i10 = i12;
            arrayList3 = arrayList;
        }
    }

    public final void T0(boolean z4) {
        if (this.N.getTag() == null || this.Q) {
            return;
        }
        if (!this.T || this.R) {
            this.N.setTag(null);
            if (!z4) {
                AnimatorSet animatorSet = this.S;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.S = null;
                }
                this.N.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S = animatorSet2;
            animatorSet2.setDuration(150L);
            this.S.playTogether(ObjectAnimator.ofFloat(this.N, "alpha", 0.0f));
            this.S.addListener(new s5(this, 14));
            this.S.setStartDelay(500L);
            this.S.start();
        }
    }

    public final void U0(int i10) {
        if (Build.VERSION.SDK_INT < 31 || this.n == null) {
            return;
        }
        lf.e0 e0Var = this.Q0;
        if (e0Var.c == 0) {
            e0Var.invalidate();
        }
        e0Var.c = i10 | e0Var.c;
    }

    public final void V0(boolean z4) {
        ob obVar;
        if (this.s0) {
            return;
        }
        ArrayList arrayList = this.o0;
        if (z4) {
            this.P = Long.MAX_VALUE;
            FrameLayout frameLayout = this.w;
            if (frameLayout != null) {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                this.I.setVisibility(4);
                this.B.setEmptyView(null);
            }
            this.l0.b();
            arrayList.clear();
            this.n0.clear();
            R0();
        }
        this.s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.s);
        tL_channels_getAdminLog.q = this.w0;
        tL_channels_getAdminLog.limit = 50;
        if (z4 || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.P;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.x0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.x0.n(i10)));
            }
        }
        c1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new qa(this, 4));
        if (!z4 || (obVar = this.F) == null) {
            return;
        }
        obVar.l();
    }

    public final void W0() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.s);
        tL_channels_getAdminLog.q = this.w0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.x0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.x0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new qa(this, 1));
    }

    public final void X0(boolean z4) {
        hb hbVar = this.B;
        if (hbVar == null || this.D == null || hbVar.getChildCount() <= 0) {
            return;
        }
        int i10 = z4 ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < this.B.getChildCount(); i12++) {
            View childAt = this.B.getChildAt(i12);
            this.B.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                int top = childAt.getTop();
                if (z4) {
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
            this.N0 = view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject().eventId : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject().eventId : 0L;
            this.O0 = i11;
            this.P0 = (this.B.getMeasuredHeight() - view.getBottom()) - this.B.getPaddingBottom();
        }
    }

    public final int Y0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        int findQuoteStart;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (TextUtils.isEmpty(null)) {
            org.telegram.ui.Cells.t1 t1Var2 = this.K0;
            if (t1Var2 != null) {
                t1Var2.te = 0;
                t1Var2.ue = null;
            }
        } else {
            if (TextUtils.isEmpty(messageObject.caption) || (t1Var = this.K0) == null || (textLayoutBlocks = t1Var.Z3) == null) {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var3 = this.K0;
                if (t1Var3 == null || !t1Var3.q1) {
                    charSequence = charSequence2;
                    i10 = 0;
                } else {
                    i10 = t1Var3.j2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                i10 = (int) t1Var.n4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            }
            org.telegram.ui.Cells.t1 t1Var4 = this.K0;
            if (t1Var4 != null) {
                t1Var4.te = 0;
                t1Var4.ue = null;
            }
            if (arrayList != null && charSequence != null && (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.I0)) >= 0) {
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
                        if (textYOffset > AndroidUtilities.displaySize.y * (this.Y.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)) {
                            return (int) (textYOffset - (AndroidUtilities.displaySize.y * (this.Y.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)));
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
    public final void Z0(MessageObject messageObject) {
        int i10;
        int i11;
        int indexOf;
        float f10;
        int g12;
        MessageObject messageObject2;
        ArrayList arrayList = this.p0;
        if (arrayList.size() > 0) {
            int N0 = this.D.N0();
            for (int L0 = this.D.L0(); L0 <= N0; L0++) {
                ob obVar = this.F;
                int i12 = obVar.f;
                if (L0 >= i12 && L0 < obVar.h) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(L0 - i12);
                    if (messageObject3.contentType != 1 && messageObject3.getRealId() != 0 && !messageObject3.isSponsored()) {
                        i11 = L0 - this.F.f;
                        i10 = (messageObject3.getRealId() < messageObject.getRealId() ? 1 : 0) ^ 1;
                        this.E.b = i10;
                        indexOf = arrayList.indexOf(messageObject);
                        if (indexOf == -1) {
                            if (i11 > 0) {
                                i10 = i11 > indexOf ? 0 : 1;
                                this.E.b = i10;
                            }
                            va vaVar = this.J0;
                            if (vaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(vaVar);
                                this.J0 = null;
                            }
                            this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.H0 = messageObject.getRealId();
                            int indexOf2 = arrayList.indexOf(messageObject) + this.F.f;
                            e1();
                            int childCount = this.B.getChildCount();
                            int i13 = 0;
                            boolean z4 = false;
                            int i14 = 0;
                            while (true) {
                                if (i13 >= childCount) {
                                    f10 = 2.0f;
                                    break;
                                }
                                View childAt = this.B.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.t1) {
                                    MessageObject messageObject4 = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                                    if (messageObject4 != null) {
                                        f10 = 2.0f;
                                        if (messageObject4.getRealId() == messageObject.getRealId()) {
                                            childAt.sendAccessibilityEvent(8);
                                            i14 = Y0(messageObject4);
                                            z4 = true;
                                        }
                                    } else {
                                        f10 = 2.0f;
                                    }
                                    if (z4) {
                                        i13++;
                                    } else {
                                        int top = childAt.getTop() - (Math.max(-AndroidUtilities.dp(f10), (this.B.getMeasuredHeight() - childAt.getHeight()) / 2) - i14);
                                        int computeVerticalScrollRange = (this.B.computeVerticalScrollRange() - this.B.computeVerticalScrollOffset()) - this.B.computeVerticalScrollExtent();
                                        if (computeVerticalScrollRange < 0) {
                                            computeVerticalScrollRange = 0;
                                        }
                                        if (top > computeVerticalScrollRange) {
                                            top = computeVerticalScrollRange;
                                        }
                                        if (top != 0) {
                                            this.B.v0(0, top, null);
                                            this.B.setOverScrollMode(2);
                                        }
                                    }
                                } else {
                                    f10 = 2.0f;
                                    if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject2 = ((org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null && messageObject2.getRealId() == messageObject.getRealId()) {
                                        childAt.sendAccessibilityEvent(8);
                                        z4 = true;
                                    }
                                    if (z4) {
                                    }
                                }
                            }
                            if (z4) {
                                return;
                            }
                            boolean z10 = !TextUtils.isEmpty(null);
                            if (getParentActivity() == null) {
                                g12 = 0;
                            } else {
                                if (this.K0 == null) {
                                    this.K0 = new org.telegram.ui.Cells.t1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.t1 t1Var = this.K0;
                                TLRPC.Chat chat = this.s;
                                t1Var.K7 = chat != null;
                                t1Var.P7 = ChatObject.isChannel(chat) && chat.megagroup;
                                g12 = this.K0.g1(messageObject, null, z10);
                            }
                            int max = Math.max(-AndroidUtilities.dp(f10), (this.B.getMeasuredHeight() - g12) / 2) - Y0(messageObject);
                            rb rbVar = this.M0;
                            rbVar.a = messageObject;
                            rbVar.e = max;
                            c2.y yVar = this.E;
                            yVar.b = i10;
                            rbVar.b = indexOf2;
                            rbVar.d = max;
                            rbVar.c = false;
                            yVar.c(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        this.E.b = i10;
        indexOf = arrayList.indexOf(messageObject);
        if (indexOf == -1) {
        }
    }

    public final void c1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.M.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.x0 != null || this.v0 != null) {
            this.L.setVisibility(8);
            this.M.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.M.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        } else {
            this.L.setVisibility(0);
            this.M.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.s.megagroup) {
                this.M.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.M.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.t1(context, this.currentAccount));
            }
        }
        this.V = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.k6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 15));
        org.telegram.ui.Components.bo boVar = new org.telegram.ui.Components.bo(context, null, false, null);
        this.J = boVar;
        il ilVar = boVar.h;
        if (ilVar != null) {
            ilVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        il ilVar2 = boVar.r;
        if (ilVar2 != null) {
            ilVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        boVar.h0 = true;
        this.J.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.J, 0, k7.c6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 0);
        this.O = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        org.telegram.ui.Components.bo boVar2 = this.J;
        TLRPC.Chat chat = this.s;
        boVar2.setTitle(chat.title);
        this.J.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.J.setChatAvatar(chat);
        gb gbVar = new gb(this, context);
        this.fragmentView = gbVar;
        this.Y = gbVar;
        lf.e0 e0Var = new lf.e0(context, new wa(this));
        this.Q0 = e0Var;
        this.Y.addView(e0Var);
        vg.i iVar = new vg.i(this.Y);
        pb pbVar = this.Y;
        og.a aVar = this.e;
        aVar.d = iVar;
        aVar.e = pbVar;
        og.a aVar2 = this.f;
        aVar2.d = iVar;
        aVar2.e = pbVar;
        og.a aVar3 = this.b;
        aVar3.d = iVar;
        aVar3.e = pbVar;
        pbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.Y.V(org.telegram.ui.ActionBar.k6.r0());
        this.actionBar.M(aVar, sg.b.n(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, k7.c6.e(-1, -2, 17));
        this.I.setOnTouchListener(new org.telegram.ui.ActionBar.s2(6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.x5(this.M, this.Y, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.k6.f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(R.drawable.large_log_actions);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, k7.c6.t(54, 54, 17, 16, 20, 16, -4));
        hg.q qVar = new hg.q(context, 8);
        this.M = qVar;
        qVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        hg.q qVar2 = this.M;
        int i11 = org.telegram.ui.ActionBar.k6.ic;
        qVar2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.M.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.K.addView(this.M, k7.c6.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, k7.c6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        hb hbVar = new hb(this, context);
        this.B = hbVar;
        hbVar.setOnItemClickListener(new h(this, 9));
        this.B.setTag(1);
        this.B.setVerticalScrollBarEnabled(true);
        hb hbVar2 = this.B;
        ob obVar = new ob(this, context);
        this.F = obVar;
        hbVar2.setAdapter(obVar);
        this.B.setClipToPadding(false);
        hb hbVar3 = this.B;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.r;
        hbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        hb hbVar4 = this.B;
        ib ibVar = new ib(this, this.B, this.resourceProvider);
        this.D0 = ibVar;
        hbVar4.setItemAnimator(ibVar);
        this.D0.Q = true;
        this.B.setLayoutAnimation(null);
        k kVar = new k(this);
        this.D = kVar;
        kVar.j1(1);
        this.D.l1(true);
        this.B.setLayoutManager(this.D);
        c2.y yVar = new c2.y(this.B, this.D);
        this.E = yVar;
        yVar.h = new wa(this);
        yVar.i = this.M0;
        this.Y.addView(this.B, k7.c6.c(-1.0f, -1));
        this.B.setOnScrollListener(new l3(this));
        int i14 = this.h0;
        if (i14 != -1) {
            this.D.h1(i14, this.i0);
            this.h0 = -1;
        }
        xg.f fVar = new xg.f(context);
        this.X = fVar;
        fVar.setup(aVar3);
        this.X.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.X.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.X.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.X.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.Y.addView(this.X, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.w, k7.c6.e(-1, -1, 51));
        View view = new View(context);
        this.x = view;
        view.setBackground(new org.telegram.ui.ActionBar.x5(this.x, this.Y, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.f2));
        this.w.addView(this.x, k7.c6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.y.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.w.addView(this.y, k7.c6.e(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.N = v0Var;
        v0Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, k7.c6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourceProvider;
        xg.e eVar = new xg.e(context, aVar, g6Var, sg.b.b(g6Var));
        this.H = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.H.c(4, true, false);
        xg.e eVar2 = this.H;
        qg.b c3 = eVar2.n.c(eVar2, null, false);
        c3.n(eVar2.r);
        c3.p(AndroidUtilities.dp(22.0f));
        c3.o(AndroidUtilities.dp(6.0f));
        eVar2.s = c3;
        this.Y.addView(this.H, k7.c6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        final int i15 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ya
            public final /* synthetic */ sb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        sb sbVar = this.b;
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(sbVar, sbVar.v0, sbVar.x0, sbVar.s.megagroup);
                            h0Var.S(sbVar.u0);
                            h0Var.d0 = new wa(sbVar);
                            sbVar.showDialog(h0Var);
                            break;
                        }
                        break;
                    case 1:
                        sb sbVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar2.getParentActivity());
                        if (sbVar2.s.megagroup) {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        sbVar2.showDialog(d2Var);
                        break;
                    default:
                        sb sbVar3 = this.b;
                        if (sbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(sbVar3.O.getSearchField());
                            sbVar3.showDialog(org.telegram.ui.Components.z4.p(sbVar3.getParentActivity(), new ta(sbVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ae, false));
        this.G.setText(LocaleController.getString(R.string.SETTINGS));
        this.G.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.H.getContainer().addView(this.G, k7.c6.e(-2, -2, 17));
        this.H.f.add(this.G);
        this.H.d(false);
        final int i16 = 1;
        this.H.b[4] = new View.OnClickListener(this) { // from class: org.telegram.ui.ya
            public final /* synthetic */ sb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        sb sbVar = this.b;
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(sbVar, sbVar.v0, sbVar.x0, sbVar.s.megagroup);
                            h0Var.S(sbVar.u0);
                            h0Var.d0 = new wa(sbVar);
                            sbVar.showDialog(h0Var);
                            break;
                        }
                        break;
                    case 1:
                        sb sbVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar2.getParentActivity());
                        if (sbVar2.s.megagroup) {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        sbVar2.showDialog(d2Var);
                        break;
                    default:
                        sb sbVar3 = this.b;
                        if (sbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(sbVar3.O.getSearchField());
                            sbVar3.showDialog(org.telegram.ui.Components.z4.p(sbVar3.getParentActivity(), new ta(sbVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.b0.setVisibility(4);
        this.b0.setFocusable(true);
        this.b0.setFocusableInTouchMode(true);
        this.b0.setClickable(true);
        this.b0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.Y.addView(this.b0, k7.c6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.c0.setImageResource(R.drawable.msg_calendar);
        this.c0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.xe, false), PorterDuff.Mode.MULTIPLY));
        this.b0.addView(this.c0, k7.c6.e(48, 48, 53));
        final int i17 = 2;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ya
            public final /* synthetic */ sb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        sb sbVar = this.b;
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(sbVar, sbVar.v0, sbVar.x0, sbVar.s.megagroup);
                            h0Var.S(sbVar.u0);
                            h0Var.d0 = new wa(sbVar);
                            sbVar.showDialog(h0Var);
                            break;
                        }
                        break;
                    case 1:
                        sb sbVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar2.getParentActivity());
                        if (sbVar2.s.megagroup) {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        sbVar2.showDialog(d2Var);
                        break;
                    default:
                        sb sbVar3 = this.b;
                        if (sbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(sbVar3.O.getSearchField());
                            sbVar3.showDialog(org.telegram.ui.Components.z4.p(sbVar3.getParentActivity(), new ta(sbVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d0 = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ye, false));
        this.d0.setTextSize(15);
        this.d0.setTypeface(AndroidUtilities.bold());
        this.b0.addView(this.d0, k7.c6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.s0 && this.o0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.w, true, 0.3f, true);
            this.B.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.w, false, 0.3f, true);
            this.B.setEmptyView(this.I);
        }
        hb hbVar5 = this.B;
        hbVar5.V1 = true;
        hbVar5.W1 = 1;
        UndoView undoView = new UndoView(context);
        this.C = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.Y.addView(this.C, k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        hb hbVar = this.B;
        if (hbVar == null) {
            return;
        }
        int childCount = hbVar.getChildCount();
        int measuredHeight = this.B.getMeasuredHeight();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z4 = false;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.B.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                u1Var.f = y10;
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
                t1Var.b4(i13, measuredHeight2 - i13, (this.Y.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.B.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject = t1Var.getMessageObject();
                if (this.e0 != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = t1Var.getPhotoImage();
                    this.e0.setTranslationX(photoImage.getImageX());
                    this.e0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.e0.invalidate();
                    z10 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.W((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (v0Var.I()) {
                    v0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.B.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.t1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        view = childAt;
                    }
                    i10 = bottom;
                    view3 = childAt;
                }
                ib ibVar = this.D0;
                if ((ibVar == null || (!ibVar.a0(childAt) && !this.D0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().isDateObject) {
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
        l0 l0Var = this.e0;
        if (l0Var != null) {
            if (z10) {
                MediaController.getInstance().setCurrentVideoVisible(true);
            } else {
                l0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.W) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            }
        }
        if (view != null) {
            this.N.T((view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject() : ((org.telegram.ui.Cells.v0) view).getMessageObject()).messageOwner.date, false, true);
        }
        this.Q = false;
        if (!(view3 instanceof org.telegram.ui.Cells.t1) && !(view3 instanceof org.telegram.ui.Cells.v0)) {
            z4 = true;
        }
        this.R = z4;
        if (view2 == null) {
            T0(true);
            this.N.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.B.getPaddingTop() || this.R) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            T0(true ^ this.R);
        } else {
            if (view2.getAlpha() != 0.0f) {
                view2.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = this.S;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.S = null;
            }
            if (this.N.getTag() == null) {
                this.N.setTag(1);
            }
            if (this.N.getAlpha() != 1.0f) {
                this.N.setAlpha(1.0f);
            }
            this.Q = true;
        }
        int bottom2 = view2.getBottom() - this.B.getPaddingTop();
        if (bottom2 <= this.N.getMeasuredHeight() || bottom2 >= this.N.getMeasuredHeight() * 2) {
            this.N.setTranslationY(0.0f);
        } else {
            this.N.setTranslationY(((-r1.getMeasuredHeight()) * 2) + bottom2);
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
        boolean z4;
        if (i10 == NotificationCenter.emojiLoaded) {
            hb hbVar = this.B;
            if (hbVar != null) {
                hbVar.f1();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagePlayingDidStart) {
            if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                hb hbVar2 = this.B;
                if (hbVar2 != null) {
                    int childCount = hbVar2.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.B.getChildAt(i12);
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
                this.Y.V(org.telegram.ui.ActionBar.k6.r0());
                this.x.invalidate();
                hg.q qVar = this.M;
                if (qVar != null) {
                    qVar.invalidate();
                }
                this.B.f1();
                return;
            }
            Integer num = (Integer) objArr[0];
            hb hbVar3 = this.B;
            if (hbVar3 != null) {
                int childCount2 = hbVar3.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.B.getChildAt(i13);
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
            MediaController.getInstance().setTextureView(Q0(true), this.f0, this.e0, true);
            int childCount3 = this.B.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount3) {
                    z4 = false;
                    break;
                }
                View childAt3 = this.B.getChildAt(i14);
                if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt3;
                    MessageObject messageObject4 = t1Var4.getMessageObject();
                    if (this.e0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                        ImageReceiver photoImage = t1Var4.getPhotoImage();
                        this.e0.setTranslationX(photoImage.getImageX());
                        this.e0.setTranslationY(photoImage.getImageY() + t1Var4.getTop() + this.fragmentView.getPaddingTop());
                        this.fragmentView.invalidate();
                        this.e0.invalidate();
                        z4 = true;
                        break;
                    }
                }
                i14++;
            }
            if (this.e0 != null) {
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (z4) {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                } else {
                    this.e0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject2 != null && playingMessageObject2.isRoundVideo() && (this.W || PipRoundVideoView.C != null)) {
                        MediaController.getInstance().setCurrentVideoVisible(false);
                    }
                }
            }
        }
        hb hbVar4 = this.B;
        if (hbVar4 != null) {
            int childCount4 = hbVar4.getChildCount();
            for (int i15 = 0; i15 < childCount4; i15++) {
                View childAt4 = this.B.getChildAt(i15);
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

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e1() {
        hb hbVar = this.B;
        if (hbVar == null) {
            return;
        }
        int childCount = hbVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.B.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.s()) {
                        t1Var.setDrawSelectionBackground(false);
                        t1Var.J3(false, true);
                        t1Var.L3(false, false, true);
                    }
                    t1Var.setHighlighted(this.H0 != Integer.MAX_VALUE && messageObject.getRealId() == this.H0);
                    if (this.H0 != Integer.MAX_VALUE) {
                        va vaVar = this.J0;
                        if (vaVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(vaVar);
                        }
                        va vaVar2 = new va(this, 0);
                        this.J0 = vaVar2;
                        AndroidUtilities.runOnUIThread(vaVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.w0)) {
                        t1Var.S3(null);
                    } else {
                        t1Var.S3(this.w0);
                    }
                    t1Var.setSpoilersSuppressed(this.B.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.setMessageObject(v0Var.getMessageObject());
                v0Var.setSpoilersSuppressed(this.B.getScrollState() != 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.v8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.t8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.k6.c2, org.telegram.ui.ActionBar.k6.d2}, org.telegram.ui.ActionBar.k6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.i8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.j8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.k8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.l8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.m8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.n8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.o8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.m3, org.telegram.ui.ActionBar.k6.q3}, null, org.telegram.ui.ActionBar.k6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.n3, org.telegram.ui.ActionBar.k6.r3}, null, org.telegram.ui.ActionBar.k6.dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.k6.m3.k();
        int i13 = org.telegram.ui.ActionBar.k6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.k6.o3.k();
        int i14 = org.telegram.ui.ActionBar.k6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.o3, org.telegram.ui.ActionBar.k6.s3}, null, org.telegram.ui.ActionBar.k6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.o3, org.telegram.ui.ActionBar.k6.s3}, null, org.telegram.ui.ActionBar.k6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.o3, org.telegram.ui.ActionBar.k6.s3}, null, org.telegram.ui.ActionBar.k6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.o3, org.telegram.ui.ActionBar.k6.s3}, null, org.telegram.ui.ActionBar.k6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.p3, org.telegram.ui.ActionBar.k6.t3}, null, org.telegram.ui.ActionBar.k6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.s2;
        int i15 = org.telegram.ui.ActionBar.k6.ic;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 4, new Class[]{org.telegram.ui.Cells.v0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 2, new Class[]{org.telegram.ui.Cells.v0.class}, org.telegram.ui.ActionBar.k6.s2, null, null, org.telegram.ui.ActionBar.k6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.w4, org.telegram.ui.ActionBar.k6.q4, org.telegram.ui.ActionBar.k6.x4, org.telegram.ui.ActionBar.k6.v4, org.telegram.ui.ActionBar.k6.u4, org.telegram.ui.ActionBar.k6.C4}, null, org.telegram.ui.ActionBar.k6.kc));
        int i16 = org.telegram.ui.ActionBar.k6.lc;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.v0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.k6.mc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.k6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.k6.hc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.y3}, null, org.telegram.ui.ActionBar.k6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.z3}, null, org.telegram.ui.ActionBar.k6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.A3, org.telegram.ui.ActionBar.k6.C3}, null, org.telegram.ui.ActionBar.k6.La));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.B3, org.telegram.ui.ActionBar.k6.D3}, null, org.telegram.ui.ActionBar.k6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.F3, org.telegram.ui.ActionBar.k6.G3}, null, org.telegram.ui.ActionBar.k6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.O3, org.telegram.ui.ActionBar.k6.S3, org.telegram.ui.ActionBar.k6.W3}, null, org.telegram.ui.ActionBar.k6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.P3, org.telegram.ui.ActionBar.k6.T3, org.telegram.ui.ActionBar.k6.X3}, null, org.telegram.ui.ActionBar.k6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.M3, org.telegram.ui.ActionBar.k6.Q3, org.telegram.ui.ActionBar.k6.U3}, null, org.telegram.ui.ActionBar.k6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.N3, org.telegram.ui.ActionBar.k6.R3, org.telegram.ui.ActionBar.k6.V3}, null, org.telegram.ui.ActionBar.k6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.a4, org.telegram.ui.ActionBar.k6.b4, org.telegram.ui.ActionBar.k6.Z3}, null, org.telegram.ui.ActionBar.k6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.e4}, null, org.telegram.ui.ActionBar.k6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f4}, null, org.telegram.ui.ActionBar.k6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.c4}, null, org.telegram.ui.ActionBar.k6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.d4}, null, org.telegram.ui.ActionBar.k6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.g4}, null, org.telegram.ui.ActionBar.k6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.k6.i4};
        int i17 = org.telegram.ui.ActionBar.k6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.k6.h4, org.telegram.ui.ActionBar.k6.B4, org.telegram.ui.ActionBar.k6.D4};
        int i18 = org.telegram.ui.ActionBar.k6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.J4, null, org.telegram.ui.ActionBar.k6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.H4, null, org.telegram.ui.ActionBar.k6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.O4}, null, org.telegram.ui.ActionBar.k6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.P4}, null, org.telegram.ui.ActionBar.k6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.Q4}, null, org.telegram.ui.ActionBar.k6.qa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.b2, null, null, org.telegram.ui.ActionBar.k6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.j4}, null, org.telegram.ui.ActionBar.k6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.J2, null, null, org.telegram.ui.ActionBar.k6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.K2, null, null, org.telegram.ui.ActionBar.k6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.T1, null, null, org.telegram.ui.ActionBar.k6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.Q2, null, null, org.telegram.ui.ActionBar.k6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Rc));
        int i19 = org.telegram.ui.ActionBar.k6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.k6.ab;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.bb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.db));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.eb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.cd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.gb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.dd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.hb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.ed));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.ib));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.fd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.jb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.hd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.id));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.jd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.rb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.od));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.pd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.lb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.tb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.sd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.ub));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.td));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.vb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.ud));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.wb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.wd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.yb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.xd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.vd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.zb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.xb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.yd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.zd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.ie));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.uc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.je));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.k6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.k6.re));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.k6.se));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.k6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.k6.qe));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.k6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.y, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.k6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.k6.De));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.k6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.x, TLObject.FLAG_29, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M, TLObject.FLAG_29, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.Fi));
        int i21 = org.telegram.ui.ActionBar.k6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.k6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.C;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
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
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.s);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new qa(this, 0)), this.classGuid);
        setBulletinDelegate(new hg.w(5));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        this.y0.unlock();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        pb pbVar = this.Y;
        if (pbVar != null) {
            org.telegram.ui.Components.p81 p81Var = pbVar.v;
            if (p81Var != null) {
                p81Var.c(false);
            }
            pbVar.C = true;
        }
        UndoView undoView = this.C;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.j0 = true;
        this.k0 = true;
        cb.m mVar = cb.m.e;
        if (mVar == null || !mVar.a) {
            return;
        }
        cb.m l10 = cb.m.l();
        if (l10.a) {
            u4 u4Var = (u4) l10.d;
            int i10 = e5.C;
            u4Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        pb pbVar = this.Y;
        if (pbVar != null) {
            org.telegram.ui.Components.p81 p81Var = pbVar.v;
            if (p81Var != null) {
                p81Var.c(true);
            }
            pbVar.C = false;
        }
        this.j0 = false;
        O0(false);
        if (this.k0) {
            this.k0 = false;
            ob obVar = this.F;
            if (obVar != null) {
                obVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            this.y0.unlock();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        if (z4) {
            this.y0.lock();
        }
    }
}
