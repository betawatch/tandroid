package vh;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class r2 {
    public final View a;
    public View b;
    public final q20 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final dg.c i;
    public final jf.d j;
    public int k;
    public int l;

    public r2(View view, boolean z10, q20 q20Var) {
        dg.c cVar = new dg.c(this, 2);
        this.i = cVar;
        jf.d dVar = new jf.d(this, 1);
        this.j = dVar;
        this.a = view;
        this.c = q20Var;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
            view.addOnLayoutChangeListener(cVar);
        }
        view.addOnAttachStateChangeListener(new q2(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.l < org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.n) {
                return;
            } else {
                this.e = false;
            }
        }
        q20 q20Var = this.c;
        if (q20Var != null) {
            q20Var.a(Integer.valueOf(this.l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        return this.l > org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.n || this.e;
    }

    public final void d() {
        if (this.d) {
            return;
        }
        boolean z10 = this.f;
        View view = this.a;
        if (z10) {
            View view2 = this.b;
            if (view2 != null) {
                view = view2;
            }
            WeakHashMap weakHashMap = r0.h0.a;
            r0.j1 a2 = r0.a0.a(view);
            this.l = a2 != null ? a2.a.f(8).d : 0;
        } else {
            Rect rect = this.h;
            view.getWindowVisibleDisplayFrame(rect);
            View view3 = this.b;
            if (view3 != null) {
                view = view3;
            }
            this.l = view.getHeight() - rect.bottom;
        }
        if (this.g) {
            this.l = Math.max(0, this.l - org.telegram.messenger.i0.n);
        }
        int i10 = this.k;
        int i11 = this.l;
        boolean z11 = i10 != i11;
        this.k = i11;
        if (z11) {
            a();
        }
    }
}
