package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                wm wmVar = (wm) this.b;
                wmVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i3 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    wmVar.Sa();
                    break;
                }
                break;
            case 1:
                yj0 yj0Var = (yj0) this.b;
                if (i3 != 67) {
                    yj0Var.getClass();
                    break;
                } else if (yj0Var.Z[2].length() == 0) {
                    yj0Var.Z[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = yj0Var.Z[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    yj0Var.Z[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                cr0 cr0Var = (cr0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i3 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = cr0Var.f;
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
