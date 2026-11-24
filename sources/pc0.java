// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class pc0 extends Drawable {
    public static final int[][] L = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public Drawable K;
    public final TextPaint a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public j15 f;
    public boolean g;
    public StaticLayout h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public boolean m;
    public byte n;
    public float o;
    public float p;
    public final StringBuilder q;
    public int r;
    public int s;
    public int t;
    public int u;
    public LinearGradient v;
    public boolean w;
    public boolean x;
    public int y;
    public final ylb z;

    public pc0(ylb ylbVar) {
        this.p = 1.0f;
        this.q = new StringBuilder(5);
        this.r = -1;
        this.w = true;
        this.x = false;
        this.y = nm7.d4;
        this.z = ylbVar;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(18.0f));
    }

    public static void a(String str, String str2, String str3, StringBuilder sb) {
        sb.setLength(0);
        if (str3 != null) {
            sb.append(str3);
            return;
        }
        if (str != null && str.length() > 0) {
            sb.append(t(str));
        }
        if (str2 != null && str2.length() > 0) {
            int lastIndexOf = str2.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            sb.append("\u200c");
            sb.append(t(str2));
            return;
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                int length2 = sb.length();
                sb.append("\u200c");
                sb.append(t(str.substring(length2)));
                return;
            }
        }
    }

    public static int c(long j) {
        return cmb.w0(null, cmb.o8[d(j)], false);
    }

    public static int d(long j) {
        return (int) Math.abs(j % cmb.o8.length);
    }

    public static int e(int i) {
        float[] N0 = cmb.N0(5);
        Color.colorToHSV(i, N0);
        int i2 = (int) N0[0];
        if (i2 >= 345 || i2 < 29) {
            return 0;
        }
        if (i2 < 67) {
            return 1;
        }
        if (i2 < 140) {
            return 3;
        }
        if (i2 < 199) {
            return 4;
        }
        if (i2 < 234) {
            return 5;
        }
        return i2 < 301 ? 2 : 6;
    }

    public static String t(String str) {
        ArrayList j = gw3.j(str, null);
        return (j.isEmpty() || ((ew3) j.get(0)).a != 0) ? str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1))) : str.substring(0, ((ew3) j.get(0)).b);
    }

    public final int b() {
        boolean z = this.g;
        int i = this.d;
        if (!z) {
            return i;
        }
        amb i2 = cmb.I.i(false);
        return cmb.B(cmb.I, i2 != null ? i2.c : 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0231  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        char c;
        byte b;
        Drawable[] drawableArr;
        Drawable drawable;
        float L2;
        float f;
        j15 j15Var;
        int i;
        int v0;
        int v02;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int width = bounds.width();
        boolean z = this.G;
        ylb ylbVar = this.z;
        if (z) {
            int i2 = this.J;
            int i3 = anb.b;
            if (i2 != i3) {
                this.J = i3;
                try {
                    if (this.d == this.H && this.e == this.I) {
                        byte b2 = this.n;
                        if (b2 == 13) {
                            v0 = cmb.w0(null, cmb.O9, false);
                        } else if (b2 == 2) {
                            v0 = cmb.v0(cmb.M7, ylbVar);
                        } else {
                            if (b2 == 27 || b2 == 12 || b2 == 1 || b2 == 14) {
                                v0 = cmb.v0(cmb.J7, ylbVar);
                                v02 = cmb.v0(cmb.K7, ylbVar);
                            } else if (b2 == 20) {
                                v0 = cmb.v0(cmb.Xk, ylbVar);
                                v02 = cmb.v0(cmb.Yk, ylbVar);
                            } else {
                                this.G = false;
                            }
                            this.H = v0;
                            this.d = v0;
                            this.I = v02;
                            this.e = v02;
                        }
                        v02 = v0;
                        this.H = v0;
                        this.d = v0;
                        this.I = v02;
                        this.e = v02;
                    } else {
                        this.G = false;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
        if (this.B) {
            int i4 = this.F;
            int i5 = anb.b;
            if (i4 != i5) {
                this.F = i5;
                if (this.n == 0 && this.d == this.D && this.e == this.E && (i = this.C) >= 0) {
                    int[] iArr = cmb.o8;
                    c = '\r';
                    if (i < iArr.length) {
                        int v03 = cmb.v0(iArr[i], ylbVar);
                        this.D = v03;
                        this.d = v03;
                        int v04 = cmb.v0(cmb.p8[this.C], ylbVar);
                        this.E = v04;
                        this.e = v04;
                        int p = on2.p(cmb.v0(cmb.I7, ylbVar), this.y);
                        TextPaint textPaint = this.a;
                        textPaint.setColor(p);
                        Paint paint = cmb.p0;
                        if (!this.c && (j15Var = this.f) != null) {
                            j15Var.b(bounds.left, bounds.top, r0 + width, r7 + width);
                            paint = this.f.c;
                        } else if (this.b) {
                            int p2 = on2.p(b(), this.y);
                            boolean z2 = this.g;
                            int i6 = this.e;
                            if (z2) {
                                amb i7 = cmb.I.i(false);
                                i6 = cmb.B(cmb.I, i7 != null ? i7.c : 0, i6);
                            }
                            int p3 = on2.p(i6, this.y);
                            if (this.v == null || this.s != bounds.height() || this.t != p2 || this.u != p3) {
                                int height = bounds.height();
                                this.s = height;
                                this.t = p2;
                                this.u = p3;
                                this.v = new LinearGradient(0.0f, 0.0f, 0.0f, height, p2, p3, Shader.TileMode.CLAMP);
                            }
                            paint.setShader(this.v);
                            paint.setAlpha(this.y);
                        } else {
                            paint.setShader(null);
                            paint.setColor(on2.p(b(), this.y));
                        }
                        canvas.save();
                        canvas.translate(bounds.left, bounds.top);
                        if (this.w) {
                            if (this.x) {
                                canvas.save();
                                float f2 = width / 2.0f;
                                canvas.rotate(-45.0f, f2, f2);
                            }
                            if (this.r > 0) {
                                RectF rectF = gm.P;
                                float f3 = width;
                                rectF.set(0.0f, 0.0f, f3, f3);
                                float f4 = this.r;
                                canvas.drawRoundRect(rectF, f4, f4, paint);
                            } else {
                                float f5 = width / 2.0f;
                                canvas.drawCircle(f5, f5, f5, paint);
                            }
                            if (this.x) {
                                canvas.restore();
                            }
                        }
                        b = this.n;
                        if (b == 2) {
                            if (this.o != 0.0f) {
                                int i8 = cmb.L7;
                                paint.setColor(on2.p(cmb.v0(i8, ylbVar), this.y));
                                float f6 = width / 2.0f;
                                canvas.drawCircle(f6, f6, this.o * f6, paint);
                                if (cmb.B1) {
                                    p09 p09Var = cmb.t1;
                                    p09Var.a0 = true;
                                    p09Var.L(cmb.w0(null, i8, true), "Arrow1");
                                    cmb.t1.L(cmb.w0(null, i8, true), "Arrow2");
                                    cmb.t1.j();
                                    cmb.B1 = false;
                                }
                            } else if (!cmb.B1) {
                                p09 p09Var2 = cmb.t1;
                                p09Var2.a0 = true;
                                p09Var2.L(this.d, "Arrow1");
                                cmb.t1.L(this.d, "Arrow2");
                                cmb.t1.j();
                                cmb.B1 = true;
                            }
                            p09 p09Var3 = cmb.t1;
                            int i9 = p09Var3.b;
                            int i10 = p09Var3.c;
                            int i11 = (width - i9) / 2;
                            int i12 = (width - i10) / 2;
                            canvas.save();
                            cmb.t1.setBounds(i11, i12, i9 + i11, i10 + i12);
                            cmb.t1.draw(canvas);
                            canvas.restore();
                        } else if (b != 0 || this.K != null) {
                            Drawable drawable2 = this.K;
                            if (drawable2 == null) {
                                drawable2 = b == 1 ? cmb.q0[0] : b == 4 ? cmb.q0[2] : b == 5 ? cmb.q0[3] : b == 6 ? cmb.q0[4] : b == 7 ? cmb.q0[5] : b == 8 ? cmb.q0[6] : b == 9 ? cmb.q0[7] : b == 10 ? cmb.q0[8] : b == 3 ? cmb.q0[10] : b == 12 ? cmb.q0[11] : b == 14 ? cmb.q0[12] : b == 15 ? cmb.q0[c] : b == 16 ? cmb.q0[14] : b == 19 ? cmb.q0[15] : b == 18 ? cmb.q0[16] : b == 20 ? cmb.q0[17] : b == 21 ? cmb.q0[18] : b == 22 ? cmb.q0[19] : b == 23 ? cmb.q0[21] : b == 24 ? cmb.q0[20] : b == 25 ? cmb.q0[22] : b == 26 ? cmb.q0[23] : b == 27 ? cmb.q0[24] : cmb.q0[9];
                            }
                            if (drawable2 != null) {
                                int intrinsicWidth = (int) (drawable2.getIntrinsicWidth() * this.p);
                                int intrinsicHeight = (int) (drawable2.getIntrinsicHeight() * this.p);
                                int i13 = (width - intrinsicWidth) / 2;
                                int i14 = (width - intrinsicHeight) / 2;
                                drawable2.setBounds(i13, i14, intrinsicWidth + i13, intrinsicHeight + i14);
                                int i15 = this.y;
                                if (i15 != 255) {
                                    drawable2.setAlpha(i15);
                                    drawable2.draw(canvas);
                                    drawable2.setAlpha(nm7.d4);
                                } else {
                                    drawable2.draw(canvas);
                                }
                            }
                        } else if (!this.m || (drawable = (drawableArr = cmb.q0)[1]) == null) {
                            if (this.A) {
                                this.A = false;
                                StringBuilder sb = this.q;
                                if (sb.length() > 0) {
                                    CharSequence m = gw3.m(sb.toString().toUpperCase(), textPaint.getFontMetricsInt(), true, null, 0);
                                    StaticLayout staticLayout = this.h;
                                    if (staticLayout == null || !TextUtils.equals(m, staticLayout.getText())) {
                                        try {
                                            StaticLayout staticLayout2 = new StaticLayout(m, textPaint, gm.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                            this.h = staticLayout2;
                                            if (staticLayout2.getLineCount() > 0) {
                                                this.k = this.h.getLineLeft(0);
                                                this.i = this.h.getLineWidth(0);
                                                this.j = this.h.getLineBottom(0);
                                            }
                                        } catch (Exception e2) {
                                            fc4.g(e2, true);
                                        }
                                    }
                                } else {
                                    this.h = null;
                                }
                            }
                            if (this.h != null) {
                                float f7 = width;
                                float L3 = f7 / gm.L(50.0f);
                                float f8 = f7 / 2.0f;
                                canvas.scale(L3, L3, f8, f8);
                                canvas.translate(((f7 - this.i) / 2.0f) - this.k, (f7 - this.j) / 2.0f);
                                this.h.draw(canvas);
                            }
                        } else {
                            int intrinsicWidth2 = drawable.getIntrinsicWidth();
                            int intrinsicHeight2 = drawableArr[1].getIntrinsicHeight();
                            if (this.l) {
                                f = intrinsicWidth2;
                                L2 = this.p;
                            } else {
                                if (intrinsicWidth2 > width - gm.L(6.0f) || intrinsicHeight2 > width - gm.L(6.0f)) {
                                    L2 = width / gm.L(50.0f);
                                    f = intrinsicWidth2;
                                }
                                int i16 = (width - intrinsicWidth2) / 2;
                                int i17 = (width - intrinsicHeight2) / 2;
                                drawableArr[1].setBounds(i16, i17, intrinsicWidth2 + i16, intrinsicHeight2 + i17);
                                drawableArr[1].draw(canvas);
                            }
                            intrinsicWidth2 = (int) (f * L2);
                            intrinsicHeight2 = (int) (intrinsicHeight2 * L2);
                            int i162 = (width - intrinsicWidth2) / 2;
                            int i172 = (width - intrinsicHeight2) / 2;
                            drawableArr[1].setBounds(i162, i172, intrinsicWidth2 + i162, intrinsicHeight2 + i172);
                            drawableArr[1].draw(canvas);
                        }
                        canvas.restore();
                    }
                } else {
                    c = '\r';
                }
                this.B = false;
                int p4 = on2.p(cmb.v0(cmb.I7, ylbVar), this.y);
                TextPaint textPaint2 = this.a;
                textPaint2.setColor(p4);
                Paint paint2 = cmb.p0;
                if (!this.c) {
                }
                if (this.b) {
                }
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                if (this.w) {
                }
                b = this.n;
                if (b == 2) {
                }
                canvas.restore();
            }
        }
        c = '\r';
        int p42 = on2.p(cmb.v0(cmb.I7, ylbVar), this.y);
        TextPaint textPaint22 = this.a;
        textPaint22.setColor(p42);
        Paint paint22 = cmb.p0;
        if (!this.c) {
        }
        if (this.b) {
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.w) {
        }
        b = this.n;
        if (b == 2) {
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i) {
        this.n = i;
        this.x = false;
        this.c = false;
        this.b = false;
        if (i == 13) {
            int w0 = cmb.w0(null, cmb.O9, false);
            this.e = w0;
            this.d = w0;
        } else {
            ylb ylbVar = this.z;
            if (i == 2) {
                int v0 = cmb.v0(cmb.M7, ylbVar);
                this.e = v0;
                this.d = v0;
            } else if (i == 27 || i == 12 || i == 1 || i == 14) {
                this.b = true;
                this.d = cmb.v0(cmb.J7, ylbVar);
                this.e = cmb.v0(cmb.K7, ylbVar);
            } else if (i == 20) {
                this.x = true;
                this.b = true;
                this.d = cmb.v0(cmb.Xk, ylbVar);
                this.e = cmb.v0(cmb.Yk, ylbVar);
            } else if (i == 3) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(5L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(5L)], ylbVar);
            } else if (i == 25) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(2L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(2L)], ylbVar);
            } else if (i == 26) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(1L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(1L)], ylbVar);
            } else if (i == 4) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(5L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(5L)], ylbVar);
            } else if (i == 5) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(4L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(4L)], ylbVar);
            } else if (i == 6 || i == 23) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(3L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(3L)], ylbVar);
            } else if (i == 7 || i == 24) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(1L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(1L)], ylbVar);
            } else if (i == 8) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(0L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(0L)], ylbVar);
            } else if (i == 9) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(6L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(6L)], ylbVar);
            } else if (i == 10) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(5L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(5L)], ylbVar);
            } else if (i == 17) {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(5L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(5L)], ylbVar);
            } else if (i == 21) {
                this.c = true;
                j15 j15Var = this.f;
                if (j15Var == null) {
                    j15Var = new j15();
                    this.f = j15Var;
                }
                j15Var.d(-8160001, -5217281, -36183, -1938945);
            } else if (i == 22) {
                this.c = true;
                j15 j15Var2 = this.f;
                if (j15Var2 == null) {
                    j15Var2 = new j15();
                    this.f = j15Var2;
                }
                j15Var2.d(-11694593, -13910017, -14622003, -15801871);
            } else {
                this.b = true;
                this.d = cmb.v0(cmb.o8[d(4L)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(4L)], ylbVar);
            }
        }
        byte b = this.n;
        this.g = (b == 2 || b == 1 || b == 20 || b == 21 || b == 27 || b == 12 || b == 14) ? false : true;
        this.G = b == 13 || b == 2 || b == 27 || b == 12 || b == 1 || b == 14 || b == 20;
        this.H = this.d;
        this.I = this.e;
        this.J = anb.b;
    }

    public final void g(int i) {
        this.b = false;
        this.c = false;
        this.e = i;
        this.d = i;
        this.g = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i, int i2) {
        this.b = true;
        this.c = false;
        this.d = i;
        this.e = i2;
        this.g = false;
    }

    public final void i(long j, String str, String str2) {
        j(j, str, str2, null);
    }

    public final void j(long j, String str, String str2, Integer num) {
        this.A = true;
        this.b = true;
        this.c = false;
        if (num != null) {
            r(num.intValue());
        } else {
            int i = cmb.o8[d(j)];
            ylb ylbVar = this.z;
            this.d = cmb.v0(i, ylbVar);
            this.e = cmb.v0(cmb.p8[d(j)], ylbVar);
            this.C = d(j);
            this.D = this.d;
            this.E = this.e;
            this.B = true;
            this.F = anb.b;
        }
        this.g = j == 5;
        this.n = (byte) 0;
        this.m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.q);
    }

    public final void k(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            q((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            p((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            m((TLRPC.ChatInvite) tLObject);
        }
    }

    public final void l(TLRPC.Chat chat) {
        p(chat);
    }

    public final void m(TLRPC.ChatInvite chatInvite) {
        String str = chatInvite.title;
        TLRPC.Chat chat = chatInvite.chat;
        j(0L, str, null, (chat == null || chat.color == null) ? null : Integer.valueOf(sd2.F(chat)));
    }

    public final void n(TLRPC.User user) {
        q(user);
    }

    public final void o(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            q((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            p((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            m((TLRPC.ChatInvite) tLObject);
        }
    }

    public final void p(TLRPC.Chat chat) {
        if (chat != null) {
            j(chat.id, chat.title, null, chat.color != null ? Integer.valueOf(sd2.F(chat)) : null);
        }
    }

    public final void q(TLRPC.User user) {
        if (user != null) {
            j(user.id, user.first_name, user.last_name, user.color != null ? Integer.valueOf(m9c.f(user)) : null);
            this.m = m9c.z(user);
        }
    }

    public final void r(int i) {
        j15 j15Var = this.f;
        if (j15Var != null) {
            this.b = false;
            this.c = true;
        } else {
            this.b = true;
            this.c = false;
        }
        int[][] iArr = L;
        ylb ylbVar = this.z;
        if (i < 14) {
            if (j15Var != null) {
                int[] iArr2 = iArr[d(i)];
                this.f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                return;
            } else {
                long j = i;
                this.d = cmb.v0(cmb.o8[d(j)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(j)], ylbVar);
                return;
            }
        }
        oc7 r1 = oc7.r1(z8c.t0);
        fc7 fc7Var = r1.E3;
        if (fc7Var == null || fc7Var.d(i) == null) {
            if (this.f != null) {
                int[] iArr3 = iArr[d(i)];
                this.f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                return;
            } else {
                long j2 = i;
                this.d = cmb.v0(cmb.o8[d(j2)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(j2)], ylbVar);
                return;
            }
        }
        int f = r1.E3.d(i).f();
        if (this.f != null) {
            int[] iArr4 = iArr[e(f)];
            this.f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            this.d = cmb.v0(cmb.o8[e(f)], ylbVar);
            this.e = cmb.v0(cmb.p8[e(f)], ylbVar);
        }
    }

    public final void s(int i) {
        this.a.setTextSize(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.y = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public pc0(int i, TLRPC.User user) {
        this((ylb) null);
        this.l = false;
        if (user != null) {
            j(user.id, user.first_name, user.last_name, null);
            this.m = m9c.z(user);
        }
    }

    public pc0(TLRPC.Chat chat) {
        this((ylb) null);
        this.l = false;
        p(chat);
    }

    public pc0() {
        this((ylb) null);
    }
}
