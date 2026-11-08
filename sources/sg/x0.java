package sg;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class x0 {
    public int a;
    public HashMap b;

    public static void a(int i7, int i10) {
        GLES20.glUniform4f(i7, Color.red(i10) / 255.0f, Color.green(i10) / 255.0f, Color.blue(i10) / 255.0f, Color.alpha(i10) / 255.0f);
    }

    public static e2.r0 b(int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0 && r2.a) {
            a8.d(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        int i10 = iArr[0];
        e2.r0 r0Var = new e2.r0();
        r0Var.a = glCreateShader;
        r0Var.b = i10;
        return r0Var;
    }

    public static void c(int i7, int i10, int i11) {
        if (i7 != 0) {
            GLES20.glDeleteShader(i7);
        }
        if (i10 != 0) {
            GLES20.glDeleteShader(i10);
        }
        if (i11 != 0) {
            GLES20.glDeleteProgram(i7);
        }
    }

    public final int d(String str) {
        return ((Integer) this.b.get(str)).intValue();
    }
}
