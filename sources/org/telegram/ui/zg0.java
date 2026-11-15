package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int b2;
    public final /* synthetic */ bh0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg0(bh0 bh0Var, Context context, int i7) {
        super(context);
        this.b2 = i7;
        this.c2 = bh0Var;
    }

    @Override // org.telegram.ui.Components.y20, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.b2) {
            case 1:
                this.M1.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.H6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        switch (this.b2) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                bh0 bh0Var = this.c2;
                org.telegram.ui.Components.mb0 mb0Var = bh0Var.t1;
                float f10 = (z10 || bh0Var.K1.isFocused()) ? 1.0f : 0.0f;
                mb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i7, rect);
                bh0 bh0Var2 = this.c2;
                org.telegram.ui.Components.mb0 mb0Var2 = bh0Var2.t1;
                float f11 = (z10 || bh0Var2.I1.isFocused()) ? 1.0f : 0.0f;
                mb0Var2.b(f11, f11, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.b2) {
            case 1:
                if (i7 == 67) {
                    bh0 bh0Var = this.c2;
                    if (bh0Var.K1.length() == 0) {
                        bh0Var.I1.requestFocus();
                        zg0 zg0Var = bh0Var.I1;
                        zg0Var.setSelection(zg0Var.length());
                        bh0Var.I1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
