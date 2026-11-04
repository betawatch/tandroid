package ui;

import a0.l;
import ai.f2;
import ai.t6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.emoji2.text.t;
import b4.m;
import b8.ke;
import b8.p9;
import b8.zb;
import com.google.android.gms.common.api.internal.s;
import d2.a1;
import d2.x0;
import dh.l0;
import dh.o0;
import g2.n0;
import g2.y;
import g9.i0;
import g9.t0;
import gi.n3;
import gi.w5;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import k2.p1;
import l.a0;
import l.k;
import l.r;
import o4.e0;
import o4.j1;
import o4.n1;
import o4.o1;
import o4.v;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.r0;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.pr0;
import org.telegram.ui.qv0;
import org.telegram.ui.vx0;
import org.telegram.ui.w71;
import org.telegram.ui.wm;
import org.telegram.ui.zx0;
import p4.q;
import vg.v0;
import x7.n6;
import za.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class f implements m, ki0, zx0, p5.b {
    public static volatile f f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ f(int i3, boolean z10) {
        this.a = i3;
    }

    public boolean A(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(l(aVar), new r((Context) this.c, (l0.a) menuItem));
    }

    @Override // b4.m
    public /* synthetic */ b4.d B(int i3, int i10, byte[] bArr) {
        return a1.g.a(this, bArr, i10);
    }

    public boolean C(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        k.e l10 = l(aVar);
        l lVar = (l) this.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.c, (k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(l10, menu2);
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
        int i10 = this.a;
    }

    @Override // b4.m
    public void F(byte[] bArr, int i3, int i10, b4.l lVar, g2.k kVar) {
        f2.b bVar;
        int i11;
        int i12;
        int i13;
        int D;
        e4.a aVar = (e4.a) this.d;
        y yVar = (y) this.c;
        y yVar2 = (y) this.b;
        yVar2.L(i3 + i10, bArr);
        yVar2.N(i3);
        if (((Inflater) this.e) == null) {
            this.e = new Inflater();
        }
        if (n0.Q(yVar2, yVar, (Inflater) this.e)) {
            yVar2.L(yVar.c, yVar.a);
        }
        int i14 = 0;
        aVar.d = 0;
        int[] iArr = aVar.b;
        y yVar3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        yVar3.K(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (yVar2.a() >= 3) {
            int i15 = yVar2.c;
            int A = yVar2.A();
            int H = yVar2.H();
            int i16 = yVar2.b + H;
            if (i16 > i15) {
                yVar2.N(i15);
                i11 = i14;
                bVar = null;
            } else {
                char c2 = 128;
                if (A != 128) {
                    switch (A) {
                        case 20:
                            if (H % 5 == 2) {
                                yVar2.O(2);
                                Arrays.fill(iArr, i14);
                                int i17 = H / 5;
                                int i18 = i14;
                                while (i18 < i17) {
                                    int A2 = yVar2.A();
                                    char c10 = c2;
                                    double A3 = yVar2.A();
                                    double A4 = yVar2.A() - 128;
                                    double A5 = yVar2.A() - 128;
                                    iArr[A2] = n0.i((int) ((A5 * 1.772d) + A3), 0, hs.e4) | (yVar2.A() << 24) | (n0.i((int) ((1.402d * A4) + A3), 0, hs.e4) << 16) | (n0.i((int) ((A3 - (0.34414d * A5)) - (A4 * 0.71414d)), 0, hs.e4) << 8);
                                    i18++;
                                    c2 = c10;
                                    aVar = aVar;
                                }
                                aVar.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                yVar2.O(3);
                                int i19 = H - 4;
                                if (((128 & yVar2.A()) != 0 ? 1 : i14) != 0) {
                                    if (i19 >= 7 && (D = yVar2.D()) >= 4) {
                                        aVar.h = yVar2.H();
                                        aVar.i = yVar2.H();
                                        yVar3.K(D - 4);
                                        i19 = H - 11;
                                    }
                                }
                                int i20 = yVar3.b;
                                int i21 = yVar3.c;
                                if (i20 < i21 && i19 > 0) {
                                    int min = Math.min(i19, i21 - i20);
                                    yVar2.k(i20, min, yVar3.a);
                                    yVar3.N(i20 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = yVar2.H();
                                aVar.e = yVar2.H();
                                yVar2.O(11);
                                aVar.f = yVar2.H();
                                aVar.g = yVar2.H();
                                break;
                            }
                            break;
                    }
                    i11 = 0;
                    bVar = null;
                } else {
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i12 = yVar3.c) == 0 || yVar3.b != i12 || !aVar.c) {
                        bVar = null;
                    } else {
                        yVar3.N(0);
                        int i22 = aVar.h * aVar.i;
                        int[] iArr2 = new int[i22];
                        int i23 = 0;
                        while (i23 < i22) {
                            int A6 = yVar3.A();
                            if (A6 != 0) {
                                i13 = i23 + 1;
                                iArr2[i23] = iArr[A6];
                            } else {
                                int A7 = yVar3.A();
                                if (A7 != 0) {
                                    i13 = ((A7 & 64) == 0 ? A7 & 63 : ((A7 & 63) << 8) | yVar3.A()) + i23;
                                    Arrays.fill(iArr2, i23, i13, (A7 & 128) == 0 ? iArr[0] : iArr[yVar3.A()]);
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
                        bVar = new f2.b(null, null, null, createBitmap, f13 / f14, 0, 0, f12, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f11, aVar.i / f14, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                    }
                    i11 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    yVar3.K(0);
                    aVar.c = false;
                }
                yVar2.N(i16);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i14 = i11;
        }
        kVar.accept(new b4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public gf.f H(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        df.g gVar = new df.g((ArrayList) this.b, (hf.b) this.d, (ArrayList) this.c);
        int i3 = 0;
        while (true) {
            int length = str.length();
            int i10 = i3;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                char charAt = str.charAt(i10);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                break;
            }
            gVar.i(str.substring(i3, i10));
            i3 = i10 + 1;
            if (i3 < str.length() && str.charAt(i10) == '\r' && str.charAt(i3) == '\n') {
                i3 = i10 + 2;
            }
        }
        if (str.length() > 0 && (i3 == 0 || i3 < str.length())) {
            gVar.i(str.substring(i3));
        }
        gVar.f(gVar.n);
        hf.a A = gVar.j.A(new q(gVar.k, gVar.m));
        Iterator it = gVar.o.iterator();
        while (it.hasNext()) {
            ((jf.a) it.next()).g(A);
        }
        gf.f fVar = (gf.f) gVar.l.b;
        Iterator it2 = ((ArrayList) this.e).iterator();
        if (it2.hasNext()) {
            throw a1.g.m(it2);
        }
        return fVar;
    }

    public void I() {
        boolean z10;
        if (((e) this.c) != null) {
            return;
        }
        e eVar = (e) ((ArrayDeque) this.b).pollFirst();
        this.c = eVar;
        if (eVar == null) {
            return;
        }
        c cVar = new c(this, eVar, 0);
        this.d = cVar;
        g0.i3(cVar, 10000L);
        a aVar = eVar.b;
        String str = aVar.b;
        String str2 = aVar.f;
        d dVar = new d(this, eVar);
        p7.d k10 = j.k(str);
        byte[] f10 = j.f(str2);
        int i3 = 0;
        if (k10 != null && f10 != null) {
            try {
                z10 = p9.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                a8.g(th2, true);
                z10 = false;
            }
            if (z10) {
                synchronized (j.y) {
                    j jVar = j.A;
                    if (jVar != null) {
                        jVar.q();
                        j.A = null;
                    }
                    try {
                        j jVar2 = new j(k10, str2, f10);
                        j.A = jVar2;
                        jVar2.x = dVar;
                        r0 r0Var = r0.f;
                        if (r0Var != null) {
                            r0Var.d.add(jVar2);
                        }
                        jVar2.j.execute(new g(jVar2, 1));
                        g0.h3(new g(jVar2, 2));
                        i3 = j.A.i.getLocalPort();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        j jVar3 = j.A;
                        if (jVar3 != null) {
                            jVar3.q();
                            j.A = null;
                        }
                    }
                }
            }
        }
        eVar.d = i3;
        if (i3 == 0) {
            h(eVar);
        }
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ void J() {
        int i3 = this.a;
    }

    public void K(v vVar) {
        synchronized (this.b) {
            try {
                o4.h hVar = (o4.h) ((a0.f) this.d).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.c).remove(hVar.a);
                hVar.b.g();
                e0 e0Var = (e0) ((WeakReference) this.e).get();
                if (e0Var == null || e0Var.j()) {
                    return;
                }
                n0.W(e0Var.l, new o4.e(e0Var, vVar, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void L(View view) {
        f2 f2Var = (f2) this.e;
        if (((View) this.c) == view) {
            return;
        }
        M(null);
        View view2 = (View) this.c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(f2Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(f2Var);
            if (view.isAttachedToWindow()) {
                M(view.getViewTreeObserver());
            }
        }
        this.c = view;
    }

    public void M(ViewTreeObserver viewTreeObserver) {
        n3 n3Var = (n3) this.b;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.d;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.d).removeOnGlobalLayoutListener(n3Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(n3Var);
        }
        this.d = viewTreeObserver;
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean O() {
        switch (this.a) {
        }
        return false;
    }

    @Override // b4.m
    public int Y() {
        return 2;
    }

    public void a(Object obj, v vVar, o1 o1Var, a1 a1Var) {
        synchronized (this.b) {
            try {
                v o10 = o(obj);
                if (o10 == null) {
                    ((a0.f) this.c).put(obj, vVar);
                    a0.f fVar = (a0.f) this.d;
                    s sVar = new s();
                    sVar.c = new Object();
                    sVar.d = new a0.f(0);
                    fVar.put(vVar, new o4.h(obj, sVar, o1Var, a1Var));
                } else {
                    o4.h hVar = (o4.h) ((a0.f) this.d).get(o10);
                    hVar.getClass();
                    hVar.d = o1Var;
                    hVar.e = a1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(v vVar, int i3, o4.g gVar) {
        synchronized (this.b) {
            try {
                o4.h hVar = (o4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    a1 a1Var = hVar.g;
                    a1Var.getClass();
                    ba.i iVar = new ba.i();
                    iVar.c(a1Var.a);
                    iVar.b(i3);
                    hVar.g = new a1(iVar.d());
                    hVar.c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(Canvas canvas, int i3) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i3, g0.L(14.66f));
        RectF rectF = g0.P;
        float f10 = i3;
        rectF.set(0.0f, 0.0f, f10, g0.L(14.66f));
        canvas.saveLayerAlpha(rectF, hs.e4, 31);
        if (bd.a0) {
            canvas.translate(f10, 0.0f);
        }
        int L = i3 - g0.L(25.0f);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            mr mrVar = (mr) arrayList.get(i10);
            L = org.telegram.messenger.camera.q.w(4.0f, mrVar.g, L);
            if (L < 0) {
                break;
            }
            if (bd.a0) {
                canvas.translate(-mrVar.g, 0.0f);
                mrVar.a(canvas);
                canvas.translate(-g0.L(4.0f), 0.0f);
            } else {
                mrVar.a(canvas);
                canvas.translate(g0.L(4.0f) + mrVar.g, 0.0f);
            }
            i10++;
        }
        if (i10 < arrayList.size()) {
            int size = arrayList.size() - i10;
            mr mrVar2 = (mr) this.e;
            if (mrVar2 == null || mrVar2.a != size) {
                t2 t2Var = (t2) this.b;
                mr mrVar3 = new mr();
                mrVar3.a = size;
                ly0 ly0Var = new ly0(p1.i(size, "+"), 10.0f, g0.o());
                ly0Var.r(t2Var);
                mrVar3.c = ly0Var;
                int L2 = g0.L(9.32f);
                ly0 ly0Var2 = mrVar3.c;
                mrVar3.g = L2 + ((int) ly0Var2.c);
                ly0Var2.i();
                int i11 = k6.n8;
                mrVar3.f = i11;
                mrVar3.e = true;
                mrVar3.d = k6.x0(null, i11, false);
                this.e = mrVar3;
            }
            if (bd.a0) {
                canvas.translate(-((mr) this.e).g, 0.0f);
                ((mr) this.e).a(canvas);
                canvas.translate(-g0.L(4.0f), 0.0f);
            } else {
                ((mr) this.e).a(canvas);
                canvas.translate(g0.L(4.0f) + ((mr) this.e).g, 0.0f);
            }
        }
        canvas.restore();
    }

    @Override // org.telegram.ui.zx0
    public void f() {
        g0.i3(new vx0((d2) this.b, (Context) this.c, (e6) this.d, (j50) this.e, 2), 200L);
    }

    @Override // org.telegram.ui.zx0
    public void g() {
        g0.i3(new qv0(9, (d2) this.b, (j50) this.e), 200L);
    }

    @Override // cd.a
    public Object get() {
        return new p((Executor) ((cd.a) this.b).get(), (u5.d) ((cd.a) this.c).get(), (p7.d) ((p7.d) this.d).get(), (v5.c) ((cd.a) this.e).get());
    }

    public void h(e eVar) {
        if (((e) this.c) != eVar) {
            return;
        }
        c cVar = (c) this.d;
        if (cVar != null) {
            g0.r(cVar);
            this.d = null;
        }
        c cVar2 = (c) this.e;
        if (cVar2 != null) {
            g0.r(cVar2);
            this.e = null;
        }
        synchronized (j.y) {
            try {
                j jVar = j.A;
                if (jVar != null) {
                    jVar.q();
                    j.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.c = null;
        eVar.c.run(-1L);
        I();
    }

    @Override // org.telegram.ui.zx0
    public void i() {
        d2 d2Var = (d2) this.b;
        d2Var.showDialog(new v0(d2Var, 3, true));
    }

    public void j(o4.h hVar) {
        e0 e0Var = (e0) ((WeakReference) this.e).get();
        if (e0Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            o4.g gVar = (o4.g) hVar.c.poll();
            if (gVar == null) {
                hVar.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            o4.h hVar2 = hVar;
            n0.W(e0Var.l, new m2.s(e0Var, o(hVar.a), new t6(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 19)));
            atomicBoolean2.set(false);
            hVar = hVar2;
        }
    }

    public void k(final v vVar) {
        synchronized (this.b) {
            try {
                o4.h hVar = (o4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return;
                }
                final a1 a1Var = hVar.g;
                hVar.g = a1.b;
                hVar.c.add(new o4.g(vVar, a1Var) { // from class: o4.f
                    public final /* synthetic */ v b;

                    @Override // o4.g
                    public final l9.y run() {
                        e0 e0Var = (e0) ((WeakReference) ui.f.this.e).get();
                        if (e0Var != null) {
                            e0Var.p(this.b);
                        }
                        return l9.w.b;
                    }
                });
                if (hVar.f) {
                    return;
                }
                hVar.f = true;
                j(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e l(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k.e eVar = (k.e) arrayList.get(i3);
            if (eVar != null && eVar.b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public a1 m(v vVar) {
        synchronized (this.b) {
            try {
                o4.h hVar = (o4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return null;
                }
                return hVar.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i0 n() {
        i0 q10;
        synchronized (this.b) {
            q10 = i0.q(((a0.f) this.c).values());
        }
        return q10;
    }

    public v o(Object obj) {
        v vVar;
        synchronized (this.b) {
            vVar = (v) ((a0.f) this.c).get(obj);
        }
        return vVar;
    }

    public x0 p(v vVar) {
        synchronized (this.b) {
            try {
                return ((o4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public j1 q(v vVar) {
        synchronized (this.b) {
            try {
                return ((o4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean r() {
        switch (this.a) {
        }
        return true;
    }

    public s s(v vVar) {
        o4.h hVar;
        synchronized (this.b) {
            hVar = (o4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            return hVar.b;
        }
        return null;
    }

    public boolean t(v vVar) {
        boolean z10;
        synchronized (this.b) {
            z10 = ((a0.f) this.d).get(vVar) != null;
        }
        return z10;
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return ((i9) this.e).toString();
            default:
                return super.toString();
        }
    }

    public boolean u() {
        return ((ArrayList) this.d).isEmpty();
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean v() {
        switch (this.a) {
        }
        return false;
    }

    public boolean w(v vVar, int i3) {
        o4.h hVar;
        synchronized (this.b) {
            hVar = (o4.h) ((a0.f) this.d).get(vVar);
        }
        e0 e0Var = (e0) ((WeakReference) this.e).get();
        return hVar != null && hVar.e.a(i3) && e0Var != null && e0Var.t.t().a(i3);
    }

    public boolean x(v vVar, int i3) {
        o4.h hVar;
        synchronized (this.b) {
            hVar = (o4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            o1 o1Var = hVar.d;
            o1Var.getClass();
            zb.e("Use contains(Command) for custom command", i3 != 0);
            Iterator<E> it = o1Var.a.iterator();
            while (it.hasNext()) {
                if (((n1) it.next()).a == i3) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean y(v vVar, n1 n1Var) {
        o4.h hVar;
        synchronized (this.b) {
            hVar = (o4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar == null) {
            return false;
        }
        t0 t0Var = hVar.d.a;
        n1Var.getClass();
        return t0Var.contains(n1Var) || o4.d.j(n1Var.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    @Override // org.telegram.ui.Components.ki0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        float f10;
        o0 o0Var;
        l0 k10;
        float f11;
        int i3;
        float f12;
        float f13;
        o0 o0Var2;
        l0 k11;
        float f14;
        int i10;
        float f15;
        switch (this.a) {
            case 10:
                wm wmVar = (wm) this.b;
                z H8 = wmVar.H8(((zi) this.c).f1(), true);
                float f16 = 0.0f;
                if (H8 instanceof q1) {
                    o0 o0Var3 = ((q1) H8).O;
                    l0 k12 = o0Var3.k(n0Var);
                    if (k12 == null) {
                        f12 = 0.0f;
                        f10 = f12;
                        wmVar.Ab(H8, (zi) this.c, (li0) this.d, view, f16, f10, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
                        ((pr0) this.e).c(false);
                        break;
                    } else {
                        f16 = o0Var3.b + k12.w + (k12.z / 2.0f);
                        f11 = o0Var3.c + k12.x;
                        i3 = k12.A;
                    }
                } else if (!(H8 instanceof org.telegram.ui.Cells.t0) || (k10 = (o0Var = ((org.telegram.ui.Cells.t0) H8).F0).k(n0Var)) == null) {
                    f10 = 0.0f;
                    wmVar.Ab(H8, (zi) this.c, (li0) this.d, view, f16, f10, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
                    ((pr0) this.e).c(false);
                } else {
                    f16 = o0Var.b + k10.w + (k10.z / 2.0f);
                    f11 = o0Var.c + k10.x;
                    i3 = k10.A;
                }
                f12 = f11 + (i3 / 2.0f);
                f10 = f12;
                wmVar.Ab(H8, (zi) this.c, (li0) this.d, view, f16, f10, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
                ((pr0) this.e).c(false);
                break;
            default:
                wm wmVar2 = (wm) this.b;
                z H82 = wmVar2.H8(((zi) this.c).f1(), true);
                float f17 = 0.0f;
                if (H82 instanceof q1) {
                    o0 o0Var4 = ((q1) H82).O;
                    l0 k13 = o0Var4.k(n0Var);
                    if (k13 == null) {
                        f15 = 0.0f;
                        f13 = f15;
                        wmVar2.Ab(H82, (zi) this.c, (li0) this.d, view, f17, f13, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
                        ((w71) this.e).c(false);
                        break;
                    } else {
                        f17 = o0Var4.b + k13.w + (k13.z / 2.0f);
                        f14 = o0Var4.c + k13.x;
                        i10 = k13.A;
                    }
                } else if (!(H82 instanceof org.telegram.ui.Cells.t0) || (k11 = (o0Var2 = ((org.telegram.ui.Cells.t0) H82).F0).k(n0Var)) == null) {
                    f13 = 0.0f;
                    wmVar2.Ab(H82, (zi) this.c, (li0) this.d, view, f17, f13, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
                    ((w71) this.e).c(false);
                } else {
                    f17 = o0Var2.b + k11.w + (k11.z / 2.0f);
                    f14 = o0Var2.c + k11.x;
                    i10 = k11.A;
                }
                f15 = f14 + (i10 / 2.0f);
                f13 = f15;
                wmVar2.Ab(H82, (zi) this.c, (li0) this.d, view, f17, f13, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
                ((w71) this.e).c(false);
                break;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public f(n3 n3Var) {
        this.a = 16;
        this.e = new f2(this, 16);
        this.b = n3Var;
    }

    public f(wd.z zVar, l1.y yVar, ae.d dVar) {
        this.a = 6;
        this.b = zVar;
        this.c = dVar;
        this.d = n6.a(ConnectionsManager.DEFAULT_DATACENTER_ID, null, 6);
        this.e = new w5(8);
        wd.a1 a1Var = (wd.a1) zVar.c().get(wd.y.b);
        if (a1Var != null) {
            a1Var.invokeOnCompletion(new l1.v0(yVar, this, 1));
        }
    }

    public f(ke keVar) {
        this.a = 4;
        ArrayList arrayList = (ArrayList) keVar.b;
        LinkedHashSet linkedHashSet = (LinkedHashSet) keVar.e;
        LinkedHashSet linkedHashSet2 = df.g.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(df.g.q.get((Class) it.next()));
        }
        this.b = arrayList2;
        hf.b bVar = (q) keVar.f;
        bVar = bVar == null ? new mb.b(10) : bVar;
        this.d = bVar;
        this.e = (ArrayList) keVar.d;
        ArrayList arrayList3 = (ArrayList) keVar.c;
        this.c = arrayList3;
        bVar.A(new q(arrayList3, Collections.EMPTY_MAP));
    }

    public f(t2 t2Var) {
        this.a = 9;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = null;
        this.b = t2Var;
    }

    public f(int i3) {
        this.a = i3;
        switch (i3) {
            case 3:
                this.b = new y();
                this.c = new y();
                this.d = new e4.a();
                break;
            case 8:
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

    public f(e0 e0Var) {
        this.a = 7;
        this.c = new a0.f(0);
        this.d = new a0.f(0);
        this.b = new Object();
        this.e = new WeakReference(e0Var);
    }

    public f(Typeface typeface, r1.b bVar) {
        int i3;
        int i10;
        int i11;
        int i12;
        this.a = 1;
        this.e = typeface;
        this.b = bVar;
        this.d = new t(1024);
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.a;
            i3 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i13) + i13);
        } else {
            i3 = 0;
        }
        this.c = new char[i3 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this, i15);
            r1.a b10 = pVar.b();
            int a12 = b10.a(4);
            Character.toChars(a12 != 0 ? ((ByteBuffer) b10.d).getInt(a12 + b10.a) : 0, (char[]) this.c, i15 * 2);
            r1.a b11 = pVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i16 = a13 + b11.a;
                i11 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                t tVar = (t) this.d;
                r1.a b12 = pVar.b();
                int a14 = b12.a(16);
                if (a14 != 0) {
                    int i17 = a14 + b12.a;
                    i12 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i17) + i17);
                } else {
                    i12 = 0;
                }
                tVar.a(pVar, 0, i12 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public f(Context context, ActionMode.Callback callback) {
        this.a = 5;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new l(0);
    }

    private final /* synthetic */ void D() {
    }

    private final /* synthetic */ void G() {
    }

    @Override // b4.m
    public /* synthetic */ void reset() {
    }

    private final /* synthetic */ void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }

    private final /* synthetic */ void e(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
