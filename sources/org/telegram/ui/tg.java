package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.b;
                xnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    xnVar.ta();
                    break;
                }
                break;
            case 1:
                in0 in0Var = (in0) this.b;
                if (i10 != 67) {
                    in0Var.getClass();
                    break;
                } else if (in0Var.Y[2].length() == 0) {
                    in0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = in0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    in0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                qv0 qv0Var = (qv0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = qv0Var.f;
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
