package v4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
