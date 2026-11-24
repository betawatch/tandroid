// default package

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ulb implements nl2 {
    public final /* synthetic */ qmb a;

    public ulb(qmb qmbVar) {
        this.a = qmbVar;
    }

    @Override // nl2
    public final void a(boolean z) {
        int i;
        int i2;
        qmb qmbVar = this.a;
        zjb zjbVar = qmbVar.w;
        if (!z) {
            ij.T(qmbVar, 1, null, null);
            return;
        }
        if (zjbVar.r == null) {
            qmbVar.finishFragment();
            i2 = ((d) qmbVar).currentAccount;
            na7.q1(i2).A4(zjbVar.b, zjbVar);
            kk7.e().k(kk7.u4, zjbVar.b, zjbVar);
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        i = ((d) qmbVar).currentAccount;
        sb.append(na7.q1(i).N2);
        sb.append("/addtheme/");
        sb.append(zjbVar.r.slug);
        String sb2 = sb.toString();
        qmbVar.showDialog(new taa(qmbVar.getParentActivity(), null, sb2, false, sb2, false, null));
    }

    @Override // nl2
    public final void b() {
        qmb qmbVar = this.a;
        if (qmbVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qmbVar.getParentActivity());
            String M0 = k96.M0(2131751472, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131751473, null);
            alertDialog$Builder.j(k96.M0(2131751586, null), new hza(this, (byte) 15));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            qmbVar.showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, qmbVar.a);
            }
        }
    }

    @Override // nl2
    public final void c(int i, int i2, boolean z) {
        qmb qmbVar = this.a;
        if (qmbVar.b == 2) {
            qmbVar.e1(i, i2, true);
            return;
        }
        Runnable runnable = qmbVar.a0;
        zjb zjbVar = qmbVar.w;
        if (i2 != -1) {
            int i3 = qmbVar.Z;
            if (i3 != -1 && i3 != i2) {
                runnable.run();
            }
            qmbVar.Y = i;
            qmbVar.Z = i2;
            if (z) {
                runnable.run();
                return;
            } else {
                if (qmbVar.b0) {
                    return;
                }
                qmbVar.b0 = true;
                qmbVar.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i4 = qmbVar.n;
        if (i4 == 1 || i4 == 2) {
            long j = qmbVar.K;
            if (j != 0) {
                zjbVar.j = j;
            } else {
                zjbVar.j = 0L;
            }
            long j2 = qmbVar.L;
            if (j2 != 0) {
                zjbVar.k = j2;
            } else {
                zjbVar.k = 0L;
            }
            long j3 = qmbVar.M;
            if (j3 != 0) {
                zjbVar.l = j3;
            } else {
                zjbVar.l = 0L;
            }
            long j4 = qmbVar.N;
            if (j4 != 0) {
                zjbVar.m = j4;
            } else {
                zjbVar.m = 0L;
            }
            zjbVar.n = qmbVar.Q;
            if (i4 == 2) {
                int C0 = bkb.C0(bkb.De);
                int C02 = bkb.C0(bkb.Ee);
                int C03 = bkb.C0(bkb.Fe);
                int C04 = bkb.C0(bkb.Ge);
                int i5 = (int) zjbVar.k;
                int i6 = (int) zjbVar.l;
                int i7 = (int) zjbVar.m;
                int i8 = (int) zjbVar.j;
                p pVar = qmbVar.X;
                if (i7 != 0) {
                    C04 = i7;
                }
                pVar.e(C04, 3);
                p pVar2 = qmbVar.X;
                if (i6 != 0) {
                    C03 = i6;
                }
                pVar2.e(C03, 2);
                p pVar3 = qmbVar.X;
                if (i5 != 0) {
                    C02 = i5;
                }
                pVar3.e(C02, 1);
                p pVar4 = qmbVar.X;
                if (i8 != 0) {
                    C0 = i8;
                }
                pVar4.e(C0, 0);
            }
        }
        int i9 = qmbVar.n;
        if (i9 == 1 || i9 == 3) {
            int i10 = qmbVar.F;
            if (i10 != 0) {
                zjbVar.e = i10;
            } else {
                zjbVar.e = 0;
            }
            int i11 = qmbVar.G;
            if (i11 != 0) {
                zjbVar.f = i11;
            } else {
                zjbVar.f = 0;
            }
            int i12 = qmbVar.H;
            if (i12 != 0) {
                zjbVar.g = i12;
            } else {
                zjbVar.g = 0;
            }
            int i13 = qmbVar.I;
            if (i13 != 0) {
                zjbVar.h = i13;
            } else {
                zjbVar.h = 0;
                i13 = 0;
            }
            if (i9 == 3) {
                qmbVar.X.e(i13, 3);
                qmbVar.X.e(zjbVar.g, 2);
                qmbVar.X.e(zjbVar.f, 1);
                p pVar5 = qmbVar.X;
                int i14 = zjbVar.e;
                if (i14 == 0) {
                    i14 = zjbVar.c;
                }
                pVar5.e(i14, 0);
            }
        }
        bkb.r1(false, false);
        qmbVar.w0.h1();
    }

    @Override // nl2
    public final int d(int i) {
        zjb zjbVar;
        qmb qmbVar = this.a;
        if (qmbVar.n != 3) {
            return 0;
        }
        akb akbVar = qmbVar.g0;
        if (akbVar.T && i == 0 && (zjbVar = (zjb) akbVar.b0.get(bkb.n)) != null) {
            return zjbVar.e;
        }
        return 0;
    }
}
