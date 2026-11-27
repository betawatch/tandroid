// default package

import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qe2 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qe2(c cVar, String str, pcc pccVar) {
        this.a = (byte) 16;
        this.b = str;
        this.c = pccVar;
    }

    private final void b(Object obj, Object obj2) {
        boolean z;
        b58 b58Var = (b58) this.b;
        TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
        TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
        a96 a96Var = b58Var.W;
        int i = b58Var.O;
        b58Var.V = false;
        TLRPC.InputGroupCall inputGroupCall = b58Var.P;
        if (inputGroupCall == null || inputGroupCall.id != getgroupcallstars.call.id) {
            return;
        }
        if (groupcallstars != null) {
            uc7.s1(i).j4(groupcallstars.users, false);
            uc7.s1(i).c4(groupcallstars.chats, false);
            int i2 = 0;
            while (true) {
                if (i2 >= groupcallstars.top_donors.size()) {
                    break;
                }
                if (!groupcallstars.top_donors.get(i2).my) {
                    i2++;
                } else if (groupcallstars.top_donors.get(i2).stars > 0) {
                    z = true;
                }
            }
            z = false;
            long j = groupcallstars.total_stars;
            boolean z2 = (j == b58Var.R && b58Var.T == z) ? false : true;
            b58Var.R = j;
            b58Var.U = groupcallstars.top_donors;
            b58Var.T = z;
            if (z2) {
                b58Var.i();
            }
            b58Var.s();
        }
        if (b58Var.isAttachedToWindow()) {
            hl.r(a96Var);
            hl.d3(a96Var, 5000L);
        }
    }

    private final void c(Object obj, Object obj2) {
        uc7 uc7Var = (uc7) this.b;
        icc iccVar = (icc) this.c;
        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        if (messages_chats == null) {
            iccVar.a(null, tL_error);
            return;
        }
        ArrayList arrayList = new ArrayList(messages_chats.chats.size());
        uc7Var.c4(messages_chats.chats, true);
        ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            TLRPC.Chat chat = arrayList2.get(i);
            i++;
            TLRPC.Chat chat2 = chat;
            if (chat2.creator && !xc2.p0(chat2) && !xc2.Y(chat2)) {
                arrayList.add(chat2);
            }
        }
        iccVar.a(arrayList, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0a30  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        boolean z;
        long j;
        InputMethodManager inputMethodManager;
        TLRPC.User X1;
        TLRPC.User X12;
        TLRPC.Chat M0;
        long j2;
        d31 b0;
        int i;
        JSONArray jSONArray;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        byte b = 12;
        String str = "";
        int i2 = 2;
        long j3 = 0;
        r10 = null;
        r10 = null;
        r10 = null;
        r10 = null;
        r10 = null;
        r10 = null;
        r10 = null;
        Object obj3 = null;
        r10 = null;
        r10 = null;
        Object v = null;
        TLRPC.TL_contacts_found tL_contacts_found = null;
        char c = 1;
        switch (this.a) {
            case 0:
                af2 af2Var = (af2) this.b;
                le2 le2Var = (le2) this.c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    hl.c3(new ea2(le2Var, tL_error, b));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (!(chatThemes instanceof TL_account.Tl_chatThemes)) {
                    if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                        hl.c3(new ea2(af2Var, le2Var, (byte) 13));
                        return;
                    }
                    return;
                }
                TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                jf7 messagesStorage = af2Var.getMessagesStorage();
                ArrayList<TLRPC.ChatTheme> arrayList2 = tl_chatThemes.themes;
                messagesStorage.getClass();
                messagesStorage.H(new t87(messagesStorage, arrayList2, (byte) 21));
                af2Var.getMessagesStorage().j1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                af2Var.getMessagesController().j4(tl_chatThemes.users, false);
                af2Var.getMessagesController().c4(tl_chatThemes.chats, false);
                ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                int size = arrayList3.size();
                int i3 = 0;
                while (i3 < size) {
                    TLRPC.ChatTheme chatTheme = arrayList3.get(i3);
                    i3++;
                    TLRPC.ChatTheme chatTheme2 = chatTheme;
                    if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                        arrayList.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ez3 ez3Var = new ez3(af2Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i4));
                    ez3Var.p(0, null);
                    ez3Var.p(1, null);
                    ez3Var.n(0, null);
                    ez3Var.n(1, null);
                    arrayList4.add(ez3Var);
                }
                hl.c3(new la7((Object) af2Var, (Object) tl_chatThemes, (Object) arrayList4, (Object) arrayList, (Object) le2Var, (byte) 24));
                return;
            case 1:
                gt gtVar = (gt) this.b;
                ft ftVar = (ft) this.c;
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool.booleanValue()) {
                        gtVar.a(Boolean.TRUE);
                    }
                    ftVar.run();
                    return;
                }
                return;
            case 2:
                ao0 ao0Var = (ao0) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool2 = (Boolean) obj;
                String str2 = (String) obj2;
                ao0Var.l2.a.setLoading(false);
                if (ao0Var.getContext() != null) {
                    e S = LaunchActivity.S();
                    y16 y16Var = LaunchActivity.H1.w0;
                    if (S != null) {
                        if (!bool2.booleanValue()) {
                            if (str2 != null) {
                                ao0Var.dismiss();
                                d31.b0(S).Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, str2)).j();
                                return;
                            }
                            return;
                        }
                        ao0Var.dismiss();
                        zu1 ha = zu1.ha(-ao0Var.W1.id);
                        S.presentFragment(ha);
                        S.whenFullyVisible(new a30(ha, tL_starsGiveawayOption, b));
                        if (y16Var != null) {
                            y16Var.c(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((kcc) this.b).a((Boolean) obj, (gj0) obj2, (hj0) this.c);
                return;
            case 4:
                dl1 dl1Var = (dl1) this.b;
                e eVar = (e) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    uc7.s1(dl1Var.I).Y3(updates, false);
                }
                if (tL_error2 != null) {
                    hl.c3(new jj1(eVar, tL_error2, (byte) 3));
                    return;
                }
                return;
            case 5:
                ((zu1) this.b).u9((r47) this.c, (Long) obj, (Runnable) obj2);
                return;
            case 6:
                zu1 zu1Var = (zu1) this.b;
                p pVar = (p) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                zu1Var.X5 = 0;
                if (webpagepreview != null) {
                    zu1Var.getMessagesController().j4(webpagepreview.users, false);
                    zu1Var.getMessagesController().c4(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage != null) {
                            pVar.a(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (webPage == null || !"telegram_story".equals(webPage.type)) {
                            pVar.a(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                            return;
                        }
                        if (tL_messageMediaWebPage.webpage.attributes != null) {
                            for (int i5 = 0; i5 < tL_messageMediaWebPage.webpage.attributes.size(); i5++) {
                                if (tL_messageMediaWebPage.webpage.attributes.get(i5) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i5);
                                    if (tL_webPageAttributeStory != null) {
                                        pVar.a(Boolean.FALSE, null);
                                        return;
                                    } else if (tL_webPageAttributeStory.storyItem != null) {
                                        pVar.a(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                        return;
                                    } else {
                                        zu1Var.getMessagesStorage().a.c(new ao1(zu1Var, tL_messageMediaWebPage, tL_webPageAttributeStory, pVar, (byte) 2));
                                        return;
                                    }
                                }
                            }
                        }
                        tL_webPageAttributeStory = null;
                        if (tL_webPageAttributeStory != null) {
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage != null) {
                }
                break;
            case 7:
                ju1 ju1Var = (ju1) this.b;
                wb2 wb2Var = (wb2) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                zu1 zu1Var2 = ju1Var.a;
                if (tL_channels_channelParticipant != null) {
                    zu1Var2.getMessagesController().j4(tL_channels_channelParticipant.users, false);
                    zu1Var2.getMessagesController().c4(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        ju1Var.e(wb2Var, channelParticipant);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                String str3 = (String) this.c;
                CharSequence charSequence = (CharSequence) obj;
                int i6 = ChatActivityEnterView.X7;
                chatActivityEnterView.A6 = -1;
                if (chatActivityEnterView.B6) {
                    tx1 tx1Var = chatActivityEnterView.F0;
                    Editable text = tx1Var != null ? tx1Var.getText() : null;
                    if (text == null || !str3.equals(text.toString())) {
                        chatActivityEnterView.k(false);
                        return;
                    }
                    if (charSequence == null) {
                        chatActivityEnterView.k(true);
                        return;
                    }
                    tx1 tx1Var2 = chatActivityEnterView.F0;
                    Editable text2 = tx1Var2.getText();
                    chatActivityEnterView.C0();
                    Layout layout = tx1Var2.getLayout();
                    if (layout == null || layout.getWidth() <= 0) {
                        z = false;
                    } else {
                        boolean z2 = vm2.h(chatActivityEnterView.J0(aob.d6)) < 0.5d;
                        float width = layout.getWidth();
                        StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), tx1Var2.getPaint(), layout.getWidth()).build();
                        int scrollY = tx1Var2.getScrollY();
                        int max = Math.max(1, (tx1Var2.getHeight() - tx1Var2.getTotalPaddingTop()) - tx1Var2.getTotalPaddingBottom());
                        float max2 = Math.max(scrollY + max, Math.min(build.getHeight(), (max << 1) + scrollY));
                        sn3 sn3Var = chatActivityEnterView.z6;
                        float f = sn3Var.E;
                        z = sn3Var.b(((scrollY * 0.9f) - f) - hl.L(4.0f), bs2.i(max2, 0.9f, width, f) + hl.L(4.0f), chatActivityEnterView.J0(aob.Pe) | (-16777216), z2);
                        if (z) {
                            j = Math.max(600L, Math.min(900L, (Math.max(layout.getLineCount(), build.getLineCount()) * 60) + 540));
                            chatActivityEnterView.F1 = SystemClock.uptimeMillis() + j;
                            chatActivityEnterView.G1 = sn3.J;
                            BaseInputConnection.removeComposingSpans(text2);
                            text2.replace(0, text2.length(), charSequence);
                            tx1Var2.setSelection(text2.length());
                            inputMethodManager = (InputMethodManager) chatActivityEnterView.getContext().getSystemService("input_method");
                            if (inputMethodManager != null) {
                                inputMethodManager.restartInput(tx1Var2);
                            }
                            byte b2 = 20;
                            if (z) {
                                chatActivityEnterView.z6.a(j);
                                z92 G0 = chatActivityEnterView.G0();
                                if (G0 != null) {
                                    if (chatActivityEnterView.L6 == null) {
                                        chatActivityEnterView.L6 = new gn3();
                                    }
                                    if (G0.n == null) {
                                        G0.n = new h01(chatActivityEnterView, G0, b2);
                                    }
                                }
                                z92 G02 = chatActivityEnterView.G0();
                                if (G02 != null) {
                                    G02.invalidate();
                                }
                                sn3 sn3Var2 = chatActivityEnterView.z6;
                                long j4 = sn3Var2.e;
                                chatActivityEnterView.F1 = j4 == 0 ? 0L : j4 + sn3Var2.a;
                                sn3Var2.H = new mv1(chatActivityEnterView, (byte) 23);
                                tx1Var2.invalidate();
                                hl.d3(new mv1(chatActivityEnterView, (byte) 24), 120 + j);
                            }
                            hl.d3(new mv1(chatActivityEnterView, b2), Math.max(0L, j - 260));
                            dx1 dx1Var = new dx1(chatActivityEnterView, c == true ? 1 : 0);
                            chatActivityEnterView.D6 = dx1Var;
                            hl.d3(dx1Var, j + 140);
                            return;
                        }
                    }
                    j = 0;
                    BaseInputConnection.removeComposingSpans(text2);
                    text2.replace(0, text2.length(), charSequence);
                    tx1Var2.setSelection(text2.length());
                    inputMethodManager = (InputMethodManager) chatActivityEnterView.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                    }
                    byte b22 = 20;
                    if (z) {
                    }
                    hl.d3(new mv1(chatActivityEnterView, b22), Math.max(0L, j - 260));
                    dx1 dx1Var2 = new dx1(chatActivityEnterView, c == true ? 1 : 0);
                    chatActivityEnterView.D6 = dx1Var2;
                    hl.d3(dx1Var2, j + 140);
                    return;
                }
                return;
            case 9:
                n12 n12Var = (n12) this.b;
                b8 b8Var = (b8) this.c;
                Long l = (Long) obj;
                ((Runnable) obj2).run();
                n12Var.d2.setStarsPrice(l.longValue());
                if (l.longValue() > 0) {
                    b8Var.setText(ob6.M0(2131747455, null));
                    b8Var.setSubtext(ob6.G((int) l.longValue(), "Stars", new Object[0]));
                    n12Var.b2.t(l.longValue());
                    return;
                } else {
                    b8Var.setText(ob6.M0(2131747457, null));
                    b8Var.setSubtext(null);
                    n12Var.b2.t(0L);
                    return;
                }
            case 10:
                ((a72) this.b).U((eh8) ((zg8) this.c), true);
                return;
            case 11:
                nk3 nk3Var = (nk3) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList5 = nk3Var.V;
                ArrayList arrayList6 = nk3Var.U;
                int i7 = nk3Var.Q;
                if (!TextUtils.equals(tL_contacts_search.q, nk3Var.h0) || TextUtils.isEmpty(nk3Var.h0)) {
                    return;
                }
                nk3Var.d0 = false;
                if (tL_contacts_found2 != null) {
                    jf7.Y(i7).j1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                    uc7.s1(i7).j4(tL_contacts_found2.users, false);
                    uc7.s1(i7).c4(tL_contacts_found2.chats, false);
                    tL_contacts_found = tL_contacts_found2;
                }
                HashSet hashSet = new HashSet();
                arrayList6.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList7 = tL_contacts_found.my_results;
                    int size2 = arrayList7.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        TLRPC.Peer peer = arrayList7.get(i8);
                        i8++;
                        TLRPC.Peer peer2 = peer;
                        if ((peer2 instanceof TLRPC.TL_peerUser) && (X12 = uc7.s1(i7).X1(Long.valueOf(peer2.user_id))) != null && X12.bot && !hashSet.contains(Long.valueOf(X12.id))) {
                            hashSet.add(Long.valueOf(X12.id));
                            arrayList6.add(X12);
                        }
                    }
                }
                arrayList5.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList8 = tL_contacts_found.results;
                    int size3 = arrayList8.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        TLRPC.Peer peer3 = arrayList8.get(i9);
                        i9++;
                        TLRPC.Peer peer4 = peer3;
                        if ((peer4 instanceof TLRPC.TL_peerUser) && (X1 = uc7.s1(i7).X1(Long.valueOf(peer4.user_id))) != null && X1.bot && !hashSet.contains(Long.valueOf(X1.id))) {
                            hashSet.add(Long.valueOf(X1.id));
                            arrayList5.add(X1);
                        }
                    }
                }
                d79 d79Var = nk3Var.d;
                if (d79Var != null) {
                    d79Var.x0(0);
                }
                nk3Var.O(true);
                return;
            case 12:
                pk3 pk3Var = (pk3) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList9 = pk3Var.V;
                ArrayList arrayList10 = pk3Var.U;
                ArrayList arrayList11 = pk3Var.T;
                int i10 = pk3Var.Q;
                if (!TextUtils.equals(tL_contacts_search2.q, pk3Var.e0) || TextUtils.isEmpty(pk3Var.e0)) {
                    return;
                }
                pk3Var.a0 = false;
                if (tL_contacts_found3 != null) {
                    jf7.Y(i10).j1(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                    uc7.s1(i10).j4(tL_contacts_found3.users, false);
                    uc7.s1(i10).c4(tL_contacts_found3.chats, false);
                } else {
                    tL_contacts_found3 = null;
                }
                HashSet hashSet2 = new HashSet();
                arrayList11.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList12 = tL_contacts_found3.my_results;
                    int size4 = arrayList12.size();
                    int i11 = 0;
                    while (i11 < size4) {
                        TLRPC.Peer peer5 = arrayList12.get(i11);
                        i11++;
                        TLRPC.Peer peer6 = peer5;
                        if (peer6 instanceof TLRPC.TL_peerChannel) {
                            long j5 = j3;
                            TLRPC.Chat M02 = uc7.s1(i10).M0(Long.valueOf(peer6.channel_id));
                            if (M02 != null && xc2.V(M02) && !hashSet2.contains(Long.valueOf(M02.id))) {
                                hashSet2.add(Long.valueOf(M02.id));
                                arrayList11.add(M02);
                            }
                            j3 = j5;
                        }
                    }
                }
                long j6 = j3;
                arrayList10.clear();
                String lowerCase = pk3Var.e0.toLowerCase();
                String I3 = hl.I3(lowerCase);
                HashMap hashMap = uc7.s1(i10).N4;
                wb7 wb7Var = hashMap != null ? (wb7) hashMap.get(Long.valueOf(j6)) : null;
                if (wb7Var != null) {
                    ArrayList arrayList13 = wb7Var.b;
                    if (!arrayList13.isEmpty()) {
                        int size5 = arrayList13.size();
                        int i12 = 0;
                        while (i12 < size5) {
                            Object obj4 = arrayList13.get(i12);
                            i12++;
                            TLObject tLObject = (TLObject) obj4;
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                if (xc2.V(chat)) {
                                    TLRPC.Chat M03 = uc7.s1(i10).M0(Long.valueOf(chat.id));
                                    if (xc2.r0(chat) && (M03 == null || xc2.r0(M03))) {
                                        String lowerCase2 = chat.title.toLowerCase();
                                        String I32 = hl.I3(lowerCase2);
                                        if (lowerCase2.startsWith(lowerCase) || uh9.t(" ", lowerCase, lowerCase2) || I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                            if (!hashSet2.contains(Long.valueOf(chat.id))) {
                                                hashSet2.add(Long.valueOf(chat.id));
                                                arrayList10.add(chat);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList9.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList14 = tL_contacts_found3.results;
                    int size6 = arrayList14.size();
                    int i13 = 0;
                    while (i13 < size6) {
                        TLRPC.Peer peer7 = arrayList14.get(i13);
                        i13++;
                        TLRPC.Peer peer8 = peer7;
                        if ((peer8 instanceof TLRPC.TL_peerChannel) && (M0 = uc7.s1(i10).M0(Long.valueOf(peer8.channel_id))) != null && xc2.V(M0) && !hashSet2.contains(Long.valueOf(M0.id))) {
                            hashSet2.add(Long.valueOf(M0.id));
                            arrayList9.add(M0);
                        }
                    }
                }
                pk3Var.O(true);
                return;
            case 13:
                CancellationToken cancellationToken = (CancellationToken) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (cancellationToken.isCancellationRequested()) {
                    return;
                }
                if (auth_authorization == null || tL_error3 != null) {
                    taskCompletionSource.trySetException(new ConnectionsManager.RequestException(tL_error3));
                    return;
                } else {
                    taskCompletionSource.trySetResult(auth_authorization);
                    return;
                }
            case 14:
                ov4 ov4Var = (ov4) this.b;
                icc iccVar = (icc) this.c;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = ov4Var.e;
                if (tL_StarGiftAuctionState != null) {
                    ov4Var.getMessagesController().j4(tL_StarGiftAuctionState.users, false);
                    ov4Var.getMessagesController().c4(tL_StarGiftAuctionState.chats, false);
                    boolean booleanValue = ((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.id, Boolean.FALSE)).booleanValue();
                    TL_stars.StarGift starGift = tL_StarGiftAuctionState.gift;
                    if (!booleanValue) {
                        longSparseArray.put(starGift.id, Boolean.TRUE);
                        ov4Var.j(tL_StarGiftAuctionState.gift.id, new ku0((Object) ov4Var, (Object) tL_StarGiftAuctionState, (Object) iccVar, (Object) tL_error4, (byte) 9));
                        return;
                    }
                    ov4Var.f(starGift.id, tL_StarGiftAuctionState);
                }
                iccVar.a(tL_StarGiftAuctionState, tL_error4);
                return;
            case 15:
                c51 c51Var = (c51) this.b;
                e eVar2 = (e) this.c;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = (TLRPC.TL_starsRevenueStatus) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                c51Var.setLoading(false);
                if (eVar2.getContext() == null || eVar2.getParentActivity() == null) {
                    return;
                }
                if (tL_error5 != null) {
                    d31.e0(tL_error5);
                    return;
                }
                if (tL_starsRevenueStatus != null) {
                    if (!tL_starsRevenueStatus.withdrawal_enabled) {
                        b0 = d31.b0(eVar2);
                        i = 2131749275;
                        bs2.v(null, i, b0, R.raw.error, 36);
                        return;
                    }
                    TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
                    if (starsAmount != null) {
                        j2 = Math.max(0L, starsAmount.amount);
                        if (j2 <= 0) {
                            z15.g(eVar2, j2, null);
                            return;
                        }
                        b0 = d31.b0(eVar2);
                        i = 2131749273;
                        bs2.v(null, i, b0, R.raw.error, 36);
                        return;
                    }
                }
                j2 = 0;
                if (j2 <= 0) {
                }
                break;
            case 16:
                String str4 = (String) this.b;
                pcc pccVar = (pcc) this.c;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(apiresponse.response.data);
                        if (jSONObject.has("stack")) {
                            jSONArray = jSONObject.getJSONArray("stack");
                            if (jSONObject.has("exit_code") && jSONObject.getInt("exit_code") != 0) {
                                throw new Exception("received exit code: " + jSONObject.getInt("exit_code"));
                            }
                        } else {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                            if (jSONObject2.has("exit_code") && jSONObject2.getInt("exit_code") != 0) {
                                throw new Exception("received exit code: " + jSONObject2.getInt("exit_code"));
                            }
                            jSONArray = jSONObject2.getJSONArray("stack");
                        }
                        if (jSONArray.get(0) instanceof JSONArray) {
                            str = jSONArray.getJSONArray(0).getString(1);
                        } else if (jSONArray.get(0) instanceof JSONObject) {
                            str = jSONArray.getJSONObject(0).getString("value");
                        }
                        if (str.startsWith("0x")) {
                            v = Utilities.v(str.substring(2));
                        }
                    } catch (Exception e) {
                        c.n("failed to get public key of " + str4, e);
                    }
                }
                pccVar.a(v);
                return;
            case 17:
                c cVar = (c) this.b;
                btc btcVar = (btc) this.c;
                c35 c35Var = (c35) obj;
                String str5 = (String) obj2;
                if (c35Var == null) {
                    c.m("enable backup: didnt get secret phrase: ".concat(str5 == null ? "NULL_ERROR" : str5));
                    btcVar.a(str5 != null ? str5 : "NULL_ERROR");
                    return;
                }
                c35 b3 = c35Var.b();
                rx1 rx1Var = new rx1((Object) b3, (Object) btcVar, (byte) 26);
                c.P("enable backup: got secret phrase");
                try {
                    ConnectionsManager.getInstance(cVar.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new ic((byte) 0), new nu0((Object) cVar, (Object) rx1Var, (Object) b3, (Object) WalletEngine2.secretPhraseToPublicKey(b3), (byte) 4));
                    return;
                } catch (Exception e2) {
                    c.n("failed to get public key from secret phrase", e2);
                    rx1Var.a(e2.getMessage() != null ? e2.getMessage() : "NULL_ERROR");
                    return;
                }
            case 18:
                c cVar2 = (c) this.b;
                ctc ctcVar = (ctc) this.c;
                c35 c35Var2 = (c35) obj;
                String str6 = (String) obj2;
                if (c35Var2 == null) {
                    c.m("prepare disable backup, cant get secret phrase: ".concat(str6 == null ? "NULL_ERROR" : str6));
                    ctcVar.a(null, str6 != null ? str6 : "NULL_ERROR");
                    return;
                }
                TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = cVar2.f;
                if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
                    TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
                }
                c.P("prepare disable backup: preparing transfer");
                cVar2.b.prepareRotateKey(c35Var2, null, new k25(cVar2, ctcVar, (byte) 0));
                return;
            case 19:
                c cVar3 = (c) this.b;
                rx1 rx1Var2 = (rx1) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (tL_error6 == null) {
                    c.P("enable backup: server accepted request");
                    cVar3.z0(walletState);
                    rx1Var2.a(null);
                    return;
                }
                c.m("enable backup: server rejected request code=" + tL_error6.code + " error=" + tL_error6.text);
                String str7 = tL_error6.text;
                rx1Var2.a(str7 != null ? str7 : "NULL_ERROR");
                return;
            case 20:
                s25 s25Var = (s25) this.b;
                icc iccVar2 = (icc) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str8 = (String) obj2;
                if (s25Var.a) {
                    return;
                }
                iccVar2.a(wallettransaction, str8);
                return;
            case 21:
                String str9 = (String) this.b;
                jq0 jq0Var = (jq0) this.c;
                TL_toncenter.apiResponse apiresponse2 = (TL_toncenter.apiResponse) obj;
                if (((TLRPC.TL_error) obj2) == null && apiresponse2 != null && apiresponse2.response != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(apiresponse2.response.data).optJSONArray("records");
                        if (optJSONArray != null && optJSONArray.length() == 1) {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(0);
                            if (str9.equals(jSONObject3.optString("domain"))) {
                                String optString = jSONObject3.optString("dns_wallet", "");
                                if (WalletEngine2.isValidAddress(optString)) {
                                    obj3 = optString;
                                }
                            }
                        }
                    } catch (JSONException e3) {
                        cc4.g(e3, true);
                    }
                }
                jq0Var.a(obj3);
                return;
            case 22:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                o45 o45Var = (o45) this.c;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str10 = (String) obj2;
                if (str10 == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                o45Var.a(str10);
                return;
            case 23:
                ((c35) this.b).close();
                hl.c3(new re4(this.c, obj, obj2, (byte) 16));
                return;
            case 24:
                ((c35) this.b).close();
                ((g45) this.c).a((w45) obj, (String) obj2);
                return;
            case 25:
                j95 j95Var = (j95) this.b;
                vc2 vc2Var = (vc2) this.c;
                Boolean bool3 = (Boolean) obj;
                HashSet hashSet3 = (HashSet) obj2;
                vc2 vc2Var2 = j95Var.T2;
                if (vc2Var2 == null || (groupCall = vc2Var2.b) == null) {
                    return;
                }
                String str11 = groupCall.invite_link;
                int size7 = hashSet3.size();
                AtomicInteger atomicInteger = new AtomicInteger(0);
                HashSet hashSet4 = new HashSet();
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    Long l2 = (Long) it.next();
                    long longValue = l2.longValue();
                    j95Var.T2.a(longValue);
                    TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    inviteconferencecallparticipant.call = tL_inputGroupCall;
                    TLRPC.GroupCall groupCall2 = j95Var.T2.b;
                    tL_inputGroupCall.id = groupCall2.id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    uc7 s1 = uc7.s1(j95Var.a);
                    inviteconferencecallparticipant.user_id = s1.q1(s1.X1(l2));
                    inviteconferencecallparticipant.video = bool3.booleanValue();
                    ConnectionsManager.getInstance(j95Var.a).sendRequest(inviteconferencecallparticipant, new xr0(j95Var, longValue, hashSet4, atomicInteger, size7, vc2Var, str11));
                }
                j95Var.E0(true);
                if (!bool3.booleanValue() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1) {
                    return;
                }
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                j95Var.M1(true, true);
                return;
            case 26:
                e66 e66Var = (e66) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                e66Var.c();
                if (tL_error7 == null) {
                    uq7.b(e66Var.d, e66Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    return;
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error7.text)) {
                    e66.d().I(R.raw.error, ob6.M0(2131753121, null), ob6.M0(2131753122, null)).j();
                    return;
                } else {
                    e66.d().g0(tL_error7, false);
                    return;
                }
            case 27:
                b(obj, obj2);
                return;
            case 28:
                c(obj, obj2);
                return;
            default:
                uc7 uc7Var = (uc7) this.b;
                oo2 oo2Var = (oo2) this.c;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                if (updates2 == null) {
                    if (oo2Var != null) {
                        hl.c3(new t87(oo2Var, tL_error8, (byte) 9));
                        return;
                    }
                    return;
                }
                ArrayList<TLRPC.Update> arrayList15 = updates2.updates;
                int size8 = arrayList15.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size8) {
                        TLRPC.Update update = arrayList15.get(i14);
                        i14++;
                        TLRPC.Update update2 = update;
                        if (update2 instanceof TL_update.TL_updateNewMessage) {
                            TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) update2).message.action;
                            if (!(messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest)) {
                                if (messageAction instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                    i2 = 1;
                                }
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                }
                uc7Var.Y3(updates2, false);
                hl.c3(new sb4((Object) uc7Var, (Object) oo2Var, i2, (byte) 10));
                return;
        }
    }

    public /* synthetic */ qe2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
