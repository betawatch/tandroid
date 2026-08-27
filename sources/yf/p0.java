package yf;

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
import h7.l8;
import h7.n8;
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
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.z9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public q1 D;
    public boolean E;
    public final z9 F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public n1.d a;
    public q0 b;
    public e1 c;
    public e1 d;
    public b1 f;
    public final tu0 g;
    public RectF h;
    public m i;
    public q1 k;
    public q1 l;
    public final ByteBuffer m;
    public final ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public Map r;
    public int s;
    public final ByteBuffer u;
    public boolean v;
    public b6.a w;
    public final float[] x;
    public float[] y;
    public q1 z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final u0 e = new u0();

    public p0(tu0 tu0Var, Bitmap bitmap, int i10, z9 z9Var) {
        this.F = z9Var;
        this.g = tu0Var;
        this.A = bitmap;
        this.B = i10;
        this.u = ByteBuffer.allocateDirect(((int) tu0Var.a) * ((int) tu0Var.b) * 4);
        this.x = l8.b(tu0Var.a, tu0Var.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(tu0Var.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(tu0Var.b);
        this.m.putFloat(tu0Var.a);
        this.m.putFloat(tu0Var.b);
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
        q1 q1Var = this.k;
        if (q1Var != null) {
            q1Var.a(z10);
        }
        q1 q1Var2 = this.D;
        if (q1Var2 != null) {
            q1Var2.a(z10);
        }
        int i11 = this.p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (q1 q1Var3 : hashMap.values()) {
            if (q1Var3 != null) {
                q1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        q1 q1Var4 = this.z;
        if (q1Var4 != null) {
            q1Var4.a(true);
        }
        q1 q1Var5 = this.l;
        if (q1Var5 != null) {
            q1Var5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (c1 c1Var : map.values()) {
                if (c1Var.a != 0) {
                    GLES20.glDeleteProgram(0);
                    c1Var.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        n8.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            tu0 tu0Var = this.g;
            GLES20.glViewport(0, 0, (int) tu0Var.a, (int) tu0Var.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        n1.d dVar = this.a;
        if (dVar != null) {
            dVar.C();
        }
        u0 u0Var = this.e;
        u0Var.h = 0;
        u0Var.g = 0.0d;
        ByteBuffer byteBuffer = u0Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(q0 q0Var, int i10, boolean z10, z zVar) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new hh.l8(this, q0Var, i10, z10, zVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b6.a d(q0 q0Var, int i10, RectF rectF) {
        b6.a m10;
        n1.d dVar;
        Object obj;
        boolean z10;
        m mVar = this.i;
        if (q0Var != null) {
            mVar = q0Var.e;
        }
        m mVar2 = mVar;
        if (this.F == null || !(((z10 = mVar2 instanceof b)) || (mVar2 instanceof d))) {
            m10 = m(rectF, false);
        } else {
            boolean z11 = this.E;
            if (rectF != null && rectF.setIntersect(rectF, f())) {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).c;
                Object obj2 = this.a.b;
                b6.a aVar = new b6.a(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).c;
                Object obj3 = this.a.b;
                ((b1) this.a.b).b.b(UUID.randomUUID(), new cg.c(this, aVar, new b6.a(byteBuffer2, 1, rectF), z11, 28));
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
                q1 q1Var = this.D;
                j10 = q1Var != null ? q1Var.c() : 0;
            }
            if (i12 == 1 && (mVar2 instanceof b)) {
                mVar2 = new d();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j10, 0);
            tu0 tu0Var = this.g;
            GLES20.glViewport(0, 0, (int) tu0Var.a, (int) tu0Var.b);
            c1 c1Var = (c1) this.r.get(mVar2.i(1));
            if (c1Var == null) {
                return null;
            }
            GLES20.glUseProgram(c1Var.a);
            GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(c1Var.d("texture"), 0);
            GLES20.glUniform1i(c1Var.d("mask"), 1);
            c1.a(c1Var.d("color"), i0.b.k(i10, (int) (mVar2.f() * Color.alpha(i10))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j10);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (mVar2 instanceof b) {
                GLES20.glUniform1i(c1Var.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                z9 z9Var = this.F;
                if (z9Var != null) {
                    obj = z9Var.h;
                    fa faVar = z9Var.m;
                    GLES20.glBindTexture(3553, faVar != null ? faVar.s[2] : -1);
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
        if (this.s <= 0 && (dVar = this.a) != null) {
            dVar.C();
        }
        this.s--;
        u0 u0Var = this.e;
        u0Var.h = 0;
        u0Var.g = 0.0d;
        ByteBuffer byteBuffer3 = u0Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m10;
    }

    public final b6.a e(e1 e1Var, int i10, RectF rectF) {
        m mVar = e1Var.a;
        if (mVar == null) {
            mVar = this.i;
        }
        b6.a m10 = m(rectF, this.F != null && (mVar instanceof b));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        tu0 tu0Var = this.g;
        GLES20.glViewport(0, 0, (int) tu0Var.a, (int) tu0Var.b);
        c1 c1Var = (c1) this.r.get(mVar.i(1));
        if (c1Var == null) {
            return null;
        }
        GLES20.glUseProgram(c1Var.a);
        GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(c1Var.d("texture"), 0);
        GLES20.glUniform1i(c1Var.d("mask"), 1);
        c1.a(c1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.z != null) {
            GLES20.glUniform1i(c1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(c1Var.d(TeXSymbolParser.TYPE_ATTR), e1Var.a.o());
            GLES20.glUniform2f(c1Var.d("resolution"), tu0Var.a, tu0Var.b);
            GLES20.glUniform2f(c1Var.d("center"), e1Var.b, e1Var.c);
            GLES20.glUniform2f(c1Var.d("radius"), e1Var.d, e1Var.e);
            GLES20.glUniform1f(c1Var.d("thickness"), e1Var.f);
            GLES20.glUniform1f(c1Var.d("rounding"), e1Var.g);
            GLES20.glUniform2f(c1Var.d("middle"), e1Var.i, e1Var.j);
            GLES20.glUniform1f(c1Var.d("rotation"), e1Var.h);
            GLES20.glUniform1i(c1Var.d("fill"), e1Var.l ? 1 : 0);
            GLES20.glUniform1f(c1Var.d("arrowTriangleLength"), e1Var.k);
            GLES20.glUniform1i(c1Var.d("composite"), 1);
            GLES20.glUniform1i(c1Var.d("clear"), 0);
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
        n1.d dVar = this.a;
        if (dVar != null && this.s <= 0) {
            dVar.C();
        }
        this.s--;
        u0 u0Var = this.e;
        u0Var.h = 0;
        u0Var.g = 0.0d;
        ByteBuffer byteBuffer = u0Var.j;
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
        tu0 tu0Var = this.g;
        return new RectF(0.0f, 0.0f, tu0Var.a, tu0Var.b);
    }

    public final int g() {
        if (this.p == 0) {
            this.p = q1.b(this.g);
        }
        return this.p;
    }

    public final w3.b0 h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        q1 q1Var;
        w3.b0 b0Var;
        c1 c1Var;
        q1 q1Var2;
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
        tu0 tu0Var = this.g;
        GLES20.glViewport(0, 0, (int) tu0Var.a, (int) tu0Var.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            c1 c1Var2 = (c1) map.get(z10 ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (c1Var2 != null) {
                GLES20.glUseProgram(c1Var2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i10, -i11);
                float[] c10 = l8.c(this.x, l8.a(matrix));
                GLES20.glUniformMatrix4fv(c1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (z10 || !this.G) {
                    GLES20.glUniform1i(c1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (q1Var = this.D) == null) ? j() : q1Var.c());
                } else {
                    GLES20.glUniform1i(c1Var2.d("texture"), 1);
                    GLES20.glUniform1i(c1Var2.d("mask"), 0);
                    GLES20.glUniform1f(c1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (q1Var2 = this.D) == null) ? j() : q1Var2.c());
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
                if (z12 && !z11 && (c1Var = (c1) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(c1Var.a);
                    GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(c1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(c1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(c1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    fa faVar = this.F.m;
                    GLES20.glBindTexture(3553, faVar != null ? faVar.s[2] : -1);
                    GLES20.glUniform1f(c1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(c1Var.d("mask"), 2);
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
                    b0Var = new w3.b0(11, obj, this.u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    b0Var = new w3.b0(11, createBitmap, obj);
                }
                this.u.rewind();
                int[] iArr = this.t;
                iArr[0] = i12;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.t;
                iArr2[0] = i13;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return b0Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.o = iArr[0];
            n8.a();
        }
        return this.o;
    }

    public final int j() {
        q1 q1Var = this.k;
        if (q1Var != null) {
            return q1Var.c();
        }
        return 0;
    }

    public final void k(e1 e1Var) {
        if (e1Var == null) {
            return;
        }
        this.f.f(new l0(this, e1Var, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(q0 q0Var, boolean z10, boolean z11) {
        int i10;
        n1.d dVar;
        RectF rectF;
        t0 t0Var;
        float f10;
        double d;
        boolean z12;
        t0 t0Var2;
        float f11;
        t0[] t0VarArr;
        double d10;
        float f12;
        float f13;
        char c10;
        char c11;
        this.b = q0Var;
        if (q0Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        n8.a();
        RectF rectF2 = null;
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            tu0 tu0Var = this.g;
            GLES20.glViewport(0, 0, (int) tu0Var.a, (int) tu0Var.b);
            if (z10) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
            }
            Map map = this.r;
            if (map == null) {
                return;
            }
            m mVar = q0Var.e;
            c1 c1Var = (c1) map.get(mVar.i(2));
            if (c1Var == null) {
                return;
            }
            GLES20.glUseProgram(c1Var.a);
            q1 q1Var = (q1) this.j.get(Integer.valueOf(mVar.l()));
            if (q1Var == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                q1Var = new q1(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), mVar.l(), options));
                this.j.put(Integer.valueOf(mVar.l()), q1Var);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, q1Var.c());
            GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(c1Var.d("texture"), 0);
            if (z11) {
                this.e.f = 1.0f;
            } else {
                this.e.f = this.f.getScaleX();
            }
            u0 u0Var = this.e;
            u0Var.a = q0Var.d;
            u0Var.b = q0Var.e.k();
            u0Var.c = z11 ? 1.0f : q0Var.e.a();
            u0Var.d = q0Var.e.b();
            u0Var.e = q0Var.e.h();
            Vector vector = q0Var.b;
            int size = vector == null ? 0 : vector.size();
            if (size != 0) {
                if (size == 1) {
                    Vector vector2 = q0Var.b;
                    t0[] t0VarArr2 = new t0[vector2.size()];
                    vector2.toArray(t0VarArr2);
                    t0 t0Var3 = t0VarArr2[0];
                    float f14 = ((u0Var.a * u0Var.e) * 1.0f) / u0Var.f;
                    t0Var3.getClass();
                    PointF pointF = new PointF((float) t0Var3.a, (float) t0Var3.b);
                    float f15 = Math.abs(u0Var.d) > 0.0f ? u0Var.d : 0.0f;
                    float f16 = u0Var.c;
                    u0Var.c();
                    u0Var.b(1);
                    u0Var.a(pointF, f14, f15, f16, 0);
                } else {
                    Vector vector3 = q0Var.b;
                    int size2 = vector3.size();
                    t0[] t0VarArr3 = new t0[size2];
                    vector3.toArray(t0VarArr3);
                    u0Var.c();
                    int i11 = 0;
                    while (i11 < size2 - 1) {
                        t0 t0Var4 = t0VarArr3[i11];
                        int i12 = i11 + 1;
                        t0 t0Var5 = t0VarArr3[i12];
                        double a2 = t0Var4.a(t0Var5);
                        int i13 = size2;
                        double d11 = t0Var5.a - t0Var4.a;
                        double d12 = t0Var5.b - t0Var4.b;
                        double d13 = t0Var5.c;
                        double d14 = d13 - t0Var4.c;
                        t0 t0Var6 = new t0(1.0d, 1.0d, 0.0d);
                        float atan2 = Math.abs(u0Var.d) > 0.0f ? u0Var.d : (float) Math.atan2(d12, d11);
                        float f17 = (float) ((((u0Var.a * d13) * u0Var.e) * 1.0d) / u0Var.f);
                        double max = Math.max(1.0f, u0Var.b * f17);
                        if (a2 > 0.0d) {
                            double d15 = 1.0d / a2;
                            t0Var = new t0(d11 * d15, d12 * d15, d14 * d15);
                        } else {
                            t0Var = t0Var6;
                        }
                        float min = Math.min(1.0f, u0Var.c * 1.15f);
                        boolean z13 = t0Var4.d;
                        boolean z14 = t0Var5.d;
                        float f18 = atan2;
                        int ceil = (int) Math.ceil((a2 - u0Var.g) / max);
                        int i14 = u0Var.h;
                        u0Var.b(ceil);
                        ByteBuffer byteBuffer = u0Var.j;
                        if (byteBuffer == null || i14 < 0) {
                            f10 = f17;
                        } else {
                            f10 = f17;
                            if (i14 < u0Var.i) {
                                byteBuffer.position(i14 * 20);
                            }
                        }
                        double d16 = u0Var.g;
                        t0 t0Var7 = new t0(t0Var4.a + (t0Var.a * d16), t0Var4.b + (t0Var.b * d16), t0Var4.c + (t0Var.c * d16));
                        double d17 = d16;
                        t0 t0Var8 = t0Var7;
                        boolean z15 = true;
                        while (true) {
                            if (d17 > a2) {
                                d = d17;
                                z12 = z14;
                                t0Var2 = t0Var5;
                                f11 = f10;
                                t0VarArr = t0VarArr3;
                                d10 = a2;
                                f12 = f18;
                                break;
                            }
                            float f19 = z13 ? min : u0Var.c;
                            d = d17;
                            z12 = z14;
                            t0[] t0VarArr4 = t0VarArr3;
                            d10 = a2;
                            f12 = f18;
                            float f20 = f19;
                            t0 t0Var9 = t0Var8;
                            t0Var2 = t0Var5;
                            f11 = f10;
                            boolean a3 = u0Var.a(new PointF((float) t0Var8.a, (float) t0Var8.b), f11, f12, f20, -1);
                            if (!a3) {
                                t0VarArr = t0VarArr4;
                                z15 = a3;
                                break;
                            }
                            t0 t0Var10 = new t0(t0Var9.a + (t0Var.a * max), t0Var9.b + (t0Var.b * max), t0Var9.c + (t0Var.c * max));
                            z15 = a3;
                            f18 = f12;
                            t0Var8 = t0Var10;
                            a2 = d10;
                            t0VarArr3 = t0VarArr4;
                            z14 = z12;
                            f10 = f11;
                            t0Var5 = t0Var2;
                            d17 = d + max;
                            z13 = false;
                        }
                        if (z15 && z12) {
                            u0Var.b(1);
                            u0Var.a(new PointF((float) t0Var2.a, (float) t0Var2.b), f11, f12, min, -1);
                        }
                        u0Var.g = d - d10;
                        size2 = i13;
                        i11 = i12;
                        t0VarArr3 = t0VarArr;
                    }
                }
                q0Var.a = u0Var.g;
                rectF2 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                int i15 = u0Var.h;
                if (i15 > 0) {
                    int i16 = i15 - 1;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i16 * 2) + (i15 * 4)) * 20);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                    asFloatBuffer.position(0);
                    ByteBuffer byteBuffer2 = u0Var.j;
                    if (byteBuffer2 != null && u0Var.i > 0) {
                        byteBuffer2.position(0);
                    }
                    int i17 = 0;
                    for (int i18 = 0; i18 < i15; i18++) {
                        float f21 = u0Var.j.getFloat();
                        float f22 = u0Var.j.getFloat();
                        float f23 = u0Var.j.getFloat();
                        float f24 = u0Var.j.getFloat();
                        float f25 = u0Var.j.getFloat();
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
                        if (i17 != 0) {
                            c10 = 0;
                            asFloatBuffer.put(fArr[0]);
                            c11 = 1;
                            asFloatBuffer.put(fArr[1]);
                            f13 = 0.0f;
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(f25);
                            i17++;
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
                        int i19 = i17 + 4;
                        if (i18 != i16) {
                            asFloatBuffer.put(fArr[6]);
                            asFloatBuffer.put(fArr[7]);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(f25);
                            i17 += 5;
                        } else {
                            i17 = i19;
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
                    i10 = 0;
                    GLES20.glDrawArrays(5, 0, i17);
                    GLES20.glBindFramebuffer(36160, i10);
                    dVar = this.a;
                    if (dVar != null) {
                        dVar.C();
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
        i10 = 0;
        GLES20.glBindFramebuffer(36160, i10);
        dVar = this.a;
        if (dVar != null) {
        }
        rectF = this.h;
        if (rectF == null) {
        }
    }

    public final b6.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z10, false).c;
        Object obj = this.a.b;
        b6.a aVar = new b6.a(byteBuffer, z10 ? 1 : 0, rectF);
        ((b1) this.a.b).b.b(UUID.randomUUID(), new n0(this, aVar, 1));
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i10, q0 q0Var, float f10) {
        Object obj;
        if (q0Var == null) {
            return;
        }
        m mVar = q0Var.e;
        if (mVar == null) {
            mVar = this.i;
        }
        boolean z10 = this.G && ((mVar instanceof f) || (mVar instanceof d));
        Map map = this.r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mVar.i(0));
        sb2.append(z10 ? "_masking" : "");
        c1 c1Var = (c1) map.get(sb2.toString());
        if (c1Var == null) {
            return;
        }
        GLES20.glUseProgram(c1Var.a);
        GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(c1Var.d("texture"), 0);
        GLES20.glUniform1i(c1Var.d("mask"), 1);
        c1.a(c1Var.d("color"), i0.b.k(q0Var.c, (int) (mVar.f() * Color.alpha(r0) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i10);
        if (z10) {
            GLES20.glUniform1i(c1Var.d("otexture"), 2);
            GLES20.glUniform1f(c1Var.d("preview"), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.l.c());
        }
        if (mVar instanceof b) {
            GLES20.glUniform1i(c1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            z9 z9Var = this.F;
            if (z9Var != null) {
                obj = z9Var.h;
                fa faVar = z9Var.m;
                GLES20.glBindTexture(3553, faVar != null ? faVar.s[2] : -1);
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
                n8.a();
            }
            q1 q1Var = this.z;
            if (q1Var != null) {
                GLES20.glBindTexture(3553, q1Var.c());
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
        n8.a();
    }

    public final void o(int i10, int i11, e1 e1Var, float f10) {
        c1 c1Var;
        if (e1Var == null) {
            return;
        }
        m mVar = this.i;
        l lVar = e1Var.a;
        if (lVar != null && i10 == this.q) {
            mVar = lVar;
        }
        if (mVar == null || this.f == null || (c1Var = (c1) this.r.get(mVar.i(0))) == null) {
            return;
        }
        GLES20.glUseProgram(c1Var.a);
        GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(c1Var.d("texture"), 0);
        GLES20.glUniform1i(c1Var.d("mask"), 1);
        c1.a(c1Var.d("color"), i0.b.k(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i10);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i11);
        if (mVar instanceof l) {
            GLES20.glUniform1i(c1Var.d(TeXSymbolParser.TYPE_ATTR), ((l) mVar).o());
            int d = c1Var.d("resolution");
            tu0 tu0Var = this.g;
            GLES20.glUniform2f(d, tu0Var.a, tu0Var.b);
            GLES20.glUniform2f(c1Var.d("center"), e1Var.b, e1Var.c);
            GLES20.glUniform2f(c1Var.d("radius"), e1Var.d, e1Var.e);
            GLES20.glUniform1f(c1Var.d("thickness"), e1Var.f);
            GLES20.glUniform1f(c1Var.d("rounding"), e1Var.g);
            GLES20.glUniform2f(c1Var.d("middle"), e1Var.i, e1Var.j);
            GLES20.glUniform1f(c1Var.d("rotation"), e1Var.h);
            GLES20.glUniform1i(c1Var.d("fill"), e1Var.l ? 1 : 0);
            GLES20.glUniform1f(c1Var.d("arrowTriangleLength"), e1Var.k);
            GLES20.glUniform1i(c1Var.d("composite"), 0);
            GLES20.glUniform1i(c1Var.d("clear"), e1Var == this.d ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        n8.a();
    }

    public final void p(b6.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        n1.d dVar;
        q1 q1Var;
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
        } catch (Exception e9) {
            FileLog.e(e9);
            byteBuffer = null;
        }
        int j10 = j();
        if (aVar.c == 1 && (q1Var = this.D) != null) {
            j10 = q1Var.c();
        }
        GLES20.glBindTexture(3553, j10);
        RectF rectF = (RectF) aVar.b;
        GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.b).height(), 6408, 5121, byteBuffer);
        if (this.s <= 0 && (dVar = this.a) != null) {
            dVar.C();
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
            b1 b1Var = this.f;
            if (b1Var != null && (c10 = b1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            q1 q1Var = this.z;
            if (q1Var != null) {
                q1Var.a(false);
            }
            this.z = new q1(this.C);
        }
    }
}
