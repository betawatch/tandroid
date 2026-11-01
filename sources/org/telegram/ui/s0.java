package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s0 extends org.telegram.ui.Components.h6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(String str, int i10) {
        super(str, 0);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.h6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                break;
            case 1:
                un.bd = (int) f7;
                break;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f7);
                break;
            case 3:
                ((org.telegram.messenger.gj) obj).d = f7;
                break;
            case 4:
                ((ix0) obj).setCrossfadeProgress(f7);
                break;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                break;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                break;
            default:
                b11 b11Var = (b11) obj;
                if (b11Var.a != f7) {
                    b11Var.a = f7;
                    SecretMediaViewer secretMediaViewer = b11Var.r;
                    secretMediaViewer.Q.setAlpha(f7);
                    if (!b11Var.b) {
                        if (b11Var.c) {
                            b11Var.setTranslationY((1.0f - f7) * org.telegram.messenger.i0.N(24.0f));
                        }
                        secretMediaViewer.P.setAlpha(f7);
                        break;
                    } else {
                        secretMediaViewer.Q.setPivotX(r4.getWidth());
                        secretMediaViewer.Q.setPivotY(r4.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.Q.setScaleX(f11);
                        secretMediaViewer.Q.setScaleY(f11);
                        org.telegram.ui.Components.x61 x61Var = secretMediaViewer.O;
                        if (x61Var.y != f10) {
                            x61Var.y = f10;
                            x61Var.v.invalidate();
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
                return Float.valueOf(un.bd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.gj) obj).d);
            case 4:
                return Float.valueOf(((ix0) obj).S);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((b11) obj).a);
        }
    }
}
