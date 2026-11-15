package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sf(Object obj, int i7) {
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
                    anVar.Va();
                    break;
                }
                break;
            case 1:
                ek0 ek0Var = (ek0) this.b;
                if (i7 != 67) {
                    ek0Var.getClass();
                    break;
                } else if (ek0Var.Z[2].length() == 0) {
                    ek0Var.Z[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = ek0Var.Z[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ek0Var.Z[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                kr0 kr0Var = (kr0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = kr0Var.f;
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
