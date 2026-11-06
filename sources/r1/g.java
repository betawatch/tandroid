package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class g {
    public static final b o = new b(1);
    public static final b p = new b(2);
    public static final b q = new b(3);
    public static final b r = new b(4);
    public static final b s = new b(5);
    public static final b t = new b(6);
    public static final b u = new b(7);
    public static final b v = new b(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final e e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public h m;
    public float n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.k;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    public final void b(d dVar) {
        if (this.f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = this.l;
        if (arrayList.contains(dVar)) {
            return;
        }
        arrayList.add(dVar);
    }

    public final void c(float f10) {
        if (this.f) {
            this.n = f10;
            return;
        }
        if (this.m == null) {
            this.m = new h(f10);
        }
        this.m.i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f) {
            e(true);
        }
    }

    public final void e(boolean z9) {
        ArrayList arrayList;
        int i7 = 0;
        this.f = false;
        ThreadLocal threadLocal = a.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.a.remove(this);
        ArrayList arrayList2 = aVar.b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.e = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z9, this.b, this.a);
            }
            i7++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.j = f10;
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.b, this.a);
            }
            i7++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void h() {
        h hVar = this.m;
        if (hVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) hVar.i;
        if (d > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.j * 0.75f);
        hVar.d = abs;
        hVar.e = abs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z9 = this.f;
        if (z9 || z9) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.a(this.d);
        }
        float f10 = this.b;
        if (f10 > this.g || f10 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = a.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        ArrayList arrayList = aVar.b;
        if (arrayList.size() == 0) {
            if (aVar.d == null) {
                aVar.d = new hy0(aVar.c);
            }
            hy0 hy0Var = aVar.d;
            ((Choreographer) hy0Var.c).postFrameCallback((xy0) hy0Var.d);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public g(Object obj, e eVar, float f10) {
        this(obj, eVar, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.m = new h(f10);
    }

    public g(f fVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new c6(fVar, 1);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = eVar;
        if (eVar != s && eVar != t && eVar != u) {
            if (eVar == v) {
                this.j = 0.00390625f;
                return;
            } else if (eVar != q && eVar != r) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.00390625f;
                return;
            }
        }
        this.j = 0.1f;
    }
}
