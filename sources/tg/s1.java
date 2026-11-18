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
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.lq;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class s1 extends hi.d {
    public final ga m0;
    public final RectF n0;
    public int o0;
    public final e2 p0;
    public final i6 q0;
    public int r0;
    public boolean s0;

    public s1(e2 e2Var, ContextThemeWrapper contextThemeWrapper, i6 i6Var, ca caVar) {
        super(contextThemeWrapper, i6Var, false);
        this.n0 = new RectF();
        this.r0 = 8;
        this.q0 = i6Var;
        this.p0 = e2Var;
        this.m0 = new ga(caVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(org.telegram.messenger.g0.o());
        removeView(this.r);
        setForeground(n6.a0(n6.r1(0.08f, -1), 8, 8));
        setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
    }

    @Override // hi.d, android.view.View
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

    @Override // hi.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.s0) {
            i7 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        b2[] b2VarArr;
        e2 e2Var = this.p0;
        if (!e2Var.E || (b2VarArr = e2Var.I) == null || b2VarArr.length <= 0) {
            f10 = 0.0f;
        }
        super.setAlpha(f10);
    }

    public void setCancelState(boolean z10) {
        this.o0 = 2;
        i(gd.M0(2131752578, null), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.o0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        lq lqVar = new lq(R.drawable.media_magic_cut, 0);
        lqVar.c(org.telegram.messenger.g0.L(22.0f));
        lqVar.r = org.telegram.messenger.g0.L(1.0f);
        lqVar.s = org.telegram.messenger.g0.L(2.0f);
        lqVar.H = 1.2f;
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.M0(2131745485, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.o0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        lq lqVar = new lq(R.drawable.media_button_erase, 0);
        lqVar.c(org.telegram.messenger.g0.L(20.0f));
        lqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.M0(2131745483, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.o0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        lq lqVar = new lq(R.drawable.media_sticker_stroke, 0);
        lqVar.c(org.telegram.messenger.g0.L(20.0f));
        lqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.M0(2131745482, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setRad(int i7) {
        this.r0 = i7;
        setForeground(n6.a0(n6.w0(n6.i6, this.q0), i7, i7));
    }

    public void setRestoreState(boolean z10) {
        this.o0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        lq lqVar = new lq(R.drawable.media_button_restore, 0);
        lqVar.c(org.telegram.messenger.g0.L(20.0f));
        lqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.M0(2131745481, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.o0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.o0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        lq lqVar = new lq(R.drawable.photo_undo2, 0);
        lqVar.c(org.telegram.messenger.g0.L(20.0f));
        lqVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.M0(2131745479, null));
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
