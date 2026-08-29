package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w0 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(String str, int i10) {
        super(str, 0);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f9) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f9);
                break;
            case 1:
                tn.Dc = (int) f9;
                break;
            case 2:
                ((org.telegram.ui.Cells.s1) obj).setTimeAlpha(f9);
                break;
            case 3:
                ((iz0) obj).setCrossfadeProgress(f9);
                break;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f9);
                break;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f9);
                break;
            default:
                z31 z31Var = (z31) obj;
                if (z31Var.a != f9) {
                    z31Var.a = f9;
                    SecretMediaViewer secretMediaViewer = z31Var.r;
                    secretMediaViewer.O.setAlpha(f9);
                    if (!z31Var.b) {
                        if (z31Var.c) {
                            z31Var.setTranslationY((1.0f - f9) * AndroidUtilities.dpf2(24.0f));
                        }
                        secretMediaViewer.N.setAlpha(f9);
                        break;
                    } else {
                        secretMediaViewer.O.setPivotX(r4.getWidth());
                        secretMediaViewer.O.setPivotY(r4.getHeight());
                        float f10 = 1.0f - f9;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.O.setScaleX(f11);
                        secretMediaViewer.O.setScaleY(f11);
                        org.telegram.ui.Components.z61 z61Var = secretMediaViewer.M;
                        if (z61Var.y != f10) {
                            z61Var.y = f10;
                            z61Var.v.invalidate();
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
                return Float.valueOf(tn.Dc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.s1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((iz0) obj).O);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((z31) obj).a);
        }
    }
}
