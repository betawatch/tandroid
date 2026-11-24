// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sc7 extends q59 implements jm7 {
    public u3b E;
    public final Context c;
    public final yv1 f;
    public int h;
    public int n;
    public final ylb s;
    public final int w;
    public final boolean x;
    public String y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = z8c.t0;
    public final pg6 F = new pg6(this, 23);

    public sc7(Context context, yv1 yv1Var, ylb ylbVar, int i, boolean z) {
        this.s = ylbVar;
        this.c = context;
        this.f = yv1Var;
        this.w = i;
        this.x = z;
    }

    public final Object E(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.e;
        if (i < arrayList.size()) {
            return arrayList.get(i);
        }
        return null;
    }

    @Override // y59
    public final int b() {
        return this.e.size() + this.n;
    }

    @Override // y59
    public final int d(int i) {
        return i < this.e.size() ? 0 : 1;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.B5 && objArr[0] == this.E) {
            f();
        }
    }

    @Override // y59
    public final void f() {
        int b = b();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i = this.w;
        int i2 = this.r;
        ArrayList arrayList2 = i == 0 ? hs6.d0(i2).Z0 : af5.a(i2).b(i).a;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            k47 k47Var = (k47) arrayList2.get(i4);
            if ((!k47Var.z2() || k47Var.S2) && !hashSet.contains(Integer.valueOf(k47Var.e1()))) {
                arrayList.add(k47Var);
                hashSet.add(Integer.valueOf(k47Var.e1()));
            }
        }
        int i5 = this.n;
        this.h = arrayList.size();
        if (i != 0) {
            if (!af5.a(i2).b(i).n && this.h != 0) {
                i3 = Utilities.j(af5.a(i2).b(i).m - this.h, 3, 0);
            }
            this.n = i3;
        } else {
            if (!hs6.d0(i2).Y1() && this.h != 0) {
                i3 = Utilities.j(hs6.d0(i2).k0() - this.h, 3, 0);
            }
            this.n = i3;
        }
        int b2 = b();
        if (b >= b2) {
            super.f();
            return;
        }
        if (i5 > 0) {
            l(b - i5, i5);
        }
        p(b, b2 - b);
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        boolean z;
        int i2;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 != 0) {
            if (i3 == 2) {
                ((rc7) view).a(this.E);
                return;
            }
            return;
        }
        hg3 hg3Var = (hg3) view;
        hg3Var.t2 = true;
        k47 k47Var = (k47) E(i);
        long B0 = k47.B0(k47Var.k);
        int i4 = k47Var.k.date;
        if (this.x) {
            hg3Var.s0 = true;
            long P1 = k47Var.P1();
            TLRPC.Message message = k47Var.k;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader != null) {
                i2 = messageFwdHeader.date;
                if (i2 == 0) {
                    int i5 = messageFwdHeader.saved_date;
                    if (i5 != 0) {
                        i2 = i5;
                    }
                }
                z = false;
                B0 = P1;
            }
            i2 = message.date;
            z = false;
            B0 = P1;
        } else {
            if (k47Var.O3() || sd2.o0(this.r, B0)) {
                B0 = k47Var.Z0();
            }
            z = true;
            i2 = i4;
        }
        hg3Var.e0(B0, k47Var, i2, z, false);
        hg3Var.setDialogCellDelegate(new pc7(this));
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View hg3Var;
        Context context = this.c;
        if (i != 0) {
            ylb ylbVar = this.s;
            if (i != 1) {
                hg3Var = i != 2 ? null : new rc7(context, ylbVar);
            } else {
                tk4 tk4Var = new tk4(context, ylbVar);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(7);
                hg3Var = tk4Var;
            }
        } else {
            hg3Var = new hg3(null, context, true, this.r, this.s);
        }
        return kt6.h(hg3Var, hg3Var, -1, -2);
    }
}
