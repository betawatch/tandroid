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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public static final SpannableStringBuilder[] p0 = new SpannableStringBuilder[3];
    public long B;
    public long C;
    public long D;
    public long E;
    public String F;
    public boolean G;
    public final Activity H;
    public final org.telegram.ui.ActionBar.p2 I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public String N;
    public int O;
    public final l10 P;
    public final m10 Q;
    public final r10 R;
    public final o10 S;
    public final q10 T;
    public final o10 U;
    public final o10 V;
    public final ArrayList W;
    public final xd.a a;
    public final ArrayList a0;
    public final mh.d1 b;
    public boolean b0;
    public final org.telegram.ui.Components.zw0 c;
    public final z5 c0;
    public org.telegram.ui.Components.rl0 d;
    public final g10 d0;
    public d10 e;
    public k10 e0;
    public final ArrayList f;
    public org.telegram.ui.Components.zn0 f0;
    public final f2.j0 g0;
    public final SparseArray h;
    public final h10 h0;
    public final AnimationNotificationsLocker i0;
    public final oh.b3 j0;
    public final c10 k0;
    public s10 l0;
    public boolean m0;
    public final ArrayList n;
    public int n0;
    public boolean o0;
    public final HashMap r;
    public int s;
    public int v;
    public String w;
    public String x;
    public uf.e0 y;

    public t10(org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getParentActivity());
        this.a = new xd.a(0, this, org.telegram.ui.Components.pr.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 3;
        this.P = new l10(0, 0L);
        this.W = new ArrayList();
        this.a0 = new ArrayList();
        this.c0 = new z5(this, 4);
        this.d0 = new g10(this);
        this.i0 = new AnimationNotificationsLocker();
        this.k0 = new c10(this, 0);
        this.I = p2Var;
        Activity parentActivity = p2Var.getParentActivity();
        this.H = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        mh.d1 d1Var = new mh.d1(this, parentActivity, 26);
        this.b = d1Var;
        d1Var.setOnItemClickListener(new j(this, 11));
        d1Var.setOnItemLongClickListener(new h(this, 16));
        f2.j0 j0Var = new f2.j0();
        this.g0 = j0Var;
        d1Var.setLayoutManager(j0Var);
        h10 h10Var = new h10(this, parentActivity, 0);
        this.h0 = h10Var;
        addView(h10Var);
        addView(d1Var);
        d1Var.setSectionsType(2);
        d1Var.setSkipDrawSection(true);
        d1Var.setOnScrollListener(new i10(this));
        oh.b3 b3Var = new oh.b3(parentActivity);
        this.j0 = b3Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) b3Var.d, formatDateChat)) {
            b3Var.d = formatDateChat;
            ((org.telegram.ui.Components.j6) b3Var.b).q(formatDateChat, true, true);
        }
        addView(b3Var, k7.c6.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.Q = new m10(this);
        this.R = new r10(this, getContext());
        this.S = new o10(this, getContext(), 1);
        this.T = new q10(this, getContext());
        this.U = new o10(this, getContext(), 4);
        this.V = new o10(this, getContext(), 2);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(parentActivity, h10Var, 1, null);
        this.c = zw0Var;
        addView(zw0Var);
        d1Var.setEmptyView(zw0Var);
        zw0Var.setVisibility(8);
        b();
    }

    public static void a(t10 t10Var, MessageObject messageObject, View view, int i10) {
        if (!t10Var.l0.f()) {
            t10Var.l0.a();
        }
        if (t10Var.l0.f()) {
            t10Var.l0.d(messageObject, view, i10);
        }
    }

    public static CharSequence c(MessageObject messageObject, boolean z4) {
        return d(messageObject, z4, 0, null);
    }

    public static CharSequence d(MessageObject messageObject, boolean z4, int i10, TextPaint textPaint) {
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
            vf.o1 c3 = vf.p1.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
            return c3 == null ? "" : c3.b;
        }
        if (messageObject.isSponsored()) {
            return messageObject.sponsoredCanReport ? LocaleController.getString(R.string.SponsoredMessageAd) : messageObject.sponsoredRecommended ? LocaleController.getString(R.string.SponsoredMessage2Recommended) : LocaleController.getString(R.string.SponsoredMessage2);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = p0;
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
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(i10 == 0 ? 2 : 1, ApplicationLoader.applicationContext.getDrawable(i11).mutate());
            if (i10 == 1 || i10 == 2) {
                oqVar.setScale(0.85f);
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
            spannableStringBuilder.setSpan(oqVar, 0, spannableStringBuilder.length(), 0);
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
            if (ChatObject.isChannelAndNotMegaGroup(chat2) || z4) {
                user = user2;
            } else {
                user = user2;
                chat2 = null;
            }
        }
        if (user != null && chat2 != null) {
            CharSequence charSequence2 = chat2.title;
            if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                charSequence2 = bg.e.j(findTopic2, null, null);
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
                charSequence3 = bg.e.j(findTopic, null, null);
            }
            charSequence = Emoji.replaceEmoji(charSequence3, textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        }
        return charSequence == null ? "" : charSequence;
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            b();
        }
    }

    public final void b() {
        float f10 = this.a.e;
        oh.b3 b3Var = this.j0;
        b3Var.setTranslationY((1.0f - f10) * (-AndroidUtilities.dp(24.0f)));
        b3Var.setAlpha(f10);
        b3Var.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            mh.d1 d1Var = this.b;
            int childCount = d1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (d1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) d1Var.getChildAt(i12)).b0(0, true);
                }
                d1Var.getChildAt(i12).invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r6, org.telegram.messenger.UserConfig.selectedAccount) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j10, ArrayList arrayList) {
        org.telegram.ui.Components.rl0 rl0Var;
        int i10;
        int i11 = 0;
        boolean z4 = false;
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
            if (i10 == j10) {
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
                        this.L--;
                        z4 = true;
                    }
                }
            }
            i11++;
        }
        if (!z4 || (rl0Var = this.d) == null) {
            return;
        }
        rl0Var.l();
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null) {
            return;
        }
        if (this.l0.f()) {
            this.l0.d(messageObject, view, i11);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.r2) {
            this.l0.c(messageObject);
            return;
        }
        int i12 = this.y.d;
        g10 g10Var = this.d0;
        ArrayList arrayList = this.f;
        String str2 = null;
        org.telegram.ui.ActionBar.p2 p2Var = this.I;
        if (i12 == 0) {
            PhotoViewer.t1().K2(null, p2Var, null);
            PhotoViewer.t1().a2(arrayList, i10, 0L, 0L, 0L, g10Var);
            this.O = PhotoViewer.t1().c;
            return;
        }
        if (i12 == 3 || i12 == 5) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                ((org.telegram.ui.Cells.h7) view).a();
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                TLRPC.Document document = messageObject.getDocument();
                if (!i7Var.D) {
                    if (i7Var.C) {
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                        i7Var.f(true);
                        return;
                    } else {
                        MessageObject message = i7Var.getMessage();
                        message.putInDownloadsStore = true;
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                        i7Var.f(true);
                        return;
                    }
                }
                if (!messageObject.canPreviewDocument()) {
                    AndroidUtilities.openDocument(messageObject, this.H, p2Var);
                    return;
                }
                PhotoViewer.t1().K2(null, p2Var, null);
                int indexOf = arrayList.indexOf(messageObject);
                if (indexOf >= 0) {
                    PhotoViewer.t1().K2(null, p2Var, null);
                    PhotoViewer.t1().a2(arrayList, indexOf, 0L, 0L, 0L, g10Var);
                    this.O = PhotoViewer.t1().c;
                    return;
                } else {
                    ArrayList m9 = org.telegram.messenger.y3.m(messageObject);
                    PhotoViewer.t1().K2(null, p2Var, null);
                    PhotoViewer.t1().a2(m9, 0, 0L, 0L, 0L, g10Var);
                    this.O = PhotoViewer.t1().c;
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
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                            p2Var.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str3 = webPage.embed_url;
                    if (str3 != null && str3.length() != 0) {
                        org.telegram.ui.Components.ru.I(this.I, messageObject, this.d0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.l7) view).B;
                    if (arrayList2.size() > 0) {
                        str2 = ((CharSequence) arrayList2.get(0)).toString();
                    }
                    str = str2;
                }
                if (str != null) {
                    g(str);
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.z4.q0(this.I, str, true, true);
        } else {
            af.g.s(this.H, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        f fVar = new f(this, 14);
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        mh.d1 d1Var = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        int i12 = org.telegram.ui.ActionBar.k6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.k6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.g3, null, null, org.telegram.ui.ActionBar.k6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, null, null, null, org.telegram.ui.ActionBar.k6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, org.telegram.ui.ActionBar.k6.m0, null, null, org.telegram.ui.ActionBar.k6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 32, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 524304, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, org.telegram.ui.ActionBar.k6.r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.w0, null, null, org.telegram.ui.ActionBar.k6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.y0, null, null, org.telegram.ui.ActionBar.k6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.L0, null, null, org.telegram.ui.ActionBar.k6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.a1}, null, org.telegram.ui.ActionBar.k6.a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.k6.g1, org.telegram.ui.ActionBar.k6.h1};
        int i15 = org.telegram.ui.ActionBar.k6.j9;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.j1, org.telegram.ui.ActionBar.k6.k1, org.telegram.ui.ActionBar.k6.Z0}, null, org.telegram.ui.ActionBar.k6.b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.k6.D0}, null, -1, null, org.telegram.ui.ActionBar.k6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.k6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.k6.E0}, null, -1, null, org.telegram.ui.ActionBar.k6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.F0[1], null, null, org.telegram.ui.ActionBar.k6.i9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.F0[0], null, null, org.telegram.ui.ActionBar.k6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.G0, null, null, org.telegram.ui.ActionBar.k6.m9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.k6.H0, null, -1, null, org.telegram.ui.ActionBar.k6.p9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.I0, null, null, org.telegram.ui.ActionBar.k6.q9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.v0, null, null, org.telegram.ui.ActionBar.k6.s9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.u0, null, null, org.telegram.ui.ActionBar.k6.t9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.T0}, null, org.telegram.ui.ActionBar.k6.u9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.V0, org.telegram.ui.ActionBar.k6.W0}, null, org.telegram.ui.ActionBar.k6.v9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.X0}, null, org.telegram.ui.ActionBar.k6.w9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.x0, null, null, org.telegram.ui.ActionBar.k6.x9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.Y0}, null, org.telegram.ui.ActionBar.k6.y9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.i1}, null, org.telegram.ui.ActionBar.k6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f1}, null, org.telegram.ui.ActionBar.k6.z9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.c1}, null, org.telegram.ui.ActionBar.k6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.m1}, null, org.telegram.ui.ActionBar.k6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.k6.d9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.k6.c9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.k6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.k6.e7));
        org.telegram.ui.Components.zw0 zw0Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.m6(zw0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(zw0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, org.telegram.ui.d10] */
    public final void h(final long j10, final long j11, final long j12, final long j13, final uf.e0 e0Var, final boolean z4, String str, boolean z10) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j10 + j11 + j12 + j13 + (e0Var == null ? -1 : e0Var.d) + str2 + z4;
        String str4 = this.x;
        boolean z11 = str4 != null && str4.equals(str3);
        boolean z12 = !z11 && z10;
        this.y = e0Var;
        this.B = j10;
        this.C = j11;
        this.E = j12;
        this.D = j13;
        this.F = str2;
        this.G = z4;
        d10 d10Var = this.e;
        if (d10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(d10Var);
        }
        z5 z5Var = this.c0;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        if (z11 && z10) {
            return;
        }
        ArrayList arrayList2 = this.a0;
        final boolean z13 = z11;
        ArrayList arrayList3 = this.W;
        org.telegram.ui.Components.zw0 zw0Var = this.c;
        ArrayList arrayList4 = this.f;
        if (z12 || (e0Var == null && j11 == 0 && j10 == 0 && j12 == 0 && j13 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.J = true;
            zw0Var.setVisibility(0);
            org.telegram.ui.Components.rl0 rl0Var = this.d;
            if (rl0Var != null) {
                rl0Var.l();
            }
            this.M++;
            mh.d1 d1Var = this.b;
            if (d1Var.getPinnedHeader() != null) {
                arrayList = arrayList4;
                d1Var.getPinnedHeader().setAlpha(0.0f);
            } else {
                arrayList = arrayList4;
            }
            arrayList3.clear();
            arrayList2.clear();
            if (!z12) {
                return;
            }
        } else if (z10 && !arrayList4.isEmpty()) {
            return;
        } else {
            arrayList = arrayList4;
        }
        this.J = true;
        org.telegram.ui.Components.rl0 rl0Var2 = this.d;
        if (rl0Var2 != null) {
            rl0Var2.l();
        }
        if (!z13) {
            z5Var.run();
            zw0Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            k10 k10Var = this.e0;
            if (k10Var != null) {
                ((tv) k10Var).h(false, null, null, false);
            }
        }
        final int i10 = this.M + 1;
        this.M = i10;
        final int i11 = UserConfig.selectedAccount;
        ?? r02 = new Runnable() { // from class: org.telegram.ui.d10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v11 */
            /* JADX WARN: Type inference failed for: r10v3, types: [int] */
            /* JADX WARN: Type inference failed for: r10v5 */
            /* JADX WARN: Type inference failed for: r3v13, types: [org.telegram.tgnet.TLRPC$TL_messages_search] */
            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                long j14;
                long j15;
                int i13;
                ?? r10;
                int i14;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final t10 t10Var = t10.this;
                ArrayList arrayList5 = t10Var.f;
                final long j16 = j10;
                long j17 = j11;
                final String str5 = str2;
                final uf.e0 e0Var2 = e0Var;
                int i15 = i11;
                long j18 = j12;
                long j19 = j13;
                final boolean z14 = z13;
                ArrayList<Object> arrayList6 = null;
                if (j16 == 0 || j17 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str5);
                    boolean z15 = z4;
                    if (isEmpty) {
                        i12 = i15;
                        j14 = j19;
                        j15 = j18;
                        i13 = 20;
                        r10 = z15;
                    } else {
                        j14 = j19;
                        ArrayList<Object> arrayList7 = new ArrayList<>();
                        ArrayList<CharSequence> arrayList8 = new ArrayList<>();
                        ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                        j15 = j18;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        i12 = i15;
                        i13 = 20;
                        messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z15 ? 1 : 0);
                        r10 = z15 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i13;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = e0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : e0Var2.e;
                    tL_messages_searchGlobal2.community = MessagesController.getInstance(i12).getInputChannel(j17);
                    if (j15 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j15 / 1000);
                    }
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                    }
                    if (z14 && str5.equals(t10Var.w) && !arrayList5.isEmpty()) {
                        i14 = 1;
                        MessageObject messageObject = (MessageObject) l.d.i(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = t10Var.v;
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
                    tL_messages_search.filter = e0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : e0Var2.e;
                    tL_messages_search.peer = AccountInstance.getInstance(i15).getMessagesController().getInputPeer(j16);
                    if (j18 > 0) {
                        tL_messages_search.min_date = (int) (j18 / 1000);
                    }
                    if (j19 > 0) {
                        tL_messages_search.max_date = (int) (j19 / 1000);
                    }
                    if (z14 && str5.equals(t10Var.w) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) l.d.i(1, arrayList5)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    i12 = i15;
                    j15 = j18;
                }
                t10Var.w = str5;
                t10Var.x = str3;
                final ArrayList arrayList10 = new ArrayList();
                uf.g0.x1(t10Var.w, arrayList10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                final int i16 = i10;
                final ArrayList<Object> arrayList11 = arrayList6;
                final int i17 = i12;
                final long j20 = j15;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() { // from class: org.telegram.ui.e10
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
                        final t10 t10Var2 = t10.this;
                        final int i20 = i16;
                        final boolean z16 = z14;
                        final uf.e0 e0Var3 = e0Var2;
                        final long j21 = j16;
                        final long j22 = j20;
                        final ArrayList arrayList13 = arrayList11;
                        final ArrayList arrayList14 = arrayList10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.f10
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                int i21;
                                boolean z17;
                                k10 k10Var2;
                                ArrayList arrayList15;
                                int i22;
                                ArrayList arrayList16;
                                SparseArray sparseArray;
                                char c3;
                                char c10;
                                t10 t10Var3 = t10.this;
                                m10 m10Var = t10Var3.Q;
                                r10 r10Var = t10Var3.R;
                                ArrayList arrayList17 = t10Var3.n;
                                SparseArray sparseArray2 = t10Var3.h;
                                ArrayList arrayList18 = t10Var3.a0;
                                HashMap hashMap = t10Var3.r;
                                ArrayList arrayList19 = t10Var3.f;
                                ArrayList arrayList20 = t10Var3.W;
                                mh.d1 d1Var2 = t10Var3.b;
                                org.telegram.ui.Components.zw0 zw0Var2 = t10Var3.c;
                                if (i20 != t10Var3.M) {
                                    return;
                                }
                                t10Var3.J = false;
                                if (tL_error != null) {
                                    jh.s sVar = zw0Var2.d;
                                    org.telegram.ui.Components.g90 g90Var = zw0Var2.e;
                                    sVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                    g90Var.setVisibility(0);
                                    g90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    zw0Var2.e(false, true);
                                    return;
                                }
                                zw0Var2.e(false, true);
                                jh.s sVar2 = zw0Var2.d;
                                org.telegram.ui.Components.g90 g90Var2 = zw0Var2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                t10Var3.v = messages_messages2.next_rate;
                                int i23 = i18;
                                MessagesStorage.getInstance(i23).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                                MessagesController.getInstance(i23).putUsers(messages_messages2.users, false);
                                MessagesController.getInstance(i23).putChats(messages_messages2.chats, false);
                                boolean z18 = z16;
                                if (!z18) {
                                    arrayList19.clear();
                                    sparseArray2.clear();
                                    arrayList17.clear();
                                    hashMap.clear();
                                }
                                t10Var3.L = messages_messages2.count;
                                String str7 = str6;
                                t10Var3.N = str7;
                                ArrayList arrayList21 = arrayList12;
                                int size2 = arrayList21.size();
                                int i24 = 0;
                                while (i24 < size2) {
                                    boolean z19 = z18;
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
                                        int i25 = t10Var3.O;
                                        arrayList16 = arrayList17;
                                        SparseArray[] sparseArrayArr = t12.W6;
                                        ArrayList arrayList24 = t12.V6;
                                        sparseArray = sparseArray2;
                                        if (i25 == t12.c) {
                                            if (sparseArrayArr[0].indexOfKey(messageObject3.getId()) < 0) {
                                                if (t12.N5) {
                                                    arrayList24.add(messageObject3);
                                                    c10 = 0;
                                                } else {
                                                    c10 = 0;
                                                    arrayList24.add(0, messageObject3);
                                                }
                                                c3 = 0;
                                                sparseArrayArr[c10].put(messageObject3.getId(), messageObject3);
                                            } else {
                                                c3 = 0;
                                            }
                                            t12.M5[c3] = arrayList24.size() == t12.G5;
                                            t12.D2();
                                        }
                                    } else {
                                        arrayList16 = arrayList17;
                                        sparseArray = sparseArray2;
                                    }
                                    i24 = i22 + 1;
                                    arrayList21 = arrayList22;
                                    z18 = z19;
                                    arrayList17 = arrayList16;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z20 = z18;
                                if (arrayList19.size() > t10Var3.L) {
                                    t10Var3.L = arrayList19.size();
                                }
                                t10Var3.K = arrayList19.size() >= t10Var3.L;
                                boolean isEmpty2 = arrayList19.isEmpty();
                                uf.e0 e0Var4 = e0Var3;
                                if (isEmpty2) {
                                    if (e0Var4 == null) {
                                        sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        g90Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(t10Var3.N) && j21 == 0 && j22 == 0) {
                                        sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                        int i26 = e0Var4.d;
                                        String string = i26 == 1 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles) : i26 == 0 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMedia) : i26 == 2 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleLinks) : i26 == 3 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMusic) : LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleVoice);
                                        g90Var2.setVisibility(0);
                                        g90Var2.setText(string);
                                    } else {
                                        sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        g90Var2.setVisibility(0);
                                        g90Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    }
                                }
                                if (e0Var4 != null) {
                                    int i27 = e0Var4.d;
                                    if (i27 != 0) {
                                        if (i27 == 1) {
                                            t10Var3.d = t10Var3.S;
                                        } else if (i27 == 2) {
                                            t10Var3.d = t10Var3.T;
                                        } else if (i27 == 3) {
                                            t10Var3.d = t10Var3.U;
                                        } else if (i27 == 5) {
                                            t10Var3.d = t10Var3.V;
                                        }
                                    } else if (TextUtils.isEmpty(t10Var3.N)) {
                                        t10Var3.d = r10Var;
                                    } else {
                                        t10Var3.d = m10Var;
                                    }
                                } else {
                                    t10Var3.d = m10Var;
                                }
                                f2.p0 adapter = d1Var2.getAdapter();
                                org.telegram.ui.Components.rl0 rl0Var3 = t10Var3.d;
                                if (adapter != rl0Var3) {
                                    d1Var2.setAdapter(rl0Var3);
                                }
                                if (z20) {
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
                                        z17 = 0;
                                        arrayList26.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                        arrayList18.clear();
                                        arrayList18.addAll(arrayList14);
                                        t10Var3.b0 = z17;
                                        if (str7.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str7) || "archive".startsWith(str7))) {
                                            t10Var3.b0 = true;
                                        }
                                        k10Var2 = t10Var3.e0;
                                        i21 = z17;
                                        if (k10Var2 != null) {
                                            ((tv) k10Var2).h(TextUtils.isEmpty(t10Var3.N), arrayList26, arrayList18, t10Var3.b0);
                                            i21 = z17;
                                        }
                                    }
                                    z17 = 0;
                                    arrayList18.clear();
                                    arrayList18.addAll(arrayList14);
                                    t10Var3.b0 = z17;
                                    if (str7.length() >= 3) {
                                        t10Var3.b0 = true;
                                    }
                                    k10Var2 = t10Var3.e0;
                                    i21 = z17;
                                    if (k10Var2 != null) {
                                    }
                                }
                                View view = null;
                                int i29 = -1;
                                for (int i30 = i21; i30 < size2; i30++) {
                                    View childAt = d1Var2.getChildAt(i30);
                                    if (childAt instanceof org.telegram.ui.Components.u00) {
                                        i29 = RecyclerView.R(childAt);
                                        view = childAt;
                                    }
                                }
                                if (view != null) {
                                    d1Var2.removeView(view);
                                }
                                if ((t10Var3.h0.getVisibility() == 0 && d1Var2.getChildCount() == 0) || (d1Var2.getAdapter() != r10Var && view != null)) {
                                    t10Var3.getViewTreeObserver().addOnPreDrawListener(new wq(t10Var3, (org.telegram.ui.Components.u00) view, i29, 3));
                                }
                                t10Var3.d.l();
                            }
                        });
                    }
                });
            }
        };
        this.e = r02;
        AndroidUtilities.runOnUIThread(r02, (!z13 || arrayList.isEmpty()) ? 350L : 0L);
        h10 h10Var = this.h0;
        if (e0Var == null) {
            h10Var.setViewType(1);
            return;
        }
        int i12 = e0Var.d;
        if (i12 == 0) {
            if (TextUtils.isEmpty(this.F)) {
                h10Var.setViewType(2);
                return;
            } else {
                h10Var.setViewType(1);
                return;
            }
        }
        if (i12 == 1) {
            h10Var.setViewType(3);
            return;
        }
        if (i12 == 3 || i12 == 5) {
            h10Var.setViewType(4);
        } else if (i12 == 2) {
            h10Var.setViewType(5);
        }
    }

    public final void i(k10 k10Var, boolean z4) {
        this.e0 = k10Var;
        if (!z4 || k10Var == null) {
            return;
        }
        ArrayList arrayList = this.W;
        if (arrayList.isEmpty()) {
            return;
        }
        ((tv) k10Var).h(false, arrayList, this.a0, this.b0);
    }

    public final void j(int i10, int i11, boolean z4) {
        setClipToPadding(false);
        this.o0 = z4;
        setPadding(0, i10, 0, i11);
        mh.d1 d1Var = this.b;
        if (z4) {
            d1Var.n1(0, i10, 0, i11);
        } else {
            d1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.o0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.n0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.n0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.rl0 rl0Var;
        int i12 = this.s;
        if (AndroidUtilities.isTablet()) {
            this.s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.s = 6;
        } else {
            this.s = 3;
        }
        if (i12 != this.s && (rl0Var = this.d) == this.R) {
            this.o0 = true;
            rl0Var.l();
            this.o0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.o0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(og.a aVar) {
        rg.d dVar = new rg.d(null);
        dVar.e = new s0.b(22);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(0, 0);
        dVar.f = 1.0f;
        dVar.h = 1.0f;
        oh.b3 b3Var = this.j0;
        qg.b c3 = aVar.c(b3Var, dVar, false);
        b3Var.c = c3;
        c3.p(AndroidUtilities.dp(11.5f));
        ((qg.b) b3Var.c).o(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.zn0 zn0Var) {
        this.f0 = zn0Var;
    }

    public void setUiCallback(s10 s10Var) {
        this.l0 = s10Var;
    }

    public void setUseFromUserAsAvatar(boolean z4) {
        this.m0 = z4;
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
