package v4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class o0 extends ViewGroup.MarginLayoutParams {
    public d1 a;
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
        d1 d1Var = this.a;
        if (d1Var == null) {
            return -1;
        }
        return d1Var.b();
    }

    public final int b() {
        d1 d1Var = this.a;
        if (d1Var == null) {
            return -1;
        }
        return d1Var.c();
    }

    public o0(int i7, int i10) {
        super(i7, i10);
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
