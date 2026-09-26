package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class t0 extends org.telegram.ui.Components.r6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(String str, int i10) {
        super(str, 0);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                break;
            case 1:
                wn.Gc = (int) f7;
                break;
            case 2:
                ((org.telegram.ui.Cells.u1) obj).setTimeAlpha(f7);
                break;
            case 3:
                ((d01) obj).setCrossfadeProgress(f7);
                break;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                break;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                break;
            default:
                v41 v41Var = (v41) obj;
                if (v41Var.a != f7) {
                    v41Var.a = f7;
                    SecretMediaViewer secretMediaViewer = v41Var.r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (!v41Var.b) {
                        if (v41Var.c) {
                            v41Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
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
                        org.telegram.ui.Components.u71 u71Var = secretMediaViewer.Q;
                        if (u71Var.y != f10) {
                            u71Var.y = f10;
                            u71Var.v.invalidate();
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
                return Float.valueOf(wn.Gc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((d01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((v41) obj).a);
        }
    }
}
