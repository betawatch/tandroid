package s8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.d3;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n extends b2.h {
    public final t2 b;

    public n(t2 t2Var) {
        super(5);
        this.b = t2Var;
    }

    @Override // b2.h
    public final void X0() {
        super.X0();
        this.b.l();
    }

    public final SparseArray e1(k6.c cVar) {
        m[] mVarArr;
        if (cVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        f3 b10 = f3.b(cVar);
        Bitmap bitmap = (Bitmap) cVar.d;
        t2 t2Var = this.b;
        if (bitmap != null) {
            if (t2Var.k()) {
                try {
                    y6.b bVar = new y6.b(bitmap);
                    d3 d3Var = (d3) t2Var.m();
                    o6.l.h(d3Var);
                    Parcel F0 = d3Var.F0();
                    int i10 = com.google.android.gms.internal.vision.a.a;
                    F0.writeStrongBinder(bVar);
                    com.google.android.gms.internal.vision.a.a(F0, b10);
                    Parcel O0 = d3Var.O0(F0, 2);
                    m[] mVarArr2 = (m[]) O0.createTypedArray(m.CREATOR);
                    O0.recycle();
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
            ByteBuffer z10 = cVar.z();
            o6.l.h(z10);
            if (t2Var.k()) {
                try {
                    y6.b bVar2 = new y6.b(z10);
                    d3 d3Var2 = (d3) t2Var.m();
                    o6.l.h(d3Var2);
                    Parcel F02 = d3Var2.F0();
                    int i11 = com.google.android.gms.internal.vision.a.a;
                    F02.writeStrongBinder(bVar2);
                    com.google.android.gms.internal.vision.a.a(F02, b10);
                    Parcel O02 = d3Var2.O0(F02, 1);
                    m[] mVarArr3 = (m[]) O02.createTypedArray(m.CREATOR);
                    O02.recycle();
                    mVarArr = mVarArr3;
                } catch (RemoteException e10) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
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
