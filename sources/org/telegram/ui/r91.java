package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
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
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class r91 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final a6 B0;
    public final bh.f C0;
    public final gh.d D0;
    public d91 E;
    public final gh.d E0;
    public d91 F;
    public final bh.b F0;
    public n91 G;
    public o81 G0;
    public d91 H;
    public final ArrayList H0;
    public d91 I;
    public final RectF I0;
    public d91 J;
    public final RectF J0;
    public d91 K;
    public d91 L;
    public d91 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.oo R;
    public s81 S;
    public bh.l T;
    public s4.b0 U;
    public final LruCache V;
    public org.telegram.ui.Components.xj0 W;
    public w81 X;
    public p81 Y;
    public q91 Z;
    public TLRPC.ChatFull a;
    public jg.f a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public d91 d;
    public final boolean d0;
    public d91 e;
    public final boolean e0;
    public m91 f;
    public long f0;
    public long g0;
    public d91 h;
    public final org.telegram.ui.ActionBar.b2[] h0;
    public ei.h1 i0;
    public ec j0;
    public ke k0;
    public final boolean l0;
    public rg0 m0;
    public d91 n;
    public ph.b[] n0;
    public int o0;
    public final SparseIntArray p0;
    public final SparseIntArray q0;
    public d91 r;
    public final ArrayList r0;
    public d91 s;
    public final ArrayList s0;
    public final ArrayList t0;
    public final ArrayList u0;
    public d91 v;
    public final ArrayList v0;
    public d91 w;
    public boolean w0;
    public d91 x;
    public boolean x0;
    public d91 y;
    public e91 y0;
    public ci.a7 z0;

    public r91(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.h0 = new org.telegram.ui.ActionBar.b2[1];
        this.o0 = -1;
        this.p0 = new SparseIntArray();
        this.q0 = new SparseIntArray();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.x0 = true;
        this.B0 = new a6(this, 13);
        ArrayList arrayList = new ArrayList();
        this.H0 = arrayList;
        RectF rectF = new RectF();
        this.I0 = rectF;
        RectF rectF2 = new RectF();
        this.J0 = rectF2;
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
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.C0 = null;
            this.D0 = null;
            this.E0 = null;
            this.F0 = new bh.b(cVar);
            return;
        }
        this.C0 = new bh.f(false);
        this.D0 = new gh.d(null);
        gh.d dVar = new gh.d(null);
        this.E0 = dVar;
        bh.b bVar = new bh.b(dVar);
        this.F0 = bVar;
        bVar.i = LiteMode.isEnabled(262144);
    }

    public static /* synthetic */ void U(r91 r91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(r91Var.currentAccount, arrayList2.get(i10), false, true));
            }
            r91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new l81(r91Var, arrayList, 0));
    }

    public static void V(final r91 r91Var, TLObject tLObject) {
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
        ArrayList arrayList5 = r91Var.N;
        ArrayList arrayList6 = r91Var.O;
        ArrayList arrayList7 = r91Var.r0;
        String str5 = "%";
        int i12 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final d91[] d91VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            d91 d91Var = d91VarArr[2];
            if (d91Var != null) {
                d91Var.n = true;
            }
            m91 m91Var = new m91();
            com.google.firebase.messaging.r a2 = m91.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            m91Var.o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            m91Var.p = (String) a2.b;
            m91Var.q = (String) a2.e;
            m91Var.r = ((Boolean) a2.c).booleanValue();
            m91Var.s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.r a10 = m91.a(tL_broadcastStats.reactions_per_story);
            m91Var.t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            m91Var.u = (String) a10.b;
            m91Var.v = (String) a10.e;
            m91Var.w = ((Boolean) a10.c).booleanValue();
            m91Var.x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.r a11 = m91.a(tL_broadcastStats.views_per_story);
            m91Var.y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            m91Var.z = (String) a11.b;
            m91Var.A = (String) a11.e;
            m91Var.B = ((Boolean) a11.c).booleanValue();
            m91Var.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.r a12 = m91.a(tL_broadcastStats.shares_per_story);
            m91Var.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            m91Var.E = (String) a12.b;
            m91Var.F = (String) a12.e;
            m91Var.G = ((Boolean) a12.c).booleanValue();
            m91Var.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i13 = (int) (d - d10);
            float abs = d10 == 0.0d ? 0.0f : Math.abs((i13 / ((float) d10)) * 100.0f);
            m91Var.a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            m91Var.b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i13 == 0 || abs == 0.0f) {
                i10 = i13;
                m91Var.c = "";
            } else {
                int i14 = (int) abs;
                if (abs == i14) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13 > 0 ? str3 : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    m91Var.c = sb2.toString() + " (" + i14 + "%)";
                    i10 = i13;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i13 > 0 ? str3 : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    i10 = i13;
                    m91Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            m91Var.d = i10 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i15 = (int) (d11 - d12);
            float abs2 = d12 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d12)) * 100.0f);
            m91Var.i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            m91Var.j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i15 == 0 || abs2 == 0.0f) {
                m91Var.k = "";
            } else {
                int i16 = (int) abs2;
                if (abs2 == i16) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i15 > 0 ? str3 : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    m91Var.k = sb4.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i15 > 0 ? str3 : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    m91Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            m91Var.l = i15 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i17 = (int) (d13 - d14);
            float abs3 = d14 == 0.0d ? 0.0f : Math.abs((i17 / ((float) d14)) * 100.0f);
            m91Var.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            m91Var.f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i17 == 0 || abs3 == 0.0f) {
                m91Var.g = "";
            } else {
                int i18 = (int) abs3;
                if (abs3 == i18) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i17 > 0 ? str3 : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    m91Var.g = sb6.toString() + " (" + i18 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i17 > 0 ? str3 : "");
                    sb7.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    m91Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            m91Var.h = i17 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            m91Var.m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i19 = (int) f7;
            if (f7 == i19) {
                Locale locale7 = Locale.ENGLISH;
                m91Var.n = a1.g.m(i19, "%");
            } else {
                m91Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            r91Var.f = m91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            r91Var.f0 = tL_statsDateRangeDays.max_date * 1000;
            r91Var.g0 = tL_statsDateRangeDays.min_date * 1000;
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
                o91 o91Var = new o91();
                o91Var.a = postInteractionCounters2;
                int i24 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(o91Var);
                    str4 = str5;
                    i11 = i23;
                    r91Var.p0.put(o91Var.b(), i20);
                    i20++;
                } else {
                    i11 = i23;
                    arrayList4 = arrayList8;
                    str4 = str5;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(o91Var.b()));
                    r91Var.t0.add(o91Var);
                    r91Var.q0.put(o91Var.b(), i21);
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
            AndroidUtilities.runOnUIThread(new l81(r91Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                r91Var.getMessagesStorage().getMessages(-r91Var.b, 0L, false, arrayList12.size(), ((o91) arrayList12.get(0)).b(), 0, 0, r91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            final int i25 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(r91Var) { // from class: org.telegram.ui.k81
                public final /* synthetic */ r91 b;

                {
                    this.b = r91Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            r91 r91Var2 = this.b;
                            r91Var2.getClass();
                            d91[] d91VarArr2 = d91VarArr;
                            r91Var2.d = d91VarArr2[0];
                            r91Var2.H = d91VarArr2[1];
                            r91Var2.I = d91VarArr2[2];
                            r91Var2.J = d91VarArr2[3];
                            r91Var2.K = d91VarArr2[4];
                            r91Var2.L = d91VarArr2[5];
                            r91Var2.e = d91VarArr2[6];
                            r91Var2.M = d91VarArr2[7];
                            r91Var2.g0(d91VarArr2);
                            break;
                        default:
                            r91 r91Var3 = this.b;
                            r91Var3.getClass();
                            d91[] d91VarArr3 = d91VarArr;
                            r91Var3.r = d91VarArr3[0];
                            r91Var3.h = d91VarArr3[1];
                            r91Var3.e = d91VarArr3[2];
                            r91Var3.n = d91VarArr3[3];
                            r91Var3.d = d91VarArr3[4];
                            r91Var3.s = d91VarArr3[5];
                            r91Var3.v = d91VarArr3[6];
                            r91Var3.w = d91VarArr3[7];
                            r91Var3.x = d91VarArr3[8];
                            r91Var3.y = d91VarArr3[9];
                            r91Var3.E = d91VarArr3[10];
                            r91Var3.F = d91VarArr3[11];
                            r91Var3.g0(d91VarArr3);
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
            final d91[] d91VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            d91 d91Var2 = d91VarArr2[6];
            if (d91Var2 != null) {
                d91Var2.n = true;
            }
            d91 d91Var3 = d91VarArr2[7];
            if (d91Var3 != null) {
                d91Var3.o = true;
            }
            n91 n91Var = new n91();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i26 = (int) (d15 - d16);
            float abs4 = d16 == 0.0d ? 0.0f : Math.abs((i26 / ((float) d16)) * 100.0f);
            n91Var.a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            n91Var.b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i26 == 0 || abs4 == 0.0f) {
                n91Var.c = "";
            } else {
                int i27 = (int) abs4;
                if (abs4 == i27) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i26 > 0 ? str3 : "");
                    sb8.append(AndroidUtilities.formatWholeNumber(i26, 0));
                    n91Var.c = sb8.toString() + " (" + i27 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i26 > 0 ? str3 : "");
                    sb9.append(AndroidUtilities.formatWholeNumber(i26, 0));
                    n91Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str);
                }
            }
            n91Var.d = i26 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i28 = (int) (d17 - d18);
            float abs5 = d18 == 0.0d ? 0.0f : Math.abs((i28 / ((float) d18)) * 100.0f);
            n91Var.i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            n91Var.j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i28 == 0 || abs5 == 0.0f) {
                n91Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i28 > 0 ? str3 : "");
                sb10.append(AndroidUtilities.formatWholeNumber(i28, 0));
                n91Var.k = sb10.toString();
            }
            n91Var.l = i28 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i29 = (int) (d19 - d20);
            float abs6 = d20 == 0.0d ? 0.0f : Math.abs((i29 / ((float) d20)) * 100.0f);
            n91Var.m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            n91Var.n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i29 == 0 || abs6 == 0.0f) {
                n91Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i29 > 0 ? str3 : "");
                sb11.append(AndroidUtilities.formatWholeNumber(i29, 0));
                n91Var.o = sb11.toString();
            }
            n91Var.p = i29 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i30 = (int) (d21 - d22);
            float abs7 = d22 == 0.0d ? 0.0f : Math.abs((i30 / ((float) d22)) * 100.0f);
            n91Var.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            n91Var.f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i30 == 0 || abs7 == 0.0f) {
                n91Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i30 > 0 ? str3 : "");
                sb12.append(AndroidUtilities.formatWholeNumber(i30, 0));
                n91Var.g = sb12.toString();
            }
            n91Var.h = i30 >= 0;
            r91Var.G = n91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            r91Var.f0 = tL_statsDateRangeDays2.max_date * 1000;
            r91Var.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i31 = 0;
                while (i31 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i31);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    k91 k91Var = new k91();
                    k91Var.a = k91.a(tL_statsGroupTopPoster.user_id, arrayList14);
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
                    k91Var.b = sb13.toString();
                    int i33 = i12;
                    if (arrayList2.size() < i33) {
                        arrayList3 = arrayList2;
                        arrayList3.add(k91Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(k91Var);
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
                    ArrayList arrayList19 = r91Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i34);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    k91 k91Var2 = new k91();
                    k91Var2.a = k91.a(tL_statsGroupTopAdmin.user_id, arrayList20);
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
                    k91Var2.b = sb14.toString();
                    arrayList19.add(k91Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i36 = 0; i36 < tL_megagroupStats.top_inviters.size(); i36++) {
                    ArrayList arrayList22 = r91Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i36);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    k91 k91Var3 = new k91();
                    k91Var3.a = k91.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i37 = tL_statsGroupTopInviter.invitations;
                    if (i37 > 0) {
                        k91Var3.b = LocaleController.formatPluralString("Invitations", i37, new Object[0]);
                    } else {
                        k91Var3.b = "";
                    }
                    arrayList22.add(k91Var3);
                }
            }
            final int i38 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(r91Var) { // from class: org.telegram.ui.k81
                public final /* synthetic */ r91 b;

                {
                    this.b = r91Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i38) {
                        case 0:
                            r91 r91Var2 = this.b;
                            r91Var2.getClass();
                            d91[] d91VarArr22 = d91VarArr2;
                            r91Var2.d = d91VarArr22[0];
                            r91Var2.H = d91VarArr22[1];
                            r91Var2.I = d91VarArr22[2];
                            r91Var2.J = d91VarArr22[3];
                            r91Var2.K = d91VarArr22[4];
                            r91Var2.L = d91VarArr22[5];
                            r91Var2.e = d91VarArr22[6];
                            r91Var2.M = d91VarArr22[7];
                            r91Var2.g0(d91VarArr22);
                            break;
                        default:
                            r91 r91Var3 = this.b;
                            r91Var3.getClass();
                            d91[] d91VarArr3 = d91VarArr2;
                            r91Var3.r = d91VarArr3[0];
                            r91Var3.h = d91VarArr3[1];
                            r91Var3.e = d91VarArr3[2];
                            r91Var3.n = d91VarArr3[3];
                            r91Var3.d = d91VarArr3[4];
                            r91Var3.s = d91VarArr3[5];
                            r91Var3.v = d91VarArr3[6];
                            r91Var3.w = d91VarArr3[7];
                            r91Var3.x = d91VarArr3[8];
                            r91Var3.y = d91VarArr3[9];
                            r91Var3.E = d91VarArr3[10];
                            r91Var3.F = d91VarArr3[11];
                            r91Var3.g0(d91VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void W(r91 r91Var) {
        RectF rectF = r91Var.J0;
        bh.f fVar = r91Var.C0;
        if (Build.VERSION.SDK_INT < 31 || fVar == null || r91Var.fragmentView == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (r91Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        r91Var.I0.set(0.0f, -dp, r91Var.fragmentView.getMeasuredWidth(), r91Var.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, r91Var.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(2, r91Var.H0);
        fVar.e(r91Var.G0, r91Var.fragmentView.getMeasuredWidth(), r91Var.fragmentView.getMeasuredHeight());
    }

    public static void Y(r91 r91Var) {
        View currentView = r91Var.i0.getCurrentView();
        ec ecVar = r91Var.j0;
        if (currentView == ecVar) {
            r91Var.actionBar.setAdaptiveBackground(ecVar.F);
            return;
        }
        ke keVar = r91Var.k0;
        if (currentView == keVar) {
            r91Var.actionBar.setAdaptiveBackground(keVar.a1);
        } else {
            r91Var.actionBar.setAdaptiveBackground(r91Var.S);
        }
    }

    public static void Z(r91 r91Var) {
        q91 q91Var = r91Var.Z;
        if (q91Var != null) {
            q91Var.b = true;
        }
        int childCount = r91Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = r91Var.S.getChildAt(i10);
            if (childAt instanceof c91) {
                ((c91) childAt).b.t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new z5(-chat.id) : new r91(bundle);
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

    public static d91 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        d91 d91Var = new d91(str, i10);
        d91Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                kg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                d91Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                d91Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.a) == null || jArr2.length < 2) {
                    d91Var.l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    d91Var.e = new kg.e(e02, j10);
                    d91Var.c = j10;
                    return d91Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            d91Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return d91Var;
    }

    public static void k0(d91 d91Var, ArrayList arrayList, org.telegram.ui.ActionBar.i6 i6Var) {
        kg.b bVar;
        if (d91Var == null || (bVar = d91Var.d) == null) {
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
                if (!org.telegram.ui.ActionBar.h6.d1(i11)) {
                    org.telegram.ui.ActionBar.h6.v1(aVar.g, org.telegram.ui.ActionBar.h6.I == org.telegram.ui.ActionBar.h6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.h6.ql[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, aVar.g));
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof c91) {
            ((c91) view).d();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.z6) {
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false)), org.telegram.ui.ActionBar.h6.W0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7), 0, 0);
            zqVar.w = true;
            view.setBackground(zqVar);
            return;
        }
        if (view instanceof lg.c) {
            ((lg.c) view).a();
        } else if (view instanceof l91) {
            int i10 = l91.d;
            ((l91) view).b();
        }
    }

    public final void c0() {
        int i10 = AndroidUtilities.navigationBarHeight;
        int i11 = AndroidUtilities.statusBarHeight;
        rg0 rg0Var = this.m0;
        if (rg0Var != null) {
            rg0Var.setTranslationY(-i10);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
        int dp = (this.c ? AndroidUtilities.dp(72.0f) : 0) + i10;
        s81 s81Var = this.S;
        if (s81Var != null) {
            s81Var.setPadding(0, currentActionBarHeight, 0, dp);
        }
        ec ecVar = this.j0;
        if (ecVar != null) {
            ecVar.F.setPadding(0, currentActionBarHeight, 0, dp);
        }
        ke keVar = this.k0;
        if (keVar != null) {
            keVar.a1.setPadding(0, currentActionBarHeight, 0, dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        r91 r91Var = this;
        r91Var.a0 = new jg.f(null);
        MessagesController messagesController = MessagesController.getInstance(r91Var.currentAccount);
        long j10 = r91Var.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(r91Var.currentAccount).getChatFull(j10);
        boolean z10 = chatFull != null && chatFull.can_view_stats;
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z11 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(ph.b.b(context, r91Var.resourceProvider, ph.a.I, R.string.Statistics));
        }
        arrayList.add(ph.b.b(context, r91Var.resourceProvider, ph.a.O, R.string.Boosts));
        if (z11) {
            arrayList.add(ph.b.b(context, r91Var.resourceProvider, ph.a.P, R.string.Monetization));
        }
        r91Var.n0 = (ph.b[]) arrayList.toArray(new ph.b[0]);
        rg0 rg0Var = new rg0(context, r91Var.resourceProvider);
        r91Var.m0 = rg0Var;
        rg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i10 = 0;
        while (true) {
            ph.b[] bVarArr = r91Var.n0;
            if (i10 >= bVarArr.length) {
                break;
            }
            ph.b bVar = bVarArr[i10];
            bVar.setOnClickListener(new ai.n1(r91Var, i10, 27));
            r91Var.m0.addView(r91Var.n0[i10]);
            r91Var.m0.i(bVar, true, false);
            i10++;
        }
        r91Var.i0 = new ei.h1(r91Var, r91Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            r91Var.j0 = new ec(r91Var, -j10, r91Var.getResourceProvider());
        }
        if (z11) {
            frameLayout = frameLayout2;
            ke keVar = new ke(r91Var.getParentActivity(), this, r91Var.currentAccount, -j10, getResourceProvider(), ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            r91Var = this;
            r91Var.k0 = keVar;
            keVar.setActionBar(r91Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z12 = z10;
        FrameLayout frameLayout3 = frameLayout;
        r91Var.i0.setAdapter(new r81(r91Var, z12, isBoostSupported, z11, frameLayout3));
        boolean z13 = r91Var.l0;
        boolean z14 = isBoostSupported && !z13;
        r91Var.c = z14;
        if (z14 && r91Var.d0) {
            r91Var.i0.setPosition(z12 ? 1 : 0);
        } else if (z14 && r91Var.e0) {
            r91Var.i0.setPosition((z12 ? 1 : 0) + ((z13 || !isBoostSupported) ? 0 : 1));
        }
        r91Var.m0(r91Var.i0.getCurrentPosition(), false);
        y8 y8Var = new y8(r91Var, r91Var.getParentActivity(), 8);
        r91Var.actionBar.setDrawBlurBackground(y8Var);
        y8Var.setBackgroundColor(r91Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7));
        ih.j jVar = new ih.j(y8Var);
        bh.b bVar2 = r91Var.F0;
        bVar2.f = jVar;
        bVar2.g = y8Var;
        y8Var.addView(r91Var.i0, w7.z5.g());
        y8Var.addView(r91Var.actionBar);
        if (r91Var.c) {
            y8Var.addView(r91Var.m0, w7.z5.e(344, 72, 81));
            r91Var.setBulletinDelegate(new ei.o8(12));
        }
        r91Var.fragmentView = y8Var;
        s81 s81Var = new s81(r91Var, context);
        r91Var.S = s81Var;
        s81Var.setSections(true);
        r91Var.S.setClipToPadding(false);
        s81 s81Var2 = r91Var.S;
        Objects.requireNonNull(s81Var2);
        r91Var.T = new bh.l(s81Var2, y8Var, new ms(s81Var2, 1));
        ec ecVar = r91Var.j0;
        if (ecVar != null) {
            org.telegram.ui.Components.im0 im0Var = ecVar.F;
            Objects.requireNonNull(im0Var);
            ecVar.G = new bh.l(im0Var, y8Var, new ms(im0Var, 0));
            r91Var.j0.F.j(new q81(r91Var, 1));
        }
        ke keVar2 = r91Var.k0;
        if (keVar2 != null) {
            org.telegram.ui.Components.a71 a71Var = keVar2.a1;
            Objects.requireNonNull(a71Var);
            keVar2.b1 = new bh.l(a71Var, y8Var, new x8(a71Var, 0));
            r91Var.k0.a1.j(new q81(r91Var, 2));
        }
        r91Var.G0 = new o81(r91Var, y8Var);
        r91Var.S.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        r91Var.b0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
        r91Var.W = xj0Var;
        xj0Var.setAutoRepeat(true);
        r91Var.W.f(R.raw.statistic_preload, 120, 120, null);
        r91Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        textView.setTag(Integer.valueOf(i11));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.h6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        textView2.setTag(Integer.valueOf(i12));
        org.telegram.messenger.wh.m(R.string.LoadingStatsDescription, textView2, 1);
        r91Var.b0.addView(r91Var.W, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        r91Var.b0.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        r91Var.b0.addView(textView2, w7.z5.q(-2, -2, 1));
        frameLayout3.addView(r91Var.b0, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 30.0f, 240, 17));
        if (r91Var.X == null) {
            r91Var.X = new w81(r91Var);
        }
        r91Var.S.setAdapter(r91Var.X);
        s4.b0 b0Var = new s4.b0();
        r91Var.U = b0Var;
        r91Var.S.setLayoutManager(b0Var);
        r91Var.Y = new p81();
        r91Var.S.setItemAnimator(null);
        r91Var.S.j(new q81(r91Var, 0));
        r91Var.S.setOnItemClickListener(new h11(r91Var, 7));
        r91Var.S.setOnItemLongClickListener(new qp0(r91Var, 17));
        frameLayout3.addView(r91Var.S);
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, null);
        r91Var.R = ooVar;
        ooVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        r91Var.R.getAvatarImageView().setScaleX(0.9f);
        r91Var.R.getAvatarImageView().setScaleY(0.9f);
        r91Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        r91Var.actionBar.addView(r91Var.R, 0, w7.z5.a(-1.0f, !r91Var.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f, -2, 51));
        TLRPC.Chat chat2 = r91Var.getMessagesController().getChat(Long.valueOf(j10));
        r91Var.R.setChatAvatar(chat2);
        r91Var.R.setTitle(chat2 == null ? "" : chat2.title);
        org.telegram.ui.Components.oo ooVar2 = r91Var.R;
        if (ooVar2.getSubtitleTextView() != null) {
            ooVar2.getSubtitleTextView().setVisibility(8);
        }
        i0.a.x(false, r91Var.actionBar);
        r91Var.actionBar.setActionBarMenuOnItemClick(new a31(r91Var, 5));
        r91Var.R.i(org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        r91Var.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i11, false), false);
        r91Var.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i11, false), true);
        r91Var.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z8, false), false);
        r91Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
        boolean z15 = r91Var.x0;
        a6 a6Var = r91Var.B0;
        if (z15) {
            r91Var.b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(a6Var, 500L);
            r91Var.b0.setVisibility(0);
            r91Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            r91Var.b0.setVisibility(8);
            r91Var.S.setVisibility(0);
        }
        dh.d c10 = bVar2.c(r91Var.m0, fh.c.f(r91Var.resourceProvider), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.666f));
        r91Var.m0.setBackground(c10);
        r91Var.c0();
        r91Var.y0 = new e91(r91Var.X, r91Var.U);
        return r91Var.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ci.a7) objArr[0]) == this.z0) {
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
            org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.n2) r.c.e(2, fragmentStack) : null;
            if (n2Var instanceof ko) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.n2 n2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.n2) r.c.e(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (n2Var2 instanceof ProfileActivity) {
                    ug.h.f(n2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.n2) r.c.e(3, fragmentStack2) : null;
            if (n2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var2, false);
            }
            finishFragment();
            if (n2Var3 instanceof sn) {
                ug.h.f(n2Var3, chat, true);
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
                if (i14 >= 0 && ((o91) arrayList.get(i14)).b() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList3.add((o91) arrayList.get(i14));
                    } else {
                        ((o91) arrayList.get(i14)).b = messageObject;
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
                o91 o91Var = (o91) arrayList.get(i12);
                if (o91Var.b == null) {
                    this.o0 = o91Var.b();
                    break;
                } else {
                    arrayList4.add(o91Var);
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

    public final void g0(d91[] d91VarArr) {
        w81 w81Var = this.X;
        if (w81Var != null) {
            w81Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.x0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.B0);
        this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new bc0(this, 26));
        this.S.setVisibility(0);
        this.S.setAlpha(0.0f);
        this.S.animate().alpha(1.0f).setDuration(230L).start();
        for (d91 d91Var : d91VarArr) {
            if (d91Var != null && d91Var.d == null && d91Var.f != null) {
                d91Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new qh(2, this, d91Var));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        by0 by0Var = new by0(4, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.b8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.b8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.b8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.b8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.b8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{lg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.x6));
        int i13 = org.telegram.ui.ActionBar.h6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, i13));
        org.telegram.ui.Components.oo ooVar = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ooVar != null ? ooVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Oi));
        org.telegram.ui.Components.oo ooVar2 = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ooVar2 != null ? ooVar2.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.c0) {
            int i14 = 0;
            while (i14 < 6) {
                k0(i14 == 0 ? this.d : i14 == 1 ? this.H : i14 == 2 ? this.I : i14 == 3 ? this.J : i14 == 4 ? this.K : this.L, arrayList, by0Var);
                i14++;
            }
        } else {
            int i15 = 0;
            while (i15 < 12) {
                k0(i15 == 0 ? this.d : i15 == 1 ? this.h : i15 == 2 ? this.n : i15 == 3 ? this.r : i15 == 4 ? this.s : i15 == 5 ? this.v : i15 == 6 ? this.x : i15 == 7 ? this.e : i15 == 8 ? this.w : i15 == 9 ? this.y : i15 == 10 ? this.E : this.F, arrayList, by0Var);
                i15++;
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
            if (((o91) arrayList.get(i11)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((o91) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.b);
        this.w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new n81(this, 0));
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
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new n81(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
            o91 o91Var = (o91) obj;
            MessageObject f7 = this.z0.f(o91Var.b());
            if (f7 != null) {
                o91Var.b = f7;
                arrayList.add(o91Var);
            }
        }
        this.q0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = this.n0;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].e(i11 == i10, z10);
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
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ci.i7 storiesController = getMessagesController().getStoriesController();
        long j10 = this.b;
        ci.a7 A = storiesController.A(-j10, 2, -1, true);
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.h0;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
            b2VarArr[0] = null;
        }
        ci.a7 a7Var = this.z0;
        if (a7Var != null) {
            a7Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
