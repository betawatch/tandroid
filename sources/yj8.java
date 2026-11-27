// default package

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yj8 extends az5 implements sr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj8(byte b, Context context, Object obj) {
        super(0);
        this.b = b;
        this.c = context;
        this.d = obj;
    }

    @Override // sr4
    public final Object invoke() {
        byte b = this.b;
        Object obj = this.d;
        Context context = this.c;
        switch (b) {
            case 0:
                return mge.a(context, ((String) ((j26) obj).a).concat(".preferences_pb"));
            default:
                SharedPreferences sharedPreferences = context.getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
