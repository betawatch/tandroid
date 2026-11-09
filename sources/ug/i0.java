package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.v3;
import c8.ha;
import c8.j9;
import c8.ka;
import fi.va;
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
import org.telegram.messenger.c20;
import org.telegram.messenger.e3;
import org.telegram.messenger.ez;
import org.telegram.messenger.gp;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.hk0;
import org.telegram.ui.n00;
import org.telegram.ui.rc;
import org.telegram.ui.rn;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class i0 extends na implements ls {
    public static final /* synthetic */ int O2 = 0;
    public boolean A2;
    public ti0 B2;
    public final f2 C2;
    public n00 D2;
    public androidx.emoji2.text.p E2;
    public boolean F2;
    public TLRPC.Chat G2;
    public final kz H2;
    public Runnable I2;
    public int J2;
    public final fi.d K2;
    public int L2;
    public int M2;
    public String N2;
    public int P1;
    public boolean Q1;
    public int R1;
    public long S1;
    public TL_stories.TL_premium_boostsStatus T1;
    public e3 U1;
    public h0 V1;
    public boolean W1;
    public boolean X1;
    public org.telegram.ui.Cells.q1 Y1;
    public final int Z1;
    public final ArrayList a2;
    public boolean b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public ArrayList m2;
    public boolean n2;
    public int o2;
    public g0 p2;
    public final HashSet q2;
    public final ArrayList r2;
    public final ArrayList s2;
    public ArrayList t2;
    public ArrayList u2;
    public ArrayList v2;
    public y w2;
    public final TextView x2;
    public fi.d y2;
    public Runnable z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i7, int i10, Context context, f2 f2Var, g6 g6Var) {
        super(context, f2Var, false, p1(i7), g6Var);
        int i11 = 0;
        this.R1 = -1;
        this.X1 = false;
        this.a2 = new ArrayList();
        this.d2 = -1;
        this.e2 = -1;
        this.f2 = -1;
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        this.l2 = -1;
        this.o2 = -1;
        this.q2 = new HashSet();
        this.r2 = new ArrayList();
        this.s2 = new ArrayList();
        this.t2 = new ArrayList();
        this.u2 = new ArrayList();
        this.v2 = new ArrayList();
        this.A2 = false;
        this.J2 = 0;
        this.M2 = -4;
        O(l6.w0(l6.h5, this.I0));
        this.L2 = this.G0;
        this.C2 = f2Var;
        this.a = i10;
        this.Z1 = i7;
        b1();
        G1();
        int i12 = 1;
        int i13 = 2;
        if (i7 == 2) {
            this.A2 = true;
            G1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new u(this, i11));
        } else if (i7 == 5) {
            this.A2 = true;
            G1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new u(this, i13));
        }
        F1();
        if (i7 == 32 || q1()) {
            kz kzVar = new kz(getContext());
            this.H2 = kzVar;
            this.c.addView(kzVar, ha.c(-1.0f, -1));
        }
        if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35 || i7 == 31) {
            ((ViewGroup) this.w2.getParent()).removeView(this.w2);
            n00 n00Var = this.D2;
            if (n00Var != null) {
                ((ViewGroup) n00Var.getParent()).removeView(this.D2);
            }
            this.k1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.x2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(this.w2.getTextView().getText());
            s6.U(textView, l6.Gi, g6Var);
            textView.setOnClickListener(new t(this, i11));
            int L = org.telegram.messenger.g0.L(8.0f);
            int i14 = l6.Ci;
            int w02 = l6.w0(i14, g6Var);
            int i15 = l6.d6;
            int o4 = i0.a.o(l6.w0(i15, g6Var), 120);
            org.telegram.ui.Cells.y k02 = l6.k0(L, L, L, L, w02, o4, o4);
            o6 M = s6.M(i14);
            o6 g10 = s6.g(i15, 120);
            textView.setBackground(k02);
            s6.j(textView, k02, M, g10, g6Var);
        }
        if (i7 == 32) {
            ((ViewGroup) this.w2.getParent()).removeView(this.w2);
            fi.d dVar = new fi.d(context, g6Var, true);
            this.K2 = dVar;
            dVar.k();
            dVar.i(id.M0(2131753625, null), false, true);
            dVar.setOnClickListener(new t(this, i12));
            this.b.addView(dVar, ha.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.b.post(new v(this, 3));
        }
        if (i7 == 19 || i7 == 18) {
            this.b.post(new v(this, 4));
        }
    }

    public static androidx.emoji2.text.p o1(int i7, int i10) {
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p();
        pVar.a = 0;
        pVar.d = null;
        pVar.e = null;
        pVar.f = null;
        pVar.b = 0;
        pVar.c = 0;
        if (i7 == 0) {
            pVar.b = qp.s1(i10).P4;
            pVar.c = qp.s1(i10).Q4;
            pVar.a = R.drawable.msg_limit_pin;
            pVar.d = id.a0("LimitReachedPinDialogs", null, 2131748954, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = id.a0("LimitReachedPinDialogsPremium", null, 2131748952, Integer.valueOf(pVar.c));
            pVar.f = id.a0("LimitReachedPinDialogsLocked", null, 2131748953, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 == 33) {
            pVar.b = qp.s1(i10).m6;
            pVar.c = qp.s1(i10).n6;
            pVar.a = R.drawable.msg_limit_pin;
            pVar.d = id.a0(null, null, 2131748951, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = id.a0(null, null, 2131748949, Integer.valueOf(pVar.c));
            pVar.f = id.a0(null, null, 2131748950, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 == 2) {
            pVar.b = qp.s1(i10).R4;
            pVar.c = qp.s1(i10).S4;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = id.a0("LimitReachedPublicLinks", null, 2131748947, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = id.a0("LimitReachedPublicLinksPremium", null, 2131748945, Integer.valueOf(pVar.c));
            pVar.f = id.a0("LimitReachedPublicLinksLocked", null, 2131748946, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 == 12) {
            pVar.b = qp.s1(i10).x6;
            pVar.c = qp.s1(i10).y6;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = id.a0("LimitReachedFolderLinks", null, 2131748960, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = id.a0("LimitReachedFolderLinksPremium", null, 2131748958, Integer.valueOf(pVar.c));
            pVar.f = id.a0("LimitReachedFolderLinksLocked", null, 2131748959, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 == 13) {
            pVar.b = qp.s1(i10).z6;
            pVar.c = qp.s1(i10).A6;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = id.a0("LimitReachedSharedFolders", null, 2131748943, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = id.a0("LimitReachedSharedFoldersPremium", null, 2131748941, Integer.valueOf(pVar.c));
            pVar.f = id.a0("LimitReachedSharedFoldersLocked", null, 2131748942, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 == 3) {
            pVar.b = qp.s1(i10).L4;
            pVar.c = qp.s1(i10).M4;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = id.a0("LimitReachedFolders", null, 2131748957, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = id.a0("LimitReachedFoldersPremium", null, 2131748955, Integer.valueOf(pVar.c));
            pVar.f = id.a0("LimitReachedFoldersLocked", null, 2131748956, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 == 4) {
            pVar.b = qp.s1(i10).N4;
            pVar.c = qp.s1(i10).O4;
            pVar.a = R.drawable.msg_limit_chats;
            pVar.d = id.a0("LimitReachedChatInFolders", null, 2131748975, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = id.a0("LimitReachedChatInFoldersPremium", null, 2131748973, Integer.valueOf(pVar.c));
            pVar.f = id.a0("LimitReachedChatInFoldersLocked", null, 2131748974, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 == 5) {
            pVar.b = qp.s1(i10).D4;
            pVar.c = qp.s1(i10).E4;
            pVar.a = R.drawable.msg_limit_groups;
            pVar.d = id.a0("LimitReachedCommunities", null, 2131748972, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = id.a0("LimitReachedCommunitiesPremium", null, 2131748970, Integer.valueOf(pVar.c));
            pVar.f = id.a0("LimitReachedCommunitiesLocked", null, 2131748971, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 == 6) {
            pVar.b = 100;
            pVar.c = qs.e3;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = id.a0("LimitReachedFileSize", null, 2131748963, "2 GB", "4 GB");
            pVar.e = id.a0("LimitReachedFileSizePremium", null, 2131748961, "4 GB");
            pVar.f = id.a0("LimitReachedFileSizeLocked", null, 2131748962, "2 GB");
            return pVar;
        }
        if (i7 == 7) {
            pVar.b = 3;
            pVar.c = 4;
            pVar.a = R.drawable.msg_limit_accounts;
            pVar.d = id.a0("LimitReachedAccounts", null, 2131748977, 3, Integer.valueOf(pVar.c));
            pVar.e = id.a0("LimitReachedAccountsPremium", null, 2131748976, Integer.valueOf(pVar.c));
            pVar.f = id.a0("LimitReachedAccountsPremium", null, 2131748976, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 == 11) {
            pVar.b = 0;
            pVar.c = 0;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = id.a0("LimitReachedAccounts", null, 2131748977, 0, Integer.valueOf(pVar.c));
            pVar.e = "";
            pVar.f = "";
            return pVar;
        }
        if (i7 == 14) {
            pVar.b = qp.s1(i10).i5;
            pVar.c = qp.s1(i10).j5;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = id.H(',', "LimitReachedStoriesCount2First", pVar.b) + "\n" + id.H(',', "LimitReachedStoriesCount2Second", pVar.c);
            pVar.e = id.H(',', "LimitReachedStoriesCount2Premium", pVar.c);
            pVar.f = id.H(',', "LimitReachedStoriesCount2Premium", pVar.b);
            return pVar;
        }
        if (i7 == 15) {
            pVar.b = qp.s1(i10).k5;
            pVar.c = qp.s1(i10).l5;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = id.a0("LimitReachedStoriesWeekly", null, 2131748929, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = id.a0("LimitReachedStoriesWeeklyPremium", null, 2131748928, Integer.valueOf(pVar.c));
            pVar.f = id.a0("LimitReachedStoriesWeeklyPremium", null, 2131748928, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 == 16) {
            pVar.b = qp.s1(i10).m5;
            pVar.c = qp.s1(i10).n5;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = id.a0("LimitReachedStoriesMonthly", null, 2131748931, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = id.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(pVar.c));
            pVar.f = id.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i7 != 18 && i7 != 32 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 25 && i7 != 30 && i7 != 35 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 19 && i7 != 21 && i7 != 26) {
            return pVar;
        }
        pVar.b = qp.s1(i10).m5;
        pVar.c = qp.s1(i10).n5;
        pVar.a = R.drawable.filled_limit_boost;
        pVar.d = id.a0("LimitReachedStoriesMonthly", null, 2131748931, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
        pVar.e = id.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(pVar.c));
        pVar.f = id.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(pVar.b));
        return pVar;
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

    public static void w1(f2 f2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, e3 e3Var, long j3, boolean z9) {
        if (tL_premium_boostsStatus == null || e3Var == null || f2Var.getContext() == null) {
            return;
        }
        i0 i0Var = new i0(32, f2Var.getCurrentAccount(), f2Var.getContext(), f2Var, f2Var.getResourceProvider());
        i0Var.A1(e3Var);
        i0Var.z1(tL_premium_boostsStatus, true);
        i0Var.B1(j3);
        if (z9) {
            f2Var.showDialog(i0Var);
        } else {
            i0Var.show();
        }
    }

    public final void A1(e3 e3Var) {
        this.U1 = e3Var;
        E1();
        F1();
    }

    public final void B1(long j3) {
        this.S1 = j3;
        G1();
    }

    public final void C1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.G2 = chat;
        this.N2 = str;
        this.Q1 = !TextUtils.isEmpty(str) || t3.y(3, chat);
        this.t2 = new ArrayList(arrayList);
        this.u2 = arrayList2;
        this.v2 = arrayList3;
        HashSet hashSet = this.q2;
        hashSet.clear();
        if (this.Q1) {
            ArrayList arrayList4 = this.t2;
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
        int i10 = this.Z1;
        if ((i10 == 11 || i10 == 34) && !qp.s1(this.a).D3()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.t2.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            y yVar = this.w2;
            if (yVar != null && yVar.getParent() != null) {
                ((ViewGroup) this.w2.getParent()).removeView(this.w2);
            }
            n00 n00Var = this.D2;
            if (n00Var != null && n00Var.getParent() != null) {
                ((ViewGroup) this.D2.getParent()).removeView(this.D2);
            }
            qj0 qj0Var = this.k1;
            if (qj0Var != null) {
                qj0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void D1() {
        int i7;
        this.m2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        int i10 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.Z1 == 31) {
            i10 = 1;
        }
        qp s12 = qp.s1(this.a);
        gp gpVar = s12.q4;
        int max = Math.max(10, gpVar != null ? gpVar.e(r1()) : 0);
        gp gpVar2 = s12.r4;
        int max2 = Math.max(max, gpVar2 != null ? gpVar2.e(r1()) : 0);
        int max3 = r1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, s12.A5), s12.y5), s12.z5), s12.w5), s12.v5) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, s12.q5), s12.r5), s12.s5), s12.t5), s12.u5), s12.z4), s12.A4);
        ArrayList arrayList = null;
        while (i10 <= max3) {
            boolean r12 = r1();
            ArrayList arrayList2 = new ArrayList();
            qp s13 = qp.s1(this.a);
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
            gp gpVar3 = s13.q4;
            int a10 = gpVar3 != null ? gpVar3.a(i10, false) : 0;
            gp gpVar4 = s13.r4;
            int a11 = gpVar4 != null ? gpVar4.a(i10, r12) : 0;
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
                for (0; i7 < arrayList.size(); i7 + 1) {
                    d0 d0Var = (d0) arrayList.get(i7);
                    d0 d0Var2 = (d0) arrayList2.get(i7);
                    int i11 = d0Var.e;
                    i7 = (d0Var2 != null && ((d0Var.f && i11 > 2) || (d0Var.a == d0Var2.a && d0Var.b == d0Var2.b && TextUtils.equals(d0Var.c, d0Var2.c) && TextUtils.equals(d0Var.d, d0Var2.d) && i11 == d0Var2.e))) ? i7 + 1 : 0;
                }
                i10++;
            }
            ArrayList arrayList3 = this.m2;
            arrayList3.add(new c0(i10, arrayList3.isEmpty()));
            this.m2.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void E1() {
        String str = null;
        if (this.b2) {
            this.w2.c(id.M0(2131749130, null), false, false);
            return;
        }
        int i7 = this.Z1;
        if (i7 != 19 && i7 != 32 && !s1()) {
            HashSet hashSet = this.q2;
            if (i7 != 11 && i7 != 34) {
                if (hashSet.size() <= 0) {
                    y yVar = this.w2;
                    yVar.r = false;
                    yVar.d(true);
                    return;
                } else {
                    if (i7 == 2) {
                        str = id.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i7 == 5) {
                        str = id.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.w2.c(str, true, true);
                    return;
                }
            }
            y yVar2 = this.w2;
            if (yVar2.I == null) {
                cq cqVar = new cq(yVar2.getContext(), null);
                yVar2.I = cqVar;
                cqVar.setGravity(3);
                cq cqVar2 = yVar2.I;
                int i10 = l6.Ci;
                int i11 = l6.Gi;
                bq bqVar = cqVar2.a;
                bqVar.v = i10;
                bqVar.w = i11;
                bqVar.b = 0.8f;
                yVar2.setClipChildren(false);
                yVar2.addView(yVar2.I, ha.e(-1, 24, 16));
            }
            if (!this.Q1) {
                this.w2.c(id.M0(2131752041, null), true, true);
            } else if (hashSet.size() > 0) {
                this.w2.c(id.M0(2131745619, null), true, true);
            } else {
                this.w2.c(id.M0(2131754557, null), true, true);
            }
            this.w2.I.a.c(hashSet.size(), true);
            this.w2.invalidate();
            return;
        }
        e3 e3Var = this.U1;
        boolean z9 = e3Var.a;
        if ((z9 || e3Var.b) && !e3Var.l && !e3Var.d) {
            if (e3Var.m) {
                this.w2.c(id.M0(2131747831, null), true, true);
                return;
            }
            y yVar3 = this.w2;
            yVar3.r = false;
            yVar3.d(true);
            return;
        }
        fi.d dVar = this.K2;
        if (z9) {
            if (wg.r.i()) {
                this.w2.c(id.M0(2131753591, null), true, true);
            } else {
                this.w2.c(id.M0(r1() ? 2131753625 : 2131753663, null), true, true);
            }
            this.y2.i(id.M0(2131753664, null), true, true);
            if (dVar != null) {
                dVar.i(id.M0(2131753625, null), true, true);
                return;
            }
            return;
        }
        if (e3Var.m) {
            this.y2.i(id.M0(2131747831, null), true, true);
            if (dVar != null) {
                dVar.i(id.M0(2131747831, null), true, true);
            }
            this.w2.c(id.M0(2131747831, null), true, true);
            return;
        }
        if (wg.r.i()) {
            if (dVar != null) {
                dVar.i(id.M0(2131753625, null), true, true);
            }
            this.y2.i(id.M0(2131753664, null), true, true);
            this.w2.c(id.M0(2131753591, null), true, true);
            return;
        }
        if (dVar != null) {
            dVar.i(id.M0(2131747831, null), true, true);
        }
        this.y2.i(id.M0(2131747831, null), true, true);
        this.w2.c(id.M0(2131747831, null), true, true);
    }

    public final void F1() {
        String M0;
        if (this.b2) {
            this.w2.c(id.M0(2131749130, null), false, false);
            return;
        }
        int i7 = this.Z1;
        if (i7 == 19 || i7 == 32 || s1()) {
            if (!wg.r.i()) {
                this.w2.f.setText(id.M0(r1() ? 2131753625 : 2131753663, null));
                return;
            }
            o0 o0Var = this.w2.f;
            e3 e3Var = this.U1;
            if (e3Var == null || !e3Var.d) {
                M0 = id.M0(r1() ? 2131753625 : 2131753663, null);
            } else {
                M0 = id.M0(2131753591, null);
            }
            o0Var.setText(M0);
            e3 e3Var2 = this.U1;
            if (e3Var2 == null || !e3Var2.m) {
                return;
            }
            this.w2.f.setText(id.M0(2131747831, null));
            return;
        }
        if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new wp(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) id.M0(2131751762, null));
            this.w2.f.setText(spannableStringBuilder);
            return;
        }
        if (p10.i(this.a).q() || qp.s1(this.a).D3() || this.F2) {
            this.w2.f.setText(id.M0(2131747831, null));
            y yVar = this.w2;
            yVar.D.p = null;
            yVar.F.setVisibility(8);
            return;
        }
        this.w2.f.setText(id.M0(2131749199, null));
        androidx.emoji2.text.p pVar = this.E2;
        if (pVar == null) {
            y yVar2 = this.w2;
            yVar2.D.p = null;
            yVar2.F.setVisibility(8);
            return;
        }
        int i10 = pVar.b;
        int i11 = i10 + 1;
        int i12 = pVar.c;
        if (i11 == i12) {
            this.w2.setIcon(R.raw.addone_icon);
            return;
        }
        if (i10 != 0 && i12 != 0) {
            float f10 = i12 / i10;
            if (f10 >= 1.6f && f10 <= 2.5f) {
                this.w2.setIcon(R.raw.double_icon);
                return;
            }
        }
        y yVar3 = this.w2;
        yVar3.D.p = null;
        yVar3.F.setVisibility(8);
    }

    public final void G1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.e2 = -1;
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.R1 = -1;
        this.j2 = -1;
        this.l2 = -1;
        this.c2 = 1;
        this.d2 = 0;
        int i7 = this.Z1;
        if (i7 == 19 || i7 == 18 || i7 == 20 || i7 == 24 || i7 == 27 || i7 == 28 || i7 == 22 || i7 == 23 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 21 || i7 == 30 || i7 == 35) {
            if (i7 != 19 || t3.N(n1())) {
                this.r1 = 0.24f;
                int i10 = this.c2;
                this.c2 = i10 + 1;
                this.R1 = i10;
                if (qp.s1(this.a).p4) {
                    int i11 = this.c2;
                    this.c2 = i11 + 1;
                    this.k2 = i11;
                }
            }
            D1();
            int i12 = this.c2;
            int i13 = i12 + 1;
            this.c2 = i13;
            this.l2 = i12;
            this.c2 = (this.m2.size() - 1) + i13;
        } else if (i7 == 31 || i7 == 32) {
            this.r1 = 0.24f;
            D1();
            int i14 = this.c2;
            this.g2 = i14;
            int i15 = i14 + 1;
            this.c2 = i15;
            this.l2 = i14;
            int size = (this.m2.size() - 1) + i15;
            this.c2 = size;
            this.h2 = size;
        } else if (!p1(i7)) {
            if (i7 == 11 || i7 == 34) {
                this.r1 = 0.24f;
            } else {
                int i16 = this.c2;
                this.e2 = i16;
                this.c2 = i16 + 2;
                this.f2 = i16 + 1;
            }
            if (this.A2) {
                int i17 = this.c2;
                this.c2 = i17 + 1;
                this.i2 = i17;
            } else if (i7 != 11 || this.Q1) {
                if (i7 != 11 || qp.s1(this.a).D3() || ((((arrayList = this.v2) == null || arrayList.isEmpty()) && ((arrayList2 = this.u2) == null || arrayList2.size() < this.t2.size())) || (arrayList3 = this.v2) == null || arrayList3.size() != 1 || (arrayList4 = this.u2) == null || arrayList4.size() != 1 || !this.Q1)) {
                    int i18 = this.c2;
                    this.g2 = i18;
                    if (i7 == 11 || i7 == 34) {
                        this.c2 = this.t2.size() + i18;
                    } else if (i7 == 5) {
                        this.c2 = this.r2.size() + i18;
                    } else {
                        this.c2 = this.a2.size() + i18;
                    }
                    this.h2 = this.c2;
                }
                if (this.h2 - this.g2 > 1) {
                    int i19 = this.c2;
                    this.c2 = i19 + 1;
                    this.j2 = i19;
                }
            }
        }
        this.k1.getAdapter().f();
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 L0(qj0 qj0Var) {
        return new b0(this);
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        int i7 = this.Z1;
        if (i7 == 11) {
            return id.M0(2131752401, null);
        }
        if (i7 == 34) {
            return id.M0(2131752622, null);
        }
        if (i7 == 35) {
            return id.M0(2131743874, null);
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
                return id.M0(2131743874, null);
            case 19:
            case qs.T /* 30 */:
                return id.M0(r1() ? 2131753625 : 2131753663, null);
            case qs.U /* 31 */:
                return id.M0(2131753600, null);
            case 32:
                return id.M0(2131753625, null);
            default:
                return id.M0(2131748978, null);
        }
    }

    @Override // org.telegram.ui.Components.na
    public final void U0(tt0 tt0Var) {
        int i7;
        Context context = tt0Var.getContext();
        fi.d dVar = new fi.d(context, this.I0, true);
        this.y2 = dVar;
        dVar.setFlickeringLoading(true);
        this.y2.i(id.M0(2131753664, null), false, true);
        int i10 = 2;
        this.y2.setOnClickListener(new t(this, i10));
        y yVar = new y(this, context, this.I0);
        this.w2 = yVar;
        ka.b(yVar, 0.02f, 1.2f);
        int i11 = 28;
        int i12 = 21;
        if (!this.p1 && (i7 = this.Z1) != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
            n00 n00Var = new n00(13, context, this);
            this.D2 = n00Var;
            s6.h(l6.h5, n00Var, this.I0);
            tt0Var.addView(this.D2, ha.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        y yVar2 = this.w2;
        float f10 = (this.t0 / org.telegram.messenger.g0.p) + 16.0f;
        tt0Var.addView(yVar2, ha.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int L = org.telegram.messenger.g0.L(72.0f);
        qj0 qj0Var = this.k1;
        qj0Var.setPadding(0, 0, 0, L);
        qj0Var.setClipToPadding(false);
        qj0Var.setClipChildren(false);
        qj0Var.setOnItemClickListener(new ai.k(this, i12));
        qj0Var.setOnItemLongClickListener(new w(this, i10));
        this.w2.w.setOnClickListener(new hk0(i11, this, context));
        this.w2.h.setOnClickListener(new t(this, 3));
        this.B2 = new ti0(qj0Var, true);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull N0;
        if (i7 != qs.V2) {
            if (i7 != qs.U2) {
                if (i7 == qs.T2) {
                    dismiss();
                    return;
                }
                return;
            }
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.U1 == null) {
                return;
            }
            this.T1.boosts += intValue;
            if (this.Z1 == 32 && (N0 = qp.s1(this.a).N0(-this.S1)) != null) {
                N0.boosts_applied += intValue;
            }
            t1();
            z1(tL_premium_boostsStatus, this.W1);
            e3 e3Var = this.U1;
            e3Var.m = this.T1.next_level_boosts <= 0;
            e3Var.l = true;
            e3Var.a(tL_premium_myBoosts);
            if (v1()) {
                cc Q = new hc(this.c, this.I0).Q(R.raw.ic_boosts_replace, 30, id.G(intValue, "BoostingReassignedFromPlural", id.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        f2 f2Var = this.o1;
        f2 lastFragment = f2Var.getParentLayout().getLastFragment();
        if (lastFragment instanceof ch.o) {
            List fragmentStack = f2Var.getParentLayout().getFragmentStack();
            f2 f2Var2 = fragmentStack.size() >= 2 ? (f2) rf.b.g(2, fragmentStack) : null;
            f2 f2Var3 = fragmentStack.size() >= 3 ? (f2) rf.b.g(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (f2) rf.b.g(4, fragmentStack) : null;
            if (f2Var2 instanceof rn) {
                ((ActionBarLayout) f2Var.getParentLayout()).d0(f2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                wg.h.f(f2Var3, chat, false);
                return;
            } else {
                if (f2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) f2Var.getParentLayout()).d0(f2Var3, false);
                }
                lastFragment.finishFragment();
                wg.h.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof cn) && booleanValue) {
            wg.h.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof rc) && booleanValue) {
            List fragmentStack2 = f2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                f2 f2Var4 = (f2) fragmentStack2.get(size);
                if ((f2Var4 instanceof cn) || (f2Var4 instanceof yw)) {
                    r6 = f2Var4;
                    break;
                }
                arrayList.add(f2Var4);
            }
            if (r6 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((ActionBarLayout) f2Var.getParentLayout()).d0((f2) obj, false);
            }
            f2Var.finishFragment();
            dismiss();
            wg.h.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            va vaVar = va.F2;
            if (vaVar == null || !vaVar.d) {
                dismiss();
                wg.h.f(LaunchActivity.Q(), chat, false);
                return;
            }
            cn ta2 = cn.ta(-chat.id);
            LaunchActivity.Q().presentFragment(ta2, false, false);
            va.w();
            dismiss();
            wg.h.f(ta2, chat, false);
            return;
        }
        va vaVar2 = va.F2;
        if (vaVar2 != null && vaVar2.d) {
            cn ta3 = cn.ta(-chat.id);
            LaunchActivity.Q().presentFragment(ta3, false, false);
            va.w();
            dismiss();
            wg.h.f(ta3, chat, true);
            return;
        }
        List fragmentStack3 = f2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (f2) rf.b.g(2, fragmentStack3) : null;
        f2Var.finishFragment();
        dismiss();
        if (r6 instanceof cn) {
            wg.h.f(r6, chat, true);
        }
    }

    public final void h1(final a80 a80Var, boolean z9) {
        if (!a80Var.a() || z9) {
            final int i7 = 1;
            a80Var.setLoading(true);
            qp.s1(this.a).G0();
            final int i10 = 0;
            wg.r.a(-this.S1, Arrays.asList(Integer.valueOf(this.U1.g)), new c20(this) { // from class: ug.x
                public final /* synthetic */ i0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            i0 i0Var = this.b;
                            qp.s1(i0Var.a).G0().a(i0Var.S1, new v3(i0Var, a80Var, (TL_stories.TL_premium_myBoosts) obj, 11));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            a80 a80Var2 = a80Var;
                            if (startsWith) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    org.telegram.messenger.g0.i3(new u9.f(4, this.b, a80Var2), intValue * 1000);
                                    break;
                                } else {
                                    wg.h.g(intValue);
                                }
                            }
                            a80Var2.setLoading(false);
                            break;
                    }
                }
            }, new c20(this) { // from class: ug.x
                public final /* synthetic */ i0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i7) {
                        case 0:
                            i0 i0Var = this.b;
                            qp.s1(i0Var.a).G0().a(i0Var.S1, new v3(i0Var, a80Var, (TL_stories.TL_premium_myBoosts) obj, 11));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            a80 a80Var2 = a80Var;
                            if (startsWith) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    org.telegram.messenger.g0.i3(new u9.f(4, this.b, a80Var2), intValue * 1000);
                                    break;
                                } else {
                                    wg.h.g(intValue);
                                }
                            }
                            a80Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void i1() {
        if (this.y2.isAttachedToWindow()) {
            h1(this.y2, false);
            return;
        }
        fi.d dVar = this.K2;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            h1(this.w2, false);
        } else {
            h1(dVar, false);
        }
    }

    public int j1() {
        return 0;
    }

    public final String k1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.T1.boost_url;
        }
        int i7 = this.a;
        long j3 = -this.S1;
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(j3));
        if (TextUtils.isEmpty(t3.K(M0, false))) {
            return a8.p0.o(j3, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + t3.K(M0, false);
    }

    public final String l1(boolean z9) {
        String str;
        int i7;
        if (this.Z1 == 32) {
            TLRPC.Chat n1 = n1();
            TLRPC.ChatFull N0 = qp.s1(this.a).N0(-this.S1);
            return id.G(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), "BoostingRemoveRestrictionsSubtitle", n1 == null ? "" : n1.title);
        }
        TLRPC.Chat M0 = qp.s1(this.a).M0(Long.valueOf(-this.S1));
        if (M0 == null) {
            str = id.M0(r1() ? 2131754876 : 2131754904, null);
        } else {
            str = M0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        boolean z10 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (s1() && this.T1.next_level_boosts != 0 && z9) {
            i7 = r1() ? 2131749420 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.T1;
            int i10 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return id.a0(null, null, i7, str, id.G(i10, "MoreBoosts", Integer.valueOf(i10)));
        }
        if (z10 && this.U1.d) {
            if (this.T1.level == 1) {
                return id.a0(null, null, r1() ? 2131749493 : 2131752450, new Object[0]);
            }
            return id.a0(null, null, r1() ? 2131749492 : 2131752449, Integer.valueOf(this.T1.level), id.G(this.T1.level, "BoostStories", new Object[0]));
        }
        if (this.U1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.T1;
            if (tL_premium_boostsStatus3.level == 0) {
                i7 = r1() ? 2131749420 : 2131752352;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.T1;
                int i11 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return id.a0(null, null, i7, str, id.G(i11, "MoreBoosts", Integer.valueOf(i11)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return id.a0(null, null, r1() ? 2131749492 : 2131752449, Integer.valueOf(this.T1.level), id.G(this.T1.level + 1, "BoostStories", new Object[0]));
            }
            i7 = r1() ? 2131749420 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.T1;
            int i12 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return id.a0(null, null, i7, str, id.G(i12, "MoreBoosts", Integer.valueOf(i12)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.T1;
        if (tL_premium_boostsStatus6.level == 0) {
            i7 = r1() ? 2131749420 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.T1;
            int i13 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return id.a0(null, null, i7, str, id.G(i13, "MoreBoosts", Integer.valueOf(i13)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return id.a0(null, null, r1() ? 2131749492 : 2131752449, Integer.valueOf(this.T1.level), id.G(this.T1.level + 1, "BoostStories", new Object[0]));
        }
        i7 = r1() ? 2131749420 : 2131752352;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.T1;
        int i14 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return id.a0(null, null, i7, str, id.G(i14, "MoreBoosts", Integer.valueOf(i14)));
    }

    public final String m1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return id.a0("BoostsMaxLevelReached", null, 2131753158, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.U1.d) {
            return id.M0(r1() ? 2131753625 : 2131753663, null);
        }
        boolean z9 = this.W1;
        int i7 = this.Z1;
        if (!z9) {
            if (i7 == 32) {
                return id.M0(r1() ? 2131753625 : 2131753663, null);
            }
            if (this.U1.d) {
                return id.M0(r1() ? 2131742839 : 2131742841, null);
            }
            return id.M0(r1() ? 2131753527 : 2131753528, null);
        }
        if (i7 == 32) {
            return id.M0(r1() ? 2131753625 : 2131753663, null);
        }
        TLRPC.Chat M0 = qp.s1(this.a).M0(Long.valueOf(-this.S1));
        if (this.U1.d) {
            return id.a0("YouBoostedChannel2", null, 2131742840, M0.title);
        }
        return id.M0(r1() ? 2131753625 : 2131753663, null);
    }

    public final TLRPC.Chat n1() {
        return qp.s1(this.a).M0(Long.valueOf(-this.S1));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.a).c(this, qs.V2);
        qs.f(this.a).c(this, qs.U2);
        qs.f(this.a).c(this, qs.T2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.a).n(this, qs.V2);
        qs.f(this.a).n(this, qs.U2);
        qs.f(this.a).n(this, qs.T2);
    }

    public final boolean q1() {
        int i7 = this.Z1;
        return i7 == 19 || i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 27 || i7 == 28 || i7 == 23 || i7 == 30 || i7 == 35;
    }

    public final boolean r1() {
        return !t3.V(qp.s1(this.a).M0(Long.valueOf(-this.S1)));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 >= 0 || this.G0 != this.L2 || (w02 = l6.w0(l6.h5, this.I0)) == this.G0) {
                return;
            }
            this.G0 = w02;
            this.L2 = w02;
            E0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean s1() {
        return q1() && t3.N(n1());
    }

    public final void t1() {
        g0 g0Var = this.p2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        int i7 = tL_premium_boostsStatus.boosts;
        int i10 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        g0Var.b++;
        g0Var.a = j9.a((i7 - r3) / i10, 0.0f, 1.0f);
        g0Var.W = true;
        g0Var.a0 = g0Var.n;
        g0Var.i(i7, true);
        g0Var.I.requestLayout();
        g0Var.requestLayout();
    }

    public final boolean v1() {
        qs f10 = qs.f(this.a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        e3 e3Var = this.U1;
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
        f10.m(qs.p3, tL_premium_boostsStatus, e3Var2, Long.valueOf(this.S1));
        fi.d dVar = this.K2;
        if (dVar != null) {
            TLRPC.ChatFull N0 = qp.s1(this.a).N0(-this.S1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (max == 0) {
                qs.f(this.a).m(qs.o3, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.V1, transitionSet);
        h0 h0Var = this.V1;
        wg.b bVar = h0Var.c;
        int indexOfChild = h0Var.indexOfChild(h0Var.b);
        i0 i0Var = h0Var.e;
        if (i0Var.W1) {
            int indexOfChild2 = h0Var.indexOfChild(h0Var.d);
            h0Var.removeView(h0Var.d);
            h0Var.d.removeView(h0Var.a);
            h0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(h0Var.getContext());
            h0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            h0Var.d.setWeightSum(1.0f);
            h0Var.d.addView(h0Var.a, ha.p(-2, -2, 1.0f, 0));
            h0Var.d.addView(bVar, ha.t(-2, -2, 48, 0, 2, 0, 0));
            h0Var.addView(h0Var.d, indexOfChild2, ha.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = h0Var.indexOfChild(h0Var.a);
            h0Var.removeView(h0Var.a);
            TextView textView = new TextView(h0Var.getContext());
            h0Var.a = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            h0Var.a.setTextSize(1, 20.0f);
            s6.U(h0Var.a, l6.G6, i0Var.I0);
            h0Var.a.setGravity(17);
            h0Var.addView(h0Var.a, indexOfChild3, ha.t(-2, -2, 1, 0, 22, 0, 0));
        }
        h0Var.removeView(h0Var.b);
        TextView textView2 = new TextView(h0Var.getContext());
        h0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = h0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), h0Var.b.getLineSpacingMultiplier() * 1.1f);
        h0Var.b.setGravity(1);
        s6.U(h0Var.b, l6.G6, i0Var.I0);
        h0Var.addView(h0Var.b, indexOfChild, ha.t(-2, -2, 1, 24, -2, 24, 17));
        this.V1.a.setText(m1());
        TextView textView4 = this.V1.b;
        qp s12 = qp.s1(this.a);
        boolean r12 = r1();
        int i7 = this.Z1;
        String str = null;
        if (i7 == 20) {
            str = id.a0(null, null, r12 ? 2131749418 : 2131752349, Integer.valueOf(j1()));
        } else if (i7 == 24) {
            str = id.a0(null, null, r12 ? 2131749414 : 2131752346, Integer.valueOf(j1()));
        } else if (i7 == 29) {
            str = id.a0(null, null, 2131749417, Integer.valueOf(s12.x5));
        } else if (i7 == 30) {
            str = id.a0(null, null, 2131752343, Integer.valueOf(s12.z4));
        } else if (i7 == 35) {
            str = id.a0(null, null, 2131752350, Integer.valueOf(s12.A4));
        } else if (i7 == 25) {
            str = id.a0(null, null, r12 ? 2131749415 : 2131752347, Integer.valueOf(r12 ? s12.w5 : s12.s5));
        } else if (i7 == 26) {
            str = id.a0(null, null, r12 ? 2131749410 : 2131752341, Integer.valueOf(r12 ? s12.w5 : s12.s5));
        } else if (i7 == 27) {
            str = id.a0(null, null, r12 ? 2131749412 : 2131752344, Integer.valueOf(s12.q5));
        } else if (i7 == 28) {
            str = id.a0(null, null, r12 ? 2131749413 : 2131752345, Integer.valueOf(r12 ? s12.v5 : s12.r5));
        } else if (i7 == 22) {
            str = id.a0(null, null, r12 ? 2131749411 : 2131752342, Integer.valueOf(r12 ? s12.y5 : s12.t5));
        } else if (i7 == 23) {
            str = id.a0(null, null, r12 ? 2131749416 : 2131752348, Integer.valueOf(r12 ? s12.z5 : s12.u5));
        }
        if (str == null) {
            str = l1(false);
        }
        textView4.setText(org.telegram.messenger.g0.X2(str));
        E1();
        kz kzVar = this.H2;
        kzVar.c(false);
        try {
            kzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.V1.c.a(this.U1.i, true);
        this.k1.y0(0);
        if (i7 == 32) {
            this.V1.c.setVisibility(8);
        }
        return true;
    }

    public final void x1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String G = id.G(arrayList.size(), "RevokeLinks", new Object[0]);
        u1 u1Var = alertDialog$Builder.a;
        u1Var.R = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.n2) {
                u1Var.T = org.telegram.messenger.g0.X2(id.a0("RevokeLinkAlertChannel", null, 2131746021, qp.s1(this.a).U2 + "/" + t3.K(chat, false), chat.title));
            } else {
                u1Var.T = org.telegram.messenger.g0.X2(id.a0("RevokeLinkAlert", null, 2131746022, qp.s1(this.a).U2 + "/" + t3.K(chat, false), chat.title));
            }
        } else if (this.n2) {
            u1Var.T = org.telegram.messenger.g0.X2(id.a0("RevokeLinksAlertChannel", null, 2131746018, new Object[0]));
        } else {
            u1Var.T = org.telegram.messenger.g0.X2(id.a0("RevokeLinksAlert", null, 2131746019, new Object[0]));
        }
        alertDialog$Builder.h(id.M0(2131752589, null), null);
        alertDialog$Builder.k(id.M0(2131746024, null), new org.telegram.ui.web.a0(14, this, arrayList));
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            s6.U(textView, l6.q7, this.I0);
        }
    }

    public final void y1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.N2)) {
            TLRPC.ChatFull N0 = qp.s1(this.a).N0(this.G2.id);
            if (N0 == null) {
                dismiss();
                return;
            }
            if (this.G2.username != null) {
                str = "@" + this.G2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = N0.exported_invite;
                if (tL_chatInviteExported == null) {
                    dismiss();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.N2;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = this.q2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long N1 = qp.s1(this.a).N1(user.id);
            if (N1 <= 0) {
                N1 = m5.k(qp.s1(this.a).J2(user.id));
            }
            (N1 >= 0 ? arrayList : arrayList2).add(user);
        }
        int i7 = 0;
        boolean z9 = true;
        if (hashMap2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            v4.Z(this.a, arrayList3, 1, new ii.c(this, 24));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            boolean z11 = z9;
            Iterator it3 = it2;
            ez b10 = ez.b(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            gz.C(this.a).r0(b10);
            if (b10.Q > 0) {
                z10 = z11;
            }
            hashMap2 = hashMap;
            z9 = z11;
            it2 = it3;
        }
        if (!z10) {
            org.telegram.messenger.g0.h3(new v(this, 2));
        }
        dismiss();
    }

    public final void z1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z9) {
        this.T1 = tL_premium_boostsStatus;
        this.W1 = z9;
        G1();
    }
}
