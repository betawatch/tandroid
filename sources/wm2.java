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
import java.io.Serializable;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.p;
import org.telegram.ui.ContactsWidgetConfigActivity;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wm2 implements m7, oac, gv3, ke3, lr2, Continuation, g59, OnSuccessListener, k8, gla, x76, fu2, ce3, xj4, h59, rh8, ee, ac7, io3, qq7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wm2(tk tkVar, ea6 ea6Var, ft6 ft6Var, IOException iOException, boolean z) {
        this.a = (byte) 19;
        this.b = ft6Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        wr3 wr3Var = (wr3) this.b;
        wr3Var.e = wzcVar;
        iq5 H0 = gm.H0(wzcVar, false);
        iq5 H02 = gm.H0(wzcVar, true);
        if (!wr3Var.f.equals(H0) || !wr3Var.h.equals(H02)) {
            gm.m = H0.b;
            gm.n = H0.d;
            wr3Var.f = H0;
            wr3Var.h = H02;
            wr3Var.requestLayout();
        }
        int childCount = wr3Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = wr3Var.getChildAt(i);
            if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                kfc.b(childAt, wzcVar);
            }
        }
        wr3Var.invalidate();
        return wzc.b;
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        String str;
        String str2;
        mx6 mx6Var;
        String str3;
        int i;
        int i2;
        int i3;
        Throwable th;
        ni4 ni4Var;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        r9a b;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
        int i4 = CrashlyticsRegistrar.d;
        long currentTimeMillis = System.currentTimeMillis();
        li4 li4Var = (li4) sm2Var.a(li4.class);
        ti4 ti4Var = (ti4) sm2Var.a(ti4.class);
        xs7 v = sm2Var.v(qz2.class);
        xs7 v2 = sm2Var.v(qk.class);
        xs7 v3 = sm2Var.v(fj4.class);
        ExecutorService executorService = (ExecutorService) sm2Var.i(crashlyticsRegistrar.a);
        ExecutorService executorService2 = (ExecutorService) sm2Var.i(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) sm2Var.i(crashlyticsRegistrar.c);
        li4Var.a();
        Context context = li4Var.a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
        mx6 mx6Var2 = new mx6(executorService, executorService2);
        jd4 jd4Var = new jd4();
        String str4 = ((ba0) cn8.a.b(context)).a;
        jd4Var.a = str4;
        File filesDir = context.getFilesDir();
        jd4Var.b = filesDir;
        if (str4.isEmpty()) {
            str = "FirebaseCrashlytics";
            str2 = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            str = "FirebaseCrashlytics";
            sb.append(str4.length() > 40 ? bo2.k(str4) : str4.replaceAll("[^a-zA-Z0-9.]", "_"));
            str2 = sb.toString();
        }
        File file = new File(filesDir, str2);
        jd4.c(file);
        jd4Var.c = file;
        File file2 = new File(file, "open-sessions");
        jd4.c(file2);
        jd4Var.d = file2;
        File file3 = new File(file, "reports");
        jd4.c(file3);
        jd4Var.e = file3;
        File file4 = new File(file, "priority-reports");
        jd4.c(file4);
        jd4Var.f = file4;
        File file5 = new File(file, "native-reports");
        jd4.c(file5);
        jd4Var.g = file5;
        i73 i73Var = new i73(li4Var);
        vl5 vl5Var = new vl5(context, packageName, ti4Var, i73Var);
        qz2 qz2Var = new qz2(v);
        sk skVar = new sk(v2);
        jz2 jz2Var = new jz2(i73Var, jd4Var);
        pj4 pj4Var = pj4.a;
        s8a s8aVar = s8a.a;
        pj4 pj4Var2 = pj4.a;
        nj4 a = pj4.a(s8aVar);
        if (a.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + s8aVar + " already registered.");
        } else {
            a.b = jz2Var;
            Log.d("FirebaseSessions", "Subscriber " + s8aVar + " registered.");
            a.a.countDown();
        }
        String str5 = str;
        zd1 zd1Var = new zd1(li4Var, vl5Var, qz2Var, i73Var, new rk(skVar), new rk(skVar), jd4Var, jz2Var, new et8((Object) v3, (byte) 4), mx6Var2);
        mx6 mx6Var3 = (mx6) zd1Var.n;
        li4Var.a();
        String str6 = li4Var.c.b;
        int e = bo2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e == 0) {
            e = bo2.e(context, "com.crashlytics.android.build_id", "string");
        }
        String string = e != 0 ? context.getResources().getString(e) : null;
        ArrayList arrayList = new ArrayList();
        int e2 = bo2.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int e3 = bo2.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int e4 = bo2.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (e2 == 0 || e3 == 0 || e4 == 0) {
            mx6Var = mx6Var3;
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
                    arrayList.add(new c21(stringArray[i6], stringArray2[i6], stringArray3[i6]));
                    i5 = i6 + 1;
                    str6 = str6;
                    mx6Var3 = mx6Var3;
                }
                mx6Var = mx6Var3;
                str3 = str6;
            } else {
                mx6Var = mx6Var3;
                str3 = str6;
                String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable(str5, 3)) {
                    Log.d(str5, format2, null);
                }
            }
            i3 = 3;
            th = null;
        }
        String h = b10.h("Mapping file ID is: ", string);
        if (Log.isLoggable(str5, i3)) {
            Log.d(str5, h, th);
        }
        int size = arrayList.size();
        int i7 = i;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            c21 c21Var = (c21) obj;
            String str7 = c21Var.a;
            String str8 = c21Var.b;
            String str9 = c21Var.c;
            int i8 = size;
            StringBuilder m = mlb.m("Build id for ", str7, " on ", str8, ": ");
            m.append(str9);
            String sb2 = m.toString();
            if (Log.isLoggable(str5, 3)) {
                Log.d(str5, sb2, null);
            }
            size = i8;
        }
        String str10 = str3;
        try {
            ds a2 = ds.a(context, vl5Var, str10, string, arrayList, new hi2(context));
            String str11 = "Installer package name is: " + a2.d;
            if (Log.isLoggable(str5, 2)) {
                Log.v(str5, str11, null);
            }
            fgf fgfVar = new fgf((byte) 20);
            String str12 = a2.f;
            String str13 = a2.g;
            String d = vl5Var.d();
            k1f k1fVar = new k1f((byte) 27);
            x59 x59Var = new x59(k1fVar, (byte) 11);
            ni6 ni6Var = new ni6(jd4Var);
            Locale locale = Locale.US;
            ld3 ld3Var = new ld3(kt6.o("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str10, "/settings"), fgfVar);
            String str14 = Build.MANUFACTURER;
            String str15 = vl5.h;
            String q = td4.q(str14.replaceAll(str15, ""), "/", Build.MODEL.replaceAll(str15, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str15, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str15, "");
            int e5 = bo2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e5 == 0) {
                e5 = bo2.e(context, "com.crashlytics.android.build_id", "string");
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
                arrayList2 = arrayList2;
            }
            String sb4 = sb3.toString();
            laa laaVar = new laa(str10, q, replaceAll, replaceAll2, vl5Var, sb4.length() > 0 ? bo2.k(sb4) : null, str13, str12, ts2.h(d != null ? 4 : i2));
            byte b2 = 27;
            ex8 ex8Var = new ex8(context, laaVar, k1fVar, x59Var, ni6Var, ld3Var, i73Var);
            AtomicReference atomicReference = (AtomicReference) ex8Var.h;
            AtomicReference atomicReference2 = ex8Var.a;
            if (!((Context) ex8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((laa) ex8Var.c).f) || (b = ex8Var.b(i2)) == null) {
                r9a b3 = ex8Var.b(3);
                if (b3 != null) {
                    atomicReference2.set(b3);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(b3);
                }
                i73 i73Var2 = (i73) ex8Var.g;
                Task task2 = i73Var2.h.getTask();
                synchronized (i73Var2.c) {
                    task = i73Var2.d.getTask();
                }
                onSuccessTask = rr5.c(task2, task).onSuccessTask((a13) mx6Var2.b, new wm4(ex8Var, mx6Var2, false, b2));
            } else {
                atomicReference2.set(b);
                ((TaskCompletionSource) atomicReference.get()).trySetResult(b);
                onSuccessTask = Tasks.forResult(null);
            }
            onSuccessTask.addOnFailureListener(executorService3, new h64((byte) 18));
            jd4 jd4Var2 = (jd4) zd1Var.h;
            Context context2 = (Context) zd1Var.a;
            boolean c = bo2.c(context2, "com.google.firebase.crashlytics.RequireBuildId", bo2.c(context2, "com.crashlytics.RequireBuildId", true));
            String str17 = a2.b;
            if (c) {
                if (TextUtils.isEmpty(str17)) {
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
                    dq9.m("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    return null;
                }
            } else if (Log.isLoggable(str5, 2)) {
                Log.v(str5, "Configured not to require a build ID.", null);
            }
            String str18 = new q61().a;
            try {
                byte b4 = 17;
                zd1Var.e = new lx6("crash_marker", jd4Var2, b4);
                zd1Var.d = new lx6("initialization_marker", jd4Var2, b4);
                mx6 mx6Var4 = mx6Var;
                jd4 jd4Var3 = new jd4(str18, jd4Var2, mx6Var4);
                hi2 hi2Var = new hi2(jd4Var2);
                mj4 mj4Var = new mj4(new qoa[]{new fgf((byte) 24)});
                ((xs7) ((et8) zd1Var.m).b).a(new i98((byte) 16));
                zd1Var.f = new nz2((Context) zd1Var.a, (vl5) zd1Var.g, (i73) zd1Var.b, (jd4) zd1Var.h, (lx6) zd1Var.e, a2, jd4Var3, hi2Var, p8a.d((Context) zd1Var.a, (vl5) zd1Var.g, (jd4) zd1Var.h, a2, hi2Var, jd4Var3, mj4Var, ex8Var, (mj4) zd1Var.c, (jz2) zd1Var.k, (mx6) zd1Var.n), (qz2) zd1Var.l, (rk) zd1Var.j, (jz2) zd1Var.k, (mx6) zd1Var.n);
                lx6 lx6Var = (lx6) zd1Var.d;
                boolean exists = new File((File) ((jd4) lx6Var.c).c, (String) lx6Var.b).exists();
                try {
                    Boolean.TRUE.equals((Boolean) ((a13) mx6Var4.b).a.submit(new ml(zd1Var, (byte) 1)).get(3L, TimeUnit.SECONDS));
                } catch (Exception unused) {
                }
                nz2 nz2Var = (nz2) zd1Var.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                ((a13) nz2Var.e.b).a(new mv2((Object) nz2Var, (Object) str18, (byte) 7));
                z03 z03Var = new z03(new nl9((Object) nz2Var, (byte) 22), ex8Var, defaultUncaughtExceptionHandler, nz2Var.j);
                nz2Var.n = z03Var;
                Thread.setDefaultUncaughtExceptionHandler(z03Var);
                if (Build.VERSION.SDK_INT >= 37) {
                    ((nz2) zd1Var.f).c(str18);
                }
                if (!exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str5, 3)) {
                        Log.d(str5, "Successfully configured exception handler.", null);
                    }
                    ((a13) mx6Var4.b).a(new oz2(zd1Var, ex8Var, (byte) 0));
                } else {
                    if (Log.isLoggable(str5, 3)) {
                        Log.d(str5, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                    }
                    zd1Var.b(ex8Var);
                }
            } catch (Exception e6) {
                Log.e(str5, "Crashlytics was not started due to an exception during initialization", e6);
                zd1Var.f = null;
            }
            ni4Var = new ni4(zd1Var);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e(str5, "Error retrieving app package info.", e7);
            ni4Var = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            String n = wi8.n(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
            if (Log.isLoggable(str5, 3)) {
                Log.d(str5, n, null);
            }
        }
        return ni4Var;
    }

    @Override // fu2
    public final void accept(Object obj) {
        ((fs3) obj).a((jk2) this.b);
    }

    @Override // ac7
    public final boolean b(TLRPC.TL_error tL_error) {
        ((n40) this.b).run();
        return true;
    }

    @Override // io3
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

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        c6c G;
        Object obj;
        long j;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                c23 c23Var = (c23) obj2;
                HashSet hashSet = c23Var.W1;
                if (!c23Var.X1 && (G = c23Var.Y1.G(i - 1)) != null && (obj = G.H) != null) {
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
                    if (view instanceof m1a) {
                        ((m1a) view).c(hashSet.contains(Long.valueOf(j)), true);
                        break;
                    }
                }
                break;
            default:
                ((DataAutoDownloadActivity) obj2).q0(f, i, view);
                break;
        }
    }

    @Override // ke3
    public final void f(nv8 nv8Var) {
        qz2 qz2Var = (qz2) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        qz2Var.b.set((qz2) nv8Var.get());
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
    @Override // h59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(int i, final View view) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TLRPC.Chat chat;
        String str;
        sn2 sn2Var;
        boolean z;
        boolean z2;
        bu5 bu5Var;
        final byte b;
        int i9;
        Drawable drawable;
        final aj3 aj3Var = (aj3) this.b;
        if (aj3Var.O == 0.0f && aj3Var.o0 == 0.0f) {
            final long j = ((hh3) view).F;
            nk3 nk3Var = aj3Var.P0;
            i2 = ((d) nk3Var).currentAccount;
            byte b2 = 1;
            hs6.d0(i2).O0(true);
            bu5 I = bu5.I(nk3Var, view);
            I.z.set(0, gm.L(8.0f), 0, 0);
            I.X(cmb.c0(gm.L(12.0f), gm.L(12.0f), nk3Var.getThemedColor(cmb.c6)));
            I.b0(0.0f, gm.L(8.0f));
            nk3Var.M0 = I;
            if (!m9c.C(j)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i3 = ((d) nk3Var).currentAccount;
                byte b3 = 2;
                byte b4 = 3;
                if (j != z8c.h(i3).e()) {
                    final TLRPC.User W1 = nk3Var.getMessagesController().W1(Long.valueOf(j));
                    TLRPC.Chat L0 = nk3Var.getMessagesController().L0(Long.valueOf(-j));
                    String p = lo7.p(j, 0L, false);
                    i4 = ((d) nk3Var).currentAccount;
                    boolean d0 = NotificationsCustomSettingsActivity.d0(i4, j);
                    i5 = ((d) nk3Var).currentAccount;
                    boolean H3 = oc7.r1(i5).H3();
                    i6 = ((d) nk3Var).currentAccount;
                    boolean p2 = z8c.h(i6).p();
                    i7 = ((d) nk3Var).currentAccount;
                    boolean K = oc7.r1(i7).N1().K(j);
                    i8 = ((d) nk3Var).currentAccount;
                    boolean G = oc7.r1(i8).N1().G(j);
                    if (H3 || j <= 0 || p2 || (drawable = aj3Var.getContext().getDrawable(R.drawable.msg_gallery_locked2)) == null) {
                        chat = L0;
                        str = p;
                        sn2Var = null;
                    } else {
                        Drawable drawable2 = aj3Var.getContext().getDrawable(R.drawable.msg_stealth_locked);
                        if (drawable2 != null) {
                            chat = L0;
                            anb.x(aj3Var, drawable2, cmb.E8, nk3Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                        } else {
                            chat = L0;
                        }
                        str = p;
                        drawable.setColorFilter(new PorterDuffColorFilter(on2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        sn2Var = new sn2(drawable2, drawable);
                    }
                    if (j < 0 && nk3Var.v3().i(j)) {
                        final byte b5 = 4;
                        nk3Var.M0.a(R.drawable.msg_stories_add, null, jb6.M0(2131754381, null), cmb.E8, cmb.D8, new Runnable() { // from class: wi3
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i10;
                                byte b6 = b5;
                                long j2 = j;
                                aj3 aj3Var2 = aj3Var;
                                switch (b6) {
                                    case 0:
                                        aj3Var2.P0.presentFragment(yv1.ga(j2));
                                        break;
                                    case 1:
                                        gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                        break;
                                    case 2:
                                        gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                        break;
                                    case 3:
                                        nk3 nk3Var2 = aj3Var2.P0;
                                        i10 = ((d) nk3Var2).currentAccount;
                                        hs6.d0(i10).Q1(j2);
                                        nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                        break;
                                    case 4:
                                        aj3Var2.P0.F0.j(j2);
                                        break;
                                    case 5:
                                        aj3Var2.P0.presentFragment(yv1.ga(j2));
                                        break;
                                    default:
                                        aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                        break;
                                }
                            }
                        });
                    }
                    if (W1 != null && !W1.contact) {
                        i9 = ((d) nk3Var).currentAccount;
                        if (hs6.d0(i9).I(j)) {
                            z = true;
                            bu5 bu5Var2 = nk3Var.M0;
                            final byte b6 = 5;
                            bu5Var2.k(R.drawable.msg_discussion, jb6.M0(2131745335, null), new Runnable() { // from class: wi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b6;
                                    long j2 = j;
                                    aj3 aj3Var2 = aj3Var;
                                    switch (b62) {
                                        case 0:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        case 1:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            nk3 nk3Var2 = aj3Var2.P0;
                                            i10 = ((d) nk3Var2).currentAccount;
                                            hs6.d0(i10).Q1(j2);
                                            nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            aj3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        default:
                                            aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                            break;
                                    }
                                }
                            }, j <= 0);
                            final byte b7 = 6;
                            bu5Var2.k(R.drawable.msg_openprofile, jb6.M0(2131747519, null), new Runnable() { // from class: wi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b7;
                                    long j2 = j;
                                    aj3 aj3Var2 = aj3Var;
                                    switch (b62) {
                                        case 0:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        case 1:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            nk3 nk3Var2 = aj3Var2.P0;
                                            i10 = ((d) nk3Var2).currentAccount;
                                            hs6.d0(i10).Q1(j2);
                                            nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            aj3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        default:
                                            aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                            break;
                                    }
                                }
                            }, j <= 0);
                            final byte b8 = 0;
                            bu5Var2.k(R.drawable.msg_channel, jb6.M0(!sd2.V(chat) ? 2131747544 : 2131747532, null), new Runnable() { // from class: wi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b8;
                                    long j2 = j;
                                    aj3 aj3Var2 = aj3Var;
                                    switch (b62) {
                                        case 0:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        case 1:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            nk3 nk3Var2 = aj3Var2.P0;
                                            i10 = ((d) nk3Var2).currentAccount;
                                            hs6.d0(i10).Q1(j2);
                                            nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            aj3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        default:
                                            aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                            break;
                                    }
                                }
                            }, j >= 0);
                            final byte b9 = 0;
                            final String str2 = str;
                            bu5Var2.k(R.drawable.msg_mute, jb6.M0(2131747596, null), new Runnable() { // from class: xi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    String trim;
                                    int i11;
                                    byte b10 = b9;
                                    TLRPC.User user = W1;
                                    String str3 = str2;
                                    aj3 aj3Var2 = aj3Var;
                                    switch (b10) {
                                        case 0:
                                            nk3 nk3Var2 = aj3Var2.P0;
                                            i10 = ((d) nk3Var2).currentAccount;
                                            oc7.r1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                            nk3Var2.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            c41.b0(nk3Var2).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryMutedHint", null, 2131747595, trim)), null, null).j();
                                            break;
                                        default:
                                            nk3 nk3Var3 = aj3Var2.P0;
                                            i11 = ((d) nk3Var3).currentAccount;
                                            oc7.r1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                            nk3Var3.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            c41.b0(nk3Var3).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryUnmutedHint", null, 2131747592, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !d0 && j > 0);
                            bu5Var2.F();
                            final byte b10 = 1;
                            bu5Var2.k(R.drawable.msg_unmute, jb6.M0(2131747593, null), new Runnable() { // from class: xi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    String trim;
                                    int i11;
                                    byte b102 = b10;
                                    TLRPC.User user = W1;
                                    String str3 = str2;
                                    aj3 aj3Var2 = aj3Var;
                                    switch (b102) {
                                        case 0:
                                            nk3 nk3Var2 = aj3Var2.P0;
                                            i10 = ((d) nk3Var2).currentAccount;
                                            oc7.r1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                            nk3Var2.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            c41.b0(nk3Var2).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryMutedHint", null, 2131747595, trim)), null, null).j();
                                            break;
                                        default:
                                            nk3 nk3Var3 = aj3Var2.P0;
                                            i11 = ((d) nk3Var3).currentAccount;
                                            oc7.r1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                            nk3Var3.getNotificationsController().c0(j, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            c41.b0(nk3Var3).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryUnmutedHint", null, 2131747592, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, d0 && j > 0);
                            bu5Var2.F();
                            final byte b11 = 0;
                            bu5Var2.k(R.drawable.msg_stories_stealth2, jb6.M0(2131743246, null), new Runnable() { // from class: yi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ylb ylbVar;
                                    int i10;
                                    ylb ylbVar2;
                                    byte b12 = b11;
                                    byte b13 = 0;
                                    View view2 = view;
                                    aj3 aj3Var2 = aj3Var;
                                    byte b14 = 1;
                                    switch (b12) {
                                        case 0:
                                            nk3 nk3Var2 = aj3Var2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = oc7.r1(z8c.t0).N1().B;
                                            if (tL_storiesStealthMode != null) {
                                                i10 = ((d) nk3Var2).currentAccount;
                                                if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof hh3) {
                                                        nk3Var2.F0.i((hh3) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = aj3Var2.getContext();
                                            ylbVar = ((d) nk3Var2).resourceProvider;
                                            h0b h0bVar = new h0b(context, 0.0f, 1, ylbVar);
                                            h0bVar.o1 = new zi3(aj3Var2, view2, b14);
                                            nk3Var2.showDialog(h0bVar);
                                            break;
                                        default:
                                            Context context2 = aj3Var2.getContext();
                                            nk3 nk3Var3 = aj3Var2.P0;
                                            ylbVar2 = ((d) nk3Var3).resourceProvider;
                                            h0b h0bVar2 = new h0b(context2, 0.0f, 1, ylbVar2);
                                            h0bVar2.o1 = new zi3(aj3Var2, view2, b13);
                                            nk3Var3.showDialog(h0bVar2);
                                            break;
                                    }
                                }
                            }, H3 && j > 0 && p2 && K && !G);
                            bu5Var2.F();
                            z2 = H3 && j > 0 && !p2 && K && !G;
                            String M0 = jb6.M0(2131743246, null);
                            final byte b12 = 1;
                            Runnable runnable = new Runnable() { // from class: yi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ylb ylbVar;
                                    int i10;
                                    ylb ylbVar2;
                                    byte b122 = b12;
                                    byte b13 = 0;
                                    View view2 = view;
                                    aj3 aj3Var2 = aj3Var;
                                    byte b14 = 1;
                                    switch (b122) {
                                        case 0:
                                            nk3 nk3Var2 = aj3Var2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = oc7.r1(z8c.t0).N1().B;
                                            if (tL_storiesStealthMode != null) {
                                                i10 = ((d) nk3Var2).currentAccount;
                                                if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof hh3) {
                                                        nk3Var2.F0.i((hh3) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = aj3Var2.getContext();
                                            ylbVar = ((d) nk3Var2).resourceProvider;
                                            h0b h0bVar = new h0b(context, 0.0f, 1, ylbVar);
                                            h0bVar.o1 = new zi3(aj3Var2, view2, b14);
                                            nk3Var2.showDialog(h0bVar);
                                            break;
                                        default:
                                            Context context2 = aj3Var2.getContext();
                                            nk3 nk3Var3 = aj3Var2.P0;
                                            ylbVar2 = ((d) nk3Var3).resourceProvider;
                                            h0b h0bVar2 = new h0b(context2, 0.0f, 1, ylbVar2);
                                            h0bVar2.o1 = new zi3(aj3Var2, view2, b13);
                                            nk3Var3.showDialog(h0bVar2);
                                            break;
                                    }
                                }
                            };
                            if (z2) {
                                bu5Var = bu5Var2;
                            } else {
                                bu5Var2.a(R.drawable.msg_stories_stealth2, sn2Var, M0, cmb.E8, cmb.D8, runnable);
                                bu5Var = bu5Var2;
                            }
                            bu5Var.F();
                            boolean z3 = z && !nk3Var.F3();
                            String M02 = jb6.M0(2131754118, null);
                            final char c = 1 == true ? 1 : 0;
                            bu5Var.k(R.drawable.msg_archive, M02, new Runnable() { // from class: wi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = c;
                                    long j2 = j;
                                    aj3 aj3Var2 = aj3Var;
                                    switch (b62) {
                                        case 0:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        case 1:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            nk3 nk3Var2 = aj3Var2.P0;
                                            i10 = ((d) nk3Var2).currentAccount;
                                            hs6.d0(i10).Q1(j2);
                                            nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            aj3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        default:
                                            aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                            break;
                                    }
                                }
                            }, z3);
                            bu5Var.F();
                            final byte b13 = 2;
                            bu5Var.k(R.drawable.msg_unarchive, jb6.M0(2131743601, null), new Runnable() { // from class: wi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b13;
                                    long j2 = j;
                                    aj3 aj3Var2 = aj3Var;
                                    switch (b62) {
                                        case 0:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        case 1:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            nk3 nk3Var2 = aj3Var2.P0;
                                            i10 = ((d) nk3Var2).currentAccount;
                                            hs6.d0(i10).Q1(j2);
                                            nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            aj3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        default:
                                            aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                            break;
                                    }
                                }
                            }, z && nk3Var.F3());
                            bu5Var.F();
                            b = 3;
                            bu5Var.k(R.drawable.msg_delete, jb6.M0(2131744437, null), new Runnable() { // from class: wi3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10;
                                    byte b62 = b;
                                    long j2 = j;
                                    aj3 aj3Var2 = aj3Var;
                                    switch (b62) {
                                        case 0:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        case 1:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                            break;
                                        case 2:
                                            gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                            break;
                                        case 3:
                                            nk3 nk3Var2 = aj3Var2.P0;
                                            i10 = ((d) nk3Var2).currentAccount;
                                            hs6.d0(i10).Q1(j2);
                                            nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                            break;
                                        case 4:
                                            aj3Var2.P0.F0.j(j2);
                                            break;
                                        case 5:
                                            aj3Var2.P0.presentFragment(yv1.ga(j2));
                                            break;
                                        default:
                                            aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                            break;
                                    }
                                }
                            }, z);
                        }
                    }
                    z = false;
                    bu5 bu5Var22 = nk3Var.M0;
                    final byte b62 = 5;
                    bu5Var22.k(R.drawable.msg_discussion, jb6.M0(2131745335, null), new Runnable() { // from class: wi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b62;
                            long j2 = j;
                            aj3 aj3Var2 = aj3Var;
                            switch (b622) {
                                case 0:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                case 1:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    nk3 nk3Var2 = aj3Var2.P0;
                                    i10 = ((d) nk3Var2).currentAccount;
                                    hs6.d0(i10).Q1(j2);
                                    nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                    break;
                                case 4:
                                    aj3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                default:
                                    aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                    break;
                            }
                        }
                    }, j <= 0);
                    final byte b72 = 6;
                    bu5Var22.k(R.drawable.msg_openprofile, jb6.M0(2131747519, null), new Runnable() { // from class: wi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b72;
                            long j2 = j;
                            aj3 aj3Var2 = aj3Var;
                            switch (b622) {
                                case 0:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                case 1:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    nk3 nk3Var2 = aj3Var2.P0;
                                    i10 = ((d) nk3Var2).currentAccount;
                                    hs6.d0(i10).Q1(j2);
                                    nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                    break;
                                case 4:
                                    aj3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                default:
                                    aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                    break;
                            }
                        }
                    }, j <= 0);
                    final byte b82 = 0;
                    bu5Var22.k(R.drawable.msg_channel, jb6.M0(!sd2.V(chat) ? 2131747544 : 2131747532, null), new Runnable() { // from class: wi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b82;
                            long j2 = j;
                            aj3 aj3Var2 = aj3Var;
                            switch (b622) {
                                case 0:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                case 1:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    nk3 nk3Var2 = aj3Var2.P0;
                                    i10 = ((d) nk3Var2).currentAccount;
                                    hs6.d0(i10).Q1(j2);
                                    nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                    break;
                                case 4:
                                    aj3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                default:
                                    aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                    break;
                            }
                        }
                    }, j >= 0);
                    final byte b92 = 0;
                    final String str22 = str;
                    bu5Var22.k(R.drawable.msg_mute, jb6.M0(2131747596, null), new Runnable() { // from class: xi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            String trim;
                            int i11;
                            byte b102 = b92;
                            TLRPC.User user = W1;
                            String str3 = str22;
                            aj3 aj3Var2 = aj3Var;
                            switch (b102) {
                                case 0:
                                    nk3 nk3Var2 = aj3Var2.P0;
                                    i10 = ((d) nk3Var2).currentAccount;
                                    oc7.r1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                    nk3Var2.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    c41.b0(nk3Var2).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryMutedHint", null, 2131747595, trim)), null, null).j();
                                    break;
                                default:
                                    nk3 nk3Var3 = aj3Var2.P0;
                                    i11 = ((d) nk3Var3).currentAccount;
                                    oc7.r1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                    nk3Var3.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    c41.b0(nk3Var3).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryUnmutedHint", null, 2131747592, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, !d0 && j > 0);
                    bu5Var22.F();
                    final byte b102 = 1;
                    bu5Var22.k(R.drawable.msg_unmute, jb6.M0(2131747593, null), new Runnable() { // from class: xi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            String trim;
                            int i11;
                            byte b1022 = b102;
                            TLRPC.User user = W1;
                            String str3 = str22;
                            aj3 aj3Var2 = aj3Var;
                            switch (b1022) {
                                case 0:
                                    nk3 nk3Var2 = aj3Var2.P0;
                                    i10 = ((d) nk3Var2).currentAccount;
                                    oc7.r1(i10).W3.edit().putBoolean("stories_" + str3, false).apply();
                                    nk3Var2.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    c41.b0(nk3Var2).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryMutedHint", null, 2131747595, trim)), null, null).j();
                                    break;
                                default:
                                    nk3 nk3Var3 = aj3Var2.P0;
                                    i11 = ((d) nk3Var3).currentAccount;
                                    oc7.r1(i11).W3.edit().putBoolean("stories_" + str3, true).apply();
                                    nk3Var3.getNotificationsController().c0(j, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    c41.b0(nk3Var3).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryUnmutedHint", null, 2131747592, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, d0 && j > 0);
                    bu5Var22.F();
                    final byte b112 = 0;
                    bu5Var22.k(R.drawable.msg_stories_stealth2, jb6.M0(2131743246, null), new Runnable() { // from class: yi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ylb ylbVar;
                            int i10;
                            ylb ylbVar2;
                            byte b122 = b112;
                            byte b132 = 0;
                            View view2 = view;
                            aj3 aj3Var2 = aj3Var;
                            byte b14 = 1;
                            switch (b122) {
                                case 0:
                                    nk3 nk3Var2 = aj3Var2.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = oc7.r1(z8c.t0).N1().B;
                                    if (tL_storiesStealthMode != null) {
                                        i10 = ((d) nk3Var2).currentAccount;
                                        if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof hh3) {
                                                nk3Var2.F0.i((hh3) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = aj3Var2.getContext();
                                    ylbVar = ((d) nk3Var2).resourceProvider;
                                    h0b h0bVar = new h0b(context, 0.0f, 1, ylbVar);
                                    h0bVar.o1 = new zi3(aj3Var2, view2, b14);
                                    nk3Var2.showDialog(h0bVar);
                                    break;
                                default:
                                    Context context2 = aj3Var2.getContext();
                                    nk3 nk3Var3 = aj3Var2.P0;
                                    ylbVar2 = ((d) nk3Var3).resourceProvider;
                                    h0b h0bVar2 = new h0b(context2, 0.0f, 1, ylbVar2);
                                    h0bVar2.o1 = new zi3(aj3Var2, view2, b132);
                                    nk3Var3.showDialog(h0bVar2);
                                    break;
                            }
                        }
                    }, H3 && j > 0 && p2 && K && !G);
                    bu5Var22.F();
                    if (H3) {
                    }
                    String M03 = jb6.M0(2131743246, null);
                    final byte b122 = 1;
                    Runnable runnable2 = new Runnable() { // from class: yi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ylb ylbVar;
                            int i10;
                            ylb ylbVar2;
                            byte b1222 = b122;
                            byte b132 = 0;
                            View view2 = view;
                            aj3 aj3Var2 = aj3Var;
                            byte b14 = 1;
                            switch (b1222) {
                                case 0:
                                    nk3 nk3Var2 = aj3Var2.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = oc7.r1(z8c.t0).N1().B;
                                    if (tL_storiesStealthMode != null) {
                                        i10 = ((d) nk3Var2).currentAccount;
                                        if (ConnectionsManager.getInstance(i10).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof hh3) {
                                                nk3Var2.F0.i((hh3) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = aj3Var2.getContext();
                                    ylbVar = ((d) nk3Var2).resourceProvider;
                                    h0b h0bVar = new h0b(context, 0.0f, 1, ylbVar);
                                    h0bVar.o1 = new zi3(aj3Var2, view2, b14);
                                    nk3Var2.showDialog(h0bVar);
                                    break;
                                default:
                                    Context context2 = aj3Var2.getContext();
                                    nk3 nk3Var3 = aj3Var2.P0;
                                    ylbVar2 = ((d) nk3Var3).resourceProvider;
                                    h0b h0bVar2 = new h0b(context2, 0.0f, 1, ylbVar2);
                                    h0bVar2.o1 = new zi3(aj3Var2, view2, b132);
                                    nk3Var3.showDialog(h0bVar2);
                                    break;
                            }
                        }
                    };
                    if (z2) {
                    }
                    bu5Var.F();
                    if (z) {
                    }
                    String M022 = jb6.M0(2131754118, null);
                    final byte c2 = 1 == true ? 1 : 0;
                    bu5Var.k(R.drawable.msg_archive, M022, new Runnable() { // from class: wi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = c2;
                            long j2 = j;
                            aj3 aj3Var2 = aj3Var;
                            switch (b622) {
                                case 0:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                case 1:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    nk3 nk3Var2 = aj3Var2.P0;
                                    i10 = ((d) nk3Var2).currentAccount;
                                    hs6.d0(i10).Q1(j2);
                                    nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                    break;
                                case 4:
                                    aj3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                default:
                                    aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                    break;
                            }
                        }
                    }, z3);
                    bu5Var.F();
                    final byte b132 = 2;
                    bu5Var.k(R.drawable.msg_unarchive, jb6.M0(2131743601, null), new Runnable() { // from class: wi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b132;
                            long j2 = j;
                            aj3 aj3Var2 = aj3Var;
                            switch (b622) {
                                case 0:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                case 1:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    nk3 nk3Var2 = aj3Var2.P0;
                                    i10 = ((d) nk3Var2).currentAccount;
                                    hs6.d0(i10).Q1(j2);
                                    nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                    break;
                                case 4:
                                    aj3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                default:
                                    aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                    break;
                            }
                        }
                    }, z && nk3Var.F3());
                    bu5Var.F();
                    b = 3;
                    bu5Var.k(R.drawable.msg_delete, jb6.M0(2131744437, null), new Runnable() { // from class: wi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10;
                            byte b622 = b;
                            long j2 = j;
                            aj3 aj3Var2 = aj3Var;
                            switch (b622) {
                                case 0:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                case 1:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r8.F3(), (byte) 0), 200L);
                                    break;
                                case 2:
                                    gm.d3(new yh3(aj3Var2.P0, j, !r7.F3(), (byte) 0), 200L);
                                    break;
                                case 3:
                                    nk3 nk3Var2 = aj3Var2.P0;
                                    i10 = ((d) nk3Var2).currentAccount;
                                    hs6.d0(i10).Q1(j2);
                                    nk3Var2.getMessagesController().N1().l0(j2, true, false);
                                    break;
                                case 4:
                                    aj3Var2.P0.F0.j(j2);
                                    break;
                                case 5:
                                    aj3Var2.P0.presentFragment(yv1.ga(j2));
                                    break;
                                default:
                                    aj3Var2.P0.presentFragment(ProfileActivity.S2(j2));
                                    break;
                            }
                        }
                    }, z);
                } else if (nk3Var.R3) {
                    bu5 bu5Var3 = nk3Var.M0;
                    String M04 = jb6.M0(2131754381, null);
                    int i10 = cmb.E8;
                    int i11 = cmb.D8;
                    bu5Var3.a(R.drawable.msg_stories_add, null, M04, i10, i11, new zg3(aj3Var, b2));
                    nk3Var.M0.a(R.drawable.msg_stories_archive, null, jb6.M0(2131754088, null), i10, i11, new zg3(aj3Var, b3));
                    nk3Var.M0.a(R.drawable.msg_stories_saved, null, jb6.M0(2131745619, null), i10, i11, new zg3(aj3Var, b4));
                    b = 3;
                } else {
                    aj3 aj3Var2 = nk3Var.F0;
                    if (aj3Var2 != null) {
                        aj3Var2.n();
                    }
                }
                bu5 bu5Var4 = nk3Var.M0;
                bu5Var4.i = b;
                bu5Var4.b0(gm.L(-8.0f), gm.L(-10.0f));
                bu5Var4.a0();
                return false;
            }
            xx0.E.a();
        }
        return false;
    }

    @Override // m7
    public final void h(int i) {
        an2 an2Var = ((p) this.b).a;
        if (i == 1 || i == 2) {
            an2Var.a(i == 2);
        } else if (i == 3) {
            an2Var.b();
        }
    }

    @Override // gla
    public final void i(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((s30) this.b).e;
        dr3 dr3Var = (dr3) dataAutoDownloadActivity.c.get(i);
        if (dr3Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 0;
        } else if (dr3Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 1;
        } else if (dr3Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i9 = dataAutoDownloadActivity.f;
        if (i9 == 0) {
            i8 = ((d) dataAutoDownloadActivity).currentAccount;
            er3.q(i8).Q = dataAutoDownloadActivity.e;
        } else if (i9 == 1) {
            i3 = ((d) dataAutoDownloadActivity).currentAccount;
            er3.q(i3).R = dataAutoDownloadActivity.e;
        } else {
            i2 = ((d) dataAutoDownloadActivity).currentAccount;
            er3.q(i2).S = dataAutoDownloadActivity.e;
        }
        i4 = ((d) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = oc7.r1(i4).X3.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.e);
        edit.commit();
        i5 = ((d) dataAutoDownloadActivity).currentAccount;
        er3.q(i5).g();
        for (int i10 = 0; i10 < 4; i10++) {
            r59 r59Var = dataAutoDownloadActivity.b;
            i6 = dataAutoDownloadActivity.photosRow;
            u69 K = r59Var.K(i6 + i10);
            if (K != null) {
                s30 s30Var = dataAutoDownloadActivity.a;
                i7 = dataAutoDownloadActivity.photosRow;
                s30Var.t(K, i7 + i10);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override // x76
    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 16:
                ((uk) obj).s((u64) obj2);
                break;
            case 17:
                ((uk) obj).onSeekStarted((tk) obj2);
                break;
            case 18:
                ((uk) obj).j((ia3) obj2);
                break;
            default:
                ((uk) obj).i((ft6) obj2);
                break;
        }
    }

    @Override // xj4
    public final void j(float f) {
        cdc cdcVar = ((xcc) this.b).b;
        if (cdcVar.f == f) {
            return;
        }
        cdcVar.f = f;
        cdcVar.c(false);
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        tu2 tu2Var = (tu2) this.b;
        View view = (View) obj2;
        int i = ((c6c) obj).d;
        if (i != 1) {
            if (i == 2) {
                boolean z = !tu2Var.Y;
                tu2Var.Y = z;
                ((bjb) view).setChecked(z);
                return;
            }
            return;
        }
        TLRPC.User W1 = tu2Var.getMessagesController().W1(Long.valueOf(tu2Var.I));
        if (W1 == null || tu2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, tu2Var.r, tu2Var.getParentActivity());
        String M0 = jb6.M0(2131751489, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131754068, null);
        alertDialog$Builder.j(jb6.M0(2131751535, null), new x92((Object) tu2Var, (Object) W1, (byte) 9));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    @Override // gv3
    public final void l() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.b;
        int i = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override // ce3
    public final y79 n(int i, uzb uzbVar, int[] iArr) {
        ae3 ae3Var = (ae3) this.b;
        jo5 p = mo5.p();
        for (int i2 = 0; i2 < uzbVar.a; i2++) {
            p.c(new xd3(i, uzbVar, i2, ae3Var, iArr[i2]));
        }
        return p.f();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                ((f23) obj2).invoke(obj);
                break;
            case 9:
                ((f33) obj2).invoke(obj);
                break;
            case 10:
                ((f33) obj2).invoke(obj);
                break;
            case 11:
                ((f33) obj2).invoke(obj);
                break;
            default:
                ((v33) obj2).invoke(obj);
                break;
        }
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        m8 m8Var = (m8) ((f9) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m8Var != null && m8Var.isShowing()) {
            m8Var.d(true);
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        ((of2) this.b).run();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return (Task) ((lz2) this.b).call();
    }

    @Override // g59
    public final boolean u(View view) {
        byte b = this.a;
        return false;
    }

    public /* synthetic */ wm2(tk tkVar, Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ wm2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // gla
    public final void m() {
    }

    private final void a(View view, float f, float f2) {
    }

    private final void e(View view, float f, float f2) {
    }
}
