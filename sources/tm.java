// default package

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tm extends vk4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tm(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // vk4
    public final float a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) obj2).X1;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
            default:
                return ((xk4) obj2).a;
        }
    }

    @Override // vk4
    public final void b(Object obj, float f) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) obj2;
                ArrayList arrayList = animatedPhoneNumberEditText.X1;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    break;
                }
                break;
            default:
                ((xk4) obj2).a = f;
                break;
        }
    }
}
