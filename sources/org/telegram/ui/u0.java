package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u0 extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(String str, int i10) {
        super(str, 0);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                break;
            case 1:
                xn.Ec = (int) f10;
                break;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f10);
                break;
            case 3:
                ((tz0) obj).setCrossfadeProgress(f10);
                break;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                break;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                break;
            default:
                j41 j41Var = (j41) obj;
                if (j41Var.a != f10) {
                    j41Var.a = f10;
                    SecretMediaViewer secretMediaViewer = j41Var.r;
                    secretMediaViewer.P.setAlpha(f10);
                    if (!j41Var.b) {
                        if (j41Var.c) {
                            j41Var.setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
                        }
                        secretMediaViewer.O.setAlpha(f10);
                        break;
                    } else {
                        secretMediaViewer.P.setPivotX(r4.getWidth());
                        secretMediaViewer.P.setPivotY(r4.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.P.setScaleX(f12);
                        secretMediaViewer.P.setScaleY(f12);
                        org.telegram.ui.Components.k71 k71Var = secretMediaViewer.N;
                        if (k71Var.y != f11) {
                            k71Var.y = f11;
                            k71Var.v.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(xn.Ec);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((tz0) obj).P);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((j41) obj).a);
        }
    }
}
