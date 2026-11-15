package tg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class s1 extends hi.d {
    public final y9 l0;
    public final RectF m0;
    public int n0;
    public final e2 o0;
    public final e6 p0;
    public int q0;
    public boolean r0;

    public s1(e2 e2Var, ContextThemeWrapper contextThemeWrapper, e6 e6Var, u9 u9Var) {
        super(contextThemeWrapper, e6Var, false);
        this.m0 = new RectF();
        this.q0 = 8;
        this.p0 = e6Var;
        this.o0 = e2Var;
        this.l0 = new y9(u9Var, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(org.telegram.messenger.g0.o());
        removeView(this.r);
        setForeground(j6.a0(j6.r1(0.08f, -1), 8, 8));
        setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
    }

    @Override // hi.d, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10 = this.h0;
        RectF rectF = this.m0;
        if (z10) {
            float c10 = this.d.c() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - c10) / 2.0f, 0.0f, (getMeasuredWidth() + c10) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override // hi.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.r0) {
            i7 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        b2[] b2VarArr;
        e2 e2Var = this.o0;
        if (!e2Var.E || (b2VarArr = e2Var.I) == null || b2VarArr.length <= 0) {
            f10 = 0.0f;
        }
        super.setAlpha(f10);
    }

    public void setCancelState(boolean z10) {
        this.n0 = 2;
        i(hd.M0(2131752589, null), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.n0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        eq eqVar = new eq(R.drawable.media_magic_cut, 0);
        eqVar.c(org.telegram.messenger.g0.L(22.0f));
        eqVar.r = org.telegram.messenger.g0.L(1.0f);
        eqVar.s = org.telegram.messenger.g0.L(2.0f);
        eqVar.H = 1.2f;
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131745680, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.n0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        eq eqVar = new eq(R.drawable.media_button_erase, 0);
        eqVar.c(org.telegram.messenger.g0.L(20.0f));
        eqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131745678, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.n0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        eq eqVar = new eq(R.drawable.media_sticker_stroke, 0);
        eqVar.c(org.telegram.messenger.g0.L(20.0f));
        eqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131745677, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setRad(int i7) {
        this.q0 = i7;
        setForeground(j6.a0(j6.w0(j6.i6, this.p0), i7, i7));
    }

    public void setRestoreState(boolean z10) {
        this.n0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        eq eqVar = new eq(R.drawable.media_button_restore, 0);
        eqVar.c(org.telegram.messenger.g0.L(20.0f));
        eqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131745676, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.n0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.n0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        eq eqVar = new eq(R.drawable.photo_undo2, 0);
        eqVar.c(org.telegram.messenger.g0.L(20.0f));
        eqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131745674, null));
        i(spannableStringBuilder, z10, true);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i7);
        }
    }
}
