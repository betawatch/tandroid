package pg;

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
import m.f3;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.sa;
import w7.k6;
import w7.m6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class s0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public t1 D;
    public boolean E;
    public final ma F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public f3 a;
    public t0 b;
    public h1 c;
    public h1 d;
    public e1 f;
    public final mw0 g;
    public RectF h;
    public m i;
    public t1 k;
    public t1 l;
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
    public t1 z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final x0 e = new x0();

    public s0(mw0 mw0Var, Bitmap bitmap, int i10, ma maVar) {
        this.F = maVar;
        this.g = mw0Var;
        this.A = bitmap;
        this.B = i10;
        this.u = ByteBuffer.allocateDirect(((int) mw0Var.a) * ((int) mw0Var.b) * 4);
        this.x = k6.b(mw0Var.a, mw0Var.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(mw0Var.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(mw0Var.b);
        this.m.putFloat(mw0Var.a);
        this.m.putFloat(mw0Var.b);
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
        t1 t1Var = this.k;
        if (t1Var != null) {
            t1Var.a(z10);
        }
        t1 t1Var2 = this.D;
        if (t1Var2 != null) {
            t1Var2.a(z10);
        }
        int i11 = this.p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (t1 t1Var3 : hashMap.values()) {
            if (t1Var3 != null) {
                t1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        t1 t1Var4 = this.z;
        if (t1Var4 != null) {
            t1Var4.a(true);
        }
        t1 t1Var5 = this.l;
        if (t1Var5 != null) {
            t1Var5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (f1 f1Var : map.values()) {
                if (f1Var.a != 0) {
                    GLES20.glDeleteProgram(0);
                    f1Var.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        m6.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            mw0 mw0Var = this.g;
            GLES20.glViewport(0, 0, (int) mw0Var.a, (int) mw0Var.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        f3 f3Var = this.a;
        if (f3Var != null) {
            f3Var.g();
        }
        x0 x0Var = this.e;
        x0Var.h = 0;
        x0Var.g = 0.0d;
        ByteBuffer byteBuffer = x0Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(t0 t0Var, int i10, boolean z10, z zVar) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new m4.f0(this, t0Var, i10, z10, zVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a5.a d(t0 t0Var, int i10, RectF rectF) {
        a5.a m10;
        f3 f3Var;
        Object obj;
        boolean z10;
        m mVar = this.i;
        if (t0Var != null) {
            mVar = t0Var.e;
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
                ((e1) this.a.b).b.b(UUID.randomUUID(), new l0(this, aVar, new a5.a(byteBuffer2, 1, rectF), z11, 0));
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
            int j3 = j();
            if (this.F != null && (((mVar2 instanceof b) && i12 == 0) || ((mVar2 instanceof d) && i12 == 1))) {
                t1 t1Var = this.D;
                j3 = t1Var != null ? t1Var.c() : 0;
            }
            if (i12 == 1 && (mVar2 instanceof b)) {
                mVar2 = new d();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j3, 0);
            mw0 mw0Var = this.g;
            GLES20.glViewport(0, 0, (int) mw0Var.a, (int) mw0Var.b);
            f1 f1Var = (f1) this.r.get(mVar2.i(1));
            if (f1Var == null) {
                return null;
            }
            GLES20.glUseProgram(f1Var.a);
            GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(f1Var.d("texture"), 0);
            GLES20.glUniform1i(f1Var.d("mask"), 1);
            f1.a(f1Var.d("color"), i0.a.k(i10, (int) (mVar2.f() * Color.alpha(i10))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j3);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (mVar2 instanceof b) {
                GLES20.glUniform1i(f1Var.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                ma maVar = this.F;
                if (maVar != null) {
                    obj = maVar.h;
                    sa saVar = maVar.m;
                    GLES20.glBindTexture(3553, saVar != null ? saVar.s[2] : -1);
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
        if (this.s <= 0 && (f3Var = this.a) != null) {
            f3Var.g();
        }
        this.s--;
        x0 x0Var = this.e;
        x0Var.h = 0;
        x0Var.g = 0.0d;
        ByteBuffer byteBuffer3 = x0Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m10;
    }

    public final a5.a e(h1 h1Var, int i10, RectF rectF) {
        m mVar = h1Var.a;
        if (mVar == null) {
            mVar = this.i;
        }
        a5.a m10 = m(rectF, this.F != null && (mVar instanceof b));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        mw0 mw0Var = this.g;
        GLES20.glViewport(0, 0, (int) mw0Var.a, (int) mw0Var.b);
        f1 f1Var = (f1) this.r.get(mVar.i(1));
        if (f1Var == null) {
            return null;
        }
        GLES20.glUseProgram(f1Var.a);
        GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(f1Var.d("texture"), 0);
        GLES20.glUniform1i(f1Var.d("mask"), 1);
        f1.a(f1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.z != null) {
            GLES20.glUniform1i(f1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(f1Var.d(TeXSymbolParser.TYPE_ATTR), h1Var.a.o());
            GLES20.glUniform2f(f1Var.d("resolution"), mw0Var.a, mw0Var.b);
            GLES20.glUniform2f(f1Var.d("center"), h1Var.b, h1Var.c);
            GLES20.glUniform2f(f1Var.d("radius"), h1Var.d, h1Var.e);
            GLES20.glUniform1f(f1Var.d("thickness"), h1Var.f);
            GLES20.glUniform1f(f1Var.d("rounding"), h1Var.g);
            GLES20.glUniform2f(f1Var.d("middle"), h1Var.i, h1Var.j);
            GLES20.glUniform1f(f1Var.d("rotation"), h1Var.h);
            GLES20.glUniform1i(f1Var.d("fill"), h1Var.l ? 1 : 0);
            GLES20.glUniform1f(f1Var.d("arrowTriangleLength"), h1Var.k);
            GLES20.glUniform1i(f1Var.d("composite"), 1);
            GLES20.glUniform1i(f1Var.d("clear"), 0);
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
        f3 f3Var = this.a;
        if (f3Var != null && this.s <= 0) {
            f3Var.g();
        }
        this.s--;
        x0 x0Var = this.e;
        x0Var.h = 0;
        x0Var.g = 0.0d;
        ByteBuffer byteBuffer = x0Var.j;
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
        mw0 mw0Var = this.g;
        return new RectF(0.0f, 0.0f, mw0Var.a, mw0Var.b);
    }

    public final int g() {
        if (this.p == 0) {
            this.p = t1.b(this.g);
        }
        return this.p;
    }

    public final n6.t h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        t1 t1Var;
        n6.t tVar;
        f1 f1Var;
        t1 t1Var2;
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
        mw0 mw0Var = this.g;
        GLES20.glViewport(0, 0, (int) mw0Var.a, (int) mw0Var.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            f1 f1Var2 = (f1) map.get(z10 ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (f1Var2 != null) {
                GLES20.glUseProgram(f1Var2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i10, -i11);
                float[] c10 = k6.c(this.x, k6.a(matrix));
                GLES20.glUniformMatrix4fv(f1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (z10 || !this.G) {
                    GLES20.glUniform1i(f1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (t1Var = this.D) == null) ? j() : t1Var.c());
                } else {
                    GLES20.glUniform1i(f1Var2.d("texture"), 1);
                    GLES20.glUniform1i(f1Var2.d("mask"), 0);
                    GLES20.glUniform1f(f1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (t1Var2 = this.D) == null) ? j() : t1Var2.c());
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
                if (z12 && !z11 && (f1Var = (f1) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(f1Var.a);
                    GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(f1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(f1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(f1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    sa saVar = this.F.m;
                    GLES20.glBindTexture(3553, saVar != null ? saVar.s[2] : -1);
                    GLES20.glUniform1f(f1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(f1Var.d("mask"), 2);
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
                    tVar = new n6.t(11, obj, this.u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    tVar = new n6.t(11, createBitmap, obj);
                }
                this.u.rewind();
                int[] iArr = this.t;
                iArr[0] = i12;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.t;
                iArr2[0] = i13;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return tVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.o = iArr[0];
            m6.a();
        }
        return this.o;
    }

    public final int j() {
        t1 t1Var = this.k;
        if (t1Var != null) {
            return t1Var.c();
        }
        return 0;
    }

    public final void k(h1 h1Var) {
        if (h1Var == null) {
            return;
        }
        this.f.f(new o0(this, h1Var, 0));
    }

    public final void l(t0 t0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        w0 w0Var;
        float f7;
        double d;
        boolean z12;
        w0 w0Var2;
        float f10;
        w0[] w0VarArr;
        double d10;
        float f11;
        float f12;
        char c10;
        char c11;
        this.b = t0Var;
        if (t0Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        m6.a();
        RectF rectF = null;
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            mw0 mw0Var = this.g;
            GLES20.glViewport(0, 0, (int) mw0Var.a, (int) mw0Var.b);
            float f13 = 0.0f;
            if (z10) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
            }
            Map map = this.r;
            if (map == null) {
                return;
            }
            m mVar = t0Var.e;
            int i12 = 2;
            f1 f1Var = (f1) map.get(mVar.i(2));
            if (f1Var == null) {
                return;
            }
            GLES20.glUseProgram(f1Var.a);
            t1 t1Var = (t1) this.j.get(Integer.valueOf(mVar.l()));
            if (t1Var == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                t1Var = new t1(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), mVar.l(), options));
                this.j.put(Integer.valueOf(mVar.l()), t1Var);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, t1Var.c());
            GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(f1Var.d("texture"), 0);
            if (z11) {
                this.e.f = 1.0f;
            } else {
                this.e.f = this.f.getScaleX();
            }
            x0 x0Var = this.e;
            x0Var.a = t0Var.d;
            x0Var.b = t0Var.e.k();
            x0Var.c = z11 ? 1.0f : t0Var.e.a();
            x0Var.d = t0Var.e.b();
            x0Var.e = t0Var.e.h();
            Vector vector = t0Var.b;
            int size = vector == null ? 0 : vector.size();
            if (size == 0) {
                i10 = 0;
            } else {
                if (size == 1) {
                    Vector vector2 = t0Var.b;
                    w0[] w0VarArr2 = new w0[vector2.size()];
                    vector2.toArray(w0VarArr2);
                    w0 w0Var3 = w0VarArr2[0];
                    float f14 = ((x0Var.a * x0Var.e) * 1.0f) / x0Var.f;
                    w0Var3.getClass();
                    PointF pointF = new PointF((float) w0Var3.a, (float) w0Var3.b);
                    float f15 = Math.abs(x0Var.d) > 0.0f ? x0Var.d : 0.0f;
                    float f16 = x0Var.c;
                    x0Var.c();
                    x0Var.b(1);
                    x0Var.a(pointF, f14, f15, f16, 0);
                } else {
                    Vector vector3 = t0Var.b;
                    int size2 = vector3.size();
                    w0[] w0VarArr3 = new w0[size2];
                    vector3.toArray(w0VarArr3);
                    x0Var.c();
                    int i13 = 0;
                    while (i13 < size2 - 1) {
                        w0 w0Var4 = w0VarArr3[i13];
                        int i14 = i13 + 1;
                        w0 w0Var5 = w0VarArr3[i14];
                        double a2 = w0Var4.a(w0Var5);
                        int i15 = size2;
                        float f17 = f13;
                        double d11 = w0Var5.a - w0Var4.a;
                        int i16 = i12;
                        double d12 = w0Var5.b - w0Var4.b;
                        double d13 = w0Var5.c;
                        double d14 = d13 - w0Var4.c;
                        w0 w0Var6 = new w0(1.0d, 1.0d, 0.0d);
                        float atan2 = Math.abs(x0Var.d) > f17 ? x0Var.d : (float) Math.atan2(d12, d11);
                        float f18 = (float) ((((x0Var.a * d13) * x0Var.e) * 1.0d) / x0Var.f);
                        double max = Math.max(1.0f, x0Var.b * f18);
                        if (a2 > 0.0d) {
                            double d15 = 1.0d / a2;
                            w0Var = new w0(d11 * d15, d12 * d15, d14 * d15);
                        } else {
                            w0Var = w0Var6;
                        }
                        float min = Math.min(1.0f, x0Var.c * 1.15f);
                        boolean z13 = w0Var4.d;
                        boolean z14 = w0Var5.d;
                        float f19 = atan2;
                        int ceil = (int) Math.ceil((a2 - x0Var.g) / max);
                        int i17 = x0Var.h;
                        x0Var.b(ceil);
                        ByteBuffer byteBuffer = x0Var.j;
                        if (byteBuffer == null || i17 < 0) {
                            f7 = f18;
                        } else {
                            f7 = f18;
                            if (i17 < x0Var.i) {
                                byteBuffer.position(i17 * 20);
                            }
                        }
                        double d16 = x0Var.g;
                        w0 w0Var7 = new w0(w0Var4.a + (w0Var.a * d16), w0Var4.b + (w0Var.b * d16), w0Var4.c + (w0Var.c * d16));
                        double d17 = d16;
                        w0 w0Var8 = w0Var7;
                        boolean z15 = true;
                        while (true) {
                            if (d17 > a2) {
                                d = d17;
                                z12 = z14;
                                w0Var2 = w0Var5;
                                f10 = f7;
                                w0VarArr = w0VarArr3;
                                d10 = a2;
                                f11 = f19;
                                break;
                            }
                            float f20 = z13 ? min : x0Var.c;
                            d = d17;
                            z12 = z14;
                            w0[] w0VarArr4 = w0VarArr3;
                            d10 = a2;
                            f11 = f19;
                            float f21 = f20;
                            w0 w0Var9 = w0Var8;
                            w0Var2 = w0Var5;
                            f10 = f7;
                            boolean a10 = x0Var.a(new PointF((float) w0Var8.a, (float) w0Var8.b), f10, f11, f21, -1);
                            if (!a10) {
                                w0VarArr = w0VarArr4;
                                z15 = a10;
                                break;
                            }
                            w0 w0Var10 = new w0(w0Var9.a + (w0Var.a * max), w0Var9.b + (w0Var.b * max), w0Var9.c + (w0Var.c * max));
                            z15 = a10;
                            f19 = f11;
                            w0Var8 = w0Var10;
                            a2 = d10;
                            w0VarArr3 = w0VarArr4;
                            z14 = z12;
                            f7 = f10;
                            w0Var5 = w0Var2;
                            d17 = d + max;
                            z13 = false;
                        }
                        if (z15 && z12) {
                            x0Var.b(1);
                            x0Var.a(new PointF((float) w0Var2.a, (float) w0Var2.b), f10, f11, min, -1);
                        }
                        x0Var.g = d - d10;
                        size2 = i15;
                        i13 = i14;
                        f13 = f17;
                        i12 = i16;
                        w0VarArr3 = w0VarArr;
                    }
                }
                float f22 = f13;
                int i18 = i12;
                t0Var.a = x0Var.g;
                rectF = new RectF(f22, f22, f22, f22);
                int i19 = x0Var.h;
                if (i19 <= 0) {
                    i10 = 0;
                } else {
                    int i20 = i19 - 1;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i20 * 2) + (i19 * 4)) * 20);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                    asFloatBuffer.position(0);
                    ByteBuffer byteBuffer2 = x0Var.j;
                    if (byteBuffer2 != null && x0Var.i > 0) {
                        byteBuffer2.position(0);
                    }
                    int i21 = 0;
                    for (int i22 = 0; i22 < i19; i22++) {
                        float f23 = x0Var.j.getFloat();
                        float f24 = x0Var.j.getFloat();
                        float f25 = x0Var.j.getFloat();
                        float f26 = x0Var.j.getFloat();
                        float f27 = x0Var.j.getFloat();
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
        f3 f3Var = this.a;
        if (f3Var != null) {
            f3Var.g();
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
        ((e1) this.a.b).b.b(UUID.randomUUID(), new q0(this, aVar, 1));
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i10, t0 t0Var, float f7) {
        Object obj;
        if (t0Var == null) {
            return;
        }
        m mVar = t0Var.e;
        if (mVar == null) {
            mVar = this.i;
        }
        boolean z10 = this.G && ((mVar instanceof f) || (mVar instanceof d));
        Map map = this.r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mVar.i(0));
        sb2.append(z10 ? "_masking" : "");
        f1 f1Var = (f1) map.get(sb2.toString());
        if (f1Var == null) {
            return;
        }
        GLES20.glUseProgram(f1Var.a);
        GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(f1Var.d("texture"), 0);
        GLES20.glUniform1i(f1Var.d("mask"), 1);
        f1.a(f1Var.d("color"), i0.a.k(t0Var.c, (int) (mVar.f() * Color.alpha(r0) * f7)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i10);
        if (z10) {
            GLES20.glUniform1i(f1Var.d("otexture"), 2);
            GLES20.glUniform1f(f1Var.d("preview"), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.l.c());
        }
        if (mVar instanceof b) {
            GLES20.glUniform1i(f1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            ma maVar = this.F;
            if (maVar != null) {
                obj = maVar.h;
                sa saVar = maVar.m;
                GLES20.glBindTexture(3553, saVar != null ? saVar.s[2] : -1);
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
                m6.a();
            }
            t1 t1Var = this.z;
            if (t1Var != null) {
                GLES20.glBindTexture(3553, t1Var.c());
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
        m6.a();
    }

    public final void o(int i10, int i11, h1 h1Var, float f7) {
        f1 f1Var;
        if (h1Var == null) {
            return;
        }
        m mVar = this.i;
        l lVar = h1Var.a;
        if (lVar != null && i10 == this.q) {
            mVar = lVar;
        }
        if (mVar == null || this.f == null || (f1Var = (f1) this.r.get(mVar.i(0))) == null) {
            return;
        }
        GLES20.glUseProgram(f1Var.a);
        GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(f1Var.d("texture"), 0);
        GLES20.glUniform1i(f1Var.d("mask"), 1);
        f1.a(f1Var.d("color"), i0.a.k(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f7)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i10);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i11);
        if (mVar instanceof l) {
            GLES20.glUniform1i(f1Var.d(TeXSymbolParser.TYPE_ATTR), ((l) mVar).o());
            int d = f1Var.d("resolution");
            mw0 mw0Var = this.g;
            GLES20.glUniform2f(d, mw0Var.a, mw0Var.b);
            GLES20.glUniform2f(f1Var.d("center"), h1Var.b, h1Var.c);
            GLES20.glUniform2f(f1Var.d("radius"), h1Var.d, h1Var.e);
            GLES20.glUniform1f(f1Var.d("thickness"), h1Var.f);
            GLES20.glUniform1f(f1Var.d("rounding"), h1Var.g);
            GLES20.glUniform2f(f1Var.d("middle"), h1Var.i, h1Var.j);
            GLES20.glUniform1f(f1Var.d("rotation"), h1Var.h);
            GLES20.glUniform1i(f1Var.d("fill"), h1Var.l ? 1 : 0);
            GLES20.glUniform1f(f1Var.d("arrowTriangleLength"), h1Var.k);
            GLES20.glUniform1i(f1Var.d("composite"), 0);
            GLES20.glUniform1i(f1Var.d("clear"), h1Var == this.d ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        m6.a();
    }

    public final void p(a5.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        f3 f3Var;
        t1 t1Var;
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
        } catch (Exception e7) {
            FileLog.e(e7);
            byteBuffer = null;
        }
        int j3 = j();
        if (aVar.b == 1 && (t1Var = this.D) != null) {
            j3 = t1Var.c();
        }
        GLES20.glBindTexture(3553, j3);
        RectF rectF = (RectF) aVar.c;
        GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.c).height(), 6408, 5121, byteBuffer);
        if (this.s <= 0 && (f3Var = this.a) != null) {
            f3Var.g();
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
            e1 e1Var = this.f;
            if (e1Var != null && (c10 = e1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            t1 t1Var = this.z;
            if (t1Var != null) {
                t1Var.a(false);
            }
            this.z = new t1(this.C);
        }
    }
}
