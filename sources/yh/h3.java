package yh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.l11;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h3 extends hr {
    public final float E;
    public yf.n F;
    public int G;
    public int H;
    public final Paint I;
    public int J;
    public int K;
    public final Path c;
    public final RectF d;
    public final b8 e;
    public final int f;
    public final View h;
    public final ImageReceiver n;
    public final org.telegram.ui.Components.q5 r;
    public RadialGradient s;
    public final Matrix v;
    public final l11 w;
    public final l11 x;
    public org.telegram.ui.Components.q6 y;

    public h3(View view, TL_stars.StarGift starGift, int i10, float f7) {
        super(view);
        float f10;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        this.c = new Path();
        this.d = new RectF();
        this.v = new Matrix();
        this.I = new Paint(1);
        this.J = AndroidUtilities.dp(16.0f);
        this.K = 0;
        this.h = view;
        this.E = f7;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.n = imageReceiver;
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(view, AndroidUtilities.dp(i10 > 180 ? 24.0f : 18.0f), false);
        this.r = q5Var;
        this.f = i10;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f12 = i10;
            p7.a1(imageReceiver, starGift.sticker, (int) (0.75f * f12));
            String str = starGift.title;
            l11 l11Var = new l11(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
            this.w = l11Var;
            l11Var.o(-1);
            float f13 = i10 - 30;
            l11Var.q(AndroidUtilities.dp(f13));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            l11Var.a();
            l11Var.n(1);
            l11 l11Var2 = new l11(starGift.sold_out ? LocaleController.getString(R.string.Gift2SoldOutTitle) : LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]), 13.0f, null);
            this.x = l11Var2;
            l11Var2.q(AndroidUtilities.dp(f13));
            l11Var2.a();
            l11Var2.n(1);
            b8 b8Var = new b8(1, 40);
            this.e = b8Var;
            float f14 = 0.45f * f12;
            b8Var.f(-AndroidUtilities.dp(f14), -AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), AndroidUtilities.dp(f12 * 0.25f));
            float dp = AndroidUtilities.dp(30.0f);
            RectF rectF = b8Var.c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            PointF pointF = new PointF(AndroidUtilities.lerp(0, width, Utilities.fastRandom.nextFloat()), AndroidUtilities.lerp(0, height, Utilities.fastRandom.nextFloat()));
            int i15 = 1;
            int i16 = 0;
            float floor = (float) Math.floor(dp / Math.sqrt(2));
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
                int nextInt = arrayList2.size() > i21 ? Utilities.fastRandom.nextInt(arrayList2.size() - i21) : i16;
                PointF pointF2 = (PointF) arrayList2.get(nextInt);
                int i22 = i16;
                while (true) {
                    if (i22 >= 15) {
                        f10 = dp;
                        f11 = floor;
                        i11 = ceil;
                        i12 = width;
                        arrayList2.remove(nextInt);
                        break;
                    }
                    f10 = dp;
                    f11 = floor;
                    int i23 = i22;
                    double lerp = AndroidUtilities.lerp(1, 2, Utilities.fastRandom.nextFloat()) * f10;
                    double lerp2 = AndroidUtilities.lerp(i16, 360, Utilities.fastRandom.nextFloat());
                    PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(lerp2)) * lerp) + pointF2.x), (float) ((Math.sin(Math.toRadians(lerp2)) * lerp) + pointF2.y));
                    int dp2 = AndroidUtilities.dp(15.0f) / 2;
                    float f15 = pointF3.x;
                    float f16 = dp2;
                    if (f15 >= f16 && f15 < width - dp2) {
                        float f17 = pointF3.y;
                        if (f17 >= f16 && f17 < height - dp2) {
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
                                        if (v7.z6.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f10) {
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
                    dp = f10;
                    ceil = i13;
                    width = i14;
                    i16 = 0;
                }
                floor = f11;
                dp = f10;
                ceil = i11;
                width = i12;
                i15 = 1;
                i16 = 0;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = b8Var.b;
            int size2 = size - arrayList3.size();
            for (int i28 = 0; i28 < size2; i28++) {
                arrayList3.add(new a8(b8Var));
            }
            int size3 = arrayList.size();
            b8Var.j = size3;
            if (b8Var.l != null) {
                e0.g0 g0Var = new e0.g0(size3);
                b8Var.l = g0Var;
                Bitmap bitmap = b8Var.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i29 = 0;
                while (i29 < g0Var.a) {
                    int i30 = i29;
                    e0.g0.c((float[]) g0Var.c, i30, 0.0f, 0.0f, width2, height2);
                    i29 = i30 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i31 = 0; i31 < b8Var.j; i31++) {
                a8 a8Var = (a8) arrayList3.get(i31);
                PointF pointF5 = (PointF) arrayList.get(i31);
                b8Var.c(a8Var, currentTimeMillis, true);
                a8Var.a = pointF5.x + rectF.left;
                a8Var.b = pointF5.y + rectF.top;
                a8Var.h = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                a8Var.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) m5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) m5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) m5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                q5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.s = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i10) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                q5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                p7.a1(imageReceiver, stargiftattributemodel.document, (int) (i10 * 0.75f));
            }
        }
        ((Paint) this.b).setShader(this.s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override // org.telegram.ui.Components.hr
    public final void a() {
        this.r.a();
        this.n.onAttachedToWindow();
        if (this.F != null) {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            int i10 = this.H;
            if (currentTime >= i10) {
                i10 = this.G;
            }
            this.F.a(i10 - currentTime);
        }
    }

    @Override // org.telegram.ui.Components.hr
    public final void b() {
        this.r.b();
        this.n.onDetachedFromWindow();
        yf.n nVar = this.F;
        if (nVar != null) {
            nVar.b();
        }
    }

    public final void c(int i10) {
        l11 l11Var = this.x;
        if (l11Var != null) {
            l11Var.o(i10 | (-16777216));
        }
    }

    public final void d(int i10, int i11) {
        this.H = i10;
        this.G = i11;
        if (this.F == null) {
            this.F = new yf.n(new r5.d(this, 21));
        }
        this.F.a(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() < i10 ? i10 - r0 : i11 - r0);
        if (this.y == null) {
            org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, false, false);
            this.y = q6Var;
            q6Var.u(-1);
            this.y.w(AndroidUtilities.dp(12.0f));
            this.y.setCallback(new i.f(this, 9));
        }
        h();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l11 l11Var;
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
            Matrix matrix = this.v;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.s.setLocalMatrix(matrix);
            paint.setShader(this.s);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        i0.a(canvas, this.K, this.r, rectF.width(), rectF.height(), 1.0f, this.E);
        b8 b8Var = this.e;
        if (b8Var != null) {
            b8Var.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        l11 l11Var2 = this.w;
        ImageReceiver imageReceiver = this.n;
        if (l11Var2 == null || (l11Var = this.x) == null) {
            float min = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f10 = min / 2.0f;
            imageReceiver.setImageCoords(rectF.centerX() - f10, rectF.centerY() - f10, min, min);
            imageReceiver.draw(canvas);
        } else {
            if (this.y != null) {
                Paint paint2 = this.I;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + rectF.top, rectF.left + AndroidUtilities.dp(20.0f) + Math.max(this.y.c(), AndroidUtilities.dp(3.0f)), rectF.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + AndroidUtilities.dp(13.0f), rectF.top + AndroidUtilities.dp(14.0f));
                this.y.draw(canvas);
                canvas.restore();
            }
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.setImageCoords(rectF.centerX() - (min2 / 2.0f), (rectF.height() * 0.12f) + rectF.top, min2, min2);
            imageReceiver.draw(canvas);
            l11Var2.e(canvas, rectF.centerX() - (l11Var2.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(50.0f));
            l11Var.e(canvas, rectF.centerX() - (l11Var.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(30.0f));
        }
        canvas.restore();
    }

    public final void e(int i10, int i11) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(this.f) / 2.0f, new int[]{i10 | (-16777216), i11 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
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
        return AndroidUtilities.dp(this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f);
    }

    public final void h() {
        l11 l11Var;
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        int i10 = this.G;
        if (currentTime > i10) {
            this.y.t(LocaleController.getString(R.string.Gift2AuctionCountdownFinished), true, true);
        } else {
            int i11 = this.H;
            if (currentTime < i11) {
                this.y.t(LocaleController.formatString(R.string.Gift2AuctionCountdownStartsIn, AndroidUtilities.formatDuration(i11 - currentTime, true)), true, true);
            } else {
                this.y.t(AndroidUtilities.formatDuration(i10 - currentTime, true), true, true);
            }
        }
        if (currentTime <= this.G || (l11Var = this.x) == null) {
            return;
        }
        l11Var.r(LocaleController.getString(R.string.Gift2SoldOutTitle));
    }
}
