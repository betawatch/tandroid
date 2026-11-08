package r1;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b extends e {
    public final /* synthetic */ int a;

    @Override // r1.e
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getTranslationX();
            case 2:
                return ((View) obj).getTranslationY();
            case 3:
                return ((View) obj).getScaleX();
            case 4:
                return ((View) obj).getScaleY();
            case 5:
                return ((View) obj).getRotation();
            case 6:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((View) obj).setAlpha(f10);
                break;
            case 1:
                ((View) obj).setTranslationX(f10);
                break;
            case 2:
                ((View) obj).setTranslationY(f10);
                break;
            case 3:
                ((View) obj).setScaleX(f10);
                break;
            case 4:
                ((View) obj).setScaleY(f10);
                break;
            case 5:
                ((View) obj).setRotation(f10);
                break;
            case 6:
                ((View) obj).setRotationX(f10);
                break;
            default:
                ((View) obj).setRotationY(f10);
                break;
        }
    }
}
