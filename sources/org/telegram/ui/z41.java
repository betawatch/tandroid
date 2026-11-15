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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z41 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public boolean A0;
    public boolean B0;
    public m41 C0;
    public fi.k6 D0;
    public l41 E;
    public int E0;
    public l41 F;
    public final m4 F0;
    public l41 G;
    public xi.e G0;
    public v41 H;
    public PorterDuffColorFilter H0;
    public l41 I;
    public int I0;
    public l41 J;
    public l41 K;
    public l41 L;
    public l41 M;
    public l41 N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public org.telegram.ui.Components.sn S;
    public z31 T;
    public v4.b0 U;
    public final h2.j0 V;
    public org.telegram.ui.Components.fh0 W;
    public e41 X;
    public a41 Y;
    public y41 Z;
    public TLRPC.ChatFull a;
    public lg.f a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public l41 d;
    public final boolean d0;
    public l41 e;
    public final boolean e0;
    public u41 f;
    public long f0;
    public long g0;
    public l41 h;
    public final org.telegram.ui.ActionBar.t1[] h0;
    public x31 i0;
    public sb j0;
    public xd k0;
    public View l0;
    public FrameLayout m0;
    public l41 n;
    public te.a n0;
    public final boolean o0;
    public le0 p0;
    public FrameLayout q0;
    public l41 r;
    public qh.b[] r0;
    public l41 s;
    public int s0;
    public final SparseIntArray t0;
    public final SparseIntArray u0;
    public final ArrayList v0;
    public l41 w;
    public final ArrayList w0;
    public l41 x;
    public final ArrayList x0;
    public l41 y;
    public final ArrayList y0;
    public final ArrayList z0;

    public z41(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new h2.j0(50, 2);
        this.h0 = new org.telegram.ui.ActionBar.t1[1];
        this.s0 = -1;
        this.t0 = new SparseIntArray();
        this.u0 = new SparseIntArray();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new m4(this, 15);
        long j3 = bundle.getLong("chat_id");
        this.b = j3;
        this.c0 = bundle.getBoolean("is_megagroup", false);
        this.d0 = bundle.getBoolean("start_from_boosts", false);
        this.e0 = bundle.getBoolean("start_from_monetization", false);
        this.o0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().N0(j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v53 */
    public static void Z(final z41 z41Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        String str4;
        ?? r15;
        ArrayList arrayList3;
        int i7;
        String str5;
        ArrayList arrayList4;
        String str6;
        ArrayList arrayList5 = z41Var.O;
        ArrayList arrayList6 = z41Var.P;
        ArrayList arrayList7 = z41Var.v0;
        String str7 = "%";
        int i10 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final l41[] l41VarArr = {i0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.hd.M0(2131749273, "IVInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.followers_graph, org.telegram.messenger.hd.M0(2131750610, "FollowersChartTitle"), 0, false), i0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.hd.M0(2131744033, "TopHoursChartTitle"), 0, false), i0(tL_broadcastStats.interactions_graph, org.telegram.messenger.hd.M0(2131743530, "ViewsAndSharesChartTitle"), 1, false), i0(tL_broadcastStats.growth_graph, org.telegram.messenger.hd.M0(2131749375, "GrowthChartTitle"), 0, false), i0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.hd.M0(2131743529, "ViewsBySourceChartTitle"), 2, false), i0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.hd.M0(2131748274, "NewFollowersBySourceChartTitle"), 2, false), i0(tL_broadcastStats.languages_graph, org.telegram.messenger.hd.M0(2131749041, "LanguagesChartTitle"), 4, true), i0(tL_broadcastStats.mute_graph, org.telegram.messenger.hd.M0(2131747920, "NotificationsChartTitle"), 0, false), i0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.hd.M0(2131746385, "ReactionsByEmotionChartTitle"), 2, false), i0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.hd.M0(2131744659, "StoryInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.hd.M0(2131744504, "StoryReactionsByEmotionChartTitle"), 2, false)};
            l41 l41Var = l41VarArr[2];
            if (l41Var != null) {
                l41Var.n = true;
            }
            u41 u41Var = new u41();
            xi.e a10 = u41.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            u41Var.o = org.telegram.messenger.hd.M0(2131746378, "ReactionsPerPost");
            u41Var.p = (String) a10.a;
            u41Var.q = (String) a10.b;
            u41Var.r = ((Boolean) a10.c).booleanValue();
            u41Var.s = ((Boolean) a10.d).booleanValue();
            xi.e a11 = u41.a(tL_broadcastStats.reactions_per_story);
            u41Var.t = org.telegram.messenger.hd.M0(2131746377, "ReactionsPerStory");
            u41Var.u = (String) a11.a;
            u41Var.v = (String) a11.b;
            u41Var.w = ((Boolean) a11.c).booleanValue();
            u41Var.x = ((Boolean) a11.d).booleanValue();
            xi.e a12 = u41.a(tL_broadcastStats.views_per_story);
            u41Var.y = org.telegram.messenger.hd.M0(2131743527, "ViewsPerStory");
            u41Var.z = (String) a12.a;
            u41Var.A = (String) a12.b;
            u41Var.B = ((Boolean) a12.c).booleanValue();
            u41Var.C = ((Boolean) a12.d).booleanValue();
            xi.e a13 = u41.a(tL_broadcastStats.shares_per_story);
            u41Var.D = org.telegram.messenger.hd.M0(2131745397, "SharesPerStory");
            u41Var.E = (String) a13.a;
            u41Var.F = (String) a13.b;
            u41Var.G = ((Boolean) a13.c).booleanValue();
            u41Var.H = ((Boolean) a13.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str8 = "GrowthChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i11 = (int) (d - d2);
            float abs = d2 == 0.0d ? 0.0f : Math.abs((i11 / ((float) d2)) * 100.0f);
            u41Var.a = org.telegram.messenger.hd.M0(2131750610, "FollowersChartTitle");
            u41Var.b = org.telegram.messenger.g0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs == 0.0f) {
                i7 = i11;
                u41Var.c = "";
            } else {
                int i12 = (int) abs;
                if (abs == i12) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11 > 0 ? str4 : "");
                    sb2.append(org.telegram.messenger.g0.o0(i11, 0));
                    u41Var.c = sb2.toString() + " (" + i12 + "%)";
                    i7 = i11;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i11 > 0 ? str4 : "");
                    sb3.append(org.telegram.messenger.g0.o0(i11, 0));
                    i7 = i11;
                    u41Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            u41Var.d = i7 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d10 = tL_statsAbsValueAndPrev2.current;
            double d11 = tL_statsAbsValueAndPrev2.previous;
            int i13 = (int) (d10 - d11);
            float abs2 = d11 == 0.0d ? 0.0f : Math.abs((i13 / ((float) d11)) * 100.0f);
            u41Var.i = org.telegram.messenger.hd.M0(2131745398, "SharesPerPost");
            u41Var.j = org.telegram.messenger.g0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i13 == 0 || abs2 == 0.0f) {
                u41Var.k = "";
            } else {
                int i14 = (int) abs2;
                if (abs2 == i14) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i13 > 0 ? str4 : "");
                    sb4.append(org.telegram.messenger.g0.o0(i13, 0));
                    u41Var.k = sb4.toString() + " (" + i14 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i13 > 0 ? str4 : "");
                    sb5.append(org.telegram.messenger.g0.o0(i13, 0));
                    u41Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            u41Var.l = i13 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            float abs3 = d13 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d13)) * 100.0f);
            u41Var.e = org.telegram.messenger.hd.M0(2131743528, "ViewsPerPost");
            u41Var.f = org.telegram.messenger.g0.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i15 == 0 || abs3 == 0.0f) {
                u41Var.g = "";
            } else {
                int i16 = (int) abs3;
                if (abs3 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i15 > 0 ? str4 : "");
                    sb6.append(org.telegram.messenger.g0.o0(i15, 0));
                    u41Var.g = sb6.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i15 > 0 ? str4 : "");
                    sb7.append(org.telegram.messenger.g0.o0(i15, 0));
                    u41Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            u41Var.h = i15 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            u41Var.m = org.telegram.messenger.hd.M0(2131751143, "EnabledNotifications");
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                u41Var.n = com.google.android.gms.internal.vision.e2.i(i17, "%");
            } else {
                u41Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            z41Var.f = u41Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            z41Var.f0 = tL_statsDateRangeDays.max_date * 1000;
            z41Var.g0 = tL_statsDateRangeDays.min_date * 1000;
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
                w41 w41Var = new w41();
                w41Var.a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(w41Var);
                    str5 = str8;
                    str6 = str7;
                    z41Var.t0.put(w41Var.b(), i18);
                    i18++;
                } else {
                    str5 = str8;
                    arrayList4 = arrayList8;
                    str6 = str7;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(w41Var.b()));
                    z41Var.x0.add(w41Var);
                    z41Var.u0.put(w41Var.b(), i19);
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
            org.telegram.messenger.g0.h3(new t31(z41Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((w41) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.vr messagesStorage = z41Var.getMessagesStorage();
                long j3 = -z41Var.b;
                int i22 = z41Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.a.c(new org.telegram.messenger.qp(messagesStorage, org.telegram.messenger.xz.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, j3, 0L, size2, b10, 0, 0, i22, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            org.telegram.messenger.g0.h3(new Runnable(z41Var) { // from class: org.telegram.ui.u31
                public final /* synthetic */ z41 b;

                {
                    this.b = z41Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (objArr) {
                        case 0:
                            z41 z41Var2 = this.b;
                            z41Var2.getClass();
                            l41[] l41VarArr2 = l41VarArr;
                            z41Var2.r = l41VarArr2[0];
                            z41Var2.h = l41VarArr2[1];
                            z41Var2.e = l41VarArr2[2];
                            z41Var2.n = l41VarArr2[3];
                            z41Var2.d = l41VarArr2[4];
                            z41Var2.s = l41VarArr2[5];
                            z41Var2.w = l41VarArr2[6];
                            z41Var2.x = l41VarArr2[7];
                            z41Var2.y = l41VarArr2[8];
                            z41Var2.E = l41VarArr2[9];
                            z41Var2.F = l41VarArr2[10];
                            z41Var2.G = l41VarArr2[11];
                            z41Var2.j0(l41VarArr2);
                            break;
                        default:
                            z41 z41Var3 = this.b;
                            z41Var3.getClass();
                            l41[] l41VarArr3 = l41VarArr;
                            z41Var3.d = l41VarArr3[0];
                            z41Var3.I = l41VarArr3[1];
                            z41Var3.J = l41VarArr3[2];
                            z41Var3.K = l41VarArr3[3];
                            z41Var3.L = l41VarArr3[4];
                            z41Var3.M = l41VarArr3[5];
                            z41Var3.e = l41VarArr3[6];
                            z41Var3.N = l41VarArr3[7];
                            z41Var3.j0(l41VarArr3);
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
            l41 i02 = i0(tL_megagroupStats.growth_graph, org.telegram.messenger.hd.M0(2131749375, str3), r15, r15);
            l41 i03 = i0(tL_megagroupStats.members_graph, org.telegram.messenger.hd.M0(2131749427, "GroupMembersChartTitle"), r15, r15);
            l41 i04 = i0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.hd.M0(2131748271, "NewMembersBySourceChartTitle"), 2, r15);
            l41 i05 = i0(tL_megagroupStats.languages_graph, org.telegram.messenger.hd.M0(2131748618, "MembersLanguageChartTitle"), 4, true);
            l41 i06 = i0(tL_megagroupStats.messages_graph, org.telegram.messenger.hd.M0(2131748462, "MessagesChartTitle"), 2, r15);
            l41 i07 = i0(tL_megagroupStats.actions_graph, org.telegram.messenger.hd.M0(2131754489, "ActionsChartTitle"), 1, r15);
            l41 i08 = i0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.hd.M0(2131744033, str), r15, r15);
            l41 i09 = i0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.hd.M0(2131744034, "TopDaysOfWeekChartTitle"), 4, r15);
            final l41[] l41VarArr2 = new l41[8];
            l41VarArr2[r15] = i02;
            l41VarArr2[1] = i03;
            l41VarArr2[2] = i04;
            l41VarArr2[3] = i05;
            l41VarArr2[4] = i06;
            l41VarArr2[5] = i07;
            l41VarArr2[6] = i08;
            l41VarArr2[7] = i09;
            l41 l41Var2 = l41VarArr2[6];
            if (l41Var2 != null) {
                l41Var2.n = true;
            }
            l41 l41Var3 = l41VarArr2[7];
            if (l41Var3 != null) {
                l41Var3.o = true;
            }
            v41 v41Var = new v41();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d14 = tL_statsAbsValueAndPrev4.current;
            double d15 = tL_statsAbsValueAndPrev4.previous;
            int i23 = (int) (d14 - d15);
            float abs4 = d15 == 0.0d ? 0.0f : Math.abs((i23 / ((float) d15)) * 100.0f);
            v41Var.a = org.telegram.messenger.hd.M0(2131748617, "MembersOverviewTitle");
            v41Var.b = org.telegram.messenger.g0.o0((int) tL_megagroupStats.members.current, 0);
            if (i23 == 0 || abs4 == 0.0f) {
                v41Var.c = "";
            } else {
                int i24 = (int) abs4;
                if (abs4 == i24) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i23 > 0 ? str4 : "");
                    sb8.append(org.telegram.messenger.g0.o0(i23, 0));
                    v41Var.c = sb8.toString() + " (" + i24 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i23 > 0 ? str4 : "");
                    sb9.append(org.telegram.messenger.g0.o0(i23, 0));
                    v41Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str2);
                }
            }
            v41Var.d = i23 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d16 = tL_statsAbsValueAndPrev5.current;
            double d17 = tL_statsAbsValueAndPrev5.previous;
            int i25 = (int) (d16 - d17);
            float abs5 = d17 == 0.0d ? 0.0f : Math.abs((i25 / ((float) d17)) * 100.0f);
            v41Var.i = org.telegram.messenger.hd.M0(2131743532, "ViewingMembers");
            v41Var.j = org.telegram.messenger.g0.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i25 == 0 || abs5 == 0.0f) {
                v41Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i25 > 0 ? str4 : "");
                sb10.append(org.telegram.messenger.g0.o0(i25, 0));
                v41Var.k = sb10.toString();
            }
            v41Var.l = i25 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d18 - d19);
            float abs6 = d19 == 0.0d ? 0.0f : Math.abs((i26 / ((float) d19)) * 100.0f);
            v41Var.m = org.telegram.messenger.hd.M0(2131747067, "PostingMembers");
            v41Var.n = org.telegram.messenger.g0.o0((int) tL_megagroupStats.posters.current, 0);
            if (i26 == 0 || abs6 == 0.0f) {
                v41Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i26 > 0 ? str4 : "");
                sb11.append(org.telegram.messenger.g0.o0(i26, 0));
                v41Var.o = sb11.toString();
            }
            v41Var.p = i26 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d20 - d21);
            float abs7 = d21 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d21)) * 100.0f);
            v41Var.e = org.telegram.messenger.hd.M0(2131748453, "MessagesOverview");
            v41Var.f = org.telegram.messenger.g0.o0((int) tL_megagroupStats.messages.current, 0);
            if (i27 == 0 || abs7 == 0.0f) {
                v41Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i27 > 0 ? str4 : "");
                sb12.append(org.telegram.messenger.g0.o0(i27, 0));
                v41Var.g = sb12.toString();
            }
            v41Var.h = i27 >= 0;
            z41Var.H = v41Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            z41Var.f0 = tL_statsDateRangeDays2.max_date * 1000;
            z41Var.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    s41 s41Var = new s41();
                    s41Var.a = s41.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb13.append(org.telegram.messenger.hd.G(i29, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.hd.a0("CharactersPerMessage", null, 2131752254, org.telegram.messenger.hd.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    s41Var.b = sb13.toString();
                    int i30 = i10;
                    if (arrayList2.size() < i30) {
                        arrayList3 = arrayList2;
                        arrayList3.add(s41Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(s41Var);
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
                    ArrayList arrayList19 = z41Var.R;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    s41 s41Var2 = new s41();
                    s41Var2.a = s41.a(arrayList20, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb14 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb14.append(org.telegram.messenger.hd.G(i32, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.hd.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.hd.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    s41Var2.b = sb14.toString();
                    arrayList19.add(s41Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = z41Var.Q;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    s41 s41Var3 = new s41();
                    s41Var3.a = s41.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        s41Var3.b = org.telegram.messenger.hd.G(i34, "Invitations", new Object[0]);
                    } else {
                        s41Var3.b = "";
                    }
                    arrayList22.add(s41Var3);
                }
            }
            final int i35 = 1;
            org.telegram.messenger.g0.h3(new Runnable(z41Var) { // from class: org.telegram.ui.u31
                public final /* synthetic */ z41 b;

                {
                    this.b = z41Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i35) {
                        case 0:
                            z41 z41Var2 = this.b;
                            z41Var2.getClass();
                            l41[] l41VarArr22 = l41VarArr2;
                            z41Var2.r = l41VarArr22[0];
                            z41Var2.h = l41VarArr22[1];
                            z41Var2.e = l41VarArr22[2];
                            z41Var2.n = l41VarArr22[3];
                            z41Var2.d = l41VarArr22[4];
                            z41Var2.s = l41VarArr22[5];
                            z41Var2.w = l41VarArr22[6];
                            z41Var2.x = l41VarArr22[7];
                            z41Var2.y = l41VarArr22[8];
                            z41Var2.E = l41VarArr22[9];
                            z41Var2.F = l41VarArr22[10];
                            z41Var2.G = l41VarArr22[11];
                            z41Var2.j0(l41VarArr22);
                            break;
                        default:
                            z41 z41Var3 = this.b;
                            z41Var3.getClass();
                            l41[] l41VarArr3 = l41VarArr2;
                            z41Var3.d = l41VarArr3[0];
                            z41Var3.I = l41VarArr3[1];
                            z41Var3.J = l41VarArr3[2];
                            z41Var3.K = l41VarArr3[3];
                            z41Var3.L = l41VarArr3[4];
                            z41Var3.M = l41VarArr3[5];
                            z41Var3.e = l41VarArr3[6];
                            z41Var3.N = l41VarArr3[7];
                            z41Var3.j0(l41VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void a0(z41 z41Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                arrayList.add(new org.telegram.messenger.gj(z41Var.currentAccount, arrayList2.get(i7), false, true));
            }
            z41Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.g0.h3(new t31(z41Var, arrayList, 1));
    }

    public static void c0(z41 z41Var) {
        y41 y41Var = z41Var.Z;
        if (y41Var != null) {
            y41Var.b = true;
        }
        int childCount = z41Var.T.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = z41Var.T.getChildAt(i7);
            if (childAt instanceof k41) {
                ((k41) childAt).b.u0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.e2 g0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).N0(chat.id);
        return (N0 == null || !(N0.can_view_stats || N0.can_view_stars_revenue)) ? new t5(-chat.id) : new z41(bundle);
    }

    public static mg.b h0(JSONObject jSONObject, int i7, boolean z10) {
        if (i7 == 0) {
            return new mg.b(jSONObject);
        }
        if (i7 == 1) {
            return new mg.c(jSONObject);
        }
        if (i7 == 2) {
            mg.d dVar = new mg.d(jSONObject);
            int length = ((mg.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                dVar.l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = dVar.l;
                    jArr[i10] = jArr[i10] + ((mg.a) dVar.d.get(i11)).a[i10];
                }
            }
            dVar.m = new k8.a(dVar.l);
            return dVar;
        }
        if (i7 != 4) {
            return null;
        }
        mg.e eVar = new mg.e(jSONObject);
        if (z10) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j3 = 0;
            for (int i12 = 0; i12 < eVar.d.size(); i12++) {
                int length2 = eVar.a.length;
                for (int i13 = 0; i13 < length2; i13++) {
                    long j10 = ((mg.a) eVar.d.get(i12)).a[i13];
                    jArr2[i12] = jArr2[i12] + j10;
                    if (j10 == 0) {
                        iArr[i12] = iArr[i12] + 1;
                    }
                }
                j3 += jArr2[i12];
            }
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < eVar.d.size(); i14++) {
                if (jArr2[i14] / j3 < 0.01d && iArr[i14] > eVar.a.length / 2.0f) {
                    arrayList.add((mg.a) eVar.d.get(i14));
                }
            }
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList.get(i15);
                i15++;
                eVar.d.remove((mg.a) obj);
            }
        }
        int length3 = ((mg.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i16 = 0; i16 < length3; i16++) {
            eVar.l[i16] = 0;
            for (int i17 = 0; i17 < size3; i17++) {
                long[] jArr3 = eVar.l;
                jArr3[i16] = jArr3[i16] + ((mg.a) eVar.d.get(i17)).a[i16];
            }
        }
        new k8.a(eVar.l);
        return eVar;
    }

    public static l41 i0(TL_stats.StatsGraph statsGraph, String str, int i7, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        l41 l41Var = new l41(str, i7);
        l41Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                mg.b h02 = h0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i7, z10);
                l41Var.d = h02;
                if (h02 != null) {
                    h02.h = statsGraph.rate;
                }
                l41Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (h02 == null || (jArr2 = h02.a) == null || jArr2.length < 2) {
                    l41Var.l = true;
                }
                if (i7 == 4 && h02 != null && (jArr = h02.a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    l41Var.e = new mg.e(h02, j3);
                    l41Var.c = j3;
                    return l41Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            l41Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return l41Var;
    }

    public static void n0(l41 l41Var, ArrayList arrayList, org.telegram.ui.ActionBar.r6 r6Var) {
        mg.b bVar;
        if (l41Var == null || (bVar = l41Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            mg.a aVar = (mg.a) obj;
            int i10 = aVar.g;
            if (i10 >= 0) {
                if (!org.telegram.ui.ActionBar.j6.f1(i10)) {
                    org.telegram.ui.ActionBar.j6.A1(aVar.g, org.telegram.ui.ActionBar.j6.I == org.telegram.ui.ActionBar.j6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.j6.hm[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, aVar.g));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i7;
        z41 z41Var = this;
        int i10 = 1;
        z41Var.setHasOwnBackground(true);
        z41Var.a0 = new lg.f((org.telegram.ui.ActionBar.e6) null);
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(z41Var.currentAccount);
        long j3 = z41Var.b;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(z41Var.currentAccount).N0(j3);
        boolean z10 = N0 != null && N0.can_view_stats;
        boolean R = org.telegram.messenger.t3.R(M0);
        boolean z11 = N0 != null && (N0.can_view_revenue || N0.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(qh.b.c(context, z41Var.resourceProvider, qh.a.J, 2131744892));
        }
        arrayList.add(qh.b.c(context, z41Var.resourceProvider, qh.a.P, 2131753163));
        if (z11) {
            arrayList.add(qh.b.c(context, z41Var.resourceProvider, qh.a.Q, 2131748407));
        }
        z41Var.r0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        le0 le0Var = new le0(context, z41Var.resourceProvider);
        z41Var.p0 = le0Var;
        le0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        z41Var.p0.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        z41Var.p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        z41Var.q0 = frameLayout2;
        frameLayout2.setOnClickListener(new bi.o(22));
        z41Var.q0.addView(z41Var.p0, c8.ja.e(-1, 72, 81));
        z41Var.q0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = z41Var.r0;
            if (i11 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new mu0(z41Var, i11, i10));
            z41Var.p0.addView(z41Var.r0[i11]);
            z41Var.p0.i(bVar, true, false);
            i11++;
        }
        z41Var.i0 = new x31(z41Var, z41Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            sb sbVar = new sb(z41Var, -j3, z41Var.getResourceProvider());
            z41Var.j0 = sbVar;
            sbVar.G.setCaptureSectionsDecoratorAllowed(true);
            z41Var.glassEngine.b(z41Var.j0.G);
        }
        if (z11) {
            frameLayout = frameLayout3;
            i7 = -1;
            xd xdVar = new xd(z41Var.getParentActivity(), z41Var, z41Var.currentAccount, -j3, z41Var.getResourceProvider(), z41Var.glassEngine, org.telegram.messenger.t3.V(M0) && N0.can_view_revenue, N0.can_view_stars_revenue);
            z41Var = z41Var;
            z41Var.k0 = xdVar;
            xdVar.Y0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i7 = -1;
        }
        boolean z12 = z10;
        FrameLayout frameLayout4 = frameLayout;
        z41Var.i0.setAdapter(new y31(z41Var, z12, R, z11, frameLayout4));
        boolean z13 = z41Var.o0;
        boolean z14 = R && !z13;
        z41Var.c = z14;
        if (z14 && z41Var.d0) {
            z41Var.i0.setPosition(z12 ? 1 : 0);
        } else if (z14 && z41Var.e0) {
            z41Var.i0.setPosition(((z13 || !R) ? 0 : 1) + (z12 ? 1 : 0));
        }
        z41Var.p0(z41Var.i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(z41Var.getParentActivity());
        frameLayout5.addView(z41Var.i0, c8.ja.g());
        View view = new View(context);
        z41Var.l0 = view;
        frameLayout5.addView(view, c8.ja.e(i7, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        z41Var.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(z41Var.m0, c8.ja.g());
        frameLayout5.addView(z41Var.simpleActionBar);
        int i12 = 13;
        if (z41Var.c) {
            z41Var.setBulletinDelegate(new bi.t(i12));
            z41Var.q0.setBackground(z41Var.getBaseSimpleGlass().b(z41Var.q0));
            frameLayout5.addView(z41Var.q0, c8.ja.e(i7, -2, 80));
        }
        z41Var.fragmentView = frameLayout5;
        z31 z31Var = new z31(z41Var, context);
        z41Var.T = z31Var;
        z31Var.setCaptureSectionsDecoratorAllowed(true);
        z41Var.T.setSections(true);
        z41Var.T.setClipToPadding(false);
        z41Var.glassEngine.b(z41Var.T);
        z41Var.T.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        z41Var.b0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        z41Var.W = fh0Var;
        fh0Var.setAutoRepeat(true);
        z41Var.W.f(R.raw.statistic_preload, 120, 120, null);
        z41Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.j6.Fj;
        org.telegram.ui.ActionBar.q6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.hd.M0(2131748777, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.j6.Gj;
        org.telegram.ui.ActionBar.q6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.hd.M0(2131748776, null));
        textView2.setGravity(1);
        z41Var.b0.addView(z41Var.W, c8.ja.t(120, 120, 1, 0, 0, 0, 20));
        z41Var.b0.addView(textView, c8.ja.t(-2, -2, 1, 0, 0, 0, 10));
        z41Var.b0.addView(textView2, c8.ja.r(-2, -2, 1));
        frameLayout4.addView(z41Var.b0, c8.ja.d(org.telegram.messenger.ns.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (z41Var.X == null) {
            z41Var.X = new e41(z41Var);
        }
        z41Var.T.setAdapter(z41Var.X);
        v4.b0 b0Var = new v4.b0();
        z41Var.U = b0Var;
        z41Var.T.setLayoutManager(b0Var);
        z41Var.Y = new a41();
        z41Var.T.setItemAnimator(null);
        int i15 = 2;
        z41Var.T.j(new y11(z41Var, i15));
        z41Var.T.setOnItemClickListener(new ux0(z41Var, 6));
        z41Var.T.setOnItemLongClickListener(new w31(z41Var));
        frameLayout4.addView(z41Var.T);
        z41Var.S = new org.telegram.ui.Components.sn(context, null, false, null);
        TLRPC.Chat M02 = z41Var.getMessagesController().M0(Long.valueOf(j3));
        z41Var.S.setChatAvatar(M02);
        z41Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        z41Var.simpleActionBar.setTitle(M02 == null ? "" : M02.title);
        z41Var.simpleActionBar.setActionBarMenuOnItemClick(new ct0(z41Var, 13));
        z41Var.S.i(org.telegram.ui.ActionBar.j6.x0(null, i13, false), org.telegram.ui.ActionBar.j6.x0(null, i14, false));
        boolean z15 = z41Var.B0;
        m4 m4Var = z41Var.F0;
        if (z15) {
            z41Var.b0.setAlpha(0.0f);
            org.telegram.messenger.g0.i3(m4Var, 500L);
            z41Var.b0.setVisibility(0);
            z41Var.T.setVisibility(8);
        } else {
            org.telegram.messenger.g0.r(m4Var);
            z41Var.b0.setVisibility(8);
            z41Var.T.setVisibility(0);
        }
        fh.g c10 = z41Var.getBaseSimpleGlass().c.c(z41Var.p0, c8.g0.f(z41Var.resourceProvider), false);
        org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
        z41Var.p0.setBackground(c10);
        z41Var.glassEngine.c(z41Var.i0);
        ri.a baseSimpleGlass = z41Var.getBaseSimpleGlass();
        x31 x31Var = z41Var.i0;
        org.telegram.ui.ActionBar.w4 w4Var = z41Var.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = z41Var.resourceProvider;
        baseSimpleGlass.m = frameLayout5;
        baseSimpleGlass.n = x31Var;
        baseSimpleGlass.a.c(x31Var);
        baseSimpleGlass.g(frameLayout5, w4Var, e6Var);
        z41Var.n0 = new te.a(0, new w31(z41Var), org.telegram.ui.Components.er.h, 380L, false);
        xd xdVar2 = z41Var.k0;
        if (xdVar2 != null) {
            ri.a baseSimpleGlass2 = z41Var.getBaseSimpleGlass();
            View view2 = xdVar2.b1.d;
            fh.g c11 = baseSimpleGlass2.c.c(view2, null, false);
            c11.p(c8.g0.l(xdVar2.o0));
            c11.q(org.telegram.messenger.g0.L(9.66f));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = z41Var.k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.g0.E2(transactionTabs);
            z41Var.m0.addView(transactionTabs, layoutParams);
            z41Var.k0.setTabsPinnedChangedListener(new pu0(z41Var, 20));
            z41Var.n0.a(z41Var.k0.f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new fk(z41Var, i15));
        z41Var.getBaseSimpleGlass().o = new vu(z41Var, frameLayout5, new a6(i10, frameLayout5), i10);
        z41Var.getBaseSimpleGlass().n = null;
        z41Var.simpleActionBar.setBackground(null);
        z41Var.l0.setBackground(z41Var.getBaseSimpleGlass().a(z41Var.l0));
        org.telegram.messenger.g0.E2(z41Var.S.e);
        frameLayout5.addView(z41Var.S.e, c8.ja.e(42, 42, 53));
        z41Var.f0();
        z41Var.fragmentView.setBackgroundColor(z41Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        z41Var.C0 = new m41(z41Var.X, z41Var.U);
        return z41Var.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i7 == org.telegram.messenger.ns.x5) {
            if (((fi.k6) objArr[0]) == this.D0) {
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
        if (i7 == org.telegram.messenger.ns.V2) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.e2 e2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack) : null;
            if (e2Var instanceof qn) {
                ((ActionBarLayout) getParentLayout()).d0(e2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.e2 e2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (e2Var2 instanceof ProfileActivity) {
                    wg.h.f(e2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.e2 e2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.e2) r.b.h(3, fragmentStack2) : null;
            if (e2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).d0(e2Var2, false);
            }
            finishFragment();
            if (e2Var3 instanceof an) {
                wg.h.f(e2Var3, chat, true);
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ns.D) {
            if (i7 == org.telegram.messenger.ns.T) {
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
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i12);
                int i13 = this.t0.get(gjVar.e1(), -1);
                if (i13 >= 0 && ((w41) arrayList.get(i13)).b() == gjVar.e1()) {
                    if (gjVar.Z) {
                        arrayList3.add((w41) arrayList.get(i13));
                    } else {
                        ((w41) arrayList.get(i13)).b = gjVar;
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
                w41 w41Var = (w41) arrayList.get(i11);
                if (w41Var.b == null) {
                    this.s0 = w41Var.b();
                    break;
                } else {
                    arrayList4.add(w41Var);
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
        org.telegram.messenger.g0.A3(this.S.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
        this.q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        z31 z31Var = this.T;
        if (z31Var != null) {
            i0.c cVar = this.mSystemInsets;
            ri.a.e(z31Var, cVar.b, cVar.d, currentActionBarHeight, L2);
        }
        sb sbVar = this.j0;
        if (sbVar != null) {
            org.telegram.ui.Components.uj0 uj0Var = sbVar.G;
            i0.c cVar2 = this.mSystemInsets;
            ri.a.e(uj0Var, cVar2.b, cVar2.d, currentActionBarHeight, L2);
        }
        xd xdVar = this.k0;
        if (xdVar != null) {
            i0.c cVar3 = this.mSystemInsets;
            int i7 = cVar3.b;
            int i10 = cVar3.d;
            xdVar.V0 = i7;
            xdVar.W0 = i10;
            xdVar.X0 = L2;
            int C = org.telegram.messenger.i20.C(48.0f, i7, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.i20.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.u41 u41Var = xdVar.Y0;
            org.telegram.messenger.g0.A3(u41Var, 0, C, 0, C2);
            u41Var.setPadding(u41Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7) - C, u41Var.getPaddingRight(), (i10 + L2) - C2);
            xdVar.z(-C, -C2);
            xdVar.B();
            xdVar.requestLayout();
            xdVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        g6 g6Var = new g6(21, this);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.T, 0, new Class[]{ng.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.j5));
        if (this.c0) {
            while (i7 < 6) {
                n0(i7 == 0 ? this.d : i7 == 1 ? this.I : i7 == 2 ? this.J : i7 == 3 ? this.K : i7 == 4 ? this.L : this.M, arrayList, g6Var);
                i7++;
            }
        } else {
            while (i7 < 12) {
                n0(i7 == 0 ? this.d : i7 == 1 ? this.h : i7 == 2 ? this.n : i7 == 3 ? this.r : i7 == 4 ? this.s : i7 == 5 ? this.w : i7 == 6 ? this.y : i7 == 7 ? this.e : i7 == 8 ? this.x : i7 == 9 ? this.E : i7 == 10 ? this.F : this.G, arrayList, g6Var);
                i7++;
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        x31 x31Var;
        if (motionEvent != null && this.k0 != null && (x31Var = this.i0) != null) {
            View currentView = x31Var.getCurrentView();
            xd xdVar = this.k0;
            if (currentView == xdVar && xdVar.G((motionEvent.getX() - this.i0.getX()) - this.k0.getX(), (motionEvent.getY() - this.i0.getY()) - this.k0.getY())) {
                return false;
            }
        }
        x31 x31Var2 = this.i0;
        if (x31Var2 == null || (x31Var2.b == 0 && x31Var2.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0(l41[] l41VarArr) {
        e41 e41Var = this.X;
        if (e41Var != null) {
            e41Var.E();
            this.T.setItemAnimator(null);
            this.X.f();
        }
        this.B0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        org.telegram.messenger.g0.r(this.F0);
        this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new xx(this, 29));
        this.T.setVisibility(0);
        this.T.setAlpha(0.0f);
        this.T.animate().alpha(1.0f).setDuration(230L).start();
        for (l41 l41Var : l41VarArr) {
            if (l41Var != null && l41Var.d == null && l41Var.f != null) {
                l41Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new eh(2, this, l41Var));
            }
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.v0;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = this.t0.get(this.s0); i10 < size; i10++) {
            if (((w41) arrayList.get(i10)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((w41) arrayList.get(i10)).b()));
                i7++;
                if (i7 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.np.s1(this.currentAccount).h1(this.b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new s31(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.o0) {
            return;
        }
        boolean z10 = this.c0;
        long j3 = this.b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.np.s1(this.currentAccount).h1(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.np.s1(this.currentAccount).h1(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new s31(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        ArrayList arrayList2 = this.x0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            w41 w41Var = (w41) obj;
            org.telegram.messenger.gj f10 = this.D0.f(w41Var.b());
            if (f10 != null) {
                w41Var.b = f10;
                arrayList.add(w41Var);
            }
        }
        this.u0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof k41) {
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.x6) || this.T.b1()) {
            if (view instanceof ng.c) {
                ((ng.c) view).a();
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof org.telegram.ui.Components.fq) {
            org.telegram.ui.Components.fq fqVar = (org.telegram.ui.Components.fq) background;
            if ((fqVar.a instanceof ColorDrawable) && fqVar.b != null) {
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.b7, false);
                if (this.H0 == null || this.I0 != x02) {
                    this.I0 = x02;
                    this.H0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                }
                ((ColorDrawable) fqVar.a).setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.a7, false));
                fqVar.b.setColorFilter(this.H0);
                view.invalidate();
                return;
            }
        }
        org.telegram.ui.Components.fq fqVar2 = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.a7, false)), org.telegram.ui.ActionBar.j6.Y0(org.telegram.messenger.t0.b, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7), 0, 0);
        fqVar2.x = true;
        view.setBackground(fqVar2);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        xi.e eVar = this.G0;
        if (eVar != null) {
            eVar.b();
            this.G0 = null;
        }
        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(org.telegram.messenger.ns.D);
        eVar2.c(org.telegram.messenger.ns.T);
        eVar2.c(org.telegram.messenger.ns.V2);
        eVar2.c(org.telegram.messenger.ns.x5);
        this.G0 = eVar2;
        fi.s6 P1 = getMessagesController().P1();
        long j3 = this.b;
        fi.k6 A = P1.A(2, -1, -j3, true);
        this.D0 = A;
        if (A != null) {
            this.E0 = A.o();
        }
        if (this.a != null) {
            l0();
        } else {
            org.telegram.messenger.np.s1(this.currentAccount).V2(this.classGuid, j3, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        xi.e eVar = this.G0;
        if (eVar != null) {
            eVar.b();
            this.G0 = null;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.h0;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
            t1VarArr[0] = null;
        }
        fi.k6 k6Var = this.D0;
        if (k6Var != null) {
            k6Var.z(this.E0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        f0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.sn snVar = this.S;
            if (snVar != null) {
                snVar.i(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fj, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Gj, false));
            }
            s0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(int i7, boolean z10) {
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.r0;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10].f(i10 == i7, z10);
            i10++;
        }
    }

    public final void q0(boolean z10, float f10) {
        for (int i7 = 0; i7 < this.r0.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i7 - f10));
            qh.b bVar = this.r0[i7];
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
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.messenger.qk(4))));
    }

    public final void s0() {
        z31 z31Var = this.T;
        if (z31Var != null) {
            int childCount = z31Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                o0(this.T.getChildAt(i7));
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
        lg.f fVar = this.a0;
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
                te.a aVar = this.n0;
                this.l0.setTranslationY((-(1.0f - ((aVar != null ? aVar.e : 0.0f) * f10))) * org.telegram.messenger.g0.L(44.0f));
            }
        }
        z10 = false;
        if (z10) {
        }
        this.m0.setVisibility((z10 || f10 <= 0.0f) ? 4 : 0);
        te.a aVar2 = this.n0;
        this.l0.setTranslationY((-(1.0f - ((aVar2 != null ? aVar2.e : 0.0f) * f10))) * org.telegram.messenger.g0.L(44.0f));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
