package rh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p3 extends gq {
    public org.telegram.ui.Components.e6 D;
    public final float E;
    public rf.m F;
    public int G;
    public int H;
    public final Paint I;
    public int J;
    public int K;
    public final Path c;
    public final RectF d;
    public final s8 e;
    public final int f;
    public final View h;
    public final ImageReceiver n;
    public final org.telegram.ui.Components.d5 r;
    public RadialGradient s;
    public final Matrix w;
    public final qz0 x;
    public final qz0 y;

    public p3(View view, TL_stars.StarGift starGift, int i10, float f7) {
        super(view);
        float f10;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        this.c = new Path();
        this.d = new RectF();
        this.w = new Matrix();
        this.I = new Paint(1);
        this.J = org.telegram.messenger.i0.L(16.0f);
        this.K = 0;
        this.h = view;
        this.E = f7;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.n = imageReceiver;
        org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(i10 > 180 ? 24.0f : 18.0f), view, false);
        this.r = d5Var;
        this.f = i10;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f12 = i10;
            h8.b1(imageReceiver, starGift.sticker, (int) (0.75f * f12));
            String str = starGift.title;
            qz0 qz0Var = new qz0(str == null ? "Gift" : str, 16.0f, org.telegram.messenger.i0.o());
            this.x = qz0Var;
            qz0Var.n(-1);
            float f13 = i10 - 30;
            qz0Var.p(org.telegram.messenger.i0.L(f13));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            qz0Var.a();
            qz0Var.m(1);
            qz0 qz0Var2 = new qz0(starGift.sold_out ? cd.L0(2131749976, null) : cd.G(starGift.availability_total, "Gift2SoldAuctionPreviewGifts", new Object[0]), 13.0f, null);
            this.y = qz0Var2;
            qz0Var2.p(org.telegram.messenger.i0.L(f13));
            qz0Var2.a();
            qz0Var2.m(1);
            s8 s8Var = new s8(1, 40);
            this.e = s8Var;
            float f14 = 0.45f * f12;
            s8Var.f(-org.telegram.messenger.i0.L(f14), -org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f12 * 0.25f));
            float L = org.telegram.messenger.i0.L(30.0f);
            RectF rectF = s8Var.c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            d5.a aVar = Utilities.c;
            PointF pointF = new PointF(org.telegram.messenger.i0.W1(aVar.nextFloat(), 0, width), org.telegram.messenger.i0.W1(aVar.nextFloat(), 0, height));
            int i15 = 1;
            int i16 = 0;
            float floor = (float) Math.floor(L / Math.sqrt(2));
            int ceil = (int) Math.ceil(width / floor);
            int i17 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i18 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance((Class<?>) PointF.class, i17, i18);
            for (int i19 = 0; i19 < i17; i19++) {
                for (int i20 = 0; i20 < i18; i20++) {
                    pointFArr[i19][i20] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF.x / floor)][(int) Math.floor(pointF.y / floor)] = pointF;
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                int i21 = i15;
                int nextInt = arrayList2.size() > i21 ? Utilities.c.nextInt(arrayList2.size() - i21) : i16;
                PointF pointF2 = (PointF) arrayList2.get(nextInt);
                int i22 = i16;
                while (true) {
                    if (i22 >= 15) {
                        f10 = L;
                        f11 = floor;
                        i11 = ceil;
                        i12 = width;
                        arrayList2.remove(nextInt);
                        break;
                    }
                    f10 = L;
                    f11 = floor;
                    int i23 = i22;
                    double W1 = org.telegram.messenger.i0.W1(r14.nextFloat(), 1, 2) * f10;
                    double W12 = org.telegram.messenger.i0.W1(Utilities.c.nextFloat(), i16, 360);
                    PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(W12)) * W1) + pointF2.x), (float) ((Math.sin(Math.toRadians(W12)) * W1) + pointF2.y));
                    int L2 = org.telegram.messenger.i0.L(15.0f) / 2;
                    float f15 = pointF3.x;
                    float f16 = L2;
                    if (f15 >= f16 && f15 < width - L2) {
                        float f17 = pointF3.y;
                        if (f17 >= f16 && f17 < height - L2) {
                            int floor2 = (int) Math.floor(f15 / f11);
                            int floor3 = (int) Math.floor(pointF3.y / f11);
                            int max = Math.max(floor2 - 1, 0);
                            int min = Math.min(floor2 + 1, ceil);
                            int max2 = Math.max(floor3 - 1, 0);
                            int min2 = Math.min(floor3 + 1, ceil2);
                            while (max <= min) {
                                int i24 = min;
                                int i25 = max2;
                                while (i25 <= min2) {
                                    int i26 = i25;
                                    PointF pointF4 = pointFArr[max][i26];
                                    int i27 = max2;
                                    if (pointF4 != null) {
                                        i13 = ceil;
                                        i14 = width;
                                        if (w7.z8.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f10) {
                                            break;
                                        }
                                    } else {
                                        i13 = ceil;
                                        i14 = width;
                                    }
                                    i25 = i26 + 1;
                                    max2 = i27;
                                    ceil = i13;
                                    width = i14;
                                }
                                max++;
                                min = i24;
                            }
                            i11 = ceil;
                            i12 = width;
                            arrayList.add(pointF3);
                            pointFArr[(int) Math.floor(pointF3.x / f11)][(int) Math.floor(pointF3.y / f11)] = pointF3;
                            arrayList2.add(pointF3);
                            break;
                        }
                    }
                    i13 = ceil;
                    i14 = width;
                    i22 = i23 + 1;
                    floor = f11;
                    L = f10;
                    ceil = i13;
                    width = i14;
                    i16 = 0;
                }
                floor = f11;
                L = f10;
                ceil = i11;
                width = i12;
                i15 = 1;
                i16 = 0;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = s8Var.b;
            int size2 = size - arrayList3.size();
            for (int i28 = 0; i28 < size2; i28++) {
                arrayList3.add(new r8(s8Var));
            }
            int size3 = arrayList.size();
            s8Var.j = size3;
            if (s8Var.l != null) {
                cc.f fVar = new cc.f(size3);
                s8Var.l = fVar;
                Bitmap bitmap = s8Var.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i29 = 0;
                while (i29 < fVar.b) {
                    int i30 = i29;
                    cc.f.a((float[]) fVar.d, i30, 0.0f, 0.0f, width2, height2);
                    i29 = i30 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i31 = 0; i31 < s8Var.j; i31++) {
                r8 r8Var = (r8) arrayList3.get(i31);
                PointF pointF5 = (PointF) arrayList.get(i31);
                s8Var.c(r8Var, currentTimeMillis, true);
                r8Var.a = pointF5.x + rectF.left;
                r8Var.b = pointF5.y + rectF.top;
                r8Var.h = org.telegram.messenger.i0.T1(0.4f, 1.0f, Utilities.c.nextFloat());
                r8Var.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e6.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e6.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) e6.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                d5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.s = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.N(i10) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                d5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                h8.b1(imageReceiver, stargiftattributemodel.document, (int) (i10 * 0.75f));
            }
        }
        ((Paint) this.b).setShader(this.s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override // org.telegram.ui.Components.gq
    public final void a() {
        this.r.a();
        this.n.P();
        if (this.F != null) {
            int currentTime = ConnectionsManager.getInstance(d20.s0).getCurrentTime();
            int i10 = this.H;
            if (currentTime >= i10) {
                i10 = this.G;
            }
            this.F.a(i10 - currentTime);
        }
    }

    @Override // org.telegram.ui.Components.gq
    public final void b() {
        this.r.b();
        this.n.R();
        rf.m mVar = this.F;
        if (mVar != null) {
            mVar.b();
        }
    }

    public final void c(int i10) {
        qz0 qz0Var = this.y;
        if (qz0Var != null) {
            qz0Var.n(i10 | (-16777216));
        }
    }

    public final void d(int i10, int i11) {
        this.H = i10;
        this.G = i11;
        if (this.F == null) {
            this.F = new rf.m(new d0(this, 2));
        }
        this.F.a(ConnectionsManager.getInstance(d20.s0).getCurrentTime() < i10 ? i10 - r0 : i11 - r0);
        if (this.D == null) {
            org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, false, false);
            this.D = e6Var;
            e6Var.u(-1);
            this.D.w(org.telegram.messenger.i0.L(12.0f));
            this.D.setCallback(new bi.s0(this, 8));
        }
        h();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        qz0 qz0Var;
        Paint paint = (Paint) this.b;
        Rect bounds = getBounds();
        RectF rectF = this.d;
        rectF.set(bounds);
        canvas.save();
        Path path = this.c;
        path.rewind();
        float f7 = this.J;
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        if (this.s != null) {
            Matrix matrix = this.w;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.s.setLocalMatrix(matrix);
            paint.setShader(this.s);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        j0.a(canvas, this.K, this.r, rectF.width(), rectF.height(), 1.0f, this.E);
        s8 s8Var = this.e;
        if (s8Var != null) {
            s8Var.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        qz0 qz0Var2 = this.x;
        ImageReceiver imageReceiver = this.n;
        if (qz0Var2 == null || (qz0Var = this.y) == null) {
            float min = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f10 = min / 2.0f;
            imageReceiver.y0(rectF.centerX() - f10, rectF.centerY() - f10, min, min);
            imageReceiver.h(canvas, null);
        } else {
            if (this.D != null) {
                Paint paint2 = this.I;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f) + rectF.top, rectF.left + org.telegram.messenger.i0.L(20.0f) + Math.max(this.D.c(), org.telegram.messenger.i0.L(3.0f)), rectF.top + org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(8.5f), org.telegram.messenger.i0.L(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + org.telegram.messenger.i0.L(13.0f), rectF.top + org.telegram.messenger.i0.L(14.0f));
                this.D.draw(canvas);
                canvas.restore();
            }
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.y0(rectF.centerX() - (min2 / 2.0f), (rectF.height() * 0.12f) + rectF.top, min2, min2);
            imageReceiver.h(canvas, null);
            qz0Var2.e(canvas, rectF.centerX() - (qz0Var2.k() / 2.0f), rectF.bottom - org.telegram.messenger.i0.L(50.0f));
            qz0Var.e(canvas, rectF.centerX() - (qz0Var.k() / 2.0f), rectF.bottom - org.telegram.messenger.i0.L(30.0f));
        }
        canvas.restore();
    }

    public final void e(int i10, int i11) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.N(this.f) / 2.0f, new int[]{i10 | (-16777216), i11 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.s = radialGradient;
        ((Paint) this.b).setShader(radialGradient);
    }

    public final void f() {
        this.K = 3;
    }

    public final void g(int i10) {
        this.J = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(this.f);
    }

    public final void h() {
        qz0 qz0Var;
        int currentTime = ConnectionsManager.getInstance(d20.s0).getCurrentTime();
        int i10 = this.G;
        if (currentTime > i10) {
            this.D.t(cd.L0(2131750375, null), true, true);
        } else {
            int i11 = this.H;
            if (currentTime < i11) {
                this.D.t(cd.a0(null, null, 2131750374, org.telegram.messenger.i0.g0(i11 - currentTime, true, false)), true, true);
            } else {
                this.D.t(org.telegram.messenger.i0.g0(i10 - currentTime, true, false), true, true);
            }
        }
        if (currentTime <= this.G || (qz0Var = this.y) == null) {
            return;
        }
        qz0Var.q(cd.L0(2131749976, null));
    }
}
