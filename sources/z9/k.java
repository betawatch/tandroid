package z9;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k implements c {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public j b;

    public k(File file) {
        this.a = file;
    }

    @Override // z9.c
    public final void a() {
        y9.h.c(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    @Override // z9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String y() {
        jc.a aVar;
        byte[] bArr;
        File file = this.a;
        if (file.exists()) {
            if (this.b == null) {
                try {
                    this.b = new j(file);
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
                }
            }
            j jVar = this.b;
            if (jVar != null) {
                int[] iArr = {0};
                int i10 = 16;
                if (jVar.c != 0) {
                    g gVar = jVar.e;
                    int i11 = gVar.a;
                    int i12 = gVar.b;
                    int i13 = jVar.d.a;
                    i10 = i11 >= i13 ? 16 + (i11 - i13) + 4 + i12 : (((i11 + 4) + i12) + jVar.b) - i13;
                }
                byte[] bArr2 = new byte[i10];
                try {
                    jVar.a(new e(bArr2, iArr));
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e10);
                }
                aVar = new jc.a(bArr2, iArr[0]);
                if (aVar != null) {
                    bArr = null;
                } else {
                    int i14 = aVar.b;
                    bArr = new byte[i14];
                    System.arraycopy(aVar.a, 0, bArr, 0, i14);
                }
                if (bArr == null) {
                    return new String(bArr, c);
                }
                return null;
            }
        }
        aVar = null;
        if (aVar != null) {
        }
        if (bArr == null) {
        }
    }
}
