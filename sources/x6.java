// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class x6 implements View.OnKeyListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        n8 n8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                s7 s7Var = (s7) obj;
                if (i == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (n8Var = s7Var.d) != null && n8Var.isShowing()) {
                    s7Var.d.d(true);
                    break;
                }
                break;
            case 1:
                zu1 zu1Var = (zu1) obj;
                zu1Var.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    zu1Var.Ka();
                    break;
                }
                break;
            case 2:
                y62 y62Var = (y62) obj;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) view;
                if (i == 67 && keyEvent.getAction() == 0 && editTextBoldCursor2.length() == 0) {
                    ImageView imageView = y62Var.f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    break;
                }
                break;
            case 3:
                bx3 bx3Var = (bx3) obj;
                if (i == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && bx3Var.isShowing()) {
                    bx3Var.dismiss();
                    break;
                }
                break;
            case 4:
                b18 b18Var = (b18) obj;
                if (i == 67 && b18Var.Z[2].length() == 0) {
                    b18Var.Z[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor3 = b18Var.Z[1];
                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                    b18Var.Z[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                th8 th8Var = (th8) obj;
                EditTextBoldCursor editTextBoldCursor4 = (EditTextBoldCursor) view;
                if (i == 67 && keyEvent.getAction() == 0 && editTextBoldCursor4.length() == 0) {
                    ImageView imageView2 = th8Var.f;
                    if (imageView2 != null) {
                        imageView2.callOnClick();
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
