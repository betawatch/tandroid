package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll0 b;

    public /* synthetic */ wj0(ll0 ll0Var, int i10) {
        this.a = i10;
        this.b = ll0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                ll0 ll0Var = this.b;
                if (i10 != 5) {
                    if (i10 != 6) {
                        ll0Var.getClass();
                        break;
                    } else {
                        ll0Var.L.callOnClick();
                        break;
                    }
                } else {
                    ll0Var.Y[2].requestFocus();
                    break;
                }
            case 1:
                ll0 ll0Var2 = this.b;
                ll0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = ll0Var2.Y;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            ll0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.i0.v1(textView);
                            break;
                        } else {
                            ll0Var2.Y[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                ll0 ll0Var3 = this.b;
                ll0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = ll0Var3.a0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            ll0Var3.a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.i0.v1(textView);
                            break;
                        } else {
                            ll0Var3.a0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                ll0 ll0Var4 = this.b;
                ll0Var4.getClass();
                if (i10 == 6 || i10 == 5) {
                    ll0Var4.L.callOnClick();
                    break;
                }
                break;
            case 4:
                ll0 ll0Var5 = this.b;
                ll0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = ll0Var5.Y;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            ll0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.i0.v1(textView);
                            break;
                        } else {
                            ll0Var5.Y[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                ll0 ll0Var6 = this.b;
                ll0Var6.getClass();
                if (i10 == 5 || i10 == 6) {
                    ll0Var6.L.callOnClick();
                    break;
                }
                break;
            default:
                ll0 ll0Var7 = this.b;
                ll0Var7.getClass();
                if (i10 == 6 || i10 == 5) {
                    ll0Var7.L.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
