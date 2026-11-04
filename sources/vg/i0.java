package vg;

import ai.j6;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.be;
import b8.mf;
import b8.pf;
import gi.j8;
import gi.va;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.e3;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.wy;
import org.telegram.messenger.xo;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ln;
import org.telegram.ui.na1;
import org.telegram.ui.pc;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class i0 extends ma implements cs {
    public static final /* synthetic */ int P2 = 0;
    public Runnable A2;
    public boolean B2;
    public wi0 C2;
    public final d2 D2;
    public org.telegram.ui.Components.voip.r0 E2;
    public androidx.emoji2.text.q F2;
    public boolean G2;
    public TLRPC.Chat H2;
    public final gz I2;
    public Runnable J2;
    public int K2;
    public final gi.d L2;
    public int M2;
    public int N2;
    public String O2;
    public int Q1;
    public boolean R1;
    public int S1;
    public long T1;
    public TL_stories.TL_premium_boostsStatus U1;
    public e3 V1;
    public h0 W1;
    public boolean X1;
    public boolean Y1;
    public org.telegram.ui.Cells.q1 Z1;
    public final int a2;
    public final ArrayList b2;
    public boolean c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public ArrayList n2;
    public boolean o2;
    public int p2;
    public g0 q2;
    public final HashSet r2;
    public final ArrayList s2;
    public final ArrayList t2;
    public ArrayList u2;
    public ArrayList v2;
    public ArrayList w2;
    public y x2;
    public final TextView y2;
    public gi.d z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i3, int i10, Context context, d2 d2Var, e6 e6Var) {
        super(context, d2Var, false, p1(i3), e6Var);
        int i11 = 0;
        this.S1 = -1;
        this.Y1 = false;
        this.b2 = new ArrayList();
        this.e2 = -1;
        this.f2 = -1;
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        this.l2 = -1;
        this.m2 = -1;
        this.p2 = -1;
        this.r2 = new HashSet();
        this.s2 = new ArrayList();
        this.t2 = new ArrayList();
        this.u2 = new ArrayList();
        this.v2 = new ArrayList();
        this.w2 = new ArrayList();
        this.B2 = false;
        this.K2 = 0;
        this.N2 = -4;
        O(k6.w0(k6.h5, this.J0));
        this.M2 = this.H0;
        this.D2 = d2Var;
        this.a = i10;
        this.a2 = i3;
        b1();
        G1();
        int i12 = 1;
        int i13 = 2;
        if (i3 == 2) {
            this.B2 = true;
            G1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new u(this, i11));
        } else if (i3 == 5) {
            this.B2 = true;
            G1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new u(this, i13));
        }
        F1();
        if (i3 == 32 || q1()) {
            gz gzVar = new gz(getContext());
            this.I2 = gzVar;
            this.c.addView(gzVar, mf.c(-1.0f, -1));
        }
        if (i3 == 18 || i3 == 20 || i3 == 24 || i3 == 25 || i3 == 26 || i3 == 29 || i3 == 22 || i3 == 23 || i3 == 21 || i3 == 27 || i3 == 28 || i3 == 30 || i3 == 35 || i3 == 31) {
            ((ViewGroup) this.x2.getParent()).removeView(this.x2);
            org.telegram.ui.Components.voip.r0 r0Var = this.E2;
            if (r0Var != null) {
                ((ViewGroup) r0Var.getParent()).removeView(this.E2);
            }
            this.l1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.y2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(this.x2.getTextView().getText());
            r6.V(textView, k6.Gi, e6Var);
            textView.setOnClickListener(new t(this, i11));
            int L = org.telegram.messenger.g0.L(8.0f);
            int i14 = k6.Ci;
            int w02 = k6.w0(i14, e6Var);
            int i15 = k6.d6;
            int o10 = i0.a.o(k6.w0(i15, e6Var), 120);
            org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, w02, o10, o10);
            n6 N = r6.N(i14);
            n6 h = r6.h(i15, 120);
            textView.setBackground(k02);
            r6.k(textView, k02, N, h, e6Var);
        }
        if (i3 == 32) {
            ((ViewGroup) this.x2.getParent()).removeView(this.x2);
            gi.d dVar = new gi.d(context, e6Var, true);
            this.L2 = dVar;
            dVar.k();
            dVar.i(bd.M0(2131753625, null), false, true);
            dVar.setOnClickListener(new t(this, i12));
            this.b.addView(dVar, mf.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.b.post(new v(this, 3));
        }
        if (i3 == 19 || i3 == 18) {
            this.b.post(new v(this, 4));
        }
    }

    public static androidx.emoji2.text.q o1(int i3, int i10) {
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q();
        qVar.a = 0;
        qVar.d = null;
        qVar.e = null;
        qVar.f = null;
        qVar.b = 0;
        qVar.c = 0;
        if (i3 == 0) {
            qVar.b = hp.s1(i10).P4;
            qVar.c = hp.s1(i10).Q4;
            qVar.a = R.drawable.msg_limit_pin;
            qVar.d = bd.a0("LimitReachedPinDialogs", null, 2131748962, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = bd.a0("LimitReachedPinDialogsPremium", null, 2131748960, Integer.valueOf(qVar.c));
            qVar.f = bd.a0("LimitReachedPinDialogsLocked", null, 2131748961, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 == 33) {
            qVar.b = hp.s1(i10).m6;
            qVar.c = hp.s1(i10).n6;
            qVar.a = R.drawable.msg_limit_pin;
            qVar.d = bd.a0(null, null, 2131748959, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = bd.a0(null, null, 2131748957, Integer.valueOf(qVar.c));
            qVar.f = bd.a0(null, null, 2131748958, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 == 2) {
            qVar.b = hp.s1(i10).R4;
            qVar.c = hp.s1(i10).S4;
            qVar.a = R.drawable.msg_limit_links;
            qVar.d = bd.a0("LimitReachedPublicLinks", null, 2131748955, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = bd.a0("LimitReachedPublicLinksPremium", null, 2131748953, Integer.valueOf(qVar.c));
            qVar.f = bd.a0("LimitReachedPublicLinksLocked", null, 2131748954, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 == 12) {
            qVar.b = hp.s1(i10).x6;
            qVar.c = hp.s1(i10).y6;
            qVar.a = R.drawable.msg_limit_links;
            qVar.d = bd.a0("LimitReachedFolderLinks", null, 2131748968, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = bd.a0("LimitReachedFolderLinksPremium", null, 2131748966, Integer.valueOf(qVar.c));
            qVar.f = bd.a0("LimitReachedFolderLinksLocked", null, 2131748967, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 == 13) {
            qVar.b = hp.s1(i10).z6;
            qVar.c = hp.s1(i10).A6;
            qVar.a = R.drawable.msg_limit_folder;
            qVar.d = bd.a0("LimitReachedSharedFolders", null, 2131748951, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = bd.a0("LimitReachedSharedFoldersPremium", null, 2131748949, Integer.valueOf(qVar.c));
            qVar.f = bd.a0("LimitReachedSharedFoldersLocked", null, 2131748950, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 == 3) {
            qVar.b = hp.s1(i10).L4;
            qVar.c = hp.s1(i10).M4;
            qVar.a = R.drawable.msg_limit_folder;
            qVar.d = bd.a0("LimitReachedFolders", null, 2131748965, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = bd.a0("LimitReachedFoldersPremium", null, 2131748963, Integer.valueOf(qVar.c));
            qVar.f = bd.a0("LimitReachedFoldersLocked", null, 2131748964, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 == 4) {
            qVar.b = hp.s1(i10).N4;
            qVar.c = hp.s1(i10).O4;
            qVar.a = R.drawable.msg_limit_chats;
            qVar.d = bd.a0("LimitReachedChatInFolders", null, 2131748983, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = bd.a0("LimitReachedChatInFoldersPremium", null, 2131748981, Integer.valueOf(qVar.c));
            qVar.f = bd.a0("LimitReachedChatInFoldersLocked", null, 2131748982, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 == 5) {
            qVar.b = hp.s1(i10).D4;
            qVar.c = hp.s1(i10).E4;
            qVar.a = R.drawable.msg_limit_groups;
            qVar.d = bd.a0("LimitReachedCommunities", null, 2131748980, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = bd.a0("LimitReachedCommunitiesPremium", null, 2131748978, Integer.valueOf(qVar.c));
            qVar.f = bd.a0("LimitReachedCommunitiesLocked", null, 2131748979, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 == 6) {
            qVar.b = 100;
            qVar.c = hs.e3;
            qVar.a = R.drawable.msg_limit_folder;
            qVar.d = bd.a0("LimitReachedFileSize", null, 2131748971, "2 GB", "4 GB");
            qVar.e = bd.a0("LimitReachedFileSizePremium", null, 2131748969, "4 GB");
            qVar.f = bd.a0("LimitReachedFileSizeLocked", null, 2131748970, "2 GB");
            return qVar;
        }
        if (i3 == 7) {
            qVar.b = 3;
            qVar.c = 4;
            qVar.a = R.drawable.msg_limit_accounts;
            qVar.d = bd.a0("LimitReachedAccounts", null, 2131748985, 3, Integer.valueOf(qVar.c));
            qVar.e = bd.a0("LimitReachedAccountsPremium", null, 2131748984, Integer.valueOf(qVar.c));
            qVar.f = bd.a0("LimitReachedAccountsPremium", null, 2131748984, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 == 11) {
            qVar.b = 0;
            qVar.c = 0;
            qVar.a = R.drawable.msg_limit_links;
            qVar.d = bd.a0("LimitReachedAccounts", null, 2131748985, 0, Integer.valueOf(qVar.c));
            qVar.e = "";
            qVar.f = "";
            return qVar;
        }
        if (i3 == 14) {
            qVar.b = hp.s1(i10).i5;
            qVar.c = hp.s1(i10).j5;
            qVar.a = R.drawable.msg_limit_stories;
            qVar.d = bd.H(',', "LimitReachedStoriesCount2First", qVar.b) + "\n" + bd.H(',', "LimitReachedStoriesCount2Second", qVar.c);
            qVar.e = bd.H(',', "LimitReachedStoriesCount2Premium", qVar.c);
            qVar.f = bd.H(',', "LimitReachedStoriesCount2Premium", qVar.b);
            return qVar;
        }
        if (i3 == 15) {
            qVar.b = hp.s1(i10).k5;
            qVar.c = hp.s1(i10).l5;
            qVar.a = R.drawable.msg_limit_stories;
            qVar.d = bd.a0("LimitReachedStoriesWeekly", null, 2131748937, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = bd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748936, Integer.valueOf(qVar.c));
            qVar.f = bd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748936, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 == 16) {
            qVar.b = hp.s1(i10).m5;
            qVar.c = hp.s1(i10).n5;
            qVar.a = R.drawable.msg_limit_stories;
            qVar.d = bd.a0("LimitReachedStoriesMonthly", null, 2131748939, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = bd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748938, Integer.valueOf(qVar.c));
            qVar.f = bd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748938, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i3 != 18 && i3 != 32 && i3 != 20 && i3 != 24 && i3 != 27 && i3 != 28 && i3 != 25 && i3 != 30 && i3 != 35 && i3 != 29 && i3 != 22 && i3 != 23 && i3 != 19 && i3 != 21 && i3 != 26) {
            return qVar;
        }
        qVar.b = hp.s1(i10).m5;
        qVar.c = hp.s1(i10).n5;
        qVar.a = R.drawable.filled_limit_boost;
        qVar.d = bd.a0("LimitReachedStoriesMonthly", null, 2131748939, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
        qVar.e = bd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748938, Integer.valueOf(qVar.c));
        qVar.f = bd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748938, Integer.valueOf(qVar.b));
        return qVar;
    }

    public static boolean p1(int i3) {
        return i3 == 0 || i3 == 33 || i3 == 3 || i3 == 4 || i3 == 6 || i3 == 7 || i3 == 12 || i3 == 13 || i3 == 14 || i3 == 15 || i3 == 16;
    }

    public static String u1(int i3) {
        switch (i3) {
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

    public static void w1(d2 d2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, e3 e3Var, long j10, boolean z10) {
        if (tL_premium_boostsStatus == null || e3Var == null || d2Var.getContext() == null) {
            return;
        }
        i0 i0Var = new i0(32, d2Var.getCurrentAccount(), d2Var.getContext(), d2Var, d2Var.getResourceProvider());
        i0Var.A1(e3Var);
        i0Var.z1(tL_premium_boostsStatus, true);
        i0Var.B1(j10);
        if (z10) {
            d2Var.showDialog(i0Var);
        } else {
            i0Var.show();
        }
    }

    public final void A1(e3 e3Var) {
        this.V1 = e3Var;
        E1();
        F1();
    }

    public final void B1(long j10) {
        this.T1 = j10;
        G1();
    }

    public final void C1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.H2 = chat;
        this.O2 = str;
        this.R1 = !TextUtils.isEmpty(str) || t3.y(3, chat);
        this.u2 = new ArrayList(arrayList);
        this.v2 = arrayList2;
        this.w2 = arrayList3;
        HashSet hashSet = this.r2;
        hashSet.clear();
        if (this.R1) {
            ArrayList arrayList4 = this.u2;
            int size = arrayList4.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList4.get(i3);
                i3++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    hashSet.add(user);
                }
            }
        }
        G1();
        E1();
        int i10 = this.a2;
        if ((i10 == 11 || i10 == 34) && !hp.s1(this.a).D3()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.u2.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            y yVar = this.x2;
            if (yVar != null && yVar.getParent() != null) {
                ((ViewGroup) this.x2.getParent()).removeView(this.x2);
            }
            org.telegram.ui.Components.voip.r0 r0Var = this.E2;
            if (r0Var != null && r0Var.getParent() != null) {
                ((ViewGroup) this.E2.getParent()).removeView(this.E2);
            }
            tj0 tj0Var = this.l1;
            if (tj0Var != null) {
                tj0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void D1() {
        int i3;
        this.n2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        int i10 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.a2 == 31) {
            i10 = 1;
        }
        hp s12 = hp.s1(this.a);
        xo xoVar = s12.q4;
        int max = Math.max(10, xoVar != null ? xoVar.e(r1()) : 0);
        xo xoVar2 = s12.r4;
        int max2 = Math.max(max, xoVar2 != null ? xoVar2.e(r1()) : 0);
        int max3 = r1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, s12.A5), s12.y5), s12.z5), s12.w5), s12.v5) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, s12.q5), s12.r5), s12.s5), s12.t5), s12.u5), s12.z4), s12.A4);
        ArrayList arrayList = null;
        while (i10 <= max3) {
            boolean r12 = r1();
            ArrayList arrayList2 = new ArrayList();
            hp s13 = hp.s1(this.a);
            if (!r12 && i10 >= s13.A4) {
                arrayList2.add(d0.a(R.drawable.menu_feature_translate, 2131753660));
            }
            d0 b10 = d0.b(R.drawable.menu_feature_stories, i10, "BoostFeatureStoriesPerDay");
            b10.f = true;
            arrayList2.add(b10);
            if (!r12) {
                d0 b11 = d0.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                b11.f = true;
                arrayList2.add(b11);
            }
            xo xoVar3 = s13.q4;
            int a10 = xoVar3 != null ? xoVar3.a(i10, false) : 0;
            xo xoVar4 = s13.r4;
            int a11 = xoVar4 != null ? xoVar4.a(i10, r12) : 0;
            if (!r12 && a10 > 0) {
                arrayList2.add(d0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
            }
            if (!r12 && a10 > 0) {
                arrayList2.add(d0.b(R.drawable.menu_feature_links, a10, "BoostFeatureReplyColor"));
            }
            if (!r12 && i10 >= s13.q5) {
                arrayList2.add(d0.a(R.drawable.menu_feature_links2, 2131753633));
            }
            if (a11 > 0) {
                arrayList2.add(d0.b(R.drawable.menu_feature_color_profile, a11, r12 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
            }
            if (r12 && i10 >= s13.x5) {
                arrayList2.add(d0.a(R.drawable.menu_feature_pack, 2131753651));
            }
            if ((!r12 && i10 >= s13.r5) || (r12 && i10 >= s13.v5)) {
                arrayList2.add(d0.a(R.drawable.menu_feature_cover, r12 ? 2131753637 : 2131753638));
            }
            if (r12 && i10 >= s13.A5) {
                arrayList2.add(d0.a(R.drawable.menu_feature_voice, 2131753628));
            }
            if ((!r12 && i10 >= s13.s5) || (r12 && i10 >= s13.w5)) {
                arrayList2.add(new d0(R.drawable.menu_feature_status, 2131753647, -1, "1000+", null));
            }
            if ((!r12 && i10 >= s13.t5) || (r12 && i10 >= s13.y5)) {
                arrayList2.add(d0.b(R.drawable.menu_feature_wallpaper, 8, r12 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
            }
            if ((!r12 && i10 >= s13.u5) || (r12 && i10 >= s13.z5)) {
                arrayList2.add(d0.a(R.drawable.menu_feature_custombg, r12 ? 2131753652 : 2131753653));
            }
            if (!r12 && i10 >= s13.z4) {
                arrayList2.add(d0.a(R.drawable.menu_feature_noads, 2131753629));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (0; i3 < arrayList.size(); i3 + 1) {
                    d0 d0Var = (d0) arrayList.get(i3);
                    d0 d0Var2 = (d0) arrayList2.get(i3);
                    int i11 = d0Var.e;
                    i3 = (d0Var2 != null && ((d0Var.f && i11 > 2) || (d0Var.a == d0Var2.a && d0Var.b == d0Var2.b && TextUtils.equals(d0Var.c, d0Var2.c) && TextUtils.equals(d0Var.d, d0Var2.d) && i11 == d0Var2.e))) ? i3 + 1 : 0;
                }
                i10++;
            }
            ArrayList arrayList3 = this.n2;
            arrayList3.add(new c0(i10, arrayList3.isEmpty()));
            this.n2.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void E1() {
        String str = null;
        if (this.c2) {
            this.x2.c(bd.M0(2131749138, null), false, false);
            return;
        }
        int i3 = this.a2;
        if (i3 != 19 && i3 != 32 && !s1()) {
            HashSet hashSet = this.r2;
            if (i3 != 11 && i3 != 34) {
                if (hashSet.size() <= 0) {
                    y yVar = this.x2;
                    yVar.r = false;
                    yVar.d(true);
                    return;
                } else {
                    if (i3 == 2) {
                        str = bd.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i3 == 5) {
                        str = bd.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.x2.c(str, true, true);
                    return;
                }
            }
            y yVar2 = this.x2;
            if (yVar2.J == null) {
                dq dqVar = new dq(yVar2.getContext(), null);
                yVar2.J = dqVar;
                dqVar.setGravity(3);
                dq dqVar2 = yVar2.J;
                int i10 = k6.Ci;
                int i11 = k6.Gi;
                cq cqVar = dqVar2.a;
                cqVar.v = i10;
                cqVar.w = i11;
                cqVar.b = 0.8f;
                yVar2.setClipChildren(false);
                yVar2.addView(yVar2.J, mf.e(-1, 24, 16));
            }
            if (!this.R1) {
                this.x2.c(bd.M0(2131752041, null), true, true);
            } else if (hashSet.size() > 0) {
                this.x2.c(bd.M0(2131745629, null), true, true);
            } else {
                this.x2.c(bd.M0(2131754557, null), true, true);
            }
            this.x2.J.a.c(hashSet.size(), true);
            this.x2.invalidate();
            return;
        }
        e3 e3Var = this.V1;
        boolean z10 = e3Var.a;
        if ((z10 || e3Var.b) && !e3Var.l && !e3Var.d) {
            if (e3Var.m) {
                this.x2.c(bd.M0(2131747839, null), true, true);
                return;
            }
            y yVar3 = this.x2;
            yVar3.r = false;
            yVar3.d(true);
            return;
        }
        gi.d dVar = this.L2;
        if (z10) {
            if (xg.s.i()) {
                this.x2.c(bd.M0(2131753591, null), true, true);
            } else {
                this.x2.c(bd.M0(r1() ? 2131753625 : 2131753663, null), true, true);
            }
            this.z2.i(bd.M0(2131753664, null), true, true);
            if (dVar != null) {
                dVar.i(bd.M0(2131753625, null), true, true);
                return;
            }
            return;
        }
        if (e3Var.m) {
            this.z2.i(bd.M0(2131747839, null), true, true);
            if (dVar != null) {
                dVar.i(bd.M0(2131747839, null), true, true);
            }
            this.x2.c(bd.M0(2131747839, null), true, true);
            return;
        }
        if (xg.s.i()) {
            if (dVar != null) {
                dVar.i(bd.M0(2131753625, null), true, true);
            }
            this.z2.i(bd.M0(2131753664, null), true, true);
            this.x2.c(bd.M0(2131753591, null), true, true);
            return;
        }
        if (dVar != null) {
            dVar.i(bd.M0(2131747839, null), true, true);
        }
        this.z2.i(bd.M0(2131747839, null), true, true);
        this.x2.c(bd.M0(2131747839, null), true, true);
    }

    public final void F1() {
        String M0;
        if (this.c2) {
            this.x2.c(bd.M0(2131749138, null), false, false);
            return;
        }
        int i3 = this.a2;
        if (i3 == 19 || i3 == 32 || s1()) {
            if (!xg.s.i()) {
                this.x2.f.setText(bd.M0(r1() ? 2131753625 : 2131753663, null));
                return;
            }
            n0 n0Var = this.x2.f;
            e3 e3Var = this.V1;
            if (e3Var == null || !e3Var.d) {
                M0 = bd.M0(r1() ? 2131753625 : 2131753663, null);
            } else {
                M0 = bd.M0(2131753591, null);
            }
            n0Var.setText(M0);
            e3 e3Var2 = this.V1;
            if (e3Var2 == null || !e3Var2.m) {
                return;
            }
            this.x2.f.setText(bd.M0(2131747839, null));
            return;
        }
        if (i3 == 18 || i3 == 20 || i3 == 24 || i3 == 25 || i3 == 26 || i3 == 29 || i3 == 22 || i3 == 23 || i3 == 21 || i3 == 27 || i3 == 28 || i3 == 30 || i3 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new wp(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) bd.M0(2131751762, null));
            this.x2.f.setText(spannableStringBuilder);
            return;
        }
        if (h10.i(this.a).q() || hp.s1(this.a).D3() || this.G2) {
            this.x2.f.setText(bd.M0(2131747839, null));
            y yVar = this.x2;
            yVar.E.p = null;
            yVar.G.setVisibility(8);
            return;
        }
        this.x2.f.setText(bd.M0(2131749207, null));
        androidx.emoji2.text.q qVar = this.F2;
        if (qVar == null) {
            y yVar2 = this.x2;
            yVar2.E.p = null;
            yVar2.G.setVisibility(8);
            return;
        }
        int i10 = qVar.b;
        int i11 = i10 + 1;
        int i12 = qVar.c;
        if (i11 == i12) {
            this.x2.setIcon(R.raw.addone_icon);
            return;
        }
        if (i10 != 0 && i12 != 0) {
            float f10 = i12 / i10;
            if (f10 >= 1.6f && f10 <= 2.5f) {
                this.x2.setIcon(R.raw.double_icon);
                return;
            }
        }
        y yVar3 = this.x2;
        yVar3.E.p = null;
        yVar3.G.setVisibility(8);
    }

    public final void G1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        this.S1 = -1;
        this.k2 = -1;
        this.m2 = -1;
        this.d2 = 1;
        this.e2 = 0;
        int i3 = this.a2;
        if (i3 == 19 || i3 == 18 || i3 == 20 || i3 == 24 || i3 == 27 || i3 == 28 || i3 == 22 || i3 == 23 || i3 == 25 || i3 == 26 || i3 == 29 || i3 == 21 || i3 == 30 || i3 == 35) {
            if (i3 != 19 || t3.N(n1())) {
                this.s1 = 0.24f;
                int i10 = this.d2;
                this.d2 = i10 + 1;
                this.S1 = i10;
                if (hp.s1(this.a).p4) {
                    int i11 = this.d2;
                    this.d2 = i11 + 1;
                    this.l2 = i11;
                }
            }
            D1();
            int i12 = this.d2;
            int i13 = i12 + 1;
            this.d2 = i13;
            this.m2 = i12;
            this.d2 = (this.n2.size() - 1) + i13;
        } else if (i3 == 31 || i3 == 32) {
            this.s1 = 0.24f;
            D1();
            int i14 = this.d2;
            this.h2 = i14;
            int i15 = i14 + 1;
            this.d2 = i15;
            this.m2 = i14;
            int size = (this.n2.size() - 1) + i15;
            this.d2 = size;
            this.i2 = size;
        } else if (!p1(i3)) {
            if (i3 == 11 || i3 == 34) {
                this.s1 = 0.24f;
            } else {
                int i16 = this.d2;
                this.f2 = i16;
                this.d2 = i16 + 2;
                this.g2 = i16 + 1;
            }
            if (this.B2) {
                int i17 = this.d2;
                this.d2 = i17 + 1;
                this.j2 = i17;
            } else if (i3 != 11 || this.R1) {
                if (i3 != 11 || hp.s1(this.a).D3() || ((((arrayList = this.w2) == null || arrayList.isEmpty()) && ((arrayList2 = this.v2) == null || arrayList2.size() < this.u2.size())) || (arrayList3 = this.w2) == null || arrayList3.size() != 1 || (arrayList4 = this.v2) == null || arrayList4.size() != 1 || !this.R1)) {
                    int i18 = this.d2;
                    this.h2 = i18;
                    if (i3 == 11 || i3 == 34) {
                        this.d2 = this.u2.size() + i18;
                    } else if (i3 == 5) {
                        this.d2 = this.s2.size() + i18;
                    } else {
                        this.d2 = this.b2.size() + i18;
                    }
                    this.i2 = this.d2;
                }
                if (this.i2 - this.h2 > 1) {
                    int i19 = this.d2;
                    this.d2 = i19 + 1;
                    this.k2 = i19;
                }
            }
        }
        this.l1.getAdapter().f();
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        return new b0(this);
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        int i3 = this.a2;
        if (i3 == 11) {
            return bd.M0(2131752401, null);
        }
        if (i3 == 34) {
            return bd.M0(2131752622, null);
        }
        if (i3 == 35) {
            return bd.M0(2131743884, null);
        }
        switch (i3) {
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
                return bd.M0(2131743884, null);
            case 19:
            case hs.T /* 30 */:
                return bd.M0(r1() ? 2131753625 : 2131753663, null);
            case hs.U /* 31 */:
                return bd.M0(2131753600, null);
            case 32:
                return bd.M0(2131753625, null);
            default:
                return bd.M0(2131748986, null);
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final void U0(qt0 qt0Var) {
        int i3;
        Context context = qt0Var.getContext();
        gi.d dVar = new gi.d(context, this.J0, true);
        this.z2 = dVar;
        dVar.setFlickeringLoading(true);
        this.z2.i(bd.M0(2131753664, null), false, true);
        int i10 = 2;
        this.z2.setOnClickListener(new t(this, i10));
        y yVar = new y(this, context, this.J0);
        this.x2 = yVar;
        pf.b(yVar, 0.02f, 1.2f);
        int i11 = 22;
        if (!this.q1 && (i3 = this.a2) != 18 && i3 != 20 && i3 != 24 && i3 != 25 && i3 != 26 && i3 != 29 && i3 != 22 && i3 != 23 && i3 != 21 && i3 != 27 && i3 != 28 && i3 != 30 && i3 != 35) {
            org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(15, context, this);
            this.E2 = r0Var;
            r6.i(k6.h5, r0Var, this.J0);
            qt0Var.addView(this.E2, mf.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        y yVar2 = this.x2;
        float f10 = (this.u0 / org.telegram.messenger.g0.p) + 16.0f;
        qt0Var.addView(yVar2, mf.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int L = org.telegram.messenger.g0.L(72.0f);
        tj0 tj0Var = this.l1;
        tj0Var.setPadding(0, 0, 0, L);
        tj0Var.setClipToPadding(false);
        tj0Var.setClipChildren(false);
        tj0Var.setOnItemClickListener(new j6(this, i11));
        tj0Var.setOnItemLongClickListener(new w(this, i10));
        this.x2.w.setOnClickListener(new org.telegram.ui.web.d(4, this, context));
        this.x2.h.setOnClickListener(new t(this, 3));
        this.C2 = new wi0(tj0Var, true);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.ChatFull N0;
        if (i3 != hs.V2) {
            if (i3 != hs.U2) {
                if (i3 == hs.T2) {
                    dismiss();
                    return;
                }
                return;
            }
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.V1 == null) {
                return;
            }
            this.U1.boosts += intValue;
            if (this.a2 == 32 && (N0 = hp.s1(this.a).N0(-this.T1)) != null) {
                N0.boosts_applied += intValue;
            }
            t1();
            z1(tL_premium_boostsStatus, this.X1);
            e3 e3Var = this.V1;
            e3Var.m = this.U1.next_level_boosts <= 0;
            e3Var.l = true;
            e3Var.a(tL_premium_myBoosts);
            if (v1()) {
                ac Q = new fc(this.c, this.J0).Q(R.raw.ic_boosts_replace, 30, bd.G(intValue, "BoostingReassignedFromPlural", bd.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        d2 d2Var = this.p1;
        d2 lastFragment = d2Var.getParentLayout().getLastFragment();
        if (lastFragment instanceof dh.o) {
            List fragmentStack = d2Var.getParentLayout().getFragmentStack();
            d2 d2Var2 = fragmentStack.size() >= 2 ? (d2) t4.c.d(2, fragmentStack) : null;
            d2 d2Var3 = fragmentStack.size() >= 3 ? (d2) t4.c.d(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (d2) t4.c.d(4, fragmentStack) : null;
            if (d2Var2 instanceof ln) {
                ((ActionBarLayout) d2Var.getParentLayout()).d0(d2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                xg.j.f(d2Var3, chat, false);
                return;
            } else {
                if (d2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) d2Var.getParentLayout()).d0(d2Var3, false);
                }
                lastFragment.finishFragment();
                xg.j.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof wm) && booleanValue) {
            xg.j.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof pc) && booleanValue) {
            List fragmentStack2 = d2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                d2 d2Var4 = (d2) fragmentStack2.get(size);
                if ((d2Var4 instanceof wm) || (d2Var4 instanceof uw)) {
                    r6 = d2Var4;
                    break;
                }
                arrayList.add(d2Var4);
            }
            if (r6 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((ActionBarLayout) d2Var.getParentLayout()).d0((d2) obj, false);
            }
            d2Var.finishFragment();
            dismiss();
            xg.j.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            va vaVar = va.G2;
            if (vaVar == null || !vaVar.d) {
                dismiss();
                xg.j.f(LaunchActivity.Q(), chat, false);
                return;
            }
            wm ra2 = wm.ra(-chat.id);
            LaunchActivity.Q().presentFragment(ra2, false, false);
            va.w();
            dismiss();
            xg.j.f(ra2, chat, false);
            return;
        }
        va vaVar2 = va.G2;
        if (vaVar2 != null && vaVar2.d) {
            wm ra3 = wm.ra(-chat.id);
            LaunchActivity.Q().presentFragment(ra3, false, false);
            va.w();
            dismiss();
            xg.j.f(ra3, chat, true);
            return;
        }
        List fragmentStack3 = d2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (d2) t4.c.d(2, fragmentStack3) : null;
        d2Var.finishFragment();
        dismiss();
        if (r6 instanceof wm) {
            xg.j.f(r6, chat, true);
        }
    }

    public final void h1(final v70 v70Var, boolean z10) {
        if (!v70Var.a() || z10) {
            final int i3 = 1;
            v70Var.setLoading(true);
            hp.s1(this.a).G0();
            final int i10 = 0;
            xg.s.a(-this.T1, Arrays.asList(Integer.valueOf(this.V1.g)), new u10(this) { // from class: vg.x
                public final /* synthetic */ i0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            i0 i0Var = this.b;
                            hp.s1(i0Var.a).G0().a(i0Var.T1, new ai.m(i0Var, v70Var, (TL_stories.TL_premium_myBoosts) obj, 13));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            v70 v70Var2 = v70Var;
                            if (startsWith) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    org.telegram.messenger.g0.i3(new u9.a(9, this.b, v70Var2), intValue * 1000);
                                    break;
                                } else {
                                    xg.j.g(intValue);
                                }
                            }
                            v70Var2.setLoading(false);
                            break;
                    }
                }
            }, new u10(this) { // from class: vg.x
                public final /* synthetic */ i0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i3) {
                        case 0:
                            i0 i0Var = this.b;
                            hp.s1(i0Var.a).G0().a(i0Var.T1, new ai.m(i0Var, v70Var, (TL_stories.TL_premium_myBoosts) obj, 13));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            v70 v70Var2 = v70Var;
                            if (startsWith) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    org.telegram.messenger.g0.i3(new u9.a(9, this.b, v70Var2), intValue * 1000);
                                    break;
                                } else {
                                    xg.j.g(intValue);
                                }
                            }
                            v70Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void i1() {
        if (this.z2.isAttachedToWindow()) {
            h1(this.z2, false);
            return;
        }
        gi.d dVar = this.L2;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            h1(this.x2, false);
        } else {
            h1(dVar, false);
        }
    }

    public int j1() {
        return 0;
    }

    public final String k1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.U1.boost_url;
        }
        int i3 = this.a;
        long j10 = -this.T1;
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(j10));
        if (TextUtils.isEmpty(t3.K(M0, false))) {
            return a1.g.p(j10, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + t3.K(M0, false);
    }

    public final String l1(boolean z10) {
        String str;
        int i3;
        if (this.a2 == 32) {
            TLRPC.Chat n12 = n1();
            TLRPC.ChatFull N0 = hp.s1(this.a).N0(-this.T1);
            return bd.G(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), "BoostingRemoveRestrictionsSubtitle", n12 == null ? "" : n12.title);
        }
        TLRPC.Chat M0 = hp.s1(this.a).M0(Long.valueOf(-this.T1));
        if (M0 == null) {
            str = bd.M0(r1() ? 2131754876 : 2131754904, null);
        } else {
            str = M0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        boolean z11 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (s1() && this.U1.next_level_boosts != 0 && z10) {
            i3 = r1() ? 2131749428 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.U1;
            int i10 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return bd.a0(null, null, i3, str, bd.G(i10, "MoreBoosts", Integer.valueOf(i10)));
        }
        if (z11 && this.V1.d) {
            if (this.U1.level == 1) {
                return bd.a0(null, null, r1() ? 2131749501 : 2131752450, new Object[0]);
            }
            return bd.a0(null, null, r1() ? 2131749500 : 2131752449, Integer.valueOf(this.U1.level), bd.G(this.U1.level, "BoostStories", new Object[0]));
        }
        if (this.V1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.U1;
            if (tL_premium_boostsStatus3.level == 0) {
                i3 = r1() ? 2131749428 : 2131752352;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.U1;
                int i11 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return bd.a0(null, null, i3, str, bd.G(i11, "MoreBoosts", Integer.valueOf(i11)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return bd.a0(null, null, r1() ? 2131749500 : 2131752449, Integer.valueOf(this.U1.level), bd.G(this.U1.level + 1, "BoostStories", new Object[0]));
            }
            i3 = r1() ? 2131749428 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.U1;
            int i12 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return bd.a0(null, null, i3, str, bd.G(i12, "MoreBoosts", Integer.valueOf(i12)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.U1;
        if (tL_premium_boostsStatus6.level == 0) {
            i3 = r1() ? 2131749428 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.U1;
            int i13 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return bd.a0(null, null, i3, str, bd.G(i13, "MoreBoosts", Integer.valueOf(i13)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return bd.a0(null, null, r1() ? 2131749500 : 2131752449, Integer.valueOf(this.U1.level), bd.G(this.U1.level + 1, "BoostStories", new Object[0]));
        }
        i3 = r1() ? 2131749428 : 2131752352;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.U1;
        int i14 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return bd.a0(null, null, i3, str, bd.G(i14, "MoreBoosts", Integer.valueOf(i14)));
    }

    public final String m1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return bd.a0("BoostsMaxLevelReached", null, 2131753158, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.V1.d) {
            return bd.M0(r1() ? 2131753625 : 2131753663, null);
        }
        boolean z10 = this.X1;
        int i3 = this.a2;
        if (!z10) {
            if (i3 == 32) {
                return bd.M0(r1() ? 2131753625 : 2131753663, null);
            }
            if (this.V1.d) {
                return bd.M0(r1() ? 2131742849 : 2131742851, null);
            }
            return bd.M0(r1() ? 2131753527 : 2131753528, null);
        }
        if (i3 == 32) {
            return bd.M0(r1() ? 2131753625 : 2131753663, null);
        }
        TLRPC.Chat M0 = hp.s1(this.a).M0(Long.valueOf(-this.T1));
        if (this.V1.d) {
            return bd.a0("YouBoostedChannel2", null, 2131742850, M0.title);
        }
        return bd.M0(r1() ? 2131753625 : 2131753663, null);
    }

    public final TLRPC.Chat n1() {
        return hp.s1(this.a).M0(Long.valueOf(-this.T1));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.a).c(this, hs.V2);
        hs.f(this.a).c(this, hs.U2);
        hs.f(this.a).c(this, hs.T2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.a).n(this, hs.V2);
        hs.f(this.a).n(this, hs.U2);
        hs.f(this.a).n(this, hs.T2);
    }

    public final boolean q1() {
        int i3 = this.a2;
        return i3 == 19 || i3 == 18 || i3 == 20 || i3 == 24 || i3 == 25 || i3 == 26 || i3 == 29 || i3 == 22 || i3 == 27 || i3 == 28 || i3 == 23 || i3 == 30 || i3 == 35;
    }

    public final boolean r1() {
        return !t3.V(hp.s1(this.a).M0(Long.valueOf(-this.T1)));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 >= 0 || this.H0 != this.M2 || (w02 = k6.w0(k6.h5, this.J0)) == this.H0) {
                return;
            }
            this.H0 = w02;
            this.M2 = w02;
            E0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean s1() {
        return q1() && t3.N(n1());
    }

    public final void t1() {
        g0 g0Var = this.q2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        int i3 = tL_premium_boostsStatus.boosts;
        int i10 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        g0Var.b++;
        g0Var.a = be.a((i3 - r3) / i10, 0.0f, 1.0f);
        g0Var.a0 = true;
        g0Var.b0 = g0Var.n;
        g0Var.i(i3, true);
        g0Var.J.requestLayout();
        g0Var.requestLayout();
    }

    public final boolean v1() {
        hs f10 = hs.f(this.a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        e3 e3Var = this.V1;
        e3Var.getClass();
        e3 e3Var2 = new e3();
        e3Var2.a = e3Var.a;
        e3Var2.b = e3Var.b;
        e3Var2.c = e3Var.c;
        e3Var2.d = e3Var.d;
        e3Var2.e = e3Var.e;
        e3Var2.g = e3Var.g;
        e3Var2.h = e3Var.h;
        e3Var2.i = e3Var.i;
        e3Var2.j = e3Var.j;
        e3Var2.k = e3Var.k;
        e3Var2.m = e3Var.m;
        f10.m(hs.p3, tL_premium_boostsStatus, e3Var2, Long.valueOf(this.T1));
        gi.d dVar = this.L2;
        if (dVar != null) {
            TLRPC.ChatFull N0 = hp.s1(this.a).N0(-this.T1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (max == 0) {
                hs.f(this.a).m(hs.o3, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.h0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.W1, transitionSet);
        h0 h0Var = this.W1;
        xg.b bVar = h0Var.c;
        int indexOfChild = h0Var.indexOfChild(h0Var.b);
        i0 i0Var = h0Var.e;
        if (i0Var.X1) {
            int indexOfChild2 = h0Var.indexOfChild(h0Var.d);
            h0Var.removeView(h0Var.d);
            h0Var.d.removeView(h0Var.a);
            h0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(h0Var.getContext());
            h0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            h0Var.d.setWeightSum(1.0f);
            h0Var.d.addView(h0Var.a, mf.p(-2, -2, 1.0f, 0));
            h0Var.d.addView(bVar, mf.t(-2, -2, 48, 0, 2, 0, 0));
            h0Var.addView(h0Var.d, indexOfChild2, mf.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = h0Var.indexOfChild(h0Var.a);
            h0Var.removeView(h0Var.a);
            TextView textView = new TextView(h0Var.getContext());
            h0Var.a = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            h0Var.a.setTextSize(1, 20.0f);
            r6.V(h0Var.a, k6.G6, i0Var.J0);
            h0Var.a.setGravity(17);
            h0Var.addView(h0Var.a, indexOfChild3, mf.t(-2, -2, 1, 0, 22, 0, 0));
        }
        h0Var.removeView(h0Var.b);
        TextView textView2 = new TextView(h0Var.getContext());
        h0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = h0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), h0Var.b.getLineSpacingMultiplier() * 1.1f);
        h0Var.b.setGravity(1);
        r6.V(h0Var.b, k6.G6, i0Var.J0);
        h0Var.addView(h0Var.b, indexOfChild, mf.t(-2, -2, 1, 24, -2, 24, 17));
        this.W1.a.setText(m1());
        TextView textView4 = this.W1.b;
        hp s12 = hp.s1(this.a);
        boolean r12 = r1();
        int i3 = this.a2;
        String str = null;
        if (i3 == 20) {
            str = bd.a0(null, null, r12 ? 2131749426 : 2131752349, Integer.valueOf(j1()));
        } else if (i3 == 24) {
            str = bd.a0(null, null, r12 ? 2131749422 : 2131752346, Integer.valueOf(j1()));
        } else if (i3 == 29) {
            str = bd.a0(null, null, 2131749425, Integer.valueOf(s12.x5));
        } else if (i3 == 30) {
            str = bd.a0(null, null, 2131752343, Integer.valueOf(s12.z4));
        } else if (i3 == 35) {
            str = bd.a0(null, null, 2131752350, Integer.valueOf(s12.A4));
        } else if (i3 == 25) {
            str = bd.a0(null, null, r12 ? 2131749423 : 2131752347, Integer.valueOf(r12 ? s12.w5 : s12.s5));
        } else if (i3 == 26) {
            str = bd.a0(null, null, r12 ? 2131749418 : 2131752341, Integer.valueOf(r12 ? s12.w5 : s12.s5));
        } else if (i3 == 27) {
            str = bd.a0(null, null, r12 ? 2131749420 : 2131752344, Integer.valueOf(s12.q5));
        } else if (i3 == 28) {
            str = bd.a0(null, null, r12 ? 2131749421 : 2131752345, Integer.valueOf(r12 ? s12.v5 : s12.r5));
        } else if (i3 == 22) {
            str = bd.a0(null, null, r12 ? 2131749419 : 2131752342, Integer.valueOf(r12 ? s12.y5 : s12.t5));
        } else if (i3 == 23) {
            str = bd.a0(null, null, r12 ? 2131749424 : 2131752348, Integer.valueOf(r12 ? s12.z5 : s12.u5));
        }
        if (str == null) {
            str = l1(false);
        }
        textView4.setText(org.telegram.messenger.g0.X2(str));
        E1();
        gz gzVar = this.I2;
        gzVar.c(false);
        try {
            gzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.W1.c.a(this.V1.i, true);
        this.l1.y0(0);
        if (i3 == 32) {
            this.W1.c.setVisibility(8);
        }
        return true;
    }

    public final void x1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String G = bd.G(arrayList.size(), "RevokeLinks", new Object[0]);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.o2) {
                s1Var.U = org.telegram.messenger.g0.X2(bd.a0("RevokeLinkAlertChannel", null, 2131746031, hp.s1(this.a).V2 + "/" + t3.K(chat, false), chat.title));
            } else {
                s1Var.U = org.telegram.messenger.g0.X2(bd.a0("RevokeLinkAlert", null, 2131746032, hp.s1(this.a).V2 + "/" + t3.K(chat, false), chat.title));
            }
        } else if (this.o2) {
            s1Var.U = org.telegram.messenger.g0.X2(bd.a0("RevokeLinksAlertChannel", null, 2131746028, new Object[0]));
        } else {
            s1Var.U = org.telegram.messenger.g0.X2(bd.a0("RevokeLinksAlert", null, 2131746029, new Object[0]));
        }
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        alertDialog$Builder.k(bd.M0(2131746034, null), new na1(18, this, arrayList));
        s1Var.show();
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            r6.V(textView, k6.q7, this.J0);
        }
    }

    public final void y1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.O2)) {
            TLRPC.ChatFull N0 = hp.s1(this.a).N0(this.H2.id);
            if (N0 == null) {
                dismiss();
                return;
            }
            if (this.H2.username != null) {
                str = "@" + this.H2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = N0.exported_invite;
                if (tL_chatInviteExported == null) {
                    dismiss();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.O2;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = this.r2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long N1 = hp.s1(this.a).N1(user.id);
            if (N1 <= 0) {
                N1 = m5.k(hp.s1(this.a).J2(user.id));
            }
            (N1 >= 0 ? arrayList : arrayList2).add(user);
        }
        int i3 = 0;
        boolean z10 = true;
        if (hashMap2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            t4.b0(this.a, arrayList3, 1, new j8(this, 27));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            boolean z12 = z10;
            Iterator it3 = it2;
            wy b10 = wy.b(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            yy.C(this.a).r0(b10);
            if (b10.Q > 0) {
                z11 = z12;
            }
            hashMap2 = hashMap;
            z10 = z12;
            it2 = it3;
        }
        if (!z11) {
            org.telegram.messenger.g0.h3(new v(this, 2));
        }
        dismiss();
    }

    public final void z1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.U1 = tL_premium_boostsStatus;
        this.X1 = z10;
        G1();
    }
}
