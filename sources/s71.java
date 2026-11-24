// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class s71 extends View implements x74 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 17:
                super(context);
                Paint paint = new Paint(1);
                this.b = paint;
                xb8 xb8Var = new xb8(10);
                this.c = xb8Var;
                paint.setColor(-1);
                paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
                paint.setStyle(Paint.Style.STROKE);
                xb8Var.setCallback(this);
                xb8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                break;
            default:
                this.b = new Paint(2);
                break;
        }
    }

    public final boolean a() {
        vk0 vk0Var = (vk0) this.b;
        if (vk0Var.t) {
            return (vk0Var.m == 1.0f || !vk0Var.p) && vk0Var.n && vk0Var.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                mu1 mu1Var = (mu1) this.c;
                int backgroundSizeY = mu1Var.m1.getBackgroundSizeY();
                float x = getX();
                float e7 = mu1Var.e7(this);
                ku1 ku1Var = mu1Var.Ba;
                if (ku1Var != null) {
                    ku1Var.b(x, e7, measuredWidth, backgroundSizeY);
                } else {
                    bkb.q(x, e7, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), mu1Var.getThemedPaint("paintChatActionBackground"));
                ku1 ku1Var2 = mu1Var.Ba;
                if (ku1Var2 == null ? bkb.b1() : ku1Var2.g()) {
                    canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), mu1Var.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                e55 e55Var = (e55) this.c;
                float measuredWidth2 = e55Var.e0.getMeasuredWidth();
                k33 k33Var = e55Var.d0;
                float measuredWidth3 = (e55Var.f0.getMeasuredWidth() * k33Var.g) + ((1.0f - k33Var.g) * measuredWidth2);
                canvas.save();
                ff0 ff0Var = (ff0) this.b;
                ff0Var.setBounds(0, 0, gl.L(50.0f) + ((int) measuredWidth3), getMeasuredHeight());
                ff0Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((ui5) this.b)).o(canvas, 0);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        switch (this.a) {
            case 9:
                super.drawableStateChanged();
                ((ff0) this.b).setState(getDrawableState());
                break;
            default:
                super.drawableStateChanged();
                break;
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        switch (this.a) {
            case 9:
                super.jumpDrawablesToCurrentState();
                ((ff0) this.b).jumpToCurrentState();
                break;
            default:
                super.jumpDrawablesToCurrentState();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        View view;
        Paint paint;
        Bitmap[] bitmapArr;
        s71 s71Var;
        boolean z;
        ui5 ui5Var;
        Canvas canvas2 = canvas;
        int i = 0;
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                while (i < 7) {
                    canvas2.drawText(((String[]) this.b)[i], (width / 2.0f) + (i * width) + paddingLeft, ((getMeasuredHeight() - gl.L(2.0f)) / 2.0f) + gl.L(5.0f), ((b81) this.c).f);
                    i++;
                }
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                yh1 yh1Var = (yh1) this.c;
                kb0 kb0Var = yh1Var.f;
                if (kb0Var != null && kb0Var.getImageReceiver().E()) {
                    paint2.setAlpha((int) (yh1Var.s.getAlpha() * yh1Var.f.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                    break;
                }
                break;
            case 2:
            case 9:
            case 11:
            default:
                super.onDraw(canvas);
                break;
            case 3:
                vk0 vk0Var = (vk0) this.b;
                Paint paint3 = vk0Var.x;
                wjb wjbVar = vk0Var.y;
                Paint paint4 = vk0Var.w;
                boolean z2 = vk0Var.b;
                View view2 = vk0Var.c;
                s71 s71Var2 = vk0Var.d;
                if (s71Var2 != null) {
                    if (s71Var2.getMeasuredHeight() != 0 || s71Var2.getMeasuredWidth() != 0) {
                        if (z2 && !vk0Var.t && !vk0Var.p) {
                            vk0Var.a();
                            vk0Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = vk0Var.g;
                        if ((bitmapArr2 != null || vk0Var.o) && vk0Var.p) {
                            boolean z3 = vk0Var.n;
                            float f = vk0Var.m;
                            if (z3) {
                                if (f != 1.0f) {
                                    float f2 = f + 0.09f;
                                    vk0Var.m = f2;
                                    if (f2 > 1.0f) {
                                        vk0Var.m = 1.0f;
                                    }
                                    s71Var2.invalidate();
                                }
                            } else if (f != 0.0f) {
                                float f3 = f - 0.09f;
                                vk0Var.m = f3;
                                if (f3 < 0.0f) {
                                    vk0Var.m = 0.0f;
                                }
                                s71Var2.invalidate();
                            }
                        }
                        float f4 = vk0Var.p ? vk0Var.m : 1.0f;
                        if (bitmapArr2 != null || !vk0Var.o) {
                            if (f4 == 1.0f) {
                                canvas2.save();
                                paint = paint4;
                                z = z2;
                                view = view2;
                                s71Var = s71Var2;
                                bitmapArr = bitmapArr2;
                            } else {
                                view = view2;
                                paint = paint4;
                                bitmapArr = bitmapArr2;
                                s71Var = s71Var2;
                                z = z2;
                                canvas.saveLayerAlpha(0.0f, 0.0f, s71Var2.getMeasuredWidth(), s71Var2.getMeasuredHeight(), (int) (f4 * 255.0f), 31);
                                canvas2 = canvas;
                            }
                            if (bitmapArr != null) {
                                paint.setAlpha((int) (f4 * 255.0f));
                                if (z) {
                                    canvas2.translate(0.0f, vk0Var.u);
                                }
                                canvas2.save();
                                canvas2.scale(s71Var.getMeasuredWidth() / bitmapArr[1].getWidth(), s71Var.getMeasuredHeight() / bitmapArr[1].getHeight());
                                canvas2.drawBitmap(bitmapArr[1], 0.0f, 0.0f, paint);
                                canvas2.restore();
                                canvas2.save();
                                if (!z) {
                                    canvas2.translate(0.0f, vk0Var.u);
                                }
                                canvas2.scale(s71Var.getMeasuredWidth() / bitmapArr[0].getWidth(), vk0Var.s / bitmapArr[0].getHeight());
                                canvas2.drawBitmap(bitmapArr[0], 0.0f, 0.0f, paint);
                                canvas2.restore();
                                vk0Var.t = true;
                                canvas2.drawColor(436207616);
                            }
                            canvas2.restore();
                            if (vk0Var.n && !vk0Var.k) {
                                if (vk0Var.g == null || vk0Var.l) {
                                    vk0Var.k = true;
                                    vk0Var.l = false;
                                    if (vk0Var.e == null) {
                                        vk0Var.e = new Bitmap[2];
                                        vk0Var.j = new Canvas[2];
                                    }
                                    int i2 = 0;
                                    while (i2 < 2) {
                                        if (vk0Var.e[i2] != null && s71Var.getMeasuredWidth() == vk0Var.r && s71Var.getMeasuredHeight() == vk0Var.q) {
                                            vk0Var.e[i2].eraseColor(0);
                                        } else {
                                            int measuredHeight = s71Var.getMeasuredHeight();
                                            int measuredWidth = s71Var.getMeasuredWidth();
                                            int L = gl.L(200.0f) + gl.m;
                                            vk0Var.s = L;
                                            if (i2 == 0) {
                                                measuredHeight = L;
                                            }
                                            try {
                                                vk0Var.e[i2] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                vk0Var.j[i2] = new Canvas(vk0Var.e[i2]);
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                gl.c3(new oz(vk0Var, (byte) 9));
                                                return;
                                            }
                                        }
                                        if (i2 == 1) {
                                            vk0Var.e[i2].eraseColor(bkb.v0(bkb.c6, wjbVar));
                                        }
                                        vk0Var.j[i2].save();
                                        vk0Var.j[i2].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = wjbVar instanceof ku1 ? ((ku1) wjbVar).l() : bkb.s0();
                                        }
                                        View view3 = view;
                                        view3.setTag(67108867, Integer.valueOf(i2));
                                        if (i2 == 0) {
                                            vk0Var.j[i2].translate(0.0f, -vk0Var.u);
                                            view3.draw(vk0Var.j[i2]);
                                        }
                                        if (background != null && i2 == 1) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view3.getMeasuredWidth(), view3.getMeasuredHeight());
                                            background.draw(vk0Var.j[i2]);
                                            background.setBounds(bounds);
                                            view3.draw(vk0Var.j[i2]);
                                        }
                                        view3.setTag(67108867, null);
                                        vk0Var.j[i2].restore();
                                        i2++;
                                        view = view3;
                                    }
                                    vk0Var.q = s71Var.getMeasuredHeight();
                                    vk0Var.r = s71Var.getMeasuredWidth();
                                    vk0Var.v.b = s71Var.getMeasuredWidth();
                                    vk0Var.v.c = s71Var.getMeasuredHeight();
                                    uk0 uk0Var = vk0Var.v;
                                    if (uk0Var.b != 0 && uk0Var.c != 0) {
                                        do3 do3Var = vk0Var.a;
                                        if (do3Var == null) {
                                            do3Var = new do3("blur_thread_" + vk0Var, true);
                                            vk0Var.a = do3Var;
                                        }
                                        do3Var.postRunnable(vk0Var.v);
                                        break;
                                    } else {
                                        vk0Var.k = false;
                                        break;
                                    }
                                }
                            }
                        } else {
                            paint3.setAlpha((int) (f4 * 50.0f));
                            canvas2.drawPaint(paint3);
                            break;
                        }
                    }
                }
                break;
            case 4:
                Paint paint5 = (Paint) this.b;
                p82 p82Var = (p82) this.c;
                kb0 kb0Var2 = p82Var.e;
                if (kb0Var2 != null && kb0Var2.getImageReceiver().E()) {
                    paint5.setAlpha((int) (p82Var.e.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint5);
                    break;
                }
                break;
            case 5:
                Paint paint6 = (Paint) this.b;
                en2 en2Var = (en2) this.c;
                be0 be0Var = en2Var.x;
                if (be0Var != null && be0Var.getImageReceiver().E()) {
                    paint6.setColor(1426063360);
                    paint6.setAlpha((int) (en2Var.x.getImageReceiver().i1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), gl.L(20.0f), gl.L(20.0f), paint6);
                    break;
                }
                break;
            case 6:
                Paint paint7 = (Paint) this.b;
                it2 it2Var = (it2) this.c;
                be0 be0Var2 = it2Var.e;
                if (be0Var2 != null && be0Var2.getImageReceiver().E()) {
                    paint7.setAlpha((int) (it2Var.e.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    break;
                }
                break;
            case 7:
                canvas2.drawColor(855638016);
                kc4 kc4Var = (kc4) this.c;
                FrameLayout frameLayout = kc4Var.a;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = kc4Var.E;
                fc4.a(frameLayout, frameLayout2, fArr);
                canvas2.save();
                float y = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y < 1.0f) {
                    canvas2.clipRect(0.0f, (fArr[1] - y) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas2.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas2);
                canvas2.restore();
                break;
            case 8:
                Paint paint8 = (Paint) this.b;
                o85 o85Var = (o85) this.c;
                boolean z4 = o85Var.F;
                float f5 = o85Var.G;
                if (z4) {
                    if (f5 != 1.0f) {
                        float f6 = f5 + 0.064f;
                        o85Var.G = f6;
                        if (f6 > 1.0f) {
                            o85Var.G = 1.0f;
                        }
                        invalidate();
                    }
                } else if (f5 != 0.0f) {
                    float f7 = f5 - 0.064f;
                    o85Var.G = f7;
                    if (f7 < 0.0f) {
                        o85Var.G = 0.0f;
                    }
                    invalidate();
                }
                paint8.setColor(bm2.f(o85Var.G, 1711607061, 1714752530));
                canvas2.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - gl.L(25.0f), (gl.L(5.0f) * o85Var.G) + gl.L(35.0f), paint8);
                break;
            case 10:
                Paint paint9 = (Paint) this.b;
                wa5 wa5Var = (wa5) this.c;
                if (wa5Var.d != null && wa5Var.n.getVisibility() == 0 && wa5Var.d.getImageReceiver().E()) {
                    paint9.setAlpha((int) (wa5Var.n.getAlpha() * wa5Var.d.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 12:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight2 = getMeasuredHeight() / 2.0f;
                canvas2.drawCircle(measuredWidth2, measuredHeight2, getMeasuredWidth() / 2.0f, (Paint) this.b);
                nh8.d().f(-gl.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas2.drawCircle(measuredWidth2, measuredHeight2, (getMeasuredWidth() / 2.0f) - gl.L(2.0f), nh8.d().e());
                float L2 = gl.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight2 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight2 + L2));
                drawable.draw(canvas2);
                break;
            case 13:
                canvas2.drawColor(855638016);
                f36 f36Var = (f36) this.c;
                FrameLayout frameLayout3 = f36Var.n;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = f36Var.J;
                f36.a(frameLayout3, frameLayout4, fArr2);
                canvas2.save();
                float y2 = frameLayout3.getY() + ((View) frameLayout3.getParent()).getY();
                if (y2 < 1.0f) {
                    canvas2.clipRect(0.0f, (fArr2[1] - y2) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas2.translate(fArr2[0], fArr2[1]);
                frameLayout3.draw(canvas2);
                canvas2.restore();
                break;
            case 14:
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width2 = getWidth();
                    float height = getHeight();
                    float max = Math.max(width2 / ((Bitmap) this.c).getWidth(), height / ((Bitmap) this.c).getHeight());
                    canvas2.save();
                    canvas2.translate(b00.b(((Bitmap) this.c).getWidth(), max, width2, 2.0f), b00.b(((Bitmap) this.c).getHeight(), max, height, 2.0f));
                    canvas2.scale(max, max);
                    canvas2.drawBitmap((Bitmap) this.c, 0.0f, 0.0f, (Paint) this.b);
                    canvas2.restore();
                    break;
                }
                break;
            case 15:
                Paint paint10 = (Paint) this.b;
                ae6 ae6Var = (ae6) this.c;
                wh1 wh1Var = ae6Var.r;
                kb0 kb0Var3 = ae6Var.e;
                if (kb0Var3 != null && wh1Var.getVisibility() == 0) {
                    paint10.setAlpha((int) (wh1Var.getAlpha() * kb0Var3.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 16:
                r86 r86Var = (r86) this.b;
                super.onDraw(canvas);
                lm lmVar = (lm) this.c;
                lmVar.a = this;
                lmVar.e(false, 0.0f);
                float f8 = lmVar.c;
                if (f8 != 0.0f) {
                    if (f8 != 1.0f) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (lmVar.c * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    RectF rectF = gl.P;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    r86Var.e(rectF);
                    r86Var.j(24.0f);
                    r86Var.g(bm2.o(-1, 20), bm2.o(-1, 50), bm2.o(-1, 50), bm2.o(-1, 70));
                    r86Var.draw(canvas2);
                    invalidate();
                    canvas2.restore();
                    break;
                }
                break;
            case 17:
                Paint paint11 = (Paint) this.b;
                paint11.setStrokeWidth(gl.N(1.66f));
                canvas2.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gl.L(10.0f), paint11);
                xb8 xb8Var = (xb8) this.c;
                xb8Var.setBounds(0, 0, gl.L(10.0f), gl.L(10.0f));
                canvas2.save();
                canvas2.translate((getWidth() - gl.L(10.0f)) / 2.0f, (getHeight() - gl.L(10.0f)) / 2.0f);
                xb8Var.draw(canvas2);
                canvas2.restore();
                break;
            case 18:
                if (!((tx9) this.c).R0) {
                    dispatchDraw(canvas);
                    break;
                } else {
                    canvas2.drawColor(bkb.v0(bkb.F8, (wjb) this.b));
                    break;
                }
            case 19:
                qmb qmbVar = (qmb) this.c;
                int currentItem = qmbVar.l0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i3 = bkb.rf;
                paint12.setColor(qmbVar.d ? bkb.D0(i3) : qmbVar.getThemedColor(i3));
                while (i < 2) {
                    paint12.setAlpha(i == currentItem ? kk7.d4 : kk7.K1);
                    canvas2.drawCircle(gl.L((i * 15) + 3), gl.L(4.0f), gl.L(3.0f), paint12);
                    i++;
                }
                break;
            case 20:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(bkb.w0(null, bkb.c6, false));
                int measuredHeight3 = getMeasuredHeight() - gl.L(3.0f);
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint13);
                ui5Var = ((d) ((p3c) this.c)).parentLayout;
                ((ActionBarLayout) ui5Var).o(canvas2, measuredHeight3);
                break;
            case 21:
                super.onDraw(canvas);
                int save = canvas2.save();
                canvas2.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                jmc jmcVar = ((mmc) this.c).b;
                float[] fArr3 = (float[]) this.b;
                if (jmcVar != null) {
                    jmcVar.e(canvas2, fArr3);
                } else {
                    canvas2.drawColor(znc.a(-16216082, fArr3));
                }
                canvas2.restoreToCount(save);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 3:
                super.onSizeChanged(i, i2, i3, i4);
                vk0 vk0Var = (vk0) this.b;
                s71 s71Var = vk0Var.d;
                if (vk0Var.g != null && s71Var.getMeasuredHeight() != 0 && s71Var.getMeasuredWidth() != 0) {
                    vk0Var.a();
                    vk0Var.q = s71Var.getMeasuredHeight();
                    vk0Var.r = s71Var.getMeasuredWidth();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        setVisibility(f > 0.0f ? 0 : 8);
        setAlpha(f);
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 3:
                super.setAlpha(f);
                View view = ((mu1) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 8:
                super.setAlpha(f);
                ((o85) this.c).d.setAlpha(f);
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        switch (this.a) {
            case 8:
                super.setScaleX(f);
                ((o85) this.c).d.setScaleX(f);
                break;
            default:
                super.setScaleX(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        switch (this.a) {
            case 8:
                super.setScaleY(f);
                ((o85) this.c).d.setScaleY(f);
                break;
            default:
                super.setScaleY(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 8:
                super.setTranslationY(f);
                ((o85) this.c).d.setTranslationY(f);
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 3:
                super.setVisibility(i);
                View view = ((mu1) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 9:
                return ((ff0) this.b) == drawable || super.verifyDrawable(drawable);
            case 17:
                return drawable == ((xb8) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    @Override // x74
    public final void F(float f, int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(Context context, ui5 ui5Var) {
        super(context);
        this.a = (byte) 11;
        this.c = new fm0(0, this, s33.h, 380L, true);
        this.b = ui5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(en2 en2Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = en2Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(o85 o85Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = o85Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = (byte) 12;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s71(Object obj, Context context, Object obj2, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(mmc mmcVar, Context context) {
        super(context);
        this.a = (byte) 21;
        this.c = mmcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(p3c p3cVar, Context context) {
        super(context);
        this.a = (byte) 20;
        this.c = p3cVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(qmb qmbVar, Context context) {
        super(context);
        this.a = (byte) 19;
        this.c = qmbVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(y28 y28Var, Context context) {
        super(context);
        this.a = (byte) 16;
        this.b = new r86();
        this.c = new lm(250L, s33.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(mu1 mu1Var, Context context) {
        super(context);
        this.a = (byte) 2;
        this.c = mu1Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(mu1 mu1Var, Context context, View view, wjb wjbVar) {
        super(context);
        this.a = (byte) 3;
        this.c = mu1Var;
        vk0 vk0Var = new vk0(view, this, wjbVar);
        this.b = vk0Var;
        vk0Var.p = false;
        vk0Var.n = true;
    }
}
