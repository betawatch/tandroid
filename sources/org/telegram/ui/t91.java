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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t91 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public f91 A;
    public final qg.d A0;
    public f91 B;
    public final lg.a B0;
    public p91 C;
    public q81 C0;
    public f91 D;
    public final ArrayList D0;
    public f91 E;
    public final RectF E0;
    public f91 F;
    public final RectF F0;
    public f91 G;
    public f91 H;
    public f91 I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public org.telegram.ui.Components.xn N;
    public u81 O;
    public lg.k P;
    public f2.j0 Q;
    public final LruCache R;
    public org.telegram.ui.Components.aj0 S;
    public y81 T;
    public r81 U;
    public s91 V;
    public tf.f W;
    public LinearLayout X;
    public final boolean Y;
    public final boolean Z;
    public TLRPC.ChatFull a;
    public final boolean a0;
    public final long b;
    public long b0;
    public boolean c;
    public long c0;
    public f91 d;
    public final org.telegram.ui.ActionBar.c2[] d0;
    public f91 e;
    public nh.g1 e0;
    public o91 f;
    public wb f0;
    public de g0;
    public f91 h;
    public final boolean h0;
    public pg0 i0;
    public zg.b[] j0;
    public int k0;
    public final SparseIntArray l0;
    public final SparseIntArray m0;
    public f91 n;
    public final ArrayList n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public f91 r;
    public final ArrayList r0;
    public f91 s;
    public boolean s0;
    public boolean t0;
    public g91 u0;
    public f91 v;
    public lh.k6 v0;
    public f91 w;
    public int w0;
    public f91 x;
    public final w5 x0;
    public f91 y;
    public final lg.e y0;
    public final qg.d z0;

    public t91(Bundle bundle) {
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
        this.x0 = new w5(this, 13);
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
        qg.c cVar = new qg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.y0 = null;
            this.z0 = null;
            this.A0 = null;
            this.B0 = new lg.a(cVar);
            return;
        }
        this.y0 = new lg.e(false);
        this.z0 = new qg.d(null);
        qg.d dVar = new qg.d(null);
        this.A0 = dVar;
        lg.a aVar = new lg.a(dVar);
        this.B0 = aVar;
        aVar.f = LiteMode.isEnabled(262144);
    }

    public static /* synthetic */ void U(t91 t91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(t91Var.currentAccount, arrayList2.get(i10), false, true));
            }
            t91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new n81(t91Var, arrayList, 0));
    }

    public static void V(final t91 t91Var, TLObject tLObject) {
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
        ArrayList arrayList5 = t91Var.J;
        ArrayList arrayList6 = t91Var.K;
        ArrayList arrayList7 = t91Var.n0;
        String str5 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final f91[] f91VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            f91 f91Var = f91VarArr[2];
            if (f91Var != null) {
                f91Var.n = true;
            }
            o91 o91Var = new o91();
            com.google.firebase.messaging.s a2 = o91.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            o91Var.o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            o91Var.p = (String) a2.b;
            o91Var.q = (String) a2.e;
            o91Var.r = ((Boolean) a2.c).booleanValue();
            o91Var.s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.s a10 = o91.a(tL_broadcastStats.reactions_per_story);
            o91Var.t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            o91Var.u = (String) a10.b;
            o91Var.v = (String) a10.e;
            o91Var.w = ((Boolean) a10.c).booleanValue();
            o91Var.x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.s a11 = o91.a(tL_broadcastStats.views_per_story);
            o91Var.y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            o91Var.z = (String) a11.b;
            o91Var.A = (String) a11.e;
            o91Var.B = ((Boolean) a11.c).booleanValue();
            o91Var.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.s a12 = o91.a(tL_broadcastStats.shares_per_story);
            o91Var.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            o91Var.E = (String) a12.b;
            o91Var.F = (String) a12.e;
            o91Var.G = ((Boolean) a12.c).booleanValue();
            o91Var.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            float abs = d10 == 0.0d ? 0.0f : Math.abs((i12 / ((float) d10)) * 100.0f);
            o91Var.a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            o91Var.b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs == 0.0f) {
                i10 = i12;
                o91Var.c = "";
            } else {
                int i13 = (int) abs;
                if (abs == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12 > 0 ? str3 : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    o91Var.c = sb2.toString() + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i12 > 0 ? str3 : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    o91Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            o91Var.d = i10 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            float abs2 = d12 == 0.0d ? 0.0f : Math.abs((i14 / ((float) d12)) * 100.0f);
            o91Var.i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            o91Var.j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 == 0 || abs2 == 0.0f) {
                o91Var.k = "";
            } else {
                int i15 = (int) abs2;
                if (abs2 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i14 > 0 ? str3 : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    o91Var.k = sb4.toString() + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i14 > 0 ? str3 : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    o91Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            o91Var.l = i14 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            float abs3 = d14 == 0.0d ? 0.0f : Math.abs((i16 / ((float) d14)) * 100.0f);
            o91Var.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            o91Var.f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 == 0 || abs3 == 0.0f) {
                o91Var.g = "";
            } else {
                int i17 = (int) abs3;
                if (abs3 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i16 > 0 ? str3 : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    o91Var.g = sb6.toString() + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i16 > 0 ? str3 : "");
                    sb7.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    o91Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            o91Var.h = i16 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f9 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            o91Var.m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f9;
            if (f9 == i18) {
                Locale locale7 = Locale.ENGLISH;
                o91Var.n = u3.c.d(i18, "%");
            } else {
                o91Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f9), "%");
            }
            t91Var.f = o91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            t91Var.b0 = tL_statsDateRangeDays.max_date * 1000;
            t91Var.c0 = tL_statsDateRangeDays.min_date * 1000;
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
                q91 q91Var = new q91();
                q91Var.a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(q91Var);
                    str4 = str5;
                    i11 = i22;
                    t91Var.l0.put(q91Var.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str4 = str5;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(q91Var.b()));
                    t91Var.p0.add(q91Var);
                    t91Var.m0.put(q91Var.b(), i20);
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
            AndroidUtilities.runOnUIThread(new n81(t91Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                t91Var.getMessagesStorage().getMessages(-t91Var.b, 0L, false, arrayList12.size(), ((q91) arrayList12.get(0)).b(), 0, 0, t91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            final int i24 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(t91Var) { // from class: org.telegram.ui.m81
                public final /* synthetic */ t91 b;

                {
                    this.b = t91Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            t91 t91Var2 = this.b;
                            t91Var2.getClass();
                            f91[] f91VarArr2 = f91VarArr;
                            t91Var2.d = f91VarArr2[0];
                            t91Var2.D = f91VarArr2[1];
                            t91Var2.E = f91VarArr2[2];
                            t91Var2.F = f91VarArr2[3];
                            t91Var2.G = f91VarArr2[4];
                            t91Var2.H = f91VarArr2[5];
                            t91Var2.e = f91VarArr2[6];
                            t91Var2.I = f91VarArr2[7];
                            t91Var2.g0(f91VarArr2);
                            break;
                        default:
                            t91 t91Var3 = this.b;
                            t91Var3.getClass();
                            f91[] f91VarArr3 = f91VarArr;
                            t91Var3.r = f91VarArr3[0];
                            t91Var3.h = f91VarArr3[1];
                            t91Var3.e = f91VarArr3[2];
                            t91Var3.n = f91VarArr3[3];
                            t91Var3.d = f91VarArr3[4];
                            t91Var3.s = f91VarArr3[5];
                            t91Var3.v = f91VarArr3[6];
                            t91Var3.w = f91VarArr3[7];
                            t91Var3.x = f91VarArr3[8];
                            t91Var3.y = f91VarArr3[9];
                            t91Var3.A = f91VarArr3[10];
                            t91Var3.B = f91VarArr3[11];
                            t91Var3.g0(f91VarArr3);
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
            final f91[] f91VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            f91 f91Var2 = f91VarArr2[6];
            if (f91Var2 != null) {
                f91Var2.n = true;
            }
            f91 f91Var3 = f91VarArr2[7];
            if (f91Var3 != null) {
                f91Var3.o = true;
            }
            p91 p91Var = new p91();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i25 = (int) (d15 - d16);
            float abs4 = d16 == 0.0d ? 0.0f : Math.abs((i25 / ((float) d16)) * 100.0f);
            p91Var.a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            p91Var.b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i25 == 0 || abs4 == 0.0f) {
                p91Var.c = "";
            } else {
                int i26 = (int) abs4;
                if (abs4 == i26) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i25 > 0 ? str3 : "");
                    sb8.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    p91Var.c = sb8.toString() + " (" + i26 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i25 > 0 ? str3 : "");
                    sb9.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    p91Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str);
                }
            }
            p91Var.d = i25 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i27 = (int) (d17 - d18);
            float abs5 = d18 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d18)) * 100.0f);
            p91Var.i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            p91Var.j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i27 == 0 || abs5 == 0.0f) {
                p91Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i27 > 0 ? str3 : "");
                sb10.append(AndroidUtilities.formatWholeNumber(i27, 0));
                p91Var.k = sb10.toString();
            }
            p91Var.l = i27 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i28 = (int) (d19 - d20);
            float abs6 = d20 == 0.0d ? 0.0f : Math.abs((i28 / ((float) d20)) * 100.0f);
            p91Var.m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            p91Var.n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i28 == 0 || abs6 == 0.0f) {
                p91Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i28 > 0 ? str3 : "");
                sb11.append(AndroidUtilities.formatWholeNumber(i28, 0));
                p91Var.o = sb11.toString();
            }
            p91Var.p = i28 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i29 = (int) (d21 - d22);
            float abs7 = d22 == 0.0d ? 0.0f : Math.abs((i29 / ((float) d22)) * 100.0f);
            p91Var.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            p91Var.f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i29 == 0 || abs7 == 0.0f) {
                p91Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i29 > 0 ? str3 : "");
                sb12.append(AndroidUtilities.formatWholeNumber(i29, 0));
                p91Var.g = sb12.toString();
            }
            p91Var.h = i29 >= 0;
            t91Var.C = p91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            t91Var.b0 = tL_statsDateRangeDays2.max_date * 1000;
            t91Var.c0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i30 = 0;
                while (i30 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i30);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    m91 m91Var = new m91();
                    m91Var.a = m91.a(tL_statsGroupTopPoster.user_id, arrayList14);
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
                    m91Var.b = sb13.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(m91Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(m91Var);
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
                    ArrayList arrayList19 = t91Var.M;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i32);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    m91 m91Var2 = new m91();
                    m91Var2.a = m91.a(tL_statsGroupTopAdmin.user_id, arrayList20);
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
                    m91Var2.b = sb14.toString();
                    arrayList19.add(m91Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i34 = 0; i34 < tL_megagroupStats.top_inviters.size(); i34++) {
                    ArrayList arrayList22 = t91Var.L;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i34);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    m91 m91Var3 = new m91();
                    m91Var3.a = m91.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i35 = tL_statsGroupTopInviter.invitations;
                    if (i35 > 0) {
                        m91Var3.b = LocaleController.formatPluralString("Invitations", i35, new Object[0]);
                    } else {
                        m91Var3.b = "";
                    }
                    arrayList22.add(m91Var3);
                }
            }
            final int i36 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(t91Var) { // from class: org.telegram.ui.m81
                public final /* synthetic */ t91 b;

                {
                    this.b = t91Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i36) {
                        case 0:
                            t91 t91Var2 = this.b;
                            t91Var2.getClass();
                            f91[] f91VarArr22 = f91VarArr2;
                            t91Var2.d = f91VarArr22[0];
                            t91Var2.D = f91VarArr22[1];
                            t91Var2.E = f91VarArr22[2];
                            t91Var2.F = f91VarArr22[3];
                            t91Var2.G = f91VarArr22[4];
                            t91Var2.H = f91VarArr22[5];
                            t91Var2.e = f91VarArr22[6];
                            t91Var2.I = f91VarArr22[7];
                            t91Var2.g0(f91VarArr22);
                            break;
                        default:
                            t91 t91Var3 = this.b;
                            t91Var3.getClass();
                            f91[] f91VarArr3 = f91VarArr2;
                            t91Var3.r = f91VarArr3[0];
                            t91Var3.h = f91VarArr3[1];
                            t91Var3.e = f91VarArr3[2];
                            t91Var3.n = f91VarArr3[3];
                            t91Var3.d = f91VarArr3[4];
                            t91Var3.s = f91VarArr3[5];
                            t91Var3.v = f91VarArr3[6];
                            t91Var3.w = f91VarArr3[7];
                            t91Var3.x = f91VarArr3[8];
                            t91Var3.y = f91VarArr3[9];
                            t91Var3.A = f91VarArr3[10];
                            t91Var3.B = f91VarArr3[11];
                            t91Var3.g0(f91VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void W(t91 t91Var) {
        RectF rectF = t91Var.F0;
        lg.e eVar = t91Var.y0;
        if (Build.VERSION.SDK_INT < 31 || eVar == null || t91Var.fragmentView == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (t91Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        t91Var.E0.set(0.0f, -dp, t91Var.fragmentView.getMeasuredWidth(), t91Var.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, t91Var.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(2, t91Var.D0);
        eVar.e(t91Var.C0, t91Var.fragmentView.getMeasuredWidth(), t91Var.fragmentView.getMeasuredHeight());
    }

    public static void Y(t91 t91Var) {
        View currentView = t91Var.e0.getCurrentView();
        wb wbVar = t91Var.f0;
        if (currentView == wbVar) {
            t91Var.actionBar.setAdaptiveBackground(wbVar.B);
            return;
        }
        de deVar = t91Var.g0;
        if (currentView == deVar) {
            t91Var.actionBar.setAdaptiveBackground(deVar.W0);
        } else {
            t91Var.actionBar.setAdaptiveBackground(t91Var.O);
        }
    }

    public static void Z(t91 t91Var) {
        s91 s91Var = t91Var.V;
        if (s91Var != null) {
            s91Var.b = true;
        }
        int childCount = t91Var.O.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = t91Var.O.getChildAt(i10);
            if (childAt instanceof e91) {
                ((e91) childAt).b.p0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new v5(-chat.id) : new t91(bundle);
    }

    public static uf.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new uf.b(jSONObject);
        }
        if (i10 == 1) {
            return new uf.c(jSONObject);
        }
        if (i10 == 2) {
            uf.d dVar = new uf.d(jSONObject);
            int length = ((uf.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                dVar.l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = dVar.l;
                    jArr[i11] = jArr[i11] + ((uf.a) dVar.d.get(i12)).a[i11];
                }
            }
            dVar.m = new SegmentTree(dVar.l);
            return dVar;
        }
        if (i10 != 4) {
            return null;
        }
        uf.e eVar = new uf.e(jSONObject);
        if (z10) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j10 = 0;
            for (int i13 = 0; i13 < eVar.d.size(); i13++) {
                int length2 = eVar.a.length;
                for (int i14 = 0; i14 < length2; i14++) {
                    long j11 = ((uf.a) eVar.d.get(i13)).a[i14];
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
                    arrayList.add((uf.a) eVar.d.get(i15));
                }
            }
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj = arrayList.get(i16);
                i16++;
                eVar.d.remove((uf.a) obj);
            }
        }
        int length3 = ((uf.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i17 = 0; i17 < length3; i17++) {
            eVar.l[i17] = 0;
            for (int i18 = 0; i18 < size3; i18++) {
                long[] jArr3 = eVar.l;
                jArr3[i17] = jArr3[i17] + ((uf.a) eVar.d.get(i18)).a[i17];
            }
        }
        new SegmentTree(eVar.l);
        return eVar;
    }

    public static f91 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        f91 f91Var = new f91(str, i10);
        f91Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                uf.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                f91Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                f91Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.a) == null || jArr2.length < 2) {
                    f91Var.l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    f91Var.e = new uf.e(e02, j10);
                    f91Var.c = j10;
                    return f91Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            f91Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return f91Var;
    }

    public static void k0(f91 f91Var, ArrayList arrayList, org.telegram.ui.ActionBar.h6 h6Var) {
        uf.b bVar;
        if (f91Var == null || (bVar = f91Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            uf.a aVar = (uf.a) obj;
            int i11 = aVar.g;
            if (i11 >= 0) {
                if (!org.telegram.ui.ActionBar.g6.c1(i11)) {
                    org.telegram.ui.ActionBar.g6.u1(aVar.g, org.telegram.ui.ActionBar.g6.I == org.telegram.ui.ActionBar.g6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.g6.nl[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, aVar.g));
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof e91) {
            ((e91) view).d();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.x6) {
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false)), org.telegram.ui.ActionBar.g6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7), 0, 0);
            jqVar.w = true;
            view.setBackground(jqVar);
            return;
        }
        if (view instanceof vf.c) {
            ((vf.c) view).a();
        } else if (view instanceof n91) {
            int i10 = n91.d;
            ((n91) view).b();
        }
    }

    public final void c0() {
        int i10 = AndroidUtilities.navigationBarHeight;
        int i11 = AndroidUtilities.statusBarHeight;
        pg0 pg0Var = this.i0;
        if (pg0Var != null) {
            pg0Var.setTranslationY(-i10);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11;
        int dp = (this.c ? AndroidUtilities.dp(72.0f) : 0) + i10;
        u81 u81Var = this.O;
        if (u81Var != null) {
            u81Var.setPadding(0, currentActionBarHeight, 0, dp);
        }
        wb wbVar = this.f0;
        if (wbVar != null) {
            wbVar.B.setPadding(0, currentActionBarHeight, 0, dp);
        }
        de deVar = this.g0;
        if (deVar != null) {
            deVar.W0.setPadding(0, currentActionBarHeight, 0, dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        t91 t91Var = this;
        t91Var.W = new tf.f(null);
        MessagesController messagesController = MessagesController.getInstance(t91Var.currentAccount);
        long j10 = t91Var.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(t91Var.currentAccount).getChatFull(j10);
        boolean z10 = chatFull != null && chatFull.can_view_stats;
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z11 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(zg.b.b(context, t91Var.resourceProvider, zg.a.E, R.string.Statistics));
        }
        arrayList.add(zg.b.b(context, t91Var.resourceProvider, zg.a.J, R.string.Boosts));
        if (z11) {
            arrayList.add(zg.b.b(context, t91Var.resourceProvider, zg.a.K, R.string.Monetization));
        }
        t91Var.j0 = (zg.b[]) arrayList.toArray(new zg.b[0]);
        pg0 pg0Var = new pg0(context, t91Var.resourceProvider);
        t91Var.i0 = pg0Var;
        pg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i10 = 0;
        while (true) {
            zg.b[] bVarArr = t91Var.j0;
            if (i10 >= bVarArr.length) {
                break;
            }
            zg.b bVar = bVarArr[i10];
            bVar.setOnClickListener(new jh.y0(t91Var, i10, 24));
            t91Var.i0.addView(t91Var.j0[i10]);
            t91Var.i0.i(bVar, true, false);
            i10++;
        }
        t91Var.e0 = new nh.g1(t91Var, t91Var.getParentActivity(), 6);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            t91Var.f0 = new wb(t91Var, -j10, t91Var.getResourceProvider());
        }
        if (z11) {
            frameLayout = frameLayout2;
            de deVar = new de(t91Var.getParentActivity(), this, t91Var.currentAccount, -j10, getResourceProvider(), ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            t91Var = this;
            t91Var.g0 = deVar;
            deVar.setActionBar(t91Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z12 = z10;
        FrameLayout frameLayout3 = frameLayout;
        t91Var.e0.setAdapter(new t81(t91Var, z12, isBoostSupported, z11, frameLayout3));
        boolean z13 = t91Var.h0;
        boolean z14 = isBoostSupported && !z13;
        t91Var.c = z14;
        if (z14 && t91Var.Z) {
            t91Var.e0.setPosition(z12 ? 1 : 0);
        } else if (z14 && t91Var.a0) {
            t91Var.e0.setPosition((z12 ? 1 : 0) + ((z13 || !isBoostSupported) ? 0 : 1));
        }
        t91Var.m0(t91Var.e0.getCurrentPosition(), false);
        ih.j4 j4Var = new ih.j4(t91Var, t91Var.getParentActivity(), 9);
        t91Var.actionBar.setDrawBlurBackground(j4Var);
        j4Var.setBackgroundColor(t91Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        sg.i iVar = new sg.i(j4Var);
        lg.a aVar = t91Var.B0;
        aVar.d = iVar;
        aVar.e = j4Var;
        j4Var.addView(t91Var.e0, i7.f6.g());
        j4Var.addView(t91Var.actionBar);
        if (t91Var.c) {
            j4Var.addView(t91Var.i0, i7.f6.e(344, 72, 81));
            t91Var.setBulletinDelegate(new eg.x(14));
        }
        t91Var.fragmentView = j4Var;
        u81 u81Var = new u81(t91Var, context);
        t91Var.O = u81Var;
        u81Var.setSections(true);
        t91Var.O.setClipToPadding(false);
        u81 u81Var2 = t91Var.O;
        Objects.requireNonNull(u81Var2);
        t91Var.P = new lg.k(u81Var2, j4Var, new ms(u81Var2, 1));
        wb wbVar = t91Var.f0;
        if (wbVar != null) {
            org.telegram.ui.Components.jl0 jl0Var = wbVar.B;
            Objects.requireNonNull(jl0Var);
            wbVar.C = new lg.k(jl0Var, j4Var, new ms(jl0Var, 0));
            t91Var.f0.B.j(new s81(t91Var, 1));
        }
        de deVar2 = t91Var.g0;
        if (deVar2 != null) {
            org.telegram.ui.Components.u51 u51Var = deVar2.W0;
            Objects.requireNonNull(u51Var);
            deVar2.X0 = new lg.k(u51Var, j4Var, new t8(u51Var, 0));
            t91Var.g0.W0.j(new s81(t91Var, 2));
        }
        t91Var.C0 = new q81(t91Var, j4Var);
        t91Var.O.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        t91Var.X = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        t91Var.S = aj0Var;
        aj0Var.setAutoRepeat(true);
        t91Var.S.f(R.raw.statistic_preload, 120, 120, null);
        t91Var.S.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView.setTag(Integer.valueOf(i11));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView2.setTag(Integer.valueOf(i12));
        b.i(R.string.LoadingStatsDescription, textView2, 1);
        t91Var.X.addView(t91Var.S, i7.f6.t(120, 120, 1, 0, 0, 0, 20));
        t91Var.X.addView(textView, i7.f6.t(-2, -2, 1, 0, 0, 0, 10));
        t91Var.X.addView(textView2, i7.f6.q(-2, -2, 1));
        frameLayout3.addView(t91Var.X, i7.f6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (t91Var.T == null) {
            t91Var.T = new y81(t91Var);
        }
        t91Var.O.setAdapter(t91Var.T);
        f2.j0 j0Var = new f2.j0();
        t91Var.Q = j0Var;
        t91Var.O.setLayoutManager(j0Var);
        t91Var.U = new r81();
        t91Var.O.setItemAnimator(null);
        t91Var.O.j(new s81(t91Var, 0));
        t91Var.O.setOnItemClickListener(new d21(t91Var, 5));
        t91Var.O.setOnItemLongClickListener(new zk0(t91Var, 18));
        frameLayout3.addView(t91Var.O);
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(context, null, false, null);
        t91Var.N = xnVar;
        xnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        t91Var.N.getAvatarImageView().setScaleX(0.9f);
        t91Var.N.getAvatarImageView().setScaleY(0.9f);
        t91Var.N.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        t91Var.actionBar.addView(t91Var.N, 0, i7.f6.d(-2, -1.0f, 51, !t91Var.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = t91Var.getMessagesController().getChat(Long.valueOf(j10));
        t91Var.N.setChatAvatar(chat2);
        t91Var.N.setTitle(chat2 == null ? "" : chat2.title);
        org.telegram.ui.Components.xn xnVar2 = t91Var.N;
        if (xnVar2.getSubtitleTextView() != null) {
            xnVar2.getSubtitleTextView().setVisibility(8);
        }
        th.y(false, t91Var.actionBar);
        t91Var.actionBar.setActionBarMenuOnItemClick(new al0(t91Var, 18));
        t91Var.N.i(org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        t91Var.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i11, false), false);
        t91Var.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i11, false), true);
        t91Var.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z8, false), false);
        t91Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        boolean z15 = t91Var.t0;
        w5 w5Var = t91Var.x0;
        if (z15) {
            t91Var.X.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(w5Var, 500L);
            t91Var.X.setVisibility(0);
            t91Var.O.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            t91Var.X.setVisibility(8);
            t91Var.O.setVisibility(0);
        }
        ng.d c3 = aVar.c(t91Var.i0, pg.a.f(t91Var.resourceProvider), false);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(7.666f));
        t91Var.i0.setBackground(c3);
        t91Var.c0();
        t91Var.u0 = new g91(t91Var.T, t91Var.Q);
        return t91Var.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((lh.k6) objArr[0]) == this.v0) {
                j0();
                o0();
                if (this.T != null) {
                    this.O.setItemAnimator(null);
                    this.u0.f();
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
            org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack) : null;
            if (o2Var instanceof ko) {
                ((ActionBarLayout) getParentLayout()).a0(o2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.o2 o2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (o2Var2 instanceof ProfileActivity) {
                    eg.s.f(o2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.o2) j7.l1.j(3, fragmentStack2) : null;
            if (o2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).a0(o2Var2, false);
            }
            finishFragment();
            if (o2Var3 instanceof tn) {
                eg.s.f(o2Var3, chat, true);
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
                arrayList = this.n0;
                if (i13 >= size) {
                    break;
                }
                MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                int i14 = this.l0.get(messageObject.getId(), -1);
                if (i14 >= 0 && ((q91) arrayList.get(i14)).b() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList3.add((q91) arrayList.get(i14));
                    } else {
                        ((q91) arrayList.get(i14)).b = messageObject;
                    }
                }
                i13++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.o0;
            arrayList4.clear();
            int size2 = arrayList.size();
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                q91 q91Var = (q91) arrayList.get(i12);
                if (q91Var.b == null) {
                    this.k0 = q91Var.b();
                    break;
                } else {
                    arrayList4.add(q91Var);
                    i12++;
                }
            }
            if (arrayList4.size() < 20) {
                h0();
            }
            o0();
            if (this.T != null) {
                this.O.setItemAnimator(null);
                this.u0.f();
            }
        }
    }

    public final void g0(f91[] f91VarArr) {
        y81 y81Var = this.T;
        if (y81Var != null) {
            y81Var.E();
            this.O.setItemAnimator(null);
            this.T.l();
        }
        this.t0 = false;
        LinearLayout linearLayout = this.X;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.x0);
        this.X.animate().alpha(0.0f).setDuration(230L).setListener(new e50(this, 29));
        this.O.setVisibility(0);
        this.O.setAlpha(0.0f);
        this.O.animate().alpha(1.0f).setDuration(230L).start();
        for (f91 f91Var : f91VarArr) {
            if (f91Var != null && f91Var.d == null && f91Var.f != null) {
                f91Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new org.telegram.ui.Components.g51(1, this, f91Var));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        rx0 rx0Var = new rx0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.y7.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.y7.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.y7.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.y7.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.y7.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{vf.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.x6));
        int i13 = org.telegram.ui.ActionBar.g6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, i13));
        org.telegram.ui.Components.xn xnVar = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.i6(xnVar != null ? xnVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Oi));
        org.telegram.ui.Components.xn xnVar2 = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.i6(xnVar2 != null ? xnVar2.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.Y) {
            int i14 = 0;
            while (i14 < 6) {
                k0(i14 == 0 ? this.d : i14 == 1 ? this.D : i14 == 2 ? this.E : i14 == 3 ? this.F : i14 == 4 ? this.G : this.H, arrayList, rx0Var);
                i14++;
            }
        } else {
            int i15 = 0;
            while (i15 < 12) {
                k0(i15 == 0 ? this.d : i15 == 1 ? this.h : i15 == 2 ? this.n : i15 == 3 ? this.r : i15 == 4 ? this.s : i15 == 5 ? this.v : i15 == 6 ? this.x : i15 == 7 ? this.e : i15 == 8 ? this.w : i15 == 9 ? this.y : i15 == 10 ? this.A : this.B, arrayList, rx0Var);
                i15++;
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.n0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.l0.get(this.k0); i11 < size; i11++) {
            if (((q91) arrayList.get(i11)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((q91) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.b);
        this.s0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new p81(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
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
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new p81(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        nh.g1 g1Var = this.e0;
        if (g1Var == null || (g1Var.b == 0 && g1Var.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0() {
        ArrayList arrayList = this.q0;
        arrayList.clear();
        ArrayList arrayList2 = this.p0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            q91 q91Var = (q91) obj;
            MessageObject f9 = this.v0.f(q91Var.b());
            if (f9 != null) {
                q91Var.b = f9;
                arrayList.add(q91Var);
            }
        }
        this.m0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            zg.b[] bVarArr = this.j0;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].e(i11 == i10, z10);
            i11++;
        }
    }

    public final void n0(float f9, boolean z10) {
        for (int i10 = 0; i10 < this.j0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f9));
            zg.b bVar = this.j0[i10];
            bVar.F = max;
            bVar.E = z10;
            bVar.invalidate();
        }
        this.i0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.r0;
        arrayList.clear();
        arrayList.addAll(this.o0);
        arrayList.addAll(this.q0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.ui.Components.z0(1))));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        lh.s6 storiesController = getMessagesController().getStoriesController();
        long j10 = this.b;
        lh.k6 A = storiesController.A(-j10, 2, -1, true);
        this.v0 = A;
        if (A != null) {
            this.w0 = A.o();
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
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.d0;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
            c2VarArr[0] = null;
        }
        lh.k6 k6Var = this.v0;
        if (k6Var != null) {
            k6Var.z(this.w0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
