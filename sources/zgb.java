// default package

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zgb extends ViewGroup.MarginLayoutParams {
    public bhb a;
    public bhb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgb() {
        super(-2, -2);
        bhb bhbVar = bhb.e;
        this.a = bhbVar;
        this.b = bhbVar;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = bhbVar;
        this.b = bhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zgb.class != obj.getClass()) {
            return false;
        }
        zgb zgbVar = (zgb) obj;
        return this.b.equals(zgbVar.b) && this.a.equals(zgbVar.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
