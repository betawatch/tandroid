package v4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import org.telegram.ui.Components.z51;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class f0 implements k1, z51, com.google.android.gms.common.api.internal.q, z2.d {
    public Object a;

    public /* synthetic */ f0(Object obj) {
        this.a = obj;
    }

    @Override // v4.k1
    public int R() {
        p0 p0Var = (p0) this.a;
        return p0Var.n - p0Var.C();
    }

    @Override // v4.k1
    public int a(View view) {
        return p0.z(view) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).topMargin;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        y8.j jVar = (y8.j) this.a;
        h8.b bVar = (h8.b) obj;
        Bundle B = bVar.B();
        B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        h8.a aVar = new h8.a(0, (TaskCompletionSource) obj2);
        try {
            h8.i iVar = (h8.i) bVar.n();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i7 = h8.c.a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            B.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(19, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
            Bundle bundle = Bundle.EMPTY;
            aVar.d0(Status.h, null);
        }
    }

    public void b(a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int i7 = aVar.a;
        if (i7 == 1) {
            recyclerView.y.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i7 == 2) {
            recyclerView.y.Y(recyclerView, aVar.b, aVar.d);
        } else if (i7 == 4) {
            recyclerView.y.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i7 != 8) {
                return;
            }
            recyclerView.y.X(recyclerView, aVar.b, aVar.d);
        }
    }

    public void c(int i7, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int z10 = recyclerView.e.z();
        int i13 = i10 + i7;
        for (int i14 = 0; i14 < z10; i14++) {
            View y10 = recyclerView.e.y(i14);
            f1 U = RecyclerView.U(y10);
            if (U != null && !U.r() && (i12 = U.c) >= i7 && i12 < i13) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.l) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((q0) y10.getLayoutParams()).c = true;
            }
        }
        x0 x0Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) x0Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            f1 f1Var = (f1) arrayList2.get(size);
            if (f1Var != null && (i11 = f1Var.c) >= i7 && i11 < i13) {
                f1Var.a(2);
                x0Var.f(size);
            }
        }
        recyclerView.z0 = true;
    }

    public void d(int i7, int i10) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int z10 = recyclerView.e.z();
        for (int i11 = 0; i11 < z10; i11++) {
            f1 U = RecyclerView.U(recyclerView.e.y(i11));
            if (U != null && !U.r() && U.c >= i7) {
                U.n(i10, false);
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            f1 f1Var = (f1) arrayList.get(i12);
            if (f1Var != null && f1Var.c >= i7) {
                f1Var.n(i10, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override // v4.k1
    public View d0(int i7) {
        return ((p0) this.a).q(i7);
    }

    public void e(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int z10 = recyclerView.e.z();
        int i18 = -1;
        if (i7 < i10) {
            i12 = i7;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i7;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < z10; i19++) {
            f1 U = RecyclerView.U(recyclerView.e.y(i19));
            if (U != null && (i17 = U.c) >= i12 && i17 <= i11) {
                if (i17 == i7) {
                    U.n(i10 - i7, false);
                } else {
                    U.n(i13, false);
                }
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i7 < i10) {
            i15 = i7;
            i14 = i10;
        } else {
            i14 = i7;
            i15 = i10;
            i18 = 1;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            f1 f1Var = (f1) arrayList.get(i20);
            if (f1Var != null && (i16 = f1Var.c) >= i15 && i16 <= i14) {
                if (i16 == i7) {
                    f1Var.n(i10 - i7, false);
                } else {
                    f1Var.n(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override // v4.k1
    public int f0(View view) {
        return p0.v(view) + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).bottomMargin;
    }

    @Override // org.telegram.ui.Components.z51
    public void invalidate() {
        ((wi.h) this.a).m.invalidate();
    }

    @Override // v4.k1
    public int z() {
        return ((p0) this.a).G();
    }
}
