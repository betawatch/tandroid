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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x78 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public final bf0 b;
    public final View c;
    public final View d;
    public final View e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x78(z78 z78Var, Context context) {
        super(context);
        this.f = z78Var;
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        addView(bf0Var, qoe.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, qoe.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView m = wi8.m(linearLayout, textView, qoe.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = m;
        m.setTextSize(1, 13.0f);
        m.setTextColor(-1);
        m.setSingleLine(true);
        m.setEllipsize(truncateAt);
        m.setMaxLines(1);
        m.setGravity(80);
        linearLayout.addView(m, qoe.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(cmb.L0(false));
        addView(view, qoe.c(-1.0f, -1));
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
        pc8 pc8Var = (pc8) this.f;
        float[] fArr = pc8Var.m;
        rna rnaVar = pc8Var.j;
        Path path = pc8Var.l;
        if (!pc8Var.n || pc8Var.e == null || pc8Var.a == null) {
            return;
        }
        pc8Var.h();
        float left = pc8Var.o - getLeft();
        float top = pc8Var.p - getTop();
        canvas.save();
        float f2 = pc8Var.O;
        float f3 = pc8Var.A;
        float f4 = ((f2 * f3) + 1.0f) - f3;
        canvas.scale(f4, f4, pc8Var.s + left, pc8Var.t + top);
        float f5 = pc8Var.J;
        float f6 = pc8Var.A;
        canvas.translate((f5 * f6) + left, (pc8Var.K * f6) + top);
        ImageReceiver imageReceiver = pc8Var.g;
        if (imageReceiver != null && imageReceiver.E()) {
            float f7 = pc8Var.B;
            if (f7 != 1.0f) {
                float f8 = f7 + 0.10666667f;
                pc8Var.B = f8;
                if (f8 > 1.0f) {
                    pc8Var.B = 1.0f;
                } else {
                    pc8Var.e();
                }
            }
            pc8Var.g.setAlpha(pc8Var.B);
        }
        float f9 = pc8Var.u;
        float f10 = pc8Var.v;
        float f11 = pc8Var.w;
        float f12 = pc8Var.y;
        if (f11 == f12) {
            f = 1.0f;
        } else {
            f = 1.0f;
        }
        float f13 = f4 < f ? 0.0f : f4 < 1.4f ? (f4 - f) / 0.4f : f;
        float f14 = pc8Var.z;
        float f15 = pc8Var.x;
        float f16 = ((f14 - f15) / 2.0f) * f13;
        f9 -= f16;
        float f17 = ((f12 - f11) / 2.0f) * f13;
        f10 -= f17;
        ImageReceiver imageReceiver2 = pc8Var.f;
        if (imageReceiver2 != null) {
            imageReceiver2.i0(f9, f10, (f16 * 2.0f) + f15, (f17 * 2.0f) + f11);
        }
        if (pc8Var.R) {
            frameLayout.setPivotX(pc8Var.s - pc8Var.u);
            frameLayout.setPivotY(pc8Var.t - pc8Var.v);
            frameLayout.setScaleY(f4);
            frameLayout.setScaleX(f4);
            frameLayout.setTranslationX((pc8Var.J * f4 * pc8Var.A) + f9 + left);
            frameLayout.setTranslationY((pc8Var.K * f4 * pc8Var.A) + f10 + top);
        } else {
            ImageReceiver imageReceiver3 = pc8Var.f;
            if (imageReceiver3 != null) {
                if (pc8Var.B != f) {
                    if (imageReceiver3.y() != null || pc8Var.f.m() != null || pc8Var.g.y() != null || pc8Var.g.m() != null) {
                        invalidate();
                    }
                    pc8Var.f.h(canvas, null);
                    ImageReceiver imageReceiver4 = pc8Var.g;
                    ImageReceiver imageReceiver5 = pc8Var.f;
                    imageReceiver4.i0(imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.N0, imageReceiver5.O0);
                    pc8Var.g.h(canvas, null);
                } else {
                    pc8Var.g.i0(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.N0, imageReceiver3.O0);
                    pc8Var.g.h(canvas, null);
                    if (pc8Var.g.y() != null || pc8Var.g.m() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (pc8Var.i) {
            pc8Var.h.setAlpha(pc8Var.f.getAlpha());
            pc8Var.h.s0(pc8Var.f.z());
            ImageReceiver imageReceiver6 = pc8Var.h;
            ImageReceiver imageReceiver7 = pc8Var.f;
            imageReceiver6.i0(imageReceiver7.L0, imageReceiver7.M0, imageReceiver7.N0, imageReceiver7.O0);
            pc8Var.h.h(canvas, null);
            int[] z = pc8Var.f.z();
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
            RectF rectF = gm.P;
            ImageReceiver imageReceiver8 = pc8Var.f;
            rectF.set(imageReceiver8.L0, imageReceiver8.M0, imageReceiver8.w(), pc8Var.f.x());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (pc8Var.k != null) {
                ImageReceiver imageReceiver9 = pc8Var.f;
                canvas.translate(imageReceiver9.L0, imageReceiver9.M0);
                qna qnaVar = pc8Var.k;
                x78 x78Var = pc8Var.d;
                ImageReceiver imageReceiver10 = pc8Var.f;
                qnaVar.c(canvas, x78Var, (int) imageReceiver10.N0, (int) imageReceiver10.O0, 1.0f, false);
            } else {
                rnaVar.h(on2.p(-1, (int) (pc8Var.f.getAlpha() * 82.875f)));
                ImageReceiver imageReceiver11 = pc8Var.f;
                rnaVar.setBounds((int) imageReceiver11.L0, (int) imageReceiver11.M0, (int) imageReceiver11.w(), (int) pc8Var.f.x());
                rnaVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        oc8 oc8Var;
        switch (this.a) {
            case 1:
                pc8 pc8Var = (pc8) this.f;
                float[] fArr = pc8Var.Q;
                if (pc8Var.C == null) {
                    float f2 = pc8Var.P;
                    if (f2 != 1.0f) {
                        float f3 = f2 + 0.07272727f;
                        pc8Var.P = f3;
                        if (f3 > 1.0f) {
                            pc8Var.P = 1.0f;
                        } else {
                            pc8Var.e();
                        }
                    }
                }
                float interpolation = d53.f.getInterpolation(pc8Var.P) * pc8Var.A;
                float measuredHeight = getMeasuredHeight();
                float f4 = 0.0f;
                if (interpolation == 1.0f || (oc8Var = pc8Var.F) == null) {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f = measuredHeight;
                } else {
                    oc8Var.a(fArr);
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
                pc8Var.c(canvas, 1.0f - interpolation, pc8Var.o - getLeft(), pc8Var.p - getTop(), f4, f);
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
                Paint paint = ((z78) this.f).e;
                bf0 bf0Var = this.b;
                if (!bf0Var.getImageReceiver().E() || bf0Var.getImageReceiver().i1 != 1.0f) {
                    paint.setColor(cmb.w0(null, cmb.W9, false));
                    canvas.drawRect(0.0f, 0.0f, bf0Var.getMeasuredWidth(), bf0Var.getMeasuredHeight(), paint);
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
    public x78(pc8 pc8Var, Context context) {
        super(context);
        this.f = pc8Var;
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setOutlineProvider(new xj((byte) 10));
        frameLayout.setClipToOutline(true);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        frameLayout.addView(bf0Var);
        frameLayout.setWillNotDraw(false);
        jy jyVar = new jy(context);
        this.e = jyVar;
        jyVar.setBackgroundColor(0);
        frameLayout.addView(jyVar, qoe.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        jyVar.addView(textureView, qoe.c(-1.0f, -1));
        addView(frameLayout, qoe.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
