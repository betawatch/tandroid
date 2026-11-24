// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class sj {
    public volatile Object a;
    public final Object b;
    public volatile Object c;

    public sj(vq7 vq7Var) {
        ize izeVar = new ize((byte) 18);
        pd5 pd5Var = new pd5((byte) 28);
        this.c = izeVar;
        this.b = new ArrayList();
        this.a = pd5Var;
        vq7Var.a(new zf(this));
    }

    public final boolean a() {
        try {
            Context context = (Context) this.b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            xgd.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }

    public /* synthetic */ sj(Object obj) {
        this.b = obj;
    }
}
