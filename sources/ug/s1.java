package ug;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class s1 extends gi.d {
    public final ba l0;
    public final RectF m0;
    public int n0;
    public final c2 o0;
    public final e6 p0;
    public int q0;
    public boolean r0;

    public s1(c2 c2Var, ContextThemeWrapper contextThemeWrapper, e6 e6Var, x9 x9Var) {
        super(contextThemeWrapper, e6Var, false);
        this.m0 = new RectF();
        this.q0 = 8;
        this.p0 = e6Var;
        this.o0 = c2Var;
        this.l0 = new ba(x9Var, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(org.telegram.messenger.g0.o());
        removeView(this.r);
        setForeground(k6.a0(k6.r1(0.08f, -1), 8, 8));
        setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
    }

    @Override // gi.d, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10 = this.h0;
        RectF rectF = this.m0;
        if (z10) {
            float c2 = this.d.c() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - c2) / 2.0f, 0.0f, (getMeasuredWidth() + c2) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override // gi.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (this.r0) {
            i3 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), TLObject.FLAG_30);
        }
        super.onMeasure(i3, i10);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        z1[] z1VarArr;
        c2 c2Var = this.o0;
        if (!c2Var.E || (z1VarArr = c2Var.I) == null || z1VarArr.length <= 0) {
            f10 = 0.0f;
        }
        super.setAlpha(f10);
    }

    public void setCancelState(boolean z10) {
        this.n0 = 2;
        i(bd.M0(2131752589, null), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.n0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(R.drawable.media_magic_cut, 0);
        wpVar.c(org.telegram.messenger.g0.L(22.0f));
        wpVar.r = org.telegram.messenger.g0.L(1.0f);
        wpVar.s = org.telegram.messenger.g0.L(2.0f);
        wpVar.H = 1.2f;
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131745690, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.n0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(R.drawable.media_button_erase, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131745688, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.n0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(R.drawable.media_sticker_stroke, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131745687, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setRad(int i3) {
        this.q0 = i3;
        setForeground(k6.a0(k6.w0(k6.i6, this.p0), i3, i3));
    }

    public void setRestoreState(boolean z10) {
        this.n0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(R.drawable.media_button_restore, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131745686, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.n0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.n0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(R.drawable.photo_undo2, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131745684, null));
        i(spannableStringBuilder, z10, true);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i3);
        }
    }
}
