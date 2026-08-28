package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v0 extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(String str, int i9) {
        super(str, 0);
        this.b = i9;
    }

    @Override // org.telegram.ui.Components.l6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                break;
            case 1:
                qn.Dc = (int) f10;
                break;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f10);
                break;
            case 3:
                ((iz0) obj).setCrossfadeProgress(f10);
                break;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                break;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                break;
            default:
                x31 x31Var = (x31) obj;
                if (x31Var.a != f10) {
                    x31Var.a = f10;
                    SecretMediaViewer secretMediaViewer = x31Var.r;
                    secretMediaViewer.O.setAlpha(f10);
                    if (!x31Var.b) {
                        if (x31Var.c) {
                            x31Var.setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
                        }
                        secretMediaViewer.N.setAlpha(f10);
                        break;
                    } else {
                        secretMediaViewer.O.setPivotX(r4.getWidth());
                        secretMediaViewer.O.setPivotY(r4.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.O.setScaleX(f12);
                        secretMediaViewer.O.setScaleY(f12);
                        org.telegram.ui.Components.m61 m61Var = secretMediaViewer.M;
                        if (m61Var.y != f11) {
                            m61Var.y = f11;
                            m61Var.v.invalidate();
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
                return Float.valueOf(qn.Dc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((iz0) obj).O);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((x31) obj).a);
        }
    }
}
