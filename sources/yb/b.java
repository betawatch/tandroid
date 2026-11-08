package yb;

import a8.g0;
import a8.v1;
import a8.w2;
import a8.x3;
import a8.y4;
import a8.y6;
import a8.z0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c8.xb;
import java.util.ArrayList;
import java.util.Locale;
import pb.j;
import q6.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b implements a {
    public final Context a;
    public final y6 b;
    public final String c;
    public boolean d;
    public z0 e;

    public b(Context context, xb.a aVar) {
        this.a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.b = new y6(1, -1, aVar.a, 1);
        n6.e.b.getClass();
        this.c = n6.e.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    @Override // yb.a
    public final ArrayList a(ub.a aVar) {
        Bitmap createBitmap;
        if (this.e == null) {
            zzb();
        }
        if (this.e == null) {
            throw new lb.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        int i7 = aVar.e;
        if (i7 != -1) {
            if (i7 == 17) {
                m.g(null);
                throw null;
            }
            if (i7 == 35) {
                m.g(null);
                throw null;
            }
            if (i7 != 842094169) {
                throw new lb.a("Unsupported image format", 13);
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
            z0 z0Var = this.e;
            m.g(z0Var);
            a7.b bVar = new a7.b(createBitmap);
            Parcel p12 = z0Var.p1();
            int i13 = g0.a;
            p12.writeStrongBinder(bVar);
            p12.writeInt(1);
            int r10 = xb.r(p12, 20293);
            xb.q(p12, 2, 4);
            p12.writeInt(-1);
            xb.s(p12, r10);
            Parcel r12 = z0Var.r1(p12, 1);
            y4[] y4VarArr = (y4[]) r12.createTypedArray(y4.CREATOR);
            r12.recycle();
            ArrayList arrayList = new ArrayList();
            for (y4 y4Var : y4VarArr) {
                arrayList.add(new wb.a(y4Var.c, y4Var.d, y4Var.b, y4Var.a));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new lb.a("Failed to run legacy image labeler.", e10);
        }
    }

    @Override // yb.a
    public final void zzb() {
        x3 v1Var;
        String str = this.c;
        Context context = this.a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = b7.f.c(context, b7.f.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i7 = w2.b;
            if (b10 == null) {
                v1Var = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                v1Var = queryLocalInterface instanceof x3 ? (x3) queryLocalInterface : new v1(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 0);
            }
            z0 x12 = ((v1) v1Var).x1(new a7.b(context), this.b);
            this.e = x12;
            if (x12 != null || this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        } catch (RemoteException e10) {
            throw new lb.a("Failed to create legacy image labeler.", e10);
        } catch (b7.b e11) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new lb.a("Failed to load deprecated vision dynamite module.", e11);
            }
            if (this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        }
    }

    @Override // yb.a
    public final void zzc() {
        z0 z0Var = this.e;
        if (z0Var != null) {
            try {
                z0Var.t1(z0Var.p1(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.e = null;
        }
    }
}
