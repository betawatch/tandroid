package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class qg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ tg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg0(tg0 tg0Var, Context context) {
        super(context);
        this.G = tg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        tg0 tg0Var = this.G;
        ug0 ug0Var = tg0Var.V;
        org.telegram.ui.Components.ld0 ld0Var = tg0Var.f;
        float f7 = (z10 || tg0Var.a.isFocused()) ? 1.0f : 0.0f;
        ld0Var.b(f7, f7, true);
        if (!z10) {
            if (tg0Var.x == 2) {
                tg0Var.setCountryButtonText(null);
            }
        } else {
            ug0Var.c.setEditText(this);
            ug0Var.c.setDispatchBackWhenEmpty(true);
            if (tg0Var.x == 2) {
                tg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        tg0 tg0Var = this.G;
        yj0 yj0Var = tg0Var.a;
        if (i10 == 67 && tg0Var.b.length() == 0) {
            yj0Var.requestFocus();
            yj0Var.setSelection(yj0Var.length());
            yj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !ug0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
