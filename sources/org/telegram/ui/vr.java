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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class vr extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public long A1;
    public int B0;
    public boolean B1;
    public int C0;
    public org.telegram.ui.Components.t00 C1;
    public int D0;
    public RadialProgressView D1;
    public TLRPC.TL_chatBannedRights E;
    public int E0;
    public final ArrayList F;
    public int F0;
    public final ArrayList G;
    public int G0;
    public final ArrayList H;
    public int H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public int J0;
    public final a0.i K;
    public int K0;
    public final a0.i L;
    public int L0;
    public final a0.i M;
    public int M0;
    public long N;
    public int N0;
    public final int O;
    public int O0;
    public final boolean P;
    public int P0;
    public boolean Q;
    public int Q0;
    public boolean R;
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
    public rr a;
    public int a0;
    public int a1;
    public org.telegram.ui.Components.xw0 b;
    public int b0;
    public int b1;
    public bi.o0 c;
    public int c0;
    public int c1;
    public hg.j0 d;
    public int d0;
    public int d1;
    public ur e;
    public int e0;
    public final int e1;
    public org.telegram.ui.ActionBar.v0 f;
    public int f0;
    public int f1;
    public int g0;
    public int g1;
    public org.telegram.ui.ActionBar.v0 h;
    public int h0;
    public int h1;
    public int i0;
    public int i1;
    public int j0;
    public int j1;
    public int k0;
    public int k1;
    public int l0;
    public boolean l1;
    public int m0;
    public or m1;
    public UndoView n;
    public int n0;
    public final boolean n1;
    public int o0;
    public boolean o1;
    public int p0;
    public int p1;
    public int q0;
    public int q1;
    public TLRPC.Chat r;
    public int r0;
    public boolean r1;
    public TLRPC.ChatFull s;
    public int s0;
    public int s1;
    public int t0;
    public final boolean t1;
    public int u0;
    public final boolean u1;
    public final boolean v;
    public int v0;
    public boolean v1;
    public final boolean w;
    public boolean w0;
    public boolean w1;
    public final boolean x;
    public int x0;
    public boolean x1;
    public final String y;
    public int y0;
    public boolean y1;
    public int z0;
    public long z1;

    public vr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.E = new TLRPC.TL_chatBannedRights();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.K = new a0.i();
        this.L = new a0.i();
        this.M = new a0.i();
        this.z1 = 10L;
        this.A1 = 10L;
        this.N = this.arguments.getLong("chat_id");
        this.O = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR);
        this.P = this.arguments.getBoolean("transfer");
        this.n1 = this.arguments.getBoolean("open_search");
        this.e1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
        this.r = chat;
        boolean z10 = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z11 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z11;
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
            boolean z12 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z12;
            boolean z13 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z13;
            boolean z14 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z14;
            boolean z15 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z15;
            boolean z16 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z16;
            boolean z17 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z17;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z11 && z17 && z16 && z15 && z14 && z13 && z12) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.y = ChatObject.getBannedRightsString(this.E);
        boolean isCommunity = ChatObject.isCommunity(this.r);
        this.w = isCommunity;
        if (ChatObject.isChannel(this.r) && !this.r.megagroup && !isCommunity) {
            z10 = true;
        }
        this.v = z10;
        this.x = ChatObject.isForum(this.r);
        TLRPC.Chat chat2 = this.r;
        if (chat2 != null) {
            boolean z18 = chat2.signatures;
            this.v1 = z18;
            this.t1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.w1 = z19;
            this.u1 = z19;
        }
    }

    public static /* synthetic */ void U(vr vrVar, long j3) {
        if (j3 != 0) {
            vrVar.N = j3;
            vrVar.r = MessagesController.getInstance(vrVar.currentAccount).getChat(Long.valueOf(j3));
            vrVar.u0();
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
    public static void V(final vr vrVar, View view, int i10) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View m10;
        long j3;
        boolean z10;
        String str;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLObject tLObject;
        boolean z11;
        TLObject tLObject2;
        boolean canBlockUsers;
        boolean z12;
        int i11;
        long j11;
        String str2;
        boolean z13;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i12 = vrVar.e1;
        a0.i iVar = vrVar.K;
        a0.i iVar2 = vrVar.M;
        boolean z14 = vrVar.v;
        int i13 = vrVar.O;
        final int i14 = 0;
        i14 = 0;
        i14 = 0;
        final int i15 = 1;
        boolean z15 = vrVar.c.getAdapter() == vrVar.a;
        if (i10 == vrVar.h1) {
            boolean z16 = !vrVar.v1;
            vrVar.v1 = z16;
            ((org.telegram.ui.Cells.w8) view).setChecked(z16);
            AndroidUtilities.updateVisibleRows(vrVar.c);
            pr w02 = vrVar.w0();
            vrVar.B0();
            vrVar.A0(w02);
            vrVar.a.m(vrVar.j1);
        } else if (i10 == vrVar.i1) {
            boolean z17 = !vrVar.w1;
            vrVar.w1 = z17;
            ((org.telegram.ui.Cells.w8) view).setChecked(z17);
            AndroidUtilities.updateVisibleRows(vrVar.c);
            pr w03 = vrVar.w0();
            vrVar.B0();
            vrVar.A0(w03);
            vrVar.a.m(vrVar.j1);
        } else if (i10 == vrVar.n0) {
            boolean z18 = !vrVar.y1;
            vrVar.y1 = z18;
            ((org.telegram.ui.Cells.w8) view).setChecked(z18);
            AndroidUtilities.updateVisibleRows(vrVar.c);
            pr w04 = vrVar.w0();
            vrVar.B0();
            vrVar.A0(w04);
            vrVar.a.m(vrVar.n0);
        } else if (z15) {
            if (vrVar.p0(i10)) {
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                if (i10 == vrVar.V) {
                    vrVar.E.send_photos = !r15.send_photos;
                } else if (i10 == vrVar.W) {
                    vrVar.E.send_videos = !r14.send_videos;
                } else if (i10 == vrVar.X) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = vrVar.E;
                    boolean z19 = !tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights2.send_inline = z19;
                    tL_chatBannedRights2.send_gifs = z19;
                    tL_chatBannedRights2.send_games = z19;
                    tL_chatBannedRights2.send_stickers = z19;
                } else if (i10 == vrVar.Y) {
                    vrVar.E.send_audios = !r14.send_audios;
                } else if (i10 == vrVar.Z) {
                    vrVar.E.send_docs = !r14.send_docs;
                } else if (i10 == vrVar.a0) {
                    vrVar.E.send_voices = !r14.send_voices;
                } else if (i10 == vrVar.b0) {
                    vrVar.E.send_roundvideos = !r14.send_roundvideos;
                } else if (i10 == vrVar.c0) {
                    if (vrVar.E.send_plain && (m10 = vrVar.d.m(vrVar.T)) != null) {
                        AndroidUtilities.shakeViewSpring(m10);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        vrVar.E.embed_links = !r14.embed_links;
                    }
                } else if (i10 == vrVar.d0) {
                    vrVar.E.send_polls = !r14.send_polls;
                } else if (i10 == vrVar.k0) {
                    vrVar.E.send_reactions = !r14.send_reactions;
                }
                z1Var.c(!z1Var.b(), true);
                AndroidUtilities.updateVisibleRows(vrVar.c);
                pr w05 = vrVar.w0();
                vrVar.B0();
                vrVar.A0(w05);
            } else if (i10 == vrVar.Q0) {
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                boolean z20 = !v8Var.d.h;
                vrVar.r1 = z20;
                v8Var.setChecked(z20);
                AndroidUtilities.updateVisibleRows(vrVar.c);
                pr w06 = vrVar.w0();
                vrVar.B0();
                vrVar.A0(w06);
            } else {
                if (i10 == vrVar.z0) {
                    if (i13 == 0 || i13 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", vrVar.N);
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle.putInt("selectType", i13 == 0 ? 2 : 3);
                        vr vrVar2 = new vr(bundle);
                        vrVar2.x0(vrVar.s);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = vrVar.E;
                        if (tL_chatBannedRights3 != null) {
                            vrVar2.E = tL_chatBannedRights3;
                        }
                        vrVar2.m1 = new jr(vrVar);
                        vrVar.presentFragment(vrVar2);
                        return;
                    }
                    if (i13 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", vrVar.N);
                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle2.putInt("selectType", 1);
                        vr vrVar3 = new vr(bundle2);
                        vrVar3.m1 = new kr(vrVar);
                        vrVar3.x0(vrVar.s);
                        vrVar.presentFragment(vrVar3);
                        return;
                    }
                    if (i13 == 2) {
                        Bundle i16 = a4.a.i("addToGroup", true);
                        i16.putLong(z14 ? "channelId" : "chatId", vrVar.r.id);
                        f70 f70Var = new f70(i16);
                        f70Var.I = vrVar.s;
                        if (iVar2 != null && iVar2.m() != 0) {
                            iVar = iVar2;
                        }
                        f70Var.J = iVar;
                        f70Var.x = new mr(vrVar, f70Var);
                        vrVar.presentFragment(f70Var);
                        return;
                    }
                    return;
                }
                if (i10 == vrVar.v0) {
                    vrVar.presentFragment(new ub(vrVar.r));
                    return;
                }
                if (i10 == vrVar.x0) {
                    final org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    TLRPC.ChatFull chatFull3 = vrVar.s;
                    if (chatFull3 != null && !chatFull3.antispam && vrVar.l0() < vrVar.getMessagesController().telegramAntispamGroupSizeMin) {
                        org.telegram.ui.Components.yc.a0(vrVar).Q(R.raw.msg_antispam, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelAntiSpamForbidden", vrVar.getMessagesController().telegramAntispamGroupSizeMin, new Object[0]))).j();
                        return;
                    }
                    if (vrVar.s == null || !ChatObject.canUserDoAdminAction(vrVar.r, 13) || vrVar.w0) {
                        return;
                    }
                    vrVar.w0 = true;
                    final boolean z21 = vrVar.s.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = vrVar.getMessagesController().getInputChannel(vrVar.N);
                    TLRPC.ChatFull chatFull4 = vrVar.s;
                    boolean z22 = !chatFull4.antispam;
                    chatFull4.antispam = z22;
                    tL_channels_toggleAntiSpam.enabled = z22;
                    r8Var.setChecked(z22);
                    r8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(vrVar.r, 13) && ((chatFull2 = vrVar.s) == null || chatFull2.antispam || vrVar.l0() >= vrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    vrVar.getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(vrVar) { // from class: org.telegram.ui.uq
                        public final /* synthetic */ vr b;

                        {
                            this.b = vrVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    final vr vrVar4 = this.b;
                                    if (tLObject3 != null) {
                                        vrVar4.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        vrVar4.getMessagesController().putChatFull(vrVar4.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 0;
                                        final org.telegram.ui.Cells.r8 r8Var2 = r8Var;
                                        final boolean z23 = z21;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i17) {
                                                    case 0:
                                                        vr vrVar5 = vrVar4;
                                                        if (vrVar5.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = vrVar5.s;
                                                            boolean z24 = z23;
                                                            chatFull7.antispam = z24;
                                                            org.telegram.ui.Cells.r8 r8Var3 = r8Var2;
                                                            r8Var3.setChecked(z24);
                                                            r8Var3.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(vrVar5.r, 13) || ((chatFull5 = vrVar5.s) != null && chatFull5.antispam && vrVar5.l0() < vrVar5.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.yc.a0(vrVar5).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        vr vrVar6 = vrVar4;
                                                        if (vrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = vrVar6.s;
                                                            boolean z25 = z23;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.r8 r8Var4 = r8Var2;
                                                            r8Var4.setChecked(z25);
                                                            r8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(vrVar6.r, 2) || ((chatFull6 = vrVar6.s) != null && chatFull6.participants_hidden && vrVar6.l0() < vrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.yc.a0(vrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    vrVar4.w0 = false;
                                    break;
                                default:
                                    final vr vrVar5 = this.b;
                                    if (tLObject3 != null) {
                                        vrVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        vrVar5.getMessagesController().putChatFull(vrVar5.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i18 = 1;
                                        final org.telegram.ui.Cells.r8 r8Var3 = r8Var;
                                        final boolean z24 = z21;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i18) {
                                                    case 0:
                                                        vr vrVar52 = vrVar5;
                                                        if (vrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = vrVar52.s;
                                                            boolean z242 = z24;
                                                            chatFull7.antispam = z242;
                                                            org.telegram.ui.Cells.r8 r8Var32 = r8Var3;
                                                            r8Var32.setChecked(z242);
                                                            r8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(vrVar52.r, 13) || ((chatFull5 = vrVar52.s) != null && chatFull5.antispam && vrVar52.l0() < vrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.yc.a0(vrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        vr vrVar6 = vrVar5;
                                                        if (vrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = vrVar6.s;
                                                            boolean z25 = z24;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.r8 r8Var4 = r8Var3;
                                                            r8Var4.setChecked(z25);
                                                            r8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(vrVar6.r, 2) || ((chatFull6 = vrVar6.s) != null && chatFull6.participants_hidden && vrVar6.l0() < vrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.yc.a0(vrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    vrVar5.I0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 == vrVar.J0) {
                    final org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    if (vrVar.l0() < vrVar.getMessagesController().hiddenMembersGroupSizeMin) {
                        org.telegram.ui.Components.yc.a0(vrVar).Q(R.raw.contacts_sync_off, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelHiddenMembersForbidden", vrVar.getMessagesController().hiddenMembersGroupSizeMin, new Object[0]))).j();
                        return;
                    }
                    if (vrVar.s == null || !ChatObject.canUserDoAdminAction(vrVar.r, 2) || vrVar.I0) {
                        return;
                    }
                    vrVar.I0 = true;
                    final boolean z23 = vrVar.s.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = vrVar.getMessagesController().getInputChannel(vrVar.N);
                    TLRPC.ChatFull chatFull5 = vrVar.s;
                    boolean z24 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z24;
                    tL_channels_toggleParticipantsHidden.enabled = z24;
                    r8Var2.setChecked(z24);
                    Switch checkBox = r8Var2.getCheckBox();
                    if (!ChatObject.canUserDoAdminAction(vrVar.r, 2) || ((chatFull = vrVar.s) != null && !chatFull.participants_hidden && vrVar.l0() < vrVar.getMessagesController().hiddenMembersGroupSizeMin)) {
                        i14 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i14);
                    vrVar.getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(vrVar) { // from class: org.telegram.ui.uq
                        public final /* synthetic */ vr b;

                        {
                            this.b = vrVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i15) {
                                case 0:
                                    final vr vrVar4 = this.b;
                                    if (tLObject3 != null) {
                                        vrVar4.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        vrVar4.getMessagesController().putChatFull(vrVar4.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 0;
                                        final org.telegram.ui.Cells.r8 r8Var22 = r8Var2;
                                        final boolean z232 = z23;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i17) {
                                                    case 0:
                                                        vr vrVar52 = vrVar4;
                                                        if (vrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = vrVar52.s;
                                                            boolean z242 = z232;
                                                            chatFull7.antispam = z242;
                                                            org.telegram.ui.Cells.r8 r8Var32 = r8Var22;
                                                            r8Var32.setChecked(z242);
                                                            r8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(vrVar52.r, 13) || ((chatFull52 = vrVar52.s) != null && chatFull52.antispam && vrVar52.l0() < vrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.yc.a0(vrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        vr vrVar6 = vrVar4;
                                                        if (vrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = vrVar6.s;
                                                            boolean z25 = z232;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.r8 r8Var4 = r8Var22;
                                                            r8Var4.setChecked(z25);
                                                            r8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(vrVar6.r, 2) || ((chatFull6 = vrVar6.s) != null && chatFull6.participants_hidden && vrVar6.l0() < vrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.yc.a0(vrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    vrVar4.w0 = false;
                                    break;
                                default:
                                    final vr vrVar5 = this.b;
                                    if (tLObject3 != null) {
                                        vrVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        vrVar5.getMessagesController().putChatFull(vrVar5.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i18 = 1;
                                        final org.telegram.ui.Cells.r8 r8Var3 = r8Var2;
                                        final boolean z242 = z23;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i18) {
                                                    case 0:
                                                        vr vrVar52 = vrVar5;
                                                        if (vrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = vrVar52.s;
                                                            boolean z2422 = z242;
                                                            chatFull7.antispam = z2422;
                                                            org.telegram.ui.Cells.r8 r8Var32 = r8Var3;
                                                            r8Var32.setChecked(z2422);
                                                            r8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(vrVar52.r, 13) || ((chatFull52 = vrVar52.s) != null && chatFull52.antispam && vrVar52.l0() < vrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.yc.a0(vrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        vr vrVar6 = vrVar5;
                                                        if (vrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = vrVar6.s;
                                                            boolean z25 = z242;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.r8 r8Var4 = r8Var3;
                                                            r8Var4.setChecked(z25);
                                                            r8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(vrVar6.r, 2) || ((chatFull6 = vrVar6.s) != null && chatFull6.participants_hidden && vrVar6.l0() < vrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.yc.a0(vrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    vrVar5.I0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 == vrVar.L0) {
                    if (vrVar.r == null) {
                        return;
                    }
                    final org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view;
                    final boolean b10 = r8Var3.b();
                    r8Var3.setChecked(!r8Var3.b());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = MessagesController.getInputPeer(vrVar.r);
                    TLRPC.Chat chat = vrVar.r;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = vrVar.r.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights4;
                    tL_chatBannedRights4.edit_rank = !r8Var3.b();
                    vrVar.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.vq
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.Updates updates = (TLRPC.Updates) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            vr vrVar4 = vr.this;
                            if (updates != null) {
                                vrVar4.getMessagesController().processUpdates(updates, false);
                                return;
                            }
                            vrVar4.getClass();
                            if (tL_error != null) {
                                r8Var3.setChecked(b10);
                                org.telegram.ui.Components.yc.a0(vrVar4).d0(tL_error, false);
                            }
                        }
                    });
                } else {
                    if (i10 == vrVar.B0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", vrVar.N);
                        bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        vr vrVar4 = new vr(bundle3);
                        vrVar4.x0(vrVar.s);
                        vrVar.presentFragment(vrVar4);
                        return;
                    }
                    if (i10 == vrVar.t0) {
                        vrVar.showDialog(new nr(vrVar, vrVar.getParentActivity(), vrVar));
                    } else {
                        if (i10 == vrVar.A0) {
                            if (vrVar.s != null) {
                                yh0 yh0Var = new yh0(vrVar.N, 0L, 0);
                                TLRPC.ChatFull chatFull6 = vrVar.s;
                                yh0Var.g0(chatFull6, chatFull6.exported_invite);
                                vrVar.presentFragment(yh0Var);
                                return;
                            }
                            return;
                        }
                        if ((i10 > vrVar.S && i10 <= Math.max(vrVar.l0, vrVar.g0)) || i10 == vrVar.m0) {
                            org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                            boolean isEnabled = v8Var2.isEnabled();
                            Switch r42 = v8Var2.d;
                            if (isEnabled) {
                                if (r42.F != null) {
                                    if (ChatObject.isPublic(vrVar.r) && (i10 == vrVar.i0 || i10 == vrVar.g0)) {
                                        org.telegram.messenger.w1.p(R.string.EditCantEditPermissionsPublic, org.telegram.ui.Components.yc.a0(vrVar), null);
                                        return;
                                    } else if (ChatObject.isDiscussionGroup(vrVar.currentAccount, vrVar.N) && (i10 == vrVar.i0 || i10 == vrVar.g0)) {
                                        org.telegram.messenger.w1.p(R.string.EditCantEditPermissionsDiscussion, org.telegram.ui.Components.yc.a0(vrVar), null);
                                        return;
                                    } else {
                                        org.telegram.ui.Components.yc.a0(vrVar).t(LocaleController.getString("EditCantEditPermissions", R.string.EditCantEditPermissions), null).j();
                                        return;
                                    }
                                }
                                if (i10 == vrVar.U) {
                                    pr w07 = vrVar.w0();
                                    vrVar.l1 = !vrVar.l1;
                                    AndroidUtilities.updateVisibleRows(vrVar.c);
                                    vrVar.A0(w07);
                                    return;
                                }
                                v8Var2.setChecked(!r42.h);
                                if (i10 == vrVar.g0) {
                                    vrVar.E.change_info = !r0.change_info;
                                    return;
                                }
                                if (i10 == vrVar.m0) {
                                    vrVar.E.manage_linked_peers = !r0.manage_linked_peers;
                                    return;
                                }
                                if (i10 == vrVar.h0) {
                                    vrVar.E.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i10 == vrVar.l0) {
                                    vrVar.E.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i10 == vrVar.i0) {
                                    vrVar.E.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i10 == vrVar.j0) {
                                    vrVar.E.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i10 == vrVar.T) {
                                    vrVar.E.send_plain = !r1.send_plain;
                                    int i17 = vrVar.c0;
                                    if (i17 >= 0) {
                                        vrVar.a.m(i17);
                                    }
                                    int i18 = vrVar.U;
                                    if (i18 >= 0) {
                                        vrVar.a.m(i18);
                                    }
                                    pr w08 = vrVar.w0();
                                    vrVar.B0();
                                    vrVar.A0(w08);
                                    return;
                                }
                                if (i10 == vrVar.U) {
                                    pr w09 = vrVar.w0();
                                    vrVar.l1 = !vrVar.l1;
                                    AndroidUtilities.updateVisibleRows(vrVar.c);
                                    vrVar.A0(w09);
                                    return;
                                }
                                if (i10 == vrVar.e0) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = vrVar.E;
                                    boolean z25 = !tL_chatBannedRights5.send_stickers;
                                    tL_chatBannedRights5.send_inline = z25;
                                    tL_chatBannedRights5.send_gifs = z25;
                                    tL_chatBannedRights5.send_games = z25;
                                    tL_chatBannedRights5.send_stickers = z25;
                                    return;
                                }
                                if (i10 == vrVar.f0) {
                                    vrVar.E.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i10 == vrVar.d0) {
                                        vrVar.E.send_polls = !r0.send_polls;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
                if (z15) {
                    TLObject E = vrVar.e.E(i10);
                    if (E instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) E;
                        vrVar.getMessagesController().putUser(user, false);
                        long j12 = user.id;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= 3) {
                                tLObject2 = null;
                                break;
                            }
                            tLObject2 = (TLObject) (i19 == 0 ? iVar2 : i19 == 1 ? vrVar.L : iVar).f(j12);
                            if (tLObject2 != null) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                        E = tLObject2;
                        j3 = j12;
                    } else if ((E instanceof TLRPC.ChannelParticipant) || (E instanceof TLRPC.ChatParticipant)) {
                        j3 = 0;
                    } else {
                        j3 = 0;
                        E = null;
                    }
                    if (E instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                        j10 = MessageObject.getPeerId(channelParticipant.peer);
                        boolean z26 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights6 = channelParticipant.banned_rights;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = channelParticipant.admin_rights;
                        z10 = z14;
                        tL_chatBannedRights = tL_chatBannedRights6;
                        str = channelParticipant.rank;
                        tLObject = E;
                        z11 = z26;
                        tL_chatAdminRights = tL_chatAdminRights3;
                    } else if (E instanceof TLRPC.ChatParticipant) {
                        long j13 = ((TLRPC.ChatParticipant) E).user_id;
                        z10 = z14;
                        str = "";
                        tL_chatBannedRights = null;
                        tLObject = E;
                        z11 = vrVar.r.creator;
                        tL_chatAdminRights = null;
                        j10 = j13;
                    } else {
                        z10 = z14;
                        str = "";
                        tL_chatBannedRights = null;
                        j10 = j3;
                        tL_chatAdminRights = null;
                        tLObject = E;
                        if (E != null) {
                            z11 = false;
                        }
                        z11 = true;
                    }
                    if (j10 == 0) {
                    }
                } else {
                    TLObject E2 = vrVar.a.E(i10);
                    if (E2 instanceof TLRPC.User) {
                        z10 = z14;
                        str = "";
                        tL_chatBannedRights = null;
                        j10 = ((TLRPC.User) E2).id;
                        tL_chatAdminRights = null;
                        tLObject = E2;
                        z11 = true;
                        if (j10 == 0) {
                            return;
                        }
                        if (i12 != 0) {
                            int i20 = 1;
                            if (i12 != 3 && i12 != 1) {
                                if (ChatObject.isChannel(vrVar.r)) {
                                    vrVar.getMessagesController().deleteParticipantFromChat(vrVar.N, vrVar.getMessagesController().getUser(Long.valueOf(j10)));
                                    or orVar = vrVar.m1;
                                    if (orVar != null) {
                                        orVar.d(j10);
                                    }
                                    vrVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            if (i12 == 1) {
                                j11 = j10;
                                str2 = str;
                            } else {
                                if (!z11) {
                                    j11 = j10;
                                    str2 = str;
                                    z13 = z11;
                                    i20 = 1;
                                    vrVar.t0(j11, tLObject, tL_chatAdminRights, tL_chatBannedRights, str2, z13, i12 != i20 ? 0 : 1, i12 != i20 || i12 == 3);
                                    return;
                                }
                                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                                    TLRPC.User user2 = vrVar.getMessagesController().getUser(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vrVar.getParentActivity());
                                    String string = LocaleController.getString("AppName", R.string.AppName);
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                    b2Var.R = string;
                                    b2Var.T = LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new wq(vrVar, user2, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z11));
                                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                    vrVar.showDialog(b2Var);
                                    return;
                                }
                                j11 = j10;
                                str2 = str;
                                i20 = 1;
                            }
                            z13 = z11;
                            vrVar.t0(j11, tLObject, tL_chatAdminRights, tL_chatBannedRights, str2, z13, i12 != i20 ? 0 : 1, i12 != i20 || i12 == 3);
                            return;
                        }
                        long j14 = j10;
                        boolean z27 = z11;
                        if (i13 == 1) {
                            canBlockUsers = j14 != vrVar.getUserConfig().getClientUserId() && (vrVar.r.creator || z27);
                        } else {
                            if (i13 != 0 && i13 != 3) {
                                z12 = false;
                                if (i13 != 0 || ((i13 != 1 && z10) || (i13 == 2 && i12 == 0))) {
                                    if (j14 != vrVar.getUserConfig().getClientUserId()) {
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    if (j10 > 0) {
                                        bundle4.putLong("user_id", j14);
                                    } else {
                                        bundle4.putLong("chat_id", -j14);
                                    }
                                    vrVar.presentFragment(new ProfileActivity(bundle4, null));
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
                                qq qqVar = new qq(j14, vrVar.N, tL_chatAdminRights, vrVar.E, tL_chatBannedRights, str, i13 == i11 ? 0 : 1, z12, tLObject == null, null);
                                qqVar.X0 = new br(vrVar, tLObject);
                                vrVar.presentFragment(qqVar);
                                return;
                            }
                            canBlockUsers = ChatObject.canBlockUsers(vrVar.r);
                        }
                        z12 = canBlockUsers;
                        if (i13 != 0) {
                        }
                        if (j14 != vrVar.getUserConfig().getClientUserId()) {
                        }
                    } else {
                        if (E2 instanceof TLRPC.ChannelParticipant) {
                            TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) E2;
                            j10 = MessageObject.getPeerId(channelParticipant2.peer);
                            TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                            String str3 = channelParticipant2.rank;
                            boolean z28 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
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
                                if (!z14) {
                                    tL_chatAdminRights4.manage_call = true;
                                }
                            }
                            boolean z29 = z28;
                            tLObject = E2;
                            z11 = z29;
                            tL_chatBannedRights = tL_chatBannedRights7;
                            tL_chatAdminRights = tL_chatAdminRights4;
                            z10 = z14;
                            str = str3;
                        } else {
                            if (E2 instanceof TLRPC.ChatParticipant) {
                                long j15 = ((TLRPC.ChatParticipant) E2).user_id;
                                boolean z30 = vrVar.r.creator;
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
                                    if (!z14) {
                                        tL_chatAdminRights2.manage_call = true;
                                    }
                                } else {
                                    tL_chatAdminRights2 = null;
                                }
                                str = "";
                                tLObject = E2;
                                z11 = z30;
                                tL_chatAdminRights = tL_chatAdminRights2;
                                j10 = j15;
                                z10 = z14;
                            } else {
                                tLObject = E2;
                                z10 = z14;
                                str = "";
                                j10 = 0;
                                z11 = false;
                                tL_chatAdminRights = null;
                            }
                            tL_chatBannedRights = null;
                        }
                        if (j10 == 0) {
                        }
                    }
                }
            }
        }
        if (z15) {
        }
    }

    public static void W(vr vrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i10 = 0;
        while (i10 < 3) {
            TLObject tLObject = (TLObject) (i10 == 0 ? vrVar.M : i10 == 1 ? vrVar.L : vrVar.K).f(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i10++;
        }
    }

    public static void c0(vr vrVar, TLRPC.User user) {
        a0.i iVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.i iVar2 = vrVar.K;
        ArrayList arrayList2 = vrVar.F;
        UndoView undoView = vrVar.n;
        long j3 = -vrVar.N;
        boolean z12 = vrVar.v;
        undoView.m(j3, user, z12 ? 9 : 10);
        vrVar.r.creator = false;
        int i10 = 0;
        boolean z13 = false;
        while (i10 < 3) {
            boolean z14 = true;
            if (i10 == 0) {
                iVar = vrVar.M;
                arrayList = vrVar.H;
            } else if (i10 == 1) {
                iVar = vrVar.L;
                arrayList = vrVar.G;
            } else {
                iVar = iVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) iVar.f(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j10 = user.id;
                tL_peerUser.user_id = j10;
                iVar.k(tL_channelParticipantCreator, j10);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z13 = true;
                z10 = true;
            } else {
                z10 = false;
            }
            long clientUserId = vrVar.getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) iVar.f(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                z11 = z13;
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
                if (!z12) {
                    tL_chatAdminRights.manage_call = true;
                }
                iVar.k(tL_channelParticipantAdmin, clientUserId);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z13;
                z14 = z10;
            }
            if (z14) {
                Collections.sort(arrayList, new f6(7));
            }
            i10++;
            z13 = z11;
        }
        if (!z13) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j11 = user.id;
            tL_peerUser3.user_id = j11;
            iVar2.k(tL_channelParticipantCreator2, j11);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new f6(6));
            vrVar.B0();
        }
        vrVar.a.l();
        or orVar = vrVar.m1;
        if (orVar != null) {
            orVar.a(user);
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

    public final void A0(pr prVar) {
        View view;
        if (this.a == null) {
            B0();
            return;
        }
        B0();
        prVar.f(prVar.d);
        s4.o.c(prVar, true).b(this.a);
        bi.o0 o0Var = this.c;
        if (o0Var == null || this.d == null || o0Var.getChildCount() <= 0) {
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
        boolean z10;
        boolean z11;
        TLRPC.ChatFull chatFull;
        boolean z12;
        TLRPC.ChatFull chatFull2;
        boolean z13;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.N));
        this.r = chat2;
        if (chat2 == null) {
            return;
        }
        this.v0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.u0 = -1;
        this.t0 = -1;
        this.s0 = -1;
        this.F0 = -1;
        this.b1 = -1;
        this.h1 = -1;
        this.i1 = -1;
        this.j1 = -1;
        this.c1 = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.e0 = -1;
        this.d0 = -1;
        this.f0 = -1;
        this.h0 = -1;
        this.m0 = -1;
        this.l0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.g0 = -1;
        this.B0 = -1;
        this.T0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.Y0 = -1;
        this.Z0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.a1 = -1;
        this.f1 = -1;
        this.g1 = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.d1 = 0;
        ArrayList arrayList = this.F;
        boolean z14 = this.w;
        int i10 = 1;
        int i11 = this.O;
        if (i11 == 3) {
            int i12 = this.d1;
            int i13 = i12 + 1;
            this.d1 = i13;
            this.S = i12;
            if (!z14) {
                this.T = i13;
                int i14 = i12 + 3;
                this.d1 = i14;
                this.U = i12 + 2;
                if (this.l1) {
                    this.V = i14;
                    this.W = i12 + 4;
                    this.X = i12 + 5;
                    this.Y = i12 + 6;
                    this.Z = i12 + 7;
                    this.a0 = i12 + 8;
                    this.b0 = i12 + 9;
                    this.c0 = i12 + 10;
                    this.d0 = i12 + 11;
                    this.d1 = i12 + 13;
                    this.k0 = i12 + 12;
                }
                int i15 = this.d1;
                this.h0 = i15;
                this.i0 = i15 + 1;
                this.d1 = i15 + 3;
                this.j0 = i15 + 2;
            }
            int i16 = this.d1;
            int i17 = i16 + 1;
            this.d1 = i17;
            this.g0 = i16;
            if (z14) {
                this.d1 = i16 + 2;
                this.m0 = i17;
            } else if (this.x) {
                this.d1 = i16 + 2;
                this.l0 = i17;
            }
            if (ChatObject.isChannel(this.r)) {
                TLRPC.Chat chat3 = this.r;
                if (chat3.creator && chat3.megagroup && !chat3.gigagroup && !z14) {
                    int i18 = chat3.participants_count;
                    TLRPC.ChatFull chatFull4 = this.s;
                    if (Math.max(i18, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().maxMegagroupCount - 1000) {
                        int i19 = this.d1;
                        this.H0 = i19;
                        this.s0 = i19 + 1;
                        this.t0 = i19 + 2;
                        this.d1 = i19 + 4;
                        this.u0 = i19 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.s;
            if (chatFull5 != null && chatFull5.paid_messages_available && !z14 && ChatObject.canUserDoAction(this.r, 2) && (ChatObject.isChannel(this.r) || ((chat = this.r) != null && chat.creator))) {
                if (this.H0 == -1) {
                    int i20 = this.d1;
                    this.d1 = i20 + 1;
                    this.H0 = i20;
                }
                int i21 = this.d1;
                this.n0 = i21;
                int i22 = i21 + 2;
                this.d1 = i22;
                this.o0 = i21 + 1;
                if (this.y1) {
                    this.p0 = i22;
                    this.q0 = i21 + 3;
                    this.d1 = i21 + 5;
                    this.r0 = i21 + 4;
                }
            }
            if (!z14) {
                if (ChatObject.isChannel(this.r) || !this.r.creator) {
                    TLRPC.Chat chat4 = this.r;
                    if (chat4.megagroup) {
                        if (!chat4.gigagroup) {
                        }
                    }
                }
                if (this.H0 == -1) {
                    int i23 = this.d1;
                    this.d1 = i23 + 1;
                    this.H0 = i23;
                }
                int i24 = this.d1;
                this.N0 = i24;
                this.O0 = i24 + 1;
                this.d1 = i24 + 3;
                this.P0 = i24 + 2;
            }
            if (q0() && !z14) {
                if (this.H0 == -1) {
                    int i25 = this.d1;
                    this.d1 = i25 + 1;
                    this.H0 = i25;
                }
                int i26 = this.d1;
                int i27 = i26 + 1;
                this.d1 = i27;
                this.Q0 = i26;
                if (this.r1) {
                    this.d1 = i26 + 2;
                    this.S0 = i27;
                }
                int i28 = this.d1;
                this.d1 = i28 + 1;
                this.R0 = i28;
            }
            if (ChatObject.isChannel(this.r) && !z14) {
                if (this.H0 == -1) {
                    int i29 = this.d1;
                    this.d1 = i29 + 1;
                    this.H0 = i29;
                }
                int i30 = this.d1;
                this.d1 = i30 + 1;
                this.B0 = i30;
            }
            if ((this.P0 == -1 && this.s0 == -1) || this.B0 != -1) {
                int i31 = this.d1;
                this.d1 = i31 + 1;
                this.G0 = i31;
            }
            if (ChatObject.canBlockUsers(this.r) && !z14 && l0() > 1 && (ChatObject.isChannel(this.r) || this.r.creator)) {
                int i32 = this.d1;
                this.d1 = i32 + 1;
                this.z0 = i32;
            }
            if (this.Q && !(z13 = this.R)) {
                if (z13 || (chatFull3 = this.s) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i33 = this.d1;
                this.d1 = i33 + 1;
                this.f1 = i33;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i34 = this.d1;
                this.E0 = i34;
                int size = arrayList.size() + i34;
                this.d1 = size;
                this.F0 = size;
            }
            if (this.z0 == -1 && this.E0 == -1) {
                return;
            }
            int i35 = this.d1;
            this.d1 = i35 + 1;
            this.C0 = i35;
            return;
        }
        if (i11 == 0) {
            if (ChatObject.canBlockUsers(this.r)) {
                int i36 = this.d1;
                this.d1 = i36 + 1;
                this.z0 = i36;
                if (!arrayList.isEmpty() || (this.Q && !this.R && (chatFull2 = this.s) != null && chatFull2.kicked_count > 0)) {
                    int i37 = this.d1;
                    this.d1 = i37 + 1;
                    this.b1 = i37;
                }
            }
            if (this.Q && !(z12 = this.R)) {
                if (z12) {
                    return;
                }
                int i38 = this.d1;
                this.D0 = i38;
                this.d1 = i38 + 2;
                this.f1 = i38 + 1;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i39 = this.d1;
                int i40 = i39 + 1;
                this.d1 = i40;
                this.D0 = i39;
                this.E0 = i40;
                int size2 = arrayList.size() + i40;
                this.d1 = size2;
                this.F0 = size2;
            }
            if (this.E0 == -1) {
                int i41 = this.d1;
                this.d1 = i41 + 1;
                this.c1 = i41;
                return;
            } else if (this.b1 == -1) {
                int i42 = this.d1;
                this.d1 = i42 + 1;
                this.b1 = i42;
                return;
            } else {
                int i43 = this.d1;
                this.d1 = i43 + 1;
                this.C0 = i43;
                return;
            }
        }
        if (i11 == 1) {
            boolean z15 = this.P;
            if (!z15 && ChatObject.isChannel(this.r)) {
                TLRPC.Chat chat5 = this.r;
                if (chat5.megagroup && !chat5.gigagroup && ((chatFull = this.s) == null || chatFull.participants_count <= 200 || (!this.v && chatFull.can_set_stickers))) {
                    if (ChatObject.hasAdminRights(chat5)) {
                        int i44 = this.d1;
                        this.x0 = i44;
                        this.d1 = i44 + 2;
                        this.y0 = i44 + 1;
                    } else {
                        int i45 = this.d1;
                        this.d1 = i45 + 1;
                        this.C0 = i45;
                    }
                }
            }
            if (ChatObject.canAddAdmins(this.r)) {
                int i46 = this.d1;
                this.d1 = i46 + 1;
                this.z0 = i46;
            }
            if (!this.Q || (z11 = this.R)) {
                if (!arrayList.isEmpty()) {
                    int i47 = this.d1;
                    this.E0 = i47;
                    int size3 = arrayList.size() + i47;
                    this.d1 = size3;
                    this.F0 = size3;
                }
                if (!z14) {
                    int i48 = this.d1;
                    this.d1 = i48 + 1;
                    this.b1 = i48;
                }
            } else if (!z11) {
                int i49 = this.d1;
                this.d1 = i49 + 1;
                this.f1 = i49;
            }
            if (z15 || !ChatObject.isChannelAndNotMegaGroup(this.r) || !ChatObject.hasAdminRights(this.r) || z14) {
                return;
            }
            int i50 = this.d1;
            int i51 = i50 + 1;
            this.d1 = i51;
            this.h1 = i50;
            if (!this.v1) {
                this.d1 = i50 + 2;
                this.j1 = i51;
                return;
            } else {
                this.i1 = i51;
                this.d1 = i50 + 3;
                this.j1 = i50 + 2;
                return;
            }
        }
        if (i11 == 2) {
            if (ChatObject.isChannel(this.r) && !ChatObject.isChannelAndNotMegaGroup(this.r) && !this.n1) {
                int i52 = this.d1;
                this.J0 = i52;
                this.d1 = i52 + 2;
                this.K0 = i52 + 1;
            }
            int i53 = this.e1;
            if (i53 == 0 && ChatObject.canAddUsers(this.r)) {
                int i54 = this.d1;
                this.d1 = i54 + 1;
                this.z0 = i54;
            }
            if (i53 == 0 && ChatObject.canUserDoAdminAction(this.r, 3)) {
                int i55 = this.d1;
                this.d1 = i55 + 1;
                this.A0 = i55;
            }
            if (this.Q && !(z10 = this.R)) {
                if (z10) {
                    return;
                }
                if (i53 == 0) {
                    int i56 = this.d1;
                    this.d1 = i56 + 1;
                    this.g1 = i56;
                }
                int i57 = this.d1;
                this.d1 = i57 + 1;
                this.f1 = i57;
                return;
            }
            ArrayList arrayList2 = this.H;
            if (!arrayList2.isEmpty()) {
                int i58 = this.d1;
                int i59 = i58 + 1;
                this.d1 = i59;
                this.T0 = i58;
                this.U0 = i59;
                int size4 = arrayList2.size() + i59;
                this.d1 = size4;
                this.V0 = size4;
                r1 = 1;
            }
            ArrayList arrayList3 = this.G;
            if (arrayList3.isEmpty()) {
                i10 = r1;
            } else {
                int i60 = this.d1;
                int i61 = i60 + 1;
                this.d1 = i61;
                this.W0 = i60;
                this.X0 = i61;
                int size5 = arrayList3.size() + i61;
                this.d1 = size5;
                this.Y0 = size5;
            }
            if (!arrayList.isEmpty()) {
                if (i10 != 0) {
                    int i62 = this.d1;
                    this.d1 = i62 + 1;
                    this.Z0 = i62;
                }
                int i63 = this.d1;
                this.E0 = i63;
                int size6 = arrayList.size() + i63;
                this.d1 = size6;
                this.F0 = size6;
            }
            int i64 = this.d1;
            if (i64 != 0) {
                this.d1 = i64 + 1;
                this.b1 = i64;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.o1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.e1;
        int i11 = this.O;
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
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 6));
        if (i10 != 0 || i11 == 2 || i11 == 0 || i11 == 3) {
            this.e = new ur(this, context);
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new ig.d2(this, 3);
            this.f = a2;
            if (i11 == 0 && !this.R) {
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
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.C1 = t00Var;
        t00Var.setViewType(6);
        org.telegram.ui.Components.t00 t00Var2 = this.C1;
        t00Var2.w = false;
        t00Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.t00 t00Var3 = this.C1;
        int i12 = org.telegram.ui.ActionBar.j6.G8;
        int i13 = org.telegram.ui.ActionBar.j6.i6;
        t00Var3.f(i12, i13, i13);
        frameLayout3.addView(this.C1, w7.x5.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout3.addView(radialProgressView, w7.x5.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context, frameLayout3, 1, null);
        this.b = xw0Var;
        xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.b.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        frameLayout2.addView(this.b, w7.x5.c(-1.0f, -1));
        this.b.addView(frameLayout3, 0);
        bi.o0 o0Var = new bi.o0(this, context, 9);
        this.c = o0Var;
        o0Var.o1();
        bi.o0 o0Var2 = this.c;
        hg.j0 j0Var = new hg.j0(this);
        this.d = j0Var;
        o0Var2.setLayoutManager(j0Var);
        ir irVar = new ir(this);
        irVar.n(420L);
        irVar.o(org.telegram.ui.Components.pr.h);
        irVar.C = false;
        irVar.m = false;
        this.c.setItemAnimator(irVar);
        bi.o0 o0Var3 = this.c;
        o0Var3.Y1 = true;
        o0Var3.Z1 = 0;
        rr rrVar = new rr(this, context);
        this.a = rrVar;
        o0Var3.setAdapter(rrVar);
        this.c.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.c, w7.x5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.c);
        this.c.setOnItemClickListener(new tq(this, 3));
        this.c.setOnItemLongClickListener(new tq(this, 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new i3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.n = undoView;
        frameLayout2.addView(undoView, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        B0();
        this.c.setEmptyView(this.b);
        bi.o0 o0Var4 = this.c;
        o0Var4.Y1 = false;
        o0Var4.Z1 = 0;
        if (this.n1) {
            this.f.z(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.N)) {
                org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                if (d5Var == null || d5Var.getLastFragment() != this) {
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
        if (chatFull.id == this.N) {
            if (booleanValue && ChatObject.isChannel(this.r)) {
                return;
            }
            boolean z10 = this.s != null;
            this.s = chatFull;
            if (!z10) {
                int k02 = k0();
                this.q1 = k02;
                this.p1 = k02;
                int i12 = this.s.boosts_unrestrict;
                this.r1 = i12 > 0;
                this.s1 = i12;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
                long j3 = chat == null ? 0L : chat.send_paid_messages_stars;
                boolean z11 = j3 > 0;
                this.y1 = z11;
                this.x1 = z11;
                if (j3 <= 0) {
                    j3 = 10;
                }
                long clamp = Utilities.clamp(j3, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.A1 = clamp;
                this.z1 = clamp;
            }
            AndroidUtilities.runOnUIThread(new rq(this, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r0 && r4.w1) != r4.u1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g0(boolean z10) {
        if (!this.P) {
            if (ChatObject.getBannedRightsString(this.E).equals(this.y) && this.q1 == this.p1 && !o0() && (r0 = this.v1) == this.t1) {
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.v) {
                    alertDialog$Builder.a.T = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder.a.T = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new tq(this, 1));
                alertDialog$Builder.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new tq(this, 2));
                showDialog(alertDialog$Builder.a);
            }
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Components.sv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        int i10 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.n6));
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Components.xw0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Components.xw0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b.e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z10, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j3;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z11;
        int i11;
        final vr vrVar;
        final long j10;
        boolean z12;
        long j11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z13;
        String str2;
        int i12;
        if (tLObject == null || (i10 = this.e1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            j3 = MessageObject.getPeerId(channelParticipant.peer);
            boolean z14 = channelParticipant.can_edit;
            tL_chatBannedRights = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i11 = channelParticipant.date;
            str = channelParticipant.rank;
            z11 = z14;
        } else {
            tL_chatBannedRights = null;
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j3 = chatParticipant.user_id;
                i11 = chatParticipant.date;
                str = "";
                z11 = ChatObject.canAddAdmins(this.r);
                tL_chatAdminRights = null;
            } else {
                j3 = 0;
                str = null;
                tL_chatAdminRights = null;
                z11 = false;
                i11 = 0;
            }
        }
        if (j3 == 0 || j3 == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z15 = this.v;
        int i13 = this.O;
        if (i13 != 2) {
            final long j12 = j3;
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
            org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(this, view);
            if (i13 == 3 && ChatObject.canBlockUsers(this.r)) {
                vrVar = this;
                H.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new org.telegram.messenger.voip.f(vrVar, j12, (TLObject) tL_chatBannedRights, str, tLObject, 1), false);
                final int i14 = 0;
                H.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(vrVar) { // from class: org.telegram.ui.sq
                    public final /* synthetic */ vr b;

                    {
                        this.b = vrVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                this.b.i0(j12);
                                break;
                            case 1:
                                vr vrVar2 = this.b;
                                long j13 = j12;
                                vrVar2.i0(j13);
                                vrVar2.getMessagesController().addUserToChat(vrVar2.N, vrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, vrVar2, null);
                                break;
                            case 2:
                                this.b.i0(j12);
                                break;
                            default:
                                vr vrVar3 = this.b;
                                MessagesController messagesController = vrVar3.getMessagesController();
                                long j14 = vrVar3.N;
                                MessagesController messagesController2 = vrVar3.getMessagesController();
                                long j15 = j12;
                                messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !vrVar3.v, vrVar3, false, false, null, null);
                                vrVar3.v0(j15);
                                break;
                        }
                    }
                }, true);
            } else {
                String str3 = str;
                vrVar = this;
                if (i13 == 0 && ChatObject.canBlockUsers(vrVar.r)) {
                    if (ChatObject.canAddUsers(vrVar.r) && j3 > 0 && !ChatObject.isCommunity(vrVar.r)) {
                        final int i15 = 1;
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(z15 ? R.string.ChannelAddToChannel : R.string.ChannelAddToGroup), new Runnable(vrVar) { // from class: org.telegram.ui.sq
                            public final /* synthetic */ vr b;

                            {
                                this.b = vrVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        this.b.i0(j12);
                                        break;
                                    case 1:
                                        vr vrVar2 = this.b;
                                        long j13 = j12;
                                        vrVar2.i0(j13);
                                        vrVar2.getMessagesController().addUserToChat(vrVar2.N, vrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, vrVar2, null);
                                        break;
                                    case 2:
                                        this.b.i0(j12);
                                        break;
                                    default:
                                        vr vrVar3 = this.b;
                                        MessagesController messagesController = vrVar3.getMessagesController();
                                        long j14 = vrVar3.N;
                                        MessagesController messagesController2 = vrVar3.getMessagesController();
                                        long j15 = j12;
                                        messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !vrVar3.v, vrVar3, false, false, null, null);
                                        vrVar3.v0(j15);
                                        break;
                                }
                            }
                        }, false);
                    }
                    final int i16 = 2;
                    H.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(vrVar) { // from class: org.telegram.ui.sq
                        public final /* synthetic */ vr b;

                        {
                            this.b = vrVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    this.b.i0(j12);
                                    break;
                                case 1:
                                    vr vrVar2 = this.b;
                                    long j13 = j12;
                                    vrVar2.i0(j13);
                                    vrVar2.getMessagesController().addUserToChat(vrVar2.N, vrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, vrVar2, null);
                                    break;
                                case 2:
                                    this.b.i0(j12);
                                    break;
                                default:
                                    vr vrVar3 = this.b;
                                    MessagesController messagesController = vrVar3.getMessagesController();
                                    long j14 = vrVar3.N;
                                    MessagesController messagesController2 = vrVar3.getMessagesController();
                                    long j15 = j12;
                                    messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !vrVar3.v, vrVar3, false, false, null, null);
                                    vrVar3.v0(j15);
                                    break;
                            }
                        }
                    }, true);
                } else if (i13 == 1 && ChatObject.canAddAdmins(vrVar.r) && z11) {
                    if (vrVar.r.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                        j10 = j12;
                        H.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new org.telegram.messenger.voip.f(vrVar, j10, (TLObject) tL_chatAdminRights2, str3, tLObject, 2), false);
                    } else {
                        j10 = j12;
                    }
                    final int i17 = 3;
                    H.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(vrVar) { // from class: org.telegram.ui.sq
                        public final /* synthetic */ vr b;

                        {
                            this.b = vrVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    this.b.i0(j10);
                                    break;
                                case 1:
                                    vr vrVar2 = this.b;
                                    long j13 = j10;
                                    vrVar2.i0(j13);
                                    vrVar2.getMessagesController().addUserToChat(vrVar2.N, vrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, vrVar2, null);
                                    break;
                                case 2:
                                    this.b.i0(j10);
                                    break;
                                default:
                                    vr vrVar3 = this.b;
                                    MessagesController messagesController = vrVar3.getMessagesController();
                                    long j14 = vrVar3.N;
                                    MessagesController messagesController2 = vrVar3.getMessagesController();
                                    long j15 = j10;
                                    messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !vrVar3.v, vrVar3, false, false, null, null);
                                    vrVar3.v0(j15);
                                    break;
                            }
                        }
                    }, true);
                }
            }
            H.W(vrVar.c.U0(view, false));
            H.S = 190;
            boolean z16 = H.x() > 0;
            if (z10 || !z16) {
                return z16;
            }
            H.Z();
            return true;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        boolean z17 = ChatObject.canAddAdmins(this.r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11);
        boolean z18 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
        if ((z18 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) && !z11) {
            z12 = z17;
            j11 = j3;
            tL_chatBannedRights2 = tL_chatBannedRights;
            z13 = false;
        } else {
            z12 = z17;
            j11 = j3;
            tL_chatBannedRights2 = tL_chatBannedRights;
            z13 = true;
        }
        boolean z19 = z18 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
        boolean z20 = ChatObject.canBlockUsers(this.r) && z13 && !z15 && ChatObject.isChannel(this.r) && !this.r.gigagroup;
        if (i10 == 0) {
            z12 = (!UserObject.isDeleted(user)) & z12;
        }
        boolean z21 = z12 || (ChatObject.canBlockUsers(this.r) && z13);
        if (z10 || !z21) {
            return z21;
        }
        boolean z22 = z20;
        ar arVar = new ar(this, j11, i11, tLObject, tL_chatAdminRights, tL_chatBannedRights2, str, z13);
        long j13 = j11;
        org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(this, view);
        H2.W(this.c.U0(view, false));
        H2.l(R.drawable.msg_admins, LocaleController.getString(z19 ? R.string.EditAdminRights : R.string.SetAsAdmin), new dj(arVar, 11), z12);
        H2.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new org.telegram.ui.ActionBar.n5((org.telegram.ui.ActionBar.n2) this, tLObject, (TLObject) user, (Object) arVar, 13), z22);
        boolean z23 = ChatObject.canBlockUsers(this.r) && z13;
        int i18 = R.drawable.msg_remove;
        if (z15) {
            str2 = "ChannelRemoveUser";
            i12 = R.string.ChannelRemoveUser;
        } else {
            str2 = "KickFromGroup";
            i12 = R.string.KickFromGroup;
        }
        H2.m(z23, i18, LocaleController.getString(str2, i12), true, new a3.g0(this, user, j13, 16));
        H2.S = 190;
        H2.Z();
        return true;
    }

    public final void i0(long j3) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j3);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.N);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new org.telegram.messenger.a(), new b5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j3);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.N);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new m(this, 4));
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        boolean z10 = this.r1 && q0();
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.s1;
            if (i10 != i11 || ((z10 && i11 == 0) || (!z10 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        return g0(z10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        r0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
        this.n.setTranslationY(-i13);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        rr rrVar = this.a;
        if (rrVar != null) {
            rrVar.l();
        }
        org.telegram.ui.Components.xw0 xw0Var = this.b;
        if (xw0Var != null) {
            xw0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.B1 = true;
        }
        if (z10 && !z11 && this.n1) {
            this.f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f.getSearchField());
            this.f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        return i10 == this.V || i10 == this.W || i10 == this.X || i10 == this.Y || i10 == this.Z || i10 == this.a0 || i10 == this.k0 || i10 == this.b0 || i10 == this.c0 || i10 == this.d0;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.r;
        if (!chat.megagroup || chat.gigagroup || !ChatObject.canUserDoAdminAction(chat, 13)) {
            return false;
        }
        if (this.p1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.E;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    public final void r0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.Q) {
            return;
        }
        int i10 = 0;
        this.J = false;
        this.I = false;
        boolean z10 = this.w;
        int i11 = this.O;
        a0.i iVar = this.L;
        ArrayList arrayList = this.G;
        a0.i iVar2 = this.M;
        ArrayList arrayList2 = this.H;
        a0.i iVar3 = this.K;
        ArrayList arrayList3 = this.F;
        if (z10 && i11 == 2) {
            this.Q = false;
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            iVar3.b();
            iVar2.b();
            iVar.b();
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
            rr rrVar = this.a;
            if (rrVar != null) {
                rrVar.l();
                return;
            }
            return;
        }
        if (ChatObject.isChannel(this.r)) {
            this.Q = true;
            org.telegram.ui.Components.xw0 xw0Var = this.b;
            if (xw0Var != null) {
                xw0Var.e(true, false);
            }
            rr rrVar2 = this.a;
            if (rrVar2 != null) {
                rrVar2.l();
            }
            ArrayList s02 = s0();
            ArrayList arrayList6 = new ArrayList();
            yq yqVar = new yq(this, s02, arrayList6, 0);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i14 = 0; i14 < s02.size(); i14++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i14), new bi.fa(arrayList6, i14, atomicInteger, s02, yqVar)), this.classGuid);
            }
            return;
        }
        this.Q = false;
        arrayList3.clear();
        arrayList.clear();
        arrayList2.clear();
        iVar3.b();
        iVar2.b();
        iVar.b();
        if (i11 == 1) {
            TLRPC.ChatFull chatFull2 = this.s;
            if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                int size3 = chatParticipants.participants.size();
                while (i10 < size3) {
                    TLRPC.ChatParticipant chatParticipant = this.s.participants.participants.get(i10);
                    if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        arrayList3.add(chatParticipant);
                    }
                    iVar3.k(chatParticipant, chatParticipant.user_id);
                    i10++;
                }
            }
        } else if (i11 == 2 && (chatFull = this.s) != null && chatFull.participants != null) {
            long j3 = getUserConfig().clientUserId;
            int size4 = this.s.participants.participants.size();
            while (i10 < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.s.participants.participants.get(i10);
                int i15 = this.e1;
                if (i15 == 0 || chatParticipant2.user_id != j3) {
                    if (i15 == 1) {
                        if (getContactsController().isContact(chatParticipant2.user_id)) {
                            arrayList2.add(chatParticipant2);
                            iVar2.k(chatParticipant2, chatParticipant2.user_id);
                        } else if (!UserObject.isDeleted(getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id)))) {
                            arrayList3.add(chatParticipant2);
                            iVar3.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    } else if (getContactsController().isContact(chatParticipant2.user_id)) {
                        arrayList2.add(chatParticipant2);
                        iVar2.k(chatParticipant2, chatParticipant2.user_id);
                    } else {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id));
                        if (user == null || !user.bot) {
                            arrayList3.add(chatParticipant2);
                            iVar3.k(chatParticipant2, chatParticipant2.user_id);
                        } else {
                            arrayList.add(chatParticipant2);
                            iVar.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    }
                }
                i10++;
            }
        }
        rr rrVar3 = this.a;
        if (rrVar3 != null) {
            rrVar3.l();
        }
        B0();
        rr rrVar4 = this.a;
        if (rrVar4 != null) {
            rrVar4.l();
        }
    }

    public final ArrayList s0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.N);
        int i10 = this.O;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.e1 == 1) {
                if (this.J) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                } else {
                    this.k1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(s0());
                }
            } else if (!this.J) {
                this.k1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.J = true;
                arrayList.addAll(s0());
            } else if (this.I) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.I = true;
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

    public final void t0(long j3, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i10, boolean z11) {
        qq qqVar = new qq(j3, this.N, tL_chatAdminRights, this.E, tL_chatBannedRights, str, i10, z10, tLObject == null, null);
        qqVar.X0 = new fr(this, tLObject, j3, z11);
        presentFragment(qqVar, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0151, code lost:
    
        if ((r0 && r13.w1) != r13.u1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0() {
        TLRPC.ChatFull chatFull;
        boolean z10 = false;
        int i10 = this.O;
        if (i10 == 3) {
            TLRPC.Chat chat = this.r;
            if (chat.creator && !ChatObject.isChannel(chat) && ((this.p1 != this.q1 || this.y1) && this.s != null)) {
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.N, this, new tq(this, 0));
                return;
            }
            if (!ChatObject.getBannedRightsString(this.E).equals(this.y)) {
                getMessagesController().setDefaultBannedRole(this.N, this.E, ChatObject.isChannel(this.r), this);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.N));
                if (chat2 != null) {
                    chat2.default_banned_rights = this.E;
                }
            }
            int i11 = this.p1;
            if (i11 != this.q1 && (chatFull = this.s) != null) {
                chatFull.slowmode_seconds = m0(i11);
                this.s.flags |= 131072;
                getMessagesController().setChannelSlowMode(this.N, this.s.slowmode_seconds);
            }
            boolean z11 = this.y1;
            if (z11 != this.x1 || (z11 && this.z1 != this.A1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().getInputChannel(this.N);
                updatepaidmessagesprice.send_paid_messages_stars = this.y1 ? this.A1 : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new bi.c7(11));
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.N));
                if (chat3 != null) {
                    if (this.y1) {
                        chat3.flags2 |= 16384;
                        chat3.send_paid_messages_stars = this.A1;
                    } else {
                        chat3.flags2 &= -16385;
                        chat3.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat3, true);
                }
            }
            if (o0()) {
                boolean z12 = this.r1 && q0();
                if (z12 && this.s1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.N, 1);
                } else if (z12 || this.s1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.N, this.s1);
                } else {
                    getMessagesController().setBoostsToUnblockRestrictions(this.N, 0);
                }
            }
        } else if (i10 == 1) {
            boolean z13 = this.v1;
            if (z13 == this.t1) {
            }
            MessagesController messagesController = getMessagesController();
            long j3 = this.N;
            boolean z14 = this.v1;
            if (z14 && this.w1) {
                z10 = true;
            }
            messagesController.toggleChannelSignatures(j3, z14, z10);
        }
        finishFragment();
    }

    public final void v0(long j3) {
        a0.i iVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        pr w02 = w0();
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                iVar = this.M;
                arrayList = this.H;
            } else if (i10 == 1) {
                iVar = this.L;
                arrayList = this.G;
            } else {
                iVar = this.K;
                arrayList = this.F;
            }
            TLObject tLObject = (TLObject) iVar.f(j3);
            if (tLObject != null) {
                iVar.l(j3);
                arrayList.remove(tLObject);
                if (this.O == 0 && (chatFull = this.s) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            A0(w02);
        }
        s4.h0 adapter = this.c.getAdapter();
        ur urVar = this.e;
        if (adapter == urVar) {
            hg.b2 b2Var = urVar.h;
            Object f7 = b2Var.f.f(j3);
            if (f7 != null) {
                b2Var.e.remove(f7);
            }
            Object f10 = b2Var.h.f(j3);
            if (f10 != null) {
                b2Var.g.remove(f10);
            }
            Object f11 = urVar.e.f(j3);
            if (f11 != null) {
                urVar.d.remove(f11);
            }
            urVar.l();
        }
    }

    public final pr w0() {
        pr prVar = new pr(this);
        prVar.b = this.d1;
        prVar.i = this.X0;
        prVar.j = this.Y0;
        prVar.l.clear();
        prVar.l.addAll(this.G);
        prVar.h = this.V0;
        prVar.g = this.U0;
        prVar.m.clear();
        prVar.m.addAll(this.H);
        prVar.e = this.E0;
        prVar.f = this.F0;
        prVar.k.clear();
        prVar.k.addAll(this.F);
        prVar.f(prVar.c);
        return prVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        this.s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.q1 = k02;
            this.p1 = k02;
            int i10 = this.s.boosts_unrestrict;
            this.r1 = i10 > 0;
            this.s1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
            long j3 = chat == null ? 0L : chat.send_paid_messages_stars;
            boolean z10 = j3 > 0;
            this.y1 = z10;
            this.x1 = z10;
            if (j3 <= 0) {
                j3 = 10;
            }
            long clamp = Utilities.clamp(j3, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.A1 = clamp;
            this.z1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (this.isPaused || !this.B1) {
            return;
        }
        if (this.c.getAdapter() == this.a && this.R) {
            return;
        }
        View view = null;
        for (int i11 = 0; i11 < this.c.getChildCount(); i11++) {
            View childAt = this.c.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Components.t00) {
                view = childAt;
            }
        }
        if (view != null) {
            this.c.removeView(view);
            i10--;
        }
        this.c.getViewTreeObserver().addOnPreDrawListener(new cr(this, (org.telegram.ui.Components.t00) view, i10, 0));
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new zq(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
