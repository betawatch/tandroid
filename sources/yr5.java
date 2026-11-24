// default package

import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class yr5 extends IOException {
    public boolean a;

    public static yr5 a() {
        return new yr5("Protocol message had invalid UTF-8.");
    }

    public static xr5 b() {
        return new xr5("Protocol message tag had invalid wire type.");
    }

    public static yr5 c() {
        return new yr5("CodedInputStream encountered a malformed varint.");
    }

    public static yr5 d() {
        return new yr5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static yr5 e() {
        return new yr5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
