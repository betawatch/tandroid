package zg;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import sg.f0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a {
    public final eh.a a;
    public pe.b b;
    public pe.b c;
    public gh.k d;
    public ViewGroup e;
    public boolean f;

    public a(eh.a aVar) {
        this.a = aVar;
    }

    public final bh.d a(View view) {
        return c(view, null, false);
    }

    public final bh.d b(View view, ch.a aVar) {
        return c(view, aVar, false);
    }

    public final bh.d c(View view, ch.a aVar, boolean z10) {
        ViewGroup viewGroup;
        bh.d k10 = this.a.k();
        if (this.f && Build.VERSION.SDK_INT >= 33 && (k10 instanceof bh.e)) {
            bh.e eVar = (bh.e) k10;
            eVar.N = new f(eVar.I);
        }
        k10.n(aVar);
        pe.b bVar = this.c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        gh.k kVar = this.d;
        if (kVar != null && (viewGroup = this.e) != null && view != null) {
            kVar.d(view, viewGroup, new f0(14, k10, view), z10);
        }
        pe.b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.add(k10);
        }
        return k10;
    }

    public final void d() {
        pe.b bVar = this.c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(pe.b bVar) {
        this.c = bVar;
    }

    public final void f(gh.k kVar, ViewGroup viewGroup) {
        this.d = kVar;
        this.e = viewGroup;
    }
}
