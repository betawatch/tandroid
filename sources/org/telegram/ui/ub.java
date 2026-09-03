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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ub extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static int U0 = 10;
    public static final int[] V0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public HashMap A0;
    public jb B;
    public boolean B0;
    public UndoView C;
    public final fb C0;
    public k D;
    public kb D0;
    public c2.z E;
    public final ArrayList E0;
    public qb F;
    public final a0.h F0;
    public TextView G;
    public db G0;
    public wg.e H;
    public int H0;
    public FrameLayout I;
    public int I0;
    public org.telegram.ui.Components.yn J;
    public xa J0;
    public LinearLayout K;
    public org.telegram.ui.Cells.s1 K0;
    public ImageView L;
    public int L0;
    public gg.q M;
    public final tb M0;
    public org.telegram.ui.Cells.v0 N;
    public long N0;
    public org.telegram.ui.ActionBar.w0 O;
    public int O0;
    public long P;
    public int P0;
    public boolean Q;
    public kf.e0 Q0;
    public boolean R;
    public final ArrayList R0;
    public AnimatorSet S;
    public final ArrayList S0;
    public boolean T;
    public final RectF T0;
    public final int[] U;
    public boolean V;
    public boolean W;
    public wg.f X;
    public rb Y;
    public MessageObject Z;
    public final sg.e a;
    public TLRPC.ChannelParticipant a0;
    public final ng.a b;
    public FrameLayout b0;
    public final sg.d c;
    public ImageView c0;
    public final sg.d d;
    public org.telegram.ui.ActionBar.k5 d0;
    public final ng.a e;
    public n0 e0;
    public final ng.a f;
    public q4 f0;
    public TextureView g0;
    public final be.b h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final a0.h l0;
    public final a0.h m0;
    public final ng.e n;
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

    public ub(TLRPC.Chat chat) {
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
        this.C0 = new fb(this);
        this.E0 = new ArrayList();
        this.F0 = new a0.h();
        this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.I0 = -1;
        this.M0 = new tb(this);
        this.O0 = -1;
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new RectF();
        sg.e eVar = new sg.e();
        this.a = eVar;
        ng.a aVar = new ng.a(eVar);
        this.b = aVar;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.n = null;
            this.r = 0;
            this.c = null;
            this.d = null;
            this.e = new ng.a(eVar);
            this.f = new ng.a(eVar);
        } else {
            ng.e eVar2 = new ng.e(false);
            this.n = eVar2;
            sg.d dVar = new sg.d(eVar);
            this.d = dVar;
            dVar.v = new xa(this, 3);
            dVar.d = eVar2;
            dVar.e = -3;
            dVar.f = eVar;
            ng.a aVar2 = new ng.a(dVar);
            this.f = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                sg.d dVar2 = new sg.d(eVar);
                this.c = dVar2;
                dVar2.v = new xa(this, 3);
                dVar2.d = eVar2;
                dVar2.e = -2;
                dVar2.f = eVar;
                ng.a aVar3 = new ng.a(dVar2);
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

    public static void A0(ub ubVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = ubVar.getMessagesController();
        TLRPC.Chat chat = ubVar.s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.id);
        org.telegram.ui.Components.t60 t60Var = new org.telegram.ui.Components.t60(ubVar.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, ubVar, chatFull.id, false, ChatObject.isChannel(chat));
        t60Var.g0 = new gb(ubVar);
        t60Var.show();
    }

    public static void K0(ub ubVar) {
        if (ubVar.B == null || ubVar.o0.isEmpty()) {
            return;
        }
        ubVar.D.h1(ubVar.p0.size() - 1, (-100000) - ubVar.B.getPaddingTop());
    }

    public static y01 S0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.lq lqVar : (org.telegram.ui.Components.lq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.lq.class)) {
            if (lqVar != null) {
                Drawable drawable = lqVar.drawable;
                if (drawable instanceof y01) {
                    return (y01) drawable;
                }
            }
        }
        return null;
    }

    public static void U(ub ubVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = ubVar.l0;
        int i10 = 0;
        ubVar.D0.N = false;
        ubVar.X0(false);
        MessagesController.getInstance(ubVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(ubVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = ubVar.o0;
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
                ubVar.P = Math.min(ubVar.P, tL_channelAdminLogEvent.id);
                MessageObject messageObject2 = new MessageObject(ubVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) ubVar.n0, ubVar.s, ubVar.U, false);
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
                ubVar.m0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(ubVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -ubVar.s.id, 0, 0L, new xa(ubVar, 1), ubVar.getClassGuid(), null);
        }
        ubVar.R0();
        ubVar.s0 = false;
        if (!z4) {
            ubVar.r0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(ubVar.w, false, 0.3f, true);
        ubVar.B.setEmptyView(ubVar.I);
        qb qbVar = ubVar.F;
        if (qbVar != null) {
            qbVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = ubVar.O;
        if (w0Var != null) {
            if (ubVar.p0.isEmpty() && TextUtils.isEmpty(ubVar.w0)) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
        }
    }

    public static void V(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || ubVar.getParentActivity() == null) {
            return;
        }
        int i10 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, ubVar.getParentActivity(), ubVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        Rect rect = new Rect();
        ubVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(ubVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            if (arrayList4.get(i11) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.m1(ubVar.getParentActivity(), ubVar.getResourceProvider()), k7.b6.n(-1, 8));
            } else {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, ubVar.getParentActivity(), ubVar.getResourceProvider(), i11 == 0, i11 == size + (-1));
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                    g1Var.c(ubVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7), ubVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                }
                Integer num = (Integer) arrayList4.get(i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                g1Var.setOnClickListener(new nh.o5(ubVar, i11, arrayList4, num, 1));
            }
            i11++;
            arrayList4 = arrayList;
        }
        cb cbVar = new cb(0, ubVar.Y.getContext(), ubVar);
        cbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        cbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        db dbVar = new db(ubVar, cbVar);
        ubVar.G0 = dbVar;
        dbVar.e = true;
        dbVar.c = 220;
        dbVar.setOutsideTouchable(true);
        ubVar.G0.setClippingEnabled(true);
        ubVar.G0.setAnimationStyle(R.style.PopupContextAnimation);
        ubVar.G0.setFocusable(true);
        cbVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        ubVar.G0.setInputMethodMode(2);
        ubVar.G0.setSoftInputMode(48);
        ubVar.G0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f10)) - cbVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
        if (left < AndroidUtilities.dp(6.0f)) {
            left = AndroidUtilities.dp(6.0f);
        } else if (left > (ubVar.B.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - cbVar.getMeasuredWidth()) {
            left = (ubVar.B.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - cbVar.getMeasuredWidth();
        }
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            ubVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = ubVar.Y.getHeight();
        int dp = AndroidUtilities.dp(48.0f) + cbVar.getMeasuredHeight();
        int R = ubVar.Y.R();
        if (R > AndroidUtilities.dp(20.0f)) {
            height += R;
        }
        if (dp < height) {
            int y10 = (int) (ubVar.B.getY() + view.getTop() + f11);
            i10 = (dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f) ? (AndroidUtilities.dp(240.0f) - dp) + y10 : y10;
            if (i10 < ubVar.B.getY() + AndroidUtilities.dp(24.0f)) {
                i10 = (int) (ubVar.B.getY() + AndroidUtilities.dp(24.0f));
            } else {
                int i12 = height - dp;
                if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                    i10 = i12 - AndroidUtilities.dp(8.0f);
                }
            }
        } else if (!ubVar.inBubbleMode) {
            i10 = AndroidUtilities.statusBarHeight;
        }
        cbVar.setMaxHeight(height - i10);
        ubVar.G0.showAtLocation(ubVar.B, 51, left, i10);
        ubVar.G0.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x036a, code lost:
    
        if (r0.exists() != false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(ub ubVar, int i10, ArrayList arrayList, Integer num) {
        TLRPC.Chat chat;
        File file;
        TLRPC.User user;
        if (ubVar.Z == null || i10 >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        TLRPC.Chat chat2 = ubVar.s;
        db dbVar = ubVar.G0;
        if (dbVar != null) {
            dbVar.dismiss();
        }
        MessageObject messageObject = ubVar.Z;
        if (messageObject == null) {
            return;
        }
        if (intValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long fromChatId = messageObject.getFromChatId();
            if (0 != fromChatId) {
                if (fromChatId > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(ubVar.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user2 != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user2.first_name, user2.last_name)).append((CharSequence) ":\n");
                    }
                } else if (fromChatId < 0 && (chat = MessagesController.getInstance(ubVar.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(messageObject.messageText)) {
                spannableStringBuilder.append((CharSequence) messageObject.messageOwner.message);
            } else {
                spannableStringBuilder.append(messageObject.messageText);
            }
            AndroidUtilities.addToClipboard(spannableStringBuilder);
            b.m(R.string.MessageCopied, org.telegram.ui.Components.qc.a0(ubVar));
        } else if (intValue == 4) {
            String str = messageObject.messageOwner.attachPath;
            if (str != null && str.length() > 0 && !e2.c.t(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                str = ubVar.getFileLoader().getPathToMessage(ubVar.Z.messageOwner).toString();
            }
            int i11 = ubVar.Z.type;
            if (i11 == 3 || i11 == 1) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23 && ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && ubVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                    ubVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    ubVar.Z = null;
                    ubVar.a0 = null;
                    return;
                }
                MediaController.saveFile(str, ubVar.getParentActivity(), ubVar.Z.type == 3 ? 1 : 0, null, null);
            }
        } else if (intValue == 5) {
            String str2 = messageObject.messageOwner.attachPath;
            if (str2 != null && str2.length() != 0) {
                file = new File(ubVar.Z.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage = ubVar.getFileLoader().getPathToMessage(ubVar.Z.messageOwner);
                if (pathToMessage.exists()) {
                    file = pathToMessage;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    k kVar = ubVar.D;
                    if (kVar != null) {
                        if (kVar.N0() < ubVar.D.B() - 1) {
                            int L0 = ubVar.D.L0();
                            ubVar.h0 = L0;
                            org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) ubVar.B.K(L0);
                            if (dl0Var != null) {
                                ubVar.i0 = dl0Var.a.getTop();
                            } else {
                                ubVar.h0 = -1;
                            }
                        } else {
                            ubVar.h0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, ubVar.Z.getDocumentName(), null, true);
                    if (u10 != null) {
                        ubVar.presentFragment(new jd1(u10));
                    } else {
                        ubVar.h0 = -1;
                        if (ubVar.getParentActivity() == null) {
                            ubVar.Z = null;
                            ubVar.a0 = null;
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar.getParentActivity());
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.IncorrectTheme);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            ubVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                } else if (LocaleController.getInstance().applyLanguageFile(file, ubVar.currentAccount)) {
                    ubVar.presentFragment(new LanguageSelectActivity());
                } else if (ubVar.getParentActivity() == null) {
                    ubVar.Z = null;
                    ubVar.a0 = null;
                    return;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ubVar.getParentActivity());
                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.IncorrectLocalization);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    ubVar.showDialog(alertDialog$Builder2.a);
                }
            }
        } else if (intValue == 6) {
            String str3 = messageObject.messageOwner.attachPath;
            if (str3 != null && str3.length() > 0 && !e2.c.t(str3)) {
                str3 = null;
            }
            if (str3 == null || str3.length() == 0) {
                str3 = ubVar.getFileLoader().getPathToMessage(ubVar.Z.messageOwner).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(ubVar.Z.getDocument().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(ubVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", new File(str3)));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
            }
            try {
                ubVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            } catch (Exception unused2) {
            }
        } else if (intValue != 7) {
            switch (intValue) {
                case 9:
                    ubVar.showDialog(new org.telegram.ui.Components.xx0(ubVar.getParentActivity(), ubVar, ubVar.Z.getInputStickerSet(), null, null, null));
                    break;
                case 10:
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 23 && ((i13 <= 28 || BuildVars.NO_SCOPED_STORAGE) && ubVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                        ubVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        ubVar.Z = null;
                        ubVar.a0 = null;
                        return;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(ubVar.Z.getDocument());
                    if (TextUtils.isEmpty(documentFileName)) {
                        documentFileName = ubVar.Z.getFileName();
                    }
                    String str4 = ubVar.Z.messageOwner.attachPath;
                    if (str4 != null && str4.length() > 0 && !e2.c.t(str4)) {
                        str4 = null;
                    }
                    if (str4 == null || str4.length() == 0) {
                        str4 = ubVar.getFileLoader().getPathToMessage(ubVar.Z.messageOwner).toString();
                    }
                    MediaController.saveFile(str4, ubVar.getParentActivity(), ubVar.Z.isMusic() ? 3 : 2, documentFileName, ubVar.Z.getDocument() != null ? ubVar.Z.getDocument().mime_type : "");
                    break;
                case 11:
                    MessagesController.getInstance(ubVar.currentAccount).saveGif(ubVar.Z, messageObject.getDocument());
                    break;
                default:
                    switch (intValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", ubVar.Z.messageOwner.media.user_id);
                            bundle.putString("phone", ubVar.Z.messageOwner.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            ubVar.presentFragment(new ps(bundle));
                            break;
                        case 16:
                            AndroidUtilities.addToClipboard(messageObject.messageOwner.media.phone_number);
                            b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(ubVar));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ubVar.Z.messageOwner.media.phone_number));
                                intent2.addFlags(TLObject.FLAG_28);
                                ubVar.getParentActivity().startActivityForResult(intent2, 500);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                break;
                            }
                        default:
                            switch (intValue) {
                                case 33:
                                    if (ubVar.a0 != null) {
                                        TLRPC.User user3 = ubVar.getMessagesController().getUser(Long.valueOf(DialogObject.getPeerDialogId(ubVar.a0.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = ubVar.a0;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = ubVar.a0.banned_rights;
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
                                        ubVar.getMessagesController().setParticipantBannedRole(chat2.id, user3, null, ubVar.a0.banned_rights, true, ubVar.getFragmentForAlert(1), new org.telegram.messenger.voip.h(27, ubVar, user3));
                                        break;
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = ubVar.getMessagesController().getInputChannel(chat2.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = ubVar.Z.getRealId();
                                    ubVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new sa(ubVar, 3));
                                    break;
                                case 35:
                                    ubVar.getMessagesController().deleteParticipantFromChat(chat2.id, ubVar.getMessagesController().getInputPeer(ubVar.Z.messageOwner.from_id), false, false, (Runnable) new xa(ubVar, 2));
                                    if ((ubVar.Z.messageOwner.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.qc.a(ubVar) && (user = ubVar.getMessagesController().getUser(Long.valueOf(ubVar.Z.messageOwner.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.qc.D(ubVar, user, chat2.title).j();
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
                str5 = ubVar.getFileLoader().getPathToMessage(ubVar.Z.messageOwner).toString();
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 23 && ((i14 <= 28 || BuildVars.NO_SCOPED_STORAGE) && ubVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                ubVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                ubVar.Z = null;
                ubVar.a0 = null;
                return;
            }
            MediaController.saveFile(str5, ubVar.getParentActivity(), 0, null, null);
        }
        ubVar.Z = null;
        ubVar.a0 = null;
    }

    public static void X(ub ubVar, int i10) {
        int i11;
        RectF rectF;
        sg.d dVar = ubVar.c;
        sg.d dVar2 = ubVar.d;
        ArrayList arrayList = ubVar.S0;
        ng.e eVar = ubVar.n;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 31 || eVar == null) {
            return;
        }
        if (k7.w8.a(i10, 2)) {
            ArrayList arrayList2 = ubVar.R0;
            if (i12 >= 29) {
                if (dVar2 != null) {
                    if (arrayList2.isEmpty()) {
                        rectF = new RectF();
                        arrayList2.add(rectF);
                    } else {
                        rectF = (RectF) arrayList2.get(0);
                    }
                    rectF.set(0.0f, 0.0f, ubVar.Y.getMeasuredWidth(), ubVar.B.getY() + ubVar.B.getPaddingTop());
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
            int a2 = kf.m0.a(i11, arrayList2, arrayList);
            int measuredWidth = ubVar.Y.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF2 = (RectF) arrayList.get(i13);
                float f10 = measuredWidth;
                rectF2.left = k7.n.a(rectF2.left, 0.0f, f10);
                rectF2.top = Math.max(ubVar.B.getY(), rectF2.top);
                rectF2.right = k7.n.a(rectF2.right, 0.0f, f10);
                rectF2.bottom = Math.min(ubVar.B.getY() + ubVar.B.getMeasuredHeight(), rectF2.bottom);
            }
            eVar.g(a2, arrayList);
        }
        rb rbVar = ubVar.Y;
        Objects.requireNonNull(rbVar);
        if (eVar.e(new wa(rbVar, 0), ubVar.Y.getWidth(), ubVar.Y.getHeight())) {
            if (dVar != null) {
                dVar.e();
            }
            if (dVar2 != null) {
                dVar2.e();
            }
            org.telegram.ui.ActionBar.k kVar = ubVar.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
            ubVar.Y.invalidate();
            Iterator it = ubVar.h.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public static void Y(ub ubVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = ubVar.l0;
        ubVar.t0 = false;
        ubVar.D0.N = false;
        ubVar.X0(false);
        MessagesController.getInstance(ubVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(ubVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
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
                ubVar.P = Math.min(ubVar.P, tL_channelAdminLogEvent2.id);
                MessageObject messageObject = new MessageObject(ubVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, ubVar.s, ubVar.U, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.id))) {
                    ubVar.o0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.id);
                    z4 = true;
                }
            }
        }
        if (ubVar.F == null || !z4) {
            return;
        }
        ubVar.R0();
        ubVar.F.l();
    }

    public static void Z(ub ubVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = ubVar.s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            ubVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            ubVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            ubVar.u0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = ubVar.getMessagesController().getChatFull(chat.id)) != null && chatFull.antispam) {
                eb ebVar = new eb();
                ebVar.user_id = ubVar.getMessagesController().telegramAntispamUserId;
                ebVar.peer = ubVar.getMessagesController().getPeer(ebVar.user_id);
                long j10 = ubVar.getMessagesController().telegramAntispamUserId;
                if (ubVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(ubVar.currentAccount).sendRequest(tL_users_getUsers, new sa(ubVar, 2));
                }
                ubVar.u0.add(0, ebVar);
            }
            Dialog dialog = ubVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.h0) {
                ((org.telegram.ui.Components.h0) dialog).S(ubVar.u0);
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
    public static void p0(ub ubVar, Bundle bundle, long j10) {
        TLRPC.Chat chat = ubVar.s;
        if (!chat.megagroup || ubVar.u0 == null || !ChatObject.canBlockUsers(chat)) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= ubVar.u0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) ubVar.u0.get(i10);
            if (MessageObject.getPeerId(channelParticipant.peer) != j10) {
                i10++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public static void v0(ub ubVar, MessageObject messageObject) {
        if (ubVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            d2Var.Q = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            d2Var.Q = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        ubVar.showDialog(d2Var);
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
            } catch (Exception e) {
                FileLog.e(e);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z10 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new p8(i10)).distinct().map(new Function() { // from class: org.telegram.ui.za
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                ub ubVar = ub.this;
                ubVar.getClass();
                if (l10.longValue() >= 0) {
                    return UserObject.getForcedFirstName(ubVar.getMessagesController().getUser(l10));
                }
                TLRPC.Chat chat = ubVar.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                if (chat == null) {
                    return null;
                }
                return chat.title;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new kh.c1(i10)).limit(4L).toArray())), "un1", user));
        if (z10 && arrayList.size() > 1) {
            y01 S0 = S0(messageObject.messageText);
            if (S0 == null) {
                S0 = new y01(LocaleController.getString(z4 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
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
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? (MessageObject) kf.k0.i(1, arrayList) : null;
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
        r2.setColorFilter(new android.graphics.PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Gi), android.graphics.PorterDuff.Mode.MULTIPLY));
        r2.setBounds(0, 0, org.telegram.messenger.AndroidUtilities.dp(10.0f), org.telegram.messenger.AndroidUtilities.dp(10.0f));
        r0.setSpan(new android.text.style.ImageSpan(r2, 2), 0, r0.length(), 33);
        r2 = new android.text.SpannableStringBuilder();
        r2.append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.EventLogFilterGroupInfo)).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) r0).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAdministrators));
        r2.setSpan(new eg.l0(r22, 3), 0, r2.length(), 33);
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
        ta taVar;
        ArrayList arrayList2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction;
        TLRPC.Message message;
        TLRPC.User user;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        char c3 = '\n';
        MessageObject messageObject = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject() : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject() : null;
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
                                org.telegram.ui.Components.t60 t60Var = new org.telegram.ui.Components.t60(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().getChatFull(chat3.id), null, this, chat3.id, false, ChatObject.isChannelAndNotMegaGroup(chat3));
                                t60Var.h0 = false;
                                t60Var.show();
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
                                    showDialog(new org.telegram.ui.Components.xx0(getParentActivity(), this, inputStickerSet3, null, null, null));
                                    return true;
                                }
                                arrayList = arrayList3;
                                chat2 = chat;
                                z10 = false;
                                arrayList2 = arrayList;
                                taVar = new ta(this, arrayList4, arrayList2, arrayList5, view, f10, f11);
                                if (ChatObject.canBlockUsers(chat2) && (tL_channelAdminLogEvent = messageObject.currentEvent) != null) {
                                    channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                                    if ((!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = messageObject.messageOwner) != null && message.from_id != null && (user = getMessagesController().getUser(Long.valueOf(this.Z.messageOwner.from_id.user_id))) != null && !UserObject.isUserSelf(user)) {
                                        MessagesController messagesController = getMessagesController();
                                        Utilities.Callback<TLRPC.ChannelParticipant> g2Var = new lh.g2(this, arrayList2, arrayList5, arrayList4, taVar, 1);
                                        taVar = taVar;
                                        messagesController.getChannelParticipant(chat2, user, g2Var);
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    return true;
                                }
                                taVar.run();
                                return true;
                            }
                        }
                        if (tL_channelAdminLogEvent4 == null || !(tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                            chat2 = chat;
                            z10 = false;
                            if (tL_channelAdminLogEvent4 != null && (tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && ChatObject.canUserDoAdminAction(chat2, 13)) {
                                org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(getParentActivity(), chat2);
                                zpVar.v = new bb(this);
                                showDialog(zpVar);
                            }
                        } else {
                            chat2 = chat;
                            z10 = false;
                            o70 o70Var = new o70(chat2.id, 0);
                            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat2.id);
                            if (chatFull != null) {
                                o70Var.e0(chatFull);
                                presentFragment(o70Var);
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
                    taVar = new ta(this, arrayList4, arrayList2, arrayList5, view, f10, f11);
                    if (ChatObject.canBlockUsers(chat2)) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                        }
                        MessagesController messagesController2 = getMessagesController();
                        Utilities.Callback<TLRPC.ChannelParticipant> g2Var2 = new lh.g2(this, arrayList2, arrayList5, arrayList4, taVar, 1);
                        taVar = taVar;
                        messagesController2.getChannelParticipant(chat2, user, g2Var2);
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
            n0 n0Var = new n0(this, getParentActivity(), 4);
            this.e0 = n0Var;
            n0Var.setOutlineProvider(new gg.j1(6));
            this.e0.setClipToOutline(true);
            this.e0.setWillNotDraw(false);
            this.e0.setVisibility(4);
            q4 q4Var = new q4(getParentActivity());
            this.f0 = q4Var;
            q4Var.setBackgroundColor(0);
            if (z4) {
                this.e0.addView(this.f0, k7.b6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.g0 = textureView;
            textureView.setOpaque(false);
            this.f0.addView(this.g0, k7.b6.c(-1.0f, -1));
        }
        if (this.e0.getParent() == null) {
            rb rbVar = this.Y;
            n0 n0Var2 = this.e0;
            int i10 = AndroidUtilities.roundMessageSize;
            rbVar.addView(n0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
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
                    MessageObject messageObject3 = (MessageObject) kf.k0.i(1, arrayList3);
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
                    MessageObject messageObject4 = (MessageObject) kf.k0.i(1, arrayList6);
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
            this.S.addListener(new u5(this, 14));
            this.S.setStartDelay(500L);
            this.S.start();
        }
    }

    public final void U0(int i10) {
        if (Build.VERSION.SDK_INT < 31 || this.n == null) {
            return;
        }
        kf.e0 e0Var = this.Q0;
        if (e0Var.c == 0) {
            e0Var.invalidate();
        }
        e0Var.c = i10 | e0Var.c;
    }

    public final void V0(boolean z4) {
        qb qbVar;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new sa(this, 4));
        if (!z4 || (qbVar = this.F) == null) {
            return;
        }
        qbVar.l();
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new sa(this, 1));
    }

    public final void X0(boolean z4) {
        jb jbVar = this.B;
        if (jbVar == null || this.D == null || jbVar.getChildCount() <= 0) {
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
            this.N0 = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject().eventId : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject().eventId : 0L;
            this.O0 = i11;
            this.P0 = (this.B.getMeasuredHeight() - view.getBottom()) - this.B.getPaddingBottom();
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
            org.telegram.ui.Cells.s1 s1Var2 = this.K0;
            if (s1Var2 != null) {
                s1Var2.te = 0;
                s1Var2.ue = null;
            }
        } else {
            if (TextUtils.isEmpty(messageObject.caption) || (s1Var = this.K0) == null || (textLayoutBlocks = s1Var.Z3) == null) {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.s1 s1Var3 = this.K0;
                if (s1Var3 == null || !s1Var3.q1) {
                    charSequence = charSequence2;
                    i10 = 0;
                } else {
                    i10 = s1Var3.j2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                i10 = (int) s1Var.n4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            }
            org.telegram.ui.Cells.s1 s1Var4 = this.K0;
            if (s1Var4 != null) {
                s1Var4.te = 0;
                s1Var4.ue = null;
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
                qb qbVar = this.F;
                int i12 = qbVar.f;
                if (L0 >= i12 && L0 < qbVar.h) {
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
                            xa xaVar = this.J0;
                            if (xaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(xaVar);
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
                                if (childAt instanceof org.telegram.ui.Cells.s1) {
                                    MessageObject messageObject4 = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
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
                                    this.K0 = new org.telegram.ui.Cells.s1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.s1 s1Var = this.K0;
                                TLRPC.Chat chat = this.s;
                                s1Var.K7 = chat != null;
                                s1Var.P7 = ChatObject.isChannel(chat) && chat.megagroup;
                                g12 = this.K0.g1(messageObject, null, z10);
                            }
                            int max = Math.max(-AndroidUtilities.dp(f10), (this.B.getMeasuredHeight() - g12) / 2) - Y0(messageObject);
                            tb tbVar = this.M0;
                            tbVar.a = messageObject;
                            tbVar.e = max;
                            c2.z zVar = this.E;
                            zVar.b = i10;
                            tbVar.b = indexOf2;
                            tbVar.d = max;
                            tbVar.c = false;
                            zVar.c(indexOf2, max, false, false);
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
                arrayList.add(new org.telegram.ui.Cells.s1(context, this.currentAccount));
            }
        }
        this.V = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.j6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        ai.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 15));
        org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(context, null, false, null);
        this.J = ynVar;
        kl klVar = ynVar.h;
        if (klVar != null) {
            klVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        kl klVar2 = ynVar.r;
        if (klVar2 != null) {
            klVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        ynVar.h0 = true;
        this.J.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.J, 0, k7.b6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new hb(this, 0);
        this.O = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        org.telegram.ui.Components.yn ynVar2 = this.J;
        TLRPC.Chat chat = this.s;
        ynVar2.setTitle(chat.title);
        this.J.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.J.setChatAvatar(chat);
        ib ibVar = new ib(this, context);
        this.fragmentView = ibVar;
        this.Y = ibVar;
        kf.e0 e0Var = new kf.e0(context, new ya(this));
        this.Q0 = e0Var;
        this.Y.addView(e0Var);
        ug.i iVar = new ug.i(this.Y);
        rb rbVar = this.Y;
        ng.a aVar = this.e;
        aVar.d = iVar;
        aVar.e = rbVar;
        ng.a aVar2 = this.f;
        aVar2.d = iVar;
        aVar2.e = rbVar;
        ng.a aVar3 = this.b;
        aVar3.d = iVar;
        aVar3.e = rbVar;
        rbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.Y.V(org.telegram.ui.ActionBar.j6.r0());
        this.actionBar.M(aVar, rg.b.o(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, k7.b6.e(-1, -2, 17));
        this.I.setOnTouchListener(new oh.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.w5(this.M, this.Y, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(R.drawable.large_log_actions);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, k7.b6.t(54, 54, 17, 16, 20, 16, -4));
        gg.q qVar = new gg.q(context, 8);
        this.M = qVar;
        qVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        gg.q qVar2 = this.M;
        int i11 = org.telegram.ui.ActionBar.j6.ic;
        qVar2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.M.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.K.addView(this.M, k7.b6.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, k7.b6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        jb jbVar = new jb(this, context);
        this.B = jbVar;
        jbVar.setOnItemClickListener(new h(this, 9));
        this.B.setTag(1);
        this.B.setVerticalScrollBarEnabled(true);
        jb jbVar2 = this.B;
        qb qbVar = new qb(this, context);
        this.F = qbVar;
        jbVar2.setAdapter(qbVar);
        this.B.setClipToPadding(false);
        jb jbVar3 = this.B;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.r;
        jbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        jb jbVar4 = this.B;
        kb kbVar = new kb(this, this.B, this.resourceProvider);
        this.D0 = kbVar;
        jbVar4.setItemAnimator(kbVar);
        this.D0.Q = true;
        this.B.setLayoutAnimation(null);
        k kVar = new k(this);
        this.D = kVar;
        kVar.j1(1);
        this.D.l1(true);
        this.B.setLayoutManager(this.D);
        c2.z zVar = new c2.z(this.B, this.D);
        this.E = zVar;
        zVar.h = new ya(this);
        zVar.i = this.M0;
        this.Y.addView(this.B, k7.b6.c(-1.0f, -1));
        this.B.setOnScrollListener(new n3(this));
        int i14 = this.h0;
        if (i14 != -1) {
            this.D.h1(i14, this.i0);
            this.h0 = -1;
        }
        wg.f fVar = new wg.f(context);
        this.X = fVar;
        fVar.setup(aVar3);
        this.X.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.X.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.X.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.X.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.Y.addView(this.X, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.w, k7.b6.e(-1, -1, 51));
        View view = new View(context);
        this.x = view;
        view.setBackground(new org.telegram.ui.ActionBar.w5(this.x, this.Y, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.f2));
        this.w.addView(this.x, k7.b6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.y.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.w.addView(this.y, k7.b6.e(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.N = v0Var;
        v0Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, k7.b6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        wg.e eVar = new wg.e(context, aVar, f6Var, rg.b.b(f6Var));
        this.H = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.H.c(4, true, false);
        wg.e eVar2 = this.H;
        pg.b c3 = eVar2.n.c(eVar2, null, false);
        c3.n(eVar2.r);
        c3.p(AndroidUtilities.dp(22.0f));
        c3.o(AndroidUtilities.dp(6.0f));
        eVar2.s = c3;
        this.Y.addView(this.H, k7.b6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        final int i15 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ab
            public final /* synthetic */ ub b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        ub ubVar = this.b;
                        if (ubVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(ubVar, ubVar.v0, ubVar.x0, ubVar.s.megagroup);
                            h0Var.S(ubVar.u0);
                            h0Var.d0 = new ya(ubVar);
                            ubVar.showDialog(h0Var);
                            break;
                        }
                        break;
                    case 1:
                        ub ubVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.s.megagroup) {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        ubVar2.showDialog(d2Var);
                        break;
                    default:
                        ub ubVar3 = this.b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.O.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.z4.p(ubVar3.getParentActivity(), new va(ubVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ae, false));
        this.G.setText(LocaleController.getString(R.string.SETTINGS));
        this.G.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.H.getContainer().addView(this.G, k7.b6.e(-2, -2, 17));
        this.H.f.add(this.G);
        this.H.d(false);
        final int i16 = 1;
        this.H.b[4] = new View.OnClickListener(this) { // from class: org.telegram.ui.ab
            public final /* synthetic */ ub b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        ub ubVar = this.b;
                        if (ubVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(ubVar, ubVar.v0, ubVar.x0, ubVar.s.megagroup);
                            h0Var.S(ubVar.u0);
                            h0Var.d0 = new ya(ubVar);
                            ubVar.showDialog(h0Var);
                            break;
                        }
                        break;
                    case 1:
                        ub ubVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.s.megagroup) {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        ubVar2.showDialog(d2Var);
                        break;
                    default:
                        ub ubVar3 = this.b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.O.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.z4.p(ubVar3.getParentActivity(), new va(ubVar3, 0), null).a);
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
        this.Y.addView(this.b0, k7.b6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.c0.setImageResource(R.drawable.msg_calendar);
        this.c0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xe, false), PorterDuff.Mode.MULTIPLY));
        this.b0.addView(this.c0, k7.b6.e(48, 48, 53));
        final int i17 = 2;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ab
            public final /* synthetic */ ub b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        ub ubVar = this.b;
                        if (ubVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(ubVar, ubVar.v0, ubVar.x0, ubVar.s.megagroup);
                            h0Var.S(ubVar.u0);
                            h0Var.d0 = new ya(ubVar);
                            ubVar.showDialog(h0Var);
                            break;
                        }
                        break;
                    case 1:
                        ub ubVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.s.megagroup) {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        ubVar2.showDialog(d2Var);
                        break;
                    default:
                        ub ubVar3 = this.b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.O.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.z4.p(ubVar3.getParentActivity(), new va(ubVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d0 = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ye, false));
        this.d0.setTextSize(15);
        this.d0.setTypeface(AndroidUtilities.bold());
        this.b0.addView(this.d0, k7.b6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.s0 && this.o0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.w, true, 0.3f, true);
            this.B.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.w, false, 0.3f, true);
            this.B.setEmptyView(this.I);
        }
        jb jbVar5 = this.B;
        jbVar5.V1 = true;
        jbVar5.W1 = 1;
        UndoView undoView = new UndoView(context);
        this.C = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.Y.addView(this.C, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        jb jbVar = this.B;
        if (jbVar == null) {
            return;
        }
        int childCount = jbVar.getChildCount();
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
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                t1Var.f = y10;
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
                s1Var.b4(i13, measuredHeight2 - i13, (this.Y.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.B.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject = s1Var.getMessageObject();
                if (this.e0 != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = s1Var.getPhotoImage();
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
                    if ((childAt instanceof org.telegram.ui.Cells.s1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        view = childAt;
                    }
                    i10 = bottom;
                    view3 = childAt;
                }
                kb kbVar = this.D0;
                if ((kbVar == null || (!kbVar.a0(childAt) && !this.D0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().isDateObject) {
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
        n0 n0Var = this.e0;
        if (n0Var != null) {
            if (z10) {
                MediaController.getInstance().setCurrentVideoVisible(true);
            } else {
                n0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.W) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            }
        }
        if (view != null) {
            this.N.T((view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject() : ((org.telegram.ui.Cells.v0) view).getMessageObject()).messageOwner.date, false, true);
        }
        this.Q = false;
        if (!(view3 instanceof org.telegram.ui.Cells.s1) && !(view3 instanceof org.telegram.ui.Cells.v0)) {
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
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.s1 s1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.s1 s1Var3;
        MessageObject messageObject3;
        boolean z4;
        if (i10 == NotificationCenter.emojiLoaded) {
            jb jbVar = this.B;
            if (jbVar != null) {
                jbVar.e1();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagePlayingDidStart) {
            if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                jb jbVar2 = this.B;
                if (jbVar2 != null) {
                    int childCount = jbVar2.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.B.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null) {
                            if (messageObject.isVoice() || messageObject.isMusic()) {
                                s1Var.m4(false, true, false);
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
                this.Y.V(org.telegram.ui.ActionBar.j6.r0());
                this.x.invalidate();
                gg.q qVar = this.M;
                if (qVar != null) {
                    qVar.invalidate();
                }
                this.B.e1();
                return;
            }
            Integer num = (Integer) objArr[0];
            jb jbVar3 = this.B;
            if (jbVar3 != null) {
                int childCount2 = jbVar3.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.B.getChildAt(i13);
                    if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject2 = (s1Var2 = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null) {
                            messageObject2.audioProgress = playingMessageObject.audioProgress;
                            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                            s1Var2.q4();
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
                if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt3;
                    MessageObject messageObject4 = s1Var4.getMessageObject();
                    if (this.e0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                        ImageReceiver photoImage = s1Var4.getPhotoImage();
                        this.e0.setTranslationX(photoImage.getImageX());
                        this.e0.setTranslationY(photoImage.getImageY() + s1Var4.getTop() + this.fragmentView.getPaddingTop());
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
        jb jbVar4 = this.B;
        if (jbVar4 != null) {
            int childCount4 = jbVar4.getChildCount();
            for (int i15 = 0; i15 < childCount4; i15++) {
                View childAt4 = this.B.getChildAt(i15);
                if ((childAt4 instanceof org.telegram.ui.Cells.s1) && (messageObject3 = (s1Var3 = (org.telegram.ui.Cells.s1) childAt4).getMessageObject()) != null) {
                    if (messageObject3.isVoice() || messageObject3.isMusic()) {
                        s1Var3.m4(false, true, false);
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

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e1() {
        jb jbVar = this.B;
        if (jbVar == null) {
            return;
        }
        int childCount = jbVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.B.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                MessageObject messageObject = s1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.s()) {
                        s1Var.setDrawSelectionBackground(false);
                        s1Var.J3(false, true);
                        s1Var.L3(false, false, true);
                    }
                    s1Var.setHighlighted(this.H0 != Integer.MAX_VALUE && messageObject.getRealId() == this.H0);
                    if (this.H0 != Integer.MAX_VALUE) {
                        xa xaVar = this.J0;
                        if (xaVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(xaVar);
                        }
                        xa xaVar2 = new xa(this, 0);
                        this.J0 = xaVar2;
                        AndroidUtilities.runOnUIThread(xaVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.w0)) {
                        s1Var.S3(null);
                    } else {
                        s1Var.S3(this.w0);
                    }
                    s1Var.setSpoilersSuppressed(this.B.getScrollState() != 0);
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 32768, null, null, null, null, i10));
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.j6.c2, org.telegram.ui.ActionBar.j6.d2}, org.telegram.ui.ActionBar.j6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.i8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.j8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.k8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.l8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.m8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.n8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.o8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m3, org.telegram.ui.ActionBar.j6.q3}, null, org.telegram.ui.ActionBar.j6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.n3, org.telegram.ui.ActionBar.j6.r3}, null, org.telegram.ui.ActionBar.j6.dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.j6.m3.k();
        int i13 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.j6.o3.k();
        int i14 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.p3, org.telegram.ui.ActionBar.j6.t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.s2;
        int i15 = org.telegram.ui.ActionBar.j6.ic;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 4, new Class[]{org.telegram.ui.Cells.v0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 2, new Class[]{org.telegram.ui.Cells.v0.class}, org.telegram.ui.ActionBar.j6.s2, null, null, org.telegram.ui.ActionBar.j6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.w4, org.telegram.ui.ActionBar.j6.q4, org.telegram.ui.ActionBar.j6.x4, org.telegram.ui.ActionBar.j6.v4, org.telegram.ui.ActionBar.j6.u4, org.telegram.ui.ActionBar.j6.C4}, null, org.telegram.ui.ActionBar.j6.kc));
        int i16 = org.telegram.ui.ActionBar.j6.lc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.j6.mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.hc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O3, org.telegram.ui.ActionBar.j6.S3, org.telegram.ui.ActionBar.j6.W3}, null, org.telegram.ui.ActionBar.j6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P3, org.telegram.ui.ActionBar.j6.T3, org.telegram.ui.ActionBar.j6.X3}, null, org.telegram.ui.ActionBar.j6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.M3, org.telegram.ui.ActionBar.j6.Q3, org.telegram.ui.ActionBar.j6.U3}, null, org.telegram.ui.ActionBar.j6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.N3, org.telegram.ui.ActionBar.j6.R3, org.telegram.ui.ActionBar.j6.V3}, null, org.telegram.ui.ActionBar.j6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.a4, org.telegram.ui.ActionBar.j6.b4, org.telegram.ui.ActionBar.j6.Z3}, null, org.telegram.ui.ActionBar.j6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.e4}, null, org.telegram.ui.ActionBar.j6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f4}, null, org.telegram.ui.ActionBar.j6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.c4}, null, org.telegram.ui.ActionBar.j6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.d4}, null, org.telegram.ui.ActionBar.j6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.g4}, null, org.telegram.ui.ActionBar.j6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.j6.i4};
        int i17 = org.telegram.ui.ActionBar.j6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.j6.h4, org.telegram.ui.ActionBar.j6.B4, org.telegram.ui.ActionBar.j6.D4};
        int i18 = org.telegram.ui.ActionBar.j6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.J4, null, org.telegram.ui.ActionBar.j6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.H4, null, org.telegram.ui.ActionBar.j6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O4}, null, org.telegram.ui.ActionBar.j6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P4}, null, org.telegram.ui.ActionBar.j6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Q4}, null, org.telegram.ui.ActionBar.j6.qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.b2, null, null, org.telegram.ui.ActionBar.j6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.j4}, null, org.telegram.ui.ActionBar.j6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.J2, null, null, org.telegram.ui.ActionBar.j6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.K2, null, null, org.telegram.ui.ActionBar.j6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.T1, null, null, org.telegram.ui.ActionBar.j6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.Q2, null, null, org.telegram.ui.ActionBar.j6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Rc));
        int i19 = org.telegram.ui.ActionBar.j6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.ab;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.pd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.tb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ub));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.td));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.vb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ud));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.wb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.yb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.xd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.zb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.xb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.yd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.zd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ie));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.je));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.j6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.j6.re));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.j6.se));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.j6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.j6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.j6.qe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.j6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 131072, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 8, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.j6.De));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 4, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, TLObject.FLAG_29, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, TLObject.FLAG_29, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i21 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new sa(this, 0)), this.classGuid);
        setBulletinDelegate(new gg.w(5));
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
        rb rbVar = this.Y;
        if (rbVar != null) {
            org.telegram.ui.Components.o81 o81Var = rbVar.v;
            if (o81Var != null) {
                o81Var.c(false);
            }
            rbVar.C = true;
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
            w4 w4Var = (w4) l10.d;
            int i10 = g5.C;
            w4Var.b(false);
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
        rb rbVar = this.Y;
        if (rbVar != null) {
            org.telegram.ui.Components.o81 o81Var = rbVar.v;
            if (o81Var != null) {
                o81Var.c(true);
            }
            rbVar.C = false;
        }
        this.j0 = false;
        O0(false);
        if (this.k0) {
            this.k0 = false;
            qb qbVar = this.F;
            if (qbVar != null) {
                qbVar.l();
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
