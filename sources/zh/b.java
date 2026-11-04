package zh;

import ai.i4;
import ai.j6;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import b8.mf;
import ci.j1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.zs;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
import u4.t0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends v41 {
    public final int L1;
    public final s80 M1;
    public final iz N1;
    public final zu0 O1;
    public final zu0 P1;
    public float Q1;
    public boolean R1;
    public int S1;
    public final /* synthetic */ d T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, d2 d2Var, long j10) {
        super(d2Var.getCurrentAccount(), d2Var.getParentActivity(), d2Var.getResourceProvider());
        this.T1 = dVar;
        this.L1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i3 = k6.a7;
        v0(k6.w0(i3, this.J0));
        this.D1 = i3;
        this.C1 = i3;
        M0(0.0f);
        P(i3);
        this.y1 = false;
        this.z1 = false;
        s80 s80Var = new s80(this, d2Var, this.c, j10);
        this.M1 = s80Var;
        s80Var.B = false;
        this.q0 = 75;
        this.t1.K.setHint(bd.M0(2131745768, null));
        f fVar = s80Var.f;
        this.n1 = fVar;
        this.m1 = fVar;
        this.l1.setAdapter(fVar);
        this.l1.r1();
        j1 j1Var = this.l1;
        s80Var.p = j1Var;
        j1Var.setOnItemClickListener(new j6(s80Var, 24));
        t0 onScrollListener = j1Var.getOnScrollListener();
        if (onScrollListener == null) {
            j1Var.setOnScrollListener(s80Var.D);
        } else {
            j1Var.setOnScrollListener(new i4(11, s80Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.l1.getParent()).indexOfChild(this.l1);
        iz b10 = s80Var.b();
        this.N1 = b10;
        this.b.addView(b10, indexOfChild, mf.c(-1.0f, -1));
        zu0 a10 = s80Var.a();
        this.O1 = a10;
        this.b.addView(a10, indexOfChild, mf.c(-1.0f, -1));
        zu0 c2 = s80Var.c();
        this.P1 = c2;
        this.b.addView(c2, indexOfChild, mf.c(-1.0f, -1));
        s80Var.e();
    }

    @Override // org.telegram.ui.Components.v41
    public final void J0(MotionEvent motionEvent, bh.g gVar) {
        d2 d2Var;
        int action = motionEvent.getAction();
        s80 s80Var = this.M1;
        if (action == 0) {
            this.Q1 = this.v1;
            s80Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.v1 - this.Q1) < this.L1 && !this.R1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                d2Var = (d2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                d2Var = null;
            }
            if (d2Var instanceof wm) {
                boolean pa2 = ((wm) d2Var).pa();
                this.R1 = true;
                g0.i3(new j50(5, this, gVar), pa2 ? 200L : 0L);
            } else {
                this.R1 = true;
                A0(true);
                gVar.requestFocus();
                g0.h3(new zs(gVar, 5));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            s80Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.v41
    public final void L0(String str) {
        this.M1.j(str);
    }

    @Override // org.telegram.ui.Components.v41
    public final void N0(int i3) {
        super.N0(i3);
        this.N1.setTranslationY(this.k1.getMeasuredHeight() + i3);
        float f10 = i3;
        this.O1.setTranslationY(f10);
        this.P1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.v41
    public final void Q0() {
        j1 j1Var = this.l1;
        if (j1Var.getChildCount() > 0) {
            super.Q0();
            return;
        }
        int paddingTop = j1Var.getVisibility() == 0 ? j1Var.getPaddingTop() - g0.L(8.0f) : 0;
        if (this.v1 != paddingTop) {
            this.v1 = paddingTop;
            N0(paddingTop);
        }
    }

    @Override // org.telegram.ui.Components.v41, org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        d dVar = this.T1;
        b bVar = dVar.i;
        if (bVar != null && !bVar.M1.b) {
            dVar.i = null;
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        j jVar = this.M1.s;
        if (jVar != null) {
            jVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        int w02 = k6.w0(k6.a7, this.J0);
        if (w02 != this.S1) {
            this.S1 = w02;
            v0(w02);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        s80 s80Var = this.M1;
        if (s80Var.b && this.v1 == 0) {
            this.v1 = g0.L(8.0f);
        }
        super.show();
        s80Var.b = false;
    }
}
