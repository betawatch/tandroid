// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v58 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public final be0 b;
    public final View c;
    public final View d;
    public final View e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v58(x58 x58Var, Context context) {
        super(context);
        this.f = x58Var;
        be0 be0Var = new be0(context);
        this.b = be0Var;
        addView(be0Var, nme.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, nme.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView m = ug8.m(linearLayout, textView, nme.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = m;
        m.setTextSize(1, 13.0f);
        m.setTextColor(-1);
        m.setSingleLine(true);
        m.setEllipsize(truncateAt);
        m.setMaxLines(1);
        m.setGravity(80);
        linearLayout.addView(m, nme.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(bkb.L0(false));
        addView(view, nme.c(-1.0f, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r3.x != r3.z) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f;
        FrameLayout frameLayout = (FrameLayout) this.c;
        ma8 ma8Var = (ma8) this.f;
        float[] fArr = ma8Var.m;
        qla qlaVar = ma8Var.j;
        Path path = ma8Var.l;
        if (!ma8Var.n || ma8Var.e == null || ma8Var.a == null) {
            return;
        }
        ma8Var.h();
        float left = ma8Var.o - getLeft();
        float top = ma8Var.p - getTop();
        canvas.save();
        float f2 = ma8Var.O;
        float f3 = ma8Var.A;
        float f4 = ((f2 * f3) + 1.0f) - f3;
        canvas.scale(f4, f4, ma8Var.s + left, ma8Var.t + top);
        float f5 = ma8Var.J;
        float f6 = ma8Var.A;
        canvas.translate((f5 * f6) + left, (ma8Var.K * f6) + top);
        ImageReceiver imageReceiver = ma8Var.g;
        if (imageReceiver != null && imageReceiver.E()) {
            float f7 = ma8Var.B;
            if (f7 != 1.0f) {
                float f8 = f7 + 0.10666667f;
                ma8Var.B = f8;
                if (f8 > 1.0f) {
                    ma8Var.B = 1.0f;
                } else {
                    ma8Var.e();
                }
            }
            ma8Var.g.setAlpha(ma8Var.B);
        }
        float f9 = ma8Var.u;
        float f10 = ma8Var.v;
        float f11 = ma8Var.w;
        float f12 = ma8Var.y;
        if (f11 == f12) {
            f = 1.0f;
        } else {
            f = 1.0f;
        }
        float f13 = f4 < f ? 0.0f : f4 < 1.4f ? (f4 - f) / 0.4f : f;
        float f14 = ma8Var.z;
        float f15 = ma8Var.x;
        float f16 = ((f14 - f15) / 2.0f) * f13;
        f9 -= f16;
        float f17 = ((f12 - f11) / 2.0f) * f13;
        f10 -= f17;
        ImageReceiver imageReceiver2 = ma8Var.f;
        if (imageReceiver2 != null) {
            imageReceiver2.i0(f9, f10, (f16 * 2.0f) + f15, (f17 * 2.0f) + f11);
        }
        if (ma8Var.R) {
            frameLayout.setPivotX(ma8Var.s - ma8Var.u);
            frameLayout.setPivotY(ma8Var.t - ma8Var.v);
            frameLayout.setScaleY(f4);
            frameLayout.setScaleX(f4);
            frameLayout.setTranslationX((ma8Var.J * f4 * ma8Var.A) + f9 + left);
            frameLayout.setTranslationY((ma8Var.K * f4 * ma8Var.A) + f10 + top);
        } else {
            ImageReceiver imageReceiver3 = ma8Var.f;
            if (imageReceiver3 != null) {
                if (ma8Var.B != f) {
                    if (imageReceiver3.y() != null || ma8Var.f.m() != null || ma8Var.g.y() != null || ma8Var.g.m() != null) {
                        invalidate();
                    }
                    ma8Var.f.h(canvas, null);
                    ImageReceiver imageReceiver4 = ma8Var.g;
                    ImageReceiver imageReceiver5 = ma8Var.f;
                    imageReceiver4.i0(imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.N0, imageReceiver5.O0);
                    ma8Var.g.h(canvas, null);
                } else {
                    ma8Var.g.i0(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.N0, imageReceiver3.O0);
                    ma8Var.g.h(canvas, null);
                    if (ma8Var.g.y() != null || ma8Var.g.m() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (ma8Var.i) {
            ma8Var.h.setAlpha(ma8Var.f.getAlpha());
            ma8Var.h.s0(ma8Var.f.z());
            ImageReceiver imageReceiver6 = ma8Var.h;
            ImageReceiver imageReceiver7 = ma8Var.f;
            imageReceiver6.i0(imageReceiver7.L0, imageReceiver7.M0, imageReceiver7.N0, imageReceiver7.O0);
            ma8Var.h.h(canvas, null);
            int[] z = ma8Var.f.z();
            float f18 = z[0];
            fArr[1] = f18;
            fArr[0] = f18;
            float f19 = z[1];
            fArr[3] = f19;
            fArr[2] = f19;
            float f20 = z[2];
            fArr[5] = f20;
            fArr[4] = f20;
            float f21 = z[3];
            fArr[7] = f21;
            fArr[6] = f21;
            RectF rectF = gl.P;
            ImageReceiver imageReceiver8 = ma8Var.f;
            rectF.set(imageReceiver8.L0, imageReceiver8.M0, imageReceiver8.w(), ma8Var.f.x());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (ma8Var.k != null) {
                ImageReceiver imageReceiver9 = ma8Var.f;
                canvas.translate(imageReceiver9.L0, imageReceiver9.M0);
                pla plaVar = ma8Var.k;
                v58 v58Var = ma8Var.d;
                ImageReceiver imageReceiver10 = ma8Var.f;
                plaVar.c(canvas, v58Var, (int) imageReceiver10.N0, (int) imageReceiver10.O0, 1.0f, false);
            } else {
                qlaVar.h(bm2.o(-1, (int) (ma8Var.f.getAlpha() * 82.875f)));
                ImageReceiver imageReceiver11 = ma8Var.f;
                qlaVar.setBounds((int) imageReceiver11.L0, (int) imageReceiver11.M0, (int) imageReceiver11.w(), (int) ma8Var.f.x());
                qlaVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        la8 la8Var;
        switch (this.a) {
            case 1:
                ma8 ma8Var = (ma8) this.f;
                float[] fArr = ma8Var.Q;
                if (ma8Var.C == null) {
                    float f2 = ma8Var.P;
                    if (f2 != 1.0f) {
                        float f3 = f2 + 0.07272727f;
                        ma8Var.P = f3;
                        if (f3 > 1.0f) {
                            ma8Var.P = 1.0f;
                        } else {
                            ma8Var.e();
                        }
                    }
                }
                float interpolation = s33.f.getInterpolation(ma8Var.P) * ma8Var.A;
                float measuredHeight = getMeasuredHeight();
                float f4 = 0.0f;
                if (interpolation == 1.0f || (la8Var = ma8Var.F) == null) {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f = measuredHeight;
                } else {
                    la8Var.a(fArr);
                    canvas.save();
                    float f5 = 1.0f - interpolation;
                    float f6 = fArr[0] * f5;
                    float measuredHeight2 = (fArr[1] * f5) + (getMeasuredHeight() * interpolation);
                    canvas.clipRect(0.0f, f6, getMeasuredWidth(), measuredHeight2);
                    a(canvas);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    f = measuredHeight2;
                    f4 = f6;
                }
                ma8Var.c(canvas, 1.0f - interpolation, ma8Var.o - getLeft(), ma8Var.p - getTop(), f4, f);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Paint paint = ((x58) this.f).e;
                be0 be0Var = this.b;
                if (!be0Var.getImageReceiver().E() || be0Var.getImageReceiver().i1 != 1.0f) {
                    paint.setColor(bkb.w0(null, bkb.W9, false));
                    canvas.drawRect(0.0f, 0.0f, be0Var.getMeasuredWidth(), be0Var.getMeasuredHeight(), paint);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                this.e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v58(ma8 ma8Var, Context context) {
        super(context);
        this.f = ma8Var;
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setOutlineProvider(new xi((byte) 10));
        frameLayout.setClipToOutline(true);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        frameLayout.addView(be0Var);
        frameLayout.setWillNotDraw(false);
        ix ixVar = new ix(context);
        this.e = ixVar;
        ixVar.setBackgroundColor(0);
        frameLayout.addView(ixVar, nme.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        ixVar.addView(textureView, nme.c(-1.0f, -1));
        addView(frameLayout, nme.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
