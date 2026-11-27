// default package

import android.content.Context;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zif {
    public static WeakReference b;
    public final qa4 a;

    public zif(Context context) {
        this.a = new qa4(context, txd.a, wn.g, new uif((byte) 19));
    }

    public static synchronized zif a(LaunchActivity launchActivity) {
        zif zifVar;
        synchronized (zif.class) {
            WeakReference weakReference = b;
            zifVar = weakReference == null ? null : (zif) weakReference.get();
            if (zifVar == null) {
                zifVar = new zif(launchActivity.getApplicationContext());
                b = new WeakReference(zifVar);
            }
        }
        return zifVar;
    }
}
