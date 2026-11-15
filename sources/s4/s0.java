package s4;

import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import c8.gc;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.r1;
import org.telegram.messenger.a8;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z9;
import org.telegram.ui.tp0;
import sg.u0;
import sg.v0;
import tg.n2;
import ug.j1;
import ug.s1;
import v4.e1;
import wg.c1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        float f10;
        float f11;
        int i7;
        sg.s0 s0Var = (sg.s0) this.b;
        if (!s0Var.f || s0Var.E.E) {
            return;
        }
        sg.s0.a(s0Var);
        GLES20.glBindFramebuffer(36160, 0);
        sg.s0 s0Var2 = (sg.s0) this.b;
        GLES20.glViewport(0, 0, s0Var2.n, s0Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(TLObject.FLAG_14);
        sg.i0 i0Var = ((sg.s0) this.b).E.c;
        if (i0Var.r != null) {
            if (i0Var.D != null && i0Var.F != null && i0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                v0 v0Var = (v0) i0Var.r.get("videoBlur");
                if (v0Var != null) {
                    GLES20.glUseProgram(v0Var.a);
                    GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(i0Var.y));
                    GLES20.glUniform1f(v0Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(v0Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, i0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(v0Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    z9 z9Var = i0Var.F.m;
                    GLES20.glBindTexture(3553, z9Var != null ? z9Var.s[2] : -1);
                    if (i0Var.b == null || !(i0Var.i instanceof sg.d)) {
                        GLES20.glUniform1f(v0Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(v0Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(v0Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, i0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) i0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) i0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (i0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (i0Var.b != null) {
                i0Var.n(i0Var.g(), i0Var.b, (1.0f - (i0Var.I * 0.5f)) - (i0Var.J * 0.5f));
            } else if (i0Var.c != null) {
                i0Var.o(i0Var.j(), i0Var.g(), i0Var.c, 1.0f);
            } else {
                int j3 = i0Var.j();
                f10 = 0.0f;
                v0 v0Var2 = (v0) i0Var.r.get(i0Var.G ? "maskingBlit" : "blit");
                if (j3 != 0 && v0Var2 != null) {
                    GLES20.glUseProgram(v0Var2.a);
                    f11 = 0.5f;
                    GLES20.glUniformMatrix4fv(v0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(i0Var.y));
                    GLES20.glUniform1f(v0Var2.d("alpha"), 1.0f);
                    if (i0Var.G) {
                        GLES20.glUniform1i(v0Var2.d("texture"), 1);
                        GLES20.glUniform1i(v0Var2.d("mask"), 0);
                        GLES20.glUniform1f(v0Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j3);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, i0Var.l.c());
                    } else {
                        GLES20.glUniform1i(v0Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j3);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) i0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) i0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    gc.a();
                    i7 = i0Var.q;
                    if (i7 != 0 && i0Var.d != null && i0Var.I > f10) {
                        i0Var.o(i7, i0Var.g(), i0Var.d, (i0Var.J * f11) + (i0Var.I * f11));
                    }
                }
                f11 = 0.5f;
                i7 = i0Var.q;
                if (i7 != 0) {
                    i0Var.o(i7, i0Var.g(), i0Var.d, (i0Var.J * f11) + (i0Var.I * f11));
                }
            }
            f10 = 0.0f;
            f11 = 0.5f;
            i7 = i0Var.q;
            if (i7 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        sg.s0 s0Var3 = (sg.s0) this.b;
        s0Var3.b.eglSwapBuffers(s0Var3.c, s0Var3.e);
        u0 u0Var = ((sg.s0) this.b).E;
        if (!u0Var.s) {
            u0Var.s = true;
            org.telegram.messenger.g0.h3(new q2.d(this, 10));
        }
        if (((sg.s0) this.b).h) {
            return;
        }
        ((sg.s0) this.b).h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        if (r12 < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f6, code lost:
    
        if (r12 > 0) goto L50;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int R;
        int i7;
        l2.f0 f0Var;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ((qe.h) this.b).o();
                return;
            case 1:
                s8.a aVar = (s8.a) this.b;
                synchronized (aVar.a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 2:
                a();
                return;
            case 3:
                tg.j jVar = ((tp0) this.b).C0;
                if (jVar instanceof n2) {
                    ((n2) jVar).getEditText();
                    return;
                }
                return;
            case 4:
                u0.d dVar = (u0.d) this.b;
                r1 r1Var = dVar.c;
                u0.a aVar2 = dVar.a;
                if (dVar.F) {
                    if (dVar.y) {
                        dVar.y = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.e = currentAnimationTimeMillis;
                        aVar2.g = -1L;
                        aVar2.f = currentAnimationTimeMillis;
                        aVar2.h = 0.5f;
                    }
                    if ((aVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.g + aVar2.i) || !dVar.e()) {
                        dVar.F = false;
                        return;
                    }
                    if (dVar.E) {
                        dVar.E = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar2.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar2.f;
                    aVar2.f = currentAnimationTimeMillis2;
                    dVar.H.scrollListBy((int) (j3 * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * aVar2.d));
                    WeakHashMap weakHashMap = r0.i0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                ug.t0 t0Var = (ug.t0) this.b;
                ArrayList arrayList = t0Var.o3;
                if (t0Var.v3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((j1) i5.c.h(1, arrayList))) >= 0) {
                        View m10 = t0Var.g3.m(R + 1);
                        if (m10 != null) {
                            t0Var.l3 = false;
                            t0Var.z1(m10, true);
                            t0Var.w0(0, m10.getTop() - ((t0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                        }
                    }
                    t0Var.A1();
                    return;
                }
                return;
            case 6:
                s1 s1Var = (s1) this.b;
                try {
                    ug.r1 r1Var2 = s1Var.a;
                    if (r1Var2 != null) {
                        r1Var2.g();
                        s1Var.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 7:
                v4.y yVar = (v4.y) this.b;
                v4.v vVar = yVar.y;
                if (yVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = yVar.S;
                    long j11 = j10 != Long.MIN_VALUE ? currentTimeMillis - j10 : 0L;
                    v4.o0 layoutManager = yVar.I.getLayoutManager();
                    if (yVar.R == null) {
                        yVar.R = new Rect();
                    }
                    layoutManager.c(yVar.c.a, yVar.R);
                    if (layoutManager.d()) {
                        int i11 = (int) (yVar.s + yVar.n);
                        i7 = (i11 - yVar.R.left) - yVar.I.getPaddingLeft();
                        float f10 = yVar.n;
                        if (f10 < 0.0f) {
                        }
                        if (f10 > 0.0f) {
                            i7 = ((yVar.c.a.getWidth() + i11) + yVar.R.right) - (yVar.I.getWidth() - yVar.I.getPaddingRight());
                            break;
                        }
                    }
                    i7 = 0;
                    if (layoutManager.e()) {
                        int i12 = (int) (yVar.w + yVar.r);
                        int paddingTop = (i12 - yVar.R.top) - yVar.I.getPaddingTop();
                        float f11 = yVar.r;
                        if ((f11 < 0.0f && paddingTop < 0) || (f11 > 0.0f && (paddingTop = ((yVar.c.a.getHeight() + i12) + yVar.R.bottom) - (yVar.I.getHeight() - yVar.I.getPaddingBottom())) > 0)) {
                            i10 = paddingTop;
                        }
                    }
                    if (i7 != 0) {
                        int width = yVar.c.a.getWidth();
                        yVar.I.getWidth();
                        i7 = vVar.i(width, i7, j11);
                    }
                    if (i10 != 0) {
                        int height = yVar.c.a.getHeight();
                        yVar.I.getHeight();
                        i10 = vVar.i(height, i10, j11);
                    }
                    if (i7 == 0 && i10 == 0) {
                        yVar.S = Long.MIN_VALUE;
                        return;
                    }
                    if (yVar.S == Long.MIN_VALUE) {
                        yVar.S = currentTimeMillis;
                    }
                    yVar.I.scrollBy(i7, i10);
                    e1 e1Var = yVar.c;
                    if (e1Var != null) {
                        yVar.p(e1Var);
                    }
                    yVar.I.removeCallbacks(yVar.J);
                    RecyclerView recyclerView = yVar.I;
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                return;
            case 8:
                wg.u0 u0Var = (wg.u0) this.b;
                String str = u0Var.j2;
                if (str != null) {
                    u0Var.f1(u0Var.n2, str, false);
                    return;
                }
                return;
            case 9:
                c1 c1Var = (c1) this.b;
                String str2 = c1Var.k2;
                if (str2 != null) {
                    if (c1Var.t2 >= 0) {
                        ConnectionsManager.getInstance(c1Var.a).cancelRequest(c1Var.t2, true);
                        c1Var.t2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str2;
                    c1Var.t2 = ConnectionsManager.getInstance(c1Var.a).sendRequest(tL_contacts_search, new ai.e1(c1Var, 26));
                    return;
                }
                return;
            default:
                zi.v0 v0Var = (zi.v0) this.b;
                if (v0Var.a0 == 5 && (f0Var = v0Var.W) != null && v0Var.z) {
                    long l10 = f0Var.l();
                    long j12 = v0Var.K;
                    if (l10 < j12 || l10 >= v0Var.L) {
                        v0Var.W.Z0(5, j12);
                    }
                    v0Var.d.getClass();
                    v0Var.i.postDelayed(this, 33L);
                    return;
                }
                return;
        }
    }
}
