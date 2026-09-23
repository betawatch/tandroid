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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ra1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final x5 B0;
    public final ah.h C0;
    public final fh.d D0;
    public da1 E;
    public final fh.d E0;
    public da1 F;
    public final ah.c F0;
    public na1 G;
    public o91 G0;
    public da1 H;
    public final ArrayList H0;
    public da1 I;
    public final RectF I0;
    public da1 J;
    public final RectF J0;
    public da1 K;
    public da1 L;
    public da1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.fo R;
    public s91 S;
    public ah.n T;
    public s4.c0 U;
    public final LruCache V;
    public org.telegram.ui.Components.bj0 W;
    public w91 X;
    public p91 Y;
    public qa1 Z;
    public TLRPC.ChatFull a;
    public ig.f a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public da1 d;
    public final boolean d0;
    public da1 e;
    public final boolean e0;
    public ma1 f;
    public long f0;
    public long g0;
    public da1 h;
    public final org.telegram.ui.ActionBar.b2[] h0;
    public ci.i1 i0;
    public bc j0;
    public je k0;
    public final boolean l0;
    public bh0 m0;
    public da1 n;
    public oh.b[] n0;
    public int o0;
    public final SparseIntArray p0;
    public final SparseIntArray q0;
    public da1 r;
    public final ArrayList r0;
    public da1 s;
    public final ArrayList s0;
    public final ArrayList t0;
    public final ArrayList u0;
    public da1 v;
    public final ArrayList v0;
    public da1 w;
    public boolean w0;
    public da1 x;
    public boolean x0;
    public da1 y;
    public ea1 y0;
    public ai.d9 z0;

    public ra1(Bundle bundle) {
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
        this.B0 = new x5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.H0 = arrayList;
        RectF rectF = new RectF();
        this.I0 = rectF;
        RectF rectF2 = new RectF();
        this.J0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = bundle.getLong("chat_id");
        this.b = j3;
        this.c0 = bundle.getBoolean("is_megagroup", false);
        this.d0 = bundle.getBoolean("start_from_boosts", false);
        this.e0 = bundle.getBoolean("start_from_monetization", false);
        this.l0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().getChatFull(j3);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.C0 = null;
            this.D0 = null;
            this.E0 = null;
            this.F0 = new ah.c(cVar);
            return;
        }
        this.C0 = new ah.h(false);
        this.D0 = new fh.d(null);
        fh.d dVar = new fh.d(null);
        this.E0 = dVar;
        ah.c cVar2 = new ah.c(dVar);
        this.F0 = cVar2;
        cVar2.i = LiteMode.isEnabled(262144);
    }

    public static /* synthetic */ void U(ra1 ra1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(ra1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            ra1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new l91(ra1Var, arrayList, 0));
    }

    public static void V(final ra1 ra1Var, TLObject tLObject) {
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
        ArrayList arrayList5 = ra1Var.N;
        ArrayList arrayList6 = ra1Var.O;
        ArrayList arrayList7 = ra1Var.r0;
        String str5 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final da1[] da1VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            da1 da1Var = da1VarArr[2];
            if (da1Var != null) {
                da1Var.n = true;
            }
            ma1 ma1Var = new ma1();
            com.google.firebase.messaging.t a2 = ma1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            ma1Var.o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            ma1Var.p = (String) a2.b;
            ma1Var.q = (String) a2.e;
            ma1Var.r = ((Boolean) a2.c).booleanValue();
            ma1Var.s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.t a10 = ma1.a(tL_broadcastStats.reactions_per_story);
            ma1Var.t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            ma1Var.u = (String) a10.b;
            ma1Var.v = (String) a10.e;
            ma1Var.w = ((Boolean) a10.c).booleanValue();
            ma1Var.x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.t a11 = ma1.a(tL_broadcastStats.views_per_story);
            ma1Var.y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            ma1Var.z = (String) a11.b;
            ma1Var.A = (String) a11.e;
            ma1Var.B = ((Boolean) a11.c).booleanValue();
            ma1Var.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.t a12 = ma1.a(tL_broadcastStats.shares_per_story);
            ma1Var.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            ma1Var.E = (String) a12.b;
            ma1Var.F = (String) a12.e;
            ma1Var.G = ((Boolean) a12.c).booleanValue();
            ma1Var.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            float abs = d10 == 0.0d ? 0.0f : Math.abs((i12 / ((float) d10)) * 100.0f);
            ma1Var.a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            ma1Var.b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs == 0.0f) {
                i10 = i12;
                ma1Var.c = "";
            } else {
                int i13 = (int) abs;
                if (abs == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12 > 0 ? str3 : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    ma1Var.c = sb2.toString() + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i12 > 0 ? str3 : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    ma1Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            ma1Var.d = i10 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            float abs2 = d12 == 0.0d ? 0.0f : Math.abs((i14 / ((float) d12)) * 100.0f);
            ma1Var.i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            ma1Var.j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 == 0 || abs2 == 0.0f) {
                ma1Var.k = "";
            } else {
                int i15 = (int) abs2;
                if (abs2 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i14 > 0 ? str3 : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    ma1Var.k = sb4.toString() + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i14 > 0 ? str3 : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    ma1Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            ma1Var.l = i14 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            float abs3 = d14 == 0.0d ? 0.0f : Math.abs((i16 / ((float) d14)) * 100.0f);
            ma1Var.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            ma1Var.f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 == 0 || abs3 == 0.0f) {
                ma1Var.g = "";
            } else {
                int i17 = (int) abs3;
                if (abs3 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i16 > 0 ? str3 : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    ma1Var.g = sb6.toString() + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i16 > 0 ? str3 : "");
                    sb7.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    ma1Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            ma1Var.h = i16 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            ma1Var.m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f7;
            if (f7 == i18) {
                Locale locale7 = Locale.ENGLISH;
                ma1Var.n = a4.a.n(i18, "%");
            } else {
                ma1Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            ra1Var.f = ma1Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            ra1Var.f0 = tL_statsDateRangeDays.max_date * 1000;
            ra1Var.g0 = tL_statsDateRangeDays.min_date * 1000;
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
                oa1 oa1Var = new oa1();
                oa1Var.a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(oa1Var);
                    str4 = str5;
                    i11 = i22;
                    ra1Var.p0.put(oa1Var.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str4 = str5;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(oa1Var.b()));
                    ra1Var.t0.add(oa1Var);
                    ra1Var.q0.put(oa1Var.b(), i20);
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
            AndroidUtilities.runOnUIThread(new l91(ra1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                ra1Var.getMessagesStorage().getMessages(-ra1Var.b, 0L, false, arrayList12.size(), ((oa1) arrayList12.get(0)).b(), 0, 0, ra1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            final int i24 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(ra1Var) { // from class: org.telegram.ui.k91
                public final /* synthetic */ ra1 b;

                {
                    this.b = ra1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            ra1 ra1Var2 = this.b;
                            ra1Var2.getClass();
                            da1[] da1VarArr2 = da1VarArr;
                            ra1Var2.d = da1VarArr2[0];
                            ra1Var2.H = da1VarArr2[1];
                            ra1Var2.I = da1VarArr2[2];
                            ra1Var2.J = da1VarArr2[3];
                            ra1Var2.K = da1VarArr2[4];
                            ra1Var2.L = da1VarArr2[5];
                            ra1Var2.e = da1VarArr2[6];
                            ra1Var2.M = da1VarArr2[7];
                            ra1Var2.g0(da1VarArr2);
                            break;
                        default:
                            ra1 ra1Var3 = this.b;
                            ra1Var3.getClass();
                            da1[] da1VarArr3 = da1VarArr;
                            ra1Var3.r = da1VarArr3[0];
                            ra1Var3.h = da1VarArr3[1];
                            ra1Var3.e = da1VarArr3[2];
                            ra1Var3.n = da1VarArr3[3];
                            ra1Var3.d = da1VarArr3[4];
                            ra1Var3.s = da1VarArr3[5];
                            ra1Var3.v = da1VarArr3[6];
                            ra1Var3.w = da1VarArr3[7];
                            ra1Var3.x = da1VarArr3[8];
                            ra1Var3.y = da1VarArr3[9];
                            ra1Var3.E = da1VarArr3[10];
                            ra1Var3.F = da1VarArr3[11];
                            ra1Var3.g0(da1VarArr3);
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
            final da1[] da1VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            da1 da1Var2 = da1VarArr2[6];
            if (da1Var2 != null) {
                da1Var2.n = true;
            }
            da1 da1Var3 = da1VarArr2[7];
            if (da1Var3 != null) {
                da1Var3.o = true;
            }
            na1 na1Var = new na1();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i25 = (int) (d15 - d16);
            float abs4 = d16 == 0.0d ? 0.0f : Math.abs((i25 / ((float) d16)) * 100.0f);
            na1Var.a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            na1Var.b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i25 == 0 || abs4 == 0.0f) {
                na1Var.c = "";
            } else {
                int i26 = (int) abs4;
                if (abs4 == i26) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i25 > 0 ? str3 : "");
                    sb8.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    na1Var.c = sb8.toString() + " (" + i26 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i25 > 0 ? str3 : "");
                    sb9.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    na1Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str);
                }
            }
            na1Var.d = i25 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i27 = (int) (d17 - d18);
            float abs5 = d18 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d18)) * 100.0f);
            na1Var.i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            na1Var.j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i27 == 0 || abs5 == 0.0f) {
                na1Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i27 > 0 ? str3 : "");
                sb10.append(AndroidUtilities.formatWholeNumber(i27, 0));
                na1Var.k = sb10.toString();
            }
            na1Var.l = i27 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i28 = (int) (d19 - d20);
            float abs6 = d20 == 0.0d ? 0.0f : Math.abs((i28 / ((float) d20)) * 100.0f);
            na1Var.m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            na1Var.n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i28 == 0 || abs6 == 0.0f) {
                na1Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i28 > 0 ? str3 : "");
                sb11.append(AndroidUtilities.formatWholeNumber(i28, 0));
                na1Var.o = sb11.toString();
            }
            na1Var.p = i28 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i29 = (int) (d21 - d22);
            float abs7 = d22 == 0.0d ? 0.0f : Math.abs((i29 / ((float) d22)) * 100.0f);
            na1Var.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            na1Var.f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i29 == 0 || abs7 == 0.0f) {
                na1Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i29 > 0 ? str3 : "");
                sb12.append(AndroidUtilities.formatWholeNumber(i29, 0));
                na1Var.g = sb12.toString();
            }
            na1Var.h = i29 >= 0;
            ra1Var.G = na1Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            ra1Var.f0 = tL_statsDateRangeDays2.max_date * 1000;
            ra1Var.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i30 = 0;
                while (i30 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i30);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ka1 ka1Var = new ka1();
                    ka1Var.a = ka1.a(tL_statsGroupTopPoster.user_id, arrayList14);
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
                    ka1Var.b = sb13.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(ka1Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(ka1Var);
                    i30++;
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
                for (int i32 = 0; i32 < tL_megagroupStats.top_admins.size(); i32++) {
                    ArrayList arrayList19 = ra1Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i32);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ka1 ka1Var2 = new ka1();
                    ka1Var2.a = ka1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb14 = new StringBuilder();
                    int i33 = tL_statsGroupTopAdmin.deleted;
                    if (i33 > 0) {
                        sb14.append(LocaleController.formatPluralString("Deletions", i33, new Object[0]));
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
                    ka1Var2.b = sb14.toString();
                    arrayList19.add(ka1Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i34 = 0; i34 < tL_megagroupStats.top_inviters.size(); i34++) {
                    ArrayList arrayList22 = ra1Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i34);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ka1 ka1Var3 = new ka1();
                    ka1Var3.a = ka1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i35 = tL_statsGroupTopInviter.invitations;
                    if (i35 > 0) {
                        ka1Var3.b = LocaleController.formatPluralString("Invitations", i35, new Object[0]);
                    } else {
                        ka1Var3.b = "";
                    }
                    arrayList22.add(ka1Var3);
                }
            }
            final int i36 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(ra1Var) { // from class: org.telegram.ui.k91
                public final /* synthetic */ ra1 b;

                {
                    this.b = ra1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i36) {
                        case 0:
                            ra1 ra1Var2 = this.b;
                            ra1Var2.getClass();
                            da1[] da1VarArr22 = da1VarArr2;
                            ra1Var2.d = da1VarArr22[0];
                            ra1Var2.H = da1VarArr22[1];
                            ra1Var2.I = da1VarArr22[2];
                            ra1Var2.J = da1VarArr22[3];
                            ra1Var2.K = da1VarArr22[4];
                            ra1Var2.L = da1VarArr22[5];
                            ra1Var2.e = da1VarArr22[6];
                            ra1Var2.M = da1VarArr22[7];
                            ra1Var2.g0(da1VarArr22);
                            break;
                        default:
                            ra1 ra1Var3 = this.b;
                            ra1Var3.getClass();
                            da1[] da1VarArr3 = da1VarArr2;
                            ra1Var3.r = da1VarArr3[0];
                            ra1Var3.h = da1VarArr3[1];
                            ra1Var3.e = da1VarArr3[2];
                            ra1Var3.n = da1VarArr3[3];
                            ra1Var3.d = da1VarArr3[4];
                            ra1Var3.s = da1VarArr3[5];
                            ra1Var3.v = da1VarArr3[6];
                            ra1Var3.w = da1VarArr3[7];
                            ra1Var3.x = da1VarArr3[8];
                            ra1Var3.y = da1VarArr3[9];
                            ra1Var3.E = da1VarArr3[10];
                            ra1Var3.F = da1VarArr3[11];
                            ra1Var3.g0(da1VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void W(ra1 ra1Var) {
        RectF rectF = ra1Var.J0;
        ah.h hVar = ra1Var.C0;
        if (Build.VERSION.SDK_INT < 31 || hVar == null || ra1Var.fragmentView == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (ra1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        ra1Var.I0.set(0.0f, -dp, ra1Var.fragmentView.getMeasuredWidth(), ra1Var.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, ra1Var.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        hVar.g(2, ra1Var.H0);
        hVar.e(ra1Var.G0, ra1Var.fragmentView.getMeasuredWidth(), ra1Var.fragmentView.getMeasuredHeight());
    }

    public static void Y(ra1 ra1Var) {
        View currentView = ra1Var.i0.getCurrentView();
        bc bcVar = ra1Var.j0;
        if (currentView == bcVar) {
            ra1Var.actionBar.setAdaptiveBackground(bcVar.F);
            return;
        }
        je jeVar = ra1Var.k0;
        if (currentView == jeVar) {
            ra1Var.actionBar.setAdaptiveBackground(jeVar.a1);
        } else {
            ra1Var.actionBar.setAdaptiveBackground(ra1Var.S);
        }
    }

    public static void Z(ra1 ra1Var) {
        qa1 qa1Var = ra1Var.Z;
        if (qa1Var != null) {
            qa1Var.b = true;
        }
        int childCount = ra1Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ra1Var.S.getChildAt(i10);
            if (childAt instanceof ca1) {
                ((ca1) childAt).b.t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new w5(-chat.id) : new ra1(bundle);
    }

    public static jg.b e0(JSONObject jSONObject, int i10, boolean z10) {
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

    public static da1 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        da1 da1Var = new da1(str, i10);
        da1Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                jg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                da1Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                da1Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.a) == null || jArr2.length < 2) {
                    da1Var.l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    da1Var.e = new jg.e(e02, j3);
                    da1Var.c = j3;
                    return da1Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            da1Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return da1Var;
    }

    public static void k0(da1 da1Var, ArrayList arrayList, org.telegram.ui.ActionBar.i6 i6Var) {
        jg.b bVar;
        if (da1Var == null || (bVar = da1Var.d) == null) {
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
                if (!org.telegram.ui.ActionBar.h6.c1(i11)) {
                    org.telegram.ui.ActionBar.h6.u1(aVar.g, org.telegram.ui.ActionBar.h6.I == org.telegram.ui.ActionBar.h6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.h6.nl[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, aVar.g));
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof ca1) {
            ((ca1) view).d();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.a7) {
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false)), org.telegram.ui.ActionBar.h6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7), 0, 0);
            qqVar.w = true;
            view.setBackground(qqVar);
            return;
        }
        if (view instanceof kg.c) {
            ((kg.c) view).a();
        } else if (view instanceof la1) {
            int i10 = la1.d;
            ((la1) view).b();
        }
    }

    public final void c0() {
        int i10 = AndroidUtilities.navigationBarHeight;
        int i11 = AndroidUtilities.statusBarHeight;
        bh0 bh0Var = this.m0;
        if (bh0Var != null) {
            bh0Var.setTranslationY(-i10);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
        int dp = (this.c ? AndroidUtilities.dp(72.0f) : 0) + i10;
        s91 s91Var = this.S;
        if (s91Var != null) {
            s91Var.setPadding(0, currentActionBarHeight, 0, dp);
        }
        bc bcVar = this.j0;
        if (bcVar != null) {
            bcVar.F.setPadding(0, currentActionBarHeight, 0, dp);
        }
        je jeVar = this.k0;
        if (jeVar != null) {
            jeVar.a1.setPadding(0, currentActionBarHeight, 0, dp);
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
        ra1 ra1Var = this;
        ra1Var.a0 = new ig.f(null);
        MessagesController messagesController = MessagesController.getInstance(ra1Var.currentAccount);
        long j3 = ra1Var.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(ra1Var.currentAccount).getChatFull(j3);
        boolean z10 = chatFull != null && chatFull.can_view_stats;
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z11 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(oh.b.b(context, ra1Var.resourceProvider, oh.a.I, R.string.Statistics));
        }
        arrayList.add(oh.b.b(context, ra1Var.resourceProvider, oh.a.N, R.string.Boosts));
        if (z11) {
            arrayList.add(oh.b.b(context, ra1Var.resourceProvider, oh.a.O, R.string.Monetization));
        }
        ra1Var.n0 = (oh.b[]) arrayList.toArray(new oh.b[0]);
        bh0 bh0Var = new bh0(context, ra1Var.resourceProvider);
        ra1Var.m0 = bh0Var;
        bh0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i10 = 0;
        while (true) {
            oh.b[] bVarArr = ra1Var.n0;
            if (i10 >= bVarArr.length) {
                break;
            }
            oh.b bVar = bVarArr[i10];
            bVar.setOnClickListener(new ci.n4(ra1Var, i10, 25));
            ra1Var.m0.addView(ra1Var.n0[i10]);
            ra1Var.m0.i(bVar, true, false);
            i10++;
        }
        ra1Var.i0 = new ci.i1(ra1Var, ra1Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            ra1Var.j0 = new bc(ra1Var, -j3, ra1Var.getResourceProvider());
        }
        if (z11) {
            frameLayout = frameLayout2;
            je jeVar = new je(ra1Var.getParentActivity(), this, ra1Var.currentAccount, -j3, getResourceProvider(), ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            ra1Var = this;
            ra1Var.k0 = jeVar;
            jeVar.setActionBar(ra1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z12 = z10;
        FrameLayout frameLayout3 = frameLayout;
        ra1Var.i0.setAdapter(new r91(ra1Var, z12, isBoostSupported, z11, frameLayout3));
        boolean z13 = ra1Var.l0;
        boolean z14 = isBoostSupported && !z13;
        ra1Var.c = z14;
        if (z14 && ra1Var.d0) {
            ra1Var.i0.setPosition(z12 ? 1 : 0);
        } else if (z14 && ra1Var.e0) {
            ra1Var.i0.setPosition((z12 ? 1 : 0) + ((z13 || !isBoostSupported) ? 0 : 1));
        }
        ra1Var.m0(ra1Var.i0.getCurrentPosition(), false);
        w8 w8Var = new w8(ra1Var, ra1Var.getParentActivity(), 8);
        ra1Var.actionBar.setDrawBlurBackground(w8Var);
        w8Var.setBackgroundColor(ra1Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7));
        hh.k kVar = new hh.k(w8Var);
        ah.c cVar = ra1Var.F0;
        cVar.f = kVar;
        cVar.g = w8Var;
        w8Var.addView(ra1Var.i0, w7.x5.g());
        w8Var.addView(ra1Var.actionBar);
        if (ra1Var.c) {
            w8Var.addView(ra1Var.m0, w7.x5.e(344, 72, 81));
            ra1Var.setBulletinDelegate(new ci.a9(12));
        }
        ra1Var.fragmentView = w8Var;
        s91 s91Var = new s91(ra1Var, context);
        ra1Var.S = s91Var;
        s91Var.setSections(true);
        ra1Var.S.setClipToPadding(false);
        s91 s91Var2 = ra1Var.S;
        Objects.requireNonNull(s91Var2);
        ra1Var.T = new ah.n(s91Var2, w8Var, new ts(s91Var2, 1));
        bc bcVar = ra1Var.j0;
        if (bcVar != null) {
            org.telegram.ui.Components.ml0 ml0Var = bcVar.F;
            Objects.requireNonNull(ml0Var);
            bcVar.G = new ah.n(ml0Var, w8Var, new ts(ml0Var, 0));
            ra1Var.j0.F.j(new q91(ra1Var, 1));
        }
        je jeVar2 = ra1Var.k0;
        if (jeVar2 != null) {
            org.telegram.ui.Components.d61 d61Var = jeVar2.a1;
            Objects.requireNonNull(d61Var);
            jeVar2.b1 = new ah.n(d61Var, w8Var, new v8(d61Var, 0));
            ra1Var.k0.a1.j(new q91(ra1Var, 2));
        }
        ra1Var.G0 = new o91(ra1Var, w8Var);
        ra1Var.S.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        ra1Var.b0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(context);
        ra1Var.W = bj0Var;
        bj0Var.setAutoRepeat(true);
        ra1Var.W.f(R.raw.statistic_preload, 120, 120, null);
        ra1Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        textView.setTag(Integer.valueOf(i11));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.h6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        textView2.setTag(Integer.valueOf(i12));
        org.telegram.messenger.ul.l(R.string.LoadingStatsDescription, textView2, 1);
        ra1Var.b0.addView(ra1Var.W, w7.x5.t(120, 120, 1, 0, 0, 0, 20));
        ra1Var.b0.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 10));
        ra1Var.b0.addView(textView2, w7.x5.q(-2, -2, 1));
        frameLayout3.addView(ra1Var.b0, w7.x5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (ra1Var.X == null) {
            ra1Var.X = new w91(ra1Var);
        }
        ra1Var.S.setAdapter(ra1Var.X);
        s4.c0 c0Var = new s4.c0();
        ra1Var.U = c0Var;
        ra1Var.S.setLayoutManager(c0Var);
        ra1Var.Y = new p91();
        ra1Var.S.setItemAnimator(null);
        ra1Var.S.j(new q91(ra1Var, 0));
        ra1Var.S.setOnItemClickListener(new s21(ra1Var, 6));
        ra1Var.S.setOnItemLongClickListener(new nl0(ra1Var, 18));
        frameLayout3.addView(ra1Var.S);
        org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(context, null, false, null);
        ra1Var.R = foVar;
        foVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        ra1Var.R.getAvatarImageView().setScaleX(0.9f);
        ra1Var.R.getAvatarImageView().setScaleY(0.9f);
        ra1Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        ra1Var.actionBar.addView(ra1Var.R, 0, w7.x5.d(-2, -1.0f, 51, !ra1Var.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = ra1Var.getMessagesController().getChat(Long.valueOf(j3));
        ra1Var.R.setChatAvatar(chat2);
        ra1Var.R.setTitle(chat2 == null ? "" : chat2.title);
        org.telegram.ui.Components.fo foVar2 = ra1Var.R;
        if (foVar2.getSubtitleTextView() != null) {
            foVar2.getSubtitleTextView().setVisibility(8);
        }
        hg.c.x(false, ra1Var.actionBar);
        ra1Var.actionBar.setActionBarMenuOnItemClick(new o81(ra1Var, 1));
        ra1Var.R.i(org.telegram.ui.ActionBar.h6.w0(null, i11, false), org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        ra1Var.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i11, false), false);
        ra1Var.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i11, false), true);
        ra1Var.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.z8, false), false);
        ra1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        boolean z15 = ra1Var.x0;
        x5 x5Var = ra1Var.B0;
        if (z15) {
            ra1Var.b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(x5Var, 500L);
            ra1Var.b0.setVisibility(0);
            ra1Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            ra1Var.b0.setVisibility(8);
            ra1Var.S.setVisibility(0);
        }
        ch.d c10 = cVar.c(ra1Var.m0, eh.b.f(ra1Var.resourceProvider), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.666f));
        ra1Var.m0.setBackground(c10);
        ra1Var.c0();
        ra1Var.y0 = new ea1(ra1Var.X, ra1Var.U);
        return ra1Var.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ai.d9) objArr[0]) == this.z0) {
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
            org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.q3.g(2, fragmentStack) : null;
            if (n2Var instanceof so) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.n2 n2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.q3.g(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (n2Var2 instanceof ProfileActivity) {
                    tg.k.f(n2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.q3.g(3, fragmentStack2) : null;
            if (n2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var2, false);
            }
            finishFragment();
            if (n2Var3 instanceof xn) {
                tg.k.f(n2Var3, chat, true);
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
                if (i14 >= 0 && ((oa1) arrayList.get(i14)).b() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList3.add((oa1) arrayList.get(i14));
                    } else {
                        ((oa1) arrayList.get(i14)).b = messageObject;
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
                oa1 oa1Var = (oa1) arrayList.get(i12);
                if (oa1Var.b == null) {
                    this.o0 = oa1Var.b();
                    break;
                } else {
                    arrayList4.add(oa1Var);
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

    public final void g0(da1[] da1VarArr) {
        w91 w91Var = this.X;
        if (w91Var != null) {
            w91Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.x0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.B0);
        this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new wq0(this, 21));
        this.S.setVisibility(0);
        this.S.setAlpha(0.0f);
        this.S.animate().alpha(1.0f).setDuration(230L).start();
        for (da1 da1Var : da1VarArr) {
            if (da1Var != null && da1Var.d == null && da1Var.f != null) {
                da1Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new org.telegram.ui.Components.r51(1, this, da1Var));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        qy0 qy0Var = new qy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{kg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.x6));
        int i13 = org.telegram.ui.ActionBar.h6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, i13));
        org.telegram.ui.Components.fo foVar = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.j6(foVar != null ? foVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Oi));
        org.telegram.ui.Components.fo foVar2 = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.j6(foVar2 != null ? foVar2.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.c0) {
            int i14 = 0;
            while (i14 < 6) {
                k0(i14 == 0 ? this.d : i14 == 1 ? this.H : i14 == 2 ? this.I : i14 == 3 ? this.J : i14 == 4 ? this.K : this.L, arrayList, qy0Var);
                i14++;
            }
        } else {
            int i15 = 0;
            while (i15 < 12) {
                k0(i15 == 0 ? this.d : i15 == 1 ? this.h : i15 == 2 ? this.n : i15 == 3 ? this.r : i15 == 4 ? this.s : i15 == 5 ? this.v : i15 == 6 ? this.x : i15 == 7 ? this.e : i15 == 8 ? this.w : i15 == 9 ? this.y : i15 == 10 ? this.E : this.F, arrayList, qy0Var);
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
            if (((oa1) arrayList.get(i11)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((oa1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.b);
        this.w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new n91(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.l0) {
            return;
        }
        boolean z10 = this.c0;
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
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new n91(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ci.i1 i1Var = this.i0;
        if (i1Var == null || (i1Var.b == 0 && i1Var.c == 1.0f)) {
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
            oa1 oa1Var = (oa1) obj;
            MessageObject f7 = this.z0.f(oa1Var.b());
            if (f7 != null) {
                oa1Var.b = f7;
                arrayList.add(oa1Var);
            }
        }
        this.q0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.n0;
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
            oh.b bVar = this.n0[i10];
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
        ai.l9 storiesController = getMessagesController().getStoriesController();
        long j3 = this.b;
        ai.d9 A = storiesController.A(-j3, 2, -1, true);
        this.z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j3, this.classGuid, true);
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
        ai.d9 d9Var = this.z0;
        if (d9Var != null) {
            d9Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
