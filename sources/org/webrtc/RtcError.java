package org.webrtc;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class RtcError {
    private final RtcException error;

    private RtcError(RtcException rtcException) {
        this.error = rtcException;
    }

    public static RtcError error(String str) {
        return new RtcError(new RtcException(str));
    }

    public static RtcError success() {
        return new RtcError(null);
    }

    public boolean isError() {
        return this.error != null;
    }

    public boolean isSuccess() {
        return this.error == null;
    }

    public void throwError() {
        RtcException rtcException = this.error;
        if (rtcException != null) {
            throw rtcException;
        }
    }

    public RtcException error() {
        return this.error;
    }
}
