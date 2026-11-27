// default package

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
