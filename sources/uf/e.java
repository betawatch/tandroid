package uf;

import a8.fg;
import a8.me;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import i2.j0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e implements tf.c, tf.b {
    public f d;
    public f e;
    public sf.e f;
    public View g;
    public me h;
    public View i;
    public final sf.d j;
    public float k;
    public boolean n;
    public float o;
    public int a = 0;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public e(sf.d dVar) {
        this.j = dVar;
    }

    @Override // tf.c
    public final void a() {
        j0 j0Var;
        sf.d dVar = this.j;
        if (dVar == null || (j0Var = dVar.l) == null) {
            return;
        }
        j0Var.e();
    }

    @Override // tf.c
    public final void b() {
        this.n = false;
        h();
    }

    @Override // tf.c
    public final void c() {
        j0 j0Var;
        sf.d dVar = this.j;
        if (dVar == null || (j0Var = dVar.l) == null) {
            return;
        }
        j0Var.i();
    }

    @Override // tf.c
    public final void e() {
        this.n = true;
        g();
    }

    public final void g() {
        Rect rect = this.b;
        sf.d dVar = this.j;
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
        this.d = new f(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: uf.d
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
        this.e = new f(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: uf.d
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
        sf.e eVar = new sf.e((LaunchActivity) dVar.a.d, this);
        this.f = eVar;
        eVar.addView(this.g);
        this.f.addView(this.i);
        View view = this.g;
        View view2 = dVar.k;
        me meVar = new me();
        meVar.a = view;
        meVar.b = view2;
        this.h = meVar;
        meVar.y(e);
        dVar.a.o().addView(this.f);
        this.a = 1;
        this.f.invalidate();
        AndroidUtilities.doOnPreDraw(this.i, new fg(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
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
        AndroidUtilities.doOnPreDraw(this.f, new fg(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override // tf.c
    public final /* synthetic */ void d() {
    }

    @Override // tf.c
    public final /* synthetic */ void f() {
    }
}
