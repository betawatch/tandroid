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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y91 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public l91 B0;
    public di.z6 C0;
    public int D0;
    public k91 E;
    public final y5 E0;
    public k91 F;
    public NotificationCenter.ObserversGroup F0;
    public u91 G;
    public PorterDuffColorFilter G0;
    public k91 H;
    public int H0;
    public k91 I;
    public k91 J;
    public k91 K;
    public k91 L;
    public k91 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.po R;
    public x81 S;
    public s4.c0 T;
    public final LruCache U;
    public org.telegram.ui.Components.bk0 V;
    public d91 W;
    public y81 X;
    public x91 Y;
    public kg.g Z;
    public TLRPC.ChatFull a;
    public LinearLayout a0;
    public final long b;
    public final boolean b0;
    public boolean c;
    public final boolean c0;
    public k91 d;
    public final boolean d0;
    public k91 e;
    public long e0;
    public t91 f;
    public long f0;
    public final org.telegram.ui.ActionBar.e2[] g0;
    public k91 h;
    public v81 h0;
    public dc i0;
    public ke j0;
    public View k0;
    public FrameLayout l0;
    public oe.b m0;
    public k91 n;
    public final boolean n0;
    public tg0 o0;
    public FrameLayout p0;
    public qh.b[] q0;
    public k91 r;
    public int r0;
    public k91 s;
    public final SparseIntArray s0;
    public final SparseIntArray t0;
    public final ArrayList u0;
    public k91 v;
    public final ArrayList v0;
    public k91 w;
    public final ArrayList w0;
    public k91 x;
    public final ArrayList x0;
    public k91 y;
    public final ArrayList y0;
    public boolean z0;

    public y91(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.U = new LruCache(50);
        this.g0 = new org.telegram.ui.ActionBar.e2[1];
        this.r0 = -1;
        this.s0 = new SparseIntArray();
        this.t0 = new SparseIntArray();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.A0 = true;
        this.E0 = new y5(this, 14);
        long j10 = bundle.getLong("chat_id");
        this.b = j10;
        this.b0 = bundle.getBoolean("is_megagroup", false);
        this.c0 = bundle.getBoolean("start_from_boosts", false);
        this.d0 = bundle.getBoolean("start_from_monetization", false);
        this.n0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().getChatFull(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v54 */
    public static void V(final y91 y91Var, TLObject tLObject) {
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
        ArrayList arrayList5 = y91Var.N;
        ArrayList arrayList6 = y91Var.O;
        ArrayList arrayList7 = y91Var.u0;
        String str5 = "%";
        int i12 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final k91[] k91VarArr = {e0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), e0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), e0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), e0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), e0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), e0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), e0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), e0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), e0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), e0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), e0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), e0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            k91 k91Var = k91VarArr[2];
            if (k91Var != null) {
                k91Var.n = true;
            }
            t91 t91Var = new t91();
            ti.e a2 = t91.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            t91Var.o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            t91Var.p = (String) a2.b;
            t91Var.q = (String) a2.c;
            t91Var.r = ((Boolean) a2.d).booleanValue();
            t91Var.s = ((Boolean) a2.e).booleanValue();
            ti.e a10 = t91.a(tL_broadcastStats.reactions_per_story);
            t91Var.t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            t91Var.u = (String) a10.b;
            t91Var.v = (String) a10.c;
            t91Var.w = ((Boolean) a10.d).booleanValue();
            t91Var.x = ((Boolean) a10.e).booleanValue();
            ti.e a11 = t91.a(tL_broadcastStats.views_per_story);
            t91Var.y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            t91Var.z = (String) a11.b;
            t91Var.A = (String) a11.c;
            t91Var.B = ((Boolean) a11.d).booleanValue();
            t91Var.C = ((Boolean) a11.e).booleanValue();
            ti.e a12 = t91.a(tL_broadcastStats.shares_per_story);
            t91Var.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            t91Var.E = (String) a12.b;
            t91Var.F = (String) a12.c;
            t91Var.G = ((Boolean) a12.d).booleanValue();
            t91Var.H = ((Boolean) a12.e).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i13 = (int) (d - d10);
            float abs = d10 == 0.0d ? 0.0f : Math.abs((i13 / ((float) d10)) * 100.0f);
            t91Var.a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            t91Var.b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i13 == 0 || abs == 0.0f) {
                i10 = i13;
                t91Var.c = "";
            } else {
                int i14 = (int) abs;
                if (abs == i14) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13 > 0 ? str3 : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    t91Var.c = sb2.toString() + " (" + i14 + "%)";
                    i10 = i13;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i13 > 0 ? str3 : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    i10 = i13;
                    t91Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            t91Var.d = i10 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i15 = (int) (d11 - d12);
            float abs2 = d12 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d12)) * 100.0f);
            t91Var.i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            t91Var.j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i15 == 0 || abs2 == 0.0f) {
                t91Var.k = "";
            } else {
                int i16 = (int) abs2;
                if (abs2 == i16) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i15 > 0 ? str3 : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    t91Var.k = sb4.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i15 > 0 ? str3 : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    t91Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            t91Var.l = i15 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i17 = (int) (d13 - d14);
            float abs3 = d14 == 0.0d ? 0.0f : Math.abs((i17 / ((float) d14)) * 100.0f);
            t91Var.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            t91Var.f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i17 == 0 || abs3 == 0.0f) {
                t91Var.g = "";
            } else {
                int i18 = (int) abs3;
                if (abs3 == i18) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i17 > 0 ? str3 : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    t91Var.g = sb6.toString() + " (" + i18 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i17 > 0 ? str3 : "");
                    sb7.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    t91Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            t91Var.h = i17 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            t91Var.m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i19 = (int) f7;
            if (f7 == i19) {
                Locale locale7 = Locale.ENGLISH;
                t91Var.n = a1.g.m(i19, "%");
            } else {
                t91Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            y91Var.f = t91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            y91Var.e0 = tL_statsDateRangeDays.max_date * 1000;
            y91Var.f0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i22 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i22);
                int i23 = i22 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                v91 v91Var = new v91();
                v91Var.a = postInteractionCounters2;
                int i24 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(v91Var);
                    str4 = str5;
                    i11 = i23;
                    y91Var.s0.put(v91Var.b(), i20);
                    i20++;
                } else {
                    i11 = i23;
                    arrayList4 = arrayList8;
                    str4 = str5;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(v91Var.b()));
                    y91Var.w0.add(v91Var);
                    y91Var.t0.put(v91Var.b(), i21);
                    i21++;
                }
                arrayList10 = arrayList11;
                str5 = str4;
                i22 = i11;
                arrayList8 = arrayList4;
                size = i24;
            }
            ArrayList arrayList12 = arrayList8;
            str = str5;
            AndroidUtilities.runOnUIThread(new r81(y91Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                y91Var.getMessagesStorage().getMessages(-y91Var.b, 0L, false, arrayList12.size(), ((v91) arrayList12.get(0)).b(), 0, 0, y91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            r15 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            AndroidUtilities.runOnUIThread(new Runnable(y91Var) { // from class: org.telegram.ui.s81
                public final /* synthetic */ y91 b;

                {
                    this.b = y91Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (objArr) {
                        case 0:
                            y91 y91Var2 = this.b;
                            y91Var2.getClass();
                            k91[] k91VarArr2 = k91VarArr;
                            y91Var2.r = k91VarArr2[0];
                            y91Var2.h = k91VarArr2[1];
                            y91Var2.e = k91VarArr2[2];
                            y91Var2.n = k91VarArr2[3];
                            y91Var2.d = k91VarArr2[4];
                            y91Var2.s = k91VarArr2[5];
                            y91Var2.v = k91VarArr2[6];
                            y91Var2.w = k91VarArr2[7];
                            y91Var2.x = k91VarArr2[8];
                            y91Var2.y = k91VarArr2[9];
                            y91Var2.E = k91VarArr2[10];
                            y91Var2.F = k91VarArr2[11];
                            y91Var2.f0(k91VarArr2);
                            break;
                        default:
                            y91 y91Var3 = this.b;
                            y91Var3.getClass();
                            k91[] k91VarArr3 = k91VarArr;
                            y91Var3.d = k91VarArr3[0];
                            y91Var3.H = k91VarArr3[1];
                            y91Var3.I = k91VarArr3[2];
                            y91Var3.J = k91VarArr3[3];
                            y91Var3.K = k91VarArr3[4];
                            y91Var3.L = k91VarArr3[5];
                            y91Var3.e = k91VarArr3[6];
                            y91Var3.M = k91VarArr3[7];
                            y91Var3.f0(k91VarArr3);
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
            k91 e02 = e0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), r15, r15);
            k91 e03 = e0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), r15, r15);
            k91 e04 = e0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, r15);
            k91 e05 = e0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true);
            k91 e06 = e0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, r15);
            k91 e07 = e0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, r15);
            k91 e08 = e0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), r15, r15);
            k91 e09 = e0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, r15);
            final k91[] k91VarArr2 = new k91[8];
            k91VarArr2[r15] = e02;
            k91VarArr2[1] = e03;
            k91VarArr2[2] = e04;
            k91VarArr2[3] = e05;
            k91VarArr2[4] = e06;
            k91VarArr2[5] = e07;
            k91VarArr2[6] = e08;
            k91VarArr2[7] = e09;
            k91 k91Var2 = k91VarArr2[6];
            if (k91Var2 != null) {
                k91Var2.n = true;
            }
            k91 k91Var3 = k91VarArr2[7];
            if (k91Var3 != null) {
                k91Var3.o = true;
            }
            u91 u91Var = new u91();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i25 = (int) (d15 - d16);
            float abs4 = d16 == 0.0d ? 0.0f : Math.abs((i25 / ((float) d16)) * 100.0f);
            u91Var.a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            u91Var.b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i25 == 0 || abs4 == 0.0f) {
                u91Var.c = "";
            } else {
                int i26 = (int) abs4;
                if (abs4 == i26) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i25 > 0 ? str3 : "");
                    sb8.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    u91Var.c = sb8.toString() + " (" + i26 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i25 > 0 ? str3 : "");
                    sb9.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    u91Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str);
                }
            }
            u91Var.d = i25 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i27 = (int) (d17 - d18);
            float abs5 = d18 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d18)) * 100.0f);
            u91Var.i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            u91Var.j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i27 == 0 || abs5 == 0.0f) {
                u91Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i27 > 0 ? str3 : "");
                sb10.append(AndroidUtilities.formatWholeNumber(i27, 0));
                u91Var.k = sb10.toString();
            }
            u91Var.l = i27 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i28 = (int) (d19 - d20);
            float abs6 = d20 == 0.0d ? 0.0f : Math.abs((i28 / ((float) d20)) * 100.0f);
            u91Var.m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            u91Var.n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i28 == 0 || abs6 == 0.0f) {
                u91Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i28 > 0 ? str3 : "");
                sb11.append(AndroidUtilities.formatWholeNumber(i28, 0));
                u91Var.o = sb11.toString();
            }
            u91Var.p = i28 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i29 = (int) (d21 - d22);
            float abs7 = d22 == 0.0d ? 0.0f : Math.abs((i29 / ((float) d22)) * 100.0f);
            u91Var.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            u91Var.f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i29 == 0 || abs7 == 0.0f) {
                u91Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i29 > 0 ? str3 : "");
                sb12.append(AndroidUtilities.formatWholeNumber(i29, 0));
                u91Var.g = sb12.toString();
            }
            u91Var.h = i29 >= 0;
            y91Var.G = u91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            y91Var.e0 = tL_statsDateRangeDays2.max_date * 1000;
            y91Var.f0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i30 = 0;
                while (i30 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i30);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    r91 r91Var = new r91();
                    r91Var.a = r91.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb13 = new StringBuilder();
                    int i31 = tL_statsGroupTopPoster.messages;
                    if (i31 > 0) {
                        sb13.append(LocaleController.formatPluralString("messages", i31, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    r91Var.b = sb13.toString();
                    int i32 = i12;
                    if (arrayList2.size() < i32) {
                        arrayList3 = arrayList2;
                        arrayList3.add(r91Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(r91Var);
                    i30++;
                    arrayList2 = arrayList3;
                    i12 = i32;
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
                for (int i33 = 0; i33 < tL_megagroupStats.top_admins.size(); i33++) {
                    ArrayList arrayList19 = y91Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i33);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    r91 r91Var2 = new r91();
                    r91Var2.a = r91.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb14 = new StringBuilder();
                    int i34 = tL_statsGroupTopAdmin.deleted;
                    if (i34 > 0) {
                        sb14.append(LocaleController.formatPluralString("Deletions", i34, new Object[0]));
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
                    r91Var2.b = sb14.toString();
                    arrayList19.add(r91Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i35 = 0; i35 < tL_megagroupStats.top_inviters.size(); i35++) {
                    ArrayList arrayList22 = y91Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i35);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    r91 r91Var3 = new r91();
                    r91Var3.a = r91.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i36 = tL_statsGroupTopInviter.invitations;
                    if (i36 > 0) {
                        r91Var3.b = LocaleController.formatPluralString("Invitations", i36, new Object[0]);
                    } else {
                        r91Var3.b = "";
                    }
                    arrayList22.add(r91Var3);
                }
            }
            final int i37 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(y91Var) { // from class: org.telegram.ui.s81
                public final /* synthetic */ y91 b;

                {
                    this.b = y91Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i37) {
                        case 0:
                            y91 y91Var2 = this.b;
                            y91Var2.getClass();
                            k91[] k91VarArr22 = k91VarArr2;
                            y91Var2.r = k91VarArr22[0];
                            y91Var2.h = k91VarArr22[1];
                            y91Var2.e = k91VarArr22[2];
                            y91Var2.n = k91VarArr22[3];
                            y91Var2.d = k91VarArr22[4];
                            y91Var2.s = k91VarArr22[5];
                            y91Var2.v = k91VarArr22[6];
                            y91Var2.w = k91VarArr22[7];
                            y91Var2.x = k91VarArr22[8];
                            y91Var2.y = k91VarArr22[9];
                            y91Var2.E = k91VarArr22[10];
                            y91Var2.F = k91VarArr22[11];
                            y91Var2.f0(k91VarArr22);
                            break;
                        default:
                            y91 y91Var3 = this.b;
                            y91Var3.getClass();
                            k91[] k91VarArr3 = k91VarArr2;
                            y91Var3.d = k91VarArr3[0];
                            y91Var3.H = k91VarArr3[1];
                            y91Var3.I = k91VarArr3[2];
                            y91Var3.J = k91VarArr3[3];
                            y91Var3.K = k91VarArr3[4];
                            y91Var3.L = k91VarArr3[5];
                            y91Var3.e = k91VarArr3[6];
                            y91Var3.M = k91VarArr3[7];
                            y91Var3.f0(k91VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static /* synthetic */ void W(y91 y91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(y91Var.currentAccount, arrayList2.get(i10), false, true));
            }
            y91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new r81(y91Var, arrayList, 1));
    }

    public static void Y(y91 y91Var) {
        x91 x91Var = y91Var.Y;
        if (x91Var != null) {
            x91Var.b = true;
        }
        int childCount = y91Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = y91Var.S.getChildAt(i10);
            if (childAt instanceof j91) {
                ((j91) childAt).b.t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.r2 c0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new x5(-chat.id) : new y91(bundle);
    }

    public static lg.b d0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new lg.b(jSONObject);
        }
        if (i10 == 1) {
            return new lg.c(jSONObject);
        }
        if (i10 == 2) {
            lg.d dVar = new lg.d(jSONObject);
            int length = ((lg.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                dVar.l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = dVar.l;
                    jArr[i11] = jArr[i11] + ((lg.a) dVar.d.get(i12)).a[i11];
                }
            }
            dVar.m = new SegmentTree(dVar.l);
            return dVar;
        }
        if (i10 != 4) {
            return null;
        }
        lg.e eVar = new lg.e(jSONObject);
        if (z10) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j10 = 0;
            for (int i13 = 0; i13 < eVar.d.size(); i13++) {
                int length2 = eVar.a.length;
                for (int i14 = 0; i14 < length2; i14++) {
                    long j11 = ((lg.a) eVar.d.get(i13)).a[i14];
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
                    arrayList.add((lg.a) eVar.d.get(i15));
                }
            }
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj = arrayList.get(i16);
                i16++;
                eVar.d.remove((lg.a) obj);
            }
        }
        int length3 = ((lg.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i17 = 0; i17 < length3; i17++) {
            eVar.l[i17] = 0;
            for (int i18 = 0; i18 < size3; i18++) {
                long[] jArr3 = eVar.l;
                jArr3[i17] = jArr3[i17] + ((lg.a) eVar.d.get(i18)).a[i17];
            }
        }
        new SegmentTree(eVar.l);
        return eVar;
    }

    public static k91 e0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        k91 k91Var = new k91(str, i10);
        k91Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                lg.b d02 = d0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                k91Var.d = d02;
                if (d02 != null) {
                    d02.h = statsGraph.rate;
                }
                k91Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (d02 == null || (jArr2 = d02.a) == null || jArr2.length < 2) {
                    k91Var.l = true;
                }
                if (i10 == 4 && d02 != null && (jArr = d02.a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    k91Var.e = new lg.e(d02, j10);
                    k91Var.c = j10;
                    return k91Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            k91Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return k91Var;
    }

    public static void j0(k91 k91Var, ArrayList arrayList, org.telegram.ui.ActionBar.g7 g7Var) {
        lg.b bVar;
        if (k91Var == null || (bVar = k91Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            lg.a aVar = (lg.a) obj;
            int i11 = aVar.g;
            if (i11 >= 0) {
                if (!org.telegram.ui.ActionBar.y6.e1(i11)) {
                    org.telegram.ui.ActionBar.y6.x1(aVar.g, org.telegram.ui.ActionBar.y6.I == org.telegram.ui.ActionBar.y6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.y6.ql[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, aVar.g));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.dj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.bj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
    }

    public final void b0() {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.k0 != null) {
            int dp = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
            ViewGroup.LayoutParams layoutParams = this.k0.getLayoutParams();
            if (layoutParams.height != dp) {
                layoutParams.height = dp;
                this.k0.setLayoutParams(layoutParams);
            }
            p0();
        }
        int dp2 = this.c ? AndroidUtilities.dp(72.0f) : 0;
        AndroidUtilities.setViewLayoutMargins(this.R.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.b, AndroidUtilities.dp(6.0f), 0);
        this.p0.setPadding(0, 0, 0, this.mSystemInsets.d);
        x81 x81Var = this.S;
        if (x81Var != null) {
            i0.b bVar = this.mSystemInsets;
            oi.a.d(x81Var, bVar.b, bVar.d, currentActionBarHeight, dp2);
        }
        dc dcVar = this.i0;
        if (dcVar != null) {
            org.telegram.ui.Components.nm0 nm0Var = dcVar.F;
            i0.b bVar2 = this.mSystemInsets;
            oi.a.d(nm0Var, bVar2.b, bVar2.d, currentActionBarHeight, dp2);
        }
        ke keVar = this.j0;
        if (keVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i10 = bVar3.b;
            int i11 = bVar3.d;
            keVar.U0 = i10;
            keVar.V0 = i11;
            keVar.W0 = dp2;
            int g7 = d3.g(48.0f, i10, -AndroidUtilities.dp(8.0f));
            int g10 = d3.g(48.0f, i11, -AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.s71 s71Var = keVar.X0;
            AndroidUtilities.setViewLayoutMargins(s71Var, 0, g7, 0, g10);
            s71Var.setPadding(s71Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - g7, s71Var.getPaddingRight(), (i11 + dp2) - g10);
            keVar.z(-g7, -g10);
            keVar.B();
            keVar.requestLayout();
            keVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i10;
        y91 y91Var = this;
        y91Var.setHasOwnBackground(true);
        y91Var.Z = new kg.g(null);
        MessagesController messagesController = MessagesController.getInstance(y91Var.currentAccount);
        long j10 = y91Var.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(y91Var.currentAccount).getChatFull(j10);
        boolean z10 = chatFull != null && chatFull.can_view_stats;
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z11 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(qh.b.c(context, y91Var.resourceProvider, qh.a.I, R.string.Statistics));
        }
        arrayList.add(qh.b.c(context, y91Var.resourceProvider, qh.a.O, R.string.Boosts));
        if (z11) {
            arrayList.add(qh.b.c(context, y91Var.resourceProvider, qh.a.P, R.string.Monetization));
        }
        y91Var.q0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        tg0 tg0Var = new tg0(context, y91Var.resourceProvider);
        y91Var.o0 = tg0Var;
        tg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        y91Var.o0.setMaxWidth(AndroidUtilities.dp(344.0f));
        y91Var.o0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        y91Var.p0 = frameLayout2;
        frameLayout2.setOnClickListener(new bh.f(22));
        y91Var.p0.addView(y91Var.o0, org.telegram.ui.Components.kb1.i(-1, 72, 81));
        y91Var.p0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = y91Var.q0;
            if (i11 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new bw0(y91Var, i11, 2));
            y91Var.o0.addView(y91Var.q0[i11]);
            y91Var.o0.i(bVar, true, false);
            i11++;
        }
        y91Var.h0 = new v81(y91Var, y91Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (isBoostSupported) {
            dc dcVar = new dc(y91Var, -j10, y91Var.getResourceProvider());
            y91Var.i0 = dcVar;
            dcVar.F.setCaptureSectionsDecoratorAllowed(true);
            y91Var.glassEngine.b(y91Var.i0.F);
        }
        if (z11) {
            frameLayout = frameLayout3;
            i10 = -1;
            ke keVar = new ke(y91Var.getParentActivity(), y91Var, y91Var.currentAccount, -j10, y91Var.getResourceProvider(), y91Var.glassEngine, ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            y91Var = y91Var;
            y91Var.j0 = keVar;
            keVar.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i10 = -1;
        }
        boolean z12 = z10;
        FrameLayout frameLayout4 = frameLayout;
        y91Var.h0.setAdapter(new w81(y91Var, z12, isBoostSupported, z11, frameLayout4));
        boolean z13 = y91Var.n0;
        boolean z14 = isBoostSupported && !z13;
        y91Var.c = z14;
        if (z14 && y91Var.c0) {
            y91Var.h0.setPosition(z12 ? 1 : 0);
        } else if (z14 && y91Var.d0) {
            y91Var.h0.setPosition(((z13 || !isBoostSupported) ? 0 : 1) + (z12 ? 1 : 0));
        }
        y91Var.l0(y91Var.h0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(y91Var.getParentActivity());
        frameLayout5.addView(y91Var.h0, org.telegram.ui.Components.kb1.k());
        View view = new View(context);
        y91Var.k0 = view;
        frameLayout5.addView(view, org.telegram.ui.Components.kb1.i(i10, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        y91Var.l0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(y91Var.l0, org.telegram.ui.Components.kb1.k());
        frameLayout5.addView(y91Var.simpleActionBar);
        if (y91Var.c) {
            y91Var.setBulletinDelegate(new fi.k8(11));
            y91Var.p0.setBackground(y91Var.getBaseSimpleGlass().b(y91Var.p0));
            frameLayout5.addView(y91Var.p0, org.telegram.ui.Components.kb1.i(i10, -2, 80));
        }
        y91Var.fragmentView = frameLayout5;
        x81 x81Var = new x81(y91Var, context);
        y91Var.S = x81Var;
        x81Var.setCaptureSectionsDecoratorAllowed(true);
        y91Var.S.setSections(true);
        y91Var.S.setClipToPadding(false);
        y91Var.glassEngine.b(y91Var.S);
        y91Var.S.u1();
        LinearLayout linearLayout = new LinearLayout(context);
        y91Var.a0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        y91Var.V = bk0Var;
        bk0Var.setAutoRepeat(true);
        y91Var.V.f(R.raw.statistic_preload, 120, 120, null);
        y91Var.V.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.y6.Oi;
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        textView.setTag(Integer.valueOf(i12));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i13 = org.telegram.ui.ActionBar.y6.Pi;
        org.telegram.ui.ActionBar.f7.V(textView2, i13, null);
        textView2.setTag(Integer.valueOf(i13));
        org.telegram.messenger.wh.k(R.string.LoadingStatsDescription, textView2, 1);
        y91Var.a0.addView(y91Var.V, org.telegram.ui.Components.kb1.x(120, 120, 1, 0, 0, 0, 20));
        y91Var.a0.addView(textView, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 0, 0, 10));
        y91Var.a0.addView(textView2, org.telegram.ui.Components.kb1.u(-2, -2, 1));
        frameLayout4.addView(y91Var.a0, org.telegram.ui.Components.kb1.h(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (y91Var.W == null) {
            y91Var.W = new d91(y91Var);
        }
        y91Var.S.setAdapter(y91Var.W);
        s4.c0 c0Var = new s4.c0();
        y91Var.T = c0Var;
        y91Var.S.setLayoutManager(c0Var);
        y91Var.X = new y81();
        y91Var.S.setItemAnimator(null);
        y91Var.S.j(new z81(y91Var, 0));
        y91Var.S.setOnItemClickListener(new o11(y91Var, 7));
        y91Var.S.setOnItemLongClickListener(new u81(y91Var));
        frameLayout4.addView(y91Var.S);
        y91Var.R = new org.telegram.ui.Components.po(context, null, false, null);
        TLRPC.Chat chat2 = y91Var.getMessagesController().getChat(Long.valueOf(j10));
        y91Var.R.setChatAvatar(chat2);
        y91Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        y91Var.simpleActionBar.setTitle(chat2 == null ? "" : chat2.title);
        y91Var.simpleActionBar.setActionBarMenuOnItemClick(new r11(y91Var, 8));
        y91Var.R.i(org.telegram.ui.ActionBar.y6.x0(null, i12, false), org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        boolean z15 = y91Var.A0;
        y5 y5Var = y91Var.E0;
        if (z15) {
            y91Var.a0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(y5Var, 500L);
            y91Var.a0.setVisibility(0);
            y91Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            y91Var.a0.setVisibility(8);
            y91Var.S.setVisibility(0);
        }
        eh.d c10 = y91Var.getBaseSimpleGlass().c.c(y91Var.o0, gh.c.f(y91Var.resourceProvider), false);
        org.telegram.messenger.wh.s(c10, AndroidUtilities.dp(28.0f), 7.666f);
        y91Var.o0.setBackground(c10);
        y91Var.glassEngine.c(y91Var.h0);
        oi.a baseSimpleGlass = y91Var.getBaseSimpleGlass();
        v81 v81Var = y91Var.h0;
        org.telegram.ui.ActionBar.r5 r5Var = y91Var.simpleActionBar;
        org.telegram.ui.ActionBar.u6 u6Var = y91Var.resourceProvider;
        baseSimpleGlass.g = frameLayout5;
        baseSimpleGlass.h = v81Var;
        baseSimpleGlass.a.c(v81Var);
        baseSimpleGlass.f(frameLayout5, r5Var, u6Var);
        y91Var.m0 = new oe.b(0, new u81(y91Var), org.telegram.ui.Components.ds.h, 380L, false);
        ke keVar2 = y91Var.j0;
        if (keVar2 != null) {
            oi.a baseSimpleGlass2 = y91Var.getBaseSimpleGlass();
            View view2 = keVar2.a1.d;
            eh.d c11 = baseSimpleGlass2.c.c(view2, null, false);
            c11.v(gh.c.m(keVar2.n0));
            c11.w(AndroidUtilities.dp(9.66f));
            c11.x(AndroidUtilities.dp(18.0f));
            view2.setBackground(c11);
            View transactionTabs = y91Var.j0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            AndroidUtilities.removeFromParent(transactionTabs);
            y91Var.l0.addView(transactionTabs, layoutParams);
            y91Var.j0.setTabsPinnedChangedListener(new oy0(y91Var, 21));
            y91Var.m0.a(y91Var.j0.e0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new xk(y91Var, 1));
        y91Var.getBaseSimpleGlass().i = new vv(y91Var, frameLayout5, new e6(1, frameLayout5), 1);
        y91Var.getBaseSimpleGlass().h = null;
        y91Var.simpleActionBar.setBackground(null);
        y91Var.k0.setBackground(y91Var.getBaseSimpleGlass().a(y91Var.k0));
        AndroidUtilities.removeFromParent(y91Var.R.e);
        frameLayout5.addView(y91Var.R.e, org.telegram.ui.Components.kb1.i(42, 42, 53));
        y91Var.b0();
        y91Var.fragmentView.setBackgroundColor(y91Var.getThemedColor(org.telegram.ui.ActionBar.y6.a7));
        y91Var.B0 = new l91(y91Var.W, y91Var.T);
        return y91Var.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((di.z6) objArr[0]) == this.C0) {
                i0();
                n0();
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
            org.telegram.ui.ActionBar.r2 r2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(2, fragmentStack) : null;
            if (r2Var instanceof oo) {
                ((ActionBarLayout) getParentLayout()).c0(r2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.r2 r2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (r2Var2 instanceof ProfileActivity) {
                    vg.j.f(r2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.r2 r2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(3, fragmentStack2) : null;
            if (r2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).c0(r2Var2, false);
            }
            finishFragment();
            if (r2Var3 instanceof wn) {
                vg.j.f(r2Var3, chat, true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagesDidLoad) {
            if (i10 == NotificationCenter.chatInfoDidLoad) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.b && this.a == null) {
                    this.a = chatFull;
                    h0();
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
                if (i14 >= 0 && ((v91) arrayList.get(i14)).b() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList3.add((v91) arrayList.get(i14));
                    } else {
                        ((v91) arrayList.get(i14)).b = messageObject;
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
                v91 v91Var = (v91) arrayList.get(i12);
                if (v91Var.b == null) {
                    this.r0 = v91Var.b();
                    break;
                } else {
                    arrayList4.add(v91Var);
                    i12++;
                }
            }
            if (arrayList4.size() < 20) {
                g0();
            }
            n0();
            if (this.W != null) {
                this.S.setItemAnimator(null);
                this.B0.f();
            }
        }
    }

    public final void f0(k91[] k91VarArr) {
        d91 d91Var = this.W;
        if (d91Var != null) {
            d91Var.E();
            this.S.setItemAnimator(null);
            this.W.l();
        }
        this.A0 = false;
        LinearLayout linearLayout = this.a0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.E0);
        this.a0.animate().alpha(0.0f).setDuration(230L).setListener(new k50(this, 29));
        this.S.setVisibility(0);
        this.S.setAlpha(0.0f);
        this.S.animate().alpha(1.0f).setDuration(230L).start();
        for (k91 k91Var : k91VarArr) {
            if (k91Var != null && k91Var.d == null && k91Var.f != null) {
                k91Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new rh(2, this, k91Var));
            }
        }
    }

    public final void g0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.u0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.s0.get(this.r0); i11 < size; i11++) {
            if (((v91) arrayList.get(i11)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((v91) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.b);
        this.z0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new q81(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        j6 j6Var = new j6(22, this);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 0, new Class[]{mg.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.j5));
        if (this.b0) {
            while (i10 < 6) {
                j0(i10 == 0 ? this.d : i10 == 1 ? this.H : i10 == 2 ? this.I : i10 == 3 ? this.J : i10 == 4 ? this.K : this.L, arrayList, j6Var);
                i10++;
            }
        } else {
            while (i10 < 12) {
                j0(i10 == 0 ? this.d : i10 == 1 ? this.h : i10 == 2 ? this.n : i10 == 3 ? this.r : i10 == 4 ? this.s : i10 == 5 ? this.v : i10 == 6 ? this.x : i10 == 7 ? this.e : i10 == 8 ? this.w : i10 == 9 ? this.y : i10 == 10 ? this.E : this.F, arrayList, j6Var);
                i10++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.n0) {
            return;
        }
        boolean z10 = this.b0;
        long j10 = this.b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new q81(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void i0() {
        ArrayList arrayList = this.x0;
        arrayList.clear();
        ArrayList arrayList2 = this.w0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            v91 v91Var = (v91) obj;
            MessageObject f7 = this.C0.f(v91Var.b());
            if (f7 != null) {
                v91Var.b = f7;
                arrayList.add(v91Var);
            }
        }
        this.t0.clear();
        arrayList2.clear();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        v81 v81Var;
        if (motionEvent != null && this.j0 != null && (v81Var = this.h0) != null) {
            View currentView = v81Var.getCurrentView();
            ke keVar = this.j0;
            if (currentView == keVar && keVar.G((motionEvent.getX() - this.h0.getX()) - this.j0.getX(), (motionEvent.getY() - this.h0.getY()) - this.j0.getY())) {
                return false;
            }
        }
        v81 v81Var2 = this.h0;
        if (v81Var2 == null || (v81Var2.b == 0 && v81Var2.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void k0(View view) {
        if (view instanceof j91) {
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.f7) || this.S.b1()) {
            if (view instanceof mg.c) {
                ((mg.c) view).a();
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof org.telegram.ui.Components.ar) {
            org.telegram.ui.Components.ar arVar = (org.telegram.ui.Components.ar) background;
            if ((arVar.a instanceof ColorDrawable) && arVar.b != null) {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.b7, false);
                if (this.G0 == null || this.H0 != x02) {
                    this.H0 = x02;
                    this.G0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                }
                ((ColorDrawable) arVar.a).setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.a7, false));
                arVar.b.setColorFilter(this.G0);
                view.invalidate();
                return;
            }
        }
        org.telegram.ui.Components.ar arVar2 = new org.telegram.ui.Components.ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.a7, false)), org.telegram.ui.ActionBar.y6.X0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.y6.b7), 0, 0);
        arVar2.w = true;
        view.setBackground(arVar2);
    }

    public final void l0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = this.q0;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].f(i11 == i10, z10);
            i11++;
        }
    }

    public final void m0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.q0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            qh.b bVar = this.q0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.o0.invalidate();
    }

    public final void n0() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        arrayList.addAll(this.v0);
        arrayList.addAll(this.x0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.ui.Components.v0(1))));
    }

    public final void o0() {
        x81 x81Var = this.S;
        if (x81Var != null) {
            int childCount = x81Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                k0(this.S.getChildAt(i10));
            }
            int hiddenChildCount = this.S.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                k0(this.S.V(i11));
            }
            int cachedChildCount = this.S.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                k0(this.S.P(i12));
            }
            int attachedScrapChildCount = this.S.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                k0(this.S.O(i13));
            }
            this.S.getRecycledViewPool().a();
        }
        kg.g gVar = this.Z;
        if (gVar != null) {
            gVar.g = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.ObserversGroup observersGroup = this.F0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.F0 = null;
        }
        this.F0 = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.messagesDidLoad).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.boostByChannelCreated).add(NotificationCenter.storiesListUpdated);
        di.h7 storiesController = getMessagesController().getStoriesController();
        long j10 = this.b;
        di.z6 A = storiesController.A(-j10, 2, -1, true);
        this.C0 = A;
        if (A != null) {
            this.D0 = A.o();
        }
        if (this.a != null) {
            h0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j10, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.F0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.F0 = null;
        }
        org.telegram.ui.ActionBar.e2[] e2VarArr = this.g0;
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        if (e2Var != null) {
            e2Var.dismiss();
            e2VarArr[0] = null;
        }
        di.z6 z6Var = this.C0;
        if (z6Var != null) {
            z6Var.z(this.D0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        b0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.po poVar = this.R;
            if (poVar != null) {
                poVar.i(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oi, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pi, false));
            }
            o0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0() {
        boolean z10;
        float f7;
        if (this.k0 == null || this.l0 == null) {
            return;
        }
        ke keVar = this.j0;
        if (keVar != null && keVar.getParent() == this.h0) {
            ke keVar2 = this.j0;
            if (keVar2.getVisibility() == 0 && keVar2.Y0.getVisibility() != 0) {
                z10 = true;
                if (z10) {
                    f7 = 0.0f;
                } else {
                    float x9 = this.j0.getX();
                    float width = this.j0.getWidth();
                    f7 = width > 0.0f ? Math.max(0.0f, Math.min(this.h0.getWidth(), x9 + width) - Math.max(0.0f, x9)) / width : 0.0f;
                    this.l0.setTranslationX(this.h0.getX() + x9);
                    this.l0.setTranslationY(this.j0.getY() + this.h0.getY());
                }
                this.l0.setVisibility((z10 || f7 <= 0.0f) ? 4 : 0);
                oe.b bVar = this.m0;
                this.k0.setTranslationY((-(1.0f - ((bVar != null ? bVar.e : 0.0f) * f7))) * AndroidUtilities.dp(44.0f));
            }
        }
        z10 = false;
        if (z10) {
        }
        this.l0.setVisibility((z10 || f7 <= 0.0f) ? 4 : 0);
        oe.b bVar2 = this.m0;
        this.k0.setTranslationY((-(1.0f - ((bVar2 != null ? bVar2.e : 0.0f) * f7))) * AndroidUtilities.dp(44.0f));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
