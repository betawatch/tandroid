package ru.noties.jlatexmath;

import android.content.Context;
import android.graphics.Typeface;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public abstract class JLatexMathAndroid {
    private static final String BASE = "org/scilab/forge/jlatexmath/";
    private static Context sContext;

    private JLatexMathAndroid() {
    }

    private static Context context() {
        Context context = sContext;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Please call `#init(Context)` method to initialize jLatexMath");
    }

    public static InputStream getResourceAsStream(String str) {
        try {
            return context().getAssets().open(BASE + str);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void init(Context context) {
        sContext = context.getApplicationContext();
    }

    public static Typeface loadTypeface(String str) {
        return Typeface.createFromAsset(context().getAssets(), BASE + str);
    }
}
