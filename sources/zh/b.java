package zh;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import bi.b6;
import bi.w3;
import c8.ja;
import di.c1;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.z80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import v4.t0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b extends e51 {
    public final int O1;
    public final z80 P1;
    public final pz Q1;
    public final cv0 R1;
    public final cv0 S1;
    public float T1;
    public boolean U1;
    public int V1;
    public final /* synthetic */ d W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, e2 e2Var, long j3) {
        super(e2Var.getCurrentAccount(), e2Var.getParentActivity(), e2Var.getResourceProvider());
        this.W1 = dVar;
        this.O1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i7 = j6.a7;
        v0(j6.w0(i7, this.J0));
        this.G1 = i7;
        this.F1 = i7;
        M0(0.0f);
        Q(i7);
        this.B1 = false;
        this.C1 = false;
        z80 z80Var = new z80(this, e2Var, this.c, j3);
        this.P1 = z80Var;
        z80Var.B = false;
        this.q0 = 75;
        this.w1.K.setHint(hd.M0(2131745758, null));
        g gVar = z80Var.f;
        this.q1 = gVar;
        this.p1 = gVar;
        this.o1.setAdapter(gVar);
        this.o1.r1();
        c1 c1Var = this.o1;
        z80Var.p = c1Var;
        c1Var.setOnItemClickListener(new b6(z80Var, 24));
        t0 onScrollListener = c1Var.getOnScrollListener();
        if (onScrollListener == null) {
            c1Var.setOnScrollListener(z80Var.D);
        } else {
            c1Var.setOnScrollListener(new w3(11, z80Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.o1.getParent()).indexOfChild(this.o1);
        pz b10 = z80Var.b();
        this.Q1 = b10;
        this.b.addView(b10, indexOfChild, ja.c(-1.0f, -1));
        cv0 a10 = z80Var.a();
        this.R1 = a10;
        this.b.addView(a10, indexOfChild, ja.c(-1.0f, -1));
        cv0 c10 = z80Var.c();
        this.S1 = c10;
        this.b.addView(c10, indexOfChild, ja.c(-1.0f, -1));
        z80Var.e();
    }

    @Override // org.telegram.ui.Components.e51
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        e2 e2Var;
        int action = motionEvent.getAction();
        z80 z80Var = this.P1;
        if (action == 0) {
            this.T1 = this.y1;
            z80Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y1 - this.T1) < this.O1 && !this.U1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                e2Var = (e2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                e2Var = null;
            }
            if (e2Var instanceof an) {
                boolean sa2 = ((an) e2Var).sa();
                this.U1 = true;
                g0.i3(new vs(24, this, iVar), sa2 ? 200L : 0L);
            } else {
                this.U1 = true;
                A0(true);
                iVar.requestFocus();
                g0.h3(new ht(iVar, 5));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            z80Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.e51
    public final void L0(String str) {
        this.P1.j(str);
    }

    @Override // org.telegram.ui.Components.e51
    public final void N0(int i7) {
        super.N0(i7);
        this.Q1.setTranslationY(this.n1.getMeasuredHeight() + i7);
        float f10 = i7;
        this.R1.setTranslationY(f10);
        this.S1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.e51
    public final void Q0() {
        c1 c1Var = this.o1;
        if (c1Var.getChildCount() > 0) {
            super.Q0();
            return;
        }
        int paddingTop = c1Var.getVisibility() == 0 ? c1Var.getPaddingTop() - g0.L(8.0f) : 0;
        if (this.y1 != paddingTop) {
            this.y1 = paddingTop;
            N0(paddingTop);
        }
    }

    @Override // org.telegram.ui.Components.e51, org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        d dVar = this.W1;
        b bVar = dVar.i;
        if (bVar != null && !bVar.P1.b) {
            dVar.i = null;
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        k kVar = this.P1.s;
        if (kVar != null) {
            kVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        int w02 = j6.w0(j6.a7, this.J0);
        if (w02 != this.V1) {
            this.V1 = w02;
            v0(w02);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        z80 z80Var = this.P1;
        if (z80Var.b && this.y1 == 0) {
            this.y1 = g0.L(8.0f);
        }
        super.show();
        z80Var.b = false;
    }
}
