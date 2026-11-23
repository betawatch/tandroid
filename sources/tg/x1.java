package tg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.kq;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class x1 extends hi.e {
    public final fa m0;
    public final RectF n0;
    public int o0;
    public final i2 p0;
    public final i6 q0;
    public int r0;
    public boolean s0;

    public x1(i2 i2Var, ContextThemeWrapper contextThemeWrapper, i6 i6Var, ba baVar) {
        super(contextThemeWrapper, i6Var, false);
        this.n0 = new RectF();
        this.r0 = 8;
        this.q0 = i6Var;
        this.p0 = i2Var;
        this.m0 = new fa(baVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(org.telegram.messenger.g0.o());
        removeView(this.r);
        setForeground(n6.a0(n6.r1(0.08f, -1), 8, 8));
        setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
    }

    @Override // hi.e, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10 = this.i0;
        RectF rectF = this.n0;
        if (z10) {
            float c10 = this.d.c() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - c10) / 2.0f, 0.0f, (getMeasuredWidth() + c10) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override // hi.e, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.s0) {
            i7 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        f2[] f2VarArr;
        i2 i2Var = this.p0;
        if (!i2Var.E || (f2VarArr = i2Var.I) == null || f2VarArr.length <= 0) {
            f10 = 0.0f;
        }
        super.setAlpha(f10);
    }

    public void setCancelState(boolean z10) {
        this.o0 = 2;
        i(gd.N0(2131752577, null), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.o0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        kq kqVar = new kq(R.drawable.media_magic_cut, 0);
        kqVar.c(org.telegram.messenger.g0.L(22.0f));
        kqVar.r = org.telegram.messenger.g0.L(1.0f);
        kqVar.s = org.telegram.messenger.g0.L(2.0f);
        kqVar.H = 1.2f;
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131745484, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.o0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        kq kqVar = new kq(R.drawable.media_button_erase, 0);
        kqVar.c(org.telegram.messenger.g0.L(20.0f));
        kqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131745482, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.o0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        kq kqVar = new kq(R.drawable.media_sticker_stroke, 0);
        kqVar.c(org.telegram.messenger.g0.L(20.0f));
        kqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131745481, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setRad(int i7) {
        this.r0 = i7;
        setForeground(n6.a0(n6.w0(n6.i6, this.q0), i7, i7));
    }

    public void setRestoreState(boolean z10) {
        this.o0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        kq kqVar = new kq(R.drawable.media_button_restore, 0);
        kqVar.c(org.telegram.messenger.g0.L(20.0f));
        kqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131745480, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.o0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.o0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        kq kqVar = new kq(R.drawable.photo_undo2, 0);
        kqVar.c(org.telegram.messenger.g0.L(20.0f));
        kqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131745478, null));
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
