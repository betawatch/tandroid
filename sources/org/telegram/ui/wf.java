package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                ek0 ek0Var = (ek0) this.b;
                if (i7 != 67) {
                    ek0Var.getClass();
                    break;
                } else if (ek0Var.Y[2].length() == 0) {
                    ek0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = ek0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ek0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                pr0 pr0Var = (pr0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = pr0Var.f;
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
