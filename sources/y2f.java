// default package

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class y2f {
    public static void a(Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            mka.t(window);
        } else if (i >= 30) {
            mka.s(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }
}
