package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ ah0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg0(ah0 ah0Var, Context context) {
        super(context);
        this.G = ah0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        ah0 ah0Var = this.G;
        bh0 bh0Var = ah0Var.V;
        org.telegram.ui.Components.yd0 yd0Var = ah0Var.f;
        float f7 = (z10 || ah0Var.a.isFocused()) ? 1.0f : 0.0f;
        yd0Var.b(f7, f7, true);
        if (!z10) {
            if (ah0Var.x == 2) {
                ah0Var.setCountryButtonText(null);
            }
        } else {
            bh0Var.c.setEditText(this);
            bh0Var.c.setDispatchBackWhenEmpty(true);
            if (ah0Var.x == 2) {
                ah0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ah0 ah0Var = this.G;
        gk0 gk0Var = ah0Var.a;
        if (i10 == 67 && ah0Var.b.length() == 0) {
            gk0Var.requestFocus();
            gk0Var.setSelection(gk0Var.length());
            gk0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !bh0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
