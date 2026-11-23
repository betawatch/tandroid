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
import c8.na;
import com.google.android.gms.internal.vision.e2;
import di.za;
import hi.z4;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ig0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q extends w2 {
    public static final /* synthetic */ int u1 = 0;
    public final za m1;
    public final ImageView n1;
    public final k o1;
    public final Path p1;
    public int q1;
    public q0.a r1;
    public androidx.activity.n s1;
    public boolean t1;

    public q(Context context, i6 i6Var) {
        super(1, context, i6Var, true);
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
        imageView.setBackground(n6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ig0(25, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(n6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new z4(this, 28));
        k kVar = new k(this, context);
        this.o1 = kVar;
        kVar.c = Color.alpha(-65536) / 255.0f;
        kVar.a();
        kVar.invalidate();
        za zaVar = new za(context, 6);
        zaVar.setOrientation(1);
        o oVar = new o(this, context);
        zaVar.b = oVar;
        oVar.a(this.q1);
        zaVar.c = new n(this, context);
        zaVar.d = new p(this, context);
        l lVar = new l(context, this.J0);
        lVar.setAdapter(new li.w(zaVar, 4));
        zaVar.addView(lVar, na.l(1.0f, -1, 0));
        zaVar.addView(kVar, na.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, na.o(28, 28));
        linearLayout2.addView(lVar.k(8, false), na.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, na.o(28, 28));
        zaVar.addView(linearLayout2, na.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.m1 = zaVar;
        linearLayout.addView(zaVar, na.o(-1, 0));
        j jVar = new j(this, context, linearLayout);
        jVar.addView(linearLayout);
        this.O = jVar;
    }

    public final void J0(int i7, int i10) {
        View findFocus;
        if (!this.t1) {
            if (i10 != 2) {
                return;
            } else {
                this.t1 = true;
            }
        }
        za zaVar = this.m1;
        if (i10 != 5 && (findFocus = zaVar.findFocus()) != null) {
            findFocus.clearFocus();
            org.telegram.messenger.g0.v1(findFocus);
        }
        if (i10 != 3) {
            ((o) zaVar.b).a(i7);
        }
        if (i10 != 0) {
            n nVar = (n) zaVar.c;
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
        p pVar = (p) zaVar.d;
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

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.r1;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.q1));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
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
