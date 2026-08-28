package ze;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import h3.k0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements ye.c, ye.b {
    public f d;
    public f e;
    public xe.e f;
    public View g;
    public b3.b h;
    public View i;
    public final xe.d j;
    public float k;
    public boolean n;
    public float o;
    public int a = 0;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public e(xe.d dVar) {
        this.j = dVar;
    }

    @Override // ye.c
    public final void a() {
        k0 k0Var;
        xe.d dVar = this.j;
        if (dVar == null || (k0Var = dVar.l) == null) {
            return;
        }
        k0Var.o(false);
    }

    @Override // ye.c
    public final void b() {
        this.n = false;
        h();
    }

    @Override // ye.c
    public final void c() {
        k0 k0Var;
        xe.d dVar = this.j;
        if (dVar == null || (k0Var = dVar.l) == null) {
            return;
        }
        k0Var.o(true);
    }

    @Override // ye.c
    public final void e() {
        this.n = true;
        g();
    }

    public final void g() {
        Rect rect = this.b;
        xe.d dVar = this.j;
        if (this.a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.a);
            return;
        }
        rect.set(dVar.h.a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap c10 = dVar.g.c();
        final a aVar = dVar.g;
        Objects.requireNonNull(aVar);
        final int i9 = 0;
        this.d = new f(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: ze.d
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i9) {
                    case 0:
                        aVar.b((Canvas) obj);
                        break;
                    default:
                        aVar.d((Canvas) obj);
                        break;
                }
            }
        });
        final a aVar2 = dVar.g;
        Objects.requireNonNull(aVar2);
        final int i10 = 1;
        this.e = new f(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: ze.d
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        aVar2.b((Canvas) obj);
                        break;
                    default:
                        aVar2.d((Canvas) obj);
                        break;
                }
            }
        });
        this.i = dVar.g.h();
        this.g = new View((LaunchActivity) dVar.a.d);
        xe.e eVar = new xe.e((LaunchActivity) dVar.a.d, this);
        this.f = eVar;
        eVar.addView(this.g);
        this.f.addView(this.i);
        View view = this.g;
        View view2 = dVar.k;
        b3.b bVar = new b3.b();
        bVar.a = view;
        bVar.b = view2;
        this.h = bVar;
        bVar.y(c10);
        dVar.a.b().addView(this.f);
        this.a = 1;
        this.f.invalidate();
        AndroidUtilities.doOnPreDraw(this.i, new af.f(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.a);
            return;
        }
        this.h.y(this.j.g.a());
        this.a = 3;
        this.f.removeView(this.i);
        this.f.invalidate();
        this.i = null;
        AndroidUtilities.doOnPreDraw(this.f, new af.f(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override // ye.c
    public final /* synthetic */ void d() {
    }

    @Override // ye.c
    public final /* synthetic */ void f() {
    }
}
