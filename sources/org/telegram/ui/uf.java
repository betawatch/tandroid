package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uf(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                bn bnVar = (bn) this.b;
                bnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    bnVar.Va();
                    break;
                }
                break;
            case 1:
                fk0 fk0Var = (fk0) this.b;
                if (i7 != 67) {
                    fk0Var.getClass();
                    break;
                } else if (fk0Var.Z[2].length() == 0) {
                    fk0Var.Z[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = fk0Var.Z[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    fk0Var.Z[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                mr0 mr0Var = (mr0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = mr0Var.f;
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
