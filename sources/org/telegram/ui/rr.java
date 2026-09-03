package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rr extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public RadialProgressView A1;
    public TLRPC.TL_chatBannedRights B;
    public int B0;
    public final ArrayList C;
    public int C0;
    public final ArrayList D;
    public int D0;
    public final ArrayList E;
    public int E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public int G0;
    public final a0.h H;
    public int H0;
    public final a0.h I;
    public int I0;
    public final a0.h J;
    public int J0;
    public long K;
    public int K0;
    public final int L;
    public int L0;
    public final boolean M;
    public int M0;
    public boolean N;
    public int N0;
    public boolean O;
    public int O0;
    public int P;
    public int P0;
    public int Q;
    public int Q0;
    public int R;
    public int R0;
    public int S;
    public int S0;
    public int T;
    public int T0;
    public int U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public int Y0;
    public int Z;
    public int Z0;
    public nr a;
    public int a0;
    public int a1;
    public org.telegram.ui.Components.zw0 b;
    public int b0;
    public final int b1;
    public lh.e1 c;
    public int c0;
    public int c1;
    public dr d;
    public int d0;
    public int d1;
    public qr e;
    public int e0;
    public int e1;
    public org.telegram.ui.ActionBar.w0 f;
    public int f0;
    public int f1;
    public int g0;
    public int g1;
    public org.telegram.ui.ActionBar.w0 h;
    public int h0;
    public int h1;
    public int i0;
    public boolean i1;
    public int j0;
    public kr j1;
    public int k0;
    public final boolean k1;
    public int l0;
    public boolean l1;
    public int m0;
    public int m1;
    public UndoView n;
    public int n0;
    public int n1;
    public int o0;
    public boolean o1;
    public int p0;
    public int p1;
    public int q0;
    public final boolean q1;
    public TLRPC.Chat r;
    public int r0;
    public final boolean r1;
    public TLRPC.ChatFull s;
    public int s0;
    public boolean s1;
    public boolean t0;
    public boolean t1;
    public int u0;
    public boolean u1;
    public final boolean v;
    public int v0;
    public boolean v1;
    public final boolean w;
    public int w0;
    public long w1;
    public final boolean x;
    public int x0;
    public long x1;
    public final String y;
    public int y0;
    public boolean y1;
    public int z0;
    public org.telegram.ui.Components.u00 z1;

    public rr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.B = new TLRPC.TL_chatBannedRights();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.H = new a0.h();
        this.I = new a0.h();
        this.J = new a0.h();
        this.w1 = 10L;
        this.x1 = 10L;
        this.K = this.arguments.getLong("chat_id");
        this.L = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR);
        this.M = this.arguments.getBoolean("transfer");
        this.k1 = this.arguments.getBoolean("open_search");
        this.b1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.K));
        this.r = chat;
        boolean z4 = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.B;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z10 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z10;
            tL_chatBannedRights2.embed_links = tL_chatBannedRights.embed_links;
            tL_chatBannedRights2.send_messages = tL_chatBannedRights.send_messages;
            tL_chatBannedRights2.send_games = tL_chatBannedRights.send_games;
            tL_chatBannedRights2.send_inline = tL_chatBannedRights.send_inline;
            tL_chatBannedRights2.send_gifs = tL_chatBannedRights.send_gifs;
            tL_chatBannedRights2.pin_messages = tL_chatBannedRights.pin_messages;
            tL_chatBannedRights2.edit_rank = tL_chatBannedRights.edit_rank;
            tL_chatBannedRights2.send_reactions = tL_chatBannedRights.send_reactions;
            tL_chatBannedRights2.send_polls = tL_chatBannedRights.send_polls;
            tL_chatBannedRights2.invite_users = tL_chatBannedRights.invite_users;
            tL_chatBannedRights2.manage_topics = tL_chatBannedRights.manage_topics;
            tL_chatBannedRights2.change_info = tL_chatBannedRights.change_info;
            tL_chatBannedRights2.manage_linked_peers = tL_chatBannedRights.manage_linked_peers;
            boolean z11 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z11;
            boolean z12 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z12;
            boolean z13 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z13;
            boolean z14 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z14;
            boolean z15 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z15;
            boolean z16 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z16;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z10 && z16 && z15 && z14 && z13 && z12 && z11) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.y = ChatObject.getBannedRightsString(this.B);
        boolean isCommunity = ChatObject.isCommunity(this.r);
        this.w = isCommunity;
        if (ChatObject.isChannel(this.r) && !this.r.megagroup && !isCommunity) {
            z4 = true;
        }
        this.v = z4;
        this.x = ChatObject.isForum(this.r);
        TLRPC.Chat chat2 = this.r;
        if (chat2 != null) {
            boolean z17 = chat2.signatures;
            this.s1 = z17;
            this.q1 = z17;
            boolean z18 = chat2.signature_profiles;
            this.t1 = z18;
            this.r1 = z18;
        }
    }

    public static /* synthetic */ void U(rr rrVar, long j10) {
        if (j10 != 0) {
            rrVar.K = j10;
            rrVar.r = MessagesController.getInstance(rrVar.currentAccount).getChat(Long.valueOf(j10));
            rrVar.u0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(final rr rrVar, View view, int i10) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View m9;
        long j10;
        boolean z4;
        String str;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLObject tLObject;
        boolean z10;
        TLObject tLObject2;
        boolean canBlockUsers;
        boolean z11;
        int i11;
        long j12;
        String str2;
        boolean z12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i12 = rrVar.b1;
        a0.h hVar = rrVar.H;
        a0.h hVar2 = rrVar.J;
        boolean z13 = rrVar.v;
        int i13 = rrVar.L;
        final int i14 = 0;
        i14 = 0;
        i14 = 0;
        final int i15 = 1;
        boolean z14 = rrVar.c.getAdapter() == rrVar.a;
        if (i10 == rrVar.e1) {
            boolean z15 = !rrVar.s1;
            rrVar.s1 = z15;
            ((org.telegram.ui.Cells.r8) view).setChecked(z15);
            AndroidUtilities.updateVisibleRows(rrVar.c);
            lr w02 = rrVar.w0();
            rrVar.B0();
            rrVar.A0(w02);
            rrVar.a.m(rrVar.g1);
        } else if (i10 == rrVar.f1) {
            boolean z16 = !rrVar.t1;
            rrVar.t1 = z16;
            ((org.telegram.ui.Cells.r8) view).setChecked(z16);
            AndroidUtilities.updateVisibleRows(rrVar.c);
            lr w03 = rrVar.w0();
            rrVar.B0();
            rrVar.A0(w03);
            rrVar.a.m(rrVar.g1);
        } else if (i10 == rrVar.k0) {
            boolean z17 = !rrVar.v1;
            rrVar.v1 = z17;
            ((org.telegram.ui.Cells.r8) view).setChecked(z17);
            AndroidUtilities.updateVisibleRows(rrVar.c);
            lr w04 = rrVar.w0();
            rrVar.B0();
            rrVar.A0(w04);
            rrVar.a.m(rrVar.k0);
        } else if (z14) {
            if (rrVar.p0(i10)) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                if (i10 == rrVar.S) {
                    rrVar.B.send_photos = !r15.send_photos;
                } else if (i10 == rrVar.T) {
                    rrVar.B.send_videos = !r14.send_videos;
                } else if (i10 == rrVar.U) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = rrVar.B;
                    boolean z18 = !tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights2.send_inline = z18;
                    tL_chatBannedRights2.send_gifs = z18;
                    tL_chatBannedRights2.send_games = z18;
                    tL_chatBannedRights2.send_stickers = z18;
                } else if (i10 == rrVar.V) {
                    rrVar.B.send_audios = !r14.send_audios;
                } else if (i10 == rrVar.W) {
                    rrVar.B.send_docs = !r14.send_docs;
                } else if (i10 == rrVar.X) {
                    rrVar.B.send_voices = !r14.send_voices;
                } else if (i10 == rrVar.Y) {
                    rrVar.B.send_roundvideos = !r14.send_roundvideos;
                } else if (i10 == rrVar.Z) {
                    if (rrVar.B.send_plain && (m9 = rrVar.d.m(rrVar.Q)) != null) {
                        AndroidUtilities.shakeViewSpring(m9);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        rrVar.B.embed_links = !r14.embed_links;
                    }
                } else if (i10 == rrVar.a0) {
                    rrVar.B.send_polls = !r14.send_polls;
                } else if (i10 == rrVar.h0) {
                    rrVar.B.send_reactions = !r14.send_reactions;
                }
                y1Var.c(!y1Var.b(), true);
                AndroidUtilities.updateVisibleRows(rrVar.c);
                lr w05 = rrVar.w0();
                rrVar.B0();
                rrVar.A0(w05);
            } else if (i10 == rrVar.N0) {
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                boolean z19 = !q8Var.d.h;
                rrVar.o1 = z19;
                q8Var.setChecked(z19);
                AndroidUtilities.updateVisibleRows(rrVar.c);
                lr w06 = rrVar.w0();
                rrVar.B0();
                rrVar.A0(w06);
            } else {
                if (i10 == rrVar.w0) {
                    if (i13 == 0 || i13 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", rrVar.K);
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle.putInt("selectType", i13 == 0 ? 2 : 3);
                        rr rrVar2 = new rr(bundle);
                        rrVar2.x0(rrVar.s);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = rrVar.B;
                        if (tL_chatBannedRights3 != null) {
                            rrVar2.B = tL_chatBannedRights3;
                        }
                        rrVar2.j1 = new fr(rrVar);
                        rrVar.presentFragment(rrVar2);
                        return;
                    }
                    if (i13 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", rrVar.K);
                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle2.putInt("selectType", 1);
                        rr rrVar3 = new rr(bundle2);
                        rrVar3.j1 = new gr(rrVar);
                        rrVar3.x0(rrVar.s);
                        rrVar.presentFragment(rrVar3);
                        return;
                    }
                    if (i13 == 2) {
                        Bundle i16 = android.support.v4.media.a.i("addToGroup", true);
                        i16.putLong(z13 ? "channelId" : "chatId", rrVar.r.id);
                        a70 a70Var = new a70(i16);
                        a70Var.F = rrVar.s;
                        if (hVar2 != null && hVar2.m() != 0) {
                            hVar = hVar2;
                        }
                        a70Var.G = hVar;
                        a70Var.x = new ir(rrVar, a70Var);
                        rrVar.presentFragment(a70Var);
                        return;
                    }
                    return;
                }
                if (i10 == rrVar.s0) {
                    rrVar.presentFragment(new ub(rrVar.r));
                    return;
                }
                if (i10 == rrVar.u0) {
                    final org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    TLRPC.ChatFull chatFull3 = rrVar.s;
                    if (chatFull3 != null && !chatFull3.antispam && rrVar.l0() < rrVar.getMessagesController().telegramAntispamGroupSizeMin) {
                        org.telegram.ui.Components.qc.a0(rrVar).Q(R.raw.msg_antispam, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelAntiSpamForbidden", rrVar.getMessagesController().telegramAntispamGroupSizeMin, new Object[0]))).j();
                        return;
                    }
                    if (rrVar.s == null || !ChatObject.canUserDoAdminAction(rrVar.r, 13) || rrVar.t0) {
                        return;
                    }
                    rrVar.t0 = true;
                    final boolean z20 = rrVar.s.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = rrVar.getMessagesController().getInputChannel(rrVar.K);
                    TLRPC.ChatFull chatFull4 = rrVar.s;
                    boolean z21 = !chatFull4.antispam;
                    chatFull4.antispam = z21;
                    tL_channels_toggleAntiSpam.enabled = z21;
                    n8Var.setChecked(z21);
                    n8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(rrVar.r, 13) && ((chatFull2 = rrVar.s) == null || chatFull2.antispam || rrVar.l0() >= rrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    rrVar.getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(rrVar) { // from class: org.telegram.ui.pq
                        public final /* synthetic */ rr b;

                        {
                            this.b = rrVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    final rr rrVar4 = this.b;
                                    if (tLObject3 != null) {
                                        rrVar4.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        rrVar4.getMessagesController().putChatFull(rrVar4.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 0;
                                        final org.telegram.ui.Cells.n8 n8Var2 = n8Var;
                                        final boolean z22 = z20;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i17) {
                                                    case 0:
                                                        rr rrVar5 = rrVar4;
                                                        if (rrVar5.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = rrVar5.s;
                                                            boolean z23 = z22;
                                                            chatFull7.antispam = z23;
                                                            org.telegram.ui.Cells.n8 n8Var3 = n8Var2;
                                                            n8Var3.setChecked(z23);
                                                            n8Var3.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(rrVar5.r, 13) || ((chatFull5 = rrVar5.s) != null && chatFull5.antispam && rrVar5.l0() < rrVar5.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.qc.a0(rrVar5).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        rr rrVar6 = rrVar4;
                                                        if (rrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = rrVar6.s;
                                                            boolean z24 = z22;
                                                            chatFull8.participants_hidden = z24;
                                                            org.telegram.ui.Cells.n8 n8Var4 = n8Var2;
                                                            n8Var4.setChecked(z24);
                                                            n8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(rrVar6.r, 2) || ((chatFull6 = rrVar6.s) != null && chatFull6.participants_hidden && rrVar6.l0() < rrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.qc.a0(rrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    rrVar4.t0 = false;
                                    break;
                                default:
                                    final rr rrVar5 = this.b;
                                    if (tLObject3 != null) {
                                        rrVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        rrVar5.getMessagesController().putChatFull(rrVar5.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i18 = 1;
                                        final org.telegram.ui.Cells.n8 n8Var3 = n8Var;
                                        final boolean z23 = z20;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i18) {
                                                    case 0:
                                                        rr rrVar52 = rrVar5;
                                                        if (rrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = rrVar52.s;
                                                            boolean z232 = z23;
                                                            chatFull7.antispam = z232;
                                                            org.telegram.ui.Cells.n8 n8Var32 = n8Var3;
                                                            n8Var32.setChecked(z232);
                                                            n8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(rrVar52.r, 13) || ((chatFull5 = rrVar52.s) != null && chatFull5.antispam && rrVar52.l0() < rrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.qc.a0(rrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        rr rrVar6 = rrVar5;
                                                        if (rrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = rrVar6.s;
                                                            boolean z24 = z23;
                                                            chatFull8.participants_hidden = z24;
                                                            org.telegram.ui.Cells.n8 n8Var4 = n8Var3;
                                                            n8Var4.setChecked(z24);
                                                            n8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(rrVar6.r, 2) || ((chatFull6 = rrVar6.s) != null && chatFull6.participants_hidden && rrVar6.l0() < rrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.qc.a0(rrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    rrVar5.F0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 == rrVar.G0) {
                    final org.telegram.ui.Cells.n8 n8Var2 = (org.telegram.ui.Cells.n8) view;
                    if (rrVar.l0() < rrVar.getMessagesController().hiddenMembersGroupSizeMin) {
                        org.telegram.ui.Components.qc.a0(rrVar).Q(R.raw.contacts_sync_off, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelHiddenMembersForbidden", rrVar.getMessagesController().hiddenMembersGroupSizeMin, new Object[0]))).j();
                        return;
                    }
                    if (rrVar.s == null || !ChatObject.canUserDoAdminAction(rrVar.r, 2) || rrVar.F0) {
                        return;
                    }
                    rrVar.F0 = true;
                    final boolean z22 = rrVar.s.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = rrVar.getMessagesController().getInputChannel(rrVar.K);
                    TLRPC.ChatFull chatFull5 = rrVar.s;
                    boolean z23 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z23;
                    tL_channels_toggleParticipantsHidden.enabled = z23;
                    n8Var2.setChecked(z23);
                    Switch checkBox = n8Var2.getCheckBox();
                    if (!ChatObject.canUserDoAdminAction(rrVar.r, 2) || ((chatFull = rrVar.s) != null && !chatFull.participants_hidden && rrVar.l0() < rrVar.getMessagesController().hiddenMembersGroupSizeMin)) {
                        i14 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i14);
                    rrVar.getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(rrVar) { // from class: org.telegram.ui.pq
                        public final /* synthetic */ rr b;

                        {
                            this.b = rrVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i15) {
                                case 0:
                                    final rr rrVar4 = this.b;
                                    if (tLObject3 != null) {
                                        rrVar4.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        rrVar4.getMessagesController().putChatFull(rrVar4.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 0;
                                        final org.telegram.ui.Cells.n8 n8Var22 = n8Var2;
                                        final boolean z222 = z22;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i17) {
                                                    case 0:
                                                        rr rrVar52 = rrVar4;
                                                        if (rrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = rrVar52.s;
                                                            boolean z232 = z222;
                                                            chatFull7.antispam = z232;
                                                            org.telegram.ui.Cells.n8 n8Var32 = n8Var22;
                                                            n8Var32.setChecked(z232);
                                                            n8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(rrVar52.r, 13) || ((chatFull52 = rrVar52.s) != null && chatFull52.antispam && rrVar52.l0() < rrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.qc.a0(rrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        rr rrVar6 = rrVar4;
                                                        if (rrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = rrVar6.s;
                                                            boolean z24 = z222;
                                                            chatFull8.participants_hidden = z24;
                                                            org.telegram.ui.Cells.n8 n8Var4 = n8Var22;
                                                            n8Var4.setChecked(z24);
                                                            n8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(rrVar6.r, 2) || ((chatFull6 = rrVar6.s) != null && chatFull6.participants_hidden && rrVar6.l0() < rrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.qc.a0(rrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    rrVar4.t0 = false;
                                    break;
                                default:
                                    final rr rrVar5 = this.b;
                                    if (tLObject3 != null) {
                                        rrVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        rrVar5.getMessagesController().putChatFull(rrVar5.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i18 = 1;
                                        final org.telegram.ui.Cells.n8 n8Var3 = n8Var2;
                                        final boolean z232 = z22;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i18) {
                                                    case 0:
                                                        rr rrVar52 = rrVar5;
                                                        if (rrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = rrVar52.s;
                                                            boolean z2322 = z232;
                                                            chatFull7.antispam = z2322;
                                                            org.telegram.ui.Cells.n8 n8Var32 = n8Var3;
                                                            n8Var32.setChecked(z2322);
                                                            n8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(rrVar52.r, 13) || ((chatFull52 = rrVar52.s) != null && chatFull52.antispam && rrVar52.l0() < rrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.qc.a0(rrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        rr rrVar6 = rrVar5;
                                                        if (rrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = rrVar6.s;
                                                            boolean z24 = z232;
                                                            chatFull8.participants_hidden = z24;
                                                            org.telegram.ui.Cells.n8 n8Var4 = n8Var3;
                                                            n8Var4.setChecked(z24);
                                                            n8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(rrVar6.r, 2) || ((chatFull6 = rrVar6.s) != null && chatFull6.participants_hidden && rrVar6.l0() < rrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.qc.a0(rrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    rrVar5.F0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 == rrVar.I0) {
                    if (rrVar.r == null) {
                        return;
                    }
                    final org.telegram.ui.Cells.n8 n8Var3 = (org.telegram.ui.Cells.n8) view;
                    final boolean b10 = n8Var3.b();
                    n8Var3.setChecked(!n8Var3.b());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = MessagesController.getInputPeer(rrVar.r);
                    TLRPC.Chat chat = rrVar.r;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = rrVar.r.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights4;
                    tL_chatBannedRights4.edit_rank = !n8Var3.b();
                    rrVar.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.qq
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.Updates updates = (TLRPC.Updates) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            rr rrVar4 = rr.this;
                            if (updates != null) {
                                rrVar4.getMessagesController().processUpdates(updates, false);
                                return;
                            }
                            rrVar4.getClass();
                            if (tL_error != null) {
                                n8Var3.setChecked(b10);
                                org.telegram.ui.Components.qc.a0(rrVar4).d0(tL_error, false);
                            }
                        }
                    });
                } else {
                    if (i10 == rrVar.y0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", rrVar.K);
                        bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        rr rrVar4 = new rr(bundle3);
                        rrVar4.x0(rrVar.s);
                        rrVar.presentFragment(rrVar4);
                        return;
                    }
                    if (i10 == rrVar.q0) {
                        rrVar.showDialog(new jr(rrVar, rrVar.getParentActivity(), rrVar));
                    } else {
                        if (i10 == rrVar.x0) {
                            if (rrVar.s != null) {
                                rh0 rh0Var = new rh0(rrVar.K, 0L, 0);
                                TLRPC.ChatFull chatFull6 = rrVar.s;
                                rh0Var.g0(chatFull6, chatFull6.exported_invite);
                                rrVar.presentFragment(rh0Var);
                                return;
                            }
                            return;
                        }
                        if ((i10 > rrVar.P && i10 <= Math.max(rrVar.i0, rrVar.d0)) || i10 == rrVar.j0) {
                            org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                            boolean isEnabled = q8Var2.isEnabled();
                            Switch r42 = q8Var2.d;
                            if (isEnabled) {
                                if (r42.C != null) {
                                    if (ChatObject.isPublic(rrVar.r) && (i10 == rrVar.f0 || i10 == rrVar.d0)) {
                                        org.telegram.messenger.y3.s(R.string.EditCantEditPermissionsPublic, org.telegram.ui.Components.qc.a0(rrVar), null);
                                        return;
                                    } else if (ChatObject.isDiscussionGroup(rrVar.currentAccount, rrVar.K) && (i10 == rrVar.f0 || i10 == rrVar.d0)) {
                                        org.telegram.messenger.y3.s(R.string.EditCantEditPermissionsDiscussion, org.telegram.ui.Components.qc.a0(rrVar), null);
                                        return;
                                    } else {
                                        org.telegram.ui.Components.qc.a0(rrVar).t(LocaleController.getString("EditCantEditPermissions", R.string.EditCantEditPermissions), null).j();
                                        return;
                                    }
                                }
                                if (i10 == rrVar.R) {
                                    lr w07 = rrVar.w0();
                                    rrVar.i1 = !rrVar.i1;
                                    AndroidUtilities.updateVisibleRows(rrVar.c);
                                    rrVar.A0(w07);
                                    return;
                                }
                                q8Var2.setChecked(!r42.h);
                                if (i10 == rrVar.d0) {
                                    rrVar.B.change_info = !r0.change_info;
                                    return;
                                }
                                if (i10 == rrVar.j0) {
                                    rrVar.B.manage_linked_peers = !r0.manage_linked_peers;
                                    return;
                                }
                                if (i10 == rrVar.e0) {
                                    rrVar.B.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i10 == rrVar.i0) {
                                    rrVar.B.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i10 == rrVar.f0) {
                                    rrVar.B.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i10 == rrVar.g0) {
                                    rrVar.B.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i10 == rrVar.Q) {
                                    rrVar.B.send_plain = !r1.send_plain;
                                    int i17 = rrVar.Z;
                                    if (i17 >= 0) {
                                        rrVar.a.m(i17);
                                    }
                                    int i18 = rrVar.R;
                                    if (i18 >= 0) {
                                        rrVar.a.m(i18);
                                    }
                                    lr w08 = rrVar.w0();
                                    rrVar.B0();
                                    rrVar.A0(w08);
                                    return;
                                }
                                if (i10 == rrVar.R) {
                                    lr w09 = rrVar.w0();
                                    rrVar.i1 = !rrVar.i1;
                                    AndroidUtilities.updateVisibleRows(rrVar.c);
                                    rrVar.A0(w09);
                                    return;
                                }
                                if (i10 == rrVar.b0) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = rrVar.B;
                                    boolean z24 = !tL_chatBannedRights5.send_stickers;
                                    tL_chatBannedRights5.send_inline = z24;
                                    tL_chatBannedRights5.send_gifs = z24;
                                    tL_chatBannedRights5.send_games = z24;
                                    tL_chatBannedRights5.send_stickers = z24;
                                    return;
                                }
                                if (i10 == rrVar.c0) {
                                    rrVar.B.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i10 == rrVar.a0) {
                                        rrVar.B.send_polls = !r0.send_polls;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
                if (z14) {
                    TLObject E = rrVar.e.E(i10);
                    if (E instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) E;
                        rrVar.getMessagesController().putUser(user, false);
                        long j13 = user.id;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= 3) {
                                tLObject2 = null;
                                break;
                            }
                            tLObject2 = (TLObject) (i19 == 0 ? hVar2 : i19 == 1 ? rrVar.I : hVar).f(j13);
                            if (tLObject2 != null) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                        E = tLObject2;
                        j10 = j13;
                    } else if ((E instanceof TLRPC.ChannelParticipant) || (E instanceof TLRPC.ChatParticipant)) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        E = null;
                    }
                    if (E instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                        j11 = MessageObject.getPeerId(channelParticipant.peer);
                        boolean z25 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights6 = channelParticipant.banned_rights;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = channelParticipant.admin_rights;
                        z4 = z13;
                        tL_chatBannedRights = tL_chatBannedRights6;
                        str = channelParticipant.rank;
                        tLObject = E;
                        z10 = z25;
                        tL_chatAdminRights = tL_chatAdminRights3;
                    } else if (E instanceof TLRPC.ChatParticipant) {
                        long j14 = ((TLRPC.ChatParticipant) E).user_id;
                        z4 = z13;
                        str = "";
                        tL_chatBannedRights = null;
                        tLObject = E;
                        z10 = rrVar.r.creator;
                        tL_chatAdminRights = null;
                        j11 = j14;
                    } else {
                        z4 = z13;
                        str = "";
                        tL_chatBannedRights = null;
                        j11 = j10;
                        tL_chatAdminRights = null;
                        tLObject = E;
                        if (E != null) {
                            z10 = false;
                        }
                        z10 = true;
                    }
                    if (j11 == 0) {
                    }
                } else {
                    TLObject E2 = rrVar.a.E(i10);
                    if (E2 instanceof TLRPC.User) {
                        z4 = z13;
                        str = "";
                        tL_chatBannedRights = null;
                        j11 = ((TLRPC.User) E2).id;
                        tL_chatAdminRights = null;
                        tLObject = E2;
                        z10 = true;
                        if (j11 == 0) {
                            return;
                        }
                        if (i12 != 0) {
                            int i20 = 1;
                            if (i12 != 3 && i12 != 1) {
                                if (ChatObject.isChannel(rrVar.r)) {
                                    rrVar.getMessagesController().deleteParticipantFromChat(rrVar.K, rrVar.getMessagesController().getUser(Long.valueOf(j11)));
                                    kr krVar = rrVar.j1;
                                    if (krVar != null) {
                                        krVar.d(j11);
                                    }
                                    rrVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            if (i12 == 1) {
                                j12 = j11;
                                str2 = str;
                            } else {
                                if (!z10) {
                                    j12 = j11;
                                    str2 = str;
                                    z12 = z10;
                                    i20 = 1;
                                    rrVar.t0(j12, tLObject, tL_chatAdminRights, tL_chatBannedRights, str2, z12, i12 != i20 ? 0 : 1, i12 != i20 || i12 == 3);
                                    return;
                                }
                                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                                    TLRPC.User user2 = rrVar.getMessagesController().getUser(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rrVar.getParentActivity());
                                    String string = LocaleController.getString("AppName", R.string.AppName);
                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                    d2Var.O = string;
                                    d2Var.Q = LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new rq(rrVar, user2, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z10));
                                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                    rrVar.showDialog(d2Var);
                                    return;
                                }
                                j12 = j11;
                                str2 = str;
                                i20 = 1;
                            }
                            z12 = z10;
                            rrVar.t0(j12, tLObject, tL_chatAdminRights, tL_chatBannedRights, str2, z12, i12 != i20 ? 0 : 1, i12 != i20 || i12 == 3);
                            return;
                        }
                        long j15 = j11;
                        boolean z26 = z10;
                        if (i13 == 1) {
                            canBlockUsers = j15 != rrVar.getUserConfig().getClientUserId() && (rrVar.r.creator || z26);
                        } else {
                            if (i13 != 0 && i13 != 3) {
                                z11 = false;
                                if (i13 != 0 || ((i13 != 1 && z4) || (i13 == 2 && i12 == 0))) {
                                    if (j15 != rrVar.getUserConfig().getClientUserId()) {
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    if (j11 > 0) {
                                        bundle4.putLong("user_id", j15);
                                    } else {
                                        bundle4.putLong("chat_id", -j15);
                                    }
                                    rrVar.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                if (tL_chatBannedRights == null) {
                                    tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                                    i11 = 1;
                                    tL_chatBannedRights.view_messages = true;
                                    tL_chatBannedRights.send_stickers = true;
                                    tL_chatBannedRights.send_media = true;
                                    tL_chatBannedRights.send_photos = true;
                                    tL_chatBannedRights.send_videos = true;
                                    tL_chatBannedRights.send_roundvideos = true;
                                    tL_chatBannedRights.send_audios = true;
                                    tL_chatBannedRights.send_voices = true;
                                    tL_chatBannedRights.send_docs = true;
                                    tL_chatBannedRights.embed_links = true;
                                    tL_chatBannedRights.send_plain = true;
                                    tL_chatBannedRights.send_messages = true;
                                    tL_chatBannedRights.send_games = true;
                                    tL_chatBannedRights.send_inline = true;
                                    tL_chatBannedRights.send_gifs = true;
                                    tL_chatBannedRights.pin_messages = true;
                                    tL_chatBannedRights.edit_rank = true;
                                    tL_chatBannedRights.send_reactions = true;
                                    tL_chatBannedRights.send_polls = true;
                                    tL_chatBannedRights.invite_users = true;
                                    tL_chatBannedRights.manage_topics = true;
                                    tL_chatBannedRights.change_info = true;
                                } else {
                                    i11 = 1;
                                }
                                lq lqVar = new lq(j15, rrVar.K, tL_chatAdminRights, rrVar.B, tL_chatBannedRights, str, i13 == i11 ? 0 : 1, z11, tLObject == null, null);
                                lqVar.U0 = new wq(rrVar, tLObject);
                                rrVar.presentFragment(lqVar);
                                return;
                            }
                            canBlockUsers = ChatObject.canBlockUsers(rrVar.r);
                        }
                        z11 = canBlockUsers;
                        if (i13 != 0) {
                        }
                        if (j15 != rrVar.getUserConfig().getClientUserId()) {
                        }
                    } else {
                        if (E2 instanceof TLRPC.ChannelParticipant) {
                            TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) E2;
                            j11 = MessageObject.getPeerId(channelParticipant2.peer);
                            TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                            String str3 = channelParticipant2.rank;
                            boolean z27 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                            if ((E2 instanceof TLRPC.TL_channelParticipantCreator) && (tL_chatAdminRights4 = ((TLRPC.TL_channelParticipantCreator) E2).admin_rights) == null) {
                                tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                                tL_chatAdminRights4.manage_ranks = true;
                                tL_chatAdminRights4.add_admins = true;
                                tL_chatAdminRights4.pin_messages = true;
                                tL_chatAdminRights4.manage_topics = true;
                                tL_chatAdminRights4.invite_users = true;
                                tL_chatAdminRights4.ban_users = true;
                                tL_chatAdminRights4.delete_messages = true;
                                tL_chatAdminRights4.edit_messages = true;
                                tL_chatAdminRights4.post_messages = true;
                                tL_chatAdminRights4.change_info = true;
                                if (!z13) {
                                    tL_chatAdminRights4.manage_call = true;
                                }
                            }
                            boolean z28 = z27;
                            tLObject = E2;
                            z10 = z28;
                            tL_chatBannedRights = tL_chatBannedRights7;
                            tL_chatAdminRights = tL_chatAdminRights4;
                            z4 = z13;
                            str = str3;
                        } else {
                            if (E2 instanceof TLRPC.ChatParticipant) {
                                long j16 = ((TLRPC.ChatParticipant) E2).user_id;
                                boolean z29 = rrVar.r.creator;
                                if (E2 instanceof TLRPC.TL_chatParticipantCreator) {
                                    tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
                                    tL_chatAdminRights2.manage_ranks = true;
                                    tL_chatAdminRights2.add_admins = true;
                                    tL_chatAdminRights2.pin_messages = true;
                                    tL_chatAdminRights2.manage_topics = true;
                                    tL_chatAdminRights2.invite_users = true;
                                    tL_chatAdminRights2.ban_users = true;
                                    tL_chatAdminRights2.delete_messages = true;
                                    tL_chatAdminRights2.edit_messages = true;
                                    tL_chatAdminRights2.post_messages = true;
                                    tL_chatAdminRights2.change_info = true;
                                    if (!z13) {
                                        tL_chatAdminRights2.manage_call = true;
                                    }
                                } else {
                                    tL_chatAdminRights2 = null;
                                }
                                str = "";
                                tLObject = E2;
                                z10 = z29;
                                tL_chatAdminRights = tL_chatAdminRights2;
                                j11 = j16;
                                z4 = z13;
                            } else {
                                tLObject = E2;
                                z4 = z13;
                                str = "";
                                j11 = 0;
                                z10 = false;
                                tL_chatAdminRights = null;
                            }
                            tL_chatBannedRights = null;
                        }
                        if (j11 == 0) {
                        }
                    }
                }
            }
        }
        if (z14) {
        }
    }

    public static void W(rr rrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i10 = 0;
        while (i10 < 3) {
            TLObject tLObject = (TLObject) (i10 == 0 ? rrVar.J : i10 == 1 ? rrVar.I : rrVar.H).f(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i10++;
        }
    }

    public static void c0(rr rrVar, TLRPC.User user) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z4;
        boolean z10;
        a0.h hVar2 = rrVar.H;
        ArrayList arrayList2 = rrVar.C;
        UndoView undoView = rrVar.n;
        long j10 = -rrVar.K;
        boolean z11 = rrVar.v;
        undoView.m(j10, user, z11 ? 9 : 10);
        rrVar.r.creator = false;
        int i10 = 0;
        boolean z12 = false;
        while (i10 < 3) {
            boolean z13 = true;
            if (i10 == 0) {
                hVar = rrVar.J;
                arrayList = rrVar.E;
            } else if (i10 == 1) {
                hVar = rrVar.I;
                arrayList = rrVar.D;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.id;
                tL_peerUser.user_id = j11;
                hVar.k(tL_channelParticipantCreator, j11);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z12 = true;
                z4 = true;
            } else {
                z4 = false;
            }
            long clientUserId = rrVar.getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) hVar.f(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                z10 = z12;
                tL_channelParticipantAdmin.date = (int) (System.currentTimeMillis() / 1000);
                TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                tL_chatAdminRights.add_admins = true;
                tL_chatAdminRights.manage_ranks = true;
                tL_chatAdminRights.pin_messages = true;
                tL_chatAdminRights.manage_topics = true;
                tL_chatAdminRights.invite_users = true;
                tL_chatAdminRights.ban_users = true;
                tL_chatAdminRights.delete_messages = true;
                tL_chatAdminRights.edit_messages = true;
                tL_chatAdminRights.post_messages = true;
                tL_chatAdminRights.change_info = true;
                if (!z11) {
                    tL_chatAdminRights.manage_call = true;
                }
                hVar.k(tL_channelParticipantAdmin, clientUserId);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z10 = z12;
                z13 = z4;
            }
            if (z13) {
                Collections.sort(arrayList, new nh.e4(16));
            }
            i10++;
            z12 = z10;
        }
        if (!z12) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new nh.e4(15));
            rrVar.B0();
        }
        rrVar.a.l();
        kr krVar = rrVar.j1;
        if (krVar != null) {
            krVar.a(user);
        }
    }

    public static int j0(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    public static int m0(int i10) {
        if (i10 == 1) {
            return 5;
        }
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 3) {
            return 30;
        }
        if (i10 == 4) {
            return 60;
        }
        if (i10 == 5) {
            return 300;
        }
        return i10 == 6 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i10 == 7 ? 3600 : 0;
    }

    public static int n0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i10 = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i10++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i10++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i10++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i10++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i10++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i10++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i10++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i10++;
        }
        return !tL_chatBannedRights.send_reactions ? i10 + 1 : i10;
    }

    public final void A0(lr lrVar) {
        View view;
        if (this.a == null) {
            B0();
            return;
        }
        B0();
        lrVar.f(lrVar.d);
        f2.q.c(lrVar, true).b(this.a);
        lh.e1 e1Var = this.c;
        if (e1Var == null || this.d == null || e1Var.getChildCount() <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = -1;
        while (true) {
            if (i10 >= this.c.getChildCount()) {
                view = null;
                break;
            }
            i11 = RecyclerView.R(this.c.getChildAt(i10));
            if (i11 != -1) {
                view = this.c.getChildAt(i10);
                break;
            }
            i10++;
        }
        if (view != null) {
            this.d.h1(i11, view.getTop() - this.c.getPaddingTop());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bd, code lost:
    
        if (org.telegram.messenger.ChatObject.canBlockUsers(r1) != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0() {
        boolean z4;
        boolean z10;
        TLRPC.ChatFull chatFull;
        boolean z11;
        TLRPC.ChatFull chatFull2;
        boolean z12;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.K));
        this.r = chat2;
        if (chat2 == null) {
            return;
        }
        this.s0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.r0 = -1;
        this.q0 = -1;
        this.p0 = -1;
        this.C0 = -1;
        this.Y0 = -1;
        this.e1 = -1;
        this.f1 = -1;
        this.g1 = -1;
        this.Z0 = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.b0 = -1;
        this.a0 = -1;
        this.c0 = -1;
        this.e0 = -1;
        this.j0 = -1;
        this.i0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.d0 = -1;
        this.y0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.P0 = -1;
        this.X0 = -1;
        this.c1 = -1;
        this.d1 = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.a1 = 0;
        ArrayList arrayList = this.C;
        boolean z13 = this.w;
        int i10 = 1;
        int i11 = this.L;
        if (i11 == 3) {
            int i12 = this.a1;
            int i13 = i12 + 1;
            this.a1 = i13;
            this.P = i12;
            if (!z13) {
                this.Q = i13;
                int i14 = i12 + 3;
                this.a1 = i14;
                this.R = i12 + 2;
                if (this.i1) {
                    this.S = i14;
                    this.T = i12 + 4;
                    this.U = i12 + 5;
                    this.V = i12 + 6;
                    this.W = i12 + 7;
                    this.X = i12 + 8;
                    this.Y = i12 + 9;
                    this.Z = i12 + 10;
                    this.a0 = i12 + 11;
                    this.a1 = i12 + 13;
                    this.h0 = i12 + 12;
                }
                int i15 = this.a1;
                this.e0 = i15;
                this.f0 = i15 + 1;
                this.a1 = i15 + 3;
                this.g0 = i15 + 2;
            }
            int i16 = this.a1;
            int i17 = i16 + 1;
            this.a1 = i17;
            this.d0 = i16;
            if (z13) {
                this.a1 = i16 + 2;
                this.j0 = i17;
            } else if (this.x) {
                this.a1 = i16 + 2;
                this.i0 = i17;
            }
            if (ChatObject.isChannel(this.r)) {
                TLRPC.Chat chat3 = this.r;
                if (chat3.creator && chat3.megagroup && !chat3.gigagroup && !z13) {
                    int i18 = chat3.participants_count;
                    TLRPC.ChatFull chatFull4 = this.s;
                    if (Math.max(i18, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().maxMegagroupCount - 1000) {
                        int i19 = this.a1;
                        this.E0 = i19;
                        this.p0 = i19 + 1;
                        this.q0 = i19 + 2;
                        this.a1 = i19 + 4;
                        this.r0 = i19 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.s;
            if (chatFull5 != null && chatFull5.paid_messages_available && !z13 && ChatObject.canUserDoAction(this.r, 2) && (ChatObject.isChannel(this.r) || ((chat = this.r) != null && chat.creator))) {
                if (this.E0 == -1) {
                    int i20 = this.a1;
                    this.a1 = i20 + 1;
                    this.E0 = i20;
                }
                int i21 = this.a1;
                this.k0 = i21;
                int i22 = i21 + 2;
                this.a1 = i22;
                this.l0 = i21 + 1;
                if (this.v1) {
                    this.m0 = i22;
                    this.n0 = i21 + 3;
                    this.a1 = i21 + 5;
                    this.o0 = i21 + 4;
                }
            }
            if (!z13) {
                if (ChatObject.isChannel(this.r) || !this.r.creator) {
                    TLRPC.Chat chat4 = this.r;
                    if (chat4.megagroup) {
                        if (!chat4.gigagroup) {
                        }
                    }
                }
                if (this.E0 == -1) {
                    int i23 = this.a1;
                    this.a1 = i23 + 1;
                    this.E0 = i23;
                }
                int i24 = this.a1;
                this.K0 = i24;
                this.L0 = i24 + 1;
                this.a1 = i24 + 3;
                this.M0 = i24 + 2;
            }
            if (q0() && !z13) {
                if (this.E0 == -1) {
                    int i25 = this.a1;
                    this.a1 = i25 + 1;
                    this.E0 = i25;
                }
                int i26 = this.a1;
                int i27 = i26 + 1;
                this.a1 = i27;
                this.N0 = i26;
                if (this.o1) {
                    this.a1 = i26 + 2;
                    this.P0 = i27;
                }
                int i28 = this.a1;
                this.a1 = i28 + 1;
                this.O0 = i28;
            }
            if (ChatObject.isChannel(this.r) && !z13) {
                if (this.E0 == -1) {
                    int i29 = this.a1;
                    this.a1 = i29 + 1;
                    this.E0 = i29;
                }
                int i30 = this.a1;
                this.a1 = i30 + 1;
                this.y0 = i30;
            }
            if ((this.M0 == -1 && this.p0 == -1) || this.y0 != -1) {
                int i31 = this.a1;
                this.a1 = i31 + 1;
                this.D0 = i31;
            }
            if (ChatObject.canBlockUsers(this.r) && !z13 && l0() > 1 && (ChatObject.isChannel(this.r) || this.r.creator)) {
                int i32 = this.a1;
                this.a1 = i32 + 1;
                this.w0 = i32;
            }
            if (this.N && !(z12 = this.O)) {
                if (z12 || (chatFull3 = this.s) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i33 = this.a1;
                this.a1 = i33 + 1;
                this.c1 = i33;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i34 = this.a1;
                this.B0 = i34;
                int size = arrayList.size() + i34;
                this.a1 = size;
                this.C0 = size;
            }
            if (this.w0 == -1 && this.B0 == -1) {
                return;
            }
            int i35 = this.a1;
            this.a1 = i35 + 1;
            this.z0 = i35;
            return;
        }
        if (i11 == 0) {
            if (ChatObject.canBlockUsers(this.r)) {
                int i36 = this.a1;
                this.a1 = i36 + 1;
                this.w0 = i36;
                if (!arrayList.isEmpty() || (this.N && !this.O && (chatFull2 = this.s) != null && chatFull2.kicked_count > 0)) {
                    int i37 = this.a1;
                    this.a1 = i37 + 1;
                    this.Y0 = i37;
                }
            }
            if (this.N && !(z11 = this.O)) {
                if (z11) {
                    return;
                }
                int i38 = this.a1;
                this.A0 = i38;
                this.a1 = i38 + 2;
                this.c1 = i38 + 1;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i39 = this.a1;
                int i40 = i39 + 1;
                this.a1 = i40;
                this.A0 = i39;
                this.B0 = i40;
                int size2 = arrayList.size() + i40;
                this.a1 = size2;
                this.C0 = size2;
            }
            if (this.B0 == -1) {
                int i41 = this.a1;
                this.a1 = i41 + 1;
                this.Z0 = i41;
                return;
            } else if (this.Y0 == -1) {
                int i42 = this.a1;
                this.a1 = i42 + 1;
                this.Y0 = i42;
                return;
            } else {
                int i43 = this.a1;
                this.a1 = i43 + 1;
                this.z0 = i43;
                return;
            }
        }
        if (i11 == 1) {
            boolean z14 = this.M;
            if (!z14 && ChatObject.isChannel(this.r)) {
                TLRPC.Chat chat5 = this.r;
                if (chat5.megagroup && !chat5.gigagroup && ((chatFull = this.s) == null || chatFull.participants_count <= 200 || (!this.v && chatFull.can_set_stickers))) {
                    if (ChatObject.hasAdminRights(chat5)) {
                        int i44 = this.a1;
                        this.u0 = i44;
                        this.a1 = i44 + 2;
                        this.v0 = i44 + 1;
                    } else {
                        int i45 = this.a1;
                        this.a1 = i45 + 1;
                        this.z0 = i45;
                    }
                }
            }
            if (ChatObject.canAddAdmins(this.r)) {
                int i46 = this.a1;
                this.a1 = i46 + 1;
                this.w0 = i46;
            }
            if (!this.N || (z10 = this.O)) {
                if (!arrayList.isEmpty()) {
                    int i47 = this.a1;
                    this.B0 = i47;
                    int size3 = arrayList.size() + i47;
                    this.a1 = size3;
                    this.C0 = size3;
                }
                if (!z13) {
                    int i48 = this.a1;
                    this.a1 = i48 + 1;
                    this.Y0 = i48;
                }
            } else if (!z10) {
                int i49 = this.a1;
                this.a1 = i49 + 1;
                this.c1 = i49;
            }
            if (z14 || !ChatObject.isChannelAndNotMegaGroup(this.r) || !ChatObject.hasAdminRights(this.r) || z13) {
                return;
            }
            int i50 = this.a1;
            int i51 = i50 + 1;
            this.a1 = i51;
            this.e1 = i50;
            if (!this.s1) {
                this.a1 = i50 + 2;
                this.g1 = i51;
                return;
            } else {
                this.f1 = i51;
                this.a1 = i50 + 3;
                this.g1 = i50 + 2;
                return;
            }
        }
        if (i11 == 2) {
            if (ChatObject.isChannel(this.r) && !ChatObject.isChannelAndNotMegaGroup(this.r) && !this.k1) {
                int i52 = this.a1;
                this.G0 = i52;
                this.a1 = i52 + 2;
                this.H0 = i52 + 1;
            }
            int i53 = this.b1;
            if (i53 == 0 && ChatObject.canAddUsers(this.r)) {
                int i54 = this.a1;
                this.a1 = i54 + 1;
                this.w0 = i54;
            }
            if (i53 == 0 && ChatObject.canUserDoAdminAction(this.r, 3)) {
                int i55 = this.a1;
                this.a1 = i55 + 1;
                this.x0 = i55;
            }
            if (this.N && !(z4 = this.O)) {
                if (z4) {
                    return;
                }
                if (i53 == 0) {
                    int i56 = this.a1;
                    this.a1 = i56 + 1;
                    this.d1 = i56;
                }
                int i57 = this.a1;
                this.a1 = i57 + 1;
                this.c1 = i57;
                return;
            }
            ArrayList arrayList2 = this.E;
            if (!arrayList2.isEmpty()) {
                int i58 = this.a1;
                int i59 = i58 + 1;
                this.a1 = i59;
                this.Q0 = i58;
                this.R0 = i59;
                int size4 = arrayList2.size() + i59;
                this.a1 = size4;
                this.S0 = size4;
                r1 = 1;
            }
            ArrayList arrayList3 = this.D;
            if (arrayList3.isEmpty()) {
                i10 = r1;
            } else {
                int i60 = this.a1;
                int i61 = i60 + 1;
                this.a1 = i61;
                this.T0 = i60;
                this.U0 = i61;
                int size5 = arrayList3.size() + i61;
                this.a1 = size5;
                this.V0 = size5;
            }
            if (!arrayList.isEmpty()) {
                if (i10 != 0) {
                    int i62 = this.a1;
                    this.a1 = i62 + 1;
                    this.W0 = i62;
                }
                int i63 = this.a1;
                this.B0 = i63;
                int size6 = arrayList.size() + i63;
                this.a1 = size6;
                this.C0 = size6;
            }
            int i64 = this.a1;
            if (i64 != 0) {
                this.a1 = i64 + 1;
                this.Y0 = i64;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.l1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.b1;
        int i11 = this.L;
        if (i11 == 3) {
            this.actionBar.setTitle(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions));
        } else if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAdministrators));
        } else if (i11 == 2) {
            if (i10 == 0) {
                if (this.v) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSubscribers));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("ChannelMembers", R.string.ChannelMembers));
                }
            } else if (i10 == 1) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin));
            } else if (i10 == 2) {
                this.actionBar.setTitle(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser));
            } else if (i10 == 3) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddException", R.string.ChannelAddException));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 22));
        if (i10 != 0 || i11 == 2 || i11 == 0 || i11 == 3) {
            this.e = new qr(this, context);
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new hb(this, 2);
            this.f = a2;
            if (i11 == 0 && !this.O) {
                a2.setVisibility(8);
            }
            if (i11 == 3) {
                this.f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.r) && !this.r.creator) {
                this.f.setVisibility(8);
            }
            if (i11 == 3) {
                this.h = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else if (i11 == 1 && ChatObject.isChannelAndNotMegaGroup(this.r) && ChatObject.hasAdminRights(this.r)) {
            this.h = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.z1 = u00Var;
        u00Var.setViewType(6);
        org.telegram.ui.Components.u00 u00Var2 = this.z1;
        u00Var2.w = false;
        u00Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.u00 u00Var3 = this.z1;
        int i12 = org.telegram.ui.ActionBar.j6.G8;
        int i13 = org.telegram.ui.ActionBar.j6.i6;
        u00Var3.f(i12, i13, i13);
        frameLayout3.addView(this.z1, k7.b6.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.A1 = radialProgressView;
        frameLayout3.addView(radialProgressView, k7.b6.e(-2, -2, 17));
        this.z1.setVisibility(8);
        this.A1.setVisibility(8);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, frameLayout3, 1, null);
        this.b = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.b.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        frameLayout2.addView(this.b, k7.b6.c(-1.0f, -1));
        this.b.addView(frameLayout3, 0);
        lh.e1 e1Var = new lh.e1(this, context, 7);
        this.c = e1Var;
        e1Var.o1();
        lh.e1 e1Var2 = this.c;
        dr drVar = new dr(this);
        this.d = drVar;
        e1Var2.setLayoutManager(drVar);
        er erVar = new er(this);
        erVar.n(420L);
        erVar.o(org.telegram.ui.Components.mr.h);
        erVar.C = false;
        erVar.m = false;
        this.c.setItemAnimator(erVar);
        lh.e1 e1Var3 = this.c;
        e1Var3.V1 = true;
        e1Var3.W1 = 0;
        nr nrVar = new nr(this, context);
        this.a = nrVar;
        e1Var3.setAdapter(nrVar);
        this.c.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.c, k7.b6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.c);
        this.c.setOnItemClickListener(new oq(this, 3));
        this.c.setOnItemLongClickListener(new oq(this, 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new n3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.n = undoView;
        frameLayout2.addView(undoView, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        B0();
        this.c.setEmptyView(this.b);
        lh.e1 e1Var4 = this.c;
        e1Var4.V1 = false;
        e1Var4.W1 = 0;
        if (this.k1) {
            this.f.z(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.K)) {
                org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                if (e5Var == null || e5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        if (chatFull.id == this.K) {
            if (booleanValue && ChatObject.isChannel(this.r)) {
                return;
            }
            boolean z4 = this.s != null;
            this.s = chatFull;
            if (!z4) {
                int k02 = k0();
                this.n1 = k02;
                this.m1 = k02;
                int i12 = this.s.boosts_unrestrict;
                this.o1 = i12 > 0;
                this.p1 = i12;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.K));
                long j10 = chat == null ? 0L : chat.send_paid_messages_stars;
                boolean z10 = j10 > 0;
                this.v1 = z10;
                this.u1 = z10;
                if (j10 <= 0) {
                    j10 = 10;
                }
                long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.x1 = clamp;
                this.w1 = clamp;
            }
            AndroidUtilities.runOnUIThread(new mq(this, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r0 && r4.t1) != r4.r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g0(boolean z4) {
        if (!this.M) {
            if (ChatObject.getBannedRightsString(this.B).equals(this.y) && this.n1 == this.m1 && !o0() && (r0 = this.s1) == this.q1) {
            }
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.v) {
                    alertDialog$Builder.a.Q = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder.a.Q = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new oq(this, 1));
                alertDialog$Builder.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new oq(this, 2));
                showDialog(alertDialog$Builder.a);
            }
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.z9.class, org.telegram.ui.Components.uv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        int i10 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.t3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, fVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i13 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Components.zw0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Components.zw0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b.e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z4, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10;
        int i11;
        final rr rrVar;
        final long j11;
        boolean z11;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z12;
        String str2;
        int i12;
        if (tLObject == null || (i10 = this.b1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            j10 = MessageObject.getPeerId(channelParticipant.peer);
            boolean z13 = channelParticipant.can_edit;
            tL_chatBannedRights = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i11 = channelParticipant.date;
            str = channelParticipant.rank;
            z10 = z13;
        } else {
            tL_chatBannedRights = null;
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j10 = chatParticipant.user_id;
                i11 = chatParticipant.date;
                str = "";
                z10 = ChatObject.canAddAdmins(this.r);
                tL_chatAdminRights = null;
            } else {
                j10 = 0;
                str = null;
                tL_chatAdminRights = null;
                z10 = false;
                i11 = 0;
            }
        }
        if (j10 == 0 || j10 == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z14 = this.v;
        int i13 = this.L;
        if (i13 != 2) {
            final long j13 = j10;
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
            org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(this, view);
            if (i13 == 3 && ChatObject.canBlockUsers(this.r)) {
                rrVar = this;
                H.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new kh.g1(rrVar, j13, tL_chatBannedRights, str, tLObject, 9), false);
                final int i14 = 0;
                H.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(rrVar) { // from class: org.telegram.ui.nq
                    public final /* synthetic */ rr b;

                    {
                        this.b = rrVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                this.b.i0(j13);
                                break;
                            case 1:
                                rr rrVar2 = this.b;
                                long j14 = j13;
                                rrVar2.i0(j14);
                                rrVar2.getMessagesController().addUserToChat(rrVar2.K, rrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, rrVar2, null);
                                break;
                            case 2:
                                this.b.i0(j13);
                                break;
                            default:
                                rr rrVar3 = this.b;
                                MessagesController messagesController = rrVar3.getMessagesController();
                                long j15 = rrVar3.K;
                                MessagesController messagesController2 = rrVar3.getMessagesController();
                                long j16 = j13;
                                messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !rrVar3.v, rrVar3, false, false, null, null);
                                rrVar3.v0(j16);
                                break;
                        }
                    }
                }, true);
            } else {
                String str3 = str;
                rrVar = this;
                if (i13 == 0 && ChatObject.canBlockUsers(rrVar.r)) {
                    if (ChatObject.canAddUsers(rrVar.r) && j10 > 0 && !ChatObject.isCommunity(rrVar.r)) {
                        final int i15 = 1;
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(z14 ? R.string.ChannelAddToChannel : R.string.ChannelAddToGroup), new Runnable(rrVar) { // from class: org.telegram.ui.nq
                            public final /* synthetic */ rr b;

                            {
                                this.b = rrVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        this.b.i0(j13);
                                        break;
                                    case 1:
                                        rr rrVar2 = this.b;
                                        long j14 = j13;
                                        rrVar2.i0(j14);
                                        rrVar2.getMessagesController().addUserToChat(rrVar2.K, rrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, rrVar2, null);
                                        break;
                                    case 2:
                                        this.b.i0(j13);
                                        break;
                                    default:
                                        rr rrVar3 = this.b;
                                        MessagesController messagesController = rrVar3.getMessagesController();
                                        long j15 = rrVar3.K;
                                        MessagesController messagesController2 = rrVar3.getMessagesController();
                                        long j16 = j13;
                                        messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !rrVar3.v, rrVar3, false, false, null, null);
                                        rrVar3.v0(j16);
                                        break;
                                }
                            }
                        }, false);
                    }
                    final int i16 = 2;
                    H.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(rrVar) { // from class: org.telegram.ui.nq
                        public final /* synthetic */ rr b;

                        {
                            this.b = rrVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    this.b.i0(j13);
                                    break;
                                case 1:
                                    rr rrVar2 = this.b;
                                    long j14 = j13;
                                    rrVar2.i0(j14);
                                    rrVar2.getMessagesController().addUserToChat(rrVar2.K, rrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, rrVar2, null);
                                    break;
                                case 2:
                                    this.b.i0(j13);
                                    break;
                                default:
                                    rr rrVar3 = this.b;
                                    MessagesController messagesController = rrVar3.getMessagesController();
                                    long j15 = rrVar3.K;
                                    MessagesController messagesController2 = rrVar3.getMessagesController();
                                    long j16 = j13;
                                    messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !rrVar3.v, rrVar3, false, false, null, null);
                                    rrVar3.v0(j16);
                                    break;
                            }
                        }
                    }, true);
                } else if (i13 == 1 && ChatObject.canAddAdmins(rrVar.r) && z10) {
                    if (rrVar.r.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                        j11 = j13;
                        H.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new kh.g1(rrVar, j11, tL_chatAdminRights2, str3, tLObject, 10), false);
                    } else {
                        j11 = j13;
                    }
                    final int i17 = 3;
                    H.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(rrVar) { // from class: org.telegram.ui.nq
                        public final /* synthetic */ rr b;

                        {
                            this.b = rrVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    this.b.i0(j11);
                                    break;
                                case 1:
                                    rr rrVar2 = this.b;
                                    long j14 = j11;
                                    rrVar2.i0(j14);
                                    rrVar2.getMessagesController().addUserToChat(rrVar2.K, rrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, rrVar2, null);
                                    break;
                                case 2:
                                    this.b.i0(j11);
                                    break;
                                default:
                                    rr rrVar3 = this.b;
                                    MessagesController messagesController = rrVar3.getMessagesController();
                                    long j15 = rrVar3.K;
                                    MessagesController messagesController2 = rrVar3.getMessagesController();
                                    long j16 = j11;
                                    messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !rrVar3.v, rrVar3, false, false, null, null);
                                    rrVar3.v0(j16);
                                    break;
                            }
                        }
                    }, true);
                }
            }
            H.W(rrVar.c.U0(view, false));
            H.S = 190;
            boolean z15 = H.x() > 0;
            if (z4 || !z15) {
                return z15;
            }
            H.Z();
            return true;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        boolean z16 = ChatObject.canAddAdmins(this.r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z10);
        boolean z17 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
        if ((z17 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) && !z10) {
            z11 = z16;
            j12 = j10;
            tL_chatBannedRights2 = tL_chatBannedRights;
            z12 = false;
        } else {
            z11 = z16;
            j12 = j10;
            tL_chatBannedRights2 = tL_chatBannedRights;
            z12 = true;
        }
        boolean z18 = z17 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
        boolean z19 = ChatObject.canBlockUsers(this.r) && z12 && !z14 && ChatObject.isChannel(this.r) && !this.r.gigagroup;
        if (i10 == 0) {
            z11 = (!UserObject.isDeleted(user)) & z11;
        }
        boolean z20 = z11 || (ChatObject.canBlockUsers(this.r) && z12);
        if (z4 || !z20) {
            return z20;
        }
        boolean z21 = z19;
        vq vqVar = new vq(this, j12, i11, tLObject, tL_chatAdminRights, tL_chatBannedRights2, str, z12);
        long j14 = j12;
        org.telegram.ui.Components.p70 H2 = org.telegram.ui.Components.p70.H(this, view);
        H2.W(this.c.U0(view, false));
        H2.l(R.drawable.msg_admins, LocaleController.getString(z18 ? R.string.EditAdminRights : R.string.SetAsAdmin), new bj(vqVar, 11), z11);
        H2.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new kh((Object) this, (Object) tLObject, (Object) user, (Object) vqVar, 4), z21);
        boolean z22 = ChatObject.canBlockUsers(this.r) && z12;
        int i18 = R.drawable.msg_remove;
        if (z14) {
            str2 = "ChannelRemoveUser";
            i12 = R.string.ChannelRemoveUser;
        } else {
            str2 = "KickFromGroup";
            i12 = R.string.KickFromGroup;
        }
        H2.m(z22, i18, LocaleController.getString(str2, i12), true, new i5.v(this, user, j14, 17));
        H2.S = 190;
        H2.Z();
        return true;
    }

    public final void i0(long j10) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.K);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new org.telegram.messenger.a(), new f5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.K);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new o(this, 4));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull == null) {
            return 0;
        }
        int i10 = chatFull.slowmode_seconds;
        if (i10 == 5) {
            return 1;
        }
        if (i10 == 10) {
            return 2;
        }
        if (i10 == 30) {
            return 3;
        }
        if (i10 == 60) {
            return 4;
        }
        if (i10 == 300) {
            return 5;
        }
        if (i10 == 900) {
            return 6;
        }
        return i10 == 3600 ? 7 : 0;
    }

    public final int l0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull == null) {
            return 0;
        }
        int i10 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i10 : Math.max(i10, arrayList.size());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        boolean z4 = this.o1 && q0();
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.p1;
            if (i10 != i11 || ((z4 && i11 == 0) || (!z4 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        return g0(z4);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        r0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
        this.n.setTranslationY(-i13);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        nr nrVar = this.a;
        if (nrVar != null) {
            nrVar.l();
        }
        org.telegram.ui.Components.zw0 zw0Var = this.b;
        if (zw0Var != null) {
            zw0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            this.y1 = true;
        }
        if (z4 && !z10 && this.k1) {
            this.f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f.getSearchField());
            this.f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        return i10 == this.S || i10 == this.T || i10 == this.U || i10 == this.V || i10 == this.W || i10 == this.X || i10 == this.h0 || i10 == this.Y || i10 == this.Z || i10 == this.a0;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.r;
        if (!chat.megagroup || chat.gigagroup || !ChatObject.canUserDoAdminAction(chat, 13)) {
            return false;
        }
        if (this.m1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.B;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    public final void r0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.N) {
            return;
        }
        int i10 = 0;
        this.G = false;
        this.F = false;
        boolean z4 = this.w;
        int i11 = this.L;
        a0.h hVar = this.I;
        ArrayList arrayList = this.D;
        a0.h hVar2 = this.J;
        ArrayList arrayList2 = this.E;
        a0.h hVar3 = this.H;
        ArrayList arrayList3 = this.C;
        if (z4 && i11 == 2) {
            this.N = false;
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            hVar3.b();
            hVar2.b();
            hVar.b();
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = ContactsController.getInstance(this.currentAccount).usersSectionsDict;
            ArrayList<String> arrayList4 = ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                String str = arrayList4.get(i12);
                i12++;
                ArrayList<TLRPC.TL_contact> arrayList5 = hashMap.get(str);
                int size2 = arrayList5.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.TL_contact tL_contact = arrayList5.get(i13);
                    i13++;
                    arrayList3.add(getMessagesController().getUser(Long.valueOf(tL_contact.user_id)));
                }
            }
            B0();
            nr nrVar = this.a;
            if (nrVar != null) {
                nrVar.l();
                return;
            }
            return;
        }
        if (ChatObject.isChannel(this.r)) {
            this.N = true;
            org.telegram.ui.Components.zw0 zw0Var = this.b;
            if (zw0Var != null) {
                zw0Var.e(true, false);
            }
            nr nrVar2 = this.a;
            if (nrVar2 != null) {
                nrVar2.l();
            }
            ArrayList s02 = s0();
            ArrayList arrayList6 = new ArrayList();
            tq tqVar = new tq(this, s02, arrayList6, 0);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i14 = 0; i14 < s02.size(); i14++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i14), new kf.i0(arrayList6, i14, atomicInteger, s02, tqVar, 6)), this.classGuid);
            }
            return;
        }
        this.N = false;
        arrayList3.clear();
        arrayList.clear();
        arrayList2.clear();
        hVar3.b();
        hVar2.b();
        hVar.b();
        if (i11 == 1) {
            TLRPC.ChatFull chatFull2 = this.s;
            if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                int size3 = chatParticipants.participants.size();
                while (i10 < size3) {
                    TLRPC.ChatParticipant chatParticipant = this.s.participants.participants.get(i10);
                    if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        arrayList3.add(chatParticipant);
                    }
                    hVar3.k(chatParticipant, chatParticipant.user_id);
                    i10++;
                }
            }
        } else if (i11 == 2 && (chatFull = this.s) != null && chatFull.participants != null) {
            long j10 = getUserConfig().clientUserId;
            int size4 = this.s.participants.participants.size();
            while (i10 < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.s.participants.participants.get(i10);
                int i15 = this.b1;
                if (i15 == 0 || chatParticipant2.user_id != j10) {
                    if (i15 == 1) {
                        if (getContactsController().isContact(chatParticipant2.user_id)) {
                            arrayList2.add(chatParticipant2);
                            hVar2.k(chatParticipant2, chatParticipant2.user_id);
                        } else if (!UserObject.isDeleted(getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id)))) {
                            arrayList3.add(chatParticipant2);
                            hVar3.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    } else if (getContactsController().isContact(chatParticipant2.user_id)) {
                        arrayList2.add(chatParticipant2);
                        hVar2.k(chatParticipant2, chatParticipant2.user_id);
                    } else {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id));
                        if (user == null || !user.bot) {
                            arrayList3.add(chatParticipant2);
                            hVar3.k(chatParticipant2, chatParticipant2.user_id);
                        } else {
                            arrayList.add(chatParticipant2);
                            hVar.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    }
                }
                i10++;
            }
        }
        nr nrVar3 = this.a;
        if (nrVar3 != null) {
            nrVar3.l();
        }
        B0();
        nr nrVar4 = this.a;
        if (nrVar4 != null) {
            nrVar4.l();
        }
    }

    public final ArrayList s0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.K);
        int i10 = this.L;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.b1 == 1) {
                if (this.G) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                } else {
                    this.h1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.G = true;
                    arrayList.addAll(s0());
                }
            } else if (!this.G) {
                this.h1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.G = true;
                arrayList.addAll(s0());
            } else if (this.F) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.F = true;
                arrayList.addAll(s0());
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void t0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, int i10, boolean z10) {
        lq lqVar = new lq(j10, this.K, tL_chatAdminRights, this.B, tL_chatBannedRights, str, i10, z4, tLObject == null, null);
        lqVar.U0 = new ar(this, tLObject, j10, z10);
        presentFragment(lqVar, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0150, code lost:
    
        if ((r0 && r13.t1) != r13.r1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0() {
        TLRPC.ChatFull chatFull;
        boolean z4 = false;
        int i10 = this.L;
        if (i10 == 3) {
            TLRPC.Chat chat = this.r;
            if (chat.creator && !ChatObject.isChannel(chat) && ((this.m1 != this.n1 || this.v1) && this.s != null)) {
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.K, this, new oq(this, 0));
                return;
            }
            if (!ChatObject.getBannedRightsString(this.B).equals(this.y)) {
                getMessagesController().setDefaultBannedRole(this.K, this.B, ChatObject.isChannel(this.r), this);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.K));
                if (chat2 != null) {
                    chat2.default_banned_rights = this.B;
                }
            }
            int i11 = this.m1;
            if (i11 != this.n1 && (chatFull = this.s) != null) {
                chatFull.slowmode_seconds = m0(i11);
                this.s.flags |= 131072;
                getMessagesController().setChannelSlowMode(this.K, this.s.slowmode_seconds);
            }
            boolean z10 = this.v1;
            if (z10 != this.u1 || (z10 && this.w1 != this.x1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().getInputChannel(this.K);
                updatepaidmessagesprice.send_paid_messages_stars = this.v1 ? this.x1 : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new nh.p5(7));
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.K));
                if (chat3 != null) {
                    if (this.v1) {
                        chat3.flags2 |= 16384;
                        chat3.send_paid_messages_stars = this.x1;
                    } else {
                        chat3.flags2 &= -16385;
                        chat3.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat3, true);
                }
            }
            if (o0()) {
                boolean z11 = this.o1 && q0();
                if (z11 && this.p1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.K, 1);
                } else if (z11 || this.p1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.K, this.p1);
                } else {
                    getMessagesController().setBoostsToUnblockRestrictions(this.K, 0);
                }
            }
        } else if (i10 == 1) {
            boolean z12 = this.s1;
            if (z12 == this.q1) {
            }
            MessagesController messagesController = getMessagesController();
            long j10 = this.K;
            boolean z13 = this.s1;
            if (z13 && this.t1) {
                z4 = true;
            }
            messagesController.toggleChannelSignatures(j10, z13, z4);
        }
        finishFragment();
    }

    public final void v0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        lr w02 = w0();
        boolean z4 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = this.J;
                arrayList = this.E;
            } else if (i10 == 1) {
                hVar = this.I;
                arrayList = this.D;
            } else {
                hVar = this.H;
                arrayList = this.C;
            }
            TLObject tLObject = (TLObject) hVar.f(j10);
            if (tLObject != null) {
                hVar.l(j10);
                arrayList.remove(tLObject);
                if (this.L == 0 && (chatFull = this.s) != null) {
                    chatFull.kicked_count--;
                }
                z4 = true;
            }
        }
        if (z4) {
            A0(w02);
        }
        f2.o0 adapter = this.c.getAdapter();
        qr qrVar = this.e;
        if (adapter == qrVar) {
            tf.j1 j1Var = qrVar.h;
            Object f10 = j1Var.f.f(j10);
            if (f10 != null) {
                j1Var.e.remove(f10);
            }
            Object f11 = j1Var.h.f(j10);
            if (f11 != null) {
                j1Var.g.remove(f11);
            }
            Object f12 = qrVar.e.f(j10);
            if (f12 != null) {
                qrVar.d.remove(f12);
            }
            qrVar.l();
        }
    }

    public final lr w0() {
        lr lrVar = new lr(this);
        lrVar.b = this.a1;
        lrVar.i = this.U0;
        lrVar.j = this.V0;
        lrVar.l.clear();
        lrVar.l.addAll(this.D);
        lrVar.h = this.S0;
        lrVar.g = this.R0;
        lrVar.m.clear();
        lrVar.m.addAll(this.E);
        lrVar.e = this.B0;
        lrVar.f = this.C0;
        lrVar.k.clear();
        lrVar.k.addAll(this.C);
        lrVar.f(lrVar.c);
        return lrVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        this.s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.n1 = k02;
            this.m1 = k02;
            int i10 = this.s.boosts_unrestrict;
            this.o1 = i10 > 0;
            this.p1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.K));
            long j10 = chat == null ? 0L : chat.send_paid_messages_stars;
            boolean z4 = j10 > 0;
            this.v1 = z4;
            this.u1 = z4;
            if (j10 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.x1 = clamp;
            this.w1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (this.isPaused || !this.y1) {
            return;
        }
        if (this.c.getAdapter() == this.a && this.O) {
            return;
        }
        View view = null;
        for (int i11 = 0; i11 < this.c.getChildCount(); i11++) {
            View childAt = this.c.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Components.u00) {
                view = childAt;
            }
        }
        if (view != null) {
            this.c.removeView(view);
            i10--;
        }
        this.c.getViewTreeObserver().addOnPreDrawListener(new xq(this, (org.telegram.ui.Components.u00) view, i10, 0));
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new uq(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
