package zb;

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
import n6.l;
import qb.j;
import w7.e0;
import x7.j1;
import x7.k2;
import x7.l3;
import x7.m0;
import x7.m4;
import x7.n6;
import x7.y;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class c implements b {
    public final Context a;
    public final n6 b;
    public final String c;
    public boolean d;
    public m0 e;

    public c(Context context, yb.a aVar) {
        this.a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.b = new n6(1, -1, aVar.a, 1);
        k6.e.b.getClass();
        this.c = k6.e.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    @Override // zb.b
    public final ArrayList a(vb.a aVar) {
        Bitmap createBitmap;
        if (this.e == null) {
            zzb();
        }
        if (this.e == null) {
            throw new mb.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        int i10 = aVar.e;
        if (i10 != -1) {
            if (i10 == 17) {
                l.h(null);
                throw null;
            }
            if (i10 == 35) {
                l.h(null);
                throw null;
            }
            if (i10 != 842094169) {
                throw new mb.a("Unsupported image format", 13);
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        l.h(bitmap);
        int i11 = aVar.d;
        int i12 = aVar.b;
        int i13 = aVar.c;
        if (i11 == 0) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
        } else {
            Matrix matrix = new Matrix();
            matrix.postRotate(i11);
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
        }
        try {
            m0 m0Var = this.e;
            l.h(m0Var);
            x6.b bVar = new x6.b(createBitmap);
            Parcel O0 = m0Var.O0();
            int i14 = y.a;
            O0.writeStrongBinder(bVar);
            O0.writeInt(1);
            int q6 = e0.q(O0, 20293);
            e0.s(O0, 2, 4);
            O0.writeInt(-1);
            e0.r(O0, q6);
            Parcel Q0 = m0Var.Q0(O0, 1);
            m4[] m4VarArr = (m4[]) Q0.createTypedArray(m4.CREATOR);
            Q0.recycle();
            ArrayList arrayList = new ArrayList();
            for (m4 m4Var : m4VarArr) {
                arrayList.add(new xb.a(m4Var.c, m4Var.d, m4Var.b, m4Var.a));
            }
            return arrayList;
        } catch (RemoteException e7) {
            throw new mb.a("Failed to run legacy image labeler.", e7);
        }
    }

    @Override // zb.b
    public final void zzb() {
        l3 j1Var;
        String str = this.c;
        Context context = this.a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = y6.e.c(context, y6.e.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i10 = k2.b;
            if (b10 == null) {
                j1Var = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                j1Var = queryLocalInterface instanceof l3 ? (l3) queryLocalInterface : new j1(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 10);
            }
            m0 W0 = ((j1) j1Var).W0(new x6.b(context), this.b);
            this.e = W0;
            if (W0 != null || this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        } catch (RemoteException e7) {
            throw new mb.a("Failed to create legacy image labeler.", e7);
        } catch (y6.b e10) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new mb.a("Failed to load deprecated vision dynamite module.", e10);
            }
            if (this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        }
    }

    @Override // zb.b
    public final void zzc() {
        m0 m0Var = this.e;
        if (m0Var != null) {
            try {
                m0Var.S0(m0Var.O0(), 2);
            } catch (RemoteException e7) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e7);
            }
            this.e = null;
        }
    }
}
