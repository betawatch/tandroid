// default package

import android.text.Layout;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vk9 implements ti7 {
    public final sib a;

    public vk9(sib sibVar) {
        this.a = sibVar;
    }

    @Override // ti7
    public final Layout a() {
        rib ribVar = this.a.b;
        if (ribVar == null) {
            return null;
        }
        return ribVar.a();
    }

    @Override // ti7
    public final View e() {
        return null;
    }
}
