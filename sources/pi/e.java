package pi;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public abstract class e extends Drawable {
    public final Rect a = new Rect();
    public r b = q.f();
    public int c = hs.e4;
    public float d;
    public float e;

    public abstract void a();

    public void b(Rect rect) {
        rect.set(getBounds());
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public abstract boolean e();

    public abstract void f(int i3);

    public abstract void g(r rVar);

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    public final void i(float f10, float f11) {
        if (this.d == f10 && this.e == f11) {
            return;
        }
        this.d = f10;
        this.e = f11;
        h();
    }

    public abstract boolean j();

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (this.c != i3) {
            this.c = i3;
            f(i3);
        }
    }

    public abstract void updateColors();

    public void h() {
    }
}
