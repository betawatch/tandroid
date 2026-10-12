package tf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.z5;
import i2.h0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class e implements sf.c, sf.b {
    public f d;
    public f e;
    public rf.e f;
    public View g;
    public z5 h;
    public View i;
    public final rf.d j;
    public float k;
    public boolean n;
    public float o;
    public int a = 0;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public e(rf.d dVar) {
        this.j = dVar;
    }

    @Override // sf.c
    public final void a() {
        h0 h0Var;
        rf.d dVar = this.j;
        if (dVar == null || (h0Var = dVar.l) == null) {
            return;
        }
        h0Var.e();
    }

    @Override // sf.c
    public final void b() {
        this.n = false;
        h();
    }

    @Override // sf.c
    public final void c() {
        h0 h0Var;
        rf.d dVar = this.j;
        if (dVar == null || (h0Var = dVar.l) == null) {
            return;
        }
        h0Var.i();
    }

    @Override // sf.c
    public final void e() {
        this.n = true;
        g();
    }

    public final void g() {
        Rect rect = this.b;
        rf.d dVar = this.j;
        if (this.a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.a);
            return;
        }
        rect.set((Rect) dVar.h.a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.g.e();
        final a aVar = dVar.g;
        Objects.requireNonNull(aVar);
        final int i10 = 0;
        this.d = new f(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: tf.d
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
        final a aVar2 = dVar.g;
        Objects.requireNonNull(aVar2);
        final int i11 = 1;
        this.e = new f(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: tf.d
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
        this.i = dVar.g.h();
        this.g = new View((LaunchActivity) dVar.a.d);
        rf.e eVar = new rf.e((LaunchActivity) dVar.a.d, this);
        this.f = eVar;
        eVar.addView(this.g);
        this.f.addView(this.i);
        View view = this.g;
        View view2 = dVar.k;
        z5 z5Var = new z5();
        z5Var.b = view;
        z5Var.c = view2;
        this.h = z5Var;
        z5Var.x(e);
        dVar.a.q().addView(this.f);
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
        this.h.x(this.j.g.c());
        this.a = 3;
        this.f.removeView(this.i);
        this.f.invalidate();
        this.i = null;
        AndroidUtilities.doOnPreDraw(this.f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override // sf.c
    public final /* synthetic */ void d() {
    }

    @Override // sf.c
    public final /* synthetic */ void f() {
    }
}
