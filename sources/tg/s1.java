package tg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class s1 extends fi.d {
    public final ca k0;
    public final RectF l0;
    public int m0;
    public final c2 n0;
    public final g6 o0;
    public int p0;
    public boolean q0;

    public s1(c2 c2Var, ContextThemeWrapper contextThemeWrapper, g6 g6Var, y9 y9Var) {
        super(contextThemeWrapper, g6Var, false);
        this.l0 = new RectF();
        this.p0 = 8;
        this.o0 = g6Var;
        this.n0 = c2Var;
        this.k0 = new ca(y9Var, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(org.telegram.messenger.g0.o());
        removeView(this.r);
        setForeground(l6.a0(l6.r1(0.08f, -1), 8, 8));
        setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
    }

    @Override // fi.d, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z9 = this.g0;
        RectF rectF = this.l0;
        if (z9) {
            float c10 = this.d.c() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - c10) / 2.0f, 0.0f, (getMeasuredWidth() + c10) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override // fi.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.q0) {
            i7 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        z1[] z1VarArr;
        c2 c2Var = this.n0;
        if (!c2Var.D || (z1VarArr = c2Var.H) == null || z1VarArr.length <= 0) {
            f10 = 0.0f;
        }
        super.setAlpha(f10);
    }

    public void setCancelState(boolean z9) {
        this.m0 = 2;
        i(id.M0(2131752589, null), z9, true);
    }

    public void setCutOutState(boolean z9) {
        this.m0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(R.drawable.media_magic_cut, 0);
        wpVar.c(org.telegram.messenger.g0.L(22.0f));
        wpVar.r = org.telegram.messenger.g0.L(1.0f);
        wpVar.s = org.telegram.messenger.g0.L(2.0f);
        wpVar.G = 1.2f;
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131745680, null));
        i(spannableStringBuilder, z9, true);
    }

    public void setEraseState(boolean z9) {
        this.m0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(R.drawable.media_button_erase, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131745678, null));
        i(spannableStringBuilder, z9, true);
    }

    public void setOutlineState(boolean z9) {
        this.m0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(R.drawable.media_sticker_stroke, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131745677, null));
        i(spannableStringBuilder, z9, true);
    }

    public void setRad(int i7) {
        this.p0 = i7;
        setForeground(l6.a0(l6.w0(l6.i6, this.o0), i7, i7));
    }

    public void setRestoreState(boolean z9) {
        this.m0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(R.drawable.media_button_restore, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131745676, null));
        i(spannableStringBuilder, z9, true);
    }

    public void setUndoCutState(boolean z9) {
        this.m0 = 1;
    }

    public void setUndoState(boolean z9) {
        this.m0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(R.drawable.photo_undo2, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131745674, null));
        i(spannableStringBuilder, z9, true);
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
