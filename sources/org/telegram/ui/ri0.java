package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ ri0(fk0 fk0Var, int i7) {
        this.a = i7;
        this.b = fk0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                fk0 fk0Var = this.b;
                if (i7 != 5) {
                    if (i7 != 6) {
                        fk0Var.getClass();
                        break;
                    } else {
                        fk0Var.M.callOnClick();
                        break;
                    }
                } else {
                    fk0Var.Z[2].requestFocus();
                    break;
                }
            case 1:
                fk0 fk0Var2 = this.b;
                fk0Var2.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = fk0Var2.Z;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            fk0Var2.Z[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            fk0Var2.Z[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                fk0 fk0Var3 = this.b;
                fk0Var3.getClass();
                if (i7 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = fk0Var3.b0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            fk0Var3.b0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            fk0Var3.b0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                fk0 fk0Var4 = this.b;
                fk0Var4.getClass();
                if (i7 == 6 || i7 == 5) {
                    fk0Var4.M.callOnClick();
                    break;
                }
                break;
            case 4:
                fk0 fk0Var5 = this.b;
                fk0Var5.getClass();
                if (i7 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = fk0Var5.Z;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            fk0Var5.Z[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            fk0Var5.Z[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                fk0 fk0Var6 = this.b;
                fk0Var6.getClass();
                if (i7 == 5 || i7 == 6) {
                    fk0Var6.M.callOnClick();
                    break;
                }
                break;
            default:
                fk0 fk0Var7 = this.b;
                fk0Var7.getClass();
                if (i7 == 6 || i7 == 5) {
                    fk0Var7.M.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
