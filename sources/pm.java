// default package

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pm extends qn {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pm(String str, byte b) {
        super(str, (byte) 0);
        this.b = b;
    }

    @Override // qn
    public final void c(Object obj, float f) {
        vx8 vx8Var;
        switch (this.b) {
            case 0:
                qm qmVar = (qm) obj;
                if (qmVar.e != f) {
                    qmVar.e = f;
                    qmVar.g.invalidate();
                    break;
                }
                break;
            case 1:
                ((ImageReceiver) obj).i1 = f;
                break;
            case 2:
                ((ClippingImageView) obj).setAnimationProgress(f);
                break;
            case 3:
                ((PhotoViewer) obj).setAnimationValue(f);
                break;
            case 4:
                ((ue3) obj).setClipProgress(f);
                break;
            case 5:
                ((q11) obj).setInOutOffset(f);
                break;
            case 6:
                mu1.nd = (int) f;
                break;
            case 7:
                ((gb2) obj).setTimeAlpha(f);
                break;
            case 8:
                ((g27) obj).d = f;
                break;
            case 9:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f);
                break;
            case 10:
                ((wn8) obj).setCrossfadeProgress(f);
                break;
            case 11:
                vx8 vx8Var2 = (vx8) obj;
                vx8Var2.H = f;
                RectF rectF = vx8Var2.w;
                RectF rectF2 = vx8Var2.s;
                float interpolation = 1.0f - ux8.p.getInterpolation(f);
                float interpolation2 = (ux8.h.getInterpolation(vx8Var2.H) - ux8.i.getInterpolation(vx8Var2.H)) * gl.L(13.0f);
                RectF rectF3 = vx8Var2.n;
                RectF rectF4 = vx8Var2.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g = vx8.g(rectF3.height(), (gl.L(2.0f) * interpolation) + gl.L(56), ux8.l.getInterpolation(vx8Var2.H)) / 2.0f;
                tx8 tx8Var = ux8.m;
                float g2 = vx8.g(rectF3.width(), (gl.L(10.0f) * interpolation) + vx8Var2.h(), tx8Var.getInterpolation(vx8Var2.H));
                float f2 = g * 2.0f;
                float max = Math.max(g2, f2);
                float interpolation3 = (tx8Var.getInterpolation(vx8Var2.H) * Math.min(gl.L(-12.0f) + vx8Var2.G, (max - Math.max(rectF3.width(), f2)) / 2.0f)) + rectF4.centerX() + g;
                float interpolation4 = ((rectF4.bottom - g) - 1.0f) - (ux8.n.getInterpolation(vx8Var2.H) * ((gl.L(6.0f) * interpolation) + gl.L(38.0f)));
                RectF rectF5 = vx8Var2.r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g;
                if (vx8Var2.R && !vx8Var2.N) {
                    float g3 = vx8.g(gl.L(5.0f), gl.L(3.0f), ux8.o.getInterpolation(vx8Var2.H));
                    float f3 = rectF5.bottom + g3;
                    double width = (rectF3.width() / 2.0f) + g3;
                    double abs = Math.abs(f3 - rectF3.centerY());
                    float sqrt = (float) (width <= abs ? 0.0d : Math.sqrt((width * width) - (abs * abs)));
                    float centerX = rectF3.centerX() - sqrt;
                    boolean z = centerX < (rectF5.height() / 2.0f) + rectF5.left;
                    if (z) {
                        PointF f4 = vx8.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g3, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g3, true);
                        if (f4 != null) {
                            centerX = f4.x;
                            f3 = f4.y;
                        } else {
                            vx8Var2.R = false;
                        }
                    }
                    rectF2.set(centerX - g3, f3 - g3, centerX + g3, f3 + g3);
                    float f5 = rectF5.bottom + g3;
                    float centerX2 = rectF3.centerX() + sqrt;
                    boolean z2 = centerX2 > rectF5.right - (rectF5.height() / 2.0f);
                    if (z2) {
                        PointF f6 = vx8.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g3, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g3, false);
                        if (f6 != null) {
                            centerX2 = f6.x;
                            f5 = f6.y;
                        } else {
                            vx8Var2.R = false;
                        }
                    }
                    rectF.set(centerX2 - g3, f5 - g3, centerX2 + g3, f5 + g3);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && vx8Var2.R) {
                        vx8Var2.R = false;
                    }
                    if (vx8Var2.R) {
                        Path path = vx8Var2.e;
                        path.reset();
                        float b = vx8.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b2 = vx8.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        vx8Var = vx8Var2;
                        vx8Var.a(path, rectF3, b, b2, false, false);
                        float b3 = z ? vx8.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY()) : -90.0f;
                        float j = vx8.j(b2);
                        float f7 = b3;
                        vx8Var.a(path, rectF2, j, f7, true, true);
                        if (!z) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = vx8.c0;
                        float f8 = rectF5.left;
                        rectF6.set(f8, rectF5.top, rectF5.height() + f8, rectF5.bottom);
                        vx8Var.a(path, rectF6, vx8.j(f7), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        float b4 = z2 ? vx8.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY()) : -90.0f;
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        vx8Var.a(path, rectF6, -90.0f, vx8.j(b4), false, false);
                        if (!z2) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        vx8Var.a(path, rectF, b4, vx8.j(b), true, true);
                        path.close();
                        vx8Var.invalidateSelf();
                        break;
                    }
                }
                vx8Var = vx8Var2;
                vx8Var.invalidateSelf();
                break;
            case 12:
                vx8 vx8Var3 = (vx8) obj;
                vx8Var3.I = f;
                vx8Var3.invalidateSelf();
                break;
            case 13:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f);
                break;
            case 14:
                ((SecretMediaViewer) obj).setAnimationValue(f);
                break;
            case 15:
                ju9 ju9Var = (ju9) obj;
                if (ju9Var.a != f) {
                    ju9Var.a = f;
                    SecretMediaViewer secretMediaViewer = ju9Var.r;
                    secretMediaViewer.R.setAlpha(f);
                    if (!ju9Var.b) {
                        if (ju9Var.c) {
                            ju9Var.setTranslationY((1.0f - f) * gl.N(24.0f));
                        }
                        secretMediaViewer.Q.setAlpha(f);
                        break;
                    } else {
                        secretMediaViewer.R.setPivotX(r0.getWidth());
                        secretMediaViewer.R.setPivotY(r0.getHeight());
                        float f9 = 1.0f - f;
                        float f10 = 1.0f - (0.1f * f9);
                        secretMediaViewer.R.setScaleX(f10);
                        secretMediaViewer.R.setScaleY(f10);
                        tbc tbcVar = secretMediaViewer.P;
                        if (tbcVar.y != f9) {
                            tbcVar.y = f9;
                            tbcVar.v.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 16:
                ahb ahbVar = (ahb) obj;
                ahbVar.setAnimationProgress(f);
                ahbVar.invalidate();
                break;
            case 17:
                bhb bhbVar = (bhb) obj;
                bhbVar.setAnimationProgress(f);
                bhbVar.invalidate();
                break;
            case 18:
                yhb yhbVar = (yhb) obj;
                yhbVar.setAnimationProgress(f);
                yhbVar.invalidate();
                break;
            default:
                ((x7c) obj).H0(f);
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((qm) obj).e);
            case 1:
                return Float.valueOf(((ImageReceiver) obj).i1);
            case 2:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 3:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 4:
                return Float.valueOf(((ue3) obj).getClipProgress());
            case 5:
                return Float.valueOf(((q11) obj).inOutOffset);
            case 6:
                return Float.valueOf(mu1.nd);
            case 7:
                return Float.valueOf(((gb2) obj).getTimeAlpha());
            case 8:
                return Float.valueOf(((g27) obj).d);
            case 9:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            case 10:
                return Float.valueOf(((wn8) obj).T);
            case 11:
                return Float.valueOf(((vx8) obj).H);
            case 12:
                return Float.valueOf(((vx8) obj).I);
            case 13:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 14:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            case 15:
                return Float.valueOf(((ju9) obj).a);
            case 16:
                return Float.valueOf(((ahb) obj).s);
            case 17:
                return Float.valueOf(((bhb) obj).h);
            case 18:
                return Float.valueOf(((yhb) obj).f);
            default:
                return Float.valueOf(((x7c) obj).y1);
        }
    }
}
