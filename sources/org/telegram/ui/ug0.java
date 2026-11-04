package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ug0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int W1;
    public final /* synthetic */ vg0 X1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug0(vg0 vg0Var, Context context, int i3) {
        super(context);
        this.W1 = i3;
        this.X1 = vg0Var;
    }

    @Override // org.telegram.ui.Components.r20, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.W1) {
            case 1:
                this.H1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i3, Rect rect) {
        switch (this.W1) {
            case 0:
                super.onFocusChanged(z10, i3, rect);
                vg0 vg0Var = this.X1;
                org.telegram.ui.Components.gb0 gb0Var = vg0Var.q1;
                float f10 = (z10 || vg0Var.H1.isFocused()) ? 1.0f : 0.0f;
                gb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i3, rect);
                vg0 vg0Var2 = this.X1;
                org.telegram.ui.Components.gb0 gb0Var2 = vg0Var2.q1;
                float f11 = (z10 || vg0Var2.F1.isFocused()) ? 1.0f : 0.0f;
                gb0Var2.b(f11, f11, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        switch (this.W1) {
            case 1:
                if (i3 == 67) {
                    vg0 vg0Var = this.X1;
                    if (vg0Var.H1.length() == 0) {
                        vg0Var.F1.requestFocus();
                        ug0 ug0Var = vg0Var.F1;
                        ug0Var.setSelection(ug0Var.length());
                        vg0Var.F1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i3, keyEvent);
            default:
                return super.onKeyDown(i3, keyEvent);
        }
    }
}
