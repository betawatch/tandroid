package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class x0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f = false;
            return;
        }
        if (!this.f) {
            this.g = 0;
            return;
        }
        Interpolator interpolator = this.e;
        if (interpolator != null && this.c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i11 = this.c;
        if (i11 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.q0.b(this.a, this.b, i11, interpolator);
        int i12 = this.g + 1;
        this.g = i12;
        if (i12 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.e = interpolator;
        this.f = true;
    }
}
