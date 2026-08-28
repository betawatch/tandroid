package xf;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import g7.e6;
import gh.x9;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.p6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x extends f3 {
    public static final /* synthetic */ int s = 0;
    public final x9 b;
    public final ImageView c;
    public final p6 d;
    public final Path e;
    public int f;
    public q0.a h;
    public u n;
    public boolean r;

    public x(Context context, b6 b6Var) {
        super(context, b6Var, true, false);
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
        imageView.setBackground(f6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new pf.v(4, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(f6.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new x8(this, 23));
        p6 p6Var = new p6(this, context);
        this.d = p6Var;
        p6Var.d = Color.alpha(-65536) / 255.0f;
        p6Var.a();
        p6Var.invalidate();
        x9 x9Var = new x9(context, 5);
        x9Var.setOrientation(1);
        t tVar = new t(this, context);
        x9Var.b = tVar;
        tVar.a(this.f);
        x9Var.c = new s(this, context);
        x9Var.d = new w(this, context);
        p pVar = new p(context, this.resourcesProvider);
        pVar.setAdapter(new q(x9Var));
        x9Var.addView(pVar, e6.l(1.0f, -1, 0));
        x9Var.addView(p6Var, e6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, e6.n(28, 28));
        linearLayout2.addView(pVar.n(8, false), e6.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, e6.n(28, 28));
        x9Var.addView(linearLayout2, e6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.b = x9Var;
        linearLayout.addView(x9Var, e6.n(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f));
        }
    }

    public final void m(int i9, int i10) {
        View findFocus;
        if (!this.r) {
            if (i10 != 2) {
                return;
            } else {
                this.r = true;
            }
        }
        x9 x9Var = this.b;
        if (i10 != 5 && (findFocus = x9Var.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i10 != 3) {
            ((t) x9Var.b).a(i9);
        }
        if (i10 != 0) {
            s sVar = (s) x9Var.c;
            boolean z10 = i10 != 1;
            sVar.n.f = i9;
            float[] fArr = sVar.h;
            Color.colorToHSV(i9, fArr);
            if (z10) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                sVar.d = f10 - (f11 <= 0.5f ? 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f) : j3.r0.C(1.0f, f11, 0.22f, 1.0f));
                sVar.e = fArr[0] / 360.0f;
            }
            sVar.invalidate();
        }
        if (i10 != 1) {
            p6 p6Var = this.d;
            p6Var.getClass();
            p6Var.d = Color.alpha(i9) / 255.0f;
            p6Var.a();
            p6Var.invalidate();
        }
        w wVar = (w) x9Var.d;
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
