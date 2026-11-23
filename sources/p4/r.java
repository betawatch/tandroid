package p4;

import a8.ma;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import h9.s1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class r {
    public static final AtomicReference n = new AtomicReference(null);
    public final Context a;
    public final e2.c1 b;
    public String c;
    public final w7.s d;
    public final Bundle e;
    public final Bundle f;
    public h2.d g;
    public final boolean h;
    public final s1 i;
    public final s1 j;
    public final s1 k;
    public final boolean l;
    public boolean m;

    public r(LaunchActivity launchActivity, e2.c1 c1Var) {
        w7.s sVar = new w7.s(20);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = c1Var;
        ma.f(c1Var.Q());
        this.c = "";
        this.d = sVar;
        this.e = new Bundle();
        this.f = new Bundle();
        h9.g0 g0Var = h9.i0.b;
        s1 s1Var = s1.e;
        this.i = s1Var;
        this.j = s1Var;
        this.h = true;
        this.l = true;
        this.k = s1Var;
    }

    public final x a() {
        ma.p(!this.m);
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
            this.g = new b3.j(dVar, intValue, 10);
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
            this.g = new j6.k(dVar2, aVar, false, 21);
        }
        this.g = new jb.m(this.g);
        return new x(this.a, this.c, this.b, this.i, this.j, this.k, this.d, this.e, this.f, this.g, this.h, this.l);
    }
}
