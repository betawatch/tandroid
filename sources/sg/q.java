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
import c8.ja;
import com.google.android.gms.internal.vision.e2;
import di.wa;
import hi.p5;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.sc1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class q extends u2 {
    public static final /* synthetic */ int u1 = 0;
    public final wa m1;
    public final ImageView n1;
    public final k o1;
    public final Path p1;
    public int q1;
    public q0.a r1;
    public androidx.activity.n s1;
    public boolean t1;

    public q(Context context, e6 e6Var) {
        super(1, context, e6Var, true);
        this.p1 = new Path();
        P(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.n1 = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(j6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new sc1(2, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(j6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new p5(this, 27));
        k kVar = new k(this, context);
        this.o1 = kVar;
        kVar.c = Color.alpha(-65536) / 255.0f;
        kVar.a();
        kVar.invalidate();
        wa waVar = new wa(context, 6);
        waVar.setOrientation(1);
        o oVar = new o(this, context);
        waVar.b = oVar;
        oVar.a(this.q1);
        waVar.c = new n(this, context);
        waVar.d = new p(this, context);
        l lVar = new l(context, this.J0);
        lVar.setAdapter(new li.x(waVar, 4));
        waVar.addView(lVar, ja.l(1.0f, -1, 0));
        waVar.addView(kVar, ja.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, ja.o(28, 28));
        linearLayout2.addView(lVar.i(8, false), ja.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, ja.o(28, 28));
        waVar.addView(linearLayout2, ja.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.m1 = waVar;
        linearLayout.addView(waVar, ja.o(-1, 0));
        j jVar = new j(this, context, linearLayout);
        jVar.addView(linearLayout);
        this.O = jVar;
    }

    public final void I0(int i7, int i10) {
        View findFocus;
        if (!this.t1) {
            if (i10 != 2) {
                return;
            } else {
                this.t1 = true;
            }
        }
        wa waVar = this.m1;
        if (i10 != 5 && (findFocus = waVar.findFocus()) != null) {
            findFocus.clearFocus();
            org.telegram.messenger.g0.v1(findFocus);
        }
        if (i10 != 3) {
            ((o) waVar.b).a(i7);
        }
        if (i10 != 0) {
            n nVar = (n) waVar.c;
            boolean z10 = i10 != 1;
            nVar.n.q1 = i7;
            float[] fArr = nVar.h;
            Color.colorToHSV(i7, fArr);
            if (z10) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                nVar.d = f10 - (f11 <= 0.5f ? 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f) : e2.t(1.0f, f11, 0.22f, 1.0f));
                nVar.e = fArr[0] / 360.0f;
            }
            nVar.invalidate();
        }
        if (i10 != 1) {
            k kVar = this.o1;
            kVar.getClass();
            kVar.c = Color.alpha(i7) / 255.0f;
            kVar.a();
            kVar.invalidate();
        }
        p pVar = (p) waVar.d;
        pVar.e = true;
        pVar.a.b();
        pVar.b.b();
        pVar.c.b();
        EditTextBoldCursor editTextBoldCursor = pVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(pVar.f.q1));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        pVar.e = false;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.r1;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.q1));
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        boolean z10;
        androidx.activity.n nVar = this.s1;
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
            this.n1.setVisibility(8);
        }
        super.show();
    }
}
