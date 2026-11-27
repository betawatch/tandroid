// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xo8 {
    public byte a;
    public final v41 b;
    public final mm e;
    public Drawable i;
    public Drawable j;
    public b29 k;
    public pkb l;
    public va6 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public short x;
    public final /* synthetic */ ap8 y;
    public final RectF c = new RectF();
    public final RectF d = new RectF();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Rect h = new Rect();
    public float m = 1.0f;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public final float q = 1.0f;
    public short v = 0;

    public xo8(ap8 ap8Var, yo8 yo8Var) {
        this.y = ap8Var;
        this.b = new v41(ap8Var);
        this.e = new mm(ap8Var, 0L, 250L, k43.f);
        d(0, yo8Var.b, yo8Var.c);
        c(ob6.M0(yo8Var.a, null));
    }

    public final void a() {
        float e = this.e.e(false, 1.0f);
        if (e == 1.0f) {
            this.n = false;
            if (this.o) {
                this.p = true;
                return;
            }
            return;
        }
        RectF rectF = this.g;
        float f = rectF.left;
        RectF rectF2 = this.f;
        float R1 = hl.R1(f, rectF2.left, e);
        RectF rectF3 = this.d;
        rectF3.left = R1;
        rectF3.right = hl.R1(rectF.right, rectF2.right, e);
    }

    public final float b() {
        boolean z = this.o;
        mm mmVar = this.e;
        if (z) {
            return 1.0f - mmVar.e(false, 1.0f);
        }
        if (this.n) {
            return mmVar.e(false, 1.0f);
        }
        return 1.0f;
    }

    public final void c(String str) {
        pkb pkbVar = new pkb(str, 11.0f, hl.o());
        pkbVar.l(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pkbVar.a();
        this.l = pkbVar;
    }

    public final void d(int i, int i2, int i3) {
        ap8 ap8Var = this.y;
        if (i != 0) {
            b29 b29Var = new b29(i, hl.L(56.0f), hl.L(56.0f), false, null);
            b29Var.M(ap8Var);
            b29Var.start();
            this.k = b29Var;
        } else {
            this.k = null;
        }
        this.i = i2 != 0 ? ap8Var.getResources().getDrawable(i2).mutate() : null;
        this.j = i3 != 0 ? ap8Var.getResources().getDrawable(i3).mutate() : null;
        b29 b29Var2 = this.k;
        Rect rect = this.h;
        if (b29Var2 != null) {
            b29Var2.setBounds(rect);
        }
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public xo8(ap8 ap8Var) {
        this.y = ap8Var;
        this.b = new v41(ap8Var);
        this.e = new mm(ap8Var, 0L, 250L, k43.f);
    }
}
