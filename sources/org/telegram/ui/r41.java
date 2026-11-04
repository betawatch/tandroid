package org.telegram.ui;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r41 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public boolean A0;
    public boolean B0;
    public e41 C0;
    public ei.r6 D0;
    public d41 E;
    public int E0;
    public d41 F;
    public final o4 F0;
    public d41 G;
    public za.p G0;
    public n41 H;
    public PorterDuffColorFilter H0;
    public d41 I;
    public int I0;
    public d41 J;
    public d41 K;
    public d41 L;
    public d41 M;
    public d41 N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public org.telegram.ui.Components.jn S;
    public r31 T;
    public u4.b0 U;
    public final g2.k0 V;
    public org.telegram.ui.Components.fh0 W;
    public w31 X;
    public s31 Y;
    public q41 Z;
    public TLRPC.ChatFull a;
    public mg.f a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public d41 d;
    public final boolean d0;
    public d41 e;
    public final boolean e0;
    public m41 f;
    public long f0;
    public long g0;
    public d41 h;
    public final org.telegram.ui.ActionBar.s1[] h0;
    public p31 i0;
    public rb j0;
    public xd k0;
    public View l0;
    public FrameLayout m0;
    public d41 n;
    public qe.a n0;
    public final boolean o0;
    public ge0 p0;
    public FrameLayout q0;
    public d41 r;
    public rh.b[] r0;
    public d41 s;
    public int s0;
    public final SparseIntArray t0;
    public final SparseIntArray u0;
    public final ArrayList v0;
    public d41 w;
    public final ArrayList w0;
    public d41 x;
    public final ArrayList x0;
    public d41 y;
    public final ArrayList y0;
    public final ArrayList z0;

    public r41(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new g2.k0(50, 3);
        this.h0 = new org.telegram.ui.ActionBar.s1[1];
        this.s0 = -1;
        this.t0 = new SparseIntArray();
        this.u0 = new SparseIntArray();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new o4(this, 15);
        long j10 = bundle.getLong("chat_id");
        this.b = j10;
        this.c0 = bundle.getBoolean("is_megagroup", false);
        this.d0 = bundle.getBoolean("start_from_boosts", false);
        this.e0 = bundle.getBoolean("start_from_monetization", false);
        this.o0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().N0(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v53 */
    public static void Z(final r41 r41Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        String str4;
        ?? r15;
        ArrayList arrayList3;
        int i3;
        String str5;
        ArrayList arrayList4;
        String str6;
        ArrayList arrayList5 = r41Var.O;
        ArrayList arrayList6 = r41Var.P;
        ArrayList arrayList7 = r41Var.v0;
        String str7 = "%";
        int i10 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final d41[] d41VarArr = {i0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.bd.M0(2131749281, "IVInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.followers_graph, org.telegram.messenger.bd.M0(2131750611, "FollowersChartTitle"), 0, false), i0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.bd.M0(2131744043, "TopHoursChartTitle"), 0, false), i0(tL_broadcastStats.interactions_graph, org.telegram.messenger.bd.M0(2131743540, "ViewsAndSharesChartTitle"), 1, false), i0(tL_broadcastStats.growth_graph, org.telegram.messenger.bd.M0(2131749383, "GrowthChartTitle"), 0, false), i0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.bd.M0(2131743539, "ViewsBySourceChartTitle"), 2, false), i0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.bd.M0(2131748282, "NewFollowersBySourceChartTitle"), 2, false), i0(tL_broadcastStats.languages_graph, org.telegram.messenger.bd.M0(2131749049, "LanguagesChartTitle"), 4, true), i0(tL_broadcastStats.mute_graph, org.telegram.messenger.bd.M0(2131747928, "NotificationsChartTitle"), 0, false), i0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.bd.M0(2131746393, "ReactionsByEmotionChartTitle"), 2, false), i0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.bd.M0(2131744669, "StoryInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.bd.M0(2131744514, "StoryReactionsByEmotionChartTitle"), 2, false)};
            d41 d41Var = d41VarArr[2];
            if (d41Var != null) {
                d41Var.n = true;
            }
            m41 m41Var = new m41();
            za.p a10 = m41.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            m41Var.o = org.telegram.messenger.bd.M0(2131746386, "ReactionsPerPost");
            m41Var.p = (String) a10.a;
            m41Var.q = (String) a10.d;
            m41Var.r = ((Boolean) a10.b).booleanValue();
            m41Var.s = ((Boolean) a10.c).booleanValue();
            za.p a11 = m41.a(tL_broadcastStats.reactions_per_story);
            m41Var.t = org.telegram.messenger.bd.M0(2131746385, "ReactionsPerStory");
            m41Var.u = (String) a11.a;
            m41Var.v = (String) a11.d;
            m41Var.w = ((Boolean) a11.b).booleanValue();
            m41Var.x = ((Boolean) a11.c).booleanValue();
            za.p a12 = m41.a(tL_broadcastStats.views_per_story);
            m41Var.y = org.telegram.messenger.bd.M0(2131743537, "ViewsPerStory");
            m41Var.z = (String) a12.a;
            m41Var.A = (String) a12.d;
            m41Var.B = ((Boolean) a12.b).booleanValue();
            m41Var.C = ((Boolean) a12.c).booleanValue();
            za.p a13 = m41.a(tL_broadcastStats.shares_per_story);
            m41Var.D = org.telegram.messenger.bd.M0(2131745407, "SharesPerStory");
            m41Var.E = (String) a13.a;
            m41Var.F = (String) a13.d;
            m41Var.G = ((Boolean) a13.b).booleanValue();
            m41Var.H = ((Boolean) a13.c).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str8 = "GrowthChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i11 = (int) (d - d10);
            float abs = d10 == 0.0d ? 0.0f : Math.abs((i11 / ((float) d10)) * 100.0f);
            m41Var.a = org.telegram.messenger.bd.M0(2131750611, "FollowersChartTitle");
            m41Var.b = org.telegram.messenger.g0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs == 0.0f) {
                i3 = i11;
                m41Var.c = "";
            } else {
                int i12 = (int) abs;
                if (abs == i12) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11 > 0 ? str4 : "");
                    sb2.append(org.telegram.messenger.g0.o0(i11, 0));
                    m41Var.c = sb2.toString() + " (" + i12 + "%)";
                    i3 = i11;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i11 > 0 ? str4 : "");
                    sb3.append(org.telegram.messenger.g0.o0(i11, 0));
                    i3 = i11;
                    m41Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            m41Var.d = i3 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i13 = (int) (d11 - d12);
            float abs2 = d12 == 0.0d ? 0.0f : Math.abs((i13 / ((float) d12)) * 100.0f);
            m41Var.i = org.telegram.messenger.bd.M0(2131745408, "SharesPerPost");
            m41Var.j = org.telegram.messenger.g0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i13 == 0 || abs2 == 0.0f) {
                m41Var.k = "";
            } else {
                int i14 = (int) abs2;
                if (abs2 == i14) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i13 > 0 ? str4 : "");
                    sb4.append(org.telegram.messenger.g0.o0(i13, 0));
                    m41Var.k = sb4.toString() + " (" + i14 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i13 > 0 ? str4 : "");
                    sb5.append(org.telegram.messenger.g0.o0(i13, 0));
                    m41Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            m41Var.l = i13 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d13 - d14);
            float abs3 = d14 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d14)) * 100.0f);
            m41Var.e = org.telegram.messenger.bd.M0(2131743538, "ViewsPerPost");
            m41Var.f = org.telegram.messenger.g0.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i15 == 0 || abs3 == 0.0f) {
                m41Var.g = "";
            } else {
                int i16 = (int) abs3;
                if (abs3 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i15 > 0 ? str4 : "");
                    sb6.append(org.telegram.messenger.g0.o0(i15, 0));
                    m41Var.g = sb6.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i15 > 0 ? str4 : "");
                    sb7.append(org.telegram.messenger.g0.o0(i15, 0));
                    m41Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            m41Var.h = i15 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            m41Var.m = org.telegram.messenger.bd.M0(2131751144, "EnabledNotifications");
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                m41Var.n = com.google.android.recaptcha.internal.a.h(i17, "%");
            } else {
                m41Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            r41Var.f = m41Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            r41Var.f0 = tL_statsDateRangeDays.max_date * 1000;
            r41Var.g0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i20 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i20);
                i20++;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                o41 o41Var = new o41();
                o41Var.a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(o41Var);
                    str5 = str8;
                    str6 = str7;
                    r41Var.t0.put(o41Var.b(), i18);
                    i18++;
                } else {
                    str5 = str8;
                    arrayList4 = arrayList8;
                    str6 = str7;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(o41Var.b()));
                    r41Var.x0.add(o41Var);
                    r41Var.u0.put(o41Var.b(), i19);
                    i19++;
                }
                arrayList10 = arrayList11;
                str8 = str5;
                str7 = str6;
                arrayList8 = arrayList4;
                size = i21;
            }
            str3 = str8;
            ArrayList arrayList12 = arrayList8;
            str2 = str7;
            org.telegram.messenger.g0.h3(new l31(r41Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((o41) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.qr messagesStorage = r41Var.getMessagesStorage();
                long j10 = -r41Var.b;
                int i22 = r41Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.a.c(new org.telegram.messenger.np(messagesStorage, org.telegram.messenger.sz.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, j10, 0L, size2, b10, 0, 0, i22, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            org.telegram.messenger.g0.h3(new Runnable(r41Var) { // from class: org.telegram.ui.m31
                public final /* synthetic */ r41 b;

                {
                    this.b = r41Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (objArr) {
                        case 0:
                            r41 r41Var2 = this.b;
                            r41Var2.getClass();
                            d41[] d41VarArr2 = d41VarArr;
                            r41Var2.r = d41VarArr2[0];
                            r41Var2.h = d41VarArr2[1];
                            r41Var2.e = d41VarArr2[2];
                            r41Var2.n = d41VarArr2[3];
                            r41Var2.d = d41VarArr2[4];
                            r41Var2.s = d41VarArr2[5];
                            r41Var2.w = d41VarArr2[6];
                            r41Var2.x = d41VarArr2[7];
                            r41Var2.y = d41VarArr2[8];
                            r41Var2.E = d41VarArr2[9];
                            r41Var2.F = d41VarArr2[10];
                            r41Var2.G = d41VarArr2[11];
                            r41Var2.j0(d41VarArr2);
                            break;
                        default:
                            r41 r41Var3 = this.b;
                            r41Var3.getClass();
                            d41[] d41VarArr3 = d41VarArr;
                            r41Var3.d = d41VarArr3[0];
                            r41Var3.I = d41VarArr3[1];
                            r41Var3.J = d41VarArr3[2];
                            r41Var3.K = d41VarArr3[3];
                            r41Var3.L = d41VarArr3[4];
                            r41Var3.M = d41VarArr3[5];
                            r41Var3.e = d41VarArr3[6];
                            r41Var3.N = d41VarArr3[7];
                            r41Var3.j0(d41VarArr3);
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
            d41 i02 = i0(tL_megagroupStats.growth_graph, org.telegram.messenger.bd.M0(2131749383, str3), r15, r15);
            d41 i03 = i0(tL_megagroupStats.members_graph, org.telegram.messenger.bd.M0(2131749435, "GroupMembersChartTitle"), r15, r15);
            d41 i04 = i0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.bd.M0(2131748279, "NewMembersBySourceChartTitle"), 2, r15);
            d41 i05 = i0(tL_megagroupStats.languages_graph, org.telegram.messenger.bd.M0(2131748626, "MembersLanguageChartTitle"), 4, true);
            d41 i06 = i0(tL_megagroupStats.messages_graph, org.telegram.messenger.bd.M0(2131748470, "MessagesChartTitle"), 2, r15);
            d41 i07 = i0(tL_megagroupStats.actions_graph, org.telegram.messenger.bd.M0(2131754489, "ActionsChartTitle"), 1, r15);
            d41 i08 = i0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.bd.M0(2131744043, str), r15, r15);
            d41 i09 = i0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.bd.M0(2131744044, "TopDaysOfWeekChartTitle"), 4, r15);
            final d41[] d41VarArr2 = new d41[8];
            d41VarArr2[r15] = i02;
            d41VarArr2[1] = i03;
            d41VarArr2[2] = i04;
            d41VarArr2[3] = i05;
            d41VarArr2[4] = i06;
            d41VarArr2[5] = i07;
            d41VarArr2[6] = i08;
            d41VarArr2[7] = i09;
            d41 d41Var2 = d41VarArr2[6];
            if (d41Var2 != null) {
                d41Var2.n = true;
            }
            d41 d41Var3 = d41VarArr2[7];
            if (d41Var3 != null) {
                d41Var3.o = true;
            }
            n41 n41Var = new n41();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i23 = (int) (d15 - d16);
            float abs4 = d16 == 0.0d ? 0.0f : Math.abs((i23 / ((float) d16)) * 100.0f);
            n41Var.a = org.telegram.messenger.bd.M0(2131748625, "MembersOverviewTitle");
            n41Var.b = org.telegram.messenger.g0.o0((int) tL_megagroupStats.members.current, 0);
            if (i23 == 0 || abs4 == 0.0f) {
                n41Var.c = "";
            } else {
                int i24 = (int) abs4;
                if (abs4 == i24) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i23 > 0 ? str4 : "");
                    sb8.append(org.telegram.messenger.g0.o0(i23, 0));
                    n41Var.c = sb8.toString() + " (" + i24 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i23 > 0 ? str4 : "");
                    sb9.append(org.telegram.messenger.g0.o0(i23, 0));
                    n41Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str2);
                }
            }
            n41Var.d = i23 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i25 = (int) (d17 - d18);
            float abs5 = d18 == 0.0d ? 0.0f : Math.abs((i25 / ((float) d18)) * 100.0f);
            n41Var.i = org.telegram.messenger.bd.M0(2131743542, "ViewingMembers");
            n41Var.j = org.telegram.messenger.g0.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i25 == 0 || abs5 == 0.0f) {
                n41Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i25 > 0 ? str4 : "");
                sb10.append(org.telegram.messenger.g0.o0(i25, 0));
                n41Var.k = sb10.toString();
            }
            n41Var.l = i25 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d19 - d20);
            float abs6 = d20 == 0.0d ? 0.0f : Math.abs((i26 / ((float) d20)) * 100.0f);
            n41Var.m = org.telegram.messenger.bd.M0(2131747075, "PostingMembers");
            n41Var.n = org.telegram.messenger.g0.o0((int) tL_megagroupStats.posters.current, 0);
            if (i26 == 0 || abs6 == 0.0f) {
                n41Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i26 > 0 ? str4 : "");
                sb11.append(org.telegram.messenger.g0.o0(i26, 0));
                n41Var.o = sb11.toString();
            }
            n41Var.p = i26 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d21 - d22);
            float abs7 = d22 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d22)) * 100.0f);
            n41Var.e = org.telegram.messenger.bd.M0(2131748461, "MessagesOverview");
            n41Var.f = org.telegram.messenger.g0.o0((int) tL_megagroupStats.messages.current, 0);
            if (i27 == 0 || abs7 == 0.0f) {
                n41Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i27 > 0 ? str4 : "");
                sb12.append(org.telegram.messenger.g0.o0(i27, 0));
                n41Var.g = sb12.toString();
            }
            n41Var.h = i27 >= 0;
            r41Var.H = n41Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            r41Var.f0 = tL_statsDateRangeDays2.max_date * 1000;
            r41Var.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    k41 k41Var = new k41();
                    k41Var.a = k41.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb13.append(org.telegram.messenger.bd.G(i29, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.bd.a0("CharactersPerMessage", null, 2131752254, org.telegram.messenger.bd.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    k41Var.b = sb13.toString();
                    int i30 = i10;
                    if (arrayList2.size() < i30) {
                        arrayList3 = arrayList2;
                        arrayList3.add(k41Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(k41Var);
                    i28++;
                    arrayList2 = arrayList3;
                    i10 = i30;
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
                for (int i31 = 0; i31 < tL_megagroupStats.top_admins.size(); i31++) {
                    ArrayList arrayList19 = r41Var.R;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    k41 k41Var2 = new k41();
                    k41Var2.a = k41.a(arrayList20, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb14 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb14.append(org.telegram.messenger.bd.G(i32, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.bd.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.bd.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    k41Var2.b = sb14.toString();
                    arrayList19.add(k41Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = r41Var.Q;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    k41 k41Var3 = new k41();
                    k41Var3.a = k41.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        k41Var3.b = org.telegram.messenger.bd.G(i34, "Invitations", new Object[0]);
                    } else {
                        k41Var3.b = "";
                    }
                    arrayList22.add(k41Var3);
                }
            }
            final int i35 = 1;
            org.telegram.messenger.g0.h3(new Runnable(r41Var) { // from class: org.telegram.ui.m31
                public final /* synthetic */ r41 b;

                {
                    this.b = r41Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i35) {
                        case 0:
                            r41 r41Var2 = this.b;
                            r41Var2.getClass();
                            d41[] d41VarArr22 = d41VarArr2;
                            r41Var2.r = d41VarArr22[0];
                            r41Var2.h = d41VarArr22[1];
                            r41Var2.e = d41VarArr22[2];
                            r41Var2.n = d41VarArr22[3];
                            r41Var2.d = d41VarArr22[4];
                            r41Var2.s = d41VarArr22[5];
                            r41Var2.w = d41VarArr22[6];
                            r41Var2.x = d41VarArr22[7];
                            r41Var2.y = d41VarArr22[8];
                            r41Var2.E = d41VarArr22[9];
                            r41Var2.F = d41VarArr22[10];
                            r41Var2.G = d41VarArr22[11];
                            r41Var2.j0(d41VarArr22);
                            break;
                        default:
                            r41 r41Var3 = this.b;
                            r41Var3.getClass();
                            d41[] d41VarArr3 = d41VarArr2;
                            r41Var3.d = d41VarArr3[0];
                            r41Var3.I = d41VarArr3[1];
                            r41Var3.J = d41VarArr3[2];
                            r41Var3.K = d41VarArr3[3];
                            r41Var3.L = d41VarArr3[4];
                            r41Var3.M = d41VarArr3[5];
                            r41Var3.e = d41VarArr3[6];
                            r41Var3.N = d41VarArr3[7];
                            r41Var3.j0(d41VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void a0(r41 r41Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                arrayList.add(new org.telegram.messenger.zi(r41Var.currentAccount, arrayList2.get(i3), false, true));
            }
            r41Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.g0.h3(new l31(r41Var, arrayList, 1));
    }

    public static void c0(r41 r41Var) {
        q41 q41Var = r41Var.Z;
        if (q41Var != null) {
            q41Var.b = true;
        }
        int childCount = r41Var.T.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = r41Var.T.getChildAt(i3);
            if (childAt instanceof c41) {
                ((c41) childAt).b.u0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.d2 g0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).N0(chat.id);
        return (N0 == null || !(N0.can_view_stats || N0.can_view_stars_revenue)) ? new v5(-chat.id) : new r41(bundle);
    }

    public static ng.b h0(JSONObject jSONObject, int i3, boolean z10) {
        if (i3 == 0) {
            return new ng.b(jSONObject);
        }
        if (i3 == 1) {
            return new ng.c(jSONObject);
        }
        if (i3 == 2) {
            ng.d dVar = new ng.d(jSONObject);
            int length = ((ng.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                dVar.l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = dVar.l;
                    jArr[i10] = jArr[i10] + ((ng.a) dVar.d.get(i11)).a[i10];
                }
            }
            dVar.m = new m2.t(dVar.l);
            return dVar;
        }
        if (i3 != 4) {
            return null;
        }
        ng.e eVar = new ng.e(jSONObject);
        if (z10) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j10 = 0;
            for (int i12 = 0; i12 < eVar.d.size(); i12++) {
                int length2 = eVar.a.length;
                for (int i13 = 0; i13 < length2; i13++) {
                    long j11 = ((ng.a) eVar.d.get(i12)).a[i13];
                    jArr2[i12] = jArr2[i12] + j11;
                    if (j11 == 0) {
                        iArr[i12] = iArr[i12] + 1;
                    }
                }
                j10 += jArr2[i12];
            }
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < eVar.d.size(); i14++) {
                if (jArr2[i14] / j10 < 0.01d && iArr[i14] > eVar.a.length / 2.0f) {
                    arrayList.add((ng.a) eVar.d.get(i14));
                }
            }
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList.get(i15);
                i15++;
                eVar.d.remove((ng.a) obj);
            }
        }
        int length3 = ((ng.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i16 = 0; i16 < length3; i16++) {
            eVar.l[i16] = 0;
            for (int i17 = 0; i17 < size3; i17++) {
                long[] jArr3 = eVar.l;
                jArr3[i16] = jArr3[i16] + ((ng.a) eVar.d.get(i17)).a[i16];
            }
        }
        new m2.t(eVar.l);
        return eVar;
    }

    public static d41 i0(TL_stats.StatsGraph statsGraph, String str, int i3, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        d41 d41Var = new d41(str, i3);
        d41Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                ng.b h02 = h0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i3, z10);
                d41Var.d = h02;
                if (h02 != null) {
                    h02.h = statsGraph.rate;
                }
                d41Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (h02 == null || (jArr2 = h02.a) == null || jArr2.length < 2) {
                    d41Var.l = true;
                }
                if (i3 == 4 && h02 != null && (jArr = h02.a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    d41Var.e = new ng.e(h02, j10);
                    d41Var.c = j10;
                    return d41Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            d41Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return d41Var;
    }

    public static void n0(d41 d41Var, ArrayList arrayList, org.telegram.ui.ActionBar.s6 s6Var) {
        ng.b bVar;
        if (d41Var == null || (bVar = d41Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ng.a aVar = (ng.a) obj;
            int i10 = aVar.g;
            if (i10 >= 0) {
                if (!org.telegram.ui.ActionBar.k6.f1(i10)) {
                    org.telegram.ui.ActionBar.k6.A1(aVar.g, org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.k6.em[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, aVar.g));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i3;
        r41 r41Var = this;
        int i10 = 1;
        r41Var.setHasOwnBackground(true);
        r41Var.a0 = new mg.f((org.telegram.ui.ActionBar.e6) null);
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(r41Var.currentAccount);
        long j10 = r41Var.b;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(j10));
        TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(r41Var.currentAccount).N0(j10);
        boolean z10 = N0 != null && N0.can_view_stats;
        boolean R = org.telegram.messenger.t3.R(M0);
        boolean z11 = N0 != null && (N0.can_view_revenue || N0.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(rh.b.c(context, r41Var.resourceProvider, rh.a.J, 2131744902));
        }
        arrayList.add(rh.b.c(context, r41Var.resourceProvider, rh.a.P, 2131753163));
        if (z11) {
            arrayList.add(rh.b.c(context, r41Var.resourceProvider, rh.a.Q, 2131748415));
        }
        r41Var.r0 = (rh.b[]) arrayList.toArray(new rh.b[0]);
        ge0 ge0Var = new ge0(context, r41Var.resourceProvider);
        r41Var.p0 = ge0Var;
        ge0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        r41Var.p0.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        r41Var.p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        r41Var.q0 = frameLayout2;
        frameLayout2.setOnClickListener(new ai.t(25));
        r41Var.q0.addView(r41Var.p0, b8.mf.e(-1, 72, 81));
        r41Var.q0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            rh.b[] bVarArr = r41Var.r0;
            if (i11 >= bVarArr.length) {
                break;
            }
            rh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new fu0(r41Var, i11, i10));
            r41Var.p0.addView(r41Var.r0[i11]);
            r41Var.p0.i(bVar, true, false);
            i11++;
        }
        r41Var.i0 = new p31(r41Var, r41Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            rb rbVar = new rb(r41Var, -j10, r41Var.getResourceProvider());
            r41Var.j0 = rbVar;
            rbVar.G.setCaptureSectionsDecoratorAllowed(true);
            r41Var.glassEngine.b(r41Var.j0.G);
        }
        if (z11) {
            frameLayout = frameLayout3;
            i3 = -1;
            xd xdVar = new xd(r41Var.getParentActivity(), r41Var, r41Var.currentAccount, -j10, r41Var.getResourceProvider(), r41Var.glassEngine, org.telegram.messenger.t3.V(M0) && N0.can_view_revenue, N0.can_view_stars_revenue);
            r41Var = r41Var;
            r41Var.k0 = xdVar;
            xdVar.Y0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i3 = -1;
        }
        boolean z12 = z10;
        FrameLayout frameLayout4 = frameLayout;
        r41Var.i0.setAdapter(new q31(r41Var, z12, R, z11, frameLayout4));
        boolean z13 = r41Var.o0;
        boolean z14 = R && !z13;
        r41Var.c = z14;
        if (z14 && r41Var.d0) {
            r41Var.i0.setPosition(z12 ? 1 : 0);
        } else if (z14 && r41Var.e0) {
            r41Var.i0.setPosition(((z13 || !R) ? 0 : 1) + (z12 ? 1 : 0));
        }
        r41Var.p0(r41Var.i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(r41Var.getParentActivity());
        frameLayout5.addView(r41Var.i0, b8.mf.g());
        View view = new View(context);
        r41Var.l0 = view;
        frameLayout5.addView(view, b8.mf.e(i3, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        r41Var.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(r41Var.m0, b8.mf.g());
        frameLayout5.addView(r41Var.simpleActionBar);
        int i12 = 13;
        if (r41Var.c) {
            r41Var.setBulletinDelegate(new ai.y(i12));
            r41Var.q0.setBackground(r41Var.getBaseSimpleGlass().b(r41Var.q0));
            frameLayout5.addView(r41Var.q0, b8.mf.e(i3, -2, 80));
        }
        r41Var.fragmentView = frameLayout5;
        r31 r31Var = new r31(r41Var, context);
        r41Var.T = r31Var;
        r31Var.setCaptureSectionsDecoratorAllowed(true);
        r41Var.T.setSections(true);
        r41Var.T.setClipToPadding(false);
        r41Var.glassEngine.b(r41Var.T);
        r41Var.T.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        r41Var.b0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        r41Var.W = fh0Var;
        fh0Var.setAutoRepeat(true);
        r41Var.W.f(R.raw.statistic_preload, 120, 120, null);
        r41Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.bd.M0(2131748785, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.V(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.bd.M0(2131748784, null));
        textView2.setGravity(1);
        r41Var.b0.addView(r41Var.W, b8.mf.t(120, 120, 1, 0, 0, 0, 20));
        r41Var.b0.addView(textView, b8.mf.t(-2, -2, 1, 0, 0, 0, 10));
        r41Var.b0.addView(textView2, b8.mf.r(-2, -2, 1));
        frameLayout4.addView(r41Var.b0, b8.mf.d(org.telegram.messenger.hs.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (r41Var.X == null) {
            r41Var.X = new w31(r41Var);
        }
        r41Var.T.setAdapter(r41Var.X);
        u4.b0 b0Var = new u4.b0();
        r41Var.U = b0Var;
        r41Var.T.setLayoutManager(b0Var);
        r41Var.Y = new s31();
        r41Var.T.setItemAnimator(null);
        int i15 = 2;
        r41Var.T.j(new r11(r41Var, i15));
        r41Var.T.setOnItemClickListener(new nx0(r41Var, 6));
        r41Var.T.setOnItemLongClickListener(new o31(r41Var));
        frameLayout4.addView(r41Var.T);
        r41Var.S = new org.telegram.ui.Components.jn(context, null, false, null);
        TLRPC.Chat M02 = r41Var.getMessagesController().M0(Long.valueOf(j10));
        r41Var.S.setChatAvatar(M02);
        r41Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        r41Var.simpleActionBar.setTitle(M02 == null ? "" : M02.title);
        r41Var.simpleActionBar.setActionBarMenuOnItemClick(new vs0(r41Var, 13));
        r41Var.S.i(org.telegram.ui.ActionBar.k6.x0(null, i13, false), org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        boolean z15 = r41Var.B0;
        o4 o4Var = r41Var.F0;
        if (z15) {
            r41Var.b0.setAlpha(0.0f);
            org.telegram.messenger.g0.i3(o4Var, 500L);
            r41Var.b0.setVisibility(0);
            r41Var.T.setVisibility(8);
        } else {
            org.telegram.messenger.g0.r(o4Var);
            r41Var.b0.setVisibility(8);
            r41Var.T.setVisibility(0);
        }
        gh.g c2 = r41Var.getBaseSimpleGlass().c.c(r41Var.p0, b8.cd.f(r41Var.resourceProvider), false);
        org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(28.0f), 7.666f);
        r41Var.p0.setBackground(c2);
        r41Var.glassEngine.c(r41Var.i0);
        pi.a baseSimpleGlass = r41Var.getBaseSimpleGlass();
        p31 p31Var = r41Var.i0;
        org.telegram.ui.ActionBar.y4 y4Var = r41Var.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = r41Var.resourceProvider;
        baseSimpleGlass.l = frameLayout5;
        baseSimpleGlass.m = p31Var;
        baseSimpleGlass.a.c(p31Var);
        baseSimpleGlass.g(frameLayout5, y4Var, e6Var);
        r41Var.n0 = new qe.a(0, new o31(r41Var), org.telegram.ui.Components.xq.h, 380L, false);
        xd xdVar2 = r41Var.k0;
        if (xdVar2 != null) {
            pi.a baseSimpleGlass2 = r41Var.getBaseSimpleGlass();
            View view2 = xdVar2.b1.d;
            gh.g c10 = baseSimpleGlass2.c.c(view2, null, false);
            c10.p(b8.cd.m(xdVar2.o0));
            c10.q(org.telegram.messenger.g0.L(9.66f));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            view2.setBackground(c10);
            View transactionTabs = r41Var.k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.g0.E2(transactionTabs);
            r41Var.m0.addView(transactionTabs, layoutParams);
            r41Var.k0.setTabsPinnedChangedListener(new pu0(r41Var, 19));
            r41Var.n0.a(r41Var.k0.f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new bk(r41Var, i15));
        r41Var.getBaseSimpleGlass().n = new ru(r41Var, frameLayout5, new b6(i10, frameLayout5), i10);
        r41Var.getBaseSimpleGlass().m = null;
        r41Var.simpleActionBar.setBackground(null);
        r41Var.l0.setBackground(r41Var.getBaseSimpleGlass().a(r41Var.l0));
        org.telegram.messenger.g0.E2(r41Var.S.e);
        frameLayout5.addView(r41Var.S.e, b8.mf.e(42, 42, 53));
        r41Var.f0();
        r41Var.fragmentView.setBackgroundColor(r41Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        r41Var.C0 = new e41(r41Var.X, r41Var.U);
        return r41Var.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i3 == org.telegram.messenger.hs.x5) {
            if (((ei.r6) objArr[0]) == this.D0) {
                m0();
                r0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.f();
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.V2) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.d2 d2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.d2) t4.c.d(2, fragmentStack) : null;
            if (d2Var instanceof ln) {
                ((ActionBarLayout) getParentLayout()).d0(d2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.d2 d2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.d2) t4.c.d(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (d2Var2 instanceof ProfileActivity) {
                    xg.j.f(d2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.d2) t4.c.d(3, fragmentStack2) : null;
            if (d2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).d0(d2Var2, false);
            }
            finishFragment();
            if (d2Var3 instanceof wm) {
                xg.j.f(d2Var3, chat, true);
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.D) {
            if (i3 == org.telegram.messenger.hs.T) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.b && this.a == null) {
                    this.a = chatFull;
                    l0();
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
            int i12 = 0;
            while (true) {
                arrayList = this.v0;
                if (i12 >= size) {
                    break;
                }
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i12);
                int i13 = this.t0.get(ziVar.f1(), -1);
                if (i13 >= 0 && ((o41) arrayList.get(i13)).b() == ziVar.f1()) {
                    if (ziVar.Z) {
                        arrayList3.add((o41) arrayList.get(i13));
                    } else {
                        ((o41) arrayList.get(i13)).b = ziVar;
                    }
                }
                i12++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.w0;
            arrayList4.clear();
            int size2 = arrayList.size();
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                o41 o41Var = (o41) arrayList.get(i11);
                if (o41Var.b == null) {
                    this.s0 = o41Var.b();
                    break;
                } else {
                    arrayList4.add(o41Var);
                    i11++;
                }
            }
            if (arrayList4.size() < 20) {
                k0();
            }
            r0();
            if (this.X != null) {
                this.T.setItemAnimator(null);
                this.C0.f();
            }
        }
    }

    public final void f0() {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.l0 != null) {
            int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
            ViewGroup.LayoutParams layoutParams = this.l0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.l0.setLayoutParams(layoutParams);
            }
            t0();
        }
        int L2 = this.c ? org.telegram.messenger.g0.L(72.0f) : 0;
        org.telegram.messenger.g0.B3(this.S.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
        this.q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        r31 r31Var = this.T;
        if (r31Var != null) {
            i0.b bVar = this.mSystemInsets;
            pi.a.e(r31Var, bVar.b, bVar.d, currentActionBarHeight, L2);
        }
        rb rbVar = this.j0;
        if (rbVar != null) {
            org.telegram.ui.Components.tj0 tj0Var = rbVar.G;
            i0.b bVar2 = this.mSystemInsets;
            pi.a.e(tj0Var, bVar2.b, bVar2.d, currentActionBarHeight, L2);
        }
        xd xdVar = this.k0;
        if (xdVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i3 = bVar3.b;
            int i10 = bVar3.d;
            xdVar.V0 = i3;
            xdVar.W0 = i10;
            xdVar.X0 = L2;
            int C = org.telegram.messenger.camera.q.C(48.0f, i3, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.camera.q.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.l41 l41Var = xdVar.Y0;
            org.telegram.messenger.g0.B3(l41Var, 0, C, 0, C2);
            l41Var.setPadding(l41Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3) - C, l41Var.getPaddingRight(), (i10 + L2) - C2);
            xdVar.z(-C, -C2);
            xdVar.B();
            xdVar.requestLayout();
            xdVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        h6 h6Var = new h6(21, this);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 0, new Class[]{og.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        if (this.c0) {
            while (i3 < 6) {
                n0(i3 == 0 ? this.d : i3 == 1 ? this.I : i3 == 2 ? this.J : i3 == 3 ? this.K : i3 == 4 ? this.L : this.M, arrayList, h6Var);
                i3++;
            }
        } else {
            while (i3 < 12) {
                n0(i3 == 0 ? this.d : i3 == 1 ? this.h : i3 == 2 ? this.n : i3 == 3 ? this.r : i3 == 4 ? this.s : i3 == 5 ? this.w : i3 == 6 ? this.y : i3 == 7 ? this.e : i3 == 8 ? this.x : i3 == 9 ? this.E : i3 == 10 ? this.F : this.G, arrayList, h6Var);
                i3++;
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        p31 p31Var;
        if (motionEvent != null && this.k0 != null && (p31Var = this.i0) != null) {
            View currentView = p31Var.getCurrentView();
            xd xdVar = this.k0;
            if (currentView == xdVar && xdVar.G((motionEvent.getX() - this.i0.getX()) - this.k0.getX(), (motionEvent.getY() - this.i0.getY()) - this.k0.getY())) {
                return false;
            }
        }
        p31 p31Var2 = this.i0;
        if (p31Var2 == null || (p31Var2.b == 0 && p31Var2.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0(d41[] d41VarArr) {
        w31 w31Var = this.X;
        if (w31Var != null) {
            w31Var.E();
            this.T.setItemAnimator(null);
            this.X.f();
        }
        this.B0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        org.telegram.messenger.g0.r(this.F0);
        this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new y20(this, 28));
        this.T.setVisibility(0);
        this.T.setAlpha(0.0f);
        this.T.animate().alpha(1.0f).setDuration(230L).start();
        for (d41 d41Var : d41VarArr) {
            if (d41Var != null && d41Var.d == null && d41Var.f != null) {
                d41Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new ah(2, this, d41Var));
            }
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.v0;
        int size = arrayList.size();
        int i3 = 0;
        for (int i10 = this.t0.get(this.s0); i10 < size; i10++) {
            if (((o41) arrayList.get(i10)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((o41) arrayList.get(i10)).b()));
                i3++;
                if (i3 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.hp.s1(this.currentAccount).h1(this.b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new k31(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.o0) {
            return;
        }
        boolean z10 = this.c0;
        long j10 = this.b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.hp.s1(this.currentAccount).h1(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.hp.s1(this.currentAccount).h1(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new k31(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        ArrayList arrayList2 = this.x0;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            o41 o41Var = (o41) obj;
            org.telegram.messenger.zi f10 = this.D0.f(o41Var.b());
            if (f10 != null) {
                o41Var.b = f10;
                arrayList.add(o41Var);
            }
        }
        this.u0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof c41) {
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.x6) || this.T.b1()) {
            if (view instanceof og.c) {
                ((og.c) view).a();
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof org.telegram.ui.Components.xp) {
            org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) background;
            if ((xpVar.a instanceof ColorDrawable) && xpVar.b != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.b7, false);
                if (this.H0 == null || this.I0 != x02) {
                    this.I0 = x02;
                    this.H0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                }
                ((ColorDrawable) xpVar.a).setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
                xpVar.b.setColorFilter(this.H0);
                view.invalidate();
                return;
            }
        }
        org.telegram.ui.Components.xp xpVar2 = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false)), org.telegram.ui.ActionBar.k6.Y0(org.telegram.messenger.t0.b, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7), 0, 0);
        xpVar2.x = true;
        view.setBackground(xpVar2);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        za.p pVar = this.G0;
        if (pVar != null) {
            pVar.a();
            this.G0 = null;
        }
        org.telegram.messenger.hs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        za.p pVar2 = new za.p(notificationCenter, this);
        pVar2.b(org.telegram.messenger.hs.D);
        pVar2.b(org.telegram.messenger.hs.T);
        pVar2.b(org.telegram.messenger.hs.V2);
        pVar2.b(org.telegram.messenger.hs.x5);
        this.G0 = pVar2;
        ei.z6 P1 = getMessagesController().P1();
        long j10 = this.b;
        ei.r6 A = P1.A(2, -1, -j10, true);
        this.D0 = A;
        if (A != null) {
            this.E0 = A.o();
        }
        if (this.a != null) {
            l0();
        } else {
            org.telegram.messenger.hp.s1(this.currentAccount).V2(this.classGuid, j10, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        za.p pVar = this.G0;
        if (pVar != null) {
            pVar.a();
            this.G0 = null;
        }
        org.telegram.ui.ActionBar.s1[] s1VarArr = this.h0;
        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
        if (s1Var != null) {
            s1Var.dismiss();
            s1VarArr[0] = null;
        }
        ei.r6 r6Var = this.D0;
        if (r6Var != null) {
            r6Var.z(this.E0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        f0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.jn jnVar = this.S;
            if (jnVar != null) {
                jnVar.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Cj, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dj, false));
            }
            s0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(int i3, boolean z10) {
        int i10 = 0;
        while (true) {
            rh.b[] bVarArr = this.r0;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10].f(i10 == i3, z10);
            i10++;
        }
    }

    public final void q0(boolean z10, float f10) {
        for (int i3 = 0; i3 < this.r0.length; i3++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i3 - f10));
            rh.b bVar = this.r0[i3];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
        }
        this.p0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.z0;
        arrayList.clear();
        arrayList.addAll(this.w0);
        arrayList.addAll(this.y0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.messenger.ik(4))));
    }

    public final void s0() {
        r31 r31Var = this.T;
        if (r31Var != null) {
            int childCount = r31Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                o0(this.T.getChildAt(i3));
            }
            int hiddenChildCount = this.T.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                o0(this.T.V(i10));
            }
            int cachedChildCount = this.T.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                o0(this.T.P(i11));
            }
            int attachedScrapChildCount = this.T.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                o0(this.T.O(i12));
            }
            this.T.getRecycledViewPool().a();
        }
        mg.f fVar = this.a0;
        if (fVar != null) {
            fVar.c = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0() {
        boolean z10;
        float f10;
        if (this.l0 == null || this.m0 == null) {
            return;
        }
        xd xdVar = this.k0;
        if (xdVar != null && xdVar.getParent() == this.i0) {
            xd xdVar2 = this.k0;
            if (xdVar2.getVisibility() == 0 && xdVar2.Z0.getVisibility() != 0) {
                z10 = true;
                if (z10) {
                    f10 = 0.0f;
                } else {
                    float x10 = this.k0.getX();
                    float width = this.k0.getWidth();
                    f10 = width > 0.0f ? Math.max(0.0f, Math.min(this.i0.getWidth(), x10 + width) - Math.max(0.0f, x10)) / width : 0.0f;
                    this.m0.setTranslationX(this.i0.getX() + x10);
                    this.m0.setTranslationY(this.k0.getY() + this.i0.getY());
                }
                this.m0.setVisibility((z10 || f10 <= 0.0f) ? 4 : 0);
                qe.a aVar = this.n0;
                this.l0.setTranslationY((-(1.0f - ((aVar != null ? aVar.e : 0.0f) * f10))) * org.telegram.messenger.g0.L(44.0f));
            }
        }
        z10 = false;
        if (z10) {
        }
        this.m0.setVisibility((z10 || f10 <= 0.0f) ? 4 : 0);
        qe.a aVar2 = this.n0;
        this.l0.setTranslationY((-(1.0f - ((aVar2 != null ? aVar2.e : 0.0f) * f10))) * org.telegram.messenger.g0.L(44.0f));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
