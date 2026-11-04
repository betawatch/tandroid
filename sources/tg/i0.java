package tg;

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
import b8.kg;
import ci.ka;
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
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.x9;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public i1 D;
    public boolean E;
    public final x9 F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public nh a;
    public j0 b;
    public x0 c;
    public x0 d;
    public u0 f;
    public final lt0 g;
    public RectF h;
    public h i;
    public i1 k;
    public i1 l;
    public final ByteBuffer m;
    public final ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public Map r;
    public int s;
    public final ByteBuffer u;
    public boolean v;
    public kg w;
    public final float[] x;
    public float[] y;
    public i1 z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final n0 e = new n0();

    public i0(lt0 lt0Var, Bitmap bitmap, int i3, x9 x9Var) {
        this.F = x9Var;
        this.g = lt0Var;
        this.A = bitmap;
        this.B = i3;
        this.u = ByteBuffer.allocateDirect(((int) lt0Var.a) * ((int) lt0Var.b) * 4);
        this.x = x7.c0.b(lt0Var.a, lt0Var.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(lt0Var.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(lt0Var.b);
        this.m.putFloat(lt0Var.a);
        this.m.putFloat(lt0Var.b);
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
        int i3 = this.o;
        int[] iArr = this.t;
        if (i3 != 0) {
            iArr[0] = i3;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.o = 0;
        }
        i1 i1Var = this.k;
        if (i1Var != null) {
            i1Var.a(z10);
        }
        i1 i1Var2 = this.D;
        if (i1Var2 != null) {
            i1Var2.a(z10);
        }
        int i10 = this.p;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (i1 i1Var3 : hashMap.values()) {
            if (i1Var3 != null) {
                i1Var3.a(true);
            }
        }
        hashMap.clear();
        int i11 = this.q;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        i1 i1Var4 = this.z;
        if (i1Var4 != null) {
            i1Var4.a(true);
        }
        i1 i1Var5 = this.l;
        if (i1Var5 != null) {
            i1Var5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (v0 v0Var : map.values()) {
                if (v0Var.a != 0) {
                    GLES20.glDeleteProgram(0);
                    v0Var.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        x7.e0.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            lt0 lt0Var = this.g;
            GLES20.glViewport(0, 0, (int) lt0Var.a, (int) lt0Var.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
        }
        GLES20.glBindFramebuffer(36160, 0);
        nh nhVar = this.a;
        if (nhVar != null) {
            nhVar.x();
        }
        n0 n0Var = this.e;
        n0Var.h = 0;
        n0Var.g = 0.0d;
        ByteBuffer byteBuffer = n0Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(j0 j0Var, int i3, boolean z10, s sVar) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new ka(this, j0Var, i3, z10, sVar, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kg d(j0 j0Var, int i3, RectF rectF) {
        kg m10;
        nh nhVar;
        Object obj;
        boolean z10;
        h hVar = this.i;
        if (j0Var != null) {
            hVar = j0Var.e;
        }
        h hVar2 = hVar;
        if (this.F == null || !(((z10 = hVar2 instanceof b)) || (hVar2 instanceof d))) {
            m10 = m(rectF, false);
        } else {
            boolean z11 = this.E;
            if (rectF != null && rectF.setIntersect(rectF, f())) {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).c;
                Object obj2 = this.a.b;
                kg kgVar = new kg(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).c;
                Object obj3 = this.a.b;
                ((u0) this.a.b).b.b(UUID.randomUUID(), new rn(this, kgVar, new kg(byteBuffer2, 1, rectF), z11, 15));
                m10 = kgVar;
            } else {
                m10 = null;
            }
            this.E = z10;
        }
        this.s++;
        int i10 = (this.F == null || !((hVar2 instanceof b) || (hVar2 instanceof d))) ? 1 : 2;
        for (int i11 = 0; i11 < i10; i11++) {
            GLES20.glBindFramebuffer(36160, i());
            int j10 = j();
            if (this.F != null && (((hVar2 instanceof b) && i11 == 0) || ((hVar2 instanceof d) && i11 == 1))) {
                i1 i1Var = this.D;
                j10 = i1Var != null ? i1Var.c() : 0;
            }
            if (i11 == 1 && (hVar2 instanceof b)) {
                hVar2 = new d();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j10, 0);
            lt0 lt0Var = this.g;
            GLES20.glViewport(0, 0, (int) lt0Var.a, (int) lt0Var.b);
            v0 v0Var = (v0) this.r.get(hVar2.i(1));
            if (v0Var == null) {
                return null;
            }
            GLES20.glUseProgram(v0Var.a);
            GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(v0Var.d("texture"), 0);
            GLES20.glUniform1i(v0Var.d("mask"), 1);
            v0.a(v0Var.d("color"), i0.a.o(i3, (int) (hVar2.f() * Color.alpha(i3))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j10);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (hVar2 instanceof b) {
                GLES20.glUniform1i(v0Var.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                x9 x9Var = this.F;
                if (x9Var != null) {
                    obj = x9Var.h;
                    ca caVar = x9Var.m;
                    GLES20.glBindTexture(3553, caVar != null ? caVar.s[2] : -1);
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
        if (this.s <= 0 && (nhVar = this.a) != null) {
            nhVar.x();
        }
        this.s--;
        n0 n0Var = this.e;
        n0Var.h = 0;
        n0Var.g = 0.0d;
        ByteBuffer byteBuffer3 = n0Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m10;
    }

    public final kg e(x0 x0Var, int i3, RectF rectF) {
        h hVar = x0Var.a;
        if (hVar == null) {
            hVar = this.i;
        }
        kg m10 = m(rectF, this.F != null && (hVar instanceof b));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        lt0 lt0Var = this.g;
        GLES20.glViewport(0, 0, (int) lt0Var.a, (int) lt0Var.b);
        v0 v0Var = (v0) this.r.get(hVar.i(1));
        if (v0Var == null) {
            return null;
        }
        GLES20.glUseProgram(v0Var.a);
        GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(v0Var.d("texture"), 0);
        GLES20.glUniform1i(v0Var.d("mask"), 1);
        v0.a(v0Var.d("color"), i3);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((hVar instanceof b) && this.z != null) {
            GLES20.glUniform1i(v0Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (hVar instanceof g) {
            GLES20.glUniform1i(v0Var.d(TeXSymbolParser.TYPE_ATTR), x0Var.a.o());
            GLES20.glUniform2f(v0Var.d("resolution"), lt0Var.a, lt0Var.b);
            GLES20.glUniform2f(v0Var.d("center"), x0Var.b, x0Var.c);
            GLES20.glUniform2f(v0Var.d("radius"), x0Var.d, x0Var.e);
            GLES20.glUniform1f(v0Var.d("thickness"), x0Var.f);
            GLES20.glUniform1f(v0Var.d("rounding"), x0Var.g);
            GLES20.glUniform2f(v0Var.d("middle"), x0Var.i, x0Var.j);
            GLES20.glUniform1f(v0Var.d("rotation"), x0Var.h);
            GLES20.glUniform1i(v0Var.d("fill"), x0Var.l ? 1 : 0);
            GLES20.glUniform1f(v0Var.d("arrowTriangleLength"), x0Var.k);
            GLES20.glUniform1i(v0Var.d("composite"), 1);
            GLES20.glUniform1i(v0Var.d("clear"), 0);
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
        nh nhVar = this.a;
        if (nhVar != null && this.s <= 0) {
            nhVar.x();
        }
        this.s--;
        n0 n0Var = this.e;
        n0Var.h = 0;
        n0Var.g = 0.0d;
        ByteBuffer byteBuffer = n0Var.j;
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
        lt0 lt0Var = this.g;
        return new RectF(0.0f, 0.0f, lt0Var.a, lt0Var.b);
    }

    public final int g() {
        if (this.p == 0) {
            this.p = i1.b(this.g);
        }
        return this.p;
    }

    public final m2.t h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        i1 i1Var;
        m2.t tVar;
        v0 v0Var;
        i1 i1Var2;
        int i3 = (int) rectF.left;
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
        lt0 lt0Var = this.g;
        GLES20.glViewport(0, 0, (int) lt0Var.a, (int) lt0Var.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            v0 v0Var2 = (v0) map.get(z10 ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (v0Var2 != null) {
                GLES20.glUseProgram(v0Var2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i3, -i10);
                float[] c2 = x7.c0.c(this.x, x7.c0.a(matrix));
                GLES20.glUniformMatrix4fv(v0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c2));
                if (z10 || !this.G) {
                    GLES20.glUniform1i(v0Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (i1Var = this.D) == null) ? j() : i1Var.c());
                } else {
                    GLES20.glUniform1i(v0Var2.d("texture"), 1);
                    GLES20.glUniform1i(v0Var2.d("mask"), 0);
                    GLES20.glUniform1f(v0Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (i1Var2 = this.D) == null) ? j() : i1Var2.c());
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
                if (z12 && !z11 && (v0Var = (v0) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(v0Var.a);
                    GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c2));
                    GLES20.glUniform1f(v0Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(v0Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(v0Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ca caVar = this.F.m;
                    GLES20.glBindTexture(3553, caVar != null ? caVar.s[2] : -1);
                    GLES20.glUniform1f(v0Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(v0Var.d("mask"), 2);
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
                    tVar = new m2.t(obj, this.u, false, 27);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    tVar = new m2.t(createBitmap, obj, false, 27);
                }
                this.u.rewind();
                int[] iArr = this.t;
                iArr[0] = i11;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.t;
                iArr2[0] = i12;
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
            x7.e0.a();
        }
        return this.o;
    }

    public final int j() {
        i1 i1Var = this.k;
        if (i1Var != null) {
            return i1Var.c();
        }
        return 0;
    }

    public final void k(x0 x0Var) {
        if (x0Var == null) {
            return;
        }
        this.f.f(new e0(this, x0Var, 0));
    }

    public final void l(j0 j0Var, boolean z10, boolean z11) {
        int i3;
        int i10;
        m0 m0Var;
        float f10;
        double d;
        boolean z12;
        m0 m0Var2;
        float f11;
        m0[] m0VarArr;
        double d10;
        float f12;
        float f13;
        char c2;
        char c10;
        this.b = j0Var;
        if (j0Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        x7.e0.a();
        RectF rectF = null;
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            lt0 lt0Var = this.g;
            GLES20.glViewport(0, 0, (int) lt0Var.a, (int) lt0Var.b);
            float f14 = 0.0f;
            if (z10) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(TLObject.FLAG_14);
            }
            Map map = this.r;
            if (map == null) {
                return;
            }
            h hVar = j0Var.e;
            int i11 = 2;
            v0 v0Var = (v0) map.get(hVar.i(2));
            if (v0Var == null) {
                return;
            }
            GLES20.glUseProgram(v0Var.a);
            i1 i1Var = (i1) this.j.get(Integer.valueOf(hVar.l()));
            if (i1Var == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                i1Var = new i1(BitmapFactory.decodeResource(org.telegram.messenger.t0.b.getResources(), hVar.l(), options));
                this.j.put(Integer.valueOf(hVar.l()), i1Var);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i1Var.c());
            GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(v0Var.d("texture"), 0);
            if (z11) {
                this.e.f = 1.0f;
            } else {
                this.e.f = this.f.getScaleX();
            }
            n0 n0Var = this.e;
            n0Var.a = j0Var.d;
            n0Var.b = j0Var.e.k();
            n0Var.c = z11 ? 1.0f : j0Var.e.a();
            n0Var.d = j0Var.e.b();
            n0Var.e = j0Var.e.h();
            Vector vector = j0Var.b;
            int size = vector == null ? 0 : vector.size();
            if (size == 0) {
                i3 = 0;
            } else {
                if (size == 1) {
                    Vector vector2 = j0Var.b;
                    m0[] m0VarArr2 = new m0[vector2.size()];
                    vector2.toArray(m0VarArr2);
                    m0 m0Var3 = m0VarArr2[0];
                    float f15 = ((n0Var.a * n0Var.e) * 1.0f) / n0Var.f;
                    m0Var3.getClass();
                    PointF pointF = new PointF((float) m0Var3.a, (float) m0Var3.b);
                    float f16 = Math.abs(n0Var.d) > 0.0f ? n0Var.d : 0.0f;
                    float f17 = n0Var.c;
                    n0Var.c();
                    n0Var.b(1);
                    n0Var.a(pointF, f15, f16, f17, 0);
                } else {
                    Vector vector3 = j0Var.b;
                    int size2 = vector3.size();
                    m0[] m0VarArr3 = new m0[size2];
                    vector3.toArray(m0VarArr3);
                    n0Var.c();
                    int i12 = 0;
                    while (i12 < size2 - 1) {
                        m0 m0Var4 = m0VarArr3[i12];
                        int i13 = i12 + 1;
                        m0 m0Var5 = m0VarArr3[i13];
                        double a10 = m0Var4.a(m0Var5);
                        int i14 = size2;
                        float f18 = f14;
                        double d11 = m0Var5.a - m0Var4.a;
                        int i15 = i11;
                        double d12 = m0Var5.b - m0Var4.b;
                        double d13 = m0Var5.c;
                        double d14 = d13 - m0Var4.c;
                        m0 m0Var6 = new m0(1.0d, 1.0d, 0.0d);
                        float atan2 = Math.abs(n0Var.d) > f18 ? n0Var.d : (float) Math.atan2(d12, d11);
                        float f19 = (float) ((((n0Var.a * d13) * n0Var.e) * 1.0d) / n0Var.f);
                        double max = Math.max(1.0f, n0Var.b * f19);
                        if (a10 > 0.0d) {
                            double d15 = 1.0d / a10;
                            m0Var = new m0(d11 * d15, d12 * d15, d14 * d15);
                        } else {
                            m0Var = m0Var6;
                        }
                        float min = Math.min(1.0f, n0Var.c * 1.15f);
                        boolean z13 = m0Var4.d;
                        boolean z14 = m0Var5.d;
                        float f20 = atan2;
                        int ceil = (int) Math.ceil((a10 - n0Var.g) / max);
                        int i16 = n0Var.h;
                        n0Var.b(ceil);
                        ByteBuffer byteBuffer = n0Var.j;
                        if (byteBuffer == null || i16 < 0) {
                            f10 = f19;
                        } else {
                            f10 = f19;
                            if (i16 < n0Var.i) {
                                byteBuffer.position(i16 * 20);
                            }
                        }
                        double d16 = n0Var.g;
                        m0 m0Var7 = new m0(m0Var4.a + (m0Var.a * d16), m0Var4.b + (m0Var.b * d16), m0Var4.c + (m0Var.c * d16));
                        double d17 = d16;
                        m0 m0Var8 = m0Var7;
                        boolean z15 = true;
                        while (true) {
                            if (d17 > a10) {
                                d = d17;
                                z12 = z14;
                                m0Var2 = m0Var5;
                                f11 = f10;
                                m0VarArr = m0VarArr3;
                                d10 = a10;
                                f12 = f20;
                                break;
                            }
                            float f21 = z13 ? min : n0Var.c;
                            d = d17;
                            z12 = z14;
                            m0[] m0VarArr4 = m0VarArr3;
                            d10 = a10;
                            f12 = f20;
                            float f22 = f21;
                            m0 m0Var9 = m0Var8;
                            m0Var2 = m0Var5;
                            f11 = f10;
                            boolean a11 = n0Var.a(new PointF((float) m0Var8.a, (float) m0Var8.b), f11, f12, f22, -1);
                            if (!a11) {
                                m0VarArr = m0VarArr4;
                                z15 = a11;
                                break;
                            }
                            m0 m0Var10 = new m0(m0Var9.a + (m0Var.a * max), m0Var9.b + (m0Var.b * max), m0Var9.c + (m0Var.c * max));
                            z15 = a11;
                            f20 = f12;
                            m0Var8 = m0Var10;
                            a10 = d10;
                            m0VarArr3 = m0VarArr4;
                            z14 = z12;
                            f10 = f11;
                            m0Var5 = m0Var2;
                            d17 = d + max;
                            z13 = false;
                        }
                        if (z15 && z12) {
                            n0Var.b(1);
                            n0Var.a(new PointF((float) m0Var2.a, (float) m0Var2.b), f11, f12, min, -1);
                        }
                        n0Var.g = d - d10;
                        size2 = i14;
                        i12 = i13;
                        f14 = f18;
                        i11 = i15;
                        m0VarArr3 = m0VarArr;
                    }
                }
                float f23 = f14;
                int i17 = i11;
                j0Var.a = n0Var.g;
                rectF = new RectF(f23, f23, f23, f23);
                int i18 = n0Var.h;
                if (i18 <= 0) {
                    i3 = 0;
                } else {
                    int i19 = i18 - 1;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i19 * 2) + (i18 * 4)) * 20);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                    asFloatBuffer.position(0);
                    ByteBuffer byteBuffer2 = n0Var.j;
                    if (byteBuffer2 != null && n0Var.i > 0) {
                        byteBuffer2.position(0);
                    }
                    int i20 = 0;
                    for (int i21 = 0; i21 < i18; i21++) {
                        float f24 = n0Var.j.getFloat();
                        float f25 = n0Var.j.getFloat();
                        float f26 = n0Var.j.getFloat();
                        float f27 = n0Var.j.getFloat();
                        float f28 = n0Var.j.getFloat();
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
                            c2 = 0;
                            asFloatBuffer.put(fArr[0]);
                            c10 = 1;
                            asFloatBuffer.put(fArr[1]);
                            f13 = 0.0f;
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(f28);
                            i20++;
                        } else {
                            f13 = 0.0f;
                            c2 = 0;
                            c10 = 1;
                        }
                        asFloatBuffer.put(fArr[c2]);
                        asFloatBuffer.put(fArr[c10]);
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
                    i3 = 0;
                    GLES20.glDrawArrays(5, 0, i20);
                }
            }
            i10 = 36160;
        } else {
            i3 = 0;
            i10 = 36160;
        }
        GLES20.glBindFramebuffer(i10, i3);
        nh nhVar = this.a;
        if (nhVar != null) {
            nhVar.x();
        }
        RectF rectF3 = this.h;
        if (rectF3 != null) {
            rectF3.union(rectF);
        } else {
            this.h = rectF;
        }
    }

    public final kg m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z10, false).c;
        Object obj = this.a.b;
        kg kgVar = new kg(byteBuffer, z10 ? 1 : 0, rectF);
        ((u0) this.a.b).b.b(UUID.randomUUID(), new g0(this, kgVar, 1));
        return kgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i3, j0 j0Var, float f10) {
        Object obj;
        if (j0Var == null) {
            return;
        }
        h hVar = j0Var.e;
        if (hVar == null) {
            hVar = this.i;
        }
        boolean z10 = this.G && ((hVar instanceof f) || (hVar instanceof d));
        Map map = this.r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hVar.i(0));
        sb2.append(z10 ? "_masking" : "");
        v0 v0Var = (v0) map.get(sb2.toString());
        if (v0Var == null) {
            return;
        }
        GLES20.glUseProgram(v0Var.a);
        GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(v0Var.d("texture"), 0);
        GLES20.glUniform1i(v0Var.d("mask"), 1);
        v0.a(v0Var.d("color"), i0.a.o(j0Var.c, (int) (hVar.f() * Color.alpha(r0) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i3);
        if (z10) {
            GLES20.glUniform1i(v0Var.d("otexture"), 2);
            GLES20.glUniform1f(v0Var.d("preview"), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.l.c());
        }
        if (hVar instanceof b) {
            GLES20.glUniform1i(v0Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            x9 x9Var = this.F;
            if (x9Var != null) {
                obj = x9Var.h;
                ca caVar = x9Var.m;
                GLES20.glBindTexture(3553, caVar != null ? caVar.s[2] : -1);
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
                x7.e0.a();
            }
            i1 i1Var = this.z;
            if (i1Var != null) {
                GLES20.glBindTexture(3553, i1Var.c());
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
        x7.e0.a();
    }

    public final void o(int i3, int i10, x0 x0Var, float f10) {
        v0 v0Var;
        if (x0Var == null) {
            return;
        }
        h hVar = this.i;
        g gVar = x0Var.a;
        if (gVar != null && i3 == this.q) {
            hVar = gVar;
        }
        if (hVar == null || this.f == null || (v0Var = (v0) this.r.get(hVar.i(0))) == null) {
            return;
        }
        GLES20.glUseProgram(v0Var.a);
        GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(v0Var.d("texture"), 0);
        GLES20.glUniform1i(v0Var.d("mask"), 1);
        v0.a(v0Var.d("color"), i0.a.o(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i3);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i10);
        if (hVar instanceof g) {
            GLES20.glUniform1i(v0Var.d(TeXSymbolParser.TYPE_ATTR), ((g) hVar).o());
            int d = v0Var.d("resolution");
            lt0 lt0Var = this.g;
            GLES20.glUniform2f(d, lt0Var.a, lt0Var.b);
            GLES20.glUniform2f(v0Var.d("center"), x0Var.b, x0Var.c);
            GLES20.glUniform2f(v0Var.d("radius"), x0Var.d, x0Var.e);
            GLES20.glUniform1f(v0Var.d("thickness"), x0Var.f);
            GLES20.glUniform1f(v0Var.d("rounding"), x0Var.g);
            GLES20.glUniform2f(v0Var.d("middle"), x0Var.i, x0Var.j);
            GLES20.glUniform1f(v0Var.d("rotation"), x0Var.h);
            GLES20.glUniform1i(v0Var.d("fill"), x0Var.l ? 1 : 0);
            GLES20.glUniform1f(v0Var.d("arrowTriangleLength"), x0Var.k);
            GLES20.glUniform1i(v0Var.d("composite"), 0);
            GLES20.glUniform1i(v0Var.d("clear"), x0Var == this.d ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        x7.e0.a();
    }

    public final void p(kg kgVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        nh nhVar;
        i1 i1Var;
        if (kgVar == null) {
            return;
        }
        try {
            byte[] bArr = new byte[1024];
            byte[] bArr2 = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream((File) kgVar.d);
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
        int j10 = j();
        if (kgVar.b == 1 && (i1Var = this.D) != null) {
            j10 = i1Var.c();
        }
        GLES20.glBindTexture(3553, j10);
        RectF rectF = (RectF) kgVar.c;
        GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) kgVar.c).height(), 6408, 5121, byteBuffer);
        if (this.s <= 0 && (nhVar = this.a) != null) {
            nhVar.x();
        }
        if (!z10 || (file = (File) kgVar.d) == null) {
            return;
        }
        file.delete();
        kgVar.d = null;
    }

    public final void q(h hVar) {
        Bitmap bitmap;
        Bitmap c2;
        this.i = hVar;
        if ((hVar instanceof b) && (bitmap = this.A) != null && this.F == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = this.B;
            if (i3 == 90 || i3 == 270 || i3 == -90) {
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
            canvas.rotate(i3);
            if (i3 == 90) {
                canvas.translate(0.0f, -width);
            } else if (i3 == 180) {
                canvas.translate(-width, -height);
            } else if (i3 == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.M);
            canvas.restore();
            u0 u0Var = this.f;
            if (u0Var != null && (c2 = u0Var.c(false, false)) != null) {
                canvas.scale(width / c2.getWidth(), height / c2.getHeight());
                canvas.drawBitmap(c2, 0.0f, 0.0f, this.M);
                c2.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            i1 i1Var = this.z;
            if (i1Var != null) {
                i1Var.a(false);
            }
            this.z = new i1(this.C);
        }
    }
}
