package zf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.pa;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.un;
import th.r4;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b1 extends tk0 implements vs {
    public r4 D;
    public final Context c;
    public final un f;
    public int h;
    public int n;
    public final p6 s;
    public final int w;
    public final boolean x;
    public String y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = e20.s0;
    public final xh.d0 E = new xh.d0(this, 8);

    public b1(Context context, un unVar, p6 p6Var, int i10, boolean z10) {
        this.s = p6Var;
        this.c = context;
        this.f = unVar;
        this.w = i10;
        this.x = z10;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 2;
    }

    public final Object E(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i10);
    }

    @Override // s4.g0
    public final int b() {
        return this.e.size() + this.n;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return i10 < this.e.size() ? 0 : 1;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.x5 && objArr[0] == this.D) {
            f();
        }
    }

    @Override // s4.g0
    public final void f() {
        int b10 = b();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.r;
        int i11 = this.w;
        ArrayList arrayList2 = i11 == 0 ? vi.b0(i10).Y0 : pa.a(i10).b(i11).a;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            kj kjVar = (kj) arrayList2.get(i13);
            if ((!kjVar.z2() || kjVar.N2) && !hashSet.contains(Integer.valueOf(kjVar.f1()))) {
                arrayList.add(kjVar);
                hashSet.add(Integer.valueOf(kjVar.f1()));
            }
        }
        int i14 = this.n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!pa.a(i10).b(i11).n && this.h != 0) {
                i12 = Utilities.j(pa.a(i10).b(i11).m - this.h, 3, 0);
            }
            this.n = i12;
        } else {
            if (!vi.b0(i10).W1() && this.h != 0) {
                i12 = Utilities.j(vi.b0(i10).j0() - this.h, 3, 0);
            }
            this.n = i12;
        }
        int b11 = b();
        if (b10 >= b11) {
            super.f();
            return;
        }
        if (i14 > 0) {
            k(b10 - i14, i14);
        }
        o(b10, b11 - b10);
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 0) {
            if (i13 == 2) {
                ((a1) view).a(this.D);
                return;
            }
            return;
        }
        v2 v2Var = (v2) view;
        v2Var.s2 = true;
        kj kjVar = (kj) E(i10);
        long B0 = kj.B0(kjVar.k);
        int i14 = kjVar.k.date;
        if (this.x) {
            v2Var.r0 = true;
            long Q1 = kjVar.Q1();
            TLRPC.Message message = kjVar.k;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader == null || ((i11 = messageFwdHeader.date) == 0 && messageFwdHeader.saved_date == 0)) {
                i12 = message.date;
            } else {
                if (i11 == 0) {
                    i12 = messageFwdHeader.saved_date;
                }
                z10 = false;
                B0 = Q1;
            }
            i11 = i12;
            z10 = false;
            B0 = Q1;
        } else {
            if (kjVar.P3() || w3.o0(this.r, B0)) {
                B0 = kjVar.Z0();
            }
            z10 = true;
            i11 = i14;
        }
        v2Var.d0(B0, kjVar, i11, z10, false);
        v2Var.setDialogCellDelegate(new y0(this));
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View v2Var;
        View view;
        if (i10 != 0) {
            p6 p6Var = this.s;
            Context context = this.c;
            if (i10 == 1) {
                zz zzVar = new zz(context, p6Var);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(7);
                view = zzVar;
            } else if (i10 != 2) {
                v2Var = null;
            } else {
                view = new a1(context, p6Var);
            }
            v2Var = view;
        } else {
            v2Var = new v2(null, this.c, true, this.r, this.s);
        }
        return sc.e.o(v2Var, v2Var, -1, -2);
    }
}
