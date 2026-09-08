package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class x10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public static final SpannableStringBuilder[] s0 = new SpannableStringBuilder[3];
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.n2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final p10 S;
    public final q10 T;
    public final v10 U;
    public final s10 V;
    public final u10 W;
    public final le.b a;
    public final s10 a0;
    public final bi.o0 b;
    public final s10 b0;
    public final org.telegram.ui.Components.xw0 c;
    public final ArrayList c0;
    public org.telegram.ui.Components.kl0 d;
    public final ArrayList d0;
    public h10 e;
    public boolean e0;
    public final ArrayList f;
    public final w5 f0;
    public final k10 g0;
    public final SparseArray h;
    public o10 h0;
    public org.telegram.ui.Components.un0 i0;
    public final s4.c0 j0;
    public final l10 k0;
    public final AnimationNotificationsLocker l0;
    public final bi.a4 m0;
    public final ArrayList n;
    public final g10 n0;
    public w10 o0;
    public boolean p0;
    public int q0;
    public final HashMap r;
    public boolean r0;
    public int s;
    public int v;
    public String w;
    public String x;
    public hg.q0 y;

    public x10(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getParentActivity());
        this.a = new le.b(0, this, org.telegram.ui.Components.pr.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 3;
        this.S = new p10(0, 0L);
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.f0 = new w5(this, 4);
        this.g0 = new k10(this);
        this.l0 = new AnimationNotificationsLocker();
        this.n0 = new g10(this, 0);
        this.L = n2Var;
        Activity parentActivity = n2Var.getParentActivity();
        this.K = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        bi.o0 o0Var = new bi.o0(this, parentActivity, 28);
        this.b = o0Var;
        o0Var.setOnItemClickListener(new i(this, 11));
        o0Var.setOnItemLongClickListener(new g(this, 16));
        s4.c0 c0Var = new s4.c0();
        this.j0 = c0Var;
        o0Var.setLayoutManager(c0Var);
        l10 l10Var = new l10(this, parentActivity, 0);
        this.k0 = l10Var;
        addView(l10Var);
        addView(o0Var);
        o0Var.setSectionsType(2);
        o0Var.setSkipDrawSection(true);
        o0Var.setOnScrollListener(new m10(this));
        bi.a4 a4Var = new bi.a4(parentActivity);
        this.m0 = a4Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) a4Var.d, formatDateChat)) {
            a4Var.d = formatDateChat;
            ((org.telegram.ui.Components.p6) a4Var.b).q(formatDateChat, true, true);
        }
        addView(a4Var, w7.x5.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new q10(this);
        this.U = new v10(this, getContext());
        this.V = new s10(this, getContext(), 1);
        this.W = new u10(this, getContext());
        this.a0 = new s10(this, getContext(), 4);
        this.b0 = new s10(this, getContext(), 2);
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(parentActivity, l10Var, 1, null);
        this.c = xw0Var;
        addView(xw0Var);
        o0Var.setEmptyView(xw0Var);
        xw0Var.setVisibility(8);
        b();
    }

    public static void a(x10 x10Var, MessageObject messageObject, View view, int i10) {
        if (!x10Var.o0.g()) {
            x10Var.o0.a();
        }
        if (x10Var.o0.g()) {
            x10Var.o0.d(messageObject, view, i10);
        }
    }

    public static CharSequence c(MessageObject messageObject, boolean z10) {
        return d(messageObject, z10, 0, null);
    }

    public static CharSequence d(MessageObject messageObject, boolean z10, int i10, TextPaint textPaint) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.TL_forumTopic findTopic2;
        int i11;
        if (messageObject == null || messageObject.messageOwner == null) {
            return "";
        }
        if (messageObject.isQuickReply()) {
            ig.a2 c10 = ig.b2.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
            return c10 == null ? "" : c10.b;
        }
        if (messageObject.isSponsored()) {
            return messageObject.sponsoredCanReport ? LocaleController.getString(R.string.SponsoredMessageAd) : messageObject.sponsoredRecommended ? LocaleController.getString(R.string.SponsoredMessage2Recommended) : LocaleController.getString(R.string.SponsoredMessage2);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = s0;
        if (spannableStringBuilderArr[i10] == null) {
            spannableStringBuilderArr[i10] = new SpannableStringBuilder(">");
            if (i10 == 0) {
                i11 = R.drawable.attach_arrow_right;
            } else if (i10 == 1) {
                i11 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i10 != 2) {
                    return "";
                }
                i11 = R.drawable.msg_mini_arrow_mediabold;
            }
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(i10 == 0 ? 2 : 1, ApplicationLoader.applicationContext.getDrawable(i11).mutate());
            if (i10 == 1 || i10 == 2) {
                nqVar.setScale(0.85f);
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
            spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message = messageObject.messageOwner;
        CharSequence charSequence = null;
        if (message.saved_peer_id != null) {
            if (messageObject.getSavedDialogId() >= 0) {
                user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.getSavedDialogId()));
                chat = null;
            } else if (messageObject.getSavedDialogId() < 0) {
                chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getSavedDialogId()));
                user = null;
                chat2 = null;
            } else {
                user = null;
                chat = null;
            }
            chat2 = chat;
        } else {
            TLRPC.User user2 = message.from_id.user_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id)) : null;
            chat = messageObject.messageOwner.from_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id)) : null;
            if (chat == null) {
                chat = messageObject.messageOwner.from_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id)) : null;
            }
            chat2 = messageObject.messageOwner.peer_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id)) : null;
            if (chat2 == null) {
                chat2 = messageObject.messageOwner.peer_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id)) : null;
            }
            if (ChatObject.isChannelAndNotMegaGroup(chat2) || z10) {
                user = user2;
            } else {
                user = user2;
                chat2 = null;
            }
        }
        if (user != null && chat2 != null) {
            CharSequence charSequence2 = chat2.title;
            if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                charSequence2 = og.d.j(findTopic2, null, null);
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence2, textPaint == null ? null : textPaint.getFontMetricsInt(), false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(Emoji.replaceEmoji(UserObject.getFirstName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i10]).append((char) 8202).append(replaceEmoji);
            charSequence = spannableStringBuilder2;
        } else if (user != null) {
            charSequence = Emoji.replaceEmoji(UserObject.getUserName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        } else if (chat != null) {
            CharSequence charSequence3 = chat.title;
            if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                charSequence3 = og.d.j(findTopic, null, null);
            }
            charSequence = Emoji.replaceEmoji(charSequence3, textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        }
        return charSequence == null ? "" : charSequence;
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            b();
        }
    }

    public final void b() {
        float f7 = this.a.e;
        bi.a4 a4Var = this.m0;
        a4Var.setTranslationY((1.0f - f7) * (-AndroidUtilities.dp(24.0f)));
        a4Var.setAlpha(f7);
        a4Var.setVisibility(f7 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            bi.o0 o0Var = this.b;
            int childCount = o0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (o0Var.getChildAt(i12) instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) o0Var.getChildAt(i12)).b0(0, true);
                }
                o0Var.getChildAt(i12).invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r6, org.telegram.messenger.UserConfig.selectedAccount) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j3, ArrayList arrayList) {
        org.telegram.ui.Components.kl0 kl0Var;
        int i10;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i11 >= arrayList2.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            long dialogId = messageObject.getDialogId();
            if (dialogId < 0) {
                i10 = (int) (-dialogId);
            }
            i10 = 0;
            if (i10 == j3) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (messageObject.getId() == ((Integer) arrayList.get(i12)).intValue()) {
                        arrayList2.remove(i11);
                        this.h.remove(messageObject.getId());
                        String str = messageObject.monthKey;
                        HashMap hashMap = this.r;
                        ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                        arrayList3.remove(messageObject);
                        if (arrayList3.size() == 0) {
                            this.n.remove(messageObject.monthKey);
                            hashMap.remove(messageObject.monthKey);
                        }
                        i11--;
                        this.O--;
                        z10 = true;
                    }
                }
            }
            i11++;
        }
        if (!z10 || (kl0Var = this.d) == null) {
            return;
        }
        kl0Var.l();
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null) {
            return;
        }
        if (this.o0.g()) {
            this.o0.d(messageObject, view, i11);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.r2) {
            this.o0.c(messageObject);
            return;
        }
        int i12 = this.y.d;
        k10 k10Var = this.g0;
        ArrayList arrayList = this.f;
        String str2 = null;
        org.telegram.ui.ActionBar.n2 n2Var = this.L;
        if (i12 == 0) {
            PhotoViewer.t1().K2(null, n2Var, null);
            PhotoViewer.t1().a2(arrayList, i10, 0L, 0L, 0L, k10Var);
            this.R = PhotoViewer.t1().c;
            return;
        }
        if (i12 == 3 || i12 == 5) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                ((org.telegram.ui.Cells.i7) view).a();
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view instanceof org.telegram.ui.Cells.j7) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                TLRPC.Document document = messageObject.getDocument();
                if (!j7Var.G) {
                    if (j7Var.F) {
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                        j7Var.f(true);
                        return;
                    } else {
                        MessageObject message = j7Var.getMessage();
                        message.putInDownloadsStore = true;
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                        j7Var.f(true);
                        return;
                    }
                }
                if (!messageObject.canPreviewDocument()) {
                    AndroidUtilities.openDocument(messageObject, this.K, n2Var);
                    return;
                }
                PhotoViewer.t1().K2(null, n2Var, null);
                int indexOf = arrayList.indexOf(messageObject);
                if (indexOf >= 0) {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    PhotoViewer.t1().a2(arrayList, indexOf, 0L, 0L, 0L, k10Var);
                    this.R = PhotoViewer.t1().c;
                    return;
                } else {
                    ArrayList l4 = org.telegram.messenger.w1.l(messageObject);
                    PhotoViewer.t1().K2(null, n2Var, null);
                    PhotoViewer.t1().a2(l4, 0, 0L, 0L, 0L, k10Var);
                    this.R = PhotoViewer.t1().c;
                    return;
                }
            }
            return;
        }
        if (i12 == 2) {
            try {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                    str = null;
                } else {
                    if (webPage.cached_page != null) {
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                            n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str3 = webPage.embed_url;
                    if (str3 != null && str3.length() != 0) {
                        org.telegram.ui.Components.tu.J(this.L, messageObject, this.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.n7) view).E;
                    if (arrayList2.size() > 0) {
                        str2 = ((CharSequence) arrayList2.get(0)).toString();
                    }
                    str = str2;
                }
                if (str != null) {
                    g(str);
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.e5.q0(this.L, str, true, true);
        } else {
            of.f.s(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        e eVar = new e(this, 14);
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        bi.o0 o0Var = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i12 = org.telegram.ui.ActionBar.j6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 2048, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.g3, null, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.w0, null, null, org.telegram.ui.ActionBar.j6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.y0, null, null, org.telegram.ui.ActionBar.j6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.L0, null, null, org.telegram.ui.ActionBar.j6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.a1}, null, org.telegram.ui.ActionBar.j6.a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.j6.g1, org.telegram.ui.ActionBar.j6.h1};
        int i15 = org.telegram.ui.ActionBar.j6.j9;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.j1, org.telegram.ui.ActionBar.j6.k1, org.telegram.ui.ActionBar.j6.Z0}, null, org.telegram.ui.ActionBar.j6.b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.F0[1], null, null, org.telegram.ui.ActionBar.j6.i9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.F0[0], null, null, org.telegram.ui.ActionBar.j6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.G0, null, null, org.telegram.ui.ActionBar.j6.m9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.j6.H0, null, -1, null, org.telegram.ui.ActionBar.j6.p9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.I0, null, null, org.telegram.ui.ActionBar.j6.q9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.v0, null, null, org.telegram.ui.ActionBar.j6.s9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.u0, null, null, org.telegram.ui.ActionBar.j6.t9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.T0}, null, org.telegram.ui.ActionBar.j6.u9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.V0, org.telegram.ui.ActionBar.j6.W0}, null, org.telegram.ui.ActionBar.j6.v9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.X0}, null, org.telegram.ui.ActionBar.j6.w9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.x0, null, null, org.telegram.ui.ActionBar.j6.x9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Y0}, null, org.telegram.ui.ActionBar.j6.y9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i1}, null, org.telegram.ui.ActionBar.j6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f1}, null, org.telegram.ui.ActionBar.j6.z9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.c1}, null, org.telegram.ui.ActionBar.j6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m1}, null, org.telegram.ui.ActionBar.j6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.j6.d9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.j6.c9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.j6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        org.telegram.ui.Components.xw0 xw0Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.l6(xw0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(xw0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, org.telegram.ui.h10] */
    public final void h(final long j3, final long j10, final long j11, final long j12, final hg.q0 q0Var, final boolean z10, String str, boolean z11) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j3 + j10 + j11 + j12 + (q0Var == null ? -1 : q0Var.d) + str2 + z10;
        String str4 = this.x;
        boolean z12 = str4 != null && str4.equals(str3);
        boolean z13 = !z12 && z11;
        this.y = q0Var;
        this.E = j3;
        this.F = j10;
        this.H = j11;
        this.G = j12;
        this.I = str2;
        this.J = z10;
        h10 h10Var = this.e;
        if (h10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h10Var);
        }
        w5 w5Var = this.f0;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (z12 && z11) {
            return;
        }
        ArrayList arrayList2 = this.d0;
        final boolean z14 = z12;
        ArrayList arrayList3 = this.c0;
        org.telegram.ui.Components.xw0 xw0Var = this.c;
        ArrayList arrayList4 = this.f;
        if (z13 || (q0Var == null && j10 == 0 && j3 == 0 && j11 == 0 && j12 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.M = true;
            xw0Var.setVisibility(0);
            org.telegram.ui.Components.kl0 kl0Var = this.d;
            if (kl0Var != null) {
                kl0Var.l();
            }
            this.P++;
            bi.o0 o0Var = this.b;
            if (o0Var.getPinnedHeader() != null) {
                arrayList = arrayList4;
                o0Var.getPinnedHeader().setAlpha(0.0f);
            } else {
                arrayList = arrayList4;
            }
            arrayList3.clear();
            arrayList2.clear();
            if (!z13) {
                return;
            }
        } else if (z11 && !arrayList4.isEmpty()) {
            return;
        } else {
            arrayList = arrayList4;
        }
        this.M = true;
        org.telegram.ui.Components.kl0 kl0Var2 = this.d;
        if (kl0Var2 != null) {
            kl0Var2.l();
        }
        if (!z14) {
            w5Var.run();
            xw0Var.e(true, !z11);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            o10 o10Var = this.h0;
            if (o10Var != null) {
                ((xv) o10Var).i(false, null, null, false);
            }
        }
        final int i10 = this.P + 1;
        this.P = i10;
        final int i11 = UserConfig.selectedAccount;
        ?? r02 = new Runnable() { // from class: org.telegram.ui.h10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v11 */
            /* JADX WARN: Type inference failed for: r10v3, types: [int] */
            /* JADX WARN: Type inference failed for: r10v5 */
            /* JADX WARN: Type inference failed for: r3v13, types: [org.telegram.tgnet.TLRPC$TL_messages_search] */
            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                long j13;
                long j14;
                int i13;
                ?? r10;
                int i14;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final x10 x10Var = x10.this;
                ArrayList arrayList5 = x10Var.f;
                final long j15 = j3;
                long j16 = j10;
                final String str5 = str2;
                final hg.q0 q0Var2 = q0Var;
                int i15 = i11;
                long j17 = j11;
                long j18 = j12;
                final boolean z15 = z14;
                ArrayList<Object> arrayList6 = null;
                if (j15 == 0 || j16 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str5);
                    boolean z16 = z10;
                    if (isEmpty) {
                        i12 = i15;
                        j13 = j18;
                        j14 = j17;
                        i13 = 20;
                        r10 = z16;
                    } else {
                        j13 = j18;
                        ArrayList<Object> arrayList7 = new ArrayList<>();
                        ArrayList<CharSequence> arrayList8 = new ArrayList<>();
                        ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                        j14 = j17;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        i12 = i15;
                        i13 = 20;
                        messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z16 ? 1 : 0);
                        r10 = z16 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i13;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = q0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : q0Var2.e;
                    tL_messages_searchGlobal2.community = MessagesController.getInstance(i12).getInputChannel(j16);
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                    }
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j13 / 1000);
                    }
                    if (z15 && str5.equals(x10Var.w) && !arrayList5.isEmpty()) {
                        i14 = 1;
                        MessageObject messageObject = (MessageObject) i2.g.h(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = x10Var.v;
                        tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    } else {
                        i14 = 1;
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal2.flags |= i14;
                    tL_messages_searchGlobal2.folder_id = r10;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                } else {
                    ?? tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = q0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : q0Var2.e;
                    tL_messages_search.peer = AccountInstance.getInstance(i15).getMessagesController().getInputPeer(j15);
                    if (j17 > 0) {
                        tL_messages_search.min_date = (int) (j17 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_search.max_date = (int) (j18 / 1000);
                    }
                    if (z15 && str5.equals(x10Var.w) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) i2.g.h(1, arrayList5)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    i12 = i15;
                    j14 = j17;
                }
                x10Var.w = str5;
                x10Var.x = str3;
                final ArrayList arrayList10 = new ArrayList();
                hg.s0.x1(x10Var.w, arrayList10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                final int i16 = i10;
                final ArrayList<Object> arrayList11 = arrayList6;
                final int i17 = i12;
                final long j19 = j14;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() { // from class: org.telegram.ui.i10
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList12 = new ArrayList();
                        final int i18 = i17;
                        final String str6 = str5;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                MessageObject messageObject2 = new MessageObject(i18, messages_messages.messages.get(i19), false, true);
                                messageObject2.setQuery(str6);
                                arrayList12.add(messageObject2);
                            }
                        }
                        final x10 x10Var2 = x10.this;
                        final int i20 = i16;
                        final boolean z17 = z15;
                        final hg.q0 q0Var3 = q0Var2;
                        final long j20 = j15;
                        final long j21 = j19;
                        final ArrayList arrayList13 = arrayList11;
                        final ArrayList arrayList14 = arrayList10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.j10
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                int i21;
                                boolean z18;
                                o10 o10Var2;
                                ArrayList arrayList15;
                                int i22;
                                ArrayList arrayList16;
                                SparseArray sparseArray;
                                char c10;
                                char c11;
                                x10 x10Var3 = x10.this;
                                q10 q10Var = x10Var3.T;
                                v10 v10Var = x10Var3.U;
                                ArrayList arrayList17 = x10Var3.n;
                                SparseArray sparseArray2 = x10Var3.h;
                                ArrayList arrayList18 = x10Var3.d0;
                                HashMap hashMap = x10Var3.r;
                                ArrayList arrayList19 = x10Var3.f;
                                ArrayList arrayList20 = x10Var3.c0;
                                bi.o0 o0Var2 = x10Var3.b;
                                org.telegram.ui.Components.xw0 xw0Var2 = x10Var3.c;
                                if (i20 != x10Var3.P) {
                                    return;
                                }
                                x10Var3.M = false;
                                if (tL_error != null) {
                                    wh.p pVar = xw0Var2.d;
                                    org.telegram.ui.Components.d90 d90Var = xw0Var2.e;
                                    pVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                    d90Var.setVisibility(0);
                                    d90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    xw0Var2.e(false, true);
                                    return;
                                }
                                xw0Var2.e(false, true);
                                wh.p pVar2 = xw0Var2.d;
                                org.telegram.ui.Components.d90 d90Var2 = xw0Var2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                x10Var3.v = messages_messages2.next_rate;
                                int i23 = i18;
                                MessagesStorage.getInstance(i23).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                                MessagesController.getInstance(i23).putUsers(messages_messages2.users, false);
                                MessagesController.getInstance(i23).putChats(messages_messages2.chats, false);
                                boolean z19 = z17;
                                if (!z19) {
                                    arrayList19.clear();
                                    sparseArray2.clear();
                                    arrayList17.clear();
                                    hashMap.clear();
                                }
                                x10Var3.O = messages_messages2.count;
                                String str7 = str6;
                                x10Var3.Q = str7;
                                ArrayList arrayList21 = arrayList12;
                                int size2 = arrayList21.size();
                                int i24 = 0;
                                while (i24 < size2) {
                                    boolean z20 = z19;
                                    MessageObject messageObject3 = (MessageObject) arrayList21.get(i24);
                                    ArrayList arrayList22 = arrayList21;
                                    ArrayList arrayList23 = (ArrayList) hashMap.get(messageObject3.monthKey);
                                    if (arrayList23 == null) {
                                        arrayList23 = new ArrayList();
                                        i22 = i24;
                                        hashMap.put(messageObject3.monthKey, arrayList23);
                                        arrayList17.add(messageObject3.monthKey);
                                    } else {
                                        i22 = i24;
                                    }
                                    arrayList23.add(messageObject3);
                                    arrayList19.add(messageObject3);
                                    sparseArray2.put(messageObject3.getId(), messageObject3);
                                    if (PhotoViewer.t1().Q1()) {
                                        PhotoViewer t12 = PhotoViewer.t1();
                                        int i25 = x10Var3.R;
                                        arrayList16 = arrayList17;
                                        SparseArray[] sparseArrayArr = t12.Z6;
                                        ArrayList arrayList24 = t12.Y6;
                                        sparseArray = sparseArray2;
                                        if (i25 == t12.c) {
                                            if (sparseArrayArr[0].indexOfKey(messageObject3.getId()) < 0) {
                                                if (t12.Q5) {
                                                    arrayList24.add(messageObject3);
                                                    c11 = 0;
                                                } else {
                                                    c11 = 0;
                                                    arrayList24.add(0, messageObject3);
                                                }
                                                c10 = 0;
                                                sparseArrayArr[c11].put(messageObject3.getId(), messageObject3);
                                            } else {
                                                c10 = 0;
                                            }
                                            t12.P5[c10] = arrayList24.size() == t12.J5;
                                            t12.D2();
                                        }
                                    } else {
                                        arrayList16 = arrayList17;
                                        sparseArray = sparseArray2;
                                    }
                                    i24 = i22 + 1;
                                    arrayList21 = arrayList22;
                                    z19 = z20;
                                    arrayList17 = arrayList16;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z21 = z19;
                                if (arrayList19.size() > x10Var3.O) {
                                    x10Var3.O = arrayList19.size();
                                }
                                x10Var3.N = arrayList19.size() >= x10Var3.O;
                                boolean isEmpty2 = arrayList19.isEmpty();
                                hg.q0 q0Var4 = q0Var3;
                                if (isEmpty2) {
                                    if (q0Var4 == null) {
                                        pVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        d90Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(x10Var3.Q) && j20 == 0 && j21 == 0) {
                                        pVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                        int i26 = q0Var4.d;
                                        String string = i26 == 1 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles) : i26 == 0 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMedia) : i26 == 2 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleLinks) : i26 == 3 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMusic) : LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleVoice);
                                        d90Var2.setVisibility(0);
                                        d90Var2.setText(string);
                                    } else {
                                        pVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        d90Var2.setVisibility(0);
                                        d90Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    }
                                }
                                if (q0Var4 != null) {
                                    int i27 = q0Var4.d;
                                    if (i27 != 0) {
                                        if (i27 == 1) {
                                            x10Var3.d = x10Var3.V;
                                        } else if (i27 == 2) {
                                            x10Var3.d = x10Var3.W;
                                        } else if (i27 == 3) {
                                            x10Var3.d = x10Var3.a0;
                                        } else if (i27 == 5) {
                                            x10Var3.d = x10Var3.b0;
                                        }
                                    } else if (TextUtils.isEmpty(x10Var3.Q)) {
                                        x10Var3.d = v10Var;
                                    } else {
                                        x10Var3.d = q10Var;
                                    }
                                } else {
                                    x10Var3.d = q10Var;
                                }
                                s4.h0 adapter = o0Var2.getAdapter();
                                org.telegram.ui.Components.kl0 kl0Var3 = x10Var3.d;
                                if (adapter != kl0Var3) {
                                    o0Var2.setAdapter(kl0Var3);
                                }
                                if (z21) {
                                    i21 = 0;
                                } else {
                                    arrayList20.clear();
                                    ArrayList arrayList25 = arrayList13;
                                    ArrayList arrayList26 = arrayList20;
                                    if (arrayList25 != null) {
                                        arrayList26.addAll(arrayList25);
                                    }
                                    if (str7.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str7) || "saved messages".startsWith(str7))) {
                                        int i28 = 0;
                                        while (i28 < arrayList26.size()) {
                                            if (arrayList26.get(i28) instanceof TLRPC.User) {
                                                arrayList15 = arrayList26;
                                                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == ((TLRPC.User) arrayList26.get(i28)).id) {
                                                    arrayList26 = arrayList15;
                                                }
                                            } else {
                                                arrayList15 = arrayList26;
                                            }
                                            i28++;
                                            arrayList26 = arrayList15;
                                        }
                                        z18 = 0;
                                        arrayList26.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                        arrayList18.clear();
                                        arrayList18.addAll(arrayList14);
                                        x10Var3.e0 = z18;
                                        if (str7.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str7) || "archive".startsWith(str7))) {
                                            x10Var3.e0 = true;
                                        }
                                        o10Var2 = x10Var3.h0;
                                        i21 = z18;
                                        if (o10Var2 != null) {
                                            ((xv) o10Var2).i(TextUtils.isEmpty(x10Var3.Q), arrayList26, arrayList18, x10Var3.e0);
                                            i21 = z18;
                                        }
                                    }
                                    z18 = 0;
                                    arrayList18.clear();
                                    arrayList18.addAll(arrayList14);
                                    x10Var3.e0 = z18;
                                    if (str7.length() >= 3) {
                                        x10Var3.e0 = true;
                                    }
                                    o10Var2 = x10Var3.h0;
                                    i21 = z18;
                                    if (o10Var2 != null) {
                                    }
                                }
                                View view = null;
                                int i29 = -1;
                                for (int i30 = i21; i30 < size2; i30++) {
                                    View childAt = o0Var2.getChildAt(i30);
                                    if (childAt instanceof org.telegram.ui.Components.t00) {
                                        i29 = RecyclerView.R(childAt);
                                        view = childAt;
                                    }
                                }
                                if (view != null) {
                                    o0Var2.removeView(view);
                                }
                                if ((x10Var3.k0.getVisibility() == 0 && o0Var2.getChildCount() == 0) || (o0Var2.getAdapter() != v10Var && view != null)) {
                                    x10Var3.getViewTreeObserver().addOnPreDrawListener(new cr(x10Var3, (org.telegram.ui.Components.t00) view, i29, 3));
                                }
                                x10Var3.d.l();
                            }
                        });
                    }
                });
            }
        };
        this.e = r02;
        AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 0L);
        l10 l10Var = this.k0;
        if (q0Var == null) {
            l10Var.setViewType(1);
            return;
        }
        int i12 = q0Var.d;
        if (i12 == 0) {
            if (TextUtils.isEmpty(this.I)) {
                l10Var.setViewType(2);
                return;
            } else {
                l10Var.setViewType(1);
                return;
            }
        }
        if (i12 == 1) {
            l10Var.setViewType(3);
            return;
        }
        if (i12 == 3 || i12 == 5) {
            l10Var.setViewType(4);
        } else if (i12 == 2) {
            l10Var.setViewType(5);
        }
    }

    public final void i(o10 o10Var, boolean z10) {
        this.h0 = o10Var;
        if (!z10 || o10Var == null) {
            return;
        }
        ArrayList arrayList = this.c0;
        if (arrayList.isEmpty()) {
            return;
        }
        ((xv) o10Var).i(false, arrayList, this.d0, this.e0);
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.r0 = z10;
        setPadding(0, i10, 0, i11);
        bi.o0 o0Var = this.b;
        if (z10) {
            o0Var.n1(0, i10, 0, i11);
        } else {
            o0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.r0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.q0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.q0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.kl0 kl0Var;
        int i12 = this.s;
        if (AndroidUtilities.isTablet()) {
            this.s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.s = 6;
        } else {
            this.s = 3;
        }
        if (i12 != this.s && (kl0Var = this.d) == this.U) {
            this.r0 = true;
            kl0Var.l();
            this.r0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        eh.e eVar = new eh.e(null);
        eVar.e = new di.w9(6);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(0, 0);
        eVar.f = 1.0f;
        eVar.h = 1.0f;
        bi.a4 a4Var = this.m0;
        dh.d c10 = bVar.c(a4Var, eVar, false);
        a4Var.c = c10;
        c10.p(AndroidUtilities.dp(11.5f));
        ((dh.d) a4Var.c).o(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.un0 un0Var) {
        this.i0 = un0Var;
    }

    public void setUiCallback(w10 w10Var) {
        this.o0 = w10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.p0 = z10;
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
