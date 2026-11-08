package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class zg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int V1;
    public final /* synthetic */ ah0 W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg0(ah0 ah0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = ah0Var;
    }

    @Override // org.telegram.ui.Components.v20, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.dt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.V1) {
            case 1:
                this.G1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z9, int i7, Rect rect) {
        switch (this.V1) {
            case 0:
                super.onFocusChanged(z9, i7, rect);
                ah0 ah0Var = this.W1;
                org.telegram.ui.Components.lb0 lb0Var = ah0Var.p1;
                float f10 = (z9 || ah0Var.G1.isFocused()) ? 1.0f : 0.0f;
                lb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z9, i7, rect);
                ah0 ah0Var2 = this.W1;
                org.telegram.ui.Components.lb0 lb0Var2 = ah0Var2.p1;
                float f11 = (z9 || ah0Var2.E1.isFocused()) ? 1.0f : 0.0f;
                lb0Var2.b(f11, f11, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                if (i7 == 67) {
                    ah0 ah0Var = this.W1;
                    if (ah0Var.G1.length() == 0) {
                        ah0Var.E1.requestFocus();
                        zg0 zg0Var = ah0Var.E1;
                        zg0Var.setSelection(zg0Var.length());
                        ah0Var.E1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
