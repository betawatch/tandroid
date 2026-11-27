// default package

import android.content.Context;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
