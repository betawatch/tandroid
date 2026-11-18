package v4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class q0 extends ViewGroup.MarginLayoutParams {
    public f1 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        f1 f1Var = this.a;
        if (f1Var == null) {
            return -1;
        }
        return f1Var.b();
    }

    public final int b() {
        f1 f1Var = this.a;
        if (f1Var == null) {
            return -1;
        }
        return f1Var.c();
    }

    public q0(int i7, int i10) {
        super(i7, i10);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public q0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public q0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public q0(q0 q0Var) {
        super((ViewGroup.LayoutParams) q0Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
