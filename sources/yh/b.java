package yh;

import java.io.Serializable;
import org.telegram.messenger.fs;
import org.telegram.messenger.o20;
import org.telegram.ui.Components.a51;
import rh.e3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements o20, fs {
    public final /* synthetic */ e a;

    @Override // org.telegram.messenger.fs
    public void a(String str) {
        e eVar = this.a;
        eVar.getMessagesController().L0(Long.valueOf(-eVar.b));
        eVar.showDialog(new ai.a(eVar.getParentActivity(), null, eVar.b, new e3(16, eVar, str)));
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        e.Y(this.a, (a51) obj);
    }
}
