package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u61 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public boolean A0;
    public h61 B0;
    public th.x4 C0;
    public g61 D;
    public int D0;
    public g61 E;
    public final m4 E0;
    public g61 F;
    public xa.n F0;
    public q61 G;
    public PorterDuffColorFilter G0;
    public g61 H;
    public int H0;
    public g61 I;
    public g61 J;
    public g61 K;
    public g61 L;
    public g61 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.sn R;
    public u51 S;
    public s4.a0 T;
    public final e2.j0 U;
    public org.telegram.ui.Components.ei0 V;
    public z51 W;
    public v51 X;
    public t61 Y;
    public bg.h Z;
    public TLRPC.ChatFull a;
    public LinearLayout a0;
    public final long b;
    public final boolean b0;
    public boolean c;
    public final boolean c0;
    public g61 d;
    public final boolean d0;
    public g61 e;
    public long e0;
    public p61 f;
    public long f0;
    public final org.telegram.ui.ActionBar.x1[] g0;
    public g61 h;
    public s51 h0;
    public zb i0;
    public le j0;
    public View k0;
    public FrameLayout l0;
    public fe.b m0;
    public g61 n;
    public final boolean n0;
    public rf0 o0;
    public FrameLayout p0;
    public gh.b[] q0;
    public g61 r;
    public int r0;
    public g61 s;
    public final SparseIntArray s0;
    public final SparseIntArray t0;
    public final ArrayList u0;
    public final ArrayList v0;
    public g61 w;
    public final ArrayList w0;
    public g61 x;
    public final ArrayList x0;
    public g61 y;
    public final ArrayList y0;
    public boolean z0;

    public u61(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.U = new e2.j0(50, 3);
        this.g0 = new org.telegram.ui.ActionBar.x1[1];
        this.r0 = -1;
        this.s0 = new SparseIntArray();
        this.t0 = new SparseIntArray();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.A0 = true;
        this.E0 = new m4(this, 15);
        long j10 = bundle.getLong("chat_id");
        this.b = j10;
        this.b0 = bundle.getBoolean("is_megagroup", false);
        this.c0 = bundle.getBoolean("start_from_boosts", false);
        this.d0 = bundle.getBoolean("start_from_monetization", false);
        this.n0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().M0(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v53 */
    public static void Y(final u61 u61Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        String str4;
        ?? r15;
        ArrayList arrayList3;
        int i10;
        String str5;
        ArrayList arrayList4;
        String str6;
        ArrayList arrayList5 = u61Var.N;
        ArrayList arrayList6 = u61Var.O;
        ArrayList arrayList7 = u61Var.u0;
        String str7 = "%";
        int i11 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final g61[] g61VarArr = {h0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.cd.L0(2131749282, "IVInteractionsChartTitle"), 1, false), h0(tL_broadcastStats.followers_graph, org.telegram.messenger.cd.L0(2131750611, "FollowersChartTitle"), 0, false), h0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.cd.L0(2131744058, "TopHoursChartTitle"), 0, false), h0(tL_broadcastStats.interactions_graph, org.telegram.messenger.cd.L0(2131743556, "ViewsAndSharesChartTitle"), 1, false), h0(tL_broadcastStats.growth_graph, org.telegram.messenger.cd.L0(2131749384, "GrowthChartTitle"), 0, false), h0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.cd.L0(2131743555, "ViewsBySourceChartTitle"), 2, false), h0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.cd.L0(2131748291, "NewFollowersBySourceChartTitle"), 2, false), h0(tL_broadcastStats.languages_graph, org.telegram.messenger.cd.L0(2131749051, "LanguagesChartTitle"), 4, true), h0(tL_broadcastStats.mute_graph, org.telegram.messenger.cd.L0(2131747936, "NotificationsChartTitle"), 0, false), h0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.cd.L0(2131746400, "ReactionsByEmotionChartTitle"), 2, false), h0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.cd.L0(2131744678, "StoryInteractionsChartTitle"), 1, false), h0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.cd.L0(2131744530, "StoryReactionsByEmotionChartTitle"), 2, false)};
            g61 g61Var = g61VarArr[2];
            if (g61Var != null) {
                g61Var.n = true;
            }
            p61 p61Var = new p61();
            xa.n a2 = p61.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            p61Var.o = org.telegram.messenger.cd.L0(2131746393, "ReactionsPerPost");
            p61Var.p = (String) a2.a;
            p61Var.q = (String) a2.d;
            p61Var.r = ((Boolean) a2.b).booleanValue();
            p61Var.s = ((Boolean) a2.c).booleanValue();
            xa.n a10 = p61.a(tL_broadcastStats.reactions_per_story);
            p61Var.t = org.telegram.messenger.cd.L0(2131746392, "ReactionsPerStory");
            p61Var.u = (String) a10.a;
            p61Var.v = (String) a10.d;
            p61Var.w = ((Boolean) a10.b).booleanValue();
            p61Var.x = ((Boolean) a10.c).booleanValue();
            xa.n a11 = p61.a(tL_broadcastStats.views_per_story);
            p61Var.y = org.telegram.messenger.cd.L0(2131743553, "ViewsPerStory");
            p61Var.z = (String) a11.a;
            p61Var.A = (String) a11.d;
            p61Var.B = ((Boolean) a11.b).booleanValue();
            p61Var.C = ((Boolean) a11.c).booleanValue();
            xa.n a12 = p61.a(tL_broadcastStats.shares_per_story);
            p61Var.D = org.telegram.messenger.cd.L0(2131745415, "SharesPerStory");
            p61Var.E = (String) a12.a;
            p61Var.F = (String) a12.d;
            p61Var.G = ((Boolean) a12.b).booleanValue();
            p61Var.H = ((Boolean) a12.c).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str8 = "GrowthChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            float abs = d10 == 0.0d ? 0.0f : Math.abs((i12 / ((float) d10)) * 100.0f);
            p61Var.a = org.telegram.messenger.cd.L0(2131750611, "FollowersChartTitle");
            p61Var.b = org.telegram.messenger.i0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs == 0.0f) {
                i10 = i12;
                p61Var.c = "";
            } else {
                int i13 = (int) abs;
                if (abs == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12 > 0 ? str4 : "");
                    sb2.append(org.telegram.messenger.i0.o0(i12, 0));
                    p61Var.c = sb2.toString() + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i12 > 0 ? str4 : "");
                    sb3.append(org.telegram.messenger.i0.o0(i12, 0));
                    i10 = i12;
                    p61Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            p61Var.d = i10 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            float abs2 = d12 == 0.0d ? 0.0f : Math.abs((i14 / ((float) d12)) * 100.0f);
            p61Var.i = org.telegram.messenger.cd.L0(2131745416, "SharesPerPost");
            p61Var.j = org.telegram.messenger.i0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 == 0 || abs2 == 0.0f) {
                p61Var.k = "";
            } else {
                int i15 = (int) abs2;
                if (abs2 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i14 > 0 ? str4 : "");
                    sb4.append(org.telegram.messenger.i0.o0(i14, 0));
                    p61Var.k = sb4.toString() + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i14 > 0 ? str4 : "");
                    sb5.append(org.telegram.messenger.i0.o0(i14, 0));
                    p61Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            p61Var.l = i14 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            float abs3 = d14 == 0.0d ? 0.0f : Math.abs((i16 / ((float) d14)) * 100.0f);
            p61Var.e = org.telegram.messenger.cd.L0(2131743554, "ViewsPerPost");
            p61Var.f = org.telegram.messenger.i0.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 == 0 || abs3 == 0.0f) {
                p61Var.g = "";
            } else {
                int i17 = (int) abs3;
                if (abs3 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i16 > 0 ? str4 : "");
                    sb6.append(org.telegram.messenger.i0.o0(i16, 0));
                    p61Var.g = sb6.toString() + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i16 > 0 ? str4 : "");
                    sb7.append(org.telegram.messenger.i0.o0(i16, 0));
                    p61Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            p61Var.h = i16 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            p61Var.m = org.telegram.messenger.cd.L0(2131751144, "EnabledNotifications");
            int i18 = (int) f7;
            if (f7 == i18) {
                Locale locale7 = Locale.ENGLISH;
                p61Var.n = a1.g.k(i18, "%");
            } else {
                p61Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            u61Var.f = p61Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            u61Var.e0 = tL_statsDateRangeDays.max_date * 1000;
            u61Var.f0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                i21++;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                r61 r61Var = new r61();
                r61Var.a = postInteractionCounters2;
                int i22 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(r61Var);
                    str5 = str8;
                    str6 = str7;
                    u61Var.s0.put(r61Var.b(), i19);
                    i19++;
                } else {
                    str5 = str8;
                    arrayList4 = arrayList8;
                    str6 = str7;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(r61Var.b()));
                    u61Var.w0.add(r61Var);
                    u61Var.t0.put(r61Var.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str8 = str5;
                str7 = str6;
                arrayList8 = arrayList4;
                size = i22;
            }
            str3 = str8;
            ArrayList arrayList12 = arrayList8;
            str2 = str7;
            org.telegram.messenger.i0.g3(new o51(u61Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((r61) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.hs messagesStorage = u61Var.getMessagesStorage();
                long j10 = -u61Var.b;
                int i23 = u61Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.a.c(new org.telegram.messenger.bq(messagesStorage, org.telegram.messenger.l00.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, j10, 0L, size2, b10, 0, 0, i23, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            org.telegram.messenger.i0.g3(new Runnable(u61Var) { // from class: org.telegram.ui.p51
                public final /* synthetic */ u61 b;

                {
                    this.b = u61Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (objArr) {
                        case 0:
                            u61 u61Var2 = this.b;
                            u61Var2.getClass();
                            g61[] g61VarArr2 = g61VarArr;
                            u61Var2.r = g61VarArr2[0];
                            u61Var2.h = g61VarArr2[1];
                            u61Var2.e = g61VarArr2[2];
                            u61Var2.n = g61VarArr2[3];
                            u61Var2.d = g61VarArr2[4];
                            u61Var2.s = g61VarArr2[5];
                            u61Var2.w = g61VarArr2[6];
                            u61Var2.x = g61VarArr2[7];
                            u61Var2.y = g61VarArr2[8];
                            u61Var2.D = g61VarArr2[9];
                            u61Var2.E = g61VarArr2[10];
                            u61Var2.F = g61VarArr2[11];
                            u61Var2.i0(g61VarArr2);
                            break;
                        default:
                            u61 u61Var3 = this.b;
                            u61Var3.getClass();
                            g61[] g61VarArr3 = g61VarArr;
                            u61Var3.d = g61VarArr3[0];
                            u61Var3.H = g61VarArr3[1];
                            u61Var3.I = g61VarArr3[2];
                            u61Var3.J = g61VarArr3[3];
                            u61Var3.K = g61VarArr3[4];
                            u61Var3.L = g61VarArr3[5];
                            u61Var3.e = g61VarArr3[6];
                            u61Var3.M = g61VarArr3[7];
                            u61Var3.i0(g61VarArr3);
                            break;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "TopHoursChartTitle";
            str2 = "%";
            str3 = "GrowthChartTitle";
            str4 = "+";
            r15 = 0;
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            g61 h02 = h0(tL_megagroupStats.growth_graph, org.telegram.messenger.cd.L0(2131749384, str3), r15, r15);
            g61 h03 = h0(tL_megagroupStats.members_graph, org.telegram.messenger.cd.L0(2131749436, "GroupMembersChartTitle"), r15, r15);
            g61 h04 = h0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.cd.L0(2131748288, "NewMembersBySourceChartTitle"), 2, r15);
            g61 h05 = h0(tL_megagroupStats.languages_graph, org.telegram.messenger.cd.L0(2131748633, "MembersLanguageChartTitle"), 4, true);
            g61 h06 = h0(tL_megagroupStats.messages_graph, org.telegram.messenger.cd.L0(2131748477, "MessagesChartTitle"), 2, r15);
            g61 h07 = h0(tL_megagroupStats.actions_graph, org.telegram.messenger.cd.L0(2131754489, "ActionsChartTitle"), 1, r15);
            g61 h08 = h0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.cd.L0(2131744058, str), r15, r15);
            g61 h09 = h0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.cd.L0(2131744059, "TopDaysOfWeekChartTitle"), 4, r15);
            final g61[] g61VarArr2 = new g61[8];
            g61VarArr2[r15] = h02;
            g61VarArr2[1] = h03;
            g61VarArr2[2] = h04;
            g61VarArr2[3] = h05;
            g61VarArr2[4] = h06;
            g61VarArr2[5] = h07;
            g61VarArr2[6] = h08;
            g61VarArr2[7] = h09;
            g61 g61Var2 = g61VarArr2[6];
            if (g61Var2 != null) {
                g61Var2.n = true;
            }
            g61 g61Var3 = g61VarArr2[7];
            if (g61Var3 != null) {
                g61Var3.o = true;
            }
            q61 q61Var = new q61();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i24 = (int) (d15 - d16);
            float abs4 = d16 == 0.0d ? 0.0f : Math.abs((i24 / ((float) d16)) * 100.0f);
            q61Var.a = org.telegram.messenger.cd.L0(2131748632, "MembersOverviewTitle");
            q61Var.b = org.telegram.messenger.i0.o0((int) tL_megagroupStats.members.current, 0);
            if (i24 == 0 || abs4 == 0.0f) {
                q61Var.c = "";
            } else {
                int i25 = (int) abs4;
                if (abs4 == i25) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i24 > 0 ? str4 : "");
                    sb8.append(org.telegram.messenger.i0.o0(i24, 0));
                    q61Var.c = sb8.toString() + " (" + i25 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i24 > 0 ? str4 : "");
                    sb9.append(org.telegram.messenger.i0.o0(i24, 0));
                    q61Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str2);
                }
            }
            q61Var.d = i24 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i26 = (int) (d17 - d18);
            float abs5 = d18 == 0.0d ? 0.0f : Math.abs((i26 / ((float) d18)) * 100.0f);
            q61Var.i = org.telegram.messenger.cd.L0(2131743558, "ViewingMembers");
            q61Var.j = org.telegram.messenger.i0.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i26 == 0 || abs5 == 0.0f) {
                q61Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i26 > 0 ? str4 : "");
                sb10.append(org.telegram.messenger.i0.o0(i26, 0));
                q61Var.k = sb10.toString();
            }
            q61Var.l = i26 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            float abs6 = d20 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d20)) * 100.0f);
            q61Var.m = org.telegram.messenger.cd.L0(2131747082, "PostingMembers");
            q61Var.n = org.telegram.messenger.i0.o0((int) tL_megagroupStats.posters.current, 0);
            if (i27 == 0 || abs6 == 0.0f) {
                q61Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i27 > 0 ? str4 : "");
                sb11.append(org.telegram.messenger.i0.o0(i27, 0));
                q61Var.o = sb11.toString();
            }
            q61Var.p = i27 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d21 - d22);
            float abs7 = d22 == 0.0d ? 0.0f : Math.abs((i28 / ((float) d22)) * 100.0f);
            q61Var.e = org.telegram.messenger.cd.L0(2131748468, "MessagesOverview");
            q61Var.f = org.telegram.messenger.i0.o0((int) tL_megagroupStats.messages.current, 0);
            if (i28 == 0 || abs7 == 0.0f) {
                q61Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i28 > 0 ? str4 : "");
                sb12.append(org.telegram.messenger.i0.o0(i28, 0));
                q61Var.g = sb12.toString();
            }
            q61Var.h = i28 >= 0;
            u61Var.G = q61Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            u61Var.e0 = tL_statsDateRangeDays2.max_date * 1000;
            u61Var.f0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    n61 n61Var = new n61();
                    n61Var.a = n61.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i30 = tL_statsGroupTopPoster.messages;
                    if (i30 > 0) {
                        sb13.append(org.telegram.messenger.cd.G(i30, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.cd.a0("CharactersPerMessage", null, 2131752254, org.telegram.messenger.cd.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    n61Var.b = sb13.toString();
                    int i31 = i11;
                    if (arrayList2.size() < i31) {
                        arrayList3 = arrayList2;
                        arrayList3.add(n61Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(n61Var);
                    i29++;
                    arrayList2 = arrayList3;
                    i11 = i31;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i32 = 0; i32 < tL_megagroupStats.top_admins.size(); i32++) {
                    ArrayList arrayList19 = u61Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i32);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    n61 n61Var2 = new n61();
                    n61Var2.a = n61.a(arrayList20, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb14 = new StringBuilder();
                    int i33 = tL_statsGroupTopAdmin.deleted;
                    if (i33 > 0) {
                        sb14.append(org.telegram.messenger.cd.G(i33, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.cd.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.cd.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    n61Var2.b = sb14.toString();
                    arrayList19.add(n61Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i34 = 0; i34 < tL_megagroupStats.top_inviters.size(); i34++) {
                    ArrayList arrayList22 = u61Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i34);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    n61 n61Var3 = new n61();
                    n61Var3.a = n61.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i35 = tL_statsGroupTopInviter.invitations;
                    if (i35 > 0) {
                        n61Var3.b = org.telegram.messenger.cd.G(i35, "Invitations", new Object[0]);
                    } else {
                        n61Var3.b = "";
                    }
                    arrayList22.add(n61Var3);
                }
            }
            final int i36 = 1;
            org.telegram.messenger.i0.g3(new Runnable(u61Var) { // from class: org.telegram.ui.p51
                public final /* synthetic */ u61 b;

                {
                    this.b = u61Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i36) {
                        case 0:
                            u61 u61Var2 = this.b;
                            u61Var2.getClass();
                            g61[] g61VarArr22 = g61VarArr2;
                            u61Var2.r = g61VarArr22[0];
                            u61Var2.h = g61VarArr22[1];
                            u61Var2.e = g61VarArr22[2];
                            u61Var2.n = g61VarArr22[3];
                            u61Var2.d = g61VarArr22[4];
                            u61Var2.s = g61VarArr22[5];
                            u61Var2.w = g61VarArr22[6];
                            u61Var2.x = g61VarArr22[7];
                            u61Var2.y = g61VarArr22[8];
                            u61Var2.D = g61VarArr22[9];
                            u61Var2.E = g61VarArr22[10];
                            u61Var2.F = g61VarArr22[11];
                            u61Var2.i0(g61VarArr22);
                            break;
                        default:
                            u61 u61Var3 = this.b;
                            u61Var3.getClass();
                            g61[] g61VarArr3 = g61VarArr2;
                            u61Var3.d = g61VarArr3[0];
                            u61Var3.H = g61VarArr3[1];
                            u61Var3.I = g61VarArr3[2];
                            u61Var3.J = g61VarArr3[3];
                            u61Var3.K = g61VarArr3[4];
                            u61Var3.L = g61VarArr3[5];
                            u61Var3.e = g61VarArr3[6];
                            u61Var3.M = g61VarArr3[7];
                            u61Var3.i0(g61VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void Z(u61 u61Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new org.telegram.messenger.jj(u61Var.currentAccount, arrayList2.get(i10), false, true));
            }
            u61Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.i0.g3(new o51(u61Var, arrayList, 1));
    }

    public static void b0(u61 u61Var) {
        t61 t61Var = u61Var.Y;
        if (t61Var != null) {
            t61Var.b = true;
        }
        int childCount = u61Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = u61Var.S.getChildAt(i10);
            if (childAt instanceof f61) {
                ((f61) childAt).b.t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.k2 f0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).M0(chat.id);
        return (M0 == null || !(M0.can_view_stats || M0.can_view_stars_revenue)) ? new t5(-chat.id) : new u61(bundle);
    }

    public static cg.b g0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new cg.b(jSONObject);
        }
        if (i10 == 1) {
            return new cg.c(jSONObject);
        }
        if (i10 == 2) {
            cg.d dVar = new cg.d(jSONObject);
            int length = ((cg.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                dVar.l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = dVar.l;
                    jArr[i11] = jArr[i11] + ((cg.a) dVar.d.get(i12)).a[i11];
                }
            }
            dVar.m = new m4.c(dVar.l);
            return dVar;
        }
        if (i10 != 4) {
            return null;
        }
        cg.e eVar = new cg.e(jSONObject);
        if (z10) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j10 = 0;
            for (int i13 = 0; i13 < eVar.d.size(); i13++) {
                int length2 = eVar.a.length;
                for (int i14 = 0; i14 < length2; i14++) {
                    long j11 = ((cg.a) eVar.d.get(i13)).a[i14];
                    jArr2[i13] = jArr2[i13] + j11;
                    if (j11 == 0) {
                        iArr[i13] = iArr[i13] + 1;
                    }
                }
                j10 += jArr2[i13];
            }
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < eVar.d.size(); i15++) {
                if (jArr2[i15] / j10 < 0.01d && iArr[i15] > eVar.a.length / 2.0f) {
                    arrayList.add((cg.a) eVar.d.get(i15));
                }
            }
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj = arrayList.get(i16);
                i16++;
                eVar.d.remove((cg.a) obj);
            }
        }
        int length3 = ((cg.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i17 = 0; i17 < length3; i17++) {
            eVar.l[i17] = 0;
            for (int i18 = 0; i18 < size3; i18++) {
                long[] jArr3 = eVar.l;
                jArr3[i17] = jArr3[i17] + ((cg.a) eVar.d.get(i18)).a[i17];
            }
        }
        new m4.c(eVar.l);
        return eVar;
    }

    public static g61 h0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        g61 g61Var = new g61(str, i10);
        g61Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                cg.b g02 = g0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                g61Var.d = g02;
                if (g02 != null) {
                    g02.h = statsGraph.rate;
                }
                g61Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (g02 == null || (jArr2 = g02.a) == null || jArr2.length < 2) {
                    g61Var.l = true;
                }
                if (i10 == 4 && g02 != null && (jArr = g02.a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    g61Var.e = new cg.e(g02, j10);
                    g61Var.c = j10;
                    return g61Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            g61Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return g61Var;
    }

    public static void m0(g61 g61Var, ArrayList arrayList, org.telegram.ui.ActionBar.b7 b7Var) {
        cg.b bVar;
        if (g61Var == null || (bVar = g61Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            cg.a aVar = (cg.a) obj;
            int i11 = aVar.g;
            if (i11 >= 0) {
                if (!org.telegram.ui.ActionBar.t6.f1(i11)) {
                    org.telegram.ui.ActionBar.t6.A1(aVar.g, org.telegram.ui.ActionBar.t6.I == org.telegram.ui.ActionBar.t6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.t6.em[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, aVar.g));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Oj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Nj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i10;
        int i11;
        boolean z10;
        u61 u61Var = this;
        int i12 = 1;
        u61Var.setHasOwnBackground(true);
        u61Var.Z = new bg.h((org.telegram.ui.ActionBar.p6) null);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(u61Var.currentAccount);
        long j10 = u61Var.b;
        TLRPC.Chat L0 = r12.L0(Long.valueOf(j10));
        TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(u61Var.currentAccount).M0(j10);
        boolean z11 = M0 != null && M0.can_view_stats;
        boolean R = org.telegram.messenger.w3.R(L0);
        boolean z12 = M0 != null && (M0.can_view_revenue || M0.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z11) {
            arrayList.add(gh.b.c(context, u61Var.resourceProvider, gh.a.I, 2131744910));
        }
        arrayList.add(gh.b.c(context, u61Var.resourceProvider, gh.a.O, 2131753163));
        if (z12) {
            arrayList.add(gh.b.c(context, u61Var.resourceProvider, gh.a.P, 2131748422));
        }
        u61Var.q0 = (gh.b[]) arrayList.toArray(new gh.b[0]);
        rf0 rf0Var = new rf0(context, u61Var.resourceProvider);
        u61Var.o0 = rf0Var;
        rf0Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        u61Var.o0.setMaxWidth(org.telegram.messenger.i0.L(344.0f));
        u61Var.o0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        u61Var.p0 = frameLayout2;
        frameLayout2.setOnClickListener(new bh.c(17));
        u61Var.p0.addView(u61Var.o0, w7.b6.e(-1, 72, 81));
        u61Var.p0.setClipToPadding(false);
        int i13 = 0;
        while (true) {
            gh.b[] bVarArr = u61Var.q0;
            if (i13 >= bVarArr.length) {
                break;
            }
            gh.b bVar = bVarArr[i13];
            bVar.setOnClickListener(new bh.f(u61Var, i13, 26));
            u61Var.o0.addView(u61Var.q0[i13]);
            u61Var.o0.i(bVar, true, false);
            i13++;
        }
        u61Var.h0 = new s51(u61Var, u61Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            zb zbVar = new zb(u61Var, -j10, u61Var.getResourceProvider());
            u61Var.i0 = zbVar;
            zbVar.F.setCaptureSectionsDecoratorAllowed(true);
            u61Var.glassEngine.b(u61Var.i0.F);
        }
        if (z12) {
            Activity parentActivity = u61Var.getParentActivity();
            int i14 = u61Var.currentAccount;
            long j11 = -j10;
            org.telegram.ui.ActionBar.p6 resourceProvider = u61Var.getResourceProvider();
            frameLayout = frameLayout3;
            ei.r rVar = u61Var.glassEngine;
            if (org.telegram.messenger.w3.V(L0) && M0.can_view_revenue) {
                i11 = -1;
                z10 = true;
            } else {
                i11 = -1;
                z10 = false;
            }
            i10 = i11;
            le leVar = new le(parentActivity, u61Var, i14, j11, resourceProvider, rVar, z10, M0.can_view_stars_revenue);
            u61Var = u61Var;
            u61Var.j0 = leVar;
            leVar.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i10 = -1;
        }
        boolean z13 = z11;
        FrameLayout frameLayout4 = frameLayout;
        u61Var.h0.setAdapter(new t51(u61Var, z13, R, z12, frameLayout4));
        boolean z14 = u61Var.n0;
        boolean z15 = R && !z14;
        u61Var.c = z15;
        if (z15 && u61Var.c0) {
            u61Var.h0.setPosition(z13 ? 1 : 0);
        } else if (z15 && u61Var.d0) {
            u61Var.h0.setPosition(((z14 || !R) ? 0 : 1) + (z13 ? 1 : 0));
        }
        u61Var.o0(u61Var.h0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(u61Var.getParentActivity());
        frameLayout5.addView(u61Var.h0, w7.b6.g());
        View view = new View(context);
        u61Var.k0 = view;
        frameLayout5.addView(view, w7.b6.e(i10, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        u61Var.l0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(u61Var.l0, w7.b6.g());
        frameLayout5.addView(u61Var.simpleActionBar);
        if (u61Var.c) {
            u61Var.setBulletinDelegate(new mg.u(9));
            u61Var.p0.setBackground(u61Var.getBaseSimpleGlass().b(u61Var.p0));
            frameLayout5.addView(u61Var.p0, w7.b6.e(i10, -2, 80));
        }
        u61Var.fragmentView = frameLayout5;
        u51 u51Var = new u51(u61Var, context);
        u61Var.S = u51Var;
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        u61Var.S.setSections(true);
        u61Var.S.setClipToPadding(false);
        u61Var.glassEngine.b(u61Var.S);
        u61Var.S.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        u61Var.a0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        u61Var.V = ei0Var;
        ei0Var.setAutoRepeat(true);
        u61Var.V.f(R.raw.statistic_preload, 120, 120, null);
        u61Var.V.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i15 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.V(textView, i15, null);
        textView.setTag(Integer.valueOf(i15));
        textView.setText(org.telegram.messenger.cd.L0(2131748787, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i16 = org.telegram.ui.ActionBar.t6.Dj;
        org.telegram.ui.ActionBar.a7.V(textView2, i16, null);
        textView2.setTag(Integer.valueOf(i16));
        textView2.setText(org.telegram.messenger.cd.L0(2131748786, null));
        textView2.setGravity(1);
        u61Var.a0.addView(u61Var.V, w7.b6.t(120, 120, 1, 0, 0, 0, 20));
        u61Var.a0.addView(textView, w7.b6.t(-2, -2, 1, 0, 0, 0, 10));
        u61Var.a0.addView(textView2, w7.b6.r(-2, -2, 1));
        frameLayout4.addView(u61Var.a0, w7.b6.d(org.telegram.messenger.zs.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (u61Var.W == null) {
            u61Var.W = new z51(u61Var);
        }
        u61Var.S.setAdapter(u61Var.W);
        s4.a0 a0Var = new s4.a0();
        u61Var.T = a0Var;
        u61Var.S.setLayoutManager(a0Var);
        u61Var.X = new v51();
        u61Var.S.setItemAnimator(null);
        u61Var.S.j(new w41(u61Var, i12));
        u61Var.S.setOnItemClickListener(new kz0(u61Var, 6));
        u61Var.S.setOnItemLongClickListener(new r51(u61Var));
        frameLayout4.addView(u61Var.S);
        u61Var.R = new org.telegram.ui.Components.sn(context, null, false, null);
        TLRPC.Chat L02 = u61Var.getMessagesController().L0(Long.valueOf(j10));
        u61Var.R.setChatAvatar(L02);
        u61Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        u61Var.simpleActionBar.setTitle(L02 == null ? "" : L02.title);
        u61Var.simpleActionBar.setActionBarMenuOnItemClick(new y01(u61Var, 3));
        u61Var.R.i(org.telegram.ui.ActionBar.t6.x0(null, i15, false), org.telegram.ui.ActionBar.t6.x0(null, i16, false));
        boolean z16 = u61Var.A0;
        m4 m4Var = u61Var.E0;
        if (z16) {
            u61Var.a0.setAlpha(0.0f);
            org.telegram.messenger.i0.h3(m4Var, 500L);
            u61Var.a0.setVisibility(0);
            u61Var.S.setVisibility(8);
        } else {
            org.telegram.messenger.i0.r(m4Var);
            u61Var.a0.setVisibility(8);
            u61Var.S.setVisibility(0);
        }
        vg.f c10 = u61Var.getBaseSimpleGlass().c.c(u61Var.o0, w7.b9.f(u61Var.resourceProvider), false);
        org.telegram.messenger.z20.u(c10, org.telegram.messenger.i0.L(28.0f), 7.666f);
        u61Var.o0.setBackground(c10);
        u61Var.glassEngine.c(u61Var.h0);
        ei.b baseSimpleGlass = u61Var.getBaseSimpleGlass();
        s51 s51Var = u61Var.h0;
        org.telegram.ui.ActionBar.i5 i5Var = u61Var.simpleActionBar;
        org.telegram.ui.ActionBar.p6 p6Var = u61Var.resourceProvider;
        baseSimpleGlass.k = frameLayout5;
        baseSimpleGlass.l = s51Var;
        baseSimpleGlass.a.c(s51Var);
        baseSimpleGlass.g(frameLayout5, i5Var, p6Var);
        u61Var.m0 = new fe.b(0, new r51(u61Var), org.telegram.ui.Components.gr.h, 380L, false);
        le leVar2 = u61Var.j0;
        if (leVar2 != null) {
            ei.b baseSimpleGlass2 = u61Var.getBaseSimpleGlass();
            View view2 = leVar2.a1.d;
            vg.f c11 = baseSimpleGlass2.c.c(view2, null, false);
            c11.o(w7.b9.m(leVar2.n0));
            c11.p(org.telegram.messenger.i0.L(9.66f));
            c11.q(org.telegram.messenger.i0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = u61Var.j0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.i0.E2(transactionTabs);
            u61Var.l0.addView(transactionTabs, layoutParams);
            u61Var.j0.setTabsPinnedChangedListener(new wv0(u61Var, 22));
            u61Var.m0.a(u61Var.j0.e0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new bl(u61Var, 2));
        u61Var.getBaseSimpleGlass().m = new yv(u61Var, frameLayout5, new z5(i12, frameLayout5), i12);
        u61Var.getBaseSimpleGlass().l = null;
        u61Var.simpleActionBar.setBackground(null);
        u61Var.k0.setBackground(u61Var.getBaseSimpleGlass().a(u61Var.k0));
        org.telegram.messenger.i0.E2(u61Var.R.e);
        frameLayout5.addView(u61Var.R.e, w7.b6.e(42, 42, 53));
        u61Var.e0();
        u61Var.fragmentView.setBackgroundColor(u61Var.getThemedColor(org.telegram.ui.ActionBar.t6.a7));
        u61Var.B0 = new h61(u61Var.W, u61Var.T);
        return u61Var.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == org.telegram.messenger.zs.x5) {
            if (((th.x4) objArr[0]) == this.C0) {
                l0();
                q0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.B0.f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.V2) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.k2 k2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack) : null;
            if (k2Var instanceof oo) {
                ((ActionBarLayout) getParentLayout()).c0(k2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.k2 k2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (k2Var2 instanceof ProfileActivity) {
                    mg.p.f(k2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.k2 k2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.k2) sc.e.g(3, fragmentStack2) : null;
            if (k2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).c0(k2Var2, false);
            }
            finishFragment();
            if (k2Var3 instanceof un) {
                mg.p.f(k2Var3, chat, true);
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.zs.D) {
            if (i10 == org.telegram.messenger.zs.T) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.b && this.a == null) {
                    this.a = chatFull;
                    k0();
                    return;
                }
                return;
            }
            return;
        }
        if (((Integer) objArr[10]).intValue() == this.classGuid) {
            ArrayList arrayList2 = (ArrayList) objArr[2];
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i13 = 0;
            while (true) {
                arrayList = this.u0;
                if (i13 >= size) {
                    break;
                }
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(i13);
                int i14 = this.s0.get(jjVar.f1(), -1);
                if (i14 >= 0 && ((r61) arrayList.get(i14)).b() == jjVar.f1()) {
                    if (jjVar.Z) {
                        arrayList3.add((r61) arrayList.get(i14));
                    } else {
                        ((r61) arrayList.get(i14)).b = jjVar;
                    }
                }
                i13++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.v0;
            arrayList4.clear();
            int size2 = arrayList.size();
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                r61 r61Var = (r61) arrayList.get(i12);
                if (r61Var.b == null) {
                    this.r0 = r61Var.b();
                    break;
                } else {
                    arrayList4.add(r61Var);
                    i12++;
                }
            }
            if (arrayList4.size() < 20) {
                j0();
            }
            q0();
            if (this.W != null) {
                this.S.setItemAnimator(null);
                this.B0.f();
            }
        }
    }

    public final void e0() {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (this.k0 != null) {
            int L = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.b;
            ViewGroup.LayoutParams layoutParams = this.k0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.k0.setLayoutParams(layoutParams);
            }
            s0();
        }
        int L2 = this.c ? org.telegram.messenger.i0.L(72.0f) : 0;
        org.telegram.messenger.i0.A3(this.R.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.i0.L(6.0f), 0);
        this.p0.setPadding(0, 0, 0, this.mSystemInsets.d);
        u51 u51Var = this.S;
        if (u51Var != null) {
            i0.c cVar = this.mSystemInsets;
            ei.b.e(u51Var, cVar.b, cVar.d, currentActionBarHeight, L2);
        }
        zb zbVar = this.i0;
        if (zbVar != null) {
            org.telegram.ui.Components.tk0 tk0Var = zbVar.F;
            i0.c cVar2 = this.mSystemInsets;
            ei.b.e(tk0Var, cVar2.b, cVar2.d, currentActionBarHeight, L2);
        }
        le leVar = this.j0;
        if (leVar != null) {
            i0.c cVar3 = this.mSystemInsets;
            int i10 = cVar3.b;
            int i11 = cVar3.d;
            leVar.U0 = i10;
            leVar.V0 = i11;
            leVar.W0 = L2;
            int C = org.telegram.messenger.z20.C(48.0f, i10, -org.telegram.messenger.i0.L(8.0f));
            int C2 = org.telegram.messenger.z20.C(48.0f, i11, -org.telegram.messenger.i0.L(8.0f));
            org.telegram.ui.Components.u51 u51Var2 = leVar.X0;
            org.telegram.messenger.i0.A3(u51Var2, 0, C, 0, C2);
            u51Var2.setPadding(u51Var2.getPaddingLeft(), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10) - C, u51Var2.getPaddingRight(), (i11 + L2) - C2);
            leVar.z(-C, -C2);
            leVar.B();
            leVar.requestLayout();
            leVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        g6 g6Var = new g6(21, this);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{dg.d.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.j5));
        if (this.b0) {
            while (i10 < 6) {
                m0(i10 == 0 ? this.d : i10 == 1 ? this.H : i10 == 2 ? this.I : i10 == 3 ? this.J : i10 == 4 ? this.K : this.L, arrayList, g6Var);
                i10++;
            }
        } else {
            while (i10 < 12) {
                m0(i10 == 0 ? this.d : i10 == 1 ? this.h : i10 == 2 ? this.n : i10 == 3 ? this.r : i10 == 4 ? this.s : i10 == 5 ? this.w : i10 == 6 ? this.y : i10 == 7 ? this.e : i10 == 8 ? this.x : i10 == 9 ? this.D : i10 == 10 ? this.E : this.F, arrayList, g6Var);
                i10++;
            }
        }
        return arrayList;
    }

    public final void i0(g61[] g61VarArr) {
        z51 z51Var = this.W;
        if (z51Var != null) {
            z51Var.E();
            this.S.setItemAnimator(null);
            this.W.f();
        }
        this.A0 = false;
        LinearLayout linearLayout = this.a0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        org.telegram.messenger.i0.r(this.E0);
        this.a0.animate().alpha(0.0f).setDuration(230L).setListener(new ns0(this, 9));
        this.S.setVisibility(0);
        this.S.setAlpha(0.0f);
        this.S.animate().alpha(1.0f).setDuration(230L).start();
        for (g61 g61Var : g61VarArr) {
            if (g61Var != null && g61Var.d == null && g61Var.f != null) {
                g61Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new uh(2, this, g61Var));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        s51 s51Var;
        if (motionEvent != null && this.j0 != null && (s51Var = this.h0) != null) {
            View currentView = s51Var.getCurrentView();
            le leVar = this.j0;
            if (currentView == leVar && leVar.G((motionEvent.getX() - this.h0.getX()) - this.j0.getX(), (motionEvent.getY() - this.h0.getY()) - this.j0.getY())) {
                return false;
            }
        }
        s51 s51Var2 = this.h0;
        if (s51Var2 == null || (s51Var2.b == 0 && s51Var2.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.u0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.s0.get(this.r0); i11 < size; i11++) {
            if (((r61) arrayList.get(i11)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((r61) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.vp.r1(this.currentAccount).g1(this.b);
        this.z0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new n51(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.n0) {
            return;
        }
        boolean z10 = this.b0;
        long j10 = this.b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.vp.r1(this.currentAccount).g1(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.vp.r1(this.currentAccount).g1(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new n51(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void l0() {
        ArrayList arrayList = this.x0;
        arrayList.clear();
        ArrayList arrayList2 = this.w0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            r61 r61Var = (r61) obj;
            org.telegram.messenger.jj f7 = this.C0.f(r61Var.b());
            if (f7 != null) {
                r61Var.b = f7;
                arrayList.add(r61Var);
            }
        }
        this.t0.clear();
        arrayList2.clear();
    }

    public final void n0(View view) {
        if (view instanceof f61) {
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.c7) || this.S.b1()) {
            if (view instanceof dg.d) {
                ((dg.d) view).a();
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof org.telegram.ui.Components.eq) {
            org.telegram.ui.Components.eq eqVar = (org.telegram.ui.Components.eq) background;
            if ((eqVar.a instanceof ColorDrawable) && eqVar.b != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.b7, false);
                if (this.G0 == null || this.H0 != x02) {
                    this.H0 = x02;
                    this.G0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                }
                ((ColorDrawable) eqVar.a).setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false));
                eqVar.b.setColorFilter(this.G0);
                view.invalidate();
                return;
            }
        }
        org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false)), org.telegram.ui.ActionBar.t6.Y0(org.telegram.messenger.w0.b, R.drawable.greydivider, org.telegram.ui.ActionBar.t6.b7), 0, 0);
        eqVar2.x = true;
        view.setBackground(eqVar2);
    }

    public final void o0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            gh.b[] bVarArr = this.q0;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].f(i11 == i10, z10);
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        xa.n nVar = this.F0;
        if (nVar != null) {
            nVar.a();
            this.F0 = null;
        }
        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar2 = new xa.n(notificationCenter, this);
        nVar2.e(org.telegram.messenger.zs.D);
        nVar2.e(org.telegram.messenger.zs.T);
        nVar2.e(org.telegram.messenger.zs.V2);
        nVar2.e(org.telegram.messenger.zs.x5);
        this.F0 = nVar2;
        th.e5 O1 = getMessagesController().O1();
        long j10 = this.b;
        th.x4 A = O1.A(2, -1, -j10, true);
        this.C0 = A;
        if (A != null) {
            this.D0 = A.o();
        }
        if (this.a != null) {
            k0();
        } else {
            org.telegram.messenger.vp.r1(this.currentAccount).T2(this.classGuid, j10, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        xa.n nVar = this.F0;
        if (nVar != null) {
            nVar.a();
            this.F0 = null;
        }
        org.telegram.ui.ActionBar.x1[] x1VarArr = this.g0;
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            x1Var.dismiss();
            x1VarArr[0] = null;
        }
        th.x4 x4Var = this.C0;
        if (x4Var != null) {
            x4Var.z(this.D0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        e0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.sn snVar = this.R;
            if (snVar != null) {
                snVar.i(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Cj, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dj, false));
            }
            r0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0(boolean z10, float f7) {
        for (int i10 = 0; i10 < this.q0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            gh.b bVar = this.q0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.o0.invalidate();
    }

    public final void q0() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        arrayList.addAll(this.v0);
        arrayList.addAll(this.x0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.messenger.uk(4))));
    }

    public final void r0() {
        u51 u51Var = this.S;
        if (u51Var != null) {
            int childCount = u51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                n0(this.S.getChildAt(i10));
            }
            int hiddenChildCount = this.S.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                n0(this.S.V(i11));
            }
            int cachedChildCount = this.S.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                n0(this.S.P(i12));
            }
            int attachedScrapChildCount = this.S.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                n0(this.S.O(i13));
            }
            this.S.getRecycledViewPool().a();
        }
        bg.h hVar = this.Z;
        if (hVar != null) {
            hVar.c = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0() {
        boolean z10;
        float f7;
        if (this.k0 == null || this.l0 == null) {
            return;
        }
        le leVar = this.j0;
        if (leVar != null && leVar.getParent() == this.h0) {
            le leVar2 = this.j0;
            if (leVar2.getVisibility() == 0 && leVar2.Y0.getVisibility() != 0) {
                z10 = true;
                if (z10) {
                    f7 = 0.0f;
                } else {
                    float x10 = this.j0.getX();
                    float width = this.j0.getWidth();
                    f7 = width > 0.0f ? Math.max(0.0f, Math.min(this.h0.getWidth(), x10 + width) - Math.max(0.0f, x10)) / width : 0.0f;
                    this.l0.setTranslationX(this.h0.getX() + x10);
                    this.l0.setTranslationY(this.j0.getY() + this.h0.getY());
                }
                this.l0.setVisibility((z10 || f7 <= 0.0f) ? 4 : 0);
                fe.b bVar = this.m0;
                this.k0.setTranslationY((-(1.0f - ((bVar != null ? bVar.e : 0.0f) * f7))) * org.telegram.messenger.i0.L(44.0f));
            }
        }
        z10 = false;
        if (z10) {
        }
        this.l0.setVisibility((z10 || f7 <= 0.0f) ? 4 : 0);
        fe.b bVar2 = this.m0;
        this.k0.setTranslationY((-(1.0f - ((bVar2 != null ? bVar2.e : 0.0f) * f7))) * org.telegram.messenger.i0.L(44.0f));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
