package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qq extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int A0;
    public boolean A1;
    public int B0;
    public org.telegram.ui.Components.mz B1;
    public int C0;
    public RadialProgressView C1;
    public TLRPC.TL_chatBannedRights D;
    public int D0;
    public int D1;
    public final ArrayList E;
    public int E0;
    public int E1;
    public final ArrayList F;
    public int F0;
    public final ArrayList G;
    public int G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public int I0;
    public final a0.h J;
    public int J0;
    public final a0.h K;
    public int K0;
    public final a0.h L;
    public int L0;
    public long M;
    public int M0;
    public final int N;
    public int N0;
    public final boolean O;
    public int O0;
    public boolean P;
    public int P0;
    public boolean Q;
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
    public mq a;
    public int a0;
    public int a1;
    public org.telegram.ui.Components.cv0 b;
    public int b0;
    public int b1;
    public bi.q1 c;
    public int c0;
    public int c1;
    public jg.i0 d;
    public int d0;
    public final int d1;
    public pq e;
    public int e0;
    public int e1;
    public org.telegram.ui.ActionBar.f5 f;
    public int f0;
    public int f1;
    public int g0;
    public int g1;
    public UndoView h;
    public int h0;
    public int h1;
    public int i0;
    public int i1;
    public int j0;
    public int j1;
    public int k0;
    public boolean k1;
    public int l0;
    public jq l1;
    public int m0;
    public final boolean m1;
    public TLRPC.Chat n;
    public int n0;
    public boolean n1;
    public int o0;
    public int o1;
    public int p0;
    public int p1;
    public int q0;
    public boolean q1;
    public TLRPC.ChatFull r;
    public int r0;
    public int r1;
    public final boolean s;
    public int s0;
    public final boolean s1;
    public int t0;
    public final boolean t1;
    public int u0;
    public boolean u1;
    public boolean v0;
    public boolean v1;
    public final boolean w;
    public int w0;
    public boolean w1;
    public final boolean x;
    public int x0;
    public boolean x1;
    public final String y;
    public int y0;
    public long y1;
    public int z0;
    public long z1;

    public qq(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.D = new TLRPC.TL_chatBannedRights();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.J = new a0.h();
        this.K = new a0.h();
        this.L = new a0.h();
        this.y1 = 10L;
        this.z1 = 10L;
        this.M = this.arguments.getLong("chat_id");
        this.N = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR);
        this.O = this.arguments.getBoolean("transfer");
        this.m1 = this.arguments.getBoolean("open_search");
        this.d1 = this.arguments.getInt("selectType");
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
        this.n = M0;
        boolean z9 = false;
        if (M0 != null && (tL_chatBannedRights = M0.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.D;
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
        this.y = org.telegram.messenger.t3.D(this.D);
        boolean Y = org.telegram.messenger.t3.Y(this.n);
        this.w = Y;
        if (org.telegram.messenger.t3.T(this.n) && !this.n.megagroup && !Y) {
            z9 = true;
        }
        this.s = z9;
        this.x = org.telegram.messenger.t3.c0(this.n);
        TLRPC.Chat chat = this.n;
        if (chat != null) {
            boolean z17 = chat.signatures;
            this.u1 = z17;
            this.s1 = z17;
            boolean z18 = chat.signature_profiles;
            this.v1 = z18;
            this.t1 = z18;
        }
    }

    public static /* synthetic */ void Z(qq qqVar, long j3) {
        if (j3 != 0) {
            qqVar.M = j3;
            qqVar.n = org.telegram.messenger.qp.s1(qqVar.currentAccount).M0(Long.valueOf(j3));
            qqVar.z0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(final qq qqVar, View view, int i7) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View m10;
        TLObject E;
        long j3;
        String str;
        boolean z9;
        long B1;
        TLObject tLObject;
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLObject tLObject2;
        int i10;
        boolean w10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i11 = qqVar.d1;
        a0.h hVar = qqVar.J;
        a0.h hVar2 = qqVar.L;
        boolean z11 = qqVar.s;
        int i12 = qqVar.N;
        final int i13 = 0;
        final int i14 = 1;
        boolean z12 = qqVar.c.getAdapter() == qqVar.a;
        if (i7 == qqVar.g1) {
            boolean z13 = !qqVar.u1;
            qqVar.u1 = z13;
            ((org.telegram.ui.Cells.r8) view).setChecked(z13);
            org.telegram.messenger.g0.b4(qqVar.c);
            kq B0 = qqVar.B0();
            qqVar.G0();
            qqVar.F0(B0);
            qqVar.a.g(qqVar.i1);
        } else if (i7 == qqVar.h1) {
            boolean z14 = !qqVar.v1;
            qqVar.v1 = z14;
            ((org.telegram.ui.Cells.r8) view).setChecked(z14);
            org.telegram.messenger.g0.b4(qqVar.c);
            kq B02 = qqVar.B0();
            qqVar.G0();
            qqVar.F0(B02);
            qqVar.a.g(qqVar.i1);
        } else if (i7 == qqVar.m0) {
            boolean z15 = !qqVar.x1;
            qqVar.x1 = z15;
            ((org.telegram.ui.Cells.r8) view).setChecked(z15);
            org.telegram.messenger.g0.b4(qqVar.c);
            kq B03 = qqVar.B0();
            qqVar.G0();
            qqVar.F0(B03);
            qqVar.a.g(qqVar.m0);
        } else if (z12) {
            if (qqVar.u0(i7)) {
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                if (i7 == qqVar.U) {
                    qqVar.D.send_photos = !r15.send_photos;
                } else if (i7 == qqVar.V) {
                    qqVar.D.send_videos = !r14.send_videos;
                } else if (i7 == qqVar.W) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = qqVar.D;
                    boolean z16 = !tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights2.send_inline = z16;
                    tL_chatBannedRights2.send_gifs = z16;
                    tL_chatBannedRights2.send_games = z16;
                    tL_chatBannedRights2.send_stickers = z16;
                } else if (i7 == qqVar.X) {
                    qqVar.D.send_audios = !r14.send_audios;
                } else if (i7 == qqVar.Y) {
                    qqVar.D.send_docs = !r14.send_docs;
                } else if (i7 == qqVar.Z) {
                    qqVar.D.send_voices = !r14.send_voices;
                } else if (i7 == qqVar.a0) {
                    qqVar.D.send_roundvideos = !r14.send_roundvideos;
                } else if (i7 == qqVar.b0) {
                    if (qqVar.D.send_plain && (m10 = qqVar.d.m(qqVar.S)) != null) {
                        org.telegram.messenger.g0.H3(m10);
                        org.telegram.messenger.p2.D.a();
                        return;
                    } else {
                        qqVar.D.embed_links = !r14.embed_links;
                    }
                } else if (i7 == qqVar.c0) {
                    qqVar.D.send_polls = !r14.send_polls;
                } else if (i7 == qqVar.j0) {
                    qqVar.D.send_reactions = !r14.send_reactions;
                }
                c2Var.c(!c2Var.b(), true);
                org.telegram.messenger.g0.b4(qqVar.c);
                kq B04 = qqVar.B0();
                qqVar.G0();
                qqVar.F0(B04);
            } else if (i7 == qqVar.P0) {
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                boolean z17 = !q8Var.d.h;
                qqVar.q1 = z17;
                q8Var.setChecked(z17);
                org.telegram.messenger.g0.b4(qqVar.c);
                kq B05 = qqVar.B0();
                qqVar.G0();
                qqVar.F0(B05);
            } else {
                if (i7 == qqVar.y0) {
                    if (i12 == 0 || i12 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", qqVar.M);
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle.putInt("selectType", i12 == 0 ? 2 : 3);
                        qq qqVar2 = new qq(bundle);
                        qqVar2.C0(qqVar.r);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = qqVar.D;
                        if (tL_chatBannedRights3 != null) {
                            qqVar2.D = tL_chatBannedRights3;
                        }
                        qqVar2.l1 = new eq(qqVar);
                        qqVar.presentFragment(qqVar2);
                        return;
                    }
                    if (i12 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", qqVar.M);
                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle2.putInt("selectType", 1);
                        qq qqVar3 = new qq(bundle2);
                        qqVar3.l1 = new fq(qqVar);
                        qqVar3.C0(qqVar.r);
                        qqVar.presentFragment(qqVar3);
                        return;
                    }
                    if (i12 == 2) {
                        Bundle k10 = a8.p0.k("addToGroup", true);
                        k10.putLong(z11 ? "channelId" : "chatId", qqVar.n.id);
                        y40 y40Var = new y40(k10);
                        y40Var.I = qqVar.r;
                        if (hVar2 != null && hVar2.m() != 0) {
                            hVar = hVar2;
                        }
                        y40Var.J = hVar;
                        y40Var.y = new hq(qqVar, y40Var);
                        qqVar.presentFragment(y40Var);
                        return;
                    }
                    return;
                }
                if (i7 == qqVar.u0) {
                    qqVar.presentFragment(new mb(qqVar.n));
                    return;
                }
                if (i7 == qqVar.w0) {
                    final org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    TLRPC.ChatFull chatFull3 = qqVar.r;
                    if (chatFull3 != null && !chatFull3.antispam && qqVar.q0() < qqVar.getMessagesController().f5) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.id.G(qqVar.getMessagesController().f5, "ChannelAntiSpamForbidden", new Object[0]), org.telegram.ui.Components.hc.a0(qqVar), R.raw.msg_antispam, 36);
                        return;
                    }
                    if (qqVar.r == null || !org.telegram.messenger.t3.y(13, qqVar.n) || qqVar.v0) {
                        return;
                    }
                    qqVar.v0 = true;
                    final boolean z18 = qqVar.r.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = qqVar.getMessagesController().h1(qqVar.M);
                    TLRPC.ChatFull chatFull4 = qqVar.r;
                    boolean z19 = !chatFull4.antispam;
                    chatFull4.antispam = z19;
                    tL_channels_toggleAntiSpam.enabled = z19;
                    m8Var.setChecked(z19);
                    m8Var.getCheckBox().setIcon((org.telegram.messenger.t3.y(13, qqVar.n) && ((chatFull2 = qqVar.r) == null || chatFull2.antispam || qqVar.q0() >= qqVar.getMessagesController().f5)) ? 0 : R.drawable.permission_locked);
                    qqVar.getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(qqVar) { // from class: org.telegram.ui.qp
                        public final /* synthetic */ qq b;

                        {
                            this.b = qqVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    final qq qqVar4 = this.b;
                                    if (tLObject3 != null) {
                                        qqVar4.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        qqVar4.getMessagesController().R3(qqVar4.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i15 = 0;
                                        final org.telegram.ui.Cells.m8 m8Var2 = m8Var;
                                        final boolean z20 = z18;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                int i16 = i15;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z21 = z20;
                                                org.telegram.ui.Cells.m8 m8Var3 = m8Var2;
                                                qq qqVar5 = qqVar4;
                                                switch (i16) {
                                                    case 0:
                                                        if (qqVar5.getParentActivity() != null) {
                                                            qqVar5.r.antispam = z21;
                                                            m8Var3.setChecked(z21);
                                                            Switch checkBox = m8Var3.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, qqVar5.n) && ((chatFull5 = qqVar5.r) == null || !chatFull5.antispam || qqVar5.q0() >= qqVar5.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743879, org.telegram.ui.Components.hc.a0(qqVar5), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (qqVar5.getParentActivity() != null) {
                                                            qqVar5.r.participants_hidden = z21;
                                                            m8Var3.setChecked(z21);
                                                            Switch checkBox2 = m8Var3.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, qqVar5.n) && ((chatFull6 = qqVar5.r) == null || !chatFull6.participants_hidden || qqVar5.q0() >= qqVar5.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743879, org.telegram.ui.Components.hc.a0(qqVar5), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    qqVar4.v0 = false;
                                    break;
                                default:
                                    final qq qqVar5 = this.b;
                                    if (tLObject3 != null) {
                                        qqVar5.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        qqVar5.getMessagesController().R3(qqVar5.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i16 = 1;
                                        final org.telegram.ui.Cells.m8 m8Var3 = m8Var;
                                        final boolean z21 = z18;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                int i162 = i16;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z212 = z21;
                                                org.telegram.ui.Cells.m8 m8Var32 = m8Var3;
                                                qq qqVar52 = qqVar5;
                                                switch (i162) {
                                                    case 0:
                                                        if (qqVar52.getParentActivity() != null) {
                                                            qqVar52.r.antispam = z212;
                                                            m8Var32.setChecked(z212);
                                                            Switch checkBox = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, qqVar52.n) && ((chatFull5 = qqVar52.r) == null || !chatFull5.antispam || qqVar52.q0() >= qqVar52.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743879, org.telegram.ui.Components.hc.a0(qqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (qqVar52.getParentActivity() != null) {
                                                            qqVar52.r.participants_hidden = z212;
                                                            m8Var32.setChecked(z212);
                                                            Switch checkBox2 = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, qqVar52.n) && ((chatFull6 = qqVar52.r) == null || !chatFull6.participants_hidden || qqVar52.q0() >= qqVar52.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743879, org.telegram.ui.Components.hc.a0(qqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    qqVar5.H0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i7 == qqVar.I0) {
                    final org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                    if (qqVar.q0() < qqVar.getMessagesController().g5) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.id.G(qqVar.getMessagesController().g5, "ChannelHiddenMembersForbidden", new Object[0]), org.telegram.ui.Components.hc.a0(qqVar), R.raw.contacts_sync_off, 36);
                        return;
                    }
                    if (qqVar.r == null || !org.telegram.messenger.t3.y(2, qqVar.n) || qqVar.H0) {
                        return;
                    }
                    qqVar.H0 = true;
                    final boolean z20 = qqVar.r.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = qqVar.getMessagesController().h1(qqVar.M);
                    TLRPC.ChatFull chatFull5 = qqVar.r;
                    boolean z21 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z21;
                    tL_channels_toggleParticipantsHidden.enabled = z21;
                    m8Var2.setChecked(z21);
                    Switch checkBox = m8Var2.getCheckBox();
                    if (!org.telegram.messenger.t3.y(2, qqVar.n) || ((chatFull = qqVar.r) != null && !chatFull.participants_hidden && qqVar.q0() < qqVar.getMessagesController().g5)) {
                        i13 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i13);
                    qqVar.getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(qqVar) { // from class: org.telegram.ui.qp
                        public final /* synthetic */ qq b;

                        {
                            this.b = qqVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    final qq qqVar4 = this.b;
                                    if (tLObject3 != null) {
                                        qqVar4.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        qqVar4.getMessagesController().R3(qqVar4.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i15 = 0;
                                        final org.telegram.ui.Cells.m8 m8Var22 = m8Var2;
                                        final boolean z202 = z20;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                int i162 = i15;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z212 = z202;
                                                org.telegram.ui.Cells.m8 m8Var32 = m8Var22;
                                                qq qqVar52 = qqVar4;
                                                switch (i162) {
                                                    case 0:
                                                        if (qqVar52.getParentActivity() != null) {
                                                            qqVar52.r.antispam = z212;
                                                            m8Var32.setChecked(z212);
                                                            Switch checkBox2 = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, qqVar52.n) && ((chatFull52 = qqVar52.r) == null || !chatFull52.antispam || qqVar52.q0() >= qqVar52.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743879, org.telegram.ui.Components.hc.a0(qqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (qqVar52.getParentActivity() != null) {
                                                            qqVar52.r.participants_hidden = z212;
                                                            m8Var32.setChecked(z212);
                                                            Switch checkBox22 = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, qqVar52.n) && ((chatFull6 = qqVar52.r) == null || !chatFull6.participants_hidden || qqVar52.q0() >= qqVar52.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox22.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743879, org.telegram.ui.Components.hc.a0(qqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    qqVar4.v0 = false;
                                    break;
                                default:
                                    final qq qqVar5 = this.b;
                                    if (tLObject3 != null) {
                                        qqVar5.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        qqVar5.getMessagesController().R3(qqVar5.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i16 = 1;
                                        final org.telegram.ui.Cells.m8 m8Var3 = m8Var2;
                                        final boolean z212 = z20;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                int i162 = i16;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z2122 = z212;
                                                org.telegram.ui.Cells.m8 m8Var32 = m8Var3;
                                                qq qqVar52 = qqVar5;
                                                switch (i162) {
                                                    case 0:
                                                        if (qqVar52.getParentActivity() != null) {
                                                            qqVar52.r.antispam = z2122;
                                                            m8Var32.setChecked(z2122);
                                                            Switch checkBox2 = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, qqVar52.n) && ((chatFull52 = qqVar52.r) == null || !chatFull52.antispam || qqVar52.q0() >= qqVar52.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743879, org.telegram.ui.Components.hc.a0(qqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (qqVar52.getParentActivity() != null) {
                                                            qqVar52.r.participants_hidden = z2122;
                                                            m8Var32.setChecked(z2122);
                                                            Switch checkBox22 = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, qqVar52.n) && ((chatFull6 = qqVar52.r) == null || !chatFull6.participants_hidden || qqVar52.q0() >= qqVar52.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox22.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743879, org.telegram.ui.Components.hc.a0(qqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    qqVar5.H0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i7 == qqVar.K0) {
                    if (qqVar.n == null) {
                        return;
                    }
                    org.telegram.ui.Cells.m8 m8Var3 = (org.telegram.ui.Cells.m8) view;
                    boolean d = m8Var3.d();
                    m8Var3.setChecked(!m8Var3.d());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = org.telegram.messenger.qp.l1(qqVar.n);
                    TLRPC.Chat chat = qqVar.n;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = qqVar.n.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights4;
                    tL_chatBannedRights4.edit_rank = !m8Var3.d();
                    qqVar.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new d3.b(i14), new ai.u0(qqVar, m8Var3, d, i14));
                } else {
                    if (i7 == qqVar.A0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", qqVar.M);
                        bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        qq qqVar4 = new qq(bundle3);
                        qqVar4.C0(qqVar.r);
                        qqVar.presentFragment(qqVar4);
                        return;
                    }
                    if (i7 == qqVar.s0) {
                        qqVar.showDialog(new iq(qqVar, qqVar.getParentActivity(), qqVar));
                    } else {
                        if (i7 == qqVar.z0) {
                            if (qqVar.r != null) {
                                ef0 ef0Var = new ef0(qqVar.M, 0, 0L);
                                TLRPC.ChatFull chatFull6 = qqVar.r;
                                ef0Var.m0(chatFull6, chatFull6.exported_invite);
                                qqVar.presentFragment(ef0Var);
                                return;
                            }
                            return;
                        }
                        if ((i7 > qqVar.R && i7 <= Math.max(qqVar.k0, qqVar.f0)) || i7 == qqVar.l0) {
                            org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                            boolean isEnabled = q8Var2.isEnabled();
                            Switch r42 = q8Var2.d;
                            if (isEnabled) {
                                if (r42.F != null) {
                                    if (org.telegram.messenger.t3.t0(qqVar.n) && (i7 == qqVar.h0 || i7 == qqVar.f0)) {
                                        org.telegram.messenger.k5.p(null, 2131751285, org.telegram.ui.Components.hc.a0(qqVar), null);
                                        return;
                                    } else if (org.telegram.messenger.t3.Z(qqVar.currentAccount, qqVar.M) && (i7 == qqVar.h0 || i7 == qqVar.f0)) {
                                        org.telegram.messenger.k5.p(null, 2131751286, org.telegram.ui.Components.hc.a0(qqVar), null);
                                        return;
                                    } else {
                                        org.telegram.messenger.k5.p("EditCantEditPermissions", 2131751287, org.telegram.ui.Components.hc.a0(qqVar), null);
                                        return;
                                    }
                                }
                                if (i7 == qqVar.T) {
                                    kq B06 = qqVar.B0();
                                    qqVar.k1 = !qqVar.k1;
                                    org.telegram.messenger.g0.b4(qqVar.c);
                                    qqVar.F0(B06);
                                    return;
                                }
                                q8Var2.setChecked(!r42.h);
                                if (i7 == qqVar.f0) {
                                    qqVar.D.change_info = !r0.change_info;
                                    return;
                                }
                                if (i7 == qqVar.l0) {
                                    qqVar.D.manage_linked_peers = !r0.manage_linked_peers;
                                    return;
                                }
                                if (i7 == qqVar.g0) {
                                    qqVar.D.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i7 == qqVar.k0) {
                                    qqVar.D.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i7 == qqVar.h0) {
                                    qqVar.D.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i7 == qqVar.i0) {
                                    qqVar.D.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i7 == qqVar.S) {
                                    qqVar.D.send_plain = !r1.send_plain;
                                    int i15 = qqVar.b0;
                                    if (i15 >= 0) {
                                        qqVar.a.g(i15);
                                    }
                                    int i16 = qqVar.T;
                                    if (i16 >= 0) {
                                        qqVar.a.g(i16);
                                    }
                                    kq B07 = qqVar.B0();
                                    qqVar.G0();
                                    qqVar.F0(B07);
                                    return;
                                }
                                if (i7 == qqVar.T) {
                                    kq B08 = qqVar.B0();
                                    qqVar.k1 = !qqVar.k1;
                                    org.telegram.messenger.g0.b4(qqVar.c);
                                    qqVar.F0(B08);
                                    return;
                                }
                                if (i7 == qqVar.d0) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = qqVar.D;
                                    boolean z22 = !tL_chatBannedRights5.send_stickers;
                                    tL_chatBannedRights5.send_inline = z22;
                                    tL_chatBannedRights5.send_gifs = z22;
                                    tL_chatBannedRights5.send_games = z22;
                                    tL_chatBannedRights5.send_stickers = z22;
                                    return;
                                }
                                if (i7 == qqVar.e0) {
                                    qqVar.D.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i7 == qqVar.c0) {
                                        qqVar.D.send_polls = !r0.send_polls;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (z12) {
            E = qqVar.a.E(i7);
            if (E instanceof TLRPC.User) {
                j3 = ((TLRPC.User) E).id;
                z9 = true;
            } else {
                if (E instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                    B1 = org.telegram.messenger.ij.B1(channelParticipant.peer);
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = channelParticipant.banned_rights;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights3 = channelParticipant.admin_rights;
                    String str2 = channelParticipant.rank;
                    boolean z23 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
                    if ((E instanceof TLRPC.TL_channelParticipantCreator) && (tL_chatAdminRights3 = ((TLRPC.TL_channelParticipantCreator) E).admin_rights) == null) {
                        tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
                        tL_chatAdminRights3.manage_ranks = true;
                        tL_chatAdminRights3.add_admins = true;
                        tL_chatAdminRights3.pin_messages = true;
                        tL_chatAdminRights3.manage_topics = true;
                        tL_chatAdminRights3.invite_users = true;
                        tL_chatAdminRights3.ban_users = true;
                        tL_chatAdminRights3.delete_messages = true;
                        tL_chatAdminRights3.edit_messages = true;
                        tL_chatAdminRights3.post_messages = true;
                        tL_chatAdminRights3.change_info = true;
                        if (!z11) {
                            tL_chatAdminRights3.manage_call = true;
                        }
                    }
                    boolean z24 = z23;
                    tLObject = E;
                    z10 = z11;
                    tL_chatBannedRights = tL_chatBannedRights6;
                    tL_chatAdminRights = tL_chatAdminRights3;
                    z9 = z24;
                    str = str2;
                } else if (E instanceof TLRPC.ChatParticipant) {
                    long j10 = ((TLRPC.ChatParticipant) E).user_id;
                    z9 = qqVar.n.creator;
                    if (E instanceof TLRPC.TL_chatParticipantCreator) {
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
                        if (!z11) {
                            tL_chatAdminRights2.manage_call = true;
                        }
                    } else {
                        tL_chatAdminRights2 = null;
                    }
                    str = "";
                    tLObject = E;
                    z10 = z11;
                    tL_chatAdminRights = tL_chatAdminRights2;
                    tL_chatBannedRights = null;
                    B1 = j10;
                } else {
                    tLObject = E;
                    z10 = z11;
                    str = "";
                    tL_chatAdminRights = null;
                    tL_chatBannedRights = null;
                    z9 = false;
                    B1 = 0;
                }
                if (B1 != 0) {
                    return;
                }
                if (i11 != 0) {
                    if (i11 != 3 && i11 != 1) {
                        if (org.telegram.messenger.t3.T(qqVar.n)) {
                            qqVar.getMessagesController().f0(qqVar.M, qqVar.getMessagesController().a2(Long.valueOf(B1)));
                            jq jqVar = qqVar.l1;
                            if (jqVar != null) {
                                jqVar.d(B1);
                            }
                            qqVar.finishFragment();
                            return;
                        }
                        return;
                    }
                    if (i11 == 1 || !z9 || (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin))) {
                        qqVar.y0(B1, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z9, i11 == 1 ? 0 : 1, i11 == 1 || i11 == 3);
                        return;
                    }
                    TLRPC.User a22 = qqVar.getMessagesController().a2(Long.valueOf(B1));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qqVar.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(R.string.AppName, "AppName");
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.a0("AdminWillBeRemoved", null, 2131754350, org.telegram.messenger.t10.p(a22));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, "OK"), new rp(qqVar, a22, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z9));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                    qqVar.showDialog(u1Var);
                    return;
                }
                long j11 = B1;
                if (i12 == 1) {
                    w10 = j11 != qqVar.getUserConfig().e() && (qqVar.n.creator || z9);
                } else {
                    if (i12 == 0 || i12 == 3) {
                        i10 = 2;
                        w10 = org.telegram.messenger.t3.w(2, qqVar.n);
                        if (i12 != 0 || ((i12 != 1 && z10) || (i12 == i10 && i11 == 0))) {
                            if (j11 != qqVar.getUserConfig().e()) {
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            if (B1 > 0) {
                                bundle4.putLong("user_id", j11);
                            } else {
                                bundle4.putLong("chat_id", -j11);
                            }
                            qqVar.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        if (tL_chatBannedRights == null) {
                            tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
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
                        }
                        mp mpVar = new mp(j11, qqVar.M, tL_chatAdminRights, qqVar.D, tL_chatBannedRights, str, i12 == 1 ? 0 : 1, w10, tLObject == null, null);
                        mpVar.X0 = new wp(qqVar, tLObject);
                        qqVar.presentFragment(mpVar);
                        return;
                    }
                    w10 = false;
                }
                i10 = 2;
                if (i12 != 0) {
                }
                if (j11 != qqVar.getUserConfig().e()) {
                }
            }
        } else {
            E = qqVar.e.E(i7);
            if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                qqVar.getMessagesController().X3(user, false, false);
                long j12 = user.id;
                int i17 = 0;
                while (true) {
                    if (i17 >= 3) {
                        tLObject2 = null;
                        break;
                    }
                    tLObject2 = (TLObject) (i17 == 0 ? hVar2 : i17 == 1 ? qqVar.K : hVar).f(j12);
                    if (tLObject2 != null) {
                        break;
                    } else {
                        i17++;
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
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) E;
                B1 = org.telegram.messenger.ij.B1(channelParticipant2.peer);
                boolean z25 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                str = channelParticipant2.rank;
                tLObject = E;
                z10 = z11;
                tL_chatBannedRights = tL_chatBannedRights7;
                z9 = z25;
                tL_chatAdminRights = tL_chatAdminRights4;
                if (B1 != 0) {
                }
            } else if (E instanceof TLRPC.ChatParticipant) {
                j3 = ((TLRPC.ChatParticipant) E).user_id;
                z9 = qqVar.n.creator;
            } else {
                if (E != null) {
                    str = "";
                    z9 = false;
                    B1 = j3;
                    tL_chatAdminRights = null;
                    tLObject = E;
                    z10 = z11;
                    tL_chatBannedRights = null;
                    if (B1 != 0) {
                    }
                }
                z9 = true;
            }
        }
        str = "";
        B1 = j3;
        tL_chatAdminRights = null;
        tLObject = E;
        z10 = z11;
        tL_chatBannedRights = null;
        if (B1 != 0) {
        }
    }

    public static void b0(qq qqVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i7 = 0;
        while (i7 < 3) {
            TLObject tLObject = (TLObject) (i7 == 0 ? qqVar.L : i7 == 1 ? qqVar.K : qqVar.J).f(org.telegram.messenger.ij.B1(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i7++;
        }
    }

    public static void h0(qq qqVar, TLRPC.User user) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z9;
        boolean z10;
        a0.h hVar2 = qqVar.J;
        ArrayList arrayList2 = qqVar.E;
        UndoView undoView = qqVar.h;
        long j3 = -qqVar.M;
        boolean z11 = qqVar.s;
        undoView.m(j3, user, z11 ? 9 : 10);
        boolean z12 = false;
        qqVar.n.creator = false;
        int i7 = 0;
        boolean z13 = false;
        while (i7 < 3) {
            boolean z14 = true;
            if (i7 == 0) {
                hVar = qqVar.L;
                arrayList = qqVar.G;
            } else if (i7 == 1) {
                hVar = qqVar.K;
                arrayList = qqVar.F;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j10 = user.id;
                tL_peerUser.user_id = j10;
                hVar.k(tL_channelParticipantCreator, j10);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z13 = true;
                z9 = true;
            } else {
                z9 = z12;
            }
            long e10 = qqVar.getUserConfig().e();
            TLObject tLObject2 = (TLObject) hVar.f(e10);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = e10;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = e10;
                tL_channelParticipantAdmin.promoted_by = e10;
                z10 = z13;
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
                hVar.k(tL_channelParticipantAdmin, e10);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z10 = z13;
                z14 = z9;
            }
            if (z14) {
                Collections.sort(arrayList, new oe(5));
            }
            i7++;
            z13 = z10;
            z12 = false;
        }
        if (!z13) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j11 = user.id;
            tL_peerUser3.user_id = j11;
            hVar2.k(tL_channelParticipantCreator2, j11);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new oe(4));
            qqVar.G0();
        }
        qqVar.a.f();
        jq jqVar = qqVar.l1;
        if (jqVar != null) {
            jqVar.a(user);
        }
    }

    public static int o0(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    public static int r0(int i7) {
        if (i7 == 1) {
            return 5;
        }
        if (i7 == 2) {
            return 10;
        }
        if (i7 == 3) {
            return 30;
        }
        if (i7 == 4) {
            return 60;
        }
        if (i7 == 5) {
            return org.telegram.messenger.qs.X4;
        }
        if (i7 == 6) {
            return 900;
        }
        return i7 == 7 ? 3600 : 0;
    }

    public static int s0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i7 = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i7++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i7++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i7++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i7++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i7++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i7++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i7++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i7++;
        }
        return !tL_chatBannedRights.send_reactions ? i7 + 1 : i7;
    }

    public final void A0(long j3) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        kq B0 = B0();
        boolean z9 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            if (i7 == 0) {
                hVar = this.L;
                arrayList = this.G;
            } else if (i7 == 1) {
                hVar = this.K;
                arrayList = this.F;
            } else {
                hVar = this.J;
                arrayList = this.E;
            }
            TLObject tLObject = (TLObject) hVar.f(j3);
            if (tLObject != null) {
                hVar.l(j3);
                arrayList.remove(tLObject);
                if (this.N == 0 && (chatFull = this.r) != null) {
                    chatFull.kicked_count--;
                }
                z9 = true;
            }
        }
        if (z9) {
            F0(B0);
        }
        v4.g0 adapter = this.c.getAdapter();
        pq pqVar = this.e;
        if (adapter == pqVar) {
            jg.z1 z1Var = pqVar.h;
            Object f10 = z1Var.f.f(j3);
            if (f10 != null) {
                z1Var.e.remove(f10);
            }
            Object f11 = z1Var.h.f(j3);
            if (f11 != null) {
                z1Var.g.remove(f11);
            }
            Object f12 = pqVar.e.f(j3);
            if (f12 != null) {
                pqVar.d.remove(f12);
            }
            pqVar.f();
        }
    }

    public final kq B0() {
        kq kqVar = new kq(this);
        kqVar.b = this.c1;
        kqVar.i = this.W0;
        kqVar.j = this.X0;
        kqVar.l.clear();
        kqVar.l.addAll(this.F);
        kqVar.h = this.U0;
        kqVar.g = this.T0;
        kqVar.m.clear();
        kqVar.m.addAll(this.G);
        kqVar.e = this.D0;
        kqVar.f = this.E0;
        kqVar.k.clear();
        kqVar.k.addAll(this.E);
        kqVar.f(kqVar.c);
        return kqVar;
    }

    public final void C0(TLRPC.ChatFull chatFull) {
        this.r = chatFull;
        if (chatFull != null) {
            int p02 = p0();
            this.p1 = p02;
            this.o1 = p02;
            int i7 = this.r.boosts_unrestrict;
            this.q1 = i7 > 0;
            this.r1 = i7;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
            long j3 = M0 == null ? 0L : M0.send_paid_messages_stars;
            boolean z9 = j3 > 0;
            this.x1 = z9;
            this.w1 = z9;
            if (j3 <= 0) {
                j3 = 10;
            }
            long k10 = Utilities.k(j3, getMessagesController().I6, 1L);
            this.z1 = k10;
            this.y1 = k10;
        }
    }

    public final void D0(int i7) {
        if (this.isPaused || !this.A1) {
            return;
        }
        if (this.c.getAdapter() == this.a && this.Q) {
            return;
        }
        View view = null;
        for (int i10 = 0; i10 < this.c.getChildCount(); i10++) {
            View childAt = this.c.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Components.mz) {
                view = childAt;
            }
        }
        if (view != null) {
            this.c.removeView(view);
            i7--;
        }
        this.c.getViewTreeObserver().addOnPreDrawListener(new xp(this, (org.telegram.ui.Components.mz) view, i7, 0));
    }

    public final void E0(ArrayList arrayList) {
        Collections.sort(arrayList, new up(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void F0(kq kqVar) {
        View view;
        if (this.a == null) {
            G0();
            return;
        }
        G0();
        kqVar.f(kqVar.d);
        v4.o.c(kqVar, true).c(this.a);
        bi.q1 q1Var = this.c;
        if (q1Var == null || this.d == null || q1Var.getChildCount() <= 0) {
            return;
        }
        int i7 = 0;
        int i10 = -1;
        while (true) {
            if (i7 >= this.c.getChildCount()) {
                view = null;
                break;
            }
            i10 = RecyclerView.R(this.c.getChildAt(i7));
            if (i10 != -1) {
                view = this.c.getChildAt(i7);
                break;
            }
            i7++;
        }
        if (view != null) {
            this.d.h1(i10, view.getTop() - this.c.getPaddingTop());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bd, code lost:
    
        if (org.telegram.messenger.t3.w(2, r1) != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0() {
        boolean z9;
        boolean z10;
        TLRPC.ChatFull chatFull;
        boolean z11;
        TLRPC.ChatFull chatFull2;
        boolean z12;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
        this.n = M0;
        if (M0 == null) {
            return;
        }
        this.u0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.t0 = -1;
        this.s0 = -1;
        this.r0 = -1;
        this.E0 = -1;
        this.a1 = -1;
        this.g1 = -1;
        this.h1 = -1;
        this.i1 = -1;
        this.b1 = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.d0 = -1;
        this.c0 = -1;
        this.e0 = -1;
        this.g0 = -1;
        this.l0 = -1;
        this.k0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.f0 = -1;
        this.A0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.Y0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.Z0 = -1;
        this.e1 = -1;
        this.f1 = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.c1 = 0;
        ArrayList arrayList = this.E;
        boolean z13 = this.w;
        int i7 = 1;
        int i10 = this.N;
        if (i10 == 3) {
            int i11 = this.c1;
            int i12 = i11 + 1;
            this.c1 = i12;
            this.R = i11;
            if (!z13) {
                this.S = i12;
                int i13 = i11 + 3;
                this.c1 = i13;
                this.T = i11 + 2;
                if (this.k1) {
                    this.U = i13;
                    this.V = i11 + 4;
                    this.W = i11 + 5;
                    this.X = i11 + 6;
                    this.Y = i11 + 7;
                    this.Z = i11 + 8;
                    this.a0 = i11 + 9;
                    this.b0 = i11 + 10;
                    this.c0 = i11 + 11;
                    this.c1 = i11 + 13;
                    this.j0 = i11 + 12;
                }
                int i14 = this.c1;
                this.g0 = i14;
                this.h0 = i14 + 1;
                this.c1 = i14 + 3;
                this.i0 = i14 + 2;
            }
            int i15 = this.c1;
            int i16 = i15 + 1;
            this.c1 = i16;
            this.f0 = i15;
            if (z13) {
                this.c1 = i15 + 2;
                this.l0 = i16;
            } else if (this.x) {
                this.c1 = i15 + 2;
                this.k0 = i16;
            }
            if (org.telegram.messenger.t3.T(this.n)) {
                TLRPC.Chat chat2 = this.n;
                if (chat2.creator && chat2.megagroup && !chat2.gigagroup && !z13) {
                    int i17 = chat2.participants_count;
                    TLRPC.ChatFull chatFull4 = this.r;
                    if (Math.max(i17, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().X2 - 1000) {
                        int i18 = this.c1;
                        this.G0 = i18;
                        this.r0 = i18 + 1;
                        this.s0 = i18 + 2;
                        this.c1 = i18 + 4;
                        this.t0 = i18 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.r;
            if (chatFull5 != null && chatFull5.paid_messages_available && !z13 && org.telegram.messenger.t3.w(2, this.n) && (org.telegram.messenger.t3.T(this.n) || ((chat = this.n) != null && chat.creator))) {
                if (this.G0 == -1) {
                    int i19 = this.c1;
                    this.c1 = i19 + 1;
                    this.G0 = i19;
                }
                int i20 = this.c1;
                this.m0 = i20;
                int i21 = i20 + 2;
                this.c1 = i21;
                this.n0 = i20 + 1;
                if (this.x1) {
                    this.o0 = i21;
                    this.p0 = i20 + 3;
                    this.c1 = i20 + 5;
                    this.q0 = i20 + 4;
                }
            }
            if (!z13) {
                if (org.telegram.messenger.t3.T(this.n) || !this.n.creator) {
                    TLRPC.Chat chat3 = this.n;
                    if (chat3.megagroup) {
                        if (!chat3.gigagroup) {
                        }
                    }
                }
                if (this.G0 == -1) {
                    int i22 = this.c1;
                    this.c1 = i22 + 1;
                    this.G0 = i22;
                }
                int i23 = this.c1;
                this.M0 = i23;
                this.N0 = i23 + 1;
                this.c1 = i23 + 3;
                this.O0 = i23 + 2;
            }
            if (v0() && !z13) {
                if (this.G0 == -1) {
                    int i24 = this.c1;
                    this.c1 = i24 + 1;
                    this.G0 = i24;
                }
                int i25 = this.c1;
                int i26 = i25 + 1;
                this.c1 = i26;
                this.P0 = i25;
                if (this.q1) {
                    this.c1 = i25 + 2;
                    this.R0 = i26;
                }
                int i27 = this.c1;
                this.c1 = i27 + 1;
                this.Q0 = i27;
            }
            if (org.telegram.messenger.t3.T(this.n) && !z13) {
                if (this.G0 == -1) {
                    int i28 = this.c1;
                    this.c1 = i28 + 1;
                    this.G0 = i28;
                }
                int i29 = this.c1;
                this.c1 = i29 + 1;
                this.A0 = i29;
            }
            if ((this.O0 == -1 && this.r0 == -1) || this.A0 != -1) {
                int i30 = this.c1;
                this.c1 = i30 + 1;
                this.F0 = i30;
            }
            if (org.telegram.messenger.t3.w(2, this.n) && !z13 && q0() > 1 && (org.telegram.messenger.t3.T(this.n) || this.n.creator)) {
                int i31 = this.c1;
                this.c1 = i31 + 1;
                this.y0 = i31;
            }
            if (this.P && !(z12 = this.Q)) {
                if (z12 || (chatFull3 = this.r) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i32 = this.c1;
                this.c1 = i32 + 1;
                this.e1 = i32;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i33 = this.c1;
                this.D0 = i33;
                int size = arrayList.size() + i33;
                this.c1 = size;
                this.E0 = size;
            }
            if (this.y0 == -1 && this.D0 == -1) {
                return;
            }
            int i34 = this.c1;
            this.c1 = i34 + 1;
            this.B0 = i34;
            return;
        }
        if (i10 == 0) {
            if (org.telegram.messenger.t3.w(2, this.n)) {
                int i35 = this.c1;
                this.c1 = i35 + 1;
                this.y0 = i35;
                if (!arrayList.isEmpty() || (this.P && !this.Q && (chatFull2 = this.r) != null && chatFull2.kicked_count > 0)) {
                    int i36 = this.c1;
                    this.c1 = i36 + 1;
                    this.a1 = i36;
                }
            }
            if (this.P && !(z11 = this.Q)) {
                if (z11) {
                    return;
                }
                int i37 = this.c1;
                this.C0 = i37;
                this.c1 = i37 + 2;
                this.e1 = i37 + 1;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i38 = this.c1;
                int i39 = i38 + 1;
                this.c1 = i39;
                this.C0 = i38;
                this.D0 = i39;
                int size2 = arrayList.size() + i39;
                this.c1 = size2;
                this.E0 = size2;
            }
            if (this.D0 == -1) {
                int i40 = this.c1;
                this.c1 = i40 + 1;
                this.b1 = i40;
                return;
            } else if (this.a1 == -1) {
                int i41 = this.c1;
                this.c1 = i41 + 1;
                this.a1 = i41;
                return;
            } else {
                int i42 = this.c1;
                this.c1 = i42 + 1;
                this.B0 = i42;
                return;
            }
        }
        if (i10 == 1) {
            boolean z14 = this.O;
            if (!z14 && org.telegram.messenger.t3.T(this.n)) {
                TLRPC.Chat chat4 = this.n;
                if (chat4.megagroup && !chat4.gigagroup && ((chatFull = this.r) == null || chatFull.participants_count <= 200 || (!this.s && chatFull.can_set_stickers))) {
                    if (org.telegram.messenger.t3.N(chat4)) {
                        int i43 = this.c1;
                        this.w0 = i43;
                        this.c1 = i43 + 2;
                        this.x0 = i43 + 1;
                    } else {
                        int i44 = this.c1;
                        this.c1 = i44 + 1;
                        this.B0 = i44;
                    }
                }
            }
            if (org.telegram.messenger.t3.w(4, this.n)) {
                int i45 = this.c1;
                this.c1 = i45 + 1;
                this.y0 = i45;
            }
            if (!this.P || (z10 = this.Q)) {
                if (!arrayList.isEmpty()) {
                    int i46 = this.c1;
                    this.D0 = i46;
                    int size3 = arrayList.size() + i46;
                    this.c1 = size3;
                    this.E0 = size3;
                }
                if (!z13) {
                    int i47 = this.c1;
                    this.c1 = i47 + 1;
                    this.a1 = i47;
                }
            } else if (!z10) {
                int i48 = this.c1;
                this.c1 = i48 + 1;
                this.e1 = i48;
            }
            if (z14 || !org.telegram.messenger.t3.V(this.n) || !org.telegram.messenger.t3.N(this.n) || z13) {
                return;
            }
            int i49 = this.c1;
            int i50 = i49 + 1;
            this.c1 = i50;
            this.g1 = i49;
            if (!this.u1) {
                this.c1 = i49 + 2;
                this.i1 = i50;
                return;
            } else {
                this.h1 = i50;
                this.c1 = i49 + 3;
                this.i1 = i49 + 2;
                return;
            }
        }
        if (i10 == 2) {
            if (org.telegram.messenger.t3.T(this.n) && !org.telegram.messenger.t3.V(this.n) && !this.m1) {
                int i51 = this.c1;
                this.I0 = i51;
                this.c1 = i51 + 2;
                this.J0 = i51 + 1;
            }
            int i52 = this.d1;
            if (i52 == 0 && org.telegram.messenger.t3.w(3, this.n)) {
                int i53 = this.c1;
                this.c1 = i53 + 1;
                this.y0 = i53;
            }
            if (i52 == 0 && org.telegram.messenger.t3.y(3, this.n)) {
                int i54 = this.c1;
                this.c1 = i54 + 1;
                this.z0 = i54;
            }
            if (this.P && !(z9 = this.Q)) {
                if (z9) {
                    return;
                }
                if (i52 == 0) {
                    int i55 = this.c1;
                    this.c1 = i55 + 1;
                    this.f1 = i55;
                }
                int i56 = this.c1;
                this.c1 = i56 + 1;
                this.e1 = i56;
                return;
            }
            ArrayList arrayList2 = this.G;
            if (!arrayList2.isEmpty()) {
                int i57 = this.c1;
                int i58 = i57 + 1;
                this.c1 = i58;
                this.S0 = i57;
                this.T0 = i58;
                int size4 = arrayList2.size() + i58;
                this.c1 = size4;
                this.U0 = size4;
                r1 = 1;
            }
            ArrayList arrayList3 = this.F;
            if (arrayList3.isEmpty()) {
                i7 = r1;
            } else {
                int i59 = this.c1;
                int i60 = i59 + 1;
                this.c1 = i60;
                this.V0 = i59;
                this.W0 = i60;
                int size5 = arrayList3.size() + i60;
                this.c1 = size5;
                this.X0 = size5;
            }
            if (!arrayList.isEmpty()) {
                if (i7 != 0) {
                    int i61 = this.c1;
                    this.c1 = i61 + 1;
                    this.Y0 = i61;
                }
                int i62 = this.c1;
                this.D0 = i62;
                int size6 = arrayList.size() + i62;
                this.c1 = size6;
                this.E0 = size6;
            }
            int i63 = this.c1;
            if (i63 != 0) {
                this.c1 = i63 + 1;
                this.a1 = i63;
            }
        }
    }

    public final void H0() {
        try {
            if (this.c == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.y6, false);
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.n6, false);
            if (x02 == this.D1 && x03 == this.E1) {
                return;
            }
            this.D1 = x02;
            this.E1 = x03;
            int i7 = 1;
            while (i7 < 4) {
                int childCount = i7 == 0 ? this.c.getChildCount() : i7 == 1 ? this.c.getHiddenChildCount() : i7 == 2 ? this.c.getCachedChildCount() : this.c.getAttachedScrapChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i7 == 0 ? this.c.getChildAt(i10) : i7 == 1 ? this.c.V(i10) : i7 == 2 ? this.c.P(i10) : this.c.O(i10);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        ((org.telegram.ui.Cells.a5) childAt).updateColors();
                    }
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        return l0(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        boolean z9 = false;
        this.n1 = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i7 = this.d1;
        int i10 = this.N;
        int i11 = 3;
        if (i10 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752333, "ChannelPermissions"));
        } else if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752453, "ChannelBlacklist"));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752517, null));
        } else if (i10 == 2) {
            if (i7 == 0) {
                if (this.s) {
                    this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752289, null));
                } else {
                    this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752377, "ChannelMembers"));
                }
            } else if (i7 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752528, "ChannelAddAdmin"));
            } else if (i7 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752452, "ChannelBlockUser"));
            } else if (i7 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752527, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 9));
        int i12 = 8;
        if (i7 != 0 || i10 == 2 || i10 == 0 || i10 == 3) {
            this.e = new pq(this, context);
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.p().b(0, R.drawable.outline_header_search);
            b10.N();
            b10.B0 = new kg.v1(this, i11);
            this.f = b10;
            if (i10 == 0 && !this.Q) {
                b10.setVisibility(8);
            }
            if (i10 == 3) {
                this.f.setSearchFieldHint(org.telegram.messenger.id.M0(2131752307, "ChannelSearchException"));
            } else {
                this.f.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, "Search"));
            }
            if (!org.telegram.messenger.t3.T(this.n) && !this.n.creator) {
                this.f.setVisibility(8);
            }
            if (i10 == 3) {
                this.simpleActionBar.o(org.telegram.messenger.id.M0(2131745946, null));
            }
        } else if (i10 == 1 && org.telegram.messenger.t3.V(this.n) && org.telegram.messenger.t3.N(this.n)) {
            this.simpleActionBar.o(org.telegram.messenger.id.M0(2131745946, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.B1 = mzVar;
        mzVar.setViewType(6);
        org.telegram.ui.Components.mz mzVar2 = this.B1;
        mzVar2.x = false;
        mzVar2.setUseHeaderOffset(false);
        org.telegram.ui.Components.mz mzVar3 = this.B1;
        int i13 = org.telegram.ui.ActionBar.l6.G8;
        int i14 = org.telegram.ui.ActionBar.l6.i6;
        mzVar3.e(i13, i14, i14);
        frameLayout2.addView(this.B1, c8.ha.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        frameLayout2.addView(radialProgressView, c8.ha.e(-2, -2, 17));
        this.B1.setVisibility(8);
        this.C1.setVisibility(8);
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, frameLayout2, 1, null);
        this.b = cv0Var;
        cv0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        this.b.e.setText(org.telegram.messenger.id.M0(2131745807, null));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        this.b.addView(frameLayout2, 0);
        bi.q1 q1Var = new bi.q1(12, context, this);
        this.c = q1Var;
        q1Var.r1();
        this.c.setSectionsDrawBackground(true);
        bi.q1 q1Var2 = this.c;
        jg.i0 i0Var = new jg.i0(r2, this, z9);
        this.d = i0Var;
        q1Var2.setLayoutManager(i0Var);
        dq dqVar = new dq(this);
        dqVar.n(420L);
        dqVar.o(org.telegram.ui.Components.xq.h);
        dqVar.C = false;
        dqVar.m = false;
        this.c.setItemAnimator(dqVar);
        bi.q1 q1Var3 = this.c;
        q1Var3.W1 = true;
        q1Var3.X1 = 0;
        mq mqVar = new mq(this, context);
        this.a = mqVar;
        q1Var3.setAdapter(mqVar);
        this.c.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? 1 : 2);
        frameLayout.addView(this.c, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        this.c.setOnItemClickListener(new pp(this, i11));
        this.c.setOnItemLongClickListener(new pp(this, 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new g3(this, i12));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        G0();
        this.c.setEmptyView(this.b);
        bi.q1 q1Var4 = this.c;
        q1Var4.W1 = false;
        q1Var4.X1 = 0;
        if (this.m1) {
            this.f.F(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.T) {
            if (i7 == org.telegram.messenger.qs.y1 && ((Long) objArr[0]).longValue() == (-this.M)) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var == null || q4Var.getLastFragment() != this) {
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
        if (chatFull.id == this.M) {
            if (booleanValue && org.telegram.messenger.t3.T(this.n)) {
                return;
            }
            boolean z9 = this.r != null;
            this.r = chatFull;
            if (!z9) {
                int p02 = p0();
                this.p1 = p02;
                this.o1 = p02;
                int i11 = this.r.boosts_unrestrict;
                this.q1 = i11 > 0;
                this.r1 = i11;
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
                long j3 = M0 == null ? 0L : M0.send_paid_messages_stars;
                boolean z10 = j3 > 0;
                this.x1 = z10;
                this.w1 = z10;
                if (j3 <= 0) {
                    j3 = 10;
                }
                long k10 = Utilities.k(j3, getMessagesController().I6, 1L);
                this.z1 = k10;
                this.y1 = k10;
            }
            org.telegram.messenger.g0.h3(new np(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(5, this);
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.c, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Components.xt0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.V6));
        int i7 = org.telegram.ui.ActionBar.l6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.b.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r0 && r5.v1) != r5.t1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l0(boolean z9) {
        int i7 = 1;
        if (!this.O) {
            if (org.telegram.messenger.t3.D(this.D).equals(this.y) && this.p1 == this.o1 && !t0() && (r0 = this.u1) == this.s1) {
            }
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131743726, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                if (this.s) {
                    u1Var.T = org.telegram.messenger.id.M0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    u1Var.T = org.telegram.messenger.id.M0(2131749401, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, "ApplyTheme"), new pp(this, i7));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747580, "PassportDiscard"), new pp(this, 2));
                showDialog(u1Var);
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m0(TLObject tLObject, boolean z9, View view) {
        int i7;
        long j3;
        String str;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10;
        final long j10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j11;
        String str2;
        int i11;
        final qq qqVar;
        final int i12;
        String str3;
        int i13;
        boolean z11;
        boolean z12;
        String str4;
        int i14;
        String str5;
        int i15;
        if (tLObject != null && (i7 = this.d1) == 0) {
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                j11 = org.telegram.messenger.ij.B1(channelParticipant.peer);
                z10 = channelParticipant.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = channelParticipant.banned_rights;
                tL_chatAdminRights = channelParticipant.admin_rights;
                i10 = channelParticipant.date;
                str2 = channelParticipant.rank;
                j3 = 0;
                tL_chatBannedRights = tL_chatBannedRights2;
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j11 = chatParticipant.user_id;
                i10 = chatParticipant.date;
                z10 = org.telegram.messenger.t3.w(4, this.n);
                str2 = "";
                j3 = 0;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            } else {
                j3 = 0;
                str = null;
                z10 = false;
                tL_chatAdminRights = null;
                i10 = 0;
                j10 = 0;
                tL_chatBannedRights = null;
                if (j10 != j3 && j10 != getUserConfig().e()) {
                    boolean z13 = this.s;
                    i11 = this.N;
                    if (i11 == 2) {
                        String str6 = str;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                        final int i16 = 1;
                        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(this, view);
                        if (i11 == 3 && org.telegram.messenger.t3.w(2, this.n)) {
                            String M0 = org.telegram.messenger.id.M0(2131752414, null);
                            qqVar = this;
                            bi.i0 i0Var = new bi.i0(qqVar, j10, tL_chatBannedRights, str6, tLObject, 9);
                            final int i17 = 0;
                            H.c(R.drawable.msg_permissions, M0, i0Var, false);
                            H.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131752420, "ChannelDeleteFromList"), new Runnable(qqVar) { // from class: org.telegram.ui.op
                                public final /* synthetic */ qq b;

                                {
                                    this.b = qqVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            this.b.n0(j10);
                                            break;
                                        case 1:
                                            qq qqVar2 = this.b;
                                            long j12 = j10;
                                            qqVar2.n0(j12);
                                            qqVar2.getMessagesController().n(qqVar2.M, qqVar2.getMessagesController().a2(Long.valueOf(j12)), null, qqVar2, null);
                                            break;
                                        case 2:
                                            this.b.n0(j10);
                                            break;
                                        default:
                                            qq qqVar3 = this.b;
                                            org.telegram.messenger.qp messagesController = qqVar3.getMessagesController();
                                            long j13 = qqVar3.M;
                                            org.telegram.messenger.qp messagesController2 = qqVar3.getMessagesController();
                                            long j14 = j10;
                                            messagesController.P4(j13, messagesController2.a2(Long.valueOf(j14)), new TLRPC.TL_chatAdminRights(), "", !qqVar3.s, qqVar3, false, false, null, null, null);
                                            qqVar3.A0(j14);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            qqVar = this;
                            if (i11 == 0 && org.telegram.messenger.t3.w(2, qqVar.n)) {
                                if (org.telegram.messenger.t3.w(3, qqVar.n) && j10 > j3 && !org.telegram.messenger.t3.Y(qqVar.n)) {
                                    if (z13) {
                                        i13 = 2131752524;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i13 = 2131752523;
                                    }
                                    H.c(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(i13, str3), new Runnable(qqVar) { // from class: org.telegram.ui.op
                                        public final /* synthetic */ qq b;

                                        {
                                            this.b = qqVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    this.b.n0(j10);
                                                    break;
                                                case 1:
                                                    qq qqVar2 = this.b;
                                                    long j12 = j10;
                                                    qqVar2.n0(j12);
                                                    qqVar2.getMessagesController().n(qqVar2.M, qqVar2.getMessagesController().a2(Long.valueOf(j12)), null, qqVar2, null);
                                                    break;
                                                case 2:
                                                    this.b.n0(j10);
                                                    break;
                                                default:
                                                    qq qqVar3 = this.b;
                                                    org.telegram.messenger.qp messagesController = qqVar3.getMessagesController();
                                                    long j13 = qqVar3.M;
                                                    org.telegram.messenger.qp messagesController2 = qqVar3.getMessagesController();
                                                    long j14 = j10;
                                                    messagesController.P4(j13, messagesController2.a2(Long.valueOf(j14)), new TLRPC.TL_chatAdminRights(), "", !qqVar3.s, qqVar3, false, false, null, null, null);
                                                    qqVar3.A0(j14);
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                                final int i18 = 2;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131752420, "ChannelDeleteFromList"), new Runnable(qqVar) { // from class: org.telegram.ui.op
                                    public final /* synthetic */ qq b;

                                    {
                                        this.b = qqVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                this.b.n0(j10);
                                                break;
                                            case 1:
                                                qq qqVar2 = this.b;
                                                long j12 = j10;
                                                qqVar2.n0(j12);
                                                qqVar2.getMessagesController().n(qqVar2.M, qqVar2.getMessagesController().a2(Long.valueOf(j12)), null, qqVar2, null);
                                                break;
                                            case 2:
                                                this.b.n0(j10);
                                                break;
                                            default:
                                                qq qqVar3 = this.b;
                                                org.telegram.messenger.qp messagesController = qqVar3.getMessagesController();
                                                long j13 = qqVar3.M;
                                                org.telegram.messenger.qp messagesController2 = qqVar3.getMessagesController();
                                                long j14 = j10;
                                                messagesController.P4(j13, messagesController2.a2(Long.valueOf(j14)), new TLRPC.TL_chatAdminRights(), "", !qqVar3.s, qqVar3, false, false, null, null, null);
                                                qqVar3.A0(j14);
                                                break;
                                        }
                                    }
                                }, true);
                            } else if (i11 == 1 && org.telegram.messenger.t3.w(4, qqVar.n) && z10) {
                                if (qqVar.n.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                                    i12 = 3;
                                    H.c(R.drawable.msg_admins, org.telegram.messenger.id.M0(2131751304, "EditAdminRights"), new bi.i0(qqVar, j10, tL_chatAdminRights2, str6, tLObject, 10), false);
                                } else {
                                    i12 = 3;
                                }
                                H.c(R.drawable.msg_remove, org.telegram.messenger.id.M0(2131752313, "ChannelRemoveUserAdmin"), new Runnable(qqVar) { // from class: org.telegram.ui.op
                                    public final /* synthetic */ qq b;

                                    {
                                        this.b = qqVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                this.b.n0(j10);
                                                break;
                                            case 1:
                                                qq qqVar2 = this.b;
                                                long j12 = j10;
                                                qqVar2.n0(j12);
                                                qqVar2.getMessagesController().n(qqVar2.M, qqVar2.getMessagesController().a2(Long.valueOf(j12)), null, qqVar2, null);
                                                break;
                                            case 2:
                                                this.b.n0(j10);
                                                break;
                                            default:
                                                qq qqVar3 = this.b;
                                                org.telegram.messenger.qp messagesController = qqVar3.getMessagesController();
                                                long j13 = qqVar3.M;
                                                org.telegram.messenger.qp messagesController2 = qqVar3.getMessagesController();
                                                long j14 = j10;
                                                messagesController.P4(j13, messagesController2.a2(Long.valueOf(j14)), new TLRPC.TL_chatAdminRights(), "", !qqVar3.s, qqVar3, false, false, null, null, null);
                                                qqVar3.A0(j14);
                                                break;
                                        }
                                    }
                                }, true);
                            }
                        }
                        H.W(qqVar.c.U0(view, false));
                        H.S = org.telegram.messenger.qs.U2;
                        boolean z14 = H.x() > 0;
                        if (z9 || !z14) {
                            return z14;
                        }
                        H.Z();
                        return true;
                    }
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
                    boolean z15 = org.telegram.messenger.t3.w(4, this.n) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z10);
                    boolean z16 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
                    boolean z17 = !(z16 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z10;
                    boolean z18 = z16 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                    boolean z19 = org.telegram.messenger.t3.w(2, this.n) && z17 && !z13 && org.telegram.messenger.t3.T(this.n) && !this.n.gigagroup;
                    if (i7 == 0) {
                        z15 &= !org.telegram.messenger.t10.x(a22);
                    }
                    if (z15) {
                        z11 = z19;
                    } else {
                        z11 = z19;
                        if (!org.telegram.messenger.t3.w(2, this.n) || !z17) {
                            z12 = false;
                            if (!z9 || !z12) {
                                return z12;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
                            int i19 = i10;
                            boolean z20 = z15;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
                            boolean z21 = z11;
                            boolean z22 = z18;
                            vp vpVar = new vp(this, j10, i19, tLObject, tL_chatAdminRights3, tL_chatBannedRights3, str, z17);
                            long j12 = j10;
                            org.telegram.ui.Components.l60 H2 = org.telegram.ui.Components.l60.H(this, view);
                            H2.W(this.c.U0(view, false));
                            if (z22) {
                                i14 = 2131751304;
                                str4 = null;
                            } else {
                                str4 = null;
                                i14 = 2131745547;
                            }
                            H2.l(R.drawable.msg_admins, org.telegram.messenger.id.M0(i14, str4), new dh(vpVar, 12), z20);
                            H2.l(R.drawable.msg_permissions, org.telegram.messenger.id.M0(2131752540, "ChangePermissions"), new m6(this, tLObject, a22, vpVar, 12), z21);
                            boolean z23 = org.telegram.messenger.t3.w(2, this.n) && z17;
                            if (z13) {
                                str5 = "ChannelRemoveUser";
                                i15 = 2131752314;
                            } else {
                                str5 = "KickFromGroup";
                                i15 = 2131749055;
                            }
                            H2.m(R.drawable.msg_remove, new bi.d3(this, a22, j12, 18), org.telegram.messenger.id.M0(i15, str5), z23, true);
                            H2.S = org.telegram.messenger.qs.U2;
                            H2.Z();
                            return true;
                        }
                    }
                    z12 = true;
                    if (!z9) {
                    }
                    return z12;
                }
            }
            str = str2;
            j10 = j11;
            if (j10 != j3) {
                boolean z132 = this.s;
                i11 = this.N;
                if (i11 == 2) {
                }
            }
        }
        return false;
    }

    public final void n0(long j3) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().j1(j3);
            tL_communities_toggleParticipantBanned.community = getMessagesController().h1(this.M);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new a5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().j1(j3);
        tL_channels_editBanned.channel = getMessagesController().h1(this.M);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new l(this, 4));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        return l0(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.qs.T);
        getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
        w0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.T);
        getNotificationCenter().n(this, org.telegram.messenger.qs.y1);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        mq mqVar = this.a;
        if (mqVar != null) {
            mqVar.f();
        }
        org.telegram.ui.Components.cv0 cv0Var = this.b;
        if (cv0Var != null) {
            cv0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            H0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            this.A1 = true;
        }
        if (z9 && !z10 && this.m1) {
            this.f.getSearchField().requestFocus();
            org.telegram.messenger.g0.K3(this.f.getSearchField());
            this.f.setVisibility(8);
        }
    }

    public final int p0() {
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i7 = chatFull.slowmode_seconds;
        if (i7 == 5) {
            return 1;
        }
        if (i7 == 10) {
            return 2;
        }
        if (i7 == 30) {
            return 3;
        }
        if (i7 == 60) {
            return 4;
        }
        if (i7 == 300) {
            return 5;
        }
        if (i7 == 900) {
            return 6;
        }
        return i7 == 3600 ? 7 : 0;
    }

    public final int q0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i7 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i7 : Math.max(i7, arrayList.size());
    }

    public final boolean t0() {
        boolean z9 = this.q1 && v0();
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull != null) {
            int i7 = chatFull.boosts_unrestrict;
            int i10 = this.r1;
            if (i7 != i10 || ((z9 && i10 == 0) || (!z9 && i10 != 0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean u0(int i7) {
        return i7 == this.U || i7 == this.V || i7 == this.W || i7 == this.X || i7 == this.Y || i7 == this.Z || i7 == this.j0 || i7 == this.a0 || i7 == this.b0 || i7 == this.c0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        TLRPC.Chat chat = this.n;
        if (!chat.megagroup || chat.gigagroup || !org.telegram.messenger.t3.y(13, chat)) {
            return false;
        }
        if (this.o1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.D;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    public final void w0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.P) {
            return;
        }
        int i7 = 0;
        this.I = false;
        this.H = false;
        boolean z9 = this.w;
        int i10 = this.N;
        a0.h hVar = this.K;
        ArrayList arrayList = this.F;
        a0.h hVar2 = this.L;
        ArrayList arrayList2 = this.G;
        a0.h hVar3 = this.J;
        ArrayList arrayList3 = this.E;
        if (z9 && i10 == 2) {
            this.P = false;
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            hVar3.b();
            hVar2.b();
            hVar.b();
            HashMap hashMap = org.telegram.messenger.g5.r(this.currentAccount).g0;
            ArrayList arrayList4 = org.telegram.messenger.g5.r(this.currentAccount).h0;
            int size = arrayList4.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList4.get(i11);
                i11++;
                ArrayList arrayList5 = (ArrayList) hashMap.get((String) obj);
                int size2 = arrayList5.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList5.get(i12);
                    i12++;
                    arrayList3.add(getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)));
                }
            }
            G0();
            mq mqVar = this.a;
            if (mqVar != null) {
                mqVar.f();
                return;
            }
            return;
        }
        if (org.telegram.messenger.t3.T(this.n)) {
            this.P = true;
            org.telegram.ui.Components.cv0 cv0Var = this.b;
            if (cv0Var != null) {
                cv0Var.e(true, false);
            }
            mq mqVar2 = this.a;
            if (mqVar2 != null) {
                mqVar2.f();
            }
            ArrayList x02 = x0();
            ArrayList arrayList6 = new ArrayList();
            tp tpVar = new tp(this, x02, arrayList6, 0);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i13 = 0; i13 < x02.size(); i13++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) x02.get(i13), new bg.k0(arrayList6, i13, atomicInteger, x02, tpVar, 6)), this.classGuid);
            }
            return;
        }
        this.P = false;
        arrayList3.clear();
        arrayList.clear();
        arrayList2.clear();
        hVar3.b();
        hVar2.b();
        hVar.b();
        if (i10 == 1) {
            TLRPC.ChatFull chatFull2 = this.r;
            if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                int size3 = chatParticipants.participants.size();
                while (i7 < size3) {
                    TLRPC.ChatParticipant chatParticipant = this.r.participants.participants.get(i7);
                    if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        arrayList3.add(chatParticipant);
                    }
                    hVar3.k(chatParticipant, chatParticipant.user_id);
                    i7++;
                }
            }
        } else if (i10 == 2 && (chatFull = this.r) != null && chatFull.participants != null) {
            long j3 = getUserConfig().n;
            int size4 = this.r.participants.participants.size();
            while (i7 < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.r.participants.participants.get(i7);
                int i14 = this.d1;
                if (i14 == 0 || chatParticipant2.user_id != j3) {
                    if (i14 == 1) {
                        if (getContactsController().x(chatParticipant2.user_id)) {
                            arrayList2.add(chatParticipant2);
                            hVar2.k(chatParticipant2, chatParticipant2.user_id);
                        } else if (!org.telegram.messenger.t10.x(getMessagesController().a2(Long.valueOf(chatParticipant2.user_id)))) {
                            arrayList3.add(chatParticipant2);
                            hVar3.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    } else if (getContactsController().x(chatParticipant2.user_id)) {
                        arrayList2.add(chatParticipant2);
                        hVar2.k(chatParticipant2, chatParticipant2.user_id);
                    } else {
                        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(chatParticipant2.user_id));
                        if (a22 == null || !a22.bot) {
                            arrayList3.add(chatParticipant2);
                            hVar3.k(chatParticipant2, chatParticipant2.user_id);
                        } else {
                            arrayList.add(chatParticipant2);
                            hVar.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    }
                }
                i7++;
            }
        }
        mq mqVar3 = this.a;
        if (mqVar3 != null) {
            mqVar3.f();
        }
        G0();
        mq mqVar4 = this.a;
        if (mqVar4 != null) {
            mqVar4.f();
        }
    }

    public final ArrayList x0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().h1(this.M);
        int i7 = this.N;
        if (i7 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i7 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i7 == 2) {
            TLRPC.ChatFull chatFull = this.r;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.n) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.d1 == 1) {
                if (this.I) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                } else {
                    this.j1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.I = true;
                    arrayList.addAll(x0());
                }
            } else if (!this.I) {
                this.j1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.I = true;
                arrayList.addAll(x0());
            } else if (this.H) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.H = true;
                arrayList.addAll(x0());
            }
        } else if (i7 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = org.telegram.messenger.qs.e3;
        return arrayList;
    }

    public final void y0(long j3, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9, int i7, boolean z10) {
        mp mpVar = new mp(j3, this.M, tL_chatAdminRights, this.D, tL_chatBannedRights, str, i7, z9, tLObject == null, null);
        mpVar.X0 = new aq(this, tLObject, j3, z10);
        presentFragment(mpVar, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        if ((r0 && r15.v1) != r15.t1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        TLRPC.ChatFull chatFull;
        int i7 = 0;
        int i10 = this.N;
        if (i10 == 3) {
            TLRPC.Chat chat = this.n;
            if (chat.creator && !org.telegram.messenger.t3.T(chat) && ((this.o1 != this.p1 || this.x1) && this.r != null)) {
                org.telegram.messenger.qp.s1(this.currentAccount).T(getParentActivity(), this.M, this, new pp(this, i7), null);
                return;
            }
            if (!org.telegram.messenger.t3.D(this.D).equals(this.y)) {
                getMessagesController().H4(this.M, this.D, org.telegram.messenger.t3.T(this.n), this);
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
                if (M0 != null) {
                    M0.default_banned_rights = this.D;
                }
            }
            int i11 = this.o1;
            if (i11 != this.p1 && (chatFull = this.r) != null) {
                chatFull.slowmode_seconds = r0(i11);
                this.r.flags |= 131072;
                org.telegram.messenger.qp messagesController = getMessagesController();
                long j3 = this.M;
                int i12 = this.r.slowmode_seconds;
                messagesController.getClass();
                TLRPC.TL_channels_toggleSlowMode tL_channels_toggleSlowMode = new TLRPC.TL_channels_toggleSlowMode();
                tL_channels_toggleSlowMode.seconds = i12;
                tL_channels_toggleSlowMode.channel = messagesController.h1(j3);
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleSlowMode, new org.telegram.messenger.pj(messagesController, j3, 14));
            }
            boolean z9 = this.x1;
            if (z9 != this.w1 || (z9 && this.y1 != this.z1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().h1(this.M);
                updatepaidmessagesprice.send_paid_messages_stars = this.x1 ? this.z1 : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new di.v5(17));
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.M));
                if (M02 != null) {
                    if (this.x1) {
                        M02.flags2 |= TLObject.FLAG_14;
                        M02.send_paid_messages_stars = this.z1;
                    } else {
                        M02.flags2 &= -16385;
                        M02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().Q3(M02, true);
                }
            }
            if (t0()) {
                boolean z10 = this.q1 && v0();
                if (z10 && this.r1 == 0) {
                    getMessagesController().D4(1, this.M);
                } else if (z10 || this.r1 == 0) {
                    getMessagesController().D4(this.r1, this.M);
                } else {
                    getMessagesController().D4(0, this.M);
                }
            }
        } else if (i10 == 1) {
            boolean z11 = this.u1;
            if (z11 == this.s1) {
            }
            org.telegram.messenger.qp messagesController2 = getMessagesController();
            long j10 = this.M;
            boolean z12 = this.u1;
            boolean z13 = z12 && this.v1;
            TLRPC.Chat M03 = messagesController2.M0(Long.valueOf(j10));
            if (M03 != null) {
                M03.signatures = z12;
                M03.signature_profiles = z13;
                messagesController2.Q3(M03, true);
            }
            TLRPC.TL_channels_toggleSignatures tL_channels_toggleSignatures = new TLRPC.TL_channels_toggleSignatures();
            tL_channels_toggleSignatures.channel = messagesController2.h1(j10);
            tL_channels_toggleSignatures.signatures_enabled = z12;
            tL_channels_toggleSignatures.profiles_enabled = z13;
            messagesController2.getConnectionsManager().sendRequest(tL_channels_toggleSignatures, new org.telegram.messenger.rj(messagesController2, 13), 64);
            messagesController2.getNotificationCenter().k(org.telegram.messenger.qs.E3, Long.valueOf(-j10));
        }
        finishFragment();
    }
}
