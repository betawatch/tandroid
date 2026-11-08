package p4;

import a8.ia;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import h9.t1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class r {
    public static final AtomicReference n = new AtomicReference(null);
    public final Context a;
    public final e2.c1 b;
    public String c;
    public final pb.b d;
    public final Bundle e;
    public final Bundle f;
    public h2.d g;
    public final boolean h;
    public final t1 i;
    public final t1 j;
    public final t1 k;
    public final boolean l;
    public boolean m;

    public r(LaunchActivity launchActivity, e2.c1 c1Var) {
        pb.b bVar = new pb.b(20);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = c1Var;
        ia.f(c1Var.P());
        this.c = "";
        this.d = bVar;
        this.e = new Bundle();
        this.f = new Bundle();
        h9.g0 g0Var = h9.i0.b;
        t1 t1Var = t1.e;
        this.i = t1Var;
        this.j = t1Var;
        this.h = true;
        this.l = true;
        this.k = t1Var;
    }

    public final x a() {
        ia.p(!this.m);
        this.m = true;
        Object obj = x.b;
        int intValue = ((Integer) d0.C.get()).intValue();
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i7 < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        h2.d dVar = this.g;
        if (dVar == null) {
            bg.w0 w0Var = new bg.w0();
            w0Var.c = context;
            w0Var.b = -1;
            w0Var.b = intValue;
            w0Var.a = true;
            this.g = new j2.i(w0Var);
        } else {
            this.g = new f5.u(dVar, intValue, 12);
        }
        if (i7 == 29) {
            h2.d dVar2 = this.g;
            AtomicReference atomicReference = n;
            l9.a aVar = (l9.a) atomicReference.get();
            if (aVar == null) {
                Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                int i10 = point2.y;
                int i11 = point2.x;
                Point point3 = new Point(i10 - (i11 - point.x), i11 - (i10 - point.y));
                l9.a aVar2 = new l9.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                atomicReference.set(aVar2);
                aVar = aVar2;
            }
            this.g = new j2.n(dVar2, aVar, false, 22);
        }
        this.g = new m4.d0((Object) this.g, false);
        return new x(this.a, this.c, this.b, this.i, this.j, this.k, this.d, this.e, this.f, this.g, this.h, this.l);
    }
}
