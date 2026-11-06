package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class y0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
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
        int i10 = this.c;
        if (i10 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.r0.b(this.a, this.b, i10, interpolator);
        int i11 = this.g + 1;
        this.g = i11;
        if (i11 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.e = interpolator;
        this.f = true;
    }
}
