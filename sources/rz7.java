// default package

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rz7 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b18 b;

    public /* synthetic */ rz7(b18 b18Var, byte b) {
        this.a = b;
        this.b = b18Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 0:
                if (i != 5) {
                    if (i != 6) {
                        break;
                    } else {
                        b18Var.M.callOnClick();
                        break;
                    }
                } else {
                    b18Var.Z[2].requestFocus();
                    break;
                }
            case 1:
                if (i != 5) {
                    break;
                } else {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = b18Var.Z;
                    if (intValue < editTextBoldCursorArr.length) {
                        boolean isFocusable = editTextBoldCursorArr[intValue].isFocusable();
                        EditTextBoldCursor[] editTextBoldCursorArr2 = b18Var.Z;
                        if (!isFocusable) {
                            editTextBoldCursorArr2[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            hl.t1(textView);
                            break;
                        } else {
                            editTextBoldCursorArr2[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                if (i != 5) {
                    break;
                } else {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = b18Var.b0;
                    if (intValue2 < editTextBoldCursorArr3.length) {
                        boolean isFocusable2 = editTextBoldCursorArr3[intValue2].isFocusable();
                        EditTextBoldCursor[] editTextBoldCursorArr4 = b18Var.b0;
                        if (!isFocusable2) {
                            editTextBoldCursorArr4[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            hl.t1(textView);
                            break;
                        } else {
                            editTextBoldCursorArr4[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (i != 6 && i != 5) {
                    break;
                } else {
                    b18Var.M.callOnClick();
                    break;
                }
            case 4:
                if (i != 5) {
                    break;
                } else {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr5 = b18Var.Z;
                    if (intValue3 < editTextBoldCursorArr5.length) {
                        boolean isFocusable3 = editTextBoldCursorArr5[intValue3].isFocusable();
                        EditTextBoldCursor[] editTextBoldCursorArr6 = b18Var.Z;
                        if (!isFocusable3) {
                            editTextBoldCursorArr6[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            hl.t1(textView);
                            break;
                        } else {
                            editTextBoldCursorArr6[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                if (i != 5 && i != 6) {
                    break;
                } else {
                    b18Var.M.callOnClick();
                    break;
                }
            default:
                if (i != 6 && i != 5) {
                    break;
                } else {
                    b18Var.M.callOnClick();
                    break;
                }
        }
        return true;
    }
}
