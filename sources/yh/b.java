package yh;

import ai.o0;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import bi.q1;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.w80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import v4.s0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b extends c51 {
    public final int N1;
    public final w80 O1;
    public final lz P1;
    public final bv0 Q1;
    public final bv0 R1;
    public float S1;
    public boolean T1;
    public int U1;
    public final /* synthetic */ d V1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, f2 f2Var, long j3) {
        super(f2Var.getCurrentAccount(), f2Var.getParentActivity(), f2Var.getResourceProvider());
        this.V1 = dVar;
        this.N1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i7 = m6.a7;
        v0(m6.w0(i7, this.I0));
        this.F1 = i7;
        this.E1 = i7;
        M0(0.0f);
        P(i7);
        this.A1 = false;
        this.B1 = false;
        w80 w80Var = new w80(this, f2Var, this.c, j3);
        this.O1 = w80Var;
        w80Var.B = false;
        this.p0 = 75;
        this.v1.J.setHint(id.M0(2131745758, null));
        h hVar = w80Var.f;
        this.p1 = hVar;
        this.o1 = hVar;
        this.n1.setAdapter(hVar);
        this.n1.r1();
        q1 q1Var = this.n1;
        w80Var.p = q1Var;
        q1Var.setOnItemClickListener(new ai.k(w80Var, 23));
        s0 onScrollListener = q1Var.getOnScrollListener();
        if (onScrollListener == null) {
            q1Var.setOnScrollListener(w80Var.D);
        } else {
            q1Var.setOnScrollListener(new o0(10, w80Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.n1.getParent()).indexOfChild(this.n1);
        lz b10 = w80Var.b();
        this.P1 = b10;
        this.b.addView(b10, indexOfChild, ha.c(-1.0f, -1));
        bv0 a10 = w80Var.a();
        this.Q1 = a10;
        this.b.addView(a10, indexOfChild, ha.c(-1.0f, -1));
        bv0 c10 = w80Var.c();
        this.R1 = c10;
        this.b.addView(c10, indexOfChild, ha.c(-1.0f, -1));
        w80Var.e();
    }

    @Override // org.telegram.ui.Components.c51
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        f2 f2Var;
        int action = motionEvent.getAction();
        w80 w80Var = this.O1;
        if (action == 0) {
            this.S1 = this.x1;
            w80Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.x1 - this.S1) < this.N1 && !this.T1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                f2Var = (f2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                f2Var = null;
            }
            if (f2Var instanceof cn) {
                boolean ra2 = ((cn) f2Var).ra();
                this.T1 = true;
                g0.i3(new r80(1, this, iVar), ra2 ? 200L : 0L);
            } else {
                this.T1 = true;
                A0(true);
                iVar.requestFocus();
                g0.h3(new at(iVar, 5));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            w80Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.c51
    public final void L0(String str) {
        this.O1.j(str);
    }

    @Override // org.telegram.ui.Components.c51
    public final void N0(int i7) {
        super.N0(i7);
        this.P1.setTranslationY(this.m1.getMeasuredHeight() + i7);
        float f10 = i7;
        this.Q1.setTranslationY(f10);
        this.R1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.c51
    public final void Q0() {
        q1 q1Var = this.n1;
        if (q1Var.getChildCount() > 0) {
            super.Q0();
            return;
        }
        int paddingTop = q1Var.getVisibility() == 0 ? q1Var.getPaddingTop() - g0.L(8.0f) : 0;
        if (this.x1 != paddingTop) {
            this.x1 = paddingTop;
            N0(paddingTop);
        }
    }

    @Override // org.telegram.ui.Components.c51, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        d dVar = this.V1;
        b bVar = dVar.i;
        if (bVar != null && !bVar.O1.b) {
            dVar.i = null;
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        l lVar = this.O1.s;
        if (lVar != null) {
            lVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        int w02 = m6.w0(m6.a7, this.I0);
        if (w02 != this.U1) {
            this.U1 = w02;
            v0(w02);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        w80 w80Var = this.O1;
        if (w80Var.b && this.x1 == 0) {
            this.x1 = g0.L(8.0f);
        }
        super.show();
        w80Var.b = false;
    }
}
