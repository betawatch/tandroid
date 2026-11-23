package p4;

import a8.ma;
import android.os.Bundle;
import android.os.Parcel;
import c8.ib;
import c8.lb;
import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class y0 implements u {
    public final l a;
    public final int b;

    public y0(l lVar, int i7) {
        this.a = lVar;
        this.b = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // p4.u
    public final void a(int i7, f1 f1Var, e2.y0 y0Var, boolean z10, boolean z11) {
        Parcel obtain;
        int i10 = this.b;
        ma.p(i10 != 0);
        ?? r32 = (z10 || !y0Var.a(17)) ? 1 : 0;
        boolean z12 = z11 || !y0Var.a(30);
        l lVar = this.a;
        if (i10 < 2) {
            Bundle f10 = f1Var.e(y0Var, z10, true).f(i10);
            k kVar = (k) lVar;
            kVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i7);
                ib.a(obtain, f10);
                obtain.writeInt(r32);
                kVar.a.transact(3007, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f11 = f1Var.e(y0Var, z10, z11).f(i10);
        Bundle bundle = new Bundle();
        bundle.putBoolean(e1.a, r32);
        bundle.putBoolean(e1.b, z12);
        k kVar2 = (k) lVar;
        kVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, f11);
            ib.a(obtain, bundle);
            kVar2.a.transact(3013, obtain, null, 1);
        } finally {
        }
    }

    @Override // p4.u
    public final void b(int i7, m1 m1Var, boolean z10, boolean z11, int i10) {
        Bundle b10 = m1Var.a(z10, z11).b(i10);
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, b10);
            kVar.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // p4.u
    public final void c(int i7) {
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            kVar.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // p4.u
    public final void d(int i7, int i10, int i11) {
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            kVar.a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // p4.u
    public final void e(int i7, e2.y0 y0Var) {
        Bundle b10 = y0Var.b();
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, b10);
            kVar.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != y0.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((y0) obj).a.asBinder());
    }

    @Override // p4.u
    public final void f(int i7, n1 n1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(n1.e, n1Var.a);
        bundle.putBundle(n1.f, n1Var.b);
        bundle.putLong(n1.g, n1Var.c);
        l1 l1Var = n1Var.d;
        if (l1Var != null) {
            bundle.putBundle(n1.h, l1Var.a());
        }
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, bundle);
            kVar.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // p4.u
    public final void g() {
        lb.a(this.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // p4.u
    public final void i(int i7, o oVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(o.d, oVar.a);
        bundle.putLong(o.e, oVar.b);
        bundle.putBundle(o.g, oVar.c.a());
        bundle.putInt(o.f, 4);
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, bundle);
            kVar.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // p4.u
    public final void j(int i7, j1 j1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a10 = j1Var.a();
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, a10);
            ib.a(obtain, bundle);
            kVar.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
