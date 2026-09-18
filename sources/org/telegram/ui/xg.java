package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xg(Object obj, int i10) {
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
                qn0 qn0Var = (qn0) this.b;
                if (i10 != 67) {
                    qn0Var.getClass();
                    break;
                } else if (qn0Var.Y[2].length() == 0) {
                    qn0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = qn0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    qn0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                zv0 zv0Var = (zv0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = zv0Var.f;
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
