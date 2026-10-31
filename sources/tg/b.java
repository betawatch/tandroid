package tg;

import android.view.View;
import android.view.ViewGroup;
import ei.q;
import ei.r;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.ui.web.k0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b {
    public final hi.a a;
    public int b;
    public int c;
    public je.b d;
    public je.b e;
    public zg.h f;
    public ViewGroup g;
    public r h;
    public boolean i;

    public b(hi.a aVar) {
        this.a = aVar;
    }

    public final vg.f a(View view) {
        return c(view, null, false);
    }

    public final vg.f b(View view, wg.a aVar) {
        return c(view, aVar, false);
    }

    public final vg.f c(View view, wg.a aVar, boolean z10) {
        hi.a aVar2 = this.a;
        vg.f a2 = aVar2 instanceof a ? ((a) aVar2).a() : new vg.f(aVar2);
        if (this.i && !a2.S) {
            a2.S = true;
            a2.V = true;
        }
        a2.o(aVar);
        int i10 = this.b;
        int i11 = this.c;
        a2.H = i10;
        a2.I = i11;
        je.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        r rVar = this.h;
        if (rVar != null && view != null) {
            rVar.c.add(new q(view, a2));
        }
        if (this.f != null && this.g != null && view != null) {
            this.f.d(view, this.g, new k0(17, a2, new WeakReference(view)), z10);
        }
        je.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(a2);
        }
        return a2;
    }

    public final void d() {
        je.b bVar = this.e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(r rVar) {
        this.h = rVar;
    }

    public final void f(je.b bVar) {
        this.e = bVar;
    }

    public final void g(zg.h hVar, ViewGroup viewGroup) {
        this.f = hVar;
        this.g = viewGroup;
    }
}
