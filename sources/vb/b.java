package vb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import mb.j;
import p6.m;
import z7.j1;
import z7.k2;
import z7.l0;
import z7.l3;
import z7.m4;
import z7.n6;
import z7.x;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements a {
    public final Context a;
    public final n6 b;
    public final String c;
    public boolean d;
    public l0 e;

    public b(Context context, ub.a aVar) {
        this.a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.b = new n6(1, -1, aVar.a, 1);
        m6.e.b.getClass();
        this.c = m6.e.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    @Override // vb.a
    public final ArrayList a(rb.a aVar) {
        Bitmap createBitmap;
        if (this.e == null) {
            zzb();
        }
        if (this.e == null) {
            throw new ib.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        int i3 = aVar.e;
        if (i3 != -1) {
            if (i3 == 17) {
                m.g(null);
                throw null;
            }
            if (i3 == 35) {
                m.g(null);
                throw null;
            }
            if (i3 != 842094169) {
                throw new ib.a("Unsupported image format", 13);
            }
            m.g(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        m.g(bitmap);
        int i10 = aVar.d;
        int i11 = aVar.b;
        int i12 = aVar.c;
        if (i10 == 0) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        } else {
            Matrix matrix = new Matrix();
            matrix.postRotate(i10);
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
        }
        try {
            l0 l0Var = this.e;
            m.g(l0Var);
            z6.b bVar = new z6.b(createBitmap);
            Parcel P0 = l0Var.P0();
            int i13 = x.a;
            P0.writeStrongBinder(bVar);
            P0.writeInt(1);
            int s6 = j8.a.s(P0, 20293);
            j8.a.r(P0, 2, 4);
            P0.writeInt(-1);
            j8.a.t(P0, s6);
            Parcel R0 = l0Var.R0(P0, 1);
            m4[] m4VarArr = (m4[]) R0.createTypedArray(m4.CREATOR);
            R0.recycle();
            ArrayList arrayList = new ArrayList();
            for (m4 m4Var : m4VarArr) {
                arrayList.add(new tb.a(m4Var.c, m4Var.d, m4Var.b, m4Var.a));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new ib.a("Failed to run legacy image labeler.", e10);
        }
    }

    @Override // vb.a
    public final void zzb() {
        l3 j1Var;
        String str = this.c;
        Context context = this.a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = a7.f.c(context, a7.f.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i3 = k2.b;
            if (b10 == null) {
                j1Var = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                j1Var = queryLocalInterface instanceof l3 ? (l3) queryLocalInterface : new j1(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 11);
            }
            l0 X0 = ((j1) j1Var).X0(new z6.b(context), this.b);
            this.e = X0;
            if (X0 != null || this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        } catch (a7.b e10) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new ib.a("Failed to load deprecated vision dynamite module.", e10);
            }
            if (this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        } catch (RemoteException e11) {
            throw new ib.a("Failed to create legacy image labeler.", e11);
        }
    }

    @Override // vb.a
    public final void zzc() {
        l0 l0Var = this.e;
        if (l0Var != null) {
            try {
                l0Var.T0(l0Var.P0(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.e = null;
        }
    }
}
