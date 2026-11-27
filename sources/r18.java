// default package

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r18 extends de0 implements jq3 {
    public RectF H;
    public RadialProgress2 I;
    public TLRPC.TL_wallPaper J;
    public int K;
    public LinearGradient L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public Paint R;
    public hh7 S;
    public int T;
    public mqb U;
    public int V;

    @Override // jq3
    public final void B(boolean z) {
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        if (z) {
            this.I.setIcon(4, false, true);
        } else {
            u(tL_wallPaper2, true, z);
        }
    }

    @Override // jq3
    public final void N(String str) {
        this.I.o(true, 1.0f);
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        u(tL_wallPaper2, false, true);
    }

    @Override // jq3
    public int getObserverTag() {
        return this.T;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.o(true, Math.min(1.0f, j / j2));
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) || radialProgress2.i.q == 10) {
            return;
        }
        u(tL_wallPaper2, false, true);
    }

    @Override // de0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    @Override // de0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        pqb pqbVar;
        int i3;
        int i4;
        pqb pqbVar2;
        int i5;
        int i6;
        pqb pqbVar3;
        int i7;
        int i8;
        hh7 hh7Var;
        BlendMode blendMode;
        RadialProgress2 radialProgress2 = this.I;
        RectF rectF = this.H;
        Paint paint = this.R;
        mqb mqbVar = this.U;
        float f = mqbVar.a.d.n1;
        this.a.P(null);
        pqb pqbVar4 = mqbVar.a.d;
        if (pqbVar4.b == 2) {
            i = pqbVar4.b1;
        } else {
            int C0 = aob.C0(aob.Ee);
            i = (int) pqbVar4.w.j;
            if (i == 0) {
                i2 = C0;
                pqbVar = mqbVar.a.d;
                if (pqbVar.b != 2) {
                    i3 = pqbVar.d1;
                } else {
                    int C02 = aob.C0(aob.Fe);
                    i3 = (int) pqbVar.w.k;
                    if (i3 == 0) {
                        i4 = C02;
                        pqbVar2 = mqbVar.a.d;
                        if (pqbVar2.b == 2) {
                            i5 = pqbVar2.e1;
                        } else {
                            int C03 = aob.C0(aob.Ge);
                            i5 = (int) pqbVar2.w.l;
                            if (i5 == 0) {
                                i6 = C03;
                                pqbVar3 = mqbVar.a.d;
                                if (pqbVar3.b != 2) {
                                    i7 = pqbVar3.f1;
                                } else {
                                    int C04 = aob.C0(aob.He);
                                    i7 = (int) pqbVar3.w.m;
                                    if (i7 == 0) {
                                        i7 = C04;
                                    }
                                }
                                pqb pqbVar5 = mqbVar.a.d;
                                int i9 = pqbVar5.b != 2 ? pqbVar5.j1 : pqbVar5.w.n;
                                int i10 = pqbVar5.m1;
                                if (i4 != 0) {
                                    i8 = i2;
                                    this.L = null;
                                    this.S = null;
                                    this.a.W(null);
                                } else if (this.L != null && i2 == this.M && i4 == this.N && i6 == this.O && i7 == this.P && i9 == this.Q) {
                                    i8 = i2;
                                } else {
                                    this.M = i2;
                                    this.N = i4;
                                    this.O = i6;
                                    this.P = i7;
                                    this.Q = i9;
                                    if (i6 != 0) {
                                        this.L = null;
                                        hh7 hh7Var2 = this.S;
                                        if (hh7Var2 != null) {
                                            i8 = i2;
                                            hh7Var2.n(false, i8, i4, i6, i7);
                                        } else {
                                            hh7 hh7Var3 = new hh7(i2, i4, i6, i7, true, false);
                                            i8 = i2;
                                            this.S = hh7Var3;
                                            hh7Var3.u(hl.L(6.0f));
                                            this.S.p(this);
                                        }
                                        ImageReceiver imageReceiver = this.a;
                                        if (f < 0.0f) {
                                            imageReceiver.W(this.S.k);
                                        } else {
                                            imageReceiver.W(null);
                                            int i11 = Build.VERSION.SDK_INT;
                                            ImageReceiver imageReceiver2 = this.a;
                                            if (i11 >= 29) {
                                                blendMode = BlendMode.SOFT_LIGHT;
                                                imageReceiver2.P(blendMode);
                                            } else {
                                                imageReceiver2.p1 = new PorterDuffColorFilter(mqbVar.a.d.l1, PorterDuff.Mode.SRC_IN);
                                            }
                                        }
                                    } else {
                                        i8 = i2;
                                        Rect d = yd0.d(yd0.c(i9), getMeasuredWidth(), getMeasuredHeight());
                                        this.L = new LinearGradient(d.left, d.top, d.right, d.bottom, new int[]{i8, i4}, (float[]) null, Shader.TileMode.CLAMP);
                                        this.S = null;
                                        this.a.W(null);
                                    }
                                }
                                hh7Var = this.S;
                                if (hh7Var == null) {
                                    hh7Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                                    this.S.draw(canvas);
                                } else {
                                    paint.setShader(this.L);
                                    if (this.L == null) {
                                        paint.setColor(i8);
                                    }
                                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                    canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
                                }
                                super.onDraw(canvas);
                                if (radialProgress2.i.q == 4) {
                                    radialProgress2.setColors(i10, i10, -1, -1);
                                    radialProgress2.draw(canvas);
                                    return;
                                }
                                return;
                            }
                        }
                        i6 = i5;
                        pqbVar3 = mqbVar.a.d;
                        if (pqbVar3.b != 2) {
                        }
                        pqb pqbVar52 = mqbVar.a.d;
                        if (pqbVar52.b != 2) {
                        }
                        int i102 = pqbVar52.m1;
                        if (i4 != 0) {
                        }
                        hh7Var = this.S;
                        if (hh7Var == null) {
                        }
                        super.onDraw(canvas);
                        if (radialProgress2.i.q == 4) {
                        }
                    }
                }
                i4 = i3;
                pqbVar2 = mqbVar.a.d;
                if (pqbVar2.b == 2) {
                }
                i6 = i5;
                pqbVar3 = mqbVar.a.d;
                if (pqbVar3.b != 2) {
                }
                pqb pqbVar522 = mqbVar.a.d;
                if (pqbVar522.b != 2) {
                }
                int i1022 = pqbVar522.m1;
                if (i4 != 0) {
                }
                hh7Var = this.S;
                if (hh7Var == null) {
                }
                super.onDraw(canvas);
                if (radialProgress2.i.q == 4) {
                }
            }
        }
        i2 = i;
        pqbVar = mqbVar.a.d;
        if (pqbVar.b != 2) {
        }
        i4 = i3;
        pqbVar2 = mqbVar.a.d;
        if (pqbVar2.b == 2) {
        }
        i6 = i5;
        pqbVar3 = mqbVar.a.d;
        if (pqbVar3.b != 2) {
        }
        pqb pqbVar5222 = mqbVar.a.d;
        if (pqbVar5222.b != 2) {
        }
        int i10222 = pqbVar5222.m1;
        if (i4 != 0) {
        }
        hh7Var = this.S;
        if (hh7Var == null) {
        }
        super.onDraw(canvas);
        if (radialProgress2.i.q == 4) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(100.0f), hl.L(100.0f));
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        r18 r18Var;
        this.J = tL_wallPaper;
        if (tL_wallPaper != null) {
            r18Var = this;
            r18Var.g(1, 0L, jn5.c(xb4.w(tL_wallPaper.document.thumbs, hl.L(100.0f), false, null, false), tL_wallPaper.document), null, tL_wallPaper, "100_100", null, "png");
        } else {
            r18Var = this;
            r18Var.setImageDrawable(null);
        }
        r18Var.v(false);
    }

    public final void u(Object obj, boolean z, boolean z2) {
        File J;
        String str;
        int i = this.K;
        RadialProgress2 radialProgress2 = this.I;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            String r = xb4.r(null, tL_wallPaper.document);
            if (TextUtils.isEmpty(r)) {
                return;
            }
            xb4.G(i);
            J = xb4.J(tL_wallPaper.document, null, true, true);
            str = r;
        } else {
            if (!(obj instanceof ro6)) {
                radialProgress2.setIcon(6, z, z2);
                return;
            }
            ro6 ro6Var = (ro6) obj;
            TLRPC.Photo photo = ro6Var.K;
            if (photo != null) {
                TLRPC.PhotoSize w = xb4.w(photo.sizes, this.V, true, null, false);
                xb4.G(i);
                J = xb4.J(w, null, true, true);
                str = xb4.r(null, w);
            } else {
                J = in5.w(ro6Var.C);
                str = J.getName();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
        }
        if (J.exists()) {
            lq3.q(i).v(this);
            radialProgress2.o(z2, 1.0f);
            radialProgress2.setIcon(6, z, z2);
            return;
        }
        lq3.q(i).a(str, null, this);
        xb4.G(i).S(str);
        Float s = in5.z().s(str);
        if (s != null) {
            radialProgress2.o(z2, s.floatValue());
        } else {
            radialProgress2.o(z2, 0.0f);
        }
        radialProgress2.setIcon(10, z, z2);
    }

    public final void v(boolean z) {
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            this.I.setIcon(4, false, z);
        } else {
            u(tL_wallPaper, false, z);
        }
        super.invalidate();
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }
}
