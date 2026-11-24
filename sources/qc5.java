// default package

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qc5 implements g59, lc6 {
    public final /* synthetic */ uc5 a;

    public /* synthetic */ qc5(uc5 uc5Var) {
        this.a = uc5Var;
    }

    @Override // lc6
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        uc5 uc5Var = this.a;
        Location location = uc5Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        uc5Var.U = messageMedia.address;
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        boolean z = view instanceof vkb;
        uc5 uc5Var = this.a;
        if (z) {
            if (!gm.H1(uc5Var)) {
                return;
            }
            pc6 pc6Var = new pc6(4);
            pc6Var.m0 = 0L;
            pc6Var.M0 = new qc5(uc5Var);
            uc5Var.presentFragment(pc6Var);
        }
        if (!(view instanceof xib) || uc5Var.Q == 5) {
            return;
        }
        m8 m8Var = uc5Var.x;
        if (m8Var == null || !m8Var.isShowing()) {
            trc trcVar = new trc(uc5Var.getParentActivity(), null, new ai4((Object) uc5Var, (byte) 6), true, 1, null);
            trcVar.B(uc5Var.X);
            m8 m8Var2 = new m8((ActionBarPopupWindow$ActionBarPopupWindowLayout) trcVar.b, -2, -2);
            uc5Var.x = m8Var2;
            m8Var2.e = true;
            m8Var2.c = (short) 220;
            m8Var2.setOutsideTouchable(true);
            uc5Var.x.setClippingEnabled(true);
            uc5Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            uc5Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) trcVar.b).measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
            uc5Var.x.setInputMethodMode(2);
            uc5Var.x.getContentView().setFocusableInTouchMode(true);
            uc5Var.x.showAtLocation(uc5Var.getFragmentView(), 0, (int) (view.getX() + f), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) trcVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f2));
            uc5Var.x.b();
        }
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
