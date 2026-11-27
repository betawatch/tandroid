// default package

import java.io.PrintStream;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class v4e {
    public static final m6f a;

    static {
        m6f p4eVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            p4eVar = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new l5e() : new p4e((byte) 0) : new p4e((byte) 1);
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = p4e.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + jn7.Q1);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            p4eVar = new p4e((byte) 0);
        }
        a = p4eVar;
    }
}
