package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ zg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(zg0 zg0Var, Context context) {
        super(context);
        this.G = zg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        zg0 zg0Var = this.G;
        ah0 ah0Var = zg0Var.V;
        org.telegram.ui.Components.yd0 yd0Var = zg0Var.f;
        float f7 = (z10 || zg0Var.a.isFocused()) ? 1.0f : 0.0f;
        yd0Var.b(f7, f7, true);
        if (!z10) {
            if (zg0Var.x == 2) {
                zg0Var.setCountryButtonText(null);
            }
        } else {
            ah0Var.c.setEditText(this);
            ah0Var.c.setDispatchBackWhenEmpty(true);
            if (zg0Var.x == 2) {
                zg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        zg0 zg0Var = this.G;
        fk0 fk0Var = zg0Var.a;
        if (i10 == 67 && zg0Var.b.length() == 0) {
            fk0Var.requestFocus();
            fk0Var.setSelection(fk0Var.length());
            fk0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !ah0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
