// default package

import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class px1 extends Property {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ px1(Class cls, String str, byte b) {
        super(cls, str);
        this.a = b;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 1:
                return Float.valueOf(((wb2) obj).wd);
            case 2:
                return Float.valueOf(((kd8) obj).a);
            case 3:
                return Float.valueOf(((i49) obj).w);
            default:
                return Float.valueOf(((tqb) obj).h);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                break;
            case 1:
                ((wb2) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                break;
            case 2:
                ((kd8) obj).b(((Float) obj2).floatValue());
                break;
            case 3:
                ((i49) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            default:
                tqb tqbVar = (tqb) obj;
                tqbVar.h = ((Float) obj2).floatValue();
                tqbVar.invalidate();
                break;
        }
    }
}
