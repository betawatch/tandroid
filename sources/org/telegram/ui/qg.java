package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.b;
                znVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    znVar.ta();
                    break;
                }
                break;
            case 1:
                fn0 fn0Var = (fn0) this.b;
                if (i10 != 67) {
                    fn0Var.getClass();
                    break;
                } else if (fn0Var.V[2].length() == 0) {
                    fn0Var.V[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = fn0Var.V[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    fn0Var.V[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                jv0 jv0Var = (jv0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = jv0Var.f;
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
