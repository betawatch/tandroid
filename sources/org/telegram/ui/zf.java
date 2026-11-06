package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
