package org.webrtc;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
