package x9;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k implements c {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public j b;

    public k(File file) {
        this.a = file;
    }

    @Override // x9.c
    public final void b() {
        w9.h.c(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    @Override // x9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e() {
        hc.a aVar;
        byte[] bArr;
        File file = this.a;
        if (file.exists()) {
            if (this.b == null) {
                try {
                    this.b = new j(file);
                } catch (IOException e7) {
                    Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e7);
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
                aVar = new hc.a(bArr2, iArr[0]);
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
