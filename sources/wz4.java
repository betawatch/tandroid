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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wz4 implements d27, y27, ty9, x66, tka, l71, heb, hqb, li1, qec, xg4, SuccessContinuation, mm4, dn3, gja {
    public static volatile wz4 b;
    public static volatile wz4 d;
    public Object a;
    public static final Object c = new Object();
    public static final egd e = new egd(2);

    public wz4(byte b2) {
        switch (b2) {
            case 1:
                this.a = new ConcurrentHashMap();
                break;
            case 2:
                zee zeeVar = zee.c;
                oqd oqdVar = new oqd(new bde[]{sjf.h, e});
                Charset charset = x7e.a;
                this.a = oqdVar;
                break;
            case 19:
                this.a = new LinkedHashMap();
                break;
            case 28:
                this.a = new zh6();
                break;
            default:
                this.a = new HashSet();
                break;
        }
    }

    public static wz4 E() {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new wz4((byte) 1);
                }
            }
        }
        wz4 wz4Var = d;
        xve.h(wz4Var);
        return wz4Var;
    }

    public final lj A(float f, float f2, int i, int i2) {
        lj b2;
        lj b3;
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        rj0 rj0Var = (rj0) this.a;
        int min = Math.min(rj0Var.a - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min < f3) {
            throw tm7.a();
        }
        int max2 = Math.max(0, i2 - i3);
        int min2 = Math.min(rj0Var.b - 1, i2 + i3) - max2;
        if (min2 < f3) {
            throw tm7.a();
        }
        rj0 rj0Var2 = (rj0) this.a;
        mj mjVar = new mj(rj0Var2, max, max2, min, min2, f);
        int i4 = mjVar.e;
        int i5 = mjVar.c;
        int i6 = i4 + i5;
        int i7 = mjVar.f;
        int i8 = (i7 / 2) + mjVar.d;
        int[] iArr = new int[3];
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = ((i9 & 1) == 0 ? (i9 + 1) / 2 : -((i9 + 1) / 2)) + i8;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i11 = i5;
            while (i11 < i6 && !rj0Var2.b(i11, i10)) {
                i11++;
            }
            int i12 = 0;
            while (i11 < i6) {
                if (!rj0Var2.b(i11, i10)) {
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
                    if (mjVar.a(iArr) && (b3 = mjVar.b(i10, i11, iArr)) != null) {
                        return b3;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i12 = 1;
                }
                i11++;
            }
            if (mjVar.a(iArr) && (b2 = mjVar.b(i10, i6, iArr)) != null) {
                return b2;
            }
        }
        ArrayList arrayList = mjVar.b;
        if (arrayList.isEmpty()) {
            throw tm7.a();
        }
        return (lj) arrayList.get(0);
    }

    @Override // d27
    public final boolean B(f27 f27Var, MenuItem menuItem) {
        f9 f9Var = ((ActionMenuView) this.a).Q;
        if (f9Var == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((i09) f9Var).b).a0.c).iterator();
        while (it.hasNext()) {
            if (((dq4) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    public final SparseIntArray C(long j) {
        return (SparseIntArray) ((zh6) this.a).f(j);
    }

    public final Set F() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.a);
        }
        return unmodifiableSet;
    }

    public final sh2 G() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (sh2 sh2Var : ((LinkedHashMap) this.a).values()) {
            arrayList.add(sh2Var.b);
            arrayList2.add(sh2Var.c);
            arrayList3.add(sh2Var.d);
            arrayList4.add(sh2Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        yve.d(j, "the total number of elements (%s) in the arrays must fit in an int", j == ((long) i));
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new sh2(iArr3, tse.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), tse.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), tse.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    @Override // x66
    public final void H() {
        ((lc0) this.a).a.invalidate();
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
        wz4 wz4Var;
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
                wz4Var = this;
            } else {
                i12 = 0;
                wz4Var = this;
                i13 = abs;
            }
            if (i12 == ((rj0) wz4Var.a).b(i10, i11)) {
                if (i22 == 2) {
                    return dte.b(i20, i21, i5, i6);
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
            return dte.b(i19, i8, i5, i6);
        }
        return Float.NaN;
    }

    public final float J(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        rj0 rj0Var = (rj0) this.a;
        float I = I(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = rj0Var.a;
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
            int i10 = rj0Var.b;
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
        if ((serviceConnection instanceof y9f) || !concurrentHashMap.containsKey(serviceConnection)) {
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
                if ((h3d.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & TLObject.FLAG_21) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof y9f) {
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

    @Override // d27
    public final void Q1(f27 f27Var) {
        k09 k09Var = ((ActionMenuView) this.a).L;
        if (k09Var != null) {
            k09Var.Q1(f27Var);
        }
    }

    @Override // hqb
    public final boolean a() {
        vnb vnbVar;
        vnb vnbVar2;
        wh1 wh1Var = (wh1) this.a;
        vnbVar = ((e) wh1Var).resourceProvider;
        if (vnbVar == null) {
            return aob.I.o();
        }
        vnbVar2 = ((e) wh1Var).resourceProvider;
        return vnbVar2.a();
    }

    @Override // heb
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // l71
    public final void clear() {
        ((z61) this.a).h0();
    }

    @Override // xg4
    public final boolean d(qg4 qg4Var) {
        return false;
    }

    @Override // tka
    public final float e0() {
        mq5 mq5Var;
        mq5Var = ((e) ((at0) this.a)).mSystemInsets;
        return c00.d(9.66f, eg0.f(mq5Var.b), 0);
    }

    @Override // y27
    public final void f(f27 f27Var, boolean z) {
        bp bpVar;
        cp cpVar = (cp) this.a;
        f27 k = f27Var.k();
        int i = 0;
        boolean z2 = k != f27Var;
        if (z2) {
            f27Var = k;
        }
        bp[] bpVarArr = cpVar.V;
        int length = bpVarArr != null ? bpVarArr.length : 0;
        while (true) {
            if (i < length) {
                bpVar = bpVarArr[i];
                if (bpVar != null && bpVar.h == f27Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                bpVar = null;
                break;
            }
        }
        if (bpVar != null) {
            if (!z2) {
                cpVar.h(bpVar, z);
            } else {
                cpVar.f(bpVar.a, bpVar, k);
                cpVar.h(bpVar, true);
            }
        }
    }

    @Override // li1
    public final void f0(boolean z) {
        ((vnc) this.a).setLanguagePillHidden(z);
    }

    @Override // l71
    public final void g(t61 t61Var, c71 c71Var, boolean z) {
        HashSet hashSet;
        int i;
        z61 z61Var = (z61) this.a;
        if (t61Var == null) {
            if (c71Var != null) {
                z61Var.e0.i(c71Var);
                z61Var.N.e();
                z61Var.x0();
                return;
            }
            return;
        }
        if (z61Var.e0.j.size() > 0 || z) {
            d71 d71Var = z61Var.e0;
            HashSet hashSet2 = d71Var.j;
            HashSet hashSet3 = d71Var.l;
            long j = t61Var.a;
            SparseArray sparseArray = t61Var.d;
            if (hashSet3.contains(Long.valueOf(j))) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    ArrayList arrayList = ((u61) sparseArray.valueAt(i2)).b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        c71 c71Var2 = (c71) obj;
                        if (hashSet2.remove(c71Var2)) {
                            d71Var.k -= c71Var2.c;
                        }
                    }
                }
            } else {
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    ArrayList arrayList2 = ((u61) sparseArray.valueAt(i4)).b;
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        c71 c71Var3 = (c71) obj2;
                        if (hashSet2.add(c71Var3)) {
                            d71Var.k += c71Var3.c;
                        }
                    }
                }
            }
            d71Var.c();
            z61Var.N.e();
            z61Var.x0();
            return;
        }
        if (z61Var.H <= 0 || z61Var.getParentActivity() == null) {
            return;
        }
        t61Var.getClass();
        d71 d71Var2 = new d71(true);
        SparseArray sparseArray2 = t61Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = d71Var2.d;
        if (obj3 != null) {
            arrayList3.addAll(((u61) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((u61) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = d71Var2.e;
        if (obj4 != null) {
            arrayList4.addAll(((u61) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = d71Var2.f;
        if (obj5 != null) {
            arrayList5.addAll(((u61) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = d71Var2.g;
        if (obj6 != null) {
            arrayList6.addAll(((u61) sparseArray2.get(4)).b);
        }
        int i6 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = d71Var2.j;
            if (i6 >= size3) {
                break;
            }
            hashSet.add((c71) arrayList3.get(i6));
            if (((c71) arrayList3.get(i6)).d == 0) {
                d71Var2.r += ((c71) arrayList3.get(i6)).c;
                i = i6;
            } else {
                i = i6;
                d71Var2.s += ((c71) arrayList3.get(i)).c;
            }
            i6 = i + 1;
        }
        for (int i7 = 0; i7 < arrayList4.size(); i7++) {
            hashSet.add((c71) arrayList4.get(i7));
            d71Var2.t += ((c71) arrayList4.get(i7)).c;
        }
        for (int i8 = 0; i8 < arrayList5.size(); i8++) {
            hashSet.add((c71) arrayList5.get(i8));
            d71Var2.u += ((c71) arrayList5.get(i8)).c;
        }
        for (int i9 = 0; i9 < arrayList6.size(); i9++) {
            hashSet.add((c71) arrayList6.get(i9));
            d71Var2.v += ((c71) arrayList6.get(i9)).c;
        }
        d71Var2.m = true;
        d71Var2.n = true;
        d71Var2.o = true;
        d71Var2.p = true;
        d71Var2.q = true;
        byte b2 = 14;
        Collections.sort(arrayList3, new ta(b2));
        Collections.sort(arrayList4, new ta(b2));
        Collections.sort(arrayList5, new ta(b2));
        Collections.sort(arrayList6, new ta(b2));
        Collections.sort(d71Var2.h, new ta(b2));
        df3 df3Var = new df3(z61Var, t61Var, d71Var2, new qx6((Object) z61Var, (Object) t61Var, (byte) 11));
        z61Var.a0 = df3Var;
        z61Var.showDialog(df3Var);
    }

    @Override // ty9
    public final CharSequence getContentDescription() {
        cx cxVar = (cx) this.a;
        return String.valueOf(Math.round((cxVar.a.getProgress() * (cxVar.c - r0)) + cxVar.b));
    }

    @Override // heb
    public final long i(int i) {
        yve.f(i == 0);
        return 0L;
    }

    @Override // ty9
    public final int i0() {
        cx cxVar = (cx) this.a;
        return cxVar.c - cxVar.b;
    }

    @Override // qec
    public final void invalidate() {
        ((wb2) ((ob2) this.a).b).invalidate();
    }

    @Override // tka
    public final int j0() {
        mq5 mq5Var;
        mq5Var = ((e) ((at0) this.a)).mSystemInsets;
        return mq5Var.d;
    }

    @Override // mm4
    public final Object k(nm4 nm4Var, zw2 zw2Var) {
        Object k = ((ym4) this.a).k(new z73(nm4Var, (byte) 0), zw2Var);
        return k == vx2.a ? k : f9c.a;
    }

    @Override // heb
    public final List l(long j) {
        return j >= 0 ? (List) this.a : Collections.EMPTY_LIST;
    }

    @Override // x66
    public final boolean m() {
        return false;
    }

    @Override // li1
    public final void m0(RectF rectF) {
        rectF.set(((vnc) this.a).R);
    }

    @Override // x66
    public final boolean n(float f) {
        return false;
    }

    @Override // ty9
    public final void o(boolean z, float f) {
        cx cxVar = (cx) this.a;
        int round = Math.round(((cxVar.c - r6) * f) + cxVar.b);
        if (round != xea.V0) {
            xea.V0 = round;
            SharedPreferences.Editor edit = uc7.e1().edit();
            edit.putInt("iv_font_size", xea.V0);
            edit.commit();
            cxVar.f.v0[0].getAdapter().E.clear();
            o oVar = cxVar.f;
            for (int i = 0; i < 2; i++) {
                oVar.v0[i].c.f();
                ex exVar = oVar.v0[i].c;
                ArrayList arrayList = exVar.d;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i2);
                    if (pageBlock != null) {
                        pageBlock.cachedWidth = 0;
                        pageBlock.cachedHeight = 0;
                    }
                }
                Utilities.e.a(exVar.M);
                Utilities.e.d(exVar.M, 100L);
            }
            cxVar.invalidate();
        }
    }

    @Override // heb
    public final int q() {
        return 1;
    }

    @Override // xg4
    public final void r(r47 r47Var) {
        xo2 xo2Var = (xo2) this.a;
        xo2Var.t1.presentFragment(nx9.N(xo2Var.a, r47Var));
        xo2Var.dismiss();
    }

    @Override // hqb
    public final boolean s() {
        return false;
    }

    @Override // tka
    public final void t(boolean z) {
        fm0 fm0Var = ((at0) this.a).s;
        if (fm0Var != null) {
            fm0Var.a(z, true);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        hba hbaVar = (hba) obj;
        yy2 yy2Var = ((wy2) this.a).e;
        if (hbaVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        sy2 sy2Var = yy2.r;
        return Tasks.whenAll((Task<?>[]) new Task[]{yy2Var.h(), yy2Var.m.h((i03) yy2Var.e.b, null)});
    }

    @Override // xg4
    public final boolean u() {
        return false;
    }

    @Override // l71
    public final void v() {
        z61 z61Var = (z61) this.a;
        d71 d71Var = z61Var.e0;
        if (d71Var == null || d71Var.j.size() <= 0) {
            return;
        }
        z61Var.e0.d();
        l61 l61Var = z61Var.N;
        if (l61Var != null) {
            l61Var.f(false);
            z61Var.N.e();
        }
    }

    @Override // hqb
    public final void w(boolean z) {
        vnb vnbVar;
        vnb vnbVar2;
        wh1 wh1Var = (wh1) this.a;
        vnbVar = ((e) wh1Var).resourceProvider;
        if (vnbVar instanceof vh1) {
            vnbVar2 = ((e) wh1Var).resourceProvider;
            wh1 wh1Var2 = ((vh1) vnbVar2).a;
            wh1Var2.K = !wh1Var2.K;
            wh1Var2.k1();
            wh1Var2.g1(false);
        }
        wh1Var.b1(a(), false);
        wh1Var.g1(false);
    }

    @Override // li1
    public final View x0() {
        return (vnc) this.a;
    }

    public final void y(sh2 sh2Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        long[] jArr = sh2Var.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(sh2Var.e[0]), sh2Var);
    }

    public final float z(th4 th4Var, th4 th4Var2) {
        int i = (int) th4Var.a;
        int i2 = (int) th4Var.b;
        int i3 = (int) th4Var2.a;
        int i4 = (int) th4Var2.b;
        float J = J(i, i2, i3, i4);
        float J2 = J((int) th4Var2.a, i4, (int) th4Var.a, i2);
        return Float.isNaN(J) ? J2 / 7.0f : Float.isNaN(J2) ? J / 7.0f : (J + J2) / 14.0f;
    }

    @Override // y27
    public final boolean z0(f27 f27Var) {
        Window.Callback callback;
        cp cpVar = (cp) this.a;
        if (f27Var != f27Var.k() || !cpVar.P || (callback = cpVar.f.getCallback()) == null || cpVar.a0) {
            return true;
        }
        callback.onMenuOpened(jn7.s1, f27Var);
        return true;
    }

    @Override // x66
    public final void c() {
    }

    @Override // l71
    public final void dismiss() {
    }

    @Override // xg4
    public final void e() {
    }

    @Override // x66
    public final void p() {
    }

    @Override // ty9
    public final void x() {
    }

    @Override // x66
    public final void j(boolean z) {
    }

    @Override // xg4
    public final void h(r47 r47Var, View view, int i) {
    }

    public wz4(al5 al5Var) {
        xve.h(al5Var);
        this.a = al5Var;
    }

    public /* synthetic */ wz4(Object obj) {
        this.a = obj;
    }
}
