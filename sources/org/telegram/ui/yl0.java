package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;

    public /* synthetic */ yl0(qn0 qn0Var, int i10) {
        this.a = i10;
        this.b = qn0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                qn0 qn0Var = this.b;
                if (i10 != 5) {
                    if (i10 != 6) {
                        qn0Var.getClass();
                        break;
                    } else {
                        qn0Var.L.callOnClick();
                        break;
                    }
                } else {
                    qn0Var.Y[2].requestFocus();
                    break;
                }
            case 1:
                qn0 qn0Var2 = this.b;
                qn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = qn0Var2.Y;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            qn0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            qn0Var2.Y[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                qn0 qn0Var3 = this.b;
                qn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = qn0Var3.a0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            qn0Var3.a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            qn0Var3.a0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                qn0 qn0Var4 = this.b;
                qn0Var4.getClass();
                if (i10 == 6 || i10 == 5) {
                    qn0Var4.L.callOnClick();
                    break;
                }
                break;
            case 4:
                qn0 qn0Var5 = this.b;
                qn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = qn0Var5.Y;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            qn0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            qn0Var5.Y[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                qn0 qn0Var6 = this.b;
                qn0Var6.getClass();
                if (i10 == 5 || i10 == 6) {
                    qn0Var6.L.callOnClick();
                    break;
                }
                break;
            default:
                qn0 qn0Var7 = this.b;
                qn0Var7.getClass();
                if (i10 == 6 || i10 == 5) {
                    qn0Var7.L.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
