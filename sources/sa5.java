// default package

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sa5 implements d39, ma6 {
    public final /* synthetic */ wa5 a;

    public /* synthetic */ sa5(wa5 wa5Var) {
        this.a = wa5Var;
    }

    @Override // ma6
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        wa5 wa5Var = this.a;
        Location location = wa5Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        wa5Var.U = messageMedia.address;
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        boolean z = view instanceof uib;
        wa5 wa5Var = this.a;
        if (z) {
            if (!gl.H1(wa5Var)) {
                return;
            }
            qa6 qa6Var = new qa6(4);
            qa6Var.m0 = 0L;
            qa6Var.M0 = new sa5(wa5Var);
            wa5Var.presentFragment(qa6Var);
        }
        if (!(view instanceof wgb) || wa5Var.Q == 5) {
            return;
        }
        m8 m8Var = wa5Var.x;
        if (m8Var == null || !m8Var.isShowing()) {
            spc spcVar = new spc(wa5Var.getParentActivity(), null, new z24((Object) wa5Var, (byte) 8), true, 1, null);
            spcVar.B(wa5Var.X);
            m8 m8Var2 = new m8((ActionBarPopupWindow$ActionBarPopupWindowLayout) spcVar.b, -2, -2);
            wa5Var.x = m8Var2;
            m8Var2.e = true;
            m8Var2.c = (short) 220;
            m8Var2.setOutsideTouchable(true);
            wa5Var.x.setClippingEnabled(true);
            wa5Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            wa5Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) spcVar.b).measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
            wa5Var.x.setInputMethodMode(2);
            wa5Var.x.getContentView().setFocusableInTouchMode(true);
            wa5Var.x.showAtLocation(wa5Var.getFragmentView(), 0, (int) (view.getX() + f), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) spcVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f2));
            wa5Var.x.b();
        }
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }
}
