package r0;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t0 extends WindowInsetsAnimation.Callback {
    public final yg.e a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public t0(yg.e eVar) {
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
        yg.e eVar = this.a;
        a(windowInsetsAnimation);
        eVar.L();
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        yg.e eVar = this.a;
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
        yg.e eVar = this.a;
        m1 h = m1.h(null, windowInsets);
        eVar.M(h, this.b);
        return h.g();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        yg.e eVar = this.a;
        a(windowInsetsAnimation);
        i0.c f10 = u0.f(bounds);
        i0.c e9 = u0.e(bounds);
        if (eVar.c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((yg.d) it.next()).u();
            }
        }
        eVar.c++;
        s0.c();
        return s0.a(f10.d(), e9.d());
    }
}
