package ui;

import a0.l;
import a8.ia;
import a8.n9;
import a8.p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.i0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import androidx.fragment.app.r;
import c4.m;
import c8.ha;
import com.google.android.gms.common.api.internal.s;
import e2.v0;
import e2.y0;
import h2.j;
import h2.m0;
import h2.x;
import h9.t0;
import h9.t1;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import l.a0;
import l.k;
import m1.b0;
import m1.x0;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.r0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.r80;
import org.telegram.ui.cn;
import org.telegram.ui.cs0;
import org.telegram.ui.i81;
import org.telegram.ui.iy0;
import org.telegram.ui.ly0;
import org.telegram.ui.ny0;
import org.telegram.ui.rw0;
import org.telegram.ui.sw0;
import p4.d0;
import p4.e1;
import p4.i1;
import p4.j1;
import p4.v;
import ug.w0;
import x2.p1;
import y7.i6;
import zd.t;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class e implements m, hi0, ny0 {
    public static volatile e f;
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public v0 A(v vVar) {
        synchronized (this.b) {
            try {
                return ((p4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public e1 B(v vVar) {
        synchronized (this.b) {
            try {
                return ((p4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s C(v vVar) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            return hVar.b;
        }
        return null;
    }

    public boolean D(v vVar) {
        boolean z9;
        synchronized (this.b) {
            z9 = ((a0.f) this.d).get(vVar) != null;
        }
        return z9;
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean E() {
        switch (this.a) {
        }
        return false;
    }

    public boolean F() {
        return ((ArrayList) this.d).isEmpty();
    }

    public boolean G(v vVar, int i7) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        d0 d0Var = (d0) ((WeakReference) this.e).get();
        return hVar != null && hVar.e.a(i7) && d0Var != null && d0Var.t.t().a(i7);
    }

    public boolean H(v vVar, int i7) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            j1 j1Var = hVar.d;
            j1Var.getClass();
            ia.e("Use contains(Command) for custom command", i7 != 0);
            Iterator<E> it = j1Var.a.iterator();
            while (it.hasNext()) {
                if (((i1) it.next()).a == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean I(v vVar, i1 i1Var) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar == null) {
            return false;
        }
        t0 t0Var = hVar.d.a;
        i1Var.getClass();
        return t0Var.contains(i1Var) || p4.d.j(i1Var.b);
    }

    public void J(o0 o0Var) {
        r rVar = o0Var.c;
        String str = rVar.e;
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(rVar.e, o0Var);
        if (i0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rVar);
        }
    }

    public void K(o0 o0Var) {
        HashMap hashMap = (HashMap) this.c;
        r rVar = o0Var.c;
        if (rVar.S) {
            ((l0) this.e).f(rVar);
        }
        if (hashMap.get(rVar.e) == o0Var && ((o0) hashMap.put(rVar.e, null)) != null && i0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ void M() {
        int i7 = this.a;
    }

    public boolean N(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(r(aVar), new l.r((Context) this.c, (l0.a) menuItem));
    }

    public boolean O(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        k.e r10 = r(aVar);
        l lVar = (l) this.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.c, (k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(r10, menu2);
    }

    @Override // c4.m
    public int P() {
        return 2;
    }

    public void S() {
        boolean z9;
        if (((d) this.c) != null) {
            return;
        }
        d dVar = (d) ((ArrayDeque) this.b).pollFirst();
        this.c = dVar;
        if (dVar == null) {
            return;
        }
        b bVar = new b(this, dVar, 0);
        this.d = bVar;
        g0.i3(bVar, 10000L);
        a aVar = dVar.b;
        String str = aVar.b;
        String str2 = aVar.f;
        c cVar = new c(this, dVar);
        ly0 k10 = i.k(str);
        byte[] f10 = i.f(str2);
        int i7 = 0;
        if (k10 != null && f10 != null) {
            try {
                z9 = n9.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                a8.g(th2, true);
                z9 = false;
            }
            if (z9) {
                synchronized (i.y) {
                    i iVar = i.A;
                    if (iVar != null) {
                        iVar.q();
                        i.A = null;
                    }
                    try {
                        i iVar2 = new i(k10, str2, f10);
                        i.A = iVar2;
                        iVar2.x = cVar;
                        r0 r0Var = r0.f;
                        if (r0Var != null) {
                            r0Var.d.add(iVar2);
                        }
                        iVar2.j.execute(new f(iVar2, 1));
                        g0.h3(new f(iVar2, 2));
                        i7 = i.A.i.getLocalPort();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        i iVar3 = i.A;
                        if (iVar3 != null) {
                            iVar3.q();
                            i.A = null;
                        }
                    }
                }
            }
        }
        dVar.d = i7;
        if (i7 == 0) {
            m(dVar);
        }
    }

    public void T(v vVar) {
        synchronized (this.b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.c).remove(hVar.a);
                hVar.b.g();
                d0 d0Var = (d0) ((WeakReference) this.e).get();
                if (d0Var == null || d0Var.j()) {
                    return;
                }
                m0.W(d0Var.l, new p4.e(d0Var, vVar, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean U() {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:25:0x0064, B:29:0x0074), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v5, types: [ie.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object V(kd.c cVar) {
        x0 x0Var;
        int i7;
        ie.d dVar;
        e eVar;
        ie.a aVar;
        Throwable th2;
        e eVar2;
        try {
            if (cVar instanceof x0) {
                x0Var = (x0) cVar;
                int i10 = x0Var.e;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    x0Var.e = i10 - TLObject.FLAG_31;
                    Object obj = x0Var.c;
                    jd.a aVar2 = jd.a.a;
                    i7 = x0Var.e;
                    gd.k kVar = gd.k.a;
                    if (i7 != 0) {
                        af.b.c(obj);
                        if (((t) this.c).A()) {
                            return kVar;
                        }
                        dVar = (ie.d) this.b;
                        x0Var.a = this;
                        x0Var.b = dVar;
                        x0Var.e = 1;
                        if (dVar.d(x0Var) != aVar2) {
                            eVar = this;
                        }
                        return aVar2;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = x0Var.b;
                        eVar2 = x0Var.a;
                        try {
                            af.b.c(obj);
                            ((t) eVar2.c).C(kVar);
                            ((ie.d) aVar).f(null);
                            return kVar;
                        } catch (Throwable th3) {
                            th2 = th3;
                            ((ie.d) aVar).f(null);
                            throw th2;
                        }
                    }
                    ?? r22 = x0Var.b;
                    eVar = x0Var.a;
                    af.b.c(obj);
                    dVar = r22;
                    if (!((t) eVar.c).A()) {
                        dVar.f(null);
                        return kVar;
                    }
                    x0Var.a = eVar;
                    x0Var.b = dVar;
                    x0Var.e = 2;
                    if (eVar.h(x0Var) != aVar2) {
                        aVar = dVar;
                        eVar2 = eVar;
                        ((t) eVar2.c).C(kVar);
                        ((ie.d) aVar).f(null);
                        return kVar;
                    }
                    return aVar2;
                }
            }
            if (!((t) eVar.c).A()) {
            }
        } catch (Throwable th4) {
            aVar = dVar;
            th2 = th4;
            ((ie.d) aVar).f(null);
            throw th2;
        }
        x0Var = new x0(this, cVar);
        Object obj2 = x0Var.c;
        jd.a aVar22 = jd.a.a;
        i7 = x0Var.e;
        gd.k kVar2 = gd.k.a;
        if (i7 != 0) {
        }
    }

    public Bundle W(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.d;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    @Override // org.telegram.ui.ny0
    public void a() {
        g0.i3(new iy0((f2) this.b, (Context) this.c, (h6) this.d, (r80) this.e, 2), 200L);
    }

    public void b(Object obj, v vVar, j1 j1Var, y0 y0Var) {
        synchronized (this.b) {
            try {
                v x10 = x(obj);
                if (x10 == null) {
                    ((a0.f) this.c).put(obj, vVar);
                    a0.f fVar = (a0.f) this.d;
                    s sVar = new s();
                    sVar.c = new Object();
                    sVar.d = new a0.f(0);
                    fVar.put(vVar, new p4.h(obj, sVar, j1Var, y0Var));
                } else {
                    p4.h hVar = (p4.h) ((a0.f) this.d).get(x10);
                    hVar.getClass();
                    hVar.d = j1Var;
                    hVar.e = y0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c4.m
    public /* synthetic */ c4.d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override // org.telegram.ui.ny0
    public void d() {
        g0.i3(new rw0(6, (f2) this.b, (r80) this.e), 200L);
    }

    public void e(r rVar) {
        if (((ArrayList) this.b).contains(rVar)) {
            throw new IllegalStateException("Fragment already added: " + rVar);
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(rVar);
        }
        rVar.w = true;
    }

    public void f(v vVar, int i7, p4.g gVar) {
        synchronized (this.b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    y0 y0Var = hVar.g;
                    y0Var.getClass();
                    ca.i iVar = new ca.i();
                    iVar.c(y0Var.a);
                    iVar.b(i7);
                    hVar.g = new y0(iVar.d());
                    hVar.c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.ny0
    public void g() {
        f2 f2Var = (f2) this.b;
        f2Var.showDialog(new w0(f2Var, 3, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(kd.c cVar) {
        m1.h hVar;
        int i7;
        e eVar;
        m1.c cVar2;
        b0 b0Var = (b0) this.e;
        if (cVar instanceof m1.h) {
            hVar = (m1.h) cVar;
            int i10 = hVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                hVar.d = i10 - TLObject.FLAG_31;
                Object obj = hVar.b;
                jd.a aVar = jd.a.a;
                i7 = hVar.d;
                if (i7 != 0) {
                    af.b.c(obj);
                    List list = (List) this.d;
                    if (list == null || list.isEmpty()) {
                        hVar.a = this;
                        hVar.d = 1;
                        obj = b0.f(b0Var, false, hVar);
                        if (obj != aVar) {
                            eVar = this;
                            cVar2 = (m1.c) obj;
                        }
                    } else {
                        m1.m0 g10 = b0Var.g();
                        m1.k kVar = new m1.k(b0Var, this, null);
                        hVar.a = this;
                        hVar.d = 2;
                        obj = g10.c(kVar, hVar);
                        if (obj != aVar) {
                            eVar = this;
                            cVar2 = (m1.c) obj;
                        }
                    }
                    return aVar;
                }
                if (i7 == 1) {
                    eVar = hVar.a;
                    af.b.c(obj);
                    cVar2 = (m1.c) obj;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = hVar.a;
                    af.b.c(obj);
                    cVar2 = (m1.c) obj;
                }
                ((b0) eVar.e).h.h2(cVar2);
                return gd.k.a;
            }
        }
        hVar = new m1.h(this, cVar);
        Object obj2 = hVar.b;
        jd.a aVar2 = jd.a.a;
        i7 = hVar.d;
        if (i7 != 0) {
        }
        ((b0) eVar.e).h.h2(cVar2);
        return gd.k.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    @Override // org.telegram.ui.Components.hi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        float f10;
        ch.p0 p0Var;
        ch.m0 k10;
        float f11;
        int i7;
        float f12;
        float f13;
        ch.p0 p0Var2;
        ch.m0 k11;
        float f14;
        int i10;
        float f15;
        switch (this.a) {
            case 9:
                cn cnVar = (cn) this.b;
                z I8 = cnVar.I8(((ij) this.c).e1(), true);
                float f16 = 0.0f;
                if (I8 instanceof q1) {
                    ch.p0 p0Var3 = ((q1) I8).N;
                    ch.m0 k12 = p0Var3.k(o0Var);
                    if (k12 == null) {
                        f12 = 0.0f;
                        f10 = f12;
                        cnVar.Db(I8, (ij) this.c, (ii0) this.d, view, f16, f10, o0Var, false, (o0Var == null && o0Var.a) ? true : z9, z10, false);
                        ((cs0) this.e).c(false);
                        break;
                    } else {
                        f16 = p0Var3.b + k12.w + (k12.z / 2.0f);
                        f11 = p0Var3.c + k12.x;
                        i7 = k12.A;
                    }
                } else if (!(I8 instanceof org.telegram.ui.Cells.t0) || (k10 = (p0Var = ((org.telegram.ui.Cells.t0) I8).E0).k(o0Var)) == null) {
                    f10 = 0.0f;
                    cnVar.Db(I8, (ij) this.c, (ii0) this.d, view, f16, f10, o0Var, false, (o0Var == null && o0Var.a) ? true : z9, z10, false);
                    ((cs0) this.e).c(false);
                } else {
                    f16 = p0Var.b + k10.w + (k10.z / 2.0f);
                    f11 = p0Var.c + k10.x;
                    i7 = k10.A;
                }
                f12 = f11 + (i7 / 2.0f);
                f10 = f12;
                cnVar.Db(I8, (ij) this.c, (ii0) this.d, view, f16, f10, o0Var, false, (o0Var == null && o0Var.a) ? true : z9, z10, false);
                ((cs0) this.e).c(false);
                break;
            default:
                cn cnVar2 = (cn) this.b;
                z I82 = cnVar2.I8(((ij) this.c).e1(), true);
                float f17 = 0.0f;
                if (I82 instanceof q1) {
                    ch.p0 p0Var4 = ((q1) I82).N;
                    ch.m0 k13 = p0Var4.k(o0Var);
                    if (k13 == null) {
                        f15 = 0.0f;
                        f13 = f15;
                        cnVar2.Db(I82, (ij) this.c, (ii0) this.d, view, f17, f13, o0Var, false, (o0Var == null && o0Var.a) ? true : z9, z10, false);
                        ((i81) this.e).c(false);
                        break;
                    } else {
                        f17 = p0Var4.b + k13.w + (k13.z / 2.0f);
                        f14 = p0Var4.c + k13.x;
                        i10 = k13.A;
                    }
                } else if (!(I82 instanceof org.telegram.ui.Cells.t0) || (k11 = (p0Var2 = ((org.telegram.ui.Cells.t0) I82).E0).k(o0Var)) == null) {
                    f13 = 0.0f;
                    cnVar2.Db(I82, (ij) this.c, (ii0) this.d, view, f17, f13, o0Var, false, (o0Var == null && o0Var.a) ? true : z9, z10, false);
                    ((i81) this.e).c(false);
                } else {
                    f17 = p0Var2.b + k11.w + (k11.z / 2.0f);
                    f14 = p0Var2.c + k11.x;
                    i10 = k11.A;
                }
                f15 = f14 + (i10 / 2.0f);
                f13 = f15;
                cnVar2.Db(I82, (ij) this.c, (ii0) this.d, view, f17, f13, o0Var, false, (o0Var == null && o0Var.a) ? true : z9, z10, false);
                ((i81) this.e).c(false);
                break;
        }
    }

    public void j(Canvas canvas, int i7) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i7, g0.L(14.66f));
        RectF rectF = g0.P;
        float f10 = i7;
        rectF.set(0.0f, 0.0f, f10, g0.L(14.66f));
        canvas.saveLayerAlpha(rectF, qs.e4, 31);
        if (id.a0) {
            canvas.translate(f10, 0.0f);
        }
        int L = i7 - g0.L(25.0f);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            lr lrVar = (lr) arrayList.get(i10);
            L = q.w(4.0f, lrVar.g, L);
            if (L < 0) {
                break;
            }
            if (id.a0) {
                canvas.translate(-lrVar.g, 0.0f);
                lrVar.a(canvas);
                canvas.translate(-g0.L(4.0f), 0.0f);
            } else {
                lrVar.a(canvas);
                canvas.translate(g0.L(4.0f) + lrVar.g, 0.0f);
            }
            i10++;
        }
        if (i10 < arrayList.size()) {
            int size = arrayList.size() - i10;
            lr lrVar2 = (lr) this.e;
            if (lrVar2 == null || lrVar2.a != size) {
                t2 t2Var = (t2) this.b;
                lr lrVar3 = new lr();
                lrVar3.a = size;
                my0 my0Var = new my0(jg.g.j(size, "+"), 10.0f, g0.o());
                my0Var.r(t2Var);
                lrVar3.c = my0Var;
                int L2 = g0.L(9.32f);
                my0 my0Var2 = lrVar3.c;
                lrVar3.g = L2 + ((int) my0Var2.c);
                my0Var2.i();
                int i11 = m6.n8;
                lrVar3.f = i11;
                lrVar3.e = true;
                lrVar3.d = m6.x0(null, i11, false);
                this.e = lrVar3;
            }
            if (id.a0) {
                canvas.translate(-((lr) this.e).g, 0.0f);
                ((lr) this.e).a(canvas);
                canvas.translate(-g0.L(4.0f), 0.0f);
            } else {
                ((lr) this.e).a(canvas);
                canvas.translate(g0.L(4.0f) + ((lr) this.e).g, 0.0f);
            }
        }
        canvas.restore();
    }

    public void m(d dVar) {
        if (((d) this.c) != dVar) {
            return;
        }
        b bVar = (b) this.d;
        if (bVar != null) {
            g0.r(bVar);
            this.d = null;
        }
        b bVar2 = (b) this.e;
        if (bVar2 != null) {
            g0.r(bVar2);
            this.e = null;
        }
        synchronized (i.y) {
            try {
                i iVar = i.A;
                if (iVar != null) {
                    iVar.q();
                    i.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.c = null;
        dVar.c.run(-1L);
        S();
    }

    public r n(String str) {
        o0 o0Var = (o0) ((HashMap) this.c).get(str);
        if (o0Var != null) {
            return o0Var.c;
        }
        return null;
    }

    public r o(String str) {
        for (o0 o0Var : ((HashMap) this.c).values()) {
            if (o0Var != null) {
                r rVar = o0Var.c;
                if (!str.equals(rVar.e)) {
                    rVar = rVar.L.c.o(str);
                }
                if (rVar != null) {
                    return rVar;
                }
            }
        }
        return null;
    }

    public void p(p4.h hVar) {
        d0 d0Var = (d0) ((WeakReference) this.e).get();
        if (d0Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            p4.g gVar = (p4.g) hVar.c.poll();
            if (gVar == null) {
                hVar.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            p4.h hVar2 = hVar;
            m0.W(d0Var.l, new org.telegram.ui.web.s(d0Var, x(hVar.a), new sw0(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 9)));
            atomicBoolean2.set(false);
            hVar = hVar2;
        }
    }

    public void q(final v vVar) {
        synchronized (this.b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return;
                }
                final y0 y0Var = hVar.g;
                hVar.g = y0.b;
                hVar.c.add(new p4.g(vVar, y0Var) { // from class: p4.f
                    public final /* synthetic */ v b;

                    @Override // p4.g
                    public final m9.y run() {
                        d0 d0Var = (d0) ((WeakReference) ui.e.this.e).get();
                        if (d0Var != null) {
                            d0Var.p(this.b);
                        }
                        return m9.w.b;
                    }
                });
                if (hVar.f) {
                    return;
                }
                hVar.f = true;
                p(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e r(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            k.e eVar = (k.e) arrayList.get(i7);
            if (eVar != null && eVar.b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList s() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var);
            }
        }
        return arrayList;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return ((i6) this.e).toString();
            default:
                return super.toString();
        }
    }

    public y0 u(v vVar) {
        synchronized (this.b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return null;
                }
                return hVar.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean v() {
        switch (this.a) {
        }
        return true;
    }

    public h9.i0 w() {
        h9.i0 q10;
        synchronized (this.b) {
            q10 = h9.i0.q(((a0.f) this.c).values());
        }
        return q10;
    }

    public v x(Object obj) {
        v vVar;
        synchronized (this.b) {
            vVar = (v) ((a0.f) this.c).get(obj);
        }
        return vVar;
    }

    public List y() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    @Override // c4.m
    public void z(byte[] bArr, int i7, int i10, c4.l lVar, j jVar) {
        g2.b bVar;
        int i11;
        int i12;
        int i13;
        int D;
        f4.a aVar = (f4.a) this.d;
        x xVar = (x) this.c;
        x xVar2 = (x) this.b;
        xVar2.L(i7 + i10, bArr);
        xVar2.N(i7);
        if (((Inflater) this.e) == null) {
            this.e = new Inflater();
        }
        if (m0.Q(xVar2, xVar, (Inflater) this.e)) {
            xVar2.L(xVar.c, xVar.a);
        }
        int i14 = 0;
        aVar.d = 0;
        int[] iArr = aVar.b;
        x xVar3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        xVar3.K(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i15 = xVar2.c;
            int A = xVar2.A();
            int H = xVar2.H();
            int i16 = xVar2.b + H;
            if (i16 > i15) {
                xVar2.N(i15);
                i11 = i14;
                bVar = null;
            } else {
                char c10 = 128;
                if (A != 128) {
                    switch (A) {
                        case 20:
                            if (H % 5 == 2) {
                                xVar2.O(2);
                                Arrays.fill(iArr, i14);
                                int i17 = H / 5;
                                int i18 = i14;
                                while (i18 < i17) {
                                    int A2 = xVar2.A();
                                    char c11 = c10;
                                    double A3 = xVar2.A();
                                    double A4 = xVar2.A() - 128;
                                    double A5 = xVar2.A() - 128;
                                    iArr[A2] = m0.i((int) ((A5 * 1.772d) + A3), 0, qs.e4) | (xVar2.A() << 24) | (m0.i((int) ((1.402d * A4) + A3), 0, qs.e4) << 16) | (m0.i((int) ((A3 - (0.34414d * A5)) - (A4 * 0.71414d)), 0, qs.e4) << 8);
                                    i18++;
                                    c10 = c11;
                                    aVar = aVar;
                                }
                                aVar.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                xVar2.O(3);
                                int i19 = H - 4;
                                if (((128 & xVar2.A()) != 0 ? 1 : i14) != 0) {
                                    if (i19 >= 7 && (D = xVar2.D()) >= 4) {
                                        aVar.h = xVar2.H();
                                        aVar.i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i19 = H - 11;
                                    }
                                }
                                int i20 = xVar3.b;
                                int i21 = xVar3.c;
                                if (i20 < i21 && i19 > 0) {
                                    int min = Math.min(i19, i21 - i20);
                                    xVar2.k(i20, min, xVar3.a);
                                    xVar3.N(i20 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = xVar2.H();
                                aVar.e = xVar2.H();
                                xVar2.O(11);
                                aVar.f = xVar2.H();
                                aVar.g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i11 = 0;
                    bVar = null;
                } else {
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i12 = xVar3.c) == 0 || xVar3.b != i12 || !aVar.c) {
                        bVar = null;
                    } else {
                        xVar3.N(0);
                        int i22 = aVar.h * aVar.i;
                        int[] iArr2 = new int[i22];
                        int i23 = 0;
                        while (i23 < i22) {
                            int A6 = xVar3.A();
                            if (A6 != 0) {
                                i13 = i23 + 1;
                                iArr2[i23] = iArr[A6];
                            } else {
                                int A7 = xVar3.A();
                                if (A7 != 0) {
                                    i13 = ((A7 & 64) == 0 ? A7 & 63 : ((A7 & 63) << 8) | xVar3.A()) + i23;
                                    Arrays.fill(iArr2, i23, i13, (A7 & 128) == 0 ? iArr[0] : iArr[xVar3.A()]);
                                }
                            }
                            i23 = i13;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.f;
                        float f11 = aVar.d;
                        float f12 = f10 / f11;
                        float f13 = aVar.g;
                        float f14 = aVar.e;
                        bVar = new g2.b(null, null, null, createBitmap, f13 / f14, 0, 0, f12, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f11, aVar.i / f14, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                    }
                    i11 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    xVar3.K(0);
                    aVar.c = false;
                }
                xVar2.N(i16);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i14 = i11;
        }
        jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, boolean z9, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public e(t2 t2Var) {
        this.a = 8;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = null;
        this.b = t2Var;
    }

    public e(int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            case 2:
                this.b = new x();
                this.c = new x();
                this.d = new f4.a();
                break;
            case 7:
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                break;
            default:
                this.b = new ArrayDeque();
                break;
        }
    }

    public e(d0 d0Var) {
        this.a = 12;
        this.c = new a0.f(0);
        this.d = new a0.f(0);
        this.b = new Object();
        this.e = new WeakReference(d0Var);
    }

    public e(Context context, ActionMode.Callback callback) {
        this.a = 4;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new l(0);
    }

    public e(ng.e eVar) {
        this.a = 6;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(g0.L(4.0f), g0.L(2.0f), g0.L(4.0f), g0.L(2.0f));
        if (eVar.E) {
            TextView textView = new TextView(eVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = g0.L(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(g0.o());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(eVar.getContext());
        this.c = textView2;
        linearLayout.addView(textView2, ha.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        p5 p5Var = new p5(eVar.getContext());
        this.b = p5Var;
        linearLayout.addView(p5Var, ha.o(-1, -2));
        textView2.setGravity(8388611);
        p5Var.setGravity(8388613);
        p5Var.setTypeface(g0.o());
        p5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public e(t1 t1Var, i2.i iVar, q4.q qVar, i2.i iVar2) {
        Object obj;
        this.a = 3;
        if (t1Var != null) {
            obj = h9.i0.q(t1Var);
        } else {
            h9.g0 g0Var = h9.i0.b;
            obj = t1.e;
        }
        this.b = obj;
        this.c = iVar;
        this.d = qVar;
        this.e = iVar2;
    }

    public e(b0 b0Var, List list) {
        this.a = 5;
        this.e = b0Var;
        this.b = new ie.d();
        this.c = zd.b0.a();
        this.d = hd.f.l(list);
    }

    public e(p1 p1Var, boolean[] zArr) {
        this.a = 14;
        this.b = p1Var;
        this.c = zArr;
        int i7 = p1Var.a;
        this.d = new boolean[i7];
        this.e = new boolean[i7];
    }

    private final /* synthetic */ void Q() {
    }

    private final /* synthetic */ void R() {
    }

    @Override // c4.m
    public /* synthetic */ void reset() {
    }

    private final /* synthetic */ void k(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }

    private final /* synthetic */ void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
