package sf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.p;
import i2.f0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e implements rf.c, rf.b {
    public f d;
    public f e;
    public qf.f f;
    public View g;
    public cf.c h;
    public View i;
    public final qf.e j;
    public float k;
    public boolean n;
    public float o;
    public int a = 0;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public e(qf.e eVar) {
        this.j = eVar;
    }

    @Override // rf.c
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.j;
        if (eVar == null || (f0Var = eVar.l) == null) {
            return;
        }
        f0Var.e();
    }

    @Override // rf.c
    public final void b() {
        this.n = false;
        h();
    }

    @Override // rf.c
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.j;
        if (eVar == null || (f0Var = eVar.l) == null) {
            return;
        }
        f0Var.i();
    }

    @Override // rf.c
    public final void e() {
        this.n = true;
        g();
    }

    public final void g() {
        Rect rect = this.b;
        qf.e eVar = this.j;
        if (this.a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.a);
            return;
        }
        rect.set(eVar.h.a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.g.e();
        final a aVar = eVar.g;
        Objects.requireNonNull(aVar);
        final int i10 = 0;
        this.d = new f(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: sf.d
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        aVar.d((Canvas) obj);
                        break;
                    default:
                        aVar.f((Canvas) obj);
                        break;
                }
            }
        });
        final a aVar2 = eVar.g;
        Objects.requireNonNull(aVar2);
        final int i11 = 1;
        this.e = new f(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: sf.d
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        aVar2.d((Canvas) obj);
                        break;
                    default:
                        aVar2.f((Canvas) obj);
                        break;
                }
            }
        });
        this.i = eVar.g.h();
        this.g = new View((LaunchActivity) eVar.a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.a.d, this);
        this.f = fVar;
        fVar.addView(this.g);
        this.f.addView(this.i);
        View view = this.g;
        View view2 = eVar.k;
        cf.c cVar = new cf.c();
        cVar.a = view;
        cVar.b = view2;
        this.h = cVar;
        cVar.u(e7);
        eVar.a.q().addView(this.f);
        this.a = 1;
        this.f.invalidate();
        AndroidUtilities.doOnPreDraw(this.i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.a);
            return;
        }
        this.h.u(this.j.g.c());
        this.a = 3;
        this.f.removeView(this.i);
        this.f.invalidate();
        this.i = null;
        AndroidUtilities.doOnPreDraw(this.f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override // rf.c
    public final /* synthetic */ void d() {
    }

    @Override // rf.c
    public final /* synthetic */ void f() {
    }
}
