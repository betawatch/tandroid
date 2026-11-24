// default package

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
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tm8 implements e39 {
    public int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ProfileActivity c;

    public tm8(ProfileActivity profileActivity, Context context) {
        this.c = profileActivity;
        this.b = context;
    }

    public final void a(Context context, int i) {
        int i2;
        long j;
        int i3;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = kk7.r1;
        byte b = 0;
        if (i == 0) {
            this.c.getUserConfig().V = true;
            this.c.getUserConfig().u(false);
            ProfileActivity profileActivity = this.c;
            RectF rectF = ProfileActivity.Z6;
            profileActivity.getContactsController().l();
            return;
        }
        long j3 = 0;
        if (i == 1) {
            ProfileActivity profileActivity2 = this.c;
            RectF rectF2 = ProfileActivity.Z6;
            profileActivity2.getContactsController().A(0L, false);
            return;
        }
        byte b2 = 2;
        if (i == 2) {
            ProfileActivity profileActivity3 = this.c;
            RectF rectF3 = ProfileActivity.Z6;
            profileActivity3.getContactsController().K();
            return;
        }
        if (i == 3) {
            this.c.getMessagesController().y0();
            return;
        }
        if (i == 4) {
            w01.a = !w01.a;
            a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", w01.a).commit();
            ProfileActivity profileActivity4 = this.c;
            RectF rectF4 = ProfileActivity.Z6;
            profileActivity4.e4();
            this.c.d.f();
            if (w01.a) {
                ug8.q(a.s, new StringBuilder("app start time = "));
                try {
                    fa4.b("buildVersion = " + a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
            return;
        }
        if (i == 5) {
            gba.v0 = !gba.v0;
            SharedPreferences.Editor edit = na7.c1().edit();
            edit.putBoolean("inappCamera", gba.v0);
            edit.apply();
            return;
        }
        byte b3 = 11;
        if (i == 6) {
            ad7 messagesStorage = this.c.getMessagesStorage();
            messagesStorage.a.c(new vb7(messagesStorage, b3));
            gba.C(false);
            ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(na7.c1().edit().remove("archivehint").remove("proximityhint"), "archivehint_l", "searchpostsnew", "speedhint", "gifhint"), "reminderhint", "soundHint", "themehint", "bganimationhint"), "filterhint", "n_0", "storyprvhint", "storyhint"), "storyhint2", "storydualhint", "storysvddualhint", "stories_camera"), "dualcam", "dualmatrix", "dual_available", "archivehint"), "askNotificationsAfter", "askNotificationsDuration", "viewoncehint", "voicepausehint"), "taptostorysoundhint", "nothanos", "voiceoncehint", "savedhint"), "savedsearchhint", "savedsearchtaghint", "newppsms", "monetizationadshint"), "seekSpeedHintShowed", "unsupport_video/av01", "statusgiftpage", "multistorieshint").remove("trimvoicehint").remove("taptostoryhighlighthint").apply();
            qje.a();
            i4 = ((d) this.c).currentAccount;
            na7.q1(i4).Y3.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            gba.I = 0;
            gba.N = 0;
            gba.Q = false;
            gba.O = false;
            gba.P = false;
            gba.Y0 = 3;
            gba.Z0 = 3;
            gba.a1 = 3;
            gba.r1 = 3;
            gba.b0 = 2;
            gba.Q(2);
            gba.G(false);
            gba.F(false);
            gba.B(false);
            i5 = ((d) this.c).currentAccount;
            je2 e2 = je2.e(i5);
            e2.c = 0L;
            e2.d = 0L;
            e2.f().edit().clear().apply();
            this.c.getNotificationCenter().k(i9, new Object[0]);
            qa9.Z();
            i6 = ((d) this.c).currentAccount;
            k38.e(i6).a();
            SharedPreferences sharedPreferences = this.c.getMessagesController().X3;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            ls6.i(edit2, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : sharedPreferences.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    edit2.remove(str);
                }
            }
            edit2.apply();
            i7 = ((d) this.c).currentAccount;
            SharedPreferences.Editor edit3 = na7.q1(i7).W3.edit();
            i8 = ((d) this.c).currentAccount;
            for (String str2 : na7.q1(i8).W3.getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    edit3.remove(str2);
                }
            }
            edit3.apply();
            return;
        }
        if (i == 7) {
            rgc.i(this.c.getParentActivity());
            return;
        }
        if (i == 9) {
            ((LaunchActivity) this.c.getParentActivity()).A(true);
            return;
        }
        if (i == 10) {
            ad7 messagesStorage2 = this.c.getMessagesStorage();
            messagesStorage2.a.c(new wa7(messagesStorage2, -1, b2));
            return;
        }
        if (i == 11) {
            gba.U = !gba.U;
            SharedPreferences.Editor edit4 = na7.c1().edit();
            edit4.putBoolean("disableVoiceAudioEffects", gba.U);
            edit4.apply();
            return;
        }
        if (i == 12) {
            gba.f1 = null;
            gba.x();
            kk7.e().k(kk7.S4, new Object[0]);
            return;
        }
        if (i == 13) {
            Set set = this.c.getMessagesController().u3;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            this.c.getNotificationCenter().k(i9, new Object[0]);
            return;
        }
        try {
            if (i == 14) {
                a.b.deleteDatabase("webview.db");
                a.b.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(a.b);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i == 16) {
                gba.J();
                Toast.makeText(this.c.getParentActivity(), k96.M0(gba.F0 ? 2131751606 : 2131751607, null), 0).show();
                return;
            }
            if (i == 17) {
                gba.V = !gba.V;
                SharedPreferences.Editor edit5 = na7.c1().edit();
                edit5.putBoolean("forceDisableTabletMode", gba.V);
                edit5.apply();
                Activity W = gl.W(context);
                Intent launchIntentForPackage = W.getPackageManager().getLaunchIntentForPackage(W.getPackageName());
                W.finishAffinity();
                W.startActivity(launchIntentForPackage);
                System.exit(0);
                return;
            }
            if (i == 18) {
                uge.a((LaunchActivity) this.c.getParentActivity(), !gba.t1, true);
                return;
            }
            if (i == 19) {
                this.c.getMessagesController().U2(true);
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                this.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new rm8(this, b));
                return;
            }
            if (i != 20) {
                if (i == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.c.A0, this.c.getParentActivity());
                    alertDialog$Builder.a.S = "Force performance class";
                    int o = gba.o();
                    int u = gba.u();
                    alertDialog$Builder.e(new CharSequence[]{gl.S2((o == 2 ? "**HIGH**" : "HIGH").concat(u == 2 ? " (measured)" : "")), gl.S2((o == 1 ? "**AVERAGE**" : "AVERAGE").concat(u == 1 ? " (measured)" : "")), gl.S2((o == 0 ? "**LOW**" : "LOW").concat(u == 0 ? " (measured)" : ""))}, new p83(u, (byte) 1));
                    ug8.y("Cancel", 2131752577, alertDialog$Builder, null);
                    return;
                }
                if (i == 23) {
                    boolean o2 = ir3.o(this.c.getParentActivity());
                    na7.c1().edit().putBoolean("dual_available", !o2).apply();
                    Toast.makeText(this.c.getParentActivity(), k96.M0(!o2 ? 2131751621 : 2131751623, null), 0).show();
                    return;
                }
                if (i == 24) {
                    gba.M();
                    for (int i10 = 0; i10 < this.c.getParentLayout().getFragmentStack().size(); i10++) {
                        ((d) this.c.getParentLayout().getFragmentStack().get(i10)).clearSheets();
                    }
                    return;
                }
                if (i == 25) {
                    gba.L();
                    return;
                }
                if (i == 26) {
                    gba.K();
                    return;
                }
                if (i == 27) {
                    this.c.getMediaDataController().G0(false, true, null);
                    return;
                }
                if (i == 29) {
                    uo0.a();
                    tq0.b();
                    mp0.a();
                    y8a.c();
                    return;
                }
                if (i == 30) {
                    p40.a();
                    return;
                }
                if (i == 31) {
                    gba.O();
                    return;
                }
                if (i == 32) {
                    gba.I();
                    return;
                }
                if (i == 33) {
                    gba.N0 = !gba.N0;
                    SharedPreferences.Editor edit6 = na7.c1().edit();
                    edit6.putBoolean("debugVideoQualities", gba.N0);
                    edit6.apply();
                    return;
                }
                if (i == 34) {
                    gba.R0 = !gba.R0;
                    gl.a = null;
                    SharedPreferences.Editor edit7 = na7.c1().edit();
                    edit7.putBoolean("useSystemBoldFont", gba.R0);
                    edit7.apply();
                    return;
                }
                if (i == 35) {
                    i2 = ((d) this.c).currentAccount;
                    na7.q1(i2).U2(true);
                    return;
                }
                if (i == 36) {
                    gba.m = !gba.m;
                    SharedPreferences.Editor edit8 = na7.c1().edit();
                    edit8.putBoolean("forceForumTabs", gba.m);
                    edit8.apply();
                    return;
                }
                if (i == 37) {
                    fa4.j();
                    fa4.c(true);
                    return;
                } else {
                    if (i == 38) {
                        gba.n = !gba.n;
                        SharedPreferences.Editor edit9 = na7.c1().edit();
                        edit9.putBoolean("fastWallpaperDisabled", gba.n);
                        edit9.apply();
                        return;
                    }
                    return;
                }
            }
            int i11 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) a.b.getSystemService("activity")).getMemoryClass();
            StringBuilder sb = new StringBuilder();
            int i12 = 0;
            long j4 = 0;
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            long j10 = 0;
            long j11 = 0;
            while (true) {
                j = j3;
                if (i12 >= i11) {
                    break;
                }
                Long h1 = gl.h1("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_min_freq");
                Long h12 = gl.h1("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_cur_freq");
                Long h13 = gl.h1("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                Long h14 = gl.h1("/sys/devices/system/cpu/cpu" + i12 + "/cpu_capacity");
                sb.append("#");
                sb.append(i12);
                sb.append(" ");
                if (h1 != null) {
                    sb.append("min=");
                    i3 = i12;
                    sb.append(h1.longValue() / 1000);
                    sb.append(" ");
                    j5++;
                    j4 = (h1.longValue() / 1000) + j4;
                } else {
                    i3 = i12;
                }
                if (h12 != null) {
                    sb.append("cur=");
                    j2 = j4;
                    sb.append(h12.longValue() / 1000);
                    sb.append(" ");
                    j6 += h12.longValue() / 1000;
                    j7++;
                } else {
                    j2 = j4;
                }
                if (h13 != null) {
                    sb.append("max=");
                    sb.append(h13.longValue() / 1000);
                    sb.append(" ");
                    j8 = (h13.longValue() / 1000) + j8;
                    j9++;
                }
                if (h14 != null) {
                    sb.append("cpc=");
                    sb.append(h14);
                    sb.append(" ");
                    j10 = h14.longValue() + j10;
                    j11++;
                }
                sb.append("\n");
                i12 = i3 + 1;
                j3 = j;
                j4 = j2;
            }
            long j12 = j4;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Build.MANUFACTURER);
            sb2.append(", ");
            sb2.append(Build.MODEL);
            sb2.append(" (");
            sb2.append(Build.PRODUCT);
            sb2.append(", ");
            sb2.append(Build.DEVICE);
            sb2.append(")  (android ");
            int i13 = Build.VERSION.SDK_INT;
            sb2.append(i13);
            sb2.append(")\n");
            if (i13 >= 31) {
                sb2.append("SoC: ");
                sb2.append(Build.SOC_MANUFACTURER);
                sb2.append(", ");
                sb2.append(Build.SOC_MODEL);
                sb2.append("\n");
            }
            String i1 = gl.i1("/sys/kernel/gpu/gpu_model");
            if (i1 != null) {
                sb2.append("GPU: ");
                sb2.append(i1);
                Long h15 = gl.h1("/sys/kernel/gpu/gpu_min_clock");
                Long h16 = gl.h1("/sys/kernel/gpu/gpu_mm_min_clock");
                Long h17 = gl.h1("/sys/kernel/gpu/gpu_max_clock");
                if (h15 != null) {
                    sb2.append(", min=");
                    sb2.append(h15.longValue() / 1000);
                }
                if (h16 != null) {
                    sb2.append(", mmin=");
                    sb2.append(h16.longValue() / 1000);
                }
                if (h17 != null) {
                    sb2.append(", max=");
                    sb2.append(h17.longValue() / 1000);
                }
                sb2.append("\n");
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) a.b.getSystemService("activity")).getDeviceConfigurationInfo();
            sb2.append("GLES Version: ");
            sb2.append(deviceConfigurationInfo.getGlEsVersion());
            sb2.append("\nMemory: class=");
            sb2.append(gl.i0(memoryClass << 20, false, false));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) a.b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb2.append(", total=");
            sb2.append(gl.i0(memoryInfo.totalMem, false, false));
            sb2.append(", avail=");
            sb2.append(gl.i0(memoryInfo.availMem, false, false));
            sb2.append(", low?=");
            sb2.append(memoryInfo.lowMemory);
            sb2.append(" (threshold=");
            sb2.append(gl.i0(memoryInfo.threshold, false, false));
            sb2.append(")\nCurrent class: ");
            sb2.append(gba.w(gba.o()));
            sb2.append(", measured: ");
            sb2.append(gba.w(gba.u()));
            if (i13 >= 31) {
                sb2.append(", suggest=");
                sb2.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb2.append("\n");
            sb2.append(i11);
            sb2.append(" CPUs");
            if (j5 > j) {
                sb2.append(", avgMinFreq=");
                sb2.append(j12 / j5);
            }
            if (j7 > j) {
                sb2.append(", avgCurFreq=");
                sb2.append(j6 / j7);
            }
            if (j9 > j) {
                sb2.append(", avgMaxFreq=");
                sb2.append(j8 / j9);
            }
            if (j11 > j) {
                sb2.append(", avgCapacity=");
                sb2.append(j10 / j11);
            }
            sb2.append("\n");
            sb2.append((CharSequence) sb);
            ProfileActivity.L2("video/avc", sb2);
            ProfileActivity.L2("video/hevc", sb2);
            ProfileActivity.L2("video/x-vnd.on2.vp8", sb2);
            ProfileActivity.L2("video/x-vnd.on2.vp9", sb2);
            this.c.showDialog(new sm8(this, this.c.getParentActivity(), sb2.toString()));
        } catch (Exception unused) {
        }
    }

    @Override // e39
    public final boolean d(int i, View view) {
        String str;
        int i2;
        char c;
        String str2;
        ProfileActivity profileActivity = this.c;
        if (i != profileActivity.A3) {
            if (i >= profileActivity.x4 && i < profileActivity.y4) {
                boolean isEmpty = profileActivity.D2.isEmpty();
                ArrayList arrayList = profileActivity.U4;
                return profileActivity.g(!isEmpty ? (TLRPC.ChatParticipant) arrayList.get(((Integer) profileActivity.D2.get(i - profileActivity.x4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i - profileActivity.x4), true, false, view);
            }
            if (i != profileActivity.V2) {
                if (i == profileActivity.I3) {
                    profileActivity.Q1(i, view);
                    return true;
                }
                if (profileActivity.R1(i, view)) {
                    return true;
                }
                return profileActivity.f3(view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f), i, view);
            }
            if (profileActivity.R1(i, view)) {
                return true;
            }
            TLRPC.UserFull userFull = profileActivity.w2;
            if (userFull == null) {
                return false;
            }
            try {
                gl.g(UserInfoActivity.c0(userFull.birthday));
                u21.b0(profileActivity).i(k96.M0(2131753713, null)).j();
                return true;
            } catch (Exception e) {
                fa4.g(e, true);
                return true;
            }
        }
        int i3 = this.a + 1;
        this.a = i3;
        if (i3 < 2) {
            boolean z = w01.a;
            try {
                Toast.makeText(profileActivity.getParentActivity(), k96.M0(2131751613, "DebugMenuLongPress"), 0).show();
                return true;
            } catch (Exception e2) {
                fa4.g(e2, true);
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
        String M0 = k96.M0(2131751634, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        String M02 = k96.M0(2131751617, null);
        String M03 = k96.M0(2131751611, null);
        String M04 = k96.M0(2131751610, null);
        String M05 = k96.M0(2131751609, null);
        boolean z2 = w01.a;
        if (gba.v0) {
            str = "DebugMenuDisableCamera";
            i2 = 2131751628;
        } else {
            str = "DebugMenuEnableCamera";
            i2 = 2131751620;
        }
        String M06 = k96.M0(i2, str);
        String M07 = k96.M0(2131751631, "DebugMenuClearMediaCache");
        String M08 = k96.M0(2131751633, null);
        a.t();
        a.m();
        String M09 = k96.M0(2131751632, "DebugMenuCheckAppUpdate");
        String M010 = k96.M0(2131751612, "DebugMenuReadAllDialogs");
        String M011 = k96.M0(2131751629, null);
        String M012 = k96.M0(gba.F0 ? 2131751626 : 2131751618, null);
        gl.P1();
        String N0 = k96.N0(ir3.o(profileActivity.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        String str3 = gba.Y ? "back to TextureView in stories" : "use SurfaceView in stories";
        String str4 = !gba.a0 ? "Enable Invoice Payment" : "Disable Invoice Payment";
        String str5 = (!gba.e() || Build.VERSION.SDK_INT < 31) ? null : gba.X ? "back to cpu blur" : "use new gpu blur";
        String str6 = gba.s0 ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
        String str7 = gba.N0 ? "Disable video qualities debug" : "Enable video qualities debug";
        String str8 = str5;
        if (Build.VERSION.SDK_INT >= 28) {
            c = 28;
            str2 = k96.M0(gba.R0 ? 2131751625 : 2131751608, null);
        } else {
            c = 28;
            str2 = null;
        }
        String str9 = !gba.m ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
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
        charSequenceArr[c] = null;
        charSequenceArr[29] = "Clear Mini Apps Permissions and Files";
        charSequenceArr[30] = null;
        charSequenceArr[31] = str8;
        charSequenceArr[32] = str6;
        charSequenceArr[33] = str7;
        charSequenceArr[34] = str2;
        charSequenceArr[35] = "Reload app config";
        charSequenceArr[36] = str9;
        charSequenceArr[37] = "Make Memory Dump";
        charSequenceArr[38] = null;
        alertDialog$Builder.e(charSequenceArr, new fe((Object) this, (Object) this.b, (byte) 9));
        alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
        profileActivity.showDialog(hdVar);
        return true;
    }
}
