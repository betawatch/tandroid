package tg;

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
import b8.mf;
import ci.gb;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q extends t2 {
    public static final /* synthetic */ int r1 = 0;
    public final gb j1;
    public final ImageView k1;
    public final k l1;
    public final Path m1;
    public int n1;
    public q0.a o1;
    public androidx.activity.n p1;
    public boolean q1;

    public q(Context context, e6 e6Var) {
        super(1, context, e6Var, true);
        this.m1 = new Path();
        O(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.k1 = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(k6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new org.telegram.ui.web.d(1, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(k6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new ii.m(this, 25));
        k kVar = new k(this, context);
        this.l1 = kVar;
        kVar.c = Color.alpha(-65536) / 255.0f;
        kVar.a();
        kVar.invalidate();
        gb gbVar = new gb(context, 6);
        gbVar.setOrientation(1);
        o oVar = new o(this, context);
        gbVar.b = oVar;
        oVar.a(this.n1);
        gbVar.c = new n(this, context);
        gbVar.d = new p(this, context);
        l lVar = new l(context, this.J0);
        lVar.setAdapter(new ji.v(gbVar, 4));
        gbVar.addView(lVar, mf.l(1.0f, -1, 0));
        gbVar.addView(kVar, mf.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, mf.o(28, 28));
        linearLayout2.addView(lVar.j(8, false), mf.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, mf.o(28, 28));
        gbVar.addView(linearLayout2, mf.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.j1 = gbVar;
        linearLayout.addView(gbVar, mf.o(-1, 0));
        j jVar = new j(this, context, linearLayout);
        jVar.addView(linearLayout);
        this.O = jVar;
    }

    public final void I0(int i3, int i10) {
        View findFocus;
        if (!this.q1) {
            if (i10 != 2) {
                return;
            } else {
                this.q1 = true;
            }
        }
        gb gbVar = this.j1;
        if (i10 != 5 && (findFocus = gbVar.findFocus()) != null) {
            findFocus.clearFocus();
            org.telegram.messenger.g0.v1(findFocus);
        }
        if (i10 != 3) {
            ((o) gbVar.b).a(i3);
        }
        if (i10 != 0) {
            n nVar = (n) gbVar.c;
            boolean z10 = i10 != 1;
            nVar.n.n1 = i3;
            float[] fArr = nVar.h;
            Color.colorToHSV(i3, fArr);
            if (z10) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                nVar.d = f10 - (f11 <= 0.5f ? 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f) : a1.g.D(1.0f, f11, 0.22f, 1.0f));
                nVar.e = fArr[0] / 360.0f;
            }
            nVar.invalidate();
        }
        if (i10 != 1) {
            k kVar = this.l1;
            kVar.getClass();
            kVar.c = Color.alpha(i3) / 255.0f;
            kVar.a();
            kVar.invalidate();
        }
        p pVar = (p) gbVar.d;
        pVar.e = true;
        pVar.a.b();
        pVar.b.b();
        pVar.c.b();
        EditTextBoldCursor editTextBoldCursor = pVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(pVar.f.n1));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        pVar.e = false;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.o1;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.n1));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        boolean z10;
        androidx.activity.n nVar = this.p1;
        switch (nVar.a) {
            default:
                if (((Bitmap) nVar.c) != null) {
                    z10 = true;
                    break;
                }
            case 1:
                z10 = false;
                break;
        }
        if (!z10) {
            this.k1.setVisibility(8);
        }
        super.show();
    }
}
