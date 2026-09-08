package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ vg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg0(vg0 vg0Var, Context context) {
        super(context);
        this.G = vg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        vg0 vg0Var = this.G;
        wg0 wg0Var = vg0Var.V;
        org.telegram.ui.Components.zc0 zc0Var = vg0Var.f;
        float f7 = (z10 || vg0Var.a.isFocused()) ? 1.0f : 0.0f;
        zc0Var.b(f7, f7, true);
        if (!z10) {
            if (vg0Var.x == 2) {
                vg0Var.setCountryButtonText(null);
            }
        } else {
            wg0Var.c.setEditText(this);
            wg0Var.c.setDispatchBackWhenEmpty(true);
            if (vg0Var.x == 2) {
                vg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        vg0 vg0Var = this.G;
        ck0 ck0Var = vg0Var.a;
        if (i10 == 67 && vg0Var.b.length() == 0) {
            ck0Var.requestFocus();
            ck0Var.setSelection(ck0Var.length());
            ck0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !wg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
