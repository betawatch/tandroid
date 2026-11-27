// default package

import android.util.Property;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
