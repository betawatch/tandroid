package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.st;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d1 extends st {
    public boolean A;
    public s80 B;
    public Paint C;
    public Layout D;
    public int E;
    public boolean F;
    public final x0 G;
    public TL_iv.PageBlock H;
    public int I;
    public float J;
    public float K;
    public long L;
    public int M;
    public c4 N;
    public boolean O;
    public final y0 P;
    public c1 c;
    public b1 d;
    public final c6 e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [th.x0] */
    public d1(Context context, c6 c6Var) {
        super(context, c6Var);
        this.f = UserConfig.selectedAccount;
        this.E = -1;
        this.F = true;
        this.G = new InputFilter() { // from class: th.x0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                d1 d1Var = d1.this;
                if (!d1Var.v || d1Var.h) {
                    return null;
                }
                c1 c1Var = d1Var.c;
                if (c1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    c1Var.Z0(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.I = g6.G6;
        this.P = new y0(this, 0);
        this.e = c6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        org.telegram.ui.ActionBar.k0 k0Var = new org.telegram.ui.ActionBar.k0(5);
        z0 z0Var = new z0(this);
        setCustomSelectionActionModeCallback(k0Var);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(z0Var);
        }
        setOnLongClickListener(new bg.g0(this, 3));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new jh.j(this, 2));
        addTextChangedListener(new a1(this));
        t();
    }

    @Override // org.telegram.ui.Components.st, org.telegram.ui.ActionBar.u4
    public final void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        v5.o(text, i11, min, i10, true, this.H);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }

    @Override // org.telegram.ui.Components.st
    public final c51 createUrlSpan(String str) {
        return v5.k(str);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        c1 c1Var;
        if (keyEvent.getKeyCode() != 61) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode != 66 && keyCode != 160) || this.c == null || this.w) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0) {
                boolean z10 = (keyEvent.getFlags() & 2) != 0;
                if (this.r && (z10 || keyEvent.isShiftPressed())) {
                    p();
                    return true;
                }
                this.c.S0(this);
            }
        } else if (keyEvent.getAction() == 0 && (c1Var = this.c) != null) {
            c1Var.t1(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.st, org.telegram.ui.ActionBar.u4
    public final int getCurrentStyle(int i10, int i11) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i10)) < (min = Math.min(i11, text.length()))) {
            return v5.q(max, min, text);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public c6 getResourcesProvider() {
        return this.e;
    }

    public final void m() {
        Editable text = getText();
        if (text == null) {
            return;
        }
        c4[] c4VarArr = (c4[]) text.getSpans(0, text.length(), c4.class);
        for (c4 c4Var : c4VarArr) {
            c4Var.d(text);
        }
        for (c4 c4Var2 : c4VarArr) {
            c4Var2.a(this.f, this, this.e);
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.g4 g4Var = this.floatingActionMode;
        if (g4Var != null) {
            try {
                g4Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.st
    public final void notifySpansChanged() {
        super.notifySpansChanged();
        this.F = true;
        invalidate();
    }

    public final c4 o(float f9, float f10) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f10 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f9 - getTotalPaddingLeft()) + getScrollX();
            for (c4 c4Var : (c4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), c4.class)) {
                int spanStart = text.getSpanStart(c4Var);
                int spanEnd = text.getSpanEnd(c4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return c4Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ut, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ut, android.view.View
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.P);
        this.N = null;
        this.O = false;
        Editable text = getText();
        if (text != null) {
            for (c4 c4Var : (c4[]) text.getSpans(0, text.length(), c4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = c4Var.b;
                if (richButtonSpan != null && c4Var.c == this) {
                    richButtonSpan.detach(this);
                    c4Var.c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.Components.st, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ut, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        Layout layout = getLayout();
        s80 s80Var = null;
        if (layout == null) {
            this.B = null;
            this.D = null;
            this.E = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.F || layout != this.D || text.length() != this.E) {
                this.F = false;
                this.D = layout;
                this.E = text.length();
                this.B = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    i01[] i01VarArr = (i01[]) spanned.getSpans(0, spanned.length(), i01.class);
                    int length = i01VarArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        i01 i01Var = i01VarArr[i11];
                        int i12 = i01Var.b.a;
                        if ((65536 & i12) != 0) {
                            int spanStart = spanned.getSpanStart(i01Var);
                            int spanEnd = spanned.getSpanEnd(i01Var);
                            s80Var = s80Var;
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (s80Var == null) {
                                    s80 s80Var2 = new s80(0);
                                    s80Var2.n = false;
                                    s80Var = s80Var2;
                                }
                                s80Var.d(layout, spanStart, 0.0f);
                                int dp = (32768 & i12) != 0 ? -AndroidUtilities.dp(6.0f) : (i12 & 16384) != 0 ? AndroidUtilities.dp(2.0f) : 0;
                                if (dp != 0) {
                                    i10 = AndroidUtilities.dp(dp > 0 ? 5.0f : -2.0f) + dp;
                                } else {
                                    i10 = 0;
                                }
                                s80Var.o = i10;
                                layout.getSelectionPath(spanStart, spanEnd, s80Var);
                            }
                        }
                        i11++;
                        s80Var = s80Var;
                    }
                    if (s80Var != null) {
                        s80Var.n = true;
                    }
                    this.B = s80Var;
                }
            }
        }
        if (this.B != null) {
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setPathEffect(s80.c());
            }
            this.C.setColor(g6.v0(g6.K6, this.e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.B, this.C);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && this.c != null) {
            if (length() == 0) {
                this.c.u0();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.c.r0(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.ut, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        c1 c1Var = this.c;
        if (c1Var != null) {
            c1Var.T0(this, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.ut, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        q();
    }

    @Override // org.telegram.ui.Components.st, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        c1 c1Var;
        c1 c1Var2;
        if (i10 == 16908319 && (c1Var2 = this.c) != null && c1Var2.m()) {
            return true;
        }
        if (i10 == 16908322 && (c1Var = this.c) != null && c1Var.i1(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.c != null && isEnabled() && isFocusable()) {
            this.c.e(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            r rVar = null;
            y0 y0Var = this.P;
            int i10 = 0;
            if (action == 0) {
                this.J = motionEvent.getX();
                this.K = motionEvent.getY();
                this.L = motionEvent.getEventTime();
                c4 o10 = o(motionEvent.getX(), motionEvent.getY());
                this.N = o10;
                if (o10 != null && this.d != null) {
                    this.O = false;
                    o10.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(y0Var);
                    AndroidUtilities.runOnUIThread(y0Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.N = null;
            } else {
                c4 c4Var = this.N;
                if (c4Var != null) {
                    boolean z10 = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z11 = motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == c4Var;
                    if (!z11 || z10) {
                        c4Var.b().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(y0Var);
                    }
                    if (z10) {
                        this.N = null;
                        if (!this.O && z11 && motionEvent.getAction() == 1) {
                            ((m2) this.d).a(this, c4Var, false);
                        }
                        this.O = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.M == 0) {
                        this.M = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x4 = motionEvent.getX() - this.J;
                    float y8 = motionEvent.getY() - this.K;
                    float f9 = (y8 * y8) + (x4 * x4);
                    int i11 = this.M;
                    if (f9 <= i11 * i11 && motionEvent.getEventTime() - this.L < ViewConfiguration.getLongPressTimeout()) {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y10 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x10 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                r[] rVarArr = (r[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), r.class);
                                int length = rVarArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    r rVar2 = rVarArr[i10];
                                    int spanStart = text.getSpanStart(rVar2);
                                    int spanEnd = text.getSpanEnd(rVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                                            rVar = rVar2;
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                        if (rVar != null) {
                            p.U(getContext(), rVar.a, new yu0(21, this, rVar), this.e);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        int max = Math.max(0, getSelectionStart());
        int max2 = Math.max(0, getSelectionEnd());
        if (max > max2) {
            max2 = max;
            max = max2;
        }
        this.n = true;
        getText().replace(max, max2, "\n");
        this.n = false;
        setSelection(max + 1);
    }

    public final void q() {
        if (this.x) {
            this.y = true;
            int dp = AndroidUtilities.dp(2.0f);
            CharSequence hint = getHint();
            if (length() != 0 || getWidth() <= 0 || TextUtils.isEmpty(hint)) {
                super.setGravity(17);
                setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
            } else {
                int max = Math.max(0, Math.round(((getWidth() - (dp * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
                super.setGravity(51);
                setPadding(max + dp, getPaddingTop(), dp, getPaddingBottom());
            }
            this.y = false;
        }
    }

    public final void r() {
        c1 c1Var = this.c;
        if (c1Var != null) {
            c1Var.e(this);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override // org.telegram.ui.Components.st, org.telegram.ui.ActionBar.u4
    public final void removeStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        if ((i10 & 1) != 0) {
            this.A = false;
        }
        v5.o(text, i11, min, i10, false, this.H);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }

    public final void s() {
        n();
        if (isFocused()) {
            clearFocus();
        }
        r();
        n();
        post(new y0(this, 1));
    }

    public void setAccentHint(boolean z10) {
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        t();
    }

    public void setAllowNewlines(boolean z10) {
        this.w = z10;
    }

    public void setAutoBold(boolean z10) {
        this.A = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.H = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        if (z10) {
            q();
        } else {
            int dp = AndroidUtilities.dp(2.0f);
            setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (!this.y) {
            this.x = false;
        }
        super.setGravity(i10);
    }

    public void setInlineButtonClickListener(b1 b1Var) {
        this.d = b1Var;
    }

    public void setInlineButtonContext(int i10) {
        this.f = i10;
        m();
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        InputMethodManager inputMethodManager;
        boolean z10 = getInputType() != i10;
        super.setInputType(i10);
        if (z10 && isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(c1 c1Var) {
        this.c = c1Var;
    }

    public void setLocked(boolean z10) {
        x0 x0Var;
        boolean z11;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i10 = 0;
        while (true) {
            x0Var = this.G;
            if (i10 >= length) {
                z11 = false;
                break;
            } else {
                if (filters[i10] == x0Var) {
                    z11 = true;
                    break;
                }
                i10++;
            }
        }
        if (z10 && !z11) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = x0Var;
            setFilters(inputFilterArr);
        }
        boolean z12 = !z10;
        setAllowDrawCursor(z12);
        setCursorVisible(z12);
    }

    public void setSoftEnterNewline(boolean z10) {
        this.r = z10;
    }

    public void setTextColorKey(int i10) {
        this.I = i10;
        t();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.h = true;
        setText(charSequence);
        m();
        setSelection(length());
        this.h = false;
    }

    public final void t() {
        int i10 = this.I;
        c6 c6Var = this.e;
        setTextColor(g6.v0(i10, c6Var));
        setLinkTextColor(g6.v0(g6.gc, c6Var));
        setHintTextColor(this.s ? g6.l1(0.5f, g6.v0(g6.Oh, c6Var)) : g6.v0(g6.H6, c6Var));
        setCursorColor(g6.v0(g6.G6, c6Var));
        setHandlesColor(g6.v0(g6.l6, c6Var));
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
