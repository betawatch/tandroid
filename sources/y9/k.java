package y9;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k implements c {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public j b;

    public k(File file) {
        this.a = file;
    }

    @Override // y9.c
    public final void a() {
        x9.h.c(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    @Override // y9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e() {
        ac.b bVar;
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
                } catch (IOException e7) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e7);
                }
                bVar = new ac.b(bArr2, iArr[0]);
                if (bVar != null) {
                    bArr = null;
                } else {
                    int i14 = bVar.b;
                    bArr = new byte[i14];
                    System.arraycopy(bVar.a, 0, bArr, 0, i14);
                }
                if (bArr == null) {
                    return new String(bArr, c);
                }
                return null;
            }
        }
        bVar = null;
        if (bVar != null) {
        }
        if (bArr == null) {
        }
    }
}
