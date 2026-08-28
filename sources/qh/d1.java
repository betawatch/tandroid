package qh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.eb0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d1 extends mt {
    public boolean A;
    public f80 B;
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
    public b4 N;
    public boolean O;
    public final y0 P;
    public c1 c;
    public b1 d;
    public final b6 e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [qh.x0] */
    public d1(Context context, b6 b6Var) {
        super(context, b6Var);
        this.f = UserConfig.selectedAccount;
        this.E = -1;
        this.F = true;
        this.G = new InputFilter() { // from class: qh.x0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
                d1 d1Var = d1.this;
                if (!d1Var.v || d1Var.h) {
                    return null;
                }
                c1 c1Var = d1Var.c;
                if (c1Var != null && charSequence != null && i10 > i9 && i11 == i12) {
                    c1Var.h1(charSequence.subSequence(i9, i10));
                }
                return spanned.subSequence(i11, i12);
            }
        };
        this.I = f6.G6;
        this.P = new y0(this, 0);
        this.e = b6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        org.telegram.ui.ActionBar.j0 j0Var = new org.telegram.ui.ActionBar.j0(5);
        z0 z0Var = new z0(this);
        setCustomSelectionActionModeCallback(j0Var);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(z0Var);
        }
        setOnLongClickListener(new kh.d5(this, 2));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new gh.k(this, 2));
        addTextChangedListener(new a1(this));
        t();
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.ActionBar.u4
    public final void addStyle(int i9, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text == null || i10 < 0 || i11 < 0 || i10 >= i11 || i10 >= (min = Math.min(i11, text.length()))) {
            return;
        }
        u5.o(text, i10, min, i9, true, this.H);
        if ((i9 & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }

    @Override // org.telegram.ui.Components.mt
    public final r41 createUrlSpan(String str) {
        return u5.k(str);
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
                this.c.L0(this);
            }
        } else if (keyEvent.getAction() == 0 && (c1Var = this.c) != null) {
            c1Var.T1(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.ActionBar.u4
    public final int getCurrentStyle(int i9, int i10) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i9)) < (min = Math.min(i10, text.length()))) {
            return u5.q(max, min, text);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public b6 getResourcesProvider() {
        return this.e;
    }

    public final void m() {
        Editable text = getText();
        if (text == null) {
            return;
        }
        b4[] b4VarArr = (b4[]) text.getSpans(0, text.length(), b4.class);
        for (b4 b4Var : b4VarArr) {
            b4Var.d(text);
        }
        for (b4 b4Var2 : b4VarArr) {
            b4Var2.a(this.f, this, this.e);
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

    @Override // org.telegram.ui.Components.mt
    public final void notifySpansChanged() {
        super.notifySpansChanged();
        this.F = true;
        invalidate();
    }

    public final b4 o(float f10, float f11) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f11 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f10 - getTotalPaddingLeft()) + getScrollX();
            for (b4 b4Var : (b4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), b4.class)) {
                int spanStart = text.getSpanStart(b4Var);
                int spanEnd = text.getSpanEnd(b4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return b4Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.view.View
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.P);
        this.N = null;
        this.O = false;
        Editable text = getText();
        if (text != null) {
            for (b4 b4Var : (b4[]) text.getSpans(0, text.length(), b4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = b4Var.b;
                if (richButtonSpan != null && b4Var.c == this) {
                    richButtonSpan.detach(this);
                    b4Var.c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        Layout layout = getLayout();
        f80 f80Var = null;
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
                    wz0[] wz0VarArr = (wz0[]) spanned.getSpans(0, spanned.length(), wz0.class);
                    int length = wz0VarArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        wz0 wz0Var = wz0VarArr[i10];
                        int i11 = wz0Var.b.a;
                        if ((65536 & i11) != 0) {
                            int spanStart = spanned.getSpanStart(wz0Var);
                            int spanEnd = spanned.getSpanEnd(wz0Var);
                            f80Var = f80Var;
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (f80Var == null) {
                                    f80 f80Var2 = new f80(0);
                                    f80Var2.n = false;
                                    f80Var = f80Var2;
                                }
                                f80Var.d(layout, spanStart, 0.0f);
                                int dp = (32768 & i11) != 0 ? -AndroidUtilities.dp(6.0f) : (i11 & 16384) != 0 ? AndroidUtilities.dp(2.0f) : 0;
                                if (dp != 0) {
                                    i9 = AndroidUtilities.dp(dp > 0 ? 5.0f : -2.0f) + dp;
                                } else {
                                    i9 = 0;
                                }
                                f80Var.o = i9;
                                layout.getSelectionPath(spanStart, spanEnd, f80Var);
                            }
                        }
                        i10++;
                        f80Var = f80Var;
                    }
                    if (f80Var != null) {
                        f80Var.n = true;
                    }
                    this.B = f80Var;
                }
            }
        }
        if (this.B != null) {
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setPathEffect(f80.c());
            }
            this.C.setColor(f6.v0(f6.K6, this.e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.B, this.C);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 == 67 && this.c != null) {
            if (length() == 0) {
                this.c.J0();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.c.A(this)) {
                return true;
            }
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // org.telegram.ui.Components.ot, android.widget.TextView
    public final void onSelectionChanged(int i9, int i10) {
        super.onSelectionChanged(i9, i10);
        c1 c1Var = this.c;
        if (c1Var != null) {
            c1Var.k1(this, i9, i10);
        }
    }

    @Override // org.telegram.ui.Components.ot, android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        q();
    }

    @Override // org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i9) {
        c1 c1Var;
        c1 c1Var2;
        if (i9 == 16908319 && (c1Var2 = this.c) != null && c1Var2.p()) {
            return true;
        }
        if (i9 == 16908322 && (c1Var = this.c) != null && c1Var.U1(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i9);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.c != null && isEnabled() && isFocusable()) {
            this.c.d(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            r rVar = null;
            y0 y0Var = this.P;
            int i9 = 0;
            if (action == 0) {
                this.J = motionEvent.getX();
                this.K = motionEvent.getY();
                this.L = motionEvent.getEventTime();
                b4 o6 = o(motionEvent.getX(), motionEvent.getY());
                this.N = o6;
                if (o6 != null && this.d != null) {
                    this.O = false;
                    o6.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(y0Var);
                    AndroidUtilities.runOnUIThread(y0Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.N = null;
            } else {
                b4 b4Var = this.N;
                if (b4Var != null) {
                    boolean z10 = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z11 = motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == b4Var;
                    if (!z11 || z10) {
                        b4Var.b().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(y0Var);
                    }
                    if (z10) {
                        this.N = null;
                        if (!this.O && z11 && motionEvent.getAction() == 1) {
                            ((m2) this.d).a(this, b4Var, false);
                        }
                        this.O = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.M == 0) {
                        this.M = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.J;
                    float y10 = motionEvent.getY() - this.K;
                    float f10 = (y10 * y10) + (x10 * x10);
                    int i10 = this.M;
                    if (f10 <= i10 * i10 && motionEvent.getEventTime() - this.L < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y11 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                r[] rVarArr = (r[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), r.class);
                                int length = rVarArr.length;
                                while (true) {
                                    if (i9 >= length) {
                                        break;
                                    }
                                    r rVar2 = rVarArr[i9];
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
                                    i9++;
                                }
                            }
                        }
                        if (rVar != null) {
                            p.T(getContext(), rVar.a, new eb0(21, this, rVar), this.e);
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
            c1Var.d(this);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.ActionBar.u4
    public final void removeStyle(int i9, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text == null || i10 < 0 || i11 < 0 || i10 >= i11 || i10 >= (min = Math.min(i11, text.length()))) {
            return;
        }
        if ((i9 & 1) != 0) {
            this.A = false;
        }
        u5.o(text, i10, min, i9, false, this.H);
        if ((i9 & 256) != 0) {
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
    public void setGravity(int i9) {
        if (!this.y) {
            this.x = false;
        }
        super.setGravity(i9);
    }

    public void setInlineButtonClickListener(b1 b1Var) {
        this.d = b1Var;
    }

    public void setInlineButtonContext(int i9) {
        this.f = i9;
        m();
    }

    @Override // android.widget.TextView
    public void setInputType(int i9) {
        InputMethodManager inputMethodManager;
        boolean z10 = getInputType() != i9;
        super.setInputType(i9);
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
        int i9 = 0;
        while (true) {
            x0Var = this.G;
            if (i9 >= length) {
                z11 = false;
                break;
            } else {
                if (filters[i9] == x0Var) {
                    z11 = true;
                    break;
                }
                i9++;
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

    public void setTextColorKey(int i9) {
        this.I = i9;
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
        int i9 = this.I;
        b6 b6Var = this.e;
        setTextColor(f6.v0(i9, b6Var));
        setLinkTextColor(f6.v0(f6.gc, b6Var));
        setHintTextColor(this.s ? f6.l1(0.5f, f6.v0(f6.Oh, b6Var)) : f6.v0(f6.H6, b6Var));
        setCursorColor(f6.v0(f6.G6, b6Var));
        setHandlesColor(f6.v0(f6.l6, b6Var));
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
