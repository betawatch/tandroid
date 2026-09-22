package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                bo boVar = (bo) this.b;
                boVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    boVar.ta();
                    break;
                }
                break;
            case 1:
                on0 on0Var = (on0) this.b;
                if (i10 != 67) {
                    on0Var.getClass();
                    break;
                } else if (on0Var.Y[2].length() == 0) {
                    on0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = on0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    on0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                xv0 xv0Var = (xv0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = xv0Var.f;
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
