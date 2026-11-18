package u8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.vision.e3;
import com.google.android.gms.internal.vision.g3;
import com.google.android.gms.internal.vision.u2;
import java.nio.ByteBuffer;
import org.telegram.ui.nd0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class n extends q {
    public final u2 b;

    public n(u2 u2Var) {
        super(7);
        this.b = u2Var;
    }

    @Override // com.google.android.gms.common.api.q
    public final void X0() {
        super.X0();
        this.b.l();
    }

    public final SparseArray e1(nd0 nd0Var) {
        m[] mVarArr;
        if (nd0Var == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        g3 b10 = g3.b(nd0Var);
        Bitmap bitmap = (Bitmap) nd0Var.d;
        u2 u2Var = this.b;
        if (bitmap != null) {
            if (u2Var.k()) {
                try {
                    a7.b bVar = new a7.b(bitmap);
                    e3 e3Var = (e3) u2Var.m();
                    q6.m.h(e3Var);
                    Parcel h12 = e3Var.h1();
                    int i7 = com.google.android.gms.internal.vision.a.a;
                    h12.writeStrongBinder(bVar);
                    com.google.android.gms.internal.vision.a.a(h12, b10);
                    Parcel q12 = e3Var.q1(h12, 2);
                    m[] mVarArr2 = (m[]) q12.createTypedArray(m.CREATOR);
                    q12.recycle();
                    mVarArr = mVarArr2;
                } catch (RemoteException e10) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
                    mVarArr = new m[0];
                }
            } else {
                mVarArr = new m[0];
            }
            if (mVarArr == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else {
            ByteBuffer w10 = nd0Var.w();
            q6.m.h(w10);
            if (u2Var.k()) {
                try {
                    a7.b bVar2 = new a7.b(w10);
                    e3 e3Var2 = (e3) u2Var.m();
                    q6.m.h(e3Var2);
                    Parcel h13 = e3Var2.h1();
                    int i10 = com.google.android.gms.internal.vision.a.a;
                    h13.writeStrongBinder(bVar2);
                    com.google.android.gms.internal.vision.a.a(h13, b10);
                    Parcel q13 = e3Var2.q1(h13, 1);
                    m[] mVarArr3 = (m[]) q13.createTypedArray(m.CREATOR);
                    q13.recycle();
                    mVarArr = mVarArr3;
                } catch (RemoteException e11) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e11);
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
