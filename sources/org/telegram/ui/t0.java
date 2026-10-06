package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class t0 extends org.telegram.ui.Components.r6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(String str, int i10) {
        super(str, 0);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.r6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                break;
            case 1:
                yn.Bc = (int) f7;
                break;
            case 2:
                ((org.telegram.ui.Cells.u1) obj).setTimeAlpha(f7);
                break;
            case 3:
                ((f01) obj).setCrossfadeProgress(f7);
                break;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                break;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                break;
            default:
                w41 w41Var = (w41) obj;
                if (w41Var.a != f7) {
                    w41Var.a = f7;
                    SecretMediaViewer secretMediaViewer = w41Var.r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (!w41Var.b) {
                        if (w41Var.c) {
                            w41Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                        }
                        secretMediaViewer.R.setAlpha(f7);
                        break;
                    } else {
                        secretMediaViewer.S.setPivotX(r4.getWidth());
                        secretMediaViewer.S.setPivotY(r4.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.g81 g81Var = secretMediaViewer.Q;
                        if (g81Var.y != f10) {
                            g81Var.y = f10;
                            g81Var.v.invalidate();
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
                return Float.valueOf(yn.Bc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((f01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((w41) obj).a);
        }
    }
}
