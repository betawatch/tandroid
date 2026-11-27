// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rl7 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ byte d2;
    public final /* synthetic */ sl7 e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl7(sl7 sl7Var, Context context, byte b) {
        super(context);
        this.d2 = b;
        this.e2 = sl7Var;
    }

    @Override // gg5, org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.d2) {
            case 1:
                this.N1.setColor(aob.w0(null, aob.H6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        byte b = this.d2;
        float f = 1.0f;
        sl7 sl7Var = this.e2;
        switch (b) {
            case 0:
                super.onFocusChanged(z, i, rect);
                lu7 lu7Var = sl7Var.s1;
                if (!z && !sl7Var.J1.isFocused()) {
                    f = 0.0f;
                }
                lu7Var.b(f, f, true);
                break;
            default:
                super.onFocusChanged(z, i, rect);
                lu7 lu7Var2 = sl7Var.s1;
                if (!z && !sl7Var.H1.isFocused()) {
                    f = 0.0f;
                }
                lu7Var2.b(f, f, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (this.d2) {
            case 1:
                if (i == 67) {
                    sl7 sl7Var = this.e2;
                    if (sl7Var.J1.length() == 0) {
                        sl7Var.H1.requestFocus();
                        rl7 rl7Var = sl7Var.H1;
                        rl7Var.setSelection(rl7Var.length());
                        sl7Var.H1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i, keyEvent);
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }
}
