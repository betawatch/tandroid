package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qj0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int D;
    public final /* synthetic */ Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj0(Object obj, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        switch (this.D) {
            case 0:
                super.onFocusChanged(z4, i10, rect);
                sj0 sj0Var = (sj0) this.E;
                org.telegram.ui.Components.ad0 ad0Var = sj0Var.s;
                float f10 = (z4 || sj0Var.N.isFocused()) ? 1.0f : 0.0f;
                ad0Var.b(f10, f10, true);
                break;
            case 1:
                super.onFocusChanged(z4, i10, rect);
                sj0 sj0Var2 = (sj0) this.E;
                org.telegram.ui.Components.ad0 ad0Var2 = sj0Var2.s;
                float f11 = (z4 || sj0Var2.L.isFocused()) ? 1.0f : 0.0f;
                ad0Var2.b(f11, f11, true);
                break;
            default:
                super.onFocusChanged(z4, i10, rect);
                mg0 mg0Var = (mg0) this.E;
                org.telegram.ui.Components.ad0 ad0Var3 = mg0Var.f;
                float f12 = (z4 || mg0Var.b.isFocused()) ? 1.0f : 0.0f;
                ad0Var3.b(f12, f12, true);
                if (z4) {
                    mg0Var.S.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.D) {
            case 1:
                sj0 sj0Var = (sj0) this.E;
                if (i10 == 67 && sj0Var.N.length() == 0) {
                    sj0Var.L.requestFocus();
                    qj0 qj0Var = sj0Var.L;
                    qj0Var.setSelection(qj0Var.length());
                    sj0Var.L.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
