// default package

import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yc0 extends gw2 {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return xmd.b(null, this);
    }
}
