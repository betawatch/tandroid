package qg;

import ai.db;
import ai.x9;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.zip.Inflater;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.pa;
import w7.o6;
import w7.q6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class t0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public u1 D;
    public boolean E;
    public final ja F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public ki.t1 a;
    public u0 b;
    public i1 c;
    public i1 d;
    public f1 f;
    public final fw0 g;
    public RectF h;
    public m i;
    public u1 k;
    public u1 l;
    public final ByteBuffer m;
    public final ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public Map r;
    public int s;
    public final ByteBuffer u;
    public boolean v;
    public a5.a w;
    public final float[] x;
    public float[] y;
    public u1 z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final y0 e = new y0();

    public t0(fw0 fw0Var, Bitmap bitmap, int i10, ja jaVar) {
        this.F = jaVar;
        this.g = fw0Var;
        this.A = bitmap;
        this.B = i10;
        this.u = ByteBuffer.allocateDirect(((int) fw0Var.a) * ((int) fw0Var.b) * 4);
        this.x = o6.b(fw0Var.a, fw0Var.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(fw0Var.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(fw0Var.b);
        this.m.putFloat(fw0Var.a);
        this.m.putFloat(fw0Var.b);
        this.m.rewind();
        if (this.n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.n = allocateDirect2;
            allocateDirect2.order(ByteOrder.nativeOrder());
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.rewind();
        }
    }

    public final void a(boolean z10) {
        int i10 = this.o;
        int[] iArr = this.t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.o = 0;
        }
        u1 u1Var = this.k;
        if (u1Var != null) {
            u1Var.a(z10);
        }
        u1 u1Var2 = this.D;
        if (u1Var2 != null) {
            u1Var2.a(z10);
        }
        int i11 = this.p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (u1 u1Var3 : hashMap.values()) {
            if (u1Var3 != null) {
                u1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        u1 u1Var4 = this.z;
        if (u1Var4 != null) {
            u1Var4.a(true);
        }
        u1 u1Var5 = this.l;
        if (u1Var5 != null) {
            u1Var5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (g1 g1Var : map.values()) {
                if (g1Var.a != 0) {
                    GLES20.glDeleteProgram(0);
                    g1Var.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        q6.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            fw0 fw0Var = this.g;
            GLES20.glViewport(0, 0, (int) fw0Var.a, (int) fw0Var.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        ki.t1 t1Var = this.a;
        if (t1Var != null) {
            t1Var.s();
        }
        y0 y0Var = this.e;
        y0Var.h = 0;
        y0Var.g = 0.0d;
        ByteBuffer byteBuffer = y0Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(u0 u0Var, int i10, boolean z10, a0 a0Var) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new db(this, u0Var, i10, z10, a0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a5.a d(u0 u0Var, int i10, RectF rectF) {
        a5.a m10;
        ki.t1 t1Var;
        Object obj;
        boolean z10;
        m mVar = this.i;
        if (u0Var != null) {
            mVar = u0Var.e;
        }
        m mVar2 = mVar;
        if (this.F == null || !(((z10 = mVar2 instanceof b)) || (mVar2 instanceof d))) {
            m10 = m(rectF, false);
        } else {
            boolean z11 = this.E;
            if (rectF != null && rectF.setIntersect(rectF, f())) {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).c;
                Object obj2 = this.a.b;
                a5.a aVar = new a5.a(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).c;
                Object obj3 = this.a.b;
                ((f1) this.a.b).b.b(UUID.randomUUID(), new x9(this, aVar, new a5.a(byteBuffer2, 1, rectF), z11, 28));
                m10 = aVar;
            } else {
                m10 = null;
            }
            this.E = z10;
        }
        this.s++;
        int i11 = (this.F == null || !((mVar2 instanceof b) || (mVar2 instanceof d))) ? 1 : 2;
        for (int i12 = 0; i12 < i11; i12++) {
            GLES20.glBindFramebuffer(36160, i());
            int j10 = j();
            if (this.F != null && (((mVar2 instanceof b) && i12 == 0) || ((mVar2 instanceof d) && i12 == 1))) {
                u1 u1Var = this.D;
                j10 = u1Var != null ? u1Var.c() : 0;
            }
            if (i12 == 1 && (mVar2 instanceof b)) {
                mVar2 = new d();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j10, 0);
            fw0 fw0Var = this.g;
            GLES20.glViewport(0, 0, (int) fw0Var.a, (int) fw0Var.b);
            g1 g1Var = (g1) this.r.get(mVar2.i(1));
            if (g1Var == null) {
                return null;
            }
            GLES20.glUseProgram(g1Var.a);
            GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(g1Var.d("texture"), 0);
            GLES20.glUniform1i(g1Var.d("mask"), 1);
            g1.a(g1Var.d("color"), i0.a.o(i10, (int) (mVar2.f() * Color.alpha(i10))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j10);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (mVar2 instanceof b) {
                GLES20.glUniform1i(g1Var.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                ja jaVar = this.F;
                if (jaVar != null) {
                    obj = jaVar.h;
                    pa paVar = jaVar.m;
                    GLES20.glBindTexture(3553, paVar != null ? paVar.s[2] : -1);
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
                    GLES20.glEnableVertexAttribArray(1);
                    if (obj == null) {
                        synchronized (obj) {
                            GLES20.glDrawArrays(5, 0, 4);
                        }
                    } else {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                    GLES20.glBindTexture(3553, j());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                } else {
                    GLES20.glBindTexture(3553, this.z.c());
                }
            }
            obj = null;
            GLES20.glBlendFunc(1, 0);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
            GLES20.glEnableVertexAttribArray(1);
            if (obj == null) {
            }
            GLES20.glBindTexture(3553, j());
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        GLES20.glBindFramebuffer(36160, 0);
        if (this.s <= 0 && (t1Var = this.a) != null) {
            t1Var.s();
        }
        this.s--;
        y0 y0Var = this.e;
        y0Var.h = 0;
        y0Var.g = 0.0d;
        ByteBuffer byteBuffer3 = y0Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m10;
    }

    public final a5.a e(i1 i1Var, int i10, RectF rectF) {
        m mVar = i1Var.a;
        if (mVar == null) {
            mVar = this.i;
        }
        a5.a m10 = m(rectF, this.F != null && (mVar instanceof b));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        fw0 fw0Var = this.g;
        GLES20.glViewport(0, 0, (int) fw0Var.a, (int) fw0Var.b);
        g1 g1Var = (g1) this.r.get(mVar.i(1));
        if (g1Var == null) {
            return null;
        }
        GLES20.glUseProgram(g1Var.a);
        GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(g1Var.d("texture"), 0);
        GLES20.glUniform1i(g1Var.d("mask"), 1);
        g1.a(g1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.z != null) {
            GLES20.glUniform1i(g1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(g1Var.d(TeXSymbolParser.TYPE_ATTR), i1Var.a.o());
            GLES20.glUniform2f(g1Var.d("resolution"), fw0Var.a, fw0Var.b);
            GLES20.glUniform2f(g1Var.d("center"), i1Var.b, i1Var.c);
            GLES20.glUniform2f(g1Var.d("radius"), i1Var.d, i1Var.e);
            GLES20.glUniform1f(g1Var.d("thickness"), i1Var.f);
            GLES20.glUniform1f(g1Var.d("rounding"), i1Var.g);
            GLES20.glUniform2f(g1Var.d("middle"), i1Var.i, i1Var.j);
            GLES20.glUniform1f(g1Var.d("rotation"), i1Var.h);
            GLES20.glUniform1i(g1Var.d("fill"), i1Var.l ? 1 : 0);
            GLES20.glUniform1f(g1Var.d("arrowTriangleLength"), i1Var.k);
            GLES20.glUniform1i(g1Var.d("composite"), 1);
            GLES20.glUniform1i(g1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        ki.t1 t1Var = this.a;
        if (t1Var != null && this.s <= 0) {
            t1Var.s();
        }
        this.s--;
        y0 y0Var = this.e;
        y0Var.h = 0;
        y0Var.g = 0.0d;
        ByteBuffer byteBuffer = y0Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.b = null;
        this.c = null;
        return m10;
    }

    public final RectF f() {
        fw0 fw0Var = this.g;
        return new RectF(0.0f, 0.0f, fw0Var.a, fw0Var.b);
    }

    public final int g() {
        if (this.p == 0) {
            this.p = u1.b(this.g);
        }
        return this.p;
    }

    public final mi.q h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        u1 u1Var;
        mi.q qVar;
        g1 g1Var;
        u1 u1Var2;
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.t, 0);
        int i12 = this.t[0];
        GLES20.glBindFramebuffer(36160, i12);
        GLES20.glGenTextures(1, this.t, 0);
        int i13 = this.t[0];
        GLES20.glBindTexture(3553, i13);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i13, 0);
        fw0 fw0Var = this.g;
        GLES20.glViewport(0, 0, (int) fw0Var.a, (int) fw0Var.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            g1 g1Var2 = (g1) map.get(z10 ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (g1Var2 != null) {
                GLES20.glUseProgram(g1Var2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i10, -i11);
                float[] c10 = o6.c(this.x, o6.a(matrix));
                GLES20.glUniformMatrix4fv(g1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (z10 || !this.G) {
                    GLES20.glUniform1i(g1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (u1Var = this.D) == null) ? j() : u1Var.c());
                } else {
                    GLES20.glUniform1i(g1Var2.d("texture"), 1);
                    GLES20.glUniform1i(g1Var2.d("mask"), 0);
                    GLES20.glUniform1f(g1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (u1Var2 = this.D) == null) ? j() : u1Var2.c());
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.l.c());
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (g1Var = (g1) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(g1Var.a);
                    GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(g1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(g1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(g1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    pa paVar = this.F.m;
                    GLES20.glBindTexture(3553, paVar != null ? paVar.s[2] : -1);
                    GLES20.glUniform1f(g1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(g1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.u);
                if (z10) {
                    qVar = new mi.q(17, obj, this.u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    qVar = new mi.q(17, createBitmap, obj);
                }
                this.u.rewind();
                int[] iArr = this.t;
                iArr[0] = i12;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.t;
                iArr2[0] = i13;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return qVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.o = iArr[0];
            q6.a();
        }
        return this.o;
    }

    public final int j() {
        u1 u1Var = this.k;
        if (u1Var != null) {
            return u1Var.c();
        }
        return 0;
    }

    public final void k(i1 i1Var) {
        if (i1Var == null) {
            return;
        }
        this.f.f(new p0(this, i1Var, 0));
    }

    public final void l(u0 u0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        x0 x0Var;
        float f7;
        double d;
        boolean z12;
        x0 x0Var2;
        float f10;
        x0[] x0VarArr;
        double d10;
        float f11;
        float f12;
        char c10;
        char c11;
        this.b = u0Var;
        if (u0Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        q6.a();
        RectF rectF = null;
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            fw0 fw0Var = this.g;
            GLES20.glViewport(0, 0, (int) fw0Var.a, (int) fw0Var.b);
            float f13 = 0.0f;
            if (z10) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
            }
            Map map = this.r;
            if (map == null) {
                return;
            }
            m mVar = u0Var.e;
            int i12 = 2;
            g1 g1Var = (g1) map.get(mVar.i(2));
            if (g1Var == null) {
                return;
            }
            GLES20.glUseProgram(g1Var.a);
            u1 u1Var = (u1) this.j.get(Integer.valueOf(mVar.l()));
            if (u1Var == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                u1Var = new u1(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), mVar.l(), options));
                this.j.put(Integer.valueOf(mVar.l()), u1Var);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, u1Var.c());
            GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(g1Var.d("texture"), 0);
            if (z11) {
                this.e.f = 1.0f;
            } else {
                this.e.f = this.f.getScaleX();
            }
            y0 y0Var = this.e;
            y0Var.a = u0Var.d;
            y0Var.b = u0Var.e.k();
            y0Var.c = z11 ? 1.0f : u0Var.e.a();
            y0Var.d = u0Var.e.b();
            y0Var.e = u0Var.e.h();
            Vector vector = u0Var.b;
            int size = vector == null ? 0 : vector.size();
            if (size == 0) {
                i10 = 0;
            } else {
                if (size == 1) {
                    Vector vector2 = u0Var.b;
                    x0[] x0VarArr2 = new x0[vector2.size()];
                    vector2.toArray(x0VarArr2);
                    x0 x0Var3 = x0VarArr2[0];
                    float f14 = ((y0Var.a * y0Var.e) * 1.0f) / y0Var.f;
                    x0Var3.getClass();
                    PointF pointF = new PointF((float) x0Var3.a, (float) x0Var3.b);
                    float f15 = Math.abs(y0Var.d) > 0.0f ? y0Var.d : 0.0f;
                    float f16 = y0Var.c;
                    y0Var.c();
                    y0Var.b(1);
                    y0Var.a(pointF, f14, f15, f16, 0);
                } else {
                    Vector vector3 = u0Var.b;
                    int size2 = vector3.size();
                    x0[] x0VarArr3 = new x0[size2];
                    vector3.toArray(x0VarArr3);
                    y0Var.c();
                    int i13 = 0;
                    while (i13 < size2 - 1) {
                        x0 x0Var4 = x0VarArr3[i13];
                        int i14 = i13 + 1;
                        x0 x0Var5 = x0VarArr3[i14];
                        double a2 = x0Var4.a(x0Var5);
                        int i15 = size2;
                        float f17 = f13;
                        double d11 = x0Var5.a - x0Var4.a;
                        int i16 = i12;
                        double d12 = x0Var5.b - x0Var4.b;
                        double d13 = x0Var5.c;
                        double d14 = d13 - x0Var4.c;
                        x0 x0Var6 = new x0(1.0d, 1.0d, 0.0d);
                        float atan2 = Math.abs(y0Var.d) > f17 ? y0Var.d : (float) Math.atan2(d12, d11);
                        float f18 = (float) ((((y0Var.a * d13) * y0Var.e) * 1.0d) / y0Var.f);
                        double max = Math.max(1.0f, y0Var.b * f18);
                        if (a2 > 0.0d) {
                            double d15 = 1.0d / a2;
                            x0Var = new x0(d11 * d15, d12 * d15, d14 * d15);
                        } else {
                            x0Var = x0Var6;
                        }
                        float min = Math.min(1.0f, y0Var.c * 1.15f);
                        boolean z13 = x0Var4.d;
                        boolean z14 = x0Var5.d;
                        float f19 = atan2;
                        int ceil = (int) Math.ceil((a2 - y0Var.g) / max);
                        int i17 = y0Var.h;
                        y0Var.b(ceil);
                        ByteBuffer byteBuffer = y0Var.j;
                        if (byteBuffer == null || i17 < 0) {
                            f7 = f18;
                        } else {
                            f7 = f18;
                            if (i17 < y0Var.i) {
                                byteBuffer.position(i17 * 20);
                            }
                        }
                        double d16 = y0Var.g;
                        x0 x0Var7 = new x0(x0Var4.a + (x0Var.a * d16), x0Var4.b + (x0Var.b * d16), x0Var4.c + (x0Var.c * d16));
                        double d17 = d16;
                        x0 x0Var8 = x0Var7;
                        boolean z15 = true;
                        while (true) {
                            if (d17 > a2) {
                                d = d17;
                                z12 = z14;
                                x0Var2 = x0Var5;
                                f10 = f7;
                                x0VarArr = x0VarArr3;
                                d10 = a2;
                                f11 = f19;
                                break;
                            }
                            float f20 = z13 ? min : y0Var.c;
                            d = d17;
                            z12 = z14;
                            x0[] x0VarArr4 = x0VarArr3;
                            d10 = a2;
                            f11 = f19;
                            float f21 = f20;
                            x0 x0Var9 = x0Var8;
                            x0Var2 = x0Var5;
                            f10 = f7;
                            boolean a10 = y0Var.a(new PointF((float) x0Var8.a, (float) x0Var8.b), f10, f11, f21, -1);
                            if (!a10) {
                                x0VarArr = x0VarArr4;
                                z15 = a10;
                                break;
                            }
                            x0 x0Var10 = new x0(x0Var9.a + (x0Var.a * max), x0Var9.b + (x0Var.b * max), x0Var9.c + (x0Var.c * max));
                            z15 = a10;
                            f19 = f11;
                            x0Var8 = x0Var10;
                            a2 = d10;
                            x0VarArr3 = x0VarArr4;
                            z14 = z12;
                            f7 = f10;
                            x0Var5 = x0Var2;
                            d17 = d + max;
                            z13 = false;
                        }
                        if (z15 && z12) {
                            y0Var.b(1);
                            y0Var.a(new PointF((float) x0Var2.a, (float) x0Var2.b), f10, f11, min, -1);
                        }
                        y0Var.g = d - d10;
                        size2 = i15;
                        i13 = i14;
                        f13 = f17;
                        i12 = i16;
                        x0VarArr3 = x0VarArr;
                    }
                }
                float f22 = f13;
                int i18 = i12;
                u0Var.a = y0Var.g;
                rectF = new RectF(f22, f22, f22, f22);
                int i19 = y0Var.h;
                if (i19 <= 0) {
                    i10 = 0;
                } else {
                    int i20 = i19 - 1;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i20 * 2) + (i19 * 4)) * 20);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                    asFloatBuffer.position(0);
                    ByteBuffer byteBuffer2 = y0Var.j;
                    if (byteBuffer2 != null && y0Var.i > 0) {
                        byteBuffer2.position(0);
                    }
                    int i21 = 0;
                    for (int i22 = 0; i22 < i19; i22++) {
                        float f23 = y0Var.j.getFloat();
                        float f24 = y0Var.j.getFloat();
                        float f25 = y0Var.j.getFloat();
                        float f26 = y0Var.j.getFloat();
                        float f27 = y0Var.j.getFloat();
                        RectF rectF2 = new RectF(f23 - f25, f24 - f25, f23 + f25, f24 + f25);
                        float f28 = rectF2.left;
                        float f29 = rectF2.top;
                        float f30 = rectF2.right;
                        float f31 = rectF2.bottom;
                        float[] fArr = new float[8];
                        fArr[0] = f28;
                        fArr[1] = f29;
                        fArr[i18] = f30;
                        fArr[3] = f29;
                        fArr[4] = f28;
                        fArr[5] = f31;
                        fArr[6] = f30;
                        fArr[7] = f31;
                        float centerX = rectF2.centerX();
                        float centerY = rectF2.centerY();
                        Matrix matrix = new Matrix();
                        matrix.setRotate((float) Math.toDegrees(f26), centerX, centerY);
                        matrix.mapPoints(fArr);
                        matrix.mapRect(rectF2);
                        rectF2.left = (int) Math.floor(rectF2.left);
                        rectF2.top = (int) Math.floor(rectF2.top);
                        rectF2.right = (int) Math.ceil(rectF2.right);
                        rectF2.bottom = (int) Math.ceil(rectF2.bottom);
                        rectF.union(rectF2);
                        if (i21 != 0) {
                            c10 = 0;
                            asFloatBuffer.put(fArr[0]);
                            c11 = 1;
                            asFloatBuffer.put(fArr[1]);
                            f12 = 0.0f;
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(f27);
                            i21++;
                        } else {
                            f12 = 0.0f;
                            c10 = 0;
                            c11 = 1;
                        }
                        asFloatBuffer.put(fArr[c10]);
                        asFloatBuffer.put(fArr[c11]);
                        asFloatBuffer.put(f12);
                        asFloatBuffer.put(f12);
                        asFloatBuffer.put(f27);
                        asFloatBuffer.put(fArr[i18]);
                        asFloatBuffer.put(fArr[3]);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f12);
                        asFloatBuffer.put(f27);
                        asFloatBuffer.put(fArr[4]);
                        asFloatBuffer.put(fArr[5]);
                        asFloatBuffer.put(f12);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f27);
                        asFloatBuffer.put(fArr[6]);
                        asFloatBuffer.put(fArr[7]);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f27);
                        int i23 = i21 + 4;
                        if (i22 != i20) {
                            asFloatBuffer.put(fArr[6]);
                            asFloatBuffer.put(fArr[7]);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(f27);
                            i21 += 5;
                        } else {
                            i21 = i23;
                        }
                    }
                    asFloatBuffer.position(0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(0);
                    asFloatBuffer.position(i18);
                    GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(1);
                    asFloatBuffer.position(4);
                    GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(2);
                    i10 = 0;
                    GLES20.glDrawArrays(5, 0, i21);
                }
            }
            i11 = 36160;
        } else {
            i10 = 0;
            i11 = 36160;
        }
        GLES20.glBindFramebuffer(i11, i10);
        ki.t1 t1Var = this.a;
        if (t1Var != null) {
            t1Var.s();
        }
        RectF rectF3 = this.h;
        if (rectF3 != null) {
            rectF3.union(rectF);
        } else {
            this.h = rectF;
        }
    }

    public final a5.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z10, false).c;
        Object obj = this.a.b;
        a5.a aVar = new a5.a(byteBuffer, z10 ? 1 : 0, rectF);
        ((f1) this.a.b).b.b(UUID.randomUUID(), new r0(this, aVar, 1));
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i10, u0 u0Var, float f7) {
        Object obj;
        if (u0Var == null) {
            return;
        }
        m mVar = u0Var.e;
        if (mVar == null) {
            mVar = this.i;
        }
        boolean z10 = this.G && ((mVar instanceof f) || (mVar instanceof d));
        Map map = this.r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mVar.i(0));
        sb2.append(z10 ? "_masking" : "");
        g1 g1Var = (g1) map.get(sb2.toString());
        if (g1Var == null) {
            return;
        }
        GLES20.glUseProgram(g1Var.a);
        GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(g1Var.d("texture"), 0);
        GLES20.glUniform1i(g1Var.d("mask"), 1);
        g1.a(g1Var.d("color"), i0.a.o(u0Var.c, (int) (mVar.f() * Color.alpha(r0) * f7)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i10);
        if (z10) {
            GLES20.glUniform1i(g1Var.d("otexture"), 2);
            GLES20.glUniform1f(g1Var.d("preview"), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.l.c());
        }
        if (mVar instanceof b) {
            GLES20.glUniform1i(g1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            ja jaVar = this.F;
            if (jaVar != null) {
                obj = jaVar.h;
                pa paVar = jaVar.m;
                GLES20.glBindTexture(3553, paVar != null ? paVar.s[2] : -1);
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
                GLES20.glEnableVertexAttribArray(1);
                if (obj == null) {
                    synchronized (obj) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                } else {
                    GLES20.glDrawArrays(5, 0, 4);
                }
                q6.a();
            }
            u1 u1Var = this.z;
            if (u1Var != null) {
                GLES20.glBindTexture(3553, u1Var.c());
            }
        }
        obj = null;
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        if (obj == null) {
        }
        q6.a();
    }

    public final void o(int i10, int i11, i1 i1Var, float f7) {
        g1 g1Var;
        if (i1Var == null) {
            return;
        }
        m mVar = this.i;
        l lVar = i1Var.a;
        if (lVar != null && i10 == this.q) {
            mVar = lVar;
        }
        if (mVar == null || this.f == null || (g1Var = (g1) this.r.get(mVar.i(0))) == null) {
            return;
        }
        GLES20.glUseProgram(g1Var.a);
        GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(g1Var.d("texture"), 0);
        GLES20.glUniform1i(g1Var.d("mask"), 1);
        g1.a(g1Var.d("color"), i0.a.o(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f7)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i10);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i11);
        if (mVar instanceof l) {
            GLES20.glUniform1i(g1Var.d(TeXSymbolParser.TYPE_ATTR), ((l) mVar).o());
            int d = g1Var.d("resolution");
            fw0 fw0Var = this.g;
            GLES20.glUniform2f(d, fw0Var.a, fw0Var.b);
            GLES20.glUniform2f(g1Var.d("center"), i1Var.b, i1Var.c);
            GLES20.glUniform2f(g1Var.d("radius"), i1Var.d, i1Var.e);
            GLES20.glUniform1f(g1Var.d("thickness"), i1Var.f);
            GLES20.glUniform1f(g1Var.d("rounding"), i1Var.g);
            GLES20.glUniform2f(g1Var.d("middle"), i1Var.i, i1Var.j);
            GLES20.glUniform1f(g1Var.d("rotation"), i1Var.h);
            GLES20.glUniform1i(g1Var.d("fill"), i1Var.l ? 1 : 0);
            GLES20.glUniform1f(g1Var.d("arrowTriangleLength"), i1Var.k);
            GLES20.glUniform1i(g1Var.d("composite"), 0);
            GLES20.glUniform1i(g1Var.d("clear"), i1Var == this.d ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        q6.a();
    }

    public final void p(a5.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        ki.t1 t1Var;
        u1 u1Var;
        if (aVar == null) {
            return;
        }
        try {
            byte[] bArr = new byte[1024];
            byte[] bArr2 = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream((File) aVar.d);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Inflater inflater = new Inflater(true);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    inflater.setInput(bArr, 0, read);
                }
                while (true) {
                    int inflate = inflater.inflate(bArr2, 0, 1024);
                    if (inflate == 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr2, 0, inflate);
                    }
                }
                if (inflater.finished()) {
                    break;
                } else {
                    inflater.needsInput();
                }
            }
            inflater.end();
            ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            byteArrayOutputStream.close();
            fileInputStream.close();
            byteBuffer = wrap;
        } catch (Exception e) {
            FileLog.e(e);
            byteBuffer = null;
        }
        int j10 = j();
        if (aVar.b == 1 && (u1Var = this.D) != null) {
            j10 = u1Var.c();
        }
        GLES20.glBindTexture(3553, j10);
        RectF rectF = (RectF) aVar.c;
        GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.c).height(), 6408, 5121, byteBuffer);
        if (this.s <= 0 && (t1Var = this.a) != null) {
            t1Var.s();
        }
        if (!z10 || (file = (File) aVar.d) == null) {
            return;
        }
        file.delete();
        aVar.d = null;
    }

    public final void q(m mVar) {
        Bitmap bitmap;
        Bitmap c10;
        this.i = mVar;
        if ((mVar instanceof b) && (bitmap = this.A) != null && this.F == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = this.B;
            if (i10 == 90 || i10 == 270 || i10 == -90) {
                height = width;
                width = height;
            }
            if (this.C == null) {
                this.C = Bitmap.createBitmap((int) (width / 8.0f), (int) (height / 8.0f), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(this.C);
            canvas.save();
            canvas.scale(0.125f, 0.125f);
            if (this.M != null) {
                this.M = new Paint(1);
            }
            canvas.save();
            canvas.rotate(i10);
            if (i10 == 90) {
                canvas.translate(0.0f, -width);
            } else if (i10 == 180) {
                canvas.translate(-width, -height);
            } else if (i10 == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.M);
            canvas.restore();
            f1 f1Var = this.f;
            if (f1Var != null && (c10 = f1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            u1 u1Var = this.z;
            if (u1Var != null) {
                u1Var.a(false);
            }
            this.z = new u1(this.C);
        }
    }
}
