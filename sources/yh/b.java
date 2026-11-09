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
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.x80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import v4.s0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b extends c51 {
    public final int K1;
    public final x80 L1;
    public final mz M1;
    public final cv0 N1;
    public final cv0 O1;
    public float P1;
    public boolean Q1;
    public int R1;
    public final /* synthetic */ d S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, f2 f2Var, long j3) {
        super(f2Var.getCurrentAccount(), f2Var.getParentActivity(), f2Var.getResourceProvider());
        this.S1 = dVar;
        this.K1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i7 = l6.a7;
        v0(l6.w0(i7, this.I0));
        this.C1 = i7;
        this.B1 = i7;
        M0(0.0f);
        P(i7);
        this.x1 = false;
        this.y1 = false;
        x80 x80Var = new x80(this, f2Var, this.c, j3);
        this.L1 = x80Var;
        x80Var.B = false;
        this.p0 = 75;
        this.s1.J.setHint(id.M0(2131745758, null));
        h hVar = x80Var.f;
        this.m1 = hVar;
        this.l1 = hVar;
        this.k1.setAdapter(hVar);
        this.k1.r1();
        q1 q1Var = this.k1;
        x80Var.p = q1Var;
        q1Var.setOnItemClickListener(new ai.k(x80Var, 23));
        s0 onScrollListener = q1Var.getOnScrollListener();
        if (onScrollListener == null) {
            q1Var.setOnScrollListener(x80Var.D);
        } else {
            q1Var.setOnScrollListener(new o0(10, x80Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.k1.getParent()).indexOfChild(this.k1);
        mz b10 = x80Var.b();
        this.M1 = b10;
        this.b.addView(b10, indexOfChild, ha.c(-1.0f, -1));
        cv0 a10 = x80Var.a();
        this.N1 = a10;
        this.b.addView(a10, indexOfChild, ha.c(-1.0f, -1));
        cv0 c10 = x80Var.c();
        this.O1 = c10;
        this.b.addView(c10, indexOfChild, ha.c(-1.0f, -1));
        x80Var.e();
    }

    @Override // org.telegram.ui.Components.c51
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        f2 f2Var;
        int action = motionEvent.getAction();
        x80 x80Var = this.L1;
        if (action == 0) {
            this.P1 = this.u1;
            x80Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.u1 - this.P1) < this.K1 && !this.Q1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                f2Var = (f2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                f2Var = null;
            }
            if (f2Var instanceof cn) {
                boolean ra2 = ((cn) f2Var).ra();
                this.Q1 = true;
                g0.i3(new w80(0, this, iVar), ra2 ? 200L : 0L);
            } else {
                this.Q1 = true;
                A0(true);
                iVar.requestFocus();
                g0.h3(new bt(iVar, 5));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            x80Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.c51
    public final void L0(String str) {
        this.L1.j(str);
    }

    @Override // org.telegram.ui.Components.c51
    public final void N0(int i7) {
        super.N0(i7);
        this.M1.setTranslationY(this.j1.getMeasuredHeight() + i7);
        float f10 = i7;
        this.N1.setTranslationY(f10);
        this.O1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.c51
    public final void Q0() {
        q1 q1Var = this.k1;
        if (q1Var.getChildCount() > 0) {
            super.Q0();
            return;
        }
        int paddingTop = q1Var.getVisibility() == 0 ? q1Var.getPaddingTop() - g0.L(8.0f) : 0;
        if (this.u1 != paddingTop) {
            this.u1 = paddingTop;
            N0(paddingTop);
        }
    }

    @Override // org.telegram.ui.Components.c51, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        d dVar = this.S1;
        b bVar = dVar.i;
        if (bVar != null && !bVar.L1.b) {
            dVar.i = null;
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        l lVar = this.L1.s;
        if (lVar != null) {
            lVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        int w02 = l6.w0(l6.a7, this.I0);
        if (w02 != this.R1) {
            this.R1 = w02;
            v0(w02);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        x80 x80Var = this.L1;
        if (x80Var.b && this.u1 == 0) {
            this.u1 = g0.L(8.0f);
        }
        super.show();
        x80Var.b = false;
    }
}
