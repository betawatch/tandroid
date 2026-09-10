package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ wg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(wg0 wg0Var, Context context) {
        super(context);
        this.G = wg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        wg0 wg0Var = this.G;
        xg0 xg0Var = wg0Var.V;
        org.telegram.ui.Components.hd0 hd0Var = wg0Var.f;
        float f7 = (z10 || wg0Var.a.isFocused()) ? 1.0f : 0.0f;
        hd0Var.b(f7, f7, true);
        if (!z10) {
            if (wg0Var.x == 2) {
                wg0Var.setCountryButtonText(null);
            }
        } else {
            xg0Var.c.setEditText(this);
            xg0Var.c.setDispatchBackWhenEmpty(true);
            if (wg0Var.x == 2) {
                wg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        wg0 wg0Var = this.G;
        ck0 ck0Var = wg0Var.a;
        if (i10 == 67 && wg0Var.b.length() == 0) {
            ck0Var.requestFocus();
            ck0Var.setSelection(ck0Var.length());
            ck0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !xg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
