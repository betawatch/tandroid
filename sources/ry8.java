// default package

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class ry8 extends ImageView {
    public HashMap a;
    public oy8 b;
    public py8 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public final void a() {
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.stop();
        }
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.K();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        oy8 oy8Var = this.b;
        return oy8Var != null && oy8Var.l0;
    }

    public final void d() {
        oy8 oy8Var = this.b;
        if (oy8Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (oy8Var != null) {
                oy8Var.start();
            }
            py8 py8Var = this.c;
            if (py8Var != null) {
                py8Var.w0(false);
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        f(i, i2, i3, null);
    }

    public final void f(int i, int i2, int i3, int[] iArr) {
        setAnimation(new oy8(i, gl.L(i2), gl.L(i3), false, iArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0113  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, int i2, TLRPC.Document document) {
        gl5 gl5Var;
        String str;
        ?? r1;
        boolean z;
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.K();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        py8 py8Var2 = new py8(this);
        this.c = py8Var2;
        py8Var2.A1 = true;
        String str2 = document.localThumbPath;
        if (str2 != null) {
            gl5Var = gl5.g(str2);
            str = tb4.m(i, i2, "_");
        } else {
            gl5Var = null;
            str = null;
        }
        TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
        if (this.n) {
            this.c.Y(gl5.b(document), i + "_" + i2 + "_lastframe", gl5.c(w, document), tb4.m(i, i2, "_"), gl5Var, str, null, 0L, null, document, 1);
        } else {
            if (!"video/webm".equals(document.mime_type)) {
                kcb d = uo3.d(document.thumbs, bkb.l6, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                r1 = 0;
                this.c.Y(gl5.b(document), i + "_" + i2 + "", gl5.c(w, document), tb4.m(i, i2, "_"), gl5Var, str, d, 0L, null, document, 1);
                py8 py8Var3 = this.c;
                py8Var3.S0 = true;
                py8Var3.p0(this);
                z = this.d;
                py8 py8Var4 = this.c;
                if (z) {
                    py8Var4.M(r1);
                } else {
                    py8Var4.M(1);
                    py8 py8Var5 = this.c;
                    py8Var5.v0 = true;
                    py8Var5.u0 = true;
                }
                py8 py8Var6 = this.c;
                Integer num = this.h;
                py8Var6.m0(num == null ? num.intValue() : 7);
                this.c.C1 = r1;
                setImageDrawable(new qy8(this, i, i2));
                if (this.e) {
                    return;
                }
                this.c.I();
                return;
            }
            py8 py8Var7 = this.c;
            gl5 b = gl5.b(document);
            String str3 = i + "_" + i2 + "_g";
            if (gl5Var == null) {
                gl5Var = gl5.c(w, document);
            }
            py8Var7.Z(b, str3, gl5Var, str, null, document.size, null, document, 1);
        }
        r1 = 0;
        py8 py8Var32 = this.c;
        py8Var32.S0 = true;
        py8Var32.p0(this);
        z = this.d;
        py8 py8Var42 = this.c;
        if (z) {
        }
        py8 py8Var62 = this.c;
        Integer num2 = this.h;
        py8Var62.m0(num2 == null ? num2.intValue() : 7);
        this.c.C1 = r1;
        setImageDrawable(new qy8(this, i, i2));
        if (this.e) {
        }
    }

    public oy8 getAnimatedDrawable() {
        return this.b;
    }

    public ImageReceiver getImageReceiver() {
        return this.c;
    }

    public final void h(int i, String str) {
        HashMap hashMap = this.a;
        if (hashMap == null) {
            hashMap = new HashMap();
            this.a = hashMap;
        }
        hashMap.put(str, Integer.valueOf(i));
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.L(i, str);
        }
    }

    public final void i() {
        oy8 oy8Var = this.b;
        if (oy8Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (oy8Var != null) {
                oy8Var.stop();
            }
            py8 py8Var = this.c;
            if (py8Var != null) {
                py8Var.x0();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.I();
            if (this.f) {
                this.c.w0(false);
            }
        }
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.stop();
        }
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.K();
        }
    }

    public void setAnimation(oy8 oy8Var) {
        if (this.b == oy8Var) {
            return;
        }
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.K();
            this.c = null;
        }
        this.b = oy8Var;
        oy8Var.M(this);
        if (this.d) {
            this.b.F(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                oy8 oy8Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                oy8Var2.s.put(str, num);
                oy8Var2.B();
            }
            this.b.j();
        }
        this.b.E(true);
        setImageDrawable(this.b);
    }

    public void setAutoRepeat(boolean z) {
        this.d = z;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.m0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z) {
        this.n = z;
    }

    public void setProgress(float f) {
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.O(true, f);
        }
    }

    public void c() {
    }
}
