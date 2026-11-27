// default package

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class p09 implements dc4 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public o09 b;

    public p09(File file) {
        this.a = file;
    }

    @Override // dc4
    public final void a() {
        jn2.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // dc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b() {
        df0 df0Var;
        byte[] bArr;
        File file = this.a;
        if (file.exists()) {
            if (this.b == null) {
                try {
                    this.b = new o09(file);
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
                }
            }
            o09 o09Var = this.b;
            if (o09Var != null) {
                int[] iArr = {0};
                int i = 16;
                if (o09Var.c != 0) {
                    l09 l09Var = o09Var.e;
                    int i2 = l09Var.b;
                    int i3 = o09Var.d.b;
                    int i4 = l09Var.c;
                    i = i2 >= i3 ? 16 + (i2 - i3) + 4 + i4 : (((i2 + 4) + i4) + o09Var.b) - i3;
                }
                byte[] bArr2 = new byte[i];
                try {
                    o09Var.a(new ym4(bArr2, iArr, (byte) 18));
                } catch (IOException e2) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e2);
                }
                df0Var = new df0(iArr[0], bArr2);
                if (df0Var != null) {
                    bArr = null;
                } else {
                    int i5 = df0Var.b;
                    bArr = new byte[i5];
                    System.arraycopy(df0Var.a, 0, bArr, 0, i5);
                }
                if (bArr == null) {
                    return new String(bArr, c);
                }
                return null;
            }
        }
        df0Var = null;
        if (df0Var != null) {
        }
        if (bArr == null) {
        }
    }
}
