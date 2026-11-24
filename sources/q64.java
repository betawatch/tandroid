// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q64 extends LinearLayout {
    public final ImageView a;
    public final l46 b;
    public final l46 c;

    public q64(int i, wjb wjbVar, Context context) {
        super(context);
        setOrientation(0);
        setPadding(gl.L(i == 1 ? 11.0f : 32.0f), 0, gl.L(i == 1 ? 11.0f : 32.0f), gl.L(i == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i2 = bkb.F6;
        zkb.s(imageView, i2, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        l46 l46Var = new l46(context, null);
        this.b = l46Var;
        l46Var.setTypeface(gl.o());
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, i2, wjbVar);
        int i3 = bkb.Wc;
        zkb.G(l46Var, i3, wjbVar);
        linearLayout.addView(l46Var, nme.t(-1, -2, 7, 0, 0, 0, 3));
        l46 l46Var2 = new l46(context, null);
        this.c = l46Var2;
        l46Var2.setTextSize(1, 14.0f);
        zkb.X(l46Var2, bkb.y6, wjbVar);
        zkb.G(l46Var2, i3, wjbVar);
        linearLayout.addView(l46Var2, nme.r(-1, -2, 7));
        addView(linearLayout, nme.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.a.setImageResource(i);
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
