// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class os3 extends vk4 {
    public final /* synthetic */ byte a;

    @Override // vk4
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

    @Override // vk4
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 0:
                ((View) obj).setAlpha(f);
                break;
            case 1:
                ((View) obj).setTranslationX(f);
                break;
            case 2:
                ((View) obj).setTranslationY(f);
                break;
            case 3:
                ((View) obj).setScaleX(f);
                break;
            case 4:
                ((View) obj).setScaleY(f);
                break;
            case 5:
                ((View) obj).setRotation(f);
                break;
            case 6:
                ((View) obj).setRotationX(f);
                break;
            default:
                ((View) obj).setRotationY(f);
                break;
        }
    }
}
