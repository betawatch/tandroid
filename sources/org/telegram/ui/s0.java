package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s0 extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(String str, int i10) {
        super(str, 0);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                break;
            case 1:
                wn.fd = (int) f7;
                break;
            case 2:
                ((org.telegram.ui.Cells.s1) obj).setTimeAlpha(f7);
                break;
            case 3:
                ((yz0) obj).setCrossfadeProgress(f7);
                break;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                break;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                break;
            default:
                z31 z31Var = (z31) obj;
                if (z31Var.a != f7) {
                    z31Var.a = f7;
                    SecretMediaViewer secretMediaViewer = z31Var.r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (!z31Var.b) {
                        if (z31Var.c) {
                            z31Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
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
                        org.telegram.ui.Components.v81 v81Var = secretMediaViewer.Q;
                        if (v81Var.y != f10) {
                            v81Var.y = f10;
                            v81Var.v.invalidate();
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
                return Float.valueOf(wn.fd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.s1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((yz0) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((z31) obj).a);
        }
    }
}
