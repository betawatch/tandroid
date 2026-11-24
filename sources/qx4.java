// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qx4 implements wz6, r07, zu9, t46, aha, d71, kab, imb, ka8, gj, s09, SuccessContinuation, rx9, h86, co7, kt8, f39 {
    public static volatile qx4 b;
    public static volatile qx4 d;
    public final Object a;
    public static final Object c = new Object();
    public static final lbd e = new lbd(2);

    public qx4(byte b2) {
        switch (b2) {
            case 1:
                this.a = new ConcurrentHashMap();
                break;
            case 2:
                jae jaeVar = jae.c;
                xdd xddVar = new xdd(new l8e[]{cff.h, e});
                Charset charset = h3e.a;
                this.a = xddVar;
                break;
            case 23:
                this.a = new hwa(o4c.b);
                break;
            default:
                this.a = new HashSet();
                break;
        }
    }

    public static qx4 I() {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new qx4((byte) 1);
                }
            }
        }
        qx4 qx4Var = d;
        fre.h(qx4Var);
        return qx4Var;
    }

    @Override // wz6
    public final boolean B(yz6 yz6Var, MenuItem menuItem) {
        e9 e9Var = ((ActionMenuView) this.a).Q;
        if (e9Var == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ln8) e9Var).b).a0.c).iterator();
        while (it.hasNext()) {
            if (((zn4) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // s09
    public final boolean C() {
        return false;
    }

    @Override // h86
    public final void C0(k86 k86Var, long j, long j2, int i) {
        cv7 cv7Var = (cv7) k86Var;
        q53 q53Var = (q53) this.a;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        if (i != 0) {
            zxa zxaVar = cv7Var.d;
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
        }
        q53Var.r.u(new f86(e86Var), cv7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // r07
    public final boolean D(yz6 yz6Var) {
        Window.Callback callback;
        bp bpVar = (bp) this.a;
        if (yz6Var != yz6Var.k() || !bpVar.P || (callback = bpVar.f.getCallback()) == null || bpVar.a0) {
            return true;
        }
        callback.onMenuOpened(kk7.s1, yz6Var);
        return true;
    }

    @Override // co7
    public final void D2(Object obj) {
        e16 e16Var = (e16) obj;
        ze3 ze3Var = (ze3) this.a;
        if (e16Var == null || !ze3Var.s0) {
            return;
        }
        w44.d(ze3Var, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
    }

    @Override // imb
    public final void E(boolean z) {
        wjb wjbVar;
        wjb wjbVar2;
        nh1 nh1Var = (nh1) this.a;
        wjbVar = ((d) nh1Var).resourceProvider;
        if (wjbVar instanceof mh1) {
            wjbVar2 = ((d) nh1Var).resourceProvider;
            nh1 nh1Var2 = ((mh1) wjbVar2).a;
            nh1Var2.K = !nh1Var2.K;
            nh1Var2.j1();
            nh1Var2.f1(false);
        }
        nh1Var.a1(a(), false);
        nh1Var.f1(false);
    }

    @Override // t46
    public final void F() {
        ((jc0) this.a).a.invalidate();
    }

    public final fwa G() {
        Object objectVolatile = ex.a.getObjectVolatile((hwa) this.a, hwa.e);
        if (objectVolatile == zad.a) {
            objectVolatile = null;
        }
        return (fwa) objectVolatile;
    }

    @Override // d71
    public final void H() {
        r61 r61Var = (r61) this.a;
        v61 v61Var = r61Var.e0;
        if (v61Var == null || v61Var.j.size() <= 0) {
            return;
        }
        r61Var.e0.d();
        d61 d61Var = r61Var.N;
        if (d61Var != null) {
            d61Var.f(false);
            r61Var.N.e();
        }
    }

    public final StringBuilder J() {
        x1 x1Var = (x1) this.a;
        if (!(x1Var instanceof uu7)) {
            return null;
        }
        StringBuilder sb = ((uu7) x1Var).b.b;
        if (sb.length() != 0) {
            return sb;
        }
        return null;
    }

    public final Set K() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.a);
        }
        return unmodifiableSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r6.a > r2.a) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(fwa fwaVar) {
        Object obj;
        Object obj2;
        fwaVar.getClass();
        hwa hwaVar = (hwa) this.a;
        do {
            Object objectVolatile = ex.a.getObjectVolatile(hwaVar, hwa.e);
            obj = zad.a;
            obj2 = objectVolatile;
            if (objectVolatile == obj) {
                obj2 = null;
            }
            fwa fwaVar2 = (fwa) obj2;
            if (!(fwaVar2 instanceof l19 ? true : rp5.a(fwaVar2, o4c.b))) {
                if (!(fwaVar2 instanceof s53)) {
                    if (!(fwaVar2 instanceof uf4)) {
                        throw new gp2();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (fwaVar2 != null) {
                    obj = fwaVar2;
                }
            }
            fwaVar2 = fwaVar;
            if (obj2 == null) {
            }
            if (fwaVar2 != null) {
            }
        } while (!hwaVar.d(obj2, obj));
    }

    public final void M(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        if ((serviceConnection instanceof h5f) || !concurrentHashMap.containsKey(serviceConnection)) {
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

    public final boolean N(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((ryc.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & TLObject.FLAG_21) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof h5f) {
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

    @Override // aha
    public final float P() {
        io5 io5Var;
        io5Var = ((d) ((ss0) this.a)).mSystemInsets;
        return b00.c(9.66f, dg0.d(io5Var.b), 0);
    }

    @Override // aha
    public final int Q() {
        io5 io5Var;
        io5Var = ((d) ((ss0) this.a)).mSystemInsets;
        return io5Var.d;
    }

    @Override // h86
    public final void U(k86 k86Var, long j, long j2) {
        long j3;
        cv7 cv7Var = (cv7) k86Var;
        q53 q53Var = (q53) this.a;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        q53Var.n.getClass();
        q53Var.r.p(f86Var, cv7Var.c);
        h53 h53Var = (h53) cv7Var.f;
        h53 h53Var2 = q53Var.J;
        int size = h53Var2 == null ? 0 : h53Var2.l.size();
        long j4 = h53Var.b(0).b;
        int i = 0;
        while (i < size && q53Var.J.b(i).b < j4) {
            i++;
        }
        if (h53Var.d) {
            if (size - i > h53Var.l.size()) {
                lad.f("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = q53Var.P;
                j3 = -9223372036854775807L;
                if (j5 == -9223372036854775807L || h53Var.h * 1000 > j5) {
                    q53Var.O = 0;
                } else {
                    lad.f("DashMediaSource", "Loaded stale dynamic manifest: " + h53Var.h + ", " + q53Var.P);
                }
            }
            int i2 = q53Var.O;
            q53Var.O = i2 + 1;
            if (i2 < q53Var.n.v3(cv7Var.c)) {
                q53Var.I.postDelayed(q53Var.w, Math.min((q53Var.O - 1) * 1000, 5000));
                return;
            } else {
                q53Var.H = new bk2();
                return;
            }
        }
        j3 = -9223372036854775807L;
        q53Var.J = h53Var;
        q53Var.K &= h53Var.d;
        q53Var.L = j - j2;
        q53Var.M = j;
        q53Var.Q += i;
        Uri uri = cv7Var.b.a;
        synchronized (q53Var.u) {
            km5 listIterator = q53Var.B.listIterator(0);
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                }
                if (uri.equals(((s96) listIterator.next()).a)) {
                    if (h53Var.m.isEmpty()) {
                        q53Var.B = mm5.u(new s96(jrd.a(cv7Var.d.c)));
                    } else {
                        q53Var.B = h53Var.m;
                    }
                }
            }
        }
        h53 h53Var3 = q53Var.J;
        if (!h53Var3.d || q53Var.N != j3) {
            q53Var.z(true);
            return;
        }
        ce3 ce3Var = h53Var3.i;
        if (ce3Var == null) {
            q53Var.w();
            return;
        }
        String str = ce3Var.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                q53Var.N = g8c.W(ce3Var.c) - q53Var.M;
                q53Var.z(true);
                return;
            } catch (av7 e2) {
                q53Var.y(e2);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            q53Var.A(ce3Var, new p53());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            q53Var.A(ce3Var, new eef((byte) 16));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            q53Var.w();
        } else {
            q53Var.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // imb
    public final boolean a() {
        wjb wjbVar;
        wjb wjbVar2;
        nh1 nh1Var = (nh1) this.a;
        wjbVar = ((d) nh1Var).resourceProvider;
        if (wjbVar == null) {
            return bkb.I.o();
        }
        wjbVar2 = ((d) nh1Var).resourceProvider;
        return wjbVar2.a();
    }

    @Override // zu9
    public final int a0() {
        bx bxVar = (bx) this.a;
        return bxVar.c - bxVar.b;
    }

    @Override // kab
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // d71
    public final void clear() {
        ((r61) this.a).h0();
    }

    @Override // r07
    public final void d(yz6 yz6Var, boolean z) {
        ap apVar;
        bp bpVar = (bp) this.a;
        yz6 k = yz6Var.k();
        int i = 0;
        boolean z2 = k != yz6Var;
        if (z2) {
            yz6Var = k;
        }
        ap[] apVarArr = bpVar.V;
        int length = apVarArr != null ? apVarArr.length : 0;
        while (true) {
            if (i < length) {
                apVar = apVarArr[i];
                if (apVar != null && apVar.h == yz6Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                apVar = null;
                break;
            }
        }
        if (apVar != null) {
            if (!z2) {
                bpVar.h(apVar, z);
            } else {
                bpVar.f(apVar.a, apVar, k);
                bpVar.h(apVar, true);
            }
        }
    }

    @Override // f39
    public final boolean e(float f, float f2, int i, View view) {
        af4 af4Var = (af4) this.a;
        if (view instanceof iba) {
            af4Var.f(((iba) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof lba) {
            af4Var.f(((lba) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof eba) {
            af4Var.f(((eba) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof bw2) {
            af4Var.f(((bw2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof ue3) {
            if (!af4Var.p0.t()) {
                ue3 ue3Var = (ue3) view;
                if (ue3Var.b0(f)) {
                    af4Var.j0.w(ue3Var);
                    return true;
                }
            }
            af4Var.f(((ue3) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // f39
    public final void f() {
        ((af4) this.a).j0.finish();
    }

    @Override // f39
    public final void g(float f) {
        ((af4) this.a).j0.m(f);
    }

    @Override // lt8
    public final Object get() {
        return new c44((mt8) ((mo5) this.a).a);
    }

    @Override // zu9
    public final CharSequence getContentDescription() {
        bx bxVar = (bx) this.a;
        return String.valueOf(Math.round((bxVar.a.getProgress() * (bxVar.c - r0)) + bxVar.b));
    }

    @Override // kab
    public final long h(int i) {
        gre.f(i == 0);
        return 0L;
    }

    @Override // d71
    public final void i(l61 l61Var, u61 u61Var, boolean z) {
        HashSet hashSet;
        int i;
        r61 r61Var = (r61) this.a;
        if (l61Var == null) {
            if (u61Var != null) {
                r61Var.e0.i(u61Var);
                r61Var.N.e();
                r61Var.w0();
                return;
            }
            return;
        }
        if (r61Var.e0.j.size() > 0 || z) {
            v61 v61Var = r61Var.e0;
            HashSet hashSet2 = v61Var.j;
            HashSet hashSet3 = v61Var.l;
            long j = l61Var.a;
            SparseArray sparseArray = l61Var.d;
            if (hashSet3.contains(Long.valueOf(j))) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    ArrayList arrayList = ((m61) sparseArray.valueAt(i2)).b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        u61 u61Var2 = (u61) obj;
                        if (hashSet2.remove(u61Var2)) {
                            v61Var.k -= u61Var2.c;
                        }
                    }
                }
            } else {
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    ArrayList arrayList2 = ((m61) sparseArray.valueAt(i4)).b;
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        u61 u61Var3 = (u61) obj2;
                        if (hashSet2.add(u61Var3)) {
                            v61Var.k += u61Var3.c;
                        }
                    }
                }
            }
            v61Var.c();
            r61Var.N.e();
            r61Var.w0();
            return;
        }
        if (r61Var.H <= 0 || r61Var.getParentActivity() == null) {
            return;
        }
        l61Var.getClass();
        v61 v61Var2 = new v61(true);
        SparseArray sparseArray2 = l61Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = v61Var2.d;
        if (obj3 != null) {
            arrayList3.addAll(((m61) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((m61) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = v61Var2.e;
        if (obj4 != null) {
            arrayList4.addAll(((m61) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = v61Var2.f;
        if (obj5 != null) {
            arrayList5.addAll(((m61) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = v61Var2.g;
        if (obj6 != null) {
            arrayList6.addAll(((m61) sparseArray2.get(4)).b);
        }
        int i6 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = v61Var2.j;
            if (i6 >= size3) {
                break;
            }
            hashSet.add((u61) arrayList3.get(i6));
            if (((u61) arrayList3.get(i6)).d == 0) {
                v61Var2.r += ((u61) arrayList3.get(i6)).c;
                i = i6;
            } else {
                i = i6;
                v61Var2.s += ((u61) arrayList3.get(i)).c;
            }
            i6 = i + 1;
        }
        for (int i7 = 0; i7 < arrayList4.size(); i7++) {
            hashSet.add((u61) arrayList4.get(i7));
            v61Var2.t += ((u61) arrayList4.get(i7)).c;
        }
        for (int i8 = 0; i8 < arrayList5.size(); i8++) {
            hashSet.add((u61) arrayList5.get(i8));
            v61Var2.u += ((u61) arrayList5.get(i8)).c;
        }
        for (int i9 = 0; i9 < arrayList6.size(); i9++) {
            hashSet.add((u61) arrayList6.get(i9));
            v61Var2.v += ((u61) arrayList6.get(i9)).c;
        }
        v61Var2.m = true;
        v61Var2.n = true;
        v61Var2.o = true;
        v61Var2.p = true;
        v61Var2.q = true;
        byte b2 = 14;
        Collections.sort(arrayList3, new sa(b2));
        Collections.sort(arrayList4, new sa(b2));
        Collections.sort(arrayList5, new sa(b2));
        Collections.sort(arrayList6, new sa(b2));
        Collections.sort(v61Var2.h, new sa(b2));
        je3 je3Var = new je3(r61Var, l61Var, v61Var2, new lv6((Object) r61Var, (Object) l61Var, (byte) 11));
        r61Var.a0 = je3Var;
        r61Var.showDialog(je3Var);
    }

    @Override // zu9
    public final void j(boolean z, float f) {
        bx bxVar = (bx) this.a;
        int round = Math.round(((bxVar.c - r6) * f) + bxVar.b);
        if (round != gba.V0) {
            gba.V0 = round;
            SharedPreferences.Editor edit = na7.c1().edit();
            edit.putInt("iv_font_size", gba.V0);
            edit.commit();
            bxVar.f.v0[0].getAdapter().E.clear();
            o oVar = bxVar.f;
            for (int i = 0; i < 2; i++) {
                oVar.v0[i].c.f();
                dx dxVar = oVar.v0[i].c;
                ArrayList arrayList = dxVar.d;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i2);
                    if (pageBlock != null) {
                        pageBlock.cachedWidth = 0;
                        pageBlock.cachedHeight = 0;
                    }
                }
                Utilities.e.a(dxVar.M);
                Utilities.e.d(dxVar.M, 100L);
            }
            bxVar.invalidate();
        }
    }

    @Override // ka8
    public final TextureView k0() {
        return ((mu1) this.a).M8;
    }

    @Override // kab
    public final List l(long j) {
        return j >= 0 ? (List) this.a : Collections.EMPTY_LIST;
    }

    @Override // t46
    public final boolean m() {
        return false;
    }

    @Override // t46
    public final boolean n(float f) {
        return false;
    }

    @Override // aha
    public final void o(boolean z) {
        fm0 fm0Var = ((ss0) this.a).s;
        if (fm0Var != null) {
            fm0Var.a(z, true);
        }
    }

    @Override // wz6
    public final void o1(yz6 yz6Var) {
        v39 v39Var = ((ActionMenuView) this.a).L;
        if (v39Var != null) {
            v39Var.o1(yz6Var);
        }
    }

    @Override // s09
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        fd2 fd2Var = (fd2) this.a;
        fd2Var.a.lb(null, fd2Var.e, fd2Var.b, view, 0.0f, 0.0f, h19Var, false, z, z2, false);
        gl.c3(new hq1(this, (byte) 24));
    }

    @Override // s09
    public final boolean r() {
        return true;
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        e72 e72Var = (e72) this.a;
        e72Var.M(z, i, i2, 0L, false);
        j47 j47Var = e72Var.P;
        if (j47Var != null) {
            j47Var.g();
            e72Var.P = null;
        }
    }

    @Override // kab
    public final int t() {
        return 1;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        q7a q7aVar = (q7a) obj;
        lv6 lv6Var = (lv6) this.a;
        if (q7aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        dy2 dy2Var = (dy2) lv6Var.c;
        yx2 yx2Var = dy2.r;
        dy2Var.h();
        dy2Var.m.h((pz2) dy2Var.e.b, null);
        dy2Var.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override // s09
    public final boolean u() {
        return false;
    }

    @Override // ka8
    public final void u0(k27 k27Var) {
        mu1 mu1Var;
        if (k27Var == null) {
            return;
        }
        if (MediaController.w().D(k27Var)) {
            int i = 0;
            while (true) {
                int childCount = ((mu1) this.a).A0.getChildCount();
                mu1Var = (mu1) this.a;
                if (i >= childCount) {
                    break;
                }
                if (mu1Var.A0.getChildAt(i) instanceof gb2) {
                    gb2 gb2Var = (gb2) ((mu1) this.a).A0.getChildAt(i);
                    if (gb2Var.getMessageObject() != null && gb2Var.getMessageObject().e1() == k27Var.e1()) {
                        km m = gb2Var.getPhotoImage().m();
                        if (m.c0) {
                            m.stop();
                        }
                        Bitmap m2 = m.m();
                        if (m2 != null) {
                            try {
                                jr1 jr1Var = ((mu1) this.a).Ta;
                                int width = m2.getWidth();
                                int height = m2.getHeight();
                                v58 v58Var = jr1Var.d;
                                Bitmap bitmap = v58Var == null ? null : ((TextureView) v58Var.d).getBitmap(width, height);
                                new Canvas(m2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th) {
                                fa4.g(th, true);
                            }
                        }
                    }
                }
                i++;
            }
            mu1Var.X5(true);
            MediaController w = MediaController.w();
            mu1 mu1Var2 = (mu1) this.a;
            w.o0(mu1Var2.M8, mu1Var2.L8, mu1Var2.J8, true);
        }
        ((mu1) this.a).A0.invalidate();
    }

    @Override // h86
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        ((q53) this.a).x((cv7) k86Var, j, j2);
    }

    @Override // imb
    public final boolean w() {
        return false;
    }

    @Override // h86
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        int size;
        int i2;
        s96 s96Var;
        cv7 cv7Var = (cv7) k86Var;
        q53 q53Var = (q53) this.a;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        dd ddVar = new dd((Object) iOException, i, (byte) 8);
        synchronized (q53Var.u) {
            size = q53Var.B.size();
            km5 listIterator = q53Var.B.listIterator(0);
            i2 = 0;
            while (listIterator.hasNext()) {
                Long l = (Long) q53Var.A.get(((s96) listIterator.next()).b);
                if (l != null && l.longValue() > j) {
                    i2++;
                }
            }
        }
        c86 c86Var = new c86(false, size, i2, 1, 0);
        q53Var.n.getClass();
        d86 u3 = i2f.u3(c86Var, ddVar);
        if (u3 != null && u3.a == 1) {
            Uri uri = cv7Var.b.a;
            synchronized (q53Var.u) {
                km5 listIterator2 = q53Var.B.listIterator(0);
                while (true) {
                    if (!listIterator2.hasNext()) {
                        s96Var = null;
                        break;
                    }
                    s96Var = (s96) listIterator2.next();
                    if (uri.equals(s96Var.a)) {
                        break;
                    }
                }
                if (s96Var != null) {
                    q53Var.A.put(s96Var.b, Long.valueOf(u3.b + j));
                }
            }
            if (s96Var != null) {
                q53Var.I.postDelayed(q53Var.w, 0L);
                q53Var.r.s(f86Var, cv7Var.c, iOException, true);
                q53Var.n.getClass();
                return mv6.y;
            }
        }
        q53Var.n.getClass();
        long w3 = i2f.w3(ddVar);
        i86 i86Var = w3 == -9223372036854775807L ? mv6.E : new i86(0, w3);
        boolean a = i86Var.a();
        q53Var.r.s(f86Var, cv7Var.c, iOException, !a);
        if (!a) {
            q53Var.n.getClass();
        }
        return i86Var;
    }

    @Override // ka8
    public final void z(k27 k27Var) {
        mu1 mu1Var = (mu1) this.a;
        mu1Var.A0.J0(true);
        mu1Var.A0.D0();
        if (MediaController.w().D(k27Var)) {
            mu1Var.m1.removeView(mu1Var.J8);
            mu1Var.J8 = null;
            mu1Var.M8 = null;
            mu1Var.L8 = null;
        }
        for (int i = 0; i < mu1Var.A0.getChildCount(); i++) {
            if (mu1Var.A0.getChildAt(i) instanceof gb2) {
                gb2 gb2Var = (gb2) mu1Var.A0.getChildAt(i);
                if (gb2Var.getMessageObject() != null && gb2Var.getMessageObject().e1() == k27Var.e1()) {
                    gb2Var.getPhotoImage().v0(false, true);
                }
            }
        }
    }

    @Override // s09
    public final void A() {
    }

    @Override // t46
    public final void c() {
    }

    @Override // d71
    public final void dismiss() {
    }

    @Override // t46
    public final void p() {
    }

    @Override // zu9
    public final void y() {
    }

    @Override // t46
    public final void k(boolean z) {
    }

    public qx4(yi5 yi5Var) {
        fre.h(yi5Var);
        this.a = yi5Var;
    }

    public /* synthetic */ qx4(Object obj) {
        this.a = obj;
    }

    public qx4(EditText editText) {
        this.a = new tg2(editText);
    }

    @Override // s09
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
