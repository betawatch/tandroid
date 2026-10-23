package w7;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.AtomicFile;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class s7 {
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:5|(9:7|8|(2:11|9)|12|13|(1:15)|16|17|(2:22|23)(1:21)))|(4:(3:72|73|(2:75|43))|34|35|(4:(1:38)|(1:40)|(1:42)|43)(2:45|46))|(1:28)|29|30|31|32|(1:(1:52))) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0136, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Context context, String str, String str2) {
        Throwable th2;
        int i10;
        RuntimeException runtimeException;
        Throwable th3;
        int a2;
        int glCreateProgram = GLES20.glCreateProgram();
        String glGetString = GLES20.glGetString(7938);
        int i11 = 0;
        AtomicFile atomicFile = null;
        if (glGetString != null && glGetString.startsWith("OpenGL ES 3.")) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(34814, iArr, 0);
            if (iArr[0] != 0) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    String[] strArr = {"gl-program-v1", "diamond", str, str2, "position", "normal", GLES20.glGetString(7936), GLES20.glGetString(7937), GLES20.glGetString(7938), GLES20.glGetString(35724)};
                    for (int i12 = 0; i12 < 10; i12++) {
                        messageDigest.update(strArr[i12].getBytes(StandardCharsets.UTF_8));
                        messageDigest.update((byte) 0);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : messageDigest.digest()) {
                        sb2.append(Character.forDigit((b10 >> 4) & 15, 16));
                        sb2.append(Character.forDigit(b10 & 15, 16));
                    }
                    File file = new File(context.getCodeCacheDir(), "gl-programs");
                    if (file.isDirectory() || file.mkdirs()) {
                        atomicFile = new AtomicFile(new File(file, ((Object) sb2) + ".bin"));
                    }
                } catch (Exception unused) {
                }
            }
        }
        try {
            if (atomicFile != null) {
                try {
                    if (t7.b(glCreateProgram, atomicFile)) {
                        return glCreateProgram;
                    }
                } catch (RuntimeException e) {
                    runtimeException = e;
                    i10 = 0;
                    try {
                        GLES20.glDeleteProgram(glCreateProgram);
                        throw runtimeException;
                    } catch (Throwable th4) {
                        th3 = th4;
                        th2 = th3;
                        if (i11 != 0) {
                            GLES20.glDeleteShader(i11);
                        }
                        if (i10 == 0) {
                            throw th2;
                        }
                        GLES20.glDeleteShader(i10);
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    i10 = 0;
                    if (i11 != 0) {
                    }
                    if (i10 == 0) {
                    }
                }
            }
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(glCreateProgram, i10);
            GLES20.glBindAttribLocation(glCreateProgram, 0, "position");
            GLES20.glBindAttribLocation(glCreateProgram, 1, "normal");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
            if (iArr2[0] == 0) {
                throw new IllegalStateException(GLES20.glGetProgramInfoLog(glCreateProgram));
            }
            if (atomicFile != null) {
                t7.c(glCreateProgram, atomicFile);
            }
            if (a2 != 0) {
                GLES20.glDeleteShader(a2);
            }
            if (i10 != 0) {
                GLES20.glDeleteShader(i10);
            }
            return glCreateProgram;
        } catch (RuntimeException e7) {
            e = e7;
            i11 = a2;
            runtimeException = e;
            GLES20.glDeleteProgram(glCreateProgram);
            throw runtimeException;
        } catch (Throwable th6) {
            th3 = th6;
            i11 = a2;
            th2 = th3;
            if (i11 != 0) {
            }
            if (i10 == 0) {
            }
        }
        if (atomicFile != null) {
            GLES30.glProgramParameteri(glCreateProgram, 33367, 1);
        }
        a2 = t7.a(35633, str);
        i10 = t7.a(35632, str2);
    }
}
