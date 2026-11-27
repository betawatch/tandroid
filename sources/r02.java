// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r02 extends iu3 {
    public final /* synthetic */ n12 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r02(n12 n12Var, Context context, a12 a12Var, vnb vnbVar) {
        super(context, a12Var, null, 1, true, vnbVar);
        this.W = n12Var;
    }

    @Override // iu3
    public final void f() {
        super.f();
        o24 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(hl.n);
        }
    }

    @Override // iu3
    public final void i(ActionMode actionMode, Menu menu) {
        e eVar = this.W.Z1;
        if (eVar instanceof zu1) {
            zu1.E6(menu, ((zu1) eVar).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n12 n12Var = this.W;
        r02 r02Var = n12Var.M2;
        if (!n12Var.r3) {
            if (motionEvent.getX() <= r02Var.getEditText().getLeft() || motionEvent.getX() >= r02Var.getEditText().getRight() || motionEvent.getY() <= r02Var.getEditText().getTop() || motionEvent.getY() >= r02Var.getEditText().getBottom()) {
                n12Var.d1(r02Var.getEditText(), false);
            } else {
                n12Var.d1(r02Var.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.W.M1();
    }

    @Override // iu3
    public final void q(int i, int i2) {
        n12 n12Var = this.W;
        n12Var.M1();
        if (n12Var.W1) {
            n12Var.x1(i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
