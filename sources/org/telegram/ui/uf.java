package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                hk0 hk0Var = (hk0) this.b;
                if (i7 != 67) {
                    hk0Var.getClass();
                    break;
                } else if (hk0Var.Z[2].length() == 0) {
                    hk0Var.Z[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = hk0Var.Z[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    hk0Var.Z[1].dispatchKeyEvent(keyEvent);
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
