package t8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b {
    public int a;
    public int b;
    public boolean c;
    public final Object d;

    public b(Context context) {
        this.a = 0;
        this.c = true;
        this.b = 0;
        this.d = context;
    }

    public c a() {
        boolean z10;
        u8.b bVar = new u8.b();
        int i10 = this.b;
        bVar.a = i10;
        int i11 = this.a;
        bVar.b = i11;
        boolean z11 = false;
        bVar.c = 0;
        bVar.d = false;
        bVar.e = this.c;
        bVar.f = -1.0f;
        if (i10 == 2 || i11 != 2) {
            z10 = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        }
        if (bVar.b == 2 && bVar.c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new c(new u2((Context) this.d, bVar));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.a = i10;
            return;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Invalid landmark type: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void c(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.b = i10;
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Invalid mode: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public b(df.a... aVarArr) {
        this.a = -1;
        this.b = -1;
        this.c = false;
        this.d = aVarArr;
    }
}
