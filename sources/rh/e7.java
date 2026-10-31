package rh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e7(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 5;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                final org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj2;
                final vh.d dVar = (vh.d) obj;
                z2Var.b0 = false;
                dVar.setLoading(true);
                ((r5) obj3).a(new q20() { // from class: rh.f6
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i13) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                                if (!booleanValue) {
                                    final int i14 = 0;
                                    final vh.d dVar2 = dVar;
                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: rh.h6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    z2Var2.b0 = false;
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    z2Var2.b0 = false;
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    z2Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.z2 z2Var3 = z2Var;
                                if (!booleanValue2) {
                                    final int i15 = 1;
                                    final vh.d dVar3 = dVar;
                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: rh.h6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    z2Var3.b0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    z2Var3.b0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    z2Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 1:
                final org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) obj2;
                final vh.d dVar2 = (vh.d) obj;
                z2Var2.b0 = false;
                dVar2.setLoading(true);
                ((p5) obj3).a(new q20() { // from class: rh.f6
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i12) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.z2 z2Var22 = z2Var2;
                                if (!booleanValue) {
                                    final int i14 = 0;
                                    final vh.d dVar22 = dVar2;
                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: rh.h6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    z2Var22.b0 = false;
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    z2Var22.b0 = false;
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    z2Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.z2 z2Var3 = z2Var2;
                                if (!booleanValue2) {
                                    final int i15 = 1;
                                    final vh.d dVar3 = dVar2;
                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: rh.h6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    z2Var3.b0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    z2Var3.b0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    z2Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                ((th.l1) obj3).a(Long.valueOf(((long[]) obj)[0]));
                ((org.telegram.ui.ActionBar.z2) obj2).dismiss();
                break;
            case 3:
                th.z2 z2Var3 = ((th.u2) obj3).x;
                z2Var3.D0((vh.u6) obj2, (TL_stories.StoryItem) obj);
                th.u2 u2Var = z2Var3.c1;
                if (u2Var != null) {
                    u2Var.a();
                    break;
                }
                break;
            case 4:
                th.u2 u2Var2 = (th.u2) obj3;
                th.o7 o7Var = (th.o7) obj;
                int i14 = 3;
                ((org.telegram.ui.ActionBar.b1) obj2).performHapticFeedback(3);
                cc X = cc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, org.telegram.messenger.i0.T2(cd.L0(2131745950, null), new th.o0(i14, u2Var2, o7Var))).j();
                    break;
                }
                break;
            case 5:
                th.j3 j3Var = (th.j3) obj3;
                kg.q1 q1Var = new kg.q1(j3Var, 11);
                th.y3 y3Var = j3Var.b;
                new cv(q1Var, y3Var.getContext(), y3Var.s, (ArrayList) obj2).show();
                ((z60) obj).u();
                break;
            case 6:
                vh.e8 e8Var = (vh.e8) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                th.b bVar = (th.b) obj;
                z60 z60Var = e8Var.U0;
                if (z60Var == null || !z60Var.D()) {
                    vh.m mVar = new vh.m(e8Var, i12);
                    boolean q6 = d20.i(e8Var.U).q();
                    vh.m mVar2 = q6 ? null : new vh.m(e8Var, i13);
                    z60 F = z60.F(frameLayout, bVar, e8Var.S0);
                    e8Var.U0 = F;
                    F.p(13, org.telegram.messenger.i0.L(200.0f), cd.M0("StoryPeriodHint"));
                    e8Var.U0.k();
                    int i15 = 0;
                    while (true) {
                        int[] iArr = vh.p.P1;
                        if (i15 >= 4) {
                            z60 z60Var2 = e8Var.U0;
                            z60Var2.s = 0;
                            z60Var2.Z();
                            break;
                        } else {
                            int i16 = iArr[i15];
                            z60 z60Var3 = e8Var.U0;
                            String M0 = i16 == Integer.MAX_VALUE ? cd.M0("StoryPeriodKeep") : cd.G(i16 / 3600, "Hours", new Object[0]);
                            int i17 = org.telegram.ui.ActionBar.t6.E8;
                            z60Var3.b(0, null, M0, i17, i17, new org.telegram.utils.twidget.v(mVar, i16, i11));
                            z60Var3.M((q6 || i16 == 86400 || i16 == Integer.MAX_VALUE) ? null : new org.telegram.utils.twidget.v(mVar2, i16, 6));
                            if (e8Var.W0 == i15) {
                                e8Var.U0.L();
                            }
                            i15++;
                        }
                    }
                }
                break;
            case 7:
                ef efVar = (ef) obj2;
                vh.h2 h2Var = (vh.h2) obj;
                vh.k2 k2Var = ((vh.g2) obj3).c;
                ArrayList arrayList = k2Var.h0;
                if (arrayList.contains(efVar)) {
                    arrayList.remove(efVar);
                } else if (arrayList.size() + 1 > k2Var.R) {
                    int i18 = -k2Var.N;
                    k2Var.N = i18;
                    org.telegram.messenger.i0.F3(i18, h2Var, null);
                    org.telegram.messenger.t2.D.a();
                    break;
                } else {
                    arrayList.add(efVar);
                }
                org.telegram.messenger.i0.a4(k2Var.d);
                k2Var.j();
                break;
            default:
                vh.s7 s7Var = (vh.s7) obj3;
                Context context = (Context) obj2;
                ig.s0 s0Var = (ig.s0) obj;
                if (!s7Var.k1) {
                    Runnable runnable = s7Var.t1;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    ig.u uVar = new ig.u(context, s7Var.p1);
                    s7Var.C1 = uVar;
                    uVar.I0(s7Var.j1.a, 2);
                    uVar.o1 = new androidx.activity.o(s7Var, s0Var, 10);
                    uVar.n1 = new mg.f0(5, s7Var, s0Var);
                    uVar.show();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e7(th.l1 l1Var, long[] jArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.a = 2;
        this.d = l1Var;
        this.c = jArr;
        this.b = z2Var;
    }
}
