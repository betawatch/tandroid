// default package

import android.util.Property;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class rn extends Property {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(String str, byte b) {
        super(Float.class, str);
        this.a = b;
        switch (b) {
            case 1:
                super(Integer.class, str);
                break;
            default:
                break;
        }
    }

    public final void a(Object obj, Float f) {
        c(obj, f.floatValue());
    }

    public abstract void b(int i, Object obj);

    public abstract void c(Object obj, float f);

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c(obj, ((Float) obj2).floatValue());
                break;
            default:
                b(((Integer) obj2).intValue(), obj);
                break;
        }
    }
}
