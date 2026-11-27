// default package

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
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
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class pd2 extends e implements fn7 {
    public int A0;
    public boolean B0;
    public int C0;
    public int D0;
    public final int E;
    public int E0;
    public final boolean F;
    public int F0;
    public final boolean G;
    public int G0;
    public final boolean H;
    public int H0;
    public boolean I;
    public int I0;
    public final boolean J;
    public int J0;
    public float K;
    public int K0;
    public boolean L;
    public int L0;
    public final boolean M;
    public int M0;
    public final TLRPC.TL_chatAdminRights N;
    public int N0;
    public final TLRPC.TL_chatAdminRights O;
    public int O0;
    public TLRPC.TL_chatBannedRights P;
    public boolean P0;
    public final TLRPC.TL_chatBannedRights Q;
    public int Q0;
    public boolean R;
    public int R0;
    public final String S;
    public int S0;
    public String T;
    public int T0;
    public final String U;
    public boolean U0;
    public final boolean V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public md2 Y0;
    public int Z;
    public final String Z0;
    public od2 a;
    public int a0;
    public final boolean a1;
    public gu b;
    public int b0;
    public final boolean b1;
    public as c;
    public int c0;
    public ValueAnimator c1;
    public FrameLayout d;
    public int d0;
    public FrameLayout e;
    public int e0;
    public in f;
    public int f0;
    public int g0;
    public nla h;
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
    public int v0;
    public final TLRPC.User w;
    public int w0;
    public TLRPC.Chat x;
    public int x0;
    public TLRPC.ChatFull y;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd2(long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i, boolean z, boolean z2, String str2) {
        super(null);
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z3;
        boolean z4;
        TLRPC.UserFull Y1;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        this.I = false;
        this.K = 0.0f;
        this.L = false;
        this.M = false;
        this.S = "";
        this.a1 = z2;
        this.s = j2;
        TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(j));
        this.w = X1;
        this.E = i;
        this.J = z;
        boolean z5 = true;
        boolean z6 = !z;
        this.U0 = z6;
        this.P0 = z6;
        this.Z0 = str2;
        this.x = getMessagesController().M0(Long.valueOf(this.s));
        this.y = getMessagesController().N0(this.s);
        this.V = X1 != null && X1.bot_guard;
        String str3 = str != null ? str : "";
        this.T = str3;
        this.U = str3;
        this.G = xc2.Y(this.x);
        TLRPC.Chat chat = this.x;
        if (chat != null) {
            this.F = xc2.T(chat) && !this.x.megagroup;
            this.H = xc2.c0(this.x);
            chat = this.x;
            this.O = chat.admin_rights;
        }
        if (this.O == null) {
            this.O = d0(i != 2 || (chat != null && chat.creator));
        }
        if (i == 0 || i == 2) {
            if (i == 2 && (Y1 = getMessagesController().Y1(j)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights4 = this.F ? Y1.bot_broadcast_admin_rights : Y1.bot_group_admin_rights;
                if (tL_chatAdminRights4 != null) {
                    if (tL_chatAdminRights3 == null) {
                        tL_chatAdminRights3 = tL_chatAdminRights4;
                    } else {
                        tL_chatAdminRights3.ban_users = tL_chatAdminRights3.ban_users || tL_chatAdminRights4.ban_users;
                        tL_chatAdminRights3.add_admins = tL_chatAdminRights3.add_admins || tL_chatAdminRights4.add_admins;
                        tL_chatAdminRights3.post_messages = tL_chatAdminRights3.post_messages || tL_chatAdminRights4.post_messages;
                        tL_chatAdminRights3.pin_messages = tL_chatAdminRights3.pin_messages || tL_chatAdminRights4.pin_messages;
                        tL_chatAdminRights3.manage_ranks = tL_chatAdminRights3.manage_ranks || tL_chatAdminRights4.manage_ranks;
                        tL_chatAdminRights3.delete_messages = tL_chatAdminRights3.delete_messages || tL_chatAdminRights4.delete_messages;
                        tL_chatAdminRights3.change_info = tL_chatAdminRights3.change_info || tL_chatAdminRights4.change_info;
                        tL_chatAdminRights3.anonymous = tL_chatAdminRights3.anonymous || tL_chatAdminRights4.anonymous;
                        tL_chatAdminRights3.edit_messages = tL_chatAdminRights3.edit_messages || tL_chatAdminRights4.edit_messages;
                        tL_chatAdminRights3.manage_call = tL_chatAdminRights3.manage_call || tL_chatAdminRights4.manage_call;
                        tL_chatAdminRights3.manage_topics = tL_chatAdminRights3.manage_topics || tL_chatAdminRights4.manage_topics;
                        tL_chatAdminRights3.post_stories = tL_chatAdminRights3.post_stories || tL_chatAdminRights4.post_stories;
                        tL_chatAdminRights3.edit_stories = tL_chatAdminRights3.edit_stories || tL_chatAdminRights4.edit_stories;
                        tL_chatAdminRights3.delete_stories = tL_chatAdminRights3.delete_stories || tL_chatAdminRights4.delete_stories;
                        tL_chatAdminRights3.manage_direct_messages = tL_chatAdminRights3.manage_direct_messages || tL_chatAdminRights4.manage_direct_messages;
                        tL_chatAdminRights3.manage_welcome_messages = tL_chatAdminRights3.manage_welcome_messages || tL_chatAdminRights4.manage_welcome_messages;
                        tL_chatAdminRights3.manage_linked_peers = tL_chatAdminRights3.manage_linked_peers || tL_chatAdminRights4.manage_linked_peers;
                        tL_chatAdminRights3.other = tL_chatAdminRights3.other || tL_chatAdminRights4.other;
                    }
                }
            }
            if (tL_chatAdminRights3 == null) {
                this.M = false;
                if (i == 2) {
                    tL_chatAdminRights2 = d0(false);
                    this.N = tL_chatAdminRights2;
                    boolean z7 = this.F;
                    this.L = z7;
                    this.K = z7 ? 1.0f : 0.0f;
                    this.b1 = false;
                } else {
                    tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
                    this.N = tL_chatAdminRights2;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.O;
                    tL_chatAdminRights2.change_info = tL_chatAdminRights5.change_info;
                    tL_chatAdminRights2.post_messages = tL_chatAdminRights5.post_messages;
                    tL_chatAdminRights2.edit_messages = tL_chatAdminRights5.edit_messages;
                    tL_chatAdminRights2.delete_messages = tL_chatAdminRights5.delete_messages;
                    tL_chatAdminRights2.manage_call = tL_chatAdminRights5.manage_call;
                    tL_chatAdminRights2.ban_users = tL_chatAdminRights5.ban_users;
                    tL_chatAdminRights2.invite_users = tL_chatAdminRights5.invite_users;
                    tL_chatAdminRights2.pin_messages = tL_chatAdminRights5.pin_messages;
                    tL_chatAdminRights2.manage_ranks = tL_chatAdminRights5.manage_ranks;
                    tL_chatAdminRights2.manage_topics = tL_chatAdminRights5.manage_topics;
                    tL_chatAdminRights2.post_stories = tL_chatAdminRights5.post_stories;
                    tL_chatAdminRights2.edit_stories = tL_chatAdminRights5.edit_stories;
                    tL_chatAdminRights2.delete_stories = tL_chatAdminRights5.delete_stories;
                    tL_chatAdminRights2.manage_direct_messages = tL_chatAdminRights5.manage_direct_messages;
                    tL_chatAdminRights2.manage_welcome_messages = tL_chatAdminRights5.manage_welcome_messages;
                    tL_chatAdminRights2.manage_linked_peers = tL_chatAdminRights5.manage_linked_peers;
                    tL_chatAdminRights2.other = tL_chatAdminRights5.other;
                    this.b1 = false;
                }
            } else {
                this.M = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.N = tL_chatAdminRights6;
                boolean z8 = tL_chatAdminRights3.change_info;
                tL_chatAdminRights6.change_info = z8;
                boolean z9 = tL_chatAdminRights3.post_messages;
                tL_chatAdminRights6.post_messages = z9;
                boolean z10 = tL_chatAdminRights3.edit_messages;
                tL_chatAdminRights6.edit_messages = z10;
                boolean z11 = tL_chatAdminRights3.delete_messages;
                tL_chatAdminRights6.delete_messages = z11;
                boolean z12 = tL_chatAdminRights3.manage_call;
                tL_chatAdminRights6.manage_call = z12;
                boolean z13 = tL_chatAdminRights3.ban_users;
                tL_chatAdminRights6.ban_users = z13;
                boolean z14 = tL_chatAdminRights3.invite_users;
                tL_chatAdminRights6.invite_users = z14;
                boolean z15 = tL_chatAdminRights3.pin_messages;
                tL_chatAdminRights6.pin_messages = z15;
                boolean z16 = tL_chatAdminRights3.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z16;
                boolean z17 = tL_chatAdminRights3.manage_topics;
                tL_chatAdminRights6.manage_topics = z17;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights3.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights3.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights3.delete_stories;
                boolean z18 = tL_chatAdminRights3.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z18;
                boolean z19 = tL_chatAdminRights3.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z19;
                boolean z20 = tL_chatAdminRights3.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z20;
                boolean z21 = tL_chatAdminRights3.add_admins;
                tL_chatAdminRights6.add_admins = z21;
                boolean z22 = tL_chatAdminRights3.anonymous;
                tL_chatAdminRights6.anonymous = z22;
                boolean z23 = tL_chatAdminRights3.other;
                tL_chatAdminRights6.other = z23;
                boolean z24 = z8 || z9 || z18 || z19 || z10 || z11 || z13 || z14 || z20 || z15 || z16 || z21 || z12 || z22 || z17 || z23;
                this.b1 = z24;
                if (i == 2) {
                    boolean z25 = this.F || z24;
                    this.L = z25;
                    this.K = z25 ? 1.0f : 0.0f;
                    this.b1 = false;
                }
                tL_chatAdminRights2 = tL_chatAdminRights6;
            }
            TLRPC.Chat chat2 = this.x;
            if (chat2 != null) {
                this.Q = chat2.default_banned_rights;
            }
            if (this.Q == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                this.Q = tL_chatBannedRights4;
                tL_chatBannedRights4.view_messages = false;
                tL_chatBannedRights4.send_media = false;
                tL_chatBannedRights4.send_messages = false;
                tL_chatBannedRights4.embed_links = false;
                tL_chatBannedRights4.send_stickers = false;
                tL_chatBannedRights4.send_gifs = false;
                tL_chatBannedRights4.send_games = false;
                tL_chatBannedRights4.send_inline = false;
                tL_chatBannedRights4.send_polls = false;
                tL_chatBannedRights4.invite_users = false;
                tL_chatBannedRights4.change_info = false;
                tL_chatBannedRights4.pin_messages = false;
                tL_chatBannedRights4.manage_topics = false;
                tL_chatBannedRights4.send_plain = false;
                tL_chatBannedRights4.send_videos = false;
                tL_chatBannedRights4.send_photos = false;
                tL_chatBannedRights4.send_audios = false;
                tL_chatBannedRights4.send_docs = false;
                tL_chatBannedRights4.send_voices = false;
                tL_chatBannedRights4.send_roundvideos = false;
                tL_chatBannedRights4.edit_rank = false;
                tL_chatBannedRights4.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.Q;
            if (tL_chatBannedRights5.change_info || this.F) {
                z3 = true;
            } else {
                z3 = true;
                tL_chatAdminRights2.change_info = true;
            }
            if (!tL_chatBannedRights5.pin_messages) {
                tL_chatAdminRights2.pin_messages = z3;
            }
            z4 = false;
        } else {
            if (i == 1) {
                this.Q = tL_chatBannedRights;
                if (tL_chatBannedRights == null) {
                    tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    this.Q = tL_chatBannedRights3;
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
                } else {
                    tL_chatBannedRights3 = tL_chatBannedRights;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights6 = new TLRPC.TL_chatBannedRights();
                this.P = tL_chatBannedRights6;
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
                    tL_chatBannedRights6 = this.P;
                    tL_chatBannedRights6.send_plain = tL_chatBannedRights2.send_plain;
                    tL_chatBannedRights6.edit_rank = tL_chatBannedRights2.edit_rank;
                    tL_chatBannedRights6.send_reactions = tL_chatBannedRights2.send_reactions;
                }
                if (tL_chatBannedRights3.view_messages) {
                    tL_chatBannedRights6.view_messages = true;
                }
                if (tL_chatBannedRights3.send_messages) {
                    tL_chatBannedRights6.send_messages = true;
                }
                if (tL_chatBannedRights3.send_media) {
                    tL_chatBannedRights6.send_media = true;
                }
                if (tL_chatBannedRights3.send_stickers) {
                    tL_chatBannedRights6.send_stickers = true;
                }
                if (tL_chatBannedRights3.send_gifs) {
                    tL_chatBannedRights6.send_gifs = true;
                }
                if (tL_chatBannedRights3.send_games) {
                    tL_chatBannedRights6.send_games = true;
                }
                if (tL_chatBannedRights3.send_inline) {
                    tL_chatBannedRights6.send_inline = true;
                }
                if (tL_chatBannedRights3.embed_links) {
                    tL_chatBannedRights6.embed_links = true;
                }
                if (tL_chatBannedRights3.send_polls) {
                    tL_chatBannedRights6.send_polls = true;
                }
                if (tL_chatBannedRights3.invite_users) {
                    tL_chatBannedRights6.invite_users = true;
                }
                if (tL_chatBannedRights3.change_info) {
                    tL_chatBannedRights6.change_info = true;
                }
                if (tL_chatBannedRights3.pin_messages) {
                    tL_chatBannedRights6.pin_messages = true;
                }
                if (tL_chatBannedRights3.edit_rank) {
                    tL_chatBannedRights6.edit_rank = true;
                }
                if (tL_chatBannedRights3.send_reactions) {
                    tL_chatBannedRights6.send_reactions = true;
                }
                if (tL_chatBannedRights3.manage_topics) {
                    tL_chatBannedRights6.manage_topics = true;
                }
                if (tL_chatBannedRights3.send_photos) {
                    tL_chatBannedRights6.send_photos = true;
                }
                if (tL_chatBannedRights3.send_videos) {
                    tL_chatBannedRights6.send_videos = true;
                }
                if (tL_chatBannedRights3.send_audios) {
                    tL_chatBannedRights6.send_audios = true;
                }
                if (tL_chatBannedRights3.send_docs) {
                    tL_chatBannedRights6.send_docs = true;
                }
                if (tL_chatBannedRights3.send_voices) {
                    tL_chatBannedRights6.send_voices = true;
                }
                if (tL_chatBannedRights3.send_roundvideos) {
                    tL_chatBannedRights6.send_roundvideos = true;
                }
                if (tL_chatBannedRights3.send_plain) {
                    tL_chatBannedRights6.send_plain = true;
                }
                this.S = xc2.D(tL_chatBannedRights6);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z5 = false;
                }
                this.b1 = z5;
            }
            z4 = false;
        }
        r0(z4);
    }

    public static TLRPC.TL_chatAdminRights d0(boolean z) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z;
        tL_chatAdminRights.manage_ranks = z;
        tL_chatAdminRights.manage_welcome_messages = z;
        tL_chatAdminRights.manage_direct_messages = z;
        tL_chatAdminRights.delete_stories = z;
        tL_chatAdminRights.edit_stories = z;
        tL_chatAdminRights.post_stories = z;
        tL_chatAdminRights.manage_topics = z;
        tL_chatAdminRights.manage_call = z;
        tL_chatAdminRights.add_admins = z;
        tL_chatAdminRights.pin_messages = z;
        tL_chatAdminRights.invite_users = z;
        tL_chatAdminRights.ban_users = z;
        tL_chatAdminRights.delete_messages = z;
        tL_chatAdminRights.edit_messages = z;
        tL_chatAdminRights.post_messages = z;
        tL_chatAdminRights.change_info = z;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights o0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z = true;
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
            z = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z;
        return tL_chatAdminRights3;
    }

    public final boolean a0() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.Q;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.E5));
        hashSet.add(Integer.valueOf(aob.D5));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.H6));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final boolean b0(boolean z) {
        int i = this.E;
        if (i != 2) {
            if (!(i == 1 ? this.S.equals(xc2.D(this.P)) : this.U.equals(this.T))) {
                byte b = 0;
                if (z) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = ob6.M0(2131743381, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = hl.S2(ob6.a0("UserRestrictionsApplyChangesText", null, 2131743380, uc7.s1(this.currentAccount).M0(Long.valueOf(this.s)).title));
                    alertDialog$Builder.j(ob6.M0(2131754209, null), new gd2(this, b));
                    alertDialog$Builder.g(ob6.M0(2131747307, null), new gd2(this, (byte) 4));
                    showDialog(idVar);
                }
                return false;
            }
        }
        return true;
    }

    public final void c0() {
        boolean z;
        TLRPC.User user;
        int i = this.l0;
        if (i >= 0) {
            vkb vkbVar = (vkb) this.c.m(i);
            if (vkbVar == null) {
                this.a.g(this.l0);
                return;
            }
            TLRPC.ChatFull chatFull = this.y;
            if (chatFull != null && (user = this.w) != null) {
                if ((this.r ? this.n : chatFull.guard_bot_id) == user.id) {
                    z = true;
                    vkbVar.setChecked(z);
                }
            }
            z = false;
            vkbVar.setChecked(z);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        jla jlaVar = this.simpleActionBar;
        int i2 = this.E;
        if (i2 == 0) {
            jlaVar.setTitle(ob6.M0(2131751297, null));
        } else if (i2 == 2) {
            jlaVar.setTitle(ob6.M0(2131754456, null));
        } else {
            jlaVar.setTitle(ob6.M0(2131743382, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 28));
        if (this.J || (!this.F && this.x.creator && lbc.D(this.w))) {
            this.h = this.simpleActionBar.u(ob6.M0(2131745674, null));
        }
        z71 z71Var = new z71(this, context, (byte) 1);
        this.fragmentView = z71Var;
        z71Var.setFocusableInTouchMode(true);
        gu guVar = new gu((byte) 12, context, (Object) this);
        this.b = guVar;
        boolean z = false;
        guVar.setClipChildren(i2 != 2);
        as asVar = new as((byte) 4, i, z);
        this.c = asVar;
        asVar.E = (byte) 100;
        this.b.setLayoutManager(asVar);
        gu guVar2 = this.b;
        od2 od2Var = new od2(this, context);
        this.a = od2Var;
        guVar2.setAdapter(od2Var);
        zb3 zb3Var = new zb3();
        if (i2 == 2) {
            this.b.setResetSelectorOnChanged(false);
        }
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.b.setItemAnimator(zb3Var);
        this.b.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        z71Var.addView(this.b, tre.c(-1.0f, -1));
        this.b.s1();
        this.b.setOnScrollListener(new y(this, (byte) 24));
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new l0(this, context, (byte) 10));
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.x;
            if (chat == null || chatFull.id != chat.id) {
                return;
            }
            this.y = chatFull;
            c0();
            return;
        }
        if (i == jn7.y1) {
            if ((-this.s) == ((Long) objArr[0]).longValue()) {
                wk5 wk5Var = this.parentLayout;
                if (wk5Var == null || wk5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    public final void e0(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (tL_inputCheckPasswordSRP != null && !xc2.T(this.x)) {
            uc7.s1(this.currentAccount).R(getParentActivity(), this.s, this, new ie((Object) this, (Object) tL_inputCheckPasswordSRP, (Object) twoStepVerificationActivity, (byte) 29), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (xc2.T(this.x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.x;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = tL_inputCheckPasswordSRP != null ? tL_inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = getMessagesController().q1(this.w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new au0((Object) this, (Object) tL_inputCheckPasswordSRP, (Object) twoStepVerificationActivity, (Object) tL_channels_editCreator, (byte) 4));
    }

    public final boolean f0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
        boolean z = tL_chatAdminRights.change_info;
        boolean z2 = this.H;
        if (z && tL_chatAdminRights.delete_messages && tL_chatAdminRights.ban_users && tL_chatAdminRights.invite_users && tL_chatAdminRights.pin_messages && tL_chatAdminRights.manage_ranks && ((!z2 || tL_chatAdminRights.manage_topics) && tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous)) {
            return true;
        }
        if (z || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks) {
            return false;
        }
        return ((z2 && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous) ? false : true;
    }

    public final void g0(z8d z8dVar, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == 0) {
            this.P.until_date = 0;
            this.a.g(this.N0);
        } else if (intValue == 1) {
            this.P.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 86400;
            this.a.g(this.N0);
        } else if (intValue == 2) {
            this.P.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 604800;
            this.a.g(this.N0);
        } else if (intValue != 3) {
            byte b = 4;
            if (intValue == 4) {
                Calendar calendar = Calendar.getInstance();
                try {
                    DatePickerDialog datePickerDialog = new DatePickerDialog(getParentActivity(), new DatePickerDialog.OnDateSetListener() { // from class: jd2
                        @Override // android.app.DatePickerDialog.OnDateSetListener
                        public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                            final pd2 pd2Var = pd2.this;
                            pd2Var.getClass();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.clear();
                            calendar2.set(i, i2, i3);
                            final int time = (int) (calendar2.getTime().getTime() / 1000);
                            try {
                                TimePickerDialog timePickerDialog = new TimePickerDialog(pd2Var.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: ld2
                                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                                    public final void onTimeSet(TimePicker timePicker, int i4, int i5) {
                                        pd2 pd2Var2 = pd2.this;
                                        pd2Var2.P.until_date = (i5 * 60) + (i4 * 3600) + time;
                                        pd2Var2.a.g(pd2Var2.N0);
                                    }
                                }, 0, 0, true);
                                timePickerDialog.setButton(-1, ob6.M0(2131745278, null), timePickerDialog);
                                timePickerDialog.setButton(-2, ob6.M0(2131752570, null), new kd2());
                                pd2Var.showDialog(timePickerDialog);
                            } catch (Exception e) {
                                cc4.g(e, true);
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
                    datePickerDialog.setButton(-1, ob6.M0(2131745278, null), datePickerDialog);
                    datePickerDialog.setButton(-2, ob6.M0(2131752570, null), new kd2());
                    datePickerDialog.setOnShowListener(new ig(datePicker, b));
                    showDialog(datePickerDialog);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        } else {
            this.P.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 2592000;
            this.a.g(this.N0);
        }
        ((nx0) z8dVar.b).y0.run();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        da2 da2Var = new da2(this, (byte) 1);
        arrayList.add(new apb(this.b, 0, new Class[]{vkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.U6));
        arrayList.add(new apb(this.b, 0, new Class[]{vkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.V6));
        arrayList.add(new apb(this.b, 262144, new Class[]{mf5.class}, new String[]{"textView2"}, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb(this.b, 0, new Class[]{uac.class}, new String[]{"statusColor"}, (Drawable[]) null, da2Var, aob.y6));
        arrayList.add(new apb(this.b, 0, new Class[]{uac.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, da2Var, aob.n6));
        arrayList.add(new apb((View) null, 0, new Class[]{cg3.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.q5));
        return arrayList;
    }

    public final void h0(long j) {
        TLRPC.ChatFull chatFull = this.y;
        long j2 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User X1 = j2 != 0 ? getMessagesController().X1(Long.valueOf(j2)) : null;
        if (X1 != null && j != 0 && X1.id != j) {
            new xd5(getParentActivity(), this.resourceProvider, X1, this.w, new hd2(this, j, (byte) 0)).show();
            return;
        }
        this.n = j;
        this.r = true;
        c0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0481, code lost:
    
        if (r8.change_info != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x04d5, code lost:
    
        if (r8.pin_messages != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0503, code lost:
    
        if (r7.creator == false) goto L294;
     */
    /* JADX WARN: Removed duplicated region for block: B:343:0x075f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(Context context, View view, int i) {
        vkb vkbVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        TLRPC.Chat chat;
        boolean z5;
        boolean z6;
        boolean z7;
        View m;
        boolean z8 = this.J;
        int i2 = this.E;
        if (z8 || (this.x.creator && i2 == 0 && i == this.f0)) {
            if (i == this.A0) {
                if (!(view instanceof vkb) || ((vkb) view).isEnabled()) {
                    this.B0 = !this.B0;
                    r0(false);
                    this.a.g(this.A0);
                    boolean z9 = this.B0;
                    od2 od2Var = this.a;
                    int i3 = this.A0 + 1;
                    if (z9) {
                        od2Var.p(i3, 10);
                        return;
                    } else {
                        od2Var.q(i3, 10);
                        return;
                    }
                }
                return;
            }
            int i4 = this.O0;
            if (i == i4) {
                if (!(view instanceof vkb) || ((vkb) view).isEnabled()) {
                    this.P0 = !this.P0;
                    r0(false);
                    this.a.g(this.O0);
                    boolean z10 = this.P0;
                    od2 od2Var2 = this.a;
                    int i5 = this.O0 + 1;
                    if (z10) {
                        od2Var2.p(i5, 3);
                        return;
                    } else {
                        od2Var2.q(i5, 3);
                        return;
                    }
                }
                return;
            }
            int i6 = this.T0;
            if (i == i6) {
                if (!(view instanceof vkb) || ((vkb) view).isEnabled()) {
                    this.U0 = !this.U0;
                    r0(false);
                    this.a.g(this.T0);
                    boolean z11 = this.U0;
                    od2 od2Var3 = this.a;
                    int i7 = this.T0 + 1;
                    if (z11) {
                        od2Var3.p(i7, 3);
                        return;
                    } else {
                        od2Var3.q(i7, 3);
                        return;
                    }
                }
                return;
            }
            TLRPC.User user = this.w;
            if (i == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            int i8 = this.q0;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
            if (i == i8) {
                if (i2 == 0) {
                    uc7.s1(this.currentAccount).d5(this.s, this.w, new TLRPC.TL_chatAdminRights(), this.T, this.F, getFragmentForAlert(0), this.a1, false, null, null, null);
                    md2 md2Var = this.Y0;
                    if (md2Var != null) {
                        md2Var.b(0, tL_chatAdminRights, this.P, this.T);
                    }
                    finishFragment();
                    return;
                }
                if (i2 == 1) {
                    this.R = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = new TLRPC.TL_chatBannedRights();
                    this.P = tL_chatBannedRights2;
                    tL_chatBannedRights2.view_messages = true;
                    tL_chatBannedRights2.send_media = true;
                    tL_chatBannedRights2.send_messages = true;
                    tL_chatBannedRights2.send_stickers = true;
                    tL_chatBannedRights2.send_gifs = true;
                    tL_chatBannedRights2.send_games = true;
                    tL_chatBannedRights2.send_inline = true;
                    tL_chatBannedRights2.embed_links = true;
                    tL_chatBannedRights2.pin_messages = true;
                    tL_chatBannedRights2.edit_rank = true;
                    tL_chatBannedRights2.send_reactions = true;
                    tL_chatBannedRights2.send_polls = true;
                    tL_chatBannedRights2.invite_users = true;
                    tL_chatBannedRights2.change_info = true;
                    tL_chatBannedRights2.manage_topics = true;
                    tL_chatBannedRights2.until_date = 0;
                    n0(true);
                    return;
                }
                return;
            }
            if (i == this.u0) {
                e0(null, null);
                return;
            }
            if (i == this.N0) {
                if (getParentActivity() != null) {
                    z8d z8dVar = new z8d(context, (vnb) null);
                    ((nx0) z8dVar.b).v0 = false;
                    LinearLayout j = uh9.j(context, 1);
                    mf5 mf5Var = new mf5(context, aob.n5, 23, 15, false, null);
                    mf5Var.setHeight(47);
                    mf5Var.setText(ob6.M0(2131743369, null));
                    j.addView(mf5Var);
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    int i9 = -2;
                    j.addView(linearLayout, tre.o(-1, -2));
                    hx0[] hx0VarArr = new hx0[5];
                    int i10 = 0;
                    for (int i11 = 5; i10 < i11; i11 = 5) {
                        hx0 hx0Var = new hx0(0, null, context);
                        hx0VarArr[i10] = hx0Var;
                        hx0Var.setPadding(hl.L(7.0f), 0, hl.L(7.0f), 0);
                        hx0VarArr[i10].setTag(Integer.valueOf(i10));
                        hx0VarArr[i10].setBackgroundDrawable(aob.L0(false));
                        hx0VarArr[i10].a(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? ob6.M0(2131743370, null) : ob6.G(1, "Months", new Object[0]) : ob6.G(1, "Weeks", new Object[0]) : ob6.G(1, "Days", new Object[0]) : ob6.M0(2131743339, null), 0, null, false);
                        linearLayout.addView(hx0VarArr[i10], tre.o(-1, i9));
                        hx0VarArr[i10].setOnClickListener(new sb1((Object) this, (Object) z8dVar, (byte) 19));
                        i10++;
                        i9 = -2;
                    }
                    nx0 nx0Var = (nx0) z8dVar.b;
                    nx0Var.O = j;
                    showDialog(nx0Var);
                    return;
                }
                return;
            }
            boolean z12 = view instanceof sg2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.Q;
            if (z12) {
                sg2 sg2Var = (sg2) view;
                int i12 = this.Q0;
                if (i == i12 || i == this.R0 || i == this.S0) {
                    if (i == i12) {
                        z5 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z5;
                    } else if (i == this.R0) {
                        z5 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z5;
                    } else {
                        z5 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z5;
                    }
                    this.a.g(i4);
                    sg2Var.c(z5, true);
                    return;
                }
                int i13 = this.V0;
                if (i == i13 || i == this.W0 || i == this.X0) {
                    if (i == i13) {
                        z6 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z6;
                    } else if (i == this.W0) {
                        z6 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z6;
                    } else {
                        z6 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z6;
                    }
                    this.a.g(i6);
                    sg2Var.c(z6, true);
                    return;
                }
                if (i2 != 1 || this.P == null) {
                    return;
                }
                sg2Var.b();
                if (sg2Var.r.b != null) {
                    if (i2 != 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = ob6.M0(2131743374, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131743373, null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        idVar.show();
                        return;
                    }
                    return;
                }
                if (i == this.C0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.P;
                    z7 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z7;
                } else if (i == this.D0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.P;
                    z7 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z7;
                } else if (i == this.E0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.P;
                    z7 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z7;
                } else if (i == this.k0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.P;
                    z7 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z7;
                } else if (i == this.F0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.P;
                    z7 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z7;
                } else if (i == this.H0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = this.P;
                    z7 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z7;
                } else if (i == this.G0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = this.P;
                    z7 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z7;
                } else if (i == this.I0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = this.P;
                    z7 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z7;
                    tL_chatBannedRights11.send_gifs = z7;
                    tL_chatBannedRights11.send_games = z7;
                    tL_chatBannedRights11.send_stickers = z7;
                } else if (i == this.K0) {
                    if ((this.P.send_plain || tL_chatBannedRights3.send_plain) && (m = this.c.m(this.z0)) != null) {
                        hl.B3(m);
                        yw0.E.a();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = this.P;
                        z7 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z7;
                    }
                } else if (i == this.J0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = this.P;
                    z7 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z7;
                } else {
                    z7 = false;
                }
                this.a.g(this.A0);
                sg2Var.c(!z7, true);
                return;
            }
            if (view instanceof vkb) {
                vkb vkbVar2 = (vkb) view;
                Switch r2 = vkbVar2.d;
                if (r2.G != null) {
                    if (i2 != 2) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        String M02 = ob6.M0(2131743374, null);
                        id idVar2 = alertDialog$Builder2.a;
                        idVar2.S = M02;
                        idVar2.U = ob6.M0(2131743373, null);
                        alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                        idVar2.show();
                        return;
                    }
                    return;
                }
                if (!vkbVar2.isEnabled()) {
                    if (i2 == 2 || i2 == 0) {
                        if ((i != this.Y || tL_chatBannedRights3 == null || tL_chatBannedRights3.change_info) && ((i != this.i0 || tL_chatBannedRights3 == null || tL_chatBannedRights3.pin_messages) && (i != this.j0 || tL_chatBannedRights3 == null || tL_chatBannedRights3.edit_rank))) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                        String M03 = ob6.M0(2131743374, null);
                        id idVar3 = alertDialog$Builder3.a;
                        idVar3.S = M03;
                        idVar3.U = ob6.M0(2131743372, null);
                        alertDialog$Builder3.j(ob6.M0(2131747558, null), null);
                        idVar3.show();
                        return;
                    }
                    return;
                }
                if (i2 != 2 && i != this.l0) {
                    vkbVar2.setChecked(!r2.h);
                }
                boolean z13 = r2.h;
                if (i == this.X) {
                    z13 = !this.L;
                    this.L = z13;
                    FrameLayout frameLayout = this.e;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = this.b.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = this.b.getChildAt(i14);
                        this.b.getClass();
                        int S = RecyclerView.S(childAt);
                        if (childAt instanceof vkb) {
                            boolean z14 = this.L;
                            if (z14) {
                                int i15 = this.X;
                                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = this.O;
                                if (S == i15) {
                                    z4 = tL_chatAdminRights2.add_admins || ((chat = this.x) != null && chat.creator);
                                    z3 = z14;
                                } else if (S == this.Y) {
                                    z3 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info) {
                                    }
                                    z4 = false;
                                } else if (S == this.Z) {
                                    z3 = tL_chatAdminRights.post_messages;
                                    z4 = tL_chatAdminRights2.post_messages;
                                } else if (S == this.a0) {
                                    z3 = tL_chatAdminRights.manage_direct_messages;
                                    z4 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (S == this.b0) {
                                    z3 = tL_chatAdminRights.manage_welcome_messages;
                                    z4 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (S == this.c0) {
                                    z3 = tL_chatAdminRights.edit_messages;
                                    z4 = tL_chatAdminRights2.edit_messages;
                                } else if (S == this.d0) {
                                    z3 = tL_chatAdminRights.delete_messages;
                                    z4 = tL_chatAdminRights2.delete_messages;
                                } else if (S == this.g0) {
                                    z3 = tL_chatAdminRights.ban_users;
                                    z4 = tL_chatAdminRights2.ban_users;
                                } else if (S == this.h0) {
                                    z3 = tL_chatAdminRights.invite_users;
                                    z4 = tL_chatAdminRights2.invite_users;
                                } else if (S == this.i0) {
                                    z3 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages) {
                                    }
                                    z4 = false;
                                } else if (S == this.j0) {
                                    z3 = tL_chatAdminRights.manage_ranks;
                                    z4 = tL_chatAdminRights2.manage_ranks;
                                } else if (S == this.L0) {
                                    z3 = tL_chatAdminRights.manage_call;
                                    z4 = tL_chatAdminRights2.manage_call;
                                } else if (S == this.e0) {
                                    z3 = tL_chatAdminRights.add_admins;
                                    z4 = tL_chatAdminRights2.add_admins;
                                } else {
                                    if (S == this.f0) {
                                        z3 = tL_chatAdminRights.anonymous;
                                        if (!tL_chatAdminRights2.anonymous) {
                                            TLRPC.Chat chat2 = this.x;
                                            if (chat2 != null) {
                                            }
                                        }
                                        z4 = true;
                                    } else if (S == this.n0) {
                                        z3 = tL_chatAdminRights.manage_topics;
                                        z4 = tL_chatAdminRights2.manage_topics;
                                    } else if (S == this.o0) {
                                        z3 = tL_chatAdminRights.manage_linked_peers;
                                        z4 = tL_chatAdminRights2.manage_linked_peers;
                                    } else {
                                        z3 = false;
                                    }
                                    z4 = false;
                                }
                                vkb vkbVar3 = (vkb) childAt;
                                vkbVar3.setChecked(z3);
                                vkbVar3.b(z4, true);
                            } else if ((S != this.Y || tL_chatBannedRights3.change_info) && ((S != this.i0 || tL_chatBannedRights3.pin_messages) && (S != this.j0 || tL_chatBannedRights3.edit_rank))) {
                                vkb vkbVar4 = (vkb) childAt;
                                vkbVar4.setChecked(false);
                                vkbVar4.b(S == this.X, true);
                            } else {
                                vkb vkbVar5 = (vkb) childAt;
                                vkbVar5.setChecked(true);
                                vkbVar5.b(false, false);
                            }
                        }
                    }
                    this.a.f();
                    in inVar = this.f;
                    if (inVar != null) {
                        StringBuilder sb = new StringBuilder(ob6.M0(2131754452, null));
                        sb.append(" ");
                        sb.append(ob6.M0(this.L ? 2131754451 : 2131754450, null));
                        inVar.c(sb.toString(), true, this.L);
                    }
                    ValueAnimator valueAnimator = this.c1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.c1 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, this.L ? 1.0f : 0.0f);
                    this.c1 = ofFloat;
                    ofFloat.addUpdateListener(new az1(this, (byte) 7));
                    this.c1.setDuration((long) (Math.abs(this.K - (this.L ? 1.0f : 0.0f)) * 200.0f));
                    this.c1.start();
                } else if (i != this.Y) {
                    if (i != this.Z) {
                        if (i == this.l0) {
                            String t = wf3.t(user);
                            String M04 = ob6.M0(2131754175, null);
                            String M05 = ob6.M0(!z13 ? 2131754184 : 2131754193, null);
                            boolean z15 = this.F;
                            SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, z13 ? z15 ? 2131754186 : 2131754185 : z15 ? 2131754177 : 2131754176, t));
                            hd2 hd2Var = new hd2(this, !z13 ? user.id : 0L, (byte) 1);
                            vkbVar = vkbVar2;
                            jj.s0(this, M04, S2, M05, false, hd2Var);
                        } else {
                            vkbVar = vkbVar2;
                            if (i == this.b0) {
                                z13 = !tL_chatAdminRights.manage_welcome_messages;
                                tL_chatAdminRights.manage_welcome_messages = z13;
                            } else if (i == this.a0) {
                                z13 = !tL_chatAdminRights.manage_direct_messages;
                                tL_chatAdminRights.manage_direct_messages = z13;
                            } else if (i == this.c0) {
                                z13 = !tL_chatAdminRights.edit_messages;
                                tL_chatAdminRights.edit_messages = z13;
                            } else if (i == this.d0) {
                                z13 = !tL_chatAdminRights.delete_messages;
                                tL_chatAdminRights.delete_messages = z13;
                            } else if (i == this.e0) {
                                z13 = !tL_chatAdminRights.add_admins;
                                tL_chatAdminRights.add_admins = z13;
                            } else if (i == this.f0) {
                                z13 = !tL_chatAdminRights.anonymous;
                                tL_chatAdminRights.anonymous = z13;
                            } else if (i == this.g0) {
                                z13 = !tL_chatAdminRights.ban_users;
                                tL_chatAdminRights.ban_users = z13;
                            } else if (i == this.L0) {
                                z13 = !tL_chatAdminRights.manage_call;
                                tL_chatAdminRights.manage_call = z13;
                            } else if (i == this.n0) {
                                if (i2 == 0 || i2 == 2) {
                                    z13 = !tL_chatAdminRights.manage_topics;
                                    tL_chatAdminRights.manage_topics = z13;
                                } else {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights14 = this.P;
                                    z13 = !tL_chatBannedRights14.manage_topics;
                                    tL_chatBannedRights14.manage_topics = z13;
                                }
                            } else if (i == this.o0) {
                                if (i2 == 0 || i2 == 2) {
                                    z13 = !tL_chatAdminRights.manage_linked_peers;
                                    tL_chatAdminRights.manage_linked_peers = z13;
                                } else {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights15 = this.P;
                                    z13 = !tL_chatBannedRights15.manage_linked_peers;
                                    tL_chatBannedRights15.manage_linked_peers = z13;
                                }
                            } else if (i == this.h0) {
                                if (i2 == 0 || i2 == 2) {
                                    z13 = !tL_chatAdminRights.invite_users;
                                    tL_chatAdminRights.invite_users = z13;
                                } else {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights16 = this.P;
                                    z13 = !tL_chatBannedRights16.invite_users;
                                    tL_chatBannedRights16.invite_users = z13;
                                }
                            } else if (i == this.i0) {
                                if (i2 == 0 || i2 == 2) {
                                    z13 = !tL_chatAdminRights.pin_messages;
                                    tL_chatAdminRights.pin_messages = z13;
                                } else {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights17 = this.P;
                                    z13 = !tL_chatBannedRights17.pin_messages;
                                    tL_chatBannedRights17.pin_messages = z13;
                                }
                            } else if (i == this.j0) {
                                if (i2 == 0 || i2 == 2) {
                                    z13 = !tL_chatAdminRights.manage_ranks;
                                    tL_chatAdminRights.manage_ranks = z13;
                                } else {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights18 = this.P;
                                    z13 = !tL_chatBannedRights18.edit_rank;
                                    tL_chatBannedRights18.edit_rank = z13;
                                }
                            } else if (i2 == 1 && (tL_chatBannedRights = this.P) != null) {
                                if (i == this.z0) {
                                    z = !tL_chatBannedRights.send_plain;
                                    tL_chatBannedRights.send_plain = z;
                                } else {
                                    z = z13;
                                }
                                if (!z13 || ((tL_chatBannedRights.send_plain && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_inline && tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) || !tL_chatBannedRights.view_messages)) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    tL_chatBannedRights.view_messages = false;
                                }
                                int i16 = this.K0;
                                if (i16 >= 0) {
                                    this.a.g(i16);
                                }
                                int i17 = this.A0;
                                if (i17 >= 0) {
                                    this.a.g(i17);
                                }
                                z13 = z;
                                if (i2 == 2) {
                                    vkbVar.setChecked((this.L && z13) ? true : z2);
                                }
                                r0(true);
                            }
                        }
                        z2 = false;
                        if (i2 == 2) {
                        }
                        r0(true);
                    }
                    z13 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z13;
                } else if (i2 == 0 || i2 == 2) {
                    z13 = !tL_chatAdminRights.change_info;
                    tL_chatAdminRights.change_info = z13;
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights19 = this.P;
                    z13 = !tL_chatBannedRights19.change_info;
                    tL_chatBannedRights19.change_info = z13;
                }
                vkbVar = vkbVar2;
                z2 = false;
                if (i2 == 2) {
                }
                r0(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final /* synthetic */ void j0(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j) {
        if (j != 0) {
            this.s = j;
            this.x = uc7.s1(this.currentAccount).M0(Long.valueOf(j));
            e0(tL_inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public final void k0(TLRPC.TL_error tL_error, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i;
        TLRPC.User user = this.w;
        if (tL_error == null) {
            if (tL_inputCheckPasswordSRP != null) {
                this.Y0.a(user);
                removeSelfFromStack();
                twoStepVerificationActivity.s0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (getParentActivity() != null) {
            boolean equals = "PASSWORD_HASH_INVALID".equals(tL_error.text);
            boolean z = this.F;
            byte b = 5;
            if (equals) {
                if (tL_inputCheckPasswordSRP == null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    id idVar = alertDialog$Builder.a;
                    if (z) {
                        idVar.S = ob6.M0(2131751287, null);
                    } else {
                        idVar.S = ob6.M0(2131751280, null);
                    }
                    idVar.U = hl.S2(ob6.a0(null, null, 2131751258, this.x.title, lbc.k(user, true)));
                    alertDialog$Builder.j(ob6.M0(2131751261, null), new gd2(this, b));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    showDialog(idVar);
                    return;
                }
                return;
            }
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ql(this, twoStepVerificationActivity, (byte) 22), 8);
                    return;
                }
                if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.s0();
                        twoStepVerificationActivity.finishFragment();
                    }
                    jj.e0(tL_error, this, z, this.G, tL_channels_editCreator);
                    return;
                }
                if (getParentActivity() == null || yac.h(k5.a(this.currentAccount).a).p()) {
                    presentFragment(new axb(1));
                    return;
                } else {
                    showDialog(new l46(5, this.currentAccount, null, getParentActivity(), this));
                    return;
                }
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131751262, null);
            id idVar2 = alertDialog$Builder2.a;
            idVar2.S = M0;
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setPadding(hl.L(24.0f), hl.L(2.0f), hl.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder2.n(linearLayout);
            TextView textView = new TextView(getParentActivity());
            int i2 = aob.j5;
            yob.X(textView, i2, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((ob6.a0 ? 5 : 3) | 48);
            if (z) {
                uh9.r("EditChannelAdminTransferAlertText", null, 2131751248, new Object[]{lbc.k(user, true)}, textView);
            } else {
                uh9.r("EditAdminTransferAlertText", null, 2131751266, new Object[]{lbc.k(user, true)}, textView);
            }
            linearLayout.addView(textView, tre.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getParentActivity());
            imageView.setImageResource(R.drawable.list_circle);
            imageView.setPadding(ob6.a0 ? hl.L(11.0f) : 0, hl.L(9.0f), ob6.a0 ? 0 : hl.L(11.0f), 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.s(imageView, i2, null, mode);
            TextView textView2 = new TextView(getParentActivity());
            yob.X(textView2, i2, null);
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((ob6.a0 ? 5 : 3) | 48);
            textView2.setText(hl.S2(ob6.M0(2131751265, null)));
            if (ob6.a0) {
                linearLayout2.addView(textView2, tre.o(-1, -2));
                linearLayout2.addView(imageView, tre.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, tre.o(-2, -2));
                linearLayout2.addView(textView2, tre.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getParentActivity());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getParentActivity());
            imageView2.setImageResource(R.drawable.list_circle);
            imageView2.setPadding(ob6.a0 ? hl.L(11.0f) : 0, hl.L(9.0f), ob6.a0 ? 0 : hl.L(11.0f), 0);
            yob.s(imageView2, i2, null, mode);
            TextView textView3 = new TextView(getParentActivity());
            yob.X(textView3, i2, null);
            textView3.setTextSize(1, 16.0f);
            textView3.setGravity((ob6.a0 ? 5 : 3) | 48);
            textView3.setText(hl.S2(ob6.M0(2131751264, null)));
            if (ob6.a0) {
                linearLayout3.addView(textView3, tre.o(-1, -2));
                i = 5;
                linearLayout3.addView(imageView2, tre.r(-2, -2, 5));
            } else {
                i = 5;
                linearLayout3.addView(imageView2, tre.o(-2, -2));
                linearLayout3.addView(textView3, tre.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder2.j(ob6.M0(2131751256, null), new gd2(this, (byte) 6));
                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
            } else {
                TextView textView4 = new TextView(getParentActivity());
                yob.X(textView4, i2, null);
                textView4.setTextSize(1, 16.0f);
                uh9.q(textView4, (ob6.a0 ? i : 3) | 48, null, 2131751263);
                linearLayout.addView(textView4, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder2.g(ob6.M0(2131747558, null), null);
            }
            showDialog(idVar2);
        }
    }

    public final void l0(long j) {
        if (j != 0) {
            this.s = j;
            this.x = uc7.s1(this.currentAccount).M0(Long.valueOf(j));
            n0(true);
        }
    }

    public final /* synthetic */ boolean m0(TLRPC.TL_error tL_error) {
        p0(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (!xc2.T(this.x)) {
            l46 l46Var = new l46(11, this.currentAccount, getResourceProvider(), getParentActivity(), this);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.w);
            l46Var.u1(this.x, arrayList, null, null, null);
            l46Var.show();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r1.codePointCount(0, r1.length()) > 16) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r0.f0() == false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(boolean z) {
        String str;
        pd2 pd2Var = this;
        if (pd2Var.I) {
            return;
        }
        boolean T = xc2.T(pd2Var.x);
        int i = pd2Var.E;
        byte b = 2;
        if (!T) {
            if (i != 1) {
                if (i == 0) {
                    if (pd2Var.f0()) {
                        if (pd2Var.w0 != -1) {
                            String str2 = pd2Var.T;
                        }
                    }
                }
                if (i == 2) {
                    if (pd2Var.T == null) {
                    }
                }
            }
            uc7.s1(pd2Var.currentAccount).R(pd2Var.getParentActivity(), pd2Var.s, pd2Var, new gd2(pd2Var, (byte) 7), null);
            return;
        }
        boolean z2 = pd2Var.G;
        TLRPC.User user = pd2Var.w;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = pd2Var.N;
        if (z && z2 && !pd2Var.M && tL_chatAdminRights.manage_linked_peers && tL_chatAdminRights.change_info) {
            jj.s0(pd2Var, ob6.M0(2131751884, null), hl.S2(ob6.a0(null, null, 2131751886, wf3.t(user))), ob6.M0(2131751885, null), false, new id2(pd2Var, r6));
            return;
        }
        if (pd2Var.w0 != -1 && (str = pd2Var.T) != null && str.codePointCount(0, str.length()) > 16) {
            pd2Var.b.A0(pd2Var.w0);
            Vibrator vibrator = (Vibrator) pd2Var.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            f89 L = pd2Var.b.L(pd2Var.w0);
            if (L != null) {
                hl.z3(L.a);
                return;
            }
            return;
        }
        if (i == 0 || i == 2) {
            boolean z3 = pd2Var.F;
            if (z3) {
                tL_chatAdminRights.pin_messages = false;
                tL_chatAdminRights.manage_ranks = false;
            } else {
                tL_chatAdminRights.edit_messages = false;
                tL_chatAdminRights.post_messages = false;
            }
            if (tL_chatAdminRights.change_info || tL_chatAdminRights.post_messages || tL_chatAdminRights.edit_messages || tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || ((pd2Var.H && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous || tL_chatAdminRights.manage_call || (z3 && (tL_chatAdminRights.post_stories || tL_chatAdminRights.edit_stories || tL_chatAdminRights.delete_stories)))) {
                tL_chatAdminRights.other = false;
            } else {
                tL_chatAdminRights.other = true;
            }
        }
        if (i == 0) {
            byte b2 = pd2Var.Y0 == null ? (byte) 1 : (byte) 0;
            pd2Var.p0(true);
            uc7.s1(pd2Var.currentAccount).d5(pd2Var.s, pd2Var.w, pd2Var.N, pd2Var.T, pd2Var.F, pd2Var, (!pd2Var.a1 || z2) ? (byte) 0 : (byte) 1, false, null, new id2(pd2Var, b), new gd2(pd2Var, (byte) 8));
            pd2Var = pd2Var;
            r6 = b2;
        } else {
            if (i == 1) {
                if (pd2Var.w0 >= 0) {
                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                    tL_messages_editChatParticipantRank.peer = uc7.l1(pd2Var.x);
                    tL_messages_editChatParticipantRank.participant = uc7.n1(user);
                    String str3 = pd2Var.T;
                    tL_messages_editChatParticipantRank.rank = str3 != null ? str3 : "";
                    ConnectionsManager.getInstance(pd2Var.currentAccount).sendRequest(tL_messages_editChatParticipantRank, null);
                }
                uc7.s1(pd2Var.currentAccount).a5(pd2Var.s, pd2Var.w, null, pd2Var.P, pd2Var.F, pd2Var.getFragmentForAlert(1), null);
                TLRPC.TL_chatBannedRights tL_chatBannedRights = pd2Var.P;
                if (tL_chatBannedRights.send_messages || tL_chatBannedRights.send_stickers || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_media || tL_chatBannedRights.send_gifs || tL_chatBannedRights.send_games || tL_chatBannedRights.send_inline) {
                    b = 1;
                } else {
                    tL_chatBannedRights.until_date = 0;
                }
                md2 md2Var = pd2Var.Y0;
                if (md2Var != null) {
                    md2Var.b(b, tL_chatAdminRights, tL_chatBannedRights, pd2Var.T);
                }
            } else if (i == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd2Var.getParentActivity());
                String M0 = pd2Var.L ? ob6.M0(2131754455, null) : ob6.M0(2131754456, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                boolean z4 = xc2.T(pd2Var.x) && !pd2Var.x.megagroup;
                TLRPC.Chat chat = pd2Var.x;
                String str4 = chat != null ? chat.title : "";
                idVar.U = hl.S2(pd2Var.L ? z4 ? ob6.a0(null, null, 2131754449, str4) : ob6.a0(null, null, 2131754448, str4) : ob6.a0(null, null, 2131754392, lbc.r(user), str4));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(pd2Var.L ? ob6.M0(2131754459, null) : ob6.M0(2131754456, null), new gd2(pd2Var, r6));
                pd2Var.showDialog(idVar);
                r6 = 0;
            }
        }
        if (r6 != 0) {
            pd2Var.finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        return b0(z);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.y1);
        getNotificationCenter().b(this, jn7.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.y1);
        getNotificationCenter().n(this, jn7.T);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        od2 od2Var = this.a;
        if (od2Var != null) {
            od2Var.f();
        }
        hl.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p0(boolean z) {
        this.I = z;
        this.simpleActionBar.getBackButton().setEnabled(!this.I);
        nla nlaVar = this.h;
        if (nlaVar != null) {
            nlaVar.b(this.I);
        }
    }

    public final void q0(View view) {
        if (view instanceof mf5) {
            mf5 mf5Var = (mf5) view;
            String str = this.T;
            int codePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (codePointCount > 4.8f) {
                mf5Var.setText2("");
                return;
            }
            mf5Var.setText2(String.format("%d", Integer.valueOf(codePointCount)));
            ema textView2 = mf5Var.getTextView2();
            int i = codePointCount < 0 ? aob.p7 : aob.A6;
            yob.W(textView2, i, null);
            textView2.setTag(Integer.valueOf(i));
        }
    }

    public final void r0(boolean z) {
        int i;
        int i2;
        int min = Math.min(this.t0, this.u0);
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
        this.m0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.O0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
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
        this.N0 = -1;
        this.y0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        int i3 = 3;
        this.W = 3;
        int i4 = 8;
        boolean z2 = this.G;
        boolean z3 = this.F;
        boolean z4 = this.H;
        int i5 = this.E;
        if (i5 == 0 || i5 == 2) {
            if (z2) {
                this.Y = 3;
                this.o0 = 4;
                this.e0 = 5;
                this.W = 7;
                this.g0 = 6;
                i3 = 7;
            } else if (z3) {
                this.Y = 3;
                this.W = 5;
                this.O0 = 4;
                if (this.P0) {
                    this.Q0 = 5;
                    this.R0 = 6;
                    this.W = 8;
                    this.S0 = 7;
                } else {
                    i4 = 5;
                }
                int i6 = i4 + 1;
                this.W = i6;
                this.T0 = i4;
                if (this.U0) {
                    this.V0 = i6;
                    int i7 = i4 + 3;
                    this.W0 = i4 + 2;
                    int i8 = i4 + 4;
                    this.W = i8;
                    this.X0 = i7;
                    i6 = i8;
                }
                this.a0 = i6;
                this.b0 = i6 + 1;
                this.h0 = i6 + 2;
                this.L0 = i6 + 3;
                int i9 = i6 + 5;
                this.e0 = i6 + 4;
                i3 = i6 + 6;
                this.W = i3;
                this.g0 = i9;
            } else {
                if (i5 == 2) {
                    this.W = 4;
                    this.X = 3;
                    i3 = 4;
                }
                this.Y = i3;
                this.d0 = i3 + 1;
                this.g0 = i3 + 2;
                this.h0 = i3 + 3;
                int i10 = i3 + 5;
                this.W = i10;
                this.i0 = i3 + 4;
                if (i5 != 2) {
                    this.W = i3 + 6;
                    this.j0 = i10;
                }
                if (xc2.T(this.x)) {
                    int i11 = this.W;
                    int i12 = i11 + 1;
                    this.W = i12;
                    this.T0 = i11;
                    if (this.U0) {
                        this.V0 = i12;
                        this.W0 = i11 + 2;
                        this.W = i11 + 4;
                        this.X0 = i11 + 3;
                    }
                }
                int i13 = this.W;
                this.b0 = i13;
                this.L0 = i13 + 1;
                this.e0 = i13 + 2;
                int i14 = i13 + 4;
                this.W = i14;
                this.f0 = i13 + 3;
                if (z4) {
                    i3 = i13 + 5;
                    this.W = i3;
                    this.n0 = i14;
                } else {
                    i3 = i14;
                }
                if (this.V) {
                    int i15 = i3 + 1;
                    this.l0 = i3;
                    i3 += 2;
                    this.W = i3;
                    this.m0 = i15;
                }
            }
        } else if (i5 == 1) {
            this.z0 = 3;
            this.W = 5;
            this.A0 = 4;
            if (this.B0) {
                this.C0 = 5;
                this.D0 = 6;
                this.F0 = 7;
                this.E0 = 8;
                this.G0 = 9;
                this.H0 = 10;
                this.I0 = 11;
                this.J0 = 12;
                this.K0 = 13;
                i2 = 15;
                this.W = 15;
                this.k0 = 14;
            } else {
                i2 = 5;
            }
            this.h0 = i2;
            this.i0 = i2 + 1;
            this.j0 = i2 + 2;
            int i16 = i2 + 4;
            this.W = i16;
            this.Y = i2 + 3;
            if (z4) {
                int i17 = i2 + 5;
                this.W = i17;
                this.n0 = i16;
                i16 = i17;
            }
            this.M0 = i16;
            int i18 = i16 + 2;
            this.W = i18;
            this.N0 = i16 + 1;
            i3 = i18;
        }
        boolean z5 = this.J;
        TLRPC.User user = this.w;
        if (z5) {
            if (!z3 && (i5 == 0 || ((i5 == 2 && this.L) || i5 == 1))) {
                this.p0 = i3;
                int i19 = i3 + 2;
                this.w0 = i3 + 1;
                i3 += 3;
                this.W = i3;
                this.x0 = i19;
            }
            TLRPC.Chat chat = this.x;
            if (chat != null && chat.creator && i5 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
                if (!z3 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z4 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z2) {
                        int i20 = this.p0;
                        if (i20 == -1) {
                            int i21 = i3 + 1;
                            this.W = i21;
                            this.t0 = i3;
                            i3 = i21;
                        }
                        int i22 = i3 + 1;
                        this.W = i22;
                        this.u0 = i3;
                        if (i20 != -1) {
                            i3 += 2;
                            this.W = i3;
                            this.t0 = i22;
                        } else {
                            i3 = i22;
                        }
                    }
                }
            }
            if (this.b1) {
                if (this.p0 == -1) {
                    int i23 = i3 + 1;
                    this.W = i23;
                    this.p0 = i3;
                    i3 = i23;
                }
                int i24 = i3 + 1;
                this.q0 = i3;
                i3 += 2;
                this.W = i3;
                this.r0 = i24;
            }
        } else {
            if (i5 != 0) {
                i = i3 + 1;
                this.W = i;
                this.p0 = i3;
            } else if (z3 || (this.T.isEmpty() && !(this.x.creator && lbc.D(user)))) {
                int i25 = this.W;
                i = i25 + 1;
                this.W = i;
                this.s0 = i25;
            } else {
                int i26 = this.W;
                this.p0 = i26;
                this.W = i26 + 2;
                this.w0 = i26 + 1;
                if (this.x.creator && lbc.D(user)) {
                    int i27 = this.W;
                    i = i27 + 1;
                    this.W = i;
                    this.x0 = i27;
                } else {
                    int i28 = this.W;
                    i = i28 + 1;
                    this.W = i;
                    this.s0 = i28;
                }
            }
            i3 = i;
        }
        if (i5 == 2) {
            this.W = i3 + 1;
            this.y0 = i3;
        }
        if (z) {
            int i29 = this.t0;
            if (min == -1) {
                if (i29 != -1) {
                    this.a.p(Math.min(i29, this.u0), 2);
                }
            } else if (i29 == -1) {
                this.a.q(min, 2);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
