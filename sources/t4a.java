// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
