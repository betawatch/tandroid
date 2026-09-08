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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ub extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static int X0 = 10;
    public static final int[] Y0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public a0.i A0;
    public final AnimationNotificationsLocker B0;
    public final HashMap C0;
    public HashMap D0;
    public jb E;
    public boolean E0;
    public UndoView F;
    public final gb F0;
    public hg.b0 G;
    public kb G0;
    public org.telegram.ui.Components.ok0 H;
    public final ArrayList H0;
    public qb I;
    public final a0.i I0;
    public TextView J;
    public eb J0;
    public kh.e K;
    public int K0;
    public FrameLayout L;
    public int L0;
    public org.telegram.ui.Components.co M;
    public xa M0;
    public LinearLayout N;
    public org.telegram.ui.Cells.t1 N0;
    public ImageView O;
    public int O0;
    public bi.c4 P;
    public final tb P0;
    public org.telegram.ui.Cells.w0 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.v0 R;
    public int R0;
    public long S;
    public int S0;
    public boolean T;
    public yf.c0 T0;
    public boolean U;
    public final ArrayList U0;
    public AnimatorSet V;
    public final ArrayList V0;
    public boolean W;
    public final RectF W0;
    public final int[] X;
    public boolean Y;
    public boolean Z;
    public final gh.e a;
    public kh.f a0;
    public final bh.b b;
    public rb b0;
    public final gh.d c;
    public MessageObject c0;
    public final gh.d d;
    public TLRPC.ChannelParticipant d0;
    public final bh.b e;
    public FrameLayout e0;
    public final bh.b f;
    public ImageView f0;
    public org.telegram.ui.ActionBar.j5 g0;
    public final pe.b h;
    public j0 h0;
    public l4 i0;
    public TextureView j0;
    public int k0;
    public int l0;
    public boolean m0;
    public final bh.f n;
    public boolean n0;
    public final a0.i o0;
    public final a0.i p0;
    public final HashMap q0;
    public final int r;
    public final ArrayList r0;
    public final TLRPC.Chat s;
    public final ArrayList s0;
    public final HashSet t0;
    public boolean u0;
    public final ArrayList v;
    public boolean v0;
    public FrameLayout w;
    public boolean w0;
    public View x;
    public ArrayList x0;
    public RadialProgressView y;
    public TLRPC.TL_channelAdminLogEventsFilter y0;
    public String z0;

    public ub(TLRPC.Chat chat) {
        super(null);
        pe.b bVar = new pe.b(true);
        this.h = bVar;
        this.v = new ArrayList();
        this.X = new int[]{2};
        this.k0 = -1;
        this.l0 = 0;
        this.m0 = true;
        this.n0 = false;
        this.o0 = new a0.i();
        this.p0 = new a0.i();
        this.q0 = new HashMap();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.t0 = new HashSet();
        this.y0 = null;
        this.z0 = "";
        this.B0 = new AnimationNotificationsLocker(Y0);
        this.C0 = new HashMap();
        this.F0 = new gb(this);
        this.H0 = new ArrayList();
        this.I0 = new a0.i();
        this.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.L0 = -1;
        this.P0 = new tb(this);
        this.R0 = -1;
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new RectF();
        gh.e eVar = new gh.e();
        this.a = eVar;
        bh.b bVar2 = new bh.b(eVar);
        this.b = bVar2;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.n = null;
            this.r = 0;
            this.c = null;
            this.d = null;
            this.e = new bh.b(eVar);
            this.f = new bh.b(eVar);
        } else {
            bh.f fVar = new bh.f(false);
            this.n = fVar;
            gh.d dVar = new gh.d(eVar);
            this.d = dVar;
            dVar.v = new xa(this, 3);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f = eVar;
            bh.b bVar3 = new bh.b(dVar);
            this.f = bVar3;
            bVar3.f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                gh.d dVar2 = new gh.d(eVar);
                this.c = dVar2;
                dVar2.v = new xa(this, 3);
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f = eVar;
                bh.b bVar4 = new bh.b(dVar2);
                this.e = bVar4;
                bVar4.f = LiteMode.isEnabled(262144);
                this.r = 0;
            } else {
                this.c = null;
                this.e = bVar3;
                this.r = AndroidUtilities.dp(48.0f);
            }
        }
        bVar2.c = bVar;
        this.e.c = bVar;
        this.f.c = bVar;
        this.s = chat;
    }

    public static void A0(ub ubVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = ubVar.getMessagesController();
        TLRPC.Chat chat = ubVar.s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.id);
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(ubVar.b0.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, ubVar, chatFull.id, false, ChatObject.isChannel(chat));
        r60Var.j0 = new hb(ubVar);
        r60Var.show();
    }

    public static void K0(ub ubVar) {
        if (ubVar.E == null || ubVar.r0.isEmpty()) {
            return;
        }
        ubVar.G.h1(ubVar.s0.size() - 1, (-100000) - ubVar.E.getPaddingTop());
    }

    public static m11 S0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.nq nqVar : (org.telegram.ui.Components.nq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.nq.class)) {
            if (nqVar != null) {
                Drawable drawable = nqVar.drawable;
                if (drawable instanceof m11) {
                    return (m11) drawable;
                }
            }
        }
        return null;
    }

    public static void U(ub ubVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.i iVar = ubVar.o0;
        int i10 = 0;
        ubVar.G0.N = false;
        ubVar.X0(false);
        MessagesController.getInstance(ubVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(ubVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = ubVar.r0;
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
                ubVar.S = Math.min(ubVar.S, tL_channelAdminLogEvent.id);
                MessageObject messageObject2 = new MessageObject(ubVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) ubVar.q0, ubVar.s, ubVar.X, false);
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
                ubVar.p0.k(messageObject3, messageObject3.getRealId());
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
        ubVar.v0 = false;
        if (!z10) {
            ubVar.u0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(ubVar.w, false, 0.3f, true);
        ubVar.E.setEmptyView(ubVar.L);
        qb qbVar = ubVar.I;
        if (qbVar != null) {
            qbVar.l();
        }
        org.telegram.ui.ActionBar.v0 v0Var = ubVar.R;
        if (v0Var != null) {
            if (ubVar.s0.isEmpty() && TextUtils.isEmpty(ubVar.z0)) {
                i10 = 8;
            }
            v0Var.setVisibility(i10);
        }
    }

    public static void V(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
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
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.k1(ubVar.getParentActivity(), ubVar.getResourceProvider()), w7.x5.n(-1, 8));
            } else {
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, ubVar.getParentActivity(), ubVar.getResourceProvider(), i11 == 0, i11 == size + (-1));
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                    f1Var.c(ubVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7), ubVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                }
                Integer num = (Integer) arrayList4.get(i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                f1Var.setOnClickListener(new bi.b7(ubVar, i11, arrayList4, num, 1));
            }
            i11++;
            arrayList4 = arrayList;
        }
        db dbVar = new db(0, ubVar.b0.getContext(), ubVar);
        dbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        dbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        eb ebVar = new eb(ubVar, dbVar);
        ubVar.J0 = ebVar;
        ebVar.e = true;
        ebVar.c = 220;
        ebVar.setOutsideTouchable(true);
        ubVar.J0.setClippingEnabled(true);
        ubVar.J0.setAnimationStyle(R.style.PopupContextAnimation);
        ubVar.J0.setFocusable(true);
        dbVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        ubVar.J0.setInputMethodMode(2);
        ubVar.J0.setSoftInputMode(48);
        ubVar.J0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f7)) - dbVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
        if (left < AndroidUtilities.dp(6.0f)) {
            left = AndroidUtilities.dp(6.0f);
        } else if (left > (ubVar.E.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - dbVar.getMeasuredWidth()) {
            left = (ubVar.E.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - dbVar.getMeasuredWidth();
        }
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            ubVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = ubVar.b0.getHeight();
        int dp = AndroidUtilities.dp(48.0f) + dbVar.getMeasuredHeight();
        int R = ubVar.b0.R();
        if (R > AndroidUtilities.dp(20.0f)) {
            height += R;
        }
        if (dp < height) {
            int y3 = (int) (ubVar.E.getY() + view.getTop() + f10);
            i10 = (dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f) ? (AndroidUtilities.dp(240.0f) - dp) + y3 : y3;
            if (i10 < ubVar.E.getY() + AndroidUtilities.dp(24.0f)) {
                i10 = (int) (ubVar.E.getY() + AndroidUtilities.dp(24.0f));
            } else {
                int i12 = height - dp;
                if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                    i10 = i12 - AndroidUtilities.dp(8.0f);
                }
            }
        } else if (!ubVar.inBubbleMode) {
            i10 = AndroidUtilities.statusBarHeight;
        }
        dbVar.setMaxHeight(height - i10);
        ubVar.J0.showAtLocation(ubVar.E, 51, left, i10);
        ubVar.J0.b();
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
        if (ubVar.c0 == null || i10 >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        TLRPC.Chat chat2 = ubVar.s;
        eb ebVar = ubVar.J0;
        if (ebVar != null) {
            ebVar.dismiss();
        }
        MessageObject messageObject = ubVar.c0;
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
            org.telegram.messenger.wl.o(R.string.MessageCopied, org.telegram.ui.Components.yc.a0(ubVar));
        } else if (intValue == 4) {
            String str = messageObject.messageOwner.attachPath;
            if (str != null && str.length() > 0 && !w.f.o(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                str = ubVar.getFileLoader().getPathToMessage(ubVar.c0.messageOwner).toString();
            }
            int i11 = ubVar.c0.type;
            if (i11 == 3 || i11 == 1) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23 && ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && ubVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                    ubVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    ubVar.c0 = null;
                    ubVar.d0 = null;
                    return;
                }
                MediaController.saveFile(str, ubVar.getParentActivity(), ubVar.c0.type == 3 ? 1 : 0, null, null);
            }
        } else if (intValue == 5) {
            String str2 = messageObject.messageOwner.attachPath;
            if (str2 != null && str2.length() != 0) {
                file = new File(ubVar.c0.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage = ubVar.getFileLoader().getPathToMessage(ubVar.c0.messageOwner);
                if (pathToMessage.exists()) {
                    file = pathToMessage;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    hg.b0 b0Var = ubVar.G;
                    if (b0Var != null) {
                        if (b0Var.N0() < ubVar.G.B() - 1) {
                            int L0 = ubVar.G.L0();
                            ubVar.k0 = L0;
                            org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) ubVar.E.K(L0);
                            if (vk0Var != null) {
                                ubVar.l0 = vk0Var.a.getTop();
                            } else {
                                ubVar.k0 = -1;
                            }
                        } else {
                            ubVar.k0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, ubVar.c0.getDocumentName(), null, true);
                    if (u10 != null) {
                        ubVar.presentFragment(new wd1(u10));
                    } else {
                        ubVar.k0 = -1;
                        if (ubVar.getParentActivity() == null) {
                            ubVar.c0 = null;
                            ubVar.d0 = null;
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar.getParentActivity());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.IncorrectTheme);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            ubVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                } else if (LocaleController.getInstance().applyLanguageFile(file, ubVar.currentAccount)) {
                    ubVar.presentFragment(new LanguageSelectActivity());
                } else if (ubVar.getParentActivity() == null) {
                    ubVar.c0 = null;
                    ubVar.d0 = null;
                    return;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ubVar.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.IncorrectLocalization);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    ubVar.showDialog(alertDialog$Builder2.a);
                }
            }
        } else if (intValue == 6) {
            String str3 = messageObject.messageOwner.attachPath;
            if (str3 != null && str3.length() > 0 && !w.f.o(str3)) {
                str3 = null;
            }
            if (str3 == null || str3.length() == 0) {
                str3 = ubVar.getFileLoader().getPathToMessage(ubVar.c0.messageOwner).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(ubVar.c0.getDocument().mime_type);
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
                    ubVar.showDialog(new org.telegram.ui.Components.ux0(ubVar.getParentActivity(), ubVar, ubVar.c0.getInputStickerSet(), null, null, null));
                    break;
                case 10:
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 23 && ((i13 <= 28 || BuildVars.NO_SCOPED_STORAGE) && ubVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                        ubVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        ubVar.c0 = null;
                        ubVar.d0 = null;
                        return;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(ubVar.c0.getDocument());
                    if (TextUtils.isEmpty(documentFileName)) {
                        documentFileName = ubVar.c0.getFileName();
                    }
                    String str4 = ubVar.c0.messageOwner.attachPath;
                    if (str4 != null && str4.length() > 0 && !w.f.o(str4)) {
                        str4 = null;
                    }
                    if (str4 == null || str4.length() == 0) {
                        str4 = ubVar.getFileLoader().getPathToMessage(ubVar.c0.messageOwner).toString();
                    }
                    MediaController.saveFile(str4, ubVar.getParentActivity(), ubVar.c0.isMusic() ? 3 : 2, documentFileName, ubVar.c0.getDocument() != null ? ubVar.c0.getDocument().mime_type : "");
                    break;
                case 11:
                    MessagesController.getInstance(ubVar.currentAccount).saveGif(ubVar.c0, messageObject.getDocument());
                    break;
                default:
                    switch (intValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", ubVar.c0.messageOwner.media.user_id);
                            bundle.putString("phone", ubVar.c0.messageOwner.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            ubVar.presentFragment(new ss(bundle));
                            break;
                        case 16:
                            AndroidUtilities.addToClipboard(messageObject.messageOwner.media.phone_number);
                            org.telegram.messenger.wl.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(ubVar));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ubVar.c0.messageOwner.media.phone_number));
                                intent2.addFlags(TLObject.FLAG_28);
                                ubVar.getParentActivity().startActivityForResult(intent2, 500);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                break;
                            }
                        default:
                            switch (intValue) {
                                case 33:
                                    if (ubVar.d0 != null) {
                                        TLRPC.User user3 = ubVar.getMessagesController().getUser(Long.valueOf(DialogObject.getPeerDialogId(ubVar.d0.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = ubVar.d0;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = ubVar.d0.banned_rights;
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
                                        ubVar.getMessagesController().setParticipantBannedRole(chat2.id, user3, null, ubVar.d0.banned_rights, true, ubVar.getFragmentForAlert(1), new org.telegram.ui.ActionBar.c6(16, ubVar, user3));
                                        break;
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = ubVar.getMessagesController().getInputChannel(chat2.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = ubVar.c0.getRealId();
                                    ubVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new ra(ubVar, 3));
                                    break;
                                case 35:
                                    ubVar.getMessagesController().deleteParticipantFromChat(chat2.id, ubVar.getMessagesController().getInputPeer(ubVar.c0.messageOwner.from_id), false, false, (Runnable) new xa(ubVar, 2));
                                    if ((ubVar.c0.messageOwner.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.yc.a(ubVar) && (user = ubVar.getMessagesController().getUser(Long.valueOf(ubVar.c0.messageOwner.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.yc.D(ubVar, user, chat2.title).j();
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
                str5 = ubVar.getFileLoader().getPathToMessage(ubVar.c0.messageOwner).toString();
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 23 && ((i14 <= 28 || BuildVars.NO_SCOPED_STORAGE) && ubVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                ubVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                ubVar.c0 = null;
                ubVar.d0 = null;
                return;
            }
            MediaController.saveFile(str5, ubVar.getParentActivity(), 0, null, null);
        }
        ubVar.c0 = null;
        ubVar.d0 = null;
    }

    public static void X(ub ubVar, int i10) {
        int i11;
        RectF rectF;
        gh.d dVar = ubVar.c;
        gh.d dVar2 = ubVar.d;
        ArrayList arrayList = ubVar.V0;
        bh.f fVar = ubVar.n;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 31 || fVar == null) {
            return;
        }
        if (w7.b0.a(i10, 2)) {
            ArrayList arrayList2 = ubVar.U0;
            if (i12 >= 29) {
                if (dVar2 != null) {
                    if (arrayList2.isEmpty()) {
                        rectF = new RectF();
                        arrayList2.add(rectF);
                    } else {
                        rectF = (RectF) arrayList2.get(0);
                    }
                    rectF.set(0.0f, 0.0f, ubVar.b0.getMeasuredWidth(), ubVar.E.getY() + ubVar.E.getPaddingTop());
                    rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                    i11 = dVar2.c(1, AndroidUtilities.dp(48.0f), arrayList2) + 1;
                } else {
                    i11 = 0;
                }
                if (dVar != null) {
                    i11 += dVar.c(i11, AndroidUtilities.dp(8.0f), arrayList2);
                }
            } else {
                i11 = 0;
            }
            int a2 = yf.f0.a(i11, arrayList2, arrayList);
            int measuredWidth = ubVar.b0.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF2 = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF2.left = w7.p.a(rectF2.left, 0.0f, f7);
                rectF2.top = Math.max(ubVar.E.getY(), rectF2.top);
                rectF2.right = w7.p.a(rectF2.right, 0.0f, f7);
                rectF2.bottom = Math.min(ubVar.E.getY() + ubVar.E.getMeasuredHeight(), rectF2.bottom);
            }
            fVar.g(a2, arrayList);
        }
        rb rbVar = ubVar.b0;
        Objects.requireNonNull(rbVar);
        if (fVar.e(new wa(rbVar, 0), ubVar.b0.getWidth(), ubVar.b0.getHeight())) {
            if (dVar != null) {
                dVar.d();
            }
            if (dVar2 != null) {
                dVar2.d();
            }
            org.telegram.ui.ActionBar.k kVar = ubVar.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
            ubVar.b0.invalidate();
            Iterator it = ubVar.h.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public static void Y(ub ubVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.i iVar = ubVar.o0;
        ubVar.w0 = false;
        ubVar.G0.N = false;
        ubVar.X0(false);
        MessagesController.getInstance(ubVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(ubVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
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
                ubVar.S = Math.min(ubVar.S, tL_channelAdminLogEvent2.id);
                MessageObject messageObject = new MessageObject(ubVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, ubVar.s, ubVar.X, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !iVar.d(tL_channelAdminLogEvent2.id))) {
                    ubVar.r0.add(0, messageObject);
                    iVar.k(messageObject, tL_channelAdminLogEvent2.id);
                    z10 = true;
                }
            }
        }
        if (ubVar.I == null || !z10) {
            return;
        }
        ubVar.R0();
        ubVar.I.l();
    }

    public static void Z(ub ubVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = ubVar.s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            ubVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            ubVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            ubVar.x0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = ubVar.getMessagesController().getChatFull(chat.id)) != null && chatFull.antispam) {
                fb fbVar = new fb();
                fbVar.user_id = ubVar.getMessagesController().telegramAntispamUserId;
                fbVar.peer = ubVar.getMessagesController().getPeer(fbVar.user_id);
                long j3 = ubVar.getMessagesController().telegramAntispamUserId;
                if (ubVar.getMessagesController().getUser(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(ubVar.currentAccount).sendRequest(tL_users_getUsers, new ra(ubVar, 2));
                }
                ubVar.x0.add(0, fbVar);
            }
            Dialog dialog = ubVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.h0) {
                ((org.telegram.ui.Components.h0) dialog).S(ubVar.x0);
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
            if (!com.google.android.gms.internal.vision.e2.u(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.y.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.y.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
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
    public static void p0(ub ubVar, Bundle bundle, long j3) {
        TLRPC.Chat chat = ubVar.s;
        if (!chat.megagroup || ubVar.x0 == null || !ChatObject.canBlockUsers(chat)) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= ubVar.x0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) ubVar.x0.get(i10);
            if (MessageObject.getPeerId(channelParticipant.peer) != j3) {
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            b2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            b2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        ubVar.showDialog(b2Var);
    }

    public final MessageObject N0(long j3, long j10, ArrayList arrayList, boolean z10, boolean z11) {
        int i10;
        MessageObject messageObject;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.s0;
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
            tL_message.dialog_id = -this.s.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e7) {
                FileLog.e(e7);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z11 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new l8(i10)).distinct().map(new Function() { // from class: org.telegram.ui.za
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l4 = (Long) obj;
                ub ubVar = ub.this;
                ubVar.getClass();
                if (l4.longValue() >= 0) {
                    return UserObject.getForcedFirstName(ubVar.getMessagesController().getUser(l4));
                }
                TLRPC.Chat chat = ubVar.getMessagesController().getChat(Long.valueOf(-l4.longValue()));
                if (chat == null) {
                    return null;
                }
                return chat.title;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new ab(i11)).limit(4L).toArray())), "un1", user));
        if (z11 && arrayList.size() > 1) {
            m11 S0 = S0(messageObject.messageText);
            if (S0 == null) {
                S0 = new m11(LocaleController.getString(z10 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.p6 p6Var = S0.a;
                p6Var.u(bold);
                p6Var.t(AndroidUtilities.dp(10.0f));
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
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? (MessageObject) i2.g.h(1, arrayList) : null;
        if (messageObject2 != null) {
            long j11 = messageObject2.eventId;
            a0.i iVar = this.I0;
            if (!iVar.d(j11)) {
                long j12 = messageObject2.eventId;
                int i13 = X0;
                X0 = i13 + 1;
                iVar.k(Integer.valueOf(i13), j12);
            }
            messageObject.stableId = ((Integer) iVar.f(messageObject2.eventId)).intValue();
        }
        return messageObject;
    }

    public final void O0(boolean z10) {
        hg.b0 b0Var = this.G;
        if (b0Var == null || this.m0) {
            return;
        }
        int L0 = b0Var.L0();
        if ((L0 == -1 ? 0 : Math.abs(this.G.N0() - L0) + 1) > 0) {
            this.I.getClass();
            if (L0 > (z10 ? 4 : 1) || this.v0 || this.u0) {
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
        r2.setSpan(new di.ec(r22, 3), 0, r2.length(), 33);
        r0 = org.telegram.ui.Components.yc.a0(r22).M(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamUser), org.telegram.messenger.AndroidUtilities.replaceCharSequence("%s", org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamInfo2), r2), org.telegram.messenger.R.raw.msg_antispam);
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
        sa saVar;
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
                this.c0 = messageObject;
                if (getParentActivity() != null) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    TLRPC.Chat chat3 = this.s;
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
                    MessageObject messageObject2 = this.c0;
                    if (messageObject2.type == 0 || messageObject2.caption != null) {
                        arrayList3.add(LocaleController.getString(R.string.Copy));
                        org.telegram.ui.Cells.p6.n(R.drawable.msg_copy, 3, arrayList5, arrayList4);
                    }
                    if (c10 == 1) {
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = this.c0.currentEvent;
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
                                    showDialog(new org.telegram.ui.Components.ux0(getParentActivity(), this, inputStickerSet3, null, null, null));
                                    return true;
                                }
                                arrayList = arrayList3;
                                chat2 = chat;
                                z11 = false;
                                arrayList2 = arrayList;
                                saVar = new sa(this, arrayList4, arrayList2, arrayList5, view, f7, f10);
                                if (ChatObject.canBlockUsers(chat2) && (tL_channelAdminLogEvent = messageObject.currentEvent) != null) {
                                    channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                                    if ((!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = messageObject.messageOwner) != null && message.from_id != null && (user = getMessagesController().getUser(Long.valueOf(this.c0.messageOwner.from_id.user_id))) != null && !UserObject.isUserSelf(user)) {
                                        MessagesController messagesController = getMessagesController();
                                        Utilities.Callback<TLRPC.ChannelParticipant> taVar = new ta(this, arrayList2, arrayList5, arrayList4, saVar, 0);
                                        saVar = saVar;
                                        messagesController.getChannelParticipant(chat2, user, taVar);
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    return true;
                                }
                                saVar.run();
                                return true;
                            }
                        }
                        if (tL_channelAdminLogEvent4 == null || !(tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                            chat2 = chat;
                            z11 = false;
                            if (tL_channelAdminLogEvent4 != null && (tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && ChatObject.canUserDoAdminAction(chat2, 13)) {
                                org.telegram.ui.Components.bq bqVar = new org.telegram.ui.Components.bq(getParentActivity(), chat2);
                                bqVar.v = new cb(this);
                                showDialog(bqVar);
                            }
                        } else {
                            chat2 = chat;
                            z11 = false;
                            u70 u70Var = new u70(chat2.id, 0);
                            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat2.id);
                            if (chatFull != null) {
                                u70Var.e0(chatFull);
                                presentFragment(u70Var);
                            }
                        }
                    } else {
                        chat2 = chat;
                        z11 = false;
                        if (c10 == 3) {
                            TLRPC.MessageMedia messageMedia = this.c0.messageOwner.media;
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
                                if (this.c0.isMask()) {
                                    arrayList3.add(LocaleController.getString(R.string.AddToMasks));
                                } else {
                                    arrayList3.add(LocaleController.getString(R.string.AddToStickers));
                                }
                                org.telegram.ui.Cells.p6.n(R.drawable.msg_sticker, 9, arrayList5, arrayList4);
                            } else if (c10 == '\b') {
                                long j3 = this.c0.messageOwner.media.user_id;
                                TLRPC.User user3 = j3 != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)) : user2;
                                if (user3 != null && user3.id != UserConfig.getInstance(this.currentAccount).getClientUserId() && ContactsController.getInstance(this.currentAccount).contactsDict.get(Long.valueOf(user3.id)) == null) {
                                    arrayList3.add(LocaleController.getString(R.string.AddContactTitle));
                                    org.telegram.ui.Cells.p6.n(R.drawable.msg_addcontact, 15, arrayList5, arrayList4);
                                }
                                if (!TextUtils.isEmpty(this.c0.messageOwner.media.phone_number)) {
                                    arrayList3.add(LocaleController.getString(R.string.Copy));
                                    org.telegram.ui.Cells.p6.n(R.drawable.msg_copy, 16, arrayList5, arrayList4);
                                    arrayList3.add(LocaleController.getString(R.string.Call));
                                    org.telegram.ui.Cells.p6.n(R.drawable.msg_calls, 17, arrayList5, arrayList4);
                                }
                            }
                        } else if (this.c0.isVideo()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else if (this.c0.isMusic()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToMusic));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_download, arrayList5, arrayList4, num);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else {
                            Integer num4 = num;
                            if (this.c0.getDocument() != null) {
                                if (MessageObject.isNewGifDocument(this.c0.getDocument())) {
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
                    saVar = new sa(this, arrayList4, arrayList2, arrayList5, view, f7, f10);
                    if (ChatObject.canBlockUsers(chat2)) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                        }
                        MessagesController messagesController2 = getMessagesController();
                        Utilities.Callback<TLRPC.ChannelParticipant> taVar2 = new ta(this, arrayList2, arrayList5, arrayList4, saVar, 0);
                        saVar = saVar;
                        messagesController2.getChannelParticipant(chat2, user, taVar2);
                        z11 = true;
                    }
                    if (!z11) {
                    }
                }
            }
            c10 = 65535;
            this.c0 = messageObject;
            if (getParentActivity() != null) {
            }
        }
        return false;
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.h0 == null) {
            j0 j0Var = new j0(this, getParentActivity(), 4);
            this.h0 = j0Var;
            j0Var.setOutlineProvider(new bi.z1(8));
            this.h0.setClipToOutline(true);
            this.h0.setWillNotDraw(false);
            this.h0.setVisibility(4);
            l4 l4Var = new l4(getParentActivity());
            this.i0 = l4Var;
            l4Var.setBackgroundColor(0);
            if (z10) {
                this.h0.addView(this.i0, w7.x5.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.j0 = textureView;
            textureView.setOpaque(false);
            this.i0.addView(this.j0, w7.x5.c(-1.0f, -1));
        }
        if (this.h0.getParent() == null) {
            rb rbVar = this.b0;
            j0 j0Var2 = this.h0;
            int i10 = AndroidUtilities.roundMessageSize;
            rbVar.addView(j0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.h0.setVisibility(4);
        this.i0.setDrawingReady(false);
        return this.j0;
    }

    public final void R0() {
        ArrayList arrayList;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.H0.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = this.r0;
            if (i10 >= arrayList4.size()) {
                ArrayList arrayList5 = this.s0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList4.get(i10);
            long j3 = (messageObject == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (messageObject.stableId <= 0) {
                int i11 = X0;
                X0 = i11 + 1;
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
                    MessageObject messageObject3 = (MessageObject) i2.g.h(1, arrayList3);
                    boolean z11 = TextUtils.isEmpty(this.z0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(messageObject3.eventId);
                    HashSet hashSet = this.t0;
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
                        this.I.m((z10 ? arrayList3.size() - 1 : 0) + size);
                        this.I.m(size + (z10 ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j11 = messageObject.eventId;
                    MessageObject N0 = N0(j11, messageObject.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j11)), z11);
                    arrayList = arrayList3;
                    arrayList2.add(N0);
                }
                if (!arrayList6.isEmpty()) {
                    MessageObject messageObject4 = (MessageObject) i2.g.h(1, arrayList6);
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
        if (this.Q.getTag() == null || this.T) {
            return;
        }
        if (!this.W || this.U) {
            this.Q.setTag(null);
            if (!z10) {
                AnimatorSet animatorSet = this.V;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.V = null;
                }
                this.Q.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.V = animatorSet2;
            animatorSet2.setDuration(150L);
            this.V.playTogether(ObjectAnimator.ofFloat(this.Q, "alpha", 0.0f));
            this.V.addListener(new s0(this, 18));
            this.V.setStartDelay(500L);
            this.V.start();
        }
    }

    public final void U0(int i10) {
        if (Build.VERSION.SDK_INT < 31 || this.n == null) {
            return;
        }
        yf.c0 c0Var = this.T0;
        if (c0Var.c == 0) {
            c0Var.invalidate();
        }
        c0Var.c = i10 | c0Var.c;
    }

    public final void V0(boolean z10) {
        qb qbVar;
        if (this.v0) {
            return;
        }
        ArrayList arrayList = this.r0;
        if (z10) {
            this.S = Long.MAX_VALUE;
            FrameLayout frameLayout = this.w;
            if (frameLayout != null) {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                this.L.setVisibility(4);
                this.E.setEmptyView(null);
            }
            this.o0.b();
            arrayList.clear();
            this.q0.clear();
            R0();
        }
        this.v0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.s);
        tL_channels_getAdminLog.q = this.z0;
        tL_channels_getAdminLog.limit = 50;
        if (z10 || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.S;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.y0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.A0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.A0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.A0.n(i10)));
            }
        }
        c1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ra(this, 4));
        if (!z10 || (qbVar = this.I) == null) {
            return;
        }
        qbVar.l();
    }

    public final void W0() {
        if (this.w0) {
            return;
        }
        this.w0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.s);
        tL_channels_getAdminLog.q = this.z0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.y0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.A0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.A0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.A0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ra(this, 1));
    }

    public final void X0(boolean z10) {
        jb jbVar = this.E;
        if (jbVar == null || this.G == null || jbVar.getChildCount() <= 0) {
            return;
        }
        int i10 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < this.E.getChildCount(); i12++) {
            View childAt = this.E.getChildAt(i12);
            this.E.getClass();
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
            this.Q0 = view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject().eventId : view instanceof org.telegram.ui.Cells.w0 ? ((org.telegram.ui.Cells.w0) view).getMessageObject().eventId : 0L;
            this.R0 = i11;
            this.S0 = (this.E.getMeasuredHeight() - view.getBottom()) - this.E.getPaddingBottom();
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
            org.telegram.ui.Cells.t1 t1Var2 = this.N0;
            if (t1Var2 != null) {
                t1Var2.we = 0;
                t1Var2.xe = null;
            }
        } else {
            if (TextUtils.isEmpty(messageObject.caption) || (t1Var = this.N0) == null || (textLayoutBlocks = t1Var.c4) == null) {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var3 = this.N0;
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
            org.telegram.ui.Cells.t1 t1Var4 = this.N0;
            if (t1Var4 != null) {
                t1Var4.we = 0;
                t1Var4.xe = null;
            }
            if (arrayList != null && charSequence != null && (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.L0)) >= 0) {
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
                        if (textYOffset > AndroidUtilities.displaySize.y * (this.b0.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)) {
                            return (int) (textYOffset - (AndroidUtilities.displaySize.y * (this.b0.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)));
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
        float f7;
        int g12;
        MessageObject messageObject2;
        ArrayList arrayList = this.s0;
        if (arrayList.size() > 0) {
            int N0 = this.G.N0();
            for (int L0 = this.G.L0(); L0 <= N0; L0++) {
                qb qbVar = this.I;
                int i12 = qbVar.f;
                if (L0 >= i12 && L0 < qbVar.h) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(L0 - i12);
                    if (messageObject3.contentType != 1 && messageObject3.getRealId() != 0 && !messageObject3.isSponsored()) {
                        i11 = L0 - this.I.f;
                        i10 = (messageObject3.getRealId() < messageObject.getRealId() ? 1 : 0) ^ 1;
                        this.H.b = i10;
                        indexOf = arrayList.indexOf(messageObject);
                        if (indexOf == -1) {
                            if (i11 > 0) {
                                i10 = i11 > indexOf ? 0 : 1;
                                this.H.b = i10;
                            }
                            xa xaVar = this.M0;
                            if (xaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(xaVar);
                                this.M0 = null;
                            }
                            this.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.K0 = messageObject.getRealId();
                            int indexOf2 = arrayList.indexOf(messageObject) + this.I.f;
                            e1();
                            int childCount = this.E.getChildCount();
                            int i13 = 0;
                            boolean z10 = false;
                            int i14 = 0;
                            while (true) {
                                if (i13 >= childCount) {
                                    f7 = 2.0f;
                                    break;
                                }
                                View childAt = this.E.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.t1) {
                                    MessageObject messageObject4 = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                                    if (messageObject4 != null) {
                                        f7 = 2.0f;
                                        if (messageObject4.getRealId() == messageObject.getRealId()) {
                                            childAt.sendAccessibilityEvent(8);
                                            i14 = Y0(messageObject4);
                                            z10 = true;
                                        }
                                    } else {
                                        f7 = 2.0f;
                                    }
                                    if (z10) {
                                        i13++;
                                    } else {
                                        int top = childAt.getTop() - (Math.max(-AndroidUtilities.dp(f7), (this.E.getMeasuredHeight() - childAt.getHeight()) / 2) - i14);
                                        int computeVerticalScrollRange = (this.E.computeVerticalScrollRange() - this.E.computeVerticalScrollOffset()) - this.E.computeVerticalScrollExtent();
                                        if (computeVerticalScrollRange < 0) {
                                            computeVerticalScrollRange = 0;
                                        }
                                        if (top > computeVerticalScrollRange) {
                                            top = computeVerticalScrollRange;
                                        }
                                        if (top != 0) {
                                            this.E.v0(0, top, null);
                                            this.E.setOverScrollMode(2);
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
                                if (this.N0 == null) {
                                    this.N0 = new org.telegram.ui.Cells.t1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.t1 t1Var = this.N0;
                                TLRPC.Chat chat = this.s;
                                t1Var.N7 = chat != null;
                                t1Var.S7 = ChatObject.isChannel(chat) && chat.megagroup;
                                g12 = this.N0.g1(messageObject, null, z11);
                            }
                            int max = Math.max(-AndroidUtilities.dp(f7), (this.E.getMeasuredHeight() - g12) / 2) - Y0(messageObject);
                            tb tbVar = this.P0;
                            tbVar.a = messageObject;
                            tbVar.e = max;
                            org.telegram.ui.Components.ok0 ok0Var = this.H;
                            ok0Var.b = i10;
                            tbVar.b = indexOf2;
                            tbVar.d = max;
                            tbVar.c = false;
                            ok0Var.c(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        this.H.b = i10;
        indexOf = arrayList.indexOf(messageObject);
        if (indexOf == -1) {
        }
    }

    public final void c1() {
        if (this.P == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.z0)) {
            this.O.setVisibility(8);
            this.P.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.P.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.A0 != null || this.y0 != null) {
            this.O.setVisibility(8);
            this.P.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.P.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        } else {
            this.O.setVisibility(0);
            this.P.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.s.megagroup) {
                this.P.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.P.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.t1(context, this.currentAccount));
            }
        }
        this.Y = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.j6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        i2.g.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 29));
        org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(context, null, false, null);
        this.M = coVar;
        ll llVar = coVar.h;
        if (llVar != null) {
            llVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        ll llVar2 = coVar.r;
        if (llVar2 != null) {
            llVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        coVar.k0 = true;
        this.M.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.M, 0, w7.x5.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 1);
        this.R = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.R.setSearchPaddingStart(7);
        this.M.setEnabled(false);
        org.telegram.ui.Components.co coVar2 = this.M;
        TLRPC.Chat chat = this.s;
        coVar2.setTitle(chat.title);
        this.M.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.M.setChatAvatar(chat);
        ib ibVar = new ib(this, context);
        this.fragmentView = ibVar;
        this.b0 = ibVar;
        yf.c0 c0Var = new yf.c0(context, new ya(this));
        this.T0 = c0Var;
        this.b0.addView(c0Var);
        ih.k kVar = new ih.k(this.b0);
        rb rbVar = this.b0;
        bh.b bVar = this.e;
        bVar.d = kVar;
        bVar.e = rbVar;
        bh.b bVar2 = this.f;
        bVar2.d = kVar;
        bVar2.e = rbVar;
        bh.b bVar3 = this.b;
        bVar3.d = kVar;
        bVar3.e = rbVar;
        rbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.b0.V(org.telegram.ui.ActionBar.j6.r0());
        this.actionBar.M(bVar, fh.b.o(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setVisibility(4);
        this.b0.addView(this.L, w7.x5.e(-1, -2, 17));
        this.L.setOnTouchListener(new ci.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.v5(this.P, this.b0, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.f2));
        this.N.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.O = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.O.setImageResource(R.drawable.large_log_actions);
        this.O.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.O.setVisibility(8);
        this.N.addView(this.O, w7.x5.t(54, 54, 17, 16, 20, 16, -4));
        bi.c4 c4Var = new bi.c4(context, 9);
        this.P = c4Var;
        c4Var.setTextSize(1, 14.0f);
        this.P.setGravity(17);
        bi.c4 c4Var2 = this.P;
        int i11 = org.telegram.ui.ActionBar.j6.ic;
        c4Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.P.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.N.addView(this.P, w7.x5.t(-2, -2, 17, 0, 0, 0, 0));
        this.L.addView(this.N, w7.x5.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        jb jbVar = new jb(this, context);
        this.E = jbVar;
        jbVar.setOnItemClickListener(new g(this, 9));
        this.E.setTag(1);
        this.E.setVerticalScrollBarEnabled(true);
        jb jbVar2 = this.E;
        qb qbVar = new qb(this, context);
        this.I = qbVar;
        jbVar2.setAdapter(qbVar);
        this.E.setClipToPadding(false);
        jb jbVar3 = this.E;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.r;
        jbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        jb jbVar4 = this.E;
        kb kbVar = new kb(this, this.E, this.resourceProvider);
        this.G0 = kbVar;
        jbVar4.setItemAnimator(kbVar);
        this.G0.Q = true;
        this.E.setLayoutAnimation(null);
        hg.b0 b0Var = new hg.b0(this);
        this.G = b0Var;
        b0Var.j1(1);
        this.G.l1(true);
        this.E.setLayoutManager(this.G);
        org.telegram.ui.Components.ok0 ok0Var = new org.telegram.ui.Components.ok0(this.E, this.G);
        this.H = ok0Var;
        ok0Var.h = new ya(this);
        ok0Var.i = this.P0;
        this.b0.addView(this.E, w7.x5.c(-1.0f, -1));
        this.E.setOnScrollListener(new i3(this));
        int i14 = this.k0;
        if (i14 != -1) {
            this.G.h1(i14, this.l0);
            this.k0 = -1;
        }
        kh.f fVar = new kh.f(context);
        this.a0 = fVar;
        fVar.setup(bVar3);
        this.a0.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.a0.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.a0.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.a0.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.b0.addView(this.a0, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.b0.addView(this.w, w7.x5.e(-1, -1, 51));
        View view = new View(context);
        this.x = view;
        view.setBackground(new org.telegram.ui.ActionBar.v5(this.x, this.b0, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.f2));
        this.w.addView(this.x, w7.x5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.y.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.w.addView(this.y, w7.x5.e(32, 32, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        this.Q = w0Var;
        w0Var.setAlpha(0.0f);
        this.Q.setImportantForAccessibility(2);
        this.b0.addView(this.Q, w7.x5.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.b0.addView(this.actionBar);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        kh.e eVar = new kh.e(context, bVar, fh.b.b(f6Var), f6Var);
        this.K = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.K.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.K.c(4, true, false);
        kh.e eVar2 = this.K;
        dh.d c10 = eVar2.n.c(eVar2, null, false);
        c10.n(eVar2.r);
        c10.p(AndroidUtilities.dp(22.0f));
        c10.o(AndroidUtilities.dp(6.0f));
        eVar2.s = c10;
        this.b0.addView(this.K, w7.x5.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.J = textView;
        final int i15 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bb
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
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(ubVar, ubVar.y0, ubVar.A0, ubVar.s.megagroup);
                            h0Var.S(ubVar.x0);
                            h0Var.g0 = new ya(ubVar);
                            ubVar.showDialog(h0Var);
                            break;
                        }
                        break;
                    case 1:
                        ub ubVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.s.megagroup) {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        ubVar2.showDialog(b2Var);
                        break;
                    default:
                        ub ubVar3 = this.b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.R.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.e5.p(ubVar3.getParentActivity(), new va(ubVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        this.J.setTextSize(1, 15.0f);
        this.J.setTypeface(AndroidUtilities.bold());
        this.J.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ae, false));
        this.J.setText(LocaleController.getString(R.string.SETTINGS));
        this.J.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.K.getContainer().addView(this.J, w7.x5.e(-2, -2, 17));
        this.K.f.add(this.J);
        this.K.d(false);
        final int i16 = 1;
        this.K.b[4] = new View.OnClickListener(this) { // from class: org.telegram.ui.bb
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
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(ubVar, ubVar.y0, ubVar.A0, ubVar.s.megagroup);
                            h0Var.S(ubVar.x0);
                            h0Var.g0 = new ya(ubVar);
                            ubVar.showDialog(h0Var);
                            break;
                        }
                        break;
                    case 1:
                        ub ubVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.s.megagroup) {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        ubVar2.showDialog(b2Var);
                        break;
                    default:
                        ub ubVar3 = this.b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.R.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.e5.p(ubVar3.getParentActivity(), new va(ubVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.e0.setVisibility(4);
        this.e0.setFocusable(true);
        this.e0.setFocusableInTouchMode(true);
        this.e0.setClickable(true);
        this.e0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.b0.addView(this.e0, w7.x5.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f0.setImageResource(R.drawable.msg_calendar);
        this.f0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xe, false), PorterDuff.Mode.MULTIPLY));
        this.e0.addView(this.f0, w7.x5.e(48, 48, 53));
        final int i17 = 2;
        this.f0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bb
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
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(ubVar, ubVar.y0, ubVar.A0, ubVar.s.megagroup);
                            h0Var.S(ubVar.x0);
                            h0Var.g0 = new ya(ubVar);
                            ubVar.showDialog(h0Var);
                            break;
                        }
                        break;
                    case 1:
                        ub ubVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.s.megagroup) {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        ubVar2.showDialog(b2Var);
                        break;
                    default:
                        ub ubVar3 = this.b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.R.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.e5.p(ubVar3.getParentActivity(), new va(ubVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.g0 = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ye, false));
        this.g0.setTextSize(15);
        this.g0.setTypeface(AndroidUtilities.bold());
        this.e0.addView(this.g0, w7.x5.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.I.D(true);
        if (this.v0 && this.r0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.w, true, 0.3f, true);
            this.E.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.w, false, 0.3f, true);
            this.E.setEmptyView(this.L);
        }
        jb jbVar5 = this.E;
        jbVar5.Y1 = true;
        jbVar5.Z1 = 1;
        UndoView undoView = new UndoView(context);
        this.F = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.b0.addView(this.F, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        jb jbVar = this.E;
        if (jbVar == null) {
            return;
        }
        int childCount = jbVar.getChildCount();
        int measuredHeight = this.E.getMeasuredHeight();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z11 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.E.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.b0.getBackgroundTranslationY();
                int backgroundSizeY = this.b0.getBackgroundSizeY();
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
                t1Var.b4(i13, measuredHeight2 - i13, (this.b0.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.E.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.b0.getBackgroundTranslationY(), this.b0.getMeasuredWidth(), this.b0.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject = t1Var.getMessageObject();
                if (this.h0 != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = t1Var.getPhotoImage();
                    this.h0.setTranslationX(photoImage.getImageX());
                    this.h0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.h0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                w0Var.W((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.b0.getBackgroundTranslationY(), this.b0.getBackgroundSizeY());
                if (w0Var.J()) {
                    w0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.E.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.t1) || (childAt instanceof org.telegram.ui.Cells.w0)) {
                        view = childAt;
                    }
                    i10 = bottom;
                    view3 = childAt;
                }
                kb kbVar = this.G0;
                if ((kbVar == null || (!kbVar.a0(childAt) && !this.G0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.w0) && ((org.telegram.ui.Cells.w0) childAt).getMessageObject().isDateObject) {
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
        j0 j0Var = this.h0;
        if (j0Var != null) {
            if (z11) {
                MediaController.getInstance().setCurrentVideoVisible(true);
            } else {
                j0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.Z) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            }
        }
        if (view != null) {
            this.Q.T((view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject() : ((org.telegram.ui.Cells.w0) view).getMessageObject()).messageOwner.date, false, true);
        }
        this.T = false;
        if (!(view3 instanceof org.telegram.ui.Cells.t1) && !(view3 instanceof org.telegram.ui.Cells.w0)) {
            z10 = true;
        }
        this.U = z10;
        if (view2 == null) {
            T0(true);
            this.Q.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.E.getPaddingTop() || this.U) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            T0(true ^ this.U);
        } else {
            if (view2.getAlpha() != 0.0f) {
                view2.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = this.V;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V = null;
            }
            if (this.Q.getTag() == null) {
                this.Q.setTag(1);
            }
            if (this.Q.getAlpha() != 1.0f) {
                this.Q.setAlpha(1.0f);
            }
            this.T = true;
        }
        int bottom2 = view2.getBottom() - this.E.getPaddingTop();
        if (bottom2 <= this.Q.getMeasuredHeight() || bottom2 >= this.Q.getMeasuredHeight() * 2) {
            this.Q.setTranslationY(0.0f);
        } else {
            this.Q.setTranslationY(((-r1.getMeasuredHeight()) * 2) + bottom2);
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
            jb jbVar = this.E;
            if (jbVar != null) {
                jbVar.e1();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagePlayingDidStart) {
            if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                jb jbVar2 = this.E;
                if (jbVar2 != null) {
                    int childCount = jbVar2.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.E.getChildAt(i12);
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
                this.b0.V(org.telegram.ui.ActionBar.j6.r0());
                this.x.invalidate();
                bi.c4 c4Var = this.P;
                if (c4Var != null) {
                    c4Var.invalidate();
                }
                this.E.e1();
                return;
            }
            Integer num = (Integer) objArr[0];
            jb jbVar3 = this.E;
            if (jbVar3 != null) {
                int childCount2 = jbVar3.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.E.getChildAt(i13);
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
            MediaController.getInstance().setTextureView(Q0(true), this.i0, this.h0, true);
            int childCount3 = this.E.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount3) {
                    z10 = false;
                    break;
                }
                View childAt3 = this.E.getChildAt(i14);
                if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt3;
                    MessageObject messageObject4 = t1Var4.getMessageObject();
                    if (this.h0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                        ImageReceiver photoImage = t1Var4.getPhotoImage();
                        this.h0.setTranslationX(photoImage.getImageX());
                        this.h0.setTranslationY(photoImage.getImageY() + t1Var4.getTop() + this.fragmentView.getPaddingTop());
                        this.fragmentView.invalidate();
                        this.h0.invalidate();
                        z10 = true;
                        break;
                    }
                }
                i14++;
            }
            if (this.h0 != null) {
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (z10) {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                } else {
                    this.h0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject2 != null && playingMessageObject2.isRoundVideo() && (this.Z || PipRoundVideoView.F != null)) {
                        MediaController.getInstance().setCurrentVideoVisible(false);
                    }
                }
            }
        }
        jb jbVar4 = this.E;
        if (jbVar4 != null) {
            int childCount4 = jbVar4.getChildCount();
            for (int i15 = 0; i15 < childCount4; i15++) {
                View childAt4 = this.E.getChildAt(i15);
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e1() {
        jb jbVar = this.E;
        if (jbVar == null) {
            return;
        }
        int childCount = jbVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.E.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.s()) {
                        t1Var.setDrawSelectionBackground(false);
                        t1Var.J3(false, true);
                        t1Var.L3(false, false, true);
                    }
                    t1Var.setHighlighted(this.K0 != Integer.MAX_VALUE && messageObject.getRealId() == this.K0);
                    if (this.K0 != Integer.MAX_VALUE) {
                        xa xaVar = this.M0;
                        if (xaVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(xaVar);
                        }
                        xa xaVar2 = new xa(this, 0);
                        this.M0 = xaVar2;
                        AndroidUtilities.runOnUIThread(xaVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.z0)) {
                        t1Var.S3(null);
                    } else {
                        t1Var.S3(this.z0);
                    }
                    t1Var.setSpoilersSuppressed(this.E.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                w0Var.setMessageObject(w0Var.getMessageObject());
                w0Var.setSpoilersSuppressed(this.E.getScrollState() != 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32768, null, null, null, null, i10));
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.j6.c2, org.telegram.ui.ActionBar.j6.d2}, org.telegram.ui.ActionBar.j6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.i8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.j8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.k8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.l8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.m8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.n8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.o8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m3, org.telegram.ui.ActionBar.j6.q3}, null, org.telegram.ui.ActionBar.j6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.n3, org.telegram.ui.ActionBar.j6.r3}, null, org.telegram.ui.ActionBar.j6.dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.j6.m3.k();
        int i13 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.j6.o3.k();
        int i14 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.p3, org.telegram.ui.ActionBar.j6.t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.s2;
        int i15 = org.telegram.ui.ActionBar.j6.ic;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, new Class[]{org.telegram.ui.Cells.w0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 2, new Class[]{org.telegram.ui.Cells.w0.class}, org.telegram.ui.ActionBar.j6.s2, null, null, org.telegram.ui.ActionBar.j6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.w4, org.telegram.ui.ActionBar.j6.q4, org.telegram.ui.ActionBar.j6.x4, org.telegram.ui.ActionBar.j6.v4, org.telegram.ui.ActionBar.j6.u4, org.telegram.ui.ActionBar.j6.C4}, null, org.telegram.ui.ActionBar.j6.kc));
        int i16 = org.telegram.ui.ActionBar.j6.lc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.j6.mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.hc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O3, org.telegram.ui.ActionBar.j6.S3, org.telegram.ui.ActionBar.j6.W3}, null, org.telegram.ui.ActionBar.j6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P3, org.telegram.ui.ActionBar.j6.T3, org.telegram.ui.ActionBar.j6.X3}, null, org.telegram.ui.ActionBar.j6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.M3, org.telegram.ui.ActionBar.j6.Q3, org.telegram.ui.ActionBar.j6.U3}, null, org.telegram.ui.ActionBar.j6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.N3, org.telegram.ui.ActionBar.j6.R3, org.telegram.ui.ActionBar.j6.V3}, null, org.telegram.ui.ActionBar.j6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.a4, org.telegram.ui.ActionBar.j6.b4, org.telegram.ui.ActionBar.j6.Z3}, null, org.telegram.ui.ActionBar.j6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.e4}, null, org.telegram.ui.ActionBar.j6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f4}, null, org.telegram.ui.ActionBar.j6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.c4}, null, org.telegram.ui.ActionBar.j6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.d4}, null, org.telegram.ui.ActionBar.j6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.g4}, null, org.telegram.ui.ActionBar.j6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.j6.i4};
        int i17 = org.telegram.ui.ActionBar.j6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.j6.h4, org.telegram.ui.ActionBar.j6.B4, org.telegram.ui.ActionBar.j6.D4};
        int i18 = org.telegram.ui.ActionBar.j6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.J4, null, org.telegram.ui.ActionBar.j6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.H4, null, org.telegram.ui.ActionBar.j6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O4}, null, org.telegram.ui.ActionBar.j6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P4}, null, org.telegram.ui.ActionBar.j6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Q4}, null, org.telegram.ui.ActionBar.j6.qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.b2, null, null, org.telegram.ui.ActionBar.j6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.j4}, null, org.telegram.ui.ActionBar.j6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.J2, null, null, org.telegram.ui.ActionBar.j6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.K2, null, null, org.telegram.ui.ActionBar.j6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.T1, null, null, org.telegram.ui.ActionBar.j6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.Q2, null, null, org.telegram.ui.ActionBar.j6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Rc));
        int i19 = org.telegram.ui.ActionBar.j6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.ab;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.pd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.tb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ub));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.td));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.vb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ud));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.wb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.yb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.xd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.zb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.xb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.yd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.zd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ie));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.je));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.j6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.j6.re));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.j6.se));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.j6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.j6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.j6.qe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.j6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.j6.De));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, TLObject.FLAG_29, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, TLObject.FLAG_29, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i21 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.F;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ra(this, 0)), this.classGuid);
        setBulletinDelegate(new di.c9(6));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        this.B0.unlock();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        rb rbVar = this.b0;
        if (rbVar != null) {
            org.telegram.ui.Components.l81 l81Var = rbVar.v;
            if (l81Var != null) {
                l81Var.c(false);
            }
            rbVar.F = true;
        }
        UndoView undoView = this.F;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.m0 = true;
        this.n0 = true;
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
        if (mVar == null || !mVar.a) {
            return;
        }
        com.google.firebase.messaging.m k10 = com.google.firebase.messaging.m.k();
        if (k10.a) {
            s4 s4Var = (s4) k10.d;
            int i10 = c5.F;
            s4Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.j0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        rb rbVar = this.b0;
        if (rbVar != null) {
            org.telegram.ui.Components.l81 l81Var = rbVar.v;
            if (l81Var != null) {
                l81Var.c(true);
            }
            rbVar.F = false;
        }
        this.m0 = false;
        O0(false);
        if (this.n0) {
            this.n0 = false;
            qb qbVar = this.I;
            if (qbVar != null) {
                qbVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.B0.unlock();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.B0.lock();
        }
    }
}
