// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vy1 extends x7c {
    public final int N1;
    public final my6 O1;
    public final pi4 P1;
    public final zya Q1;
    public final zya R1;
    public float S1;
    public boolean T1;
    public int U1;
    public final /* synthetic */ xy1 V1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy1(xy1 xy1Var, d dVar, long j) {
        super(dVar.getCurrentAccount(), dVar.getResourceProvider(), dVar.getParentActivity());
        this.V1 = xy1Var;
        this.N1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i = bkb.Z6;
        s0(bkb.v0(i, this.J0));
        this.F1 = i;
        this.E1 = i;
        H0(0.0f);
        M(i);
        this.A1 = false;
        this.B1 = false;
        my6 my6Var = new my6(this, dVar, this.c, j);
        this.O1 = my6Var;
        my6Var.B = false;
        this.q0 = (byte) 75;
        this.v1.K.setHint(k96.M0(2131745566, null));
        qy6 qy6Var = my6Var.f;
        this.p1 = qy6Var;
        this.o1 = qy6Var;
        this.n1.setAdapter(qy6Var);
        this.n1.r1();
        ns9 ns9Var = this.n1;
        my6Var.p = ns9Var;
        ns9Var.setOnItemClickListener(new bf4(my6Var, (byte) 10));
        i49 onScrollListener = ns9Var.getOnScrollListener();
        if (onScrollListener == null) {
            ns9Var.setOnScrollListener(my6Var.D);
        } else {
            ns9Var.setOnScrollListener(new si1(my6Var, onScrollListener, (byte) 5));
        }
        int indexOfChild = ((ViewGroup) this.n1.getParent()).indexOfChild(this.n1);
        pi4 b = my6Var.b();
        this.P1 = b;
        this.b.addView(b, indexOfChild, nme.c(-1.0f, -1));
        zya a = my6Var.a();
        this.Q1 = a;
        this.b.addView(a, indexOfChild, nme.c(-1.0f, -1));
        zya c = my6Var.c();
        this.R1 = c;
        this.b.addView(c, indexOfChild, nme.c(-1.0f, -1));
        my6Var.e();
    }

    @Override // x7c
    public final void E0(MotionEvent motionEvent, l7 l7Var) {
        d dVar;
        int action = motionEvent.getAction();
        my6 my6Var = this.O1;
        if (action == 0) {
            this.S1 = this.x1;
            my6Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.x1 - this.S1) < this.N1 && !this.T1) {
            Activity W = gl.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                dVar = (d) launchActivity.N().getFragmentStack().get(launchActivity.N().getFragmentStack().size() - 1);
            } else {
                dVar = null;
            }
            if (dVar instanceof mu1) {
                boolean S9 = ((mu1) dVar).S9();
                this.T1 = true;
                gl.e3(new oh6((Object) this, (Object) l7Var, (byte) 18), S9 ? 200L : 0L);
            } else {
                this.T1 = true;
                v0(true);
                l7Var.requestFocus();
                gl.d3(new ar5(l7Var, (byte) 2));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            my6Var.i(true);
        }
    }

    @Override // x7c
    public final void G0(String str) {
        this.O1.j(str);
    }

    @Override // x7c
    public final void I0(int i) {
        super.I0(i);
        this.P1.setTranslationY(this.m1.getMeasuredHeight() + i);
        float f = i;
        this.Q1.setTranslationY(f);
        this.R1.setTranslationY(f);
    }

    @Override // x7c
    public final void L0() {
        ns9 ns9Var = this.n1;
        if (ns9Var.getChildCount() > 0) {
            super.L0();
            return;
        }
        int paddingTop = ns9Var.getVisibility() == 0 ? ns9Var.getPaddingTop() - gl.L(8.0f) : 0;
        if (this.x1 != paddingTop) {
            this.x1 = paddingTop;
            I0(paddingTop);
        }
    }

    @Override // x7c, fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        xy1 xy1Var = this.V1;
        vy1 vy1Var = xy1Var.i;
        if (vy1Var != null && !vy1Var.O1.b) {
            xy1Var.i = null;
        }
        super.dismiss();
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        wy6 wy6Var = this.O1.s;
        if (wy6Var != null) {
            wy6Var.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // fx0
    public final void p0() {
        super.p0();
        int v0 = bkb.v0(bkb.Z6, this.J0);
        if (v0 != this.U1) {
            this.U1 = v0;
            s0(v0);
        }
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        my6 my6Var = this.O1;
        if (my6Var.b && this.x1 == 0) {
            this.x1 = gl.L(8.0f);
        }
        super.show();
        my6Var.b = false;
    }
}
