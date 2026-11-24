// default package

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zeb extends ViewGroup.MarginLayoutParams {
    public bfb a;
    public bfb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeb() {
        super(-2, -2);
        bfb bfbVar = bfb.e;
        this.a = bfbVar;
        this.b = bfbVar;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = bfbVar;
        this.b = bfbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zeb.class != obj.getClass()) {
            return false;
        }
        zeb zebVar = (zeb) obj;
        return this.b.equals(zebVar.b) && this.a.equals(zebVar.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
