package v4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
