// default package

import android.util.Property;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
