package xf;

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
import g7.h8;
import g7.j8;
import gh.m8;
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
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.qu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public r1 D;
    public boolean E;
    public final ba F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public m5.c0 a;
    public r0 b;
    public f1 c;
    public f1 d;
    public c1 f;
    public final qu0 g;
    public RectF h;
    public m i;
    public r1 k;
    public r1 l;
    public final ByteBuffer m;
    public final ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public Map r;
    public int s;
    public final ByteBuffer u;
    public boolean v;
    public a6.a w;
    public final float[] x;
    public float[] y;
    public r1 z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final v0 e = new v0();

    public q0(qu0 qu0Var, Bitmap bitmap, int i9, ba baVar) {
        this.F = baVar;
        this.g = qu0Var;
        this.A = bitmap;
        this.B = i9;
        this.u = ByteBuffer.allocateDirect(((int) qu0Var.a) * ((int) qu0Var.b) * 4);
        this.x = h8.b(qu0Var.a, qu0Var.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(qu0Var.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(qu0Var.b);
        this.m.putFloat(qu0Var.a);
        this.m.putFloat(qu0Var.b);
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
        int i9 = this.o;
        int[] iArr = this.t;
        if (i9 != 0) {
            iArr[0] = i9;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.o = 0;
        }
        r1 r1Var = this.k;
        if (r1Var != null) {
            r1Var.a(z10);
        }
        r1 r1Var2 = this.D;
        if (r1Var2 != null) {
            r1Var2.a(z10);
        }
        int i10 = this.p;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (r1 r1Var3 : hashMap.values()) {
            if (r1Var3 != null) {
                r1Var3.a(true);
            }
        }
        hashMap.clear();
        int i11 = this.q;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        r1 r1Var4 = this.z;
        if (r1Var4 != null) {
            r1Var4.a(true);
        }
        r1 r1Var5 = this.l;
        if (r1Var5 != null) {
            r1Var5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (d1 d1Var : map.values()) {
                if (d1Var.a != 0) {
                    GLES20.glDeleteProgram(0);
                    d1Var.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        j8.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            qu0 qu0Var = this.g;
            GLES20.glViewport(0, 0, (int) qu0Var.a, (int) qu0Var.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        m5.c0 c0Var = this.a;
        if (c0Var != null) {
            c0Var.i();
        }
        v0 v0Var = this.e;
        v0Var.h = 0;
        v0Var.g = 0.0d;
        ByteBuffer byteBuffer = v0Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(r0 r0Var, int i9, boolean z10, z zVar) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new m8(this, r0Var, i9, z10, zVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a6.a d(r0 r0Var, int i9, RectF rectF) {
        a6.a m10;
        m5.c0 c0Var;
        Object obj;
        boolean z10;
        m mVar = this.i;
        if (r0Var != null) {
            mVar = r0Var.e;
        }
        m mVar2 = mVar;
        if (this.F == null || !(((z10 = mVar2 instanceof b)) || (mVar2 instanceof d))) {
            m10 = m(rectF, false);
        } else {
            boolean z11 = this.E;
            if (rectF != null && rectF.setIntersect(rectF, f())) {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).c;
                Object obj2 = this.a.b;
                a6.a aVar = new a6.a(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).c;
                Object obj3 = this.a.b;
                ((c1) this.a.b).b.b(UUID.randomUUID(), new bg.d(this, aVar, new a6.a(byteBuffer2, 1, rectF), z11, 28));
                m10 = aVar;
            } else {
                m10 = null;
            }
            this.E = z10;
        }
        this.s++;
        int i10 = (this.F == null || !((mVar2 instanceof b) || (mVar2 instanceof d))) ? 1 : 2;
        for (int i11 = 0; i11 < i10; i11++) {
            GLES20.glBindFramebuffer(36160, i());
            int j10 = j();
            if (this.F != null && (((mVar2 instanceof b) && i11 == 0) || ((mVar2 instanceof d) && i11 == 1))) {
                r1 r1Var = this.D;
                j10 = r1Var != null ? r1Var.c() : 0;
            }
            if (i11 == 1 && (mVar2 instanceof b)) {
                mVar2 = new d();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j10, 0);
            qu0 qu0Var = this.g;
            GLES20.glViewport(0, 0, (int) qu0Var.a, (int) qu0Var.b);
            d1 d1Var = (d1) this.r.get(mVar2.i(1));
            if (d1Var == null) {
                return null;
            }
            GLES20.glUseProgram(d1Var.a);
            GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(d1Var.d("texture"), 0);
            GLES20.glUniform1i(d1Var.d("mask"), 1);
            d1.a(d1Var.d("color"), i0.a.k(i9, (int) (mVar2.f() * Color.alpha(i9))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j10);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (mVar2 instanceof b) {
                GLES20.glUniform1i(d1Var.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                ba baVar = this.F;
                if (baVar != null) {
                    obj = baVar.h;
                    ha haVar = baVar.m;
                    GLES20.glBindTexture(3553, haVar != null ? haVar.s[2] : -1);
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
        if (this.s <= 0 && (c0Var = this.a) != null) {
            c0Var.i();
        }
        this.s--;
        v0 v0Var = this.e;
        v0Var.h = 0;
        v0Var.g = 0.0d;
        ByteBuffer byteBuffer3 = v0Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m10;
    }

    public final a6.a e(f1 f1Var, int i9, RectF rectF) {
        m mVar = f1Var.a;
        if (mVar == null) {
            mVar = this.i;
        }
        a6.a m10 = m(rectF, this.F != null && (mVar instanceof b));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        qu0 qu0Var = this.g;
        GLES20.glViewport(0, 0, (int) qu0Var.a, (int) qu0Var.b);
        d1 d1Var = (d1) this.r.get(mVar.i(1));
        if (d1Var == null) {
            return null;
        }
        GLES20.glUseProgram(d1Var.a);
        GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(d1Var.d("texture"), 0);
        GLES20.glUniform1i(d1Var.d("mask"), 1);
        d1.a(d1Var.d("color"), i9);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.z != null) {
            GLES20.glUniform1i(d1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(d1Var.d(TeXSymbolParser.TYPE_ATTR), f1Var.a.o());
            GLES20.glUniform2f(d1Var.d("resolution"), qu0Var.a, qu0Var.b);
            GLES20.glUniform2f(d1Var.d("center"), f1Var.b, f1Var.c);
            GLES20.glUniform2f(d1Var.d("radius"), f1Var.d, f1Var.e);
            GLES20.glUniform1f(d1Var.d("thickness"), f1Var.f);
            GLES20.glUniform1f(d1Var.d("rounding"), f1Var.g);
            GLES20.glUniform2f(d1Var.d("middle"), f1Var.i, f1Var.j);
            GLES20.glUniform1f(d1Var.d("rotation"), f1Var.h);
            GLES20.glUniform1i(d1Var.d("fill"), f1Var.l ? 1 : 0);
            GLES20.glUniform1f(d1Var.d("arrowTriangleLength"), f1Var.k);
            GLES20.glUniform1i(d1Var.d("composite"), 1);
            GLES20.glUniform1i(d1Var.d("clear"), 0);
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
        m5.c0 c0Var = this.a;
        if (c0Var != null && this.s <= 0) {
            c0Var.i();
        }
        this.s--;
        v0 v0Var = this.e;
        v0Var.h = 0;
        v0Var.g = 0.0d;
        ByteBuffer byteBuffer = v0Var.j;
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
        qu0 qu0Var = this.g;
        return new RectF(0.0f, 0.0f, qu0Var.a, qu0Var.b);
    }

    public final int g() {
        if (this.p == 0) {
            this.p = r1.b(this.g);
        }
        return this.p;
    }

    public final w4.e h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        r1 r1Var;
        w4.e eVar;
        d1 d1Var;
        r1 r1Var2;
        int i9 = (int) rectF.left;
        int i10 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.t, 0);
        int i11 = this.t[0];
        GLES20.glBindFramebuffer(36160, i11);
        GLES20.glGenTextures(1, this.t, 0);
        int i12 = this.t[0];
        GLES20.glBindTexture(3553, i12);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i12, 0);
        qu0 qu0Var = this.g;
        GLES20.glViewport(0, 0, (int) qu0Var.a, (int) qu0Var.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            d1 d1Var2 = (d1) map.get(z10 ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (d1Var2 != null) {
                GLES20.glUseProgram(d1Var2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i9, -i10);
                float[] c10 = h8.c(this.x, h8.a(matrix));
                GLES20.glUniformMatrix4fv(d1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (z10 || !this.G) {
                    GLES20.glUniform1i(d1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (r1Var = this.D) == null) ? j() : r1Var.c());
                } else {
                    GLES20.glUniform1i(d1Var2.d("texture"), 1);
                    GLES20.glUniform1i(d1Var2.d("mask"), 0);
                    GLES20.glUniform1f(d1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (r1Var2 = this.D) == null) ? j() : r1Var2.c());
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
                if (z12 && !z11 && (d1Var = (d1) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(d1Var.a);
                    GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(d1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(d1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ha haVar = this.F.m;
                    GLES20.glBindTexture(3553, haVar != null ? haVar.s[2] : -1);
                    GLES20.glUniform1f(d1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("mask"), 2);
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
                    eVar = new w4.e(9, obj, this.u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    eVar = new w4.e(9, createBitmap, obj);
                }
                this.u.rewind();
                int[] iArr = this.t;
                iArr[0] = i11;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.t;
                iArr2[0] = i12;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return eVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.o = iArr[0];
            j8.a();
        }
        return this.o;
    }

    public final int j() {
        r1 r1Var = this.k;
        if (r1Var != null) {
            return r1Var.c();
        }
        return 0;
    }

    public final void k(f1 f1Var) {
        if (f1Var == null) {
            return;
        }
        this.f.f(new l0(this, f1Var, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(r0 r0Var, boolean z10, boolean z11) {
        int i9;
        m5.c0 c0Var;
        RectF rectF;
        u0 u0Var;
        float f10;
        double d;
        boolean z12;
        u0 u0Var2;
        float f11;
        u0[] u0VarArr;
        double d9;
        float f12;
        float f13;
        char c10;
        char c11;
        this.b = r0Var;
        if (r0Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        j8.a();
        RectF rectF2 = null;
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            qu0 qu0Var = this.g;
            GLES20.glViewport(0, 0, (int) qu0Var.a, (int) qu0Var.b);
            if (z10) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
            }
            Map map = this.r;
            if (map == null) {
                return;
            }
            m mVar = r0Var.e;
            d1 d1Var = (d1) map.get(mVar.i(2));
            if (d1Var == null) {
                return;
            }
            GLES20.glUseProgram(d1Var.a);
            r1 r1Var = (r1) this.j.get(Integer.valueOf(mVar.l()));
            if (r1Var == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                r1Var = new r1(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), mVar.l(), options));
                this.j.put(Integer.valueOf(mVar.l()), r1Var);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, r1Var.c());
            GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(d1Var.d("texture"), 0);
            if (z11) {
                this.e.f = 1.0f;
            } else {
                this.e.f = this.f.getScaleX();
            }
            v0 v0Var = this.e;
            v0Var.a = r0Var.d;
            v0Var.b = r0Var.e.k();
            v0Var.c = z11 ? 1.0f : r0Var.e.a();
            v0Var.d = r0Var.e.b();
            v0Var.e = r0Var.e.h();
            Vector vector = r0Var.b;
            int size = vector == null ? 0 : vector.size();
            if (size != 0) {
                if (size == 1) {
                    Vector vector2 = r0Var.b;
                    u0[] u0VarArr2 = new u0[vector2.size()];
                    vector2.toArray(u0VarArr2);
                    u0 u0Var3 = u0VarArr2[0];
                    float f14 = ((v0Var.a * v0Var.e) * 1.0f) / v0Var.f;
                    u0Var3.getClass();
                    PointF pointF = new PointF((float) u0Var3.a, (float) u0Var3.b);
                    float f15 = Math.abs(v0Var.d) > 0.0f ? v0Var.d : 0.0f;
                    float f16 = v0Var.c;
                    v0Var.c();
                    v0Var.b(1);
                    v0Var.a(pointF, f14, f15, f16, 0);
                } else {
                    Vector vector3 = r0Var.b;
                    int size2 = vector3.size();
                    u0[] u0VarArr3 = new u0[size2];
                    vector3.toArray(u0VarArr3);
                    v0Var.c();
                    int i10 = 0;
                    while (i10 < size2 - 1) {
                        u0 u0Var4 = u0VarArr3[i10];
                        int i11 = i10 + 1;
                        u0 u0Var5 = u0VarArr3[i11];
                        double a2 = u0Var4.a(u0Var5);
                        int i12 = size2;
                        double d10 = u0Var5.a - u0Var4.a;
                        double d11 = u0Var5.b - u0Var4.b;
                        double d12 = u0Var5.c;
                        double d13 = d12 - u0Var4.c;
                        u0 u0Var6 = new u0(1.0d, 1.0d, 0.0d);
                        float atan2 = Math.abs(v0Var.d) > 0.0f ? v0Var.d : (float) Math.atan2(d11, d10);
                        float f17 = (float) ((((v0Var.a * d12) * v0Var.e) * 1.0d) / v0Var.f);
                        double max = Math.max(1.0f, v0Var.b * f17);
                        if (a2 > 0.0d) {
                            double d14 = 1.0d / a2;
                            u0Var = new u0(d10 * d14, d11 * d14, d13 * d14);
                        } else {
                            u0Var = u0Var6;
                        }
                        float min = Math.min(1.0f, v0Var.c * 1.15f);
                        boolean z13 = u0Var4.d;
                        boolean z14 = u0Var5.d;
                        float f18 = atan2;
                        int ceil = (int) Math.ceil((a2 - v0Var.g) / max);
                        int i13 = v0Var.h;
                        v0Var.b(ceil);
                        ByteBuffer byteBuffer = v0Var.j;
                        if (byteBuffer == null || i13 < 0) {
                            f10 = f17;
                        } else {
                            f10 = f17;
                            if (i13 < v0Var.i) {
                                byteBuffer.position(i13 * 20);
                            }
                        }
                        double d15 = v0Var.g;
                        u0 u0Var7 = new u0(u0Var4.a + (u0Var.a * d15), u0Var4.b + (u0Var.b * d15), u0Var4.c + (u0Var.c * d15));
                        double d16 = d15;
                        u0 u0Var8 = u0Var7;
                        boolean z15 = true;
                        while (true) {
                            if (d16 > a2) {
                                d = d16;
                                z12 = z14;
                                u0Var2 = u0Var5;
                                f11 = f10;
                                u0VarArr = u0VarArr3;
                                d9 = a2;
                                f12 = f18;
                                break;
                            }
                            float f19 = z13 ? min : v0Var.c;
                            d = d16;
                            z12 = z14;
                            u0[] u0VarArr4 = u0VarArr3;
                            d9 = a2;
                            f12 = f18;
                            float f20 = f19;
                            u0 u0Var9 = u0Var8;
                            u0Var2 = u0Var5;
                            f11 = f10;
                            boolean a3 = v0Var.a(new PointF((float) u0Var8.a, (float) u0Var8.b), f11, f12, f20, -1);
                            if (!a3) {
                                u0VarArr = u0VarArr4;
                                z15 = a3;
                                break;
                            }
                            u0 u0Var10 = new u0(u0Var9.a + (u0Var.a * max), u0Var9.b + (u0Var.b * max), u0Var9.c + (u0Var.c * max));
                            z15 = a3;
                            f18 = f12;
                            u0Var8 = u0Var10;
                            a2 = d9;
                            u0VarArr3 = u0VarArr4;
                            z14 = z12;
                            f10 = f11;
                            u0Var5 = u0Var2;
                            d16 = d + max;
                            z13 = false;
                        }
                        if (z15 && z12) {
                            v0Var.b(1);
                            v0Var.a(new PointF((float) u0Var2.a, (float) u0Var2.b), f11, f12, min, -1);
                        }
                        v0Var.g = d - d9;
                        size2 = i12;
                        i10 = i11;
                        u0VarArr3 = u0VarArr;
                    }
                }
                r0Var.a = v0Var.g;
                rectF2 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                int i14 = v0Var.h;
                if (i14 > 0) {
                    int i15 = i14 - 1;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i15 * 2) + (i14 * 4)) * 20);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                    asFloatBuffer.position(0);
                    ByteBuffer byteBuffer2 = v0Var.j;
                    if (byteBuffer2 != null && v0Var.i > 0) {
                        byteBuffer2.position(0);
                    }
                    int i16 = 0;
                    for (int i17 = 0; i17 < i14; i17++) {
                        float f21 = v0Var.j.getFloat();
                        float f22 = v0Var.j.getFloat();
                        float f23 = v0Var.j.getFloat();
                        float f24 = v0Var.j.getFloat();
                        float f25 = v0Var.j.getFloat();
                        RectF rectF3 = new RectF(f21 - f23, f22 - f23, f21 + f23, f22 + f23);
                        float f26 = rectF3.left;
                        float f27 = rectF3.top;
                        float f28 = rectF3.right;
                        float f29 = rectF3.bottom;
                        float[] fArr = {f26, f27, f28, f27, f26, f29, f28, f29};
                        float centerX = rectF3.centerX();
                        float centerY = rectF3.centerY();
                        Matrix matrix = new Matrix();
                        matrix.setRotate((float) Math.toDegrees(f24), centerX, centerY);
                        matrix.mapPoints(fArr);
                        matrix.mapRect(rectF3);
                        rectF3.left = (int) Math.floor(rectF3.left);
                        rectF3.top = (int) Math.floor(rectF3.top);
                        rectF3.right = (int) Math.ceil(rectF3.right);
                        rectF3.bottom = (int) Math.ceil(rectF3.bottom);
                        rectF2.union(rectF3);
                        if (i16 != 0) {
                            c10 = 0;
                            asFloatBuffer.put(fArr[0]);
                            c11 = 1;
                            asFloatBuffer.put(fArr[1]);
                            f13 = 0.0f;
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(f25);
                            i16++;
                        } else {
                            f13 = 0.0f;
                            c10 = 0;
                            c11 = 1;
                        }
                        asFloatBuffer.put(fArr[c10]);
                        asFloatBuffer.put(fArr[c11]);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(f25);
                        asFloatBuffer.put(fArr[2]);
                        asFloatBuffer.put(fArr[3]);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(f25);
                        asFloatBuffer.put(fArr[4]);
                        asFloatBuffer.put(fArr[5]);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f25);
                        asFloatBuffer.put(fArr[6]);
                        asFloatBuffer.put(fArr[7]);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f25);
                        int i18 = i16 + 4;
                        if (i17 != i15) {
                            asFloatBuffer.put(fArr[6]);
                            asFloatBuffer.put(fArr[7]);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(f25);
                            i16 += 5;
                        } else {
                            i16 = i18;
                        }
                    }
                    asFloatBuffer.position(0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(0);
                    asFloatBuffer.position(2);
                    GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(1);
                    asFloatBuffer.position(4);
                    GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(2);
                    i9 = 0;
                    GLES20.glDrawArrays(5, 0, i16);
                    GLES20.glBindFramebuffer(36160, i9);
                    c0Var = this.a;
                    if (c0Var != null) {
                        c0Var.i();
                    }
                    rectF = this.h;
                    if (rectF == null) {
                        rectF.union(rectF2);
                        return;
                    } else {
                        this.h = rectF2;
                        return;
                    }
                }
            }
        }
        i9 = 0;
        GLES20.glBindFramebuffer(36160, i9);
        c0Var = this.a;
        if (c0Var != null) {
        }
        rectF = this.h;
        if (rectF == null) {
        }
    }

    public final a6.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z10, false).c;
        Object obj = this.a.b;
        a6.a aVar = new a6.a(byteBuffer, z10 ? 1 : 0, rectF);
        ((c1) this.a.b).b.b(UUID.randomUUID(), new n0(this, aVar, 1));
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i9, r0 r0Var, float f10) {
        Object obj;
        if (r0Var == null) {
            return;
        }
        m mVar = r0Var.e;
        if (mVar == null) {
            mVar = this.i;
        }
        boolean z10 = this.G && ((mVar instanceof f) || (mVar instanceof d));
        Map map = this.r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mVar.i(0));
        sb2.append(z10 ? "_masking" : "");
        d1 d1Var = (d1) map.get(sb2.toString());
        if (d1Var == null) {
            return;
        }
        GLES20.glUseProgram(d1Var.a);
        GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(d1Var.d("texture"), 0);
        GLES20.glUniform1i(d1Var.d("mask"), 1);
        d1.a(d1Var.d("color"), i0.a.k(r0Var.c, (int) (mVar.f() * Color.alpha(r0) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i9);
        if (z10) {
            GLES20.glUniform1i(d1Var.d("otexture"), 2);
            GLES20.glUniform1f(d1Var.d("preview"), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.l.c());
        }
        if (mVar instanceof b) {
            GLES20.glUniform1i(d1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            ba baVar = this.F;
            if (baVar != null) {
                obj = baVar.h;
                ha haVar = baVar.m;
                GLES20.glBindTexture(3553, haVar != null ? haVar.s[2] : -1);
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
                j8.a();
            }
            r1 r1Var = this.z;
            if (r1Var != null) {
                GLES20.glBindTexture(3553, r1Var.c());
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
        j8.a();
    }

    public final void o(int i9, int i10, f1 f1Var, float f10) {
        d1 d1Var;
        if (f1Var == null) {
            return;
        }
        m mVar = this.i;
        l lVar = f1Var.a;
        if (lVar != null && i9 == this.q) {
            mVar = lVar;
        }
        if (mVar == null || this.f == null || (d1Var = (d1) this.r.get(mVar.i(0))) == null) {
            return;
        }
        GLES20.glUseProgram(d1Var.a);
        GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(d1Var.d("texture"), 0);
        GLES20.glUniform1i(d1Var.d("mask"), 1);
        d1.a(d1Var.d("color"), i0.a.k(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i9);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i10);
        if (mVar instanceof l) {
            GLES20.glUniform1i(d1Var.d(TeXSymbolParser.TYPE_ATTR), ((l) mVar).o());
            int d = d1Var.d("resolution");
            qu0 qu0Var = this.g;
            GLES20.glUniform2f(d, qu0Var.a, qu0Var.b);
            GLES20.glUniform2f(d1Var.d("center"), f1Var.b, f1Var.c);
            GLES20.glUniform2f(d1Var.d("radius"), f1Var.d, f1Var.e);
            GLES20.glUniform1f(d1Var.d("thickness"), f1Var.f);
            GLES20.glUniform1f(d1Var.d("rounding"), f1Var.g);
            GLES20.glUniform2f(d1Var.d("middle"), f1Var.i, f1Var.j);
            GLES20.glUniform1f(d1Var.d("rotation"), f1Var.h);
            GLES20.glUniform1i(d1Var.d("fill"), f1Var.l ? 1 : 0);
            GLES20.glUniform1f(d1Var.d("arrowTriangleLength"), f1Var.k);
            GLES20.glUniform1i(d1Var.d("composite"), 0);
            GLES20.glUniform1i(d1Var.d("clear"), f1Var == this.d ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        j8.a();
    }

    public final void p(a6.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        m5.c0 c0Var;
        r1 r1Var;
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
        } catch (Exception e10) {
            FileLog.e(e10);
            byteBuffer = null;
        }
        int j10 = j();
        if (aVar.c == 1 && (r1Var = this.D) != null) {
            j10 = r1Var.c();
        }
        GLES20.glBindTexture(3553, j10);
        RectF rectF = (RectF) aVar.b;
        GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.b).height(), 6408, 5121, byteBuffer);
        if (this.s <= 0 && (c0Var = this.a) != null) {
            c0Var.i();
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
            int i9 = this.B;
            if (i9 == 90 || i9 == 270 || i9 == -90) {
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
            canvas.rotate(i9);
            if (i9 == 90) {
                canvas.translate(0.0f, -width);
            } else if (i9 == 180) {
                canvas.translate(-width, -height);
            } else if (i9 == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.M);
            canvas.restore();
            c1 c1Var = this.f;
            if (c1Var != null && (c10 = c1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            r1 r1Var = this.z;
            if (r1Var != null) {
                r1Var.a(false);
            }
            this.z = new r1(this.C);
        }
    }
}
