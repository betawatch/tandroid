package s4;

import ai.g1;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import c8.jc;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.r1;
import org.telegram.messenger.a8;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ha;
import org.telegram.ui.vp0;
import org.telegram.ui.web.z0;
import sg.u0;
import sg.v0;
import tg.n2;
import ug.l1;
import ug.s1;
import ug.t1;
import v4.f1;
import wg.e1;
import wg.w0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                    ha haVar = i0Var.F.m;
                    GLES20.glBindTexture(3553, haVar != null ? haVar.s[2] : -1);
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
                    jc.a();
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
            org.telegram.messenger.g0.g3(new z0(this, 13));
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
                tg.j jVar = ((vp0) this.b).C0;
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
                ug.u0 u0Var = (ug.u0) this.b;
                ArrayList arrayList = u0Var.o3;
                if (u0Var.v3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((l1) i5.c.h(1, arrayList))) >= 0) {
                        View m10 = u0Var.g3.m(R + 1);
                        if (m10 != null) {
                            u0Var.l3 = false;
                            u0Var.z1(m10, true);
                            u0Var.w0(0, m10.getTop() - ((u0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                        }
                    }
                    u0Var.A1();
                    return;
                }
                return;
            case 6:
                t1 t1Var = (t1) this.b;
                try {
                    s1 s1Var = t1Var.a;
                    if (s1Var != null) {
                        s1Var.g();
                        t1Var.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 7:
                v4.z zVar = (v4.z) this.b;
                v4.w wVar = zVar.y;
                if (zVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = zVar.S;
                    long j11 = j10 != Long.MIN_VALUE ? currentTimeMillis - j10 : 0L;
                    v4.p0 layoutManager = zVar.I.getLayoutManager();
                    if (zVar.R == null) {
                        zVar.R = new Rect();
                    }
                    layoutManager.c(zVar.c.a, zVar.R);
                    if (layoutManager.d()) {
                        int i11 = (int) (zVar.s + zVar.n);
                        i7 = (i11 - zVar.R.left) - zVar.I.getPaddingLeft();
                        float f10 = zVar.n;
                        if (f10 < 0.0f) {
                        }
                        if (f10 > 0.0f) {
                            i7 = ((zVar.c.a.getWidth() + i11) + zVar.R.right) - (zVar.I.getWidth() - zVar.I.getPaddingRight());
                            break;
                        }
                    }
                    i7 = 0;
                    if (layoutManager.e()) {
                        int i12 = (int) (zVar.w + zVar.r);
                        int paddingTop = (i12 - zVar.R.top) - zVar.I.getPaddingTop();
                        float f11 = zVar.r;
                        if ((f11 < 0.0f && paddingTop < 0) || (f11 > 0.0f && (paddingTop = ((zVar.c.a.getHeight() + i12) + zVar.R.bottom) - (zVar.I.getHeight() - zVar.I.getPaddingBottom())) > 0)) {
                            i10 = paddingTop;
                        }
                    }
                    if (i7 != 0) {
                        int width = zVar.c.a.getWidth();
                        zVar.I.getWidth();
                        i7 = wVar.i(width, i7, j11);
                    }
                    if (i10 != 0) {
                        int height = zVar.c.a.getHeight();
                        zVar.I.getHeight();
                        i10 = wVar.i(height, i10, j11);
                    }
                    if (i7 == 0 && i10 == 0) {
                        zVar.S = Long.MIN_VALUE;
                        return;
                    }
                    if (zVar.S == Long.MIN_VALUE) {
                        zVar.S = currentTimeMillis;
                    }
                    zVar.I.scrollBy(i7, i10);
                    f1 f1Var = zVar.c;
                    if (f1Var != null) {
                        zVar.p(f1Var);
                    }
                    zVar.I.removeCallbacks(zVar.J);
                    RecyclerView recyclerView = zVar.I;
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                return;
            case 8:
                w0 w0Var = (w0) this.b;
                String str = w0Var.j2;
                if (str != null) {
                    w0Var.g1(w0Var.n2, str, false);
                    return;
                }
                return;
            case 9:
                e1 e1Var = (e1) this.b;
                String str2 = e1Var.j2;
                if (str2 != null) {
                    if (e1Var.r2 >= 0) {
                        ConnectionsManager.getInstance(e1Var.a).cancelRequest(e1Var.r2, true);
                        e1Var.r2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str2;
                    e1Var.r2 = ConnectionsManager.getInstance(e1Var.a).sendRequest(tL_contacts_search, new g1(e1Var, 28));
                    return;
                }
                return;
            default:
                zi.u0 u0Var2 = (zi.u0) this.b;
                if (u0Var2.a0 == 5 && (f0Var = u0Var2.W) != null && u0Var2.z) {
                    long l10 = f0Var.l();
                    long j12 = u0Var2.K;
                    if (l10 < j12 || l10 >= u0Var2.L) {
                        u0Var2.W.Z0(5, j12);
                    }
                    u0Var2.d.getClass();
                    u0Var2.i.postDelayed(this, 33L);
                    return;
                }
                return;
        }
    }
}
