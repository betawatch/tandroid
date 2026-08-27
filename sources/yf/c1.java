package yf;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.HashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c1 {
    public int a;
    public HashMap b;

    public static void a(int i10, int i11) {
        GLES20.glUniform4f(i10, Color.red(i11) / 255.0f, Color.green(i11) / 255.0f, Color.blue(i11) / 255.0f, Color.alpha(i11) / 255.0f);
    }

    public static d5.p b(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0 && BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        int i11 = iArr[0];
        d5.p pVar = new d5.p();
        pVar.a = glCreateShader;
        pVar.b = i11;
        return pVar;
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
