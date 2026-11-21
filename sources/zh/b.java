package zh;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import bi.h6;
import bi.l8;
import c8.ma;
import di.b1;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.yz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import v4.u0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class b extends r51 {
    public final int O1;
    public final l90 P1;
    public final yz Q1;
    public final nv0 R1;
    public final nv0 S1;
    public float T1;
    public boolean U1;
    public int V1;
    public final /* synthetic */ d W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, g2 g2Var, long j3) {
        super(g2Var.getCurrentAccount(), g2Var.getParentActivity(), g2Var.getResourceProvider());
        this.W1 = dVar;
        this.O1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i7 = m6.a7;
        v0(m6.w0(i7, this.J0));
        this.G1 = i7;
        this.F1 = i7;
        N0(0.0f);
        Q(i7);
        this.B1 = false;
        this.C1 = false;
        l90 l90Var = new l90(this, g2Var, this.c, j3);
        this.P1 = l90Var;
        l90Var.B = false;
        this.q0 = 75;
        this.w1.K.setHint(gd.N0(2131745562, null));
        g gVar = l90Var.f;
        this.q1 = gVar;
        this.p1 = gVar;
        this.o1.setAdapter(gVar);
        this.o1.r1();
        b1 b1Var = this.o1;
        l90Var.p = b1Var;
        b1Var.setOnItemClickListener(new l8(l90Var, 24));
        u0 onScrollListener = b1Var.getOnScrollListener();
        if (onScrollListener == null) {
            b1Var.setOnScrollListener(l90Var.D);
        } else {
            b1Var.setOnScrollListener(new h6(11, l90Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.o1.getParent()).indexOfChild(this.o1);
        yz b10 = l90Var.b();
        this.Q1 = b10;
        this.b.addView(b10, indexOfChild, ma.c(-1.0f, -1));
        nv0 a10 = l90Var.a();
        this.R1 = a10;
        this.b.addView(a10, indexOfChild, ma.c(-1.0f, -1));
        nv0 c10 = l90Var.c();
        this.S1 = c10;
        this.b.addView(c10, indexOfChild, ma.c(-1.0f, -1));
        l90Var.e();
    }

    @Override // org.telegram.ui.Components.r51
    public final void K0(MotionEvent motionEvent, ah.i iVar) {
        g2 g2Var;
        int action = motionEvent.getAction();
        l90 l90Var = this.P1;
        if (action == 0) {
            this.T1 = this.y1;
            l90Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y1 - this.T1) < this.O1 && !this.U1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                g2Var = (g2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                g2Var = null;
            }
            if (g2Var instanceof bn) {
                boolean sa2 = ((bn) g2Var).sa();
                this.U1 = true;
                g0.h3(new ou(22, this, iVar), sa2 ? 200L : 0L);
            } else {
                this.U1 = true;
                A0(true);
                iVar.requestFocus();
                g0.g3(new org.telegram.ui.Components.j(iVar, 6));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            l90Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.r51
    public final void M0(String str) {
        this.P1.j(str);
    }

    @Override // org.telegram.ui.Components.r51
    public final void O0(int i7) {
        super.O0(i7);
        this.Q1.setTranslationY(this.n1.getMeasuredHeight() + i7);
        float f10 = i7;
        this.R1.setTranslationY(f10);
        this.S1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.r51
    public final void R0() {
        b1 b1Var = this.o1;
        if (b1Var.getChildCount() > 0) {
            super.R0();
            return;
        }
        int paddingTop = b1Var.getVisibility() == 0 ? b1Var.getPaddingTop() - g0.L(8.0f) : 0;
        if (this.y1 != paddingTop) {
            this.y1 = paddingTop;
            O0(paddingTop);
        }
    }

    @Override // org.telegram.ui.Components.r51, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        d dVar = this.W1;
        b bVar = dVar.i;
        if (bVar != null && !bVar.P1.b) {
            dVar.i = null;
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        k kVar = this.P1.s;
        if (kVar != null) {
            kVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        int w02 = m6.w0(m6.a7, this.J0);
        if (w02 != this.V1) {
            this.V1 = w02;
            v0(w02);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        l90 l90Var = this.P1;
        if (l90Var.b && this.y1 == 0) {
            this.y1 = g0.L(8.0f);
        }
        super.show();
        l90Var.b = false;
    }
}
