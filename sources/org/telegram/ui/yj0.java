package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class yj0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                ak0 ak0Var = (ak0) this.H;
                org.telegram.ui.Components.ld0 ld0Var = ak0Var.s;
                float f7 = (z10 || ak0Var.Q.isFocused()) ? 1.0f : 0.0f;
                ld0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                ak0 ak0Var2 = (ak0) this.H;
                org.telegram.ui.Components.ld0 ld0Var2 = ak0Var2.s;
                float f10 = (z10 || ak0Var2.O.isFocused()) ? 1.0f : 0.0f;
                ld0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                tg0 tg0Var = (tg0) this.H;
                org.telegram.ui.Components.ld0 ld0Var3 = tg0Var.f;
                float f11 = (z10 || tg0Var.b.isFocused()) ? 1.0f : 0.0f;
                ld0Var3.b(f11, f11, true);
                if (z10) {
                    tg0Var.V.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                ak0 ak0Var = (ak0) this.H;
                if (i10 == 67 && ak0Var.Q.length() == 0) {
                    ak0Var.O.requestFocus();
                    yj0 yj0Var = ak0Var.O;
                    yj0Var.setSelection(yj0Var.length());
                    ak0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
