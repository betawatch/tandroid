package qd;

import k7.q7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class u {
    public static final /* synthetic */ int a = 0;

    static {
        Object a2;
        Object a10;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a2 = wc.a.class.getCanonicalName();
        } catch (Throwable th2) {
            a2 = q7.a(th2);
        }
        if (sc.f.a(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            a10 = u.class.getCanonicalName();
        } catch (Throwable th3) {
            a10 = q7.a(th3);
        }
        if (sc.f.a(a10) != null) {
            a10 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
