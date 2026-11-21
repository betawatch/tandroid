package ri;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import c8.xd;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.oa;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m a;
    public boolean f;
    public long g;
    public long h;
    public long i;
    public int j;
    public int k;
    public int l;
    public View m;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public boolean y;
    public int z;
    public final h b = new h(this);
    public final ArrayList c = new ArrayList();
    public ti.b d = ti.b.c;
    public final RectF e = new RectF();
    public final xe.b n = new xe.b();
    public final ArrayList o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect w = new Rect();
    public final Rect x = new Rect();
    public final ti.a B = new ti.a();
    public final ti.a C = new ti.a();
    public final ti.a D = new ti.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = pc.e(256);
        boolean e11 = pc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.a != e10 || rVar.b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(dh.g gVar) {
        this.o.add(gVar);
    }

    public final void b(ek0 ek0Var) {
        if (ek0Var == null) {
            return;
        }
        this.n.add(ek0Var);
        ek0Var.E2.b.add(new bt() { // from class: ri.f
            @Override // org.telegram.ui.Components.bt
            public final void a(int i7, boolean z10) {
                q qVar = q.this;
                qVar.h++;
                qVar.j += z10 ? 1 : -1;
            }
        });
        j jVar = new j(this);
        if (ek0Var.Q == null) {
            ek0Var.Q = new ArrayList();
        }
        ek0Var.Q.add(jVar);
        ek0Var.j(new oa(this, 29));
    }

    public final void c(j71 j71Var) {
        if (j71Var == null) {
            return;
        }
        g gVar = new g(this);
        ArrayList arrayList = j71Var.S;
        if (arrayList.contains(gVar)) {
            return;
        }
        arrayList.add(gVar);
    }

    public final ui.c d(n nVar) {
        ui.c cVar = new ui.c();
        this.E.add(new o(cVar, nVar));
        cVar.a(nVar.e());
        return cVar;
    }

    public final ti.a e() {
        ti.a aVar = this.D;
        ti.a aVar2 = this.C;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.b = 0;
        int i7 = aVar2.b;
        for (int i10 = 0; i10 < i7; i10++) {
            RectF rectF = (RectF) aVar2.a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.i++;
    }

    public final void h(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.g++;
        this.k += i7;
        this.l += i10;
    }

    public final void i(View view) {
        xf.a a10;
        xf.c cVar;
        View view2 = this.m;
        if (view2 != view) {
            h hVar = this.b;
            if (view2 != null && (cVar = (xf.c) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = cVar.a;
                if (arrayList.remove(hVar)) {
                    xf.a aVar = cVar.b;
                    if (aVar != null) {
                        ((xe.b) aVar.a.b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.b = null;
                        view2.removeOnAttachStateChangeListener(cVar.c);
                        view2.setTag(R.id.tag_view_on_post_draw_state, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                xf.c cVar2 = (xf.c) view.getTag(R.id.tag_view_on_post_draw_state);
                if (cVar2 == null) {
                    cVar2 = new xf.c();
                    view.setTag(R.id.tag_view_on_post_draw_state, cVar2);
                    view.addOnAttachStateChangeListener(cVar2.c);
                }
                ArrayList arrayList2 = cVar2.a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = xd.a(view, cVar2)) != null) {
                        ((xe.b) a10.a.b).add(hVar);
                    }
                }
            }
            this.m = view;
        }
    }
}
