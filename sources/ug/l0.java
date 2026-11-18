package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.i8;
import c8.l9;
import c8.ma;
import c8.ra;
import hi.ta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cp;
import org.telegram.messenger.fs;
import org.telegram.messenger.g3;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.messenger.x10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.uz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.qc;
import org.telegram.ui.rn;
import org.telegram.ui.uv;
import org.telegram.ui.wc1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class l0 extends sa implements fs {
    public static final /* synthetic */ int S2 = 0;
    public b0 A2;
    public final TextView B2;
    public hi.d C2;
    public Runnable D2;
    public boolean E2;
    public fj0 F2;
    public final h2 G2;
    public uv H2;
    public androidx.emoji2.text.q I2;
    public boolean J2;
    public TLRPC.Chat K2;
    public final uz L2;
    public Runnable M2;
    public int N2;
    public final hi.d O2;
    public int P2;
    public int Q2;
    public String R2;
    public int T1;
    public boolean U1;
    public int V1;
    public long W1;
    public TL_stories.TL_premium_boostsStatus X1;
    public g3 Y1;
    public k0 Z1;
    public boolean a2;
    public boolean b2;
    public org.telegram.ui.Cells.q1 c2;
    public final int d2;
    public final ArrayList e2;
    public boolean f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public int o2;
    public int p2;
    public ArrayList q2;
    public boolean r2;
    public int s2;
    public j0 t2;
    public final HashSet u2;
    public final ArrayList v2;
    public final ArrayList w2;
    public ArrayList x2;
    public ArrayList y2;
    public ArrayList z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i7, int i10, Context context, h2 h2Var, i6 i6Var) {
        super(context, h2Var, false, q1(i7), i6Var);
        int i11 = 0;
        this.V1 = -1;
        this.b2 = false;
        this.e2 = new ArrayList();
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        this.l2 = -1;
        this.m2 = -1;
        this.n2 = -1;
        this.o2 = -1;
        this.p2 = -1;
        this.s2 = -1;
        this.u2 = new HashSet();
        this.v2 = new ArrayList();
        this.w2 = new ArrayList();
        this.x2 = new ArrayList();
        this.y2 = new ArrayList();
        this.z2 = new ArrayList();
        this.E2 = false;
        this.N2 = 0;
        this.Q2 = -4;
        P(n6.w0(n6.h5, this.J0));
        this.P2 = this.H0;
        this.G2 = h2Var;
        this.a = i10;
        this.d2 = i7;
        c1();
        H1();
        int i12 = 1;
        int i13 = 2;
        if (i7 == 2) {
            this.E2 = true;
            H1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new u(this, i11));
        } else if (i7 == 5) {
            this.E2 = true;
            H1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new u(this, i13));
        }
        G1();
        if (i7 == 32 || r1()) {
            uz uzVar = new uz(getContext());
            this.L2 = uzVar;
            this.c.addView(uzVar, ma.c(-1.0f, -1));
        }
        if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35 || i7 == 31) {
            ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            uv uvVar = this.H2;
            if (uvVar != null) {
                ((ViewGroup) uvVar.getParent()).removeView(this.H2);
            }
            this.o1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.B2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(this.A2.getTextView().getText());
            u6.U(textView, n6.Ji, i6Var);
            textView.setOnClickListener(new t(this, i11));
            int L = org.telegram.messenger.g0.L(8.0f);
            int i14 = n6.Fi;
            int w02 = n6.w0(i14, i6Var);
            int i15 = n6.d6;
            int o4 = i0.a.o(n6.w0(i15, i6Var), 120);
            org.telegram.ui.Cells.y k02 = n6.k0(L, L, L, L, w02, o4, o4);
            q6 M = u6.M(i14);
            q6 g10 = u6.g(i15, 120);
            textView.setBackground(k02);
            u6.j(textView, k02, M, g10, i6Var);
        }
        if (i7 == 32) {
            ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            hi.d dVar = new hi.d(context, i6Var, true);
            this.O2 = dVar;
            dVar.k();
            dVar.i(gd.M0(2131753623, null), false, true);
            dVar.setOnClickListener(new t(this, i12));
            this.b.addView(dVar, ma.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.b.post(new v(this, 3));
        }
        if (i7 == 19 || i7 == 18) {
            this.b.post(new v(this, 4));
        }
    }

    public static androidx.emoji2.text.q p1(int i7, int i10) {
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q();
        qVar.a = 0;
        qVar.d = null;
        qVar.e = null;
        qVar.f = null;
        qVar.b = 0;
        qVar.c = 0;
        if (i7 == 0) {
            qVar.b = mp.u1(i10).S4;
            qVar.c = mp.u1(i10).T4;
            qVar.a = R.drawable.msg_limit_pin;
            qVar.d = gd.a0("LimitReachedPinDialogs", null, 2131748762, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = gd.a0("LimitReachedPinDialogsPremium", null, 2131748760, Integer.valueOf(qVar.c));
            qVar.f = gd.a0("LimitReachedPinDialogsLocked", null, 2131748761, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 33) {
            qVar.b = mp.u1(i10).p6;
            qVar.c = mp.u1(i10).q6;
            qVar.a = R.drawable.msg_limit_pin;
            qVar.d = gd.a0(null, null, 2131748759, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = gd.a0(null, null, 2131748757, Integer.valueOf(qVar.c));
            qVar.f = gd.a0(null, null, 2131748758, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 2) {
            qVar.b = mp.u1(i10).U4;
            qVar.c = mp.u1(i10).V4;
            qVar.a = R.drawable.msg_limit_links;
            qVar.d = gd.a0("LimitReachedPublicLinks", null, 2131748755, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = gd.a0("LimitReachedPublicLinksPremium", null, 2131748753, Integer.valueOf(qVar.c));
            qVar.f = gd.a0("LimitReachedPublicLinksLocked", null, 2131748754, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 12) {
            qVar.b = mp.u1(i10).A6;
            qVar.c = mp.u1(i10).B6;
            qVar.a = R.drawable.msg_limit_links;
            qVar.d = gd.a0("LimitReachedFolderLinks", null, 2131748768, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = gd.a0("LimitReachedFolderLinksPremium", null, 2131748766, Integer.valueOf(qVar.c));
            qVar.f = gd.a0("LimitReachedFolderLinksLocked", null, 2131748767, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 13) {
            qVar.b = mp.u1(i10).C6;
            qVar.c = mp.u1(i10).D6;
            qVar.a = R.drawable.msg_limit_folder;
            qVar.d = gd.a0("LimitReachedSharedFolders", null, 2131748751, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = gd.a0("LimitReachedSharedFoldersPremium", null, 2131748749, Integer.valueOf(qVar.c));
            qVar.f = gd.a0("LimitReachedSharedFoldersLocked", null, 2131748750, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 3) {
            qVar.b = mp.u1(i10).O4;
            qVar.c = mp.u1(i10).P4;
            qVar.a = R.drawable.msg_limit_folder;
            qVar.d = gd.a0("LimitReachedFolders", null, 2131748765, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = gd.a0("LimitReachedFoldersPremium", null, 2131748763, Integer.valueOf(qVar.c));
            qVar.f = gd.a0("LimitReachedFoldersLocked", null, 2131748764, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 4) {
            qVar.b = mp.u1(i10).Q4;
            qVar.c = mp.u1(i10).R4;
            qVar.a = R.drawable.msg_limit_chats;
            qVar.d = gd.a0("LimitReachedChatInFolders", null, 2131748783, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = gd.a0("LimitReachedChatInFoldersPremium", null, 2131748781, Integer.valueOf(qVar.c));
            qVar.f = gd.a0("LimitReachedChatInFoldersLocked", null, 2131748782, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 5) {
            qVar.b = mp.u1(i10).G4;
            qVar.c = mp.u1(i10).H4;
            qVar.a = R.drawable.msg_limit_groups;
            qVar.d = gd.a0("LimitReachedCommunities", null, 2131748780, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = gd.a0("LimitReachedCommunitiesPremium", null, 2131748778, Integer.valueOf(qVar.c));
            qVar.f = gd.a0("LimitReachedCommunitiesLocked", null, 2131748779, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 6) {
            qVar.b = 100;
            qVar.c = ks.e3;
            qVar.a = R.drawable.msg_limit_folder;
            qVar.d = gd.a0("LimitReachedFileSize", null, 2131748771, "2 GB", "4 GB");
            qVar.e = gd.a0("LimitReachedFileSizePremium", null, 2131748769, "4 GB");
            qVar.f = gd.a0("LimitReachedFileSizeLocked", null, 2131748770, "2 GB");
            return qVar;
        }
        if (i7 == 7) {
            qVar.b = 3;
            qVar.c = 4;
            qVar.a = R.drawable.msg_limit_accounts;
            qVar.d = gd.a0("LimitReachedAccounts", null, 2131748785, 3, Integer.valueOf(qVar.c));
            qVar.e = gd.a0("LimitReachedAccountsPremium", null, 2131748784, Integer.valueOf(qVar.c));
            qVar.f = gd.a0("LimitReachedAccountsPremium", null, 2131748784, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 11) {
            qVar.b = 0;
            qVar.c = 0;
            qVar.a = R.drawable.msg_limit_links;
            qVar.d = gd.a0("LimitReachedAccounts", null, 2131748785, 0, Integer.valueOf(qVar.c));
            qVar.e = "";
            qVar.f = "";
            return qVar;
        }
        if (i7 == 14) {
            qVar.b = mp.u1(i10).l5;
            qVar.c = mp.u1(i10).m5;
            qVar.a = R.drawable.msg_limit_stories;
            qVar.d = gd.H(',', "LimitReachedStoriesCount2First", qVar.b) + "\n" + gd.H(',', "LimitReachedStoriesCount2Second", qVar.c);
            qVar.e = gd.H(',', "LimitReachedStoriesCount2Premium", qVar.c);
            qVar.f = gd.H(',', "LimitReachedStoriesCount2Premium", qVar.b);
            return qVar;
        }
        if (i7 == 15) {
            qVar.b = mp.u1(i10).n5;
            qVar.c = mp.u1(i10).o5;
            qVar.a = R.drawable.msg_limit_stories;
            qVar.d = gd.a0("LimitReachedStoriesWeekly", null, 2131748737, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = gd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748736, Integer.valueOf(qVar.c));
            qVar.f = gd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748736, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 16) {
            qVar.b = mp.u1(i10).p5;
            qVar.c = mp.u1(i10).q5;
            qVar.a = R.drawable.msg_limit_stories;
            qVar.d = gd.a0("LimitReachedStoriesMonthly", null, 2131748739, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(qVar.c));
            qVar.f = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 != 18 && i7 != 32 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 25 && i7 != 30 && i7 != 35 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 19 && i7 != 21 && i7 != 26) {
            return qVar;
        }
        qVar.b = mp.u1(i10).p5;
        qVar.c = mp.u1(i10).q5;
        qVar.a = R.drawable.filled_limit_boost;
        qVar.d = gd.a0("LimitReachedStoriesMonthly", null, 2131748739, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
        qVar.e = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(qVar.c));
        qVar.f = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(qVar.b));
        return qVar;
    }

    public static boolean q1(int i7) {
        return i7 == 0 || i7 == 33 || i7 == 3 || i7 == 4 || i7 == 6 || i7 == 7 || i7 == 12 || i7 == 13 || i7 == 14 || i7 == 15 || i7 == 16;
    }

    public static String v1(int i7) {
        switch (i7) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    public static void x1(h2 h2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, g3 g3Var, long j3, boolean z10) {
        if (tL_premium_boostsStatus == null || g3Var == null || h2Var.getContext() == null) {
            return;
        }
        l0 l0Var = new l0(32, h2Var.getCurrentAccount(), h2Var.getContext(), h2Var, h2Var.getResourceProvider());
        l0Var.B1(g3Var);
        l0Var.A1(tL_premium_boostsStatus, true);
        l0Var.C1(j3);
        if (z10) {
            h2Var.showDialog(l0Var);
        } else {
            l0Var.show();
        }
    }

    public final void A1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.X1 = tL_premium_boostsStatus;
        this.a2 = z10;
        H1();
    }

    public final void B1(g3 g3Var) {
        this.Y1 = g3Var;
        F1();
        G1();
    }

    public final void C1(long j3) {
        this.W1 = j3;
        H1();
    }

    public final void D1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.K2 = chat;
        this.R2 = str;
        this.U1 = !TextUtils.isEmpty(str) || v3.y(3, chat);
        this.x2 = new ArrayList(arrayList);
        this.y2 = arrayList2;
        this.z2 = arrayList3;
        HashSet hashSet = this.u2;
        hashSet.clear();
        if (this.U1) {
            ArrayList arrayList4 = this.x2;
            int size = arrayList4.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    hashSet.add(user);
                }
            }
        }
        H1();
        F1();
        int i10 = this.d2;
        if ((i10 == 11 || i10 == 34) && !mp.u1(this.a).K3()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.x2.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            b0 b0Var = this.A2;
            if (b0Var != null && b0Var.getParent() != null) {
                ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            }
            uv uvVar = this.H2;
            if (uvVar != null && uvVar.getParent() != null) {
                ((ViewGroup) this.H2.getParent()).removeView(this.H2);
            }
            ck0 ck0Var = this.o1;
            if (ck0Var != null) {
                ck0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void E1() {
        int i7;
        this.q2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        int i10 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.d2 == 31) {
            i10 = 1;
        }
        mp u12 = mp.u1(this.a);
        cp cpVar = u12.t4;
        int max = Math.max(10, cpVar != null ? cpVar.e(s1()) : 0);
        cp cpVar2 = u12.u4;
        int max2 = Math.max(max, cpVar2 != null ? cpVar2.e(s1()) : 0);
        int max3 = s1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, u12.D5), u12.B5), u12.C5), u12.z5), u12.y5) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, u12.t5), u12.u5), u12.v5), u12.w5), u12.x5), u12.C4), u12.D4);
        ArrayList arrayList = null;
        while (i10 <= max3) {
            boolean s12 = s1();
            ArrayList arrayList2 = new ArrayList();
            mp u13 = mp.u1(this.a);
            if (!s12 && i10 >= u13.D4) {
                arrayList2.add(g0.a(R.drawable.menu_feature_translate, 2131753658));
            }
            g0 b10 = g0.b(R.drawable.menu_feature_stories, i10, "BoostFeatureStoriesPerDay");
            b10.f = true;
            arrayList2.add(b10);
            if (!s12) {
                g0 b11 = g0.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                b11.f = true;
                arrayList2.add(b11);
            }
            cp cpVar3 = u13.t4;
            int a10 = cpVar3 != null ? cpVar3.a(i10, false) : 0;
            cp cpVar4 = u13.u4;
            int a11 = cpVar4 != null ? cpVar4.a(i10, s12) : 0;
            if (!s12 && a10 > 0) {
                arrayList2.add(g0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
            }
            if (!s12 && a10 > 0) {
                arrayList2.add(g0.b(R.drawable.menu_feature_links, a10, "BoostFeatureReplyColor"));
            }
            if (!s12 && i10 >= u13.t5) {
                arrayList2.add(g0.a(R.drawable.menu_feature_links2, 2131753631));
            }
            if (a11 > 0) {
                arrayList2.add(g0.b(R.drawable.menu_feature_color_profile, a11, s12 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
            }
            if (s12 && i10 >= u13.A5) {
                arrayList2.add(g0.a(R.drawable.menu_feature_pack, 2131753649));
            }
            if ((!s12 && i10 >= u13.u5) || (s12 && i10 >= u13.y5)) {
                arrayList2.add(g0.a(R.drawable.menu_feature_cover, s12 ? 2131753635 : 2131753636));
            }
            if (s12 && i10 >= u13.D5) {
                arrayList2.add(g0.a(R.drawable.menu_feature_voice, 2131753626));
            }
            if ((!s12 && i10 >= u13.v5) || (s12 && i10 >= u13.z5)) {
                arrayList2.add(new g0(R.drawable.menu_feature_status, 2131753645, -1, "1000+", null));
            }
            if ((!s12 && i10 >= u13.w5) || (s12 && i10 >= u13.B5)) {
                arrayList2.add(g0.b(R.drawable.menu_feature_wallpaper, 8, s12 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
            }
            if ((!s12 && i10 >= u13.x5) || (s12 && i10 >= u13.C5)) {
                arrayList2.add(g0.a(R.drawable.menu_feature_custombg, s12 ? 2131753650 : 2131753651));
            }
            if (!s12 && i10 >= u13.C4) {
                arrayList2.add(g0.a(R.drawable.menu_feature_noads, 2131753627));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (0; i7 < arrayList.size(); i7 + 1) {
                    g0 g0Var = (g0) arrayList.get(i7);
                    g0 g0Var2 = (g0) arrayList2.get(i7);
                    int i11 = g0Var.e;
                    i7 = (g0Var2 != null && ((g0Var.f && i11 > 2) || (g0Var.a == g0Var2.a && g0Var.b == g0Var2.b && TextUtils.equals(g0Var.c, g0Var2.c) && TextUtils.equals(g0Var.d, g0Var2.d) && i11 == g0Var2.e))) ? i7 + 1 : 0;
                }
                i10++;
            }
            ArrayList arrayList3 = this.q2;
            arrayList3.add(new f0(i10, arrayList3.isEmpty()));
            this.q2.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void F1() {
        String str = null;
        if (this.f2) {
            this.A2.c(gd.M0(2131748938, null), false, false);
            return;
        }
        int i7 = this.d2;
        if (i7 != 19 && i7 != 32 && !t1()) {
            HashSet hashSet = this.u2;
            if (i7 != 11 && i7 != 34) {
                if (hashSet.size() <= 0) {
                    b0 b0Var = this.A2;
                    b0Var.r = false;
                    b0Var.d(true);
                    return;
                } else {
                    if (i7 == 2) {
                        str = gd.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i7 == 5) {
                        str = gd.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.A2.c(str, true, true);
                    return;
                }
            }
            b0 b0Var2 = this.A2;
            if (b0Var2.J == null) {
                rq rqVar = new rq(b0Var2.getContext(), null);
                b0Var2.J = rqVar;
                rqVar.setGravity(3);
                rq rqVar2 = b0Var2.J;
                int i10 = n6.Fi;
                int i11 = n6.Ji;
                qq qqVar = rqVar2.a;
                qqVar.v = i10;
                qqVar.w = i11;
                qqVar.b = 0.8f;
                b0Var2.setClipChildren(false);
                b0Var2.addView(b0Var2.J, ma.e(-1, 24, 16));
            }
            if (!this.U1) {
                this.A2.c(gd.M0(2131752030, null), true, true);
            } else if (hashSet.size() > 0) {
                this.A2.c(gd.M0(2131745424, null), true, true);
            } else {
                this.A2.c(gd.M0(2131754555, null), true, true);
            }
            this.A2.J.a.c(hashSet.size(), true);
            this.A2.invalidate();
            return;
        }
        g3 g3Var = this.Y1;
        boolean z10 = g3Var.a;
        if ((z10 || g3Var.b) && !g3Var.l && !g3Var.d) {
            if (g3Var.m) {
                this.A2.c(gd.M0(2131747638, null), true, true);
                return;
            }
            b0 b0Var3 = this.A2;
            b0Var3.r = false;
            b0Var3.d(true);
            return;
        }
        hi.d dVar = this.O2;
        if (z10) {
            if (wg.s.i()) {
                this.A2.c(gd.M0(2131753589, null), true, true);
            } else {
                this.A2.c(gd.M0(s1() ? 2131753623 : 2131753661, null), true, true);
            }
            this.C2.i(gd.M0(2131753662, null), true, true);
            if (dVar != null) {
                dVar.i(gd.M0(2131753623, null), true, true);
                return;
            }
            return;
        }
        if (g3Var.m) {
            this.C2.i(gd.M0(2131747638, null), true, true);
            if (dVar != null) {
                dVar.i(gd.M0(2131747638, null), true, true);
            }
            this.A2.c(gd.M0(2131747638, null), true, true);
            return;
        }
        if (wg.s.i()) {
            if (dVar != null) {
                dVar.i(gd.M0(2131753623, null), true, true);
            }
            this.C2.i(gd.M0(2131753662, null), true, true);
            this.A2.c(gd.M0(2131753589, null), true, true);
            return;
        }
        if (dVar != null) {
            dVar.i(gd.M0(2131747638, null), true, true);
        }
        this.C2.i(gd.M0(2131747638, null), true, true);
        this.A2.c(gd.M0(2131747638, null), true, true);
    }

    public final void G1() {
        String M0;
        if (this.f2) {
            this.A2.c(gd.M0(2131748938, null), false, false);
            return;
        }
        int i7 = this.d2;
        if (i7 == 19 || i7 == 32 || t1()) {
            if (!wg.s.i()) {
                this.A2.f.setText(gd.M0(s1() ? 2131753623 : 2131753661, null));
                return;
            }
            r0 r0Var = this.A2.f;
            g3 g3Var = this.Y1;
            if (g3Var == null || !g3Var.d) {
                M0 = gd.M0(s1() ? 2131753623 : 2131753661, null);
            } else {
                M0 = gd.M0(2131753589, null);
            }
            r0Var.setText(M0);
            g3 g3Var2 = this.Y1;
            if (g3Var2 == null || !g3Var2.m) {
                return;
            }
            this.A2.f.setText(gd.M0(2131747638, null));
            return;
        }
        if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new lq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) gd.M0(2131751751, null));
            this.A2.f.setText(spannableStringBuilder);
            return;
        }
        if (j10.i(this.a).q() || mp.u1(this.a).K3() || this.J2) {
            this.A2.f.setText(gd.M0(2131747638, null));
            b0 b0Var = this.A2;
            b0Var.E.p = null;
            b0Var.G.setVisibility(8);
            return;
        }
        this.A2.f.setText(gd.M0(2131749007, null));
        androidx.emoji2.text.q qVar = this.I2;
        if (qVar == null) {
            b0 b0Var2 = this.A2;
            b0Var2.E.p = null;
            b0Var2.G.setVisibility(8);
            return;
        }
        int i10 = qVar.b;
        int i11 = i10 + 1;
        int i12 = qVar.c;
        if (i11 == i12) {
            this.A2.setIcon(R.raw.addone_icon);
            return;
        }
        if (i10 != 0 && i12 != 0) {
            float f10 = i12 / i10;
            if (f10 >= 1.6f && f10 <= 2.5f) {
                this.A2.setIcon(R.raw.double_icon);
                return;
            }
        }
        b0 b0Var3 = this.A2;
        b0Var3.E.p = null;
        b0Var3.G.setVisibility(8);
    }

    public final void H1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.i2 = -1;
        this.k2 = -1;
        this.l2 = -1;
        this.m2 = -1;
        this.V1 = -1;
        this.n2 = -1;
        this.p2 = -1;
        this.g2 = 1;
        this.h2 = 0;
        int i7 = this.d2;
        if (i7 == 19 || i7 == 18 || i7 == 20 || i7 == 24 || i7 == 27 || i7 == 28 || i7 == 22 || i7 == 23 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 21 || i7 == 30 || i7 == 35) {
            if (i7 != 19 || v3.N(o1())) {
                this.v1 = 0.24f;
                int i10 = this.g2;
                this.g2 = i10 + 1;
                this.V1 = i10;
                if (mp.u1(this.a).s4) {
                    int i11 = this.g2;
                    this.g2 = i11 + 1;
                    this.o2 = i11;
                }
            }
            E1();
            int i12 = this.g2;
            int i13 = i12 + 1;
            this.g2 = i13;
            this.p2 = i12;
            this.g2 = (this.q2.size() - 1) + i13;
        } else if (i7 == 31 || i7 == 32) {
            this.v1 = 0.24f;
            E1();
            int i14 = this.g2;
            this.k2 = i14;
            int i15 = i14 + 1;
            this.g2 = i15;
            this.p2 = i14;
            int size = (this.q2.size() - 1) + i15;
            this.g2 = size;
            this.l2 = size;
        } else if (!q1(i7)) {
            if (i7 == 11 || i7 == 34) {
                this.v1 = 0.24f;
            } else {
                int i16 = this.g2;
                this.i2 = i16;
                this.g2 = i16 + 2;
                this.j2 = i16 + 1;
            }
            if (this.E2) {
                int i17 = this.g2;
                this.g2 = i17 + 1;
                this.m2 = i17;
            } else if (i7 != 11 || this.U1) {
                if (i7 != 11 || mp.u1(this.a).K3() || ((((arrayList = this.z2) == null || arrayList.isEmpty()) && ((arrayList2 = this.y2) == null || arrayList2.size() < this.x2.size())) || (arrayList3 = this.z2) == null || arrayList3.size() != 1 || (arrayList4 = this.y2) == null || arrayList4.size() != 1 || !this.U1)) {
                    int i18 = this.g2;
                    this.k2 = i18;
                    if (i7 == 11 || i7 == 34) {
                        this.g2 = this.x2.size() + i18;
                    } else if (i7 == 5) {
                        this.g2 = this.v2.size() + i18;
                    } else {
                        this.g2 = this.e2.size() + i18;
                    }
                    this.l2 = this.g2;
                }
                if (this.l2 - this.k2 > 1) {
                    int i19 = this.g2;
                    this.g2 = i19 + 1;
                    this.n2 = i19;
                }
            }
        }
        this.o1.getAdapter().f();
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        return new e0(this);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        int i7 = this.d2;
        if (i7 == 11) {
            return gd.M0(2131752390, null);
        }
        if (i7 == 34) {
            return gd.M0(2131752611, null);
        }
        if (i7 == 35) {
            return gd.M0(2131743637, null);
        }
        switch (i7) {
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return gd.M0(2131743637, null);
            case 19:
            case ks.T /* 30 */:
                return gd.M0(s1() ? 2131753623 : 2131753661, null);
            case ks.U /* 31 */:
                return gd.M0(2131753598, null);
            case 32:
                return gd.M0(2131753623, null);
            default:
                return gd.M0(2131748786, null);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final void V0(au0 au0Var) {
        int i7;
        Context context = au0Var.getContext();
        hi.d dVar = new hi.d(context, this.J0, true);
        this.C2 = dVar;
        dVar.setFlickeringLoading(true);
        int i10 = 0;
        this.C2.i(gd.M0(2131753662, null), false, true);
        int i11 = 2;
        this.C2.setOnClickListener(new t(this, i11));
        b0 b0Var = new b0(this, context, this.J0);
        this.A2 = b0Var;
        ra.b(b0Var, 0.02f, 1.2f);
        int i12 = 22;
        if (!this.t1 && (i7 = this.d2) != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
            uv uvVar = new uv(14, context, this);
            this.H2 = uvVar;
            u6.h(n6.h5, uvVar, this.J0);
            au0Var.addView(this.H2, ma.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        b0 b0Var2 = this.A2;
        float f10 = (this.u0 / org.telegram.messenger.g0.p) + 16.0f;
        au0Var.addView(b0Var2, ma.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int L = org.telegram.messenger.g0.L(72.0f);
        ck0 ck0Var = this.o1;
        ck0Var.setPadding(0, 0, 0, L);
        ck0Var.setClipToPadding(false);
        ck0Var.setClipChildren(false);
        ck0Var.setOnItemClickListener(new i8(this, i12));
        ck0Var.setOnItemLongClickListener(new w(this, i11));
        this.A2.w.setOnClickListener(new a0(i10, this, context));
        this.A2.h.setOnClickListener(new t(this, 3));
        this.F2 = new fj0(ck0Var, true);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull P0;
        if (i7 != ks.X2) {
            if (i7 != ks.W2) {
                if (i7 == ks.V2) {
                    dismiss();
                    return;
                }
                return;
            }
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.Y1 == null) {
                return;
            }
            this.X1.boosts += intValue;
            if (this.d2 == 32 && (P0 = mp.u1(this.a).P0(-this.W1)) != null) {
                P0.boosts_applied += intValue;
            }
            u1();
            A1(tL_premium_boostsStatus, this.a2);
            g3 g3Var = this.Y1;
            g3Var.m = this.X1.next_level_boosts <= 0;
            g3Var.l = true;
            g3Var.a(tL_premium_myBoosts);
            if (w1()) {
                gc Q = new lc(this.c, this.J0).Q(R.raw.ic_boosts_replace, 30, gd.G(intValue, "BoostingReassignedFromPlural", gd.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        h2 h2Var = this.s1;
        h2 lastFragment = h2Var.getParentLayout().getLastFragment();
        if (lastFragment instanceof ch.p) {
            List fragmentStack = h2Var.getParentLayout().getFragmentStack();
            h2 h2Var2 = fragmentStack.size() >= 2 ? (h2) p5.c.h(2, fragmentStack) : null;
            h2 h2Var3 = fragmentStack.size() >= 3 ? (h2) p5.c.h(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (h2) p5.c.h(4, fragmentStack) : null;
            if (h2Var2 instanceof rn) {
                ((ActionBarLayout) h2Var.getParentLayout()).d0(h2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                wg.h.f(h2Var3, chat, false);
                return;
            } else {
                if (h2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) h2Var.getParentLayout()).d0(h2Var3, false);
                }
                lastFragment.finishFragment();
                wg.h.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof bn) && booleanValue) {
            wg.h.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof qc) && booleanValue) {
            List fragmentStack2 = h2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                h2 h2Var4 = (h2) fragmentStack2.get(size);
                if ((h2Var4 instanceof bn) || (h2Var4 instanceof cx)) {
                    r6 = h2Var4;
                    break;
                }
                arrayList.add(h2Var4);
            }
            if (r6 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((ActionBarLayout) h2Var.getParentLayout()).d0((h2) obj, false);
            }
            h2Var.finishFragment();
            dismiss();
            wg.h.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            ta taVar = ta.G2;
            if (taVar == null || !taVar.d) {
                dismiss();
                wg.h.f(LaunchActivity.Q(), chat, false);
                return;
            }
            bn ua2 = bn.ua(-chat.id);
            LaunchActivity.Q().presentFragment(ua2, false, false);
            ta.w();
            dismiss();
            wg.h.f(ua2, chat, false);
            return;
        }
        ta taVar2 = ta.G2;
        if (taVar2 != null && taVar2.d) {
            bn ua3 = bn.ua(-chat.id);
            LaunchActivity.Q().presentFragment(ua3, false, false);
            ta.w();
            dismiss();
            wg.h.f(ua3, chat, true);
            return;
        }
        List fragmentStack3 = h2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (h2) p5.c.h(2, fragmentStack3) : null;
        h2Var.finishFragment();
        dismiss();
        if (r6 instanceof bn) {
            wg.h.f(r6, chat, true);
        }
    }

    public final void i1(final n80 n80Var, boolean z10) {
        if (!n80Var.a() || z10) {
            final int i7 = 1;
            n80Var.setLoading(true);
            mp.u1(this.a).I0();
            final int i10 = 0;
            wg.s.a(-this.W1, Arrays.asList(Integer.valueOf(this.Y1.g)), new x10(this) { // from class: ug.y
                public final /* synthetic */ l0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            l0 l0Var = this.b;
                            mp.u1(l0Var.a).I0().a(l0Var.W1, new bi.j(l0Var, n80Var, (TL_stories.TL_premium_myBoosts) obj, 16));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            n80 n80Var2 = n80Var;
                            if (startsWith) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    org.telegram.messenger.g0.h3(new p4.o0(20, this.b, n80Var2), intValue * 1000);
                                    break;
                                } else {
                                    wg.h.g(intValue);
                                }
                            }
                            n80Var2.setLoading(false);
                            break;
                    }
                }
            }, new x10(this) { // from class: ug.y
                public final /* synthetic */ l0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    switch (i7) {
                        case 0:
                            l0 l0Var = this.b;
                            mp.u1(l0Var.a).I0().a(l0Var.W1, new bi.j(l0Var, n80Var, (TL_stories.TL_premium_myBoosts) obj, 16));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            n80 n80Var2 = n80Var;
                            if (startsWith) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    org.telegram.messenger.g0.h3(new p4.o0(20, this.b, n80Var2), intValue * 1000);
                                    break;
                                } else {
                                    wg.h.g(intValue);
                                }
                            }
                            n80Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void j1() {
        if (this.C2.isAttachedToWindow()) {
            i1(this.C2, false);
            return;
        }
        hi.d dVar = this.O2;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            i1(this.A2, false);
        } else {
            i1(dVar, false);
        }
    }

    public int k1() {
        return 0;
    }

    public final String l1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.X1.boost_url;
        }
        int i7 = this.a;
        long j3 = -this.W1;
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(j3));
        if (TextUtils.isEmpty(v3.K(O0, false))) {
            return a8.p0.o(j3, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + v3.K(O0, false);
    }

    public final String m1(boolean z10) {
        String str;
        int i7;
        if (this.d2 == 32) {
            TLRPC.Chat o12 = o1();
            TLRPC.ChatFull P0 = mp.u1(this.a).P0(-this.W1);
            return gd.G(Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0), "BoostingRemoveRestrictionsSubtitle", o12 == null ? "" : o12.title);
        }
        TLRPC.Chat O0 = mp.u1(this.a).O0(Long.valueOf(-this.W1));
        if (O0 == null) {
            str = gd.M0(s1() ? 2131754876 : 2131754904, null);
        } else {
            str = O0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        boolean z11 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (t1() && this.X1.next_level_boosts != 0 && z10) {
            i7 = s1() ? 2131749228 : 2131752341;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
            int i10 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return gd.a0(null, null, i7, str, gd.G(i10, "MoreBoosts", Integer.valueOf(i10)));
        }
        if (z11 && this.Y1.d) {
            if (this.X1.level == 1) {
                return gd.a0(null, null, s1() ? 2131749301 : 2131752439, new Object[0]);
            }
            return gd.a0(null, null, s1() ? 2131749300 : 2131752438, Integer.valueOf(this.X1.level), gd.G(this.X1.level, "BoostStories", new Object[0]));
        }
        if (this.Y1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.X1;
            if (tL_premium_boostsStatus3.level == 0) {
                i7 = s1() ? 2131749228 : 2131752341;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.X1;
                int i11 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return gd.a0(null, null, i7, str, gd.G(i11, "MoreBoosts", Integer.valueOf(i11)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return gd.a0(null, null, s1() ? 2131749300 : 2131752438, Integer.valueOf(this.X1.level), gd.G(this.X1.level + 1, "BoostStories", new Object[0]));
            }
            i7 = s1() ? 2131749228 : 2131752341;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.X1;
            int i12 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return gd.a0(null, null, i7, str, gd.G(i12, "MoreBoosts", Integer.valueOf(i12)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.X1;
        if (tL_premium_boostsStatus6.level == 0) {
            i7 = s1() ? 2131749228 : 2131752341;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.X1;
            int i13 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return gd.a0(null, null, i7, str, gd.G(i13, "MoreBoosts", Integer.valueOf(i13)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return gd.a0(null, null, s1() ? 2131749300 : 2131752438, Integer.valueOf(this.X1.level), gd.G(this.X1.level + 1, "BoostStories", new Object[0]));
        }
        i7 = s1() ? 2131749228 : 2131752341;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.X1;
        int i14 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return gd.a0(null, null, i7, str, gd.G(i14, "MoreBoosts", Integer.valueOf(i14)));
    }

    public final String n1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return gd.a0("BoostsMaxLevelReached", null, 2131753156, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.Y1.d) {
            return gd.M0(s1() ? 2131753623 : 2131753661, null);
        }
        boolean z10 = this.a2;
        int i7 = this.d2;
        if (!z10) {
            if (i7 == 32) {
                return gd.M0(s1() ? 2131753623 : 2131753661, null);
            }
            if (this.Y1.d) {
                return gd.M0(s1() ? 2131742581 : 2131742583, null);
            }
            return gd.M0(s1() ? 2131753525 : 2131753526, null);
        }
        if (i7 == 32) {
            return gd.M0(s1() ? 2131753623 : 2131753661, null);
        }
        TLRPC.Chat O0 = mp.u1(this.a).O0(Long.valueOf(-this.W1));
        if (this.Y1.d) {
            return gd.a0("YouBoostedChannel2", null, 2131742582, O0.title);
        }
        return gd.M0(s1() ? 2131753623 : 2131753661, null);
    }

    public final TLRPC.Chat o1() {
        return mp.u1(this.a).O0(Long.valueOf(-this.W1));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.a).c(this, ks.X2);
        ks.f(this.a).c(this, ks.W2);
        ks.f(this.a).c(this, ks.V2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.a).n(this, ks.X2);
        ks.f(this.a).n(this, ks.W2);
        ks.f(this.a).n(this, ks.V2);
    }

    public final boolean r1() {
        int i7 = this.d2;
        return i7 == 19 || i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 27 || i7 == 28 || i7 == 23 || i7 == 30 || i7 == 35;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 >= 0 || this.H0 != this.P2 || (w02 = n6.w0(n6.h5, this.J0)) == this.H0) {
                return;
            }
            this.H0 = w02;
            this.P2 = w02;
            E0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean s1() {
        return !v3.V(mp.u1(this.a).O0(Long.valueOf(-this.W1)));
    }

    public final boolean t1() {
        return r1() && v3.N(o1());
    }

    public final void u1() {
        j0 j0Var = this.t2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        int i7 = tL_premium_boostsStatus.boosts;
        int i10 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        j0Var.b++;
        j0Var.a = l9.a((i7 - r3) / i10, 0.0f, 1.0f);
        j0Var.a0 = true;
        j0Var.b0 = j0Var.n;
        j0Var.i(i7, true);
        j0Var.J.requestLayout();
        j0Var.requestLayout();
    }

    public final boolean w1() {
        ks f10 = ks.f(this.a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        g3 g3Var = this.Y1;
        g3Var.getClass();
        g3 g3Var2 = new g3();
        g3Var2.a = g3Var.a;
        g3Var2.b = g3Var.b;
        g3Var2.c = g3Var.c;
        g3Var2.d = g3Var.d;
        g3Var2.e = g3Var.e;
        g3Var2.g = g3Var.g;
        g3Var2.h = g3Var.h;
        g3Var2.i = g3Var.i;
        g3Var2.j = g3Var.j;
        g3Var2.k = g3Var.k;
        g3Var2.m = g3Var.m;
        f10.m(ks.r3, tL_premium_boostsStatus, g3Var2, Long.valueOf(this.W1));
        hi.d dVar = this.O2;
        if (dVar != null) {
            TLRPC.ChatFull P0 = mp.u1(this.a).P0(-this.W1);
            int max = Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0);
            if (max == 0) {
                ks.f(this.a).m(ks.q3, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.j0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Z1, transitionSet);
        k0 k0Var = this.Z1;
        wg.b bVar = k0Var.c;
        int indexOfChild = k0Var.indexOfChild(k0Var.b);
        l0 l0Var = k0Var.e;
        if (l0Var.a2) {
            int indexOfChild2 = k0Var.indexOfChild(k0Var.d);
            k0Var.removeView(k0Var.d);
            k0Var.d.removeView(k0Var.a);
            k0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(k0Var.getContext());
            k0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            k0Var.d.setWeightSum(1.0f);
            k0Var.d.addView(k0Var.a, ma.p(-2, -2, 1.0f, 0));
            k0Var.d.addView(bVar, ma.t(-2, -2, 48, 0, 2, 0, 0));
            k0Var.addView(k0Var.d, indexOfChild2, ma.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = k0Var.indexOfChild(k0Var.a);
            k0Var.removeView(k0Var.a);
            TextView textView = new TextView(k0Var.getContext());
            k0Var.a = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            k0Var.a.setTextSize(1, 20.0f);
            u6.U(k0Var.a, n6.G6, l0Var.J0);
            k0Var.a.setGravity(17);
            k0Var.addView(k0Var.a, indexOfChild3, ma.t(-2, -2, 1, 0, 22, 0, 0));
        }
        k0Var.removeView(k0Var.b);
        TextView textView2 = new TextView(k0Var.getContext());
        k0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = k0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), k0Var.b.getLineSpacingMultiplier() * 1.1f);
        k0Var.b.setGravity(1);
        u6.U(k0Var.b, n6.G6, l0Var.J0);
        k0Var.addView(k0Var.b, indexOfChild, ma.t(-2, -2, 1, 24, -2, 24, 17));
        this.Z1.a.setText(n1());
        TextView textView4 = this.Z1.b;
        mp u12 = mp.u1(this.a);
        boolean s12 = s1();
        int i7 = this.d2;
        String str = null;
        if (i7 == 20) {
            str = gd.a0(null, null, s12 ? 2131749226 : 2131752338, Integer.valueOf(k1()));
        } else if (i7 == 24) {
            str = gd.a0(null, null, s12 ? 2131749222 : 2131752335, Integer.valueOf(k1()));
        } else if (i7 == 29) {
            str = gd.a0(null, null, 2131749225, Integer.valueOf(u12.A5));
        } else if (i7 == 30) {
            str = gd.a0(null, null, 2131752332, Integer.valueOf(u12.C4));
        } else if (i7 == 35) {
            str = gd.a0(null, null, 2131752339, Integer.valueOf(u12.D4));
        } else if (i7 == 25) {
            str = gd.a0(null, null, s12 ? 2131749223 : 2131752336, Integer.valueOf(s12 ? u12.z5 : u12.v5));
        } else if (i7 == 26) {
            str = gd.a0(null, null, s12 ? 2131749218 : 2131752330, Integer.valueOf(s12 ? u12.z5 : u12.v5));
        } else if (i7 == 27) {
            str = gd.a0(null, null, s12 ? 2131749220 : 2131752333, Integer.valueOf(u12.t5));
        } else if (i7 == 28) {
            str = gd.a0(null, null, s12 ? 2131749221 : 2131752334, Integer.valueOf(s12 ? u12.y5 : u12.u5));
        } else if (i7 == 22) {
            str = gd.a0(null, null, s12 ? 2131749219 : 2131752331, Integer.valueOf(s12 ? u12.B5 : u12.w5));
        } else if (i7 == 23) {
            str = gd.a0(null, null, s12 ? 2131749224 : 2131752337, Integer.valueOf(s12 ? u12.C5 : u12.x5));
        }
        if (str == null) {
            str = m1(false);
        }
        textView4.setText(org.telegram.messenger.g0.W2(str));
        F1();
        uz uzVar = this.L2;
        uzVar.c(false);
        try {
            uzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Z1.c.a(this.Y1.i, true);
        this.o1.y0(0);
        if (i7 == 32) {
            this.Z1.c.setVisibility(8);
        }
        return true;
    }

    public final void y1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String G = gd.G(arrayList.size(), "RevokeLinks", new Object[0]);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.r2) {
                u1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinkAlertChannel", null, 2131745826, mp.u1(this.a).X2 + "/" + v3.K(chat, false), chat.title));
            } else {
                u1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinkAlert", null, 2131745827, mp.u1(this.a).X2 + "/" + v3.K(chat, false), chat.title));
            }
        } else if (this.r2) {
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinksAlertChannel", null, 2131745823, new Object[0]));
        } else {
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinksAlert", null, 2131745824, new Object[0]));
        }
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        alertDialog$Builder.k(gd.M0(2131745829, null), new wc1(18, this, arrayList));
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            u6.U(textView, n6.q7, this.J0);
        }
    }

    public final void z1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.R2)) {
            TLRPC.ChatFull P0 = mp.u1(this.a).P0(this.K2.id);
            if (P0 == null) {
                dismiss();
                return;
            }
            if (this.K2.username != null) {
                str = "@" + this.K2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = P0.exported_invite;
                if (tL_chatInviteExported == null) {
                    dismiss();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.R2;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = this.u2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long P1 = mp.u1(this.a).P1(user.id);
            if (P1 <= 0) {
                P1 = n5.k(mp.u1(this.a).P2(user.id));
            }
            (P1 >= 0 ? arrayList : arrayList2).add(user);
        }
        int i7 = 0;
        boolean z10 = true;
        if (hashMap2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            b5.Z(this.a, arrayList3, 1, new z(this, 0));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            boolean z12 = z10;
            Iterator it3 = it2;
            xy b10 = xy.b(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            zy.C(this.a).r0(b10);
            if (b10.Q > 0) {
                z11 = z12;
            }
            hashMap2 = hashMap;
            z10 = z12;
            it2 = it3;
        }
        if (!z11) {
            org.telegram.messenger.g0.g3(new v(this, 2));
        }
        dismiss();
    }
}
