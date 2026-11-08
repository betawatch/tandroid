package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zf(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                an anVar = (an) this.b;
                anVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    anVar.Sa();
                    break;
                }
                break;
            case 1:
                bk0 bk0Var = (bk0) this.b;
                if (i7 != 67) {
                    bk0Var.getClass();
                    break;
                } else if (bk0Var.Y[2].length() == 0) {
                    bk0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = bk0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    bk0Var.Y[1].dispatchKeyEvent(keyEvent);
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
