package pi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.tj0;
import x7.p6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public ri.b d = ri.b.c;
    public final RectF e = new RectF();
    public final ue.b n = new ue.b();
    public final ArrayList o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect w = new Rect();
    public final Rect x = new Rect();
    public final ri.a B = new ri.a();
    public final ri.a C = new ri.a();
    public final ri.a D = new ri.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = lc.e(256);
        boolean e11 = lc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.a != e10 || rVar.b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(eh.g gVar) {
        this.o.add(gVar);
    }

    public final void b(tj0 tj0Var) {
        if (tj0Var == null) {
            return;
        }
        this.n.add(tj0Var);
        tj0Var.E2.b.add(new ms() { // from class: pi.f
            @Override // org.telegram.ui.Components.ms
            public final void a(int i3, boolean z10) {
                q qVar = q.this;
                qVar.h++;
                qVar.j += z10 ? 1 : -1;
            }
        });
        j jVar = new j(this);
        if (tj0Var.Q == null) {
            tj0Var.Q = new ArrayList();
        }
        tj0Var.Q.add(jVar);
        tj0Var.j(new ji(this, 28));
    }

    public final void c(n61 n61Var) {
        if (n61Var == null) {
            return;
        }
        g gVar = new g(this);
        ArrayList arrayList = n61Var.S;
        if (arrayList.contains(gVar)) {
            return;
        }
        arrayList.add(gVar);
    }

    public final si.c d(n nVar) {
        si.c cVar = new si.c();
        this.E.add(new o(cVar, nVar));
        cVar.a(nVar.e());
        return cVar;
    }

    public final ri.a e() {
        ri.a aVar = this.D;
        ri.a aVar2 = this.C;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.b = 0;
        int i3 = aVar2.b;
        for (int i10 = 0; i10 < i3; i10++) {
            RectF rectF = (RectF) aVar2.a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.i++;
    }

    public final void h(int i3, int i10) {
        if (i3 == 0 && i10 == 0) {
            return;
        }
        this.g++;
        this.k += i3;
        this.l += i10;
    }

    public final void i(View view) {
        yf.a a10;
        yf.c cVar;
        View view2 = this.m;
        if (view2 != view) {
            h hVar = this.b;
            if (view2 != null && (cVar = (yf.c) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = cVar.a;
                if (arrayList.remove(hVar)) {
                    yf.a aVar = cVar.b;
                    if (aVar != null) {
                        ((ue.b) aVar.a.b).remove(hVar);
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
                yf.c cVar2 = (yf.c) view.getTag(R.id.tag_view_on_post_draw_state);
                if (cVar2 == null) {
                    cVar2 = new yf.c();
                    view.setTag(R.id.tag_view_on_post_draw_state, cVar2);
                    view.addOnAttachStateChangeListener(cVar2.c);
                }
                ArrayList arrayList2 = cVar2.a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = p6.a(view, cVar2)) != null) {
                        ((ue.b) a10.a.b).add(hVar);
                    }
                }
            }
            this.m = view;
        }
    }
}
