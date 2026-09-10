package yg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MotionEvent;
import hi.y5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fu;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class e0 extends fu {
    public final f6 c;
    public final l2.h d;
    public Runnable e;
    public int f;

    public e0(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        this.c = f6Var;
        this.d = new l2.h(getContext(), new d0());
        setBackground(null);
        setIncludeFontPadding(true);
        int i11 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f = i10;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
        setTextColor(j6.v0(j6.Ud, f6Var));
        setLinkTextColor(j6.v0(j6.hc, f6Var));
        setHighlightColor(j6.v0(j6.uf, f6Var));
        int i12 = j6.Vd;
        setHintColor(j6.v0(i12, f6Var));
        setHintTextColor(j6.v0(i12, f6Var));
        setCursorColor(j6.v0(j6.Wd, f6Var));
        setHandlesColor(j6.v0(j6.vf, f6Var));
        if (i11 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new y5((p) this, 7));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    @Override // org.telegram.ui.Components.hu, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!((GestureDetector) this.d.b).onTouchEvent(motionEvent) || isLongClickable()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        menu.clear();
        int i10 = R.id.menu_delete;
        menu.add(i10, i10, 0, LocaleController.getString(R.string.Delete));
    }

    public int getEditTextSelectionEnd() {
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd;
    }

    public int getEditTextSelectionStart() {
        int selectionStart = getSelectionStart();
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return getPaint().getFontMetricsInt();
    }

    public final void m() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            c cVar = new c(this.c);
            ValueAnimator ofInt = ValueAnimator.ofInt(cVar.f, 255);
            ofInt.addUpdateListener(new a(cVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(cVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void n(boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (c cVar : (c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c.class)) {
            q qVar = new q(2, this, cVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(cVar.f, 0);
                ofInt.addUpdateListener(new a(cVar, this, 1));
                ofInt.addListener(new b(qVar, 0));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                qVar.run();
            }
        }
    }

    @Override // org.telegram.ui.Components.hu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (!hasSelection() || ((c[]) getText().getSpans(i10, i11, c.class)).length == 0) {
            return;
        }
        setSelection(i10, i11 - 1);
    }

    public void setMaxLength(int i10) {
        if (this.f != i10) {
            this.f = i10;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.e = runnable;
    }
}
