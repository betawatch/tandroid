package pg;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.HashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class f1 {
    public int a;
    public HashMap b;

    public static void a(int i10, int i11) {
        GLES20.glUniform4f(i10, Color.red(i11) / 255.0f, Color.green(i11) / 255.0f, Color.blue(i11) / 255.0f, Color.alpha(i11) / 255.0f);
    }

    public static b2.q0 b(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0 && BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        int i11 = iArr[0];
        b2.q0 q0Var = new b2.q0();
        q0Var.a = glCreateShader;
        q0Var.b = i11;
        return q0Var;
    }

    public static void c(int i10, int i11, int i12) {
        if (i10 != 0) {
            GLES20.glDeleteShader(i10);
        }
        if (i11 != 0) {
            GLES20.glDeleteShader(i11);
        }
        if (i12 != 0) {
            GLES20.glDeleteProgram(i10);
        }
    }

    public final int d(String str) {
        return ((Integer) this.b.get(str)).intValue();
    }
}
