package wf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import b8.cg;
import b8.ke;
import j$.util.Objects;
import k2.i0;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.messenger.u10;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements vf.b {
    public f d;
    public f e;
    public org.telegram.ui.e f;
    public View g;
    public ke h;
    public View i;
    public final uf.d j;
    public float k;
    public boolean n;
    public float o;
    public int a = 0;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public e(uf.d dVar) {
        this.j = dVar;
    }

    @Override // vf.b
    public final void a() {
        i0 i0Var;
        uf.d dVar = this.j;
        if (dVar == null || (i0Var = dVar.l) == null) {
            return;
        }
        i0Var.e();
    }

    @Override // vf.b
    public final void b() {
        this.n = false;
        h();
    }

    @Override // vf.b
    public final void c() {
        i0 i0Var;
        uf.d dVar = this.j;
        if (dVar == null || (i0Var = dVar.l) == null) {
            return;
        }
        i0Var.j();
    }

    @Override // vf.b
    public final void e() {
        this.n = true;
        g();
    }

    public final void g() {
        Rect rect = this.b;
        uf.d dVar = this.j;
        if (this.a != 0) {
            a8.d("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.a);
            return;
        }
        rect.set((Rect) dVar.h.a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap l10 = dVar.g.l();
        final a aVar = dVar.g;
        Objects.requireNonNull(aVar);
        final int i3 = 0;
        this.d = new f(measuredWidth, measuredHeight, new u10() { // from class: wf.d
            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        aVar.i((Canvas) obj);
                        break;
                    default:
                        aVar.m((Canvas) obj);
                        break;
                }
            }
        });
        final a aVar2 = dVar.g;
        Objects.requireNonNull(aVar2);
        final int i10 = 1;
        this.e = new f(measuredWidth, measuredHeight, new u10() { // from class: wf.d
            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        aVar2.i((Canvas) obj);
                        break;
                    default:
                        aVar2.m((Canvas) obj);
                        break;
                }
            }
        });
        this.i = dVar.g.q();
        this.g = new View((LaunchActivity) dVar.a.d);
        org.telegram.ui.e eVar = new org.telegram.ui.e((LaunchActivity) dVar.a.d, this);
        this.f = eVar;
        eVar.addView(this.g);
        this.f.addView(this.i);
        ke keVar = new ke(this.g, dVar.k);
        this.h = keVar;
        keVar.K(l10);
        dVar.a.h().addView(this.f);
        this.a = 1;
        this.f.invalidate();
        g0.K(this.i, new cg(t0.d, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.a != 2) {
            a8.d("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.a);
            return;
        }
        this.h.K(this.j.g.g());
        this.a = 3;
        this.f.removeView(this.i);
        this.f.invalidate();
        this.i = null;
        g0.K(this.f, new cg(t0.d, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override // vf.b
    public final /* synthetic */ void d() {
    }

    @Override // vf.b
    public final /* synthetic */ void f() {
    }
}
