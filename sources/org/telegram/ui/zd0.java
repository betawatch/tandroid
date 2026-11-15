package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zd0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int b2;
    public final /* synthetic */ be0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd0(be0 be0Var, Context context, int i7) {
        super(context);
        this.b2 = i7;
        this.c2 = be0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        int i10 = this.b2;
        float f10 = 1.0f;
        be0 be0Var = this.c2;
        switch (i10) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                org.telegram.ui.Components.mb0 mb0Var = be0Var.f;
                if (!z10 && !be0Var.b.isFocused()) {
                    f10 = 0.0f;
                }
                mb0Var.b(f10, f10, true);
                if (z10) {
                    be0Var.h0.c.setEditText(this);
                    break;
                }
                break;
            default:
                super.onFocusChanged(z10, i7, rect);
                ce0 ce0Var = be0Var.h0;
                org.telegram.ui.Components.mb0 mb0Var2 = be0Var.f;
                if (!z10 && !be0Var.a.isFocused()) {
                    f10 = 0.0f;
                }
                mb0Var2.b(f10, f10, true);
                if (!z10) {
                    if (be0Var.F == 2) {
                        be0Var.setCountryButtonText(null);
                        break;
                    }
                } else {
                    ce0Var.c.setEditText(this);
                    ce0Var.c.setDispatchBackWhenEmpty(true);
                    if (be0Var.F == 2) {
                        be0Var.setCountryButtonText(org.telegram.messenger.hd.M0(2131742859, null));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.b2) {
            case 1:
                be0 be0Var = this.c2;
                zd0 zd0Var = be0Var.a;
                if (i7 == 67 && be0Var.b.length() == 0) {
                    zd0Var.requestFocus();
                    zd0Var.setSelection(zd0Var.length());
                    zd0Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.b2) {
            case 1:
                if (motionEvent.getAction() == 0 && !ce0.b1(this.c2.h0, this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
