// default package

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ps3 extends EdgeEffect {
    public final byte a;
    public final os3 b;
    public final RecyclerView c;
    public final li3 d;
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public ps3(RecyclerView recyclerView, int i, os3 os3Var) {
        super(recyclerView.getContext());
        this.d = new li3(this, (byte) 12);
        this.c = recyclerView;
        this.a = i;
        this.b = os3Var;
    }

    public final void a() {
        boolean b = b();
        if (this.e != b) {
            this.e = b;
            os3 os3Var = this.b;
            if (os3Var != null) {
                os3Var.a(this.a, b);
            }
        }
    }

    public final boolean b() {
        if (isFinished()) {
            return false;
        }
        return Build.VERSION.SDK_INT < 31 || getDistance() != 0.0f;
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        boolean draw = super.draw(canvas);
        this.c.postOnAnimation(this.d);
        return draw;
    }

    @Override // android.widget.EdgeEffect
    public final void finish() {
        super.finish();
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final float onPullDistance(float f, float f2) {
        float onPullDistance = super.onPullDistance(f, f2);
        a();
        return onPullDistance;
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void setSize(int i, int i2) {
        super.setSize(i, i2);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        a();
    }
}
