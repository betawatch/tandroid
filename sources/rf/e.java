package rf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import bi.u6;
import com.google.android.gms.internal.cast.p;
import i2.e0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e implements qf.c, qf.b {
    public f d;
    public f e;
    public pf.f f;
    public View g;
    public u6 h;
    public View i;
    public final pf.e j;
    public float k;
    public boolean n;
    public float o;
    public int a = 0;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public e(pf.e eVar) {
        this.j = eVar;
    }

    @Override // qf.c
    public final void a() {
        e0 e0Var;
        pf.e eVar = this.j;
        if (eVar == null || (e0Var = eVar.l) == null) {
            return;
        }
        e0Var.e();
    }

    @Override // qf.c
    public final void b() {
        this.n = false;
        h();
    }

    @Override // qf.c
    public final void c() {
        e0 e0Var;
        pf.e eVar = this.j;
        if (eVar == null || (e0Var = eVar.l) == null) {
            return;
        }
        e0Var.i();
    }

    @Override // qf.c
    public final void e() {
        this.n = true;
        g();
    }

    public final void g() {
        Rect rect = this.b;
        pf.e eVar = this.j;
        if (this.a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.a);
            return;
        }
        rect.set(eVar.h.a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.g.e();
        final a aVar = eVar.g;
        Objects.requireNonNull(aVar);
        final int i10 = 0;
        this.d = new f(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: rf.d
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
        this.e = new f(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: rf.d
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
        pf.f fVar = new pf.f((LaunchActivity) eVar.a.d, this);
        this.f = fVar;
        fVar.addView(this.g);
        this.f.addView(this.i);
        View view = this.g;
        View view2 = eVar.k;
        u6 u6Var = new u6();
        u6Var.a = view;
        u6Var.b = view2;
        this.h = u6Var;
        u6Var.y(e);
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
        this.h.y(this.j.g.c());
        this.a = 3;
        this.f.removeView(this.i);
        this.f.invalidate();
        this.i = null;
        AndroidUtilities.doOnPreDraw(this.f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override // qf.c
    public final /* synthetic */ void d() {
    }

    @Override // qf.c
    public final /* synthetic */ void f() {
    }
}
