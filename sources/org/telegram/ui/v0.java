package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class v0 extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(String str, int i10) {
        super(str, 0);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                break;
            case 1:
                sn.Ic = (int) f7;
                break;
            case 2:
                ((org.telegram.ui.Cells.u1) obj).setTimeAlpha(f7);
                break;
            case 3:
                ((qz0) obj).setCrossfadeProgress(f7);
                break;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                break;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                break;
            default:
                t31 t31Var = (t31) obj;
                if (t31Var.a != f7) {
                    t31Var.a = f7;
                    SecretMediaViewer secretMediaViewer = t31Var.r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (!t31Var.b) {
                        if (t31Var.c) {
                            t31Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
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
                        org.telegram.ui.Components.c81 c81Var = secretMediaViewer.Q;
                        if (c81Var.y != f10) {
                            c81Var.y = f10;
                            c81Var.v.invalidate();
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
                return Float.valueOf(sn.Ic);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((qz0) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((t31) obj).a);
        }
    }
}
