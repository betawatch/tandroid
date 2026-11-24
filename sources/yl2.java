// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yl2 extends fx0 {
    public static final /* synthetic */ int t1 = 0;
    public final zf2 l1;
    public final ImageView m1;
    public final ql2 n1;
    public final Path o1;
    public int p1;
    public vs2 q1;
    public qx r1;
    public boolean s1;

    public yl2(Context context, wjb wjbVar) {
        super(1, wjbVar, context, true);
        this.o1 = new Path();
        L(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, gl.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.m1 = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(bkb.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new kb1((Object) this, (Object) context, (byte) 20));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(bkb.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new x91(this, (byte) 14));
        ql2 ql2Var = new ql2(this, context);
        this.n1 = ql2Var;
        ql2Var.c = 1.0f;
        ql2Var.a();
        ql2Var.invalidate();
        zf2 zf2Var = new zf2(context, (byte) 2);
        zf2Var.setOrientation(1);
        vl2 vl2Var = new vl2(this, context);
        zf2Var.b = vl2Var;
        vl2Var.a(this.p1);
        zf2Var.c = new ul2(this, context);
        zf2Var.d = new xl2(this, context);
        rl2 rl2Var = new rl2(context, this.J0);
        rl2Var.setAdapter(new sl2(zf2Var, (byte) 0));
        zf2Var.addView(rl2Var, nme.l(1.0f, -1, 0));
        zf2Var.addView(ql2Var, nme.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, nme.o(28, 28));
        linearLayout2.addView(rl2Var.l(8, false), nme.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, nme.o(28, 28));
        zf2Var.addView(linearLayout2, nme.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.l1 = zf2Var;
        linearLayout.addView(zf2Var, nme.o(-1, 0));
        pl2 pl2Var = new pl2(this, context, linearLayout);
        pl2Var.addView(linearLayout);
        this.O = pl2Var;
    }

    public final void D0(int i, int i2) {
        View findFocus;
        if (!this.s1) {
            if (i2 != 2) {
                return;
            } else {
                this.s1 = true;
            }
        }
        zf2 zf2Var = this.l1;
        if (i2 != 5 && (findFocus = zf2Var.findFocus()) != null) {
            findFocus.clearFocus();
            gl.t1(findFocus);
        }
        if (i2 != 3) {
            ((vl2) zf2Var.b).a(i);
        }
        if (i2 != 0) {
            ul2 ul2Var = (ul2) zf2Var.c;
            boolean z = i2 != 1;
            ul2Var.n.p1 = i;
            float[] fArr = ul2Var.h;
            Color.colorToHSV(i, fArr);
            if (z) {
                float f = (fArr[1] * 0.5f) + 1.0f;
                float f2 = fArr[2];
                ul2Var.d = f - (f2 <= 0.5f ? 1.0f - (((1.0f - f2) * 0.22000003f) + 0.78f) : ls6.B(1.0f, f2, 0.22f, 1.0f));
                ul2Var.e = fArr[0] / 360.0f;
            }
            ul2Var.invalidate();
        }
        if (i2 != 1) {
            ql2 ql2Var = this.n1;
            ql2Var.c = Color.alpha(i) / 255.0f;
            ql2Var.a();
            ql2Var.invalidate();
        }
        xl2 xl2Var = (xl2) zf2Var.d;
        xl2Var.e = true;
        xl2Var.a.b();
        xl2Var.b.b();
        xl2Var.c.b();
        EditTextBoldCursor editTextBoldCursor = xl2Var.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb = new StringBuilder(Integer.toHexString(xl2Var.f.p1));
            while (sb.length() < 8) {
                sb.insert(0, "0");
            }
            editTextBoldCursor.setText(sb.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        xl2Var.e = false;
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        vs2 vs2Var = this.q1;
        if (vs2Var != null) {
            vs2Var.accept(Integer.valueOf(this.p1));
        }
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        qx qxVar = this.r1;
        boolean z = false;
        switch (qxVar.a) {
            case 5:
                if (((Bitmap) qxVar.c) != null) {
                    z = true;
                    break;
                }
                break;
        }
        if (!z) {
            this.m1.setVisibility(8);
        }
        super.show();
    }
}
