package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t0 extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(String str, int i10) {
        super(str, 0);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.s6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                break;
            case 1:
                co.Hc = (int) f7;
                break;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f7);
                break;
            case 3:
                ((n01) obj).setCrossfadeProgress(f7);
                break;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                break;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                break;
            default:
                e51 e51Var = (e51) obj;
                if (e51Var.a != f7) {
                    e51Var.a = f7;
                    SecretMediaViewer secretMediaViewer = e51Var.r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (!e51Var.b) {
                        if (e51Var.c) {
                            e51Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
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
                        org.telegram.ui.Components.i71 i71Var = secretMediaViewer.Q;
                        if (i71Var.y != f10) {
                            i71Var.y = f10;
                            i71Var.v.invalidate();
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
                return Float.valueOf(co.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((n01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((e51) obj).a);
        }
    }
}
