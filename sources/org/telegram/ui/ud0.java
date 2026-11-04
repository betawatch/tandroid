package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ud0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int W1;
    public final /* synthetic */ wd0 X1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud0(wd0 wd0Var, Context context, int i3) {
        super(context);
        this.W1 = i3;
        this.X1 = wd0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i3, Rect rect) {
        int i10 = this.W1;
        float f10 = 1.0f;
        wd0 wd0Var = this.X1;
        switch (i10) {
            case 0:
                super.onFocusChanged(z10, i3, rect);
                org.telegram.ui.Components.gb0 gb0Var = wd0Var.f;
                if (!z10 && !wd0Var.b.isFocused()) {
                    f10 = 0.0f;
                }
                gb0Var.b(f10, f10, true);
                if (z10) {
                    wd0Var.b0.c.setEditText(this);
                    break;
                }
                break;
            default:
                super.onFocusChanged(z10, i3, rect);
                xd0 xd0Var = wd0Var.b0;
                org.telegram.ui.Components.gb0 gb0Var2 = wd0Var.f;
                if (!z10 && !wd0Var.a.isFocused()) {
                    f10 = 0.0f;
                }
                gb0Var2.b(f10, f10, true);
                if (!z10) {
                    if (wd0Var.F == 2) {
                        wd0Var.setCountryButtonText(null);
                        break;
                    }
                } else {
                    xd0Var.c.setEditText(this);
                    xd0Var.c.setDispatchBackWhenEmpty(true);
                    if (wd0Var.F == 2) {
                        wd0Var.setCountryButtonText(org.telegram.messenger.bd.M0(2131742869, null));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        switch (this.W1) {
            case 1:
                wd0 wd0Var = this.X1;
                ud0 ud0Var = wd0Var.a;
                if (i3 == 67 && wd0Var.b.length() == 0) {
                    ud0Var.requestFocus();
                    ud0Var.setSelection(ud0Var.length());
                    ud0Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i3, keyEvent);
            default:
                return super.onKeyDown(i3, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W1) {
            case 1:
                if (motionEvent.getAction() == 0 && !xd0.a1(this.X1.b0, this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
