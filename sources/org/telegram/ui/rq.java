package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class rq extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public int B0;
    public int C0;
    public int D0;
    public final boolean E;
    public int E0;
    public final boolean F;
    public int F0;
    public final boolean G;
    public int G0;
    public boolean H;
    public int H0;
    public final boolean I;
    public int I0;
    public float J;
    public int J0;
    public boolean K;
    public int K0;
    public final boolean L;
    public int L0;
    public final TLRPC.TL_chatAdminRights M;
    public int M0;
    public final TLRPC.TL_chatAdminRights N;
    public int N0;
    public TLRPC.TL_chatBannedRights O;
    public boolean O0;
    public final TLRPC.TL_chatBannedRights P;
    public int P0;
    public boolean Q;
    public int Q0;
    public final String R;
    public int R0;
    public String S;
    public int S0;
    public final String T;
    public boolean T0;
    public final boolean U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public oq X0;
    public int Y;
    public final String Y0;
    public int Z;
    public final boolean Z0;
    public qq a;
    public int a0;
    public final boolean a1;
    public bi.y1 b;
    public int b0;
    public ValueAnimator b1;
    public fg.a0 c;
    public int c0;
    public ValueAnimator c1;
    public FrameLayout d;
    public int d0;
    public FrameLayout e;
    public int e0;
    public org.telegram.ui.Components.o6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.vr h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public long n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public boolean r;
    public int r0;
    public long s;
    public int s0;
    public int t0;
    public int u0;
    public final TLRPC.User v;
    public int v0;
    public TLRPC.Chat w;
    public int w0;
    public TLRPC.ChatFull x;
    public int x0;
    public final int y;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        TLRPC.UserFull userFull;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        this.H = false;
        this.J = 0.0f;
        this.K = false;
        this.L = false;
        this.R = "";
        this.Z0 = z11;
        this.s = j10;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
        this.v = user;
        this.y = i10;
        this.I = z10;
        boolean z13 = true;
        boolean z14 = !z10;
        this.T0 = z14;
        this.O0 = z14;
        this.Y0 = str2;
        this.w = getMessagesController().getChat(Long.valueOf(this.s));
        this.x = getMessagesController().getChatFull(this.s);
        this.U = user != null && user.bot_guard;
        String str3 = str != null ? str : "";
        this.S = str3;
        this.T = str3;
        this.F = ChatObject.isCommunity(this.w);
        TLRPC.Chat chat2 = this.w;
        if (chat2 != null) {
            this.E = ChatObject.isChannel(chat2) && !this.w.megagroup;
            this.G = ChatObject.isForum(this.w);
            this.N = this.w.admin_rights;
        }
        if (this.N == null) {
            this.N = o0(i10 != 2 || ((chat = this.w) != null && chat.creator));
        }
        if (i10 == 0 || i10 == 2) {
            if (i10 == 2 && (userFull = getMessagesController().getUserFull(j3)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = this.E ? userFull.bot_broadcast_admin_rights : userFull.bot_group_admin_rights;
                if (tL_chatAdminRights3 != null) {
                    if (tL_chatAdminRights2 == null) {
                        tL_chatAdminRights2 = tL_chatAdminRights3;
                    } else {
                        tL_chatAdminRights2.ban_users = tL_chatAdminRights2.ban_users || tL_chatAdminRights3.ban_users;
                        tL_chatAdminRights2.add_admins = tL_chatAdminRights2.add_admins || tL_chatAdminRights3.add_admins;
                        tL_chatAdminRights2.post_messages = tL_chatAdminRights2.post_messages || tL_chatAdminRights3.post_messages;
                        tL_chatAdminRights2.pin_messages = tL_chatAdminRights2.pin_messages || tL_chatAdminRights3.pin_messages;
                        tL_chatAdminRights2.manage_ranks = tL_chatAdminRights2.manage_ranks || tL_chatAdminRights3.manage_ranks;
                        tL_chatAdminRights2.delete_messages = tL_chatAdminRights2.delete_messages || tL_chatAdminRights3.delete_messages;
                        tL_chatAdminRights2.change_info = tL_chatAdminRights2.change_info || tL_chatAdminRights3.change_info;
                        tL_chatAdminRights2.anonymous = tL_chatAdminRights2.anonymous || tL_chatAdminRights3.anonymous;
                        tL_chatAdminRights2.edit_messages = tL_chatAdminRights2.edit_messages || tL_chatAdminRights3.edit_messages;
                        tL_chatAdminRights2.manage_call = tL_chatAdminRights2.manage_call || tL_chatAdminRights3.manage_call;
                        tL_chatAdminRights2.manage_topics = tL_chatAdminRights2.manage_topics || tL_chatAdminRights3.manage_topics;
                        tL_chatAdminRights2.post_stories = tL_chatAdminRights2.post_stories || tL_chatAdminRights3.post_stories;
                        tL_chatAdminRights2.edit_stories = tL_chatAdminRights2.edit_stories || tL_chatAdminRights3.edit_stories;
                        tL_chatAdminRights2.delete_stories = tL_chatAdminRights2.delete_stories || tL_chatAdminRights3.delete_stories;
                        tL_chatAdminRights2.manage_direct_messages = tL_chatAdminRights2.manage_direct_messages || tL_chatAdminRights3.manage_direct_messages;
                        tL_chatAdminRights2.manage_welcome_messages = tL_chatAdminRights2.manage_welcome_messages || tL_chatAdminRights3.manage_welcome_messages;
                        tL_chatAdminRights2.manage_linked_peers = tL_chatAdminRights2.manage_linked_peers || tL_chatAdminRights3.manage_linked_peers;
                        tL_chatAdminRights2.other = tL_chatAdminRights2.other || tL_chatAdminRights3.other;
                    }
                }
            }
            if (tL_chatAdminRights2 == null) {
                this.L = false;
                if (i10 == 2) {
                    this.M = o0(false);
                    boolean z15 = this.E;
                    this.K = z15;
                    this.J = z15 ? 1.0f : 0.0f;
                    this.a1 = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.M = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.N;
                    tL_chatAdminRights4.change_info = tL_chatAdminRights5.change_info;
                    tL_chatAdminRights4.post_messages = tL_chatAdminRights5.post_messages;
                    tL_chatAdminRights4.edit_messages = tL_chatAdminRights5.edit_messages;
                    tL_chatAdminRights4.delete_messages = tL_chatAdminRights5.delete_messages;
                    tL_chatAdminRights4.manage_call = tL_chatAdminRights5.manage_call;
                    tL_chatAdminRights4.ban_users = tL_chatAdminRights5.ban_users;
                    tL_chatAdminRights4.invite_users = tL_chatAdminRights5.invite_users;
                    tL_chatAdminRights4.pin_messages = tL_chatAdminRights5.pin_messages;
                    tL_chatAdminRights4.manage_ranks = tL_chatAdminRights5.manage_ranks;
                    tL_chatAdminRights4.manage_topics = tL_chatAdminRights5.manage_topics;
                    tL_chatAdminRights4.post_stories = tL_chatAdminRights5.post_stories;
                    tL_chatAdminRights4.edit_stories = tL_chatAdminRights5.edit_stories;
                    tL_chatAdminRights4.delete_stories = tL_chatAdminRights5.delete_stories;
                    tL_chatAdminRights4.manage_direct_messages = tL_chatAdminRights5.manage_direct_messages;
                    tL_chatAdminRights4.manage_welcome_messages = tL_chatAdminRights5.manage_welcome_messages;
                    tL_chatAdminRights4.manage_linked_peers = tL_chatAdminRights5.manage_linked_peers;
                    tL_chatAdminRights4.other = tL_chatAdminRights5.other;
                    this.a1 = false;
                }
            } else {
                this.L = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.M = tL_chatAdminRights6;
                boolean z16 = tL_chatAdminRights2.change_info;
                tL_chatAdminRights6.change_info = z16;
                boolean z17 = tL_chatAdminRights2.post_messages;
                tL_chatAdminRights6.post_messages = z17;
                boolean z18 = tL_chatAdminRights2.edit_messages;
                tL_chatAdminRights6.edit_messages = z18;
                boolean z19 = tL_chatAdminRights2.delete_messages;
                tL_chatAdminRights6.delete_messages = z19;
                boolean z20 = tL_chatAdminRights2.manage_call;
                tL_chatAdminRights6.manage_call = z20;
                boolean z21 = tL_chatAdminRights2.ban_users;
                tL_chatAdminRights6.ban_users = z21;
                boolean z22 = tL_chatAdminRights2.invite_users;
                tL_chatAdminRights6.invite_users = z22;
                boolean z23 = tL_chatAdminRights2.pin_messages;
                tL_chatAdminRights6.pin_messages = z23;
                boolean z24 = tL_chatAdminRights2.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z24;
                boolean z25 = tL_chatAdminRights2.manage_topics;
                tL_chatAdminRights6.manage_topics = z25;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights2.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights2.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights2.delete_stories;
                boolean z26 = tL_chatAdminRights2.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z26;
                boolean z27 = tL_chatAdminRights2.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z27;
                boolean z28 = tL_chatAdminRights2.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z28;
                boolean z29 = tL_chatAdminRights2.add_admins;
                tL_chatAdminRights6.add_admins = z29;
                boolean z30 = tL_chatAdminRights2.anonymous;
                tL_chatAdminRights6.anonymous = z30;
                boolean z31 = tL_chatAdminRights2.other;
                tL_chatAdminRights6.other = z31;
                boolean z32 = z16 || z17 || z26 || z27 || z18 || z19 || z21 || z22 || z28 || z23 || z24 || z29 || z20 || z30 || z25 || z31;
                this.a1 = z32;
                if (i10 == 2) {
                    boolean z33 = this.E || z32;
                    this.K = z33;
                    this.J = z33 ? 1.0f : 0.0f;
                    this.a1 = false;
                }
            }
            TLRPC.Chat chat3 = this.w;
            if (chat3 != null) {
                this.P = chat3.default_banned_rights;
            }
            if (this.P == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                this.P = tL_chatBannedRights3;
                tL_chatBannedRights3.view_messages = false;
                tL_chatBannedRights3.send_media = false;
                tL_chatBannedRights3.send_messages = false;
                tL_chatBannedRights3.embed_links = false;
                tL_chatBannedRights3.send_stickers = false;
                tL_chatBannedRights3.send_gifs = false;
                tL_chatBannedRights3.send_games = false;
                tL_chatBannedRights3.send_inline = false;
                tL_chatBannedRights3.send_polls = false;
                tL_chatBannedRights3.invite_users = false;
                tL_chatBannedRights3.change_info = false;
                tL_chatBannedRights3.pin_messages = false;
                tL_chatBannedRights3.manage_topics = false;
                tL_chatBannedRights3.send_plain = false;
                tL_chatBannedRights3.send_videos = false;
                tL_chatBannedRights3.send_photos = false;
                tL_chatBannedRights3.send_audios = false;
                tL_chatBannedRights3.send_docs = false;
                tL_chatBannedRights3.send_voices = false;
                tL_chatBannedRights3.send_roundvideos = false;
                tL_chatBannedRights3.edit_rank = false;
                tL_chatBannedRights3.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.P;
            if (tL_chatBannedRights4.change_info || this.E) {
                z12 = true;
            } else {
                z12 = true;
                this.M.change_info = true;
            }
            if (!tL_chatBannedRights4.pin_messages) {
                this.M.pin_messages = z12;
            }
        } else if (i10 == 1) {
            this.P = tL_chatBannedRights;
            if (tL_chatBannedRights == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights5 = new TLRPC.TL_chatBannedRights();
                this.P = tL_chatBannedRights5;
                tL_chatBannedRights5.view_messages = false;
                tL_chatBannedRights5.send_media = false;
                tL_chatBannedRights5.send_messages = false;
                tL_chatBannedRights5.embed_links = false;
                tL_chatBannedRights5.send_stickers = false;
                tL_chatBannedRights5.send_gifs = false;
                tL_chatBannedRights5.send_games = false;
                tL_chatBannedRights5.send_inline = false;
                tL_chatBannedRights5.send_polls = false;
                tL_chatBannedRights5.invite_users = false;
                tL_chatBannedRights5.change_info = false;
                tL_chatBannedRights5.pin_messages = false;
                tL_chatBannedRights5.manage_topics = false;
                tL_chatBannedRights5.send_plain = false;
                tL_chatBannedRights5.send_videos = false;
                tL_chatBannedRights5.send_photos = false;
                tL_chatBannedRights5.send_audios = false;
                tL_chatBannedRights5.send_docs = false;
                tL_chatBannedRights5.send_voices = false;
                tL_chatBannedRights5.send_roundvideos = false;
                tL_chatBannedRights5.edit_rank = false;
                tL_chatBannedRights5.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = new TLRPC.TL_chatBannedRights();
            this.O = tL_chatBannedRights6;
            if (tL_chatBannedRights2 == null) {
                tL_chatBannedRights6.view_messages = false;
                tL_chatBannedRights6.send_media = false;
                tL_chatBannedRights6.send_messages = false;
                tL_chatBannedRights6.embed_links = false;
                tL_chatBannedRights6.send_stickers = false;
                tL_chatBannedRights6.send_gifs = false;
                tL_chatBannedRights6.send_games = false;
                tL_chatBannedRights6.send_inline = false;
                tL_chatBannedRights6.send_polls = false;
                tL_chatBannedRights6.invite_users = false;
                tL_chatBannedRights6.change_info = false;
                tL_chatBannedRights6.pin_messages = false;
                tL_chatBannedRights6.manage_topics = false;
                tL_chatBannedRights6.edit_rank = false;
                tL_chatBannedRights6.send_reactions = false;
            } else {
                tL_chatBannedRights6.view_messages = tL_chatBannedRights2.view_messages;
                tL_chatBannedRights6.send_messages = tL_chatBannedRights2.send_messages;
                tL_chatBannedRights6.send_media = tL_chatBannedRights2.send_media;
                tL_chatBannedRights6.send_stickers = tL_chatBannedRights2.send_stickers;
                tL_chatBannedRights6.send_gifs = tL_chatBannedRights2.send_gifs;
                tL_chatBannedRights6.send_games = tL_chatBannedRights2.send_games;
                tL_chatBannedRights6.send_inline = tL_chatBannedRights2.send_inline;
                tL_chatBannedRights6.embed_links = tL_chatBannedRights2.embed_links;
                tL_chatBannedRights6.send_polls = tL_chatBannedRights2.send_polls;
                tL_chatBannedRights6.invite_users = tL_chatBannedRights2.invite_users;
                tL_chatBannedRights6.change_info = tL_chatBannedRights2.change_info;
                tL_chatBannedRights6.pin_messages = tL_chatBannedRights2.pin_messages;
                tL_chatBannedRights6.until_date = tL_chatBannedRights2.until_date;
                tL_chatBannedRights6.manage_topics = tL_chatBannedRights2.manage_topics;
                tL_chatBannedRights6.send_photos = tL_chatBannedRights2.send_photos;
                tL_chatBannedRights6.send_videos = tL_chatBannedRights2.send_videos;
                tL_chatBannedRights6.send_roundvideos = tL_chatBannedRights2.send_roundvideos;
                tL_chatBannedRights6.send_audios = tL_chatBannedRights2.send_audios;
                tL_chatBannedRights6.send_voices = tL_chatBannedRights2.send_voices;
                tL_chatBannedRights6.send_docs = tL_chatBannedRights2.send_docs;
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.O;
                tL_chatBannedRights7.send_plain = tL_chatBannedRights2.send_plain;
                tL_chatBannedRights7.edit_rank = tL_chatBannedRights2.edit_rank;
                tL_chatBannedRights7.send_reactions = tL_chatBannedRights2.send_reactions;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.P;
            if (tL_chatBannedRights8.view_messages) {
                this.O.view_messages = true;
            }
            if (tL_chatBannedRights8.send_messages) {
                this.O.send_messages = true;
            }
            if (tL_chatBannedRights8.send_media) {
                this.O.send_media = true;
            }
            if (tL_chatBannedRights8.send_stickers) {
                this.O.send_stickers = true;
            }
            if (tL_chatBannedRights8.send_gifs) {
                this.O.send_gifs = true;
            }
            if (tL_chatBannedRights8.send_games) {
                this.O.send_games = true;
            }
            if (tL_chatBannedRights8.send_inline) {
                this.O.send_inline = true;
            }
            if (tL_chatBannedRights8.embed_links) {
                this.O.embed_links = true;
            }
            if (tL_chatBannedRights8.send_polls) {
                this.O.send_polls = true;
            }
            if (tL_chatBannedRights8.invite_users) {
                this.O.invite_users = true;
            }
            if (tL_chatBannedRights8.change_info) {
                this.O.change_info = true;
            }
            if (tL_chatBannedRights8.pin_messages) {
                this.O.pin_messages = true;
            }
            if (tL_chatBannedRights8.edit_rank) {
                this.O.edit_rank = true;
            }
            if (tL_chatBannedRights8.send_reactions) {
                this.O.send_reactions = true;
            }
            if (tL_chatBannedRights8.manage_topics) {
                this.O.manage_topics = true;
            }
            if (tL_chatBannedRights8.send_photos) {
                this.O.send_photos = true;
            }
            if (tL_chatBannedRights8.send_videos) {
                this.O.send_videos = true;
            }
            if (tL_chatBannedRights8.send_audios) {
                this.O.send_audios = true;
            }
            if (tL_chatBannedRights8.send_docs) {
                this.O.send_docs = true;
            }
            if (tL_chatBannedRights8.send_voices) {
                this.O.send_voices = true;
            }
            if (tL_chatBannedRights8.send_roundvideos) {
                this.O.send_roundvideos = true;
            }
            if (tL_chatBannedRights8.send_plain) {
                this.O.send_plain = true;
            }
            this.R = ChatObject.getBannedRightsString(this.O);
            if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                z13 = false;
            }
            this.a1 = z13;
        }
        u0(false);
    }

    public static void U(rq rqVar, long j3) {
        if (j3 != 0) {
            rqVar.s = j3;
            rqVar.w = MessagesController.getInstance(rqVar.currentAccount).getChat(Long.valueOf(j3));
            rqVar.r0(true);
        }
    }

    public static void V(final rq rqVar, org.telegram.ui.ActionBar.c3 c3Var, View view) {
        Runnable runnable;
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == 0) {
            rqVar.O.until_date = 0;
            rqVar.a.m(rqVar.M0);
        } else if (intValue == 1) {
            rqVar.O.until_date = ConnectionsManager.getInstance(rqVar.currentAccount).getCurrentTime() + 86400;
            rqVar.a.m(rqVar.M0);
        } else if (intValue == 2) {
            rqVar.O.until_date = ConnectionsManager.getInstance(rqVar.currentAccount).getCurrentTime() + 604800;
            rqVar.a.m(rqVar.M0);
        } else if (intValue == 3) {
            rqVar.O.until_date = ConnectionsManager.getInstance(rqVar.currentAccount).getCurrentTime() + 2592000;
            rqVar.a.m(rqVar.M0);
        } else if (intValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(rqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() { // from class: org.telegram.ui.kq
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                        final rq rqVar2 = rq.this;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.clear();
                        calendar2.set(i10, i11, i12);
                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                        try {
                            TimePickerDialog timePickerDialog = new TimePickerDialog(rqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.nq
                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                    rq rqVar3 = rq.this;
                                    rqVar3.O.until_date = (i14 * 60) + (i13 * 3600) + time;
                                    rqVar3.a.m(rqVar3.M0);
                                }
                            }, 0, 0, true);
                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new lq());
                            rqVar2.showDialog(timePickerDialog);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                }, calendar.get(1), calendar.get(2), calendar.get(5));
                DatePicker datePicker = datePickerDialog.getDatePicker();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.set(11, calendar2.getMinimum(11));
                calendar2.set(12, calendar2.getMinimum(12));
                calendar2.set(13, calendar2.getMinimum(13));
                calendar2.set(14, calendar2.getMinimum(14));
                datePicker.setMinDate(calendar2.getTimeInMillis());
                calendar2.setTimeInMillis(System.currentTimeMillis() + 31536000000L);
                calendar2.set(11, calendar2.getMaximum(11));
                calendar2.set(12, calendar2.getMaximum(12));
                calendar2.set(13, calendar2.getMaximum(13));
                calendar2.set(14, calendar2.getMaximum(14));
                datePicker.setMaxDate(calendar2.getTimeInMillis());
                datePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), datePickerDialog);
                datePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new lq());
                datePickerDialog.setOnShowListener(new mq(0, datePicker));
                rqVar.showDialog(datePickerDialog);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        runnable = c3Var.a.dismissRunnable;
        runnable.run();
    }

    public static /* synthetic */ boolean W(rq rqVar, TLRPC.TL_error tL_error) {
        rqVar.t0(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (!ChatObject.isChannel(rqVar.w)) {
            qg.k0 k0Var = new qg.k0(11, rqVar.currentAccount, rqVar.getParentActivity(), rqVar, rqVar.getResourceProvider());
            ArrayList arrayList = new ArrayList();
            arrayList.add(rqVar.v);
            k0Var.I1(rqVar.w, arrayList, null, null, null);
            k0Var.show();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x048b, code lost:
    
        if (r5.creator == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04a0, code lost:
    
        if (r6.change_info != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04f3, code lost:
    
        if (r6.pin_messages != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0521, code lost:
    
        if (r5.creator == false) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0775  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X(rq rqVar, Context context, View view, int i10) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View m10;
        boolean z14 = rqVar.E;
        TLRPC.User user = rqVar.v;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = rqVar.P;
        int i11 = rqVar.y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = rqVar.M;
        if (rqVar.I || (rqVar.w.creator && i11 == 0 && i10 == rqVar.e0)) {
            boolean z15 = false;
            if (i10 == rqVar.z0) {
                if (!(view instanceof org.telegram.ui.Cells.w8) || ((org.telegram.ui.Cells.w8) view).isEnabled()) {
                    rqVar.A0 = !rqVar.A0;
                    rqVar.u0(false);
                    rqVar.a.m(rqVar.z0);
                    if (rqVar.A0) {
                        rqVar.a.s(rqVar.z0 + 1, 10);
                        return;
                    } else {
                        rqVar.a.t(rqVar.z0 + 1, 10);
                        return;
                    }
                }
                return;
            }
            int i12 = rqVar.N0;
            if (i10 == i12) {
                if (!(view instanceof org.telegram.ui.Cells.w8) || ((org.telegram.ui.Cells.w8) view).isEnabled()) {
                    rqVar.O0 = !rqVar.O0;
                    rqVar.u0(false);
                    rqVar.a.m(rqVar.N0);
                    if (rqVar.O0) {
                        rqVar.a.s(rqVar.N0 + 1, 3);
                        return;
                    } else {
                        rqVar.a.t(rqVar.N0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            int i13 = rqVar.S0;
            if (i10 == i13) {
                if (!(view instanceof org.telegram.ui.Cells.w8) || ((org.telegram.ui.Cells.w8) view).isEnabled()) {
                    rqVar.T0 = !rqVar.T0;
                    rqVar.u0(false);
                    rqVar.a.m(rqVar.S0);
                    if (rqVar.T0) {
                        rqVar.a.s(rqVar.S0 + 1, 3);
                        return;
                    } else {
                        rqVar.a.t(rqVar.S0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            if (i10 == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                rqVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            if (i10 == rqVar.p0) {
                if (i11 == 0) {
                    MessagesController.getInstance(rqVar.currentAccount).setUserAdminRole(rqVar.s, rqVar.v, new TLRPC.TL_chatAdminRights(), rqVar.S, rqVar.E, rqVar.getFragmentForAlert(0), rqVar.Z0, false, null, null);
                    oq oqVar = rqVar.X0;
                    if (oqVar != null) {
                        oqVar.b(0, tL_chatAdminRights, rqVar.O, rqVar.S);
                    }
                    rqVar.finishFragment();
                    return;
                }
                if (i11 == 1) {
                    rqVar.Q = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    rqVar.O = tL_chatBannedRights3;
                    tL_chatBannedRights3.view_messages = true;
                    tL_chatBannedRights3.send_media = true;
                    tL_chatBannedRights3.send_messages = true;
                    tL_chatBannedRights3.send_stickers = true;
                    tL_chatBannedRights3.send_gifs = true;
                    tL_chatBannedRights3.send_games = true;
                    tL_chatBannedRights3.send_inline = true;
                    tL_chatBannedRights3.embed_links = true;
                    tL_chatBannedRights3.pin_messages = true;
                    tL_chatBannedRights3.edit_rank = true;
                    tL_chatBannedRights3.send_reactions = true;
                    tL_chatBannedRights3.send_polls = true;
                    tL_chatBannedRights3.invite_users = true;
                    tL_chatBannedRights3.change_info = true;
                    tL_chatBannedRights3.manage_topics = true;
                    tL_chatBannedRights3.until_date = 0;
                    rqVar.r0(true);
                    return;
                }
                return;
            }
            if (i10 == rqVar.t0) {
                rqVar.p0(null, null);
                return;
            }
            if (i10 == rqVar.M0) {
                if (rqVar.getParentActivity() == null) {
                    return;
                }
                org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, null);
                org.telegram.ui.ActionBar.h3 h3Var = c3Var.a;
                h3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.j6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString(R.string.UserRestrictionsDuration));
                linearLayout.addView(m4Var);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                int i14 = -2;
                linearLayout.addView(linearLayout2, w7.a6.n(-1, -2));
                org.telegram.ui.ActionBar.a3[] a3VarArr = new org.telegram.ui.ActionBar.a3[5];
                int i15 = 0;
                for (int i16 = 5; i15 < i16; i16 = 5) {
                    org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, 0, null);
                    a3VarArr[i15] = a3Var;
                    a3Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                    a3VarArr[i15].setTag(Integer.valueOf(i15));
                    a3VarArr[i15].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    a3VarArr[i15].a(i15 != 0 ? i15 != 1 ? i15 != 2 ? i15 != 3 ? LocaleController.getString(R.string.UserRestrictionsCustom) : LocaleController.formatPluralString("Months", 1, new Object[0]) : LocaleController.formatPluralString("Weeks", 1, new Object[0]) : LocaleController.formatPluralString("Days", 1, new Object[0]) : LocaleController.getString(R.string.UserRestrictionsUntilForever), 0, null, false);
                    linearLayout2.addView(a3VarArr[i15], w7.a6.n(-1, i14));
                    a3VarArr[i15].setOnClickListener(new sh(4, rqVar, c3Var));
                    i15++;
                    i14 = -2;
                }
                c3Var.b(linearLayout);
                rqVar.showDialog(h3Var);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.z1) {
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                int i17 = rqVar.P0;
                if (i10 == i17 || i10 == rqVar.Q0 || i10 == rqVar.R0) {
                    if (i10 == i17) {
                        z12 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z12;
                    } else if (i10 == rqVar.Q0) {
                        z12 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z12;
                    } else {
                        z12 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z12;
                    }
                    rqVar.a.m(i12);
                    z1Var.c(z12, true);
                    return;
                }
                int i18 = rqVar.U0;
                if (i10 == i18 || i10 == rqVar.V0 || i10 == rqVar.W0) {
                    if (i10 == i18) {
                        z13 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z13;
                    } else if (i10 == rqVar.V0) {
                        z13 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z13;
                    } else {
                        z13 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z13;
                    }
                    rqVar.a.m(i13);
                    z1Var.c(z13, true);
                    return;
                }
                if (i11 != 1 || rqVar.O == null) {
                    return;
                }
                z1Var.b();
                if (z1Var.r.b != null) {
                    if (i11 != 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rqVar.getParentActivity());
                        String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.R = string;
                        d2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        d2Var.show();
                        return;
                    }
                    return;
                }
                if (i10 == rqVar.B0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = rqVar.O;
                    z15 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z15;
                } else if (i10 == rqVar.C0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = rqVar.O;
                    z15 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z15;
                } else if (i10 == rqVar.D0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = rqVar.O;
                    z15 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z15;
                } else if (i10 == rqVar.j0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = rqVar.O;
                    z15 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z15;
                } else if (i10 == rqVar.E0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = rqVar.O;
                    z15 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z15;
                } else if (i10 == rqVar.G0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = rqVar.O;
                    z15 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z15;
                } else if (i10 == rqVar.F0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = rqVar.O;
                    z15 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z15;
                } else if (i10 == rqVar.H0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = rqVar.O;
                    z15 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z15;
                    tL_chatBannedRights11.send_gifs = z15;
                    tL_chatBannedRights11.send_games = z15;
                    tL_chatBannedRights11.send_stickers = z15;
                } else if (i10 == rqVar.J0) {
                    if ((rqVar.O.send_plain || tL_chatBannedRights2.send_plain) && (m10 = rqVar.c.m(rqVar.y0)) != null) {
                        AndroidUtilities.shakeViewSpring(m10);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = rqVar.O;
                        z15 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z15;
                    }
                } else if (i10 == rqVar.I0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = rqVar.O;
                    z15 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z15;
                }
                rqVar.a.m(rqVar.z0);
                z1Var.c(!z15, true);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.w8) {
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                Switch r12 = w8Var.d;
                if (r12.F != null) {
                    if (i11 != 2) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rqVar.getParentActivity());
                        String string2 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                        d2Var2.R = string2;
                        d2Var2.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        d2Var2.show();
                        return;
                    }
                    return;
                }
                if (!w8Var.isEnabled()) {
                    if (i11 == 2 || i11 == 0) {
                        if ((i10 != rqVar.X || tL_chatBannedRights2 == null || tL_chatBannedRights2.change_info) && ((i10 != rqVar.h0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.pin_messages) && (i10 != rqVar.i0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.edit_rank))) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(rqVar.getParentActivity());
                        String string3 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                        d2Var3.R = string3;
                        d2Var3.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.OK), null);
                        d2Var3.show();
                        return;
                    }
                    return;
                }
                if (i11 != 2 && i10 != rqVar.k0) {
                    w8Var.setChecked(!r12.h);
                }
                boolean z16 = r12.h;
                if (i10 == rqVar.W) {
                    z16 = !rqVar.K;
                    rqVar.K = z16;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = rqVar.N;
                    FrameLayout frameLayout = rqVar.e;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = rqVar.b.getChildCount();
                    int i19 = 0;
                    while (i19 < childCount) {
                        View childAt = rqVar.b.getChildAt(i19);
                        rqVar.b.getClass();
                        int R = RecyclerView.R(childAt);
                        if (childAt instanceof org.telegram.ui.Cells.w8) {
                            boolean z17 = rqVar.K;
                            if (z17) {
                                if (R == rqVar.W) {
                                    if (!tL_chatAdminRights2.add_admins) {
                                        TLRPC.Chat chat = rqVar.w;
                                        if (chat != null) {
                                        }
                                        z11 = false;
                                    }
                                    z11 = true;
                                } else if (R == rqVar.X) {
                                    z17 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info) {
                                    }
                                    z11 = false;
                                } else if (R == rqVar.Y) {
                                    z17 = tL_chatAdminRights.post_messages;
                                    z11 = tL_chatAdminRights2.post_messages;
                                } else if (R == rqVar.Z) {
                                    z17 = tL_chatAdminRights.manage_direct_messages;
                                    z11 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (R == rqVar.a0) {
                                    z17 = tL_chatAdminRights.manage_welcome_messages;
                                    z11 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (R == rqVar.b0) {
                                    z17 = tL_chatAdminRights.edit_messages;
                                    z11 = tL_chatAdminRights2.edit_messages;
                                } else if (R == rqVar.c0) {
                                    z17 = tL_chatAdminRights.delete_messages;
                                    z11 = tL_chatAdminRights2.delete_messages;
                                } else if (R == rqVar.f0) {
                                    z17 = tL_chatAdminRights.ban_users;
                                    z11 = tL_chatAdminRights2.ban_users;
                                } else if (R == rqVar.g0) {
                                    z17 = tL_chatAdminRights.invite_users;
                                    z11 = tL_chatAdminRights2.invite_users;
                                } else if (R == rqVar.h0) {
                                    z17 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages) {
                                    }
                                    z11 = false;
                                } else if (R == rqVar.i0) {
                                    z17 = tL_chatAdminRights.manage_ranks;
                                    z11 = tL_chatAdminRights2.manage_ranks;
                                } else if (R == rqVar.K0) {
                                    z17 = tL_chatAdminRights.manage_call;
                                    z11 = tL_chatAdminRights2.manage_call;
                                } else if (R == rqVar.d0) {
                                    z17 = tL_chatAdminRights.add_admins;
                                    z11 = tL_chatAdminRights2.add_admins;
                                } else if (R == rqVar.e0) {
                                    z17 = tL_chatAdminRights.anonymous;
                                    if (!tL_chatAdminRights2.anonymous) {
                                        TLRPC.Chat chat2 = rqVar.w;
                                        if (chat2 != null) {
                                        }
                                        z11 = false;
                                    }
                                    z11 = true;
                                } else if (R == rqVar.m0) {
                                    z17 = tL_chatAdminRights.manage_topics;
                                    z11 = tL_chatAdminRights2.manage_topics;
                                } else if (R == rqVar.n0) {
                                    z17 = tL_chatAdminRights.manage_linked_peers;
                                    z11 = tL_chatAdminRights2.manage_linked_peers;
                                } else {
                                    z11 = false;
                                    z17 = false;
                                }
                                org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) childAt;
                                w8Var2.setChecked(z17);
                                w8Var2.b(z11, true);
                                i19++;
                                z15 = false;
                            } else if ((R != rqVar.X || tL_chatBannedRights2.change_info) && ((R != rqVar.h0 || tL_chatBannedRights2.pin_messages) && (R != rqVar.i0 || tL_chatBannedRights2.edit_rank))) {
                                org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) childAt;
                                w8Var3.setChecked(z15);
                                w8Var3.b(R == rqVar.W, true);
                            } else {
                                org.telegram.ui.Cells.w8 w8Var4 = (org.telegram.ui.Cells.w8) childAt;
                                w8Var4.setChecked(true);
                                w8Var4.b(z15, z15);
                            }
                        }
                        i19++;
                        z15 = false;
                    }
                    rqVar.a.l();
                    org.telegram.ui.Components.o6 o6Var = rqVar.f;
                    if (o6Var != null) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.em.l(R.string.AddBotButton, " ", sb2);
                        sb2.append(LocaleController.getString(rqVar.K ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                        o6Var.c(sb2.toString(), true, rqVar.K);
                    }
                    ValueAnimator valueAnimator = rqVar.c1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        rqVar.c1 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(rqVar.J, rqVar.K ? 1.0f : 0.0f);
                    rqVar.c1 = ofFloat;
                    ofFloat.addUpdateListener(new iq(rqVar, 1));
                    rqVar.c1.setDuration((long) (Math.abs(rqVar.J - (rqVar.K ? 1.0f : 0.0f)) * 200.0f));
                    rqVar.c1.start();
                } else if (i10 == rqVar.X) {
                    if (i11 == 0 || i11 == 2) {
                        z16 = !tL_chatAdminRights.change_info;
                        tL_chatAdminRights.change_info = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights14 = rqVar.O;
                        z16 = !tL_chatBannedRights14.change_info;
                        tL_chatBannedRights14.change_info = z16;
                    }
                } else if (i10 == rqVar.Y) {
                    z16 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z16;
                } else if (i10 == rqVar.k0) {
                    org.telegram.ui.Components.d5.v0(rqVar, LocaleController.getString(R.string.ApproveNewMembersTitle), AndroidUtilities.replaceTags(LocaleController.formatString(z16 ? z14 ? R.string.ApproveNewMembersDisabledMessageChannel : R.string.ApproveNewMembersDisabledMessageGroup : z14 ? R.string.ApproveNewMembersMessageChannel : R.string.ApproveNewMembersMessageGroup, DialogObject.getShortName(user))), LocaleController.getString(!z16 ? R.string.ApproveNewMembersEnable : R.string.ApproveNewMembersDisable), false, new hq(rqVar, !z16 ? user.id : 0L, 1));
                } else if (i10 == rqVar.a0) {
                    z16 = !tL_chatAdminRights.manage_welcome_messages;
                    tL_chatAdminRights.manage_welcome_messages = z16;
                } else if (i10 == rqVar.Z) {
                    z16 = !tL_chatAdminRights.manage_direct_messages;
                    tL_chatAdminRights.manage_direct_messages = z16;
                } else if (i10 == rqVar.b0) {
                    z16 = !tL_chatAdminRights.edit_messages;
                    tL_chatAdminRights.edit_messages = z16;
                } else if (i10 == rqVar.c0) {
                    z16 = !tL_chatAdminRights.delete_messages;
                    tL_chatAdminRights.delete_messages = z16;
                } else if (i10 == rqVar.d0) {
                    z16 = !tL_chatAdminRights.add_admins;
                    tL_chatAdminRights.add_admins = z16;
                } else if (i10 == rqVar.e0) {
                    z16 = !tL_chatAdminRights.anonymous;
                    tL_chatAdminRights.anonymous = z16;
                } else if (i10 == rqVar.f0) {
                    z16 = !tL_chatAdminRights.ban_users;
                    tL_chatAdminRights.ban_users = z16;
                } else if (i10 == rqVar.K0) {
                    z16 = !tL_chatAdminRights.manage_call;
                    tL_chatAdminRights.manage_call = z16;
                } else if (i10 == rqVar.m0) {
                    if (i11 == 0 || i11 == 2) {
                        z16 = !tL_chatAdminRights.manage_topics;
                        tL_chatAdminRights.manage_topics = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights15 = rqVar.O;
                        z16 = !tL_chatBannedRights15.manage_topics;
                        tL_chatBannedRights15.manage_topics = z16;
                    }
                } else if (i10 == rqVar.n0) {
                    if (i11 == 0 || i11 == 2) {
                        z16 = !tL_chatAdminRights.manage_linked_peers;
                        tL_chatAdminRights.manage_linked_peers = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights16 = rqVar.O;
                        z16 = !tL_chatBannedRights16.manage_linked_peers;
                        tL_chatBannedRights16.manage_linked_peers = z16;
                    }
                } else if (i10 == rqVar.g0) {
                    if (i11 == 0 || i11 == 2) {
                        z16 = !tL_chatAdminRights.invite_users;
                        tL_chatAdminRights.invite_users = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights17 = rqVar.O;
                        z16 = !tL_chatBannedRights17.invite_users;
                        tL_chatBannedRights17.invite_users = z16;
                    }
                } else if (i10 == rqVar.h0) {
                    if (i11 == 0 || i11 == 2) {
                        z16 = !tL_chatAdminRights.pin_messages;
                        tL_chatAdminRights.pin_messages = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights18 = rqVar.O;
                        z16 = !tL_chatBannedRights18.pin_messages;
                        tL_chatBannedRights18.pin_messages = z16;
                    }
                } else if (i10 == rqVar.i0) {
                    if (i11 == 0 || i11 == 2) {
                        z16 = !tL_chatAdminRights.manage_ranks;
                        tL_chatAdminRights.manage_ranks = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights19 = rqVar.O;
                        z16 = !tL_chatBannedRights19.edit_rank;
                        tL_chatBannedRights19.edit_rank = z16;
                    }
                } else if (i11 == 1 && (tL_chatBannedRights = rqVar.O) != null) {
                    if (i10 == rqVar.y0) {
                        z10 = !tL_chatBannedRights.send_plain;
                        tL_chatBannedRights.send_plain = z10;
                    } else {
                        z10 = z16;
                    }
                    if (z16 && ((!tL_chatBannedRights.send_plain || !tL_chatBannedRights.embed_links || !tL_chatBannedRights.send_inline || !tL_chatBannedRights.send_photos || !tL_chatBannedRights.send_videos || !tL_chatBannedRights.send_audios || !tL_chatBannedRights.send_docs || !tL_chatBannedRights.send_voices || !tL_chatBannedRights.send_roundvideos || !tL_chatBannedRights.send_polls || !tL_chatBannedRights.send_reactions) && tL_chatBannedRights.view_messages)) {
                        tL_chatBannedRights.view_messages = false;
                    }
                    int i20 = rqVar.J0;
                    if (i20 >= 0) {
                        rqVar.a.m(i20);
                    }
                    int i21 = rqVar.z0;
                    if (i21 >= 0) {
                        rqVar.a.m(i21);
                    }
                    z16 = z10;
                    if (i11 == 2) {
                        w8Var.setChecked(rqVar.K && z16);
                    }
                    rqVar.u0(true);
                }
                if (i11 == 2) {
                }
                rqVar.u0(true);
            }
        }
    }

    public static void Y(rq rqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        boolean z10 = rqVar.E;
        TLRPC.User user = rqVar.v;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                rqVar.X0.a(user);
                rqVar.removeSelfFromStack();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (rqVar.getParentActivity() == null) {
            return;
        }
        int i10 = 5;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rqVar.getParentActivity());
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                if (z10) {
                    d2Var.R = LocaleController.getString(R.string.EditAdminChannelTransfer);
                } else {
                    d2Var.R = LocaleController.getString(R.string.EditAdminGroupTransfer);
                }
                d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, rqVar.w.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new gq(rqVar, i10));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                rqVar.showDialog(d2Var);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(rqVar.currentAccount).sendRequest(new TL_account.getPassword(), new bi.o2(27, rqVar, twoStepVerificationActivity), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.Components.d5.h0(tL_error, rqVar, z10, rqVar.F, tL_channels_editCreator);
                return;
            }
            if (rqVar.getParentActivity() == null || AccountInstance.getInstance(rqVar.currentAccount).getUserConfig().isPremium()) {
                rqVar.presentFragment(new xe1(1));
                return;
            } else {
                rqVar.showDialog(new qg.k0(5, rqVar.currentAccount, rqVar.getParentActivity(), rqVar, null));
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rqVar.getParentActivity());
        String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
        d2Var2.R = string;
        LinearLayout linearLayout = new LinearLayout(rqVar.getParentActivity());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(rqVar.getParentActivity());
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z10) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(user))));
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", R.string.EditAdminTransferAlertText, UserObject.getFirstName(user))));
        }
        linearLayout.addView(textView, w7.a6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(rqVar.getParentActivity());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(rqVar.getParentActivity());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(rqVar.getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.a2.n(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, w7.a6.n(-1, -2));
            linearLayout2.addView(imageView, w7.a6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.a6.n(-2, -2));
            linearLayout2.addView(textView2, w7.a6.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(rqVar.getParentActivity());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(rqVar.getParentActivity());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(rqVar.getParentActivity());
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.a2.n(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, w7.a6.n(-1, -2));
            linearLayout3.addView(imageView2, w7.a6.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, w7.a6.n(-2, -2));
            linearLayout3.addView(textView3, w7.a6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new gq(rqVar, 6));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(rqVar.getParentActivity());
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
        }
        rqVar.showDialog(d2Var2);
    }

    public static void Z(rq rqVar, long j3) {
        TLRPC.ChatFull chatFull = rqVar.x;
        long j10 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User user = j10 != 0 ? rqVar.getMessagesController().getUser(Long.valueOf(j10)) : null;
        if (user != null && j3 != 0 && user.id != j3) {
            new org.telegram.ui.Components.g40(rqVar.getParentActivity(), rqVar.resourceProvider, user, rqVar.v, new hq(rqVar, j3, 0)).show();
            return;
        }
        rqVar.n = j3;
        rqVar.r = true;
        rqVar.n0();
    }

    public static /* synthetic */ void a0(rq rqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            rqVar.s = j3;
            rqVar.w = MessagesController.getInstance(rqVar.currentAccount).getChat(Long.valueOf(j3));
            rqVar.p0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void f0(rq rqVar, View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            String str = rqVar.S;
            int codePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (codePointCount > 4.8f) {
                m4Var.setText2("");
                return;
            }
            m4Var.setText2(String.format("%d", Integer.valueOf(codePointCount)));
            org.telegram.ui.ActionBar.l5 textView2 = m4Var.getTextView2();
            int i10 = codePointCount < 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.A6;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            textView2.setTag(Integer.valueOf(i10));
        }
    }

    public static boolean l0(rq rqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = rqVar.P;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public static TLRPC.TL_chatAdminRights o0(boolean z10) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z10;
        tL_chatAdminRights.manage_ranks = z10;
        tL_chatAdminRights.manage_welcome_messages = z10;
        tL_chatAdminRights.manage_direct_messages = z10;
        tL_chatAdminRights.delete_stories = z10;
        tL_chatAdminRights.edit_stories = z10;
        tL_chatAdminRights.post_stories = z10;
        tL_chatAdminRights.manage_topics = z10;
        tL_chatAdminRights.manage_call = z10;
        tL_chatAdminRights.add_admins = z10;
        tL_chatAdminRights.pin_messages = z10;
        tL_chatAdminRights.invite_users = z10;
        tL_chatAdminRights.ban_users = z10;
        tL_chatAdminRights.delete_messages = z10;
        tL_chatAdminRights.edit_messages = z10;
        tL_chatAdminRights.post_messages = z10;
        tL_chatAdminRights.change_info = z10;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights s0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z10 = true;
        tL_chatAdminRights3.change_info = tL_chatAdminRights.change_info || tL_chatAdminRights2.change_info;
        tL_chatAdminRights3.post_messages = tL_chatAdminRights.post_messages || tL_chatAdminRights2.post_messages;
        tL_chatAdminRights3.edit_messages = tL_chatAdminRights.edit_messages || tL_chatAdminRights2.edit_messages;
        tL_chatAdminRights3.delete_messages = tL_chatAdminRights.delete_messages || tL_chatAdminRights2.delete_messages;
        tL_chatAdminRights3.ban_users = tL_chatAdminRights.ban_users || tL_chatAdminRights2.ban_users;
        tL_chatAdminRights3.invite_users = tL_chatAdminRights.invite_users || tL_chatAdminRights2.invite_users;
        tL_chatAdminRights3.pin_messages = tL_chatAdminRights.pin_messages || tL_chatAdminRights2.pin_messages;
        tL_chatAdminRights3.manage_ranks = tL_chatAdminRights.manage_ranks || tL_chatAdminRights2.manage_ranks;
        tL_chatAdminRights3.add_admins = tL_chatAdminRights.add_admins || tL_chatAdminRights2.add_admins;
        tL_chatAdminRights3.manage_call = tL_chatAdminRights.manage_call || tL_chatAdminRights2.manage_call;
        tL_chatAdminRights3.manage_topics = tL_chatAdminRights.manage_topics || tL_chatAdminRights2.manage_topics;
        tL_chatAdminRights3.post_stories = tL_chatAdminRights.post_stories || tL_chatAdminRights2.post_stories;
        tL_chatAdminRights3.edit_stories = tL_chatAdminRights.edit_stories || tL_chatAdminRights2.edit_stories;
        tL_chatAdminRights3.delete_stories = tL_chatAdminRights.delete_stories || tL_chatAdminRights2.delete_stories;
        tL_chatAdminRights3.manage_direct_messages = tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights2.manage_direct_messages;
        tL_chatAdminRights3.manage_welcome_messages = tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights2.manage_welcome_messages;
        if (!tL_chatAdminRights.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
            z10 = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z10;
        return tL_chatAdminRights3;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.y;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 4));
        boolean z10 = false;
        if (this.I || (!this.E && this.w.creator && UserObject.isUserSelf(this.v))) {
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i11 = org.telegram.ui.ActionBar.j6.v8;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            this.h = new org.telegram.ui.Components.vr(mutate, new org.telegram.ui.Components.zp(org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
            n10.h(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            n10.k(1).setIcon(this.h);
        }
        t7 t7Var = new t7(this, context, 1);
        this.fragmentView = t7Var;
        t7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        bi.y1 y1Var = new bi.y1(this, context, 7);
        this.b = y1Var;
        y1Var.setClipChildren(i10 != 2);
        fg.a0 a0Var = new fg.a0(r1, z10, 5);
        this.c = a0Var;
        a0Var.E = 100;
        this.b.setLayoutManager(a0Var);
        bi.y1 y1Var2 = this.b;
        qq qqVar = new qq(this, context);
        this.a = qqVar;
        y1Var2.setAdapter(qqVar);
        s4.j jVar = new s4.j();
        if (i10 == 2) {
            this.b.setResetSelectorOnChanged(false);
        }
        jVar.m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.n(350L);
        this.b.setItemAnimator(jVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.b, w7.a6.c(-1.0f, -1));
        this.b.o1();
        this.actionBar.setAdaptiveBackground(this.b);
        int i12 = 6;
        this.b.setOnScrollListener(new j3(this, i12));
        this.b.setOnItemClickListener(new ai.b0(i12, this, context));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.w;
            if (chat == null || chatFull.id != chat.id) {
                return;
            }
            this.x = chatFull;
            n0();
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                if (f5Var == null || f5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 9);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.ab.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.d9.class, org.telegram.ui.Cells.e6.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"nameTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ab.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 8192, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 16384, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.E5));
        return arrayList;
    }

    public final boolean m0(boolean z10) {
        int i10 = this.y;
        if (i10 != 2) {
            if (!(i10 == 1 ? this.R.equals(ChatObject.getBannedRightsString(this.O)) : this.T.equals(this.S))) {
                int i11 = 0;
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.R = string;
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.s)).title));
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new gq(this, i11));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new gq(this, 4));
                    showDialog(d2Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void n0() {
        boolean z10;
        TLRPC.User user;
        int i10 = this.k0;
        if (i10 >= 0) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) this.c.m(i10);
            if (w8Var == null) {
                this.a.m(this.k0);
                return;
            }
            TLRPC.ChatFull chatFull = this.x;
            if (chatFull != null && (user = this.v) != null) {
                if ((this.r ? this.n : chatFull.guard_bot_id) == user.id) {
                    z10 = true;
                    w8Var.setChecked(z10);
                }
            }
            z10 = false;
            w8Var.setChecked(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z10) {
        return m0(z10);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        qq qqVar = this.a;
        if (qqVar != null) {
            qqVar.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.w)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.s, this, new a7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.w)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.w;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = getMessagesController().getInputUser(this.v);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new bi.l9(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 5));
    }

    public final boolean q0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
        boolean z10 = tL_chatAdminRights.change_info;
        boolean z11 = this.G;
        if (z10 && tL_chatAdminRights.delete_messages && tL_chatAdminRights.ban_users && tL_chatAdminRights.invite_users && tL_chatAdminRights.pin_messages && tL_chatAdminRights.manage_ranks && ((!z11 || tL_chatAdminRights.manage_topics) && tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous)) {
            return true;
        }
        if (z10 || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks) {
            return false;
        }
        return ((z11 && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r1.codePointCount(0, r1.length()) > 16) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r0.q0() == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(boolean z10) {
        String str;
        rq rqVar = this;
        if (rqVar.H) {
            return;
        }
        boolean isChannel = ChatObject.isChannel(rqVar.w);
        int i10 = rqVar.y;
        int i11 = 2;
        if (!isChannel) {
            if (i10 != 1) {
                if (i10 == 0) {
                    if (rqVar.q0()) {
                        if (rqVar.v0 != -1) {
                            String str2 = rqVar.S;
                        }
                    }
                }
                if (i10 == 2) {
                    if (rqVar.S == null) {
                    }
                }
            }
            MessagesController.getInstance(rqVar.currentAccount).convertToMegaGroup(rqVar.getParentActivity(), rqVar.s, rqVar, new gq(rqVar, 7));
            return;
        }
        boolean z11 = rqVar.F;
        TLRPC.User user = rqVar.v;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = rqVar.M;
        if (z10 && z11 && !rqVar.L && tL_chatAdminRights.manage_linked_peers && tL_chatAdminRights.change_info) {
            org.telegram.ui.Components.d5.v0(rqVar, LocaleController.getString(R.string.CommunityMakeAdminTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CommunityMakeAdminMessage, DialogObject.getShortName(user))), LocaleController.getString(R.string.CommunityMakeAdminPromote), false, new jq(rqVar, r6));
            return;
        }
        if (rqVar.v0 != -1 && (str = rqVar.S) != null && str.codePointCount(0, str.length()) > 16) {
            rqVar.b.x0(rqVar.v0);
            Vibrator vibrator = (Vibrator) rqVar.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            s4.c1 K = rqVar.b.K(rqVar.v0);
            if (K != null) {
                AndroidUtilities.shakeView(K.a);
                return;
            }
            return;
        }
        if (i10 == 0 || i10 == 2) {
            boolean z12 = rqVar.E;
            if (z12) {
                tL_chatAdminRights.pin_messages = false;
                tL_chatAdminRights.manage_ranks = false;
            } else {
                tL_chatAdminRights.edit_messages = false;
                tL_chatAdminRights.post_messages = false;
            }
            if (tL_chatAdminRights.change_info || tL_chatAdminRights.post_messages || tL_chatAdminRights.edit_messages || tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || ((rqVar.G && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous || tL_chatAdminRights.manage_call || (z12 && (tL_chatAdminRights.post_stories || tL_chatAdminRights.edit_stories || tL_chatAdminRights.delete_stories)))) {
                tL_chatAdminRights.other = false;
            } else {
                tL_chatAdminRights.other = true;
            }
        }
        if (i10 == 0) {
            int i12 = rqVar.X0 == null ? 1 : 0;
            rqVar.t0(true);
            MessagesController.getInstance(rqVar.currentAccount).setUserAdminRole(rqVar.s, rqVar.v, rqVar.M, rqVar.S, rqVar.E, rqVar, (!rqVar.Z0 || z11) ? 0 : 1, false, null, new jq(rqVar, i11), new gq(rqVar, 8));
            rqVar = rqVar;
            r6 = i12;
        } else {
            if (i10 == 1) {
                if (rqVar.v0 >= 0) {
                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                    tL_messages_editChatParticipantRank.peer = MessagesController.getInputPeer(rqVar.w);
                    tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
                    String str3 = rqVar.S;
                    tL_messages_editChatParticipantRank.rank = str3 != null ? str3 : "";
                    ConnectionsManager.getInstance(rqVar.currentAccount).sendRequest(tL_messages_editChatParticipantRank, null);
                }
                MessagesController.getInstance(rqVar.currentAccount).setParticipantBannedRole(rqVar.s, rqVar.v, null, rqVar.O, rqVar.E, rqVar.getFragmentForAlert(1));
                TLRPC.TL_chatBannedRights tL_chatBannedRights = rqVar.O;
                if (tL_chatBannedRights.send_messages || tL_chatBannedRights.send_stickers || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_media || tL_chatBannedRights.send_gifs || tL_chatBannedRights.send_games || tL_chatBannedRights.send_inline) {
                    i11 = 1;
                } else {
                    tL_chatBannedRights.until_date = 0;
                }
                oq oqVar = rqVar.X0;
                if (oqVar != null) {
                    oqVar.b(i11, tL_chatAdminRights, tL_chatBannedRights, rqVar.S);
                }
            } else if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rqVar.getParentActivity());
                String string = rqVar.K ? LocaleController.getString(R.string.AddBotAdmin) : LocaleController.getString(R.string.AddBot);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.R = string;
                boolean z13 = ChatObject.isChannel(rqVar.w) && !rqVar.w.megagroup;
                TLRPC.Chat chat = rqVar.w;
                String str4 = chat != null ? chat.title : "";
                d2Var.T = AndroidUtilities.replaceTags(rqVar.K ? z13 ? LocaleController.formatString(R.string.AddBotMessageAdminChannel, str4) : LocaleController.formatString(R.string.AddBotMessageAdminGroup, str4) : LocaleController.formatString(R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(rqVar.K ? R.string.AddAsAdmin : R.string.AddBot), new gq(rqVar, r6));
                rqVar.showDialog(d2Var);
                r6 = 0;
            }
        }
        if (r6 != 0) {
            rqVar.finishFragment();
        }
    }

    public final void t0(boolean z10) {
        ValueAnimator valueAnimator = this.b1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = z10;
        this.actionBar.getBackButton().setEnabled(!this.H);
        org.telegram.ui.Components.vr vrVar = this.h;
        if (vrVar != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(vrVar.c, this.H ? 1.0f : 0.0f);
            this.b1 = ofFloat;
            ofFloat.addUpdateListener(new iq(this, 0));
            this.b1.addListener(new org.telegram.ui.Cells.v5(this, 14));
            this.b1.setDuration((long) (Math.abs(this.h.c - (this.H ? 1.0f : 0.0f)) * 150.0f));
            this.b1.start();
        }
    }

    public final void u0(boolean z10) {
        int i10;
        int min = Math.min(this.s0, this.t0);
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.N0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.x0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.V = 3;
        boolean z11 = this.F;
        boolean z12 = this.E;
        boolean z13 = this.G;
        int i11 = this.y;
        if (i11 == 0 || i11 == 2) {
            if (z11) {
                this.X = 3;
                this.n0 = 4;
                this.d0 = 5;
                this.V = 7;
                this.f0 = 6;
            } else if (z12) {
                this.X = 3;
                this.V = 5;
                this.N0 = 4;
                if (this.O0) {
                    this.P0 = 5;
                    this.Q0 = 6;
                    this.V = 8;
                    this.R0 = 7;
                }
                int i12 = this.V;
                int i13 = i12 + 1;
                this.V = i13;
                this.S0 = i12;
                if (this.T0) {
                    this.U0 = i13;
                    this.V0 = i12 + 2;
                    this.V = i12 + 4;
                    this.W0 = i12 + 3;
                }
                int i14 = this.V;
                this.Z = i14;
                this.a0 = i14 + 1;
                this.g0 = i14 + 2;
                this.K0 = i14 + 3;
                this.d0 = i14 + 4;
                this.V = i14 + 6;
                this.f0 = i14 + 5;
            } else {
                if (i11 == 2) {
                    this.V = 4;
                    this.W = 3;
                }
                int i15 = this.V;
                this.X = i15;
                this.c0 = i15 + 1;
                this.f0 = i15 + 2;
                this.g0 = i15 + 3;
                int i16 = i15 + 5;
                this.V = i16;
                this.h0 = i15 + 4;
                if (i11 != 2) {
                    this.V = i15 + 6;
                    this.i0 = i16;
                }
                if (ChatObject.isChannel(this.w)) {
                    int i17 = this.V;
                    int i18 = i17 + 1;
                    this.V = i18;
                    this.S0 = i17;
                    if (this.T0) {
                        this.U0 = i18;
                        this.V0 = i17 + 2;
                        this.V = i17 + 4;
                        this.W0 = i17 + 3;
                    }
                }
                int i19 = this.V;
                this.a0 = i19;
                this.K0 = i19 + 1;
                this.d0 = i19 + 2;
                int i20 = i19 + 4;
                this.V = i20;
                this.e0 = i19 + 3;
                if (z13) {
                    this.V = i19 + 5;
                    this.m0 = i20;
                }
                if (this.U) {
                    int i21 = this.V;
                    this.k0 = i21;
                    this.V = i21 + 2;
                    this.l0 = i21 + 1;
                }
            }
        } else if (i11 == 1) {
            this.y0 = 3;
            this.V = 5;
            this.z0 = 4;
            if (this.A0) {
                this.B0 = 5;
                this.C0 = 6;
                this.E0 = 7;
                this.D0 = 8;
                this.F0 = 9;
                this.G0 = 10;
                this.H0 = 11;
                this.I0 = 12;
                this.J0 = 13;
                this.V = 15;
                this.j0 = 14;
            }
            int i22 = this.V;
            this.g0 = i22;
            this.h0 = i22 + 1;
            this.i0 = i22 + 2;
            int i23 = i22 + 4;
            this.V = i23;
            this.X = i22 + 3;
            if (z13) {
                this.V = i22 + 5;
                this.m0 = i23;
            }
            int i24 = this.V;
            this.L0 = i24;
            this.V = i24 + 2;
            this.M0 = i24 + 1;
        }
        boolean z14 = this.I;
        TLRPC.User user = this.v;
        if (z14) {
            if (!z12 && (i11 == 0 || ((i11 == 2 && this.K) || i11 == 1))) {
                int i25 = this.V;
                this.o0 = i25;
                this.v0 = i25 + 1;
                this.V = i25 + 3;
                this.w0 = i25 + 2;
            }
            TLRPC.Chat chat = this.w;
            if (chat != null && chat.creator && i11 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i26 = this.o0;
                        if (i26 == -1) {
                            int i27 = this.V;
                            this.V = i27 + 1;
                            this.s0 = i27;
                        }
                        int i28 = this.V;
                        int i29 = i28 + 1;
                        this.V = i29;
                        this.t0 = i28;
                        if (i26 != -1) {
                            this.V = i28 + 2;
                            this.s0 = i29;
                        }
                    }
                }
            }
            if (this.a1) {
                if (this.o0 == -1) {
                    int i30 = this.V;
                    this.V = i30 + 1;
                    this.o0 = i30;
                }
                int i31 = this.V;
                this.p0 = i31;
                this.V = i31 + 2;
                this.q0 = i31 + 1;
            }
        } else if (i11 != 0) {
            int i32 = this.V;
            this.V = i32 + 1;
            this.o0 = i32;
        } else if (z12 || (this.S.isEmpty() && !(this.w.creator && UserObject.isUserSelf(user)))) {
            int i33 = this.V;
            this.V = i33 + 1;
            this.r0 = i33;
        } else {
            int i34 = this.V;
            this.o0 = i34;
            this.V = i34 + 2;
            this.v0 = i34 + 1;
            if (this.w.creator && UserObject.isUserSelf(user)) {
                int i35 = this.V;
                this.V = i35 + 1;
                this.w0 = i35;
            } else {
                int i36 = this.V;
                this.V = i36 + 1;
                this.r0 = i36;
            }
        }
        if (i11 == 2) {
            int i37 = this.V;
            this.V = i37 + 1;
            this.x0 = i37;
        }
        if (z10) {
            if (min == -1 && (i10 = this.s0) != -1) {
                this.a.s(Math.min(i10, this.t0), 2);
            } else {
                if (min == -1 || this.s0 != -1) {
                    return;
                }
                this.a.t(min, 2);
            }
        }
    }
}
