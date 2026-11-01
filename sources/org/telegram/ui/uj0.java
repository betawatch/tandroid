package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uj0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ uj0(jl0 jl0Var, int i10) {
        this.a = i10;
        this.b = jl0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                jl0 jl0Var = this.b;
                if (i10 != 5) {
                    if (i10 != 6) {
                        jl0Var.getClass();
                        break;
                    } else {
                        jl0Var.L.callOnClick();
                        break;
                    }
                } else {
                    jl0Var.Y[2].requestFocus();
                    break;
                }
            case 1:
                jl0 jl0Var2 = this.b;
                jl0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = jl0Var2.Y;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            jl0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.i0.v1(textView);
                            break;
                        } else {
                            jl0Var2.Y[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                jl0 jl0Var3 = this.b;
                jl0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = jl0Var3.a0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            jl0Var3.a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.i0.v1(textView);
                            break;
                        } else {
                            jl0Var3.a0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                jl0 jl0Var4 = this.b;
                jl0Var4.getClass();
                if (i10 == 6 || i10 == 5) {
                    jl0Var4.L.callOnClick();
                    break;
                }
                break;
            case 4:
                jl0 jl0Var5 = this.b;
                jl0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = jl0Var5.Y;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            jl0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.i0.v1(textView);
                            break;
                        } else {
                            jl0Var5.Y[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                jl0 jl0Var6 = this.b;
                jl0Var6.getClass();
                if (i10 == 5 || i10 == 6) {
                    jl0Var6.L.callOnClick();
                    break;
                }
                break;
            default:
                jl0 jl0Var7 = this.b;
                jl0Var7.getClass();
                if (i10 == 6 || i10 == 5) {
                    jl0Var7.L.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
