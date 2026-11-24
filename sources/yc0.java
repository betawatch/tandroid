// default package

import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
