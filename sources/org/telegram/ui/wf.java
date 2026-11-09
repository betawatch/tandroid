package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wf(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                cn cnVar = (cn) this.b;
                cnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    cnVar.Ua();
                    break;
                }
                break;
            case 1:
                dk0 dk0Var = (dk0) this.b;
                if (i7 != 67) {
                    dk0Var.getClass();
                    break;
                } else if (dk0Var.Y[2].length() == 0) {
                    dk0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = dk0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    dk0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                or0 or0Var = (or0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = or0Var.f;
                    if (imageView != null) {
                        imageView.callOnClick();
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
