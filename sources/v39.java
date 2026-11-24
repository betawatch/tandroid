// default package

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v39 implements rb9, gi2, hk4, jy9, kt8, h86, eob, zu9, bb2, wz6, yr9, puc, p1d, y1d, f69, f9d, v56, OnCompleteListener {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ v39(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // bb2
    public final boolean A1(gb2 gb2Var, int i) {
        return i == ((tmb) this.b).y;
    }

    @Override // wz6
    public final boolean B(yz6 yz6Var, MenuItem menuItem) {
        return false;
    }

    @Override // bb2
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override // h86
    public final void C0(k86 k86Var, long j, long j2, int i) {
        switch (this.a) {
            case 11:
                break;
            default:
                cv7 cv7Var = (cv7) k86Var;
                cv8 cv8Var = (cv8) this.b;
                if (cv8Var.a) {
                    f86 a = cv8.a(cv7Var, j, j2);
                    kp kpVar = (kp) cv8Var.g;
                    kpVar.getClass();
                    kpVar.u(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
                    break;
                }
                break;
        }
    }

    @Override // gi2
    public final void D(float f, float f2) {
        rh9 rh9Var;
        bb2 bb2Var;
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                og9 og9Var = pg9Var.b0;
                if (og9Var != null && (bb2Var = (rh9Var = pg9Var.a).F) != null) {
                    bb2Var.V0(rh9Var.E, og9Var.c);
                    break;
                }
                break;
            default:
                Runnable runnable = ((f6c) this.b).j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // bb2
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // rb9
    public final void E1() {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var != null) {
            te9Var.a.W3();
        }
    }

    @Override // bb2
    public final gib E2() {
        return null;
    }

    @Override // bb2
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override // bb2
    public final void F1(gb2 gb2Var, int i) {
        tmb tmbVar = (tmb) this.b;
        cib cibVar = tmbVar.E;
        if (tmbVar.a()) {
            tmbVar.y = 2;
            gb2Var.invalidate();
            gl.r(cibVar);
            gl.d3(cibVar, 5000L);
        }
    }

    @Override // bb2
    public final boolean G(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // rb9
    public final eib G0() {
        return (gc9) this.b;
    }

    @Override // v56
    public final void H(Object obj) {
        u56 u56Var;
        qx qxVar = ((dmd) this.b).b;
        synchronized (qxVar) {
            qxVar.b = false;
            u56Var = ((w56) qxVar.c).b;
        }
        if (u56Var != null) {
            ((u84) qxVar.d).c(u56Var, 2441);
        }
    }

    @Override // gi2
    public final boolean H0(float f, float f2) {
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                og9 i0 = pg9Var.i0(f, f2);
                if (i0 == null || i0.b) {
                    i0 = null;
                }
                pg9Var.b0 = i0;
                return i0 != null;
            default:
                int L = gl.L(9.0f);
                RectF rectF = ((f6c) this.b).g;
                float f3 = -L;
                rectF.inset(f3, f3);
                boolean contains = rectF.contains(f, f2);
                float f4 = L;
                rectF.inset(f4, f4);
                return contains;
        }
    }

    @Override // rb9
    public final lk0 I0() {
        return ((gc9) this.b).a;
    }

    @Override // bb2
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
        tmb tmbVar = (tmb) this.b;
        cib cibVar = tmbVar.E;
        if (tmbVar.a()) {
            tmbVar.y = 2;
            gl.r(cibVar);
            gl.d3(cibVar, 5000L);
        }
    }

    @Override // bb2
    public final boolean J0(long j) {
        return false;
    }

    public final int J1(int[] iArr, int i) {
        int[] iArr2;
        int[] iArr3;
        int i2;
        int i3;
        hs4 hs4Var = (hs4) this.b;
        if (iArr.length == 0) {
            sc8.e();
            return 0;
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i4 = 1;
            while (i4 < length && iArr[i4] == 0) {
                i4++;
            }
            if (i4 == length) {
                iArr2 = new int[]{0};
            } else {
                int i5 = length - i4;
                int[] iArr4 = new int[i5];
                System.arraycopy(iArr, i4, iArr4, 0, i5);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i];
        int i6 = 0;
        boolean z = true;
        while (i6 < i) {
            int i7 = hs4Var.a[(hs4Var.g ? 1 : 0) + i6];
            if (i7 == 0) {
                i3 = iArr2[iArr2.length - 1];
            } else {
                if (i7 == 1) {
                    i2 = 0;
                    for (int i8 : iArr2) {
                        hs4 hs4Var2 = hs4.h;
                        i2 ^= i8;
                    }
                } else {
                    i2 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i9 = 1; i9 < length2; i9++) {
                        i2 = hs4Var.c(i7, i2) ^ iArr2[i9];
                    }
                }
                i3 = i2;
            }
            iArr5[(i - 1) - i6] = i3;
            if (i3 != 0) {
                z = false;
            }
            i6++;
            z = z;
        }
        if (z) {
            return 0;
        }
        is4 is4Var = new is4(hs4Var, iArr5);
        is4 a = hs4Var.a(i, 1);
        is4 is4Var2 = hs4Var.c;
        if (a.d() >= is4Var.d()) {
            a = is4Var;
            is4Var = a;
        }
        is4 is4Var3 = hs4Var.d;
        is4 is4Var4 = a;
        is4 is4Var5 = is4Var;
        is4 is4Var6 = is4Var4;
        is4 is4Var7 = is4Var2;
        while ((is4Var6.d() << 1) >= i) {
            if (is4Var6.e()) {
                throw new y49("r_{i-1} was zero");
            }
            int b = hs4Var.b(is4Var6.c(is4Var6.d()));
            is4 is4Var8 = is4Var2;
            while (is4Var5.d() >= is4Var6.d() && !is4Var5.e()) {
                int d = is4Var5.d() - is4Var6.d();
                int c = hs4Var.c(is4Var5.c(is4Var5.d()), b);
                is4Var8 = is4Var8.a(hs4Var.a(d, c));
                is4Var5 = is4Var5.a(is4Var6.h(d, c));
            }
            is4 a2 = is4Var8.g(is4Var3).a(is4Var7);
            if (is4Var5.d() >= is4Var6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + is4Var5 + ", rLast: " + is4Var6);
            }
            is4 is4Var9 = is4Var5;
            is4Var5 = is4Var6;
            is4Var6 = is4Var9;
            is4Var7 = is4Var3;
            is4Var3 = a2;
        }
        int c2 = is4Var3.c(0);
        if (c2 == 0) {
            throw new y49("sigmaTilde(0) was zero");
        }
        int b2 = hs4Var.b(c2);
        is4[] is4VarArr = {is4Var3.f(b2), is4Var6.f(b2)};
        is4 is4Var10 = is4VarArr[0];
        is4 is4Var11 = is4VarArr[1];
        int d2 = is4Var10.d();
        if (d2 == 1) {
            iArr3 = new int[]{is4Var10.c(1)};
        } else {
            int[] iArr6 = new int[d2];
            int i10 = 0;
            for (int i11 = 1; i11 < hs4Var.e && i10 < d2; i11++) {
                if (is4Var10.b(i11) == 0) {
                    iArr6[i10] = hs4Var.b(i11);
                    i10++;
                }
            }
            if (i10 != d2) {
                throw new y49("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            int b3 = hs4Var.b(iArr3[i12]);
            int i13 = 1;
            for (int i14 = 0; i14 < length3; i14++) {
                if (i12 != i14) {
                    int c3 = hs4Var.c(iArr3[i14], b3);
                    i13 = hs4Var.c(i13, (c3 & 1) == 0 ? c3 | 1 : c3 & (-2));
                }
            }
            int c4 = hs4Var.c(is4Var11.b(b3), hs4Var.b(i13));
            iArr7[i12] = c4;
            if (hs4Var.g) {
                iArr7[i12] = hs4Var.c(c4, b3);
            }
        }
        for (int i15 = 0; i15 < iArr3.length; i15++) {
            int length4 = iArr.length - 1;
            int i16 = iArr3[i15];
            if (i16 == 0) {
                sc8.e();
                return 0;
            }
            int i17 = length4 - hs4Var.b[i16];
            if (i17 < 0) {
                throw new y49("Bad error location");
            }
            iArr[i17] = iArr[i17] ^ iArr7[i15];
        }
        return iArr3.length;
    }

    @Override // gi2
    public final boolean K0(View view, float f, float f2) {
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                if (pg9Var.b0 != null) {
                    og9 i0 = pg9Var.i0(f, f2);
                    og9 og9Var = pg9Var.b0;
                    if (i0 == og9Var) {
                        rh9 rh9Var = pg9Var.a;
                        bb2 bb2Var = rh9Var.F;
                        if (bb2Var != null) {
                            bb2Var.v0(rh9Var.E, og9Var.c);
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override // bb2
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[LOOP:0: B:8:0x0033->B:10:0x0039, LOOP_END] */
    @Override // f9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(String str, long j, int i, r8d r8dVar, long j2, long j3) {
        int i2;
        Iterator it;
        ndd nddVar = (ndd) this.b;
        try {
            i2 = i;
            try {
                nddVar.a(new vcd(new Status(i2, null, null, null), (byte) 2));
            } catch (IllegalStateException e) {
                e = e;
                dc6 dc6Var = i69.k;
                Log.e(dc6Var.a, dc6Var.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = nddVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e2) {
            e = e2;
            i2 = i;
        }
        it = nddVar.q.i.iterator();
        while (it.hasNext()) {
            ((h69) it.next()).h(str, j, i2, j2, j3);
            i2 = i;
        }
    }

    public final void L1(ga gaVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        byte b = gaVar.a;
        if (b == 1) {
            recyclerView.y.U(recyclerView, gaVar.b, gaVar.d);
            return;
        }
        if (b == 2) {
            recyclerView.y.X(recyclerView, gaVar.b, gaVar.d);
        } else if (b == 4) {
            recyclerView.y.Z(recyclerView, gaVar.b, gaVar.d, gaVar.c);
        } else {
            if (b != 8) {
                return;
            }
            recyclerView.y.W(recyclerView, gaVar.b, gaVar.d);
        }
    }

    @Override // eob
    public final void M(boolean z, float f) {
        ((n4b) this.b).a(Boolean.FALSE, Float.valueOf(f));
    }

    @Override // bb2
    public final void N(gb2 gb2Var, int i, float f, float f2, boolean z) {
        tmb tmbVar = (tmb) this.b;
        cib cibVar = tmbVar.E;
        if (tmbVar.a()) {
            tmbVar.y = 0;
            gb2Var.invalidate();
            gl.r(cibVar);
            gl.d3(cibVar, 5000L);
        }
    }

    @Override // bb2
    public final boolean N1() {
        return false;
    }

    @Override // bb2
    public final boolean O() {
        return false;
    }

    @Override // yr9
    public final vf6 O0() {
        return null;
    }

    @Override // rb9
    public final boolean P0() {
        te9 te9Var = ((gc9) this.b).T;
        return te9Var != null && te9Var.a.V4();
    }

    public final void P1(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int R = recyclerView.e.R();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < R; i6++) {
            View Q = recyclerView.e.Q(i6);
            s49 U = RecyclerView.U(Q);
            if (U != null && !U.r() && (i4 = U.c) >= i && i4 < i5) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((U.l & 1024) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((e49) Q.getLayoutParams()).c = true;
            }
        }
        wg2 wg2Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) wg2Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            s49 s49Var = (s49) arrayList2.get(size);
            if (s49Var != null && (i3 = s49Var.c) >= i && i3 < i5) {
                s49Var.a(2);
                wg2Var.g(size);
            }
        }
        recyclerView.z0 = true;
    }

    @Override // bb2
    public final boolean Q() {
        return false;
    }

    public final void Q1(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int R = recyclerView.e.R();
        for (int i3 = 0; i3 < R; i3++) {
            s49 U = RecyclerView.U(recyclerView.e.Q(i3));
            if (U != null && !U.r() && U.c >= i) {
                U.n(i2, false);
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            s49 s49Var = (s49) arrayList.get(i4);
            if (s49Var != null && s49Var.c >= i) {
                s49Var.n(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override // bb2
    public final int R() {
        return 0;
    }

    @Override // y1d
    public final void R0(Bundle bundle) {
        k3d k3dVar = (k3d) this.b;
        ReentrantLock reentrantLock = k3dVar.o;
        reentrantLock.lock();
        try {
            Bundle bundle2 = k3dVar.k;
            if (bundle2 == null) {
                k3dVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            k3dVar.l = ds2.f;
            k3dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // gi2
    public final boolean S() {
        byte b = this.a;
        return true;
    }

    @Override // p1d
    public final boolean S0() {
        return true;
    }

    public final void S1(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int R = recyclerView.e.R();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < R; i11++) {
            s49 U = RecyclerView.U(recyclerView.e.Q(i11));
            if (U != null && (i9 = U.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    U.n(i2 - i, false);
                } else {
                    U.n(i5, false);
                }
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            s49 s49Var = (s49) arrayList.get(i12);
            if (s49Var != null && (i8 = s49Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    s49Var.n(i2 - i, false);
                } else {
                    s49Var.n(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override // bb2
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // bb2
    public final boolean T1(gm gmVar) {
        return false;
    }

    @Override // h86
    public final void U(k86 k86Var, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 11:
                n53 n53Var = (n53) this.b;
                synchronized (ycd.b) {
                    z = ycd.c;
                }
                if (z) {
                    n53Var.a();
                    return;
                } else {
                    n53Var.a.y(new IOException(new ConcurrentModificationException()));
                    return;
                }
            default:
                cv7 cv7Var = (cv7) k86Var;
                if (((cv8) this.b).a) {
                    hya hyaVar = (hya) cv7Var.f;
                    hyaVar.getClass();
                    cv8 cv8Var = (cv8) this.b;
                    cv8Var.h = hyaVar;
                    byte b = 0;
                    ((cdb) cv8Var.d).e(new iya(this, hyaVar, b));
                    cv8 cv8Var2 = (cv8) this.b;
                    Uri uri = (Uri) cv8Var2.e;
                    uri.getClass();
                    Uri uri2 = hyaVar.c;
                    if (uri2 != null) {
                        String uri3 = uri2.toString();
                        uri = (uri3 == null || jxe.a(uri3)[0] == -1) ? jxe.d(uri.toString(), uri2.toString()) : uri2;
                    }
                    cv8Var2.e = uri;
                    long j3 = hyaVar.b;
                    if (j3 == -9223372036854775807L) {
                        j3 = 300000;
                    }
                    cdb cdbVar = (cdb) ((cv8) this.b).i;
                    cdbVar.getClass();
                    cdbVar.a.postDelayed(new jya((cv8) this.b, b), j3);
                    f86 a = cv8.a(cv7Var, j, j2);
                    kp kpVar = (kp) ((cv8) this.b).g;
                    kpVar.getClass();
                    kpVar.p(a, 8);
                    return;
                }
                return;
        }
    }

    @Override // rb9
    public final void U0(int i, int i2) {
        ld9 ld9Var;
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var == null || (ld9Var = te9Var.a.R3) == null) {
            return;
        }
        ld9Var.f(i, i2);
    }

    @Override // yr9
    public final boolean U1(int i) {
        return true;
    }

    @Override // bb2
    public final int V(gb2 gb2Var) {
        return 0;
    }

    @Override // bb2
    public final vu1 X() {
        return null;
    }

    @Override // bb2
    public final ma8 Z1() {
        return null;
    }

    @Override // p1d
    public final void a() {
        r1d r1dVar = (r1d) this.b;
        ReentrantLock reentrantLock = r1dVar.a;
        reentrantLock.lock();
        try {
            r1dVar.m = new j1d(r1dVar, r1dVar.j, r1dVar.k, r1dVar.d, r1dVar.l, reentrantLock, r1dVar.c);
            r1dVar.m.g1();
            r1dVar.b.signalAll();
        } finally {
            r1dVar.a.unlock();
        }
    }

    @Override // zu9
    public final int a0() {
        return ((mkb) this.b).b;
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 0;
        Object obj3 = this.b;
        switch (b) {
            case 25:
                py7 py7Var = (py7) obj3;
                u5d u5dVar = (u5d) obj;
                Bundle B = u5dVar.B();
                B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                l5d l5dVar = new l5d((TaskCompletionSource) obj2, b2);
                try {
                    wcf wcfVar = (wcf) u5dVar.k();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i = ahd.a;
                    obtain.writeInt(1);
                    py7Var.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(l5dVar);
                    try {
                        wcfVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    l5dVar.R(Status.h, null);
                    return;
                }
            default:
                z2f z2fVar = (z2f) ((qnd) obj).k();
                hkd hkdVar = new hkd((TaskCompletionSource) obj2, (byte) 1);
                Parcel R = z2fVar.R();
                int i2 = rgd.a;
                R.writeInt(1);
                ((jb6) obj3).writeToParcel(R, 0);
                rgd.c(R, hkdVar);
                R.writeString(null);
                z2fVar.V(R, 63);
                return;
        }
    }

    @Override // bb2
    public final boolean b() {
        return ((tmb) this.b).a();
    }

    @Override // bb2
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override // bb2
    public final boolean c2(long j) {
        return false;
    }

    @Override // puc
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) hy0.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // rb9, lc9
    public final void d(mc9 mc9Var) {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var != null) {
            ye9 ye9Var = te9Var.a;
            ye9Var.i4(mc9Var);
            ye9Var.p3.g(mc9Var, true);
        }
    }

    @Override // rb9
    public final void d1() {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var != null) {
            ye9 ye9Var = te9Var.a;
            ld9 ld9Var = ye9Var.R3;
            if (ld9Var != null) {
                ld9Var.g();
            }
            ye9Var.p3.onContentChanged();
        }
    }

    @Override // p1d
    public final ig0 e(ig0 ig0Var) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // bb2
    public final boolean e0() {
        return false;
    }

    @Override // bb2
    public final CharacterStyle f0(gb2 gb2Var) {
        return null;
    }

    @Override // gi2
    public final void f1(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // gi2
    public final void g(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // f9d
    public final void g0(String str, long j, long j2, long j3) {
        ndd nddVar = (ndd) this.b;
        try {
            nddVar.a(new vcd(new Status(2103, null, null, null), (byte) 1));
        } catch (IllegalStateException e) {
            dc6 dc6Var = i69.k;
            Log.e(dc6Var.a, dc6Var.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = nddVar.q.i.iterator();
        while (it.hasNext()) {
            ((h69) it.next()).h(str, j, 2103, j2, j3);
        }
    }

    @Override // p1d
    public final void g1() {
        r1d r1dVar = (r1d) this.b;
        Iterator it = ((js) r1dVar.f.values()).iterator();
        while (it.hasNext()) {
            ((xx4) it.next()).c();
        }
        r1dVar.o.G = Collections.EMPTY_SET;
    }

    @Override // bb2
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override // lt8
    public final Object get() {
        return new x5a((h6a) ((kt8) this.b).get());
    }

    @Override // zu9
    public final CharSequence getContentDescription() {
        return String.valueOf(Math.round((((mkb) this.b).a.getProgress() * r1.b) + 0.0f));
    }

    @Override // gi2
    public final long getLongPressDuration() {
        byte b = this.a;
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // puc
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) hy0.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // hk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ik4 ik4Var, fw2 fw2Var) {
        f2 f2Var;
        int i;
        oo9 oo9Var;
        if (fw2Var instanceof f2) {
            f2Var = (f2) fw2Var;
            int i2 = f2Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                f2Var.d = i2 - TLObject.FLAG_31;
                Object obj = f2Var.b;
                i = f2Var.d;
                g5c g5cVar = g5c.a;
                if (i != 0) {
                    qse.b(obj);
                    oo9 oo9Var2 = new oo9(ik4Var, f2Var.getContext());
                    try {
                        f2Var.a = oo9Var2;
                        f2Var.d = 1;
                        try {
                            Object invoke = ((eq4) this.b).invoke(oo9Var2, f2Var);
                            bx2 bx2Var = bx2.a;
                            if (invoke != bx2Var) {
                                invoke = g5cVar;
                            }
                            if (invoke == bx2Var) {
                                return bx2Var;
                            }
                            oo9Var = oo9Var2;
                        } catch (Throwable th) {
                            th = th;
                            oo9Var = oo9Var2;
                            oo9Var.releaseIntercepted();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oo9Var = f2Var.a;
                    try {
                        qse.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        oo9Var.releaseIntercepted();
                        throw th;
                    }
                }
                oo9Var.releaseIntercepted();
                return g5cVar;
            }
        }
        f2Var = new f2(this, fw2Var);
        Object obj2 = f2Var.b;
        i = f2Var.d;
        g5c g5cVar2 = g5c.a;
        if (i != 0) {
        }
        oo9Var.releaseIntercepted();
        return g5cVar2;
    }

    @Override // gi2
    public final void h0() {
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                pg9Var.l0(pg9Var.b0);
                break;
            default:
                ((f6c) this.b).h.c(true);
                break;
        }
    }

    @Override // bb2
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // bb2
    public final boolean i0() {
        return ((tmb) this.b).a();
    }

    @Override // zu9
    public final void j(boolean z, float f) {
        ((mkb) this.b).e.B0(Math.round((r0.b * f) + 0.0f), false);
    }

    @Override // gi2
    public final void k(float f, float f2) {
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                og9 i0 = pg9Var.i0(f, f2);
                og9 og9Var = pg9Var.b0;
                if (i0 != og9Var) {
                    og9Var = null;
                }
                pg9Var.l0(og9Var);
                break;
        }
    }

    @Override // bb2
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override // bb2
    public final boolean l() {
        return true;
    }

    @Override // bb2
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override // rb9
    public final void m() {
        gc9 gc9Var = (gc9) this.b;
        te9 te9Var = gc9Var.T;
        if (te9Var != null) {
            te9Var.a.T3(gc9Var.a);
        }
    }

    @Override // gi2
    public final void n(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // gi2
    public final void n0() {
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                pg9Var.l0(null);
                pg9Var.b0 = null;
                break;
            default:
                ((f6c) this.b).h.c(false);
                break;
        }
    }

    @Override // y1d
    public final void o(ds2 ds2Var) {
        k3d k3dVar = (k3d) this.b;
        ReentrantLock reentrantLock = k3dVar.o;
        reentrantLock.lock();
        try {
            k3dVar.l = ds2Var;
            k3dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // y1d
    public final void o0(int i) {
        ds2 ds2Var;
        k3d k3dVar = (k3d) this.b;
        ReentrantLock reentrantLock = k3dVar.o;
        reentrantLock.lock();
        try {
            if (k3dVar.n || (ds2Var = k3dVar.m) == null || !ds2Var.c()) {
                k3dVar.n = false;
                k3dVar.b.o0(i);
                k3dVar.m = null;
                k3dVar.l = null;
            } else {
                k3dVar.n = true;
                k3dVar.e.onConnectionSuspended(i);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // wz6
    public final void o1(yz6 yz6Var) {
        Toolbar toolbar = (Toolbar) this.b;
        b9 b9Var = toolbar.a.K;
        if (b9Var == null || !b9Var.f()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.a0.c).iterator();
            while (it.hasNext()) {
                ((zn4) it.next()).a.t();
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final /* synthetic */ void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // rb9
    public final fib q0() {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var == null) {
            return null;
        }
        return te9Var.a.getTextSelectionHelper();
    }

    @Override // yr9
    public final void r(int i) {
        ypc ypcVar = (ypc) this.b;
        if (ypcVar.r || i != ypcVar.K) {
            return;
        }
        ypcVar.i0(ypcVar.O.getText().toString().trim());
    }

    @Override // bb2
    public final boolean s0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override // gi2
    public final boolean s1() {
        switch (this.a) {
            case 4:
                return true;
            default:
                return false;
        }
    }

    @Override // yr9
    public final vf6 t1() {
        return null;
    }

    @Override // h86
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        switch (this.a) {
            case 11:
                break;
            default:
                cv7 cv7Var = (cv7) k86Var;
                cv8 cv8Var = (cv8) this.b;
                if (cv8Var.a) {
                    f86 a = cv8.a(cv7Var, j, j2);
                    kp kpVar = (kp) cv8Var.g;
                    kpVar.getClass();
                    kpVar.o(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    break;
                }
                break;
        }
    }

    @Override // h86
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        long j3;
        switch (this.a) {
            case 11:
                ((n53) this.b).a.y(iOException);
                return mv6.y;
            default:
                cv7 cv7Var = (cv7) k86Var;
                i86 i86Var = mv6.y;
                cv8 cv8Var = (cv8) this.b;
                if (cv8Var.a) {
                    int i2 = iOException instanceof lg5 ? ((lg5) iOException).c : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    boolean z = false;
                    if (i2 == 410) {
                        mv6 mv6Var = (mv6) cv8Var.j;
                        mv6Var.getClass();
                        mv6Var.b0(null);
                        cdb cdbVar = (cdb) cv8Var.i;
                        cdbVar.getClass();
                        cdbVar.f();
                        j3 = -9223372036854775807L;
                    } else {
                        j3 = 300000;
                        if (i2 == 429) {
                            List list = (List) cv7Var.d.d.get("Retry-After");
                            if (list != null) {
                                try {
                                    j3 = 1000 * Long.parseLong((String) list.get(0));
                                } catch (NumberFormatException unused) {
                                    lad.f("SteeringManifestTracker", "Retry-After header string doesn't contain a parsable long");
                                }
                            }
                        } else {
                            hya hyaVar = (hya) cv8Var.h;
                            if (hyaVar != null) {
                                long j4 = hyaVar.b;
                                if (j4 != -9223372036854775807L) {
                                    j3 = j4;
                                }
                            }
                        }
                    }
                    byte b = 1;
                    if (j3 != -9223372036854775807L) {
                        cdb cdbVar2 = (cdb) cv8Var.i;
                        cdbVar2.getClass();
                        cdbVar2.a.postDelayed(new jya(cv8Var, b), j3);
                    } else {
                        z = true;
                    }
                    ((cdb) cv8Var.d).e(new k08(this, iOException, z));
                    f86 a = cv8.a(cv7Var, j, j2);
                    kp kpVar = (kp) cv8Var.g;
                    kpVar.getClass();
                    kpVar.s(a, 8, iOException, z);
                }
                return i86Var;
        }
    }

    @Override // bb2
    public final String x(long j) {
        return null;
    }

    @Override // bb2
    public final boolean x0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // rb9
    public final void y0(CharSequence charSequence) {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        te9Var.a.u4(charSequence.toString());
    }

    @Override // bb2
    public final boolean y1() {
        return false;
    }

    @Override // bb2
    public final boolean y2(int i) {
        return false;
    }

    @Override // puc
    public final String[] z0() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // bb2
    public final /* synthetic */ boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    public /* synthetic */ v39(byte b) {
        this.a = b;
    }

    @Override // bb2
    public final void B0() {
    }

    @Override // bb2
    public final void C2() {
    }

    @Override // eob
    public final void K() {
    }

    @Override // bb2
    public final void R1() {
    }

    @Override // bb2
    public final void c() {
    }

    @Override // bb2
    public final void i1() {
    }

    @Override // bb2
    public final void p() {
    }

    @Override // eob
    public final void p1() {
    }

    @Override // bb2
    public final void t() {
    }

    @Override // bb2
    public final void u2() {
    }

    @Override // zu9
    public final void y() {
    }

    @Override // bb2
    public final void D1(h27 h27Var) {
    }

    @Override // bb2
    public final void F(gb2 gb2Var) {
    }

    @Override // eob
    public final void H1(long j) {
    }

    @Override // bb2
    public final void H2(gb2 gb2Var) {
    }

    @Override // bb2
    public final void J(gb2 gb2Var) {
    }

    @Override // eob
    public final void L0(long j) {
    }

    @Override // bb2
    public final void M1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void N0(gb2 gb2Var) {
    }

    @Override // eob
    public final void Q0(boolean z) {
    }

    @Override // bb2
    public final void T(gb2 gb2Var) {
    }

    @Override // bb2
    public final void W(gb2 gb2Var) {
    }

    @Override // bb2
    public final void X0(gb2 gb2Var) {
    }

    @Override // bb2
    public final void X1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void Y(k27 k27Var) {
    }

    @Override // bb2
    public final void Y1(gb2 gb2Var) {
    }

    @Override // eob
    public final void Z0(float f) {
    }

    @Override // eob
    public final void b0(float f) {
    }

    @Override // bb2
    public final void c1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void d0(int i) {
    }

    @Override // eob
    public final void e1(float f) {
    }

    @Override // bb2
    public final void e2(gb2 gb2Var) {
    }

    @Override // eob
    public final void f(int i) {
    }

    @Override // p1d
    public final void i(Bundle bundle) {
    }

    @Override // bb2
    public final void j0(k27 k27Var) {
    }

    @Override // eob
    public final void k0(boolean z) {
    }

    @Override // eob
    public final void k1(float f) {
    }

    @Override // bb2
    public final void l0(String str) {
    }

    @Override // bb2
    public final void l1(gb2 gb2Var) {
    }

    @Override // yr9
    public final void m2(ArrayList arrayList) {
    }

    @Override // bb2
    public final void n1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void q(gb2 gb2Var) {
    }

    @Override // bb2
    public final void q1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void r0(gb2 gb2Var) {
    }

    @Override // p1d
    public final void t0(int i) {
    }

    @Override // eob
    public final void u(float f) {
    }

    @Override // eob
    public final void u0(float f) {
    }

    @Override // eob
    public final void u1(float f) {
    }

    @Override // bb2
    public final void v2(gb2 gb2Var) {
    }

    @Override // eob
    public final void w(float f) {
    }

    @Override // bb2
    public final void x1(gb2 gb2Var) {
    }

    private final void V1(float f, float f2) {
    }

    @Override // eob
    public final void B1(int i, long j) {
    }

    @Override // bb2
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override // bb2
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override // bb2
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override // bb2
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override // bb2
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // eob
    public final void W0(float f, int i) {
    }

    @Override // bb2
    public final void Z(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // bb2
    public final void b2(String str, String str2) {
    }

    @Override // bb2
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override // eob
    public final void j1(float f, int i) {
    }

    @Override // bb2
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // bb2
    public final void m0(gb2 gb2Var, int i) {
    }

    @Override // eob
    public final void p0(float f, int i) {
    }

    @Override // bb2
    public final void v0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // eob
    public final void z(long j, boolean z) {
    }

    private final void h2(View view, float f, float f2) {
    }

    private final void n2(View view, float f, float f2) {
    }

    private final void o2(View view, float f, float f2) {
    }

    private final void p2(View view, float f, float f2) {
    }

    private final void q2(View view, float f, float f2) {
    }

    private final void r2(View view, float f, float f2) {
    }

    @Override // bb2
    public final void A(gb2 gb2Var, float f, float f2) {
    }

    @Override // bb2
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override // bb2
    public final void I(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // bb2
    public final void P(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // bb2
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override // bb2
    public final void Y0(gb2 gb2Var, float f, float f2) {
    }

    @Override // p1d
    public final void a1(ds2 ds2Var, yn ynVar, boolean z) {
    }

    @Override // bb2
    public final void s2(gb2 gb2Var, float f, float f2) {
    }

    @Override // bb2
    public final void v1(gb2 gb2Var, float f, float f2) {
    }

    @Override // bb2
    public final void w0(gb2 gb2Var, int i, int i2) {
    }

    @Override // bb2
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void a2(k86 k86Var, long j, long j2, boolean z) {
    }

    private final void f2(k86 k86Var, long j, long j2, int i) {
    }

    @Override // bb2
    public final void A0(gb2 gb2Var, float f, float f2, boolean z) {
    }

    @Override // bb2
    public final void E(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // bb2
    public final void c0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override // bb2
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // bb2
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // bb2
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // bb2
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }
}
