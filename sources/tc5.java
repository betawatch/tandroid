// default package

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tc5 implements s69, qc6 {
    public final /* synthetic */ xc5 a;

    public /* synthetic */ tc5(xc5 xc5Var) {
        this.a = xc5Var;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // qc6
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        xc5 xc5Var = this.a;
        Location location = xc5Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        xc5Var.U = messageMedia.address;
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        boolean z = view instanceof qmb;
        xc5 xc5Var = this.a;
        if (z) {
            if (!hl.H1(xc5Var)) {
                return;
            }
            uc6 uc6Var = new uc6(4);
            uc6Var.m0 = 0L;
            uc6Var.M0 = new tc5(xc5Var);
            xc5Var.presentFragment(uc6Var);
        }
        if (!(view instanceof skb) || xc5Var.Q == 5) {
            return;
        }
        n8 n8Var = xc5Var.x;
        if (n8Var == null || !n8Var.isShowing()) {
            guc gucVar = new guc(xc5Var.getParentActivity(), null, new xh4((Object) xc5Var, (byte) 6), true, 1, null);
            gucVar.B(xc5Var.X);
            n8 n8Var2 = new n8((ActionBarPopupWindow$ActionBarPopupWindowLayout) gucVar.b, -2, -2);
            xc5Var.x = n8Var2;
            n8Var2.e = true;
            n8Var2.c = (short) 220;
            n8Var2.setOutsideTouchable(true);
            xc5Var.x.setClippingEnabled(true);
            xc5Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            xc5Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) gucVar.b).measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
            xc5Var.x.setInputMethodMode(2);
            xc5Var.x.getContentView().setFocusableInTouchMode(true);
            xc5Var.x.showAtLocation(xc5Var.getFragmentView(), 0, (int) (view.getX() + f), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) gucVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f2));
            xc5Var.x.b();
        }
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
