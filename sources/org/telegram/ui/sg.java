package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.b;
                wnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    wnVar.ta();
                    break;
                }
                break;
            case 1:
                gn0 gn0Var = (gn0) this.b;
                if (i10 != 67) {
                    gn0Var.getClass();
                    break;
                } else if (gn0Var.Y[2].length() == 0) {
                    gn0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = gn0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    gn0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                ov0 ov0Var = (ov0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = ov0Var.f;
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
