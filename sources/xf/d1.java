package xf;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.HashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d1 {
    public int a;
    public HashMap b;

    public static void a(int i9, int i10) {
        GLES20.glUniform4f(i9, Color.red(i10) / 255.0f, Color.green(i10) / 255.0f, Color.blue(i10) / 255.0f, Color.alpha(i10) / 255.0f);
    }

    public static d5.p b(int i9, String str) {
        int glCreateShader = GLES20.glCreateShader(i9);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0 && BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        int i10 = iArr[0];
        d5.p pVar = new d5.p();
        pVar.a = glCreateShader;
        pVar.b = i10;
        return pVar;
    }

    public static void c(int i9, int i10, int i11) {
        if (i9 != 0) {
            GLES20.glDeleteShader(i9);
        }
        if (i10 != 0) {
            GLES20.glDeleteShader(i10);
        }
        if (i11 != 0) {
            GLES20.glDeleteProgram(i9);
        }
    }

    public final int d(String str) {
        return ((Integer) this.b.get(str)).intValue();
    }
}
