package r8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.e3;
import com.google.android.gms.internal.vision.g3;
import com.google.android.gms.internal.vision.u2;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class n extends b2.g {
    public final u2 b;

    public n(u2 u2Var) {
        super(3);
        this.b = u2Var;
    }

    @Override // b2.g
    public final void U0() {
        super.U0();
        this.b.l();
    }

    public final SparseArray Z0(la.h hVar) {
        m[] mVarArr;
        if (hVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        g3 b10 = g3.b(hVar);
        Bitmap bitmap = (Bitmap) hVar.d;
        u2 u2Var = this.b;
        if (bitmap != null) {
            if (u2Var.k()) {
                try {
                    x6.b bVar = new x6.b(bitmap);
                    e3 e3Var = (e3) u2Var.m();
                    n6.l.h(e3Var);
                    Parcel G0 = e3Var.G0();
                    int i10 = com.google.android.gms.internal.vision.a.a;
                    G0.writeStrongBinder(bVar);
                    com.google.android.gms.internal.vision.a.a(G0, b10);
                    Parcel P0 = e3Var.P0(G0, 2);
                    m[] mVarArr2 = (m[]) P0.createTypedArray(m.CREATOR);
                    P0.recycle();
                    mVarArr = mVarArr2;
                } catch (RemoteException e) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                    mVarArr = new m[0];
                }
            } else {
                mVarArr = new m[0];
            }
            if (mVarArr == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else {
            ByteBuffer I = hVar.I();
            n6.l.h(I);
            if (u2Var.k()) {
                try {
                    x6.b bVar2 = new x6.b(I);
                    e3 e3Var2 = (e3) u2Var.m();
                    n6.l.h(e3Var2);
                    Parcel G02 = e3Var2.G0();
                    int i11 = com.google.android.gms.internal.vision.a.a;
                    G02.writeStrongBinder(bVar2);
                    com.google.android.gms.internal.vision.a.a(G02, b10);
                    Parcel P02 = e3Var2.P0(G02, 1);
                    m[] mVarArr3 = (m[]) P02.createTypedArray(m.CREATOR);
                    P02.recycle();
                    mVarArr = mVarArr3;
                } catch (RemoteException e7) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e7);
                    mVarArr = new m[0];
                }
            } else {
                mVarArr = new m[0];
            }
        }
        SparseArray sparseArray = new SparseArray(mVarArr.length);
        for (m mVar : mVarArr) {
            sparseArray.append(mVar.b.hashCode(), mVar);
        }
        return sparseArray;
    }
}
