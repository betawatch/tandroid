// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yc7 extends c79 implements fn7 {
    public p5b E;
    public final Context c;
    public final zu1 f;
    public int h;
    public int n;
    public final vnb s;
    public final int w;
    public final boolean x;
    public String y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = yac.t0;
    public final z96 F = new z96(this, 29);

    public yc7(Context context, zu1 zu1Var, vnb vnbVar, int i, boolean z) {
        this.s = vnbVar;
        this.c = context;
        this.f = zu1Var;
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

    @Override // j79
    public final int b() {
        return this.e.size() + this.n;
    }

    @Override // j79
    public final int d(int i) {
        return i < this.e.size() ? 0 : 1;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.A5 && objArr[0] == this.E) {
            f();
        }
    }

    @Override // j79
    public final void f() {
        int b = b();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i = this.w;
        int i2 = this.r;
        ArrayList arrayList2 = i == 0 ? ls6.d0(i2).Z0 : df5.a(i2).b(i).a;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            r47 r47Var = (r47) arrayList2.get(i4);
            if ((!r47Var.z2() || r47Var.S2) && !hashSet.contains(Integer.valueOf(r47Var.e1()))) {
                arrayList.add(r47Var);
                hashSet.add(Integer.valueOf(r47Var.e1()));
            }
        }
        int i5 = this.n;
        this.h = arrayList.size();
        if (i != 0) {
            if (!df5.a(i2).b(i).n && this.h != 0) {
                i3 = Utilities.j(df5.a(i2).b(i).m - this.h, 3, 0);
            }
            this.n = i3;
        } else {
            if (!ls6.d0(i2).Y1() && this.h != 0) {
                i3 = Utilities.j(ls6.d0(i2).k0() - this.h, 3, 0);
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

    @Override // j79
    public final void t(f89 f89Var, int i) {
        boolean z;
        int i2;
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 != 0) {
            if (i3 == 2) {
                ((xc7) view).a(this.E);
                return;
            }
            return;
        }
        of3 of3Var = (of3) view;
        of3Var.t2 = true;
        r47 r47Var = (r47) E(i);
        long B0 = r47.B0(r47Var.k);
        int i4 = r47Var.k.date;
        if (this.x) {
            of3Var.s0 = true;
            long P1 = r47Var.P1();
            TLRPC.Message message = r47Var.k;
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
            if (r47Var.O3() || xc2.o0(this.r, B0)) {
                B0 = r47Var.Z0();
            }
            z = true;
            i2 = i4;
        }
        of3Var.e0(B0, r47Var, i2, z, false);
        of3Var.setDialogCellDelegate(new vc7(this));
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View of3Var;
        Context context = this.c;
        if (i != 0) {
            vnb vnbVar = this.s;
            if (i != 1) {
                of3Var = i != 2 ? null : new xc7(context, vnbVar);
            } else {
                tk4 tk4Var = new tk4(context, vnbVar);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(7);
                of3Var = tk4Var;
            }
        } else {
            of3Var = new of3(null, context, true, this.r, this.s);
        }
        return qu6.h(of3Var, of3Var, -1, -2);
    }
}
