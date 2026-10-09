package w7;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.AtomicFile;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class m7 {
    public static int a(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(glGetShaderInfoLog);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:5|(9:7|8|(2:11|9)|12|13|(1:15)|16|17|(2:22|23)(1:21)))|(4:(3:70|71|(2:73|43))|34|35|(4:(1:38)|(1:40)|(1:42)|43)(2:45|46))|(1:28)|29|30|31|32|(2:(0)|(1:52))) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0131, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Context context, String str, String str2, String str3, String str4, String str5) {
        int i10;
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
                    String[] strArr = {"gl-program-v1", str, str2, str3, str4, str5, GLES20.glGetString(7936), GLES20.glGetString(7937), GLES20.glGetString(7938), GLES20.glGetString(35724)};
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
                    if (c(glCreateProgram, atomicFile)) {
                        return glCreateProgram;
                    }
                } catch (RuntimeException e7) {
                    e = e7;
                    i10 = 0;
                    try {
                        GLES20.glDeleteProgram(glCreateProgram);
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        if (i11 != 0) {
                            GLES20.glDeleteShader(i11);
                        }
                        if (i10 != 0) {
                            GLES20.glDeleteShader(i10);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i10 = 0;
                    if (i11 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    throw th;
                }
            }
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(glCreateProgram, i10);
            GLES20.glBindAttribLocation(glCreateProgram, 0, str4);
            GLES20.glBindAttribLocation(glCreateProgram, 1, str5);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
            if (iArr2[0] == 0) {
                throw new IllegalStateException(GLES20.glGetProgramInfoLog(glCreateProgram));
            }
            if (atomicFile != null) {
                d(glCreateProgram, atomicFile);
            }
            if (a2 != 0) {
                GLES20.glDeleteShader(a2);
            }
            if (i10 != 0) {
                GLES20.glDeleteShader(i10);
            }
            return glCreateProgram;
        } catch (RuntimeException e10) {
            e = e10;
            i11 = a2;
            GLES20.glDeleteProgram(glCreateProgram);
            throw e;
        } catch (Throwable th4) {
            th = th4;
            i11 = a2;
            if (i11 != 0) {
            }
            if (i10 != 0) {
            }
            throw th;
        }
        if (atomicFile != null) {
            GLES30.glProgramParameteri(glCreateProgram, 33367, 1);
        }
        a2 = a(35633, str2);
        i10 = a(35632, str3);
    }

    public static boolean c(int i10, AtomicFile atomicFile) {
        DataInputStream dataInputStream;
        if (!atomicFile.getBaseFile().isFile()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(atomicFile.openRead());
            try {
            } finally {
            }
        } catch (Exception unused) {
        }
        if (dataInputStream.readInt() != 1145524273) {
            throw new IllegalStateException("Invalid program cache");
        }
        int readInt = dataInputStream.readInt();
        int readInt2 = dataInputStream.readInt();
        if (readInt2 <= 0 || readInt2 > 16777216) {
            throw new IllegalStateException("Invalid binary length");
        }
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(34814, iArr, 0);
        int i11 = iArr[0];
        int[] iArr2 = new int[i11];
        GLES20.glGetIntegerv(34815, iArr2, 0);
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            z10 |= iArr2[i12] == readInt;
        }
        if (!z10) {
            throw new IllegalStateException("Unsupported binary format");
        }
        byte[] bArr = new byte[readInt2];
        dataInputStream.readFully(bArr);
        if (dataInputStream.read() != -1) {
            throw new IllegalStateException("Invalid binary size");
        }
        ByteBuffer order = ByteBuffer.allocateDirect(readInt2).order(ByteOrder.nativeOrder());
        order.put(bArr).position(0);
        GLES30.glProgramBinary(i10, readInt, order, readInt2);
        int glGetError = GLES20.glGetError();
        GLES20.glGetProgramiv(i10, 35714, iArr, 0);
        if (glGetError == 0 && iArr[0] != 0) {
            dataInputStream.close();
            return true;
        }
        dataInputStream.close();
        atomicFile.delete();
        return false;
    }

    public static void d(int i10, AtomicFile atomicFile) {
        FileOutputStream fileOutputStream = null;
        try {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(i10, 34625, iArr, 0);
            int i11 = iArr[0];
            if (i11 > 0 && i11 <= 16777216) {
                ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                GLES30.glGetProgramBinary(i10, iArr[0], iArr, 0, iArr2, 0, order);
                int i12 = iArr[0];
                if (i12 <= 0) {
                    return;
                }
                byte[] bArr = new byte[i12];
                order.position(0);
                order.get(bArr);
                fileOutputStream = atomicFile.startWrite();
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                dataOutputStream.writeInt(1145524273);
                dataOutputStream.writeInt(iArr2[0]);
                dataOutputStream.writeInt(i12);
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                atomicFile.finishWrite(fileOutputStream);
            }
        } catch (Exception unused) {
            if (fileOutputStream != null) {
                atomicFile.failWrite(fileOutputStream);
            }
        }
    }
}
