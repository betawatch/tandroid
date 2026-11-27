// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zhc implements nr7, reb, s84, s99, ydd, m34, OnCompleteListener, und, q9d, Continuation {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public zhc(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.c = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            case 9:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = new ey7();
                this.c = new kzc();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c(Object obj, Object obj2) {
        boolean z;
        vla vlaVar;
        uqd uqdVar;
        vla vlaVar2;
        a94 a94Var;
        rx rxVar = (rx) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        hsd hsdVar = (hsd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        hsdVar.getClass();
        a86 j = rxVar.j();
        y76 y76Var = j.b;
        y76Var.getClass();
        ore oreVar = hsdVar.B;
        a94[] a94VarArr = oreVar == null ? null : oreVar.b;
        if (a94VarArr != null) {
            int length = a94VarArr.length;
            ?? r11 = 0;
            while (true) {
                if (r11 >= length) {
                    a94Var = null;
                    break;
                }
                a94Var = a94VarArr[r11];
                if ("location_updates_with_callback".equals(a94Var.a)) {
                    break;
                } else {
                    r11++;
                }
            }
            if (a94Var != null && a94Var.b() >= 1) {
                z = true;
                vlaVar = hsdVar.G;
                synchronized (vlaVar) {
                    try {
                        try {
                            uqd uqdVar2 = (uqd) hsdVar.G.get(y76Var);
                            if (uqdVar2 == null || z) {
                                uqdVar = new uqd(rxVar);
                                hsdVar.G.put(y76Var, uqdVar);
                            } else {
                                uqdVar2.U(j);
                                uqdVar = uqdVar2;
                                uqdVar2 = null;
                            }
                            int identityHashCode = System.identityHashCode(y76Var.a);
                            String str = y76Var.b;
                            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(identityHashCode).length());
                            sb.append(str);
                            sb.append("@");
                            sb.append(identityHashCode);
                            String sb2 = sb.toString();
                            if (z) {
                                q7f q7fVar = (q7f) hsdVar.k();
                                if (uqdVar2 == null) {
                                    uqdVar2 = null;
                                }
                                sod sodVar = new sod(null, taskCompletionSource);
                                Parcel R = q7fVar.R();
                                int i = ild.a;
                                R.writeInt(1);
                                int r = bye.r(R, 20293);
                                bye.q(R, 1, 4);
                                R.writeInt(2);
                                bye.f(R, 2, uqdVar2);
                                bye.f(R, 3, uqdVar);
                                bye.l(R, 6, sb2);
                                bye.s(R, r);
                                R.writeInt(1);
                                locationRequest.writeToParcel(R, 0);
                                ild.c(R, sodVar);
                                q7fVar.V(R, 88);
                                vlaVar2 = vlaVar;
                            } else {
                                q7f q7fVar2 = (q7f) hsdVar.k();
                                int i2 = locationRequest.a;
                                vlaVar2 = vlaVar;
                                long j2 = locationRequest.b;
                                long j3 = locationRequest.c;
                                long j4 = locationRequest.d;
                                long j5 = locationRequest.e;
                                int i3 = locationRequest.f;
                                float f = locationRequest.h;
                                boolean z2 = locationRequest.n;
                                long j6 = locationRequest.r;
                                int i4 = locationRequest.s;
                                int i5 = locationRequest.w;
                                String str2 = locationRequest.x;
                                boolean z3 = locationRequest.y;
                                WorkSource workSource = locationRequest.E;
                                srd srdVar = locationRequest.F;
                                String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                                if (j3 == -1) {
                                    j3 = j2;
                                } else if (i2 != 105) {
                                    j3 = Math.min(j3, j2);
                                }
                                zsd zsdVar = new zsd(new LocationRequest(i2, j2, j3, Math.max(j4, j2), Long.MAX_VALUE, j5, i3, f, z2, j6 == -1 ? j2 : j6, i4, i5, str3, z3, new WorkSource(workSource), srdVar), null, false, false, null, false, false, null, Long.MAX_VALUE);
                                npd npdVar = new npd(taskCompletionSource, uqdVar);
                                int i6 = uqd.c;
                                IInterface queryLocalInterface = uqdVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                                IInterface bcfVar = queryLocalInterface instanceof rff ? (rff) queryLocalInterface : new bcf(uqdVar, "com.google.android.gms.location.ILocationCallback", (byte) 5);
                                IInterface queryLocalInterface2 = npdVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                                IInterface nmeVar = queryLocalInterface2 instanceof xwe ? (xwe) queryLocalInterface2 : new nme(npdVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 5);
                                Parcel R2 = q7fVar2.R();
                                int i7 = ild.a;
                                R2.writeInt(1);
                                int r2 = bye.r(R2, 20293);
                                bye.q(R2, 1, 4);
                                R2.writeInt(1);
                                bye.k(R2, 2, zsdVar, 0);
                                bye.f(R2, 5, bcfVar.asBinder());
                                bye.f(R2, 6, nmeVar.asBinder());
                                bye.l(R2, 8, sb2);
                                bye.s(R2, r2);
                                q7fVar2.V(R2, 59);
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = vlaVar;
                        throw th;
                    }
                }
            }
        }
        z = false;
        vlaVar = hsdVar.G;
        synchronized (vlaVar) {
        }
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        fic ficVar = (fic) this.c;
        l2d i = ihc.i(view, l2dVar);
        if (i.a.n()) {
            return i;
        }
        Rect rect = (Rect) this.b;
        rect.left = i.b();
        rect.top = i.d();
        rect.right = i.c();
        rect.bottom = i.a();
        int childCount = ficVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            l2d b = ihc.b(ficVar.getChildAt(i2), i);
            rect.left = Math.min(b.b(), rect.left);
            rect.top = Math.min(b.d(), rect.top);
            rect.right = Math.min(b.c(), rect.right);
            rect.bottom = Math.min(b.a(), rect.bottom);
        }
        return i.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // m34
    public final /* bridge */ /* synthetic */ m34 a(Class cls, zq7 zq7Var) {
        ((HashMap) this.b).put(cls, zq7Var);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s99
    public final void accept(Object obj, Object obj2) {
        Object[] objArr = 0;
        switch (this.a) {
            case 6:
                q7d q7dVar = new q7d((qa4) this.b, (TaskCompletionSource) obj2, objArr == true ? 1 : 0);
                h7d h7dVar = (h7d) ((e8d) obj).k();
                fo foVar = (fo) this.c;
                Parcel c = h7dVar.c();
                v6d.c(c, q7dVar);
                v6d.b(c, foVar);
                h7dVar.d(c, 1);
                return;
            case 10:
                c(obj, obj2);
                return;
            default:
                rjd rjdVar = (rjd) this.b;
                String str = (String) this.c;
                bmf bmfVar = (bmf) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                xve.j("Not connected to device", rjdVar.G == 2);
                qbd qbdVar = (qbd) bmfVar.k();
                Parcel R = qbdVar.R();
                R.writeString(str);
                qbdVar.W(R, 5);
                synchronized (rjdVar.t) {
                    if (rjdVar.q != null) {
                        taskCompletionSource.setException(sqd.a(new Status(2001, null, null, null)));
                        return;
                    } else {
                        rjdVar.q = taskCompletionSource;
                        return;
                    }
                }
        }
    }

    @Override // q9d
    public final void b(Bitmap bitmap) {
        k7b k7bVar = (k7b) this.b;
        k7bVar.c = bitmap;
        t9f t9fVar = (t9f) this.c;
        t9fVar.l = k7bVar;
        t9fVar.b();
    }

    @Override // ydd
    public final void b0(String str, long j, int i, kdd kddVar, long j2, long j3) {
        ((rdd) this.c).g = null;
        ydd yddVar = (ydd) this.b;
        if (yddVar != null) {
            yddVar.b0(str, j, i, kddVar, j2, j3);
        }
    }

    public final synchronized void d(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.c) == null) {
                if (((Context) this.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    efd.f("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
                if (powerManager == null) {
                    efd.f("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public final int e(Context context, d05 d05Var) {
        xve.h(context);
        xve.h(d05Var);
        int i = 0;
        if (!d05Var.v()) {
            return 0;
        }
        int i2 = d05Var.i();
        int f = f(i2);
        if (f != -1) {
            return f;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            int i3 = 0;
            while (true) {
                if (i3 >= sparseIntArray.size()) {
                    i = -1;
                    break;
                }
                int keyAt = sparseIntArray.keyAt(i3);
                if (keyAt > i2 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i3++;
            }
            if (i == -1) {
                i = ((j05) this.c).c(context, i2);
            }
            sparseIntArray.put(i2, i);
        }
        return i;
    }

    public final int f(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    public final void g(Status status, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.b;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.c;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ao(status));
            }
        }
    }

    public final void h(wle wleVar) {
        try {
            q(wleVar, (cqe) this.b);
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void i(wle wleVar, int i, long j) {
        try {
            rpe rpeVar = (rpe) ((cqe) this.b).g();
            rpeVar.b();
            cqe.p((cqe) rpeVar.b, i);
            cqe cqeVar = (cqe) rpeVar.a();
            this.b = cqeVar;
            if (j != 0) {
                rpe rpeVar2 = (rpe) cqeVar.g();
                rpeVar2.b();
                cqe.r((cqe) rpeVar2.b, j);
                cqeVar = (cqe) rpeVar2.a();
            }
            q(wleVar, cqeVar);
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // reb
    public final /* synthetic */ heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    public final void k(wle wleVar, long j, boolean z) {
        try {
            kle kleVar = (kle) wleVar.g();
            wre wreVar = (wre) wleVar.o().g();
            wreVar.b();
            wse.n((wse) wreVar.b, z);
            kleVar.b();
            wle.r((wle) kleVar.b, (wse) wreVar.a());
            wle wleVar2 = (wle) kleVar.a();
            cqe cqeVar = (cqe) this.b;
            if (j != 0) {
                rpe rpeVar = (rpe) cqeVar.g();
                rpeVar.b();
                cqe.r((cqe) rpeVar.b, j);
                cqeVar = (cqe) rpeVar.a();
            }
            q(wleVar2, cqeVar);
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x037e, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0110, code lost:
    
        if (")".equals(kzc.b(r11, r6)) == false) goto L58;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // reb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        mzc mzcVar;
        String str;
        ?? r0;
        String sb;
        int i3;
        char c;
        zhc zhcVar = this;
        ey7 ey7Var = (ey7) zhcVar.b;
        ey7Var.L(i + i2, bArr);
        ey7Var.N(i);
        ArrayList arrayList = new ArrayList();
        try {
            tzc.d(ey7Var);
            while (!TextUtils.isEmpty(ey7Var.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z = false;
                int i4 = -1;
                int i5 = 0;
                char c2 = 65535;
                while (true) {
                    ?? r9 = 1;
                    if (c2 == 65535) {
                        i5 = ey7Var.b;
                        String n = ey7Var.n(StandardCharsets.UTF_8);
                        c2 = n == null ? (char) 0 : "STYLE".equals(n) ? (char) 2 : n.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        ey7Var.N(i5);
                        if (c2 == 0) {
                            fse.b(new ko9(arrayList2), qebVar, ot2Var);
                            return;
                        }
                        if (c2 == 1) {
                            while (!TextUtils.isEmpty(ey7Var.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    lq5.j("A style block was found after the first cue.");
                                    return;
                                }
                                ey7Var.n(StandardCharsets.UTF_8);
                                kzc kzcVar = (kzc) zhcVar.c;
                                ey7 ey7Var2 = kzcVar.a;
                                StringBuilder sb2 = kzcVar.b;
                                sb2.setLength(0);
                                int i6 = ey7Var.b;
                                while (!TextUtils.isEmpty(ey7Var.n(StandardCharsets.UTF_8))) {
                                }
                                ey7Var2.L(ey7Var.b, ey7Var.a);
                                ey7Var2.N(i6);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    kzc.c(ey7Var2);
                                    if (ey7Var2.a() >= 5 && "::cue".equals(ey7Var2.y(5, StandardCharsets.UTF_8))) {
                                        int i7 = ey7Var2.b;
                                        String b = kzc.b(ey7Var2, sb2);
                                        if (b != null) {
                                            if ("{".equals(b)) {
                                                ey7Var2.N(i7);
                                                str = "";
                                            } else if ("(".equals(b)) {
                                                int i8 = ey7Var2.b;
                                                int i9 = ey7Var2.c;
                                                boolean z2 = z ? 1 : 0;
                                                while (i8 < i9 && z2 == 0) {
                                                    int i10 = i8 + 1;
                                                    z2 = ((char) ey7Var2.a[i8]) == ')' ? r9 : z ? 1 : 0;
                                                    i8 = i10;
                                                }
                                                str = ey7Var2.y((i8 - 1) - ey7Var2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(kzc.b(ey7Var2, sb2))) {
                                                lzc lzcVar = new lzc();
                                                lzcVar.a = "";
                                                lzcVar.b = "";
                                                lzcVar.c = Collections.EMPTY_SET;
                                                lzcVar.d = "";
                                                lzcVar.e = str2;
                                                lzcVar.g = z;
                                                lzcVar.i = z;
                                                lzcVar.j = i4;
                                                lzcVar.k = i4;
                                                lzcVar.l = i4;
                                                lzcVar.m = i4;
                                                lzcVar.n = i4;
                                                lzcVar.p = i4;
                                                lzcVar.q = z;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i4) {
                                                        ?? matcher = kzc.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r9);
                                                            group.getClass();
                                                            lzcVar.d = group;
                                                        }
                                                        str = str.substring(z ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = gcc.a;
                                                    String[] split = str.split("\\.", i4);
                                                    String str4 = split[z ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i4) {
                                                        lzcVar.b = str4.substring(z ? 1 : 0, indexOf2);
                                                        lzcVar.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        lzcVar.b = str4;
                                                    }
                                                    if (split.length > r9) {
                                                        int length = split.length;
                                                        yve.f(length <= split.length ? r9 : z ? 1 : 0);
                                                        lzcVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r9, length)));
                                                    }
                                                }
                                                boolean z3 = z ? 1 : 0;
                                                String str5 = str2;
                                                boolean z4 = r9;
                                                while (z3 == 0) {
                                                    int i11 = ey7Var2.b;
                                                    str5 = kzc.b(ey7Var2, sb2);
                                                    boolean z5 = (str5 == null || "}".equals(str5)) ? z4 : z;
                                                    if (z5 == 0) {
                                                        ey7Var2.N(i11);
                                                        kzc.c(ey7Var2);
                                                        String a = kzc.a(ey7Var2, sb2);
                                                        if (!a.isEmpty() && ":".equals(kzc.b(ey7Var2, sb2))) {
                                                            kzc.c(ey7Var2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z6 = false;
                                                            while (true) {
                                                                if (z6) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i12 = ey7Var2.b;
                                                                    String b2 = kzc.b(ey7Var2, sb2);
                                                                    if (b2 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(b2) || ";".equals(b2)) {
                                                                        ey7Var2.N(i12);
                                                                        z6 = true;
                                                                    } else {
                                                                        sb3.append(b2);
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !sb.isEmpty()) {
                                                                int i13 = ey7Var2.b;
                                                                String b3 = kzc.b(ey7Var2, sb2);
                                                                if (!";".equals(b3)) {
                                                                    if ("}".equals(b3)) {
                                                                        ey7Var2.N(i13);
                                                                    }
                                                                }
                                                                if ("color".equals(a)) {
                                                                    i3 = 1;
                                                                    lzcVar.f = cm2.a(sb, true);
                                                                    lzcVar.g = true;
                                                                } else {
                                                                    i3 = 1;
                                                                    if ("background-color".equals(a)) {
                                                                        lzcVar.h = cm2.a(sb, true);
                                                                        lzcVar.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a)) {
                                                                            if ("over".equals(sb)) {
                                                                                lzcVar.p = 1;
                                                                            } else if ("under".equals(sb)) {
                                                                                lzcVar.p = 2;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a)) {
                                                                            lzcVar.q = "all".equals(sb) || sb.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a)) {
                                                                            if ("underline".equals(sb)) {
                                                                                i3 = 1;
                                                                                lzcVar.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a)) {
                                                                            lzcVar.e = jrd.c(sb);
                                                                        } else if (!"font-weight".equals(a)) {
                                                                            i3 = 1;
                                                                            if ("font-style".equals(a)) {
                                                                                if ("italic".equals(sb)) {
                                                                                    lzcVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a)) {
                                                                                ?? matcher2 = kzc.d.matcher(jrd.c(sb));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    switch (c) {
                                                                                        case 0:
                                                                                            r0 = 1;
                                                                                            lzcVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r0 = 1;
                                                                                            lzcVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r0 = 1;
                                                                                            lzcVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            grb.g();
                                                                                            return;
                                                                                    }
                                                                                    String group3 = matcher2.group(r0);
                                                                                    group3.getClass();
                                                                                    lzcVar.o = Float.parseFloat(group3);
                                                                                } else {
                                                                                    efd.f("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb)) {
                                                                            i3 = 1;
                                                                            lzcVar.l = 1;
                                                                        }
                                                                        z4 = r0;
                                                                        z3 = z5;
                                                                        z = false;
                                                                    }
                                                                }
                                                                r0 = i3;
                                                                z4 = r0;
                                                                z3 = z5;
                                                                z = false;
                                                            }
                                                            r0 = 1;
                                                            z4 = r0;
                                                            z3 = z5;
                                                            z = false;
                                                        }
                                                    }
                                                    r0 = z4;
                                                    z4 = r0;
                                                    z3 = z5;
                                                    z = false;
                                                }
                                                boolean z7 = z4;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(lzcVar);
                                                }
                                                r9 = z7;
                                                z = false;
                                                i4 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c2 == 3) {
                                Pattern pattern = rzc.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n2 = ey7Var.n(charset);
                                if (n2 == null) {
                                    mzcVar = null;
                                } else {
                                    Pattern pattern2 = rzc.a;
                                    Matcher matcher3 = pattern2.matcher(n2);
                                    if (matcher3.matches()) {
                                        mzcVar = rzc.d(null, matcher3, ey7Var, arrayList);
                                    } else {
                                        mzcVar = null;
                                        String n3 = ey7Var.n(charset);
                                        if (n3 != null) {
                                            Matcher matcher4 = pattern2.matcher(n3);
                                            if (matcher4.matches()) {
                                                mzcVar = rzc.d(n2.trim(), matcher4, ey7Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (mzcVar != null) {
                                    arrayList2.add(mzcVar);
                                }
                            }
                            zhcVar = this;
                        }
                    }
                }
            }
        } catch (hy7 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void m(wle wleVar, int i, long j, boolean z) {
        try {
            rpe rpeVar = (rpe) ((cqe) this.b).g();
            rpeVar.b();
            cqe.p((cqe) rpeVar.b, i);
            this.b = (cqe) rpeVar.a();
            kle kleVar = (kle) wleVar.g();
            wre wreVar = (wre) wleVar.o().g();
            wreVar.b();
            wse.n((wse) wreVar.b, z);
            kleVar.b();
            wle.r((wle) kleVar.b, (wse) wreVar.a());
            wle wleVar2 = (wle) kleVar.a();
            cqe cqeVar = (cqe) this.b;
            if (j != 0) {
                rpe rpeVar2 = (rpe) cqeVar.g();
                rpeVar2.b();
                cqe.r((cqe) rpeVar2.b, j);
                cqeVar = (cqe) rpeVar2.a();
            }
            q(wleVar2, cqeVar);
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void n(moe moeVar) {
        try {
            bte t = kte.t();
            t.c((cqe) this.b);
            t.b();
            kte.p((kte) t.b, moeVar);
            ((n31) this.c).p((kte) t.a());
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void o(que queVar) {
        try {
            n31 n31Var = (n31) this.c;
            bte t = kte.t();
            t.c((cqe) this.b);
            t.b();
            kte.r((kte) t.b, queVar);
            n31Var.p((kte) t.a());
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        boolean z;
        ld1 ld1Var;
        hhd hhdVar = (hhd) this.b;
        ld1 ld1Var2 = (ld1) this.c;
        lw6 lw6Var = hhdVar.b;
        he6 he6Var = hhd.i;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z2 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            he6Var.b("The module-to-client output switcher flag %s", true != z2 ? "not existed" : "existed");
            if (z2) {
                z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(he6Var.a, he6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(ld1Var2.y)));
                boolean z3 = !z && ld1Var2.y;
                if (lw6Var != null || (ld1Var = hhdVar.c) == null) {
                }
                boolean z4 = ld1Var.w;
                boolean z5 = ld1Var.s;
                mw6 mw6Var = new mw6();
                if (Build.VERSION.SDK_INT >= 30) {
                    mw6Var.b = z3;
                    mw6Var.d = z4;
                    mw6Var.c = z5;
                }
                lw6.i(new nw6(mw6Var));
                Log.i(he6Var.a, he6Var.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(hhdVar.f), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5)));
                if (z4) {
                    pid pidVar = hhdVar.e;
                    xve.h(pidVar);
                    ogd ogdVar = new ogd(pidVar);
                    lw6.b();
                    lw6.c().f = ogdVar;
                    z9f.a(b6f.c0);
                    return;
                }
                return;
            }
        }
        z = true;
        Log.i(he6Var.a, he6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(ld1Var2.y)));
        if (z) {
        }
        if (lw6Var != null) {
        }
    }

    public final void p(fve fveVar) {
        if (fveVar == null) {
            return;
        }
        try {
            bte t = kte.t();
            t.c((cqe) this.b);
            t.b();
            kte.s((kte) t.b, fveVar);
            ((n31) this.c).p((kte) t.a());
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void q(wle wleVar, cqe cqeVar) {
        if (wleVar == null) {
            return;
        }
        try {
            bte t = kte.t();
            t.c(cqeVar);
            t.b();
            kte.n((kte) t.b, wleVar);
            ((n31) this.c).p((kte) t.a());
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void r(wme wmeVar, cqe cqeVar) {
        try {
            bte t = kte.t();
            t.c(cqeVar);
            t.b();
            kte.o((kte) t.b, wmeVar);
            ((n31) this.c).p((kte) t.a());
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // reb
    public final int s() {
        return 1;
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        v2d v2dVar = (v2d) this.c;
        v2dVar.c.a(f);
        v2dVar.d.a(f);
        v2dVar.b.a(f);
        ((Runnable) this.b).run();
    }

    @Override // ydd
    public final void t0(String str, long j, long j2, long j3) {
        ydd yddVar = (ydd) this.b;
        if (yddVar != null) {
            yddVar.t0(str, j, j2, j3);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        up9 up9Var = (up9) this.b;
        Bundle bundle = (Bundle) this.c;
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : up9Var.d(bundle).onSuccessTask(no3.d, xad.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(float f, int i) {
        boolean z;
        v2d v2dVar = (v2d) this.c;
        boolean z2 = true;
        if ((v2dVar.c() == 0.0f && v2dVar.s == 2) || v2dVar.s == 3) {
            v2dVar.s = (byte) 1;
            z = true;
        } else {
            z = false;
        }
        if (f == 1.0f) {
            int i2 = v2dVar.x;
            int i3 = v2dVar.w;
            if (i2 != i3) {
                v2dVar.x = i3;
                if (z2) {
                    ((Runnable) this.b).run();
                }
                v2dVar.a();
            }
        }
        z2 = z;
        if (z2) {
        }
        v2dVar.a();
    }

    @Override // reb
    public final void reset() {
    }

    public /* synthetic */ zhc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ zhc(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public zhc(Context context, cqe cqeVar) {
        this.a = (byte) 13;
        n31 n31Var = new n31((byte) 12);
        try {
            h5c.b(context);
            n31Var.c = h5c.a().c(q51.e).a("PLAY_BILLING_LIBRARY", new n34("proto"), new rad());
        } catch (Throwable unused) {
            n31Var.b = true;
        }
        this.c = n31Var;
        this.b = cqeVar;
    }

    public zhc(IBinder iBinder) {
        this.a = (byte) 20;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new yrd(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public zhc(htd htdVar) {
        this.a = (byte) 18;
        this.c = new gxe();
        this.b = htdVar;
        z6f.O3();
    }

    public zhc(j05 j05Var) {
        this.a = (byte) 5;
        this.b = new SparseIntArray();
        xve.h(j05Var);
        this.c = j05Var;
    }

    public /* synthetic */ zhc(byte b, boolean z) {
        this.a = b;
    }

    public zhc(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 21:
                this.c = new AtomicLong(-1L);
                this.b = new qa4(context, qa4.o, new jkb("mlkit:vision"), g05.c);
                break;
            default:
                this.b = context;
                break;
        }
    }

    public zhc(fic ficVar) {
        this.a = (byte) 0;
        this.c = ficVar;
        this.b = new Rect();
    }
}
