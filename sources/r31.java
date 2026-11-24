// default package

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r31 extends p21 {
    public final s09 a;
    public final l66 b;
    public final l66 c;
    public final LinearLayout d;
    public final int e;

    public r31(Context context, ylb ylbVar) {
        super(context, ylbVar);
        int i = cmb.xj;
        this.e = getThemedColor(i);
        setBackground(getThemedColor(cmb.vj));
        s09 s09Var = new s09(context);
        this.a = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(s09Var, qoe.h(56.0f, 48.0f, 8388627));
        getThemedColor(i);
        int i2 = cmb.wj;
        getThemedColor(i2);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        l66 l66Var = new l66(context, null);
        this.b = l66Var;
        l66Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        anb.X(l66Var, i, ylbVar);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setTypeface(gm.o());
        linearLayout.addView(l66Var);
        l66 l66Var2 = new l66(context, null);
        this.c = l66Var2;
        l66Var2.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        anb.X(l66Var2, i, ylbVar);
        anb.G(l66Var2, i2, ylbVar);
        l66Var2.setTypeface(Typeface.SANS_SERIF);
        l66Var2.setTextSize(1, 13.0f);
        linearLayout.addView(l66Var2);
    }

    public final void c(int i, int i2, int i3, String... strArr) {
        s09 s09Var = this.a;
        s09Var.f(i, i2, i3, null);
        for (String str : strArr) {
            s09Var.h(this.e, str);
        }
    }

    @Override // y21
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // y21
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
