package wh;

import ag.y0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.us;
import org.telegram.messenger.v2;
import org.telegram.messenger.w0;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.a7;
import org.telegram.ui.mk;
import org.telegram.ui.un;
import rh.e6;
import s4.j;
import vh.p2;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends ha implements us {
    public final sf.a P1;
    public final ai.b Q1;
    public final FrameLayout R1;
    public Runnable S1;
    public int T1;
    public p51 U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Context context, p6 p6Var, sf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, p6Var);
        p51 p51Var;
        final int i10 = 0;
        this.r1 = 0.2f;
        this.S1 = runnable;
        O();
        tk0 tk0Var = this.k1;
        int i11 = this.t0;
        tk0Var.setPadding(i11, 0, i11, 0);
        this.k1.setOnItemClickListener(new y0(this, 23));
        j jVar = new j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.k1.setItemAnimator(jVar);
        v0(t6.w0(t6.h5, p6Var));
        this.P1 = aVar;
        ai.b bVar = new ai.b(6, context, p6Var);
        this.Q1 = bVar;
        final int i12 = 1;
        ((TextView) bVar.c).setText(cd.a0(null, null, 2131744070, sf.a.i(aVar.b - e6.y(this.a, true).s().b, sf.b.b).d()));
        TextView textView = (TextView) bVar.d;
        textView.setText(i0.W2(cd.L0(2131750529, null)));
        textView.setMaxWidth(p2.a(textView.getText(), textView.getPaint()));
        this.l1.setTitle(O0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.R1 = frameLayout;
        vh.d dVar = new vh.d(getContext(), this.I0, true);
        frameLayout.addView(dVar, b6.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10) {
            w0.u();
            if (!v2.a()) {
                w0.r();
                dVar.i(cd.L0(2131752041, null), false, true);
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: wh.e
                    public final /* synthetic */ f b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13 = i12;
                        f fVar = this.b;
                        switch (i13) {
                            case 0:
                                gf.f.t(fVar.getContext(), cd.L0(2131744053, null));
                                break;
                            default:
                                fVar.dismiss();
                                break;
                        }
                    }
                });
                p51Var = this.U1;
                if (p51Var == null) {
                    p51Var.O(false);
                    return;
                }
                return;
            }
        }
        dVar.i(cd.L0(2131744055, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: wh.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i10;
                f fVar = this.b;
                switch (i13) {
                    case 0:
                        gf.f.t(fVar.getContext(), cd.L0(2131744053, null));
                        break;
                    default:
                        fVar.dismiss();
                        break;
                }
            }
        });
        p51Var = this.U1;
        if (p51Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        zs.f(this.a).n(this, zs.v3);
        zs.f(this.a).n(this, zs.y3);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.k1, getContext(), this.a, 0, true, new qh.d(this, 25), this.I0);
        this.U1 = p51Var;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        ai.b bVar = this.Q1;
        if (bVar == null) {
            return null;
        }
        return ((TextView) bVar.c).getText();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == zs.v3 || i10 == zs.y3) {
            p51 p51Var = this.U1;
            if (p51Var != null) {
                p51Var.O(true);
            }
            sf.a s10 = e6.y(this.a, true).s();
            TextView textView = (TextView) this.Q1.c;
            sf.a aVar = this.P1;
            textView.setText(cd.a0(null, null, 2131744070, sf.a.i(aVar.b - s10.b, sf.b.b).d()));
            da daVar = this.l1;
            if (daVar != null) {
                daVar.setTitle(O0());
            }
            if (s10.b < aVar.b || (runnable = this.S1) == null) {
                return;
            }
            runnable.run();
            this.S1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        ai.b bVar = this.Q1;
        if (bVar != null) {
            ((a7) bVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            int w02 = t6.w0(t6.h5, this.I0);
            if (w02 != this.T1) {
                this.T1 = w02;
                v0(w02);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        mk mkVar;
        if (e6.y(this.a, true).s().b >= this.P1.b) {
            Runnable runnable = this.S1;
            if (runnable != null) {
                runnable.run();
                this.S1 = null;
                return;
            }
            return;
        }
        k2 Q = LaunchActivity.Q();
        if (Q instanceof un) {
            un unVar = (un) Q;
            if (unVar.J9() && (mkVar = unVar.Z) != null) {
                mkVar.L();
            }
        }
        super.show();
        zs.f(this.a).c(this, zs.v3);
        zs.f(this.a).c(this, zs.y3);
    }
}
