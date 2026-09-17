package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                co coVar = (co) this.b;
                coVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    coVar.ta();
                    break;
                }
                break;
            case 1:
                pn0 pn0Var = (pn0) this.b;
                if (i10 != 67) {
                    pn0Var.getClass();
                    break;
                } else if (pn0Var.Y[2].length() == 0) {
                    pn0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = pn0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    pn0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                wv0 wv0Var = (wv0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = wv0Var.f;
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
