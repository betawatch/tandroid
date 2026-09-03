package wh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.z80;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class e1 extends xt {
    public boolean B;
    public z80 C;
    public Paint D;
    public Layout E;
    public int F;
    public boolean G;
    public final y0 H;
    public TL_iv.PageBlock I;
    public int J;
    public float K;
    public float L;
    public long M;
    public int N;
    public e4 O;
    public boolean P;
    public final z0 Q;
    public d1 c;
    public c1 d;
    public final g6 e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [wh.y0] */
    public e1(Context context, g6 g6Var) {
        super(context, g6Var);
        this.f = UserConfig.selectedAccount;
        this.F = -1;
        this.G = true;
        this.H = new InputFilter() { // from class: wh.y0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                e1 e1Var = e1.this;
                if (!e1Var.v || e1Var.h) {
                    return null;
                }
                d1 d1Var = e1Var.c;
                if (d1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    d1Var.H(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.J = k6.G6;
        this.Q = new z0(this, 0);
        this.e = g6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        org.telegram.ui.ActionBar.j0 j0Var = new org.telegram.ui.ActionBar.j0(5);
        a1 a1Var = new a1(this);
        setCustomSelectionActionModeCallback(j0Var);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(a1Var);
        }
        setOnLongClickListener(new eg.d0(this, 3));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new mh.j(this, 2));
        addTextChangedListener(new b1(this));
        t();
    }

    @Override // org.telegram.ui.Components.xt, org.telegram.ui.ActionBar.y4
    public final void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        x5.o(text, i11, min, i10, true, this.I);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }

    @Override // org.telegram.ui.Components.xt
    public final n51 createUrlSpan(String str) {
        return x5.k(str);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        d1 d1Var;
        if (keyEvent.getKeyCode() != 61) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode != 66 && keyCode != 160) || this.c == null || this.w) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0) {
                boolean z4 = (keyEvent.getFlags() & 2) != 0;
                if (this.r && (z4 || keyEvent.isShiftPressed())) {
                    p();
                    return true;
                }
                this.c.o(this);
            }
        } else if (keyEvent.getAction() == 0 && (d1Var = this.c) != null) {
            d1Var.T(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.xt, org.telegram.ui.ActionBar.y4
    public final int getCurrentStyle(int i10, int i11) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i10)) < (min = Math.min(i11, text.length()))) {
            return x5.q(max, min, text);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public g6 getResourcesProvider() {
        return this.e;
    }

    public final void m() {
        Editable text = getText();
        if (text == null) {
            return;
        }
        e4[] e4VarArr = (e4[]) text.getSpans(0, text.length(), e4.class);
        for (e4 e4Var : e4VarArr) {
            e4Var.d(text);
        }
        for (e4 e4Var2 : e4VarArr) {
            e4Var2.a(this.f, this, this.e);
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.k4 k4Var = this.floatingActionMode;
        if (k4Var != null) {
            try {
                k4Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.xt
    public final void notifySpansChanged() {
        super.notifySpansChanged();
        this.G = true;
        invalidate();
    }

    public final e4 o(float f10, float f11) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f11 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f10 - getTotalPaddingLeft()) + getScrollX();
            for (e4 e4Var : (e4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), e4.class)) {
                int spanStart = text.getSpanStart(e4Var);
                int spanEnd = text.getSpanEnd(e4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return e4Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.zt, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.zt, android.view.View
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        this.O = null;
        this.P = false;
        Editable text = getText();
        if (text != null) {
            for (e4 e4Var : (e4[]) text.getSpans(0, text.length(), e4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = e4Var.b;
                if (richButtonSpan != null && e4Var.c == this) {
                    richButtonSpan.detach(this);
                    e4Var.c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.Components.xt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.zt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        Layout layout = getLayout();
        z80 z80Var = null;
        if (layout == null) {
            this.C = null;
            this.E = null;
            this.F = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.G || layout != this.E || text.length() != this.F) {
                this.G = false;
                this.E = layout;
                this.F = text.length();
                this.C = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    t01[] t01VarArr = (t01[]) spanned.getSpans(0, spanned.length(), t01.class);
                    int length = t01VarArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        t01 t01Var = t01VarArr[i11];
                        int i12 = t01Var.b.a;
                        if ((65536 & i12) != 0) {
                            int spanStart = spanned.getSpanStart(t01Var);
                            int spanEnd = spanned.getSpanEnd(t01Var);
                            z80Var = z80Var;
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (z80Var == null) {
                                    z80 z80Var2 = new z80(0);
                                    z80Var2.n = false;
                                    z80Var = z80Var2;
                                }
                                z80Var.d(layout, spanStart, 0.0f);
                                int dp = (32768 & i12) != 0 ? -AndroidUtilities.dp(6.0f) : (i12 & 16384) != 0 ? AndroidUtilities.dp(2.0f) : 0;
                                if (dp != 0) {
                                    i10 = AndroidUtilities.dp(dp > 0 ? 5.0f : -2.0f) + dp;
                                } else {
                                    i10 = 0;
                                }
                                z80Var.o = i10;
                                layout.getSelectionPath(spanStart, spanEnd, z80Var);
                            }
                        }
                        i11++;
                        z80Var = z80Var;
                    }
                    if (z80Var != null) {
                        z80Var.n = true;
                    }
                    this.C = z80Var;
                }
            }
        }
        if (this.C != null) {
            if (this.D == null) {
                Paint paint = new Paint(1);
                this.D = paint;
                paint.setPathEffect(z80.c());
            }
            this.D.setColor(k6.v0(k6.K6, this.e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.C, this.D);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && this.c != null) {
            if (length() == 0) {
                this.c.v();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.c.D(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.zt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        d1 d1Var = this.c;
        if (d1Var != null) {
            d1Var.s(this, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.zt, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        q();
    }

    @Override // org.telegram.ui.Components.xt, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        d1 d1Var;
        d1 d1Var2;
        if (i10 == 16908319 && (d1Var2 = this.c) != null && d1Var2.e()) {
            return true;
        }
        if (i10 == 16908322 && (d1Var = this.c) != null && d1Var.r(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.c != null && isEnabled() && isFocusable()) {
            this.c.c(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            s sVar = null;
            z0 z0Var = this.Q;
            int i10 = 0;
            if (action == 0) {
                this.K = motionEvent.getX();
                this.L = motionEvent.getY();
                this.M = motionEvent.getEventTime();
                e4 o10 = o(motionEvent.getX(), motionEvent.getY());
                this.O = o10;
                if (o10 != null && this.d != null) {
                    this.P = false;
                    o10.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(z0Var);
                    AndroidUtilities.runOnUIThread(z0Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.O = null;
            } else {
                e4 e4Var = this.O;
                if (e4Var != null) {
                    boolean z4 = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z10 = motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == e4Var;
                    if (!z10 || z4) {
                        e4Var.b().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(z0Var);
                    }
                    if (z4) {
                        this.O = null;
                        if (!this.P && z10 && motionEvent.getAction() == 1) {
                            ((o2) this.d).a(this, e4Var, false);
                        }
                        this.P = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.N == 0) {
                        this.N = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.K;
                    float y10 = motionEvent.getY() - this.L;
                    float f10 = (y10 * y10) + (x10 * x10);
                    int i11 = this.N;
                    if (f10 <= i11 * i11 && motionEvent.getEventTime() - this.M < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y11 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                s[] sVarArr = (s[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), s.class);
                                int length = sVarArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    s sVar2 = sVarArr[i10];
                                    int spanStart = text.getSpanStart(sVar2);
                                    int spanEnd = text.getSpanEnd(sVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                                            sVar = sVar2;
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                        if (sVar != null) {
                            q.U(getContext(), sVar.a, new org.telegram.ui.web.a2(20, this, sVar), this.e);
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
        d1 d1Var = this.c;
        if (d1Var != null) {
            d1Var.c(this);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override // org.telegram.ui.Components.xt, org.telegram.ui.ActionBar.y4
    public final void removeStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        if ((i10 & 1) != 0) {
            this.B = false;
        }
        x5.o(text, i11, min, i10, false, this.I);
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
        post(new z0(this, 1));
    }

    public void setAccentHint(boolean z4) {
        if (this.s == z4) {
            return;
        }
        this.s = z4;
        t();
    }

    public void setAllowNewlines(boolean z4) {
        this.w = z4;
    }

    public void setAutoBold(boolean z4) {
        this.B = z4;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.I = pageBlock;
    }

    public void setCenterEmptyHint(boolean z4) {
        if (this.x == z4) {
            return;
        }
        this.x = z4;
        if (z4) {
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

    public void setInlineButtonClickListener(c1 c1Var) {
        this.d = c1Var;
    }

    public void setInlineButtonContext(int i10) {
        this.f = i10;
        m();
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        InputMethodManager inputMethodManager;
        boolean z4 = getInputType() != i10;
        super.setInputType(i10);
        if (z4 && isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(d1 d1Var) {
        this.c = d1Var;
    }

    public void setLocked(boolean z4) {
        y0 y0Var;
        boolean z10;
        if (this.v == z4) {
            return;
        }
        this.v = z4;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i10 = 0;
        while (true) {
            y0Var = this.H;
            if (i10 >= length) {
                z10 = false;
                break;
            } else {
                if (filters[i10] == y0Var) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        if (z4 && !z10) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = y0Var;
            setFilters(inputFilterArr);
        }
        boolean z11 = !z4;
        setAllowDrawCursor(z11);
        setCursorVisible(z11);
    }

    public void setSoftEnterNewline(boolean z4) {
        this.r = z4;
    }

    public void setTextColorKey(int i10) {
        this.J = i10;
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
        int i10 = this.J;
        g6 g6Var = this.e;
        setTextColor(k6.v0(i10, g6Var));
        setLinkTextColor(k6.v0(k6.gc, g6Var));
        setHintTextColor(this.s ? k6.l1(0.5f, k6.v0(k6.Oh, g6Var)) : k6.v0(k6.H6, g6Var));
        setCursorColor(k6.v0(k6.G6, g6Var));
        setHandlesColor(k6.v0(k6.l6, g6Var));
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
