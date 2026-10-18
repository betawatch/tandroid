package qg;

import ai.uc;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.t6;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class x extends f3 {
    public static final /* synthetic */ int s = 0;
    public final uc b;
    public final ImageView c;
    public final t6 d;
    public final Path e;
    public int f;
    public q0.a h;
    public u n;
    public boolean r;

    public x(Context context, d6 d6Var) {
        super(1, context, d6Var, true);
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
        imageView.setBackground(h6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new org.telegram.ui.web.c(1, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(h6.g0(1090519039, 1, -1));
        imageView2.setOnClickListener(new hg.r0(this, 16));
        t6 t6Var = new t6(this, context);
        this.d = t6Var;
        t6Var.d = Color.alpha(-65536) / 255.0f;
        t6Var.a();
        t6Var.invalidate();
        uc ucVar = new uc(context, 5);
        ucVar.setOrientation(1);
        t tVar = new t(this, context);
        ucVar.b = tVar;
        tVar.a(this.f);
        ucVar.c = new s(this, context);
        ucVar.d = new w(this, context);
        p pVar = new p(context, this.resourcesProvider);
        pVar.setAdapter(new q(ucVar));
        ucVar.addView(pVar, z5.l(1.0f, -1, 0));
        ucVar.addView(t6Var, z5.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, z5.n(28, 28));
        linearLayout2.addView(pVar.n(8, false), z5.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, z5.n(28, 28));
        ucVar.addView(linearLayout2, z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.b = ucVar;
        linearLayout.addView(ucVar, z5.n(-1, 0));
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

    public final void n(int i10, int i11) {
        View findFocus;
        if (!this.r) {
            if (i11 != 2) {
                return;
            } else {
                this.r = true;
            }
        }
        uc ucVar = this.b;
        if (i11 != 5 && (findFocus = ucVar.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((t) ucVar.b).a(i10);
        }
        if (i11 != 0) {
            s sVar = (s) ucVar.c;
            boolean z10 = i11 != 1;
            sVar.n.f = i10;
            float[] fArr = sVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f7 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                sVar.d = f7 - (f10 <= 0.5f ? 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f) : k3.D(1.0f, f10, 0.22f, 1.0f));
                sVar.e = fArr[0] / 360.0f;
            }
            sVar.invalidate();
        }
        if (i11 != 1) {
            t6 t6Var = this.d;
            t6Var.getClass();
            t6Var.d = Color.alpha(i10) / 255.0f;
            t6Var.a();
            t6Var.invalidate();
        }
        w wVar = (w) ucVar.d;
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
