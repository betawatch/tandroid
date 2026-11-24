// default package

import android.util.Property;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ro extends Property {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(String str, byte b) {
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
