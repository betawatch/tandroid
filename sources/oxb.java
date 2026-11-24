// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class oxb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oxb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pxb pxbVar = (pxb) obj;
                pxbVar.k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pxbVar.n0();
                break;
            case 1:
                ((qxb) obj).setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                mzb mzbVar = (mzb) obj;
                mzbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mzbVar.m();
                break;
            case 3:
                ((m0c) obj).g(valueAnimator);
                break;
            case 4:
                o3c o3cVar = (o3c) obj;
                o3cVar.r0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3cVar.invalidate();
                break;
            case 5:
                y7c y7cVar = (y7c) obj;
                y7cVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y7cVar.invalidate();
                break;
            case 6:
                w9c w9cVar = (w9c) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9cVar.b = floatValue;
                w9cVar.setTranslationY(floatValue);
                break;
            case 7:
                vgc vgcVar = (vgc) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vgcVar.setAnimationIdicatorProgress(floatValue2);
                ugc ugcVar = vgcVar.E;
                if (ugcVar != null) {
                    ugcVar.g(floatValue2);
                    break;
                }
                break;
            case 8:
                phc phcVar = (phc) obj;
                phcVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                phcVar.invalidate();
                break;
            case 9:
                iic iicVar = (iic) obj;
                iicVar.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iicVar.x();
                break;
            case 10:
                yic yicVar = (yic) obj;
                yicVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yicVar.b.invalidate();
                break;
            case 11:
                wnc wncVar = (wnc) obj;
                wncVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wncVar.invalidate();
                break;
            case 12:
                eoc eocVar = (eoc) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eocVar.c.setRotationY(floatValue3);
                boolean z = floatValue3 > 90.0f;
                eocVar.d.setVisibility(z ? 4 : 0);
                eocVar.e.setVisibility(z ? 0 : 4);
                break;
            case 13:
                apc apcVar = (apc) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yoc yocVar = apcVar.q;
                npc npcVar = apcVar.i;
                RectF rectF = apcVar.n;
                RectF rectF2 = apcVar.o;
                if (!apcVar.v) {
                    apcVar.e();
                    float interpolation = apcVar.k.getInterpolation(Math.min(1.0f, floatValue4 * 2.0f));
                    i22 i22Var = apcVar.c;
                    if (i22Var != null) {
                        i22Var.s1(interpolation);
                    } else {
                        apcVar.b.setTranslationY(r12.getHeight() * interpolation);
                    }
                    if (apcVar.p != null && !rectF2.isEmpty()) {
                        cm1 M6 = apcVar.e.M6(apcVar.f);
                        cm1 cm1Var = apcVar.p;
                        if (M6 != cm1Var) {
                            cm1Var.J0.i(false);
                            apcVar.p = M6;
                        } else {
                            M6 = cm1Var;
                        }
                        if (M6 != null && !apcVar.s) {
                            M6.J0.i(true);
                            lmc lmcVar = apcVar.p.J0.m;
                            if (lmcVar != null && lmcVar.isAttachedToWindow()) {
                                rectF2.set(apcVar.c(lmcVar));
                                apcVar.r = floatValue4;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue4 - 0.25f) / 0.5f));
                                float B = mlb.B(max, 2.0f, 3.0f, max * max);
                                npcVar.setAlpha((1.0f - B) * apcVar.l);
                                yocVar.setAlpha(B);
                                apcVar.d();
                                float f = 1.0f - floatValue4;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - gm.L(150.0f);
                                float f2 = f * f;
                                float f3 = f * 2.0f * floatValue4;
                                float f4 = floatValue4 * floatValue4;
                                float centerX2 = (rectF2.centerX() * f4) + (centerX * f3) + (rectF.centerX() * f2);
                                float centerY = (rectF2.centerY() * f4) + (f3 * min) + (rectF.centerY() * f2);
                                apcVar.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue4) + rectF.width());
                                if (floatValue4 < 0.92f) {
                                    apcVar.j.A(centerX2, centerY);
                                }
                                apcVar.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                npcVar.setAlpha(0.0f);
                                yocVar.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            npcVar.setAlpha(0.0f);
                            yocVar.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 14:
                npc npcVar2 = (npc) obj;
                npcVar2.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                npcVar2.b();
                break;
            case 15:
                ((aqc) obj).n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                yqc yqcVar = (yqc) obj;
                yqcVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yqcVar.invalidate();
                break;
            case 17:
                brc brcVar = (brc) obj;
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                brcVar.w = f5.floatValue();
                brcVar.f.a(f5);
                View view = brcVar.a;
                view.setAlpha(1.0f - brc.c(0.05f, 0.45f, brcVar.w));
                view.setScaleX(1.0f - (brcVar.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = brcVar.b;
                editTextBoldCursor.setAlpha(brc.c(0.3f, 0.9f, brcVar.w));
                editTextBoldCursor.setTranslationX((1.0f - brcVar.w) * b10.c(80.0f, brcVar.getWidth(), 0));
                brcVar.invalidate();
                break;
            case 18:
                ((rrc) obj).y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                qrc qrcVar = (qrc) obj;
                qrcVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qrcVar.c();
                break;
            case 20:
                esc escVar = (esc) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = escVar.n;
                RectF rectF4 = escVar.o;
                if (!escVar.s) {
                    escVar.e();
                    float interpolation2 = escVar.k.getInterpolation(Math.min(1.0f, floatValue5 * 2.0f));
                    i22 i22Var2 = escVar.a;
                    if (i22Var2 != null) {
                        i22Var2.s1(interpolation2);
                    } else {
                        escVar.c.setTranslationY(r8.getHeight() * interpolation2);
                    }
                    if (escVar.p != null && !rectF4.isEmpty()) {
                        npc pendingDiamond = escVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            m0c m0cVar = escVar.p;
                            TL_wallet.walletTransaction wallettransaction = escVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = m0cVar.S;
                            if (wallettransaction2 != null && k0c.j(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(escVar.d(pendingDiamond));
                            }
                        }
                        float f6 = 1.0f - floatValue5;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - gm.L(150.0f);
                        float f7 = f6 * f6;
                        float f8 = f6 * 2.0f * floatValue5;
                        float f9 = floatValue5 * floatValue5;
                        float centerX4 = (rectF4.centerX() * f9) + (centerX3 * f8) + (rectF3.centerX() * f7);
                        float centerY2 = (rectF4.centerY() * f9) + (f8 * min2) + (rectF3.centerY() * f7);
                        escVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue5) + rectF3.width());
                        if (floatValue5 < 0.92f) {
                            escVar.j.A(centerX4, centerY2);
                        }
                        escVar.h.invalidate();
                        break;
                    }
                }
                break;
            case 21:
                puc pucVar = (puc) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pucVar.V = floatValue6;
                pucVar.W.setAlpha(floatValue6);
                pucVar.invalidate();
                break;
            default:
                wu wuVar = (wu) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wuVar.b0 = floatValue7;
                wuVar.j(floatValue7);
                wuVar.c0.setAlpha(wuVar.b0);
                wuVar.S.setTranslationX(gm.L(56.0f) * wuVar.b0);
                wuVar.P.setTranslationX(gm.L(112.0f) * wuVar.b0);
                wuVar.invalidate();
                break;
        }
    }
}
