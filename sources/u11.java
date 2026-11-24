// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class u11 extends t09 {
    public final /* synthetic */ byte n1 = 0;
    public final /* synthetic */ Object o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u11(xv2 xv2Var, Context context, int i, wjb wjbVar) {
        super(4, i, wjbVar, context, null);
        this.o1 = xv2Var;
    }

    @Override // t09, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m21 m21Var;
        switch (this.n1) {
            case 0:
                x11 x11Var = (x11) this.o1;
                if (motionEvent.getAction() == 0) {
                    m21 m21Var2 = x11Var.n;
                    if (m21Var2 != null) {
                        m21Var2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (m21Var = x11Var.n) != null) {
                    m21Var.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // t09
    public final void g() {
        switch (this.n1) {
            case 1:
                super.g();
                xv2 xv2Var = (xv2) this.o1;
                boolean z = getReactionsWindow() != null;
                WindowManager.LayoutParams layoutParams = xv2Var.x;
                if (z) {
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    layoutParams.flags |= 131072;
                }
                try {
                    ((WindowManager) xv2Var.w.getSystemService("window")).updateViewLayout(xv2Var.y, xv2Var.x);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                super.g();
                break;
        }
    }

    @Override // t09
    public final void j() {
        switch (this.n1) {
            case 0:
                m21 m21Var = m21.w;
                if (m21Var != null) {
                    m21Var.i(false);
                }
                ((x11) this.o1).d.getReactionsWindow().c.setOnClickListener(new j1(this, (byte) 21));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u11(x11 x11Var, d dVar, Context context, int i, wjb wjbVar) {
        super(3, i, wjbVar, context, dVar);
        this.o1 = x11Var;
    }
}
