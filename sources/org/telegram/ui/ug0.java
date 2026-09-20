package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        org.telegram.ui.Components.hd0 hd0Var = xg0Var.f;
        float f7 = (z10 || xg0Var.a.isFocused()) ? 1.0f : 0.0f;
        hd0Var.b(f7, f7, true);
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
        dk0 dk0Var = xg0Var.a;
        if (i10 == 67 && xg0Var.b.length() == 0) {
            dk0Var.requestFocus();
            dk0Var.setSelection(dk0Var.length());
            dk0Var.dispatchKeyEvent(keyEvent);
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
