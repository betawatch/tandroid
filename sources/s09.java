// default package

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class s09 extends ImageView {
    public HashMap a;
    public p09 b;
    public q09 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public final void a() {
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.stop();
        }
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.K();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        p09 p09Var = this.b;
        return p09Var != null && p09Var.l0;
    }

    public final void d() {
        p09 p09Var = this.b;
        if (p09Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (p09Var != null) {
                p09Var.start();
            }
            q09 q09Var = this.c;
            if (q09Var != null) {
                q09Var.w0(false);
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        f(i, i2, i3, null);
    }

    public final void f(int i, int i2, int i3, int[] iArr) {
        setAnimation(new p09(i, gm.L(i2), gm.L(i3), false, iArr));
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
        gn5 gn5Var;
        String str;
        ?? r1;
        boolean z;
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.K();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        q09 q09Var2 = new q09(this);
        this.c = q09Var2;
        q09Var2.A1 = true;
        String str2 = document.localThumbPath;
        if (str2 != null) {
            gn5Var = gn5.g(str2);
            str = td4.n(i, i2, "_");
        } else {
            gn5Var = null;
            str = null;
        }
        TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
        if (this.n) {
            this.c.Y(gn5.b(document), i + "_" + i2 + "_lastframe", gn5.c(w, document), td4.n(i, i2, "_"), gn5Var, str, null, 0L, null, document, 1);
        } else {
            if (!"video/webm".equals(document.mime_type)) {
                meb d = eq3.d(document.thumbs, cmb.l6, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                r1 = 0;
                this.c.Y(gn5.b(document), i + "_" + i2 + "", gn5.c(w, document), td4.n(i, i2, "_"), gn5Var, str, d, 0L, null, document, 1);
                q09 q09Var3 = this.c;
                q09Var3.S0 = true;
                q09Var3.p0(this);
                z = this.d;
                q09 q09Var4 = this.c;
                if (z) {
                    q09Var4.M(r1);
                } else {
                    q09Var4.M(1);
                    q09 q09Var5 = this.c;
                    q09Var5.v0 = true;
                    q09Var5.u0 = true;
                }
                q09 q09Var6 = this.c;
                Integer num = this.h;
                q09Var6.m0(num == null ? num.intValue() : 7);
                this.c.C1 = r1;
                setImageDrawable(new r09(this, i, i2));
                if (this.e) {
                    return;
                }
                this.c.I();
                return;
            }
            q09 q09Var7 = this.c;
            gn5 b = gn5.b(document);
            String str3 = i + "_" + i2 + "_g";
            if (gn5Var == null) {
                gn5Var = gn5.c(w, document);
            }
            q09Var7.Z(b, str3, gn5Var, str, null, document.size, null, document, 1);
        }
        r1 = 0;
        q09 q09Var32 = this.c;
        q09Var32.S0 = true;
        q09Var32.p0(this);
        z = this.d;
        q09 q09Var42 = this.c;
        if (z) {
        }
        q09 q09Var62 = this.c;
        Integer num2 = this.h;
        q09Var62.m0(num2 == null ? num2.intValue() : 7);
        this.c.C1 = r1;
        setImageDrawable(new r09(this, i, i2));
        if (this.e) {
        }
    }

    public p09 getAnimatedDrawable() {
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
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.L(i, str);
        }
    }

    public final void i() {
        p09 p09Var = this.b;
        if (p09Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (p09Var != null) {
                p09Var.stop();
            }
            q09 q09Var = this.c;
            if (q09Var != null) {
                q09Var.x0();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.I();
            if (this.f) {
                this.c.w0(false);
            }
        }
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.stop();
        }
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.K();
        }
    }

    public void setAnimation(p09 p09Var) {
        if (this.b == p09Var) {
            return;
        }
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.K();
            this.c = null;
        }
        this.b = p09Var;
        p09Var.M(this);
        if (this.d) {
            this.b.F(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                p09 p09Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                p09Var2.s.put(str, num);
                p09Var2.B();
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
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.m0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z) {
        this.n = z;
    }

    public void setProgress(float f) {
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.O(true, f);
        }
    }

    public void c() {
    }
}
