package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ qi0(ek0 ek0Var, int i7) {
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
                        ek0Var.M.callOnClick();
                        break;
                    }
                } else {
                    ek0Var.Z[2].requestFocus();
                    break;
                }
            case 1:
                ek0 ek0Var2 = this.b;
                ek0Var2.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = ek0Var2.Z;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            ek0Var2.Z[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            ek0Var2.Z[intValue].requestFocus();
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
                    EditTextBoldCursor[] editTextBoldCursorArr2 = ek0Var3.b0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            ek0Var3.b0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            ek0Var3.b0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                ek0 ek0Var4 = this.b;
                ek0Var4.getClass();
                if (i7 == 6 || i7 == 5) {
                    ek0Var4.M.callOnClick();
                    break;
                }
                break;
            case 4:
                ek0 ek0Var5 = this.b;
                ek0Var5.getClass();
                if (i7 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = ek0Var5.Z;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            ek0Var5.Z[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            ek0Var5.Z[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                ek0 ek0Var6 = this.b;
                ek0Var6.getClass();
                if (i7 == 5 || i7 == 6) {
                    ek0Var6.M.callOnClick();
                    break;
                }
                break;
            default:
                ek0 ek0Var7 = this.b;
                ek0Var7.getClass();
                if (i7 == 6 || i7 == 5) {
                    ek0Var7.M.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
