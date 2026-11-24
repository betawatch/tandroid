// default package

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsWidgetConfigActivity;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class vu2 implements vt3, yc3, aq2, Continuation, d39, OnSuccessListener, k8, eja, x56, us2, pc3, th4, e39, pf8, ed, z97, ym3, no7, s29 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vu2(tj tjVar, f86 f86Var, fr6 fr6Var, IOException iOException, boolean z) {
        this.a = (byte) 16;
        this.b = fr6Var;
    }

    @Override // aq2
    public final Object L(gl2 gl2Var) {
        String str;
        String str2;
        mv6 mv6Var;
        String str3;
        int i;
        int i2;
        int i3;
        Throwable th;
        lg4 lg4Var;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        q7a b;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
        int i4 = CrashlyticsRegistrar.d;
        long currentTimeMillis = System.currentTimeMillis();
        jg4 jg4Var = (jg4) gl2Var.a(jg4.class);
        rg4 rg4Var = (rg4) gl2Var.a(rg4.class);
        vq7 o = gl2Var.o(fy2.class);
        vq7 o2 = gl2Var.o(qj.class);
        vq7 o3 = gl2Var.o(dh4.class);
        ExecutorService executorService = (ExecutorService) gl2Var.i(crashlyticsRegistrar.a);
        ExecutorService executorService2 = (ExecutorService) gl2Var.i(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) gl2Var.i(crashlyticsRegistrar.c);
        jg4Var.a();
        Context context = jg4Var.a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
        mv6 mv6Var2 = new mv6(executorService, executorService2);
        jb4 jb4Var = new jb4();
        String str4 = ((b90) al8.a.b(context)).a;
        jb4Var.a = str4;
        File filesDir = context.getFilesDir();
        jb4Var.b = filesDir;
        if (str4.isEmpty()) {
            str = "FirebaseCrashlytics";
            str2 = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            str = "FirebaseCrashlytics";
            sb.append(str4.length() > 40 ? pm2.k(str4) : str4.replaceAll("[^a-zA-Z0-9.]", "_"));
            str2 = sb.toString();
        }
        File file = new File(filesDir, str2);
        jb4.c(file);
        jb4Var.c = file;
        File file2 = new File(file, "open-sessions");
        jb4.c(file2);
        jb4Var.d = file2;
        File file3 = new File(file, "reports");
        jb4.c(file3);
        jb4Var.e = file3;
        File file4 = new File(file, "priority-reports");
        jb4.c(file4);
        jb4Var.f = file4;
        File file5 = new File(file, "native-reports");
        jb4.c(file5);
        jb4Var.g = file5;
        w53 w53Var = new w53(jg4Var);
        wj5 wj5Var = new wj5(context, packageName, rg4Var, w53Var);
        fy2 fy2Var = new fy2(o);
        sj sjVar = new sj(o2);
        zx2 zx2Var = new zx2(w53Var, jb4Var);
        lh4 lh4Var = lh4.a;
        q6a q6aVar = q6a.a;
        lh4 lh4Var2 = lh4.a;
        jh4 a = lh4.a(q6aVar);
        if (a.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + q6aVar + " already registered.");
        } else {
            a.b = zx2Var;
            Log.d("FirebaseSessions", "Subscriber " + q6aVar + " registered.");
            a.a.countDown();
        }
        String str5 = str;
        rc1 rc1Var = new rc1(jg4Var, wj5Var, fy2Var, w53Var, new rj(sjVar), new rj(sjVar), jb4Var, zx2Var, new g29((Object) o3, (byte) 2), mv6Var2);
        mv6 mv6Var3 = (mv6) rc1Var.n;
        jg4Var.a();
        String str6 = jg4Var.c.b;
        int e = pm2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e == 0) {
            e = pm2.e(context, "com.crashlytics.android.build_id", "string");
        }
        String string = e != 0 ? context.getResources().getString(e) : null;
        ArrayList arrayList = new ArrayList();
        int e2 = pm2.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int e3 = pm2.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int e4 = pm2.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (e2 == 0 || e3 == 0 || e4 == 0) {
            mv6Var = mv6Var3;
            str3 = str6;
            i = 0;
            i2 = 1;
            i3 = 3;
            String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e2), Integer.valueOf(e3), Integer.valueOf(e4));
            th = null;
            if (Log.isLoggable(str5, 3)) {
                Log.d(str5, format, null);
            }
        } else {
            i = 0;
            String[] stringArray = context.getResources().getStringArray(e2);
            String[] stringArray2 = context.getResources().getStringArray(e3);
            String[] stringArray3 = context.getResources().getStringArray(e4);
            i2 = 1;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i5 = 0;
                while (i5 < stringArray3.length) {
                    int i6 = i5;
                    arrayList.add(new u01(stringArray[i6], stringArray2[i6], stringArray3[i6]));
                    i5 = i6 + 1;
                    str6 = str6;
                    mv6Var3 = mv6Var3;
                }
                mv6Var = mv6Var3;
                str3 = str6;
            } else {
                mv6Var = mv6Var3;
                str3 = str6;
                String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable(str5, 3)) {
                    Log.d(str5, format2, null);
                }
            }
            i3 = 3;
            th = null;
        }
        String h = b00.h("Mapping file ID is: ", string);
        if (Log.isLoggable(str5, i3)) {
            Log.d(str5, h, th);
        }
        int size = arrayList.size();
        int i7 = i;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            u01 u01Var = (u01) obj;
            String str7 = u01Var.a;
            String str8 = u01Var.b;
            String str9 = u01Var.c;
            int i8 = size;
            StringBuilder l = yjb.l("Build id for ", str7, " on ", str8, ": ");
            l.append(str9);
            String sb2 = l.toString();
            if (Log.isLoggable(str5, 3)) {
                Log.d(str5, sb2, null);
            }
            size = i8;
        }
        String str10 = str3;
        try {
            dr a2 = dr.a(context, wj5Var, str10, string, arrayList, new lv6((Object) context, (byte) 21));
            String str11 = "Installer package name is: " + a2.d;
            if (Log.isLoggable(str5, 2)) {
                Log.v(str5, str11, null);
            }
            new eef((byte) 20);
            String str12 = a2.f;
            String str13 = a2.g;
            String d = wj5Var.d();
            ize izeVar = new ize((byte) 27);
            u39 u39Var = new u39(izeVar, (byte) 11);
            l69 l69Var = new l69(jb4Var);
            Locale locale = Locale.US;
            String y = tb4.y("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str10, "/settings");
            zb3 zb3Var = new zb3();
            zb3Var.a = y;
            String str14 = Build.MANUFACTURER;
            String str15 = wj5.h;
            String p = tb4.p(str14.replaceAll(str15, ""), "/", Build.MODEL.replaceAll(str15, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str15, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str15, "");
            int e5 = pm2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e5 == 0) {
                e5 = pm2.e(context, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {e5 != 0 ? context.getResources().getString(e5) : null, str10, str13, str12};
            ArrayList arrayList2 = new ArrayList();
            int i9 = 0;
            while (i9 < 4) {
                String str16 = strArr[i9];
                String[] strArr2 = strArr;
                if (str16 != null) {
                    arrayList2.add(str16.replace("-", "").toLowerCase(Locale.US));
                }
                i9++;
                strArr = strArr2;
            }
            Collections.sort(arrayList2);
            StringBuilder sb3 = new StringBuilder();
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                sb3.append((String) obj2);
                str12 = str12;
            }
            String str17 = str12;
            String sb4 = sb3.toString();
            dv8 dv8Var = new dv8(context, new l8a(str10, p, replaceAll, replaceAll2, wj5Var, sb4.length() > 0 ? pm2.k(sb4) : null, str13, str17, ir2.h(d != null ? 4 : i2)), izeVar, u39Var, l69Var, zb3Var, w53Var);
            AtomicReference atomicReference = (AtomicReference) dv8Var.h;
            AtomicReference atomicReference2 = dv8Var.a;
            if (!((Context) dv8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((l8a) dv8Var.c).f) || (b = dv8Var.b(i2)) == null) {
                q7a b2 = dv8Var.b(3);
                if (b2 != null) {
                    atomicReference2.set(b2);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(b2);
                }
                w53 w53Var2 = (w53) dv8Var.g;
                Task task2 = w53Var2.h.getTask();
                synchronized (w53Var2.c) {
                    task = w53Var2.d.getTask();
                }
                onSuccessTask = rp5.c(task2, task).onSuccessTask((pz2) mv6Var2.b, new wk4(dv8Var, mv6Var2, false, (byte) 27));
            } else {
                atomicReference2.set(b);
                ((TaskCompletionSource) atomicReference.get()).trySetResult(b);
                onSuccessTask = Tasks.forResult(null);
            }
            onSuccessTask.addOnFailureListener(executorService3, new w44((byte) 16));
            jb4 jb4Var2 = (jb4) rc1Var.h;
            Context context2 = (Context) rc1Var.a;
            boolean c = pm2.c(context2, "com.google.firebase.crashlytics.RequireBuildId", pm2.c(context2, "com.crashlytics.RequireBuildId", true));
            String str18 = a2.b;
            if (c) {
                if (TextUtils.isEmpty(str18)) {
                    Log.e(str5, ".");
                    Log.e(str5, ".     |  | ");
                    Log.e(str5, ".     |  |");
                    Log.e(str5, ".     |  |");
                    Log.e(str5, ".   \\ |  | /");
                    Log.e(str5, ".    \\    /");
                    Log.e(str5, ".     \\  /");
                    Log.e(str5, ".      \\/");
                    Log.e(str5, ".");
                    Log.e(str5, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    Log.e(str5, ".");
                    Log.e(str5, ".      /\\");
                    Log.e(str5, ".     /  \\");
                    Log.e(str5, ".    /    \\");
                    Log.e(str5, ".   / |  | \\");
                    Log.e(str5, ".     |  |");
                    Log.e(str5, ".     |  |");
                    Log.e(str5, ".     |  |");
                    Log.e(str5, ".");
                    sc8.j("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    return null;
                }
            } else if (Log.isLoggable(str5, 2)) {
                Log.v(str5, "Configured not to require a build ID.", null);
            }
            String str19 = new j51().a;
            try {
                byte b3 = 18;
                rc1Var.e = new tg2("crash_marker", jb4Var2, b3);
                rc1Var.d = new tg2("initialization_marker", jb4Var2, b3);
                mv6 mv6Var4 = mv6Var;
                jb4 jb4Var3 = new jb4(str19, jb4Var2, mv6Var4);
                tg2 tg2Var = new tg2(jb4Var2);
                sk4 sk4Var = new sk4(new pma[]{new eef((byte) 24)});
                ((vq7) ((g29) rc1Var.m).b).a(new sc8((byte) 15));
                rc1Var.f = new dy2((Context) rc1Var.a, (wj5) rc1Var.g, (w53) rc1Var.b, (jb4) rc1Var.h, (tg2) rc1Var.e, a2, jb4Var3, tg2Var, n6a.d((Context) rc1Var.a, (wj5) rc1Var.g, (jb4) rc1Var.h, a2, tg2Var, jb4Var3, sk4Var, dv8Var, (sk4) rc1Var.c, (zx2) rc1Var.k, (mv6) rc1Var.n), (fy2) rc1Var.l, (rj) rc1Var.j, (zx2) rc1Var.k, (mv6) rc1Var.n);
                tg2 tg2Var2 = (tg2) rc1Var.d;
                boolean exists = new File((File) ((jb4) tg2Var2.c).c, (String) tg2Var2.b).exists();
                try {
                    Boolean.TRUE.equals((Boolean) ((pz2) mv6Var4.b).a.submit(new mk(rc1Var, (byte) 1)).get(3L, TimeUnit.SECONDS));
                } catch (Exception unused) {
                }
                dy2 dy2Var = (dy2) rc1Var.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                ((pz2) dy2Var.e.b).a(new gu2((Object) dy2Var, (Object) str19, (byte) 6));
                oz2 oz2Var = new oz2(new i4d(dy2Var), dv8Var, defaultUncaughtExceptionHandler, dy2Var.j);
                dy2Var.n = oz2Var;
                Thread.setDefaultUncaughtExceptionHandler(oz2Var);
                if (Build.VERSION.SDK_INT >= 37) {
                    ((dy2) rc1Var.f).c(str19);
                }
                if (!exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str5, 3)) {
                        Log.d(str5, "Successfully configured exception handler.", null);
                    }
                    ((pz2) mv6Var4.b).a(new ey2(rc1Var, dv8Var, (byte) 0));
                } else {
                    if (Log.isLoggable(str5, 3)) {
                        Log.d(str5, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                    }
                    rc1Var.b(dv8Var);
                }
            } catch (Exception e6) {
                Log.e(str5, "Crashlytics was not started due to an exception during initialization", e6);
                rc1Var.f = null;
            }
            lg4Var = new lg4(rc1Var);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e(str5, "Error retrieving app package info.", e7);
            lg4Var = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            String n = ug8.n(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
            if (Log.isLoggable(str5, 3)) {
                Log.d(str5, n, null);
            }
        }
        return lg4Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        mq3 mq3Var = (mq3) this.b;
        mq3Var.e = vxcVar;
        io5 H0 = gl.H0(vxcVar, false);
        io5 H02 = gl.H0(vxcVar, true);
        if (!mq3Var.f.equals(H0) || !mq3Var.h.equals(H02)) {
            gl.m = H0.b;
            gl.n = H0.d;
            mq3Var.f = H0;
            mq3Var.h = H02;
            mq3Var.requestLayout();
        }
        int childCount = mq3Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mq3Var.getChildAt(i);
            if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                jdc.b(childAt, vxcVar);
            }
        }
        mq3Var.invalidate();
        return vxc.b;
    }

    @Override // us2
    public final void accept(Object obj) {
        ((vq3) obj).a((vi2) this.b);
    }

    @Override // z97
    public final boolean b(TLRPC.TL_error tL_error) {
        ((n30) this.b).run();
        return true;
    }

    @Override // ym3
    public final void c(long j, long j2) {
        long[] jArr = (long[]) this.b;
        ExecutorService executorService = DictationLid.a;
        long[] jArr2 = (long[]) DictationAsr.h.get("tinylid.bin");
        if (jArr2 != null) {
            jArr2[0] = j;
            if (j2 > 0) {
                jArr2[1] = j2;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - jArr[0] > 100) {
            jArr[0] = elapsedRealtime;
            DictationAsr.n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0221  */
    @Override // e39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(int i, final View view) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TLRPC.Chat chat;
        String str;
        fm2 fm2Var;
        boolean z;
        boolean z2;
        cs5 cs5Var;
        final byte b;
        int i9;
        Drawable drawable;
        final oh3 oh3Var = (oh3) this.b;
        if (oh3Var.O == 0.0f && oh3Var.o0 == 0.0f) {
            final long j = ((uf3) view).F;
            cj3 cj3Var = oh3Var.P0;
            i2 = ((d) cj3Var).currentAccount;
            byte b2 = 1;
            hq6.d0(i2).O0(true);
            cs5 I = cs5.I(cj3Var, view);
            I.z.set(0, gl.L(8.0f), 0, 0);
            I.X(bkb.c0(gl.L(12.0f), gl.L(12.0f), cj3Var.getThemedColor(bkb.c6)));
            I.b0(0.0f, gl.L(8.0f));
            cj3Var.M0 = I;
            if (!l7c.C(j)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i3 = ((d) cj3Var).currentAccount;
                byte b3 = 2;
                byte b4 = 3;
                if (j != y6c.h(i3).e()) {
                    final TLRPC.User V1 = cj3Var.getMessagesController().V1(Long.valueOf(j));
                    TLRPC.Chat K0 = cj3Var.getMessagesController().K0(Long.valueOf(-j));
                    String p = im7.p(j, 0L, false);
                    i4 = ((d) cj3Var).currentAccount;
                    boolean c0 = NotificationsCustomSettingsActivity.c0(i4, j);
                    i5 = ((d) cj3Var).currentAccount;
                    boolean F3 = na7.q1(i5).F3();
                    i6 = ((d) cj3Var).currentAccount;
                    boolean p2 = y6c.h(i6).p();
                    i7 = ((d) cj3Var).currentAccount;
                    boolean K = na7.q1(i7).M1().K(j);
                    i8 = ((d) cj3Var).currentAccount;
                    boolean G = na7.q1(i8).M1().G(j);
                    if (F3 || j <= 0 || p2 || (drawable = oh3Var.getContext().getDrawable(R.drawable.msg_gallery_locked2)) == null) {
                        chat = K0;
                        str = p;
                        fm2Var = null;
                    } else {
                        Drawable drawable2 = oh3Var.getContext().getDrawable(R.drawable.msg_stealth_locked);
                        if (drawable2 != null) {
                            chat = K0;
                            zkb.x(oh3Var, drawable2, bkb.E8, cj3Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                        } else {
                            chat = K0;
                        }
                        str = p;
                        drawable.setColorFilter(new PorterDuffColorFilter(bm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        fm2Var = new fm2(drawable2, drawable);
                    }
                    if (j < 0 && cj3Var.t3().i(j)) {
                        final byte b5 = 4;
                        cj3Var.M0.a(R.drawable.msg_stories_add, null, k96.M0(2131754381, null), bkb.E8, bkb.D8, new Runnable() { // from class: kh3
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i10;
                                byte b6 = b5;
                                long j2 = j;
                                oh3 oh3Var2 = oh3Var;
                                switch (b6) {
                                    case 0:
                                        oh3Var2.P0.presentFragment(mu1.W9(j2));
                                        break;
                                    case 1:
                                        gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                        break;
                                    case 2:
                                        gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                        break;
                                    case 3:
                                        cj3 cj3Var2 = oh3Var2.P0;
                                        i10 = ((d) cj3Var2).currentAccount;
                                        hq6.d0(i10).Q1(j2);
                                        cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                        break;
                                    case 4:
                                        oh3Var2.P0.F0.j(j2);
                                        break;
                                    case 5:
                                        oh3Var2.P0.presentFragment(mu1.W9(j2));
                                        break;
                                    default:
                                        oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                        break;
                                }
                            }
                        });
                    }
                    if (V1 != null && !V1.contact) {
                        i9 = ((d) cj3Var).currentAccount;
                        if (hq6.d0(i9).I(j)) {
                            z = true;
                            cs5 cs5Var2 = cj3Var.M0;
                            final byte b6 = 5;
                            cs5Var2.k(R.drawable.msg_discussion, k96.M0(2131745409, null), new Runnable() { // from class: kh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b6;
                                    long j2 = j;
                                    oh3 oh3Var2 = oh3Var;
                                    switch (b62) {
                                        case 0:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        case 1:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            cj3 cj3Var2 = oh3Var2.P0;
                                            i10 = ((d) cj3Var2).currentAccount;
                                            hq6.d0(i10).Q1(j2);
                                            cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            oh3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        default:
                                            oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                            break;
                                    }
                                }
                            }, j <= 0);
                            final byte b7 = 6;
                            cs5Var2.k(R.drawable.msg_openprofile, k96.M0(2131747593, null), new Runnable() { // from class: kh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b7;
                                    long j2 = j;
                                    oh3 oh3Var2 = oh3Var;
                                    switch (b62) {
                                        case 0:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        case 1:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            cj3 cj3Var2 = oh3Var2.P0;
                                            i10 = ((d) cj3Var2).currentAccount;
                                            hq6.d0(i10).Q1(j2);
                                            cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            oh3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        default:
                                            oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                            break;
                                    }
                                }
                            }, j <= 0);
                            final byte b8 = 0;
                            cs5Var2.k(R.drawable.msg_channel, k96.M0(!hc2.V(chat) ? 2131747618 : 2131747606, null), new Runnable() { // from class: kh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b8;
                                    long j2 = j;
                                    oh3 oh3Var2 = oh3Var;
                                    switch (b62) {
                                        case 0:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        case 1:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            cj3 cj3Var2 = oh3Var2.P0;
                                            i10 = ((d) cj3Var2).currentAccount;
                                            hq6.d0(i10).Q1(j2);
                                            cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            oh3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        default:
                                            oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                            break;
                                    }
                                }
                            }, j >= 0);
                            final byte b9 = 0;
                            final String str2 = str;
                            cs5Var2.k(R.drawable.msg_mute, k96.M0(2131747670, null), new Runnable() { // from class: lh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    String trim;
                                    int i11;
                                    byte b10 = b9;
                                    TLRPC.User user = V1;
                                    String str3 = str2;
                                    oh3 oh3Var2 = oh3Var;
                                    switch (b10) {
                                        case 0:
                                            cj3 cj3Var2 = oh3Var2.P0;
                                            i10 = ((d) cj3Var2).currentAccount;
                                            na7.q1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                            cj3Var2.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            u21.b0(cj3Var2).V(Arrays.asList(user), gl.S2(k96.a0("NotificationsStoryMutedHint", null, 2131747669, trim)), null, null).j();
                                            break;
                                        default:
                                            cj3 cj3Var3 = oh3Var2.P0;
                                            i11 = ((d) cj3Var3).currentAccount;
                                            na7.q1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                            cj3Var3.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            u21.b0(cj3Var3).V(Arrays.asList(user), gl.S2(k96.a0("NotificationsStoryUnmutedHint", null, 2131747666, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !c0 && j > 0);
                            cs5Var2.F();
                            final byte b10 = 1;
                            cs5Var2.k(R.drawable.msg_unmute, k96.M0(2131747667, null), new Runnable() { // from class: lh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    String trim;
                                    int i11;
                                    byte b102 = b10;
                                    TLRPC.User user = V1;
                                    String str3 = str2;
                                    oh3 oh3Var2 = oh3Var;
                                    switch (b102) {
                                        case 0:
                                            cj3 cj3Var2 = oh3Var2.P0;
                                            i10 = ((d) cj3Var2).currentAccount;
                                            na7.q1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                            cj3Var2.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            u21.b0(cj3Var2).V(Arrays.asList(user), gl.S2(k96.a0("NotificationsStoryMutedHint", null, 2131747669, trim)), null, null).j();
                                            break;
                                        default:
                                            cj3 cj3Var3 = oh3Var2.P0;
                                            i11 = ((d) cj3Var3).currentAccount;
                                            na7.q1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                            cj3Var3.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            u21.b0(cj3Var3).V(Arrays.asList(user), gl.S2(k96.a0("NotificationsStoryUnmutedHint", null, 2131747666, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, c0 && j > 0);
                            cs5Var2.F();
                            final byte b11 = 0;
                            cs5Var2.k(R.drawable.msg_stories_stealth2, k96.M0(2131743320, null), new Runnable() { // from class: mh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    wjb wjbVar;
                                    int i10;
                                    wjb wjbVar2;
                                    byte b12 = b11;
                                    byte b13 = 0;
                                    View view2 = view;
                                    oh3 oh3Var2 = oh3Var;
                                    byte b14 = 1;
                                    switch (b12) {
                                        case 0:
                                            cj3 cj3Var2 = oh3Var2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = na7.q1(y6c.t0).M1().B;
                                            if (tL_storiesStealthMode != null) {
                                                i10 = ((d) cj3Var2).currentAccount;
                                                if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof uf3) {
                                                        cj3Var2.F0.i((uf3) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = oh3Var2.getContext();
                                            wjbVar = ((d) cj3Var2).resourceProvider;
                                            eya eyaVar = new eya(context, 0.0f, 1, wjbVar);
                                            eyaVar.o1 = new nh3(oh3Var2, view2, b14);
                                            cj3Var2.showDialog(eyaVar);
                                            break;
                                        default:
                                            Context context2 = oh3Var2.getContext();
                                            cj3 cj3Var3 = oh3Var2.P0;
                                            wjbVar2 = ((d) cj3Var3).resourceProvider;
                                            eya eyaVar2 = new eya(context2, 0.0f, 1, wjbVar2);
                                            eyaVar2.o1 = new nh3(oh3Var2, view2, b13);
                                            cj3Var3.showDialog(eyaVar2);
                                            break;
                                    }
                                }
                            }, F3 && j > 0 && p2 && K && !G);
                            cs5Var2.F();
                            z2 = F3 && j > 0 && !p2 && K && !G;
                            String M0 = k96.M0(2131743320, null);
                            final byte b12 = 1;
                            Runnable runnable = new Runnable() { // from class: mh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    wjb wjbVar;
                                    int i10;
                                    wjb wjbVar2;
                                    byte b122 = b12;
                                    byte b13 = 0;
                                    View view2 = view;
                                    oh3 oh3Var2 = oh3Var;
                                    byte b14 = 1;
                                    switch (b122) {
                                        case 0:
                                            cj3 cj3Var2 = oh3Var2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = na7.q1(y6c.t0).M1().B;
                                            if (tL_storiesStealthMode != null) {
                                                i10 = ((d) cj3Var2).currentAccount;
                                                if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof uf3) {
                                                        cj3Var2.F0.i((uf3) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = oh3Var2.getContext();
                                            wjbVar = ((d) cj3Var2).resourceProvider;
                                            eya eyaVar = new eya(context, 0.0f, 1, wjbVar);
                                            eyaVar.o1 = new nh3(oh3Var2, view2, b14);
                                            cj3Var2.showDialog(eyaVar);
                                            break;
                                        default:
                                            Context context2 = oh3Var2.getContext();
                                            cj3 cj3Var3 = oh3Var2.P0;
                                            wjbVar2 = ((d) cj3Var3).resourceProvider;
                                            eya eyaVar2 = new eya(context2, 0.0f, 1, wjbVar2);
                                            eyaVar2.o1 = new nh3(oh3Var2, view2, b13);
                                            cj3Var3.showDialog(eyaVar2);
                                            break;
                                    }
                                }
                            };
                            if (z2) {
                                cs5Var = cs5Var2;
                            } else {
                                cs5Var2.a(R.drawable.msg_stories_stealth2, fm2Var, M0, bkb.E8, bkb.D8, runnable);
                                cs5Var = cs5Var2;
                            }
                            cs5Var.F();
                            boolean z3 = z && !cj3Var.D3();
                            String M02 = k96.M0(2131754150, null);
                            final char c = 1 == true ? 1 : 0;
                            cs5Var.k(R.drawable.msg_archive, M02, new Runnable() { // from class: kh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = c;
                                    long j2 = j;
                                    oh3 oh3Var2 = oh3Var;
                                    switch (b62) {
                                        case 0:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        case 1:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            cj3 cj3Var2 = oh3Var2.P0;
                                            i10 = ((d) cj3Var2).currentAccount;
                                            hq6.d0(i10).Q1(j2);
                                            cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            oh3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        default:
                                            oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                            break;
                                    }
                                }
                            }, z3);
                            cs5Var.F();
                            final byte b13 = 2;
                            cs5Var.k(R.drawable.msg_unarchive, k96.M0(2131743675, null), new Runnable() { // from class: kh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b13;
                                    long j2 = j;
                                    oh3 oh3Var2 = oh3Var;
                                    switch (b62) {
                                        case 0:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        case 1:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            cj3 cj3Var2 = oh3Var2.P0;
                                            i10 = ((d) cj3Var2).currentAccount;
                                            hq6.d0(i10).Q1(j2);
                                            cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            oh3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        default:
                                            oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                            break;
                                    }
                                }
                            }, z && cj3Var.D3());
                            cs5Var.F();
                            b = 3;
                            cs5Var.k(R.drawable.msg_delete, k96.M0(2131744511, null), new Runnable() { // from class: kh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b;
                                    long j2 = j;
                                    oh3 oh3Var2 = oh3Var;
                                    switch (b62) {
                                        case 0:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        case 1:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            cj3 cj3Var2 = oh3Var2.P0;
                                            i10 = ((d) cj3Var2).currentAccount;
                                            hq6.d0(i10).Q1(j2);
                                            cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            oh3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            oh3Var2.P0.presentFragment(mu1.W9(j2));
                                            break;
                                        default:
                                            oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                            break;
                                    }
                                }
                            }, z);
                        }
                    }
                    z = false;
                    cs5 cs5Var22 = cj3Var.M0;
                    final byte b62 = 5;
                    cs5Var22.k(R.drawable.msg_discussion, k96.M0(2131745409, null), new Runnable() { // from class: kh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b62;
                            long j2 = j;
                            oh3 oh3Var2 = oh3Var;
                            switch (b622) {
                                case 0:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                case 1:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    cj3 cj3Var2 = oh3Var2.P0;
                                    i10 = ((d) cj3Var2).currentAccount;
                                    hq6.d0(i10).Q1(j2);
                                    cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                    break;
                                case 4:
                                    oh3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                default:
                                    oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                    break;
                            }
                        }
                    }, j <= 0);
                    final byte b72 = 6;
                    cs5Var22.k(R.drawable.msg_openprofile, k96.M0(2131747593, null), new Runnable() { // from class: kh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b72;
                            long j2 = j;
                            oh3 oh3Var2 = oh3Var;
                            switch (b622) {
                                case 0:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                case 1:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    cj3 cj3Var2 = oh3Var2.P0;
                                    i10 = ((d) cj3Var2).currentAccount;
                                    hq6.d0(i10).Q1(j2);
                                    cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                    break;
                                case 4:
                                    oh3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                default:
                                    oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                    break;
                            }
                        }
                    }, j <= 0);
                    final byte b82 = 0;
                    cs5Var22.k(R.drawable.msg_channel, k96.M0(!hc2.V(chat) ? 2131747618 : 2131747606, null), new Runnable() { // from class: kh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b82;
                            long j2 = j;
                            oh3 oh3Var2 = oh3Var;
                            switch (b622) {
                                case 0:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                case 1:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    cj3 cj3Var2 = oh3Var2.P0;
                                    i10 = ((d) cj3Var2).currentAccount;
                                    hq6.d0(i10).Q1(j2);
                                    cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                    break;
                                case 4:
                                    oh3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                default:
                                    oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                    break;
                            }
                        }
                    }, j >= 0);
                    final byte b92 = 0;
                    final String str22 = str;
                    cs5Var22.k(R.drawable.msg_mute, k96.M0(2131747670, null), new Runnable() { // from class: lh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            String trim;
                            int i11;
                            byte b102 = b92;
                            TLRPC.User user = V1;
                            String str3 = str22;
                            oh3 oh3Var2 = oh3Var;
                            switch (b102) {
                                case 0:
                                    cj3 cj3Var2 = oh3Var2.P0;
                                    i10 = ((d) cj3Var2).currentAccount;
                                    na7.q1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                    cj3Var2.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    u21.b0(cj3Var2).V(Arrays.asList(user), gl.S2(k96.a0("NotificationsStoryMutedHint", null, 2131747669, trim)), null, null).j();
                                    break;
                                default:
                                    cj3 cj3Var3 = oh3Var2.P0;
                                    i11 = ((d) cj3Var3).currentAccount;
                                    na7.q1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                    cj3Var3.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    u21.b0(cj3Var3).V(Arrays.asList(user), gl.S2(k96.a0("NotificationsStoryUnmutedHint", null, 2131747666, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, !c0 && j > 0);
                    cs5Var22.F();
                    final byte b102 = 1;
                    cs5Var22.k(R.drawable.msg_unmute, k96.M0(2131747667, null), new Runnable() { // from class: lh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            String trim;
                            int i11;
                            byte b1022 = b102;
                            TLRPC.User user = V1;
                            String str3 = str22;
                            oh3 oh3Var2 = oh3Var;
                            switch (b1022) {
                                case 0:
                                    cj3 cj3Var2 = oh3Var2.P0;
                                    i10 = ((d) cj3Var2).currentAccount;
                                    na7.q1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                    cj3Var2.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    u21.b0(cj3Var2).V(Arrays.asList(user), gl.S2(k96.a0("NotificationsStoryMutedHint", null, 2131747669, trim)), null, null).j();
                                    break;
                                default:
                                    cj3 cj3Var3 = oh3Var2.P0;
                                    i11 = ((d) cj3Var3).currentAccount;
                                    na7.q1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                    cj3Var3.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    u21.b0(cj3Var3).V(Arrays.asList(user), gl.S2(k96.a0("NotificationsStoryUnmutedHint", null, 2131747666, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, c0 && j > 0);
                    cs5Var22.F();
                    final byte b112 = 0;
                    cs5Var22.k(R.drawable.msg_stories_stealth2, k96.M0(2131743320, null), new Runnable() { // from class: mh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            wjb wjbVar;
                            int i10;
                            wjb wjbVar2;
                            byte b122 = b112;
                            byte b132 = 0;
                            View view2 = view;
                            oh3 oh3Var2 = oh3Var;
                            byte b14 = 1;
                            switch (b122) {
                                case 0:
                                    cj3 cj3Var2 = oh3Var2.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = na7.q1(y6c.t0).M1().B;
                                    if (tL_storiesStealthMode != null) {
                                        i10 = ((d) cj3Var2).currentAccount;
                                        if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof uf3) {
                                                cj3Var2.F0.i((uf3) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = oh3Var2.getContext();
                                    wjbVar = ((d) cj3Var2).resourceProvider;
                                    eya eyaVar = new eya(context, 0.0f, 1, wjbVar);
                                    eyaVar.o1 = new nh3(oh3Var2, view2, b14);
                                    cj3Var2.showDialog(eyaVar);
                                    break;
                                default:
                                    Context context2 = oh3Var2.getContext();
                                    cj3 cj3Var3 = oh3Var2.P0;
                                    wjbVar2 = ((d) cj3Var3).resourceProvider;
                                    eya eyaVar2 = new eya(context2, 0.0f, 1, wjbVar2);
                                    eyaVar2.o1 = new nh3(oh3Var2, view2, b132);
                                    cj3Var3.showDialog(eyaVar2);
                                    break;
                            }
                        }
                    }, F3 && j > 0 && p2 && K && !G);
                    cs5Var22.F();
                    if (F3) {
                    }
                    String M03 = k96.M0(2131743320, null);
                    final byte b122 = 1;
                    Runnable runnable2 = new Runnable() { // from class: mh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            wjb wjbVar;
                            int i10;
                            wjb wjbVar2;
                            byte b1222 = b122;
                            byte b132 = 0;
                            View view2 = view;
                            oh3 oh3Var2 = oh3Var;
                            byte b14 = 1;
                            switch (b1222) {
                                case 0:
                                    cj3 cj3Var2 = oh3Var2.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = na7.q1(y6c.t0).M1().B;
                                    if (tL_storiesStealthMode != null) {
                                        i10 = ((d) cj3Var2).currentAccount;
                                        if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof uf3) {
                                                cj3Var2.F0.i((uf3) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = oh3Var2.getContext();
                                    wjbVar = ((d) cj3Var2).resourceProvider;
                                    eya eyaVar = new eya(context, 0.0f, 1, wjbVar);
                                    eyaVar.o1 = new nh3(oh3Var2, view2, b14);
                                    cj3Var2.showDialog(eyaVar);
                                    break;
                                default:
                                    Context context2 = oh3Var2.getContext();
                                    cj3 cj3Var3 = oh3Var2.P0;
                                    wjbVar2 = ((d) cj3Var3).resourceProvider;
                                    eya eyaVar2 = new eya(context2, 0.0f, 1, wjbVar2);
                                    eyaVar2.o1 = new nh3(oh3Var2, view2, b132);
                                    cj3Var3.showDialog(eyaVar2);
                                    break;
                            }
                        }
                    };
                    if (z2) {
                    }
                    cs5Var.F();
                    if (z) {
                    }
                    String M022 = k96.M0(2131754150, null);
                    final byte c2 = 1 == true ? 1 : 0;
                    cs5Var.k(R.drawable.msg_archive, M022, new Runnable() { // from class: kh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = c2;
                            long j2 = j;
                            oh3 oh3Var2 = oh3Var;
                            switch (b622) {
                                case 0:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                case 1:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    cj3 cj3Var2 = oh3Var2.P0;
                                    i10 = ((d) cj3Var2).currentAccount;
                                    hq6.d0(i10).Q1(j2);
                                    cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                    break;
                                case 4:
                                    oh3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                default:
                                    oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                    break;
                            }
                        }
                    }, z3);
                    cs5Var.F();
                    final byte b132 = 2;
                    cs5Var.k(R.drawable.msg_unarchive, k96.M0(2131743675, null), new Runnable() { // from class: kh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b132;
                            long j2 = j;
                            oh3 oh3Var2 = oh3Var;
                            switch (b622) {
                                case 0:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                case 1:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    cj3 cj3Var2 = oh3Var2.P0;
                                    i10 = ((d) cj3Var2).currentAccount;
                                    hq6.d0(i10).Q1(j2);
                                    cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                    break;
                                case 4:
                                    oh3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                default:
                                    oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                    break;
                            }
                        }
                    }, z && cj3Var.D3());
                    cs5Var.F();
                    b = 3;
                    cs5Var.k(R.drawable.msg_delete, k96.M0(2131744511, null), new Runnable() { // from class: kh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b;
                            long j2 = j;
                            oh3 oh3Var2 = oh3Var;
                            switch (b622) {
                                case 0:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                case 1:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r8.D3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gl.d3(new lg3(oh3Var2.P0, j, !r7.D3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    cj3 cj3Var2 = oh3Var2.P0;
                                    i10 = ((d) cj3Var2).currentAccount;
                                    hq6.d0(i10).Q1(j2);
                                    cj3Var2.getMessagesController().M1().l0(j2, true, false);
                                    break;
                                case 4:
                                    oh3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    oh3Var2.P0.presentFragment(mu1.W9(j2));
                                    break;
                                default:
                                    oh3Var2.P0.presentFragment(ProfileActivity.P2(j2));
                                    break;
                            }
                        }
                    }, z);
                } else if (cj3Var.P3) {
                    cs5 cs5Var3 = cj3Var.M0;
                    String M04 = k96.M0(2131754381, null);
                    int i10 = bkb.E8;
                    int i11 = bkb.D8;
                    cs5Var3.a(R.drawable.msg_stories_add, null, M04, i10, i11, new mf3(oh3Var, b2));
                    cj3Var.M0.a(R.drawable.msg_stories_archive, null, k96.M0(2131754120, null), i10, i11, new mf3(oh3Var, b3));
                    cj3Var.M0.a(R.drawable.msg_stories_saved, null, k96.M0(2131745693, null), i10, i11, new mf3(oh3Var, b4));
                    b = 3;
                } else {
                    oh3 oh3Var2 = cj3Var.F0;
                    if (oh3Var2 != null) {
                        oh3Var2.n();
                    }
                }
                cs5 cs5Var4 = cj3Var.M0;
                cs5Var4.i = b;
                cs5Var4.b0(gl.L(-8.0f), gl.L(-10.0f));
                cs5Var4.a0();
                return false;
            }
            pw0.E.a();
        }
        return false;
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        c4c G;
        Object obj;
        long j;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                q03 q03Var = (q03) obj2;
                HashSet hashSet = q03Var.W1;
                if (!q03Var.X1 && (G = q03Var.Y1.G(i - 1)) != null && (obj = G.H) != null) {
                    if (obj instanceof TLRPC.User) {
                        j = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j = ((TLRPC.Chat) obj).id;
                    }
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                    } else {
                        hashSet.add(Long.valueOf(j));
                    }
                    if (view instanceof kz9) {
                        ((kz9) view).c(hashSet.contains(Long.valueOf(j)), true);
                        break;
                    }
                }
                break;
            default:
                ((DataAutoDownloadActivity) obj2).p0(f, i, view);
                break;
        }
    }

    @Override // s29
    public final void f() {
        ((jv3) this.b).invalidate();
    }

    @Override // th4
    public final void g(float f) {
        zac zacVar = ((uac) this.b).b;
        if (zacVar.f == f) {
            return;
        }
        zacVar.f = f;
        zacVar.c(false);
    }

    @Override // yc3
    public final void h(mt8 mt8Var) {
        fy2 fy2Var = (fy2) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        fy2Var.b.set((fy2) mt8Var.get());
    }

    @Override // x56
    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 13:
                ((uj) obj).u((j54) obj2);
                break;
            case 14:
                ((uj) obj).onSeekStarted((tj) obj2);
                break;
            case 15:
                ((uj) obj).j((w83) obj2);
                break;
            default:
                ((uj) obj).i((fr6) obj2);
                break;
        }
    }

    @Override // pc3
    public final w59 j(int i, sxb sxbVar, int[] iArr) {
        nc3 nc3Var = (nc3) this.b;
        jm5 p = mm5.p();
        for (int i2 = 0; i2 < sxbVar.a; i2++) {
            p.c(new kc3(i, sxbVar, i2, nc3Var, iArr[i2]));
        }
        return p.f();
    }

    @Override // eja
    public final void k(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((s20) this.b).e;
        tp3 tp3Var = (tp3) dataAutoDownloadActivity.c.get(i);
        if (tp3Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 0;
        } else if (tp3Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 1;
        } else if (tp3Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i9 = dataAutoDownloadActivity.f;
        if (i9 == 0) {
            i8 = ((d) dataAutoDownloadActivity).currentAccount;
            up3.q(i8).Q = dataAutoDownloadActivity.e;
        } else if (i9 == 1) {
            i3 = ((d) dataAutoDownloadActivity).currentAccount;
            up3.q(i3).R = dataAutoDownloadActivity.e;
        } else {
            i2 = ((d) dataAutoDownloadActivity).currentAccount;
            up3.q(i2).S = dataAutoDownloadActivity.e;
        }
        i4 = ((d) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = na7.q1(i4).X3.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.e);
        edit.commit();
        i5 = ((d) dataAutoDownloadActivity).currentAccount;
        up3.q(i5).g();
        for (int i10 = 0; i10 < 4; i10++) {
            o39 o39Var = dataAutoDownloadActivity.b;
            i6 = dataAutoDownloadActivity.photosRow;
            s49 K = o39Var.K(i6 + i10);
            if (K != null) {
                s20 s20Var = dataAutoDownloadActivity.a;
                i7 = dataAutoDownloadActivity.photosRow;
                s20Var.t(K, i7 + i10);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // vt3
    public final void m() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.b;
        int i = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                ((t03) obj2).invoke(obj);
                break;
            case 6:
                ((u13) obj2).invoke(obj);
                break;
            case 7:
                ((u13) obj2).invoke(obj);
                break;
            case 8:
                ((u13) obj2).invoke(obj);
                break;
            default:
                ((k23) obj2).invoke(obj);
                break;
        }
    }

    @Override // d39
    public final boolean q(View view) {
        byte b = this.a;
        return false;
    }

    @Override // k8
    public final void r(KeyEvent keyEvent) {
        m8 m8Var = (m8) ((f9) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m8Var != null && m8Var.isShowing()) {
            m8Var.d(true);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return (Task) ((by2) this.b).call();
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 22:
                ((de2) obj).run();
                break;
            default:
                ((pt3) obj).a.d.q();
                break;
        }
    }

    public /* synthetic */ vu2(tj tjVar, Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ vu2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // eja
    public final void n() {
    }

    private final void a(View view, float f, float f2) {
    }

    private final void i(View view, float f, float f2) {
    }
}
