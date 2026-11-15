package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.b6;
import c8.i9;
import c8.na;
import hi.g7;
import hi.sa;
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
import org.telegram.messenger.cz;
import org.telegram.messenger.dp;
import org.telegram.messenger.e3;
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.t3;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.an;
import org.telegram.ui.qc;
import org.telegram.ui.qn;
import org.telegram.ui.rv;
import org.telegram.ui.sc1;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class j0 extends ja implements is {
    public static final /* synthetic */ int S2 = 0;
    public z A2;
    public final TextView B2;
    public hi.d C2;
    public Runnable D2;
    public boolean E2;
    public xi0 F2;
    public final e2 G2;
    public rv H2;
    public androidx.emoji2.text.q I2;
    public boolean J2;
    public TLRPC.Chat K2;
    public final nz L2;
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
    public e3 Y1;
    public i0 Z1;
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
    public h0 t2;
    public final HashSet u2;
    public final ArrayList v2;
    public final ArrayList w2;
    public ArrayList x2;
    public ArrayList y2;
    public ArrayList z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i7, int i10, Context context, e2 e2Var, e6 e6Var) {
        super(context, e2Var, false, p1(i7), e6Var);
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
        P(j6.w0(j6.h5, this.J0));
        this.P2 = this.H0;
        this.G2 = e2Var;
        this.a = i10;
        this.d2 = i7;
        b1();
        G1();
        int i12 = 1;
        int i13 = 2;
        if (i7 == 2) {
            this.E2 = true;
            G1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new u(this, i11));
        } else if (i7 == 5) {
            this.E2 = true;
            G1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new u(this, i13));
        }
        F1();
        if (i7 == 32 || q1()) {
            nz nzVar = new nz(getContext());
            this.L2 = nzVar;
            this.c.addView(nzVar, c8.ja.c(-1.0f, -1));
        }
        if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35 || i7 == 31) {
            ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            rv rvVar = this.H2;
            if (rvVar != null) {
                ((ViewGroup) rvVar.getParent()).removeView(this.H2);
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
            q6.U(textView, j6.Ji, e6Var);
            textView.setOnClickListener(new t(this, i11));
            int L = org.telegram.messenger.g0.L(8.0f);
            int i14 = j6.Fi;
            int w02 = j6.w0(i14, e6Var);
            int i15 = j6.d6;
            int o4 = i0.a.o(j6.w0(i15, e6Var), 120);
            org.telegram.ui.Cells.y k02 = j6.k0(L, L, L, L, w02, o4, o4);
            m6 M = q6.M(i14);
            m6 g10 = q6.g(i15, 120);
            textView.setBackground(k02);
            q6.j(textView, k02, M, g10, e6Var);
        }
        if (i7 == 32) {
            ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            hi.d dVar = new hi.d(context, e6Var, true);
            this.O2 = dVar;
            dVar.k();
            dVar.i(hd.M0(2131753625, null), false, true);
            dVar.setOnClickListener(new t(this, i12));
            this.b.addView(dVar, c8.ja.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.b.post(new v(this, 3));
        }
        if (i7 == 19 || i7 == 18) {
            this.b.post(new v(this, 4));
        }
    }

    public static androidx.emoji2.text.q o1(int i7, int i10) {
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q();
        qVar.a = 0;
        qVar.d = null;
        qVar.e = null;
        qVar.f = null;
        qVar.b = 0;
        qVar.c = 0;
        if (i7 == 0) {
            qVar.b = np.s1(i10).Q4;
            qVar.c = np.s1(i10).R4;
            qVar.a = R.drawable.msg_limit_pin;
            qVar.d = hd.a0("LimitReachedPinDialogs", null, 2131748954, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = hd.a0("LimitReachedPinDialogsPremium", null, 2131748952, Integer.valueOf(qVar.c));
            qVar.f = hd.a0("LimitReachedPinDialogsLocked", null, 2131748953, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 33) {
            qVar.b = np.s1(i10).n6;
            qVar.c = np.s1(i10).o6;
            qVar.a = R.drawable.msg_limit_pin;
            qVar.d = hd.a0(null, null, 2131748951, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = hd.a0(null, null, 2131748949, Integer.valueOf(qVar.c));
            qVar.f = hd.a0(null, null, 2131748950, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 2) {
            qVar.b = np.s1(i10).S4;
            qVar.c = np.s1(i10).T4;
            qVar.a = R.drawable.msg_limit_links;
            qVar.d = hd.a0("LimitReachedPublicLinks", null, 2131748947, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = hd.a0("LimitReachedPublicLinksPremium", null, 2131748945, Integer.valueOf(qVar.c));
            qVar.f = hd.a0("LimitReachedPublicLinksLocked", null, 2131748946, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 12) {
            qVar.b = np.s1(i10).y6;
            qVar.c = np.s1(i10).z6;
            qVar.a = R.drawable.msg_limit_links;
            qVar.d = hd.a0("LimitReachedFolderLinks", null, 2131748960, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = hd.a0("LimitReachedFolderLinksPremium", null, 2131748958, Integer.valueOf(qVar.c));
            qVar.f = hd.a0("LimitReachedFolderLinksLocked", null, 2131748959, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 13) {
            qVar.b = np.s1(i10).A6;
            qVar.c = np.s1(i10).B6;
            qVar.a = R.drawable.msg_limit_folder;
            qVar.d = hd.a0("LimitReachedSharedFolders", null, 2131748943, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = hd.a0("LimitReachedSharedFoldersPremium", null, 2131748941, Integer.valueOf(qVar.c));
            qVar.f = hd.a0("LimitReachedSharedFoldersLocked", null, 2131748942, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 3) {
            qVar.b = np.s1(i10).M4;
            qVar.c = np.s1(i10).N4;
            qVar.a = R.drawable.msg_limit_folder;
            qVar.d = hd.a0("LimitReachedFolders", null, 2131748957, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = hd.a0("LimitReachedFoldersPremium", null, 2131748955, Integer.valueOf(qVar.c));
            qVar.f = hd.a0("LimitReachedFoldersLocked", null, 2131748956, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 4) {
            qVar.b = np.s1(i10).O4;
            qVar.c = np.s1(i10).P4;
            qVar.a = R.drawable.msg_limit_chats;
            qVar.d = hd.a0("LimitReachedChatInFolders", null, 2131748975, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = hd.a0("LimitReachedChatInFoldersPremium", null, 2131748973, Integer.valueOf(qVar.c));
            qVar.f = hd.a0("LimitReachedChatInFoldersLocked", null, 2131748974, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 5) {
            qVar.b = np.s1(i10).E4;
            qVar.c = np.s1(i10).F4;
            qVar.a = R.drawable.msg_limit_groups;
            qVar.d = hd.a0("LimitReachedCommunities", null, 2131748972, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = hd.a0("LimitReachedCommunitiesPremium", null, 2131748970, Integer.valueOf(qVar.c));
            qVar.f = hd.a0("LimitReachedCommunitiesLocked", null, 2131748971, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 6) {
            qVar.b = 100;
            qVar.c = ns.e3;
            qVar.a = R.drawable.msg_limit_folder;
            qVar.d = hd.a0("LimitReachedFileSize", null, 2131748963, "2 GB", "4 GB");
            qVar.e = hd.a0("LimitReachedFileSizePremium", null, 2131748961, "4 GB");
            qVar.f = hd.a0("LimitReachedFileSizeLocked", null, 2131748962, "2 GB");
            return qVar;
        }
        if (i7 == 7) {
            qVar.b = 3;
            qVar.c = 4;
            qVar.a = R.drawable.msg_limit_accounts;
            qVar.d = hd.a0("LimitReachedAccounts", null, 2131748977, 3, Integer.valueOf(qVar.c));
            qVar.e = hd.a0("LimitReachedAccountsPremium", null, 2131748976, Integer.valueOf(qVar.c));
            qVar.f = hd.a0("LimitReachedAccountsPremium", null, 2131748976, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 11) {
            qVar.b = 0;
            qVar.c = 0;
            qVar.a = R.drawable.msg_limit_links;
            qVar.d = hd.a0("LimitReachedAccounts", null, 2131748977, 0, Integer.valueOf(qVar.c));
            qVar.e = "";
            qVar.f = "";
            return qVar;
        }
        if (i7 == 14) {
            qVar.b = np.s1(i10).j5;
            qVar.c = np.s1(i10).k5;
            qVar.a = R.drawable.msg_limit_stories;
            qVar.d = hd.H(',', "LimitReachedStoriesCount2First", qVar.b) + "\n" + hd.H(',', "LimitReachedStoriesCount2Second", qVar.c);
            qVar.e = hd.H(',', "LimitReachedStoriesCount2Premium", qVar.c);
            qVar.f = hd.H(',', "LimitReachedStoriesCount2Premium", qVar.b);
            return qVar;
        }
        if (i7 == 15) {
            qVar.b = np.s1(i10).l5;
            qVar.c = np.s1(i10).m5;
            qVar.a = R.drawable.msg_limit_stories;
            qVar.d = hd.a0("LimitReachedStoriesWeekly", null, 2131748929, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = hd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748928, Integer.valueOf(qVar.c));
            qVar.f = hd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748928, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 == 16) {
            qVar.b = np.s1(i10).n5;
            qVar.c = np.s1(i10).o5;
            qVar.a = R.drawable.msg_limit_stories;
            qVar.d = hd.a0("LimitReachedStoriesMonthly", null, 2131748931, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
            qVar.e = hd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(qVar.c));
            qVar.f = hd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(qVar.b));
            return qVar;
        }
        if (i7 != 18 && i7 != 32 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 25 && i7 != 30 && i7 != 35 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 19 && i7 != 21 && i7 != 26) {
            return qVar;
        }
        qVar.b = np.s1(i10).n5;
        qVar.c = np.s1(i10).o5;
        qVar.a = R.drawable.filled_limit_boost;
        qVar.d = hd.a0("LimitReachedStoriesMonthly", null, 2131748931, Integer.valueOf(qVar.b), Integer.valueOf(qVar.c));
        qVar.e = hd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(qVar.c));
        qVar.f = hd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(qVar.b));
        return qVar;
    }

    public static boolean p1(int i7) {
        return i7 == 0 || i7 == 33 || i7 == 3 || i7 == 4 || i7 == 6 || i7 == 7 || i7 == 12 || i7 == 13 || i7 == 14 || i7 == 15 || i7 == 16;
    }

    public static String u1(int i7) {
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

    public static void w1(e2 e2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, e3 e3Var, long j3, boolean z10) {
        if (tL_premium_boostsStatus == null || e3Var == null || e2Var.getContext() == null) {
            return;
        }
        j0 j0Var = new j0(32, e2Var.getCurrentAccount(), e2Var.getContext(), e2Var, e2Var.getResourceProvider());
        j0Var.A1(e3Var);
        j0Var.z1(tL_premium_boostsStatus, true);
        j0Var.B1(j3);
        if (z10) {
            e2Var.showDialog(j0Var);
        } else {
            j0Var.show();
        }
    }

    public final void A1(e3 e3Var) {
        this.Y1 = e3Var;
        E1();
        F1();
    }

    public final void B1(long j3) {
        this.W1 = j3;
        G1();
    }

    public final void C1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.K2 = chat;
        this.R2 = str;
        this.U1 = !TextUtils.isEmpty(str) || t3.y(3, chat);
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
        G1();
        E1();
        int i10 = this.d2;
        if ((i10 == 11 || i10 == 34) && !np.s1(this.a).D3()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.x2.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            z zVar = this.A2;
            if (zVar != null && zVar.getParent() != null) {
                ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            }
            rv rvVar = this.H2;
            if (rvVar != null && rvVar.getParent() != null) {
                ((ViewGroup) this.H2.getParent()).removeView(this.H2);
            }
            uj0 uj0Var = this.o1;
            if (uj0Var != null) {
                uj0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void D1() {
        int i7;
        this.q2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        int i10 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.d2 == 31) {
            i10 = 1;
        }
        np s12 = np.s1(this.a);
        dp dpVar = s12.r4;
        int max = Math.max(10, dpVar != null ? dpVar.e(r1()) : 0);
        dp dpVar2 = s12.s4;
        int max2 = Math.max(max, dpVar2 != null ? dpVar2.e(r1()) : 0);
        int max3 = r1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, s12.B5), s12.z5), s12.A5), s12.x5), s12.w5) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, s12.r5), s12.s5), s12.t5), s12.u5), s12.v5), s12.A4), s12.B4);
        ArrayList arrayList = null;
        while (i10 <= max3) {
            boolean r12 = r1();
            ArrayList arrayList2 = new ArrayList();
            np s13 = np.s1(this.a);
            if (!r12 && i10 >= s13.B4) {
                arrayList2.add(e0.a(R.drawable.menu_feature_translate, 2131753660));
            }
            e0 b10 = e0.b(R.drawable.menu_feature_stories, i10, "BoostFeatureStoriesPerDay");
            b10.f = true;
            arrayList2.add(b10);
            if (!r12) {
                e0 b11 = e0.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                b11.f = true;
                arrayList2.add(b11);
            }
            dp dpVar3 = s13.r4;
            int a10 = dpVar3 != null ? dpVar3.a(i10, false) : 0;
            dp dpVar4 = s13.s4;
            int a11 = dpVar4 != null ? dpVar4.a(i10, r12) : 0;
            if (!r12 && a10 > 0) {
                arrayList2.add(e0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
            }
            if (!r12 && a10 > 0) {
                arrayList2.add(e0.b(R.drawable.menu_feature_links, a10, "BoostFeatureReplyColor"));
            }
            if (!r12 && i10 >= s13.r5) {
                arrayList2.add(e0.a(R.drawable.menu_feature_links2, 2131753633));
            }
            if (a11 > 0) {
                arrayList2.add(e0.b(R.drawable.menu_feature_color_profile, a11, r12 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
            }
            if (r12 && i10 >= s13.y5) {
                arrayList2.add(e0.a(R.drawable.menu_feature_pack, 2131753651));
            }
            if ((!r12 && i10 >= s13.s5) || (r12 && i10 >= s13.w5)) {
                arrayList2.add(e0.a(R.drawable.menu_feature_cover, r12 ? 2131753637 : 2131753638));
            }
            if (r12 && i10 >= s13.B5) {
                arrayList2.add(e0.a(R.drawable.menu_feature_voice, 2131753628));
            }
            if ((!r12 && i10 >= s13.t5) || (r12 && i10 >= s13.x5)) {
                arrayList2.add(new e0(R.drawable.menu_feature_status, 2131753647, -1, "1000+", null));
            }
            if ((!r12 && i10 >= s13.u5) || (r12 && i10 >= s13.z5)) {
                arrayList2.add(e0.b(R.drawable.menu_feature_wallpaper, 8, r12 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
            }
            if ((!r12 && i10 >= s13.v5) || (r12 && i10 >= s13.A5)) {
                arrayList2.add(e0.a(R.drawable.menu_feature_custombg, r12 ? 2131753652 : 2131753653));
            }
            if (!r12 && i10 >= s13.A4) {
                arrayList2.add(e0.a(R.drawable.menu_feature_noads, 2131753629));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (0; i7 < arrayList.size(); i7 + 1) {
                    e0 e0Var = (e0) arrayList.get(i7);
                    e0 e0Var2 = (e0) arrayList2.get(i7);
                    int i11 = e0Var.e;
                    i7 = (e0Var2 != null && ((e0Var.f && i11 > 2) || (e0Var.a == e0Var2.a && e0Var.b == e0Var2.b && TextUtils.equals(e0Var.c, e0Var2.c) && TextUtils.equals(e0Var.d, e0Var2.d) && i11 == e0Var2.e))) ? i7 + 1 : 0;
                }
                i10++;
            }
            ArrayList arrayList3 = this.q2;
            arrayList3.add(new d0(i10, arrayList3.isEmpty()));
            this.q2.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void E1() {
        String str = null;
        if (this.f2) {
            this.A2.c(hd.M0(2131749130, null), false, false);
            return;
        }
        int i7 = this.d2;
        if (i7 != 19 && i7 != 32 && !s1()) {
            HashSet hashSet = this.u2;
            if (i7 != 11 && i7 != 34) {
                if (hashSet.size() <= 0) {
                    z zVar = this.A2;
                    zVar.r = false;
                    zVar.d(true);
                    return;
                } else {
                    if (i7 == 2) {
                        str = hd.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i7 == 5) {
                        str = hd.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.A2.c(str, true, true);
                    return;
                }
            }
            z zVar2 = this.A2;
            if (zVar2.J == null) {
                kq kqVar = new kq(zVar2.getContext(), null);
                zVar2.J = kqVar;
                kqVar.setGravity(3);
                kq kqVar2 = zVar2.J;
                int i10 = j6.Fi;
                int i11 = j6.Ji;
                jq jqVar = kqVar2.a;
                jqVar.v = i10;
                jqVar.w = i11;
                jqVar.b = 0.8f;
                zVar2.setClipChildren(false);
                zVar2.addView(zVar2.J, c8.ja.e(-1, 24, 16));
            }
            if (!this.U1) {
                this.A2.c(hd.M0(2131752041, null), true, true);
            } else if (hashSet.size() > 0) {
                this.A2.c(hd.M0(2131745619, null), true, true);
            } else {
                this.A2.c(hd.M0(2131754557, null), true, true);
            }
            this.A2.J.a.c(hashSet.size(), true);
            this.A2.invalidate();
            return;
        }
        e3 e3Var = this.Y1;
        boolean z10 = e3Var.a;
        if ((z10 || e3Var.b) && !e3Var.l && !e3Var.d) {
            if (e3Var.m) {
                this.A2.c(hd.M0(2131747831, null), true, true);
                return;
            }
            z zVar3 = this.A2;
            zVar3.r = false;
            zVar3.d(true);
            return;
        }
        hi.d dVar = this.O2;
        if (z10) {
            if (wg.q.i()) {
                this.A2.c(hd.M0(2131753591, null), true, true);
            } else {
                this.A2.c(hd.M0(r1() ? 2131753625 : 2131753663, null), true, true);
            }
            this.C2.i(hd.M0(2131753664, null), true, true);
            if (dVar != null) {
                dVar.i(hd.M0(2131753625, null), true, true);
                return;
            }
            return;
        }
        if (e3Var.m) {
            this.C2.i(hd.M0(2131747831, null), true, true);
            if (dVar != null) {
                dVar.i(hd.M0(2131747831, null), true, true);
            }
            this.A2.c(hd.M0(2131747831, null), true, true);
            return;
        }
        if (wg.q.i()) {
            if (dVar != null) {
                dVar.i(hd.M0(2131753625, null), true, true);
            }
            this.C2.i(hd.M0(2131753664, null), true, true);
            this.A2.c(hd.M0(2131753591, null), true, true);
            return;
        }
        if (dVar != null) {
            dVar.i(hd.M0(2131747831, null), true, true);
        }
        this.C2.i(hd.M0(2131747831, null), true, true);
        this.A2.c(hd.M0(2131747831, null), true, true);
    }

    public final void F1() {
        String M0;
        if (this.f2) {
            this.A2.c(hd.M0(2131749130, null), false, false);
            return;
        }
        int i7 = this.d2;
        if (i7 == 19 || i7 == 32 || s1()) {
            if (!wg.q.i()) {
                this.A2.f.setText(hd.M0(r1() ? 2131753625 : 2131753663, null));
                return;
            }
            p0 p0Var = this.A2.f;
            e3 e3Var = this.Y1;
            if (e3Var == null || !e3Var.d) {
                M0 = hd.M0(r1() ? 2131753625 : 2131753663, null);
            } else {
                M0 = hd.M0(2131753591, null);
            }
            p0Var.setText(M0);
            e3 e3Var2 = this.Y1;
            if (e3Var2 == null || !e3Var2.m) {
                return;
            }
            this.A2.f.setText(hd.M0(2131747831, null));
            return;
        }
        if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new eq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) hd.M0(2131751762, null));
            this.A2.f.setText(spannableStringBuilder);
            return;
        }
        if (m10.i(this.a).q() || np.s1(this.a).D3() || this.J2) {
            this.A2.f.setText(hd.M0(2131747831, null));
            z zVar = this.A2;
            zVar.E.p = null;
            zVar.G.setVisibility(8);
            return;
        }
        this.A2.f.setText(hd.M0(2131749199, null));
        androidx.emoji2.text.q qVar = this.I2;
        if (qVar == null) {
            z zVar2 = this.A2;
            zVar2.E.p = null;
            zVar2.G.setVisibility(8);
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
        z zVar3 = this.A2;
        zVar3.E.p = null;
        zVar3.G.setVisibility(8);
    }

    public final void G1() {
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
            if (i7 != 19 || t3.N(n1())) {
                this.v1 = 0.24f;
                int i10 = this.g2;
                this.g2 = i10 + 1;
                this.V1 = i10;
                if (np.s1(this.a).q4) {
                    int i11 = this.g2;
                    this.g2 = i11 + 1;
                    this.o2 = i11;
                }
            }
            D1();
            int i12 = this.g2;
            int i13 = i12 + 1;
            this.g2 = i13;
            this.p2 = i12;
            this.g2 = (this.q2.size() - 1) + i13;
        } else if (i7 == 31 || i7 == 32) {
            this.v1 = 0.24f;
            D1();
            int i14 = this.g2;
            this.k2 = i14;
            int i15 = i14 + 1;
            this.g2 = i15;
            this.p2 = i14;
            int size = (this.q2.size() - 1) + i15;
            this.g2 = size;
            this.l2 = size;
        } else if (!p1(i7)) {
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
                if (i7 != 11 || np.s1(this.a).D3() || ((((arrayList = this.z2) == null || arrayList.isEmpty()) && ((arrayList2 = this.y2) == null || arrayList2.size() < this.x2.size())) || (arrayList3 = this.z2) == null || arrayList3.size() != 1 || (arrayList4 = this.y2) == null || arrayList4.size() != 1 || !this.U1)) {
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

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        return new c0(this);
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        int i7 = this.d2;
        if (i7 == 11) {
            return hd.M0(2131752401, null);
        }
        if (i7 == 34) {
            return hd.M0(2131752622, null);
        }
        if (i7 == 35) {
            return hd.M0(2131743874, null);
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
                return hd.M0(2131743874, null);
            case 19:
            case ns.T /* 30 */:
                return hd.M0(r1() ? 2131753625 : 2131753663, null);
            case ns.U /* 31 */:
                return hd.M0(2131753600, null);
            case 32:
                return hd.M0(2131753625, null);
            default:
                return hd.M0(2131748978, null);
        }
    }

    @Override // org.telegram.ui.Components.ja
    public final void U0(st0 st0Var) {
        int i7;
        Context context = st0Var.getContext();
        hi.d dVar = new hi.d(context, this.J0, true);
        this.C2 = dVar;
        dVar.setFlickeringLoading(true);
        this.C2.i(hd.M0(2131753664, null), false, true);
        int i10 = 2;
        this.C2.setOnClickListener(new t(this, i10));
        z zVar = new z(this, context, this.J0);
        this.A2 = zVar;
        na.b(zVar, 0.02f, 1.2f);
        int i11 = 22;
        if (!this.t1 && (i7 = this.d2) != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
            rv rvVar = new rv(14, context, this);
            this.H2 = rvVar;
            q6.h(j6.h5, rvVar, this.J0);
            st0Var.addView(this.H2, c8.ja.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        z zVar2 = this.A2;
        float f10 = (this.u0 / org.telegram.messenger.g0.p) + 16.0f;
        st0Var.addView(zVar2, c8.ja.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int L = org.telegram.messenger.g0.L(72.0f);
        uj0 uj0Var = this.o1;
        uj0Var.setPadding(0, 0, 0, L);
        uj0Var.setClipToPadding(false);
        uj0Var.setClipChildren(false);
        uj0Var.setOnItemClickListener(new b6(this, i11));
        uj0Var.setOnItemLongClickListener(new w(this, i10));
        this.A2.w.setOnClickListener(new sc1(5, this, context));
        this.A2.h.setOnClickListener(new t(this, 3));
        this.F2 = new xi0(uj0Var, true);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull N0;
        if (i7 != ns.V2) {
            if (i7 != ns.U2) {
                if (i7 == ns.T2) {
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
            if (this.d2 == 32 && (N0 = np.s1(this.a).N0(-this.W1)) != null) {
                N0.boosts_applied += intValue;
            }
            t1();
            z1(tL_premium_boostsStatus, this.a2);
            e3 e3Var = this.Y1;
            e3Var.m = this.X1.next_level_boosts <= 0;
            e3Var.l = true;
            e3Var.a(tL_premium_myBoosts);
            if (v1()) {
                xb Q = new cc(this.c, this.J0).Q(R.raw.ic_boosts_replace, 30, hd.G(intValue, "BoostingReassignedFromPlural", hd.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        e2 e2Var = this.s1;
        e2 lastFragment = e2Var.getParentLayout().getLastFragment();
        if (lastFragment instanceof ch.o) {
            List fragmentStack = e2Var.getParentLayout().getFragmentStack();
            e2 e2Var2 = fragmentStack.size() >= 2 ? (e2) r.b.h(2, fragmentStack) : null;
            e2 e2Var3 = fragmentStack.size() >= 3 ? (e2) r.b.h(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (e2) r.b.h(4, fragmentStack) : null;
            if (e2Var2 instanceof qn) {
                ((ActionBarLayout) e2Var.getParentLayout()).d0(e2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                wg.h.f(e2Var3, chat, false);
                return;
            } else {
                if (e2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) e2Var.getParentLayout()).d0(e2Var3, false);
                }
                lastFragment.finishFragment();
                wg.h.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof an) && booleanValue) {
            wg.h.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof qc) && booleanValue) {
            List fragmentStack2 = e2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                e2 e2Var4 = (e2) fragmentStack2.get(size);
                if ((e2Var4 instanceof an) || (e2Var4 instanceof yw)) {
                    r6 = e2Var4;
                    break;
                }
                arrayList.add(e2Var4);
            }
            if (r6 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((ActionBarLayout) e2Var.getParentLayout()).d0((e2) obj, false);
            }
            e2Var.finishFragment();
            dismiss();
            wg.h.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            sa saVar = sa.G2;
            if (saVar == null || !saVar.d) {
                dismiss();
                wg.h.f(LaunchActivity.Q(), chat, false);
                return;
            }
            an ua2 = an.ua(-chat.id);
            LaunchActivity.Q().presentFragment(ua2, false, false);
            sa.w();
            dismiss();
            wg.h.f(ua2, chat, false);
            return;
        }
        sa saVar2 = sa.G2;
        if (saVar2 != null && saVar2.d) {
            an ua3 = an.ua(-chat.id);
            LaunchActivity.Q().presentFragment(ua3, false, false);
            sa.w();
            dismiss();
            wg.h.f(ua3, chat, true);
            return;
        }
        List fragmentStack3 = e2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (e2) r.b.h(2, fragmentStack3) : null;
        e2Var.finishFragment();
        dismiss();
        if (r6 instanceof an) {
            wg.h.f(r6, chat, true);
        }
    }

    public final void h1(final c80 c80Var, boolean z10) {
        if (!c80Var.a() || z10) {
            final int i7 = 1;
            c80Var.setLoading(true);
            np.s1(this.a).G0();
            final int i10 = 0;
            wg.q.a(-this.W1, Arrays.asList(Integer.valueOf(this.Y1.g)), new z10(this) { // from class: ug.y
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.z10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            j0 j0Var = this.b;
                            np.s1(j0Var.a).G0().a(j0Var.W1, new bi.j(j0Var, c80Var, (TL_stories.TL_premium_myBoosts) obj, 13));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            c80 c80Var2 = c80Var;
                            if (startsWith) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    org.telegram.messenger.g0.i3(new org.telegram.ui.web.e1(28, this.b, c80Var2), intValue * 1000);
                                    break;
                                } else {
                                    wg.h.g(intValue);
                                }
                            }
                            c80Var2.setLoading(false);
                            break;
                    }
                }
            }, new z10(this) { // from class: ug.y
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.z10
                public final void a(Object obj) {
                    switch (i7) {
                        case 0:
                            j0 j0Var = this.b;
                            np.s1(j0Var.a).G0().a(j0Var.W1, new bi.j(j0Var, c80Var, (TL_stories.TL_premium_myBoosts) obj, 13));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            c80 c80Var2 = c80Var;
                            if (startsWith) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    org.telegram.messenger.g0.i3(new org.telegram.ui.web.e1(28, this.b, c80Var2), intValue * 1000);
                                    break;
                                } else {
                                    wg.h.g(intValue);
                                }
                            }
                            c80Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void i1() {
        if (this.C2.isAttachedToWindow()) {
            h1(this.C2, false);
            return;
        }
        hi.d dVar = this.O2;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            h1(this.A2, false);
        } else {
            h1(dVar, false);
        }
    }

    public int j1() {
        return 0;
    }

    public final String k1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.X1.boost_url;
        }
        int i7 = this.a;
        long j3 = -this.W1;
        TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(j3));
        if (TextUtils.isEmpty(t3.K(M0, false))) {
            return a8.p0.o(j3, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + t3.K(M0, false);
    }

    public final String l1(boolean z10) {
        String str;
        int i7;
        if (this.d2 == 32) {
            TLRPC.Chat n1 = n1();
            TLRPC.ChatFull N0 = np.s1(this.a).N0(-this.W1);
            return hd.G(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), "BoostingRemoveRestrictionsSubtitle", n1 == null ? "" : n1.title);
        }
        TLRPC.Chat M0 = np.s1(this.a).M0(Long.valueOf(-this.W1));
        if (M0 == null) {
            str = hd.M0(r1() ? 2131754876 : 2131754904, null);
        } else {
            str = M0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        boolean z11 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (s1() && this.X1.next_level_boosts != 0 && z10) {
            i7 = r1() ? 2131749420 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
            int i10 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return hd.a0(null, null, i7, str, hd.G(i10, "MoreBoosts", Integer.valueOf(i10)));
        }
        if (z11 && this.Y1.d) {
            if (this.X1.level == 1) {
                return hd.a0(null, null, r1() ? 2131749493 : 2131752450, new Object[0]);
            }
            return hd.a0(null, null, r1() ? 2131749492 : 2131752449, Integer.valueOf(this.X1.level), hd.G(this.X1.level, "BoostStories", new Object[0]));
        }
        if (this.Y1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.X1;
            if (tL_premium_boostsStatus3.level == 0) {
                i7 = r1() ? 2131749420 : 2131752352;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.X1;
                int i11 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return hd.a0(null, null, i7, str, hd.G(i11, "MoreBoosts", Integer.valueOf(i11)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return hd.a0(null, null, r1() ? 2131749492 : 2131752449, Integer.valueOf(this.X1.level), hd.G(this.X1.level + 1, "BoostStories", new Object[0]));
            }
            i7 = r1() ? 2131749420 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.X1;
            int i12 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return hd.a0(null, null, i7, str, hd.G(i12, "MoreBoosts", Integer.valueOf(i12)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.X1;
        if (tL_premium_boostsStatus6.level == 0) {
            i7 = r1() ? 2131749420 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.X1;
            int i13 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return hd.a0(null, null, i7, str, hd.G(i13, "MoreBoosts", Integer.valueOf(i13)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return hd.a0(null, null, r1() ? 2131749492 : 2131752449, Integer.valueOf(this.X1.level), hd.G(this.X1.level + 1, "BoostStories", new Object[0]));
        }
        i7 = r1() ? 2131749420 : 2131752352;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.X1;
        int i14 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return hd.a0(null, null, i7, str, hd.G(i14, "MoreBoosts", Integer.valueOf(i14)));
    }

    public final String m1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return hd.a0("BoostsMaxLevelReached", null, 2131753158, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.Y1.d) {
            return hd.M0(r1() ? 2131753625 : 2131753663, null);
        }
        boolean z10 = this.a2;
        int i7 = this.d2;
        if (!z10) {
            if (i7 == 32) {
                return hd.M0(r1() ? 2131753625 : 2131753663, null);
            }
            if (this.Y1.d) {
                return hd.M0(r1() ? 2131742839 : 2131742841, null);
            }
            return hd.M0(r1() ? 2131753527 : 2131753528, null);
        }
        if (i7 == 32) {
            return hd.M0(r1() ? 2131753625 : 2131753663, null);
        }
        TLRPC.Chat M0 = np.s1(this.a).M0(Long.valueOf(-this.W1));
        if (this.Y1.d) {
            return hd.a0("YouBoostedChannel2", null, 2131742840, M0.title);
        }
        return hd.M0(r1() ? 2131753625 : 2131753663, null);
    }

    public final TLRPC.Chat n1() {
        return np.s1(this.a).M0(Long.valueOf(-this.W1));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.a).c(this, ns.V2);
        ns.f(this.a).c(this, ns.U2);
        ns.f(this.a).c(this, ns.T2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.a).n(this, ns.V2);
        ns.f(this.a).n(this, ns.U2);
        ns.f(this.a).n(this, ns.T2);
    }

    public final boolean q1() {
        int i7 = this.d2;
        return i7 == 19 || i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 27 || i7 == 28 || i7 == 23 || i7 == 30 || i7 == 35;
    }

    public final boolean r1() {
        return !t3.V(np.s1(this.a).M0(Long.valueOf(-this.W1)));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 >= 0 || this.H0 != this.P2 || (w02 = j6.w0(j6.h5, this.J0)) == this.H0) {
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
        return q1() && t3.N(n1());
    }

    public final void t1() {
        h0 h0Var = this.t2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        int i7 = tL_premium_boostsStatus.boosts;
        int i10 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        h0Var.b++;
        h0Var.a = i9.a((i7 - r3) / i10, 0.0f, 1.0f);
        h0Var.a0 = true;
        h0Var.b0 = h0Var.n;
        h0Var.i(i7, true);
        h0Var.J.requestLayout();
        h0Var.requestLayout();
    }

    public final boolean v1() {
        ns f10 = ns.f(this.a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        e3 e3Var = this.Y1;
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
        f10.m(ns.p3, tL_premium_boostsStatus, e3Var2, Long.valueOf(this.W1));
        hi.d dVar = this.O2;
        if (dVar != null) {
            TLRPC.ChatFull N0 = np.s1(this.a).N0(-this.W1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (max == 0) {
                ns.f(this.a).m(ns.o3, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Z1, transitionSet);
        i0 i0Var = this.Z1;
        wg.b bVar = i0Var.c;
        int indexOfChild = i0Var.indexOfChild(i0Var.b);
        j0 j0Var = i0Var.e;
        if (j0Var.a2) {
            int indexOfChild2 = i0Var.indexOfChild(i0Var.d);
            i0Var.removeView(i0Var.d);
            i0Var.d.removeView(i0Var.a);
            i0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(i0Var.getContext());
            i0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            i0Var.d.setWeightSum(1.0f);
            i0Var.d.addView(i0Var.a, c8.ja.p(-2, -2, 1.0f, 0));
            i0Var.d.addView(bVar, c8.ja.t(-2, -2, 48, 0, 2, 0, 0));
            i0Var.addView(i0Var.d, indexOfChild2, c8.ja.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = i0Var.indexOfChild(i0Var.a);
            i0Var.removeView(i0Var.a);
            TextView textView = new TextView(i0Var.getContext());
            i0Var.a = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            i0Var.a.setTextSize(1, 20.0f);
            q6.U(i0Var.a, j6.G6, j0Var.J0);
            i0Var.a.setGravity(17);
            i0Var.addView(i0Var.a, indexOfChild3, c8.ja.t(-2, -2, 1, 0, 22, 0, 0));
        }
        i0Var.removeView(i0Var.b);
        TextView textView2 = new TextView(i0Var.getContext());
        i0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = i0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), i0Var.b.getLineSpacingMultiplier() * 1.1f);
        i0Var.b.setGravity(1);
        q6.U(i0Var.b, j6.G6, j0Var.J0);
        i0Var.addView(i0Var.b, indexOfChild, c8.ja.t(-2, -2, 1, 24, -2, 24, 17));
        this.Z1.a.setText(m1());
        TextView textView4 = this.Z1.b;
        np s12 = np.s1(this.a);
        boolean r12 = r1();
        int i7 = this.d2;
        String str = null;
        if (i7 == 20) {
            str = hd.a0(null, null, r12 ? 2131749418 : 2131752349, Integer.valueOf(j1()));
        } else if (i7 == 24) {
            str = hd.a0(null, null, r12 ? 2131749414 : 2131752346, Integer.valueOf(j1()));
        } else if (i7 == 29) {
            str = hd.a0(null, null, 2131749417, Integer.valueOf(s12.y5));
        } else if (i7 == 30) {
            str = hd.a0(null, null, 2131752343, Integer.valueOf(s12.A4));
        } else if (i7 == 35) {
            str = hd.a0(null, null, 2131752350, Integer.valueOf(s12.B4));
        } else if (i7 == 25) {
            str = hd.a0(null, null, r12 ? 2131749415 : 2131752347, Integer.valueOf(r12 ? s12.x5 : s12.t5));
        } else if (i7 == 26) {
            str = hd.a0(null, null, r12 ? 2131749410 : 2131752341, Integer.valueOf(r12 ? s12.x5 : s12.t5));
        } else if (i7 == 27) {
            str = hd.a0(null, null, r12 ? 2131749412 : 2131752344, Integer.valueOf(s12.r5));
        } else if (i7 == 28) {
            str = hd.a0(null, null, r12 ? 2131749413 : 2131752345, Integer.valueOf(r12 ? s12.w5 : s12.s5));
        } else if (i7 == 22) {
            str = hd.a0(null, null, r12 ? 2131749411 : 2131752342, Integer.valueOf(r12 ? s12.z5 : s12.u5));
        } else if (i7 == 23) {
            str = hd.a0(null, null, r12 ? 2131749416 : 2131752348, Integer.valueOf(r12 ? s12.A5 : s12.v5));
        }
        if (str == null) {
            str = l1(false);
        }
        textView4.setText(org.telegram.messenger.g0.X2(str));
        E1();
        nz nzVar = this.L2;
        nzVar.c(false);
        try {
            nzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Z1.c.a(this.Y1.i, true);
        this.o1.y0(0);
        if (i7 == 32) {
            this.Z1.c.setVisibility(8);
        }
        return true;
    }

    public final void x1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String G = hd.G(arrayList.size(), "RevokeLinks", new Object[0]);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.r2) {
                t1Var.U = org.telegram.messenger.g0.X2(hd.a0("RevokeLinkAlertChannel", null, 2131746021, np.s1(this.a).V2 + "/" + t3.K(chat, false), chat.title));
            } else {
                t1Var.U = org.telegram.messenger.g0.X2(hd.a0("RevokeLinkAlert", null, 2131746022, np.s1(this.a).V2 + "/" + t3.K(chat, false), chat.title));
            }
        } else if (this.r2) {
            t1Var.U = org.telegram.messenger.g0.X2(hd.a0("RevokeLinksAlertChannel", null, 2131746018, new Object[0]));
        } else {
            t1Var.U = org.telegram.messenger.g0.X2(hd.a0("RevokeLinksAlert", null, 2131746019, new Object[0]));
        }
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.k(hd.M0(2131746024, null), new k8(20, this, arrayList));
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            q6.U(textView, j6.q7, this.J0);
        }
    }

    public final void y1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.R2)) {
            TLRPC.ChatFull N0 = np.s1(this.a).N0(this.K2.id);
            if (N0 == null) {
                dismiss();
                return;
            }
            if (this.K2.username != null) {
                str = "@" + this.K2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = N0.exported_invite;
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
            long N1 = np.s1(this.a).N1(user.id);
            if (N1 <= 0) {
                N1 = m5.k(np.s1(this.a).J2(user.id));
            }
            (N1 >= 0 ? arrayList : arrayList2).add(user);
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
            t4.Z(this.a, arrayList3, 1, new g7(this, 29));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            boolean z12 = z10;
            Iterator it3 = it2;
            cz b10 = cz.b(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            ez.C(this.a).r0(b10);
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
        this.X1 = tL_premium_boostsStatus;
        this.a2 = z10;
        G1();
    }
}
