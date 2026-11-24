// default package

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class sr extends TextView implements arb {
    public final kp a;
    public final pr b;
    public final hr c;
    public iq d;
    public boolean e;
    public ni6 f;
    public Future h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yqb.a(context);
        this.e = false;
        this.f = null;
        dpb.a(getContext(), this);
        kp kpVar = new kp(this);
        this.a = kpVar;
        kpVar.g(attributeSet, i);
        pr prVar = new pr(this);
        this.b = prVar;
        prVar.f(attributeSet, i);
        prVar.b();
        hr hrVar = new hr();
        hrVar.a = this;
        this.c = hrVar;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private iq getEmojiTextViewHelper() {
        iq iqVar = this.d;
        if (iqVar != null) {
            return iqVar;
        }
        iq iqVar2 = new iq(this);
        this.d = iqVar2;
        return iqVar2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.b();
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (ghc.b) {
            return super.getAutoSizeMaxTextSize();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (ghc.b) {
            return super.getAutoSizeMinTextSize();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (ghc.b) {
            return super.getAutoSizeStepGranularity();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (ghc.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        pr prVar = this.b;
        return prVar != null ? prVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (ghc.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        pr prVar = this.b;
        if (prVar != null) {
            return prVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mxe.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public qr getSuperCaller() {
        ni6 ni6Var = this.f;
        if (ni6Var != null) {
            return ni6Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            rr rrVar = new rr(this);
            this.f = rrVar;
            return rrVar;
        }
        if (i < 26) {
            return ni6Var;
        }
        ni6 ni6Var2 = new ni6(this, (byte) 5);
        this.f = ni6Var2;
        return ni6Var2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.h;
        if (future != null) {
            try {
                this.h = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                mxe.a(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        hr hrVar;
        if (Build.VERSION.SDK_INT >= 28 || (hrVar = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = hrVar.b;
        return textClassifier == null ? gr.a(hrVar.a) : textClassifier;
    }

    public bi8 getTextMetricsParamsCompat() {
        return mxe.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        pr.h(editorInfo, onCreateInputConnection, this);
        jod.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pr prVar = this.b;
        if (prVar == null || ghc.b) {
            return;
        }
        prVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.h;
        if (future != null) {
            try {
                this.h = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                mxe.a(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        pr prVar = this.b;
        if (prVar != null) {
            zr zrVar = prVar.i;
            if (ghc.b || !zrVar.f()) {
                return;
            }
            zrVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ghc.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (ghc.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ghc.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? kod.a(context, i) : null, i2 != 0 ? kod.a(context, i2) : null, i3 != 0 ? kod.a(context, i3) : null, i4 != 0 ? kod.a(context, i4) : null);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? kod.a(context, i) : null, i2 != 0 ? kod.a(context, i2) : null, i3 != 0 ? kod.a(context, i3) : null, i4 != 0 ? kod.a(context, i4) : null);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mxe.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fhe) getEmojiTextViewHelper().b.a).a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            mxe.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i);
        } else {
            mxe.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        if (i < 0) {
            i98.g();
            return;
        }
        if (i != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i - r0, 1.0f);
        }
    }

    public void setPrecomputedText(ci8 ci8Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        mxe.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }

    @Override // arb
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pr prVar = this.b;
        prVar.l(colorStateList);
        prVar.b();
    }

    @Override // arb
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pr prVar = this.b;
        prVar.m(mode);
        prVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        hr hrVar;
        if (Build.VERSION.SDK_INT >= 28 || (hrVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            hrVar.b = textClassifier;
        }
    }

    public void setTextFuture(Future<ci8> future) {
        this.h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(bi8 bi8Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bi8Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(bi8Var.a);
        setBreakStrategy(bi8Var.c);
        setHyphenationFrequency(bi8Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = ghc.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            zr zrVar = prVar.i;
            if (z || zrVar.f()) {
                return;
            }
            zrVar.g(f, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            xye xyeVar = s5c.a;
            if (context == null) {
                u36.j("Context cannot be null");
                return;
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    public sr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
