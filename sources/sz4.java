// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sz4 implements w17, r27, cx9, t66, cja, l81, lcb, job, kj1, tcc, bh4, SuccessContinuation, im4, wn3, qha {
    public static volatile sz4 b;
    public static volatile sz4 d;
    public Object a;
    public static final Object c = new Object();
    public static final ndd e = new ndd(2);

    public sz4(byte b2) {
        switch (b2) {
            case 1:
                this.a = new ConcurrentHashMap();
                break;
            case 2:
                kce kceVar = kce.c;
                cf9 cf9Var = new cf9((Object) new mae[]{dhf.h, e}, (byte) 28);
                Charset charset = k5e.a;
                this.a = cf9Var;
                break;
            case 19:
                this.a = new LinkedHashMap();
                break;
            case 28:
                this.a = new vh6();
                break;
            default:
                this.a = new HashSet();
                break;
        }
    }

    public static sz4 F() {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new sz4((byte) 1);
                }
            }
        }
        sz4 sz4Var = d;
        ite.h(sz4Var);
        return sz4Var;
    }

    @Override // t66
    public final void A() {
        ((jd0) this.a).a.invalidate();
    }

    @Override // w17
    public final boolean B(y17 y17Var, MenuItem menuItem) {
        e9 e9Var = ((ActionMenuView) this.a).Q;
        if (e9Var == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((cf9) e9Var).b).a0.c).iterator();
        while (it.hasNext()) {
            if (((aq4) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    public final kk C(float f, float f2, int i, int i2) {
        kk b2;
        kk b3;
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        qk0 qk0Var = (qk0) this.a;
        int min = Math.min(qk0Var.a - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min < f3) {
            throw xl7.a();
        }
        int max2 = Math.max(0, i2 - i3);
        int min2 = Math.min(qk0Var.b - 1, i2 + i3) - max2;
        if (min2 < f3) {
            throw xl7.a();
        }
        qk0 qk0Var2 = (qk0) this.a;
        lk lkVar = new lk(qk0Var2, max, max2, min, min2, f);
        int i4 = lkVar.e;
        int i5 = lkVar.c;
        int i6 = i4 + i5;
        int i7 = lkVar.f;
        int i8 = (i7 / 2) + lkVar.d;
        int[] iArr = new int[3];
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = ((i9 & 1) == 0 ? (i9 + 1) / 2 : -((i9 + 1) / 2)) + i8;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i11 = i5;
            while (i11 < i6 && !qk0Var2.b(i11, i10)) {
                i11++;
            }
            int i12 = 0;
            while (i11 < i6) {
                if (!qk0Var2.b(i11, i10)) {
                    if (i12 == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i12 != 2) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else {
                    if (lkVar.a(iArr) && (b3 = lkVar.b(i10, i11, iArr)) != null) {
                        return b3;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i12 = 1;
                }
                i11++;
            }
            if (lkVar.a(iArr) && (b2 = lkVar.b(i10, i6, iArr)) != null) {
                return b2;
            }
        }
        ArrayList arrayList = lkVar.b;
        if (arrayList.isEmpty()) {
            throw xl7.a();
        }
        return (kk) arrayList.get(0);
    }

    public final SparseIntArray E(long j) {
        return (SparseIntArray) ((vh6) this.a).f(j);
    }

    public final Set G() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.a);
        }
        return unmodifiableSet;
    }

    public final oi2 H() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (oi2 oi2Var : ((LinkedHashMap) this.a).values()) {
            arrayList.add(oi2Var.b);
            arrayList2.add(oi2Var.c);
            arrayList3.add(oi2Var.d);
            arrayList4.add(oi2Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        jte.d(j, "the total number of elements (%s) in the arrays must fit in an int", j == ((long) i));
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new oi2(iArr3, cqe.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), cqe.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), cqe.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public final float I(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        sz4 sz4Var;
        int i13;
        int i14 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int abs2 = Math.abs(i8 - i6);
        int i15 = 2;
        int i16 = (-abs) / 2;
        int i17 = i5 < i7 ? 1 : -1;
        int i18 = i6 < i8 ? 1 : -1;
        int i19 = i7 + i17;
        int i20 = i5;
        int i21 = i6;
        int i22 = 0;
        while (true) {
            if (i20 == i19) {
                i9 = i15;
                break;
            }
            if (z) {
                i11 = i20;
                i10 = i21;
            } else {
                i10 = i20;
                i11 = i21;
            }
            boolean z2 = z;
            if (i22 == i14) {
                i12 = i14;
                i13 = abs;
                sz4Var = this;
            } else {
                i12 = 0;
                sz4Var = this;
                i13 = abs;
            }
            if (i12 == ((qk0) sz4Var.a).b(i10, i11)) {
                if (i22 == 2) {
                    return oqe.b(i20, i21, i5, i6);
                }
                i22++;
            }
            i16 += abs2;
            if (i16 > 0) {
                if (i21 == i8) {
                    i9 = 2;
                    break;
                }
                i21 += i18;
                i16 -= i13;
            }
            i20 += i17;
            abs = i13;
            z = z2;
            i14 = 1;
            i15 = 2;
        }
        if (i22 == i9) {
            return oqe.b(i19, i8, i5, i6);
        }
        return Float.NaN;
    }

    public final float J(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        qk0 qk0Var = (qk0) this.a;
        float I = I(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = qk0Var.a;
            if (i5 >= i7) {
                float f3 = ((i7 - 1) - i) / (i5 - i);
                int i8 = i7 - 1;
                f = f3;
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f4 = i2;
        int i9 = (int) (f4 - ((i4 - i2) * f));
        if (i9 < 0) {
            f2 = f4 / (i2 - i9);
        } else {
            int i10 = qk0Var.b;
            if (i9 >= i10) {
                f2 = ((i10 - 1) - i2) / (i9 - i2);
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (I(i, i2, (int) (((i5 - i) * f2) + i), i6) + I) - 1.0f;
    }

    public final void K(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        if ((serviceConnection instanceof j7f) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public final boolean L(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((s0d.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & TLObject.FLAG_21) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof j7f) {
            return context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }

    @Override // w17
    public final void T1(y17 y17Var) {
        oo8 oo8Var = ((ActionMenuView) this.a).L;
        if (oo8Var != null) {
            oo8Var.T1(y17Var);
        }
    }

    @Override // job
    public final boolean a() {
        ylb ylbVar;
        ylb ylbVar2;
        vi1 vi1Var = (vi1) this.a;
        ylbVar = ((d) vi1Var).resourceProvider;
        if (ylbVar == null) {
            return cmb.I.o();
        }
        ylbVar2 = ((d) vi1Var).resourceProvider;
        return ylbVar2.a();
    }

    @Override // lcb
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // cja
    public final float b0() {
        iq5 iq5Var;
        iq5Var = ((d) ((au0) this.a)).mSystemInsets;
        return b10.c(9.66f, eh0.d(iq5Var.b), 0);
    }

    @Override // l81
    public final void clear() {
        ((y71) this.a).i0();
    }

    @Override // r27
    public final void d(y17 y17Var, boolean z) {
        aq aqVar;
        bq bqVar = (bq) this.a;
        y17 k = y17Var.k();
        int i = 0;
        boolean z2 = k != y17Var;
        if (z2) {
            y17Var = k;
        }
        aq[] aqVarArr = bqVar.V;
        int length = aqVarArr != null ? aqVarArr.length : 0;
        while (true) {
            if (i < length) {
                aqVar = aqVarArr[i];
                if (aqVar != null && aqVar.h == y17Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                aqVar = null;
                break;
            }
        }
        if (aqVar != null) {
            if (!z2) {
                bqVar.h(aqVar, z);
            } else {
                bqVar.f(aqVar.a, aqVar, k);
                bqVar.h(aqVar, true);
            }
        }
    }

    @Override // kj1
    public final void d0(boolean z) {
        ((jlc) this.a).setLanguagePillHidden(z);
    }

    @Override // bh4
    public final boolean e(ug4 ug4Var) {
        return false;
    }

    @Override // im4
    public final Object g(jm4 jm4Var, px2 px2Var) {
        Object g = ((mj4) this.a).g(new s83(jm4Var, (byte) 0), px2Var);
        return g == ly2.a ? g : g7c.a;
    }

    @Override // cx9
    public final CharSequence getContentDescription() {
        cy cyVar = (cy) this.a;
        return String.valueOf(Math.round((cyVar.a.getProgress() * (cyVar.c - r0)) + cyVar.b));
    }

    @Override // l81
    public final void h(s71 s71Var, b81 b81Var, boolean z) {
        HashSet hashSet;
        int i;
        y71 y71Var = (y71) this.a;
        if (s71Var == null) {
            if (b81Var != null) {
                y71Var.e0.i(b81Var);
                y71Var.N.e();
                y71Var.x0();
                return;
            }
            return;
        }
        boolean z2 = false;
        if (y71Var.e0.j.size() > 0 || z) {
            c81 c81Var = y71Var.e0;
            HashSet hashSet2 = c81Var.j;
            HashSet hashSet3 = c81Var.l;
            long j = s71Var.a;
            SparseArray sparseArray = s71Var.d;
            if (hashSet3.contains(Long.valueOf(j))) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    ArrayList arrayList = ((t71) sparseArray.valueAt(i2)).b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        b81 b81Var2 = (b81) obj;
                        if (hashSet2.remove(b81Var2)) {
                            c81Var.k -= b81Var2.c;
                        }
                    }
                }
            } else {
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    ArrayList arrayList2 = ((t71) sparseArray.valueAt(i4)).b;
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        b81 b81Var3 = (b81) obj2;
                        if (hashSet2.add(b81Var3)) {
                            c81Var.k += b81Var3.c;
                        }
                    }
                }
            }
            c81Var.c();
            y71Var.N.e();
            y71Var.x0();
            return;
        }
        if (y71Var.H <= 0 || y71Var.getParentActivity() == null) {
            return;
        }
        s71Var.getClass();
        c81 c81Var2 = new c81(true);
        SparseArray sparseArray2 = s71Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = c81Var2.d;
        if (obj3 != null) {
            arrayList3.addAll(((t71) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((t71) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = c81Var2.e;
        if (obj4 != null) {
            arrayList4.addAll(((t71) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = c81Var2.f;
        if (obj5 != null) {
            arrayList5.addAll(((t71) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = c81Var2.g;
        if (obj6 != null) {
            arrayList6.addAll(((t71) sparseArray2.get(4)).b);
        }
        int i6 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = c81Var2.j;
            if (i6 >= size3) {
                break;
            }
            hashSet.add((b81) arrayList3.get(i6));
            if (((b81) arrayList3.get(i6)).d == 0) {
                c81Var2.r += ((b81) arrayList3.get(i6)).c;
                i = i6;
            } else {
                i = i6;
                c81Var2.s += ((b81) arrayList3.get(i)).c;
            }
            i6 = i + 1;
        }
        for (int i7 = 0; i7 < arrayList4.size(); i7++) {
            hashSet.add((b81) arrayList4.get(i7));
            c81Var2.t += ((b81) arrayList4.get(i7)).c;
        }
        for (int i8 = 0; i8 < arrayList5.size(); i8++) {
            hashSet.add((b81) arrayList5.get(i8));
            c81Var2.u += ((b81) arrayList5.get(i8)).c;
        }
        for (int i9 = 0; i9 < arrayList6.size(); i9++) {
            hashSet.add((b81) arrayList6.get(i9));
            c81Var2.v += ((b81) arrayList6.get(i9)).c;
        }
        c81Var2.m = true;
        c81Var2.n = true;
        c81Var2.o = true;
        c81Var2.p = true;
        c81Var2.q = true;
        byte b2 = 14;
        Collections.sort(arrayList3, new sa(b2));
        Collections.sort(arrayList4, new sa(b2));
        Collections.sort(arrayList5, new sa(b2));
        Collections.sort(arrayList6, new sa(b2));
        Collections.sort(c81Var2.h, new sa(b2));
        wf3 wf3Var = new wf3(y71Var, s71Var, c81Var2, new hi2(y71Var, s71Var, z2, (byte) 13));
        y71Var.a0 = wf3Var;
        y71Var.showDialog(wf3Var);
    }

    @Override // cja
    public final int h0() {
        iq5 iq5Var;
        iq5Var = ((d) ((au0) this.a)).mSystemInsets;
        return iq5Var.d;
    }

    @Override // tcc
    public final void invalidate() {
        ((rc2) ((jc2) this.a).b).invalidate();
    }

    @Override // cx9
    public final int j0() {
        cy cyVar = (cy) this.a;
        return cyVar.c - cyVar.b;
    }

    @Override // lcb
    public final long k(int i) {
        jte.f(i == 0);
        return 0L;
    }

    @Override // t66
    public final boolean l() {
        return false;
    }

    @Override // kj1
    public final void l0(RectF rectF) {
        rectF.set(((jlc) this.a).R);
    }

    @Override // t66
    public final boolean m(float f) {
        return false;
    }

    @Override // cx9
    public final void n(boolean z, float f) {
        cy cyVar = (cy) this.a;
        int round = Math.round(((cyVar.c - r6) * f) + cyVar.b);
        if (round != gda.V0) {
            gda.V0 = round;
            SharedPreferences.Editor edit = oc7.d1().edit();
            edit.putInt("iv_font_size", gda.V0);
            edit.commit();
            cyVar.f.v0[0].getAdapter().E.clear();
            o oVar = cyVar.f;
            for (int i = 0; i < 2; i++) {
                oVar.v0[i].c.f();
                ey eyVar = oVar.v0[i].c;
                ArrayList arrayList = eyVar.d;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i2);
                    if (pageBlock != null) {
                        pageBlock.cachedWidth = 0;
                        pageBlock.cachedHeight = 0;
                    }
                }
                Utilities.e.a(eyVar.M);
                Utilities.e.d(eyVar.M, 100L);
            }
            cyVar.invalidate();
        }
    }

    @Override // lcb
    public final List p(long j) {
        return j >= 0 ? (List) this.a : Collections.EMPTY_LIST;
    }

    @Override // lcb
    public final int q() {
        return 1;
    }

    @Override // bh4
    public final void r(k47 k47Var) {
        pp2 pp2Var = (pp2) this.a;
        pp2Var.t1.presentFragment(vv9.M(pp2Var.a, k47Var));
        pp2Var.dismiss();
    }

    @Override // job
    public final boolean s() {
        return false;
    }

    @Override // cja
    public final void t(boolean z) {
        fn0 fn0Var = ((au0) this.a).s;
        if (fn0Var != null) {
            fn0Var.a(z, true);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        r9a r9aVar = (r9a) obj;
        nz2 nz2Var = ((lz2) this.a).e;
        if (r9aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        iz2 iz2Var = nz2.r;
        return Tasks.whenAll((Task<?>[]) new Task[]{nz2Var.h(), nz2Var.m.h((a13) nz2Var.e.b, null)});
    }

    @Override // bh4
    public final boolean u() {
        return false;
    }

    @Override // l81
    public final void v() {
        y71 y71Var = (y71) this.a;
        c81 c81Var = y71Var.e0;
        if (c81Var == null || c81Var.j.size() <= 0) {
            return;
        }
        y71Var.e0.d();
        k71 k71Var = y71Var.N;
        if (k71Var != null) {
            k71Var.f(false);
            y71Var.N.e();
        }
    }

    @Override // kj1
    public final View v0() {
        return (jlc) this.a;
    }

    @Override // job
    public final void w(boolean z) {
        ylb ylbVar;
        ylb ylbVar2;
        vi1 vi1Var = (vi1) this.a;
        ylbVar = ((d) vi1Var).resourceProvider;
        if (ylbVar instanceof ui1) {
            ylbVar2 = ((d) vi1Var).resourceProvider;
            vi1 vi1Var2 = ((ui1) ylbVar2).a;
            vi1Var2.K = !vi1Var2.K;
            vi1Var2.k1();
            vi1Var2.g1(false);
        }
        vi1Var.b1(a(), false);
        vi1Var.g1(false);
    }

    @Override // r27
    public final boolean w0(y17 y17Var) {
        Window.Callback callback;
        bq bqVar = (bq) this.a;
        if (y17Var != y17Var.k() || !bqVar.P || (callback = bqVar.f.getCallback()) == null || bqVar.a0) {
            return true;
        }
        callback.onMenuOpened(nm7.s1, y17Var);
        return true;
    }

    public final void y(oi2 oi2Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        long[] jArr = oi2Var.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(oi2Var.e[0]), oi2Var);
    }

    public final float z(wh4 wh4Var, wh4 wh4Var2) {
        int i = (int) wh4Var.a;
        int i2 = (int) wh4Var.b;
        int i3 = (int) wh4Var2.a;
        int i4 = (int) wh4Var2.b;
        float J = J(i, i2, i3, i4);
        float J2 = J((int) wh4Var2.a, i4, (int) wh4Var.a, i2);
        return Float.isNaN(J) ? J2 / 7.0f : Float.isNaN(J2) ? J / 7.0f : (J + J2) / 14.0f;
    }

    @Override // t66
    public final void c() {
    }

    @Override // l81
    public final void dismiss() {
    }

    @Override // bh4
    public final void f() {
    }

    @Override // t66
    public final void o() {
    }

    @Override // cx9
    public final void x() {
    }

    @Override // t66
    public final void j(boolean z) {
    }

    @Override // bh4
    public final void i(k47 k47Var, View view, int i) {
    }

    public sz4(xk5 xk5Var) {
        ite.h(xk5Var);
        this.a = xk5Var;
    }

    public /* synthetic */ sz4(Object obj) {
        this.a = obj;
    }
}
