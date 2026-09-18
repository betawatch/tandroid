package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ug0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ xg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug0(xg0 xg0Var, Context context) {
        super(context);
        this.G = xg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        xg0 xg0Var = this.G;
        yg0 yg0Var = xg0Var.V;
        org.telegram.ui.Components.yc0 yc0Var = xg0Var.f;
        float f7 = (z10 || xg0Var.a.isFocused()) ? 1.0f : 0.0f;
        yc0Var.b(f7, f7, true);
        if (!z10) {
            if (xg0Var.x == 2) {
                xg0Var.setCountryButtonText(null);
            }
        } else {
            yg0Var.c.setEditText(this);
            yg0Var.c.setDispatchBackWhenEmpty(true);
            if (xg0Var.x == 2) {
                xg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        xg0 xg0Var = this.G;
        ck0 ck0Var = xg0Var.a;
        if (i10 == 67 && xg0Var.b.length() == 0) {
            ck0Var.requestFocus();
            ck0Var.setSelection(ck0Var.length());
            ck0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !yg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
