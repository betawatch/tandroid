package sg;

import a8.xa;
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
import c8.ic;
import c8.kc;
import di.da;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public h1 D;
    public boolean E;
    public final ba F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public nd0 a;
    public i0 b;
    public w0 c;
    public w0 d;
    public t0 f;
    public final xt0 g;
    public RectF h;
    public h i;
    public h1 k;
    public h1 l;
    public final ByteBuffer m;
    public final ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public Map r;
    public int s;
    public final ByteBuffer u;
    public boolean v;
    public xa w;
    public final float[] x;
    public float[] y;
    public h1 z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final m0 e = new m0();

    public h0(xt0 xt0Var, Bitmap bitmap, int i7, ba baVar) {
        this.F = baVar;
        this.g = xt0Var;
        this.A = bitmap;
        this.B = i7;
        this.u = ByteBuffer.allocateDirect(((int) xt0Var.a) * ((int) xt0Var.b) * 4);
        this.x = ic.b(xt0Var.a, xt0Var.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(xt0Var.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(xt0Var.b);
        this.m.putFloat(xt0Var.a);
        this.m.putFloat(xt0Var.b);
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
        int i7 = this.o;
        int[] iArr = this.t;
        if (i7 != 0) {
            iArr[0] = i7;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.o = 0;
        }
        h1 h1Var = this.k;
        if (h1Var != null) {
            h1Var.a(z10);
        }
        h1 h1Var2 = this.D;
        if (h1Var2 != null) {
            h1Var2.a(z10);
        }
        int i10 = this.p;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (h1 h1Var3 : hashMap.values()) {
            if (h1Var3 != null) {
                h1Var3.a(true);
            }
        }
        hashMap.clear();
        int i11 = this.q;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        h1 h1Var4 = this.z;
        if (h1Var4 != null) {
            h1Var4.a(true);
        }
        h1 h1Var5 = this.l;
        if (h1Var5 != null) {
            h1Var5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (u0 u0Var : map.values()) {
                if (u0Var.a != 0) {
                    GLES20.glDeleteProgram(0);
                    u0Var.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        kc.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            xt0 xt0Var = this.g;
            GLES20.glViewport(0, 0, (int) xt0Var.a, (int) xt0Var.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
        }
        GLES20.glBindFramebuffer(36160, 0);
        nd0 nd0Var = this.a;
        if (nd0Var != null) {
            nd0Var.p();
        }
        m0 m0Var = this.e;
        m0Var.h = 0;
        m0Var.g = 0.0d;
        ByteBuffer byteBuffer = m0Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(i0 i0Var, int i7, boolean z10, s sVar) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new da(this, i0Var, i7, z10, sVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xa d(i0 i0Var, int i7, RectF rectF) {
        xa m10;
        nd0 nd0Var;
        Object obj;
        boolean z10;
        h hVar = this.i;
        if (i0Var != null) {
            hVar = i0Var.e;
        }
        h hVar2 = hVar;
        if (this.F == null || !(((z10 = hVar2 instanceof b)) || (hVar2 instanceof d))) {
            m10 = m(rectF, false);
        } else {
            boolean z11 = this.E;
            if (rectF != null && rectF.setIntersect(rectF, f())) {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).c;
                Object obj2 = this.a.b;
                xa xaVar = new xa(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).c;
                Object obj3 = this.a.b;
                ((t0) this.a.b).b.b(UUID.randomUUID(), new xn(this, xaVar, new xa(byteBuffer2, 1, rectF), z11, 16));
                m10 = xaVar;
            } else {
                m10 = null;
            }
            this.E = z10;
        }
        this.s++;
        int i10 = (this.F == null || !((hVar2 instanceof b) || (hVar2 instanceof d))) ? 1 : 2;
        for (int i11 = 0; i11 < i10; i11++) {
            GLES20.glBindFramebuffer(36160, i());
            int j3 = j();
            if (this.F != null && (((hVar2 instanceof b) && i11 == 0) || ((hVar2 instanceof d) && i11 == 1))) {
                h1 h1Var = this.D;
                j3 = h1Var != null ? h1Var.c() : 0;
            }
            if (i11 == 1 && (hVar2 instanceof b)) {
                hVar2 = new d();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j3, 0);
            xt0 xt0Var = this.g;
            GLES20.glViewport(0, 0, (int) xt0Var.a, (int) xt0Var.b);
            u0 u0Var = (u0) this.r.get(hVar2.i(1));
            if (u0Var == null) {
                return null;
            }
            GLES20.glUseProgram(u0Var.a);
            GLES20.glUniformMatrix4fv(u0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(u0Var.d("texture"), 0);
            GLES20.glUniform1i(u0Var.d("mask"), 1);
            u0.a(u0Var.d("color"), i0.a.o(i7, (int) (hVar2.f() * Color.alpha(i7))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j3);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (hVar2 instanceof b) {
                GLES20.glUniform1i(u0Var.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                ba baVar = this.F;
                if (baVar != null) {
                    obj = baVar.h;
                    ga gaVar = baVar.m;
                    GLES20.glBindTexture(3553, gaVar != null ? gaVar.s[2] : -1);
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
        if (this.s <= 0 && (nd0Var = this.a) != null) {
            nd0Var.p();
        }
        this.s--;
        m0 m0Var = this.e;
        m0Var.h = 0;
        m0Var.g = 0.0d;
        ByteBuffer byteBuffer3 = m0Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m10;
    }

    public final xa e(w0 w0Var, int i7, RectF rectF) {
        h hVar = w0Var.a;
        if (hVar == null) {
            hVar = this.i;
        }
        xa m10 = m(rectF, this.F != null && (hVar instanceof b));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        xt0 xt0Var = this.g;
        GLES20.glViewport(0, 0, (int) xt0Var.a, (int) xt0Var.b);
        u0 u0Var = (u0) this.r.get(hVar.i(1));
        if (u0Var == null) {
            return null;
        }
        GLES20.glUseProgram(u0Var.a);
        GLES20.glUniformMatrix4fv(u0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(u0Var.d("texture"), 0);
        GLES20.glUniform1i(u0Var.d("mask"), 1);
        u0.a(u0Var.d("color"), i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((hVar instanceof b) && this.z != null) {
            GLES20.glUniform1i(u0Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (hVar instanceof g) {
            GLES20.glUniform1i(u0Var.d(TeXSymbolParser.TYPE_ATTR), w0Var.a.o());
            GLES20.glUniform2f(u0Var.d("resolution"), xt0Var.a, xt0Var.b);
            GLES20.glUniform2f(u0Var.d("center"), w0Var.b, w0Var.c);
            GLES20.glUniform2f(u0Var.d("radius"), w0Var.d, w0Var.e);
            GLES20.glUniform1f(u0Var.d("thickness"), w0Var.f);
            GLES20.glUniform1f(u0Var.d("rounding"), w0Var.g);
            GLES20.glUniform2f(u0Var.d("middle"), w0Var.i, w0Var.j);
            GLES20.glUniform1f(u0Var.d("rotation"), w0Var.h);
            GLES20.glUniform1i(u0Var.d("fill"), w0Var.l ? 1 : 0);
            GLES20.glUniform1f(u0Var.d("arrowTriangleLength"), w0Var.k);
            GLES20.glUniform1i(u0Var.d("composite"), 1);
            GLES20.glUniform1i(u0Var.d("clear"), 0);
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
        nd0 nd0Var = this.a;
        if (nd0Var != null && this.s <= 0) {
            nd0Var.p();
        }
        this.s--;
        m0 m0Var = this.e;
        m0Var.h = 0;
        m0Var.g = 0.0d;
        ByteBuffer byteBuffer = m0Var.j;
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
        xt0 xt0Var = this.g;
        return new RectF(0.0f, 0.0f, xt0Var.a, xt0Var.b);
    }

    public final int g() {
        if (this.p == 0) {
            this.p = h1.b(this.g);
        }
        return this.p;
    }

    public final s2.e h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        h1 h1Var;
        s2.e eVar;
        u0 u0Var;
        h1 h1Var2;
        int i7 = (int) rectF.left;
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
        xt0 xt0Var = this.g;
        GLES20.glViewport(0, 0, (int) xt0Var.a, (int) xt0Var.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            u0 u0Var2 = (u0) map.get(z10 ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (u0Var2 != null) {
                GLES20.glUseProgram(u0Var2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i7, -i10);
                float[] c10 = ic.c(this.x, ic.a(matrix));
                GLES20.glUniformMatrix4fv(u0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (z10 || !this.G) {
                    GLES20.glUniform1i(u0Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (h1Var = this.D) == null) ? j() : h1Var.c());
                } else {
                    GLES20.glUniform1i(u0Var2.d("texture"), 1);
                    GLES20.glUniform1i(u0Var2.d("mask"), 0);
                    GLES20.glUniform1f(u0Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (h1Var2 = this.D) == null) ? j() : h1Var2.c());
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.l.c());
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(TLObject.FLAG_14);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (u0Var = (u0) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(u0Var.a);
                    GLES20.glUniformMatrix4fv(u0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(u0Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(u0Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(u0Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ga gaVar = this.F.m;
                    GLES20.glBindTexture(3553, gaVar != null ? gaVar.s[2] : -1);
                    GLES20.glUniform1f(u0Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(u0Var.d("mask"), 2);
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
                    eVar = new s2.e(1, obj, this.u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    eVar = new s2.e(1, createBitmap, obj);
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
            kc.a();
        }
        return this.o;
    }

    public final int j() {
        h1 h1Var = this.k;
        if (h1Var != null) {
            return h1Var.c();
        }
        return 0;
    }

    public final void k(w0 w0Var) {
        if (w0Var == null) {
            return;
        }
        this.f.f(new d0(this, w0Var, 0));
    }

    public final void l(i0 i0Var, boolean z10, boolean z11) {
        int i7;
        int i10;
        l0 l0Var;
        float f10;
        double d;
        boolean z12;
        l0 l0Var2;
        float f11;
        l0[] l0VarArr;
        double d2;
        float f12;
        float f13;
        char c10;
        char c11;
        this.b = i0Var;
        if (i0Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        kc.a();
        RectF rectF = null;
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            xt0 xt0Var = this.g;
            GLES20.glViewport(0, 0, (int) xt0Var.a, (int) xt0Var.b);
            float f14 = 0.0f;
            if (z10) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(TLObject.FLAG_14);
            }
            Map map = this.r;
            if (map == null) {
                return;
            }
            h hVar = i0Var.e;
            int i11 = 2;
            u0 u0Var = (u0) map.get(hVar.i(2));
            if (u0Var == null) {
                return;
            }
            GLES20.glUseProgram(u0Var.a);
            h1 h1Var = (h1) this.j.get(Integer.valueOf(hVar.l()));
            if (h1Var == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                h1Var = new h1(BitmapFactory.decodeResource(org.telegram.messenger.t0.b.getResources(), hVar.l(), options));
                this.j.put(Integer.valueOf(hVar.l()), h1Var);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, h1Var.c());
            GLES20.glUniformMatrix4fv(u0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(u0Var.d("texture"), 0);
            if (z11) {
                this.e.f = 1.0f;
            } else {
                this.e.f = this.f.getScaleX();
            }
            m0 m0Var = this.e;
            m0Var.a = i0Var.d;
            m0Var.b = i0Var.e.k();
            m0Var.c = z11 ? 1.0f : i0Var.e.a();
            m0Var.d = i0Var.e.b();
            m0Var.e = i0Var.e.h();
            Vector vector = i0Var.b;
            int size = vector == null ? 0 : vector.size();
            if (size == 0) {
                i7 = 0;
            } else {
                if (size == 1) {
                    Vector vector2 = i0Var.b;
                    l0[] l0VarArr2 = new l0[vector2.size()];
                    vector2.toArray(l0VarArr2);
                    l0 l0Var3 = l0VarArr2[0];
                    float f15 = ((m0Var.a * m0Var.e) * 1.0f) / m0Var.f;
                    l0Var3.getClass();
                    PointF pointF = new PointF((float) l0Var3.a, (float) l0Var3.b);
                    float f16 = Math.abs(m0Var.d) > 0.0f ? m0Var.d : 0.0f;
                    float f17 = m0Var.c;
                    m0Var.c();
                    m0Var.b(1);
                    m0Var.a(pointF, f15, f16, f17, 0);
                } else {
                    Vector vector3 = i0Var.b;
                    int size2 = vector3.size();
                    l0[] l0VarArr3 = new l0[size2];
                    vector3.toArray(l0VarArr3);
                    m0Var.c();
                    int i12 = 0;
                    while (i12 < size2 - 1) {
                        l0 l0Var4 = l0VarArr3[i12];
                        int i13 = i12 + 1;
                        l0 l0Var5 = l0VarArr3[i13];
                        double a10 = l0Var4.a(l0Var5);
                        int i14 = size2;
                        float f18 = f14;
                        double d10 = l0Var5.a - l0Var4.a;
                        int i15 = i11;
                        double d11 = l0Var5.b - l0Var4.b;
                        double d12 = l0Var5.c;
                        double d13 = d12 - l0Var4.c;
                        l0 l0Var6 = new l0(1.0d, 1.0d, 0.0d);
                        float atan2 = Math.abs(m0Var.d) > f18 ? m0Var.d : (float) Math.atan2(d11, d10);
                        float f19 = (float) ((((m0Var.a * d12) * m0Var.e) * 1.0d) / m0Var.f);
                        double max = Math.max(1.0f, m0Var.b * f19);
                        if (a10 > 0.0d) {
                            double d14 = 1.0d / a10;
                            l0Var = new l0(d10 * d14, d11 * d14, d13 * d14);
                        } else {
                            l0Var = l0Var6;
                        }
                        float min = Math.min(1.0f, m0Var.c * 1.15f);
                        boolean z13 = l0Var4.d;
                        boolean z14 = l0Var5.d;
                        float f20 = atan2;
                        int ceil = (int) Math.ceil((a10 - m0Var.g) / max);
                        int i16 = m0Var.h;
                        m0Var.b(ceil);
                        ByteBuffer byteBuffer = m0Var.j;
                        if (byteBuffer == null || i16 < 0) {
                            f10 = f19;
                        } else {
                            f10 = f19;
                            if (i16 < m0Var.i) {
                                byteBuffer.position(i16 * 20);
                            }
                        }
                        double d15 = m0Var.g;
                        l0 l0Var7 = new l0(l0Var4.a + (l0Var.a * d15), l0Var4.b + (l0Var.b * d15), l0Var4.c + (l0Var.c * d15));
                        double d16 = d15;
                        l0 l0Var8 = l0Var7;
                        boolean z15 = true;
                        while (true) {
                            if (d16 > a10) {
                                d = d16;
                                z12 = z14;
                                l0Var2 = l0Var5;
                                f11 = f10;
                                l0VarArr = l0VarArr3;
                                d2 = a10;
                                f12 = f20;
                                break;
                            }
                            float f21 = z13 ? min : m0Var.c;
                            d = d16;
                            z12 = z14;
                            l0[] l0VarArr4 = l0VarArr3;
                            d2 = a10;
                            f12 = f20;
                            float f22 = f21;
                            l0 l0Var9 = l0Var8;
                            l0Var2 = l0Var5;
                            f11 = f10;
                            boolean a11 = m0Var.a(new PointF((float) l0Var8.a, (float) l0Var8.b), f11, f12, f22, -1);
                            if (!a11) {
                                l0VarArr = l0VarArr4;
                                z15 = a11;
                                break;
                            }
                            l0 l0Var10 = new l0(l0Var9.a + (l0Var.a * max), l0Var9.b + (l0Var.b * max), l0Var9.c + (l0Var.c * max));
                            z15 = a11;
                            f20 = f12;
                            l0Var8 = l0Var10;
                            a10 = d2;
                            l0VarArr3 = l0VarArr4;
                            z14 = z12;
                            f10 = f11;
                            l0Var5 = l0Var2;
                            d16 = d + max;
                            z13 = false;
                        }
                        if (z15 && z12) {
                            m0Var.b(1);
                            m0Var.a(new PointF((float) l0Var2.a, (float) l0Var2.b), f11, f12, min, -1);
                        }
                        m0Var.g = d - d2;
                        size2 = i14;
                        i12 = i13;
                        f14 = f18;
                        i11 = i15;
                        l0VarArr3 = l0VarArr;
                    }
                }
                float f23 = f14;
                int i17 = i11;
                i0Var.a = m0Var.g;
                rectF = new RectF(f23, f23, f23, f23);
                int i18 = m0Var.h;
                if (i18 <= 0) {
                    i7 = 0;
                } else {
                    int i19 = i18 - 1;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i19 * 2) + (i18 * 4)) * 20);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                    asFloatBuffer.position(0);
                    ByteBuffer byteBuffer2 = m0Var.j;
                    if (byteBuffer2 != null && m0Var.i > 0) {
                        byteBuffer2.position(0);
                    }
                    int i20 = 0;
                    for (int i21 = 0; i21 < i18; i21++) {
                        float f24 = m0Var.j.getFloat();
                        float f25 = m0Var.j.getFloat();
                        float f26 = m0Var.j.getFloat();
                        float f27 = m0Var.j.getFloat();
                        float f28 = m0Var.j.getFloat();
                        RectF rectF2 = new RectF(f24 - f26, f25 - f26, f24 + f26, f25 + f26);
                        float f29 = rectF2.left;
                        float f30 = rectF2.top;
                        float f31 = rectF2.right;
                        float f32 = rectF2.bottom;
                        float[] fArr = new float[8];
                        fArr[0] = f29;
                        fArr[1] = f30;
                        fArr[i17] = f31;
                        fArr[3] = f30;
                        fArr[4] = f29;
                        fArr[5] = f32;
                        fArr[6] = f31;
                        fArr[7] = f32;
                        float centerX = rectF2.centerX();
                        float centerY = rectF2.centerY();
                        Matrix matrix = new Matrix();
                        matrix.setRotate((float) Math.toDegrees(f27), centerX, centerY);
                        matrix.mapPoints(fArr);
                        matrix.mapRect(rectF2);
                        rectF2.left = (int) Math.floor(rectF2.left);
                        rectF2.top = (int) Math.floor(rectF2.top);
                        rectF2.right = (int) Math.ceil(rectF2.right);
                        rectF2.bottom = (int) Math.ceil(rectF2.bottom);
                        rectF.union(rectF2);
                        if (i20 != 0) {
                            c10 = 0;
                            asFloatBuffer.put(fArr[0]);
                            c11 = 1;
                            asFloatBuffer.put(fArr[1]);
                            f13 = 0.0f;
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(f28);
                            i20++;
                        } else {
                            f13 = 0.0f;
                            c10 = 0;
                            c11 = 1;
                        }
                        asFloatBuffer.put(fArr[c10]);
                        asFloatBuffer.put(fArr[c11]);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(f28);
                        asFloatBuffer.put(fArr[i17]);
                        asFloatBuffer.put(fArr[3]);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(f28);
                        asFloatBuffer.put(fArr[4]);
                        asFloatBuffer.put(fArr[5]);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f28);
                        asFloatBuffer.put(fArr[6]);
                        asFloatBuffer.put(fArr[7]);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f28);
                        int i22 = i20 + 4;
                        if (i21 != i19) {
                            asFloatBuffer.put(fArr[6]);
                            asFloatBuffer.put(fArr[7]);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(f28);
                            i20 += 5;
                        } else {
                            i20 = i22;
                        }
                    }
                    asFloatBuffer.position(0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(0);
                    asFloatBuffer.position(i17);
                    GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(1);
                    asFloatBuffer.position(4);
                    GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(2);
                    i7 = 0;
                    GLES20.glDrawArrays(5, 0, i20);
                }
            }
            i10 = 36160;
        } else {
            i7 = 0;
            i10 = 36160;
        }
        GLES20.glBindFramebuffer(i10, i7);
        nd0 nd0Var = this.a;
        if (nd0Var != null) {
            nd0Var.p();
        }
        RectF rectF3 = this.h;
        if (rectF3 != null) {
            rectF3.union(rectF);
        } else {
            this.h = rectF;
        }
    }

    public final xa m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z10, false).c;
        Object obj = this.a.b;
        xa xaVar = new xa(byteBuffer, z10 ? 1 : 0, rectF);
        ((t0) this.a.b).b.b(UUID.randomUUID(), new f0(this, xaVar, 1));
        return xaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i7, i0 i0Var, float f10) {
        Object obj;
        if (i0Var == null) {
            return;
        }
        h hVar = i0Var.e;
        if (hVar == null) {
            hVar = this.i;
        }
        boolean z10 = this.G && ((hVar instanceof f) || (hVar instanceof d));
        Map map = this.r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hVar.i(0));
        sb2.append(z10 ? "_masking" : "");
        u0 u0Var = (u0) map.get(sb2.toString());
        if (u0Var == null) {
            return;
        }
        GLES20.glUseProgram(u0Var.a);
        GLES20.glUniformMatrix4fv(u0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(u0Var.d("texture"), 0);
        GLES20.glUniform1i(u0Var.d("mask"), 1);
        u0.a(u0Var.d("color"), i0.a.o(i0Var.c, (int) (hVar.f() * Color.alpha(r0) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i7);
        if (z10) {
            GLES20.glUniform1i(u0Var.d("otexture"), 2);
            GLES20.glUniform1f(u0Var.d("preview"), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.l.c());
        }
        if (hVar instanceof b) {
            GLES20.glUniform1i(u0Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            ba baVar = this.F;
            if (baVar != null) {
                obj = baVar.h;
                ga gaVar = baVar.m;
                GLES20.glBindTexture(3553, gaVar != null ? gaVar.s[2] : -1);
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
                kc.a();
            }
            h1 h1Var = this.z;
            if (h1Var != null) {
                GLES20.glBindTexture(3553, h1Var.c());
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
        kc.a();
    }

    public final void o(int i7, int i10, w0 w0Var, float f10) {
        u0 u0Var;
        if (w0Var == null) {
            return;
        }
        h hVar = this.i;
        g gVar = w0Var.a;
        if (gVar != null && i7 == this.q) {
            hVar = gVar;
        }
        if (hVar == null || this.f == null || (u0Var = (u0) this.r.get(hVar.i(0))) == null) {
            return;
        }
        GLES20.glUseProgram(u0Var.a);
        GLES20.glUniformMatrix4fv(u0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(u0Var.d("texture"), 0);
        GLES20.glUniform1i(u0Var.d("mask"), 1);
        u0.a(u0Var.d("color"), i0.a.o(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i7);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i10);
        if (hVar instanceof g) {
            GLES20.glUniform1i(u0Var.d(TeXSymbolParser.TYPE_ATTR), ((g) hVar).o());
            int d = u0Var.d("resolution");
            xt0 xt0Var = this.g;
            GLES20.glUniform2f(d, xt0Var.a, xt0Var.b);
            GLES20.glUniform2f(u0Var.d("center"), w0Var.b, w0Var.c);
            GLES20.glUniform2f(u0Var.d("radius"), w0Var.d, w0Var.e);
            GLES20.glUniform1f(u0Var.d("thickness"), w0Var.f);
            GLES20.glUniform1f(u0Var.d("rounding"), w0Var.g);
            GLES20.glUniform2f(u0Var.d("middle"), w0Var.i, w0Var.j);
            GLES20.glUniform1f(u0Var.d("rotation"), w0Var.h);
            GLES20.glUniform1i(u0Var.d("fill"), w0Var.l ? 1 : 0);
            GLES20.glUniform1f(u0Var.d("arrowTriangleLength"), w0Var.k);
            GLES20.glUniform1i(u0Var.d("composite"), 0);
            GLES20.glUniform1i(u0Var.d("clear"), w0Var == this.d ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        kc.a();
    }

    public final void p(xa xaVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        nd0 nd0Var;
        h1 h1Var;
        if (xaVar == null) {
            return;
        }
        try {
            byte[] bArr = new byte[1024];
            byte[] bArr2 = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream((File) xaVar.d);
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
            a8.g(e10, true);
            byteBuffer = null;
        }
        int j3 = j();
        if (xaVar.b == 1 && (h1Var = this.D) != null) {
            j3 = h1Var.c();
        }
        GLES20.glBindTexture(3553, j3);
        RectF rectF = (RectF) xaVar.c;
        GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) xaVar.c).height(), 6408, 5121, byteBuffer);
        if (this.s <= 0 && (nd0Var = this.a) != null) {
            nd0Var.p();
        }
        if (!z10 || (file = (File) xaVar.d) == null) {
            return;
        }
        file.delete();
        xaVar.d = null;
    }

    public final void q(h hVar) {
        Bitmap bitmap;
        Bitmap c10;
        this.i = hVar;
        if ((hVar instanceof b) && (bitmap = this.A) != null && this.F == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i7 = this.B;
            if (i7 == 90 || i7 == 270 || i7 == -90) {
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
            canvas.rotate(i7);
            if (i7 == 90) {
                canvas.translate(0.0f, -width);
            } else if (i7 == 180) {
                canvas.translate(-width, -height);
            } else if (i7 == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.M);
            canvas.restore();
            t0 t0Var = this.f;
            if (t0Var != null && (c10 = t0Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            h1 h1Var = this.z;
            if (h1Var != null) {
                h1Var.a(false);
            }
            this.z = new h1(this.C);
        }
    }
}
