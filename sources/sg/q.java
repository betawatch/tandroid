package sg;

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
import bi.nc;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.hk0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q extends v2 {
    public static final /* synthetic */ int q1 = 0;
    public final nc i1;
    public final ImageView j1;
    public final k k1;
    public final Path l1;
    public int m1;
    public q0.a n1;
    public androidx.activity.n o1;
    public boolean p1;

    public q(Context context, g6 g6Var) {
        super(1, context, g6Var, true);
        this.l1 = new Path();
        O(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.r0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.j1 = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(l6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new hk0(25, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(l6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new ii.g(this, 21));
        k kVar = new k(this, context);
        this.k1 = kVar;
        kVar.c = Color.alpha(-65536) / 255.0f;
        kVar.a();
        kVar.invalidate();
        nc ncVar = new nc(context, 6);
        ncVar.setOrientation(1);
        o oVar = new o(this, context);
        ncVar.b = oVar;
        oVar.a(this.m1);
        ncVar.c = new n(this, context);
        ncVar.d = new p(this, context);
        l lVar = new l(context, this.I0);
        lVar.setAdapter(new ii.x(ncVar, 4));
        ncVar.addView(lVar, ha.l(1.0f, -1, 0));
        ncVar.addView(kVar, ha.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, ha.o(28, 28));
        linearLayout2.addView(lVar.n(8, false), ha.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, ha.o(28, 28));
        ncVar.addView(linearLayout2, ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.i1 = ncVar;
        linearLayout.addView(ncVar, ha.o(-1, 0));
        j jVar = new j(this, context, linearLayout);
        jVar.addView(linearLayout);
        this.N = jVar;
    }

    public final void I0(int i7, int i10) {
        View findFocus;
        if (!this.p1) {
            if (i10 != 2) {
                return;
            } else {
                this.p1 = true;
            }
        }
        nc ncVar = this.i1;
        if (i10 != 5 && (findFocus = ncVar.findFocus()) != null) {
            findFocus.clearFocus();
            org.telegram.messenger.g0.v1(findFocus);
        }
        if (i10 != 3) {
            ((o) ncVar.b).a(i7);
        }
        if (i10 != 0) {
            n nVar = (n) ncVar.c;
            boolean z9 = i10 != 1;
            nVar.n.m1 = i7;
            float[] fArr = nVar.h;
            Color.colorToHSV(i7, fArr);
            if (z9) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                nVar.d = f10 - (f11 <= 0.5f ? 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f) : com.google.android.recaptcha.internal.a.v(1.0f, f11, 0.22f, 1.0f));
                nVar.e = fArr[0] / 360.0f;
            }
            nVar.invalidate();
        }
        if (i10 != 1) {
            k kVar = this.k1;
            kVar.getClass();
            kVar.c = Color.alpha(i7) / 255.0f;
            kVar.a();
            kVar.invalidate();
        }
        p pVar = (p) ncVar.d;
        pVar.e = true;
        pVar.a.b();
        pVar.b.b();
        pVar.c.b();
        EditTextBoldCursor editTextBoldCursor = pVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(pVar.f.m1));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        pVar.e = false;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.n1;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.m1));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        boolean z9;
        androidx.activity.n nVar = this.o1;
        switch (nVar.a) {
            default:
                if (((Bitmap) nVar.c) != null) {
                    z9 = true;
                    break;
                }
            case 1:
                z9 = false;
                break;
        }
        if (!z9) {
            this.j1.setVisibility(8);
        }
        super.show();
    }
}
