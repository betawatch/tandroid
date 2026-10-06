package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
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
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ta1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public ga1 B0;
    public ai.d9 C0;
    public int D0;
    public fa1 E;
    public final x5 E0;
    public fa1 F;
    public NotificationCenter.ObserversGroup F0;
    public pa1 G;
    public fa1 H;
    public fa1 I;
    public fa1 J;
    public fa1 K;
    public fa1 L;
    public fa1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.ho R;
    public s91 S;
    public s4.c0 T;
    public final LruCache U;
    public org.telegram.ui.Components.nj0 V;
    public y91 W;
    public t91 X;
    public sa1 Y;
    public ig.f Z;
    public TLRPC.ChatFull a;
    public LinearLayout a0;
    public final long b;
    public final boolean b0;
    public boolean c;
    public final boolean c0;
    public fa1 d;
    public final boolean d0;
    public fa1 e;
    public long e0;
    public oa1 f;
    public long f0;
    public final org.telegram.ui.ActionBar.b2[] g0;
    public fa1 h;
    public q91 h0;
    public dc i0;
    public me j0;
    public View k0;
    public FrameLayout l0;
    public le.b m0;
    public fa1 n;
    public final boolean n0;
    public eh0 o0;
    public FrameLayout p0;
    public oh.b[] q0;
    public fa1 r;
    public int r0;
    public fa1 s;
    public final SparseIntArray s0;
    public final SparseIntArray t0;
    public final ArrayList u0;
    public fa1 v;
    public final ArrayList v0;
    public fa1 w;
    public final ArrayList w0;
    public fa1 x;
    public final ArrayList x0;
    public fa1 y;
    public final ArrayList y0;
    public boolean z0;

    public ta1(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.U = new LruCache(50);
        this.g0 = new org.telegram.ui.ActionBar.b2[1];
        this.r0 = -1;
        this.s0 = new SparseIntArray();
        this.t0 = new SparseIntArray();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.A0 = true;
        this.E0 = new x5(this, 13);
        long j3 = bundle.getLong("chat_id");
        this.b = j3;
        this.b0 = bundle.getBoolean("is_megagroup", false);
        this.c0 = bundle.getBoolean("start_from_boosts", false);
        this.d0 = bundle.getBoolean("start_from_monetization", false);
        this.n0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().getChatFull(j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v54 */
    public static void S(final ta1 ta1Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        ?? r15;
        ArrayList arrayList3;
        int i10;
        int i11;
        ArrayList arrayList4;
        String str4;
        ArrayList arrayList5 = ta1Var.N;
        ArrayList arrayList6 = ta1Var.O;
        ArrayList arrayList7 = ta1Var.u0;
        String str5 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final fa1[] fa1VarArr = {d0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), d0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), d0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), d0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), d0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), d0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), d0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), d0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), d0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), d0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), d0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), d0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            fa1 fa1Var = fa1VarArr[2];
            if (fa1Var != null) {
                fa1Var.n = true;
            }
            oa1 oa1Var = new oa1();
            com.google.firebase.messaging.s a2 = oa1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            oa1Var.o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            oa1Var.p = (String) a2.b;
            oa1Var.q = (String) a2.e;
            oa1Var.r = ((Boolean) a2.c).booleanValue();
            oa1Var.s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.s a10 = oa1.a(tL_broadcastStats.reactions_per_story);
            oa1Var.t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            oa1Var.u = (String) a10.b;
            oa1Var.v = (String) a10.e;
            oa1Var.w = ((Boolean) a10.c).booleanValue();
            oa1Var.x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.s a11 = oa1.a(tL_broadcastStats.views_per_story);
            oa1Var.y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            oa1Var.z = (String) a11.b;
            oa1Var.A = (String) a11.e;
            oa1Var.B = ((Boolean) a11.c).booleanValue();
            oa1Var.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.s a12 = oa1.a(tL_broadcastStats.shares_per_story);
            oa1Var.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            oa1Var.E = (String) a12.b;
            oa1Var.F = (String) a12.e;
            oa1Var.G = ((Boolean) a12.c).booleanValue();
            oa1Var.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            float abs = d10 == 0.0d ? 0.0f : Math.abs((i12 / ((float) d10)) * 100.0f);
            oa1Var.a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            oa1Var.b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs == 0.0f) {
                i10 = i12;
                oa1Var.c = "";
            } else {
                int i13 = (int) abs;
                if (abs == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12 > 0 ? str3 : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    oa1Var.c = sb2.toString() + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i12 > 0 ? str3 : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    oa1Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            oa1Var.d = i10 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            float abs2 = d12 == 0.0d ? 0.0f : Math.abs((i14 / ((float) d12)) * 100.0f);
            oa1Var.i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            oa1Var.j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 == 0 || abs2 == 0.0f) {
                oa1Var.k = "";
            } else {
                int i15 = (int) abs2;
                if (abs2 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i14 > 0 ? str3 : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    oa1Var.k = sb4.toString() + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i14 > 0 ? str3 : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    oa1Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            oa1Var.l = i14 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            float abs3 = d14 == 0.0d ? 0.0f : Math.abs((i16 / ((float) d14)) * 100.0f);
            oa1Var.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            oa1Var.f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 == 0 || abs3 == 0.0f) {
                oa1Var.g = "";
            } else {
                int i17 = (int) abs3;
                if (abs3 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i16 > 0 ? str3 : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    oa1Var.g = sb6.toString() + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i16 > 0 ? str3 : "");
                    sb7.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    oa1Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            oa1Var.h = i16 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            oa1Var.m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f7;
            if (f7 == i18) {
                Locale locale7 = Locale.ENGLISH;
                oa1Var.n = a4.a.n(i18, "%");
            } else {
                oa1Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            ta1Var.f = oa1Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            ta1Var.e0 = tL_statsDateRangeDays.max_date * 1000;
            ta1Var.f0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                int i22 = i21 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                qa1 qa1Var = new qa1();
                qa1Var.a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(qa1Var);
                    str4 = str5;
                    i11 = i22;
                    ta1Var.s0.put(qa1Var.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str4 = str5;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(qa1Var.b()));
                    ta1Var.w0.add(qa1Var);
                    ta1Var.t0.put(qa1Var.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str5 = str4;
                i21 = i11;
                arrayList8 = arrayList4;
                size = i23;
            }
            ArrayList arrayList12 = arrayList8;
            str = str5;
            AndroidUtilities.runOnUIThread(new m91(ta1Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                ta1Var.getMessagesStorage().getMessages(-ta1Var.b, 0L, false, arrayList12.size(), ((qa1) arrayList12.get(0)).b(), 0, 0, ta1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            r15 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            AndroidUtilities.runOnUIThread(new Runnable(ta1Var) { // from class: org.telegram.ui.n91
                public final /* synthetic */ ta1 b;

                {
                    this.b = ta1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (objArr) {
                        case 0:
                            ta1 ta1Var2 = this.b;
                            ta1Var2.getClass();
                            fa1[] fa1VarArr2 = fa1VarArr;
                            ta1Var2.r = fa1VarArr2[0];
                            ta1Var2.h = fa1VarArr2[1];
                            ta1Var2.e = fa1VarArr2[2];
                            ta1Var2.n = fa1VarArr2[3];
                            ta1Var2.d = fa1VarArr2[4];
                            ta1Var2.s = fa1VarArr2[5];
                            ta1Var2.v = fa1VarArr2[6];
                            ta1Var2.w = fa1VarArr2[7];
                            ta1Var2.x = fa1VarArr2[8];
                            ta1Var2.y = fa1VarArr2[9];
                            ta1Var2.E = fa1VarArr2[10];
                            ta1Var2.F = fa1VarArr2[11];
                            ta1Var2.e0(fa1VarArr2);
                            break;
                        default:
                            ta1 ta1Var3 = this.b;
                            ta1Var3.getClass();
                            fa1[] fa1VarArr3 = fa1VarArr;
                            ta1Var3.d = fa1VarArr3[0];
                            ta1Var3.H = fa1VarArr3[1];
                            ta1Var3.I = fa1VarArr3[2];
                            ta1Var3.J = fa1VarArr3[3];
                            ta1Var3.K = fa1VarArr3[4];
                            ta1Var3.L = fa1VarArr3[5];
                            ta1Var3.e = fa1VarArr3[6];
                            ta1Var3.M = fa1VarArr3[7];
                            ta1Var3.e0(fa1VarArr3);
                            break;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
            r15 = 0;
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            fa1 d02 = d0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), r15, r15);
            fa1 d03 = d0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), r15, r15);
            fa1 d04 = d0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, r15);
            fa1 d05 = d0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true);
            fa1 d06 = d0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, r15);
            fa1 d07 = d0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, r15);
            fa1 d08 = d0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), r15, r15);
            fa1 d09 = d0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, r15);
            final fa1[] fa1VarArr2 = new fa1[8];
            fa1VarArr2[r15] = d02;
            fa1VarArr2[1] = d03;
            fa1VarArr2[2] = d04;
            fa1VarArr2[3] = d05;
            fa1VarArr2[4] = d06;
            fa1VarArr2[5] = d07;
            fa1VarArr2[6] = d08;
            fa1VarArr2[7] = d09;
            fa1 fa1Var2 = fa1VarArr2[6];
            if (fa1Var2 != null) {
                fa1Var2.n = true;
            }
            fa1 fa1Var3 = fa1VarArr2[7];
            if (fa1Var3 != null) {
                fa1Var3.o = true;
            }
            pa1 pa1Var = new pa1();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i24 = (int) (d15 - d16);
            float abs4 = d16 == 0.0d ? 0.0f : Math.abs((i24 / ((float) d16)) * 100.0f);
            pa1Var.a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            pa1Var.b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i24 == 0 || abs4 == 0.0f) {
                pa1Var.c = "";
            } else {
                int i25 = (int) abs4;
                if (abs4 == i25) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i24 > 0 ? str3 : "");
                    sb8.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    pa1Var.c = sb8.toString() + " (" + i25 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i24 > 0 ? str3 : "");
                    sb9.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    pa1Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str);
                }
            }
            pa1Var.d = i24 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i26 = (int) (d17 - d18);
            float abs5 = d18 == 0.0d ? 0.0f : Math.abs((i26 / ((float) d18)) * 100.0f);
            pa1Var.i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            pa1Var.j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i26 == 0 || abs5 == 0.0f) {
                pa1Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i26 > 0 ? str3 : "");
                sb10.append(AndroidUtilities.formatWholeNumber(i26, 0));
                pa1Var.k = sb10.toString();
            }
            pa1Var.l = i26 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            float abs6 = d20 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d20)) * 100.0f);
            pa1Var.m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            pa1Var.n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i27 == 0 || abs6 == 0.0f) {
                pa1Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i27 > 0 ? str3 : "");
                sb11.append(AndroidUtilities.formatWholeNumber(i27, 0));
                pa1Var.o = sb11.toString();
            }
            pa1Var.p = i27 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d21 - d22);
            float abs7 = d22 == 0.0d ? 0.0f : Math.abs((i28 / ((float) d22)) * 100.0f);
            pa1Var.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            pa1Var.f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i28 == 0 || abs7 == 0.0f) {
                pa1Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i28 > 0 ? str3 : "");
                sb12.append(AndroidUtilities.formatWholeNumber(i28, 0));
                pa1Var.g = sb12.toString();
            }
            pa1Var.h = i28 >= 0;
            ta1Var.G = pa1Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            ta1Var.e0 = tL_statsDateRangeDays2.max_date * 1000;
            ta1Var.f0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ma1 ma1Var = new ma1();
                    ma1Var.a = ma1.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb13 = new StringBuilder();
                    int i30 = tL_statsGroupTopPoster.messages;
                    if (i30 > 0) {
                        sb13.append(LocaleController.formatPluralString("messages", i30, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    ma1Var.b = sb13.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(ma1Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(ma1Var);
                    i29++;
                    arrayList2 = arrayList3;
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
                    ArrayList arrayList19 = ta1Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ma1 ma1Var2 = new ma1();
                    ma1Var2.a = ma1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb14 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb14.append(LocaleController.formatPluralString("Deletions", i32, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    ma1Var2.b = sb14.toString();
                    arrayList19.add(ma1Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = ta1Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ma1 ma1Var3 = new ma1();
                    ma1Var3.a = ma1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        ma1Var3.b = LocaleController.formatPluralString("Invitations", i34, new Object[0]);
                    } else {
                        ma1Var3.b = "";
                    }
                    arrayList22.add(ma1Var3);
                }
            }
            final int i35 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(ta1Var) { // from class: org.telegram.ui.n91
                public final /* synthetic */ ta1 b;

                {
                    this.b = ta1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i35) {
                        case 0:
                            ta1 ta1Var2 = this.b;
                            ta1Var2.getClass();
                            fa1[] fa1VarArr22 = fa1VarArr2;
                            ta1Var2.r = fa1VarArr22[0];
                            ta1Var2.h = fa1VarArr22[1];
                            ta1Var2.e = fa1VarArr22[2];
                            ta1Var2.n = fa1VarArr22[3];
                            ta1Var2.d = fa1VarArr22[4];
                            ta1Var2.s = fa1VarArr22[5];
                            ta1Var2.v = fa1VarArr22[6];
                            ta1Var2.w = fa1VarArr22[7];
                            ta1Var2.x = fa1VarArr22[8];
                            ta1Var2.y = fa1VarArr22[9];
                            ta1Var2.E = fa1VarArr22[10];
                            ta1Var2.F = fa1VarArr22[11];
                            ta1Var2.e0(fa1VarArr22);
                            break;
                        default:
                            ta1 ta1Var3 = this.b;
                            ta1Var3.getClass();
                            fa1[] fa1VarArr3 = fa1VarArr2;
                            ta1Var3.d = fa1VarArr3[0];
                            ta1Var3.H = fa1VarArr3[1];
                            ta1Var3.I = fa1VarArr3[2];
                            ta1Var3.J = fa1VarArr3[3];
                            ta1Var3.K = fa1VarArr3[4];
                            ta1Var3.L = fa1VarArr3[5];
                            ta1Var3.e = fa1VarArr3[6];
                            ta1Var3.M = fa1VarArr3[7];
                            ta1Var3.e0(fa1VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static /* synthetic */ void T(ta1 ta1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(ta1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            ta1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new m91(ta1Var, arrayList, 1));
    }

    public static void W(ta1 ta1Var) {
        sa1 sa1Var = ta1Var.Y;
        if (sa1Var != null) {
            sa1Var.b = true;
        }
        int childCount = ta1Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ta1Var.S.getChildAt(i10);
            if (childAt instanceof ea1) {
                ((ea1) childAt).b.t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 b0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new w5(-chat.id) : new ta1(bundle);
    }

    public static jg.b c0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new jg.b(jSONObject);
        }
        if (i10 == 1) {
            return new jg.c(jSONObject);
        }
        if (i10 == 2) {
            jg.d dVar = new jg.d(jSONObject);
            int length = ((jg.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                dVar.l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = dVar.l;
                    jArr[i11] = jArr[i11] + ((jg.a) dVar.d.get(i12)).a[i11];
                }
            }
            dVar.m = new SegmentTree(dVar.l);
            return dVar;
        }
        if (i10 != 4) {
            return null;
        }
        jg.e eVar = new jg.e(jSONObject);
        if (z10) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j3 = 0;
            for (int i13 = 0; i13 < eVar.d.size(); i13++) {
                int length2 = eVar.a.length;
                for (int i14 = 0; i14 < length2; i14++) {
                    long j10 = ((jg.a) eVar.d.get(i13)).a[i14];
                    jArr2[i13] = jArr2[i13] + j10;
                    if (j10 == 0) {
                        iArr[i13] = iArr[i13] + 1;
                    }
                }
                j3 += jArr2[i13];
            }
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < eVar.d.size(); i15++) {
                if (jArr2[i15] / j3 < 0.01d && iArr[i15] > eVar.a.length / 2.0f) {
                    arrayList.add((jg.a) eVar.d.get(i15));
                }
            }
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj = arrayList.get(i16);
                i16++;
                eVar.d.remove((jg.a) obj);
            }
        }
        int length3 = ((jg.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i17 = 0; i17 < length3; i17++) {
            eVar.l[i17] = 0;
            for (int i18 = 0; i18 < size3; i18++) {
                long[] jArr3 = eVar.l;
                jArr3[i17] = jArr3[i17] + ((jg.a) eVar.d.get(i18)).a[i17];
            }
        }
        new SegmentTree(eVar.l);
        return eVar;
    }

    public static fa1 d0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        fa1 fa1Var = new fa1(str, i10);
        fa1Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                jg.b c02 = c0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                fa1Var.d = c02;
                if (c02 != null) {
                    c02.h = statsGraph.rate;
                }
                fa1Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (c02 == null || (jArr2 = c02.a) == null || jArr2.length < 2) {
                    fa1Var.l = true;
                }
                if (i10 == 4 && c02 != null && (jArr = c02.a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    fa1Var.e = new jg.e(c02, j3);
                    fa1Var.c = j3;
                    return fa1Var;
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            fa1Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return fa1Var;
    }

    public static void i0(fa1 fa1Var, ArrayList arrayList, org.telegram.ui.ActionBar.j6 j6Var) {
        jg.b bVar;
        if (fa1Var == null || (bVar = fa1Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            jg.a aVar = (jg.a) obj;
            int i11 = aVar.g;
            if (i11 >= 0) {
                if (!org.telegram.ui.ActionBar.i6.c1(i11)) {
                    org.telegram.ui.ActionBar.i6.u1(aVar.g, org.telegram.ui.ActionBar.i6.I == org.telegram.ui.ActionBar.i6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.i6.nl[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, aVar.g));
            }
        }
    }

    public static void j0(View view) {
        if (view instanceof ea1) {
            ((ea1) view).d();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.b7) {
            org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false)), org.telegram.ui.ActionBar.i6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.b7), 0, 0);
            sqVar.w = true;
            view.setBackground(sqVar);
            return;
        }
        if (view instanceof kg.c) {
            ((kg.c) view).a();
        } else if (view instanceof na1) {
            int i10 = na1.d;
            ((na1) view).b();
        }
    }

    public final void Z() {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.k0 != null) {
            int dp = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
            ViewGroup.LayoutParams layoutParams = this.k0.getLayoutParams();
            if (layoutParams.height != dp) {
                layoutParams.height = dp;
                this.k0.setLayoutParams(layoutParams);
            }
            n0();
        }
        int dp2 = this.c ? AndroidUtilities.dp(72.0f) : 0;
        AndroidUtilities.setViewLayoutMargins(this.R.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.b, AndroidUtilities.dp(6.0f), 0);
        this.p0.setPadding(0, 0, 0, this.mSystemInsets.d);
        s91 s91Var = this.S;
        if (s91Var != null) {
            i0.b bVar = this.mSystemInsets;
            li.a.c(s91Var, bVar.b, bVar.d, currentActionBarHeight, dp2);
        }
        dc dcVar = this.i0;
        if (dcVar != null) {
            org.telegram.ui.Components.zl0 zl0Var = dcVar.F;
            i0.b bVar2 = this.mSystemInsets;
            li.a.c(zl0Var, bVar2.b, bVar2.d, currentActionBarHeight, dp2);
        }
        me meVar = this.j0;
        if (meVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i10 = bVar3.b;
            int i11 = bVar3.d;
            meVar.U0 = i10;
            meVar.V0 = i11;
            meVar.W0 = dp2;
            int C = org.telegram.messenger.bi.C(48.0f, i10, -AndroidUtilities.dp(8.0f));
            int C2 = org.telegram.messenger.bi.C(48.0f, i11, -AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.e71 e71Var = meVar.X0;
            AndroidUtilities.setViewLayoutMargins(e71Var, 0, C, 0, C2);
            e71Var.setPadding(e71Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - C, e71Var.getPaddingRight(), (i11 + dp2) - C2);
            meVar.z(-C, -C2);
            meVar.B();
            meVar.requestLayout();
            meVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i10;
        ta1 ta1Var = this;
        ta1Var.setHasOwnBackground(true);
        ta1Var.Z = new ig.f(null);
        MessagesController messagesController = MessagesController.getInstance(ta1Var.currentAccount);
        long j3 = ta1Var.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(ta1Var.currentAccount).getChatFull(j3);
        boolean z10 = chatFull != null && chatFull.can_view_stats;
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z11 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(oh.b.b(context, ta1Var.resourceProvider, oh.a.I, R.string.Statistics));
        }
        arrayList.add(oh.b.b(context, ta1Var.resourceProvider, oh.a.N, R.string.Boosts));
        if (z11) {
            arrayList.add(oh.b.b(context, ta1Var.resourceProvider, oh.a.O, R.string.Monetization));
        }
        ta1Var.q0 = (oh.b[]) arrayList.toArray(new oh.b[0]);
        eh0 eh0Var = new eh0(context, ta1Var.resourceProvider);
        ta1Var.o0 = eh0Var;
        eh0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        ta1Var.o0.setMaxWidth(AndroidUtilities.dp(344.0f));
        ta1Var.o0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        ta1Var.p0 = frameLayout2;
        frameLayout2.setOnClickListener(new ai.e2(20));
        ta1Var.p0.addView(ta1Var.o0, w7.z5.e(-1, 72, 81));
        ta1Var.p0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = ta1Var.q0;
            if (i11 >= bVarArr.length) {
                break;
            }
            oh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ci.n4(ta1Var, i11, 25));
            ta1Var.o0.addView(ta1Var.q0[i11]);
            ta1Var.o0.i(bVar, true, false);
            i11++;
        }
        ta1Var.h0 = new q91(ta1Var, ta1Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (isBoostSupported) {
            dc dcVar = new dc(ta1Var, -j3, ta1Var.getResourceProvider());
            ta1Var.i0 = dcVar;
            dcVar.F.setCaptureSectionsDecoratorAllowed(true);
            ta1Var.glassEngine.b(ta1Var.i0.F);
        }
        if (z11) {
            frameLayout = frameLayout3;
            i10 = -1;
            me meVar = new me(ta1Var.getParentActivity(), ta1Var, ta1Var.currentAccount, -j3, ta1Var.getResourceProvider(), ta1Var.glassEngine, ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            ta1Var = ta1Var;
            ta1Var.j0 = meVar;
            meVar.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i10 = -1;
        }
        boolean z12 = z10;
        FrameLayout frameLayout4 = frameLayout;
        ta1Var.h0.setAdapter(new r91(ta1Var, z12, isBoostSupported, z11, frameLayout4));
        boolean z13 = ta1Var.n0;
        boolean z14 = isBoostSupported && !z13;
        ta1Var.c = z14;
        if (z14 && ta1Var.c0) {
            ta1Var.h0.setPosition(z12 ? 1 : 0);
        } else if (z14 && ta1Var.d0) {
            ta1Var.h0.setPosition(((z13 || !isBoostSupported) ? 0 : 1) + (z12 ? 1 : 0));
        }
        ta1Var.k0(ta1Var.h0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(ta1Var.getParentActivity());
        frameLayout5.addView(ta1Var.h0, w7.z5.g());
        View view = new View(context);
        ta1Var.k0 = view;
        frameLayout5.addView(view, w7.z5.e(i10, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        ta1Var.l0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(ta1Var.l0, w7.z5.g());
        frameLayout5.addView(ta1Var.actionBar);
        if (ta1Var.c) {
            ta1Var.setBulletinDelegate(new ci.z8(12));
            ta1Var.p0.setBackground(ta1Var.getBaseSimpleGlass().b(ta1Var.p0));
            frameLayout5.addView(ta1Var.p0, w7.z5.e(i10, -2, 80));
        }
        ta1Var.fragmentView = frameLayout5;
        s91 s91Var = new s91(ta1Var, context);
        ta1Var.S = s91Var;
        s91Var.setCaptureSectionsDecoratorAllowed(true);
        ta1Var.S.setSections(true);
        ta1Var.S.setClipToPadding(false);
        ta1Var.glassEngine.b(ta1Var.S);
        ta1Var.S.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        ta1Var.a0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.nj0 nj0Var = new org.telegram.ui.Components.nj0(context);
        ta1Var.V = nj0Var;
        nj0Var.setAutoRepeat(true);
        ta1Var.V.f(R.raw.statistic_preload, 120, 120, null);
        ta1Var.V.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.i6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i13 = org.telegram.ui.ActionBar.i6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        textView2.setTag(Integer.valueOf(i13));
        org.telegram.messenger.bi.k(R.string.LoadingStatsDescription, textView2, 1);
        ta1Var.a0.addView(ta1Var.V, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        ta1Var.a0.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        ta1Var.a0.addView(textView2, w7.z5.q(-2, -2, 1));
        frameLayout4.addView(ta1Var.a0, w7.z5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (ta1Var.W == null) {
            ta1Var.W = new y91(ta1Var);
        }
        ta1Var.S.setAdapter(ta1Var.W);
        s4.c0 c0Var = new s4.c0();
        ta1Var.T = c0Var;
        ta1Var.S.setLayoutManager(c0Var);
        ta1Var.X = new t91();
        ta1Var.S.setItemAnimator(null);
        ta1Var.S.j(new u91(ta1Var, 0));
        ta1Var.S.setOnItemClickListener(new t21(ta1Var, 7));
        ta1Var.S.setOnItemLongClickListener(new p91(ta1Var));
        frameLayout4.addView(ta1Var.S);
        ta1Var.R = new org.telegram.ui.Components.ho(context, null, false, null);
        TLRPC.Chat chat2 = ta1Var.getMessagesController().getChat(Long.valueOf(j3));
        ta1Var.R.setChatAvatar(chat2);
        hg.c.u(false, ta1Var.actionBar);
        ta1Var.actionBar.setTitle(chat2 == null ? "" : chat2.title);
        ta1Var.actionBar.setActionBarMenuOnItemClick(new p81(ta1Var, 1));
        org.telegram.ui.Components.ho hoVar = ta1Var.R;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i12, false);
        int w03 = org.telegram.ui.ActionBar.i6.w0(null, i13, false);
        hoVar.h.setTextColor(w02);
        hl hlVar = hoVar.r;
        hlVar.setTextColor(w03);
        hlVar.setTag(Integer.valueOf(w03));
        ta1Var.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, i12, false), false);
        ta1Var.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, i12, false), true);
        ta1Var.actionBar.z(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.z8, false), false);
        boolean z15 = ta1Var.A0;
        x5 x5Var = ta1Var.E0;
        if (z15) {
            ta1Var.a0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(x5Var, 500L);
            ta1Var.a0.setVisibility(0);
            ta1Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            ta1Var.a0.setVisibility(8);
            ta1Var.S.setVisibility(0);
        }
        ch.d c10 = ta1Var.getBaseSimpleGlass().c.c(ta1Var.o0, eh.b.f(ta1Var.resourceProvider), false);
        c10.y(AndroidUtilities.dp(28.0f));
        c10.x(AndroidUtilities.dp(7.666f));
        ta1Var.o0.setBackground(c10);
        ta1Var.glassEngine.c(ta1Var.h0);
        ta1Var.getBaseSimpleGlass().e(frameLayout5, ta1Var.h0, ta1Var.actionBar, ta1Var.resourceProvider);
        ta1Var.m0 = new le.b(0, new p91(ta1Var), org.telegram.ui.Components.tr.h, 380L, false);
        me meVar2 = ta1Var.j0;
        if (meVar2 != null) {
            li.a baseSimpleGlass = ta1Var.getBaseSimpleGlass();
            View view2 = meVar2.a1.d;
            ch.d c11 = baseSimpleGlass.c.c(view2, null, false);
            c11.w(eh.b.m(meVar2.n0));
            c11.x(AndroidUtilities.dp(9.66f));
            c11.y(AndroidUtilities.dp(18.0f));
            view2.setBackground(c11);
            View transactionTabs = ta1Var.j0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            AndroidUtilities.removeFromParent(transactionTabs);
            ta1Var.l0.addView(transactionTabs, layoutParams);
            ta1Var.j0.setTabsPinnedChangedListener(new hz0(ta1Var, 19));
            ta1Var.m0.a(ta1Var.j0.e0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new yk(ta1Var, 1));
        ta1Var.getBaseSimpleGlass().i = new iw(ta1Var, frameLayout5, new d6(1, frameLayout5), 1);
        ta1Var.getBaseSimpleGlass().h = null;
        ta1Var.actionBar.setBackground(null);
        ta1Var.k0.setBackground(ta1Var.getBaseSimpleGlass().a(ta1Var.k0));
        AndroidUtilities.removeFromParent(ta1Var.R.e);
        frameLayout5.addView(ta1Var.R.e, w7.z5.e(42, 42, 53));
        ta1Var.Z();
        ta1Var.fragmentView.setBackgroundColor(ta1Var.getThemedColor(org.telegram.ui.ActionBar.i6.a7));
        ta1Var.B0 = new ga1(ta1Var.W, ta1Var.T);
        return ta1Var.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ai.d9) objArr[0]) == this.C0) {
                h0();
                m0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.B0.f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.n2) sa.e.h(2, fragmentStack) : null;
            if (n2Var instanceof to) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.n2 n2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.n2) sa.e.h(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (n2Var2 instanceof ProfileActivity) {
                    tg.i.f(n2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.n2) sa.e.h(3, fragmentStack2) : null;
            if (n2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var2, false);
            }
            finishFragment();
            if (n2Var3 instanceof yn) {
                tg.i.f(n2Var3, chat, true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagesDidLoad) {
            if (i10 == NotificationCenter.chatInfoDidLoad) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.b && this.a == null) {
                    this.a = chatFull;
                    g0();
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
                MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                int i14 = this.s0.get(messageObject.getId(), -1);
                if (i14 >= 0 && ((qa1) arrayList.get(i14)).b() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList3.add((qa1) arrayList.get(i14));
                    } else {
                        ((qa1) arrayList.get(i14)).b = messageObject;
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
                qa1 qa1Var = (qa1) arrayList.get(i12);
                if (qa1Var.b == null) {
                    this.r0 = qa1Var.b();
                    break;
                } else {
                    arrayList4.add(qa1Var);
                    i12++;
                }
            }
            if (arrayList4.size() < 20) {
                f0();
            }
            m0();
            if (this.W != null) {
                this.S.setItemAnimator(null);
                this.B0.f();
            }
        }
    }

    public final void e0(fa1[] fa1VarArr) {
        y91 y91Var = this.W;
        if (y91Var != null) {
            y91Var.E();
            this.S.setItemAnimator(null);
            this.W.l();
        }
        this.A0 = false;
        LinearLayout linearLayout = this.a0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.E0);
        this.a0.animate().alpha(0.0f).setDuration(230L).setListener(new ap0(this, 22));
        this.S.setVisibility(0);
        this.S.setAlpha(0.0f);
        this.S.animate().alpha(1.0f).setDuration(230L).start();
        for (fa1 fa1Var : fa1VarArr) {
            if (fa1Var != null && fa1Var.d == null && fa1Var.f != null) {
                fa1Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new org.telegram.ui.Components.s61(1, this, fa1Var));
            }
        }
    }

    public final void f0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.u0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.s0.get(this.r0); i11 < size; i11++) {
            if (((qa1) arrayList.get(i11)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((qa1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.b);
        this.z0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new l91(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.n0) {
            return;
        }
        boolean z10 = this.b0;
        long j3 = this.b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new l91(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        qy0 qy0Var = new qy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{kg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.x6));
        int i13 = org.telegram.ui.ActionBar.i6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.b0) {
            int i14 = 0;
            while (i14 < 6) {
                i0(i14 == 0 ? this.d : i14 == 1 ? this.H : i14 == 2 ? this.I : i14 == 3 ? this.J : i14 == 4 ? this.K : this.L, arrayList, qy0Var);
                i14++;
            }
        } else {
            int i15 = 0;
            while (i15 < 12) {
                i0(i15 == 0 ? this.d : i15 == 1 ? this.h : i15 == 2 ? this.n : i15 == 3 ? this.r : i15 == 4 ? this.s : i15 == 5 ? this.v : i15 == 6 ? this.x : i15 == 7 ? this.e : i15 == 8 ? this.w : i15 == 9 ? this.y : i15 == 10 ? this.E : this.F, arrayList, qy0Var);
                i15++;
            }
        }
        return arrayList;
    }

    public final void h0() {
        ArrayList arrayList = this.x0;
        arrayList.clear();
        ArrayList arrayList2 = this.w0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            qa1 qa1Var = (qa1) obj;
            MessageObject f7 = this.C0.f(qa1Var.b());
            if (f7 != null) {
                qa1Var.b = f7;
                arrayList.add(qa1Var);
            }
        }
        this.t0.clear();
        arrayList2.clear();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        q91 q91Var;
        if (motionEvent != null && this.j0 != null && (q91Var = this.h0) != null) {
            View currentView = q91Var.getCurrentView();
            me meVar = this.j0;
            if (currentView == meVar && meVar.G((motionEvent.getX() - this.h0.getX()) - this.j0.getX(), (motionEvent.getY() - this.h0.getY()) - this.j0.getY())) {
                return false;
            }
        }
        q91 q91Var2 = this.h0;
        if (q91Var2 == null || (q91Var2.b == 0 && q91Var2.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void k0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.q0;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].e(i11 == i10, z10);
            i11++;
        }
    }

    public final void l0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.q0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            oh.b bVar = this.q0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.o0.invalidate();
    }

    public final void m0() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        arrayList.addAll(this.v0);
        arrayList.addAll(this.x0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0() {
        boolean z10;
        float f7;
        if (this.k0 == null || this.l0 == null) {
            return;
        }
        me meVar = this.j0;
        if (meVar != null && meVar.getParent() == this.h0) {
            me meVar2 = this.j0;
            if (meVar2.getVisibility() == 0 && meVar2.Y0.getVisibility() != 0) {
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
                le.b bVar = this.m0;
                this.k0.setTranslationY((-(1.0f - ((bVar != null ? bVar.e : 0.0f) * f7))) * AndroidUtilities.dp(44.0f));
            }
        }
        z10 = false;
        if (z10) {
        }
        this.l0.setVisibility((z10 || f7 <= 0.0f) ? 4 : 0);
        le.b bVar2 = this.m0;
        this.k0.setTranslationY((-(1.0f - ((bVar2 != null ? bVar2.e : 0.0f) * f7))) * AndroidUtilities.dp(44.0f));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.ObserversGroup observersGroup = this.F0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.F0 = null;
        }
        this.F0 = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.messagesDidLoad).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.boostByChannelCreated).add(NotificationCenter.storiesListUpdated);
        ai.l9 storiesController = getMessagesController().getStoriesController();
        long j3 = this.b;
        ai.d9 A = storiesController.A(-j3, 2, -1, true);
        this.C0 = A;
        if (A != null) {
            this.D0 = A.o();
        }
        if (this.a != null) {
            g0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j3, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.F0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.F0 = null;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.g0;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
            b2VarArr[0] = null;
        }
        ai.d9 d9Var = this.C0;
        if (d9Var != null) {
            d9Var.z(this.D0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        Z();
    }
}
