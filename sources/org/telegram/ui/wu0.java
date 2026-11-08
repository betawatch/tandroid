package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class wu0 implements org.telegram.ui.Components.dj0 {
    public int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ProfileActivity c;

    public wu0(ProfileActivity profileActivity, Context context) {
        this.c = profileActivity;
        this.b = context;
    }

    public static void a(wu0 wu0Var, Context context, int i7) {
        int i10;
        int i11;
        Long l10;
        Long l11;
        int i12;
        long j3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = org.telegram.messenger.qs.s1;
        int i19 = 0;
        if (i7 == 0) {
            wu0Var.c.getUserConfig().U = true;
            wu0Var.c.getUserConfig().v(false);
            ProfileActivity profileActivity = wu0Var.c;
            RectF rectF = ProfileActivity.S6;
            profileActivity.getContactsController().l();
            return;
        }
        if (i7 == 1) {
            ProfileActivity profileActivity2 = wu0Var.c;
            RectF rectF2 = ProfileActivity.S6;
            profileActivity2.getContactsController().A(0L, false);
            return;
        }
        if (i7 == 2) {
            ProfileActivity profileActivity3 = wu0Var.c;
            RectF rectF3 = ProfileActivity.S6;
            profileActivity3.getContactsController().K();
            return;
        }
        int i20 = 3;
        if (i7 == 3) {
            wu0Var.c.getMessagesController().A0();
            return;
        }
        if (i7 == 4) {
            org.telegram.messenger.r2.a = !org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.a).commit();
            ProfileActivity profileActivity4 = wu0Var.c;
            RectF rectF4 = ProfileActivity.S6;
            profileActivity4.J5();
            wu0Var.c.d.f();
            if (org.telegram.messenger.r2.a) {
                jg.g.u(org.telegram.messenger.t0.s, new StringBuilder("app start time = "));
                try {
                    org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            return;
        }
        if (i7 == 5) {
            org.telegram.messenger.iz.y0 = !org.telegram.messenger.iz.y0;
            SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
            edit.putBoolean("inappCamera", org.telegram.messenger.iz.y0);
            edit.apply();
            return;
        }
        int i21 = 11;
        if (i7 == 6) {
            org.telegram.messenger.yr messagesStorage = wu0Var.c.getMessagesStorage();
            messagesStorage.a.c(new org.telegram.messenger.rq(messagesStorage, i21));
            org.telegram.messenger.iz.D(false);
            org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.qp.e1().edit().remove("archivehint").remove("proximityhint"), "archivehint_l", "searchpostsnew", "speedhint", "gifhint"), "reminderhint", "soundHint", "themehint", "bganimationhint"), "filterhint", "n_0", "storyprvhint", "storyhint"), "storyhint2", "storydualhint", "storysvddualhint", "stories_camera"), "dualcam", "dualmatrix", "dual_available", "archivehint"), "askNotificationsAfter", "askNotificationsDuration", "viewoncehint", "voicepausehint"), "taptostorysoundhint", "nothanos", "voiceoncehint", "savedhint"), "savedsearchhint", "savedsearchtaghint", "newppsms", "monetizationadshint"), "seekSpeedHintShowed", "unsupport_video/av01", "statusgiftpage", "multistorieshint").remove("trimvoicehint").remove("taptostoryhighlighthint").apply();
            c8.ga.a();
            i13 = ((org.telegram.ui.ActionBar.f2) wu0Var.c).currentAccount;
            org.telegram.messenger.qp.s1(i13).f7.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            org.telegram.messenger.iz.J = 0;
            org.telegram.messenger.iz.O = 0;
            org.telegram.messenger.iz.R = false;
            org.telegram.messenger.iz.P = false;
            org.telegram.messenger.iz.Q = false;
            org.telegram.messenger.iz.c1 = 3;
            org.telegram.messenger.iz.d1 = 3;
            org.telegram.messenger.iz.e1 = 3;
            org.telegram.messenger.iz.v1 = 3;
            org.telegram.messenger.iz.e0 = 2;
            org.telegram.messenger.iz.T(2);
            org.telegram.messenger.iz.H(false);
            org.telegram.messenger.iz.G(false);
            org.telegram.messenger.iz.C(false);
            i14 = ((org.telegram.ui.ActionBar.f2) wu0Var.c).currentAccount;
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i14);
            f10.c = 0L;
            f10.d = 0L;
            f10.h().edit().clear().apply();
            wu0Var.c.getNotificationCenter().k(i18, new Object[0]);
            qy0.b0();
            i15 = ((org.telegram.ui.ActionBar.f2) wu0Var.c).currentAccount;
            sg.l0.e(i15).a();
            SharedPreferences sharedPreferences = wu0Var.c.getMessagesController().e7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            org.telegram.messenger.k5.d(edit2, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : sharedPreferences.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    edit2.remove(str);
                }
            }
            edit2.apply();
            i16 = ((org.telegram.ui.ActionBar.f2) wu0Var.c).currentAccount;
            SharedPreferences.Editor edit3 = org.telegram.messenger.qp.s1(i16).d7.edit();
            i17 = ((org.telegram.ui.ActionBar.f2) wu0Var.c).currentAccount;
            for (String str2 : org.telegram.messenger.qp.s1(i17).d7.getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    edit3.remove(str2);
                }
            }
            edit3.apply();
            return;
        }
        if (i7 == 7) {
            org.telegram.ui.Components.voip.y1.i(wu0Var.c.getParentActivity());
            return;
        }
        if (i7 == 8) {
            org.telegram.messenger.iz.z0 = !org.telegram.messenger.iz.z0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.qp.e1().edit();
            edit4.putBoolean("roundCamera16to9", org.telegram.messenger.iz.z0);
            edit4.apply();
            return;
        }
        if (i7 == 9) {
            ((LaunchActivity) wu0Var.c.getParentActivity()).z(true);
            return;
        }
        if (i7 == 10) {
            org.telegram.messenger.yr messagesStorage2 = wu0Var.c.getMessagesStorage();
            messagesStorage2.a.c(new org.telegram.messenger.tp(messagesStorage2, -1, i20));
            return;
        }
        if (i7 == 11) {
            org.telegram.messenger.iz.V = !org.telegram.messenger.iz.V;
            SharedPreferences.Editor edit5 = org.telegram.messenger.qp.e1().edit();
            edit5.putBoolean("disableVoiceAudioEffects", org.telegram.messenger.iz.V);
            edit5.apply();
            return;
        }
        if (i7 == 12) {
            org.telegram.messenger.iz.j1 = null;
            org.telegram.messenger.iz.y();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.Q4, new Object[0]);
            return;
        }
        if (i7 == 13) {
            Set set = wu0Var.c.getMessagesController().S3;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            wu0Var.c.getNotificationCenter().k(i18, new Object[0]);
            return;
        }
        try {
            if (i7 == 14) {
                org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(org.telegram.messenger.t0.b);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i7 == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i7 == 16) {
                org.telegram.messenger.iz.K();
                Toast.makeText(wu0Var.c.getParentActivity(), org.telegram.messenger.id.M0(org.telegram.messenger.iz.J0 ? 2131751619 : 2131751620, null), 0).show();
                return;
            }
            if (i7 == 17) {
                org.telegram.messenger.iz.W = !org.telegram.messenger.iz.W;
                SharedPreferences.Editor edit6 = org.telegram.messenger.qp.e1().edit();
                edit6.putBoolean("forceDisableTabletMode", org.telegram.messenger.iz.W);
                edit6.apply();
                Activity W = org.telegram.messenger.g0.W(context);
                Intent launchIntentForPackage = W.getPackageManager().getLaunchIntentForPackage(W.getPackageName());
                W.finishAffinity();
                W.startActivity(launchIntentForPackage);
                System.exit(0);
                return;
            }
            if (i7 == 18) {
                c8.nb.a((LaunchActivity) wu0Var.c.getParentActivity(), !org.telegram.messenger.iz.x1, true);
                return;
            }
            if (i7 == 19) {
                wu0Var.c.getMessagesController().R2(true);
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                wu0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new uu0(wu0Var, i19));
                return;
            }
            if (i7 != 20) {
                if (i7 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wu0Var.c.getParentActivity(), wu0Var.c.z0);
                    alertDialog$Builder.a.R = "Force performance class";
                    int o4 = org.telegram.messenger.iz.o();
                    int v = org.telegram.messenger.iz.v();
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.g0.X2((o4 == 2 ? "**HIGH**" : "HIGH").concat(v == 2 ? " (measured)" : "")), org.telegram.messenger.g0.X2((o4 == 1 ? "**AVERAGE**" : "AVERAGE").concat(v == 1 ? " (measured)" : "")), org.telegram.messenger.g0.X2((o4 == 0 ? "**LOW**" : "LOW").concat(v == 0 ? " (measured)" : ""))}, new ot(v, 1));
                    jg.g.w("Cancel", 2131752589, alertDialog$Builder, null);
                    return;
                }
                if (i7 == 22) {
                    org.telegram.messenger.iz.N();
                    return;
                }
                if (i7 == 23) {
                    boolean q10 = fi.b1.q(wu0Var.c.getParentActivity());
                    org.telegram.messenger.qp.e1().edit().putBoolean("dual_available", !q10).apply();
                    Toast.makeText(wu0Var.c.getParentActivity(), org.telegram.messenger.id.M0(!q10 ? 2131751634 : 2131751636, null), 0).show();
                    return;
                }
                if (i7 == 24) {
                    org.telegram.messenger.iz.O();
                    for (int i22 = 0; i22 < wu0Var.c.getParentLayout().getFragmentStack().size(); i22++) {
                        ((org.telegram.ui.ActionBar.f2) wu0Var.c.getParentLayout().getFragmentStack().get(i22)).clearSheets();
                    }
                    return;
                }
                if (i7 == 25) {
                    org.telegram.messenger.iz.M();
                    return;
                }
                if (i7 == 26) {
                    org.telegram.messenger.iz.L();
                    return;
                }
                if (i7 == 27) {
                    wu0Var.c.getMediaDataController().E0(false, true, null);
                    return;
                }
                if (i7 == 28) {
                    i11 = ((org.telegram.ui.ActionBar.f2) wu0Var.c).currentAccount;
                    org.telegram.messenger.iz.Q(i11);
                    return;
                }
                if (i7 == 29) {
                    hi.p.b();
                    hi.r0.c();
                    hi.g0.a();
                    hi.o4.c();
                    return;
                }
                if (i7 == 30) {
                    org.telegram.messenger.v0.a();
                    return;
                }
                if (i7 == 31) {
                    org.telegram.messenger.iz.R();
                    return;
                }
                if (i7 == 32) {
                    org.telegram.messenger.iz.J();
                    return;
                }
                if (i7 == 33) {
                    org.telegram.messenger.iz.R0 = !org.telegram.messenger.iz.R0;
                    SharedPreferences.Editor edit7 = org.telegram.messenger.qp.e1().edit();
                    edit7.putBoolean("debugVideoQualities", org.telegram.messenger.iz.R0);
                    edit7.apply();
                    return;
                }
                if (i7 == 34) {
                    org.telegram.messenger.iz.V0 = !org.telegram.messenger.iz.V0;
                    org.telegram.messenger.g0.a = null;
                    SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
                    edit8.putBoolean("useSystemBoldFont", org.telegram.messenger.iz.V0);
                    edit8.apply();
                    return;
                }
                if (i7 == 35) {
                    i10 = ((org.telegram.ui.ActionBar.f2) wu0Var.c).currentAccount;
                    org.telegram.messenger.qp.s1(i10).R2(true);
                    return;
                }
                if (i7 == 36) {
                    org.telegram.messenger.iz.n = !org.telegram.messenger.iz.n;
                    SharedPreferences.Editor edit9 = org.telegram.messenger.qp.e1().edit();
                    edit9.putBoolean("forceForumTabs", org.telegram.messenger.iz.n);
                    edit9.apply();
                    return;
                }
                if (i7 == 37) {
                    org.telegram.messenger.a8.j();
                    org.telegram.messenger.a8.c(true);
                    return;
                } else {
                    if (i7 == 38) {
                        org.telegram.messenger.iz.o = !org.telegram.messenger.iz.o;
                        SharedPreferences.Editor edit10 = org.telegram.messenger.qp.e1().edit();
                        edit10.putBoolean("fastWallpaperDisabled", org.telegram.messenger.iz.o);
                        edit10.apply();
                        return;
                    }
                    return;
                }
            }
            int i23 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) org.telegram.messenger.t0.b.getSystemService("activity")).getMemoryClass();
            StringBuilder sb2 = new StringBuilder();
            int i24 = 0;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            while (i24 < i23) {
                Long i110 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i24 + "/cpufreq/cpuinfo_min_freq");
                Long i111 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i24 + "/cpufreq/cpuinfo_cur_freq");
                Long i112 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i24 + "/cpufreq/cpuinfo_max_freq");
                Long i113 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i24 + "/cpu_capacity");
                sb2.append("#");
                sb2.append(i24);
                sb2.append(" ");
                if (i110 != null) {
                    sb2.append("min=");
                    long longValue = i110.longValue();
                    i12 = i24;
                    sb2.append(longValue / 1000);
                    sb2.append(" ");
                    j11++;
                    j10 = (i110.longValue() / 1000) + j10;
                } else {
                    i12 = i24;
                }
                if (i111 != null) {
                    sb2.append("cur=");
                    j3 = j10;
                    sb2.append(i111.longValue() / 1000);
                    sb2.append(" ");
                    j12 += i111.longValue() / 1000;
                    j13++;
                } else {
                    j3 = j10;
                }
                if (i112 != null) {
                    sb2.append("max=");
                    sb2.append(i112.longValue() / 1000);
                    sb2.append(" ");
                    j14 = (i112.longValue() / 1000) + j14;
                    j15++;
                }
                if (i113 != null) {
                    sb2.append("cpc=");
                    sb2.append(i113);
                    sb2.append(" ");
                    j16 = i113.longValue() + j16;
                    j17++;
                }
                sb2.append("\n");
                i24 = i12 + 1;
                j10 = j3;
            }
            long j18 = j10;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Build.MANUFACTURER);
            sb3.append(", ");
            sb3.append(Build.MODEL);
            sb3.append(" (");
            sb3.append(Build.PRODUCT);
            sb3.append(", ");
            sb3.append(Build.DEVICE);
            sb3.append(")  (android ");
            int i25 = Build.VERSION.SDK_INT;
            sb3.append(i25);
            sb3.append(")\n");
            if (i25 >= 31) {
                sb3.append("SoC: ");
                sb3.append(Build.SOC_MANUFACTURER);
                sb3.append(", ");
                sb3.append(Build.SOC_MODEL);
                sb3.append("\n");
            }
            String j19 = org.telegram.messenger.g0.j1("/sys/kernel/gpu/gpu_model");
            if (j19 != null) {
                sb3.append("GPU: ");
                sb3.append(j19);
                Long i114 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_min_clock");
                Long i115 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_mm_min_clock");
                Long i116 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_max_clock");
                if (i114 != null) {
                    sb3.append(", min=");
                    long longValue2 = i114.longValue();
                    l10 = i115;
                    l11 = i116;
                    sb3.append(longValue2 / 1000);
                } else {
                    l10 = i115;
                    l11 = i116;
                }
                if (l10 != null) {
                    sb3.append(", mmin=");
                    sb3.append(l10.longValue() / 1000);
                }
                if (l11 != null) {
                    sb3.append(", max=");
                    sb3.append(l11.longValue() / 1000);
                }
                sb3.append("\n");
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) org.telegram.messenger.t0.b.getSystemService("activity")).getDeviceConfigurationInfo();
            sb3.append("GLES Version: ");
            sb3.append(deviceConfigurationInfo.getGlEsVersion());
            sb3.append("\nMemory: class=");
            sb3.append(org.telegram.messenger.g0.i0(memoryClass * 1048576, false, false));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) org.telegram.messenger.t0.b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb3.append(", total=");
            sb3.append(org.telegram.messenger.g0.i0(memoryInfo.totalMem, false, false));
            sb3.append(", avail=");
            sb3.append(org.telegram.messenger.g0.i0(memoryInfo.availMem, false, false));
            sb3.append(", low?=");
            sb3.append(memoryInfo.lowMemory);
            sb3.append(" (threshold=");
            sb3.append(org.telegram.messenger.g0.i0(memoryInfo.threshold, false, false));
            sb3.append(")\nCurrent class: ");
            sb3.append(org.telegram.messenger.iz.x(org.telegram.messenger.iz.o()));
            sb3.append(", measured: ");
            sb3.append(org.telegram.messenger.iz.x(org.telegram.messenger.iz.v()));
            if (i25 >= 31) {
                sb3.append(", suggest=");
                sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb3.append("\n");
            sb3.append(i23);
            sb3.append(" CPUs");
            if (j11 > 0) {
                sb3.append(", avgMinFreq=");
                sb3.append(j18 / j11);
            }
            if (j13 > 0) {
                sb3.append(", avgCurFreq=");
                sb3.append(j12 / j13);
            }
            if (j15 > 0) {
                sb3.append(", avgMaxFreq=");
                sb3.append(j14 / j15);
            }
            if (j17 > 0) {
                sb3.append(", avgCapacity=");
                sb3.append(j16 / j17);
            }
            sb3.append("\n");
            sb3.append((CharSequence) sb2);
            ProfileActivity.a1(wu0Var.c, "video/avc", sb3);
            ProfileActivity.a1(wu0Var.c, "video/hevc", sb3);
            ProfileActivity.a1(wu0Var.c, "video/x-vnd.on2.vp8", sb3);
            ProfileActivity.a1(wu0Var.c, "video/x-vnd.on2.vp9", sb3);
            wu0Var.c.showDialog(new vu0(wu0Var, wu0Var.c.getParentActivity(), sb3.toString()));
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public final boolean c(int i7, View view) {
        String str;
        int i10;
        int i11;
        char c10;
        String str2;
        ProfileActivity profileActivity = this.c;
        ArrayList arrayList = profileActivity.Q4;
        if (i7 != profileActivity.y3) {
            if (i7 >= profileActivity.t4 && i7 < profileActivity.u4) {
                return profileActivity.h(!profileActivity.B2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) profileActivity.B2.get(i7 - profileActivity.t4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i7 - profileActivity.t4), true, false, view);
            }
            if (i7 != profileActivity.T2) {
                if (i7 == profileActivity.G3) {
                    profileActivity.Y3(i7, view);
                    return true;
                }
                if (profileActivity.Z3(i7, view)) {
                    return true;
                }
                return profileActivity.Q4(view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f), i7, view);
            }
            if (profileActivity.Z3(i7, view)) {
                return true;
            }
            TLRPC.UserFull userFull = profileActivity.u2;
            if (userFull == null) {
                return false;
            }
            try {
                org.telegram.messenger.g0.g(UserInfoActivity.e0(userFull.birthday));
                org.telegram.ui.Components.hc.a0(profileActivity).i(org.telegram.messenger.id.M0(2131753716, null)).j();
                return true;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return true;
            }
        }
        int i12 = this.a + 1;
        this.a = i12;
        if (i12 < 2) {
            boolean z9 = org.telegram.messenger.r2.a;
            try {
                Toast.makeText(profileActivity.getParentActivity(), org.telegram.messenger.id.M0(2131751626, "DebugMenuLongPress"), 0).show();
                return true;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
        String M0 = org.telegram.messenger.id.M0(2131751647, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        String M02 = org.telegram.messenger.id.M0(2131751630, null);
        String M03 = org.telegram.messenger.id.M0(2131751624, null);
        String M04 = org.telegram.messenger.id.M0(2131751623, null);
        String M05 = org.telegram.messenger.id.M0(2131751622, null);
        boolean z10 = org.telegram.messenger.r2.a;
        if (org.telegram.messenger.iz.y0) {
            str = "DebugMenuDisableCamera";
            i10 = 2131751641;
        } else {
            str = "DebugMenuEnableCamera";
            i10 = 2131751633;
        }
        String M06 = org.telegram.messenger.id.M0(i10, str);
        String M07 = org.telegram.messenger.id.M0(2131751644, "DebugMenuClearMediaCache");
        String M08 = org.telegram.messenger.id.M0(2131751646, null);
        org.telegram.messenger.t0.u();
        org.telegram.messenger.t0.n();
        String M09 = org.telegram.messenger.id.M0(2131751645, "DebugMenuCheckAppUpdate");
        String M010 = org.telegram.messenger.id.M0(2131751625, "DebugMenuReadAllDialogs");
        String M011 = org.telegram.messenger.id.M0(2131751642, null);
        String M012 = org.telegram.messenger.id.M0(org.telegram.messenger.iz.J0 ? 2131751639 : 2131751631, null);
        org.telegram.messenger.g0.R1();
        String N0 = org.telegram.messenger.id.N0(fi.b1.q(profileActivity.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        String str3 = org.telegram.messenger.iz.b0 ? "back to TextureView in stories" : "use SurfaceView in stories";
        String str4 = !org.telegram.messenger.iz.d0 ? "Enable Invoice Payment" : "Disable Invoice Payment";
        i11 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
        String str5 = !org.telegram.messenger.iz.s(i11) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str6 = (!org.telegram.messenger.iz.e() || Build.VERSION.SDK_INT < 31) ? null : org.telegram.messenger.iz.a0 ? "back to cpu blur" : "use new gpu blur";
        String str7 = org.telegram.messenger.iz.v0 ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
        String str8 = org.telegram.messenger.iz.R0 ? "Disable video qualities debug" : "Enable video qualities debug";
        String str9 = str6;
        if (Build.VERSION.SDK_INT >= 28) {
            c10 = 28;
            str2 = org.telegram.messenger.id.M0(org.telegram.messenger.iz.V0 ? 2131751638 : 2131751621, null);
        } else {
            c10 = 28;
            str2 = null;
        }
        String str10 = !org.telegram.messenger.iz.n ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
        CharSequence[] charSequenceArr = new CharSequence[39];
        charSequenceArr[0] = M02;
        charSequenceArr[1] = M03;
        charSequenceArr[2] = M04;
        charSequenceArr[3] = M05;
        charSequenceArr[4] = null;
        charSequenceArr[5] = M06;
        charSequenceArr[6] = M07;
        charSequenceArr[7] = M08;
        charSequenceArr[8] = null;
        charSequenceArr[9] = M09;
        charSequenceArr[10] = M010;
        charSequenceArr[11] = null;
        charSequenceArr[12] = null;
        charSequenceArr[13] = null;
        charSequenceArr[14] = null;
        charSequenceArr[15] = M011;
        charSequenceArr[16] = M012;
        charSequenceArr[17] = null;
        charSequenceArr[18] = null;
        charSequenceArr[19] = null;
        charSequenceArr[20] = null;
        charSequenceArr[21] = null;
        charSequenceArr[22] = null;
        charSequenceArr[23] = N0;
        charSequenceArr[24] = str3;
        charSequenceArr[25] = null;
        charSequenceArr[26] = str4;
        charSequenceArr[27] = null;
        charSequenceArr[c10] = str5;
        charSequenceArr[29] = "Clear Mini Apps Permissions and Files";
        charSequenceArr[30] = null;
        charSequenceArr[31] = str9;
        charSequenceArr[32] = str7;
        charSequenceArr[33] = str8;
        charSequenceArr[34] = str2;
        charSequenceArr[35] = "Reload app config";
        charSequenceArr[36] = str10;
        charSequenceArr[37] = "Make Memory Dump";
        charSequenceArr[38] = null;
        alertDialog$Builder.f(charSequenceArr, new og.j(10, this, this.b));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
        profileActivity.showDialog(u1Var);
        return true;
    }
}
