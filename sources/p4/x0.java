package p4;

import a8.ia;
import android.os.Bundle;
import android.os.Parcel;
import c8.bb;
import c8.ya;
import j$.util.Objects;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class x0 implements u {
    public final l a;
    public final int b;

    public x0(l lVar, int i7) {
        this.a = lVar;
        this.b = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // p4.u
    public final void a(int i7, e1 e1Var, e2.y0 y0Var, boolean z9, boolean z10) {
        Parcel obtain;
        int i10 = this.b;
        ia.p(i10 != 0);
        ?? r32 = (z9 || !y0Var.a(17)) ? 1 : 0;
        boolean z11 = z10 || !y0Var.a(30);
        l lVar = this.a;
        if (i10 < 2) {
            Bundle f10 = e1Var.e(y0Var, z9, true).f(i10);
            k kVar = (k) lVar;
            kVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i7);
                ya.a(obtain, f10);
                obtain.writeInt(r32);
                kVar.a.transact(3007, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f11 = e1Var.e(y0Var, z9, z10).f(i10);
        Bundle bundle = new Bundle();
        bundle.putBoolean(d1.a, r32);
        bundle.putBoolean(d1.b, z11);
        k kVar2 = (k) lVar;
        kVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ya.a(obtain, f11);
            ya.a(obtain, bundle);
            kVar2.a.transact(3013, obtain, null, 1);
        } finally {
        }
    }

    @Override // p4.u
    public final void b(int i7, l1 l1Var, boolean z9, boolean z10, int i10) {
        Bundle b10 = l1Var.a(z9, z10).b(i10);
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ya.a(obtain, b10);
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
            ya.a(obtain, b10);
            kVar.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != x0.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((x0) obj).a.asBinder());
    }

    @Override // p4.u
    public final void f(int i7, m1 m1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(m1.e, m1Var.a);
        bundle.putBundle(m1.f, m1Var.b);
        bundle.putLong(m1.g, m1Var.c);
        k1 k1Var = m1Var.d;
        if (k1Var != null) {
            bundle.putBundle(m1.h, k1Var.a());
        }
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ya.a(obtain, bundle);
            kVar.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // p4.u
    public final void g() {
        bb.a(this.a);
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
            ya.a(obtain, bundle);
            kVar.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // p4.u
    public final void j(int i7, i1 i1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a10 = i1Var.a();
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ya.a(obtain, a10);
            ya.a(obtain, bundle);
            kVar.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
