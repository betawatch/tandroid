// default package

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s21 extends q11 {
    public final e29 a;
    public final p66 b;
    public final p66 c;
    public final LinearLayout d;
    public final int e;

    public s21(Context context, vnb vnbVar) {
        super(context, vnbVar);
        int i = aob.yj;
        this.e = getThemedColor(i);
        setBackground(getThemedColor(aob.wj));
        e29 e29Var = new e29(context);
        this.a = e29Var;
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(e29Var, tre.h(56.0f, 48.0f, 8388627));
        getThemedColor(i);
        int i2 = aob.xj;
        getThemedColor(i2);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p66 p66Var = new p66(context, null);
        this.b = p66Var;
        p66Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        yob.X(p66Var, i, vnbVar);
        p66Var.setTextSize(1, 14.0f);
        p66Var.setTypeface(hl.o());
        linearLayout.addView(p66Var);
        p66 p66Var2 = new p66(context, null);
        this.c = p66Var2;
        p66Var2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        yob.X(p66Var2, i, vnbVar);
        yob.G(p66Var2, i2, vnbVar);
        p66Var2.setTypeface(Typeface.SANS_SERIF);
        p66Var2.setTextSize(1, 13.0f);
        linearLayout.addView(p66Var2);
    }

    public final void g(int i, int i2, int i3, String... strArr) {
        e29 e29Var = this.a;
        e29Var.f(i, i2, i3, null);
        for (String str : strArr) {
            e29Var.h(this.e, str);
        }
    }

    @Override // z11
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // z11
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
