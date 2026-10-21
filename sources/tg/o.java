package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.mk;
import org.telegram.ui.ActionBar.h6;
import w7.u7;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class o {
    public static final String[] e0 = {"models/star.binobj"};
    public static final String[] f0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] g0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
    public int E;
    public int F;
    public boolean J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final Bitmap Y;
    public Bitmap Z;
    public a a;
    public final int a0;
    public float b;
    public final int b0;
    public float c;
    public final int[] c0;
    public float d;
    public final int f;
    public final int g;
    public final int h;
    public final FloatBuffer[] i;
    public final FloatBuffer[] j;
    public final FloatBuffer[] k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public float x;
    public final int[] y;
    public float e = 1.0f;
    public float z = 0.0f;
    public float A = 1.0f;
    public float B = 2.0f;
    public float C = 0.13f;
    public float D = 1.0f;
    public float G = 0.2f;
    public int H = -1;
    public int I = -1;
    public float d0 = 0.0f;

    /* JADX WARN: Removed duplicated region for block: B:54:0x010e A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #2 {all -> 0x00d3, blocks: (B:34:0x00b7, B:36:0x00bc, B:38:0x00c4, B:40:0x00d7, B:42:0x00e1, B:46:0x00ed, B:48:0x00f5, B:51:0x00f9, B:52:0x00ff, B:54:0x010e, B:59:0x00e7), top: B:33:0x00b7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(Context context, int i10) {
        Bitmap bitmap;
        char c10;
        float f7;
        int i11;
        int i12;
        float[] fArr;
        float[] fArr2;
        DataInputStream dataInputStream;
        Throwable th2;
        float[] a2;
        float[] a10;
        float[] a11;
        int readInt;
        int i13;
        int i14;
        float f10;
        int i15;
        float f11;
        int i16;
        int i17;
        float f12 = 1.0f;
        this.b0 = i10;
        int i18 = 4;
        if (i10 == 4) {
            String glGetString = GLES20.glGetString(7938);
            if (glGetString == null || !glGetString.startsWith("OpenGL ES 3")) {
                throw new IllegalStateException("Diamond requires OpenGL ES 3");
            }
            this.a = new a(context, 4);
            this.a0 = 1;
            return;
        }
        int i19 = 3;
        int i20 = 2;
        int i21 = 0;
        String[] strArr = i10 == 1 ? f0 : i10 == 3 ? g0 : (i10 == 0 || i10 == 2) ? e0 : new String[0];
        int length = strArr.length;
        this.a0 = length;
        this.i = new FloatBuffer[length];
        this.j = new FloatBuffer[length];
        this.k = new FloatBuffer[length];
        this.y = new int[length];
        int i22 = 0;
        while (true) {
            Bitmap bitmap2 = null;
            r14 = null;
            r14 = null;
            r14 = null;
            float[] fArr3 = null;
            bitmap2 = null;
            if (i22 >= this.a0) {
                int i23 = i20;
                this.Y = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.Y);
                Paint paint = new Paint();
                float[] fArr4 = new float[i18];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 0.5f;
                fArr4[2] = 0.78f;
                fArr4[3] = 1.0f;
                paint.setShader(new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{h6.x0(null, h6.Lj, false), h6.x0(null, h6.Mj, false), h6.x0(null, h6.Nj, false), h6.x0(null, h6.Oj, false)}, fArr4, Shader.TileMode.CLAMP));
                canvas.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint);
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(3553, iArr[0]);
                GLES20.glTexParameteri(3553, 10241, 9728);
                GLES20.glTexParameteri(3553, 10240, 9728);
                GLUtils.texImage2D(3553, 0, this.Y, 0);
                this.u = iArr[0];
                int[] iArr2 = new int[1];
                String str = (i10 == 0 || i10 == i23) ? "shaders/fragment4.glsl" : "shaders/fragment3.glsl";
                int a12 = g.a(35633, b(a(context, "shaders/vertex2.glsl")));
                int a13 = g.a(35632, b(a(context, str)));
                int glCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(glCreateProgram, a12);
                GLES20.glAttachShader(glCreateProgram, a13);
                GLES20.glLinkProgram(glCreateProgram);
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                this.f = glCreateProgram;
                FloatBuffer[] floatBufferArr = this.i;
                FloatBuffer[] floatBufferArr2 = this.k;
                FloatBuffer[] floatBufferArr3 = this.j;
                GLES20.glUseProgram(glCreateProgram);
                this.p = GLES20.glGetAttribLocation(glCreateProgram, "vPosition");
                this.q = GLES20.glGetAttribLocation(glCreateProgram, "a_TexCoordinate");
                this.r = GLES20.glGetAttribLocation(glCreateProgram, "a_Normal");
                this.l = GLES20.glGetUniformLocation(glCreateProgram, "u_Texture");
                this.m = GLES20.glGetUniformLocation(glCreateProgram, "u_NormalMap");
                this.n = GLES20.glGetUniformLocation(glCreateProgram, "u_BackgroundTexture");
                this.s = GLES20.glGetUniformLocation(glCreateProgram, "f_xOffset");
                this.t = GLES20.glGetUniformLocation(glCreateProgram, "f_alpha");
                this.g = GLES20.glGetUniformLocation(glCreateProgram, "uMVPMatrix");
                this.h = GLES20.glGetUniformLocation(glCreateProgram, "world");
                this.v = GLES20.glGetUniformLocation(glCreateProgram, "white");
                this.w = GLES20.glGetUniformLocation(glCreateProgram, "golden");
                this.K = GLES20.glGetUniformLocation(glCreateProgram, "spec1");
                this.L = GLES20.glGetUniformLocation(glCreateProgram, "spec2");
                this.M = GLES20.glGetUniformLocation(glCreateProgram, "u_diffuse");
                this.N = GLES20.glGetUniformLocation(glCreateProgram, "gradientColor1");
                this.O = GLES20.glGetUniformLocation(glCreateProgram, "gradientColor2");
                this.Q = GLES20.glGetUniformLocation(glCreateProgram, "normalSpecColor");
                this.P = GLES20.glGetUniformLocation(glCreateProgram, "normalSpec");
                this.R = GLES20.glGetUniformLocation(glCreateProgram, "specColor");
                this.S = GLES20.glGetUniformLocation(glCreateProgram, "resolution");
                this.T = GLES20.glGetUniformLocation(glCreateProgram, "gradientPosition");
                this.U = GLES20.glGetUniformLocation(glCreateProgram, "modelIndex");
                this.V = GLES20.glGetUniformLocation(glCreateProgram, TeXSymbolParser.TYPE_ATTR);
                this.W = GLES20.glGetUniformLocation(glCreateProgram, "night");
                this.X = GLES20.glGetUniformLocation(glCreateProgram, "time");
                int i24 = this.a0;
                int i25 = i24 * 3;
                int[] iArr3 = new int[i25];
                this.c0 = iArr3;
                int i26 = 0;
                GLES20.glGenBuffers(i25, iArr3, 0);
                int i27 = 0;
                while (i27 < i24) {
                    int i28 = i27 * 3;
                    GLES20.glBindBuffer(34962, this.c0[i28]);
                    floatBufferArr3[i27].position(i26);
                    GLES20.glBufferData(34962, floatBufferArr3[i27].capacity() * 4, floatBufferArr3[i27], 35044);
                    GLES20.glEnableVertexAttribArray(this.q);
                    floatBufferArr3[i27].clear();
                    GLES20.glBindBuffer(34962, this.c0[i28 + 1]);
                    floatBufferArr2[i27].position(0);
                    GLES20.glBufferData(34962, floatBufferArr2[i27].capacity() * 4, floatBufferArr2[i27], 35044);
                    GLES20.glEnableVertexAttribArray(this.r);
                    floatBufferArr2[i27].clear();
                    GLES20.glBindBuffer(34962, this.c0[i28 + 2]);
                    floatBufferArr[i27].position(0);
                    GLES20.glBufferData(34962, floatBufferArr[i27].capacity() * 4, floatBufferArr[i27], 35044);
                    GLES20.glEnableVertexAttribArray(this.p);
                    floatBufferArr[i27].clear();
                    i27++;
                    i26 = 0;
                }
                int i29 = i26;
                GLES20.glBindBuffer(34962, i29);
                int[] iArr4 = new int[1];
                GLES20.glGenTextures(1, iArr4, i29);
                int i30 = iArr4[i29];
                this.u = i30;
                GLES20.glBindTexture(3553, i30);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glBindTexture(3553, this.u);
                try {
                    bitmap = BitmapFactory.decodeStream(context.getAssets().open("flecks.png"));
                } catch (IOException unused) {
                    bitmap = null;
                }
                int[] iArr5 = new int[1];
                GLES20.glGenTextures(1, iArr5, 0);
                GLES20.glBindTexture(3553, iArr5[0]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                bitmap.recycle();
                int[] iArr6 = new int[1];
                GLES20.glGenTextures(1, iArr6, 0);
                int i31 = iArr6[0];
                this.o = i31;
                GLES20.glBindTexture(3553, i31);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glBindTexture(3553, this.o);
                int i32 = this.b0;
                if (i32 == 0 || i32 == 2) {
                    bitmap2 = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
                } else {
                    try {
                        if (i32 == 1) {
                            bitmap2 = BitmapFactory.decodeStream(context.getAssets().open("models/coin_border.png"));
                        } else {
                            bitmap2 = i32 == 3 ? BitmapFactory.decodeStream(context.getAssets().open("models/deal_border.png")) : bitmap2;
                        }
                    } catch (IOException unused2) {
                    }
                }
                if (bitmap2 != null) {
                    int[] iArr7 = new int[1];
                    c10 = 0;
                    GLES20.glGenTextures(1, iArr7, 0);
                    GLES20.glBindTexture(3553, iArr7[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    bitmap2.recycle();
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, iArr7[0]);
                    GLES20.glUniform1i(this.l, 0);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, iArr5[0]);
                    GLES20.glUniform1i(this.m, 1);
                } else {
                    c10 = 0;
                }
                GLES20.glActiveTexture(33986);
                GLES20.glBindTexture(3553, iArr6[c10]);
                GLES20.glUniform1i(this.n, 2);
                return;
            }
            try {
                f7 = f12;
            } catch (IOException e) {
                e = e;
                f7 = f12;
            }
            try {
                dataInputStream = new DataInputStream(new BufferedInputStream(context.getAssets().open(strArr[i22]), 16384));
                try {
                    a2 = u7.a(dataInputStream);
                    a10 = u7.a(dataInputStream);
                    a11 = u7.a(dataInputStream);
                    readInt = dataInputStream.readInt();
                    i12 = i20;
                    i13 = readInt * 3;
                } catch (Throwable th3) {
                    th = th3;
                    i11 = i18;
                    i12 = i20;
                }
            } catch (IOException e7) {
                e = e7;
                i11 = i18;
                i12 = i20;
                fArr = null;
                fArr2 = null;
                e.printStackTrace();
                this.i[i22] = mk.h(ByteBuffer.allocateDirect(fArr3.length * 4));
                this.i[i22].put(fArr3).position(0);
                this.j[i22] = mk.h(ByteBuffer.allocateDirect(fArr2.length * 4));
                this.j[i22].put(fArr2).position(0);
                this.k[i22] = mk.h(ByteBuffer.allocateDirect(fArr.length * 4));
                this.k[i22].put(fArr).position(0);
                this.y[i22] = fArr3.length;
                i22++;
                f12 = f7;
                i20 = i12;
                i18 = i11;
                i19 = 3;
                i21 = 0;
            }
            try {
                fArr = new float[i13];
                i11 = i18;
                try {
                    fArr2 = new float[readInt * 2];
                    try {
                        fArr3 = new float[i13];
                        int i33 = i21;
                        while (i33 < readInt) {
                            int readInt2 = dataInputStream.readInt() * 3;
                            while (i21 < i19) {
                                fArr3[(i33 * 3) + i21] = a2[readInt2 + i21] * f7;
                                i21++;
                            }
                            int readInt3 = dataInputStream.readInt() * 2;
                            int i34 = i33 * 2;
                            if (readInt3 >= 0) {
                                i14 = i19;
                                if (readInt3 < a10.length) {
                                    f10 = a10[readInt3];
                                    fArr2[i34] = f10;
                                    i15 = readInt3 + 1;
                                    int i35 = i34 + 1;
                                    if (i15 >= 0 && i15 < a10.length) {
                                        f11 = f7 - a10[i15];
                                        fArr2[i35] = f11;
                                        int readInt4 = dataInputStream.readInt() * 3;
                                        float[] fArr5 = a10;
                                        i17 = 0;
                                        for (i16 = i14; i17 < i16; i16 = 3) {
                                            fArr[(i33 * 3) + i17] = a11[readInt4 + i17];
                                            i17++;
                                        }
                                        i33++;
                                        a10 = fArr5;
                                        i19 = 3;
                                        i21 = 0;
                                    }
                                    f11 = 0.0f;
                                    fArr2[i35] = f11;
                                    int readInt42 = dataInputStream.readInt() * 3;
                                    float[] fArr52 = a10;
                                    i17 = 0;
                                    while (i17 < i16) {
                                    }
                                    i33++;
                                    a10 = fArr52;
                                    i19 = 3;
                                    i21 = 0;
                                }
                            } else {
                                i14 = i19;
                            }
                            f10 = 0.0f;
                            fArr2[i34] = f10;
                            i15 = readInt3 + 1;
                            int i352 = i34 + 1;
                            if (i15 >= 0) {
                                f11 = f7 - a10[i15];
                                fArr2[i352] = f11;
                                int readInt422 = dataInputStream.readInt() * 3;
                                float[] fArr522 = a10;
                                i17 = 0;
                                while (i17 < i16) {
                                }
                                i33++;
                                a10 = fArr522;
                                i19 = 3;
                                i21 = 0;
                            }
                            f11 = 0.0f;
                            fArr2[i352] = f11;
                            int readInt4222 = dataInputStream.readInt() * 3;
                            float[] fArr5222 = a10;
                            i17 = 0;
                            while (i17 < i16) {
                            }
                            i33++;
                            a10 = fArr5222;
                            i19 = 3;
                            i21 = 0;
                        }
                        try {
                            dataInputStream.close();
                        } catch (IOException e10) {
                            e = e10;
                            e.printStackTrace();
                            this.i[i22] = mk.h(ByteBuffer.allocateDirect(fArr3.length * 4));
                            this.i[i22].put(fArr3).position(0);
                            this.j[i22] = mk.h(ByteBuffer.allocateDirect(fArr2.length * 4));
                            this.j[i22].put(fArr2).position(0);
                            this.k[i22] = mk.h(ByteBuffer.allocateDirect(fArr.length * 4));
                            this.k[i22].put(fArr).position(0);
                            this.y[i22] = fArr3.length;
                            i22++;
                            f12 = f7;
                            i20 = i12;
                            i18 = i11;
                            i19 = 3;
                            i21 = 0;
                        }
                        this.i[i22] = mk.h(ByteBuffer.allocateDirect(fArr3.length * 4));
                        this.i[i22].put(fArr3).position(0);
                        this.j[i22] = mk.h(ByteBuffer.allocateDirect(fArr2.length * 4));
                        this.j[i22].put(fArr2).position(0);
                        this.k[i22] = mk.h(ByteBuffer.allocateDirect(fArr.length * 4));
                        this.k[i22].put(fArr).position(0);
                        this.y[i22] = fArr3.length;
                        i22++;
                        f12 = f7;
                        i20 = i12;
                        i18 = i11;
                        i19 = 3;
                        i21 = 0;
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            dataInputStream.close();
                        } catch (Throwable th5) {
                            th2.addSuppressed(th5);
                        }
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    fArr2 = null;
                }
            } catch (Throwable th7) {
                th = th7;
                i11 = i18;
                th2 = th;
                fArr = null;
                fArr2 = null;
                dataInputStream.close();
                throw th2;
            }
        }
    }

    public static String a(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStream open = context.getAssets().open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, StandardCharsets.UTF_8));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append("\n");
            }
            bufferedReader.close();
            open.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb2.toString();
    }

    public static String b(String str) {
        Matcher matcher = Pattern.compile("RGB#([0-9a-fA-F]{6})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            matcher.appendReplacement(stringBuffer, String.format(Locale.US, "vec3(%.3f, %.3f, %.3f)", Double.valueOf(Integer.parseInt(group.substring(0, 2), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(2, 4), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(4, 6), 16) / 255.0d)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
