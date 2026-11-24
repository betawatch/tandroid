// default package

import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tc8 {
    public LogSessionId a;

    public tc8() {
        LogSessionId logSessionId;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        this.a = logSessionId;
    }

    public final void a(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        LogSessionId logSessionId3 = this.a;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        gre.p(logSessionId3.equals(logSessionId2));
        this.a = logSessionId;
    }
}
