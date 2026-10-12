package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                fo foVar = (fo) this.b;
                foVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    foVar.xa();
                    break;
                }
                break;
            case 1:
                un0 un0Var = (un0) this.b;
                if (i10 != 67) {
                    un0Var.getClass();
                    break;
                } else if (un0Var.Y[2].length() == 0) {
                    un0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = un0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    un0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                dw0 dw0Var = (dw0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = dw0Var.f;
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
