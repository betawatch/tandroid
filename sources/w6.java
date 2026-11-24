// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class w6 implements View.OnKeyListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        m8 m8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                r7 r7Var = (r7) obj;
                if (i == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (m8Var = r7Var.d) != null && m8Var.isShowing()) {
                    r7Var.d.d(true);
                    break;
                }
                break;
            case 1:
                yv1 yv1Var = (yv1) obj;
                yv1Var.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    yv1Var.Ja();
                    break;
                }
                break;
            case 2:
                t72 t72Var = (t72) obj;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) view;
                if (i == 67 && keyEvent.getAction() == 0 && editTextBoldCursor2.length() == 0) {
                    ImageView imageView = t72Var.f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    break;
                }
                break;
            case 3:
                rx3 rx3Var = (rx3) obj;
                if (i == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && rx3Var.isShowing()) {
                    rx3Var.dismiss();
                    break;
                }
                break;
            case 4:
                xz7 xz7Var = (xz7) obj;
                if (i == 67 && xz7Var.Z[2].length() == 0) {
                    xz7Var.Z[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor3 = xz7Var.Z[1];
                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                    xz7Var.Z[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                hg8 hg8Var = (hg8) obj;
                EditTextBoldCursor editTextBoldCursor4 = (EditTextBoldCursor) view;
                if (i == 67 && keyEvent.getAction() == 0 && editTextBoldCursor4.length() == 0) {
                    ImageView imageView2 = hg8Var.f;
                    if (imageView2 != null) {
                        imageView2.callOnClick();
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
