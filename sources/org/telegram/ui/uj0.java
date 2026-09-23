package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class uj0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                wj0 wj0Var = (wj0) this.H;
                org.telegram.ui.Components.yc0 yc0Var = wj0Var.s;
                float f7 = (z10 || wj0Var.Q.isFocused()) ? 1.0f : 0.0f;
                yc0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                wj0 wj0Var2 = (wj0) this.H;
                org.telegram.ui.Components.yc0 yc0Var2 = wj0Var2.s;
                float f10 = (z10 || wj0Var2.O.isFocused()) ? 1.0f : 0.0f;
                yc0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                qg0 qg0Var = (qg0) this.H;
                org.telegram.ui.Components.yc0 yc0Var3 = qg0Var.f;
                float f11 = (z10 || qg0Var.b.isFocused()) ? 1.0f : 0.0f;
                yc0Var3.b(f11, f11, true);
                if (z10) {
                    qg0Var.V.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                wj0 wj0Var = (wj0) this.H;
                if (i10 == 67 && wj0Var.Q.length() == 0) {
                    wj0Var.O.requestFocus();
                    uj0 uj0Var = wj0Var.O;
                    uj0Var.setSelection(uj0Var.length());
                    wj0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
