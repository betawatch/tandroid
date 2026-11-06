package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                lr0 lr0Var = (lr0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = lr0Var.f;
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
