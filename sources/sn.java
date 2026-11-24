// default package

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sn extends vk4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sn(Object obj, byte b) {
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
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) obj2).W1;
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
                ArrayList arrayList = animatedPhoneNumberEditText.W1;
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
