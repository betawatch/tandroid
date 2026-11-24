// default package

import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t4a implements n4a {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t4a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // n4a
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                o4a o4aVar = new o4a();
                o4aVar.c = ((lt5) obj).create(o4aVar, o4aVar);
                return o4aVar;
            default:
                return (Iterator) obj;
        }
    }
}
