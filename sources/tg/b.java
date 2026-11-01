package tg;

import android.view.View;
import android.view.ViewGroup;
import ei.q;
import ei.r;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.ui.web.k0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b {
    public final hi.a a;
    public final hi.a b;
    public final hi.a c;
    public int d;
    public int e;
    public je.b f;
    public je.b g;
    public zg.h h;
    public ViewGroup i;
    public r j;
    public boolean k;

    public b(hi.a aVar) {
        this(aVar, aVar, aVar);
    }

    public final vg.f a(View view) {
        return c(view, null, false);
    }

    public final vg.f b(View view, wg.a aVar) {
        return c(view, aVar, false);
    }

    public final vg.f c(View view, wg.a aVar, boolean z10) {
        vg.f fVar;
        hi.a aVar2 = this.c;
        hi.a aVar3 = this.a;
        hi.a aVar4 = this.b;
        if (aVar3 == aVar4 && aVar4 == aVar2) {
            fVar = aVar3 instanceof a ? ((a) aVar3).b() : new vg.f(aVar3, aVar3, aVar3);
        } else {
            vg.f fVar2 = new vg.f(aVar3, aVar4, aVar2);
            if (aVar3 instanceof a) {
                ((a) aVar3).c(fVar2);
            }
            if (aVar4 != aVar3 && (aVar4 instanceof a)) {
                ((a) aVar4).c(fVar2);
            }
            if (aVar2 != aVar3 && aVar2 != aVar4 && (aVar2 instanceof a)) {
                ((a) aVar2).c(fVar2);
            }
            fVar = fVar2;
        }
        if (this.k && !fVar.V) {
            fVar.V = true;
            fVar.Y = true;
        }
        fVar.o(aVar);
        int i10 = this.d;
        int i11 = this.e;
        fVar.K = i10;
        fVar.L = i11;
        je.b bVar = this.g;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        r rVar = this.j;
        if (rVar != null && view != null) {
            rVar.c.add(new q(view, fVar));
        }
        if (this.h != null && this.i != null && view != null) {
            this.h.d(view, this.i, new k0(17, fVar, new WeakReference(view)), z10);
        }
        je.b bVar2 = this.f;
        if (bVar2 != null) {
            bVar2.add(fVar);
        }
        return fVar;
    }

    public final void d() {
        je.b bVar = this.g;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(r rVar) {
        this.j = rVar;
    }

    public final void f(je.b bVar) {
        this.g = bVar;
    }

    public final void g(zg.h hVar, ViewGroup viewGroup) {
        this.h = hVar;
        this.i = viewGroup;
    }

    public b(hi.a aVar, hi.a aVar2, hi.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }
}
