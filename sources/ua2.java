// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ua2 {
    public final gb2 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String d;

    public ua2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i;
        int L;
        gb2 gb2Var = this.a;
        ArrayList arrayList = gb2Var.I5;
        if (!arrayList.isEmpty()) {
            int x = (int) motionEvent.getX();
            int P1 = (int) gb2Var.P1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = gb2Var.getWidthForButtons();
                if (gb2Var.Q5.O3()) {
                    L = (gb2Var.getMeasuredWidth() - widthForButtons) - gl.L(10.0f);
                } else if (gb2Var.v2()) {
                    L = gb2Var.getCompactLeft();
                } else {
                    L = gb2Var.N6 + gl.L(gb2Var.C6 ? 1.0f : 7.0f);
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    wo0 wo0Var = (wo0) arrayList.get(i2);
                    int L2 = (wo0Var.d + gb2Var.e7) - gl.L(2.0f);
                    float f = x;
                    float f2 = widthForButtons;
                    float f3 = (wo0Var.c * f2) + L;
                    if (f >= f3 && f <= (wo0Var.e * f2) + f3 && P1 >= L2 && P1 <= wo0Var.f + L2) {
                        gb2Var.N5 = i2;
                        gb2Var.r2();
                        if (wo0Var.s == null) {
                            ff0 Y = bkb.Y(bkb.v0(bkb.dd, gb2Var.cc), 6, 6);
                            wo0Var.s = Y;
                            Y.setCallback(gb2Var);
                            ff0 ff0Var = wo0Var.s;
                            int i3 = ((int) (wo0Var.c * f2)) + L;
                            ff0Var.setBounds(i3, L2, ((int) (wo0Var.e * f2)) + i3, wo0Var.f + L2);
                        }
                        wo0Var.s.setHotspot(f, P1);
                        wo0Var.s.setState(gb2Var.N2);
                        wo0Var.b(!wo0Var.m);
                        gb2Var.postDelayed(new eg(this, gb2Var.N5, (byte) 26), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (gb2Var.N5 != -1) {
                    gb2Var.playSoundEffect(0);
                    wo0 wo0Var2 = (wo0) arrayList.get(gb2Var.N5);
                    ff0 ff0Var2 = wo0Var2.s;
                    if (ff0Var2 != null) {
                        ff0Var2.setState(StateSet.NOTHING);
                    }
                    wo0Var2.b(false);
                    if (gb2Var.Q5.r1) {
                        Toast.makeText(gb2Var.getContext(), k96.M0(2131748338, null), 1).show();
                    } else {
                        bb2 bb2Var = gb2Var.eb;
                        if (bb2Var != null && !wo0Var2.m) {
                            iq0 iq0Var = wo0Var2.j;
                            if (iq0Var != null) {
                                bb2Var.O1(gb2Var, iq0Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = wo0Var2.i;
                                if (keyboardInlineButton != null) {
                                    bb2Var.V0(gb2Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    gb2Var.N5 = -1;
                    gb2Var.r2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i = gb2Var.N5) != -1) {
                wo0 wo0Var3 = (wo0) arrayList.get(i);
                ff0 ff0Var3 = wo0Var3.s;
                if (ff0Var3 != null) {
                    ff0Var3.setState(StateSet.NOTHING);
                }
                wo0Var3.b(false);
                gb2Var.N5 = -1;
                gb2Var.r2();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0541 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, ArrayList arrayList, int i) {
        int L;
        int i2;
        int i3;
        nb2 nb2Var;
        boolean z;
        wjb wjbVar;
        boolean z2;
        Path path;
        gb2 gb2Var;
        float a;
        boolean z3;
        int i4;
        int a2;
        r86 r86Var;
        boolean z4;
        ff0 ff0Var;
        float f;
        ArrayList arrayList2 = arrayList;
        gb2 gb2Var2 = this.a;
        int i5 = gb2Var2.a6;
        nb2 nb2Var2 = gb2Var2.ub;
        RectF rectF = gb2Var2.c4;
        if (cja.l0) {
            return;
        }
        int widthForButtons = gb2Var2.getWidthForButtons();
        k27 k27Var = gb2Var2.Q5;
        if (k27Var != null && k27Var.O3()) {
            L = (gb2Var2.getMeasuredWidth() - widthForButtons) - gl.L(10.0f);
        } else if (gb2Var2.v2()) {
            L = gb2Var2.getCompactLeft();
        } else {
            L = gb2Var2.N6 + gl.L((gb2Var2.C6 || gb2Var2.K) ? 1.0f : 7.0f);
        }
        if (nb2Var2.x0) {
            L = (int) (L + nb2Var2.h0);
        }
        float L2 = (gb2Var2.e7 - gl.L(2.0f)) + nb2Var2.j0;
        float f2 = 2.0f;
        float f3 = 0.0f;
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            wo0 wo0Var = (wo0) arrayList2.get(i6);
            float f4 = wo0Var.d + wo0Var.f;
            if (f4 > f3) {
                f3 = f4;
            }
        }
        rectF.set(0.0f, L2, gb2Var2.getMeasuredWidth(), L2 + f3);
        if (i != 255) {
            canvas.saveLayerAlpha(rectF, i, 31);
        } else {
            canvas.save();
        }
        int i7 = 0;
        boolean z5 = false;
        while (i7 < arrayList2.size()) {
            wo0 wo0Var2 = (wo0) arrayList2.get(i7);
            float L3 = ((wo0Var2.d + gb2Var2.e7) - gl.L(f2)) + nb2Var2.j0;
            wo0Var2.a();
            if (wo0Var2.b) {
                float f5 = widthForButtons;
                float f6 = (wo0Var2.c * f5) + L;
                float f7 = ((wo0Var2.e * f5) + f6) - f6;
                float L4 = gl.L(3.66f);
                float f8 = f7 - L4;
                int round = Math.round(f8 / gl.L(8.66f));
                i2 = i7;
                float f9 = f8 / round;
                gb2Var2.z();
                float L5 = gl.L(1.0f);
                int i8 = 0;
                while (true) {
                    i3 = i5;
                    if (i8 >= round + 1) {
                        break;
                    }
                    float f10 = (i8 * f9) + f6;
                    int i9 = i8;
                    nb2 nb2Var3 = nb2Var2;
                    rectF.set(f10, L3, f10 + L4, wo0Var2.f + L3);
                    canvas.drawRoundRect(rectF, L5, L5, gb2Var2.c2("paintChatActionBackground"));
                    if (gb2Var2.i2()) {
                        canvas.drawRoundRect(rectF, L5, L5, bkb.g2);
                    }
                    i8 = i9 + 1;
                    i5 = i3;
                    nb2Var2 = nb2Var3;
                }
                nb2Var = nb2Var2;
                gb2Var = gb2Var2;
                i4 = widthForButtons;
            } else {
                i2 = i7;
                i3 = i5;
                nb2Var = nb2Var2;
                float f11 = widthForButtons;
                float f12 = (wo0Var2.c * f11) + L;
                rectF.set(f12, L3, (wo0Var2.e * f11) + f12, wo0Var2.f + L3);
                gb2Var2.z();
                boolean P0 = gb2Var2.P0(wo0Var2.i);
                iq0 iq0Var = wo0Var2.j;
                if (iq0Var != null && gb2Var2.Q5 != null) {
                    byte b = iq0Var.a;
                    if (b == 2) {
                        P0 |= na7.q1(i3).C2(gb2Var2.Q5.e1(), k27.B0(gb2Var2.Q5.k), true);
                    } else if (b == 1) {
                        z = false;
                        P0 |= na7.q1(i3).C2(gb2Var2.Q5.e1(), k27.B0(gb2Var2.Q5.k), false);
                        boolean z6 = (gb2Var2.U1 || !gb2Var2.V1) ? z : true;
                        boolean v2 = gb2Var2.v2();
                        wjbVar = gb2Var2.cc;
                        RectF rectF2 = wo0Var2.p;
                        Paint paint = wo0Var2.o;
                        float[] fArr = wo0Var2.q;
                        z2 = P0;
                        path = wo0Var2.n;
                        gb2Var = gb2Var2;
                        a = wo0Var2.a();
                        canvas.save();
                        if (a == 1.0f) {
                            z3 = z6;
                            i4 = widthForButtons;
                            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
                        } else {
                            z3 = z6;
                            i4 = widthForButtons;
                        }
                        Arrays.fill(fArr, gl.L(Math.min(6.75f, gba.U0)));
                        if ((wo0Var2.g & 9) == 9) {
                            float L6 = gl.L(gba.U0);
                            fArr[7] = L6;
                            fArr[6] = L6;
                        }
                        if ((wo0Var2.g & 10) == 10) {
                            float L7 = gl.L(gba.U0);
                            fArr[5] = L7;
                            fArr[4] = L7;
                        }
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas.drawPath(path, bkb.U0("paintChatActionBackground", wjbVar));
                        gq0 gq0Var = wo0Var2.k;
                        a2 = gq0Var == null ? gq0Var.a() : 1;
                        if (a2 != 1) {
                            int F = ug8.F(a2);
                            if (F == 1) {
                                paint.setColor(bkb.p1(0.7f, bkb.v0(bkb.Tl, wjbVar)));
                            } else if (F == 2) {
                                paint.setColor(bkb.p1(0.7f, bkb.v0(bkb.Vl, wjbVar)));
                            } else if (F == 3) {
                                paint.setColor(bkb.p1(0.7f, bkb.v0(bkb.Ul, wjbVar)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if ((wjbVar == null ? wjbVar.g() : bkb.b1()) && (a2 == 1 || (wjbVar != null && wjbVar.a()))) {
                            canvas.drawPath(path, bkb.g2);
                        }
                        canvas.save();
                        canvas.clipPath(path);
                        r86 r86Var2 = wo0Var2.r;
                        if (z2) {
                            if (r86Var2 != null && !r86Var2.d() && !wo0Var2.r.c()) {
                                wo0Var2.r.a();
                            }
                        } else if (r86Var2 == null) {
                            r86 r86Var3 = new r86();
                            wo0Var2.r = r86Var3;
                            r86Var3.j(5.5f);
                            r86 r86Var4 = wo0Var2.r;
                            r86Var4.D = true;
                            r86Var4.x.setStrokeWidth(gl.N(1.25f));
                        } else if (r86Var2.c() || wo0Var2.r.d()) {
                            r86 r86Var5 = wo0Var2.r;
                            r86Var5.b = -1L;
                            r86Var5.c = -1L;
                        }
                        r86Var = wo0Var2.r;
                        if (r86Var == null && (z2 || r86Var.d())) {
                            rectF2.set(rectF);
                            rectF2.inset(gl.N(0.625f), gl.N(0.625f));
                            wo0Var2.r.i(fArr);
                            wo0Var2.r.e(rectF2);
                            int p1 = v2 ? bkb.p1(0.125f, bkb.v0(bkb.Ga, wjbVar)) : bkb.v0(bkb.dd, wjbVar);
                            wo0Var2.r.g(bkb.p1(1.0f, p1), bkb.p1(2.5f, p1), bkb.p1(3.0f, p1), bkb.p1(10.0f, p1));
                            wo0Var2.r.setAlpha(kk7.d4);
                            wo0Var2.r.draw(canvas);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ff0Var = wo0Var2.s;
                        if (ff0Var != null) {
                            ff0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            wo0Var2.s.setAlpha(kk7.d4);
                            wo0Var2.s.draw(canvas);
                        }
                        canvas.restore();
                        canvas.save();
                        float L8 = (wo0Var2.t == null || wo0Var2.u != null) ? gl.L(26.0f) : 0;
                        float f13 = f2;
                        float z7 = oo1.z(rectF.width() - (wo0Var2.h.j() + (wo0Var2.t == null ? gl.L(4.0f) : 0)), L8, f13, rectF.left);
                        if (wo0Var2.u == null) {
                            f = 3.0f;
                            int centerY = (int) (rectF.centerY() - (gl.L(20.0f) / f13));
                            int i10 = (int) z7;
                            wo0Var2.u.setBounds(i10, centerY, gl.L(20.0f) + i10, gl.L(20.0f) + centerY);
                            wo0Var2.u.setAlpha(wo0Var2.m ? 128 : kk7.d4);
                            wo0Var2.u.draw(canvas);
                        } else {
                            f = 3.0f;
                            if (wo0Var2.t != null) {
                                int centerY2 = (int) (rectF.centerY() - (gl.L(24.0f) / 2.0f));
                                int i11 = (int) z7;
                                wo0Var2.t.setBounds(i11, centerY2, gl.L(24.0f) + i11, gl.L(24.0f) + centerY2);
                                wo0Var2.t.setAlpha(wo0Var2.m ? 128 : kk7.d4);
                                wo0Var2.t.draw(canvas);
                            }
                            wo0Var2.h.p = Math.max(1.0f, (rectF.width() - gl.L(15.0f)) - L8);
                            wo0Var2.h.f(canvas, z7, rectF.centerY(), wo0Var2.m ? 0.5f : 1.0f);
                            canvas.restore();
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                            if (wo0Var2.j != null) {
                                if (wo0Var2.m) {
                                    Drawable Q0 = bkb.Q0("drawableBotLock", wjbVar);
                                    hf0.u(Q0, (((int) rectF.right) - gl.L(f)) - Q0.getIntrinsicWidth(), rectF.top + gl.L(f));
                                    Q0.draw(canvas);
                                }
                            } else if (jdb.b(wo0Var2.i)) {
                                Drawable Q02 = bkb.Q0("drawableBotWebView", wjbVar);
                                hf0.u(Q02, (((int) rectF.right) - gl.L(f)) - Q02.getIntrinsicWidth(), rectF.top + gl.L(f));
                                Q02.draw(canvas);
                            } else if (tL_inlineButtonTypeUrl != null) {
                                Drawable Q03 = a46.q(tL_inlineButtonTypeUrl.url) ? bkb.Q0("drawableBotWebView", wjbVar) : wo0Var2.l ? bkb.Q0("drawable_botInvite", wjbVar) : bkb.Q0("drawableBotLink", wjbVar);
                                hf0.u(Q03, (((int) rectF.right) - gl.L(f)) - Q03.getIntrinsicWidth(), rectF.top + gl.L(f));
                                Q03.draw(canvas);
                            } else if (jdb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || jdb.c(wo0Var2.i, TL_keyboard.TL_buttonTypeRequestPeer.class)) {
                                Drawable Q04 = bkb.Q0("drawableBotInline", wjbVar);
                                hf0.u(Q04, (((int) rectF.right) - gl.L(f)) - Q04.getIntrinsicWidth(), rectF.top + gl.L(f));
                                Q04.draw(canvas);
                            } else if (jdb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) && z3) {
                                hf0.u(bkb.v4, (((int) rectF.right) - gl.L(5.0f)) - bkb.v4.getIntrinsicWidth(), rectF.top + gl.L(4.0f));
                                bkb.v4.draw(canvas);
                            }
                            canvas.restore();
                            if (z4) {
                                z5 = true;
                            }
                        }
                        z7 += L8;
                        wo0Var2.h.p = Math.max(1.0f, (rectF.width() - gl.L(15.0f)) - L8);
                        wo0Var2.h.f(canvas, z7, rectF.centerY(), wo0Var2.m ? 0.5f : 1.0f);
                        canvas.restore();
                        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl2 = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                        if (wo0Var2.j != null) {
                        }
                        canvas.restore();
                        if (z4) {
                        }
                    }
                }
                z = false;
                if (gb2Var2.U1) {
                }
                boolean v22 = gb2Var2.v2();
                wjbVar = gb2Var2.cc;
                RectF rectF22 = wo0Var2.p;
                Paint paint2 = wo0Var2.o;
                float[] fArr2 = wo0Var2.q;
                z2 = P0;
                path = wo0Var2.n;
                gb2Var = gb2Var2;
                a = wo0Var2.a();
                canvas.save();
                if (a == 1.0f) {
                }
                Arrays.fill(fArr2, gl.L(Math.min(6.75f, gba.U0)));
                if ((wo0Var2.g & 9) == 9) {
                }
                if ((wo0Var2.g & 10) == 10) {
                }
                path.rewind();
                path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.drawPath(path, bkb.U0("paintChatActionBackground", wjbVar));
                gq0 gq0Var2 = wo0Var2.k;
                if (gq0Var2 == null) {
                }
                if (a2 != 1) {
                }
                if (wjbVar == null ? wjbVar.g() : bkb.b1()) {
                    canvas.drawPath(path, bkb.g2);
                }
                canvas.save();
                canvas.clipPath(path);
                r86 r86Var22 = wo0Var2.r;
                if (z2) {
                }
                r86Var = wo0Var2.r;
                if (r86Var == null) {
                }
                z4 = false;
                ff0Var = wo0Var2.s;
                if (ff0Var != null) {
                }
                canvas.restore();
                canvas.save();
                float L82 = (wo0Var2.t == null || wo0Var2.u != null) ? gl.L(26.0f) : 0;
                float f132 = f2;
                float z72 = oo1.z(rectF.width() - (wo0Var2.h.j() + (wo0Var2.t == null ? gl.L(4.0f) : 0)), L82, f132, rectF.left);
                if (wo0Var2.u == null) {
                }
                z72 += L82;
                wo0Var2.h.p = Math.max(1.0f, (rectF.width() - gl.L(15.0f)) - L82);
                wo0Var2.h.f(canvas, z72, rectF.centerY(), wo0Var2.m ? 0.5f : 1.0f);
                canvas.restore();
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl22 = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (wo0Var2.j != null) {
                }
                canvas.restore();
                if (z4) {
                }
            }
            i7 = i2 + 1;
            arrayList2 = arrayList;
            i5 = i3;
            nb2Var2 = nb2Var;
            gb2Var2 = gb2Var;
            widthForButtons = i4;
            f2 = 2.0f;
        }
        gb2 gb2Var3 = gb2Var2;
        canvas.restore();
        if (z5) {
            gb2Var3.r2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02dc  */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(k27 k27Var, dd ddVar, int i, boolean z) {
        HashMap hashMap;
        gq0[][] gq0VarArr;
        int i2;
        int i3;
        int i4;
        HashMap hashMap2;
        HashMap hashMap3;
        int i5;
        HashMap hashMap4;
        ArrayList arrayList;
        int i6;
        byte b;
        long b2;
        wo0 wo0Var;
        int i7;
        int i8;
        CharSequence charSequence;
        HashMap hashMap5;
        HashMap hashMap6;
        CharSequence charSequence2;
        ?? r9;
        CharSequence charSequence3;
        CharSequence m;
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl;
        tgb tgbVar;
        String str;
        int i9 = ddVar.b;
        gb2 gb2Var = this.a;
        ArrayList arrayList2 = gb2Var.I5;
        int i10 = gb2Var.a6;
        gq0[][] gq0VarArr2 = (gq0[][]) ddVar.c;
        int length = gq0VarArr2.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (((1 << i12) & i9) != 0) {
                i11++;
            }
        }
        int L = (i11 * i) + gl.L(1.0f) + (gl.L(48.0f) * length);
        gb2Var.x0 = L;
        gb2Var.J6 = L;
        int L2 = gb2Var.b7 - gl.L(gb2Var.C6 ? 0.0f : 9.0f);
        gb2Var.K5 = L2;
        if (k27Var.x0 > L2) {
            int i13 = -gl.L((gb2Var.X6 ? 71 : z ? 52 : 0) + 10);
            gb2Var.K5 = Math.max(gb2Var.b7, Math.min(k27Var.x0, gl.O1() ? gl.P0() + i13 : b00.z(5.0f, Math.min(gb2Var.getParentWidth(), gl.q.y), i13)));
        }
        if (gb2Var.v2()) {
            gb2Var.K5 = gl.L(2.0f) + (gb2Var.C6 ? gb2Var.b7 - gl.L(8.0f) : gb2Var.getCompactContentWidth());
        }
        HashMap hashMap7 = this.b;
        HashMap hashMap8 = new HashMap(hashMap7);
        StringBuilder sb = k27Var.F0;
        HashMap hashMap9 = this.c;
        if (sb == null || (str = this.d) == null || !str.equals(sb.toString())) {
            StringBuilder sb2 = k27Var.F0;
            if (sb2 != null) {
                this.d = sb2.toString();
            }
            hashMap = null;
        } else {
            hashMap = new HashMap(hashMap9);
        }
        hashMap7.clear();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            int length2 = gq0VarArr2[i14].length;
            if (length2 == 0) {
                gq0VarArr = gq0VarArr2;
                i2 = i9;
                i3 = i10;
                i4 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                i5 = i16;
                hashMap4 = hashMap;
                arrayList = arrayList2;
            } else {
                int i17 = length2 - 1;
                gq0VarArr = gq0VarArr2;
                int D = ug8.D(2.0f, gb2Var.K5 - (gl.L(5.0f) * i17), length2);
                i2 = i9;
                int i18 = 0;
                while (i18 < length2) {
                    gq0 gq0Var = gq0VarArr[i14][i18];
                    int i19 = length;
                    int i20 = length2;
                    int i21 = i15;
                    wo0 wo0Var2 = new wo0(new sa2(gb2Var, (byte) 0));
                    wo0Var2.k = gq0Var;
                    if (gq0Var instanceof hq0) {
                        wo0Var2.i = ((hq0) gq0Var).a;
                    } else if (gq0Var instanceof iq0) {
                        wo0Var2.j = (iq0) gq0Var;
                        k27 k27Var2 = gb2Var.Q5;
                        if (k27Var2 != null) {
                            i6 = i17;
                            if (hc2.z(i10, 24, k27.B0(k27Var2.k)) && !hc2.z(i10, 5, k27.B0(gb2Var.Q5.k)) && ((b = wo0Var2.j.a) == 2 || b == 3)) {
                                wo0Var2.m = true;
                            }
                            b2 = gq0Var.b();
                            int c = gq0Var.c();
                            ArrayList arrayList3 = arrayList2;
                            if (b2 == 0) {
                                vl vlVar = new vl(0, i10, b2);
                                wo0Var2.u = vlVar;
                                vlVar.a(new ta2(gb2Var, (byte) 0));
                                wo0Var2.u.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            } else if (c != 0) {
                                Drawable drawable = gb2Var.getResources().getDrawable(c);
                                wo0Var2.t = drawable;
                                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            }
                            TL_keyboard.KeyboardInlineButton keyboardInlineButton = wo0Var2.i;
                            String f = keyboardInlineButton == null ? Utilities.f(de9.a(keyboardInlineButton)) : "";
                            String m2 = tb4.m(i14, i18, "_");
                            wo0Var = hashMap == null ? (wo0) hashMap.get(m2) : (wo0) hashMap8.get(f);
                            if (wo0Var == null) {
                                System.currentTimeMillis();
                            }
                            hashMap7.put(f, wo0Var2);
                            hashMap9.put(m2, wo0Var2);
                            wo0Var2.c = (i18 * (gl.L(5.0f) + D)) / gb2Var.K5;
                            int i22 = i16;
                            wo0Var2.d = de9.w(2.5f, gl.L(48.0f) * i14, i22);
                            wo0Var2.e = D / gb2Var.K5;
                            wo0Var2.f = gl.L(44.0f);
                            if (i18 == 0) {
                                wo0Var2.g |= 1;
                            }
                            i7 = i6;
                            if (i18 == i7) {
                                wo0Var2.g |= 2;
                            }
                            if (i14 == 0) {
                                wo0Var2.g |= 4;
                            }
                            if (i14 == i19 - 1) {
                                wo0Var2.g |= 8;
                            }
                            TextPaint textPaint = (TextPaint) gb2Var.c2("paintChatBotButton");
                            HashMap hashMap10 = hashMap;
                            int i23 = i10;
                            if (jdb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) || (k27.n1(k27Var.k).flags & 4) == 0) {
                                i8 = D;
                                charSequence = gq0Var.d();
                            } else {
                                i8 = D;
                                charSequence = k96.M0(2131747189, null);
                            }
                            if ((gq0Var instanceof iq0) || ((iq0) gq0Var).a != 4) {
                                hashMap5 = hashMap9;
                                hashMap6 = hashMap8;
                                charSequence2 = charSequence;
                            } else {
                                SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) ">");
                                hashMap5 = hashMap9;
                                cm2 cm2Var = new cm2(R.drawable.msg_inputarrow, 0);
                                cm2Var.I = 0.8f;
                                cm2Var.J = 0.8f;
                                cm2Var.x = 0.6f;
                                hashMap6 = hashMap8;
                                append.setSpan(cm2Var, append.length() - 1, append.length(), 33);
                                charSequence2 = append;
                            }
                            CharSequence charSequence4 = charSequence2;
                            if (jdb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                charSequence4 = charSequence2;
                                if (k27.n1(k27Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                    charSequence4 = jva.S0(charSequence2);
                                }
                            }
                            if (jdb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                r9 = 0;
                                charSequence3 = charSequence4;
                            } else {
                                SpannableStringBuilder append2 = new SpannableStringBuilder("c ").append(charSequence4);
                                r9 = 0;
                                cm2 cm2Var2 = new cm2(R.drawable.menu_copy_s, 0);
                                cm2Var2.I = 0.9f;
                                cm2Var2.J = 0.9f;
                                append2.setSpan(cm2Var2, 0, 1, 33);
                                charSequence3 = append2;
                            }
                            m = vu3.m(charSequence3, textPaint.getFontMetricsInt(), r9, null, r9);
                            if (wo0Var == null && (tgbVar = wo0Var.h) != null && TextUtils.equals(tgbVar.i(), m)) {
                                wo0Var2.h = wo0Var.h;
                            } else {
                                wo0Var2.h = new tgb(m, textPaint);
                            }
                            arrayList3.add(wo0Var2);
                            if (i18 != i7) {
                                float f2 = wo0Var2.c;
                                float f3 = gb2Var.K5;
                                i15 = Math.max(i21, ((int) (f2 * f3)) + ((int) (wo0Var2.e * f3)));
                            } else {
                                i15 = i21;
                            }
                            tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                            if (k27Var.p3() && tL_inlineButtonTypeUrl != null) {
                                try {
                                    Uri parse = Uri.parse(tL_inlineButtonTypeUrl.url);
                                    String lowerCase = parse.getHost().toLowerCase();
                                    wo0Var2.l = (parse.getQueryParameter("startgroup") == null && ((("http".equals(parse.getScheme()) || "https".equals(parse.getScheme())) && ("t.me".equals(lowerCase) || "telegram.me".equals(lowerCase) || "telegram.dog".equals(lowerCase))) || ("tg".equals(parse.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r9;
                                } catch (Exception unused) {
                                }
                            }
                            i18++;
                            i17 = i7;
                            length = i19;
                            i10 = i23;
                            D = i8;
                            hashMap9 = hashMap5;
                            hashMap8 = hashMap6;
                            arrayList2 = arrayList3;
                            hashMap = hashMap10;
                            i16 = i22;
                            length2 = i20;
                        }
                    }
                    i6 = i17;
                    b2 = gq0Var.b();
                    int c2 = gq0Var.c();
                    ArrayList arrayList32 = arrayList2;
                    if (b2 == 0) {
                    }
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = wo0Var2.i;
                    if (keyboardInlineButton2 == null) {
                    }
                    String m22 = tb4.m(i14, i18, "_");
                    if (hashMap == null) {
                    }
                    if (wo0Var == null) {
                    }
                    hashMap7.put(f, wo0Var2);
                    hashMap9.put(m22, wo0Var2);
                    wo0Var2.c = (i18 * (gl.L(5.0f) + D)) / gb2Var.K5;
                    int i222 = i16;
                    wo0Var2.d = de9.w(2.5f, gl.L(48.0f) * i14, i222);
                    wo0Var2.e = D / gb2Var.K5;
                    wo0Var2.f = gl.L(44.0f);
                    if (i18 == 0) {
                    }
                    i7 = i6;
                    if (i18 == i7) {
                    }
                    if (i14 == 0) {
                    }
                    if (i14 == i19 - 1) {
                    }
                    TextPaint textPaint2 = (TextPaint) gb2Var.c2("paintChatBotButton");
                    HashMap hashMap102 = hashMap;
                    int i232 = i10;
                    if (jdb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    i8 = D;
                    charSequence = gq0Var.d();
                    if (gq0Var instanceof iq0) {
                    }
                    hashMap5 = hashMap9;
                    hashMap6 = hashMap8;
                    charSequence2 = charSequence;
                    CharSequence charSequence42 = charSequence2;
                    if (jdb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    if (jdb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    }
                    m = vu3.m(charSequence3, textPaint2.getFontMetricsInt(), r9, null, r9);
                    if (wo0Var == null) {
                    }
                    wo0Var2.h = new tgb(m, textPaint2);
                    arrayList32.add(wo0Var2);
                    if (i18 != i7) {
                    }
                    tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                    if (k27Var.p3()) {
                        Uri parse2 = Uri.parse(tL_inlineButtonTypeUrl.url);
                        String lowerCase2 = parse2.getHost().toLowerCase();
                        wo0Var2.l = (parse2.getQueryParameter("startgroup") == null && ((("http".equals(parse2.getScheme()) || "https".equals(parse2.getScheme())) && ("t.me".equals(lowerCase2) || "telegram.me".equals(lowerCase2) || "telegram.dog".equals(lowerCase2))) || ("tg".equals(parse2.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r9;
                    }
                    i18++;
                    i17 = i7;
                    length = i19;
                    i10 = i232;
                    D = i8;
                    hashMap9 = hashMap5;
                    hashMap8 = hashMap6;
                    arrayList2 = arrayList32;
                    hashMap = hashMap102;
                    i16 = i222;
                    length2 = i20;
                }
                i3 = i10;
                i4 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                i5 = i16;
                hashMap4 = hashMap;
                arrayList = arrayList2;
                if ((i2 & (1 << i14)) != 0) {
                    wo0 wo0Var3 = new wo0(new sa2(gb2Var, (byte) 1));
                    wo0Var3.b = true;
                    wo0Var3.d = gl.L(49.0f) + de9.w(2.5f, gl.L(48.0f) * i14, i5);
                    wo0Var3.f = gl.L(2.0f);
                    wo0Var3.e = (gb2Var.K5 - gl.L(2.0f)) / gb2Var.K5;
                    arrayList.add(wo0Var3);
                    i5 += i;
                }
            }
            i14++;
            arrayList2 = arrayList;
            hashMap = hashMap4;
            gq0VarArr2 = gq0VarArr;
            i9 = i2;
            length = i4;
            hashMap9 = hashMap2;
            hashMap8 = hashMap3;
            i16 = i5;
            i10 = i3;
        }
        if (gb2Var.v2()) {
            return;
        }
        gb2Var.K5 = i15;
    }
}
