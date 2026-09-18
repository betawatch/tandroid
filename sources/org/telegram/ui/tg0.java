package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        org.telegram.ui.Components.id0 id0Var = wg0Var.f;
        float f7 = (z10 || wg0Var.a.isFocused()) ? 1.0f : 0.0f;
        id0Var.b(f7, f7, true);
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
