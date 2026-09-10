package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                eo eoVar = (eo) this.b;
                eoVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    eoVar.ta();
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
                yv0 yv0Var = (yv0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = yv0Var.f;
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
