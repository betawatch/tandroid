package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk0 b;

    public /* synthetic */ ti0(hk0 hk0Var, int i7) {
        this.a = i7;
        this.b = hk0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                hk0 hk0Var = this.b;
                if (i7 != 5) {
                    if (i7 != 6) {
                        hk0Var.getClass();
                        break;
                    } else {
                        hk0Var.M.callOnClick();
                        break;
                    }
                } else {
                    hk0Var.Z[2].requestFocus();
                    break;
                }
            case 1:
                hk0 hk0Var2 = this.b;
                hk0Var2.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = hk0Var2.Z;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            hk0Var2.Z[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            hk0Var2.Z[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                hk0 hk0Var3 = this.b;
                hk0Var3.getClass();
                if (i7 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = hk0Var3.b0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            hk0Var3.b0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            hk0Var3.b0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                hk0 hk0Var4 = this.b;
                hk0Var4.getClass();
                if (i7 == 6 || i7 == 5) {
                    hk0Var4.M.callOnClick();
                    break;
                }
                break;
            case 4:
                hk0 hk0Var5 = this.b;
                hk0Var5.getClass();
                if (i7 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = hk0Var5.Z;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            hk0Var5.Z[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            hk0Var5.Z[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                hk0 hk0Var6 = this.b;
                hk0Var6.getClass();
                if (i7 == 5 || i7 == 6) {
                    hk0Var6.M.callOnClick();
                    break;
                }
                break;
            default:
                hk0 hk0Var7 = this.b;
                hk0Var7.getClass();
                if (i7 == 6 || i7 == 5) {
                    hk0Var7.M.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
