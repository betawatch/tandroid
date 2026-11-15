package w7;

import com.google.android.gms.internal.vision.e2;
import org.telegram.ui.Cells.y0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e {
    public final Object a;
    public final Object b;
    public final Object c;

    public e(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        return new IllegalArgumentException(y0.m(String.valueOf(obj), "=", String.valueOf(this.c), e2.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.b), " and ")));
    }
}
