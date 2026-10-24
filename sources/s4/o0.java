package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class o0 extends ViewGroup.MarginLayoutParams {
    public b1 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        b1 b1Var = this.a;
        if (b1Var == null) {
            return -1;
        }
        return b1Var.b();
    }

    public final int b() {
        b1 b1Var = this.a;
        if (b1Var == null) {
            return -1;
        }
        return b1Var.c();
    }

    public o0(int i10, int i11) {
        super(i10, i11);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public o0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public o0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public o0(o0 o0Var) {
        super((ViewGroup.LayoutParams) o0Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
