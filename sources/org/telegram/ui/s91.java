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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s91 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public e91 A;
    public final ng.d A0;
    public e91 B;
    public final ig.a B0;
    public o91 C;
    public p81 C0;
    public e91 D;
    public final ArrayList D0;
    public e91 E;
    public final RectF E0;
    public e91 F;
    public final RectF F0;
    public e91 G;
    public e91 H;
    public e91 I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public org.telegram.ui.Components.tn N;
    public t81 O;
    public ig.k P;
    public f2.m0 Q;
    public final LruCache R;
    public org.telegram.ui.Components.pi0 S;
    public x81 T;
    public q81 U;
    public r91 V;
    public qf.f W;
    public LinearLayout X;
    public final boolean Y;
    public final boolean Z;
    public TLRPC.ChatFull a;
    public final boolean a0;
    public final long b;
    public long b0;
    public boolean c;
    public long c0;
    public e91 d;
    public final org.telegram.ui.ActionBar.c2[] d0;
    public e91 e;
    public kh.j1 e0;
    public n91 f;
    public xb f0;
    public fe g0;
    public e91 h;
    public final boolean h0;
    public pg0 i0;
    public wg.b[] j0;
    public int k0;
    public final SparseIntArray l0;
    public final SparseIntArray m0;
    public e91 n;
    public final ArrayList n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public e91 r;
    public final ArrayList r0;
    public e91 s;
    public boolean s0;
    public boolean t0;
    public f91 u0;
    public e91 v;
    public ih.n6 v0;
    public e91 w;
    public int w0;
    public e91 x;
    public final v5 x0;
    public e91 y;
    public final ig.e y0;
    public final ng.d z0;

    public s91(Bundle bundle) {
        super(bundle);
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.R = new LruCache(50);
        this.d0 = new org.telegram.ui.ActionBar.c2[1];
        this.k0 = -1;
        this.l0 = new SparseIntArray();
        this.m0 = new SparseIntArray();
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        this.t0 = true;
        this.x0 = new v5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.D0 = arrayList;
        RectF rectF = new RectF();
        this.E0 = rectF;
        RectF rectF2 = new RectF();
        this.F0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = bundle.getLong("chat_id");
        this.b = j10;
        this.Y = bundle.getBoolean("is_megagroup", false);
        this.Z = bundle.getBoolean("start_from_boosts", false);
        this.a0 = bundle.getBoolean("start_from_monetization", false);
        this.h0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().getChatFull(j10);
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.y0 = null;
            this.z0 = null;
            this.A0 = null;
            this.B0 = new ig.a(cVar);
            return;
        }
        this.y0 = new ig.e(false);
        this.z0 = new ng.d(null);
        ng.d dVar = new ng.d(null);
        this.A0 = dVar;
        ig.a aVar = new ig.a(dVar);
        this.B0 = aVar;
        aVar.f = LiteMode.isEnabled(262144);
    }

    public static /* synthetic */ void T(s91 s91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                arrayList.add(new MessageObject(s91Var.currentAccount, arrayList2.get(i9), false, true));
            }
            s91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new m81(s91Var, arrayList, 0));
    }

    public static void U(final s91 s91Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        ArrayList arrayList3;
        int i9;
        int i10;
        ArrayList arrayList4;
        String str4;
        ArrayList arrayList5 = s91Var.J;
        ArrayList arrayList6 = s91Var.K;
        ArrayList arrayList7 = s91Var.n0;
        String str5 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final e91[] e91VarArr = {e0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), e0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), e0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), e0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), e0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), e0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), e0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), e0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), e0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), e0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), e0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), e0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            e91 e91Var = e91VarArr[2];
            if (e91Var != null) {
                e91Var.n = true;
            }
            n91 n91Var = new n91();
            com.google.firebase.messaging.t a2 = n91.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            n91Var.o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            n91Var.p = (String) a2.b;
            n91Var.q = (String) a2.e;
            n91Var.r = ((Boolean) a2.c).booleanValue();
            n91Var.s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.t a3 = n91.a(tL_broadcastStats.reactions_per_story);
            n91Var.t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            n91Var.u = (String) a3.b;
            n91Var.v = (String) a3.e;
            n91Var.w = ((Boolean) a3.c).booleanValue();
            n91Var.x = ((Boolean) a3.d).booleanValue();
            com.google.firebase.messaging.t a10 = n91.a(tL_broadcastStats.views_per_story);
            n91Var.y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            n91Var.z = (String) a10.b;
            n91Var.A = (String) a10.e;
            n91Var.B = ((Boolean) a10.c).booleanValue();
            n91Var.C = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.t a11 = n91.a(tL_broadcastStats.shares_per_story);
            n91Var.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            n91Var.E = (String) a11.b;
            n91Var.F = (String) a11.e;
            n91Var.G = ((Boolean) a11.c).booleanValue();
            n91Var.H = ((Boolean) a11.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d9 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i11 = (int) (d - d9);
            float abs = d9 == 0.0d ? 0.0f : Math.abs((i11 / ((float) d9)) * 100.0f);
            n91Var.a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            n91Var.b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs == 0.0f) {
                i9 = i11;
                n91Var.c = "";
            } else {
                int i12 = (int) abs;
                if (abs == i12) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11 > 0 ? str3 : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i11, 0));
                    n91Var.c = sb2.toString() + " (" + i12 + "%)";
                    i9 = i11;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i11 > 0 ? str3 : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i11, 0));
                    i9 = i11;
                    n91Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            n91Var.d = i9 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d10 = tL_statsAbsValueAndPrev2.current;
            double d11 = tL_statsAbsValueAndPrev2.previous;
            int i13 = (int) (d10 - d11);
            float abs2 = d11 == 0.0d ? 0.0f : Math.abs((i13 / ((float) d11)) * 100.0f);
            n91Var.i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            n91Var.j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i13 == 0 || abs2 == 0.0f) {
                n91Var.k = "";
            } else {
                int i14 = (int) abs2;
                if (abs2 == i14) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i13 > 0 ? str3 : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    n91Var.k = sb4.toString() + " (" + i14 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i13 > 0 ? str3 : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    n91Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            n91Var.l = i13 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            float abs3 = d13 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d13)) * 100.0f);
            n91Var.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            n91Var.f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i15 == 0 || abs3 == 0.0f) {
                n91Var.g = "";
            } else {
                int i16 = (int) abs3;
                if (abs3 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i15 > 0 ? str3 : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    n91Var.g = sb6.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i15 > 0 ? str3 : "");
                    sb7.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    n91Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            n91Var.h = i15 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            n91Var.m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                n91Var.n = ta.b.c(i17, "%");
            } else {
                n91Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            s91Var.f = n91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            s91Var.b0 = tL_statsDateRangeDays.max_date * 1000;
            s91Var.c0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i20 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i20);
                int i21 = i20 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                p91 p91Var = new p91();
                p91Var.a = postInteractionCounters2;
                int i22 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(p91Var);
                    str4 = str5;
                    i10 = i21;
                    s91Var.l0.put(p91Var.b(), i18);
                    i18++;
                } else {
                    i10 = i21;
                    arrayList4 = arrayList8;
                    str4 = str5;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(p91Var.b()));
                    s91Var.p0.add(p91Var);
                    s91Var.m0.put(p91Var.b(), i19);
                    i19++;
                }
                arrayList10 = arrayList11;
                str5 = str4;
                i20 = i10;
                arrayList8 = arrayList4;
                size = i22;
            }
            ArrayList arrayList12 = arrayList8;
            str = str5;
            AndroidUtilities.runOnUIThread(new m81(s91Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                s91Var.getMessagesStorage().getMessages(-s91Var.b, 0L, false, arrayList12.size(), ((p91) arrayList12.get(0)).b(), 0, 0, s91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            final int i23 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(s91Var) { // from class: org.telegram.ui.l81
                public final /* synthetic */ s91 b;

                {
                    this.b = s91Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            s91 s91Var2 = this.b;
                            s91Var2.getClass();
                            e91[] e91VarArr2 = e91VarArr;
                            s91Var2.d = e91VarArr2[0];
                            s91Var2.D = e91VarArr2[1];
                            s91Var2.E = e91VarArr2[2];
                            s91Var2.F = e91VarArr2[3];
                            s91Var2.G = e91VarArr2[4];
                            s91Var2.H = e91VarArr2[5];
                            s91Var2.e = e91VarArr2[6];
                            s91Var2.I = e91VarArr2[7];
                            s91Var2.f0(e91VarArr2);
                            break;
                        default:
                            s91 s91Var3 = this.b;
                            s91Var3.getClass();
                            e91[] e91VarArr3 = e91VarArr;
                            s91Var3.r = e91VarArr3[0];
                            s91Var3.h = e91VarArr3[1];
                            s91Var3.e = e91VarArr3[2];
                            s91Var3.n = e91VarArr3[3];
                            s91Var3.d = e91VarArr3[4];
                            s91Var3.s = e91VarArr3[5];
                            s91Var3.v = e91VarArr3[6];
                            s91Var3.w = e91VarArr3[7];
                            s91Var3.x = e91VarArr3[8];
                            s91Var3.y = e91VarArr3[9];
                            s91Var3.A = e91VarArr3[10];
                            s91Var3.B = e91VarArr3[11];
                            s91Var3.f0(e91VarArr3);
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
            final e91[] e91VarArr2 = {e0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), e0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), e0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), e0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), e0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), e0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), e0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), e0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            e91 e91Var2 = e91VarArr2[6];
            if (e91Var2 != null) {
                e91Var2.n = true;
            }
            e91 e91Var3 = e91VarArr2[7];
            if (e91Var3 != null) {
                e91Var3.o = true;
            }
            o91 o91Var = new o91();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d14 = tL_statsAbsValueAndPrev4.current;
            double d15 = tL_statsAbsValueAndPrev4.previous;
            int i24 = (int) (d14 - d15);
            float abs4 = d15 == 0.0d ? 0.0f : Math.abs((i24 / ((float) d15)) * 100.0f);
            o91Var.a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            o91Var.b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i24 == 0 || abs4 == 0.0f) {
                o91Var.c = "";
            } else {
                int i25 = (int) abs4;
                if (abs4 == i25) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i24 > 0 ? str3 : "");
                    sb8.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    o91Var.c = sb8.toString() + " (" + i25 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i24 > 0 ? str3 : "");
                    sb9.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    o91Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str);
                }
            }
            o91Var.d = i24 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d16 = tL_statsAbsValueAndPrev5.current;
            double d17 = tL_statsAbsValueAndPrev5.previous;
            int i26 = (int) (d16 - d17);
            float abs5 = d17 == 0.0d ? 0.0f : Math.abs((i26 / ((float) d17)) * 100.0f);
            o91Var.i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            o91Var.j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i26 == 0 || abs5 == 0.0f) {
                o91Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i26 > 0 ? str3 : "");
                sb10.append(AndroidUtilities.formatWholeNumber(i26, 0));
                o91Var.k = sb10.toString();
            }
            o91Var.l = i26 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d18 - d19);
            float abs6 = d19 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d19)) * 100.0f);
            o91Var.m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            o91Var.n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i27 == 0 || abs6 == 0.0f) {
                o91Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i27 > 0 ? str3 : "");
                sb11.append(AndroidUtilities.formatWholeNumber(i27, 0));
                o91Var.o = sb11.toString();
            }
            o91Var.p = i27 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d20 - d21);
            float abs7 = d21 == 0.0d ? 0.0f : Math.abs((i28 / ((float) d21)) * 100.0f);
            o91Var.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            o91Var.f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i28 == 0 || abs7 == 0.0f) {
                o91Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i28 > 0 ? str3 : "");
                sb12.append(AndroidUtilities.formatWholeNumber(i28, 0));
                o91Var.g = sb12.toString();
            }
            o91Var.h = i28 >= 0;
            s91Var.C = o91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            s91Var.b0 = tL_statsDateRangeDays2.max_date * 1000;
            s91Var.c0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    l91 l91Var = new l91();
                    l91Var.a = l91.a(tL_statsGroupTopPoster.user_id, arrayList14);
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
                    l91Var.b = sb13.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(l91Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(l91Var);
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
                    ArrayList arrayList19 = s91Var.M;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    l91 l91Var2 = new l91();
                    l91Var2.a = l91.a(tL_statsGroupTopAdmin.user_id, arrayList20);
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
                    l91Var2.b = sb14.toString();
                    arrayList19.add(l91Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = s91Var.L;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    l91 l91Var3 = new l91();
                    l91Var3.a = l91.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        l91Var3.b = LocaleController.formatPluralString("Invitations", i34, new Object[0]);
                    } else {
                        l91Var3.b = "";
                    }
                    arrayList22.add(l91Var3);
                }
            }
            final int i35 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(s91Var) { // from class: org.telegram.ui.l81
                public final /* synthetic */ s91 b;

                {
                    this.b = s91Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i35) {
                        case 0:
                            s91 s91Var2 = this.b;
                            s91Var2.getClass();
                            e91[] e91VarArr22 = e91VarArr2;
                            s91Var2.d = e91VarArr22[0];
                            s91Var2.D = e91VarArr22[1];
                            s91Var2.E = e91VarArr22[2];
                            s91Var2.F = e91VarArr22[3];
                            s91Var2.G = e91VarArr22[4];
                            s91Var2.H = e91VarArr22[5];
                            s91Var2.e = e91VarArr22[6];
                            s91Var2.I = e91VarArr22[7];
                            s91Var2.f0(e91VarArr22);
                            break;
                        default:
                            s91 s91Var3 = this.b;
                            s91Var3.getClass();
                            e91[] e91VarArr3 = e91VarArr2;
                            s91Var3.r = e91VarArr3[0];
                            s91Var3.h = e91VarArr3[1];
                            s91Var3.e = e91VarArr3[2];
                            s91Var3.n = e91VarArr3[3];
                            s91Var3.d = e91VarArr3[4];
                            s91Var3.s = e91VarArr3[5];
                            s91Var3.v = e91VarArr3[6];
                            s91Var3.w = e91VarArr3[7];
                            s91Var3.x = e91VarArr3[8];
                            s91Var3.y = e91VarArr3[9];
                            s91Var3.A = e91VarArr3[10];
                            s91Var3.B = e91VarArr3[11];
                            s91Var3.f0(e91VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void V(s91 s91Var) {
        RectF rectF = s91Var.F0;
        ig.e eVar = s91Var.y0;
        if (Build.VERSION.SDK_INT < 31 || eVar == null || s91Var.fragmentView == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (s91Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        s91Var.E0.set(0.0f, -dp, s91Var.fragmentView.getMeasuredWidth(), s91Var.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, s91Var.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(2, s91Var.D0);
        eVar.e(s91Var.C0, s91Var.fragmentView.getMeasuredWidth(), s91Var.fragmentView.getMeasuredHeight());
    }

    public static void X(s91 s91Var) {
        View currentView = s91Var.e0.getCurrentView();
        xb xbVar = s91Var.f0;
        if (currentView == xbVar) {
            s91Var.actionBar.setAdaptiveBackground(xbVar.B);
            return;
        }
        fe feVar = s91Var.g0;
        if (currentView == feVar) {
            s91Var.actionBar.setAdaptiveBackground(feVar.W0);
        } else {
            s91Var.actionBar.setAdaptiveBackground(s91Var.O);
        }
    }

    public static void Y(s91 s91Var) {
        r91 r91Var = s91Var.V;
        if (r91Var != null) {
            r91Var.b = true;
        }
        int childCount = s91Var.O.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = s91Var.O.getChildAt(i9);
            if (childAt instanceof d91) {
                ((d91) childAt).b.p0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 c0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new u5(-chat.id) : new s91(bundle);
    }

    public static rf.b d0(JSONObject jSONObject, int i9, boolean z10) {
        if (i9 == 0) {
            return new rf.b(jSONObject);
        }
        if (i9 == 1) {
            return new rf.c(jSONObject);
        }
        if (i9 == 2) {
            rf.d dVar = new rf.d(jSONObject);
            int length = ((rf.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                dVar.l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = dVar.l;
                    jArr[i10] = jArr[i10] + ((rf.a) dVar.d.get(i11)).a[i10];
                }
            }
            dVar.m = new SegmentTree(dVar.l);
            return dVar;
        }
        if (i9 != 4) {
            return null;
        }
        rf.e eVar = new rf.e(jSONObject);
        if (z10) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j10 = 0;
            for (int i12 = 0; i12 < eVar.d.size(); i12++) {
                int length2 = eVar.a.length;
                for (int i13 = 0; i13 < length2; i13++) {
                    long j11 = ((rf.a) eVar.d.get(i12)).a[i13];
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
                    arrayList.add((rf.a) eVar.d.get(i14));
                }
            }
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList.get(i15);
                i15++;
                eVar.d.remove((rf.a) obj);
            }
        }
        int length3 = ((rf.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i16 = 0; i16 < length3; i16++) {
            eVar.l[i16] = 0;
            for (int i17 = 0; i17 < size3; i17++) {
                long[] jArr3 = eVar.l;
                jArr3[i16] = jArr3[i16] + ((rf.a) eVar.d.get(i17)).a[i16];
            }
        }
        new SegmentTree(eVar.l);
        return eVar;
    }

    public static e91 e0(TL_stats.StatsGraph statsGraph, String str, int i9, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        e91 e91Var = new e91(str, i9);
        e91Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                rf.b d02 = d0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i9, z10);
                e91Var.d = d02;
                if (d02 != null) {
                    d02.h = statsGraph.rate;
                }
                e91Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (d02 == null || (jArr2 = d02.a) == null || jArr2.length < 2) {
                    e91Var.l = true;
                }
                if (i9 == 4 && d02 != null && (jArr = d02.a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    e91Var.e = new rf.e(d02, j10);
                    e91Var.c = j10;
                    return e91Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            e91Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return e91Var;
    }

    public static void j0(e91 e91Var, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var) {
        rf.b bVar;
        if (e91Var == null || (bVar = e91Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            rf.a aVar = (rf.a) obj;
            int i10 = aVar.g;
            if (i10 >= 0) {
                if (!org.telegram.ui.ActionBar.f6.c1(i10)) {
                    org.telegram.ui.ActionBar.f6.u1(aVar.g, org.telegram.ui.ActionBar.f6.I == org.telegram.ui.ActionBar.f6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.f6.nl[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, aVar.g));
            }
        }
    }

    public static void k0(View view) {
        if (view instanceof d91) {
            ((d91) view).d();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.z6) {
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false)), org.telegram.ui.ActionBar.f6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7), 0, 0);
            fqVar.w = true;
            view.setBackground(fqVar);
            return;
        }
        if (view instanceof sf.c) {
            ((sf.c) view).a();
        } else if (view instanceof m91) {
            int i9 = m91.d;
            ((m91) view).b();
        }
    }

    public final void b0() {
        int i9 = AndroidUtilities.navigationBarHeight;
        int i10 = AndroidUtilities.statusBarHeight;
        pg0 pg0Var = this.i0;
        if (pg0Var != null) {
            pg0Var.setTranslationY(-i9);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
        int dp = (this.c ? AndroidUtilities.dp(72.0f) : 0) + i9;
        t81 t81Var = this.O;
        if (t81Var != null) {
            t81Var.setPadding(0, currentActionBarHeight, 0, dp);
        }
        xb xbVar = this.f0;
        if (xbVar != null) {
            xbVar.B.setPadding(0, currentActionBarHeight, 0, dp);
        }
        fe feVar = this.g0;
        if (feVar != null) {
            feVar.W0.setPadding(0, currentActionBarHeight, 0, dp);
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
        s91 s91Var = this;
        s91Var.W = new qf.f(null);
        MessagesController messagesController = MessagesController.getInstance(s91Var.currentAccount);
        long j10 = s91Var.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(s91Var.currentAccount).getChatFull(j10);
        boolean z10 = chatFull != null && chatFull.can_view_stats;
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z11 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(wg.b.b(context, s91Var.resourceProvider, wg.a.E, R.string.Statistics));
        }
        arrayList.add(wg.b.b(context, s91Var.resourceProvider, wg.a.J, R.string.Boosts));
        if (z11) {
            arrayList.add(wg.b.b(context, s91Var.resourceProvider, wg.a.K, R.string.Monetization));
        }
        s91Var.j0 = (wg.b[]) arrayList.toArray(new wg.b[0]);
        pg0 pg0Var = new pg0(context, s91Var.resourceProvider);
        s91Var.i0 = pg0Var;
        pg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i9 = 0;
        while (true) {
            wg.b[] bVarArr = s91Var.j0;
            if (i9 >= bVarArr.length) {
                break;
            }
            wg.b bVar = bVarArr[i9];
            bVar.setOnClickListener(new gh.z0(s91Var, i9, 24));
            s91Var.i0.addView(s91Var.j0[i9]);
            s91Var.i0.i(bVar, true, false);
            i9++;
        }
        s91Var.e0 = new kh.j1(s91Var, s91Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            s91Var.f0 = new xb(s91Var, -j10, s91Var.getResourceProvider());
        }
        if (z11) {
            frameLayout = frameLayout2;
            fe feVar = new fe(s91Var.getParentActivity(), this, s91Var.currentAccount, -j10, getResourceProvider(), ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            s91Var = this;
            s91Var.g0 = feVar;
            feVar.setActionBar(s91Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z12 = z10;
        FrameLayout frameLayout3 = frameLayout;
        s91Var.e0.setAdapter(new s81(s91Var, z12, isBoostSupported, z11, frameLayout3));
        boolean z13 = s91Var.h0;
        boolean z14 = isBoostSupported && !z13;
        s91Var.c = z14;
        if (z14 && s91Var.Z) {
            s91Var.e0.setPosition(z12 ? 1 : 0);
        } else if (z14 && s91Var.a0) {
            s91Var.e0.setPosition((z12 ? 1 : 0) + ((z13 || !isBoostSupported) ? 0 : 1));
        }
        s91Var.l0(s91Var.e0.getCurrentPosition(), false);
        fh.x4 x4Var = new fh.x4(s91Var, s91Var.getParentActivity(), 9);
        s91Var.actionBar.setDrawBlurBackground(x4Var);
        x4Var.setBackgroundColor(s91Var.getThemedColor(org.telegram.ui.ActionBar.f6.a7));
        pg.i iVar = new pg.i(x4Var);
        ig.a aVar = s91Var.B0;
        aVar.d = iVar;
        aVar.e = x4Var;
        x4Var.addView(s91Var.e0, g7.e6.g());
        x4Var.addView(s91Var.actionBar);
        if (s91Var.c) {
            x4Var.addView(s91Var.i0, g7.e6.e(344, 72, 81));
            s91Var.setBulletinDelegate(new bg.z(16));
        }
        s91Var.fragmentView = x4Var;
        t81 t81Var = new t81(s91Var, context);
        s91Var.O = t81Var;
        t81Var.setSections(true);
        s91Var.O.setClipToPadding(false);
        t81 t81Var2 = s91Var.O;
        Objects.requireNonNull(t81Var2);
        s91Var.P = new ig.k(t81Var2, x4Var, new ns(t81Var2, 1));
        xb xbVar = s91Var.f0;
        if (xbVar != null) {
            org.telegram.ui.Components.wk0 wk0Var = xbVar.B;
            Objects.requireNonNull(wk0Var);
            xbVar.C = new ig.k(wk0Var, x4Var, new ns(wk0Var, 0));
            s91Var.f0.B.j(new r81(s91Var, 1));
        }
        fe feVar2 = s91Var.g0;
        if (feVar2 != null) {
            org.telegram.ui.Components.i51 i51Var = feVar2.W0;
            Objects.requireNonNull(i51Var);
            feVar2.X0 = new ig.k(i51Var, x4Var, new u8(i51Var, 0));
            s91Var.g0.W0.j(new r81(s91Var, 2));
        }
        s91Var.C0 = new p81(s91Var, x4Var);
        s91Var.O.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        s91Var.X = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        s91Var.S = pi0Var;
        pi0Var.setAutoRepeat(true);
        s91Var.S.f(R.raw.statistic_preload, 120, 120, null);
        s91Var.S.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.f6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        textView.setTag(Integer.valueOf(i10));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.f6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        textView2.setTag(Integer.valueOf(i11));
        org.telegram.messenger.ll.l(R.string.LoadingStatsDescription, textView2, 1);
        s91Var.X.addView(s91Var.S, g7.e6.t(120, 120, 1, 0, 0, 0, 20));
        s91Var.X.addView(textView, g7.e6.t(-2, -2, 1, 0, 0, 0, 10));
        s91Var.X.addView(textView2, g7.e6.q(-2, -2, 1));
        frameLayout3.addView(s91Var.X, g7.e6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (s91Var.T == null) {
            s91Var.T = new x81(s91Var);
        }
        s91Var.O.setAdapter(s91Var.T);
        f2.m0 m0Var = new f2.m0();
        s91Var.Q = m0Var;
        s91Var.O.setLayoutManager(m0Var);
        s91Var.U = new q81();
        s91Var.O.setItemAnimator(null);
        s91Var.O.j(new r81(s91Var, 0));
        s91Var.O.setOnItemClickListener(new c21(s91Var, 5));
        s91Var.O.setOnItemLongClickListener(new dl0(s91Var, 18));
        frameLayout3.addView(s91Var.O);
        org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(context, null, false, null);
        s91Var.N = tnVar;
        tnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        s91Var.N.getAvatarImageView().setScaleX(0.9f);
        s91Var.N.getAvatarImageView().setScaleY(0.9f);
        s91Var.N.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        s91Var.actionBar.addView(s91Var.N, 0, g7.e6.d(-2, -1.0f, 51, !s91Var.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = s91Var.getMessagesController().getChat(Long.valueOf(j10));
        s91Var.N.setChatAvatar(chat2);
        s91Var.N.setTitle(chat2 == null ? "" : chat2.title);
        org.telegram.ui.Components.tn tnVar2 = s91Var.N;
        if (tnVar2.getSubtitleTextView() != null) {
            tnVar2.getSubtitleTextView().setVisibility(8);
        }
        org.telegram.ui.Cells.j2.v(false, s91Var.actionBar);
        s91Var.actionBar.setActionBarMenuOnItemClick(new cd0(s91Var, 26));
        s91Var.N.i(org.telegram.ui.ActionBar.f6.w0(null, i10, false), org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        s91Var.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i10, false), false);
        s91Var.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i10, false), true);
        s91Var.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z8, false), false);
        s91Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        boolean z15 = s91Var.t0;
        v5 v5Var = s91Var.x0;
        if (z15) {
            s91Var.X.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(v5Var, 500L);
            s91Var.X.setVisibility(0);
            s91Var.O.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            s91Var.X.setVisibility(8);
            s91Var.O.setVisibility(0);
        }
        kg.d c10 = aVar.c(s91Var.i0, mg.c.f(s91Var.resourceProvider), false);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(7.666f));
        s91Var.i0.setBackground(c10);
        s91Var.b0();
        s91Var.u0 = new f91(s91Var.T, s91Var.Q);
        return s91Var.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i9 == NotificationCenter.storiesListUpdated) {
            if (((ih.n6) objArr[0]) == this.v0) {
                i0();
                n0();
                if (this.T != null) {
                    this.O.setItemAnimator(null);
                    this.u0.f();
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.o2) j3.r0.k(2, fragmentStack) : null;
            if (o2Var instanceof ho) {
                ((ActionBarLayout) getParentLayout()).a0(o2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.o2 o2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.o2) j3.r0.k(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (o2Var2 instanceof ProfileActivity) {
                    bg.u.f(o2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.o2) j3.r0.k(3, fragmentStack2) : null;
            if (o2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).a0(o2Var2, false);
            }
            finishFragment();
            if (o2Var3 instanceof qn) {
                bg.u.f(o2Var3, chat, true);
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.messagesDidLoad) {
            if (i9 == NotificationCenter.chatInfoDidLoad) {
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
            int i12 = 0;
            while (true) {
                arrayList = this.n0;
                if (i12 >= size) {
                    break;
                }
                MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                int i13 = this.l0.get(messageObject.getId(), -1);
                if (i13 >= 0 && ((p91) arrayList.get(i13)).b() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList3.add((p91) arrayList.get(i13));
                    } else {
                        ((p91) arrayList.get(i13)).b = messageObject;
                    }
                }
                i12++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.o0;
            arrayList4.clear();
            int size2 = arrayList.size();
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                p91 p91Var = (p91) arrayList.get(i11);
                if (p91Var.b == null) {
                    this.k0 = p91Var.b();
                    break;
                } else {
                    arrayList4.add(p91Var);
                    i11++;
                }
            }
            if (arrayList4.size() < 20) {
                g0();
            }
            n0();
            if (this.T != null) {
                this.O.setItemAnimator(null);
                this.u0.f();
            }
        }
    }

    public final void f0(e91[] e91VarArr) {
        x81 x81Var = this.T;
        if (x81Var != null) {
            x81Var.E();
            this.O.setItemAnimator(null);
            this.T.l();
        }
        this.t0 = false;
        LinearLayout linearLayout = this.X;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.x0);
        this.X.animate().alpha(0.0f).setDuration(230L).setListener(new bc0(this, 27));
        this.O.setVisibility(0);
        this.O.setAlpha(0.0f);
        this.O.animate().alpha(1.0f).setDuration(230L).start();
        for (e91 e91Var : e91VarArr) {
            if (e91Var != null && e91Var.d == null && e91Var.f != null) {
                e91Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new org.telegram.ui.Components.v41(1, this, e91Var));
            }
        }
    }

    public final void g0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.n0;
        int size = arrayList.size();
        int i9 = 0;
        for (int i10 = this.l0.get(this.k0); i10 < size; i10++) {
            if (((p91) arrayList.get(i10)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((p91) arrayList.get(i10)).b()));
                i9++;
                if (i9 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.b);
        this.s0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new o81(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        sx0 sx0Var = new sx0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"message"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"views"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"shares"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"likes"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"date"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{sf.c.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.x6));
        int i12 = org.telegram.ui.ActionBar.f6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i12));
        org.telegram.ui.Components.tn tnVar = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.h6(tnVar != null ? tnVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.Oi));
        org.telegram.ui.Components.tn tnVar2 = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.h6(tnVar2 != null ? tnVar2.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.f6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        if (this.Y) {
            int i13 = 0;
            while (i13 < 6) {
                j0(i13 == 0 ? this.d : i13 == 1 ? this.D : i13 == 2 ? this.E : i13 == 3 ? this.F : i13 == 4 ? this.G : this.H, arrayList, sx0Var);
                i13++;
            }
        } else {
            int i14 = 0;
            while (i14 < 12) {
                j0(i14 == 0 ? this.d : i14 == 1 ? this.h : i14 == 2 ? this.n : i14 == 3 ? this.r : i14 == 4 ? this.s : i14 == 5 ? this.v : i14 == 6 ? this.x : i14 == 7 ? this.e : i14 == 8 ? this.w : i14 == 9 ? this.y : i14 == 10 ? this.A : this.B, arrayList, sx0Var);
                i14++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.h0) {
            return;
        }
        boolean z10 = this.Y;
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
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new o81(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void i0() {
        ArrayList arrayList = this.q0;
        arrayList.clear();
        ArrayList arrayList2 = this.p0;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            p91 p91Var = (p91) obj;
            MessageObject f10 = this.v0.f(p91Var.b());
            if (f10 != null) {
                p91Var.b = f10;
                arrayList.add(p91Var);
            }
        }
        this.m0.clear();
        arrayList2.clear();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        kh.j1 j1Var = this.e0;
        if (j1Var == null || (j1Var.b == 0 && j1Var.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void l0(int i9, boolean z10) {
        int i10 = 0;
        while (true) {
            wg.b[] bVarArr = this.j0;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10].e(i10 == i9, z10);
            i10++;
        }
    }

    public final void m0(float f10, boolean z10) {
        for (int i9 = 0; i9 < this.j0.length; i9++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i9 - f10));
            wg.b bVar = this.j0[i9];
            bVar.F = max;
            bVar.E = z10;
            bVar.invalidate();
        }
        this.i0.invalidate();
    }

    public final void n0() {
        ArrayList arrayList = this.r0;
        arrayList.clear();
        arrayList.addAll(this.o0);
        arrayList.addAll(this.q0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.ui.Components.w0(1))));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ih.v6 storiesController = getMessagesController().getStoriesController();
        long j10 = this.b;
        ih.n6 A = storiesController.A(-j10, 2, -1, true);
        this.v0 = A;
        if (A != null) {
            this.w0 = A.o();
        }
        if (this.a != null) {
            h0();
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
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.d0;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
            c2VarArr[0] = null;
        }
        ih.n6 n6Var = this.v0;
        if (n6Var != null) {
            n6Var.z(this.w0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        b0();
    }
}
