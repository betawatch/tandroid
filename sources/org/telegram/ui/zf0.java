package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zf0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ cg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(cg0 cg0Var, Context context) {
        super(context);
        this.G = cg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        cg0 cg0Var = this.G;
        dg0 dg0Var = cg0Var.V;
        org.telegram.ui.Components.sd0 sd0Var = cg0Var.f;
        float f7 = (z10 || cg0Var.a.isFocused()) ? 1.0f : 0.0f;
        sd0Var.b(f7, f7, true);
        if (!z10) {
            if (cg0Var.x == 2) {
                cg0Var.setCountryButtonText(null);
            }
        } else {
            dg0Var.c.setEditText(this);
            dg0Var.c.setDispatchBackWhenEmpty(true);
            if (cg0Var.x == 2) {
                cg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        cg0 cg0Var = this.G;
        kj0 kj0Var = cg0Var.a;
        if (i10 == 67 && cg0Var.b.length() == 0) {
            kj0Var.requestFocus();
            kj0Var.setSelection(kj0Var.length());
            kj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !dg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
