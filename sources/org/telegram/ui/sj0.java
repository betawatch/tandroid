package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sj0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int D;
    public final /* synthetic */ Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sj0(Object obj, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        switch (this.D) {
            case 0:
                super.onFocusChanged(z4, i10, rect);
                uj0 uj0Var = (uj0) this.E;
                org.telegram.ui.Components.bd0 bd0Var = uj0Var.s;
                float f10 = (z4 || uj0Var.N.isFocused()) ? 1.0f : 0.0f;
                bd0Var.b(f10, f10, true);
                break;
            case 1:
                super.onFocusChanged(z4, i10, rect);
                uj0 uj0Var2 = (uj0) this.E;
                org.telegram.ui.Components.bd0 bd0Var2 = uj0Var2.s;
                float f11 = (z4 || uj0Var2.L.isFocused()) ? 1.0f : 0.0f;
                bd0Var2.b(f11, f11, true);
                break;
            default:
                super.onFocusChanged(z4, i10, rect);
                og0 og0Var = (og0) this.E;
                org.telegram.ui.Components.bd0 bd0Var3 = og0Var.f;
                float f12 = (z4 || og0Var.b.isFocused()) ? 1.0f : 0.0f;
                bd0Var3.b(f12, f12, true);
                if (z4) {
                    og0Var.S.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.D) {
            case 1:
                uj0 uj0Var = (uj0) this.E;
                if (i10 == 67 && uj0Var.N.length() == 0) {
                    uj0Var.L.requestFocus();
                    sj0 sj0Var = uj0Var.L;
                    sj0Var.setSelection(sj0Var.length());
                    uj0Var.L.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
