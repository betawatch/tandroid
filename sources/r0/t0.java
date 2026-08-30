package r0;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class t0 extends WindowInsetsAnimation.Callback {
    public final ch.e a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public t0(ch.e eVar) {
        super(0);
        this.d = new HashMap();
        this.a = eVar;
    }

    public final w0 a(WindowInsetsAnimation windowInsetsAnimation) {
        w0 w0Var = (w0) this.d.get(windowInsetsAnimation);
        if (w0Var == null) {
            w0Var = new w0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                w0Var.a = new u0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, w0Var);
        }
        return w0Var;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        ch.e eVar = this.a;
        a(windowInsetsAnimation);
        eVar.H();
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        ch.e eVar = this.a;
        a(windowInsetsAnimation);
        eVar.getClass();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            w0 a2 = a(windowInsetsAnimation);
            a2.a.d(windowInsetsAnimation.getFraction());
            this.c.add(a2);
        }
        ch.e eVar = this.a;
        m1 h = m1.h(null, windowInsets);
        eVar.I(h, this.b);
        return h.g();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        ch.e eVar = this.a;
        a(windowInsetsAnimation);
        i0.b f10 = u0.f(bounds);
        i0.b e = u0.e(bounds);
        if (eVar.c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((ch.d) it.next()).t();
            }
        }
        eVar.c++;
        s0.c();
        return s0.a(f10.d(), e.d());
    }
}
