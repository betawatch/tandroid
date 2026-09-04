package qg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.vision.e2;
import ji.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.q6;
import org.telegram.ui.wy0;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class x extends f3 {
    public static final /* synthetic */ int s = 0;
    public final bi.v0 b;
    public final ImageView c;
    public final q6 d;
    public final Path e;
    public int f;
    public q0.a h;
    public u n;
    public boolean r;

    public x(Context context, f6 f6Var) {
        super(1, context, f6Var, true);
        this.e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new wy0(13, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(j6.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new m4(this, 6));
        q6 q6Var = new q6(this, context);
        this.d = q6Var;
        q6Var.d = Color.alpha(-65536) / 255.0f;
        q6Var.a();
        q6Var.invalidate();
        bi.v0 v0Var = new bi.v0(context, 4);
        v0Var.setOrientation(1);
        t tVar = new t(this, context);
        v0Var.b = tVar;
        tVar.a(this.f);
        v0Var.c = new s(this, context);
        v0Var.d = new w(this, context);
        p pVar = new p(context, this.resourcesProvider);
        pVar.setAdapter(new q(v0Var));
        v0Var.addView(pVar, x5.l(1.0f, -1, 0));
        v0Var.addView(q6Var, x5.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, x5.n(28, 28));
        linearLayout2.addView(pVar.n(8, false), x5.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, x5.n(28, 28));
        v0Var.addView(linearLayout2, x5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.b = v0Var;
        linearLayout.addView(v0Var, x5.n(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f));
        }
    }

    public final void m(int i10, int i11) {
        View findFocus;
        if (!this.r) {
            if (i11 != 2) {
                return;
            } else {
                this.r = true;
            }
        }
        bi.v0 v0Var = this.b;
        if (i11 != 5 && (findFocus = v0Var.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((t) v0Var.b).a(i10);
        }
        if (i11 != 0) {
            s sVar = (s) v0Var.c;
            boolean z10 = i11 != 1;
            sVar.n.f = i10;
            float[] fArr = sVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f7 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                sVar.d = f7 - (f10 <= 0.5f ? 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f) : e2.b(1.0f, f10, 0.22f, 1.0f));
                sVar.e = fArr[0] / 360.0f;
            }
            sVar.invalidate();
        }
        if (i11 != 1) {
            q6 q6Var = this.d;
            q6Var.getClass();
            q6Var.d = Color.alpha(i10) / 255.0f;
            q6Var.a();
            q6Var.invalidate();
        }
        w wVar = (w) v0Var.d;
        wVar.e = true;
        wVar.a.b();
        wVar.b.b();
        wVar.c.b();
        EditTextBoldCursor editTextBoldCursor = wVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(wVar.f.f));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        wVar.e = false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        if (!this.n.g()) {
            this.c.setVisibility(8);
        }
        super.show();
    }
}
