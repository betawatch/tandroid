// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
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
import android.text.style.CharacterStyle;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rhb implements mc2, qq7, vcb, g94, h89, hbd, c44, OnCompleteListener, fld, z6d, Continuation {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public rhb(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.c = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            case 11:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = new yw7();
                this.c = new vwc();
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
    private final void e(Object obj, Object obj2) {
        boolean z;
        cka ckaVar;
        god godVar;
        cka ckaVar2;
        o94 o94Var;
        ry ryVar = (ry) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        tpd tpdVar = (tpd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        tpdVar.getClass();
        w76 h = ryVar.h();
        u76 u76Var = h.b;
        u76Var.getClass();
        ape apeVar = tpdVar.B;
        o94[] o94VarArr = apeVar == null ? null : apeVar.b;
        if (o94VarArr != null) {
            int length = o94VarArr.length;
            ?? r11 = 0;
            while (true) {
                if (r11 >= length) {
                    o94Var = null;
                    break;
                }
                o94Var = o94VarArr[r11];
                if ("location_updates_with_callback".equals(o94Var.a)) {
                    break;
                } else {
                    r11++;
                }
            }
            if (o94Var != null && o94Var.b() >= 1) {
                z = true;
                ckaVar = tpdVar.G;
                synchronized (ckaVar) {
                    try {
                        try {
                            god godVar2 = (god) tpdVar.G.get(u76Var);
                            if (godVar2 == null || z) {
                                godVar = new god(ryVar);
                                tpdVar.G.put(u76Var, godVar);
                            } else {
                                godVar2.U(h);
                                godVar = godVar2;
                                godVar2 = null;
                            }
                            int identityHashCode = System.identityHashCode(u76Var.a);
                            String str = u76Var.b;
                            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(identityHashCode).length());
                            sb.append(str);
                            sb.append("@");
                            sb.append(identityHashCode);
                            String sb2 = sb.toString();
                            if (z) {
                                b5f b5fVar = (b5f) tpdVar.k();
                                if (godVar2 == null) {
                                    godVar2 = null;
                                }
                                dmd dmdVar = new dmd(null, taskCompletionSource);
                                Parcel R = b5fVar.R();
                                int i = sid.a;
                                R.writeInt(1);
                                int r = mve.r(R, 20293);
                                mve.q(R, 1, 4);
                                R.writeInt(2);
                                mve.f(R, 2, godVar2);
                                mve.f(R, 3, godVar);
                                mve.l(R, 6, sb2);
                                mve.s(R, r);
                                R.writeInt(1);
                                locationRequest.writeToParcel(R, 0);
                                sid.c(R, dmdVar);
                                b5fVar.V(R, 88);
                                ckaVar2 = ckaVar;
                            } else {
                                b5f b5fVar2 = (b5f) tpdVar.k();
                                int i2 = locationRequest.a;
                                ckaVar2 = ckaVar;
                                long j = locationRequest.b;
                                long j2 = locationRequest.c;
                                long j3 = locationRequest.d;
                                long j4 = locationRequest.e;
                                int i3 = locationRequest.f;
                                float f = locationRequest.h;
                                boolean z2 = locationRequest.n;
                                long j5 = locationRequest.r;
                                int i4 = locationRequest.s;
                                int i5 = locationRequest.w;
                                String str2 = locationRequest.x;
                                boolean z3 = locationRequest.y;
                                WorkSource workSource = locationRequest.E;
                                epd epdVar = locationRequest.F;
                                String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                                if (j2 == -1) {
                                    j2 = j;
                                } else if (i2 != 105) {
                                    j2 = Math.min(j2, j);
                                }
                                mqd mqdVar = new mqd(new LocationRequest(i2, j, j2, Math.max(j3, j), Long.MAX_VALUE, j4, i3, f, z2, j5 == -1 ? j : j5, i4, i5, str3, z3, new WorkSource(workSource), epdVar), null, false, false, null, false, false, null, Long.MAX_VALUE);
                                ymd ymdVar = new ymd(taskCompletionSource, godVar);
                                int i6 = god.c;
                                IInterface queryLocalInterface = godVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                                IInterface m9fVar = queryLocalInterface instanceof cdf ? (cdf) queryLocalInterface : new m9f(godVar, "com.google.android.gms.location.ILocationCallback", (byte) 5);
                                IInterface queryLocalInterface2 = ymdVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                                IInterface xjeVar = queryLocalInterface2 instanceof jue ? (jue) queryLocalInterface2 : new xje(ymdVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 5);
                                Parcel R2 = b5fVar2.R();
                                int i7 = sid.a;
                                R2.writeInt(1);
                                int r2 = mve.r(R2, 20293);
                                mve.q(R2, 1, 4);
                                R2.writeInt(1);
                                mve.k(R2, 2, mqdVar, 0);
                                mve.f(R2, 5, m9fVar.asBinder());
                                mve.f(R2, 6, xjeVar.asBinder());
                                mve.l(R2, 8, sb2);
                                mve.s(R2, r2);
                                b5fVar2.V(R2, 59);
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = ckaVar;
                        throw th;
                    }
                }
            }
        }
        z = false;
        ckaVar = tpdVar.G;
        synchronized (ckaVar) {
        }
    }

    @Override // mc2
    public final boolean A0(long j) {
        return ((xhb) this.c).w;
    }

    public final void B(xle xleVar) {
        try {
            nqe t = wqe.t();
            t.c((nne) this.b);
            t.b();
            wqe.p((wqe) t.b, xleVar);
            ((m41) this.c).p((wqe) t.a());
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void C(cse cseVar) {
        try {
            m41 m41Var = (m41) this.c;
            nqe t = wqe.t();
            t.c((nne) this.b);
            t.b();
            wqe.r((wqe) t.b, cseVar);
            m41Var.p((wqe) t.a());
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        ggc ggcVar = (ggc) this.c;
        wzc h = kfc.h(view, wzcVar);
        if (h.a.n()) {
            return h;
        }
        Rect rect = (Rect) this.b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = ggcVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            wzc b = kfc.b(ggcVar.getChildAt(i), h);
            rect.left = Math.min(b.b(), rect.left);
            rect.top = Math.min(b.d(), rect.top);
            rect.right = Math.min(b.c(), rect.right);
            rect.bottom = Math.min(b.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        g0d g0dVar = (g0d) this.c;
        g0dVar.c.a(f);
        g0dVar.d.a(f);
        g0dVar.b.a(f);
        ((Runnable) this.b).run();
    }

    @Override // mc2
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override // mc2
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    public final void I(rse rseVar) {
        if (rseVar == null) {
            return;
        }
        try {
            nqe t = wqe.t();
            t.c((nne) this.b);
            t.b();
            wqe.s((wqe) t.b, rseVar);
            ((m41) this.c).p((wqe) t.a());
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void J(gje gjeVar, nne nneVar) {
        if (gjeVar == null) {
            return;
        }
        try {
            nqe t = wqe.t();
            t.c(nneVar);
            t.b();
            wqe.n((wqe) t.b, gjeVar);
            ((m41) this.c).p((wqe) t.a());
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // mc2
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean K() {
        return false;
    }

    public final void L(gke gkeVar, nne nneVar) {
        try {
            nqe t = wqe.t();
            t.c(nneVar);
            t.b();
            wqe.o((wqe) t.b, gkeVar);
            ((m41) this.c).p((wqe) t.a());
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // mc2
    public final pc8 M1() {
        return null;
    }

    @Override // mc2
    public final boolean N() {
        return false;
    }

    @Override // mc2
    public final int O() {
        return 0;
    }

    @Override // mc2
    public final boolean O1(long j) {
        return ((xhb) this.c).s;
    }

    @Override // mc2
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override // mc2
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override // mc2
    public final hw1 S() {
        return null;
    }

    @Override // mc2
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // mc2
    public final boolean U1(k47 k47Var) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // g94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(float f, int i) {
        boolean z;
        g0d g0dVar = (g0d) this.c;
        boolean z2 = true;
        if ((g0dVar.c() == 0.0f && g0dVar.s == 2) || g0dVar.s == 3) {
            g0dVar.s = (byte) 1;
            z = true;
        } else {
            z = false;
        }
        if (f == 1.0f) {
            int i2 = g0dVar.x;
            int i3 = g0dVar.w;
            if (i2 != i3) {
                g0dVar.x = i3;
                if (z2) {
                    ((Runnable) this.b).run();
                }
                g0dVar.a();
            }
        }
        z2 = z;
        if (z2) {
        }
        g0dVar.a();
    }

    @Override // mc2
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override // mc2
    public final boolean Z() {
        return false;
    }

    @Override // mc2
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override // c44
    public final /* bridge */ /* synthetic */ c44 a(Class cls, cq7 cq7Var) {
        ((HashMap) this.b).put(cls, cq7Var);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override // mc2
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h89
    public final void accept(Object obj, Object obj2) {
        Object[] objArr = 0;
        switch (this.a) {
            case 8:
                b5d b5dVar = new b5d((ua4) this.b, (TaskCompletionSource) obj2, objArr == true ? 1 : 0);
                s4d s4dVar = (s4d) ((p5d) obj).k();
                ep epVar = (ep) this.c;
                Parcel c = s4dVar.c();
                g4d.c(c, b5dVar);
                g4d.b(c, epVar);
                s4dVar.d(c, 1);
                return;
            case 12:
                e(obj, obj2);
                return;
            default:
                bhd bhdVar = (bhd) this.b;
                String str = (String) this.c;
                mjf mjfVar = (mjf) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                ite.j("Not connected to device", bhdVar.G == 2);
                z8d z8dVar = (z8d) mjfVar.k();
                Parcel R = z8dVar.R();
                R.writeString(str);
                z8dVar.W(R, 5);
                synchronized (bhdVar.t) {
                    if (bhdVar.q != null) {
                        taskCompletionSource.setException(dod.a(new Status(2001, null, null, null)));
                        return;
                    } else {
                        bhdVar.q = taskCompletionSource;
                        return;
                    }
                }
        }
    }

    @Override // mc2
    public final boolean b() {
        return false;
    }

    @Override // hbd
    public final void c0(String str, long j, int i, tad tadVar, long j2, long j3) {
        ((abd) this.c).g = null;
        hbd hbdVar = (hbd) this.b;
        if (hbdVar != null) {
            hbdVar.c0(str, j, i, tadVar, j2, j3);
        }
    }

    @Override // z6d
    public final void d(Bitmap bitmap) {
        xab xabVar = (xab) this.b;
        xabVar.c = bitmap;
        e7f e7fVar = (e7f) this.c;
        e7fVar.l = xabVar;
        e7fVar.b();
    }

    @Override // mc2
    public final boolean d0() {
        return false;
    }

    @Override // mc2
    public final boolean f() {
        return true;
    }

    @Override // vcb
    public final /* synthetic */ lcb g(int i, int i2, byte[] bArr) {
        return hg9.c(this, bArr, i2);
    }

    public final View h(int i, int i2, int i3, int i4) {
        vec vecVar = (vec) this.c;
        wec wecVar = (wec) this.b;
        int E = wecVar.E();
        int N = wecVar.N();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View Y = wecVar.Y(i);
            int A = wecVar.A(Y);
            int a0 = wecVar.a0(Y);
            vecVar.b = E;
            vecVar.c = N;
            vecVar.d = A;
            vecVar.e = a0;
            if (i3 != 0) {
                vecVar.a = i3;
                if (vecVar.a()) {
                    return Y;
                }
            }
            if (i4 != 0) {
                vecVar.a = i4;
                if (vecVar.a()) {
                    view = Y;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean j(View view) {
        vec vecVar = (vec) this.c;
        wec wecVar = (wec) this.b;
        int E = wecVar.E();
        int N = wecVar.N();
        int A = wecVar.A(view);
        int a0 = wecVar.a0(view);
        vecVar.b = E;
        vecVar.c = N;
        vecVar.d = A;
        vecVar.e = a0;
        vecVar.a = 24579;
        return vecVar.a();
    }

    public final synchronized void l(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.c) == null) {
                if (((Context) this.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    ncd.f("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
                if (powerManager == null) {
                    ncd.f("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
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

    @Override // mc2
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean l1() {
        return false;
    }

    @Override // mc2
    public final /* synthetic */ boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override // mc2
    public final boolean m2(int i) {
        return false;
    }

    public final int n(Context context, zz4 zz4Var) {
        ite.h(context);
        ite.h(zz4Var);
        int i = 0;
        if (!zz4Var.v()) {
            return 0;
        }
        int i2 = zz4Var.i();
        int o = o(i2);
        if (o != -1) {
            return o;
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
                i = ((e05) this.c).c(context, i2);
            }
            sparseIntArray.put(i2, i);
        }
        return i;
    }

    @Override // mc2
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override // mc2
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    public final int o(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        boolean z;
        le1 le1Var;
        qed qedVar = (qed) this.b;
        le1 le1Var2 = (le1) this.c;
        gw6 gw6Var = qedVar.b;
        ce6 ce6Var = qed.i;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z2 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            ce6Var.b("The module-to-client output switcher flag %s", true != z2 ? "not existed" : "existed");
            if (z2) {
                z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(ce6Var.a, ce6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(le1Var2.y)));
                boolean z3 = !z && le1Var2.y;
                if (gw6Var != null || (le1Var = qedVar.c) == null) {
                }
                boolean z4 = le1Var.w;
                boolean z5 = le1Var.s;
                hw6 hw6Var = new hw6();
                if (Build.VERSION.SDK_INT >= 30) {
                    hw6Var.b = z3;
                    hw6Var.d = z4;
                    hw6Var.c = z5;
                }
                gw6.i(new iw6(hw6Var));
                Log.i(ce6Var.a, ce6Var.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(qedVar.f), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5)));
                if (z4) {
                    zfd zfdVar = qedVar.e;
                    ite.h(zfdVar);
                    xdd xddVar = new xdd(zfdVar);
                    gw6.b();
                    gw6.c().f = xddVar;
                    k7f.a(m3f.c0);
                    return;
                }
                return;
            }
        }
        z = true;
        Log.i(ce6Var.a, ce6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(le1Var2.y)));
        if (z) {
        }
        if (gw6Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x037e, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0110, code lost:
    
        if (")".equals(vwc.b(r11, r6)) == false) goto L58;
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
    @Override // vcb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(byte[] bArr, int i, int i2, ucb ucbVar, fu2 fu2Var) {
        xwc xwcVar;
        String str;
        ?? r0;
        String sb;
        int i3;
        char c;
        rhb rhbVar = this;
        yw7 yw7Var = (yw7) rhbVar.b;
        yw7Var.L(i + i2, bArr);
        yw7Var.N(i);
        ArrayList arrayList = new ArrayList();
        try {
            exc.d(yw7Var);
            while (!TextUtils.isEmpty(yw7Var.n(StandardCharsets.UTF_8))) {
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
                        i5 = yw7Var.b;
                        String n = yw7Var.n(StandardCharsets.UTF_8);
                        c2 = n == null ? (char) 0 : "STYLE".equals(n) ? (char) 2 : n.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        yw7Var.N(i5);
                        if (c2 == 0) {
                            ope.b(new wm9(arrayList2), ucbVar, fu2Var);
                            return;
                        }
                        if (c2 == 1) {
                            while (!TextUtils.isEmpty(yw7Var.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    u36.j("A style block was found after the first cue.");
                                    return;
                                }
                                yw7Var.n(StandardCharsets.UTF_8);
                                vwc vwcVar = (vwc) rhbVar.c;
                                yw7 yw7Var2 = vwcVar.a;
                                StringBuilder sb2 = vwcVar.b;
                                sb2.setLength(0);
                                int i6 = yw7Var.b;
                                while (!TextUtils.isEmpty(yw7Var.n(StandardCharsets.UTF_8))) {
                                }
                                yw7Var2.L(yw7Var.b, yw7Var.a);
                                yw7Var2.N(i6);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    vwc.c(yw7Var2);
                                    if (yw7Var2.a() >= 5 && "::cue".equals(yw7Var2.y(5, StandardCharsets.UTF_8))) {
                                        int i7 = yw7Var2.b;
                                        String b = vwc.b(yw7Var2, sb2);
                                        if (b != null) {
                                            if ("{".equals(b)) {
                                                yw7Var2.N(i7);
                                                str = "";
                                            } else if ("(".equals(b)) {
                                                int i8 = yw7Var2.b;
                                                int i9 = yw7Var2.c;
                                                boolean z2 = z ? 1 : 0;
                                                while (i8 < i9 && z2 == 0) {
                                                    int i10 = i8 + 1;
                                                    z2 = ((char) yw7Var2.a[i8]) == ')' ? r9 : z ? 1 : 0;
                                                    i8 = i10;
                                                }
                                                str = yw7Var2.y((i8 - 1) - yw7Var2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(vwc.b(yw7Var2, sb2))) {
                                                wwc wwcVar = new wwc();
                                                wwcVar.a = "";
                                                wwcVar.b = "";
                                                wwcVar.c = Collections.EMPTY_SET;
                                                wwcVar.d = "";
                                                wwcVar.e = str2;
                                                wwcVar.g = z;
                                                wwcVar.i = z;
                                                wwcVar.j = i4;
                                                wwcVar.k = i4;
                                                wwcVar.l = i4;
                                                wwcVar.m = i4;
                                                wwcVar.n = i4;
                                                wwcVar.p = i4;
                                                wwcVar.q = z;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i4) {
                                                        ?? matcher = vwc.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r9);
                                                            group.getClass();
                                                            wwcVar.d = group;
                                                        }
                                                        str = str.substring(z ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = hac.a;
                                                    String[] split = str.split("\\.", i4);
                                                    String str4 = split[z ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i4) {
                                                        wwcVar.b = str4.substring(z ? 1 : 0, indexOf2);
                                                        wwcVar.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        wwcVar.b = str4;
                                                    }
                                                    if (split.length > r9) {
                                                        int length = split.length;
                                                        jte.f(length <= split.length ? r9 : z ? 1 : 0);
                                                        wwcVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r9, length)));
                                                    }
                                                }
                                                boolean z3 = z ? 1 : 0;
                                                String str5 = str2;
                                                boolean z4 = r9;
                                                while (z3 == 0) {
                                                    int i11 = yw7Var2.b;
                                                    str5 = vwc.b(yw7Var2, sb2);
                                                    boolean z5 = (str5 == null || "}".equals(str5)) ? z4 : z;
                                                    if (z5 == 0) {
                                                        yw7Var2.N(i11);
                                                        vwc.c(yw7Var2);
                                                        String a = vwc.a(yw7Var2, sb2);
                                                        if (!a.isEmpty() && ":".equals(vwc.b(yw7Var2, sb2))) {
                                                            vwc.c(yw7Var2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z6 = false;
                                                            while (true) {
                                                                if (z6) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i12 = yw7Var2.b;
                                                                    String b2 = vwc.b(yw7Var2, sb2);
                                                                    if (b2 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(b2) || ";".equals(b2)) {
                                                                        yw7Var2.N(i12);
                                                                        z6 = true;
                                                                    } else {
                                                                        sb3.append(b2);
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !sb.isEmpty()) {
                                                                int i13 = yw7Var2.b;
                                                                String b3 = vwc.b(yw7Var2, sb2);
                                                                if (!";".equals(b3)) {
                                                                    if ("}".equals(b3)) {
                                                                        yw7Var2.N(i13);
                                                                    }
                                                                }
                                                                if ("color".equals(a)) {
                                                                    i3 = 1;
                                                                    wwcVar.f = um2.a(sb, true);
                                                                    wwcVar.g = true;
                                                                } else {
                                                                    i3 = 1;
                                                                    if ("background-color".equals(a)) {
                                                                        wwcVar.h = um2.a(sb, true);
                                                                        wwcVar.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a)) {
                                                                            if ("over".equals(sb)) {
                                                                                wwcVar.p = 1;
                                                                            } else if ("under".equals(sb)) {
                                                                                wwcVar.p = 2;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a)) {
                                                                            wwcVar.q = "all".equals(sb) || sb.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a)) {
                                                                            if ("underline".equals(sb)) {
                                                                                i3 = 1;
                                                                                wwcVar.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a)) {
                                                                            wwcVar.e = vod.c(sb);
                                                                        } else if (!"font-weight".equals(a)) {
                                                                            i3 = 1;
                                                                            if ("font-style".equals(a)) {
                                                                                if ("italic".equals(sb)) {
                                                                                    wwcVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a)) {
                                                                                ?? matcher2 = vwc.d.matcher(vod.c(sb));
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
                                                                                            wwcVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r0 = 1;
                                                                                            wwcVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r0 = 1;
                                                                                            wwcVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            rjb.h();
                                                                                            return;
                                                                                    }
                                                                                    String group3 = matcher2.group(r0);
                                                                                    group3.getClass();
                                                                                    wwcVar.o = Float.parseFloat(group3);
                                                                                } else {
                                                                                    ncd.f("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb)) {
                                                                            i3 = 1;
                                                                            wwcVar.l = 1;
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
                                                    arrayList3.add(wwcVar);
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
                                Pattern pattern = cxc.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n2 = yw7Var.n(charset);
                                if (n2 == null) {
                                    xwcVar = null;
                                } else {
                                    Pattern pattern2 = cxc.a;
                                    Matcher matcher3 = pattern2.matcher(n2);
                                    if (matcher3.matches()) {
                                        xwcVar = cxc.d(null, matcher3, yw7Var, arrayList);
                                    } else {
                                        xwcVar = null;
                                        String n3 = yw7Var.n(charset);
                                        if (n3 != null) {
                                            Matcher matcher4 = pattern2.matcher(n3);
                                            if (matcher4.matches()) {
                                                xwcVar = cxc.d(n2.trim(), matcher4, yw7Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (xwcVar != null) {
                                    arrayList2.add(xwcVar);
                                }
                            }
                            rhbVar = this;
                        }
                    }
                }
            }
        } catch (bx7 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // mc2
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // mc2
    public final hkb p2() {
        return null;
    }

    @Override // vcb
    public final int r() {
        return 1;
    }

    public final void s(Status status, boolean z) {
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
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ap(status));
            }
        }
    }

    @Override // mc2
    public final String t(long j) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((xhb) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    @Override // mc2
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        fo9 fo9Var = (fo9) this.b;
        Bundle bundle = (Bundle) this.c;
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : fo9Var.d(bundle).onSuccessTask(gp3.d, g8d.a);
    }

    @Override // hbd
    public final void u0(String str, long j, long j2, long j3) {
        hbd hbdVar = (hbd) this.b;
        if (hbdVar != null) {
            hbdVar.u0(str, j, j2, j3);
        }
    }

    public final void v(gje gjeVar) {
        try {
            J(gjeVar, (nne) this.b);
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void w(gje gjeVar, int i, long j) {
        try {
            cne cneVar = (cne) ((nne) this.b).g();
            cneVar.b();
            nne.p((nne) cneVar.b, i);
            nne nneVar = (nne) cneVar.a();
            this.b = nneVar;
            if (j != 0) {
                cne cneVar2 = (cne) nneVar.g();
                cneVar2.b();
                nne.r((nne) cneVar2.b, j);
                nneVar = (nne) cneVar2.a();
            }
            J(gjeVar, nneVar);
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void x(gje gjeVar, long j, boolean z) {
        try {
            uie uieVar = (uie) gjeVar.g();
            ipe ipeVar = (ipe) gjeVar.o().g();
            ipeVar.b();
            hqe.n((hqe) ipeVar.b, z);
            uieVar.b();
            gje.r((gje) uieVar.b, (hqe) ipeVar.a());
            gje gjeVar2 = (gje) uieVar.a();
            nne nneVar = (nne) this.b;
            if (j != 0) {
                cne cneVar = (cne) nneVar.g();
                cneVar.b();
                nne.r((nne) cneVar.b, j);
                nneVar = (nne) cneVar.a();
            }
            J(gjeVar2, nneVar);
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // mc2
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override // mc2
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    public final void y(gje gjeVar, int i, long j, boolean z) {
        try {
            cne cneVar = (cne) ((nne) this.b).g();
            cneVar.b();
            nne.p((nne) cneVar.b, i);
            this.b = (nne) cneVar.a();
            uie uieVar = (uie) gjeVar.g();
            ipe ipeVar = (ipe) gjeVar.o().g();
            ipeVar.b();
            hqe.n((hqe) ipeVar.b, z);
            uieVar.b();
            gje.r((gje) uieVar.b, (hqe) ipeVar.a());
            gje gjeVar2 = (gje) uieVar.a();
            nne nneVar = (nne) this.b;
            if (j != 0) {
                cne cneVar2 = (cne) nneVar.g();
                cneVar2.b();
                nne.r((nne) cneVar2.b, j);
                nneVar = (nne) cneVar2.a();
            }
            J(gjeVar2, nneVar);
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // mc2
    public final boolean z1() {
        return false;
    }

    @Override // mc2
    public final void C1() {
    }

    @Override // mc2
    public final void T0() {
    }

    @Override // mc2
    public final void c() {
    }

    @Override // mc2
    public final void g2() {
    }

    @Override // mc2
    public final void i() {
    }

    @Override // mc2
    public final void o2() {
    }

    @Override // mc2
    public final void q() {
    }

    @Override // vcb
    public final void reset() {
    }

    @Override // mc2
    public final void s0() {
    }

    @Override // mc2
    public final void A(rc2 rc2Var) {
    }

    @Override // mc2
    public final void F0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void G(rc2 rc2Var) {
    }

    @Override // mc2
    public final void J1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void L1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void M0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void P(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void R(rc2 rc2Var) {
    }

    @Override // mc2
    public final void T(k47 k47Var) {
    }

    @Override // mc2
    public final void U0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void X0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Y(int i) {
    }

    @Override // mc2
    public final void Z0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void e0(k47 k47Var) {
    }

    @Override // mc2
    public final void h0(String str) {
    }

    @Override // mc2
    public final void i2(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void q1(h47 h47Var) {
    }

    @Override // mc2
    public final void q2(rc2 rc2Var) {
    }

    @Override // mc2
    public final void y1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override // mc2
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override // mc2
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void N1(String str, String str2) {
    }

    @Override // mc2
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override // mc2
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // mc2
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // mc2
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override // mc2
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override // mc2
    public final void t1(rc2 rc2Var, int i) {
    }

    @Override // mc2
    public final void v0(rc2 rc2Var, long j) {
    }

    public /* synthetic */ rhb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ rhb(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public rhb(Context context, nne nneVar) {
        this.a = (byte) 15;
        m41 m41Var = new m41((byte) 12);
        try {
            i3c.b(context);
            m41Var.c = i3c.a().c(p61.e).a("PLAY_BILLING_LIBRARY", new d44("proto"), new a8d());
        } catch (Throwable unused) {
            m41Var.b = true;
        }
        this.c = m41Var;
        this.b = nneVar;
    }

    @Override // mc2
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // mc2
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override // mc2
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // mc2
    public final void N0(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void d2(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void i1(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override // mc2
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override // mc2
    public final void u(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    public rhb(IBinder iBinder) {
        this.a = (byte) 22;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new kpd(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public rhb(uqd uqdVar) {
        this.a = (byte) 20;
        this.c = new sue();
        this.b = uqdVar;
        k4f.O3();
    }

    public rhb(e05 e05Var) {
        this.a = (byte) 7;
        this.b = new SparseIntArray();
        ite.h(e05Var);
        this.c = e05Var;
    }

    public /* synthetic */ rhb(byte b, boolean z) {
        this.a = b;
    }

    public rhb(wec wecVar) {
        this.a = (byte) 1;
        this.b = wecVar;
        vec vecVar = new vec();
        vecVar.a = 0;
        this.c = vecVar;
    }

    public rhb(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 23:
                this.c = new AtomicLong(-1L);
                this.b = new ua4(context, ua4.o, new oib("mlkit:vision"), b05.c);
                break;
            default:
                this.b = context;
                break;
        }
    }

    public rhb(ggc ggcVar) {
        this.a = (byte) 2;
        this.c = ggcVar;
        this.b = new Rect();
    }

    @Override // mc2
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
    }

    @Override // mc2
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // mc2
    public final void r0(rc2 rc2Var, float f, float f2, boolean z) {
    }

    @Override // mc2
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // mc2
    public final void H(rc2 rc2Var, int i, float f, float f2, boolean z) {
    }

    @Override // mc2
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // mc2
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // mc2
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override // mc2
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
