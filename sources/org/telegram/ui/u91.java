package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import j$.util.Objects;
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
import org.telegram.messenger.LiteMode;
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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class u91 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final z5 B0;
    public PorterDuffColorFilter C0;
    public int D0;
    public g91 E;
    public final bh.f E0;
    public g91 F;
    public final gh.d F0;
    public q91 G;
    public final gh.d G0;
    public g91 H;
    public final gh.c H0;
    public g91 I;
    public final bh.b I0;
    public g91 J;
    public r81 J0;
    public g91 K;
    public final ArrayList K0;
    public g91 L;
    public final RectF L0;
    public g91 M;
    public final RectF M0;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.oo R;
    public v81 S;
    public bh.l T;
    public s4.b0 U;
    public final LruCache V;
    public org.telegram.ui.Components.bk0 W;
    public z81 X;
    public s81 Y;
    public t91 Z;
    public TLRPC.ChatFull a;
    public jg.f a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public g91 d;
    public final boolean d0;
    public g91 e;
    public final boolean e0;
    public p91 f;
    public long f0;
    public long g0;
    public g91 h;
    public final org.telegram.ui.ActionBar.c2[] h0;
    public ei.h1 i0;
    public cc j0;
    public ie k0;
    public final boolean l0;
    public tg0 m0;
    public g91 n;
    public ph.b[] n0;
    public int o0;
    public final SparseIntArray p0;
    public final SparseIntArray q0;
    public g91 r;
    public final ArrayList r0;
    public g91 s;
    public final ArrayList s0;
    public final ArrayList t0;
    public final ArrayList u0;
    public g91 v;
    public final ArrayList v0;
    public g91 w;
    public boolean w0;
    public g91 x;
    public boolean x0;
    public g91 y;
    public h91 y0;
    public ci.z6 z0;

    public u91(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.h0 = new org.telegram.ui.ActionBar.c2[1];
        this.o0 = -1;
        this.p0 = new SparseIntArray();
        this.q0 = new SparseIntArray();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.x0 = true;
        this.B0 = new z5(this, 14);
        ArrayList arrayList = new ArrayList();
        this.K0 = arrayList;
        RectF rectF = new RectF();
        this.L0 = rectF;
        RectF rectF2 = new RectF();
        this.M0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = bundle.getLong("chat_id");
        this.b = j10;
        this.c0 = bundle.getBoolean("is_megagroup", false);
        this.d0 = bundle.getBoolean("start_from_boosts", false);
        this.e0 = bundle.getBoolean("start_from_monetization", false);
        this.l0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().getChatFull(j10);
        gh.c cVar = new gh.c();
        this.H0 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.E0 = null;
            this.F0 = null;
            this.G0 = null;
            this.I0 = new bh.b(cVar);
            return;
        }
        this.E0 = new bh.f(false);
        this.F0 = new gh.d(null);
        gh.d dVar = new gh.d(null);
        this.G0 = dVar;
        bh.b bVar = new bh.b(dVar);
        this.I0 = bVar;
        bVar.i = LiteMode.isEnabled(262144);
    }

    public static /* synthetic */ void U(u91 u91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(u91Var.currentAccount, arrayList2.get(i10), false, true));
            }
            u91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new o81(u91Var, arrayList, 0));
    }

    public static void V(final u91 u91Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        ArrayList arrayList3;
        int i10;
        int i11;
        ArrayList arrayList4;
        String str4;
        ArrayList arrayList5 = u91Var.N;
        ArrayList arrayList6 = u91Var.O;
        ArrayList arrayList7 = u91Var.r0;
        String str5 = "%";
        int i12 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final g91[] g91VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            g91 g91Var = g91VarArr[2];
            if (g91Var != null) {
                g91Var.n = true;
            }
            p91 p91Var = new p91();
            com.google.firebase.messaging.r a2 = p91.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            p91Var.o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            p91Var.p = (String) a2.b;
            p91Var.q = (String) a2.e;
            p91Var.r = ((Boolean) a2.c).booleanValue();
            p91Var.s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.r a10 = p91.a(tL_broadcastStats.reactions_per_story);
            p91Var.t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            p91Var.u = (String) a10.b;
            p91Var.v = (String) a10.e;
            p91Var.w = ((Boolean) a10.c).booleanValue();
            p91Var.x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.r a11 = p91.a(tL_broadcastStats.views_per_story);
            p91Var.y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            p91Var.z = (String) a11.b;
            p91Var.A = (String) a11.e;
            p91Var.B = ((Boolean) a11.c).booleanValue();
            p91Var.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.r a12 = p91.a(tL_broadcastStats.shares_per_story);
            p91Var.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            p91Var.E = (String) a12.b;
            p91Var.F = (String) a12.e;
            p91Var.G = ((Boolean) a12.c).booleanValue();
            p91Var.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i13 = (int) (d - d10);
            float abs = d10 == 0.0d ? 0.0f : Math.abs((i13 / ((float) d10)) * 100.0f);
            p91Var.a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            p91Var.b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i13 == 0 || abs == 0.0f) {
                i10 = i13;
                p91Var.c = "";
            } else {
                int i14 = (int) abs;
                if (abs == i14) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13 > 0 ? str3 : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    p91Var.c = sb2.toString() + " (" + i14 + "%)";
                    i10 = i13;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i13 > 0 ? str3 : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    i10 = i13;
                    p91Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            p91Var.d = i10 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i15 = (int) (d11 - d12);
            float abs2 = d12 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d12)) * 100.0f);
            p91Var.i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            p91Var.j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i15 == 0 || abs2 == 0.0f) {
                p91Var.k = "";
            } else {
                int i16 = (int) abs2;
                if (abs2 == i16) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i15 > 0 ? str3 : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    p91Var.k = sb4.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i15 > 0 ? str3 : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    p91Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            p91Var.l = i15 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i17 = (int) (d13 - d14);
            float abs3 = d14 == 0.0d ? 0.0f : Math.abs((i17 / ((float) d14)) * 100.0f);
            p91Var.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            p91Var.f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i17 == 0 || abs3 == 0.0f) {
                p91Var.g = "";
            } else {
                int i18 = (int) abs3;
                if (abs3 == i18) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i17 > 0 ? str3 : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    p91Var.g = sb6.toString() + " (" + i18 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i17 > 0 ? str3 : "");
                    sb7.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    p91Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            p91Var.h = i17 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            p91Var.m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i19 = (int) f7;
            if (f7 == i19) {
                Locale locale7 = Locale.ENGLISH;
                p91Var.n = a1.g.m(i19, "%");
            } else {
                p91Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            u91Var.f = p91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            u91Var.f0 = tL_statsDateRangeDays.max_date * 1000;
            u91Var.g0 = tL_statsDateRangeDays.min_date * 1000;
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
                r91 r91Var = new r91();
                r91Var.a = postInteractionCounters2;
                int i24 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(r91Var);
                    str4 = str5;
                    i11 = i23;
                    u91Var.p0.put(r91Var.b(), i20);
                    i20++;
                } else {
                    i11 = i23;
                    arrayList4 = arrayList8;
                    str4 = str5;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(r91Var.b()));
                    u91Var.t0.add(r91Var);
                    u91Var.q0.put(r91Var.b(), i21);
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
            AndroidUtilities.runOnUIThread(new o81(u91Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                u91Var.getMessagesStorage().getMessages(-u91Var.b, 0L, false, arrayList12.size(), ((r91) arrayList12.get(0)).b(), 0, 0, u91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            final int i25 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(u91Var) { // from class: org.telegram.ui.n81
                public final /* synthetic */ u91 b;

                {
                    this.b = u91Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            u91 u91Var2 = this.b;
                            u91Var2.getClass();
                            g91[] g91VarArr2 = g91VarArr;
                            u91Var2.d = g91VarArr2[0];
                            u91Var2.H = g91VarArr2[1];
                            u91Var2.I = g91VarArr2[2];
                            u91Var2.J = g91VarArr2[3];
                            u91Var2.K = g91VarArr2[4];
                            u91Var2.L = g91VarArr2[5];
                            u91Var2.e = g91VarArr2[6];
                            u91Var2.M = g91VarArr2[7];
                            u91Var2.g0(g91VarArr2);
                            break;
                        default:
                            u91 u91Var3 = this.b;
                            u91Var3.getClass();
                            g91[] g91VarArr3 = g91VarArr;
                            u91Var3.r = g91VarArr3[0];
                            u91Var3.h = g91VarArr3[1];
                            u91Var3.e = g91VarArr3[2];
                            u91Var3.n = g91VarArr3[3];
                            u91Var3.d = g91VarArr3[4];
                            u91Var3.s = g91VarArr3[5];
                            u91Var3.v = g91VarArr3[6];
                            u91Var3.w = g91VarArr3[7];
                            u91Var3.x = g91VarArr3[8];
                            u91Var3.y = g91VarArr3[9];
                            u91Var3.E = g91VarArr3[10];
                            u91Var3.F = g91VarArr3[11];
                            u91Var3.g0(g91VarArr3);
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
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final g91[] g91VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            g91 g91Var2 = g91VarArr2[6];
            if (g91Var2 != null) {
                g91Var2.n = true;
            }
            g91 g91Var3 = g91VarArr2[7];
            if (g91Var3 != null) {
                g91Var3.o = true;
            }
            q91 q91Var = new q91();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i26 = (int) (d15 - d16);
            float abs4 = d16 == 0.0d ? 0.0f : Math.abs((i26 / ((float) d16)) * 100.0f);
            q91Var.a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            q91Var.b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i26 == 0 || abs4 == 0.0f) {
                q91Var.c = "";
            } else {
                int i27 = (int) abs4;
                if (abs4 == i27) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i26 > 0 ? str3 : "");
                    sb8.append(AndroidUtilities.formatWholeNumber(i26, 0));
                    q91Var.c = sb8.toString() + " (" + i27 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i26 > 0 ? str3 : "");
                    sb9.append(AndroidUtilities.formatWholeNumber(i26, 0));
                    q91Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str);
                }
            }
            q91Var.d = i26 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i28 = (int) (d17 - d18);
            float abs5 = d18 == 0.0d ? 0.0f : Math.abs((i28 / ((float) d18)) * 100.0f);
            q91Var.i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            q91Var.j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i28 == 0 || abs5 == 0.0f) {
                q91Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i28 > 0 ? str3 : "");
                sb10.append(AndroidUtilities.formatWholeNumber(i28, 0));
                q91Var.k = sb10.toString();
            }
            q91Var.l = i28 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i29 = (int) (d19 - d20);
            float abs6 = d20 == 0.0d ? 0.0f : Math.abs((i29 / ((float) d20)) * 100.0f);
            q91Var.m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            q91Var.n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i29 == 0 || abs6 == 0.0f) {
                q91Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i29 > 0 ? str3 : "");
                sb11.append(AndroidUtilities.formatWholeNumber(i29, 0));
                q91Var.o = sb11.toString();
            }
            q91Var.p = i29 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i30 = (int) (d21 - d22);
            float abs7 = d22 == 0.0d ? 0.0f : Math.abs((i30 / ((float) d22)) * 100.0f);
            q91Var.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            q91Var.f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i30 == 0 || abs7 == 0.0f) {
                q91Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i30 > 0 ? str3 : "");
                sb12.append(AndroidUtilities.formatWholeNumber(i30, 0));
                q91Var.g = sb12.toString();
            }
            q91Var.h = i30 >= 0;
            u91Var.G = q91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            u91Var.f0 = tL_statsDateRangeDays2.max_date * 1000;
            u91Var.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i31 = 0;
                while (i31 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i31);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    n91 n91Var = new n91();
                    n91Var.a = n91.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb13 = new StringBuilder();
                    int i32 = tL_statsGroupTopPoster.messages;
                    if (i32 > 0) {
                        sb13.append(LocaleController.formatPluralString("messages", i32, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    n91Var.b = sb13.toString();
                    int i33 = i12;
                    if (arrayList2.size() < i33) {
                        arrayList3 = arrayList2;
                        arrayList3.add(n91Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(n91Var);
                    i31++;
                    arrayList2 = arrayList3;
                    i12 = i33;
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
                for (int i34 = 0; i34 < tL_megagroupStats.top_admins.size(); i34++) {
                    ArrayList arrayList19 = u91Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i34);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    n91 n91Var2 = new n91();
                    n91Var2.a = n91.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb14 = new StringBuilder();
                    int i35 = tL_statsGroupTopAdmin.deleted;
                    if (i35 > 0) {
                        sb14.append(LocaleController.formatPluralString("Deletions", i35, new Object[0]));
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
                    n91Var2.b = sb14.toString();
                    arrayList19.add(n91Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i36 = 0; i36 < tL_megagroupStats.top_inviters.size(); i36++) {
                    ArrayList arrayList22 = u91Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i36);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    n91 n91Var3 = new n91();
                    n91Var3.a = n91.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i37 = tL_statsGroupTopInviter.invitations;
                    if (i37 > 0) {
                        n91Var3.b = LocaleController.formatPluralString("Invitations", i37, new Object[0]);
                    } else {
                        n91Var3.b = "";
                    }
                    arrayList22.add(n91Var3);
                }
            }
            final int i38 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(u91Var) { // from class: org.telegram.ui.n81
                public final /* synthetic */ u91 b;

                {
                    this.b = u91Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i38) {
                        case 0:
                            u91 u91Var2 = this.b;
                            u91Var2.getClass();
                            g91[] g91VarArr22 = g91VarArr2;
                            u91Var2.d = g91VarArr22[0];
                            u91Var2.H = g91VarArr22[1];
                            u91Var2.I = g91VarArr22[2];
                            u91Var2.J = g91VarArr22[3];
                            u91Var2.K = g91VarArr22[4];
                            u91Var2.L = g91VarArr22[5];
                            u91Var2.e = g91VarArr22[6];
                            u91Var2.M = g91VarArr22[7];
                            u91Var2.g0(g91VarArr22);
                            break;
                        default:
                            u91 u91Var3 = this.b;
                            u91Var3.getClass();
                            g91[] g91VarArr3 = g91VarArr2;
                            u91Var3.r = g91VarArr3[0];
                            u91Var3.h = g91VarArr3[1];
                            u91Var3.e = g91VarArr3[2];
                            u91Var3.n = g91VarArr3[3];
                            u91Var3.d = g91VarArr3[4];
                            u91Var3.s = g91VarArr3[5];
                            u91Var3.v = g91VarArr3[6];
                            u91Var3.w = g91VarArr3[7];
                            u91Var3.x = g91VarArr3[8];
                            u91Var3.y = g91VarArr3[9];
                            u91Var3.E = g91VarArr3[10];
                            u91Var3.F = g91VarArr3[11];
                            u91Var3.g0(g91VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void W(u91 u91Var) {
        RectF rectF = u91Var.M0;
        bh.f fVar = u91Var.E0;
        if (Build.VERSION.SDK_INT < 31 || fVar == null || u91Var.fragmentView == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (u91Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        u91Var.L0.set(0.0f, -dp, u91Var.fragmentView.getMeasuredWidth(), u91Var.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, u91Var.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(2, u91Var.K0);
        fVar.e(u91Var.J0, u91Var.fragmentView.getMeasuredWidth(), u91Var.fragmentView.getMeasuredHeight());
    }

    public static void Y(u91 u91Var) {
        View currentView = u91Var.i0.getCurrentView();
        cc ccVar = u91Var.j0;
        if (currentView == ccVar) {
            u91Var.actionBar.setAdaptiveBackground(ccVar.F);
            return;
        }
        ie ieVar = u91Var.k0;
        if (currentView == ieVar) {
            u91Var.actionBar.setAdaptiveBackground(ieVar.a1);
        } else {
            u91Var.actionBar.setAdaptiveBackground(u91Var.S);
        }
    }

    public static void Z(u91 u91Var) {
        t91 t91Var = u91Var.Z;
        if (t91Var != null) {
            t91Var.b = true;
        }
        int childCount = u91Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = u91Var.S.getChildAt(i10);
            if (childAt instanceof f91) {
                ((f91) childAt).b.t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new y5(-chat.id) : new u91(bundle);
    }

    public static kg.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new kg.b(jSONObject);
        }
        if (i10 == 1) {
            return new kg.c(jSONObject);
        }
        if (i10 == 2) {
            kg.d dVar = new kg.d(jSONObject);
            int length = ((kg.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                dVar.l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = dVar.l;
                    jArr[i11] = jArr[i11] + ((kg.a) dVar.d.get(i12)).a[i11];
                }
            }
            dVar.m = new SegmentTree(dVar.l);
            return dVar;
        }
        if (i10 != 4) {
            return null;
        }
        kg.e eVar = new kg.e(jSONObject);
        if (z10) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j10 = 0;
            for (int i13 = 0; i13 < eVar.d.size(); i13++) {
                int length2 = eVar.a.length;
                for (int i14 = 0; i14 < length2; i14++) {
                    long j11 = ((kg.a) eVar.d.get(i13)).a[i14];
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
                    arrayList.add((kg.a) eVar.d.get(i15));
                }
            }
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj = arrayList.get(i16);
                i16++;
                eVar.d.remove((kg.a) obj);
            }
        }
        int length3 = ((kg.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i17 = 0; i17 < length3; i17++) {
            eVar.l[i17] = 0;
            for (int i18 = 0; i18 < size3; i18++) {
                long[] jArr3 = eVar.l;
                jArr3[i17] = jArr3[i17] + ((kg.a) eVar.d.get(i18)).a[i17];
            }
        }
        new SegmentTree(eVar.l);
        return eVar;
    }

    public static g91 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        g91 g91Var = new g91(str, i10);
        g91Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                kg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                g91Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                g91Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.a) == null || jArr2.length < 2) {
                    g91Var.l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    g91Var.e = new kg.e(e02, j10);
                    g91Var.c = j10;
                    return g91Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            g91Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return g91Var;
    }

    public static void k0(g91 g91Var, ArrayList arrayList, org.telegram.ui.ActionBar.s6 s6Var) {
        kg.b bVar;
        if (g91Var == null || (bVar = g91Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            kg.a aVar = (kg.a) obj;
            int i11 = aVar.g;
            if (i11 >= 0) {
                if (!org.telegram.ui.ActionBar.k6.e1(i11)) {
                    org.telegram.ui.ActionBar.k6.x1(aVar.g, org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.k6.ql[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, aVar.g));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.dj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.bj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
    }

    public final void c0() {
        int i10 = AndroidUtilities.navigationBarHeight;
        int i11 = AndroidUtilities.statusBarHeight;
        tg0 tg0Var = this.m0;
        if (tg0Var != null) {
            tg0Var.setTranslationY(-i10);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
        int dp = (this.c ? AndroidUtilities.dp(72.0f) : 0) + i10;
        v81 v81Var = this.S;
        if (v81Var != null) {
            v81Var.setPadding(0, currentActionBarHeight, 0, dp);
        }
        cc ccVar = this.j0;
        if (ccVar != null) {
            ccVar.F.setPadding(0, currentActionBarHeight, 0, dp);
        }
        ie ieVar = this.k0;
        if (ieVar != null) {
            ieVar.a1.setPadding(0, currentActionBarHeight, 0, dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.h5 h5Var;
        FrameLayout frameLayout2;
        boolean z10;
        u91 u91Var = this;
        u91Var.a0 = new jg.f(null);
        MessagesController messagesController = MessagesController.getInstance(u91Var.currentAccount);
        long j10 = u91Var.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(u91Var.currentAccount).getChatFull(j10);
        boolean z11 = chatFull != null && chatFull.can_view_stats;
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z12 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z11) {
            arrayList.add(ph.b.c(context, u91Var.resourceProvider, ph.a.I, R.string.Statistics));
        }
        arrayList.add(ph.b.c(context, u91Var.resourceProvider, ph.a.O, R.string.Boosts));
        if (z12) {
            arrayList.add(ph.b.c(context, u91Var.resourceProvider, ph.a.P, R.string.Monetization));
        }
        u91Var.n0 = (ph.b[]) arrayList.toArray(new ph.b[0]);
        tg0 tg0Var = new tg0(context, u91Var.resourceProvider);
        u91Var.m0 = tg0Var;
        tg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i10 = 0;
        while (true) {
            ph.b[] bVarArr = u91Var.n0;
            if (i10 >= bVarArr.length) {
                break;
            }
            ph.b bVar = bVarArr[i10];
            bVar.setOnClickListener(new ai.n1(u91Var, i10, 27));
            u91Var.m0.addView(u91Var.n0[i10]);
            u91Var.m0.i(bVar, true, false);
            i10++;
        }
        u91Var.i0 = new ei.h1(u91Var, u91Var.getParentActivity(), 7);
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (isBoostSupported) {
            u91Var.j0 = new cc(u91Var, -j10, u91Var.getResourceProvider());
        }
        if (z12) {
            Activity parentActivity = u91Var.getParentActivity();
            int i11 = u91Var.currentAccount;
            long j11 = -j10;
            org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                frameLayout2 = frameLayout3;
                z10 = true;
            } else {
                frameLayout2 = frameLayout3;
                z10 = false;
            }
            frameLayout = frameLayout2;
            ie ieVar = new ie(parentActivity, this, i11, j11, resourceProvider, z10, chatFull.can_view_stars_revenue);
            u91Var = this;
            u91Var.k0 = ieVar;
            ieVar.setActionBar(u91Var.actionBar);
        } else {
            frameLayout = frameLayout3;
        }
        boolean z13 = z11;
        FrameLayout frameLayout4 = frameLayout;
        u91Var.i0.setAdapter(new u81(u91Var, z13, isBoostSupported, z12, frameLayout4));
        boolean z14 = u91Var.l0;
        boolean z15 = isBoostSupported && !z14;
        u91Var.c = z15;
        if (z15 && u91Var.d0) {
            u91Var.i0.setPosition(z13 ? 1 : 0);
        } else if (z15 && u91Var.e0) {
            u91Var.i0.setPosition((z13 ? 1 : 0) + ((z14 || !isBoostSupported) ? 0 : 1));
        }
        u91Var.m0(u91Var.i0.getCurrentPosition(), false);
        y8 y8Var = new y8(u91Var, u91Var.getParentActivity(), 8);
        u91Var.actionBar.setDrawBlurBackground(y8Var);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, y8Var, u91Var.getResourceProvider());
        ih.k kVar = new ih.k(y8Var);
        bh.b bVar2 = u91Var.I0;
        bVar2.f = kVar;
        bVar2.g = y8Var;
        y8Var.addView(u91Var.i0, w7.z5.g());
        y8Var.addView(u91Var.actionBar);
        if (u91Var.c) {
            y8Var.addView(u91Var.m0, w7.z5.e(344, 72, 81));
            u91Var.setBulletinDelegate(new ei.o8(12));
        }
        u91Var.fragmentView = y8Var;
        v81 v81Var = new v81(u91Var, context);
        u91Var.S = v81Var;
        v81Var.setSections(true);
        u91Var.S.setClipToPadding(false);
        v81 v81Var2 = u91Var.S;
        Objects.requireNonNull(v81Var2);
        u91Var.T = new bh.l(v81Var2, y8Var, new ns(v81Var2, 1));
        cc ccVar = u91Var.j0;
        if (ccVar != null) {
            org.telegram.ui.Components.mm0 mm0Var = ccVar.F;
            Objects.requireNonNull(mm0Var);
            ccVar.G = new bh.l(mm0Var, y8Var, new ns(mm0Var, 0));
            u91Var.j0.F.j(new t81(u91Var, 1));
        }
        ie ieVar2 = u91Var.k0;
        if (ieVar2 != null) {
            org.telegram.ui.Components.j71 j71Var = ieVar2.a1;
            Objects.requireNonNull(j71Var);
            ieVar2.b1 = new bh.l(j71Var, y8Var, new x8(j71Var, 0));
            u91Var.k0.a1.j(new t81(u91Var, 2));
        }
        u91Var.J0 = new r81(u91Var, y8Var);
        u91Var.S.t1();
        LinearLayout linearLayout = new LinearLayout(context);
        u91Var.b0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        u91Var.W = bk0Var;
        bk0Var.setAutoRepeat(true);
        u91Var.W.f(R.raw.statistic_preload, 120, 120, null);
        u91Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.k6.Oi;
        org.telegram.ui.ActionBar.r6.W(textView, i12, null);
        textView.setTag(Integer.valueOf(i12));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Pi;
        org.telegram.ui.ActionBar.r6.W(textView2, i13, null);
        textView2.setTag(Integer.valueOf(i13));
        org.telegram.messenger.sl.m(R.string.LoadingStatsDescription, textView2, 1);
        u91Var.b0.addView(u91Var.W, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        u91Var.b0.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        u91Var.b0.addView(textView2, w7.z5.q(-2, -2, 1));
        frameLayout4.addView(u91Var.b0, w7.z5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (u91Var.X == null) {
            u91Var.X = new z81(u91Var);
        }
        u91Var.S.setAdapter(u91Var.X);
        s4.b0 b0Var = new s4.b0();
        u91Var.U = b0Var;
        u91Var.S.setLayoutManager(b0Var);
        u91Var.Y = new s81();
        u91Var.S.setItemAnimator(null);
        u91Var.S.j(new t81(u91Var, 0));
        u91Var.S.setOnItemClickListener(new j11(u91Var, 7));
        u91Var.S.setOnItemLongClickListener(new sp0(u91Var, 17));
        frameLayout4.addView(u91Var.S);
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, null);
        u91Var.R = ooVar;
        ooVar.setOccupyStatusBar(!AndroidUtilities.isTablet() || ((h5Var = u91Var.parentLayout) != null && ((ActionBarLayout) h5Var).b));
        u91Var.R.getAvatarImageView().setScaleX(0.9f);
        u91Var.R.getAvatarImageView().setScaleY(0.9f);
        u91Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        u91Var.actionBar.addView(u91Var.R, 0, w7.z5.d(-2, -1.0f, 51, !u91Var.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = u91Var.getMessagesController().getChat(Long.valueOf(j10));
        u91Var.R.setChatAvatar(chat2);
        u91Var.R.setTitle(chat2 == null ? "" : chat2.title);
        org.telegram.ui.Components.oo ooVar2 = u91Var.R;
        if (ooVar2.getSubtitleTextView() != null) {
            ooVar2.getSubtitleTextView().setVisibility(8);
        }
        i2.o1.y(false, u91Var.actionBar);
        u91Var.actionBar.setActionBarMenuOnItemClick(new c31(u91Var, 5));
        u91Var.R.i(org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        org.telegram.ui.ActionBar.r6.m(u91Var.actionBar, 1, i12, null);
        org.telegram.ui.ActionBar.r6.b(u91Var.actionBar, i12, null, true);
        org.telegram.ui.ActionBar.r6.m(u91Var.actionBar, 3, org.telegram.ui.ActionBar.k6.z8, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, u91Var.actionBar, null);
        boolean z16 = u91Var.x0;
        z5 z5Var = u91Var.B0;
        if (z16) {
            u91Var.b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(z5Var, 500L);
            u91Var.b0.setVisibility(0);
            u91Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            u91Var.b0.setVisibility(8);
            u91Var.S.setVisibility(0);
        }
        dh.d c10 = bVar2.c(u91Var.m0, fh.c.f(u91Var.resourceProvider), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.666f));
        u91Var.m0.setBackground(c10);
        u91Var.c0();
        u91Var.y0 = new h91(u91Var.X, u91Var.U);
        return u91Var.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ci.z6) objArr[0]) == this.z0) {
                j0();
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.y0.f();
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
            org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack) : null;
            if (o2Var instanceof ko) {
                ((ActionBarLayout) getParentLayout()).b0(o2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.o2 o2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (o2Var2 instanceof ProfileActivity) {
                    ug.h.f(o2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.o2) si.o0.g(3, fragmentStack2) : null;
            if (o2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).b0(o2Var2, false);
            }
            finishFragment();
            if (o2Var3 instanceof sn) {
                ug.h.f(o2Var3, chat, true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagesDidLoad) {
            if (i10 == NotificationCenter.chatInfoDidLoad) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.b && this.a == null) {
                    this.a = chatFull;
                    i0();
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
                arrayList = this.r0;
                if (i13 >= size) {
                    break;
                }
                MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                int i14 = this.p0.get(messageObject.getId(), -1);
                if (i14 >= 0 && ((r91) arrayList.get(i14)).b() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList3.add((r91) arrayList.get(i14));
                    } else {
                        ((r91) arrayList.get(i14)).b = messageObject;
                    }
                }
                i13++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.s0;
            arrayList4.clear();
            int size2 = arrayList.size();
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                r91 r91Var = (r91) arrayList.get(i12);
                if (r91Var.b == null) {
                    this.o0 = r91Var.b();
                    break;
                } else {
                    arrayList4.add(r91Var);
                    i12++;
                }
            }
            if (arrayList4.size() < 20) {
                h0();
            }
            o0();
            if (this.X != null) {
                this.S.setItemAnimator(null);
                this.y0.f();
            }
        }
    }

    public final void g0(g91[] g91VarArr) {
        z81 z81Var = this.X;
        if (z81Var != null) {
            z81Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.x0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.B0);
        this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new v70(this, 27));
        this.S.setVisibility(0);
        this.S.setAlpha(0.0f);
        this.S.animate().alpha(1.0f).setDuration(230L).start();
        for (g91 g91Var : g91VarArr) {
            if (g91Var != null && g91Var.d == null && g91Var.f != null) {
                g91Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new oh(2, this, g91Var));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        i6 i6Var = new i6(22, this);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 0, new Class[]{lg.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        org.telegram.ui.Components.oo ooVar = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.t6(ooVar != null ? ooVar.getTitleTextView() : null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        org.telegram.ui.Components.oo ooVar2 = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.t6(org.telegram.ui.ActionBar.k6.Pi, ooVar2 != null ? ooVar2.getSubtitleTextView() : null));
        if (this.c0) {
            while (i10 < 6) {
                k0(i10 == 0 ? this.d : i10 == 1 ? this.H : i10 == 2 ? this.I : i10 == 3 ? this.J : i10 == 4 ? this.K : this.L, arrayList, i6Var);
                i10++;
            }
        } else {
            while (i10 < 12) {
                k0(i10 == 0 ? this.d : i10 == 1 ? this.h : i10 == 2 ? this.n : i10 == 3 ? this.r : i10 == 4 ? this.s : i10 == 5 ? this.v : i10 == 6 ? this.x : i10 == 7 ? this.e : i10 == 8 ? this.w : i10 == 9 ? this.y : i10 == 10 ? this.E : this.F, arrayList, i6Var);
                i10++;
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.p0.get(this.o0); i11 < size; i11++) {
            if (((r91) arrayList.get(i11)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((r91) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.b);
        this.w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new q81(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.l0) {
            return;
        }
        boolean z10 = this.c0;
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ei.h1 h1Var = this.i0;
        if (h1Var == null || (h1Var.b == 0 && h1Var.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0() {
        ArrayList arrayList = this.u0;
        arrayList.clear();
        ArrayList arrayList2 = this.t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            r91 r91Var = (r91) obj;
            MessageObject f7 = this.z0.f(r91Var.b());
            if (f7 != null) {
                r91Var.b = f7;
                arrayList.add(r91Var);
            }
        }
        this.q0.clear();
        arrayList2.clear();
    }

    public final void l0(View view) {
        if (view instanceof f91) {
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.b7)) {
            if (view instanceof lg.c) {
                ((lg.c) view).a();
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof org.telegram.ui.Components.yq) {
            org.telegram.ui.Components.yq yqVar = (org.telegram.ui.Components.yq) background;
            if ((yqVar.a instanceof ColorDrawable) && yqVar.b != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.b7, false);
                if (this.C0 == null || this.D0 != x02) {
                    this.D0 = x02;
                    this.C0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                }
                ((ColorDrawable) yqVar.a).setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
                yqVar.b.setColorFilter(this.C0);
                view.invalidate();
                return;
            }
        }
        org.telegram.ui.Components.yq yqVar2 = new org.telegram.ui.Components.yq(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false)), org.telegram.ui.ActionBar.k6.X0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7), 0, 0);
        yqVar2.w = true;
        view.setBackground(yqVar2);
    }

    public final void m0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = this.n0;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].f(i11 == i10, z10);
            i11++;
        }
    }

    public final void n0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            ph.b bVar = this.n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.m0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.v0;
        arrayList.clear();
        arrayList.addAll(this.s0);
        arrayList.addAll(this.u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.ui.Components.w0(1))));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ci.h7 storiesController = getMessagesController().getStoriesController();
        long j10 = this.b;
        ci.z6 A = storiesController.A(-j10, 2, -1, true);
        this.z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j10, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.h0;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
            c2VarArr[0] = null;
        }
        ci.z6 z6Var = this.z0;
        if (z6Var != null) {
            z6Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.H0.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            org.telegram.ui.Components.oo ooVar = this.R;
            if (ooVar != null) {
                ooVar.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oi, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pi, false));
            }
            p0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0() {
        v81 v81Var = this.S;
        if (v81Var != null) {
            int childCount = v81Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                l0(this.S.getChildAt(i10));
            }
            int hiddenChildCount = this.S.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                l0(this.S.V(i11));
            }
            int cachedChildCount = this.S.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                l0(this.S.P(i12));
            }
            int attachedScrapChildCount = this.S.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                l0(this.S.O(i13));
            }
            this.S.getRecycledViewPool().a();
        }
        jg.f fVar = this.a0;
        if (fVar != null) {
            fVar.g = true;
        }
    }
}
