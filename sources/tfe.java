// default package

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.AtomicFile;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class tfe {
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:5|(9:7|8|(2:11|9)|12|13|(1:15)|16|17|(2:21|22)))|(4:(4:69|70|(1:72)|40)|31|32|(4:(1:35)|(1:37)|(1:39)|40)(2:42|43))|26|27|28|29|(1:(1:49))) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0123, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0120, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Context context, String str, String str2) {
        Throwable th;
        int i;
        RuntimeException runtimeException;
        Throwable th2;
        int a;
        int glCreateProgram = GLES20.glCreateProgram();
        String glGetString = GLES20.glGetString(7938);
        int i2 = 0;
        AtomicFile atomicFile = null;
        if (glGetString != null && glGetString.startsWith("OpenGL ES 3.")) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(34814, iArr, 0);
            if (iArr[0] != 0) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    String[] strArr = {"gl-program-v1", "diamond", str, str2, "position", "normal", GLES20.glGetString(7936), GLES20.glGetString(7937), GLES20.glGetString(7938), GLES20.glGetString(35724)};
                    for (int i3 = 0; i3 < 10; i3++) {
                        messageDigest.update(strArr[i3].getBytes(StandardCharsets.UTF_8));
                        messageDigest.update((byte) 0);
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : messageDigest.digest()) {
                        sb.append(Character.forDigit((b >> 4) & 15, 16));
                        sb.append(Character.forDigit(b & 15, 16));
                    }
                    File file = new File(context.getCodeCacheDir(), "gl-programs");
                    if (file.isDirectory() || file.mkdirs()) {
                        atomicFile = new AtomicFile(new File(file, ((Object) sb) + ".bin"));
                    }
                } catch (Exception unused) {
                }
            }
        }
        try {
            if (atomicFile != null) {
                try {
                    if (!qke.b(glCreateProgram, atomicFile)) {
                        GLES30.glProgramParameteri(glCreateProgram, 33367, 1);
                    }
                    return glCreateProgram;
                } catch (RuntimeException e) {
                    runtimeException = e;
                    i = 0;
                    try {
                        GLES20.glDeleteProgram(glCreateProgram);
                        throw runtimeException;
                    } catch (Throwable th3) {
                        th2 = th3;
                        th = th2;
                        if (i2 != 0) {
                            GLES20.glDeleteShader(i2);
                        }
                        if (i == 0) {
                            throw th;
                        }
                        GLES20.glDeleteShader(i);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i = 0;
                    if (i2 != 0) {
                    }
                    if (i == 0) {
                    }
                }
            }
            GLES20.glAttachShader(glCreateProgram, a);
            GLES20.glAttachShader(glCreateProgram, i);
            GLES20.glBindAttribLocation(glCreateProgram, 0, "position");
            GLES20.glBindAttribLocation(glCreateProgram, 1, "normal");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
            if (iArr2[0] == 0) {
                throw new IllegalStateException(GLES20.glGetProgramInfoLog(glCreateProgram));
            }
            if (atomicFile != null) {
                qke.c(glCreateProgram, atomicFile);
            }
            if (a != 0) {
                GLES20.glDeleteShader(a);
            }
            if (i != 0) {
                GLES20.glDeleteShader(i);
            }
            return glCreateProgram;
        } catch (RuntimeException e2) {
            e = e2;
            i2 = a;
            runtimeException = e;
            GLES20.glDeleteProgram(glCreateProgram);
            throw runtimeException;
        } catch (Throwable th5) {
            th2 = th5;
            i2 = a;
            th = th2;
            if (i2 != 0) {
            }
            if (i == 0) {
            }
        }
        a = qke.a(35633, str);
        i = qke.a(35632, str2);
    }
}
