// default package

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class uib extends ViewGroup.MarginLayoutParams {
    public wib a;
    public wib b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uib() {
        super(-2, -2);
        wib wibVar = wib.e;
        this.a = wibVar;
        this.b = wibVar;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = wibVar;
        this.b = wibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uib.class != obj.getClass()) {
            return false;
        }
        uib uibVar = (uib) obj;
        return this.b.equals(uibVar.b) && this.a.equals(uibVar.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
