package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r0 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(String str, int i3) {
        super(str, 0);
        this.b = i3;
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                break;
            case 1:
                wm.jd = (int) f10;
                break;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                break;
            case 3:
                ((org.telegram.messenger.vi) obj).d = f10;
                break;
            case 4:
                ((nv0) obj).setCrossfadeProgress(f10);
                break;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                break;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                break;
            default:
                cz0 cz0Var = (cz0) obj;
                if (cz0Var.a != f10) {
                    cz0Var.a = f10;
                    SecretMediaViewer secretMediaViewer = cz0Var.r;
                    secretMediaViewer.R.setAlpha(f10);
                    if (!cz0Var.b) {
                        if (cz0Var.c) {
                            cz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                        }
                        secretMediaViewer.Q.setAlpha(f10);
                        break;
                    } else {
                        secretMediaViewer.R.setPivotX(r4.getWidth());
                        secretMediaViewer.R.setPivotY(r4.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.R.setScaleX(f12);
                        secretMediaViewer.R.setScaleY(f12);
                        org.telegram.ui.Components.o51 o51Var = secretMediaViewer.P;
                        if (o51Var.y != f11) {
                            o51Var.y = f11;
                            o51Var.v.invalidate();
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
                return Float.valueOf(wm.jd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.vi) obj).d);
            case 4:
                return Float.valueOf(((nv0) obj).T);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((cz0) obj).a);
        }
    }
}
