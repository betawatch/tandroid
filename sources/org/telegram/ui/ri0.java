package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ ri0(ek0 ek0Var, int i7) {
        this.a = i7;
        this.b = ek0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                ek0 ek0Var = this.b;
                if (i7 != 5) {
                    if (i7 != 6) {
                        ek0Var.getClass();
                        break;
                    } else {
                        ek0Var.L.callOnClick();
                        break;
                    }
                } else {
                    ek0Var.Y[2].requestFocus();
                    break;
                }
            case 1:
                ek0 ek0Var2 = this.b;
                ek0Var2.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = ek0Var2.Y;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            ek0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            ek0Var2.Y[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                ek0 ek0Var3 = this.b;
                ek0Var3.getClass();
                if (i7 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = ek0Var3.a0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            ek0Var3.a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            ek0Var3.a0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                ek0 ek0Var4 = this.b;
                ek0Var4.getClass();
                if (i7 == 6 || i7 == 5) {
                    ek0Var4.L.callOnClick();
                    break;
                }
                break;
            case 4:
                ek0 ek0Var5 = this.b;
                ek0Var5.getClass();
                if (i7 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = ek0Var5.Y;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            ek0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            ek0Var5.Y[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                ek0 ek0Var6 = this.b;
                ek0Var6.getClass();
                if (i7 == 5 || i7 == 6) {
                    ek0Var6.L.callOnClick();
                    break;
                }
                break;
            default:
                ek0 ek0Var7 = this.b;
                ek0Var7.getClass();
                if (i7 == 6 || i7 == 5) {
                    ek0Var7.L.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
